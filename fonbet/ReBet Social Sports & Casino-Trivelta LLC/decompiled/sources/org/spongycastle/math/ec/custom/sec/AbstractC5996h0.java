package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import pj.AbstractC6085a;

/* renamed from: org.spongycastle.math.ec.custom.sec.h0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5996h0 {
    private static final long[] ROOT_Z = {-5270498306774157648L, 5270498306774195053L, 19634136210L};

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static long[] d(BigInteger bigInteger) {
        long[] m10 = pj.e.m(bigInteger);
        m(m10, 0);
        return m10;
    }

    public static void e(long[] jArr) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        jArr[0] = j10 ^ (j11 << 55);
        jArr[1] = (j11 >>> 9) ^ (j12 << 46);
        jArr[2] = (j12 >>> 18) ^ (j13 << 37);
        jArr[3] = (j13 >>> 27) ^ (j14 << 28);
        jArr[4] = (j14 >>> 36) ^ (j15 << 19);
        jArr[5] = j15 >>> 45;
    }

    public static void f(long[] jArr, long[] jArr2, long[] jArr3) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = (j11 >>> 46) ^ (jArr[2] << 18);
        long j13 = ((j11 << 9) ^ (j10 >>> 55)) & 36028797018963967L;
        long j14 = j10 & 36028797018963967L;
        long j15 = jArr2[0];
        long j16 = jArr2[1];
        long j17 = (j16 >>> 46) ^ (jArr2[2] << 18);
        long j18 = ((j15 >>> 55) ^ (j16 << 9)) & 36028797018963967L;
        long j19 = j15 & 36028797018963967L;
        long[] jArr4 = new long[10];
        g(j14, j19, jArr4, 0);
        g(j12, j17, jArr4, 2);
        long j20 = (j14 ^ j13) ^ j12;
        long j21 = (j19 ^ j18) ^ j17;
        g(j20, j21, jArr4, 4);
        long j22 = (j13 << 1) ^ (j12 << 2);
        long j23 = (j18 << 1) ^ (j17 << 2);
        g(j14 ^ j22, j19 ^ j23, jArr4, 6);
        g(j20 ^ j22, j21 ^ j23, jArr4, 8);
        long j24 = jArr4[6];
        long j25 = jArr4[8] ^ j24;
        long j26 = jArr4[7];
        long j27 = jArr4[9] ^ j26;
        long j28 = (j25 << 1) ^ j24;
        long j29 = (j25 ^ (j27 << 1)) ^ j26;
        long j30 = jArr4[0];
        long j31 = jArr4[1];
        long j32 = (j31 ^ j30) ^ jArr4[4];
        long j33 = j31 ^ jArr4[5];
        long j34 = jArr4[2];
        long j35 = ((j28 ^ j30) ^ (j34 << 4)) ^ (j34 << 1);
        long j36 = jArr4[3];
        long j37 = (((j32 ^ j29) ^ (j36 << 4)) ^ (j36 << 1)) ^ (j35 >>> 55);
        long j38 = (j33 ^ j27) ^ (j37 >>> 55);
        long j39 = ((j35 & 36028797018963967L) >>> 1) ^ ((j37 & 1) << 54);
        long j40 = j39 ^ (j39 << 1);
        long j41 = j40 ^ (j40 << 2);
        long j42 = j41 ^ (j41 << 4);
        long j43 = j42 ^ (j42 << 8);
        long j44 = j43 ^ (j43 << 16);
        long j45 = (j44 ^ (j44 << 32)) & 36028797018963967L;
        long j46 = (((j37 & 36028797018963967L) >>> 1) ^ ((j38 & 1) << 54)) ^ (j45 >>> 54);
        long j47 = j46 ^ (j46 << 1);
        long j48 = j47 ^ (j47 << 2);
        long j49 = j48 ^ (j48 << 4);
        long j50 = j49 ^ (j49 << 8);
        long j51 = j50 ^ (j50 << 16);
        long j52 = 36028797018963967L & (j51 ^ (j51 << 32));
        long j53 = (j38 >>> 1) ^ (j52 >>> 54);
        long j54 = j53 ^ (j53 << 1);
        long j55 = j54 ^ (j54 << 2);
        long j56 = j55 ^ (j55 << 4);
        long j57 = j56 ^ (j56 << 8);
        long j58 = j57 ^ (j57 << 16);
        long j59 = j58 ^ (j58 << 32);
        jArr3[0] = j30;
        jArr3[1] = (j32 ^ j45) ^ j34;
        jArr3[2] = ((j33 ^ j52) ^ j45) ^ j36;
        jArr3[3] = j59 ^ j52;
        jArr3[4] = jArr4[2] ^ j59;
        jArr3[5] = jArr4[3];
        e(jArr3);
    }

    public static void g(long j10, long j11, long[] jArr, int i10) {
        long j12 = j11 << 1;
        long j13 = j12 ^ j11;
        long j14 = j11 << 2;
        long j15 = j13 << 1;
        long[] jArr2 = {0, j11, j12, j13, j14, j14 ^ j11, j15, j15 ^ j11};
        long j16 = jArr2[((int) j10) & 3];
        long j17 = 0;
        int i11 = 47;
        do {
            int i12 = (int) (j10 >>> i11);
            long j18 = (jArr2[i12 & 7] ^ (jArr2[(i12 >>> 3) & 7] << 3)) ^ (jArr2[(i12 >>> 6) & 7] << 6);
            j16 ^= j18 << i11;
            j17 ^= j18 >>> (-i11);
            i11 -= 9;
        } while (i11 > 0);
        jArr[i10] = 36028797018963967L & j16;
        jArr[i10 + 1] = (j16 >>> 55) ^ (j17 << 9);
    }

    public static void h(long[] jArr, long[] jArr2) {
        AbstractC6085a.c(jArr[0], jArr2, 0);
        AbstractC6085a.c(jArr[1], jArr2, 2);
        jArr2[4] = AbstractC6085a.b((int) jArr[2]);
        jArr2[5] = AbstractC6085a.d((int) (r0 >>> 32)) & BodyPartID.bodyIdMax;
    }

    public static void i(long[] jArr, long[] jArr2) {
        if (pj.e.t(jArr)) {
            throw new IllegalStateException();
        }
        long[] f10 = pj.e.f();
        long[] f11 = pj.e.f();
        o(jArr, f10);
        q(f10, 1, f11);
        j(f10, f11, f10);
        q(f11, 1, f11);
        j(f10, f11, f10);
        q(f10, 3, f11);
        j(f10, f11, f10);
        q(f11, 3, f11);
        j(f10, f11, f10);
        q(f10, 9, f11);
        j(f10, f11, f10);
        q(f11, 9, f11);
        j(f10, f11, f10);
        q(f10, 27, f11);
        j(f10, f11, f10);
        q(f11, 27, f11);
        j(f10, f11, f10);
        q(f10, 81, f11);
        j(f10, f11, jArr2);
    }

    public static void j(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] h10 = pj.e.h();
        f(jArr, jArr2, h10);
        l(h10, jArr3);
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] h10 = pj.e.h();
        f(jArr, jArr2, h10);
        b(jArr3, h10, jArr3);
    }

    public static void l(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = j13 ^ ((((j15 >>> 35) ^ (j15 >>> 32)) ^ (j15 >>> 29)) ^ (j15 >>> 28));
        long j17 = (j12 ^ ((((j15 << 29) ^ (j15 << 32)) ^ (j15 << 35)) ^ (j15 << 36))) ^ ((j14 >>> 28) ^ (((j14 >>> 35) ^ (j14 >>> 32)) ^ (j14 >>> 29)));
        long j18 = j10 ^ ((((j16 << 29) ^ (j16 << 32)) ^ (j16 << 35)) ^ (j16 << 36));
        long j19 = (j11 ^ ((((j14 << 29) ^ (j14 << 32)) ^ (j14 << 35)) ^ (j14 << 36))) ^ ((j16 >>> 28) ^ (((j16 >>> 35) ^ (j16 >>> 32)) ^ (j16 >>> 29)));
        long j20 = j17 >>> 35;
        jArr2[0] = (((j18 ^ j20) ^ (j20 << 3)) ^ (j20 << 6)) ^ (j20 << 7);
        jArr2[1] = j19;
        jArr2[2] = 34359738367L & j17;
    }

    public static void m(long[] jArr, int i10) {
        int i11 = i10 + 2;
        long j10 = jArr[i11];
        long j11 = j10 >>> 35;
        jArr[i10] = ((j11 << 7) ^ (((j11 << 3) ^ j11) ^ (j11 << 6))) ^ jArr[i10];
        jArr[i11] = j10 & 34359738367L;
    }

    public static void n(long[] jArr, long[] jArr2) {
        long[] f10 = pj.e.f();
        long e10 = AbstractC6085a.e(jArr[0]);
        long e11 = AbstractC6085a.e(jArr[1]);
        long j10 = (e10 & BodyPartID.bodyIdMax) | (e11 << 32);
        f10[0] = (e10 >>> 32) | (e11 & (-4294967296L));
        long e12 = AbstractC6085a.e(jArr[2]);
        long j11 = e12 & BodyPartID.bodyIdMax;
        f10[1] = e12 >>> 32;
        j(f10, ROOT_Z, jArr2);
        jArr2[0] = jArr2[0] ^ j10;
        jArr2[1] = jArr2[1] ^ j11;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] h10 = pj.e.h();
        h(jArr, h10);
        l(h10, jArr2);
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] h10 = pj.e.h();
        h(jArr, h10);
        b(jArr2, h10, jArr2);
    }

    public static void q(long[] jArr, int i10, long[] jArr2) {
        long[] h10 = pj.e.h();
        h(jArr, h10);
        l(h10, jArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            h(jArr2, h10);
            l(h10, jArr2);
        }
    }
}
