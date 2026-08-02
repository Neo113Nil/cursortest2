package Fj;

/* renamed from: Fj.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1159e implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f3745a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f3746b;

    public C1159e(Gg.e eVar, Gg.e eVar2) {
        this.f3745a = eVar;
        this.f3746b = eVar2;
    }

    public static C1159e a(Gg.e eVar, Gg.e eVar2) {
        return new C1159e(eVar, eVar2);
    }

    public static C1158d c(Ej.j jVar, Ej.n nVar) {
        return new C1158d(jVar, nVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1158d get() {
        return c((Ej.j) this.f3745a.get(), (Ej.n) this.f3746b.get());
    }
}
