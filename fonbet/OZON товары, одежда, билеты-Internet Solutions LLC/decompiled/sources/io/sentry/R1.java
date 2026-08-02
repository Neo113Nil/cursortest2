package io.sentry;

import io.sentry.C7209u1;
import io.sentry.C7222x2;
import io.sentry.W2;
import io.sentry.h3;
import io.sentry.protocol.C7187c;
import io.sentry.protocol.C7188d;
import io.sentry.protocol.C7191g;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class R1 implements Y {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final W2 f66729b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.sentry.transport.f f66730c;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final io.sentry.logger.b f66732e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final io.sentry.metrics.b f66733f;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final a f66731d = new a();

    /* renamed from: a, reason: collision with root package name */
    private boolean f66728a = true;

    private static final class a implements Comparator<C7141f> {
        @Override // java.util.Comparator
        public final int compare(@NotNull C7141f c7141f, @NotNull C7141f c7141f2) {
            return c7141f.l().compareTo(c7141f2.l());
        }
    }

    public R1(@NotNull W2 w22) {
        this.f66729b = w22;
        InterfaceC7150h0 transportFactory = w22.getTransportFactory();
        if (transportFactory instanceof C7098a1) {
            transportFactory = new C7096a();
            w22.setTransportFactory(transportFactory);
        }
        this.f66730c = transportFactory.a(w22, new C7201s1(w22).a());
        if (w22.getLogs().b()) {
            this.f66732e = w22.getLogs().a().a(w22, this);
        } else {
            this.f66732e = io.sentry.logger.e.c();
        }
        if (w22.getMetrics().b()) {
            this.f66733f = w22.getMetrics().a().a(w22, this);
        } else {
            this.f66733f = io.sentry.metrics.e.c();
        }
    }

    public static void i(R1 r12, C7230z2 c7230z2, E e11, h3 h3Var) {
        if (h3Var == null) {
            r12.f66729b.getLogger().c(I2.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        r12.getClass();
        String str = null;
        h3.b bVar = c7230z2.v0() != null ? h3.b.Crashed : null;
        boolean z11 = h3.b.Crashed == bVar || c7230z2.w0();
        String str2 = (c7230z2.K() == null || c7230z2.K().l() == null || !((ConcurrentHashMap) c7230z2.K().l()).containsKey("user-agent")) ? null : (String) ((ConcurrentHashMap) c7230z2.K().l()).get("user-agent");
        Object d11 = e11.d("sentry:typeCheckHint");
        if (d11 instanceof io.sentry.hints.a) {
            str = ((io.sentry.hints.a) d11).d();
            bVar = h3.b.Abnormal;
        }
        if (h3Var.m(bVar, str2, z11, str) && h3Var.j()) {
            h3Var.b(C7165l.b());
        }
    }

    @NotNull
    private void l(@NotNull O1 o12, U u11) {
        if (u11 != null) {
            if (o12.K() == null) {
                o12.Y(u11.getRequest());
            }
            if (o12.P() == null) {
                o12.d0(u11.getUser());
            }
            if (o12.N() == null) {
                o12.c0(new HashMap(u11.getTags()));
            } else {
                for (Map.Entry<String, String> entry : u11.getTags().entrySet()) {
                    if (!o12.N().containsKey(entry.getKey())) {
                        o12.N().put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (o12.B() == null) {
                o12.Q(new ArrayList(u11.q()));
            } else {
                Queue<C7141f> q11 = u11.q();
                List<C7141f> B11 = o12.B();
                if (B11 != null && !q11.isEmpty()) {
                    B11.addAll(q11);
                    Collections.sort(B11, this.f66731d);
                }
            }
            if (o12.H() == null) {
                o12.V(new HashMap(u11.getExtras()));
            } else {
                for (Map.Entry<String, Object> entry2 : u11.getExtras().entrySet()) {
                    if (!o12.H().containsKey(entry2.getKey())) {
                        o12.H().put(entry2.getKey(), entry2.getValue());
                    }
                }
            }
            C7187c C11 = o12.C();
            for (Map.Entry<String, Object> entry3 : new C7187c(u11.s()).b()) {
                if (!C11.a(entry3.getKey())) {
                    C11.l(entry3.getValue(), entry3.getKey());
                }
            }
        }
    }

    private V1 m(final O1 o12, ArrayList arrayList, h3 h3Var, q3 q3Var, final C7167l1 c7167l1) throws IOException, io.sentry.exception.b {
        io.sentry.protocol.t tVar;
        ArrayList arrayList2 = new ArrayList();
        W2 w22 = this.f66729b;
        if (o12 != null) {
            final InterfaceC7126b0 serializer = w22.getSerializer();
            int i11 = C7222x2.f68664e;
            io.sentry.util.p.b(serializer, "ISerializer is required.");
            final C7222x2.a aVar = new C7222x2.a(new Callable() { // from class: io.sentry.k2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C7222x2.c(InterfaceC7126b0.this, o12);
                }
            });
            arrayList2.add(new C7222x2(new C7226y2(H2.resolve(o12), new Callable() { // from class: io.sentry.l2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Integer.valueOf(C7222x2.a.this.a().length);
                }
            }, "application/json", null, null), (Callable<byte[]>) new Callable() { // from class: io.sentry.m2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C7222x2.a.this.a();
                }
            }));
            tVar = o12.G();
        } else {
            tVar = null;
        }
        if (h3Var != null) {
            arrayList2.add(C7222x2.m(w22.getSerializer(), h3Var));
        }
        if (c7167l1 != null) {
            final long maxTraceFileSize = w22.getMaxTraceFileSize();
            final InterfaceC7126b0 serializer2 = w22.getSerializer();
            int i12 = C7222x2.f68664e;
            final File B11 = c7167l1.B();
            final C7222x2.a aVar2 = new C7222x2.a(new Callable() { // from class: io.sentry.g2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C7222x2.d(B11, maxTraceFileSize, c7167l1, serializer2);
                }
            });
            arrayList2.add(new C7222x2(new C7226y2(H2.Profile, new Callable() { // from class: io.sentry.h2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Integer.valueOf(C7222x2.a.this.a().length);
                }
            }, "application-json", B11.getName(), null), (Callable<byte[]>) new Callable() { // from class: io.sentry.j2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C7222x2.a.this.a();
                }
            }));
            if (tVar == null) {
                tVar = new io.sentry.protocol.t(c7167l1.A());
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                final C7125b c7125b = (C7125b) it.next();
                final InterfaceC7126b0 serializer3 = w22.getSerializer();
                final ILogger logger = w22.getLogger();
                final long maxAttachmentSize = w22.getMaxAttachmentSize();
                int i13 = C7222x2.f68664e;
                final C7222x2.a aVar3 = new C7222x2.a(new Callable() { // from class: io.sentry.d2
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C7222x2.i(C7125b.this, maxAttachmentSize, serializer3, logger);
                    }
                });
                arrayList2.add(new C7222x2(new C7226y2(H2.Attachment, new Callable() { // from class: io.sentry.e2
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Integer.valueOf(C7222x2.a.this.a().length);
                    }
                }, c7125b.g(), c7125b.h(), c7125b.d()), (Callable<byte[]>) new Callable() { // from class: io.sentry.f2
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C7222x2.a.this.a();
                    }
                }));
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new V1(new W1(tVar, w22.getSdkVersion(), q3Var), arrayList2);
    }

    @NotNull
    private V1 n(@NotNull final M2 m22) {
        ArrayList arrayList = new ArrayList();
        W2 w22 = this.f66729b;
        final InterfaceC7126b0 serializer = w22.getSerializer();
        int i11 = C7222x2.f68664e;
        io.sentry.util.p.b(serializer, "ISerializer is required.");
        final C7222x2.a aVar = new C7222x2.a(new Callable() { // from class: io.sentry.a2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C7222x2.f(InterfaceC7126b0.this, m22);
            }
        });
        arrayList.add(new C7222x2(new C7226y2(H2.Log, (Callable<Integer>) new Callable() { // from class: io.sentry.b2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(C7222x2.a.this.a().length);
            }
        }, "application/vnd.sentry.items.log+json", (String) null, (String) null, (String) null, Integer.valueOf(m22.a().size())), (Callable<byte[]>) new Callable() { // from class: io.sentry.c2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C7222x2.a.this.a();
            }
        }));
        return new V1(new W1(null, w22.getSdkVersion(), null), arrayList);
    }

    @NotNull
    private V1 o(@NotNull R2 r22) {
        ArrayList arrayList = new ArrayList();
        W2 w22 = this.f66729b;
        InterfaceC7126b0 serializer = w22.getSerializer();
        int i11 = C7222x2.f68664e;
        io.sentry.util.p.b(serializer, "ISerializer is required.");
        final C7222x2.a aVar = new C7222x2.a(new Hn.f(1, serializer, r22));
        arrayList.add(new C7222x2(new C7226y2(H2.TraceMetric, (Callable<Integer>) new Callable() { // from class: io.sentry.r2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(C7222x2.a.this.a().length);
            }
        }, "application/vnd.sentry.items.trace-metric+json", (String) null, (String) null, (String) null, Integer.valueOf(r22.a().size())), (Callable<byte[]>) new Callable() { // from class: io.sentry.s2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C7222x2.a.this.a();
            }
        }));
        return new V1(new W1(null, w22.getSdkVersion(), null), arrayList);
    }

    @NotNull
    private V1 p(@NotNull final X2 x22, final C7194q1 c7194q1, q3 q3Var, final boolean z11) {
        ArrayList arrayList = new ArrayList();
        W2 w22 = this.f66729b;
        final InterfaceC7126b0 serializer = w22.getSerializer();
        final ILogger logger = w22.getLogger();
        int i11 = C7222x2.f68664e;
        final File f02 = x22.f0();
        final C7222x2.a aVar = new C7222x2.a(new Callable() { // from class: io.sentry.X1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C7222x2.a(InterfaceC7126b0.this, x22, c7194q1, f02, logger, z11);
            }
        });
        arrayList.add(new C7222x2(new C7226y2(H2.ReplayVideo, new Callable() { // from class: io.sentry.i2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(C7222x2.a.this.a().length);
            }
        }, null, null, null), (Callable<byte[]>) new Callable() { // from class: io.sentry.q2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C7222x2.a.this.a();
            }
        }));
        return new V1(new W1(x22.G(), w22.getSessionReplay().q(), q3Var), arrayList);
    }

    private static ArrayList s(@NotNull E e11) {
        ArrayList f7 = e11.f();
        C7125b h11 = e11.h();
        if (h11 != null) {
            f7.add(h11);
        }
        C7125b j11 = e11.j();
        if (j11 != null) {
            f7.add(j11);
        }
        C7125b i11 = e11.i();
        if (i11 != null) {
            f7.add(i11);
        }
        return f7;
    }

    private q3 t(U u11, @NotNull E e11, O1 o12, String str) {
        boolean isInstance = io.sentry.hints.c.class.isInstance(e11.d("sentry:typeCheckHint"));
        W2 w22 = this.f66729b;
        if (isInstance) {
            if (o12 != null) {
                return C7133d.b(o12, str, w22).l();
            }
            return null;
        }
        if (u11 == null) {
            return null;
        }
        InterfaceC7142f0 i11 = u11.i();
        return i11 != null ? i11.m() : u11.K(new io.sentry.util.x(u11, w22)).f();
    }

    private C7230z2 u(@NotNull C7230z2 c7230z2, @NotNull E e11, @NotNull List<InterfaceC7227z> list) {
        W2 w22 = this.f66729b;
        Iterator<InterfaceC7227z> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC7227z next = it.next();
            try {
                boolean z11 = next instanceof InterfaceC7129c;
                boolean isInstance = io.sentry.hints.c.class.isInstance(e11.d("sentry:typeCheckHint"));
                if (isInstance && z11) {
                    c7230z2 = ((io.sentry.android.core.G) next).d(c7230z2, e11);
                } else if (!isInstance && !z11) {
                    c7230z2 = next.d(c7230z2, e11);
                }
            } catch (Throwable th2) {
                w22.getLogger().b(I2.ERROR, th2, "An exception occurred while processing event by processor: %s", next.getClass().getName());
            }
            if (c7230z2 == null) {
                w22.getLogger().c(I2.DEBUG, "Event was dropped by a processor: %s", next.getClass().getName());
                w22.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, EnumC7161k.Error);
                break;
            }
        }
        return c7230z2;
    }

    private io.sentry.protocol.A v(@NotNull io.sentry.protocol.A a11, @NotNull E e11, @NotNull List<InterfaceC7227z> list) {
        W2 w22 = this.f66729b;
        Iterator<InterfaceC7227z> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC7227z next = it.next();
            int size = ((ArrayList) a11.l0()).size();
            try {
                a11 = next.j(a11, e11);
            } catch (Throwable th2) {
                w22.getLogger().b(I2.ERROR, th2, "An exception occurred while processing transaction by processor: %s", next.getClass().getName());
            }
            int size2 = a11 == null ? 0 : ((ArrayList) a11.l0()).size();
            if (a11 == null) {
                w22.getLogger().c(I2.DEBUG, "Transaction was dropped by a processor: %s", next.getClass().getName());
                io.sentry.clientreport.h clientReportRecorder = w22.getClientReportRecorder();
                io.sentry.clientreport.f fVar = io.sentry.clientreport.f.EVENT_PROCESSOR;
                clientReportRecorder.a(fVar, EnumC7161k.Transaction);
                w22.getClientReportRecorder().b(fVar, EnumC7161k.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i11 = size - size2;
                w22.getLogger().c(I2.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i11), next.getClass().getName());
                w22.getClientReportRecorder().b(io.sentry.clientreport.f.EVENT_PROCESSOR, EnumC7161k.Span, i11);
            }
        }
        return a11;
    }

    @NotNull
    private io.sentry.protocol.t w(@NotNull V1 v12, E e11) throws IOException {
        W2 w22 = this.f66729b;
        w22.getBeforeEnvelopeCallback();
        G2.d().c(w22.getLogger());
        io.sentry.transport.f fVar = this.f66730c;
        if (e11 == null) {
            fVar.getClass();
            fVar.F(v12, new E());
        } else {
            fVar.F(v12, e11);
        }
        io.sentry.protocol.t a11 = v12.a().a();
        return a11 != null ? a11 : io.sentry.protocol.t.f68325b;
    }

    private boolean x(@NotNull O1 o12, @NotNull E e11) {
        if (io.sentry.util.h.d(e11)) {
            return true;
        }
        this.f66729b.getLogger().c(I2.DEBUG, "Event was cached so not applying scope: %s", o12.G());
        return false;
    }

    @Override // io.sentry.Y
    public final void a(boolean z11) {
        long shutdownTimeoutMillis;
        W2 w22 = this.f66729b;
        w22.getLogger().c(I2.INFO, "Closing SentryClient.", new Object[0]);
        if (z11) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = w22.getShutdownTimeoutMillis();
            } catch (IOException e11) {
                w22.getLogger().a(I2.WARNING, "Failed to close the connection to the Sentry Server.", e11);
            }
        }
        b(shutdownTimeoutMillis);
        this.f66732e.a(z11);
        this.f66733f.a(z11);
        this.f66730c.a(z11);
        for (InterfaceC7227z interfaceC7227z : w22.getEventProcessors()) {
            if (interfaceC7227z instanceof Closeable) {
                try {
                    ((Closeable) interfaceC7227z).close();
                } catch (IOException e12) {
                    w22.getLogger().c(I2.WARNING, "Failed to close the event processor {}.", interfaceC7227z, e12);
                }
            }
        }
        this.f66728a = false;
    }

    @Override // io.sentry.Y
    public final void b(long j11) {
        this.f66732e.b(j11);
        this.f66733f.b(j11);
        this.f66730c.b(j11);
    }

    @Override // io.sentry.Y
    @NotNull
    public final io.sentry.protocol.t c(@NotNull X2 x22, U u11, E e11) {
        io.sentry.util.p.b(x22, "SessionReplay is required.");
        if (x(x22, e11) && u11 != null) {
            if (x22.K() == null) {
                x22.Y(u11.getRequest());
            }
            if (x22.P() == null) {
                x22.d0(u11.getUser());
            }
            if (x22.N() == null) {
                x22.c0(new HashMap(u11.getTags()));
            } else {
                for (Map.Entry<String, String> entry : u11.getTags().entrySet()) {
                    if (!x22.N().containsKey(entry.getKey())) {
                        x22.N().put(entry.getKey(), entry.getValue());
                    }
                }
            }
            C7187c C11 = x22.C();
            for (Map.Entry<String, Object> entry2 : new C7187c(u11.s()).b()) {
                if (!C11.a(entry2.getKey())) {
                    C11.l(entry2.getValue(), entry2.getKey());
                }
            }
            InterfaceC7134d0 m11 = u11.m();
            if (x22.C().j() == null) {
                if (m11 == null) {
                    x22.C().x(t3.t(u11.H()));
                } else {
                    x22.C().x(m11.e());
                }
            }
        }
        W2 w22 = this.f66729b;
        w22.getLogger().c(I2.DEBUG, "Capturing session replay: %s", x22.G());
        io.sentry.protocol.t tVar = io.sentry.protocol.t.f68325b;
        if (x22.G() != null) {
            tVar = x22.G();
        }
        Iterator<InterfaceC7227z> it = w22.getEventProcessors().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC7227z next = it.next();
            try {
                x22 = next.c(x22, e11);
            } catch (Throwable th2) {
                w22.getLogger().b(I2.ERROR, th2, "An exception occurred while processing replay event by processor: %s", next.getClass().getName());
            }
            if (x22 == null) {
                w22.getLogger().c(I2.DEBUG, "Replay event was dropped by a processor: %s", next.getClass().getName());
                w22.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, EnumC7161k.Replay);
                break;
            }
        }
        if (x22 != null) {
            w22.getBeforeSendReplay();
        }
        if (x22 == null) {
            return io.sentry.protocol.t.f68325b;
        }
        try {
            V1 p11 = p(x22, e11.g(), t(u11, e11, x22, null), io.sentry.hints.c.class.isInstance(e11.d("sentry:typeCheckHint")));
            e11.c();
            this.f66730c.F(p11, e11);
            return tVar;
        } catch (IOException e12) {
            w22.getLogger().b(I2.WARNING, e12, "Capturing event %s failed.", tVar);
            return io.sentry.protocol.t.f68325b;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        r1.getLogger().c(io.sentry.I2.DEBUG, "Transaction was dropped as transaction name %s is ignored", r13.m0());
        r14 = r1.getClientReportRecorder();
        r15 = io.sentry.clientreport.f.EVENT_PROCESSOR;
        r14.a(r15, io.sentry.EnumC7161k.Transaction);
        r1.getClientReportRecorder().b(r15, io.sentry.EnumC7161k.Span, ((java.util.ArrayList) r13.l0()).size() + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        return io.sentry.protocol.t.f68325b;
     */
    @Override // io.sentry.Y
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.sentry.protocol.t d(@NotNull io.sentry.protocol.A a11, q3 q3Var, U u11, E e11, C7167l1 c7167l1) {
        E e12 = e11 == null ? new E() : e11;
        if (x(a11, e12) && u11 != null) {
            e12.b(u11.J());
        }
        W2 w22 = this.f66729b;
        w22.getLogger().c(I2.DEBUG, "Capturing transaction: %s", a11.G());
        List<C> ignoredTransactions = w22.getIgnoredTransactions();
        String m02 = a11.m0();
        if (m02 != null && ignoredTransactions != null && !ignoredTransactions.isEmpty()) {
            Iterator<C> it = ignoredTransactions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    Iterator<C> it2 = ignoredTransactions.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().b(m02)) {
                        }
                    }
                } else if (it.next().a().equalsIgnoreCase(m02)) {
                    break;
                }
            }
        }
        io.sentry.protocol.t tVar = io.sentry.protocol.t.f68325b;
        io.sentry.protocol.t G11 = a11.G() != null ? a11.G() : tVar;
        if (x(a11, e12)) {
            l(a11, u11);
            if (u11 != null) {
                a11 = v(a11, e12, u11.B());
            }
            if (a11 == null) {
                w22.getLogger().c(I2.DEBUG, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (a11 != null) {
            a11 = v(a11, e12, w22.getEventProcessors());
        }
        io.sentry.protocol.A a12 = a11;
        if (a12 == null) {
            w22.getLogger().c(I2.DEBUG, "Transaction was dropped by Event processors.", new Object[0]);
            return tVar;
        }
        int size = ((ArrayList) a12.l0()).size();
        w22.getBeforeSendTransaction();
        int size2 = ((ArrayList) a12.l0()).size();
        if (size2 < size) {
            int i11 = size - size2;
            w22.getLogger().c(I2.DEBUG, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i11));
            w22.getClientReportRecorder().b(io.sentry.clientreport.f.BEFORE_SEND, EnumC7161k.Span, i11);
        }
        try {
            ArrayList s11 = s(e12);
            ArrayList arrayList = new ArrayList();
            Iterator it3 = s11.iterator();
            while (it3.hasNext()) {
                ((C7125b) it3.next()).getClass();
            }
            V1 m11 = m(a12, arrayList, null, q3Var, c7167l1);
            e12.c();
            return m11 != null ? w(m11, e12) : G11;
        } catch (io.sentry.exception.b | IOException e13) {
            w22.getLogger().b(I2.WARNING, e13, "Capturing transaction %s failed.", G11);
            return io.sentry.protocol.t.f68325b;
        }
    }

    @Override // io.sentry.Y
    public final boolean e() {
        return this.f66730c.e();
    }

    @Override // io.sentry.Y
    public final void f(@NotNull h3 h3Var, E e11) {
        io.sentry.util.p.b(h3Var, "Session is required.");
        String f7 = h3Var.f();
        W2 w22 = this.f66729b;
        if (f7 == null || h3Var.f().isEmpty()) {
            w22.getLogger().c(I2.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            InterfaceC7126b0 serializer = w22.getSerializer();
            io.sentry.protocol.r sdkVersion = w22.getSdkVersion();
            io.sentry.util.p.b(serializer, "Serializer is required.");
            k(new V1(null, sdkVersion, C7222x2.m(serializer, h3Var)), e11);
        } catch (IOException e12) {
            w22.getLogger().a(I2.ERROR, "Failed to capture session.", e12);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:(1:62)(1:160)|(4:153|(1:(2:156|157)(1:158))|159|157)(1:66)|67|(1:69)(1:152)|70|(1:151)(1:75)|76|(3:(4:143|(1:145)|147|(1:149))|142|(15:83|(1:87)|88|(1:140)(1:92)|(3:100|(1:102)|103)|(2:138|139)(1:105)|106|107|(2:109|110)(1:134)|111|112|113|(1:115)|(2:122|(1:124)(1:125))|126)(2:81|82))|78|(0)|83|(2:85|87)|88|(1:90)|140|(4:96|100|(0)|103)|(0)(0)|106|107|(0)(0)|111|112|113|(0)|(4:118|120|122|(0)(0))|126) */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x029c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x029d, code lost:
    
        r13 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x029f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02a1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01f2, code lost:
    
        if (r0.i() != r5) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01ff, code lost:
    
        if (r0.c() <= 0) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027f A[Catch: b -> 0x0285, b | IOException -> 0x0289, TRY_ENTER, TRY_LEAVE, TryCatch #7 {b | IOException -> 0x0289, blocks: (B:139:0x0273, B:109:0x027f), top: B:138:0x0273 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0297 A[Catch: b -> 0x029c, IOException -> 0x029f, TRY_LEAVE, TryCatch #5 {b -> 0x029c, IOException -> 0x029f, blocks: (B:113:0x028e, B:115:0x0297), top: B:112:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0273 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // io.sentry.Y
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.sentry.protocol.t g(@NotNull C7230z2 c7230z2, U u11, final E e11) {
        h3 h3Var;
        h3 h3Var2;
        C7230z2 c7230z22;
        boolean z11;
        io.sentry.protocol.t tVar;
        String u02;
        InterfaceC7142f0 i11;
        Object d11;
        V1 m11;
        C7191g featureFlags;
        io.sentry.util.p.b(c7230z2, "SentryEvent is required.");
        if (e11 == null) {
            e11 = new E();
        }
        if (x(c7230z2, e11) && u11 != null) {
            e11.b(u11.J());
        }
        W2 w22 = this.f66729b;
        ILogger logger = w22.getLogger();
        I2 i22 = I2.DEBUG;
        logger.c(i22, "Capturing event: %s", c7230z2.G());
        Throwable O11 = c7230z2.O();
        if (O11 != null && io.sentry.util.f.b(w22.getIgnoredExceptionsForType(), O11)) {
            w22.getLogger().c(i22, "Event was dropped as the exception %s is ignored", O11.getClass());
            w22.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, EnumC7161k.Error);
            return io.sentry.protocol.t.f68325b;
        }
        if (io.sentry.util.d.a(c7230z2, w22.getIgnoredErrors())) {
            w22.getLogger().c(i22, "Event was dropped as it matched a string/pattern in ignoredErrors", c7230z2.q0());
            w22.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, EnumC7161k.Error);
            return io.sentry.protocol.t.f68325b;
        }
        if (x(c7230z2, e11)) {
            if (u11 != null) {
                l(c7230z2, u11);
                if (c7230z2.u0() == null) {
                    c7230z2.F0(u11.G());
                }
                if (c7230z2.o0() == null) {
                    c7230z2.y0(u11.F());
                }
                if (u11.getLevel() != null) {
                    c7230z2.z0(u11.getLevel());
                }
                InterfaceC7134d0 m12 = u11.m();
                if (c7230z2.C().j() == null) {
                    if (m12 == null) {
                        c7230z2.C().x(t3.t(u11.H()));
                    } else {
                        c7230z2.C().x(m12.e());
                    }
                }
                if (c7230z2.C().f() == null && (featureFlags = u11.getFeatureFlags()) != null) {
                    c7230z2.C().r(featureFlags);
                }
                c7230z2 = u(c7230z2, e11, u11.B());
            }
            if (c7230z2 == null) {
                w22.getLogger().c(i22, "Event was dropped by applyScope", new Object[0]);
                return io.sentry.protocol.t.f68325b;
            }
        }
        final C7230z2 u12 = u(c7230z2, e11, w22.getEventProcessors());
        if (u12 != null) {
            W2.c beforeSend = w22.getBeforeSend();
            if (beforeSend != null) {
                try {
                    ((AW.c) beforeSend).b(u12, e11);
                } catch (Throwable th2) {
                    w22.getLogger().a(I2.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th2);
                    u12 = null;
                }
            }
            if (u12 == null) {
                w22.getLogger().c(I2.DEBUG, "Event was dropped by beforeSend", new Object[0]);
                w22.getClientReportRecorder().a(io.sentry.clientreport.f.BEFORE_SEND, EnumC7161k.Error);
            }
        }
        if (u12 != null) {
            io.sentry.util.e.b(u12, w22);
        }
        if (u12 == null) {
            return io.sentry.protocol.t.f68325b;
        }
        h3 r11 = u11 != null ? u11.r(new C7209u1.b() { // from class: io.sentry.P1
            @Override // io.sentry.C7209u1.b
            public final void a(h3 h3Var3) {
            }
        }) : null;
        if (r11 == null || !r11.j()) {
            if (io.sentry.util.h.d(e11)) {
                if (u11 != null) {
                    h3Var = u11.r(new C7209u1.b() { // from class: io.sentry.Q1
                        @Override // io.sentry.C7209u1.b
                        public final void a(h3 h3Var3) {
                            R1.i(R1.this, u12, e11, h3Var3);
                        }
                    });
                    h3Var2 = h3Var;
                } else {
                    w22.getLogger().c(I2.INFO, "Scope is null on client.captureEvent", new Object[0]);
                }
            }
            h3Var = null;
            h3Var2 = h3Var;
        } else {
            h3Var2 = null;
        }
        io.sentry.util.s a11 = w22.getSampleRate() == null ? null : io.sentry.util.u.a();
        if (w22.getSampleRate() == null || a11 == null || w22.getSampleRate().doubleValue() >= a11.d()) {
            c7230z22 = u12;
        } else {
            w22.getLogger().c(I2.DEBUG, "Event %s was dropped due to sampling decision.", u12.G());
            w22.getClientReportRecorder().a(io.sentry.clientreport.f.SAMPLE_RATE, EnumC7161k.Error);
            c7230z22 = null;
        }
        if (h3Var2 != null) {
            if (r11 != null) {
                h3.b i12 = h3Var2.i();
                h3.b bVar = h3.b.Crashed;
                if (i12 == bVar) {
                }
                if (h3Var2.c() > 0) {
                }
            }
            z11 = true;
            if (c7230z22 != null && !z11) {
                w22.getLogger().c(I2.DEBUG, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
                return io.sentry.protocol.t.f68325b;
            }
            tVar = io.sentry.protocol.t.f68325b;
            if (c7230z22 != null && c7230z22.G() != null) {
                tVar = c7230z22.G();
            }
            io.sentry.protocol.t tVar2 = tVar;
            boolean isInstance = io.sentry.hints.c.class.isInstance(e11.d("sentry:typeCheckHint"));
            boolean z12 = (io.sentry.hints.e.class.isInstance(e11.d("sentry:typeCheckHint")) || io.sentry.hints.b.class.isInstance(e11.d("sentry:typeCheckHint"))) ? false : true;
            if (c7230z22 != null && !isInstance && !z12 && (c7230z22.w0() || c7230z22.v0() != null)) {
                w22.getReplayController().k(Boolean.valueOf(c7230z22.v0() != null));
            }
            if (c7230z22 == null) {
                try {
                    u02 = c7230z22.u0();
                } catch (io.sentry.exception.b | IOException e12) {
                    Throwable th3 = e12;
                    w22.getLogger().b(I2.WARNING, th3, "Capturing event %s failed.", tVar2);
                    tVar2 = io.sentry.protocol.t.f68325b;
                    if (u11 != null) {
                    }
                    return tVar2;
                }
            } else {
                u02 = null;
            }
            m11 = m(c7230z22, c7230z22 == null ? s(e11) : null, h3Var2, t(u11, e11, c7230z22, u02), null);
            e11.c();
            if (m11 != null) {
                tVar2 = w(m11, e11);
            }
            if (u11 != null && (i11 = u11.i()) != null && io.sentry.hints.p.class.isInstance(e11.d("sentry:typeCheckHint"))) {
                d11 = e11.d("sentry:typeCheckHint");
                if (d11 instanceof io.sentry.hints.f) {
                    i11.a(n3.ABORTED, false, null);
                } else {
                    ((io.sentry.hints.f) d11).g(i11.k());
                    i11.a(n3.ABORTED, false, e11);
                }
            }
            return tVar2;
        }
        z11 = false;
        if (c7230z22 != null) {
        }
        tVar = io.sentry.protocol.t.f68325b;
        if (c7230z22 != null) {
            tVar = c7230z22.G();
        }
        io.sentry.protocol.t tVar22 = tVar;
        boolean isInstance2 = io.sentry.hints.c.class.isInstance(e11.d("sentry:typeCheckHint"));
        if (io.sentry.hints.e.class.isInstance(e11.d("sentry:typeCheckHint"))) {
        }
        if (c7230z22 != null) {
            w22.getReplayController().k(Boolean.valueOf(c7230z22.v0() != null));
        }
        if (c7230z22 == null) {
        }
        m11 = m(c7230z22, c7230z22 == null ? s(e11) : null, h3Var2, t(u11, e11, c7230z22, u02), null);
        e11.c();
        if (m11 != null) {
        }
        if (u11 != null) {
            d11 = e11.d("sentry:typeCheckHint");
            if (d11 instanceof io.sentry.hints.f) {
            }
        }
        return tVar22;
    }

    @Override // io.sentry.Y
    public final io.sentry.transport.m h() {
        return this.f66730c.h();
    }

    @Override // io.sentry.Y
    public final boolean isEnabled() {
        return this.f66728a;
    }

    @Override // io.sentry.Y
    @NotNull
    public final io.sentry.protocol.t j(@NotNull C7151h1 c7151h1) {
        io.sentry.util.p.b(c7151h1, "profileChunk is required.");
        W2 w22 = this.f66729b;
        w22.getLogger().c(I2.DEBUG, "Capturing profile chunk: %s", c7151h1.m());
        io.sentry.protocol.t m11 = c7151h1.m();
        C7188d c11 = C7188d.c(c7151h1.n(), w22);
        if (c11 != null) {
            c7151h1.q(c11);
        }
        try {
            return w(new V1(new W1(m11, w22.getSdkVersion(), null), Collections.singletonList(C7222x2.l(c7151h1, w22.getSerializer(), w22.getProfilerConverter()))), null);
        } catch (io.sentry.exception.b | IOException e11) {
            w22.getLogger().b(I2.WARNING, e11, "Capturing profile chunk %s failed.", m11);
            return io.sentry.protocol.t.f68325b;
        }
    }

    @Override // io.sentry.Y
    @NotNull
    public final io.sentry.protocol.t k(@NotNull V1 v12, E e11) {
        try {
            e11.c();
            return w(v12, e11);
        } catch (IOException e12) {
            this.f66729b.getLogger().a(I2.ERROR, "Failed to capture envelope.", e12);
            return io.sentry.protocol.t.f68325b;
        }
    }

    public final void q(@NotNull M2 m22) {
        try {
            w(n(m22), null);
        } catch (IOException e11) {
            this.f66729b.getLogger().b(I2.WARNING, e11, "Capturing logs failed.", new Object[0]);
        }
    }

    public final void r(@NotNull R2 r22) {
        try {
            w(o(r22), null);
        } catch (IOException e11) {
            this.f66729b.getLogger().b(I2.WARNING, e11, "Capturing metrics failed.", new Object[0]);
        }
    }
}
