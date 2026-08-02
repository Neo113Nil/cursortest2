package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class bml extends eg3 {
    public final a51 k;

    public bml(a51 a51Var) {
        this.k = a51Var;
    }

    @Override // defpackage.a51
    public final lij f() {
        return this.k.f();
    }

    @Override // defpackage.a51
    public final f6c g() {
        return this.k.g();
    }

    @Override // defpackage.a51
    public final boolean h() {
        return this.k.h();
    }

    @Override // defpackage.a51
    public final void k(sn4 sn4Var) {
        this.j = sn4Var;
        this.i = lik.j(null);
        y();
    }

    @Override // defpackage.eg3
    public final rcc r(Object obj, rcc rccVar) {
        return w(rccVar);
    }

    @Override // defpackage.eg3
    public final long s(Object obj, long j) {
        return j;
    }

    @Override // defpackage.eg3
    public final int t(Object obj, int i) {
        return i;
    }

    @Override // defpackage.eg3
    public final void u(Object obj, a51 a51Var, lij lijVar) {
        x(lijVar);
    }

    public abstract void x(lij lijVar);

    public void y() {
        v(null, this.k);
    }

    public rcc w(rcc rccVar) {
        return rccVar;
    }
}
