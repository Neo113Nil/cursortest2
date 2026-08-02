package A4;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.res.f;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class a implements ExecutorService, AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public static final long f41b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c, reason: collision with root package name */
    public static volatile int f42c;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f43a;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f44a;

        /* renamed from: b, reason: collision with root package name */
        public int f45b;

        /* renamed from: c, reason: collision with root package name */
        public int f46c;

        /* renamed from: d, reason: collision with root package name */
        public ThreadFactory f47d = new c();

        /* renamed from: e, reason: collision with root package name */
        public e f48e = e.f62d;

        /* renamed from: f, reason: collision with root package name */
        public String f49f;

        /* renamed from: g, reason: collision with root package name */
        public long f50g;

        public b(boolean z10) {
            this.f44a = z10;
        }

        public a a() {
            if (TextUtils.isEmpty(this.f49f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f49f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f45b, this.f46c, this.f50g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f47d, this.f49f, this.f48e, this.f44a));
            if (this.f50g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor);
        }

        public b b(String str) {
            this.f49f = str;
            return this;
        }

        public b c(int i10) {
            this.f45b = i10;
            this.f46c = i10;
            return this;
        }
    }

    public static final class c implements ThreadFactory {

        /* renamed from: A4.a$c$a, reason: collision with other inner class name */
        public class C0004a extends Thread {
            public C0004a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        public c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0004a(runnable);
        }
    }

    public static final class d implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadFactory f52a;

        /* renamed from: b, reason: collision with root package name */
        public final String f53b;

        /* renamed from: c, reason: collision with root package name */
        public final e f54c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f55d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicInteger f56e = new AtomicInteger();

        /* renamed from: A4.a$d$a, reason: collision with other inner class name */
        public class RunnableC0005a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f57a;

            public RunnableC0005a(Runnable runnable) {
                this.f57a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f55d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f57a.run();
                } catch (Throwable th2) {
                    d.this.f54c.a(th2);
                }
            }
        }

        public d(ThreadFactory threadFactory, String str, e eVar, boolean z10) {
            this.f52a = threadFactory;
            this.f53b = str;
            this.f54c = eVar;
            this.f55d = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f52a.newThread(new RunnableC0005a(runnable));
            newThread.setName("glide-" + this.f53b + "-thread-" + this.f56e.getAndIncrement());
            return newThread;
        }
    }

    public a(ExecutorService executorService) {
        this.f43a = executorService;
    }

    public static a A0() {
        return z0().a();
    }

    public static b D0() {
        return new b(false).c(k()).b("source");
    }

    public static b J() {
        return new b(true).c(d()).b("animation");
    }

    public static int d() {
        return k() >= 4 ? 2 : 1;
    }

    public static int k() {
        if (f42c == 0) {
            f42c = Math.min(4, A4.b.a());
        }
        return f42c;
    }

    public static a m1() {
        return D0().a();
    }

    public static a w0() {
        return J().a();
    }

    public static a y1() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f41b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f62d, false)));
    }

    public static b z0() {
        return new b(true).c(1).b("disk-cache");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f43a.awaitTermination(j10, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        f.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f43a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f43a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f43a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f43a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f43a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f43a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f43a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f43a.submit(runnable);
    }

    public String toString() {
        return this.f43a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f43a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f43a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f43a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f43a.submit(callable);
    }

    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f59a = new C0006a();

        /* renamed from: b, reason: collision with root package name */
        public static final e f60b;

        /* renamed from: c, reason: collision with root package name */
        public static final e f61c;

        /* renamed from: d, reason: collision with root package name */
        public static final e f62d;

        public class b implements e {
            @Override // A4.a.e
            public void a(Throwable th2) {
                if (th2 == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
            }
        }

        public class c implements e {
            @Override // A4.a.e
            public void a(Throwable th2) {
                if (th2 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th2);
                }
            }
        }

        static {
            b bVar = new b();
            f60b = bVar;
            f61c = new c();
            f62d = bVar;
        }

        void a(Throwable th2);

        /* renamed from: A4.a$e$a, reason: collision with other inner class name */
        public class C0006a implements e {
            @Override // A4.a.e
            public void a(Throwable th2) {
            }
        }
    }
}
