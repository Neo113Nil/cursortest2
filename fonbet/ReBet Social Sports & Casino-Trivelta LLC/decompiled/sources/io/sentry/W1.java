package io.sentry;

import io.sentry.L1;
import java.io.Closeable;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes3.dex */
public final class W1 implements InterfaceC4740e0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4730c0 f50549a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4730c0 f50550b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4730c0 f50551c;

    /* renamed from: d, reason: collision with root package name */
    public final W1 f50552d;

    /* renamed from: e, reason: collision with root package name */
    public final String f50553e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC4764j f50554f;

    /* renamed from: g, reason: collision with root package name */
    public final C4759i f50555g;

    /* renamed from: h, reason: collision with root package name */
    public final io.sentry.logger.b f50556h;

    /* renamed from: i, reason: collision with root package name */
    public final io.sentry.metrics.b f50557i;

    /* renamed from: j, reason: collision with root package name */
    public final V f50558j;

    public W1(InterfaceC4730c0 interfaceC4730c0, InterfaceC4730c0 interfaceC4730c02, InterfaceC4730c0 interfaceC4730c03, String str) {
        this(interfaceC4730c0, interfaceC4730c02, interfaceC4730c03, null, str);
    }

    public static void R(F3 f32) {
        io.sentry.util.w.c(f32, "SentryOptions is required.");
        if (f32.getDsn() == null || f32.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
        }
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u A(io.sentry.protocol.B b10, j4 j4Var, J j10, C1 c12) {
        io.sentry.protocol.B b11;
        io.sentry.util.w.c(b10, "transaction is required");
        io.sentry.protocol.u uVar = io.sentry.protocol.u.f52477c;
        if (!isEnabled()) {
            i().getLogger().c(EnumC4788n3.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
        } else if (!b10.q0()) {
            i().getLogger().c(EnumC4788n3.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", b10.G());
        } else if (Boolean.TRUE.equals(Boolean.valueOf(b10.r0()))) {
            try {
                b11 = b10;
                try {
                    return N().g(b11, j4Var, O(), j10, c12);
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    i().getLogger().b(EnumC4788n3.ERROR, "Error while capturing transaction with id: " + b11.G(), th3);
                    return uVar;
                }
            } catch (Throwable th4) {
                th = th4;
                b11 = b10;
            }
        } else {
            i().getLogger().c(EnumC4788n3.DEBUG, "Transaction %s was dropped due to sampling decision.", b10.G());
            if (i().getBackpressureMonitor().a() > 0) {
                io.sentry.clientreport.h clientReportRecorder = i().getClientReportRecorder();
                io.sentry.clientreport.f fVar = io.sentry.clientreport.f.BACKPRESSURE;
                clientReportRecorder.a(fVar, EnumC4774l.Transaction);
                i().getClientReportRecorder().c(fVar, EnumC4774l.Span, b10.o0().size() + 1);
            } else {
                io.sentry.clientreport.h clientReportRecorder2 = i().getClientReportRecorder();
                io.sentry.clientreport.f fVar2 = io.sentry.clientreport.f.SAMPLE_RATE;
                clientReportRecorder2.a(fVar2, EnumC4774l.Transaction);
                i().getClientReportRecorder().c(fVar2, EnumC4774l.Span, b10.o0().size() + 1);
            }
        }
        return uVar;
    }

    @Override // io.sentry.InterfaceC4740e0
    public InterfaceC4740e0 B(String str) {
        return new W1(this.f50549a.m142clone(), this.f50550b.m142clone(), this.f50551c, this, str);
    }

    public final void J(C4733c3 c4733c3) {
        O().T(c4733c3);
    }

    public final InterfaceC4730c0 K(InterfaceC4730c0 interfaceC4730c0, N1 n12) {
        if (n12 != null) {
            try {
                InterfaceC4730c0 m142clone = interfaceC4730c0.m142clone();
                n12.a(m142clone);
                return m142clone;
            } catch (Throwable th2) {
                i().getLogger().b(EnumC4788n3.ERROR, "Error in the 'ScopeCallback' callback.", th2);
            }
        }
        return interfaceC4730c0;
    }

    public final io.sentry.protocol.u L(C4733c3 c4733c3, J j10, N1 n12) {
        io.sentry.protocol.u uVar = io.sentry.protocol.u.f52477c;
        if (!isEnabled()) {
            i().getLogger().c(EnumC4788n3.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return uVar;
        }
        if (c4733c3 == null) {
            i().getLogger().c(EnumC4788n3.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return uVar;
        }
        try {
            J(c4733c3);
            uVar = N().m(c4733c3, K(O(), n12), j10);
            Q(uVar);
            return uVar;
        } catch (Throwable th2) {
            i().getLogger().b(EnumC4788n3.ERROR, "Error while capturing event with id: " + c4733c3.G(), th2);
            return uVar;
        }
    }

    public final InterfaceC4790o0 M(m4 m4Var, o4 o4Var) {
        InterfaceC4790o0 a10;
        io.sentry.util.w.c(m4Var, "transactionContext is required");
        m4Var.v(o4Var.a());
        if (!isEnabled()) {
            i().getLogger().c(EnumC4788n3.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            a10 = C4781m1.v();
        } else if (io.sentry.util.C.b(i().getIgnoredSpanOrigins(), m4Var.h())) {
            i().getLogger().c(EnumC4788n3.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", m4Var.h());
            a10 = C4781m1.v();
        } else if (!i().getInstrumenter().equals(m4Var.f())) {
            i().getLogger().c(EnumC4788n3.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", m4Var.f(), i().getInstrumenter());
            a10 = C4781m1.v();
        } else if (i().isTracingEnabled()) {
            Double P10 = P(m4Var);
            o4Var.k();
            l4 a11 = i().getInternalTracesSampler().a(new K1(m4Var, null, P10, null));
            m4Var.w(a11);
            InterfaceC4785n0 n10 = o4Var.n();
            if (n10 == null) {
                n10 = i().getSpanFactory();
            }
            if (a11.e().booleanValue() && i().isContinuousProfilingEnabled()) {
                A1 profileLifecycle = i().getProfileLifecycle();
                A1 a12 = A1.TRACE;
                if (profileLifecycle == a12 && m4Var.k().equals(io.sentry.protocol.u.f52477c)) {
                    i().getContinuousProfiler().b(a12, i().getInternalTracesSampler());
                }
            }
            a10 = n10.a(m4Var, this, o4Var, this.f50554f);
            if (a11.e().booleanValue() && a11.b().booleanValue()) {
                InterfaceC4795p0 transactionProfiler = i().getTransactionProfiler();
                if (!transactionProfiler.isRunning()) {
                    transactionProfiler.start();
                    transactionProfiler.a(a10);
                } else if (o4Var.p()) {
                    transactionProfiler.a(a10);
                }
            }
        } else {
            i().getLogger().c(EnumC4788n3.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            a10 = C4781m1.v();
        }
        if (o4Var.q()) {
            a10.makeCurrent();
        }
        return a10;
    }

    public InterfaceC4755h0 N() {
        return O().Q();
    }

    public InterfaceC4730c0 O() {
        return this.f50555g;
    }

    public final Double P(m4 m4Var) {
        Double o10;
        C4734d b10 = m4Var.b();
        return (b10 == null || (o10 = b10.o()) == null) ? O().O().e() : o10;
    }

    public final void Q(io.sentry.protocol.u uVar) {
        O().X(uVar);
    }

    @Override // io.sentry.InterfaceC4740e0
    public void a(final boolean z10) {
        if (!isEnabled()) {
            i().getLogger().c(EnumC4788n3.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (InterfaceC4839u0 interfaceC4839u0 : i().getIntegrations()) {
                if (interfaceC4839u0 instanceof Closeable) {
                    try {
                        ((Closeable) interfaceC4839u0).close();
                    } catch (Throwable th2) {
                        i().getLogger().c(EnumC4788n3.WARNING, "Failed to close the integration {}.", interfaceC4839u0, th2);
                    }
                }
            }
            for (D d10 : i().getEventProcessors()) {
                if (d10 instanceof Closeable) {
                    try {
                        ((Closeable) d10).close();
                    } catch (Throwable th3) {
                        i().getLogger().c(EnumC4788n3.WARNING, "Failed to close the event processor {}.", d10, th3);
                    }
                }
            }
            l(new N1() { // from class: io.sentry.Q1
                @Override // io.sentry.N1
                public final void a(InterfaceC4730c0 interfaceC4730c0) {
                    interfaceC4730c0.clear();
                }
            });
            n(P1.ISOLATION, new N1() { // from class: io.sentry.R1
                @Override // io.sentry.N1
                public final void a(InterfaceC4730c0 interfaceC4730c0) {
                    interfaceC4730c0.clear();
                }
            });
            i().getBackpressureMonitor().close();
            i().getTransactionProfiler().close();
            i().getContinuousProfiler().a(true);
            i().getCompositePerformanceCollector().close();
            i().getConnectionStatusProvider().close();
            final InterfaceC4760i0 executorService = i().getExecutorService();
            if (z10) {
                try {
                    executorService.submit(new Runnable() { // from class: io.sentry.S1
                        @Override // java.lang.Runnable
                        public final void run() {
                            executorService.a(W1.this.i().getShutdownTimeoutMillis());
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    i().getLogger().b(EnumC4788n3.WARNING, "Failed to submit executor service shutdown task during restart. Shutting down synchronously.", e10);
                    executorService.a(i().getShutdownTimeoutMillis());
                }
            } else {
                executorService.a(i().getShutdownTimeoutMillis());
            }
            n(P1.CURRENT, new N1() { // from class: io.sentry.T1
                @Override // io.sentry.N1
                public final void a(InterfaceC4730c0 interfaceC4730c0) {
                    interfaceC4730c0.Q().a(z10);
                }
            });
            n(P1.ISOLATION, new N1() { // from class: io.sentry.U1
                @Override // io.sentry.N1
                public final void a(InterfaceC4730c0 interfaceC4730c0) {
                    interfaceC4730c0.Q().a(z10);
                }
            });
            n(P1.GLOBAL, new N1() { // from class: io.sentry.V1
                @Override // io.sentry.N1
                public final void a(InterfaceC4730c0 interfaceC4730c0) {
                    interfaceC4730c0.Q().a(z10);
                }
            });
        } catch (Throwable th4) {
            i().getLogger().b(EnumC4788n3.ERROR, "Error while closing the Scopes.", th4);
        }
    }

    @Override // io.sentry.InterfaceC4740e0
    public void b(long j10) {
        if (!isEnabled()) {
            i().getLogger().c(EnumC4788n3.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            N().b(j10);
        } catch (Throwable th2) {
            i().getLogger().b(EnumC4788n3.ERROR, "Error in the 'client.flush'.", th2);
        }
    }

    @Override // io.sentry.InterfaceC4740e0
    public boolean c() {
        return N().c();
    }

    @Override // io.sentry.InterfaceC4740e0
    public void d(C4744f c4744f) {
        g(c4744f, new J());
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.transport.z e() {
        return N().e();
    }

    @Override // io.sentry.InterfaceC4740e0
    public void endSession() {
        if (!isEnabled()) {
            i().getLogger().c(EnumC4788n3.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        V3 endSession = O().endSession();
        if (endSession != null) {
            N().h(endSession, io.sentry.util.l.c(new io.sentry.hints.n()));
        }
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u f(C4866x2 c4866x2, J j10) {
        io.sentry.util.w.c(c4866x2, "SentryEnvelope is required.");
        io.sentry.protocol.u uVar = io.sentry.protocol.u.f52477c;
        if (isEnabled()) {
            try {
                io.sentry.protocol.u f10 = N().f(c4866x2, j10);
                if (f10 != null) {
                    return f10;
                }
            } catch (Throwable th2) {
                i().getLogger().b(EnumC4788n3.ERROR, "Error while capturing envelope.", th2);
            }
        } else {
            i().getLogger().c(EnumC4788n3.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
        }
        return uVar;
    }

    @Override // io.sentry.InterfaceC4740e0
    public void g(C4744f c4744f, J j10) {
        if (!isEnabled()) {
            i().getLogger().c(EnumC4788n3.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (c4744f == null) {
            i().getLogger().c(EnumC4788n3.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            O().g(c4744f, j10);
        }
    }

    @Override // io.sentry.InterfaceC4740e0
    public void h(Throwable th2, InterfaceC4780m0 interfaceC4780m0, String str) {
        O().h(th2, interfaceC4780m0, str);
    }

    @Override // io.sentry.InterfaceC4740e0
    public F3 i() {
        return this.f50555g.i();
    }

    @Override // io.sentry.InterfaceC4740e0
    public boolean isEnabled() {
        return N().isEnabled();
    }

    @Override // io.sentry.InterfaceC4740e0
    public InterfaceC4790o0 k() {
        if (isEnabled()) {
            return O().k();
        }
        i().getLogger().c(EnumC4788n3.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.InterfaceC4740e0
    public void n(P1 p12, N1 n12) {
        if (!isEnabled()) {
            i().getLogger().c(EnumC4788n3.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            n12.a(this.f50555g.n(p12));
        } catch (Throwable th2) {
            i().getLogger().b(EnumC4788n3.ERROR, "Error in the 'configureScope' callback.", th2);
        }
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u o(G3 g32, J j10) {
        io.sentry.protocol.u uVar = io.sentry.protocol.u.f52477c;
        if (isEnabled()) {
            try {
                return N().d(g32, O(), j10);
            } catch (Throwable th2) {
                i().getLogger().b(EnumC4788n3.ERROR, "Error while capturing replay", th2);
            }
        } else {
            i().getLogger().c(EnumC4788n3.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
        }
        return uVar;
    }

    @Override // io.sentry.InterfaceC4740e0
    public InterfaceC4730c0 p() {
        return this.f50551c;
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u q(io.sentry.protocol.i iVar, J j10, N1 n12) {
        io.sentry.protocol.u uVar = io.sentry.protocol.u.f52477c;
        if (!isEnabled()) {
            i().getLogger().c(EnumC4788n3.WARNING, "Instance is disabled and this 'captureFeedback' call is a no-op.", new Object[0]);
        } else if (iVar.g().isEmpty()) {
            i().getLogger().c(EnumC4788n3.WARNING, "captureFeedback called with empty message.", new Object[0]);
        } else {
            try {
                return N().i(iVar, j10, K(O(), n12));
            } catch (Throwable th2) {
                i().getLogger().b(EnumC4788n3.ERROR, "Error while capturing feedback: " + iVar.g(), th2);
            }
        }
        return uVar;
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u r(C4870y1 c4870y1) {
        io.sentry.util.w.c(c4870y1, "profilingContinuousData is required");
        io.sentry.protocol.u uVar = io.sentry.protocol.u.f52477c;
        if (isEnabled()) {
            try {
                return N().l(c4870y1, y());
            } catch (Throwable th2) {
                i().getLogger().b(EnumC4788n3.ERROR, "Error while capturing profile chunk with id: " + c4870y1.m(), th2);
            }
        } else {
            i().getLogger().c(EnumC4788n3.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
        }
        return uVar;
    }

    @Override // io.sentry.InterfaceC4740e0
    public void t() {
        if (!isEnabled()) {
            i().getLogger().c(EnumC4788n3.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        L1.d t10 = O().t();
        if (t10 == null) {
            i().getLogger().c(EnumC4788n3.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        if (t10.b() != null) {
            N().h(t10.b(), io.sentry.util.l.c(new io.sentry.hints.n()));
        }
        N().h(t10.a(), io.sentry.util.l.c(new io.sentry.hints.p()));
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u v(C4733c3 c4733c3, J j10) {
        return L(c4733c3, j10, null);
    }

    @Override // io.sentry.InterfaceC4740e0
    public InterfaceC4790o0 w(m4 m4Var, o4 o4Var) {
        return M(m4Var, o4Var);
    }

    @Override // io.sentry.InterfaceC4740e0
    public Boolean x() {
        return C4841u2.a().b(i().getCacheDirPath(), !i().isEnableAutoSessionTracking());
    }

    @Override // io.sentry.InterfaceC4740e0
    public InterfaceC4730c0 y() {
        return this.f50549a;
    }

    @Override // io.sentry.InterfaceC4740e0
    public V z() {
        return this.f50558j;
    }

    public W1(InterfaceC4730c0 interfaceC4730c0, InterfaceC4730c0 interfaceC4730c02, InterfaceC4730c0 interfaceC4730c03, W1 w12, String str) {
        this.f50555g = new C4759i(interfaceC4730c03, interfaceC4730c02, interfaceC4730c0);
        this.f50549a = interfaceC4730c0;
        this.f50550b = interfaceC4730c02;
        this.f50551c = interfaceC4730c03;
        this.f50552d = w12;
        this.f50553e = str;
        F3 i10 = i();
        R(i10);
        this.f50554f = i10.getCompositePerformanceCollector();
        this.f50556h = new io.sentry.logger.e(this);
        this.f50557i = new io.sentry.metrics.e(this);
        this.f50558j = new G(this);
    }

    @Override // io.sentry.InterfaceC4740e0
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public W m128clone() {
        if (!isEnabled()) {
            i().getLogger().c(EnumC4788n3.WARNING, "Disabled Scopes cloned.", new Object[0]);
        }
        return new N(B("scopes clone"));
    }
}
