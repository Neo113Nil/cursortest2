package io.sentry;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x3 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f17245a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f17246b;

    /* renamed from: c, reason: collision with root package name */
    public final z0 f17247c;

    /* renamed from: d, reason: collision with root package name */
    public final k f17248d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.appcompat.app.v0 f17249e;

    /* renamed from: f, reason: collision with root package name */
    public final i2.d f17250f;

    public x3(z0 z0Var, z0 z0Var2, z0 z0Var3) {
        this.f17249e = new androidx.appcompat.app.v0(z0Var3, z0Var2, z0Var, 16);
        this.f17245a = z0Var;
        this.f17246b = z0Var2;
        this.f17247c = z0Var3;
        b6 m6 = m();
        y4.a.C(m6, "SentryOptions is required.");
        if (m6.getDsn() == null || m6.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
        }
        this.f17248d = m6.getCompositePerformanceCollector();
        this.f17250f = new i2.d(8, this);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v A(String str, b5 b5Var) {
        return G(str, b5Var, null);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v B(io.sentry.protocol.e0 e0Var, t6 t6Var, h0 h0Var, j3 j3Var) {
        io.sentry.protocol.e0 e0Var2;
        z0 z0Var = this.f17249e;
        ArrayList arrayList = e0Var.f16772s;
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f16922b;
        if (!isEnabled()) {
            m().getLogger().h(b5.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return vVar;
        }
        if (e0Var.f16771r == null) {
            m().getLogger().h(b5.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", e0Var.f16455a);
            return vVar;
        }
        Boolean bool = Boolean.TRUE;
        n6 i5 = e0Var.f16456b.i();
        c4.d dVar = i5 == null ? null : i5.f16670d;
        if (bool.equals(Boolean.valueOf(dVar == null ? false : ((Boolean) dVar.f3577b).booleanValue()))) {
            try {
                e0Var2 = e0Var;
            } catch (Throwable th2) {
                th = th2;
                e0Var2 = e0Var;
            }
            try {
                return z0Var.C().i(e0Var2, t6Var, z0Var, h0Var, j3Var);
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                m().getLogger().e(b5.ERROR, "Error while capturing transaction with id: " + e0Var2.f16455a, th4);
                return vVar;
            }
        }
        m().getLogger().h(b5.DEBUG, "Transaction %s was dropped due to sampling decision.", e0Var.f16455a);
        if (m().getBackpressureMonitor().a() > 0) {
            io.sentry.clientreport.g clientReportRecorder = m().getClientReportRecorder();
            io.sentry.clientreport.e eVar = io.sentry.clientreport.e.BACKPRESSURE;
            clientReportRecorder.b(eVar, l.Transaction);
            m().getClientReportRecorder().l(eVar, l.Span, arrayList.size() + 1);
            return vVar;
        }
        io.sentry.clientreport.g clientReportRecorder2 = m().getClientReportRecorder();
        io.sentry.clientreport.e eVar2 = io.sentry.clientreport.e.SAMPLE_RATE;
        clientReportRecorder2.b(eVar2, l.Transaction);
        m().getClientReportRecorder().l(eVar2, l.Span, arrayList.size() + 1);
        return vVar;
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v C(String str, b5 b5Var, com.google.firebase.messaging.q qVar) {
        return G(str, b5Var, qVar);
    }

    @Override // io.sentry.b1
    public final b1 D(String str) {
        return new x3(this.f17245a.clone(), this.f17246b.clone(), this.f17247c);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v E(t4 t4Var, h0 h0Var) {
        z0 z0Var = this.f17249e;
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f16922b;
        if (!isEnabled()) {
            m().getLogger().h(b5.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return vVar;
        }
        try {
            z0Var.G(t4Var);
            vVar = z0Var.C().m(t4Var, z0Var, h0Var);
            z0Var.L(vVar);
            return vVar;
        } catch (Throwable th2) {
            m().getLogger().e(b5.ERROR, "Error while capturing event with id: " + t4Var.f16455a, th2);
            return vVar;
        }
    }

    public final z0 F(z0 z0Var, u3 u3Var) {
        if (u3Var != null) {
            try {
                z0 clone = z0Var.clone();
                u3Var.g(clone);
                return clone;
            } catch (Throwable th2) {
                m().getLogger().e(b5.ERROR, "Error in the 'ScopeCallback' callback.", th2);
            }
        }
        return z0Var;
    }

    public final io.sentry.protocol.v G(String str, b5 b5Var, com.google.firebase.messaging.q qVar) {
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f16922b;
        boolean isEnabled = isEnabled();
        androidx.appcompat.app.v0 v0Var = this.f17249e;
        if (!isEnabled) {
            m().getLogger().h(b5.WARNING, "Instance is disabled and this 'captureMessage' call is a no-op.", new Object[0]);
        } else if (str == null) {
            m().getLogger().h(b5.WARNING, "captureMessage called with null parameter.", new Object[0]);
        } else {
            try {
                vVar = v0Var.C().j(str, b5Var, F(v0Var, qVar));
            } catch (Throwable th2) {
                m().getLogger().e(b5.ERROR, "Error while capturing message: ".concat(str), th2);
            }
        }
        v0Var.L(vVar);
        return vVar;
    }

    @Override // io.sentry.b1
    public final void a(boolean z5) {
        if (!isEnabled()) {
            m().getLogger().h(b5.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (q1 q1Var : m().getIntegrations()) {
                if (q1Var instanceof Closeable) {
                    try {
                        ((Closeable) q1Var).close();
                    } catch (Throwable th2) {
                        m().getLogger().h(b5.WARNING, "Failed to close the integration {}.", q1Var, th2);
                    }
                }
            }
            boolean isEnabled = isEnabled();
            androidx.appcompat.app.v0 v0Var = this.f17249e;
            if (isEnabled) {
                try {
                    v0Var.Q(null).clear();
                } catch (Throwable th3) {
                    m().getLogger().e(b5.ERROR, "Error in the 'configureScope' callback.", th3);
                }
            } else {
                m().getLogger().h(b5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            w3 w3Var = w3.ISOLATION;
            if (isEnabled()) {
                try {
                    v0Var.Q(w3Var).clear();
                } catch (Throwable th4) {
                    m().getLogger().e(b5.ERROR, "Error in the 'configureScope' callback.", th4);
                }
            } else {
                m().getLogger().h(b5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            m().getBackpressureMonitor().close();
            m().getTransactionProfiler().close();
            m().getContinuousProfiler().a(true);
            m().getCompositePerformanceCollector().close();
            m().getConnectionStatusProvider().close();
            e1 executorService = m().getExecutorService();
            if (z5) {
                try {
                    executorService.submit(new androidx.appcompat.app.t(20, this, executorService));
                } catch (RejectedExecutionException e7) {
                    m().getLogger().e(b5.WARNING, "Failed to submit executor service shutdown task during restart. Shutting down synchronously.", e7);
                    executorService.d(m().getShutdownTimeoutMillis());
                }
            } else {
                executorService.d(m().getShutdownTimeoutMillis());
            }
            w3 w3Var2 = w3.CURRENT;
            if (isEnabled()) {
                try {
                    v0Var.Q(w3Var2).C().a(z5);
                } catch (Throwable th5) {
                    m().getLogger().e(b5.ERROR, "Error in the 'configureScope' callback.", th5);
                }
            } else {
                m().getLogger().h(b5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            w3 w3Var3 = w3.ISOLATION;
            if (isEnabled()) {
                try {
                    v0Var.Q(w3Var3).C().a(z5);
                } catch (Throwable th6) {
                    m().getLogger().e(b5.ERROR, "Error in the 'configureScope' callback.", th6);
                }
            } else {
                m().getLogger().h(b5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            w3 w3Var4 = w3.GLOBAL;
            if (!isEnabled()) {
                m().getLogger().h(b5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                return;
            }
            try {
                v0Var.Q(w3Var4).C().a(z5);
            } catch (Throwable th7) {
                m().getLogger().e(b5.ERROR, "Error in the 'configureScope' callback.", th7);
            }
        } catch (Throwable th8) {
            m().getLogger().e(b5.ERROR, "Error while closing the Scopes.", th8);
        }
    }

    @Override // io.sentry.b1
    public final void b(long j) {
        if (!isEnabled()) {
            m().getLogger().h(b5.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.f17249e.C().b(j);
        } catch (Throwable th2) {
            m().getLogger().e(b5.ERROR, "Error in the 'client.flush'.", th2);
        }
    }

    @Override // io.sentry.b1
    public final void c(e eVar) {
        h(eVar, new h0());
    }

    @Override // io.sentry.b1
    public final e5.j d() {
        return this.f17249e.C().d();
    }

    @Override // io.sentry.b1
    public final boolean e() {
        return this.f17249e.C().e();
    }

    @Override // io.sentry.b1
    public final void f(String str, String str2) {
        if (!isEnabled()) {
            m().getLogger().h(b5.WARNING, "Instance is disabled and this 'setTag' call is a no-op.", new Object[0]);
        } else if (str2 == null) {
            m().getLogger().h(b5.WARNING, "setTag called with null parameter.", new Object[0]);
        } else {
            this.f17249e.f(str, str2);
        }
    }

    @Override // io.sentry.b1
    public final void g(Throwable th2, m6 m6Var, String str) {
        this.f17249e.g(th2, m6Var, str);
    }

    @Override // io.sentry.b1
    public final void h(e eVar, h0 h0Var) {
        if (!isEnabled()) {
            m().getLogger().h(b5.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (eVar == null) {
            m().getLogger().h(b5.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            this.f17249e.h(eVar, h0Var);
        }
    }

    @Override // io.sentry.b1
    public final i1 i() {
        if (isEnabled()) {
            return this.f17249e.i();
        }
        m().getLogger().h(b5.WARNING, "Instance is disabled and this 'getSpan' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.b1
    public final boolean isEnabled() {
        return this.f17249e.C().isEnabled();
    }

    @Override // io.sentry.b1
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v k(g3 g3Var) {
        y4.a.C(g3Var, "profilingContinuousData is required");
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f16922b;
        if (!isEnabled()) {
            m().getLogger().h(b5.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return vVar;
        }
        try {
            return this.f17249e.C().k(g3Var);
        } catch (Throwable th2) {
            m().getLogger().e(b5.ERROR, "Error while capturing profile chunk with id: " + g3Var.f16427c, th2);
            return vVar;
        }
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v l(l1.a aVar, h0 h0Var) {
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f16922b;
        if (!isEnabled()) {
            m().getLogger().h(b5.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return vVar;
        }
        try {
            io.sentry.protocol.v l6 = this.f17249e.C().l(aVar, h0Var);
            return l6 != null ? l6 : vVar;
        } catch (Throwable th2) {
            m().getLogger().e(b5.ERROR, "Error while capturing envelope.", th2);
            return vVar;
        }
    }

    @Override // io.sentry.b1
    public final b6 m() {
        return ((z0) this.f17249e.f364b).m();
    }

    @Override // io.sentry.b1
    public final k1 n() {
        if (isEnabled()) {
            return this.f17249e.n();
        }
        m().getLogger().h(b5.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v o(Throwable th2, h0 h0Var, u3 u3Var) {
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f16922b;
        boolean isEnabled = isEnabled();
        androidx.appcompat.app.v0 v0Var = this.f17249e;
        if (!isEnabled) {
            m().getLogger().h(b5.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
        } else if (th2 == null) {
            m().getLogger().h(b5.WARNING, "captureException called with null parameter.", new Object[0]);
        } else {
            try {
                t4 t4Var = new t4(th2);
                v0Var.G(t4Var);
                vVar = v0Var.C().m(t4Var, F(v0Var, u3Var), h0Var);
            } catch (Throwable th3) {
                m().getLogger().e(b5.ERROR, "Error while capturing exception: " + th2.getMessage(), th3);
            }
        }
        v0Var.L(vVar);
        return vVar;
    }

    @Override // io.sentry.b1
    public final void p() {
        if (!isEnabled()) {
            m().getLogger().h(b5.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        androidx.appcompat.app.v0 v0Var = this.f17249e;
        l6 p10 = v0Var.p();
        if (p10 != null) {
            v0Var.C().c(p10, k2.x.k(new m3.f(21)));
        }
    }

    @Override // io.sentry.b1
    public final void q() {
        if (!isEnabled()) {
            m().getLogger().h(b5.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        androidx.appcompat.app.v0 v0Var = this.f17249e;
        x5.h q = v0Var.q();
        if (q == null) {
            m().getLogger().h(b5.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        l6 l6Var = (l6) q.f25409a;
        if (l6Var != null) {
            v0Var.C().c(l6Var, k2.x.k(new m3.f(21)));
        }
        v0Var.C().c((l6) q.f25410b, k2.x.k(new io.sentry.hints.j(0)));
    }

    @Override // io.sentry.b1
    public final k1 r(v6 v6Var, w6 w6Var) {
        Double valueOf;
        v6Var.f16675i = (String) w6Var.f4030d;
        boolean isEnabled = isEnabled();
        k1 k1Var = y2.f17254a;
        if (!isEnabled) {
            m().getLogger().h(b5.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        } else if (io.sentry.util.k.a(v6Var.f16675i, m().getIgnoredSpanOrigins())) {
            m().getLogger().h(b5.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", v6Var.f16675i);
        } else if (!m().getInstrumenter().equals(v6Var.f16677l)) {
            m().getLogger().h(b5.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", v6Var.f16677l, m().getInstrumenter());
        } else if (m().isTracingEnabled()) {
            c cVar = v6Var.f16678m;
            if (cVar == null || (valueOf = cVar.f16221d) == null) {
                Double d10 = ((c) this.f17249e.y().f366d).f16221d;
                valueOf = Double.valueOf(d10 == null ? 0.0d : d10.doubleValue());
            }
            c4.d a7 = m().getInternalTracesSampler().a(new l1.a(v6Var, valueOf));
            Boolean bool = (Boolean) a7.f3577b;
            v6Var.a(a7);
            j1 spanFactory = m().getSpanFactory();
            if (bool.booleanValue() && m().isContinuousProfilingEnabled()) {
                i3 profileLifecycle = m().getProfileLifecycle();
                i3 i3Var = i3.TRACE;
                if (profileLifecycle == i3Var && v6Var.f16680o.equals(io.sentry.protocol.v.f16922b)) {
                    m().getContinuousProfiler().c(i3Var, m().getInternalTracesSampler());
                }
            }
            k1Var = spanFactory.a(v6Var, this, w6Var, this.f17248d);
            if (bool.booleanValue() && ((Boolean) a7.f3580e).booleanValue()) {
                l1 transactionProfiler = m().getTransactionProfiler();
                if (!transactionProfiler.isRunning()) {
                    transactionProfiler.start();
                    transactionProfiler.a(k1Var);
                } else if (w6Var.f17237e) {
                    transactionProfiler.a(k1Var);
                }
            }
        } else {
            m().getLogger().h(b5.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        }
        if (t3.ON == ((t3) w6Var.f4029c)) {
            k1Var.n();
        }
        return k1Var;
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v s(Throwable th2, u3 u3Var) {
        return o(th2, new h0(), u3Var);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v t(io.sentry.protocol.e0 e0Var, t6 t6Var, h0 h0Var) {
        return B(e0Var, t6Var, h0Var, null);
    }

    @Override // io.sentry.b1
    public final void u(u3 u3Var) {
        if (!isEnabled()) {
            m().getLogger().h(b5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            u3Var.g(this.f17249e.Q(null));
        } catch (Throwable th2) {
            m().getLogger().e(b5.ERROR, "Error in the 'configureScope' callback.", th2);
        }
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v v(String str, com.google.firebase.messaging.q qVar) {
        return G(str, b5.INFO, qVar);
    }

    @Override // io.sentry.b1
    public final io.sentry.logger.a w() {
        return this.f17250f;
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v x(d6 d6Var, h0 h0Var) {
        z0 z0Var = this.f17249e;
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f16922b;
        if (!isEnabled()) {
            m().getLogger().h(b5.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
            return vVar;
        }
        try {
            return z0Var.C().f(d6Var, z0Var, h0Var);
        } catch (Throwable th2) {
            m().getLogger().e(b5.ERROR, "Error while capturing replay", th2);
            return vVar;
        }
    }

    @Override // io.sentry.b1
    public final void y(u3 u3Var) {
        u(u3Var);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v z(String str) {
        return G(str, b5.INFO, null);
    }

    @Override // io.sentry.b1
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final t0 m110clone() {
        if (!isEnabled()) {
            m().getLogger().h(b5.WARNING, "Disabled Scopes cloned.", new Object[0]);
        }
        return new m0((x3) D("scopes clone"));
    }
}
