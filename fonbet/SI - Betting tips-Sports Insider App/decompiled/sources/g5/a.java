package g5;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements ff.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f9791c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile b f9792a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f9793b;

    public static ff.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f9793b = f9791c;
        aVar.f9792a = bVar;
        return aVar;
    }

    @Override // ff.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f9793b;
        Object obj3 = f9791c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f9793b;
                if (obj == obj3) {
                    obj = this.f9792a.get();
                    Object obj4 = this.f9793b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f9793b = obj;
                    this.f9792a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
