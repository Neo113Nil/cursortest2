package org.spongycastle.math.ec.custom.djb;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import pj.g;
import pj.m;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: P, reason: collision with root package name */
    static final int[] f62732P = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] PExt = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        g.a(iArr, iArr2, iArr3);
        if (g.q(iArr3, f62732P)) {
            m(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        m.r(8, iArr, iArr2);
        if (g.q(iArr2, f62732P)) {
            m(iArr2);
        }
    }

    public static int c(int[] iArr) {
        long j10 = (iArr[0] & BodyPartID.bodyIdMax) - 19;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            j11 = m.l(7, iArr, 1);
        }
        long j12 = j11 + (BodyPartID.bodyIdMax & iArr[7]) + 2147483648L;
        iArr[7] = (int) j12;
        return (int) (j12 >> 32);
    }

    public static int[] d(BigInteger bigInteger) {
        int[] m10 = g.m(bigInteger);
        while (true) {
            int[] iArr = f62732P;
            if (!g.q(m10, iArr)) {
                return m10;
            }
            g.G(iArr, m10);
        }
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] h10 = g.h();
        g.w(iArr, iArr2, h10);
        h(h10, iArr3);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        g.A(iArr, iArr2, iArr3);
        if (m.p(16, iArr3, PExt)) {
            l(iArr3);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (g.t(iArr)) {
            g.J(iArr2);
        } else {
            g.F(f62732P, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        int i10 = iArr[7];
        m.C(8, iArr, 8, i10, iArr2, 0);
        int B10 = g.B(19, iArr, iArr2) << 1;
        int i11 = iArr2[7];
        iArr2[7] = (i11 & Integer.MAX_VALUE) + m.g(7, (B10 + ((i11 >>> 31) - (i10 >>> 31))) * 19, iArr2);
        if (g.q(iArr2, f62732P)) {
            m(iArr2);
        }
    }

    public static void i(int i10, int[] iArr) {
        int i11 = iArr[7];
        iArr[7] = (i11 & Integer.MAX_VALUE) + m.g(7, ((i10 << 1) | (i11 >>> 31)) * 19, iArr);
        if (g.q(iArr, f62732P)) {
            m(iArr);
        }
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] h10 = g.h();
        g.D(iArr, h10);
        h(h10, iArr2);
    }

    public static void k(int[] iArr, int i10, int[] iArr2) {
        int[] h10 = g.h();
        g.D(iArr, h10);
        h(h10, iArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            g.D(iArr2, h10);
            h(h10, iArr2);
        }
    }

    public static int l(int[] iArr) {
        long j10 = iArr[0] & BodyPartID.bodyIdMax;
        int[] iArr2 = PExt;
        long j11 = j10 - (iArr2[0] & BodyPartID.bodyIdMax);
        iArr[0] = (int) j11;
        long j12 = j11 >> 32;
        if (j12 != 0) {
            j12 = m.l(8, iArr, 1);
        }
        long j13 = j12 + (iArr[8] & BodyPartID.bodyIdMax) + 19;
        iArr[8] = (int) j13;
        long j14 = j13 >> 32;
        if (j14 != 0) {
            j14 = m.s(15, iArr, 9);
        }
        long j15 = j14 + ((iArr[15] & BodyPartID.bodyIdMax) - (BodyPartID.bodyIdMax & (iArr2[15] + 1)));
        iArr[15] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static int m(int[] iArr) {
        long j10 = (iArr[0] & BodyPartID.bodyIdMax) + 19;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            j11 = m.s(7, iArr, 1);
        }
        long j12 = j11 + ((BodyPartID.bodyIdMax & iArr[7]) - 2147483648L);
        iArr[7] = (int) j12;
        return (int) (j12 >> 32);
    }

    public static void n(int[] iArr, int[] iArr2, int[] iArr3) {
        if (g.F(iArr, iArr2, iArr3) != 0) {
            c(iArr3);
        }
    }

    public static void o(int[] iArr, int[] iArr2) {
        m.D(8, iArr, 0, iArr2);
        if (g.q(iArr2, f62732P)) {
            m(iArr2);
        }
    }
}
