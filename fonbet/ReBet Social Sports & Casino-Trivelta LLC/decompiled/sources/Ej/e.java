package Ej;

/* loaded from: classes5.dex */
public final class e implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final a f3141a;

    public e(a aVar) {
        this.f3141a = aVar;
    }

    public static e a(a aVar) {
        return new e(aVar);
    }

    public static Xj.a c(a aVar) {
        return (Xj.a) Gg.d.d(aVar.d());
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Xj.a get() {
        return c(this.f3141a);
    }
}
