package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class eke {
    public static final rcc s = new rcc(new Object());
    public final lij a;
    public final rcc b;
    public final long c;
    public final long d;
    public final int e;
    public final sf6 f;
    public final boolean g;
    public final psj h;
    public final gtj i;
    public final List j;
    public final rcc k;
    public final boolean l;
    public final int m;
    public final gke n;
    public final boolean o;
    public volatile long p;
    public volatile long q;
    public volatile long r;

    public eke(lij lijVar, rcc rccVar, long j, long j2, int i, sf6 sf6Var, boolean z, psj psjVar, gtj gtjVar, List list, rcc rccVar2, boolean z2, int i2, gke gkeVar, long j3, long j4, long j5, boolean z3) {
        this.a = lijVar;
        this.b = rccVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = sf6Var;
        this.g = z;
        this.h = psjVar;
        this.i = gtjVar;
        this.j = list;
        this.k = rccVar2;
        this.l = z2;
        this.m = i2;
        this.n = gkeVar;
        this.p = j3;
        this.q = j4;
        this.r = j5;
        this.o = z3;
    }

    public static eke h(gtj gtjVar) {
        psj psjVar = psj.d;
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
        gke gkeVar = gke.d;
        fij fijVar = lij.a;
        rcc rccVar = s;
        return new eke(fijVar, rccVar, C.TIME_UNSET, 0L, 1, null, false, psjVar, gtjVar, vvfVar, rccVar, false, 0, gkeVar, 0L, 0L, 0L, false);
    }

    public final eke a(rcc rccVar) {
        return new eke(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, rccVar, this.l, this.m, this.n, this.p, this.q, this.r, this.o);
    }

    public final eke b(rcc rccVar, long j, long j2, long j3, long j4, psj psjVar, gtj gtjVar, List list) {
        return new eke(this.a, rccVar, j2, j3, this.e, this.f, this.g, psjVar, gtjVar, list, this.k, this.l, this.m, this.n, this.p, j4, j, this.o);
    }

    public final eke c(int i, boolean z) {
        return new eke(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, this.n, this.p, this.q, this.r, this.o);
    }

    public final eke d(sf6 sf6Var) {
        return new eke(this.a, this.b, this.c, this.d, this.e, sf6Var, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.o);
    }

    public final eke e(gke gkeVar) {
        return new eke(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, gkeVar, this.p, this.q, this.r, this.o);
    }

    public final eke f(int i) {
        return new eke(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.o);
    }

    public final eke g(lij lijVar) {
        return new eke(lijVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.o);
    }
}
