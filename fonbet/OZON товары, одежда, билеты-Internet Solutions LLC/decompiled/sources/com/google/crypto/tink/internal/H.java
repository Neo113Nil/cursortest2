package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<SecureRandom> f59236a = new a();

    final class a extends ThreadLocal<SecureRandom> {
        /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(4:18|19|9|10)|3|4|5|6|(4:12|13|9|10)|8|9|10) */
        @Override // java.lang.ThreadLocal
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected final SecureRandom initialValue() {
            SecureRandom secureRandom;
            Provider a11 = C5882a.a();
            if (a11 != null) {
                try {
                    secureRandom = SecureRandom.getInstance("SHA1PRNG", a11);
                } catch (GeneralSecurityException unused) {
                }
                secureRandom.nextLong();
                return secureRandom;
            }
            Provider provider = null;
            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", new Class[0]).invoke(null, new Object[0]);
            if (provider != null) {
                try {
                    secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                } catch (GeneralSecurityException unused2) {
                }
                secureRandom.nextLong();
                return secureRandom;
            }
            secureRandom = new SecureRandom();
            secureRandom.nextLong();
            return secureRandom;
        }
    }

    public static byte[] a(int i11) {
        byte[] bArr = new byte[i11];
        f59236a.get().nextBytes(bArr);
        return bArr;
    }
}
