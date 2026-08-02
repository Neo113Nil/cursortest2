package com.zendesk.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import kotlin.UByte;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes4.dex */
public abstract class b {
    public static byte[] a(String str, String str2) {
        if (!d.a(str) || !d.a(str2)) {
            return new byte[0];
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(str2.getBytes());
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException unused) {
            return new byte[0];
        }
    }

    public static String b(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb2.append(String.format(Locale.US, "%02x", Integer.valueOf(b10 & UByte.MAX_VALUE)));
        }
        return sb2.toString();
    }

    public static String c(String str) {
        return d.a(str) ? b(a(McElieceCCA2KeyGenParameterSpec.SHA1, str)) : "";
    }
}
