package io.sentry;

import java.io.Closeable;
import java.lang.Thread;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class UncaughtExceptionHandlerIntegration implements InterfaceC7166l0, Thread.UncaughtExceptionHandler, Closeable {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final io.sentry.util.a f66745f = new io.sentry.util.a();

    /* renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f66746a;

    /* renamed from: b, reason: collision with root package name */
    private A1 f66747b;

    /* renamed from: c, reason: collision with root package name */
    private W2 f66748c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f66749d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final v3 f66750e;

    public static class a extends io.sentry.hints.d implements io.sentry.hints.m, io.sentry.hints.p {

        /* renamed from: d, reason: collision with root package name */
        private final AtomicReference<io.sentry.protocol.t> f66751d;

        public a(long j11, @NotNull ILogger iLogger) {
            super(j11, iLogger);
            this.f66751d = new AtomicReference<>();
        }

        @Override // io.sentry.hints.f
        public final boolean f(io.sentry.protocol.t tVar) {
            io.sentry.protocol.t tVar2 = this.f66751d.get();
            return tVar2 != null && tVar2.equals(tVar);
        }

        @Override // io.sentry.hints.f
        public final void g(@NotNull io.sentry.protocol.t tVar) {
            this.f66751d.set(tVar);
        }
    }

    public UncaughtExceptionHandlerIntegration() {
        v3 a11 = v3.a();
        this.f66749d = false;
        this.f66750e = a11;
    }

    private void c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, @NotNull HashSet hashSet) {
        if (uncaughtExceptionHandler == null) {
            W2 w22 = this.f66748c;
            if (w22 != null) {
                w22.getLogger().c(I2.DEBUG, "Found no UncaughtExceptionHandler to remove.", new Object[0]);
                return;
            }
            return;
        }
        if (!hashSet.add(uncaughtExceptionHandler)) {
            W2 w23 = this.f66748c;
            if (w23 != null) {
                w23.getLogger().c(I2.WARNING, "Cycle detected in UncaughtExceptionHandler chain while removing handler.", new Object[0]);
                return;
            }
            return;
        }
        if (uncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
            UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandlerIntegration.f66746a;
            if (this != uncaughtExceptionHandler2) {
                c(uncaughtExceptionHandler2, hashSet);
                return;
            }
            uncaughtExceptionHandlerIntegration.f66746a = this.f66746a;
            W2 w24 = this.f66748c;
            if (w24 != null) {
                w24.getLogger().c(I2.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v3 v3Var = this.f66750e;
        InterfaceC7097a0 a11 = f66745f.a();
        try {
            v3Var.getClass();
            if (this == Thread.getDefaultUncaughtExceptionHandler()) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f66746a;
                v3Var.getClass();
                Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
                W2 w22 = this.f66748c;
                if (w22 != null) {
                    w22.getLogger().c(I2.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
                }
            } else {
                v3Var.getClass();
                c(Thread.getDefaultUncaughtExceptionHandler(), new HashSet());
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

    @Override // io.sentry.InterfaceC7166l0
    public final void d(@NotNull A1 a12, @NotNull W2 w22) {
        v3 v3Var = this.f66750e;
        if (this.f66749d) {
            w22.getLogger().c(I2.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f66749d = true;
        this.f66747b = a12;
        this.f66748c = w22;
        ILogger logger = w22.getLogger();
        I2 i22 = I2.DEBUG;
        logger.c(i22, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f66748c.isEnableUncaughtExceptionHandler()));
        if (this.f66748c.isEnableUncaughtExceptionHandler()) {
            InterfaceC7097a0 a11 = f66745f.a();
            try {
                v3Var.getClass();
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler != null) {
                    this.f66748c.getLogger().c(i22, "default UncaughtExceptionHandler class='" + defaultUncaughtExceptionHandler.getClass().getName() + "'", new Object[0]);
                    if (defaultUncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
                        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) defaultUncaughtExceptionHandler;
                        if (uncaughtExceptionHandlerIntegration.f66747b != null) {
                            C7209u1 e11 = K1.e();
                            uncaughtExceptionHandlerIntegration.f66747b.getClass();
                            if (e11 == K1.e()) {
                                this.f66746a = uncaughtExceptionHandlerIntegration.f66746a;
                            }
                        }
                        this.f66746a = defaultUncaughtExceptionHandler;
                    } else {
                        this.f66746a = defaultUncaughtExceptionHandler;
                    }
                }
                v3Var.getClass();
                Thread.setDefaultUncaughtExceptionHandler(this);
                a11.close();
                this.f66748c.getLogger().c(i22, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
                io.sentry.util.j.a("UncaughtExceptionHandler");
            } catch (Throwable th2) {
                try {
                    a11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        W2 w22 = this.f66748c;
        if (w22 == null || this.f66747b == null) {
            return;
        }
        w22.getLogger().c(I2.INFO, "Uncaught exception received.", new Object[0]);
        try {
            a aVar = new a(this.f66748c.getFlushTimeoutMillis(), this.f66748c.getLogger());
            io.sentry.protocol.l lVar = new io.sentry.protocol.l();
            lVar.n();
            lVar.r("UncaughtExceptionHandler");
            C7230z2 c7230z2 = new C7230z2(new io.sentry.exception.a(lVar, th2, thread));
            c7230z2.z0(I2.FATAL);
            if (this.f66747b.i() == null && c7230z2.G() != null) {
                aVar.g(c7230z2.G());
            }
            E a11 = io.sentry.util.h.a(aVar);
            boolean equals = this.f66747b.z(c7230z2, a11).equals(io.sentry.protocol.t.f68325b);
            io.sentry.hints.h hVar = (io.sentry.hints.h) a11.e(io.sentry.hints.h.class, "sentry:eventDropReason");
            if ((!equals || io.sentry.hints.h.MULTITHREADED_DEDUPLICATION.equals(hVar)) && !aVar.h()) {
                this.f66748c.getLogger().c(I2.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", c7230z2.G());
            }
        } catch (Throwable th3) {
            this.f66748c.getLogger().a(I2.ERROR, "Error sending uncaught exception to Sentry.", th3);
        }
        if (this.f66746a != null) {
            this.f66748c.getLogger().c(I2.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.f66746a.uncaughtException(thread, th2);
        } else if (this.f66748c.isPrintUncaughtStackTrace()) {
            th2.printStackTrace();
        }
    }
}
