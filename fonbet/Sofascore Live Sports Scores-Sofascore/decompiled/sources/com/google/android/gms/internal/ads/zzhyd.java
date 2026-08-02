package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhyd {
    public zzhyg a = null;
    public zzici b = null;
    public zzici c = null;
    public zzici d = null;
    public zzici e = null;
    public zzici f = null;
    public zzici g = null;

    private zzhyd() {
    }

    public final zzhye a() {
        zzici zziciVar;
        zzici zziciVar2;
        zzhyg zzhygVar = this.a;
        if (zzhygVar == null) {
            defpackage.zzl.x("Cannot build without a RSA SSA PKCS1 public key");
            return null;
        }
        zzici zziciVar3 = this.c;
        if (zziciVar3 == null || (zziciVar = this.d) == null) {
            defpackage.zzl.x("Cannot build without prime factors");
            return null;
        }
        zzici zziciVar4 = this.b;
        if (zziciVar4 == null) {
            defpackage.zzl.x("Cannot build without private exponent");
            return null;
        }
        zzici zziciVar5 = this.e;
        if (zziciVar5 == null || (zziciVar2 = this.f) == null) {
            defpackage.zzl.x("Cannot build without prime exponents");
            return null;
        }
        zzici zziciVar6 = this.g;
        if (zziciVar6 == null) {
            defpackage.zzl.x("Cannot build without CRT coefficient");
            return null;
        }
        BigInteger bigInteger = zzhygVar.a.b;
        BigInteger bigInteger2 = zzhygVar.b;
        zzhfr zzhfrVar = zzhfr.a;
        BigInteger bigInteger3 = zziciVar3.a;
        BigInteger bigInteger4 = zziciVar.a;
        BigInteger bigInteger5 = zziciVar4.a;
        BigInteger bigInteger6 = zziciVar5.a;
        BigInteger bigInteger7 = zziciVar2.a;
        BigInteger bigInteger8 = zziciVar6.a;
        if (!bigInteger3.isProbablePrime(10)) {
            defpackage.zzl.x("p is not a prime");
            return null;
        }
        if (!bigInteger4.isProbablePrime(10)) {
            defpackage.zzl.x("q is not a prime");
            return null;
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            defpackage.zzl.x("Prime p times prime q is not equal to the public key's modulus");
            return null;
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger subtract = bigInteger3.subtract(bigInteger9);
        BigInteger subtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(bigInteger9)) {
            defpackage.zzl.x("D is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger6).mod(subtract).equals(bigInteger9)) {
            defpackage.zzl.x("dP is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger7).mod(subtract2).equals(bigInteger9)) {
            defpackage.zzl.x("dQ is invalid.");
            return null;
        }
        if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            return new zzhye(this.a, this.c, this.d, this.b, this.e, this.f, this.g);
        }
        defpackage.zzl.x("qInv is invalid.");
        return null;
    }

    public /* synthetic */ zzhyd(int i) {
    }
}
