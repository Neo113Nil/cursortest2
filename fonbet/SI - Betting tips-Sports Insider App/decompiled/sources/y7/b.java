package y7;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f25689c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile c f25690a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f25691b;

    public static c b(c cVar) {
        if (cVar instanceof b) {
            return cVar;
        }
        b bVar = new b();
        bVar.f25691b = f25689c;
        bVar.f25690a = cVar;
        return bVar;
    }

    @Override // y7.c
    public final Object a() {
        Object obj;
        Object obj2 = this.f25691b;
        Object obj3 = f25689c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f25691b;
                if (obj == obj3) {
                    obj = this.f25690a.a();
                    Object obj4 = this.f25691b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f25691b = obj;
                    this.f25690a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
