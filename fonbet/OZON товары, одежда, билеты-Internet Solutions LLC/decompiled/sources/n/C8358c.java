package n;

import a10.AbstractC4920h;
import android.os.Looper;
import androidx.annotation.NonNull;

/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8358c extends AbstractC4920h {

    /* renamed from: b, reason: collision with root package name */
    private static volatile C8358c f76044b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private static final ExecutorC8356a f76045c = new ExecutorC8356a();

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private static final ExecutorC8357b f76046d = new ExecutorC8357b();

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private C8359d f76047a = new C8359d();

    private C8358c() {
    }

    @NonNull
    public static ExecutorC8357b d() {
        return f76046d;
    }

    @NonNull
    public static C8358c e() {
        if (f76044b != null) {
            return f76044b;
        }
        synchronized (C8358c.class) {
            try {
                if (f76044b == null) {
                    f76044b = new C8358c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f76044b;
    }

    @NonNull
    public static ExecutorC8356a f() {
        return f76045c;
    }

    public final void c(@NonNull Runnable runnable) {
        this.f76047a.d(runnable);
    }

    public final boolean g() {
        this.f76047a.getClass();
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final void h(@NonNull Runnable runnable) {
        this.f76047a.e(runnable);
    }
}
