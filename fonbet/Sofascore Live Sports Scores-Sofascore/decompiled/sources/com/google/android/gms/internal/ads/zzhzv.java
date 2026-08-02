package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhzv implements zzhfo {
    public static final byte[] f = new byte[0];
    public static final byte[] g = {0};
    public final RSAPublicKey a;
    public final String b;
    public final byte[] c;
    public final byte[] d;
    public final Provider e;

    public zzhzv(RSAPublicKey rSAPublicKey, zzhxo zzhxoVar, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!zzhlx.a(2)) {
            defpackage.zzl.x("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        zzicf.c(rSAPublicKey.getModulus().bitLength());
        zzicf.d(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.b = a(zzhxoVar);
        this.c = bArr;
        this.d = bArr2;
        this.e = provider;
    }

    public static String a(zzhxo zzhxoVar) {
        if (zzhxoVar == zzhxo.b) {
            return "SHA256withRSA";
        }
        if (zzhxoVar == zzhxo.c) {
            return "SHA384withRSA";
        }
        if (zzhxoVar == zzhxo.d) {
            return "SHA512withRSA";
        }
        defpackage.zzl.x("unknown hash type");
        return null;
    }

    public static zzhzv b(zzhxu zzhxuVar, Provider provider) {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = zzhxuVar.b;
        zzhxq zzhxqVar = zzhxuVar.a;
        return new zzhzv((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, zzhxqVar.b)), zzhxqVar.d, zzhxuVar.c.b(), zzhxqVar.c.equals(zzhxp.d) ? g : f, provider);
    }

    @Override // com.google.android.gms.internal.ads.zzhfo
    public final void c(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.c;
        if (!zzhpd.c(bArr3, bArr)) {
            defpackage.zzl.x("Invalid signature (output prefix mismatch)");
            return;
        }
        Signature signature = Signature.getInstance(this.b, this.e);
        signature.initVerify(this.a);
        signature.update(bArr2);
        byte[] bArr4 = this.d;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            if (signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length))) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        defpackage.zzl.x("Invalid signature");
    }
}
