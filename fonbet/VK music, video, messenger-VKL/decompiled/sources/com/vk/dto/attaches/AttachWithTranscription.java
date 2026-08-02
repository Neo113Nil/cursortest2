package com.vk.dto.attaches;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import xsna.a0a;
import xsna.emb;
import xsna.s3q0;

/* compiled from: AttachWithTranscription.kt */
/* loaded from: classes18.dex */
public interface AttachWithTranscription extends Attach, AttachWithId {
    default String F6() {
        if (I5() && m4()) {
            return Y4();
        }
        return null;
    }

    default boolean I5() {
        return Ka() == 2;
    }

    default boolean J3() {
        return Ka() == 1;
    }

    int Ka();

    Reaction L6();

    default String W4(byte[] bArr) {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, emb.b), 8192);
            try {
                String b = a0a.b(bufferedReader);
                bufferedReader.close();
                gZIPInputStream.close();
                return b;
            } finally {
            }
        } finally {
        }
    }

    String Y4();

    default boolean b3() {
        return L6() != null;
    }

    boolean gb();

    default boolean j3() {
        return F6() != null;
    }

    void k9(boolean z);

    default boolean l3() {
        return Ka() == 0;
    }

    boolean m4();

    void na(int i);

    default byte[] r7(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new GZIPOutputStream(byteArrayOutputStream), emb.b), 8192);
            try {
                bufferedWriter.write(str);
                bufferedWriter.flush();
                s3q0 s3q0Var = s3q0.a;
                bufferedWriter.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    boolean u1();

    default boolean v7() {
        return !u1();
    }

    void ya(String str);
}
