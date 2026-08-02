package org.spongycastle.math.ec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class r extends a {
    @Override // org.spongycastle.math.ec.a
    public g b(g gVar, BigInteger bigInteger) {
        g gVar2;
        int max = Math.max(2, Math.min(16, c(bigInteger.bitLength())));
        s k10 = t.k(gVar, max, true);
        g[] a10 = k10.a();
        g[] b10 = k10.b();
        int[] b11 = t.b(max, bigInteger);
        g u10 = gVar.h().u();
        int length = b11.length;
        if (length > 1) {
            length--;
            int i10 = b11[length];
            int i11 = i10 >> 16;
            int i12 = i10 & 65535;
            int abs = Math.abs(i11);
            g[] gVarArr = i11 < 0 ? b10 : a10;
            if ((abs << 2) < (1 << max)) {
                byte b12 = m.bitLengths[abs];
                int i13 = max - b12;
                gVar2 = gVarArr[((1 << (max - 1)) - 1) >>> 1].a(gVarArr[(((abs ^ (1 << (b12 - 1))) << i13) + 1) >>> 1]);
                i12 -= i13;
            } else {
                gVar2 = gVarArr[abs >>> 1];
            }
            u10 = gVar2.C(i12);
        }
        while (length > 0) {
            length--;
            int i14 = b11[length];
            int i15 = i14 >> 16;
            u10 = u10.E((i15 < 0 ? b10 : a10)[Math.abs(i15) >>> 1]).C(i14 & 65535);
        }
        return u10;
    }

    public int c(int i10) {
        return t.h(i10);
    }
}
