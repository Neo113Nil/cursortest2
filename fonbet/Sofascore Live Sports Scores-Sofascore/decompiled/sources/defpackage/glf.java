package defpackage;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class glf {

    @NotNull
    public static final flf a = new flf(null);
    public static final d7 b;

    static {
        Integer num = fda.b;
        b = (num == null || num.intValue() >= 34) ? new uje() : new pn6();
    }

    public abstract int a(int i);

    public int d() {
        return a(32);
    }

    public int e(int i, int i2) {
        int d;
        int i3;
        int i4;
        if (i2 <= i) {
            ogj.h(d7a.r(Integer.valueOf(i), Integer.valueOf(i2)));
            return 0;
        }
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i4 = a(31 - Integer.numberOfLeadingZeros(i5));
            } else {
                do {
                    d = d() >>> 1;
                    i3 = d % i5;
                } while ((i5 - 1) + (d - i3) < 0);
                i4 = i3;
            }
            return i + i4;
        }
        while (true) {
            int d2 = d();
            if (i <= d2 && d2 < i2) {
                return d2;
            }
        }
    }

    public long g() {
        return (d() << 32) + d();
    }

    public long h(long j, long j2) {
        long g;
        long j3;
        long j4;
        int d;
        if (j2 <= j) {
            ogj.h(d7a.r(Long.valueOf(j), Long.valueOf(j2)));
            return 0L;
        }
        long j5 = j2 - j;
        if (j5 > 0) {
            if (((-j5) & j5) == j5) {
                int i = (int) j5;
                int i2 = (int) (j5 >>> 32);
                if (i != 0) {
                    d = a(31 - Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    d = d();
                } else {
                    j4 = (a(31 - Integer.numberOfLeadingZeros(i2)) << 32) + (d() & 4294967295L);
                }
                j4 = d & 4294967295L;
            } else {
                do {
                    g = g() >>> 1;
                    j3 = g % j5;
                } while ((j5 - 1) + (g - j3) < 0);
                j4 = j3;
            }
            return j + j4;
        }
        while (true) {
            long g2 = g();
            if (j <= g2 && g2 < j2) {
                return g2;
            }
        }
    }

    public long i() {
        return h(0L, 1000L);
    }
}
