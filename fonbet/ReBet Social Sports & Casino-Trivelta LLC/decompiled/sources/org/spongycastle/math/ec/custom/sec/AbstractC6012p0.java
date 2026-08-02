package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import pj.AbstractC6085a;

/* renamed from: org.spongycastle.math.ec.custom.sec.p0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6012p0 {
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
        jArr3[6] = jArr2[6] ^ jArr[6];
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
        jArr[0] = j10 ^ (j11 << 49);
        jArr[1] = (j11 >>> 15) ^ (j12 << 34);
        jArr[2] = (j12 >>> 30) ^ (j13 << 19);
        jArr[3] = ((j13 >>> 45) ^ (j14 << 4)) ^ (j15 << 53);
        jArr[4] = ((j14 >>> 60) ^ (j16 << 38)) ^ (j15 >>> 11);
        jArr[5] = (j16 >>> 26) ^ (j17 << 23);
        jArr[6] = j17 >>> 41;
        jArr[7] = 0;
    }

    public static void f(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        jArr2[0] = j10 & 562949953421311L;
        jArr2[1] = ((j10 >>> 49) ^ (j11 << 15)) & 562949953421311L;
        jArr2[2] = ((j11 >>> 34) ^ (j12 << 30)) & 562949953421311L;
        jArr2[3] = (j12 >>> 19) ^ (j13 << 45);
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
        int i12 = 36;
        do {
            int i13 = (int) (j10 >>> i12);
            long j18 = (((jArr2[i13 & 7] ^ (jArr2[(i13 >>> 3) & 7] << 3)) ^ (jArr2[(i13 >>> 6) & 7] << 6)) ^ (jArr2[(i13 >>> 9) & 7] << 9)) ^ (jArr2[(i13 >>> 12) & 7] << 12);
            j16 ^= j18 << i12;
            j17 ^= j18 >>> (-i12);
            i12 -= 15;
        } while (i12 > 0);
        jArr[i10] = jArr[i10] ^ (562949953421311L & j16);
        int i14 = i10 + 1;
        jArr[i14] = jArr[i14] ^ ((j16 >>> 49) ^ (j17 << 15));
    }

    public static void i(long[] jArr, long[] jArr2) {
        AbstractC6085a.c(jArr[0], jArr2, 0);
        AbstractC6085a.c(jArr[1], jArr2, 2);
        AbstractC6085a.c(jArr[2], jArr2, 4);
        jArr2[6] = jArr[3] & 1;
    }

    public static void j(long[] jArr, long[] jArr2) {
        if (pj.g.u(jArr)) {
            throw new IllegalStateException();
        }
        long[] g10 = pj.g.g();
        long[] g11 = pj.g.g();
        p(jArr, g10);
        r(g10, 1, g11);
        k(g10, g11, g10);
        r(g11, 1, g11);
        k(g10, g11, g10);
        r(g10, 3, g11);
        k(g10, g11, g10);
        r(g10, 6, g11);
        k(g10, g11, g10);
        r(g10, 12, g11);
        k(g10, g11, g10);
        r(g10, 24, g11);
        k(g10, g11, g10);
        r(g10, 48, g11);
        k(g10, g11, g10);
        r(g10, 96, g11);
        k(g10, g11, jArr2);
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
        long j17 = j14 ^ (j16 >>> 50);
        long j18 = (j13 ^ ((j16 >>> 1) ^ (j16 << 14))) ^ (j15 >>> 50);
        long j19 = j10 ^ (j17 << 63);
        long j20 = (j11 ^ (j15 << 63)) ^ ((j17 >>> 1) ^ (j17 << 14));
        long j21 = ((j12 ^ (j16 << 63)) ^ ((j15 >>> 1) ^ (j15 << 14))) ^ (j17 >>> 50);
        long j22 = j18 >>> 1;
        jArr2[0] = (j19 ^ j22) ^ (j22 << 15);
        jArr2[1] = (j18 >>> 50) ^ j20;
        jArr2[2] = j21;
        jArr2[3] = 1 & j18;
    }

    public static void n(long[] jArr, int i10) {
        int i11 = i10 + 3;
        long j10 = jArr[i11];
        long j11 = j10 >>> 1;
        jArr[i10] = (j11 ^ (j11 << 15)) ^ jArr[i10];
        int i12 = i10 + 1;
        jArr[i12] = jArr[i12] ^ (j10 >>> 50);
        jArr[i11] = j10 & 1;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long e10 = AbstractC6085a.e(jArr[0]);
        long e11 = AbstractC6085a.e(jArr[1]);
        long j10 = (e10 & BodyPartID.bodyIdMax) | (e11 << 32);
        long j11 = (e10 >>> 32) | (e11 & (-4294967296L));
        long e12 = AbstractC6085a.e(jArr[2]);
        long j12 = (e12 & BodyPartID.bodyIdMax) ^ (jArr[3] << 32);
        long j13 = e12 >>> 32;
        jArr2[0] = j10 ^ (j11 << 8);
        jArr2[1] = ((j12 ^ (j13 << 8)) ^ (j11 >>> 56)) ^ (j11 << 33);
        jArr2[2] = (j11 >>> 31) ^ (j13 << 33);
        jArr2[3] = e12 >>> 63;
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
