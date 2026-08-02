package defpackage;

import android.app.Application;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class od7 extends q8 {
    public final wi7 e;
    public final String f;
    public final boolean g;
    public final fdi h;
    public final jof i;
    public final fdi j;
    public final jof k;
    public final fdi l;
    public final nd7 m;
    public final fdi n;
    public final fdi o;
    public final fdi p;
    public final fdi q;
    public final fdi r;
    public final fdi s;
    public final zn2 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od7(wi7 wi7Var, Application application) {
        super(application);
        wi7Var.getClass();
        this.e = wi7Var;
        ia0 ia0Var = ia0.q;
        this.f = fc6.e();
        this.g = true;
        rq3 rq3Var = null;
        fdi a = gdi.a(null);
        this.h = a;
        this.i = un0.u(a);
        fdi a2 = gdi.a(null);
        this.j = a2;
        jof u = un0.u(a2);
        this.k = u;
        fdi a3 = gdi.a(null);
        this.l = a3;
        this.m = new nd7(un0.u(a3), 0);
        this.n = gdi.a(null);
        this.o = gdi.a(null);
        this.p = gdi.a(null);
        this.q = gdi.a(null);
        this.r = gdi.a(mei.i);
        this.s = gdi.a(nei.DESCENDING);
        this.t = la8.a(new yf4(new wj0(a3, 3), new wj0(u, 3), new br3(3, rq3Var, 5), 1), new tl(rq3Var, this, 8));
    }

    public final void k() {
        fdi fdiVar;
        Object value;
        fdi fdiVar2;
        Object value2;
        fdi fdiVar3;
        Object value3;
        do {
            fdiVar = this.o;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, null));
        do {
            fdiVar2 = this.p;
            value2 = fdiVar2.getValue();
        } while (!fdiVar2.k(value2, null));
        if (l()) {
            do {
                fdiVar3 = this.q;
                value3 = fdiVar3.getValue();
            } while (!fdiVar3.k(value3, null));
        }
    }

    public boolean l() {
        return this.g;
    }

    public abstract int m();

    public abstract int n();

    public final void o() {
        xw3.L(un0.z(this), null, null, new qa7(this, (rq3) null, 2), 3);
    }
}
