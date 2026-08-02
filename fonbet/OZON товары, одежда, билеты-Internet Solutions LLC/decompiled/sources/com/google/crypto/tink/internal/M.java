package com.google.crypto.tink.internal;

import j8.C7306a;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f59252a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static final C7306a a(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt < '!' || charAt > '~') {
                throw new GeneralSecurityException(Pk0.i.a("Not a printable ASCII character: ", charAt));
            }
            bArr[i11] = (byte) charAt;
        }
        return C7306a.b(bArr);
    }

    public static boolean b(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (bArr2[i11] != bArr[i11]) {
                return false;
            }
        }
        return true;
    }

    public static final C7306a c(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt < '!' || charAt > '~') {
                throw new L(Pk0.i.a("Not a printable ASCII character: ", charAt));
            }
            bArr[i11] = (byte) charAt;
        }
        return C7306a.b(bArr);
    }
}
