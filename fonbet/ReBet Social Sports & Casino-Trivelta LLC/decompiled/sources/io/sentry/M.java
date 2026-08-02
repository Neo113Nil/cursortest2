package io.sentry;

import io.sentry.util.C4843a;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class M {

    /* renamed from: i, reason: collision with root package name */
    public static volatile M f50448i;

    /* renamed from: a, reason: collision with root package name */
    public final long f50450a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f50451b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f50452c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f50453d;

    /* renamed from: e, reason: collision with root package name */
    public final Callable f50454e;

    /* renamed from: f, reason: collision with root package name */
    public final ExecutorService f50455f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f50446g = TimeUnit.HOURS.toMillis(5);

    /* renamed from: h, reason: collision with root package name */
    public static final long f50447h = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: j, reason: collision with root package name */
    public static final C4843a f50449j = new C4843a();

    public static final class b implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public int f50456a;

        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryHostnameCache-");
            int i10 = this.f50456a;
            this.f50456a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public M() {
        this(f50446g);
    }

    public static /* synthetic */ Void b(M m10) {
        m10.getClass();
        try {
            m10.f50451b = ((InetAddress) m10.f50454e.call()).getCanonicalHostName();
            m10.f50452c = System.currentTimeMillis() + m10.f50450a;
            m10.f50453d.set(false);
            return null;
        } catch (Throwable th2) {
            m10.f50453d.set(false);
            throw th2;
        }
    }

    public static M e() {
        if (f50448i == null) {
            InterfaceC4765j0 d10 = f50449j.d();
            try {
                if (f50448i == null) {
                    f50448i = new M();
                }
                if (d10 != null) {
                    d10.close();
                }
            } catch (Throwable th2) {
                if (d10 != null) {
                    try {
                        d10.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return f50448i;
    }

    public void c() {
        this.f50455f.shutdown();
    }

    public String d() {
        if (this.f50452c < System.currentTimeMillis() && this.f50453d.compareAndSet(false, true)) {
            g();
        }
        return this.f50451b;
    }

    public final void f() {
        this.f50452c = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(1L);
    }

    public final void g() {
        try {
            this.f50455f.submit(new Callable() { // from class: io.sentry.L
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return M.b(M.this);
                }
            }).get(f50447h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            f();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            f();
        }
    }

    public M(long j10) {
        this(j10, new Callable() { // from class: io.sentry.K
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InetAddress localHost;
                localHost = InetAddress.getLocalHost();
                return localHost;
            }
        });
    }

    public M(long j10, Callable callable) {
        this.f50453d = new AtomicBoolean(false);
        this.f50455f = Executors.newSingleThreadExecutor(new b());
        this.f50450a = j10;
        this.f50454e = (Callable) io.sentry.util.w.c(callable, "getLocalhost is required");
        g();
    }
}
