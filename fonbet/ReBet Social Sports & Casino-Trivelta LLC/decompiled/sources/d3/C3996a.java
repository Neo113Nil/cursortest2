package d3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3996a {

    /* renamed from: b, reason: collision with root package name */
    public static final C3996a f44917b = new C3996a();

    /* renamed from: c, reason: collision with root package name */
    public static final int f44918c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f44919d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f44920e;

    /* renamed from: a, reason: collision with root package name */
    public final Executor f44921a = new b();

    /* renamed from: d3.a$b */
    public static class b implements Executor {
        public b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f44918c = availableProcessors;
        f44919d = availableProcessors + 1;
        f44920e = (availableProcessors * 2) + 1;
    }

    public static void a(ThreadPoolExecutor threadPoolExecutor, boolean z10) {
        threadPoolExecutor.allowCoreThreadTimeOut(z10);
    }

    public static ExecutorService b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f44919d, f44920e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    public static Executor c() {
        return f44917b.f44921a;
    }
}
