package defpackage;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fke {
    public static final scc u = new scc(new Object());
    public final mij a;
    public final scc b;
    public final long c;
    public final long d;
    public final int e;
    public final tf6 f;
    public final boolean g;
    public final qsj h;
    public final gtj i;
    public final List j;
    public final scc k;
    public final boolean l;
    public final int m;
    public final int n;
    public final hke o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public fke(mij mijVar, scc sccVar, long j, long j2, int i, tf6 tf6Var, boolean z, qsj qsjVar, gtj gtjVar, List list, scc sccVar2, boolean z2, int i2, int i3, hke hkeVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = mijVar;
        this.b = sccVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = tf6Var;
        this.g = z;
        this.h = qsjVar;
        this.i = gtjVar;
        this.j = list;
        this.k = sccVar2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = hkeVar;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static fke k(gtj gtjVar) {
        gij gijVar = mij.a;
        qsj qsjVar = qsj.d;
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
        hke hkeVar = hke.d;
        scc sccVar = u;
        return new fke(gijVar, sccVar, C.TIME_UNSET, 0L, 1, null, false, qsjVar, gtjVar, vvfVar, sccVar, false, 1, 0, hkeVar, 0L, 0L, 0L, 0L, false);
    }

    public final fke a() {
        return new fke(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final fke b(boolean z) {
        return new fke(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final fke c(scc sccVar) {
        return new fke(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, sccVar, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final fke d(scc sccVar, long j, long j2, long j3, long j4, qsj qsjVar, gtj gtjVar, List list) {
        return new fke(this.a, sccVar, j2, j3, this.e, this.f, this.g, qsjVar, gtjVar, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public final fke e(int i, int i2, boolean z) {
        return new fke(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final fke f(tf6 tf6Var) {
        return new fke(this.a, this.b, this.c, this.d, this.e, tf6Var, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final fke g(hke hkeVar) {
        return new fke(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, hkeVar, this.q, this.r, this.s, this.t, this.p);
    }

    public final fke h(int i) {
        return new fke(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final fke i(boolean z) {
        return new fke(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    public final fke j(mij mijVar) {
        return new fke(mijVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long l() {
        long j;
        long j2;
        if (!m()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return nik.T(nik.h0(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.o.a)));
    }

    public final boolean m() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
