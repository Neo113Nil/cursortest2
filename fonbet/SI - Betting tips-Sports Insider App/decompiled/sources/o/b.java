package o;

import android.os.Looper;
import f3.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends x {

    /* renamed from: b, reason: collision with root package name */
    public static volatile b f21053b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f21054c = new a(0);

    /* renamed from: a, reason: collision with root package name */
    public final d f21055a = new d();

    public static b K0() {
        if (f21053b != null) {
            return f21053b;
        }
        synchronized (b.class) {
            try {
                if (f21053b == null) {
                    f21053b = new b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f21053b;
    }

    public final boolean L0() {
        this.f21055a.getClass();
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final void M0(Runnable runnable) {
        d dVar = this.f21055a;
        if (dVar.f21059c == null) {
            synchronized (dVar.f21057a) {
                try {
                    if (dVar.f21059c == null) {
                        dVar.f21059c = d.K0(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        dVar.f21059c.post(runnable);
    }
}
