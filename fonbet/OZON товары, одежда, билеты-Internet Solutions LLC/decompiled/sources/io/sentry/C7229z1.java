package io.sentry;

import io.sentry.C7209u1;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.z1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7229z1 implements W {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final U f68689a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final U f68690b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C7209u1 f68691c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC7157j f68692d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C7153i f68693e;

    public C7229z1(@NotNull C7209u1 c7209u1, @NotNull C7209u1 c7209u12, @NotNull C7209u1 c7209u13) {
        this((U) c7209u1, (U) c7209u12, c7209u13);
    }

    public static void C(C7229z1 c7229z1, Z z11) {
        z11.c(c7229z1.f68693e.getOptions().getShutdownTimeoutMillis());
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t A(@NotNull Throwable th2, E e11) {
        io.sentry.protocol.t tVar = io.sentry.protocol.t.f68325b;
        boolean isEnabled = isEnabled();
        C7153i c7153i = this.f68693e;
        if (!isEnabled) {
            c7153i.getOptions().getLogger().c(I2.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
        } else if (th2 == null) {
            c7153i.getOptions().getLogger().c(I2.WARNING, "captureException called with null parameter.", new Object[0]);
        } else {
            try {
                C7230z2 c7230z2 = new C7230z2(th2);
                c7153i.b(c7230z2);
                tVar = c7153i.A().g(c7230z2, c7153i, e11);
            } catch (Throwable th3) {
                c7153i.getOptions().getLogger().a(I2.ERROR, "Error while capturing exception: " + th2.getMessage(), th3);
            }
        }
        c7153i.M(tVar);
        return tVar;
    }

    @Override // io.sentry.W
    @NotNull
    public final W B(@NotNull String str) {
        return new C7229z1(this.f68689a.m65clone(), this.f68690b.m65clone(), this.f68691c);
    }

    @Override // io.sentry.W
    public final void a(boolean z11) {
        boolean isEnabled = isEnabled();
        C7153i c7153i = this.f68693e;
        if (!isEnabled) {
            c7153i.getOptions().getLogger().c(I2.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (InterfaceC7166l0 interfaceC7166l0 : c7153i.getOptions().getIntegrations()) {
                if (interfaceC7166l0 instanceof Closeable) {
                    try {
                        ((Closeable) interfaceC7166l0).close();
                    } catch (Throwable th2) {
                        c7153i.getOptions().getLogger().c(I2.WARNING, "Failed to close the integration {}.", interfaceC7166l0, th2);
                    }
                }
            }
            for (InterfaceC7227z interfaceC7227z : c7153i.getOptions().getEventProcessors()) {
                if (interfaceC7227z instanceof Closeable) {
                    try {
                        ((Closeable) interfaceC7227z).close();
                    } catch (Throwable th3) {
                        c7153i.getOptions().getLogger().c(I2.WARNING, "Failed to close the event processor {}.", interfaceC7227z, th3);
                    }
                }
            }
            if (isEnabled()) {
                try {
                    c7153i.e(null).clear();
                } catch (Throwable th4) {
                    c7153i.getOptions().getLogger().a(I2.ERROR, "Error in the 'configureScope' callback.", th4);
                }
            } else {
                c7153i.getOptions().getLogger().c(I2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            EnumC7225y1 enumC7225y1 = EnumC7225y1.ISOLATION;
            if (isEnabled()) {
                try {
                    c7153i.e(enumC7225y1).clear();
                } catch (Throwable th5) {
                    c7153i.getOptions().getLogger().a(I2.ERROR, "Error in the 'configureScope' callback.", th5);
                }
            } else {
                c7153i.getOptions().getLogger().c(I2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            c7153i.getOptions().getBackpressureMonitor().close();
            c7153i.getOptions().getTransactionProfiler().close();
            c7153i.getOptions().getContinuousProfiler().a(true);
            c7153i.getOptions().getCompositePerformanceCollector().close();
            c7153i.getOptions().getConnectionStatusProvider().close();
            Z executorService = c7153i.getOptions().getExecutorService();
            if (z11) {
                try {
                    executorService.submit(new HS.a(2, this, executorService));
                } catch (RejectedExecutionException e11) {
                    c7153i.getOptions().getLogger().a(I2.WARNING, "Failed to submit executor service shutdown task during restart. Shutting down synchronously.", e11);
                    executorService.c(c7153i.getOptions().getShutdownTimeoutMillis());
                }
            } else {
                executorService.c(c7153i.getOptions().getShutdownTimeoutMillis());
            }
            EnumC7225y1 enumC7225y12 = EnumC7225y1.CURRENT;
            if (isEnabled()) {
                try {
                    c7153i.e(enumC7225y12).A().a(z11);
                } catch (Throwable th6) {
                    c7153i.getOptions().getLogger().a(I2.ERROR, "Error in the 'configureScope' callback.", th6);
                }
            } else {
                c7153i.getOptions().getLogger().c(I2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            EnumC7225y1 enumC7225y13 = EnumC7225y1.ISOLATION;
            if (isEnabled()) {
                try {
                    c7153i.e(enumC7225y13).A().a(z11);
                } catch (Throwable th7) {
                    c7153i.getOptions().getLogger().a(I2.ERROR, "Error in the 'configureScope' callback.", th7);
                }
            } else {
                c7153i.getOptions().getLogger().c(I2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            EnumC7225y1 enumC7225y14 = EnumC7225y1.GLOBAL;
            if (!isEnabled()) {
                c7153i.getOptions().getLogger().c(I2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                return;
            }
            try {
                c7153i.e(enumC7225y14).A().a(z11);
            } catch (Throwable th8) {
                c7153i.getOptions().getLogger().a(I2.ERROR, "Error in the 'configureScope' callback.", th8);
            }
        } catch (Throwable th9) {
            c7153i.getOptions().getLogger().a(I2.ERROR, "Error while closing the Scopes.", th9);
        }
    }

    @Override // io.sentry.W
    public final void b(long j11) {
        boolean isEnabled = isEnabled();
        C7153i c7153i = this.f68693e;
        if (!isEnabled) {
            c7153i.getOptions().getLogger().c(I2.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            c7153i.A().b(j11);
        } catch (Throwable th2) {
            c7153i.getOptions().getLogger().a(I2.ERROR, "Error in the 'client.flush'.", th2);
        }
    }

    @Override // io.sentry.W
    public final void c(String str, String str2) {
        boolean isEnabled = isEnabled();
        C7153i c7153i = this.f68693e;
        if (!isEnabled) {
            c7153i.getOptions().getLogger().c(I2.WARNING, "Instance is disabled and this 'setExtra' call is a no-op.", new Object[0]);
        } else if (str != null) {
            c7153i.c(str, str2);
        } else {
            c7153i.getOptions().getLogger().c(I2.WARNING, "setExtra called with null parameter.", new Object[0]);
        }
    }

    @Override // io.sentry.W
    public final void d(io.sentry.protocol.E e11) {
        boolean isEnabled = isEnabled();
        C7153i c7153i = this.f68693e;
        if (isEnabled) {
            c7153i.d(e11);
        } else {
            c7153i.getOptions().getLogger().c(I2.WARNING, "Instance is disabled and this 'setUser' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.W
    public final boolean e() {
        return this.f68693e.A().e();
    }

    @Override // io.sentry.W
    public final void f(@NotNull C7141f c7141f) {
        g(c7141f, new E());
    }

    @Override // io.sentry.W
    public final void g(@NotNull C7141f c7141f, E e11) {
        boolean isEnabled = isEnabled();
        C7153i c7153i = this.f68693e;
        if (isEnabled) {
            c7153i.g(c7141f, e11);
        } else {
            c7153i.getOptions().getLogger().c(I2.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.W
    @NotNull
    public final W2 getOptions() {
        return this.f68693e.getOptions();
    }

    @Override // io.sentry.W
    public final io.sentry.transport.m h() {
        return this.f68693e.A().h();
    }

    @Override // io.sentry.W
    public final InterfaceC7142f0 i() {
        boolean isEnabled = isEnabled();
        C7153i c7153i = this.f68693e;
        if (isEnabled) {
            return c7153i.i();
        }
        c7153i.getOptions().getLogger().c(I2.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.W
    public final boolean isEnabled() {
        return this.f68693e.A().isEnabled();
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t j(@NotNull C7151h1 c7151h1) {
        io.sentry.util.p.b(c7151h1, "profilingContinuousData is required");
        io.sentry.protocol.t tVar = io.sentry.protocol.t.f68325b;
        boolean isEnabled = isEnabled();
        C7153i c7153i = this.f68693e;
        if (!isEnabled) {
            c7153i.getOptions().getLogger().c(I2.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return tVar;
        }
        try {
            return c7153i.A().j(c7151h1);
        } catch (Throwable th2) {
            c7153i.getOptions().getLogger().a(I2.ERROR, "Error while capturing profile chunk with id: " + c7151h1.m(), th2);
            return tVar;
        }
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t k(@NotNull V1 v12, E e11) {
        io.sentry.protocol.t k11;
        io.sentry.protocol.t tVar = io.sentry.protocol.t.f68325b;
        boolean isEnabled = isEnabled();
        C7153i c7153i = this.f68693e;
        if (!isEnabled) {
            c7153i.getOptions().getLogger().c(I2.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return tVar;
        }
        try {
            k11 = c7153i.A().k(v12, e11);
        } catch (Throwable th2) {
            c7153i.getOptions().getLogger().a(I2.ERROR, "Error while capturing envelope.", th2);
        }
        return k11 != null ? k11 : tVar;
    }

    @Override // io.sentry.W
    public final void l() {
        boolean isEnabled = isEnabled();
        C7153i c7153i = this.f68693e;
        if (!isEnabled) {
            c7153i.getOptions().getLogger().c(I2.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        C7209u1.d l11 = c7153i.l();
        if (l11 == null) {
            c7153i.getOptions().getLogger().c(I2.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        if (l11.b() != null) {
            c7153i.A().f(l11.b(), io.sentry.util.h.a(new Ti.c()));
        }
        c7153i.A().f(l11.a(), io.sentry.util.h.a(new bk0.c()));
    }

    @Override // io.sentry.W
    public final void m(@NotNull InterfaceC7217w1 interfaceC7217w1) {
        boolean isEnabled = isEnabled();
        C7153i c7153i = this.f68693e;
        if (!isEnabled) {
            c7153i.getOptions().getLogger().c(I2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            interfaceC7217w1.e(c7153i.e(null));
        } catch (Throwable th2) {
            c7153i.getOptions().getLogger().a(I2.ERROR, "Error in the 'configureScope' callback.", th2);
        }
    }

    @Override // io.sentry.W
    public final void n() {
        boolean isEnabled = isEnabled();
        C7153i c7153i = this.f68693e;
        if (!isEnabled) {
            c7153i.getOptions().getLogger().c(I2.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        h3 n11 = c7153i.n();
        if (n11 != null) {
            c7153i.A().f(n11, io.sentry.util.h.a(new Ti.c()));
        }
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t o(@NotNull X2 x22, E e11) {
        io.sentry.protocol.t tVar = io.sentry.protocol.t.f68325b;
        boolean isEnabled = isEnabled();
        U u11 = this.f68693e;
        if (!isEnabled) {
            u11.getOptions().getLogger().c(I2.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
            return tVar;
        }
        try {
            return u11.A().c(x22, u11, e11);
        } catch (Throwable th2) {
            u11.getOptions().getLogger().a(I2.ERROR, "Error while capturing replay", th2);
            return tVar;
        }
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t q(@NotNull String str, @NotNull I2 i22) {
        io.sentry.protocol.t tVar = io.sentry.protocol.t.f68325b;
        boolean isEnabled = isEnabled();
        U u11 = this.f68693e;
        if (!isEnabled) {
            u11.getOptions().getLogger().c(I2.WARNING, "Instance is disabled and this 'captureMessage' call is a no-op.", new Object[0]);
        } else if (str == null) {
            u11.getOptions().getLogger().c(I2.WARNING, "captureMessage called with null parameter.", new Object[0]);
        } else {
            try {
                Y A11 = u11.A();
                A11.getClass();
                C7230z2 c7230z2 = new C7230z2();
                io.sentry.protocol.m mVar = new io.sentry.protocol.m();
                mVar.f(str);
                c7230z2.B0(mVar);
                c7230z2.z0(i22);
                tVar = A11.g(c7230z2, u11, null);
            } catch (Throwable th2) {
                u11.getOptions().getLogger().a(I2.ERROR, "Error while capturing message: ".concat(str), th2);
            }
        }
        u11.M(tVar);
        return tVar;
    }

    @Override // io.sentry.W
    @NotNull
    public final InterfaceC7142f0 s(@NotNull t3 t3Var, @NotNull u3 u3Var) {
        Double b11;
        InterfaceC7142f0 a11;
        t3Var.f68024i = u3Var.a();
        boolean isEnabled = isEnabled();
        C7153i c7153i = this.f68693e;
        if (!isEnabled) {
            c7153i.getOptions().getLogger().c(I2.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            a11 = Y0.t();
        } else if (io.sentry.util.v.b(t3Var.f68024i, c7153i.getOptions().getIgnoredSpanOrigins())) {
            c7153i.getOptions().getLogger().c(I2.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", t3Var.f68024i);
            a11 = Y0.t();
        } else if (!c7153i.getOptions().getInstrumenter().equals(t3Var.d())) {
            c7153i.getOptions().getLogger().c(I2.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", t3Var.d(), c7153i.getOptions().getInstrumenter());
            a11 = Y0.t();
        } else if (c7153i.getOptions().isTracingEnabled()) {
            C7133d c7133d = t3Var.f68028m;
            if (c7133d == null || (b11 = c7133d.d()) == null) {
                b11 = c7153i.H().b();
            }
            s3 a12 = c7153i.getOptions().getInternalTracesSampler().a(new C7205t1(t3Var, b11));
            t3Var.r(a12);
            InterfaceC7138e0 spanFactory = c7153i.getOptions().getSpanFactory();
            if (a12.e().booleanValue() && c7153i.getOptions().isContinuousProfilingEnabled()) {
                EnumC7159j1 profileLifecycle = c7153i.getOptions().getProfileLifecycle();
                EnumC7159j1 enumC7159j1 = EnumC7159j1.TRACE;
                if (profileLifecycle == enumC7159j1 && t3Var.i().equals(io.sentry.protocol.t.f68325b)) {
                    c7153i.getOptions().getContinuousProfiler().b(enumC7159j1, c7153i.getOptions().getInternalTracesSampler());
                }
            }
            a11 = spanFactory.a(t3Var, this, u3Var, this.f68692d);
            if (a12.e().booleanValue() && a12.b().booleanValue()) {
                InterfaceC7146g0 transactionProfiler = c7153i.getOptions().getTransactionProfiler();
                if (!transactionProfiler.isRunning()) {
                    transactionProfiler.start();
                    transactionProfiler.a(a11);
                } else if (u3Var.k()) {
                    transactionProfiler.a(a11);
                }
            }
        } else {
            c7153i.getOptions().getLogger().c(I2.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            a11 = Y0.t();
        }
        if (u3Var.l()) {
            a11.o();
        }
        return a11;
    }

    @Override // io.sentry.W
    public final void setTag(String str, String str2) {
        boolean isEnabled = isEnabled();
        C7153i c7153i = this.f68693e;
        if (!isEnabled) {
            c7153i.getOptions().getLogger().c(I2.WARNING, "Instance is disabled and this 'setTag' call is a no-op.", new Object[0]);
        } else if (str == null || str2 == null) {
            c7153i.getOptions().getLogger().c(I2.WARNING, "setTag called with null parameter.", new Object[0]);
        } else {
            c7153i.setTag(str, str2);
        }
    }

    @Override // io.sentry.W
    @NotNull
    public final U t() {
        return this.f68689a;
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t v(@NotNull io.sentry.protocol.A a11, q3 q3Var, E e11, C7167l1 c7167l1) {
        io.sentry.protocol.A a12;
        io.sentry.protocol.t tVar = io.sentry.protocol.t.f68325b;
        boolean isEnabled = isEnabled();
        C7153i c7153i = this.f68693e;
        if (!isEnabled) {
            c7153i.getOptions().getLogger().c(I2.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return tVar;
        }
        if (!a11.n0()) {
            c7153i.getOptions().getLogger().c(I2.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", a11.G());
            return tVar;
        }
        Boolean bool = Boolean.TRUE;
        j3 j11 = a11.C().j();
        s3 k11 = j11 == null ? null : j11.k();
        if (!bool.equals(Boolean.valueOf(k11 != null ? k11.e().booleanValue() : false))) {
            c7153i.getOptions().getLogger().c(I2.DEBUG, "Transaction %s was dropped due to sampling decision.", a11.G());
            if (c7153i.getOptions().getBackpressureMonitor().a() > 0) {
                io.sentry.clientreport.h clientReportRecorder = c7153i.getOptions().getClientReportRecorder();
                io.sentry.clientreport.f fVar = io.sentry.clientreport.f.BACKPRESSURE;
                clientReportRecorder.a(fVar, EnumC7161k.Transaction);
                c7153i.getOptions().getClientReportRecorder().b(fVar, EnumC7161k.Span, ((ArrayList) a11.l0()).size() + 1);
                return tVar;
            }
            io.sentry.clientreport.h clientReportRecorder2 = c7153i.getOptions().getClientReportRecorder();
            io.sentry.clientreport.f fVar2 = io.sentry.clientreport.f.SAMPLE_RATE;
            clientReportRecorder2.a(fVar2, EnumC7161k.Transaction);
            c7153i.getOptions().getClientReportRecorder().b(fVar2, EnumC7161k.Span, ((ArrayList) a11.l0()).size() + 1);
            return tVar;
        }
        try {
            a12 = a11;
            try {
                return c7153i.A().d(a12, q3Var, this.f68693e, e11, c7167l1);
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                c7153i.getOptions().getLogger().a(I2.ERROR, "Error while capturing transaction with id: " + a12.G(), th3);
                return tVar;
            }
        } catch (Throwable th4) {
            th = th4;
            a12 = a11;
        }
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t z(@NotNull C7230z2 c7230z2, E e11) {
        io.sentry.protocol.t tVar = io.sentry.protocol.t.f68325b;
        boolean isEnabled = isEnabled();
        C7153i c7153i = this.f68693e;
        if (!isEnabled) {
            c7153i.getOptions().getLogger().c(I2.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return tVar;
        }
        if (c7230z2 == null) {
            c7153i.getOptions().getLogger().c(I2.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return tVar;
        }
        try {
            c7153i.b(c7230z2);
            tVar = c7153i.A().g(c7230z2, c7153i, e11);
            c7153i.M(tVar);
            return tVar;
        } catch (Throwable th2) {
            c7153i.getOptions().getLogger().a(I2.ERROR, "Error while capturing event with id: " + c7230z2.G(), th2);
            return tVar;
        }
    }

    private C7229z1(@NotNull U u11, @NotNull U u12, @NotNull C7209u1 c7209u1) {
        C7153i c7153i = new C7153i(u12, u11, c7209u1);
        this.f68693e = c7153i;
        this.f68689a = u11;
        this.f68690b = u12;
        this.f68691c = c7209u1;
        W2 options = c7153i.getOptions();
        io.sentry.util.p.b(options, "SentryOptions is required.");
        if (options.getDsn() == null || options.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
        }
        this.f68692d = options.getCompositePerformanceCollector();
    }

    @Override // io.sentry.W
    @Deprecated
    @NotNull
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final N m67clone() {
        if (!isEnabled()) {
            this.f68693e.getOptions().getLogger().c(I2.WARNING, "Disabled Scopes cloned.", new Object[0]);
        }
        return new I((C7229z1) B("scopes clone"));
    }
}
