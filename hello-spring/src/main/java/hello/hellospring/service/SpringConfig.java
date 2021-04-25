package hello.hellospring.service;

import hello.hellospring.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import javax.swing.text.html.parser.Entity;

@Configuration
public class SpringConfig {

//Spring Data Jpa
    private final MemberRepository memberRepository;
    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

//Jpa
//    private final DataSource dataSource;
//    private final EntityManager em;
//    public SpringConfig(DataSource dataSource, EntityManager em) {
//        this.dataSource = dataSource;
//        this.em = em;
//    }

//Memory, Jdbc, JdbcTemplate
//    private final DataSource dataSource;
//    public SpringConfig(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }


    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }
//Except Spring Data Jpa
//    public MemberService memberService() {
//        return new MemberService(memberRepository());
//    }

//Except Spring Data Jpa
//    @Bean
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository(dataSource);
//        return new JdbcMemberRepository(dataSource);
//        return new JdbcTemplateMemberRepository(dataSource);
//        return new JpaMemberRepository(em);
//    }
}
