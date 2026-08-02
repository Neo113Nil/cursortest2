package org.spongycastle.jcajce.provider.asymmetric.util;

import Ri.h;
import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import nj.C5740a;
import org.spongycastle.math.ec.d;
import org.spongycastle.math.ec.g;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static Map f62697a = new HashMap();

    static {
        Enumeration i10 = Vi.a.i();
        while (i10.hasMoreElements()) {
            String str = (String) i10.nextElement();
            h a10 = Ri.d.a(str);
            if (a10 != null) {
                f62697a.put(a10.c(), Vi.a.h(str).c());
            }
        }
        h h10 = Vi.a.h("Curve25519");
        f62697a.put(new d.e(h10.c().s().getCharacteristic(), h10.c().n().t(), h10.c().o().t()), h10.c());
    }

    public static org.spongycastle.math.ec.d a(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        BigInteger a10 = ellipticCurve.getA();
        BigInteger b10 = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            d.e eVar = new d.e(((ECFieldFp) field).getP(), a10, b10);
            return f62697a.containsKey(eVar) ? (org.spongycastle.math.ec.d) f62697a.get(eVar) : eVar;
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m10 = eCFieldF2m.getM();
        int[] a11 = c.a(eCFieldF2m.getMidTermsOfReductionPolynomial());
        return new d.C0867d(m10, a11[0], a11[1], a11[2], a10, b10);
    }

    public static g b(ECParameterSpec eCParameterSpec, ECPoint eCPoint, boolean z10) {
        return c(a(eCParameterSpec.getCurve()), eCPoint, z10);
    }

    public static g c(org.spongycastle.math.ec.d dVar, ECPoint eCPoint, boolean z10) {
        return dVar.f(eCPoint.getAffineX(), eCPoint.getAffineY());
    }

    public static C5740a d(ECParameterSpec eCParameterSpec, boolean z10) {
        org.spongycastle.math.ec.d a10 = a(eCParameterSpec.getCurve());
        return new C5740a(a10, c(a10, eCParameterSpec.getGenerator(), z10), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed());
    }
}
