package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class aw1 {
    public final long a;
    public final long b;
    public final long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;

    public aw1(long j, long j2, long j3, long j4, long j5, long j6, int i) {
        switch (i) {
            case 1:
                this.a = j;
                this.b = j2;
                this.d = 0L;
                this.e = j3;
                this.f = j4;
                this.g = j5;
                this.c = j6;
                this.h = b(j2, 0L, j3, j4, j5, j6);
                break;
            default:
                this.a = j;
                this.b = j2;
                this.d = 0L;
                this.e = j3;
                this.f = j4;
                this.g = j5;
                this.c = j6;
                this.h = a(j2, 0L, j3, j4, j5, j6);
                break;
        }
    }

    public static long a(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || j2 + 1 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return lik.i(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
    }

    public static long b(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || j2 + 1 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return nik.k(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
    }
}
