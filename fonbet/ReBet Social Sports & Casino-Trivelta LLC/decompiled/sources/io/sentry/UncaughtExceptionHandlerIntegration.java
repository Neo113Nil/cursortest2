package io.sentry;

import io.sentry.p4;
import io.sentry.util.C4843a;
import java.io.Closeable;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class UncaughtExceptionHandlerIntegration implements InterfaceC4839u0, Thread.UncaughtExceptionHandler, Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final C4843a f50522f = new C4843a();

    /* renamed from: a, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f50523a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC4740e0 f50524b;

    /* renamed from: c, reason: collision with root package name */
    public F3 f50525c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f50526d;

    /* renamed from: e, reason: collision with root package name */
    public final p4 f50527e;

    public static class a extends io.sentry.hints.d implements io.sentry.hints.m, io.sentry.hints.r {

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference f50528d;

        public a(long j10, ILogger iLogger) {
            super(j10, iLogger);
            this.f50528d = new AtomicReference();
        }

        @Override // io.sentry.hints.f
        public boolean c(io.sentry.protocol.u uVar) {
            io.sentry.protocol.u uVar2 = (io.sentry.protocol.u) this.f50528d.get();
            return uVar2 != null && uVar2.equals(uVar);
        }

        @Override // io.sentry.hints.f
        public void d(io.sentry.protocol.u uVar) {
            this.f50528d.set(uVar);
        }
    }

    public UncaughtExceptionHandlerIntegration() {
        this(p4.a.c());
    }

    public static Throwable d(Thread thread, Throwable th2) {
        io.sentry.protocol.m mVar = new io.sentry.protocol.m();
        mVar.n(Boolean.FALSE);
        mVar.r("UncaughtExceptionHandler");
        return new io.sentry.exception.a(mVar, th2, thread);
    }

    @Override // io.sentry.InterfaceC4839u0
    public final void J(InterfaceC4740e0 interfaceC4740e0, F3 f32) {
        if (this.f50526d) {
            f32.getLogger().c(EnumC4788n3.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f50526d = true;
        this.f50524b = (InterfaceC4740e0) io.sentry.util.w.c(interfaceC4740e0, "Scopes are required");
        F3 f33 = (F3) io.sentry.util.w.c(f32, "SentryOptions is required");
        this.f50525c = f33;
        ILogger logger = f33.getLogger();
        EnumC4788n3 enumC4788n3 = EnumC4788n3.DEBUG;
        logger.c(enumC4788n3, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f50525c.isEnableUncaughtExceptionHandler()));
        if (this.f50525c.isEnableUncaughtExceptionHandler()) {
            InterfaceC4765j0 d10 = f50522f.d();
            try {
                Thread.UncaughtExceptionHandler b10 = this.f50527e.b();
                if (b10 != null) {
                    this.f50525c.getLogger().c(enumC4788n3, "default UncaughtExceptionHandler class='" + b10.getClass().getName() + "'", new Object[0]);
                    if (b10 instanceof UncaughtExceptionHandlerIntegration) {
                        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) b10;
                        if (uncaughtExceptionHandlerIntegration.f50524b == null || interfaceC4740e0.p() != uncaughtExceptionHandlerIntegration.f50524b.p()) {
                            this.f50523a = b10;
                        } else {
                            this.f50523a = uncaughtExceptionHandlerIntegration.f50523a;
                        }
                    } else {
                        this.f50523a = b10;
                    }
                }
                this.f50527e.a(this);
                if (d10 != null) {
                    d10.close();
                }
                this.f50525c.getLogger().c(enumC4788n3, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
                io.sentry.util.n.a("UncaughtExceptionHandler");
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
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC4765j0 d10 = f50522f.d();
        try {
            if (this == this.f50527e.b()) {
                this.f50527e.a(this.f50523a);
                F3 f32 = this.f50525c;
                if (f32 != null) {
                    f32.getLogger().c(EnumC4788n3.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
                }
            } else {
                k(this.f50527e.b());
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

    public final void k(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        r(uncaughtExceptionHandler, new HashSet());
    }

    public final void r(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Set set) {
        if (uncaughtExceptionHandler == null) {
            F3 f32 = this.f50525c;
            if (f32 != null) {
                f32.getLogger().c(EnumC4788n3.DEBUG, "Found no UncaughtExceptionHandler to remove.", new Object[0]);
                return;
            }
            return;
        }
        if (!set.add(uncaughtExceptionHandler)) {
            F3 f33 = this.f50525c;
            if (f33 != null) {
                f33.getLogger().c(EnumC4788n3.WARNING, "Cycle detected in UncaughtExceptionHandler chain while removing handler.", new Object[0]);
                return;
            }
            return;
        }
        if (uncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
            UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandlerIntegration.f50523a;
            if (this != uncaughtExceptionHandler2) {
                r(uncaughtExceptionHandler2, set);
                return;
            }
            uncaughtExceptionHandlerIntegration.f50523a = this.f50523a;
            F3 f34 = this.f50525c;
            if (f34 != null) {
                f34.getLogger().c(EnumC4788n3.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        F3 f32 = this.f50525c;
        if (f32 == null || this.f50524b == null) {
            return;
        }
        f32.getLogger().c(EnumC4788n3.INFO, "Uncaught exception received.", new Object[0]);
        try {
            a aVar = new a(this.f50525c.getFlushTimeoutMillis(), this.f50525c.getLogger());
            C4733c3 c4733c3 = new C4733c3(d(thread, th2));
            c4733c3.C0(EnumC4788n3.FATAL);
            if (this.f50524b.k() == null && c4733c3.G() != null) {
                aVar.d(c4733c3.G());
            }
            J c10 = io.sentry.util.l.c(aVar);
            boolean equals = this.f50524b.v(c4733c3, c10).equals(io.sentry.protocol.u.f52477c);
            io.sentry.hints.h d10 = io.sentry.util.l.d(c10);
            if ((!equals || io.sentry.hints.h.MULTITHREADED_DEDUPLICATION.equals(d10)) && !aVar.g()) {
                this.f50525c.getLogger().c(EnumC4788n3.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", c4733c3.G());
            }
        } catch (Throwable th3) {
            this.f50525c.getLogger().b(EnumC4788n3.ERROR, "Error sending uncaught exception to Sentry.", th3);
        }
        if (this.f50523a != null) {
            this.f50525c.getLogger().c(EnumC4788n3.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.f50523a.uncaughtException(thread, th2);
        } else if (this.f50525c.isPrintUncaughtStackTrace()) {
            th2.printStackTrace();
        }
    }

    public UncaughtExceptionHandlerIntegration(p4 p4Var) {
        this.f50526d = false;
        this.f50527e = p4Var;
    }
}
