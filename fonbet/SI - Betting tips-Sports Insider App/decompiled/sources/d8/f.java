package d8;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f8294c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile g f8295a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f8296b;

    /* JADX WARN: Multi-variable type inference failed */
    public static f b(g gVar) {
        if (gVar instanceof f) {
            return (f) gVar;
        }
        f fVar = new f();
        fVar.f8296b = f8294c;
        fVar.f8295a = gVar;
        return fVar;
    }

    @Override // d8.h
    public final Object a() {
        Object obj;
        Object obj2 = this.f8296b;
        Object obj3 = f8294c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f8296b;
                if (obj == obj3) {
                    obj = this.f8295a.a();
                    Object obj4 = this.f8296b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f8296b = obj;
                    this.f8295a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
