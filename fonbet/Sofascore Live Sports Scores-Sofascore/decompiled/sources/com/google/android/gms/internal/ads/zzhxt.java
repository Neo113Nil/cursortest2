package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.x5n;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhxt {
    public zzhxq a = null;
    public BigInteger b = null;
    public Integer c = null;

    private zzhxt() {
    }

    public final zzhxu a() {
        zzich a;
        if (this.a == null) {
            defpackage.zzl.x("Cannot build without parameters");
            return null;
        }
        BigInteger bigInteger = this.b;
        if (bigInteger == null) {
            defpackage.zzl.x("Cannot build without modulus");
            return null;
        }
        int bitLength = bigInteger.bitLength();
        zzhxq zzhxqVar = this.a;
        int i = zzhxqVar.a;
        if (bitLength != i) {
            throw new GeneralSecurityException(x5n.n(new StringBuilder(String.valueOf(bitLength).length() + 56 + String.valueOf(i).length()), bitLength, "Got modulus size ", i, ", but parameters requires modulus size "));
        }
        if (zzhxqVar.a() && this.c == null) {
            defpackage.zzl.x("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.a.a() && this.c != null) {
            defpackage.zzl.x("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        zzhxp zzhxpVar = this.a.c;
        if (zzhxpVar == zzhxp.e) {
            a = zzhnx.a;
        } else if (zzhxpVar == zzhxp.d || zzhxpVar == zzhxp.c) {
            a = zzhnx.a(this.c.intValue());
        } else {
            if (zzhxpVar != zzhxp.b) {
                a70.r("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(zzhxpVar)));
                return null;
            }
            a = zzhnx.b(this.c.intValue());
        }
        return new zzhxu(this.a, this.b, a, this.c);
    }

    public /* synthetic */ zzhxt(int i) {
    }
}
