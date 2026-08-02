package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import pj.AbstractC6085a;

/* loaded from: classes5.dex */
public abstract class V {
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
    }

    public static long[] d(BigInteger bigInteger) {
        long[] j10 = pj.c.j(bigInteger);
        l(j10, 0);
        return j10;
    }

    public static void e(long[] jArr, long[] jArr2, long[] jArr3) {
        long j10 = jArr[0];
        long j11 = ((jArr[1] << 7) ^ (j10 >>> 57)) & 144115188075855871L;
        long j12 = j10 & 144115188075855871L;
        long j13 = jArr2[0];
        long j14 = ((jArr2[1] << 7) ^ (j13 >>> 57)) & 144115188075855871L;
        long j15 = j13 & 144115188075855871L;
        long[] jArr4 = new long[6];
        f(j12, j15, jArr4, 0);
        f(j11, j14, jArr4, 2);
        f(j12 ^ j11, j15 ^ j14, jArr4, 4);
        long j16 = jArr4[1] ^ jArr4[2];
        long j17 = jArr4[0];
        long j18 = jArr4[3];
        long j19 = (jArr4[4] ^ j17) ^ j16;
        long j20 = j16 ^ (jArr4[5] ^ j18);
        jArr3[0] = j17 ^ (j19 << 57);
        jArr3[1] = (j19 >>> 7) ^ (j20 << 50);
        jArr3[2] = (j20 >>> 14) ^ (j18 << 43);
        jArr3[3] = j18 >>> 21;
    }

    public static void f(long j10, long j11, long[] jArr, int i10) {
        long j12 = j11 << 1;
        long j13 = j12 ^ j11;
        long j14 = j11 << 2;
        long j15 = j13 << 1;
        long[] jArr2 = {0, j11, j12, j13, j14, j14 ^ j11, j15, j15 ^ j11};
        long j16 = jArr2[((int) j10) & 7];
        long j17 = 0;
        int i11 = 48;
        do {
            int i12 = (int) (j10 >>> i11);
            long j18 = (jArr2[i12 & 7] ^ (jArr2[(i12 >>> 3) & 7] << 3)) ^ (jArr2[(i12 >>> 6) & 7] << 6);
            j16 ^= j18 << i11;
            j17 ^= j18 >>> (-i11);
            i11 -= 9;
        } while (i11 > 0);
        jArr[i10] = 144115188075855871L & j16;
        jArr[i10 + 1] = (((((j10 & 72198606942111744L) & ((j11 << 7) >> 63)) >>> 8) ^ j17) << 7) ^ (j16 >>> 57);
    }

    public static void g(long[] jArr, long[] jArr2) {
        AbstractC6085a.c(jArr[0], jArr2, 0);
        AbstractC6085a.c(jArr[1], jArr2, 2);
    }

    public static void h(long[] jArr, long[] jArr2) {
        if (pj.c.p(jArr)) {
            throw new IllegalStateException();
        }
        long[] d10 = pj.c.d();
        long[] d11 = pj.c.d();
        n(jArr, d10);
        i(d10, jArr, d10);
        n(d10, d10);
        i(d10, jArr, d10);
        p(d10, 3, d11);
        i(d11, d10, d11);
        n(d11, d11);
        i(d11, jArr, d11);
        p(d11, 7, d10);
        i(d10, d11, d10);
        p(d10, 14, d11);
        i(d11, d10, d11);
        p(d11, 28, d10);
        i(d10, d11, d10);
        p(d10, 56, d11);
        i(d11, d10, d11);
        n(d11, jArr2);
    }

    public static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] f10 = pj.c.f();
        e(jArr, jArr2, f10);
        k(f10, jArr3);
    }

    public static void j(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] f10 = pj.c.f();
        e(jArr, jArr2, f10);
        b(jArr3, f10, jArr3);
    }

    public static void k(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = j12 ^ ((j13 >>> 40) ^ (j13 >>> 49));
        long j15 = j10 ^ ((j14 << 15) ^ (j14 << 24));
        long j16 = (j11 ^ ((j13 << 15) ^ (j13 << 24))) ^ ((j14 >>> 40) ^ (j14 >>> 49));
        long j17 = j16 >>> 49;
        jArr2[0] = (j15 ^ j17) ^ (j17 << 9);
        jArr2[1] = 562949953421311L & j16;
    }

    public static void l(long[] jArr, int i10) {
        int i11 = i10 + 1;
        long j10 = jArr[i11];
        long j11 = j10 >>> 49;
        jArr[i10] = (j11 ^ (j11 << 9)) ^ jArr[i10];
        jArr[i11] = j10 & 562949953421311L;
    }

    public static void m(long[] jArr, long[] jArr2) {
        long e10 = AbstractC6085a.e(jArr[0]);
        long e11 = AbstractC6085a.e(jArr[1]);
        long j10 = (BodyPartID.bodyIdMax & e10) | (e11 << 32);
        long j11 = (e10 >>> 32) | (e11 & (-4294967296L));
        jArr2[0] = ((j11 << 57) ^ j10) ^ (j11 << 5);
        jArr2[1] = (j11 >>> 59) ^ (j11 >>> 7);
    }

    public static void n(long[] jArr, long[] jArr2) {
        long[] f10 = pj.c.f();
        g(jArr, f10);
        k(f10, jArr2);
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] f10 = pj.c.f();
        g(jArr, f10);
        b(jArr2, f10, jArr2);
    }

    public static void p(long[] jArr, int i10, long[] jArr2) {
        long[] f10 = pj.c.f();
        g(jArr, f10);
        k(f10, jArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            g(jArr2, f10);
            k(f10, jArr2);
        }
    }
}
