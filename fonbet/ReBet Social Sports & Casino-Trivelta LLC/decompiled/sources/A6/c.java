package A6;

/* loaded from: classes2.dex */
public class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public static c f194a;

    public static synchronized c b() {
        c cVar;
        synchronized (c.class) {
            try {
                if (f194a == null) {
                    f194a = new c();
                }
                cVar = f194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // A6.b
    public void a(a aVar) {
    }
}
