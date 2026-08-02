package com.google.android.gms.internal.ads;

import defpackage.a70;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zziae implements zzhfo {
    public static final byte[] g = new byte[0];
    public static final byte[] h = {0};
    public final RSAPublicKey a;
    public final String b;
    public final PSSParameterSpec c;
    public final byte[] d;
    public final byte[] e;
    public final Provider f;

    public zziae(RSAPublicKey rSAPublicKey, zzhya zzhyaVar, zzhya zzhyaVar2, int i, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!zzhlx.a(2)) {
            defpackage.zzl.x("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        if (!zzhyaVar.equals(zzhyaVar2)) {
            defpackage.zzl.x("sigHash and mgf1Hash must be the same");
            throw null;
        }
        zzicf.c(rSAPublicKey.getModulus().bitLength());
        zzicf.d(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.b = a(zzhyaVar);
        this.c = b(zzhyaVar, zzhyaVar2, i);
        this.d = bArr;
        this.e = bArr2;
        this.f = provider;
    }

    public static String a(zzhya zzhyaVar) {
        if (zzhyaVar == zzhya.b) {
            return "SHA256withRSA/PSS";
        }
        if (zzhyaVar == zzhya.c) {
            return "SHA384withRSA/PSS";
        }
        if (zzhyaVar == zzhya.d) {
            return "SHA512withRSA/PSS";
        }
        a70.p("Unsupported hash: ".concat(String.valueOf(zzhyaVar)));
        return null;
    }

    public static PSSParameterSpec b(zzhya zzhyaVar, zzhya zzhyaVar2, int i) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        zzhya zzhyaVar3 = zzhya.d;
        zzhya zzhyaVar4 = zzhya.c;
        zzhya zzhyaVar5 = zzhya.b;
        if (zzhyaVar == zzhyaVar5) {
            str = "SHA-256";
        } else if (zzhyaVar == zzhyaVar4) {
            str = "SHA-384";
        } else {
            if (zzhyaVar != zzhyaVar3) {
                a70.p("Unsupported MD hash: ".concat(String.valueOf(zzhyaVar)));
                return null;
            }
            str = "SHA-512";
        }
        if (zzhyaVar2 == zzhyaVar5) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (zzhyaVar2 == zzhyaVar4) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (zzhyaVar2 != zzhyaVar3) {
                a70.p("Unsupported MGF1 hash: ".concat(String.valueOf(zzhyaVar2)));
                return null;
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if ((!java.util.Objects.equals(java.lang.System.getProperty("java.vendor"), "The Android Project") ? null : java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT)).intValue() <= 23) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zziae d(zzhyg zzhygVar) {
        Provider a;
        int i = zzhpd.a;
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            a = null;
        }
        a = zzhmb.a();
        Provider provider = a;
        if (provider == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = zzhygVar.b;
        zzhyc zzhycVar = zzhygVar.a;
        return new zziae((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, zzhycVar.b)), zzhycVar.d, zzhycVar.e, zzhycVar.f, zzhygVar.c.b(), zzhycVar.c.equals(zzhyb.d) ? h : g, provider);
    }

    @Override // com.google.android.gms.internal.ads.zzhfo
    public final void c(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.d;
        if (!zzhpd.c(bArr3, bArr)) {
            defpackage.zzl.x("Invalid signature (output prefix mismatch)");
            return;
        }
        Signature signature = Signature.getInstance(this.b, this.f);
        signature.initVerify(this.a);
        signature.setParameter(this.c);
        signature.update(bArr2);
        byte[] bArr4 = this.e;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        int length = bArr.length;
        int length2 = bArr3.length;
        if (signature.verify(bArr, length2, length - length2)) {
            return;
        }
        defpackage.zzl.x("signature verification failed");
    }
}
