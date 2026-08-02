package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import pj.AbstractC6085a;

/* loaded from: classes5.dex */
public abstract class B0 {
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static long[] d(BigInteger bigInteger) {
        long[] n10 = pj.g.n(bigInteger);
        n(n10, 0);
        return n10;
    }

    public static void e(long[] jArr) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        jArr[0] = j10 ^ (j11 << 60);
        jArr[1] = (j11 >>> 4) ^ (j12 << 56);
        jArr[2] = (j12 >>> 8) ^ (j13 << 52);
        jArr[3] = (j13 >>> 12) ^ (j14 << 48);
        jArr[4] = (j14 >>> 16) ^ (j15 << 44);
        jArr[5] = (j15 >>> 20) ^ (j16 << 40);
        jArr[6] = (j16 >>> 24) ^ (j17 << 36);
        jArr[7] = j17 >>> 28;
    }

    public static void f(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        jArr2[0] = j10 & 1152921504606846975L;
        jArr2[1] = ((j10 >>> 60) ^ (j11 << 4)) & 1152921504606846975L;
        jArr2[2] = ((j11 >>> 56) ^ (j12 << 8)) & 1152921504606846975L;
        jArr2[3] = (j12 >>> 52) ^ (j13 << 12);
    }

    public static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        f(jArr, jArr4);
        f(jArr2, jArr5);
        h(jArr4[0], jArr5[0], jArr3, 0);
        h(jArr4[1], jArr5[1], jArr3, 1);
        h(jArr4[2], jArr5[2], jArr3, 2);
        h(jArr4[3], jArr5[3], jArr3, 3);
        for (int i10 = 5; i10 > 0; i10--) {
            jArr3[i10] = jArr3[i10] ^ jArr3[i10 - 1];
        }
        h(jArr4[1] ^ jArr4[0], jArr5[1] ^ jArr5[0], jArr3, 1);
        h(jArr4[3] ^ jArr4[2], jArr5[3] ^ jArr5[2], jArr3, 3);
        for (int i11 = 7; i11 > 1; i11--) {
            jArr3[i11] = jArr3[i11] ^ jArr3[i11 - 2];
        }
        long j10 = jArr4[0] ^ jArr4[2];
        long j11 = jArr4[1] ^ jArr4[3];
        long j12 = jArr5[0] ^ jArr5[2];
        long j13 = jArr5[3] ^ jArr5[1];
        h(j10 ^ j11, j12 ^ j13, jArr3, 3);
        long[] jArr6 = new long[3];
        h(j10, j12, jArr6, 0);
        h(j11, j13, jArr6, 1);
        long j14 = jArr6[0];
        long j15 = jArr6[1];
        long j16 = jArr6[2];
        jArr3[2] = jArr3[2] ^ j14;
        jArr3[3] = (j14 ^ j15) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j15 ^ j16);
        jArr3[5] = jArr3[5] ^ j16;
        e(jArr3);
    }

    public static void h(long j10, long j11, long[] jArr, int i10) {
        long j12 = j11 << 1;
        long j13 = j12 ^ j11;
        long j14 = j11 << 2;
        long j15 = j13 << 1;
        long[] jArr2 = {0, j11, j12, j13, j14, j14 ^ j11, j15, j15 ^ j11};
        int i11 = (int) j10;
        long j16 = (jArr2[(i11 >>> 3) & 7] << 3) ^ jArr2[i11 & 7];
        long j17 = 0;
        int i12 = 54;
        do {
            int i13 = (int) (j10 >>> i12);
            long j18 = jArr2[i13 & 7] ^ (jArr2[(i13 >>> 3) & 7] << 3);
            j16 ^= j18 << i12;
            j17 ^= j18 >>> (-i12);
            i12 -= 6;
        } while (i12 > 0);
        jArr[i10] = jArr[i10] ^ (1152921504606846975L & j16);
        int i14 = i10 + 1;
        jArr[i14] = ((((((j10 & 585610922974906400L) & ((j11 << 4) >> 63)) >>> 5) ^ j17) << 4) ^ (j16 >>> 60)) ^ jArr[i14];
    }

    public static void i(long[] jArr, long[] jArr2) {
        AbstractC6085a.c(jArr[0], jArr2, 0);
        AbstractC6085a.c(jArr[1], jArr2, 2);
        AbstractC6085a.c(jArr[2], jArr2, 4);
        jArr2[6] = AbstractC6085a.b((int) jArr[3]);
        jArr2[7] = AbstractC6085a.a((int) (r0 >>> 32)) & BodyPartID.bodyIdMax;
    }

    public static void j(long[] jArr, long[] jArr2) {
        if (pj.g.u(jArr)) {
            throw new IllegalStateException();
        }
        long[] g10 = pj.g.g();
        long[] g11 = pj.g.g();
        p(jArr, g10);
        k(g10, jArr, g10);
        p(g10, g10);
        k(g10, jArr, g10);
        r(g10, 3, g11);
        k(g11, g10, g11);
        p(g11, g11);
        k(g11, jArr, g11);
        r(g11, 7, g10);
        k(g10, g11, g10);
        r(g10, 14, g11);
        k(g11, g10, g11);
        p(g11, g11);
        k(g11, jArr, g11);
        r(g11, 29, g10);
        k(g10, g11, g10);
        p(g10, g10);
        k(g10, jArr, g10);
        r(g10, 59, g11);
        k(g11, g10, g11);
        p(g11, g11);
        k(g11, jArr, g11);
        r(g11, 119, g10);
        k(g10, g11, g10);
        p(g10, jArr2);
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] i10 = pj.g.i();
        g(jArr, jArr2, i10);
        m(i10, jArr3);
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] i10 = pj.g.i();
        g(jArr, jArr2, i10);
        b(jArr3, i10, jArr3);
    }

    public static void m(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = j16 ^ (j17 >>> 17);
        long j19 = (j15 ^ (j17 << 47)) ^ (j18 >>> 17);
        long j20 = ((j14 ^ (j17 >>> 47)) ^ (j18 << 47)) ^ (j19 >>> 17);
        long j21 = j10 ^ (j20 << 17);
        long j22 = (j11 ^ (j19 << 17)) ^ (j20 >>> 47);
        long j23 = ((j12 ^ (j18 << 17)) ^ (j19 >>> 47)) ^ (j20 << 47);
        long j24 = (((j13 ^ (j17 << 17)) ^ (j18 >>> 47)) ^ (j19 << 47)) ^ (j20 >>> 17);
        long j25 = j24 >>> 47;
        jArr2[0] = j21 ^ j25;
        jArr2[1] = j22;
        jArr2[2] = (j25 << 30) ^ j23;
        jArr2[3] = 140737488355327L & j24;
    }

    public static void n(long[] jArr, int i10) {
        int i11 = i10 + 3;
        long j10 = jArr[i11];
        long j11 = j10 >>> 47;
        jArr[i10] = jArr[i10] ^ j11;
        int i12 = i10 + 2;
        jArr[i12] = (j11 << 30) ^ jArr[i12];
        jArr[i11] = j10 & 140737488355327L;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long e10 = AbstractC6085a.e(jArr[0]);
        long e11 = AbstractC6085a.e(jArr[1]);
        long j10 = (e10 & BodyPartID.bodyIdMax) | (e11 << 32);
        long j11 = (e10 >>> 32) | (e11 & (-4294967296L));
        int i10 = 2;
        long e12 = AbstractC6085a.e(jArr[2]);
        long e13 = AbstractC6085a.e(jArr[3]);
        long j12 = (e12 & BodyPartID.bodyIdMax) | (e13 << 32);
        long j13 = (e13 & (-4294967296L)) | (e12 >>> 32);
        long j14 = j13 >>> 49;
        long j15 = (j11 >>> 49) | (j13 << 15);
        long j16 = j13 ^ (j11 << 15);
        long[] i11 = pj.g.i();
        int[] iArr = {39, 120};
        int i12 = 0;
        while (i12 < i10) {
            int i13 = iArr[i12];
            int i14 = i13 >>> 6;
            int i15 = i13 & 63;
            i11[i14] = i11[i14] ^ (j11 << i15);
            int i16 = i14 + 1;
            int[] iArr2 = iArr;
            int i17 = -i15;
            i11[i16] = i11[i16] ^ ((j16 << i15) | (j11 >>> i17));
            int i18 = i14 + 2;
            i11[i18] = i11[i18] ^ ((j15 << i15) | (j16 >>> i17));
            int i19 = i14 + 3;
            i11[i19] = i11[i19] ^ ((j14 << i15) | (j15 >>> i17));
            int i20 = i14 + 4;
            i11[i20] = i11[i20] ^ (j14 >>> i17);
            i12++;
            i10 = 2;
            iArr = iArr2;
        }
        m(i11, jArr2);
        jArr2[0] = jArr2[0] ^ j10;
        jArr2[1] = jArr2[1] ^ j12;
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] i10 = pj.g.i();
        i(jArr, i10);
        m(i10, jArr2);
    }

    public static void q(long[] jArr, long[] jArr2) {
        long[] i10 = pj.g.i();
        i(jArr, i10);
        b(jArr2, i10, jArr2);
    }

    public static void r(long[] jArr, int i10, long[] jArr2) {
        long[] i11 = pj.g.i();
        i(jArr, i11);
        m(i11, jArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            i(jArr2, i11);
            m(i11, jArr2);
        }
    }
}
