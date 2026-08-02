package org.spongycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.FixedPointUtil;

/* loaded from: classes5.dex */
public abstract class k {
    public static int a(d dVar) {
        BigInteger w10 = dVar.w();
        return w10 == null ? dVar.t() + 1 : w10.bitLength();
    }

    public static j b(n nVar) {
        return (nVar == null || !(nVar instanceof j)) ? new j() : (j) nVar;
    }

    public static j c(g gVar, int i10) {
        d h10 = gVar.h();
        int i11 = 1 << i10;
        j b10 = b(h10.x(gVar, FixedPointUtil.PRECOMP_NAME));
        g[] a10 = b10.a();
        if (a10 != null && a10.length >= i11) {
            return b10;
        }
        int a11 = ((a(h10) + i10) - 1) / i10;
        g[] gVarArr = new g[i10];
        gVarArr[0] = gVar;
        for (int i12 = 1; i12 < i10; i12++) {
            gVarArr[i12] = gVarArr[i12 - 1].C(a11);
        }
        h10.z(gVarArr);
        g[] gVarArr2 = new g[i11];
        gVarArr2[0] = h10.u();
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            g gVar2 = gVarArr[i13];
            int i14 = 1 << i13;
            for (int i15 = i14; i15 < i11; i15 += i14 << 1) {
                gVarArr2[i15] = gVarArr2[i15 - i14].a(gVar2);
            }
        }
        h10.z(gVarArr2);
        b10.c(gVarArr2);
        b10.d(i10);
        h10.B(gVar, FixedPointUtil.PRECOMP_NAME, b10);
        return b10;
    }
}
