package Gg;

import javax.inject.Provider;

/* loaded from: classes4.dex */
public final class g implements e {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3956c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile e f3957a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f3958b = f3956c;

    public g(e eVar) {
        this.f3957a = eVar;
    }

    public static e a(e eVar) {
        return !(eVar instanceof g) ? eVar instanceof a ? eVar : new g((e) d.b(eVar)) : eVar;
    }

    public static Provider b(Provider provider) {
        return a(f.a(provider));
    }

    @Override // javax.inject.Provider
    public Object get() {
        Object obj = this.f3958b;
        if (obj != f3956c) {
            return obj;
        }
        e eVar = this.f3957a;
        if (eVar == null) {
            return this.f3958b;
        }
        Object obj2 = eVar.get();
        this.f3958b = obj2;
        this.f3957a = null;
        return obj2;
    }
}
