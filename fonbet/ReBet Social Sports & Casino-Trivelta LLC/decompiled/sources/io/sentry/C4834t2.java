package io.sentry;

import io.sentry.F3;
import io.sentry.L1;
import io.sentry.V3;
import io.sentry.protocol.C4802d;
import io.sentry.protocol.C4803e;
import io.sentry.protocol.C4806h;
import io.sentry.util.AbstractC4847e;
import io.sentry.util.AbstractC4849g;
import io.sentry.util.AbstractC4850h;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.t2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4834t2 implements InterfaceC4755h0 {

    /* renamed from: b, reason: collision with root package name */
    public final F3 f52705b;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.transport.p f52706c;

    /* renamed from: e, reason: collision with root package name */
    public final io.sentry.logger.c f52708e;

    /* renamed from: f, reason: collision with root package name */
    public final io.sentry.metrics.c f52709f;

    /* renamed from: d, reason: collision with root package name */
    public final b f52707d = new b();

    /* renamed from: a, reason: collision with root package name */
    public boolean f52704a = true;

    /* renamed from: io.sentry.t2$b */
    public static final class b implements Comparator {
        public b() {
        }

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(C4744f c4744f, C4744f c4744f2) {
            return c4744f.q().compareTo(c4744f2.q());
        }
    }

    public C4834t2(F3 f32) {
        this.f52705b = (F3) io.sentry.util.w.c(f32, "SentryOptions is required.");
        InterfaceC4808q0 transportFactory = f32.getTransportFactory();
        if (transportFactory instanceof C4791o1) {
            transportFactory = new C4661a();
            f32.setTransportFactory(transportFactory);
        }
        this.f52706c = transportFactory.a(f32, new J1(f32).a());
        if (f32.getLogs().b()) {
            this.f52708e = f32.getLogs().a().a(f32, this);
        } else {
            this.f52708e = io.sentry.logger.h.c();
        }
        if (f32.getMetrics().b()) {
            this.f52709f = f32.getMetrics().a().a(f32, this);
        } else {
            this.f52709f = io.sentry.metrics.h.c();
        }
    }

    public static /* synthetic */ void n(V3 v32) {
    }

    public static /* synthetic */ void o(C4834t2 c4834t2, C4733c3 c4733c3, J j10, V3 v32) {
        if (v32 == null) {
            c4834t2.f52705b.getLogger().c(EnumC4788n3.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        c4834t2.getClass();
        String str = null;
        V3.b bVar = c4733c3.y0() ? V3.b.Crashed : null;
        boolean z10 = V3.b.Crashed == bVar || c4733c3.z0();
        String str2 = (c4733c3.K() == null || c4733c3.K().l() == null || !c4733c3.K().l().containsKey("user-agent")) ? null : (String) c4733c3.K().l().get("user-agent");
        Object e10 = io.sentry.util.l.e(j10);
        if (e10 instanceof io.sentry.hints.a) {
            str = ((io.sentry.hints.a) e10).h();
            bVar = V3.b.Abnormal;
        }
        if (v32.q(bVar, str2, z10, str) && v32.m()) {
            v32.c();
        }
    }

    public final G3 A(G3 g32, J j10) {
        this.f52705b.getBeforeSendReplay();
        return g32;
    }

    public final io.sentry.protocol.B B(io.sentry.protocol.B b10, J j10) {
        this.f52705b.getBeforeSendTransaction();
        return b10;
    }

    public final List C(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4724b c4724b = (C4724b) it.next();
            if (c4724b.l()) {
                arrayList.add(c4724b);
            }
        }
        return arrayList;
    }

    public final void D(InterfaceC4730c0 interfaceC4730c0, J j10) {
        InterfaceC4790o0 k10 = interfaceC4730c0.k();
        if (k10 == null || !io.sentry.util.l.f(j10, io.sentry.hints.r.class)) {
            return;
        }
        Object e10 = io.sentry.util.l.e(j10);
        if (!(e10 instanceof io.sentry.hints.f)) {
            k10.f(f4.ABORTED, false, null);
        } else {
            ((io.sentry.hints.f) e10).d(k10.h());
            k10.f(f4.ABORTED, false, j10);
        }
    }

    public final List E(J j10) {
        List f10 = j10.f();
        C4724b h10 = j10.h();
        if (h10 != null) {
            f10.add(h10);
        }
        C4724b k10 = j10.k();
        if (k10 != null) {
            f10.add(k10);
        }
        C4724b i10 = j10.i();
        if (i10 != null) {
            f10.add(i10);
        }
        C4724b j11 = j10.j();
        if (j11 != null) {
            f10.add(j11);
        }
        return f10;
    }

    public final j4 F(InterfaceC4730c0 interfaceC4730c0, J j10, AbstractC4810q2 abstractC4810q2, String str) {
        if (io.sentry.util.l.f(j10, io.sentry.hints.c.class)) {
            if (abstractC4810q2 != null) {
                return C4734d.e(abstractC4810q2, str, this.f52705b).T();
            }
            return null;
        }
        if (interfaceC4730c0 == null) {
            return null;
        }
        InterfaceC4790o0 k10 = interfaceC4730c0.k();
        return k10 != null ? k10.j() : io.sentry.util.H.g(interfaceC4730c0, this.f52705b).j();
    }

    public final j4 G(InterfaceC4730c0 interfaceC4730c0, J j10, C4733c3 c4733c3) {
        return F(interfaceC4730c0, j10, c4733c3, c4733c3 != null ? c4733c3.w0() : null);
    }

    public final C4733c3 H(C4733c3 c4733c3, J j10, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            D d10 = (D) it.next();
            try {
                boolean z10 = d10 instanceof InterfaceC4729c;
                boolean f10 = io.sentry.util.l.f(j10, io.sentry.hints.c.class);
                if (f10 && z10) {
                    c4733c3 = d10.k(c4733c3, j10);
                } else if (!f10 && !z10) {
                    c4733c3 = d10.k(c4733c3, j10);
                }
            } catch (Throwable th2) {
                this.f52705b.getLogger().a(EnumC4788n3.ERROR, th2, "An exception occurred while processing event by processor: %s", d10.getClass().getName());
            }
            if (c4733c3 == null) {
                this.f52705b.getLogger().c(EnumC4788n3.DEBUG, "Event was dropped by a processor: %s", d10.getClass().getName());
                this.f52705b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, EnumC4774l.Error);
                break;
            }
        }
        return c4733c3;
    }

    public final C4733c3 I(C4733c3 c4733c3, J j10, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            D d10 = (D) it.next();
            try {
                c4733c3 = d10.k(c4733c3, j10);
            } catch (Throwable th2) {
                this.f52705b.getLogger().a(EnumC4788n3.ERROR, th2, "An exception occurred while processing feedback event by processor: %s", d10.getClass().getName());
            }
            if (c4733c3 == null) {
                this.f52705b.getLogger().c(EnumC4788n3.DEBUG, "Feedback event was dropped by a processor: %s", d10.getClass().getName());
                this.f52705b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, EnumC4774l.Feedback);
                break;
            }
        }
        return c4733c3;
    }

    public final G3 J(G3 g32, J j10, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            D d10 = (D) it.next();
            try {
                g32 = d10.d(g32, j10);
            } catch (Throwable th2) {
                this.f52705b.getLogger().a(EnumC4788n3.ERROR, th2, "An exception occurred while processing replay event by processor: %s", d10.getClass().getName());
            }
            if (g32 == null) {
                this.f52705b.getLogger().c(EnumC4788n3.DEBUG, "Replay event was dropped by a processor: %s", d10.getClass().getName());
                this.f52705b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, EnumC4774l.Replay);
                break;
            }
        }
        return g32;
    }

    public final io.sentry.protocol.B K(io.sentry.protocol.B b10, J j10, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            D d10 = (D) it.next();
            int size = b10.o0().size();
            try {
                b10 = d10.r(b10, j10);
            } catch (Throwable th2) {
                this.f52705b.getLogger().a(EnumC4788n3.ERROR, th2, "An exception occurred while processing transaction by processor: %s", d10.getClass().getName());
            }
            int size2 = b10 == null ? 0 : b10.o0().size();
            if (b10 == null) {
                this.f52705b.getLogger().c(EnumC4788n3.DEBUG, "Transaction was dropped by a processor: %s", d10.getClass().getName());
                io.sentry.clientreport.h clientReportRecorder = this.f52705b.getClientReportRecorder();
                io.sentry.clientreport.f fVar = io.sentry.clientreport.f.EVENT_PROCESSOR;
                clientReportRecorder.a(fVar, EnumC4774l.Transaction);
                this.f52705b.getClientReportRecorder().c(fVar, EnumC4774l.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i10 = size - size2;
                this.f52705b.getLogger().c(EnumC4788n3.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i10), d10.getClass().getName());
                this.f52705b.getClientReportRecorder().c(io.sentry.clientreport.f.EVENT_PROCESSOR, EnumC4774l.Span, i10);
            }
        }
        return b10;
    }

    public final boolean L() {
        io.sentry.util.z a10 = this.f52705b.getSampleRate() == null ? null : io.sentry.util.B.a();
        return this.f52705b.getSampleRate() == null || a10 == null || this.f52705b.getSampleRate().doubleValue() >= a10.c();
    }

    public final io.sentry.protocol.u M(C4866x2 c4866x2, J j10) {
        this.f52705b.getBeforeEnvelopeCallback();
        C4778l3.d().c(this.f52705b.getLogger());
        if (j10 == null) {
            this.f52706c.E1(c4866x2);
        } else {
            this.f52706c.R(c4866x2, j10);
        }
        io.sentry.protocol.u a10 = c4866x2.b().a();
        return a10 != null ? a10 : io.sentry.protocol.u.f52477c;
    }

    public final boolean N(AbstractC4810q2 abstractC4810q2, J j10) {
        if (io.sentry.util.l.n(j10)) {
            return true;
        }
        this.f52705b.getLogger().c(EnumC4788n3.DEBUG, "Event was cached so not applying scope: %s", abstractC4810q2.G());
        return false;
    }

    public final boolean O(V3 v32, V3 v33) {
        if (v33 == null) {
            return false;
        }
        if (v32 == null) {
            return true;
        }
        V3.b l10 = v33.l();
        V3.b bVar = V3.b.Crashed;
        if (l10 != bVar || v32.l() == bVar) {
            return v33.e() > 0 && v32.e() <= 0;
        }
        return true;
    }

    public final void P(AbstractC4810q2 abstractC4810q2, Collection collection) {
        List B10 = abstractC4810q2.B();
        if (B10 == null || collection.isEmpty()) {
            return;
        }
        B10.addAll(collection);
        Collections.sort(B10, this.f52707d);
    }

    public V3 Q(final C4733c3 c4733c3, final J j10, InterfaceC4730c0 interfaceC4730c0) {
        if (io.sentry.util.l.n(j10)) {
            if (interfaceC4730c0 != null) {
                return interfaceC4730c0.x(new L1.b() { // from class: io.sentry.s2
                    @Override // io.sentry.L1.b
                    public final void a(V3 v32) {
                        C4834t2.o(C4834t2.this, c4733c3, j10, v32);
                    }
                });
            }
            this.f52705b.getLogger().c(EnumC4788n3.INFO, "Scope is null on client.captureEvent", new Object[0]);
        }
        return null;
    }

    @Override // io.sentry.InterfaceC4755h0
    public void a(boolean z10) {
        long shutdownTimeoutMillis;
        this.f52705b.getLogger().c(EnumC4788n3.INFO, "Closing SentryClient.", new Object[0]);
        if (z10) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = this.f52705b.getShutdownTimeoutMillis();
            } catch (IOException e10) {
                this.f52705b.getLogger().b(EnumC4788n3.WARNING, "Failed to close the connection to the Sentry Server.", e10);
            }
        }
        b(shutdownTimeoutMillis);
        this.f52708e.a(z10);
        this.f52709f.a(z10);
        this.f52706c.a(z10);
        for (D d10 : this.f52705b.getEventProcessors()) {
            if (d10 instanceof Closeable) {
                try {
                    ((Closeable) d10).close();
                } catch (IOException e11) {
                    this.f52705b.getLogger().c(EnumC4788n3.WARNING, "Failed to close the event processor {}.", d10, e11);
                }
            }
        }
        this.f52704a = false;
    }

    @Override // io.sentry.InterfaceC4755h0
    public void b(long j10) {
        this.f52708e.b(j10);
        this.f52709f.b(j10);
        this.f52706c.b(j10);
    }

    @Override // io.sentry.InterfaceC4755h0
    public boolean c() {
        return this.f52706c.c();
    }

    @Override // io.sentry.InterfaceC4755h0
    public io.sentry.protocol.u d(G3 g32, InterfaceC4730c0 interfaceC4730c0, J j10) {
        io.sentry.util.w.c(g32, "SessionReplay is required.");
        if (j10 == null) {
            j10 = new J();
        }
        if (N(g32, j10)) {
            t(g32, interfaceC4730c0);
        }
        ILogger logger = this.f52705b.getLogger();
        EnumC4788n3 enumC4788n3 = EnumC4788n3.DEBUG;
        logger.c(enumC4788n3, "Capturing session replay: %s", g32.G());
        io.sentry.protocol.u uVar = io.sentry.protocol.u.f52477c;
        io.sentry.protocol.u G10 = g32.G() != null ? g32.G() : uVar;
        G3 J10 = J(g32, j10, this.f52705b.getEventProcessors());
        if (J10 != null && (J10 = A(J10, j10)) == null) {
            this.f52705b.getLogger().c(enumC4788n3, "Event was dropped by beforeSendReplay", new Object[0]);
            this.f52705b.getClientReportRecorder().a(io.sentry.clientreport.f.BEFORE_SEND, EnumC4774l.Replay);
        }
        if (J10 == null) {
            return uVar;
        }
        try {
            C4866x2 x10 = x(J10, j10.g(), F(interfaceC4730c0, j10, J10, null), io.sentry.util.l.f(j10, io.sentry.hints.c.class));
            j10.c();
            this.f52706c.R(x10, j10);
            return G10;
        } catch (IOException e10) {
            this.f52705b.getLogger().a(EnumC4788n3.WARNING, e10, "Capturing event %s failed.", G10);
            return io.sentry.protocol.u.f52477c;
        }
    }

    @Override // io.sentry.InterfaceC4755h0
    public io.sentry.transport.z e() {
        return this.f52706c.e();
    }

    @Override // io.sentry.InterfaceC4755h0
    public io.sentry.protocol.u f(C4866x2 c4866x2, J j10) {
        io.sentry.util.w.c(c4866x2, "SentryEnvelope is required.");
        if (j10 == null) {
            j10 = new J();
        }
        try {
            j10.c();
            return M(c4866x2, j10);
        } catch (IOException e10) {
            this.f52705b.getLogger().b(EnumC4788n3.ERROR, "Failed to capture envelope.", e10);
            return io.sentry.protocol.u.f52477c;
        }
    }

    @Override // io.sentry.InterfaceC4755h0
    public io.sentry.protocol.u g(io.sentry.protocol.B b10, j4 j4Var, InterfaceC4730c0 interfaceC4730c0, J j10, C1 c12) {
        a4 j11;
        io.sentry.util.w.c(b10, "Transaction is required.");
        if (j10 == null) {
            j10 = new J();
        }
        if (N(b10, j10)) {
            p(interfaceC4730c0, j10);
        }
        ILogger logger = this.f52705b.getLogger();
        EnumC4788n3 enumC4788n3 = EnumC4788n3.DEBUG;
        logger.c(enumC4788n3, "Capturing transaction: %s", b10.G());
        if (io.sentry.util.H.f(this.f52705b.getIgnoredTransactions(), b10.p0())) {
            this.f52705b.getLogger().c(enumC4788n3, "Transaction was dropped as transaction name %s is ignored", b10.p0());
            io.sentry.clientreport.h clientReportRecorder = this.f52705b.getClientReportRecorder();
            io.sentry.clientreport.f fVar = io.sentry.clientreport.f.EVENT_PROCESSOR;
            clientReportRecorder.a(fVar, EnumC4774l.Transaction);
            this.f52705b.getClientReportRecorder().c(fVar, EnumC4774l.Span, b10.o0().size() + 1);
            return io.sentry.protocol.u.f52477c;
        }
        io.sentry.protocol.u uVar = io.sentry.protocol.u.f52477c;
        io.sentry.protocol.u G10 = b10.G() != null ? b10.G() : uVar;
        if (N(b10, j10)) {
            b10 = (io.sentry.protocol.B) r(b10, interfaceC4730c0);
            if (b10 != null && interfaceC4730c0 != null) {
                b10 = K(b10, j10, interfaceC4730c0.Y());
            }
            if (b10 == null) {
                this.f52705b.getLogger().c(enumC4788n3, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (b10 != null) {
            b10 = K(b10, j10, this.f52705b.getEventProcessors());
        }
        if (b10 == null) {
            this.f52705b.getLogger().c(enumC4788n3, "Transaction was dropped by Event processors.", new Object[0]);
            return uVar;
        }
        int size = b10.o0().size();
        io.sentry.protocol.B B10 = B(b10, j10);
        int size2 = B10 == null ? 0 : B10.o0().size();
        if (B10 == null) {
            this.f52705b.getLogger().c(enumC4788n3, "Transaction was dropped by beforeSendTransaction.", new Object[0]);
            io.sentry.clientreport.h clientReportRecorder2 = this.f52705b.getClientReportRecorder();
            io.sentry.clientreport.f fVar2 = io.sentry.clientreport.f.BEFORE_SEND;
            clientReportRecorder2.a(fVar2, EnumC4774l.Transaction);
            this.f52705b.getClientReportRecorder().c(fVar2, EnumC4774l.Span, size + 1);
            return uVar;
        }
        if (size2 < size) {
            int i10 = size - size2;
            this.f52705b.getLogger().c(enumC4788n3, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i10));
            this.f52705b.getClientReportRecorder().c(io.sentry.clientreport.f.BEFORE_SEND, EnumC4774l.Span, i10);
        }
        try {
            C4866x2 u10 = u(B10, C(E(j10)), null, j4Var, c12);
            j10.c();
            if (u10 != null) {
                G10 = M(u10, j10);
            }
        } catch (io.sentry.exception.c | IOException e10) {
            this.f52705b.getLogger().a(EnumC4788n3.WARNING, e10, "Capturing transaction %s failed.", G10);
            G10 = io.sentry.protocol.u.f52477c;
        }
        if (!G10.equals(io.sentry.protocol.u.f52477c) && (j11 = B10.C().j()) != null) {
            this.f52705b.getReplayController().k(j11.q());
        }
        return G10;
    }

    @Override // io.sentry.InterfaceC4755h0
    public void h(V3 v32, J j10) {
        io.sentry.util.w.c(v32, "Session is required.");
        if (v32.h() == null || v32.h().isEmpty()) {
            this.f52705b.getLogger().c(EnumC4788n3.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            f(C4866x2.a(this.f52705b.getSerializer(), v32, this.f52705b.getSdkVersion()), j10);
        } catch (IOException e10) {
            this.f52705b.getLogger().b(EnumC4788n3.ERROR, "Failed to capture session.", e10);
        }
    }

    @Override // io.sentry.InterfaceC4755h0
    public io.sentry.protocol.u i(io.sentry.protocol.i iVar, J j10, InterfaceC4730c0 interfaceC4730c0) {
        C4834t2 c4834t2;
        C4733c3 c4733c3 = new C4733c3();
        c4733c3.C().t(iVar);
        if (j10 == null) {
            j10 = new J();
        }
        if (iVar.i() == null) {
            iVar.o(interfaceC4730c0.b());
        }
        ILogger logger = this.f52705b.getLogger();
        EnumC4788n3 enumC4788n3 = EnumC4788n3.DEBUG;
        logger.c(enumC4788n3, "Capturing feedback: %s", c4733c3.G());
        if (N(c4733c3, j10) && (c4733c3 = q(c4733c3, interfaceC4730c0, j10)) == null) {
            this.f52705b.getLogger().c(enumC4788n3, "Feedback was dropped by applyScope", new Object[0]);
            return io.sentry.protocol.u.f52477c;
        }
        C4733c3 I10 = I(c4733c3, j10, this.f52705b.getEventProcessors());
        if (I10 != null && (I10 = z(I10, j10)) == null) {
            this.f52705b.getLogger().c(enumC4788n3, "Event was dropped by beforeSend", new Object[0]);
            this.f52705b.getClientReportRecorder().a(io.sentry.clientreport.f.BEFORE_SEND, EnumC4774l.Feedback);
        }
        C4733c3 c4733c32 = I10;
        if (c4733c32 == null) {
            return io.sentry.protocol.u.f52477c;
        }
        io.sentry.protocol.u uVar = io.sentry.protocol.u.f52477c;
        io.sentry.protocol.u G10 = c4733c32.G() != null ? c4733c32.G() : uVar;
        if (iVar.h() == null) {
            this.f52705b.getReplayController().A0(Boolean.FALSE);
            io.sentry.protocol.u r10 = interfaceC4730c0.r();
            if (!r10.equals(uVar)) {
                iVar.n(r10);
            }
        }
        try {
            c4834t2 = this;
        } catch (io.sentry.exception.c | IOException e10) {
            e = e10;
            c4834t2 = this;
        }
        try {
            C4866x2 u10 = c4834t2.u(c4733c32, E(j10), null, G(interfaceC4730c0, j10, c4733c32), null);
            j10.c();
            return u10 != null ? M(u10, j10) : G10;
        } catch (io.sentry.exception.c e11) {
            e = e11;
            c4834t2.f52705b.getLogger().a(EnumC4788n3.WARNING, e, "Capturing feedback %s failed.", G10);
            return io.sentry.protocol.u.f52477c;
        } catch (IOException e12) {
            e = e12;
            c4834t2.f52705b.getLogger().a(EnumC4788n3.WARNING, e, "Capturing feedback %s failed.", G10);
            return io.sentry.protocol.u.f52477c;
        }
    }

    @Override // io.sentry.InterfaceC4755h0
    public boolean isEnabled() {
        return this.f52704a;
    }

    @Override // io.sentry.InterfaceC4755h0
    public void j(C4815r3 c4815r3) {
        try {
            M(v(c4815r3), null);
        } catch (IOException e10) {
            this.f52705b.getLogger().a(EnumC4788n3.WARNING, e10, "Capturing logs failed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC4755h0
    public void k(C4862w3 c4862w3) {
        try {
            M(w(c4862w3), null);
        } catch (IOException e10) {
            this.f52705b.getLogger().a(EnumC4788n3.WARNING, e10, "Capturing metrics failed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC4755h0
    public io.sentry.protocol.u l(C4870y1 c4870y1, InterfaceC4730c0 interfaceC4730c0) {
        io.sentry.util.w.c(c4870y1, "profileChunk is required.");
        this.f52705b.getLogger().c(EnumC4788n3.DEBUG, "Capturing profile chunk: %s", c4870y1.m());
        io.sentry.protocol.u m10 = c4870y1.m();
        C4803e c10 = C4803e.c(c4870y1.n(), this.f52705b);
        if (c10 != null) {
            c4870y1.r(c10);
        }
        try {
            return M(new C4866x2(new C4871y2(m10, this.f52705b.getSdkVersion(), null), Collections.singletonList(C4665a3.H(c4870y1, this.f52705b.getSerializer(), this.f52705b.getProfilerConverter()))), null);
        } catch (io.sentry.exception.c | IOException e10) {
            this.f52705b.getLogger().a(EnumC4788n3.WARNING, e10, "Capturing profile chunk %s failed.", m10);
            return io.sentry.protocol.u.f52477c;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01d3  */
    @Override // io.sentry.InterfaceC4755h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public io.sentry.protocol.u m(C4733c3 c4733c3, InterfaceC4730c0 interfaceC4730c0, J j10) {
        C4733c3 c4733c32;
        C4834t2 c4834t2;
        io.sentry.util.w.c(c4733c3, "SentryEvent is required.");
        if (j10 == null) {
            j10 = new J();
        }
        if (N(c4733c3, j10) && !io.sentry.util.l.f(j10, io.sentry.hints.e.class)) {
            p(interfaceC4730c0, j10);
        }
        ILogger logger = this.f52705b.getLogger();
        EnumC4788n3 enumC4788n3 = EnumC4788n3.DEBUG;
        logger.c(enumC4788n3, "Capturing event: %s", c4733c3.G());
        Throwable O10 = c4733c3.O();
        if (O10 != null && AbstractC4850h.b(this.f52705b.getIgnoredExceptionsForType(), O10)) {
            this.f52705b.getLogger().c(enumC4788n3, "Event was dropped as the exception %s is ignored", O10.getClass());
            this.f52705b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, EnumC4774l.Error);
            return io.sentry.protocol.u.f52477c;
        }
        if (AbstractC4847e.a(this.f52705b.getIgnoredErrors(), c4733c3)) {
            this.f52705b.getLogger().c(enumC4788n3, "Event was dropped as it matched a string/pattern in ignoredErrors", c4733c3.s0());
            this.f52705b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, EnumC4774l.Error);
            return io.sentry.protocol.u.f52477c;
        }
        boolean z10 = false;
        if (N(c4733c3, j10) && (c4733c3 = s(c4733c3, interfaceC4730c0, j10)) == null) {
            this.f52705b.getLogger().c(enumC4788n3, "Event was dropped by applyScope", new Object[0]);
            return io.sentry.protocol.u.f52477c;
        }
        C4733c3 H10 = H(c4733c3, j10, this.f52705b.getEventProcessors());
        if (H10 != null && (H10 = y(H10, j10)) == null) {
            this.f52705b.getLogger().c(enumC4788n3, "Event was dropped by beforeSend", new Object[0]);
            this.f52705b.getClientReportRecorder().a(io.sentry.clientreport.f.BEFORE_SEND, EnumC4774l.Error);
        }
        if (H10 != null) {
            H10 = AbstractC4849g.b(H10, j10, this.f52705b);
        }
        if (H10 == null) {
            return io.sentry.protocol.u.f52477c;
        }
        V3 x10 = interfaceC4730c0 != null ? interfaceC4730c0.x(new L1.b() { // from class: io.sentry.r2
            @Override // io.sentry.L1.b
            public final void a(V3 v32) {
                C4834t2.n(v32);
            }
        }) : null;
        V3 Q10 = (x10 == null || !x10.m()) ? Q(H10, j10, interfaceC4730c0) : null;
        if (L()) {
            c4733c32 = H10;
        } else {
            this.f52705b.getLogger().c(enumC4788n3, "Event %s was dropped due to sampling decision.", H10.G());
            this.f52705b.getClientReportRecorder().a(io.sentry.clientreport.f.SAMPLE_RATE, EnumC4774l.Error);
            c4733c32 = null;
        }
        boolean O11 = O(x10, Q10);
        if (c4733c32 == null && !O11) {
            this.f52705b.getLogger().c(enumC4788n3, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
            return io.sentry.protocol.u.f52477c;
        }
        io.sentry.protocol.u uVar = io.sentry.protocol.u.f52477c;
        if (c4733c32 != null && c4733c32.G() != null) {
            uVar = c4733c32.G();
        }
        boolean f10 = io.sentry.util.l.f(j10, io.sentry.hints.c.class);
        if (io.sentry.util.l.f(j10, io.sentry.hints.e.class) && !io.sentry.util.l.f(j10, io.sentry.hints.b.class)) {
            z10 = true;
        }
        if (c4733c32 != null && !f10 && !z10 && (c4733c32.z0() || c4733c32.y0())) {
            this.f52705b.getSessionReplay().l();
            this.f52705b.getReplayController().A0(Boolean.valueOf(c4733c32.y0()));
        }
        try {
            c4834t2 = this;
        } catch (io.sentry.exception.c | IOException e10) {
            e = e10;
            c4834t2 = this;
        }
        try {
            C4866x2 u10 = c4834t2.u(c4733c32, c4733c32 != null ? E(j10) : null, Q10, G(interfaceC4730c0, j10, c4733c32), null);
            j10.c();
            if (u10 != null) {
                uVar = M(u10, j10);
            }
        } catch (io.sentry.exception.c e11) {
            e = e11;
            c4834t2.f52705b.getLogger().a(EnumC4788n3.WARNING, e, "Capturing event %s failed.", uVar);
            uVar = io.sentry.protocol.u.f52477c;
            if (interfaceC4730c0 != null) {
            }
            return uVar;
        } catch (IOException e12) {
            e = e12;
            c4834t2.f52705b.getLogger().a(EnumC4788n3.WARNING, e, "Capturing event %s failed.", uVar);
            uVar = io.sentry.protocol.u.f52477c;
            if (interfaceC4730c0 != null) {
            }
            return uVar;
        }
        if (interfaceC4730c0 != null) {
            D(interfaceC4730c0, j10);
        }
        return uVar;
    }

    public final void p(InterfaceC4730c0 interfaceC4730c0, J j10) {
        if (interfaceC4730c0 != null) {
            j10.b(interfaceC4730c0.S());
        }
    }

    public final C4733c3 q(C4733c3 c4733c3, InterfaceC4730c0 interfaceC4730c0, J j10) {
        if (c4733c3.Q() == null) {
            c4733c3.f0(interfaceC4730c0.getUser());
        }
        if (c4733c3.N() == null) {
            c4733c3.e0(interfaceC4730c0.y());
        } else {
            for (Map.Entry entry : interfaceC4730c0.y().entrySet()) {
                if (!c4733c3.N().containsKey(entry.getKey())) {
                    c4733c3.N().put((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        C4802d C10 = c4733c3.C();
        for (Map.Entry entry2 : new C4802d(interfaceC4730c0.B()).b()) {
            if (!C10.a(entry2.getKey())) {
                C10.l((String) entry2.getKey(), entry2.getValue());
            }
        }
        InterfaceC4780m0 v10 = interfaceC4730c0.v();
        if (c4733c3.C().j() == null) {
            if (v10 == null) {
                c4733c3.C().A(m4.z(interfaceC4730c0.O()));
            } else {
                c4733c3.C().A(v10.a());
            }
        }
        return I(c4733c3, j10, interfaceC4730c0.Y());
    }

    public final AbstractC4810q2 r(AbstractC4810q2 abstractC4810q2, InterfaceC4730c0 interfaceC4730c0) {
        if (interfaceC4730c0 != null) {
            if (abstractC4810q2.K() == null) {
                abstractC4810q2.a0(interfaceC4730c0.c());
            }
            if (abstractC4810q2.Q() == null) {
                abstractC4810q2.f0(interfaceC4730c0.getUser());
            }
            if (abstractC4810q2.N() == null) {
                abstractC4810q2.e0(interfaceC4730c0.y());
            } else {
                for (Map.Entry entry : interfaceC4730c0.y().entrySet()) {
                    if (!abstractC4810q2.N().containsKey(entry.getKey())) {
                        abstractC4810q2.N().put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            if (abstractC4810q2.B() == null) {
                abstractC4810q2.S(new ArrayList(interfaceC4730c0.w()));
            } else {
                P(abstractC4810q2, interfaceC4730c0.w());
            }
            if (abstractC4810q2.H() == null) {
                abstractC4810q2.X(interfaceC4730c0.getExtras());
            } else {
                for (Map.Entry entry2 : interfaceC4730c0.getExtras().entrySet()) {
                    if (!abstractC4810q2.H().containsKey(entry2.getKey())) {
                        abstractC4810q2.H().put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
            C4802d C10 = abstractC4810q2.C();
            for (Map.Entry entry3 : new C4802d(interfaceC4730c0.B()).b()) {
                if (!C10.a(entry3.getKey())) {
                    C10.l((String) entry3.getKey(), entry3.getValue());
                }
            }
        }
        return abstractC4810q2;
    }

    public final C4733c3 s(C4733c3 c4733c3, InterfaceC4730c0 interfaceC4730c0, J j10) {
        C4806h l10;
        if (interfaceC4730c0 == null) {
            return c4733c3;
        }
        r(c4733c3, interfaceC4730c0);
        if (c4733c3.w0() == null) {
            c4733c3.H0(interfaceC4730c0.G());
        }
        if (c4733c3.q0() == null) {
            c4733c3.B0(interfaceC4730c0.E());
        }
        if (interfaceC4730c0.N() != null) {
            c4733c3.C0(interfaceC4730c0.N());
        }
        InterfaceC4780m0 v10 = interfaceC4730c0.v();
        if (c4733c3.C().j() == null) {
            if (v10 == null) {
                c4733c3.C().A(m4.z(interfaceC4730c0.O()));
            } else {
                c4733c3.C().A(v10.a());
            }
        }
        if (c4733c3.C().f() == null && (l10 = interfaceC4730c0.l()) != null) {
            c4733c3.C().s(l10);
        }
        return H(c4733c3, j10, interfaceC4730c0.Y());
    }

    public final G3 t(G3 g32, InterfaceC4730c0 interfaceC4730c0) {
        if (interfaceC4730c0 != null) {
            if (g32.K() == null) {
                g32.a0(interfaceC4730c0.c());
            }
            if (g32.Q() == null) {
                g32.f0(interfaceC4730c0.getUser());
            }
            if (g32.N() == null) {
                g32.e0(interfaceC4730c0.y());
            } else {
                for (Map.Entry entry : interfaceC4730c0.y().entrySet()) {
                    if (!g32.N().containsKey(entry.getKey())) {
                        g32.N().put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            C4802d C10 = g32.C();
            for (Map.Entry entry2 : new C4802d(interfaceC4730c0.B()).b()) {
                if (!C10.a(entry2.getKey())) {
                    C10.l((String) entry2.getKey(), entry2.getValue());
                }
            }
            InterfaceC4780m0 v10 = interfaceC4730c0.v();
            if (g32.C().j() == null) {
                if (v10 == null) {
                    g32.C().A(m4.z(interfaceC4730c0.O()));
                    return g32;
                }
                g32.C().A(v10.a());
            }
        }
        return g32;
    }

    public final C4866x2 u(AbstractC4810q2 abstractC4810q2, List list, V3 v32, j4 j4Var, C1 c12) {
        io.sentry.protocol.u uVar;
        ArrayList arrayList = new ArrayList();
        if (abstractC4810q2 != null) {
            arrayList.add(C4665a3.E(this.f52705b.getSerializer(), abstractC4810q2));
            uVar = abstractC4810q2.G();
        } else {
            uVar = null;
        }
        if (v32 != null) {
            arrayList.add(C4665a3.K(this.f52705b.getSerializer(), v32));
        }
        if (c12 != null) {
            arrayList.add(C4665a3.I(c12, this.f52705b.getMaxTraceFileSize(), this.f52705b.getSerializer()));
            if (uVar == null) {
                uVar = new io.sentry.protocol.u(c12.B());
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C4665a3.C(this.f52705b.getSerializer(), this.f52705b.getLogger(), (C4724b) it.next(), this.f52705b.getMaxAttachmentSize()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C4866x2(new C4871y2(uVar, this.f52705b.getSdkVersion(), j4Var), arrayList);
    }

    public final C4866x2 v(C4815r3 c4815r3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C4665a3.F(this.f52705b.getSerializer(), c4815r3));
        return new C4866x2(new C4871y2(null, this.f52705b.getSdkVersion(), null), arrayList);
    }

    public final C4866x2 w(C4862w3 c4862w3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C4665a3.G(this.f52705b.getSerializer(), c4862w3));
        return new C4866x2(new C4871y2(null, this.f52705b.getSdkVersion(), null), arrayList);
    }

    public final C4866x2 x(G3 g32, H1 h12, j4 j4Var, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C4665a3.J(this.f52705b.getSerializer(), this.f52705b.getLogger(), g32, h12, z10));
        return new C4866x2(new C4871y2(g32.G(), this.f52705b.getSessionReplay().x(), j4Var), arrayList);
    }

    public final C4733c3 y(C4733c3 c4733c3, J j10) {
        F3.c beforeSend = this.f52705b.getBeforeSend();
        if (beforeSend == null) {
            return c4733c3;
        }
        try {
            return beforeSend.a(c4733c3, j10);
        } catch (Throwable th2) {
            this.f52705b.getLogger().b(EnumC4788n3.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th2);
            return null;
        }
    }

    public final C4733c3 z(C4733c3 c4733c3, J j10) {
        F3.c beforeSendFeedback = this.f52705b.getBeforeSendFeedback();
        if (beforeSendFeedback == null) {
            return c4733c3;
        }
        try {
            return beforeSendFeedback.a(c4733c3, j10);
        } catch (Throwable th2) {
            this.f52705b.getLogger().b(EnumC4788n3.ERROR, "The BeforeSendFeedback callback threw an exception.", th2);
            return null;
        }
    }
}
