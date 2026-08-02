package s6;

import android.content.Context;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f22630b;

    /* renamed from: a, reason: collision with root package name */
    public b f22631a;

    static {
        c cVar = new c();
        cVar.f22631a = null;
        f22630b = cVar;
    }

    public static b a(Context context) {
        b bVar;
        c cVar = f22630b;
        synchronized (cVar) {
            try {
                if (cVar.f22631a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f22631a = new b(context);
                }
                bVar = cVar.f22631a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }
}
