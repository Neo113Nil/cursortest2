package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mw0 extends wtc {
    public kgj o;
    public final /* synthetic */ nw0 p;

    public mw0(nw0 nw0Var) {
        this.p = nw0Var;
    }

    @Override // defpackage.wtc
    public final void c1() {
        nw0 nw0Var = this.p;
        nw0Var.a = this;
        if (nw0Var.b != null) {
            this.o = t6a.G(this, new s1(11, this, nw0Var));
        }
    }

    @Override // defpackage.wtc
    public final void d1() {
        nw0 nw0Var = this.p;
        if (nw0Var.a == this) {
            nw0Var.a = null;
        }
        kgj kgjVar = this.o;
        if (kgjVar != null) {
            kgjVar.b();
        }
        this.o = null;
    }
}
