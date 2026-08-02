package kg;

import ig.p;
import jg.AbstractC7423b;
import mg.m;

/* loaded from: classes10.dex */
final class d extends Lf.a {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7423b f71574b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Lf.a f71575c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ jg.g f71576d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ p f71577e;

    d(AbstractC7423b abstractC7423b, Lf.a aVar, jg.g gVar, p pVar) {
        super(false);
        this.f71574b = abstractC7423b;
        this.f71575c = aVar;
        this.f71576d = gVar;
        this.f71577e = pVar;
    }

    @Override // mg.e
    public final boolean L(mg.h hVar) {
        AbstractC7423b abstractC7423b = this.f71574b;
        return (abstractC7423b == null || !hVar.b()) ? this.f71575c.L(hVar) : abstractC7423b.L(hVar);
    }

    @Override // Lf.a, mg.e
    public final <R> R d(mg.j<R> jVar) {
        return jVar == mg.i.a() ? (R) this.f71576d : jVar == mg.i.g() ? (R) this.f71577e : jVar == mg.i.e() ? (R) this.f71575c.d(jVar) : jVar.a(this);
    }

    @Override // mg.e
    public final long m(mg.h hVar) {
        AbstractC7423b abstractC7423b = this.f71574b;
        return (abstractC7423b == null || !hVar.b()) ? this.f71575c.m(hVar) : abstractC7423b.m(hVar);
    }

    @Override // Lf.a, mg.e
    public final m p(mg.h hVar) {
        AbstractC7423b abstractC7423b = this.f71574b;
        return (abstractC7423b == null || !hVar.b()) ? this.f71575c.p(hVar) : abstractC7423b.p(hVar);
    }
}
