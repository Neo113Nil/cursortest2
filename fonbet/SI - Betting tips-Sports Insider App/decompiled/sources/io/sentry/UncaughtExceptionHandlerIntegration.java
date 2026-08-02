package io.sentry;

import java.io.Closeable;
import java.lang.Thread;
import java.util.HashSet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class UncaughtExceptionHandlerIntegration implements q1, Thread.UncaughtExceptionHandler, Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static final io.sentry.util.a f15427e = new io.sentry.util.a();

    /* renamed from: a, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f15428a;

    /* renamed from: b, reason: collision with root package name */
    public y3 f15429b;

    /* renamed from: c, reason: collision with root package name */
    public b6 f15430c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15431d = false;

    public final void c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, HashSet hashSet) {
        if (uncaughtExceptionHandler == null) {
            b6 b6Var = this.f15430c;
            if (b6Var != null) {
                b6Var.getLogger().h(b5.DEBUG, "Found no UncaughtExceptionHandler to remove.", new Object[0]);
                return;
            }
            return;
        }
        if (!hashSet.add(uncaughtExceptionHandler)) {
            b6 b6Var2 = this.f15430c;
            if (b6Var2 != null) {
                b6Var2.getLogger().h(b5.WARNING, "Cycle detected in UncaughtExceptionHandler chain while removing handler.", new Object[0]);
                return;
            }
            return;
        }
        if (uncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
            UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandlerIntegration.f15428a;
            if (this != uncaughtExceptionHandler2) {
                c(uncaughtExceptionHandler2, hashSet);
                return;
            }
            uncaughtExceptionHandlerIntegration.f15428a = this.f15428a;
            b6 b6Var3 = this.f15430c;
            if (b6Var3 != null) {
                b6Var3.getLogger().h(b5.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        r a7 = f15427e.a();
        try {
            if (this == Thread.getDefaultUncaughtExceptionHandler()) {
                Thread.setDefaultUncaughtExceptionHandler(this.f15428a);
                b6 b6Var = this.f15430c;
                if (b6Var != null) {
                    b6Var.getLogger().h(b5.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
                }
            } else {
                c(Thread.getDefaultUncaughtExceptionHandler(), new HashSet());
            }
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        io.sentry.protocol.v vVar;
        b6 b6Var = this.f15430c;
        if (b6Var == null || this.f15429b == null) {
            return;
        }
        b6Var.getLogger().h(b5.INFO, "Uncaught exception received.", new Object[0]);
        try {
            x6 x6Var = new x6(this.f15430c.getFlushTimeoutMillis(), this.f15430c.getLogger());
            io.sentry.protocol.m mVar = new io.sentry.protocol.m();
            mVar.f16858d = Boolean.FALSE;
            mVar.f16855a = "UncaughtExceptionHandler";
            t4 t4Var = new t4(new io.sentry.exception.a(mVar, th2, thread, false));
            t4Var.f17096u = b5.FATAL;
            if (this.f15429b.n() == null && (vVar = t4Var.f16455a) != null) {
                x6Var.g(vVar);
            }
            h0 k6 = k2.x.k(x6Var);
            boolean equals = this.f15429b.E(t4Var, k6).equals(io.sentry.protocol.v.f16922b);
            io.sentry.hints.e eVar = (io.sentry.hints.e) k6.c(io.sentry.hints.e.class, "sentry:eventDropReason");
            if ((!equals || io.sentry.hints.e.MULTITHREADED_DEDUPLICATION.equals(eVar)) && !x6Var.d()) {
                this.f15430c.getLogger().h(b5.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", t4Var.f16455a);
            }
        } catch (Throwable th3) {
            this.f15430c.getLogger().e(b5.ERROR, "Error sending uncaught exception to Sentry.", th3);
        }
        if (this.f15428a != null) {
            this.f15430c.getLogger().h(b5.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.f15428a.uncaughtException(thread, th2);
        } else if (this.f15430c.isPrintUncaughtStackTrace()) {
            th2.printStackTrace();
        }
    }

    @Override // io.sentry.q1
    public final void y(b6 b6Var) {
        y3 y3Var = y3.f17255a;
        if (this.f15431d) {
            b6Var.getLogger().h(b5.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f15431d = true;
        this.f15429b = y3Var;
        this.f15430c = b6Var;
        ILogger logger = b6Var.getLogger();
        b5 b5Var = b5.DEBUG;
        logger.h(b5Var, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f15430c.isEnableUncaughtExceptionHandler()));
        if (this.f15430c.isEnableUncaughtExceptionHandler()) {
            r a7 = f15427e.a();
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler != null) {
                    this.f15430c.getLogger().h(b5Var, "default UncaughtExceptionHandler class='" + defaultUncaughtExceptionHandler.getClass().getName() + "'", new Object[0]);
                    if (defaultUncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
                        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) defaultUncaughtExceptionHandler;
                        y3 y3Var2 = uncaughtExceptionHandlerIntegration.f15429b;
                        if (y3Var2 != null) {
                            c1 c1Var = d4.f16306a;
                            y3Var2.getClass();
                            this.f15428a = uncaughtExceptionHandlerIntegration.f15428a;
                        } else {
                            this.f15428a = defaultUncaughtExceptionHandler;
                        }
                    } else {
                        this.f15428a = defaultUncaughtExceptionHandler;
                    }
                }
                Thread.setDefaultUncaughtExceptionHandler(this);
                a7.close();
                this.f15430c.getLogger().h(b5Var, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
                rh.g.a("UncaughtExceptionHandler");
            } catch (Throwable th2) {
                try {
                    a7.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
