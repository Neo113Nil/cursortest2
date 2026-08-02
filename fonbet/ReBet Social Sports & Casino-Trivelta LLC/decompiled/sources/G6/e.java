package G6;

/* loaded from: classes2.dex */
public class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public static e f3901a;

    public static synchronized e b() {
        e eVar;
        synchronized (e.class) {
            try {
                if (f3901a == null) {
                    f3901a = new e();
                }
                eVar = f3901a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    @Override // G6.d
    public void a(c cVar) {
    }
}
