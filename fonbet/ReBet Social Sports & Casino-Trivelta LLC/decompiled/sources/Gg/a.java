package Gg;

import javax.inject.Provider;

/* loaded from: classes4.dex */
public final class a implements e, Fg.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3950c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile e f3951a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f3952b = f3950c;

    public a(e eVar) {
        this.f3951a = eVar;
    }

    public static Fg.a b(e eVar) {
        return eVar instanceof Fg.a ? (Fg.a) eVar : new a((e) d.b(eVar));
    }

    public static Fg.a c(Provider provider) {
        return b(f.a(provider));
    }

    public static e d(e eVar) {
        d.b(eVar);
        return eVar instanceof a ? eVar : new a(eVar);
    }

    public static Provider e(Provider provider) {
        return d(f.a(provider));
    }

    private static Object f(Object obj, Object obj2) {
        if (obj == f3950c) {
            return obj2;
        }
        if (obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public final synchronized Object a() {
        Object obj;
        obj = this.f3952b;
        if (obj == f3950c) {
            obj = this.f3951a.get();
            this.f3952b = f(this.f3952b, obj);
            this.f3951a = null;
        }
        return obj;
    }

    @Override // javax.inject.Provider
    public Object get() {
        Object obj = this.f3952b;
        return obj == f3950c ? a() : obj;
    }
}
