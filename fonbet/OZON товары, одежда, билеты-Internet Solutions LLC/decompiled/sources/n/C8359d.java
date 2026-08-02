package n;

import a10.AbstractC4920h;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8359d extends AbstractC4920h {

    /* renamed from: a, reason: collision with root package name */
    private final Object f76048a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f76049b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c, reason: collision with root package name */
    private volatile Handler f76050c;

    /* renamed from: n.d$a */
    final class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f76051a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f76051a.getAndIncrement());
            return thread;
        }
    }

    /* renamed from: n.d$b */
    private static class b {
        @NonNull
        public static Handler a(@NonNull Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    @NonNull
    private static Handler c(@NonNull Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    public final void d(@NonNull Runnable runnable) {
        this.f76049b.execute(runnable);
    }

    public final void e(@NonNull Runnable runnable) {
        if (this.f76050c == null) {
            synchronized (this.f76048a) {
                try {
                    if (this.f76050c == null) {
                        this.f76050c = c(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f76050c.post(runnable);
    }
}
