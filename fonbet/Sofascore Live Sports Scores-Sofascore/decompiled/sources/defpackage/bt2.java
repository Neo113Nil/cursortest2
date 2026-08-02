package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bt2 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;

    public bt2(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
    }

    public static g0i a(vjj vjjVar, of3 of3Var) {
        if (vjjVar == vjj.b) {
            av8 av8Var = (av8) of3Var;
            av8Var.d0(1539262271);
            g0i I = ufa.I(bwc.d, av8Var);
            av8Var.s(false);
            return I;
        }
        av8 av8Var2 = (av8) of3Var;
        av8Var2.d0(1539355581);
        g0i I2 = ufa.I(bwc.c, av8Var2);
        av8Var2.s(false);
        return I2;
    }

    public static bt2 b(bt2 bt2Var, long j, long j2, long j3, long j4, long j5, long j6, long j7, int i) {
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14 = bt2Var.k;
        long j15 = bt2Var.j;
        long j16 = bt2Var.e;
        long j17 = bt2Var.b;
        long j18 = bt2Var.d;
        long j19 = (i & 16) != 0 ? j16 : j3;
        long j20 = bt2Var.f;
        long j21 = bt2Var.g;
        long j22 = (i & 512) != 0 ? j15 : j6;
        long j23 = (i & 1024) != 0 ? j14 : j7;
        long j24 = bt2Var.l;
        if (j != 16) {
            j8 = j24;
            j9 = j;
        } else {
            j8 = j24;
            j9 = bt2Var.a;
        }
        if (j2 != 16) {
            j10 = j9;
            j11 = j2;
        } else {
            j10 = j9;
            j11 = bt2Var.c;
        }
        if (j19 != 16) {
            j16 = j19;
        }
        long j25 = j4 != 16 ? j4 : bt2Var.h;
        if (j5 != 16) {
            j12 = j11;
            j13 = j5;
        } else {
            j12 = j11;
            j13 = bt2Var.i;
        }
        return new bt2(j10, j17, j12, j18, j16, j20, j21, j25, j13, j22 != 16 ? j22 : j15, j23 != 16 ? j23 : j14, j8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bt2)) {
            return false;
        }
        bt2 bt2Var = (bt2) obj;
        long j = bt2Var.a;
        int i = r13.j;
        return e8k.a(this.a, j) && e8k.a(this.b, bt2Var.b) && e8k.a(this.c, bt2Var.c) && e8k.a(this.d, bt2Var.d) && e8k.a(this.e, bt2Var.e) && e8k.a(this.f, bt2Var.f) && e8k.a(this.g, bt2Var.g) && e8k.a(this.h, bt2Var.h) && e8k.a(this.i, bt2Var.i) && e8k.a(this.j, bt2Var.j) && e8k.a(this.k, bt2Var.k) && e8k.a(this.l, bt2Var.l);
    }

    public final int hashCode() {
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return Long.hashCode(this.l) + ljg.c(ljg.c(ljg.c(ljg.c(ljg.c(ljg.c(ljg.c(ljg.c(ljg.c(ljg.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
