package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: org.spongycastle.math.ec.custom.sec.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5995h {

    /* renamed from: P, reason: collision with root package name */
    static final int[] f62788P = {Integer.MAX_VALUE, -1, -1, -1, -1};
    static final int[] PExt = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};
    private static final int[] PExtInv = {-1, -1073741826, -1, -1, -1, 1, 1};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.d.a(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && pj.d.h(iArr3, f62788P))) {
            pj.m.g(5, -2147483647, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (pj.m.r(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && pj.d.h(iArr2, f62788P))) {
            pj.m.g(5, -2147483647, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] f10 = pj.d.f(bigInteger);
        if (f10[4] == -1) {
            int[] iArr = f62788P;
            if (pj.d.h(f10, iArr)) {
                pj.d.s(iArr, f10);
            }
        }
        return f10;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] d10 = pj.d.d();
        pj.d.k(iArr, iArr2, d10);
        g(d10, iArr3);
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.d.o(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && pj.m.p(10, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (pj.m.e(iArr4.length, iArr4, iArr3) != 0) {
                pj.m.s(10, iArr3, iArr4.length);
            }
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        if (pj.d.j(iArr)) {
            pj.d.u(iArr2);
        } else {
            pj.d.r(f62788P, iArr, iArr2);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        long j10 = iArr[5] & BodyPartID.bodyIdMax;
        long j11 = iArr[6] & BodyPartID.bodyIdMax;
        long j12 = iArr[7] & BodyPartID.bodyIdMax;
        long j13 = iArr[8] & BodyPartID.bodyIdMax;
        long j14 = iArr[9] & BodyPartID.bodyIdMax;
        long j15 = (iArr[0] & BodyPartID.bodyIdMax) + j10 + (j10 << 31);
        iArr2[0] = (int) j15;
        long j16 = (j15 >>> 32) + (iArr[1] & BodyPartID.bodyIdMax) + j11 + (j11 << 31);
        iArr2[1] = (int) j16;
        long j17 = (j16 >>> 32) + (iArr[2] & BodyPartID.bodyIdMax) + j12 + (j12 << 31);
        iArr2[2] = (int) j17;
        long j18 = (j17 >>> 32) + (iArr[3] & BodyPartID.bodyIdMax) + j13 + (j13 << 31);
        iArr2[3] = (int) j18;
        long j19 = (j18 >>> 32) + (BodyPartID.bodyIdMax & iArr[4]) + j14 + (j14 << 31);
        iArr2[4] = (int) j19;
        h((int) (j19 >>> 32), iArr2);
    }

    public static void h(int i10, int[] iArr) {
        if ((i10 == 0 || pj.d.p(-2147483647, i10, iArr, 0) == 0) && !(iArr[4] == -1 && pj.d.h(iArr, f62788P))) {
            return;
        }
        pj.m.g(5, -2147483647, iArr);
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] d10 = pj.d.d();
        pj.d.q(iArr, d10);
        g(d10, iArr2);
    }

    public static void j(int[] iArr, int i10, int[] iArr2) {
        int[] d10 = pj.d.d();
        pj.d.q(iArr, d10);
        g(d10, iArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            pj.d.q(iArr2, d10);
            g(d10, iArr2);
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.d.r(iArr, iArr2, iArr3) != 0) {
            pj.m.N(5, -2147483647, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (pj.m.D(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && pj.d.h(iArr2, f62788P))) {
            pj.m.g(5, -2147483647, iArr2);
        }
    }
}
