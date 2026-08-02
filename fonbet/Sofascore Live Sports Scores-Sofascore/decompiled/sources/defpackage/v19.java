package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v19 extends ffb {
    public static final eq0 p = new eq0(1);
    public final t19 g;
    public final fn8 h;
    public gfb i;
    public ffb j;
    public gfb k;
    public ffb l;
    public rk3 m;
    public dfb n;
    public boolean o;

    public v19(fn8 fn8Var) {
        super(0);
        t19 t19Var = new t19(this);
        this.g = t19Var;
        this.j = t19Var;
        this.l = t19Var;
        this.h = fn8Var;
    }

    public final ffb A() {
        ffb ffbVar = this.l;
        return ffbVar == this.g ? this.j : ffbVar;
    }

    public final void B() {
        this.h.M(this.m, this.n);
        this.j.z();
        this.j = this.l;
        this.i = this.k;
        this.l = this.g;
        this.k = null;
    }

    public final void C(gfb gfbVar) {
        if (gfbVar == this.k) {
            return;
        }
        this.l.z();
        this.l = this.g;
        this.k = null;
        this.m = rk3.a;
        this.n = p;
        if (gfbVar == this.i) {
            return;
        }
        u19 u19Var = new u19(this);
        ffb b = gfbVar.b(u19Var);
        u19Var.i = b;
        this.l = b;
        this.k = gfbVar;
        if (this.o) {
            return;
        }
        B();
    }

    @Override // defpackage.ffb
    public final boolean c() {
        return A().c();
    }

    @Override // defpackage.ffb
    public final void o(xei xeiVar) {
        A().o(xeiVar);
    }

    @Override // defpackage.ffb
    public final void p(cfb cfbVar) {
        A().p(cfbVar);
    }

    @Override // defpackage.ffb
    public final String toString() {
        en0 I = qea.I(this);
        I.e(A(), "delegate");
        return I.toString();
    }

    @Override // defpackage.ffb
    public final void y() {
        A().y();
    }

    @Override // defpackage.ffb
    public final void z() {
        this.l.z();
        this.j.z();
    }
}
