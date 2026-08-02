package Ej;

/* loaded from: classes5.dex */
public final class t implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f3215a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f3216b;

    /* renamed from: c, reason: collision with root package name */
    public final Gg.e f3217c;

    public t(Gg.e eVar, Gg.e eVar2, Gg.e eVar3) {
        this.f3215a = eVar;
        this.f3216b = eVar2;
        this.f3217c = eVar3;
    }

    public static t a(Gg.e eVar, Gg.e eVar2, Gg.e eVar3) {
        return new t(eVar, eVar2, eVar3);
    }

    public static s c(Vj.c cVar, Qj.a aVar, Ij.a aVar2) {
        return new s(cVar, aVar, aVar2);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public s get() {
        return c((Vj.c) this.f3215a.get(), (Qj.a) this.f3216b.get(), (Ij.a) this.f3217c.get());
    }
}
