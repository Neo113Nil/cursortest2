package org.spongycastle.math.ec;

import java.math.BigInteger;
import org.spongycastle.math.ec.d;
import org.spongycastle.math.ec.g;

/* loaded from: classes5.dex */
public class u extends a {
    public static g.a c(g.a aVar, byte[] bArr, n nVar) {
        g.a[] d10;
        d.a aVar2 = (d.a) aVar.h();
        byte byteValue = aVar2.n().t().byteValue();
        if (nVar == null || !(nVar instanceof v)) {
            d10 = q.d(aVar, byteValue);
            v vVar = new v();
            vVar.b(d10);
            aVar2.B(aVar, "bc_wtnaf", vVar);
        } else {
            d10 = ((v) nVar).a();
        }
        g.a[] aVarArr = new g.a[d10.length];
        for (int i10 = 0; i10 < d10.length; i10++) {
            aVarArr[i10] = (g.a) d10[i10].u();
        }
        g.a aVar3 = (g.a) aVar.h().u();
        int i11 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i11++;
            byte b10 = bArr[length];
            if (b10 != 0) {
                aVar3 = (g.a) aVar3.F(i11).a(b10 > 0 ? d10[b10 >>> 1] : aVarArr[(-b10) >>> 1]);
                i11 = 0;
            }
        }
        return i11 > 0 ? aVar3.F(i11) : aVar3;
    }

    @Override // org.spongycastle.math.ec.a
    public g b(g gVar, BigInteger bigInteger) {
        if (!(gVar instanceof g.a)) {
            throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
        }
        g.a aVar = (g.a) gVar;
        d.a aVar2 = (d.a) aVar.h();
        int t10 = aVar2.t();
        byte byteValue = aVar2.n().t().byteValue();
        byte c10 = q.c(byteValue);
        return d(aVar, q.j(bigInteger, t10, byteValue, aVar2.G(), c10, (byte) 10), aVar2.x(aVar, "bc_wtnaf"), byteValue, c10);
    }

    public final g.a d(g.a aVar, w wVar, n nVar, byte b10, byte b11) {
        return c(aVar, q.l(b11, wVar, (byte) 4, BigInteger.valueOf(16L), q.g(b11, 4), b10 == 0 ? q.alpha0 : q.alpha1), nVar);
    }
}
