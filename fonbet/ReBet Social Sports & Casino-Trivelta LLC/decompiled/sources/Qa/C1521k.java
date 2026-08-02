package Qa;

/* renamed from: Qa.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1521k implements o {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f9592c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile o f9593a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f9594b = f9592c;

    public C1521k(o oVar) {
        this.f9593a = oVar;
    }

    public static o b(o oVar) {
        return oVar instanceof C1521k ? oVar : new C1521k(oVar);
    }

    @Override // Qa.o
    public final Object a() {
        Object obj;
        Object obj2 = this.f9594b;
        Object obj3 = f9592c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f9594b;
                if (obj == obj3) {
                    obj = this.f9593a.a();
                    Object obj4 = this.f9594b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f9594b = obj;
                    this.f9593a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
