package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhzu implements zzhfn {
    public static final byte[] g = new byte[0];
    public static final byte[] h = {0};
    public static final byte[] i = {1, 2, 3};
    public final RSAPrivateCrtKey a;
    public final String b;
    public final byte[] c;
    public final byte[] d;
    public final zzhfo e;
    public final Provider f;

    public zzhzu(RSAPrivateCrtKey rSAPrivateCrtKey, zzhxo zzhxoVar, byte[] bArr, byte[] bArr2, zzhfo zzhfoVar, Provider provider) {
        if (!zzhlx.a(2)) {
            defpackage.zzl.x("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        if (zzhxoVar != zzhxo.b && zzhxoVar != zzhxo.c && zzhxoVar != zzhxo.d) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(zzhxoVar)));
        }
        zzicf.c(rSAPrivateCrtKey.getModulus().bitLength());
        zzicf.d(rSAPrivateCrtKey.getPublicExponent());
        this.a = rSAPrivateCrtKey;
        this.b = zzhzv.a(zzhxoVar);
        this.c = bArr;
        this.d = bArr2;
        this.e = zzhfoVar;
        this.f = provider;
    }
}
