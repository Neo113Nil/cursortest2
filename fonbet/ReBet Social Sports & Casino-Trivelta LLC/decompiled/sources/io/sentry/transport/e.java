package io.sentry.transport;

import io.sentry.AbstractC4779m;
import io.sentry.C4866x2;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.InterfaceC4861w2;
import io.sentry.J;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.transport.e;
import io.sentry.util.l;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public final v f52718a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.cache.g f52719b;

    /* renamed from: c, reason: collision with root package name */
    public final F3 f52720c;

    /* renamed from: d, reason: collision with root package name */
    public final z f52721d;

    /* renamed from: e, reason: collision with root package name */
    public final q f52722e;

    /* renamed from: f, reason: collision with root package name */
    public final n f52723f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Runnable f52724g;

    public static final class b implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public int f52725a;

        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryAsyncConnection-");
            int i10 = this.f52725a;
            this.f52725a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final C4866x2 f52726a;

        /* renamed from: b, reason: collision with root package name */
        public final J f52727b;

        /* renamed from: c, reason: collision with root package name */
        public final io.sentry.cache.g f52728c;

        /* renamed from: d, reason: collision with root package name */
        public final B f52729d = B.a();

        public c(C4866x2 c4866x2, J j10, io.sentry.cache.g gVar) {
            this.f52726a = (C4866x2) io.sentry.util.w.c(c4866x2, "Envelope is required.");
            this.f52727b = j10;
            this.f52728c = (io.sentry.cache.g) io.sentry.util.w.c(gVar, "EnvelopeCache is required.");
        }

        public static /* synthetic */ void a(c cVar, B b10, io.sentry.hints.q qVar) {
            e.this.f52720c.getLogger().c(EnumC4788n3.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(b10.d()));
            qVar.c(b10.d());
        }

        public static /* synthetic */ void b(c cVar, io.sentry.hints.f fVar) {
            if (!fVar.c(cVar.f52726a.b().a())) {
                e.this.f52720c.getLogger().c(EnumC4788n3.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            } else {
                fVar.e();
                e.this.f52720c.getLogger().c(EnumC4788n3.DEBUG, "Disk flush envelope fired", new Object[0]);
            }
        }

        public static /* synthetic */ void d(c cVar, boolean z10, C4866x2 c4866x2, Object obj, Class cls) {
            if (z10) {
                cVar.getClass();
            } else {
                io.sentry.util.t.a(cls, obj, e.this.f52720c.getLogger());
                e.this.f52720c.getClientReportRecorder().b(io.sentry.clientreport.f.NETWORK_ERROR, c4866x2);
            }
        }

        public static /* synthetic */ void f(c cVar, boolean z10, Object obj, Class cls) {
            if (z10) {
                cVar.getClass();
            } else {
                io.sentry.util.t.a(cls, obj, e.this.f52720c.getLogger());
                e.this.f52720c.getClientReportRecorder().b(io.sentry.clientreport.f.NETWORK_ERROR, cVar.f52726a);
            }
        }

        public final B i() {
            B b10 = this.f52729d;
            this.f52726a.b().d(null);
            final boolean w02 = this.f52728c.w0(this.f52726a, this.f52727b);
            io.sentry.util.l.h(this.f52727b, io.sentry.hints.f.class, new l.a() { // from class: io.sentry.transport.g
                @Override // io.sentry.util.l.a
                public final void accept(Object obj) {
                    e.c.b(e.c.this, (io.sentry.hints.f) obj);
                }
            });
            if (!e.this.f52722e.isConnected()) {
                io.sentry.util.l.i(this.f52727b, io.sentry.hints.l.class, new l.a() { // from class: io.sentry.transport.j
                    @Override // io.sentry.util.l.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.l) obj).d(true);
                    }
                }, new l.b() { // from class: io.sentry.transport.k
                    @Override // io.sentry.util.l.b
                    public final void a(Object obj, Class cls) {
                        e.c.f(e.c.this, w02, obj, cls);
                    }
                });
                return b10;
            }
            final C4866x2 e10 = e.this.f52720c.getClientReportRecorder().e(this.f52726a);
            try {
                e10.b().d(AbstractC4779m.k(e.this.f52720c.getDateProvider().now().f()));
                B h10 = e.this.f52723f.h(e10);
                if (h10.d()) {
                    this.f52728c.d(this.f52726a);
                    return h10;
                }
                String str = "The transport failed to send the envelope with response code " + h10.c();
                e.this.f52720c.getLogger().c(EnumC4788n3.ERROR, str, new Object[0]);
                if (h10.c() >= 400) {
                    this.f52728c.d(this.f52726a);
                    if (h10.c() != 429) {
                        e.this.f52720c.getClientReportRecorder().b(io.sentry.clientreport.f.SEND_ERROR, e10);
                    }
                }
                throw new IllegalStateException(str);
            } catch (IOException e11) {
                io.sentry.util.l.i(this.f52727b, io.sentry.hints.l.class, new l.a() { // from class: io.sentry.transport.h
                    @Override // io.sentry.util.l.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.l) obj).d(true);
                    }
                }, new l.b() { // from class: io.sentry.transport.i
                    @Override // io.sentry.util.l.b
                    public final void a(Object obj, Class cls) {
                        e.c.d(e.c.this, w02, e10, obj, cls);
                    }
                });
                throw new IllegalStateException("Sending the event failed.", e11);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f52724g = this;
            final B b10 = this.f52729d;
            try {
                b10 = i();
                e.this.f52720c.getLogger().c(EnumC4788n3.DEBUG, "Envelope flushed", new Object[0]);
            } finally {
            }
        }
    }

    public e(F3 f32, z zVar, q qVar, I1 i12) {
        this(A0(f32.getMaxQueueSize(), f32.getEnvelopeDiskCache(), f32.getLogger(), f32.getDateProvider()), f32, zVar, qVar, new n(f32, i12, zVar));
    }

    public static v A0(int i10, final io.sentry.cache.g gVar, final ILogger iLogger, InterfaceC4861w2 interfaceC4861w2) {
        return new v(1, i10, new b(), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                e.B(io.sentry.cache.g.this, iLogger, runnable, threadPoolExecutor);
            }
        }, iLogger, interfaceC4861w2);
    }

    public static /* synthetic */ void B(io.sentry.cache.g gVar, ILogger iLogger, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (runnable instanceof c) {
            c cVar = (c) runnable;
            if (!io.sentry.util.l.f(cVar.f52727b, io.sentry.hints.e.class)) {
                gVar.w0(cVar.f52726a, cVar.f52727b);
            }
            D0(cVar.f52727b, true);
            iLogger.c(EnumC4788n3.WARNING, "Envelope rejected", new Object[0]);
        }
    }

    public static void D0(J j10, final boolean z10) {
        io.sentry.util.l.h(j10, io.sentry.hints.q.class, new l.a() { // from class: io.sentry.transport.c
            @Override // io.sentry.util.l.a
            public final void accept(Object obj) {
                ((io.sentry.hints.q) obj).c(false);
            }
        });
        io.sentry.util.l.h(j10, io.sentry.hints.l.class, new l.a() { // from class: io.sentry.transport.d
            @Override // io.sentry.util.l.a
            public final void accept(Object obj) {
                ((io.sentry.hints.l) obj).d(z10);
            }
        });
    }

    public static /* synthetic */ void k(e eVar, io.sentry.hints.g gVar) {
        eVar.getClass();
        gVar.b();
        eVar.f52720c.getLogger().c(EnumC4788n3.DEBUG, "Envelope enqueued", new Object[0]);
    }

    @Override // io.sentry.transport.p
    public void R(C4866x2 c4866x2, J j10) {
        io.sentry.cache.g gVar = this.f52719b;
        boolean z10 = false;
        if (io.sentry.util.l.f(j10, io.sentry.hints.e.class)) {
            gVar = r.a();
            this.f52720c.getLogger().c(EnumC4788n3.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z10 = true;
        }
        C4866x2 w02 = this.f52721d.w0(c4866x2, j10);
        if (w02 == null) {
            if (z10) {
                this.f52719b.d(c4866x2);
                return;
            }
            return;
        }
        if (io.sentry.util.l.f(j10, UncaughtExceptionHandlerIntegration.a.class)) {
            w02 = this.f52720c.getClientReportRecorder().e(w02);
        }
        Future submit = this.f52718a.submit(new c(w02, j10, gVar));
        if (submit == null || !submit.isCancelled()) {
            io.sentry.util.l.h(j10, io.sentry.hints.g.class, new l.a() { // from class: io.sentry.transport.b
                @Override // io.sentry.util.l.a
                public final void accept(Object obj) {
                    e.k(e.this, (io.sentry.hints.g) obj);
                }
            });
        } else {
            this.f52720c.getClientReportRecorder().b(io.sentry.clientreport.f.QUEUE_OVERFLOW, w02);
        }
    }

    @Override // io.sentry.transport.p
    public void a(boolean z10) {
        this.f52721d.close();
        this.f52718a.shutdown();
        this.f52720c.getLogger().c(EnumC4788n3.DEBUG, "Shutting down", new Object[0]);
        if (z10) {
            return;
        }
        try {
            long flushTimeoutMillis = this.f52720c.getFlushTimeoutMillis();
            if (this.f52718a.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.f52720c.getLogger().c(EnumC4788n3.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
            this.f52718a.shutdownNow();
            if (this.f52724g != null) {
                this.f52718a.getRejectedExecutionHandler().rejectedExecution(this.f52724g, this.f52718a);
            }
        } catch (InterruptedException unused) {
            this.f52720c.getLogger().c(EnumC4788n3.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.p
    public void b(long j10) {
        this.f52718a.J(j10);
    }

    @Override // io.sentry.transport.p
    public boolean c() {
        return (this.f52721d.D0() || this.f52718a.d()) ? false : true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a(false);
    }

    @Override // io.sentry.transport.p
    public z e() {
        return this.f52721d;
    }

    public e(v vVar, F3 f32, z zVar, q qVar, n nVar) {
        this.f52724g = null;
        this.f52718a = (v) io.sentry.util.w.c(vVar, "executor is required");
        this.f52719b = (io.sentry.cache.g) io.sentry.util.w.c(f32.getEnvelopeDiskCache(), "envelopeCache is required");
        this.f52720c = (F3) io.sentry.util.w.c(f32, "options is required");
        this.f52721d = (z) io.sentry.util.w.c(zVar, "rateLimiter is required");
        this.f52722e = (q) io.sentry.util.w.c(qVar, "transportGate is required");
        this.f52723f = (n) io.sentry.util.w.c(nVar, "httpConnection is required");
    }
}
