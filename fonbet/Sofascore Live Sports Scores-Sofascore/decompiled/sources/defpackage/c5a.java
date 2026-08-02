package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class c5a extends x4a implements oma {
    public w8l q;

    public c5a(w8l w8lVar) {
        this.q = w8lVar;
    }

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        int d = this.p.d(m1cVar, m1cVar.getLayoutDirection()) - this.o.d(m1cVar, m1cVar.getLayoutDirection());
        int a = this.p.a(m1cVar) - this.o.a(m1cVar);
        int b = (this.p.b(m1cVar, m1cVar.getLayoutDirection()) - this.o.b(m1cVar, m1cVar.getLayoutDirection())) + d;
        int c = (this.p.c(m1cVar) - this.o.c(m1cVar)) + a;
        qhe J = g1cVar.J(cn3.i(-b, -c, j));
        return m1c.G0(m1cVar, cn3.g(J.a + b, j), cn3.f(J.b + c, j), new b5a(J, d, a, 0));
    }

    @Override // defpackage.x4a
    public final w8l k1(w8l w8lVar) {
        return new jak(w8lVar, this.q);
    }

    @Override // defpackage.x4a
    public final void l1() {
        super.l1();
        y6a.E(this);
    }
}
