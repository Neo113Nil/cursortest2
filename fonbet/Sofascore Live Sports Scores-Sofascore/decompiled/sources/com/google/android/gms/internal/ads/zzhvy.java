package com.google.android.gms.internal.ads;

import defpackage.xmo;
import java.math.BigInteger;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhvy {
    public zzhwb a = null;
    public zzici b = null;

    private zzhvy() {
    }

    public final zzhvz a() {
        ECPoint eCPoint;
        zzhwb zzhwbVar = this.a;
        if (zzhwbVar == null) {
            defpackage.zzl.x("Cannot build without a ecdsa public key");
            return null;
        }
        zzici zziciVar = this.b;
        if (zziciVar == null) {
            defpackage.zzl.x("Cannot build without a private value");
            return null;
        }
        zzhfr zzhfrVar = zzhfr.a;
        BigInteger bigInteger = zziciVar.a;
        ECPoint eCPoint2 = zzhwbVar.b;
        zzhvt zzhvtVar = zzhwbVar.a.b;
        BigInteger order = zzhvtVar.b.getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            defpackage.zzl.x("Invalid private value");
            return null;
        }
        ECParameterSpec eCParameterSpec = zzhvtVar.b;
        if (!zzhmm.b(eCParameterSpec, zzhmm.a) && !zzhmm.b(eCParameterSpec, zzhmm.b) && !zzhmm.b(eCParameterSpec, zzhmm.c)) {
            defpackage.zzl.x("spec must be NIST P256, P384 or P521");
            return null;
        }
        if (bigInteger.signum() != 1) {
            defpackage.zzl.x("k must be positive");
            return null;
        }
        if (bigInteger.compareTo(eCParameterSpec.getOrder()) >= 0) {
            defpackage.zzl.x("k must be smaller than the order of the generator");
            return null;
        }
        EllipticCurve curve = eCParameterSpec.getCurve();
        ECPoint generator = eCParameterSpec.getGenerator();
        zzhmm.a(generator, curve);
        BigInteger a = eCParameterSpec.getCurve().getA();
        BigInteger c = zzhmm.c(curve);
        xmo d = zzhmm.d(ECPoint.POINT_INFINITY, c);
        xmo d2 = zzhmm.d(generator, c);
        for (int bitLength = bigInteger.bitLength(); bitLength >= 0; bitLength--) {
            if (bigInteger.testBit(bitLength)) {
                d = zzhmm.f(d, d2, a, c);
                d2 = zzhmm.e(d2, a, c);
            } else {
                d2 = zzhmm.f(d, d2, a, c);
                d = zzhmm.e(d, a, c);
            }
        }
        if (d.c.equals(BigInteger.ZERO)) {
            eCPoint = ECPoint.POINT_INFINITY;
        } else {
            BigInteger modInverse = d.c.modInverse(c);
            BigInteger mod = modInverse.multiply(modInverse).mod(c);
            eCPoint = new ECPoint(d.a.multiply(mod).mod(c), d.b.multiply(mod).mod(c).multiply(modInverse).mod(c));
        }
        zzhmm.a(eCPoint, curve);
        if (eCPoint.equals(eCPoint2)) {
            return new zzhvz(this.a, this.b);
        }
        defpackage.zzl.x("Invalid private value");
        return null;
    }

    public /* synthetic */ zzhvy(int i) {
    }
}
