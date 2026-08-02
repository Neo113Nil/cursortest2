package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class cka implements ph2, al3 {
    public final /* synthetic */ lj2 a;

    public /* synthetic */ cka(lj2 lj2Var) {
        this.a = lj2Var;
    }

    @Override // defpackage.al3
    public void a() {
        p2g p2gVar = w2g.b;
        this.a.resumeWith(Boolean.FALSE);
    }

    @Override // defpackage.ph2
    public void e(zg2 zg2Var, c2g c2gVar) {
        boolean z = c2gVar.a.q;
        lj2 lj2Var = this.a;
        if (z) {
            p2g p2gVar = w2g.b;
            lj2Var.resumeWith(c2gVar.b);
        } else {
            p2g p2gVar2 = w2g.b;
            lj2Var.resumeWith(new u2g(new wi9(c2gVar)));
        }
    }

    @Override // defpackage.ph2
    public void m(zg2 zg2Var, Throwable th) {
        p2g p2gVar = w2g.b;
        this.a.resumeWith(new u2g(th));
    }
}
