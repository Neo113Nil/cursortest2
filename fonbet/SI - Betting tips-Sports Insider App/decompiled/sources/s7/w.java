package s7;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f23157f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f23158a;

    /* renamed from: b, reason: collision with root package name */
    public final p f23159b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23160c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23161d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f23162e = null;

    public /* synthetic */ w(String str, Object obj, p pVar) {
        this.f23158a = str;
        this.f23160c = obj;
        this.f23159b = pVar;
    }

    public final Object a(Object obj) {
        synchronized (this.f23161d) {
        }
        if (obj != null) {
            return obj;
        }
        if (r1.f22984k == null) {
            return this.f23160c;
        }
        synchronized (f23157f) {
            try {
                if (md.o.f()) {
                    return this.f23162e == null ? this.f23160c : this.f23162e;
                }
                try {
                    for (w wVar : x.f23173a) {
                        if (md.o.f()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object obj2 = null;
                        try {
                            p pVar = wVar.f23159b;
                            if (pVar != null) {
                                obj2 = pVar.a();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f23157f) {
                            wVar.f23162e = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                p pVar2 = this.f23159b;
                if (pVar2 != null) {
                    try {
                        return pVar2.a();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f23160c;
            } finally {
            }
        }
    }
}
