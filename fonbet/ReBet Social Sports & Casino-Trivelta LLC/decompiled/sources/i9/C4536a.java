package i9;

import javax.inject.Provider;

/* renamed from: i9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4536a implements Provider {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f48183c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Provider f48184a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f48185b = f48183c;

    public C4536a(Provider provider) {
        this.f48184a = provider;
    }

    public static Provider a(Provider provider) {
        d.b(provider);
        return provider instanceof C4536a ? provider : new C4536a(provider);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == f48183c) {
            return obj2;
        }
        if (obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public Object get() {
        Object obj;
        Object obj2 = this.f48185b;
        Object obj3 = f48183c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f48185b;
                if (obj == obj3) {
                    obj = this.f48184a.get();
                    this.f48185b = b(this.f48185b, obj);
                    this.f48184a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
