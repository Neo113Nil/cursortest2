package io.sentry;

import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class H {

    /* renamed from: i, reason: collision with root package name */
    private static volatile H f66631i;

    /* renamed from: a, reason: collision with root package name */
    private final long f66633a;

    /* renamed from: b, reason: collision with root package name */
    private volatile String f66634b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f66635c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f66636d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final F f66637e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ExecutorService f66638f;

    /* renamed from: g, reason: collision with root package name */
    private static final long f66629g = TimeUnit.HOURS.toMillis(5);

    /* renamed from: h, reason: collision with root package name */
    private static final long f66630h = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final io.sentry.util.a f66632j = new io.sentry.util.a();

    private static final class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private int f66639a;

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public final Thread newThread(@NotNull Runnable runnable) {
            StringBuilder sb2 = new StringBuilder("SentryHostnameCache-");
            int i11 = this.f66639a;
            this.f66639a = i11 + 1;
            sb2.append(i11);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    private H() {
        F f7 = new F();
        this.f66636d = new AtomicBoolean(false);
        this.f66638f = Executors.newSingleThreadExecutor(new a());
        this.f66633a = f66629g;
        this.f66637e = f7;
        e();
    }

    public static void a(H h11) {
        h11.getClass();
        try {
            h11.f66637e.getClass();
            h11.f66634b = InetAddress.getLocalHost().getCanonicalHostName();
            h11.f66635c = System.currentTimeMillis() + h11.f66633a;
        } finally {
            h11.f66636d.set(false);
        }
    }

    @NotNull
    public static H d() {
        if (f66631i == null) {
            InterfaceC7097a0 a11 = f66632j.a();
            try {
                if (f66631i == null) {
                    f66631i = new H();
                }
                a11.close();
            } catch (Throwable th2) {
                try {
                    a11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return f66631i;
    }

    private void e() {
        try {
            this.f66638f.submit(new Callable() { // from class: io.sentry.G
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    H.a(H.this);
                    return null;
                }
            }).get(f66630h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f66635c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            this.f66635c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        }
    }

    final void b() {
        this.f66638f.shutdown();
    }

    public final String c() {
        if (this.f66635c < System.currentTimeMillis() && this.f66636d.compareAndSet(false, true)) {
            e();
        }
        return this.f66634b;
    }
}
