package io.sentry.transport;

import io.sentry.C7165l;
import io.sentry.C7197r1;
import io.sentry.E;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.U1;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.V1;
import io.sentry.W2;
import io.sentry.transport.b;
import io.sentry.transport.o;
import io.sentry.util.p;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final l f68511a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.cache.g f68512b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final W2 f68513c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final m f68514d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final g f68515e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final d f68516f;

    /* renamed from: g, reason: collision with root package name */
    private volatile Runnable f68517g;

    private static final class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private int f68518a;

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public final Thread newThread(@NotNull Runnable runnable) {
            StringBuilder sb2 = new StringBuilder("SentryAsyncConnection-");
            int i11 = this.f68518a;
            this.f68518a = i11 + 1;
            sb2.append(i11);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.transport.b$b, reason: collision with other inner class name */
    final class RunnableC1120b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final V1 f68519a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final E f68520b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final io.sentry.cache.g f68521c;

        /* renamed from: d, reason: collision with root package name */
        private final o f68522d = new o.a(-1);

        RunnableC1120b(@NotNull V1 v12, @NotNull E e11, @NotNull io.sentry.cache.g gVar) {
            p.b(v12, "Envelope is required.");
            this.f68519a = v12;
            this.f68520b = e11;
            p.b(gVar, "EnvelopeCache is required.");
            this.f68521c = gVar;
        }

        public static /* synthetic */ void a(RunnableC1120b runnableC1120b, o oVar, io.sentry.hints.o oVar2) {
            b.this.f68513c.getLogger().c(I2.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(oVar.b()));
            oVar2.d(oVar.b());
        }

        @NotNull
        private o d() {
            o oVar = this.f68522d;
            V1 v12 = this.f68519a;
            v12.a().d(null);
            io.sentry.cache.g gVar = this.f68521c;
            E e11 = this.f68520b;
            boolean L12 = gVar.L1(v12, e11);
            Object d11 = e11.d("sentry:typeCheckHint");
            boolean isInstance = io.sentry.hints.f.class.isInstance(e11.d("sentry:typeCheckHint"));
            b bVar = b.this;
            if (isInstance && d11 != null) {
                io.sentry.hints.f fVar = (io.sentry.hints.f) d11;
                if (fVar.f(v12.a().a())) {
                    fVar.b();
                    bVar.f68513c.getLogger().c(I2.DEBUG, "Disk flush envelope fired", new Object[0]);
                } else {
                    bVar.f68513c.getLogger().c(I2.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
                }
            }
            if (!bVar.f68515e.isConnected()) {
                Object d12 = e11.d("sentry:typeCheckHint");
                if (io.sentry.hints.l.class.isInstance(e11.d("sentry:typeCheckHint")) && d12 != null) {
                    ((io.sentry.hints.l) d12).e(true);
                    return oVar;
                }
                if (!L12) {
                    io.sentry.util.n.a(io.sentry.hints.l.class, d12, bVar.f68513c.getLogger());
                    bVar.f68513c.getClientReportRecorder().d(io.sentry.clientreport.f.NETWORK_ERROR, v12);
                }
                return oVar;
            }
            V1 e12 = bVar.f68513c.getClientReportRecorder().e(v12);
            try {
                e12.a().d(C7165l.c(Double.valueOf(bVar.f68513c.getDateProvider().now().d() / 1000000.0d).longValue()));
                o d13 = bVar.f68516f.d(e12);
                if (d13.b()) {
                    gVar.M0(v12);
                    return d13;
                }
                String str = "The transport failed to send the envelope with response code " + d13.a();
                bVar.f68513c.getLogger().c(I2.ERROR, str, new Object[0]);
                if (d13.a() >= 400) {
                    gVar.M0(v12);
                    if (d13.a() != 429) {
                        bVar.f68513c.getClientReportRecorder().d(io.sentry.clientreport.f.SEND_ERROR, e12);
                    }
                }
                throw new IllegalStateException(str);
            } catch (IOException e13) {
                Object d14 = e11.d("sentry:typeCheckHint");
                if (io.sentry.hints.l.class.isInstance(e11.d("sentry:typeCheckHint")) && d14 != null) {
                    ((io.sentry.hints.l) d14).e(true);
                } else if (!L12) {
                    io.sentry.util.n.a(io.sentry.hints.l.class, d14, bVar.f68513c.getLogger());
                    bVar.f68513c.getClientReportRecorder().d(io.sentry.clientreport.f.NETWORK_ERROR, e12);
                }
                throw new IllegalStateException("Sending the event failed.", e13);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            E e11 = this.f68520b;
            b bVar = b.this;
            bVar.f68517g = this;
            o oVar = this.f68522d;
            try {
                oVar = d();
                bVar.f68513c.getLogger().c(I2.DEBUG, "Envelope flushed", new Object[0]);
            } catch (Throwable th2) {
                try {
                    bVar.f68513c.getLogger().b(I2.ERROR, th2, "Envelope submission failed", new Object[0]);
                    throw th2;
                } finally {
                    Object d11 = e11.d("sentry:typeCheckHint");
                    if (io.sentry.hints.o.class.isInstance(e11.d("sentry:typeCheckHint")) && d11 != null) {
                        a(this, oVar, (io.sentry.hints.o) d11);
                    }
                    bVar.f68517g = null;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [io.sentry.transport.a] */
    public b(@NotNull W2 w22, @NotNull m mVar, @NotNull g gVar, @NotNull C7197r1 c7197r1) {
        int maxQueueSize = w22.getMaxQueueSize();
        final io.sentry.cache.g envelopeDiskCache = w22.getEnvelopeDiskCache();
        final ILogger logger = w22.getLogger();
        U1 dateProvider = w22.getDateProvider();
        l lVar = new l(maxQueueSize, new a(), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                E e11;
                E e12;
                V1 v12;
                E e13;
                if (runnable instanceof b.RunnableC1120b) {
                    b.RunnableC1120b runnableC1120b = (b.RunnableC1120b) runnable;
                    e11 = runnableC1120b.f68520b;
                    if (!io.sentry.util.h.b(e11, io.sentry.hints.e.class)) {
                        v12 = runnableC1120b.f68519a;
                        e13 = runnableC1120b.f68520b;
                        io.sentry.cache.g.this.L1(v12, e13);
                    }
                    e12 = runnableC1120b.f68520b;
                    Object d11 = e12.d("sentry:typeCheckHint");
                    if (io.sentry.hints.o.class.isInstance(e12.d("sentry:typeCheckHint")) && d11 != null) {
                        ((io.sentry.hints.o) d11).d(false);
                    }
                    Object d12 = e12.d("sentry:typeCheckHint");
                    if (io.sentry.hints.l.class.isInstance(e12.d("sentry:typeCheckHint")) && d12 != null) {
                        ((io.sentry.hints.l) d12).e(true);
                    }
                    logger.c(I2.WARNING, "Envelope rejected", new Object[0]);
                }
            }
        }, logger, dateProvider);
        d dVar = new d(w22, c7197r1, mVar);
        this.f68517g = null;
        this.f68511a = lVar;
        io.sentry.cache.g envelopeDiskCache2 = w22.getEnvelopeDiskCache();
        p.b(envelopeDiskCache2, "envelopeCache is required");
        this.f68512b = envelopeDiskCache2;
        this.f68513c = w22;
        this.f68514d = mVar;
        p.b(gVar, "transportGate is required");
        this.f68515e = gVar;
        this.f68516f = dVar;
    }

    @Override // io.sentry.transport.f
    public final void F(@NotNull V1 v12, @NotNull E e11) throws IOException {
        io.sentry.cache.g gVar;
        boolean z11;
        boolean b11 = io.sentry.util.h.b(e11, io.sentry.hints.e.class);
        W2 w22 = this.f68513c;
        io.sentry.cache.g gVar2 = this.f68512b;
        if (b11) {
            gVar = h.a();
            w22.getLogger().c(I2.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z11 = true;
        } else {
            gVar = gVar2;
            z11 = false;
        }
        V1 k11 = this.f68514d.k(v12, e11);
        if (k11 == null) {
            if (z11) {
                gVar2.M0(v12);
                return;
            }
            return;
        }
        if (UncaughtExceptionHandlerIntegration.a.class.isInstance(e11.d("sentry:typeCheckHint"))) {
            k11 = w22.getClientReportRecorder().e(k11);
        }
        Future<?> submit = this.f68511a.submit(new RunnableC1120b(k11, e11, gVar));
        if (submit != null && submit.isCancelled()) {
            w22.getClientReportRecorder().d(io.sentry.clientreport.f.QUEUE_OVERFLOW, k11);
            return;
        }
        Object d11 = e11.d("sentry:typeCheckHint");
        if (!io.sentry.hints.g.class.isInstance(e11.d("sentry:typeCheckHint")) || d11 == null) {
            return;
        }
        ((io.sentry.hints.g) d11).a();
        w22.getLogger().c(I2.DEBUG, "Envelope enqueued", new Object[0]);
    }

    @Override // io.sentry.transport.f
    public final void a(boolean z11) throws IOException {
        this.f68514d.close();
        this.f68511a.shutdown();
        this.f68513c.getLogger().c(I2.DEBUG, "Shutting down", new Object[0]);
        if (z11) {
            return;
        }
        try {
            long flushTimeoutMillis = this.f68513c.getFlushTimeoutMillis();
            if (this.f68511a.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.f68513c.getLogger().c(I2.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
            this.f68511a.shutdownNow();
            if (this.f68517g != null) {
                this.f68511a.getRejectedExecutionHandler().rejectedExecution(this.f68517g, this.f68511a);
            }
        } catch (InterruptedException unused) {
            this.f68513c.getLogger().c(I2.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.f
    public final void b(long j11) {
        this.f68511a.b(j11);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        a(false);
    }

    @Override // io.sentry.transport.f
    public final boolean e() {
        return (this.f68514d.o() || this.f68511a.a()) ? false : true;
    }

    @Override // io.sentry.transport.f
    @NotNull
    public final m h() {
        return this.f68514d;
    }
}
