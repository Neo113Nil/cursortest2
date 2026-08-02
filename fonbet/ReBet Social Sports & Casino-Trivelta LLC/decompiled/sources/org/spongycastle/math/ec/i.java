package org.spongycastle.math.ec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class i extends a {
    @Override // org.spongycastle.math.ec.a
    public g b(g gVar, BigInteger bigInteger) {
        d h10 = gVar.h();
        int a10 = k.a(h10);
        if (bigInteger.bitLength() > a10) {
            throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
        }
        j c10 = k.c(gVar, c(a10));
        g[] a11 = c10.a();
        int b10 = c10.b();
        int i10 = ((a10 + b10) - 1) / b10;
        g u10 = h10.u();
        int i11 = (b10 * i10) - 1;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = 0;
            for (int i14 = i11 - i12; i14 >= 0; i14 -= i10) {
                i13 <<= 1;
                if (bigInteger.testBit(i14)) {
                    i13 |= 1;
                }
            }
            u10 = u10.E(a11[i13]);
        }
        return u10;
    }

    public int c(int i10) {
        return i10 > 257 ? 6 : 5;
    }
}
