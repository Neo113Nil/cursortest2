package com.google.android.gms.internal.ads;

import android.os.Build;
import defpackage.too;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzibz implements zzhfo {
    public static final byte[] a = new byte[0];
    public static final byte[] b = {0};
    public static final zzhmo c;

    static {
        zzhmn a2 = zzhmo.a();
        a2.a(zzibq.a, zzhxo.b);
        a2.a(zzibq.b, zzhxo.c);
        a2.a(zzibq.c, zzhxo.d);
        c = a2.b();
    }

    public static zzhfo a(zzhxu zzhxuVar) {
        try {
            int i = zzhpd.a;
            if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
            }
            Provider a2 = zzhmb.a();
            if (a2 != null) {
                return zzhzv.b(zzhxuVar, a2);
            }
            throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
        } catch (NoSuchProviderException unused) {
            KeyFactory keyFactory = (KeyFactory) zzibh.g.a.zza("RSA");
            BigInteger bigInteger = zzhxuVar.b;
            zzhxq zzhxqVar = zzhxuVar.a;
            return new too((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, zzhxqVar.b)), (zzibq) c.b(zzhxqVar.d), zzhxuVar.c.b(), zzhxqVar.c.equals(zzhxp.d) ? b : a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfo
    public final void c(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
