package o8;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l implements a9.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f21128c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f21129a = f21128c;

    /* renamed from: b, reason: collision with root package name */
    public volatile a9.a f21130b;

    public l(a9.a aVar) {
        this.f21130b = aVar;
    }

    @Override // a9.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f21129a;
        Object obj3 = f21128c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f21129a;
                if (obj == obj3) {
                    obj = this.f21130b.get();
                    this.f21129a = obj;
                    this.f21130b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
