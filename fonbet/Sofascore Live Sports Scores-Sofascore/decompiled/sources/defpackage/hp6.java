package defpackage;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhp6;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class hp6 extends q8 {
    public final wi7 e;
    public final do7 f;
    public final Integer g;
    public final fdi h;
    public final jof i;
    public final fdi j;
    public final jof k;
    public final g62 l;
    public final nn2 m;
    public final aeh n;
    public final hof o;
    public final g62 p;
    public final nn2 q;
    public final g62 r;
    public final nn2 s;
    public final g62 t;
    public final nn2 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp6(wi7 wi7Var, fqg fqgVar, Application application) {
        super(application);
        fqgVar.getClass();
        wi7Var.getClass();
        this.e = wi7Var;
        do7 do7Var = (do7) fqgVar.a("USER_COMPETITION_EXTRA");
        this.f = do7Var;
        this.g = (Integer) fqgVar.a("competitionId");
        boolean c = Intrinsics.c((Boolean) fqgVar.a("START_FIXTURE_REVEAL"), Boolean.TRUE);
        fdi a = gdi.a(do7Var);
        this.h = a;
        this.i = un0.u(a);
        fdi a2 = gdi.a(Boolean.FALSE);
        this.j = a2;
        this.k = un0.u(a2);
        int i = 0;
        rq3 rq3Var = null;
        g62 g = ml4.g(0, 7, null);
        this.l = g;
        this.m = f5p.J(g);
        aeh b = beh.b(0, 0, null, 7);
        this.n = b;
        this.o = un0.t(b);
        g62 g2 = ml4.g(0, 7, null);
        this.p = g2;
        this.q = f5p.J(g2);
        g62 g3 = ml4.g(0, 7, null);
        this.r = g3;
        this.s = f5p.J(g3);
        g62 g4 = ml4.g(0, 7, null);
        this.t = g4;
        this.u = f5p.J(g4);
        if (c) {
            xw3.L(un0.z(this), null, null, new gp6(this, rq3Var, i), 3);
        }
    }

    public final void k() {
        xw3.L(un0.z(this), null, null, new gp6(this, null, 2), 3);
    }

    public final void l(anh anhVar) {
        xw3.L(un0.z(this), null, null, new ce4(this, anhVar, (rq3) null, 23), 3);
    }
}
