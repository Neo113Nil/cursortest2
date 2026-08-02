package com.huawei.hms.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes13.dex */
public abstract class SHA256 {
    public static byte[] digest(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            e.getMessage();
            return new byte[0];
        }
    }

    public static byte[] digest(File file) {
        MessageDigest messageDigest;
        BufferedInputStream bufferedInputStream;
        int i;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                byte[] bArr = new byte[4096];
                i = 0;
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    i += read;
                    messageDigest.update(bArr, 0, read);
                }
            } catch (IOException | NoSuchAlgorithmException unused) {
                bufferedInputStream2 = bufferedInputStream;
                IOUtils.closeQuietly((InputStream) bufferedInputStream2);
                return new byte[0];
            } catch (Throwable th) {
                th = th;
                bufferedInputStream2 = bufferedInputStream;
                IOUtils.closeQuietly((InputStream) bufferedInputStream2);
                throw th;
            }
        } catch (IOException | NoSuchAlgorithmException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        if (i > 0) {
            byte[] digest = messageDigest.digest();
            IOUtils.closeQuietly((InputStream) bufferedInputStream);
            return digest;
        }
        IOUtils.closeQuietly((InputStream) bufferedInputStream);
        return new byte[0];
    }
}
