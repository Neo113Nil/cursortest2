package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import pj.AbstractC6085a;

/* loaded from: classes5.dex */
public abstract class R0 {
    private static final long[] ROOT_Z = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    public static void a(long[] jArr, int i10, long[] jArr2, int i11, long[] jArr3, int i12) {
        for (int i13 = 0; i13 < 9; i13++) {
            jArr3[i12 + i13] = jArr[i10 + i13] ^ jArr2[i11 + i13];
        }
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 9; i10++) {
            jArr3[i10] = jArr[i10] ^ jArr2[i10];
        }
    }

    public static void c(long[] jArr, int i10, long[] jArr2, int i11, long[] jArr3, int i12) {
        for (int i13 = 0; i13 < 9; i13++) {
            int i14 = i12 + i13;
            jArr3[i14] = jArr3[i14] ^ (jArr[i10 + i13] ^ jArr2[i11 + i13]);
        }
    }

    public static void d(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 18; i10++) {
            jArr3[i10] = jArr[i10] ^ jArr2[i10];
        }
    }

    public static void e(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        for (int i10 = 1; i10 < 9; i10++) {
            jArr2[i10] = jArr[i10];
        }
    }

    public static long[] f(BigInteger bigInteger) {
        long[] d10 = pj.l.d(bigInteger);
        m(d10, 0);
        return d10;
    }

    public static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[144];
        System.arraycopy(jArr2, 0, jArr4, 9, 9);
        int i10 = 7;
        int i11 = 0;
        while (i10 > 0) {
            int i12 = i11 + 18;
            long[] jArr5 = jArr4;
            pj.m.E(9, jArr5, i12 >>> 1, 0L, jArr5, i12);
            jArr4 = jArr5;
            m(jArr4, i12);
            a(jArr4, 9, jArr4, i12, jArr4, i11 + 27);
            i10--;
            i11 = i12;
        }
        long[] jArr6 = new long[144];
        pj.m.I(144, jArr4, 0, 4, 0L, jArr6, 0);
        for (int i13 = 56; i13 >= 0; i13 -= 8) {
            for (int i14 = 1; i14 < 9; i14 += 2) {
                int i15 = (int) (jArr[i14] >>> i13);
                c(jArr4, (i15 & 15) * 9, jArr6, ((i15 >>> 4) & 15) * 9, jArr3, i14 - 1);
            }
            pj.m.H(16, jArr3, 0, 8, 0L);
        }
        for (int i16 = 56; i16 >= 0; i16 -= 8) {
            for (int i17 = 0; i17 < 9; i17 += 2) {
                int i18 = (int) (jArr[i17] >>> i16);
                c(jArr4, (i18 & 15) * 9, jArr6, ((i18 >>> 4) & 15) * 9, jArr3, i17);
            }
            if (i16 > 0) {
                pj.m.H(18, jArr3, 0, 8, 0L);
            }
        }
    }

    public static void h(long[] jArr, long[] jArr2) {
        for (int i10 = 0; i10 < 9; i10++) {
            AbstractC6085a.c(jArr[i10], jArr2, i10 << 1);
        }
    }

    public static void i(long[] jArr, long[] jArr2) {
        if (pj.l.f(jArr)) {
            throw new IllegalStateException();
        }
        long[] a10 = pj.l.a();
        long[] a11 = pj.l.a();
        long[] a12 = pj.l.a();
        o(jArr, a12);
        o(a12, a10);
        o(a10, a11);
        j(a10, a11, a10);
        q(a10, 2, a11);
        j(a10, a11, a10);
        j(a10, a12, a10);
        q(a10, 5, a11);
        j(a10, a11, a10);
        q(a11, 5, a11);
        j(a10, a11, a10);
        q(a10, 15, a11);
        j(a10, a11, a12);
        q(a12, 30, a10);
        q(a10, 30, a11);
        j(a10, a11, a10);
        q(a10, 60, a11);
        j(a10, a11, a10);
        q(a11, 60, a11);
        j(a10, a11, a10);
        q(a10, 180, a11);
        j(a10, a11, a10);
        q(a11, 180, a11);
        j(a10, a11, a10);
        j(a10, a12, jArr2);
    }

    public static void j(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] b10 = pj.l.b();
        g(jArr, jArr2, b10);
        l(b10, jArr3);
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] b10 = pj.l.b();
        g(jArr, jArr2, b10);
        d(jArr3, b10, jArr3);
    }

    public static void l(long[] jArr, long[] jArr2) {
        long j10 = jArr[9];
        long j11 = jArr[17];
        long j12 = (((j10 ^ (j11 >>> 59)) ^ (j11 >>> 57)) ^ (j11 >>> 54)) ^ (j11 >>> 49);
        long j13 = (j11 << 15) ^ (((jArr[8] ^ (j11 << 5)) ^ (j11 << 7)) ^ (j11 << 10));
        for (int i10 = 16; i10 >= 10; i10--) {
            long j14 = jArr[i10];
            jArr2[i10 - 8] = (((j13 ^ (j14 >>> 59)) ^ (j14 >>> 57)) ^ (j14 >>> 54)) ^ (j14 >>> 49);
            j13 = (((jArr[i10 - 9] ^ (j14 << 5)) ^ (j14 << 7)) ^ (j14 << 10)) ^ (j14 << 15);
        }
        jArr2[1] = (((j13 ^ (j12 >>> 59)) ^ (j12 >>> 57)) ^ (j12 >>> 54)) ^ (j12 >>> 49);
        long j15 = (j12 << 15) ^ (((jArr[0] ^ (j12 << 5)) ^ (j12 << 7)) ^ (j12 << 10));
        long j16 = jArr2[8];
        long j17 = j16 >>> 59;
        jArr2[0] = (((j15 ^ j17) ^ (j17 << 2)) ^ (j17 << 5)) ^ (j17 << 10);
        jArr2[8] = 576460752303423487L & j16;
    }

    public static void m(long[] jArr, int i10) {
        int i11 = i10 + 8;
        long j10 = jArr[i11];
        long j11 = j10 >>> 59;
        jArr[i10] = ((j11 << 10) ^ (((j11 << 2) ^ j11) ^ (j11 << 5))) ^ jArr[i10];
        jArr[i11] = j10 & 576460752303423487L;
    }

    public static void n(long[] jArr, long[] jArr2) {
        long[] a10 = pj.l.a();
        long[] a11 = pj.l.a();
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = i10 + 1;
            long e10 = AbstractC6085a.e(jArr[i10]);
            i10 += 2;
            long e11 = AbstractC6085a.e(jArr[i12]);
            a10[i11] = (BodyPartID.bodyIdMax & e10) | (e11 << 32);
            a11[i11] = (e10 >>> 32) | ((-4294967296L) & e11);
        }
        long e12 = AbstractC6085a.e(jArr[i10]);
        a10[4] = BodyPartID.bodyIdMax & e12;
        a11[4] = e12 >>> 32;
        j(a11, ROOT_Z, jArr2);
        b(jArr2, a10, jArr2);
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] b10 = pj.l.b();
        h(jArr, b10);
        l(b10, jArr2);
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] b10 = pj.l.b();
        h(jArr, b10);
        d(jArr2, b10, jArr2);
    }

    public static void q(long[] jArr, int i10, long[] jArr2) {
        long[] b10 = pj.l.b();
        h(jArr, b10);
        l(b10, jArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            h(jArr2, b10);
            l(b10, jArr2);
        }
    }
}
