package v4;

import Ij.C3261b;
import N3.C3659j;
import android.util.Pair;
import j3.v;
import java.io.IOException;
import java.util.Arrays;
import m3.C8050C;
import m3.N;
import m3.s;

/* renamed from: v4.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10223d {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f102123a = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f102124b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    /* renamed from: v4.d$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f102125a;

        /* renamed from: b, reason: collision with root package name */
        public final long f102126b;

        private a(int i11, long j11) {
            this.f102125a = i11;
            this.f102126b = j11;
        }

        public static a a(C3659j c3659j, C8050C c8050c) throws IOException {
            c3659j.d(c8050c.e(), 0, 8, false);
            c8050c.R(0);
            return new a(c8050c.p(), c8050c.v());
        }
    }

    public static boolean a(C3659j c3659j) throws IOException {
        C8050C c8050c = new C8050C(8);
        int i11 = a.a(c3659j, c8050c).f102125a;
        if (i11 != 1380533830 && i11 != 1380333108) {
            return false;
        }
        c3659j.d(c8050c.e(), 0, 4, false);
        c8050c.R(0);
        int p11 = c8050c.p();
        if (p11 == 1463899717) {
            return true;
        }
        s.c("WavHeaderReader", "Unsupported form type: " + p11);
        return false;
    }

    public static C10222c b(C3659j c3659j) throws IOException {
        byte[] bArr;
        C8050C c8050c = new C8050C(16);
        long j11 = d(1718449184, c3659j, c8050c).f102126b;
        G10.a.h(j11 >= 16);
        c3659j.d(c8050c.e(), 0, 16, false);
        c8050c.R(0);
        int x11 = c8050c.x();
        int x12 = c8050c.x();
        int w11 = c8050c.w();
        c8050c.w();
        int x13 = c8050c.x();
        int x14 = c8050c.x();
        int i11 = ((int) j11) - 16;
        if (i11 > 0) {
            bArr = new byte[i11];
            c3659j.d(bArr, 0, i11, false);
            if (x11 == 65534 && i11 == 24) {
                C8050C c8050c2 = new C8050C(bArr);
                c8050c2.x();
                int x15 = c8050c2.x();
                if (x15 != 0 && x15 != x14) {
                    throw v.e("validBits ( " + x15 + ")  != bitsPerSample( " + x14 + ") are not supported");
                }
                int w12 = c8050c2.w();
                if ((w12 >> 18) != 0) {
                    throw v.e("invalid channel mask " + w12);
                }
                if (w12 != 0 && Integer.bitCount(w12) != x12) {
                    throw v.e("invalid number of channels (" + Integer.bitCount(w12) + ") in channel mask " + w12);
                }
                x11 = c8050c2.x();
                byte[] bArr2 = new byte[14];
                c8050c2.n(0, 14, bArr2);
                if (!Arrays.equals(bArr2, f102123a) && !Arrays.equals(bArr2, f102124b)) {
                    throw v.e("invalid wav format extension guid");
                }
            }
        } else {
            bArr = N.f74291c;
        }
        byte[] bArr3 = bArr;
        int i12 = x11;
        c3659j.m((int) (c3659j.f() - c3659j.getPosition()), false);
        return new C10222c(i12, x12, w11, x13, x14, bArr3);
    }

    public static long c(C3659j c3659j) throws IOException {
        C8050C c8050c = new C8050C(8);
        a a11 = a.a(c3659j, c8050c);
        if (a11.f102125a != 1685272116) {
            c3659j.e();
            return -1L;
        }
        c3659j.i(8, false);
        c8050c.R(0);
        c3659j.d(c8050c.e(), 0, 8, false);
        long t2 = c8050c.t();
        c3659j.m(((int) a11.f102126b) + 8, false);
        return t2;
    }

    private static a d(int i11, C3659j c3659j, C8050C c8050c) throws IOException {
        a a11 = a.a(c3659j, c8050c);
        while (true) {
            int i12 = a11.f102125a;
            if (i12 == i11) {
                return a11;
            }
            C3261b.f(i12, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j11 = a11.f102126b;
            long j12 = 8 + j11;
            if (j11 % 2 != 0) {
                j12 = 9 + j11;
            }
            if (j12 > 2147483647L) {
                throw v.e("Chunk is too large (~2GB+) to skip; id: " + i12);
            }
            c3659j.m((int) j12, false);
            a11 = a.a(c3659j, c8050c);
        }
    }

    public static Pair e(C3659j c3659j) throws IOException {
        c3659j.e();
        a d11 = d(1684108385, c3659j, new C8050C(8));
        c3659j.m(8, false);
        return Pair.create(Long.valueOf(c3659j.getPosition()), Long.valueOf(d11.f102126b));
    }
}
