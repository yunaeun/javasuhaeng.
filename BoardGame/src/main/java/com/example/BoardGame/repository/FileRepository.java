package com.example.BoardGame.repository;

import org.apache.tomcat.jni.FileInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface FileRepository extends JpaRepository<FileInfo,Long> {//<Entitiy, id유형>
}