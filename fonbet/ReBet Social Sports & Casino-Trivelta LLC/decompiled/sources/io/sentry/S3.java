package io.sentry;

import io.sentry.L1;
import io.sentry.protocol.C4802d;
import io.sentry.util.AbstractC4845c;
import io.sentry.util.C4843a;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class S3 implements InterfaceC4790o0 {

    /* renamed from: b, reason: collision with root package name */
    public final Z3 f50489b;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4740e0 f50491d;

    /* renamed from: e, reason: collision with root package name */
    public String f50492e;

    /* renamed from: g, reason: collision with root package name */
    public volatile TimerTask f50494g;

    /* renamed from: h, reason: collision with root package name */
    public volatile TimerTask f50495h;

    /* renamed from: i, reason: collision with root package name */
    public volatile Timer f50496i;

    /* renamed from: n, reason: collision with root package name */
    public io.sentry.protocol.E f50501n;

    /* renamed from: o, reason: collision with root package name */
    public final EnumC4832t0 f50502o;

    /* renamed from: p, reason: collision with root package name */
    public final C4802d f50503p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC4764j f50504q;

    /* renamed from: r, reason: collision with root package name */
    public final o4 f50505r;

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.u f50488a = new io.sentry.protocol.u();

    /* renamed from: c, reason: collision with root package name */
    public final List f50490c = new CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public c f50493f = c.f50508c;

    /* renamed from: j, reason: collision with root package name */
    public final C4843a f50497j = new C4843a();

    /* renamed from: k, reason: collision with root package name */
    public final C4843a f50498k = new C4843a();

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f50499l = new AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f50500m = new AtomicBoolean(false);

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            S3.this.T();
        }
    }

    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            S3.this.S();
        }
    }

    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final c f50508c = d();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f50509a;

        /* renamed from: b, reason: collision with root package name */
        public final f4 f50510b;

        public c(boolean z10, f4 f4Var) {
            this.f50509a = z10;
            this.f50510b = f4Var;
        }

        public static c c(f4 f4Var) {
            return new c(true, f4Var);
        }

        public static c d() {
            return new c(false, null);
        }
    }

    public S3(m4 m4Var, InterfaceC4740e0 interfaceC4740e0, o4 o4Var, InterfaceC4764j interfaceC4764j) {
        this.f50496i = null;
        C4802d c4802d = new C4802d();
        this.f50503p = c4802d;
        io.sentry.util.w.c(m4Var, "context is required");
        io.sentry.util.w.c(interfaceC4740e0, "scopes are required");
        Z3 z32 = new Z3(m4Var, this, interfaceC4740e0, o4Var);
        this.f50489b = z32;
        this.f50492e = m4Var.A();
        this.f50502o = m4Var.f();
        this.f50491d = interfaceC4740e0;
        Boolean bool = Boolean.TRUE;
        interfaceC4764j = bool.equals(b()) ? interfaceC4764j : null;
        this.f50504q = interfaceC4764j;
        this.f50501n = m4Var.C();
        this.f50505r = o4Var;
        V(z32);
        io.sentry.protocol.u L10 = L();
        if (!L10.equals(io.sentry.protocol.u.f52477c) && bool.equals(b())) {
            c4802d.w(new C4875z1(L10));
        }
        if (interfaceC4764j != null) {
            interfaceC4764j.e(this);
        }
        if (o4Var.m() == null && o4Var.l() == null) {
            return;
        }
        this.f50496i = new Timer(true);
        U();
        r();
    }

    public static /* synthetic */ void A(S3 s32, c4 c4Var, AtomicReference atomicReference, Z3 z32) {
        if (c4Var != null) {
            s32.getClass();
            c4Var.a(z32);
        }
        n4 o10 = s32.f50505r.o();
        if (o10 != null) {
            o10.a(s32);
        }
        InterfaceC4764j interfaceC4764j = s32.f50504q;
        if (interfaceC4764j != null) {
            atomicReference.set(interfaceC4764j.d(s32));
        }
    }

    public static /* synthetic */ void w(S3 s32, InterfaceC4730c0 interfaceC4730c0, InterfaceC4790o0 interfaceC4790o0) {
        s32.getClass();
        if (interfaceC4790o0 == s32) {
            interfaceC4730c0.H();
        }
    }

    public static /* synthetic */ void x(final S3 s32, final InterfaceC4730c0 interfaceC4730c0) {
        s32.getClass();
        interfaceC4730c0.W(new L1.c() { // from class: io.sentry.R3
            @Override // io.sentry.L1.c
            public final void a(InterfaceC4790o0 interfaceC4790o0) {
                S3.w(S3.this, interfaceC4730c0, interfaceC4790o0);
            }
        });
    }

    public static /* synthetic */ void y(S3 s32, InterfaceC4730c0 interfaceC4730c0) {
        s32.getClass();
        interfaceC4730c0.D(s32);
    }

    public static /* synthetic */ void z(S3 s32, Z3 z32) {
        InterfaceC4764j interfaceC4764j = s32.f50504q;
        if (interfaceC4764j != null) {
            interfaceC4764j.a(z32);
        }
        c cVar = s32.f50493f;
        if (s32.f50505r.m() == null) {
            if (cVar.f50509a) {
                s32.l(cVar.f50510b);
            }
        } else if (!s32.f50505r.r() || s32.Q()) {
            s32.r();
        }
    }

    public final void D() {
        InterfaceC4765j0 d10 = this.f50497j.d();
        try {
            if (this.f50495h != null) {
                this.f50495h.cancel();
                this.f50500m.set(false);
                this.f50495h = null;
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

    public final void E() {
        InterfaceC4765j0 d10 = this.f50497j.d();
        try {
            if (this.f50494g != null) {
                this.f50494g.cancel();
                this.f50499l.set(false);
                this.f50494g = null;
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

    public final InterfaceC4780m0 F(a4 a4Var, e4 e4Var) {
        if (this.f50489b.d()) {
            return C4771k1.v();
        }
        if (!this.f50502o.equals(a4Var.f())) {
            return C4771k1.v();
        }
        if (io.sentry.util.C.b(this.f50491d.i().getIgnoredSpanOrigins(), e4Var.a())) {
            return C4771k1.v();
        }
        d4 i10 = a4Var.i();
        String g10 = a4Var.g();
        String d10 = a4Var.d();
        if (this.f50490c.size() >= this.f50491d.i().getMaxSpans()) {
            this.f50491d.i().getLogger().c(EnumC4788n3.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", g10, d10);
            return C4771k1.v();
        }
        io.sentry.util.w.c(i10, "parentSpanId is required");
        io.sentry.util.w.c(g10, "operation is required");
        E();
        Z3 z32 = new Z3(this, this.f50491d, a4Var, e4Var, new c4() { // from class: io.sentry.O3
            @Override // io.sentry.c4
            public final void a(Z3 z33) {
                S3.z(S3.this, z33);
            }
        });
        V(z32);
        this.f50490c.add(z32);
        InterfaceC4764j interfaceC4764j = this.f50504q;
        if (interfaceC4764j != null) {
            interfaceC4764j.b(z32);
        }
        return z32;
    }

    public final InterfaceC4780m0 G(String str, String str2, AbstractC4856v2 abstractC4856v2, EnumC4832t0 enumC4832t0, e4 e4Var) {
        if (this.f50489b.d()) {
            return C4771k1.v();
        }
        if (!this.f50502o.equals(enumC4832t0)) {
            return C4771k1.v();
        }
        if (this.f50490c.size() < this.f50491d.i().getMaxSpans()) {
            return this.f50489b.q(str, str2, abstractC4856v2, enumC4832t0, e4Var);
        }
        this.f50491d.i().getLogger().c(EnumC4788n3.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return C4771k1.v();
    }

    public void H(f4 f4Var, AbstractC4856v2 abstractC4856v2, boolean z10, J j10) {
        AbstractC4856v2 s10 = this.f50489b.s();
        if (abstractC4856v2 == null) {
            abstractC4856v2 = s10;
        }
        if (abstractC4856v2 == null) {
            abstractC4856v2 = this.f50491d.i().getDateProvider().now();
        }
        for (Z3 z32 : this.f50490c) {
            if (z32.z().d()) {
                z32.t(f4Var != null ? f4Var : a().f50599g, abstractC4856v2);
            }
        }
        this.f50493f = c.c(f4Var);
        if (this.f50489b.d()) {
            return;
        }
        if (!this.f50505r.r() || Q()) {
            final AtomicReference atomicReference = new AtomicReference();
            final c4 C10 = this.f50489b.C();
            this.f50489b.H(new c4() { // from class: io.sentry.M3
                @Override // io.sentry.c4
                public final void a(Z3 z33) {
                    S3.A(S3.this, C10, atomicReference, z33);
                }
            });
            this.f50489b.t(this.f50493f.f50510b, abstractC4856v2);
            Boolean bool = Boolean.TRUE;
            C1 b10 = (bool.equals(b()) && bool.equals(R())) ? this.f50491d.i().getTransactionProfiler().b(this, (List) atomicReference.get(), this.f50491d.i()) : null;
            if (this.f50491d.i().isContinuousProfilingEnabled()) {
                A1 profileLifecycle = this.f50491d.i().getProfileLifecycle();
                A1 a12 = A1.TRACE;
                if (profileLifecycle == a12 && this.f50489b.a().k().equals(io.sentry.protocol.u.f52477c)) {
                    this.f50491d.i().getContinuousProfiler().e(a12);
                }
            }
            if (atomicReference.get() != null) {
                ((List) atomicReference.get()).clear();
            }
            this.f50491d.l(new N1() { // from class: io.sentry.N3
                @Override // io.sentry.N1
                public final void a(InterfaceC4730c0 interfaceC4730c0) {
                    S3.x(S3.this, interfaceC4730c0);
                }
            });
            io.sentry.protocol.B b11 = new io.sentry.protocol.B(this);
            if (this.f50496i != null) {
                InterfaceC4765j0 d10 = this.f50497j.d();
                try {
                    if (this.f50496i != null) {
                        E();
                        D();
                        this.f50496i.cancel();
                        this.f50496i = null;
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
            if (z10 && this.f50490c.isEmpty() && this.f50505r.m() != null) {
                this.f50491d.i().getLogger().c(EnumC4788n3.DEBUG, "Dropping idle transaction %s because it has no child spans", this.f50492e);
            } else {
                b11.m0().putAll(this.f50489b.x());
                this.f50491d.A(b11, j(), j10, b10);
            }
        }
    }

    public List I() {
        return this.f50490c;
    }

    public C4802d J() {
        return this.f50503p;
    }

    public Map K() {
        return this.f50489b.v();
    }

    public final io.sentry.protocol.u L() {
        return !this.f50489b.a().k().equals(io.sentry.protocol.u.f52477c) ? this.f50489b.a().k() : this.f50491d.i().getContinuousProfiler().f();
    }

    public Z3 M() {
        return this.f50489b;
    }

    public l4 N() {
        return this.f50489b.B();
    }

    public List O() {
        return this.f50490c;
    }

    public io.sentry.protocol.E P() {
        return this.f50501n;
    }

    public final boolean Q() {
        ListIterator listIterator = this.f50490c.listIterator();
        while (listIterator.hasNext()) {
            Z3 z32 = (Z3) listIterator.next();
            if (!z32.d() && z32.s() == null) {
                return false;
            }
        }
        return true;
    }

    public Boolean R() {
        return this.f50489b.G();
    }

    public final void S() {
        f4 status = getStatus();
        if (status == null) {
            status = f4.DEADLINE_EXCEEDED;
        }
        f(status, this.f50505r.m() != null, null);
        this.f50500m.set(false);
    }

    public final void T() {
        f4 status = getStatus();
        if (status == null) {
            status = f4.OK;
        }
        l(status);
        this.f50499l.set(false);
    }

    public final void U() {
        Long l10 = this.f50505r.l();
        if (l10 != null) {
            InterfaceC4765j0 d10 = this.f50497j.d();
            try {
                if (this.f50496i != null) {
                    D();
                    this.f50500m.set(true);
                    this.f50495h = new b();
                    try {
                        this.f50496i.schedule(this.f50495h, l10.longValue());
                    } catch (Throwable th2) {
                        this.f50491d.i().getLogger().b(EnumC4788n3.WARNING, "Failed to schedule finish timer", th2);
                        S();
                    }
                }
                if (d10 != null) {
                    d10.close();
                }
            } catch (Throwable th3) {
                if (d10 != null) {
                    try {
                        d10.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    public final void V(InterfaceC4780m0 interfaceC4780m0) {
        io.sentry.util.thread.a threadChecker = this.f50491d.i().getThreadChecker();
        io.sentry.protocol.u L10 = L();
        if (!L10.equals(io.sentry.protocol.u.f52477c) && Boolean.TRUE.equals(interfaceC4780m0.b())) {
            interfaceC4780m0.k("profiler_id", L10.toString());
        }
        interfaceC4780m0.k("thread.id", String.valueOf(threadChecker.c()));
        interfaceC4780m0.k("thread.name", threadChecker.b());
    }

    public void W(String str, Number number) {
        if (this.f50489b.x().containsKey(str)) {
            return;
        }
        i(str, number);
    }

    public void X(String str, Number number, K0 k02) {
        if (this.f50489b.x().containsKey(str)) {
            return;
        }
        o(str, number, k02);
    }

    public InterfaceC4780m0 Y(d4 d4Var, String str, String str2, AbstractC4856v2 abstractC4856v2, EnumC4832t0 enumC4832t0, e4 e4Var) {
        a4 a10 = a().a(str, d4Var, null);
        a10.s(str2);
        a10.t(enumC4832t0);
        e4Var.i(abstractC4856v2);
        return F(a10, e4Var);
    }

    public final void Z(C4734d c4734d) {
        InterfaceC4765j0 d10 = this.f50498k.d();
        try {
            if (c4734d.x()) {
                final AtomicReference atomicReference = new AtomicReference();
                this.f50491d.l(new N1() { // from class: io.sentry.P3
                    @Override // io.sentry.N1
                    public final void a(InterfaceC4730c0 interfaceC4730c0) {
                        atomicReference.set(interfaceC4730c0.r());
                    }
                });
                c4734d.Q(a().q(), (io.sentry.protocol.u) atomicReference.get(), this.f50491d.i(), N(), getName(), P());
                c4734d.d();
            }
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 == null) {
                throw th2;
            }
            try {
                d10.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    @Override // io.sentry.InterfaceC4780m0
    public a4 a() {
        return this.f50489b.a();
    }

    @Override // io.sentry.InterfaceC4780m0
    public Boolean b() {
        return this.f50489b.b();
    }

    @Override // io.sentry.InterfaceC4780m0
    public void c(String str) {
        if (this.f50489b.d()) {
            this.f50491d.i().getLogger().c(EnumC4788n3.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            this.f50489b.c(str);
        }
    }

    @Override // io.sentry.InterfaceC4780m0
    public boolean d() {
        return this.f50489b.d();
    }

    @Override // io.sentry.InterfaceC4780m0
    public L3 e() {
        return this.f50489b.e();
    }

    @Override // io.sentry.InterfaceC4790o0
    public void f(f4 f4Var, boolean z10, J j10) {
        if (d()) {
            return;
        }
        AbstractC4856v2 now = this.f50491d.i().getDateProvider().now();
        ListIterator d10 = AbstractC4845c.d((CopyOnWriteArrayList) this.f50490c);
        while (d10.hasPrevious()) {
            Z3 z32 = (Z3) d10.previous();
            z32.H(null);
            z32.t(f4Var, now);
        }
        H(f4Var, now, z10, j10);
    }

    @Override // io.sentry.InterfaceC4780m0
    public void g() {
        l(getStatus());
    }

    @Override // io.sentry.InterfaceC4780m0
    public String getDescription() {
        return this.f50489b.getDescription();
    }

    @Override // io.sentry.InterfaceC4790o0
    public String getName() {
        return this.f50492e;
    }

    @Override // io.sentry.InterfaceC4780m0
    public f4 getStatus() {
        return this.f50489b.getStatus();
    }

    @Override // io.sentry.InterfaceC4790o0
    public io.sentry.protocol.u h() {
        return this.f50488a;
    }

    @Override // io.sentry.InterfaceC4780m0
    public void i(String str, Number number) {
        this.f50489b.i(str, number);
    }

    @Override // io.sentry.InterfaceC4780m0
    public j4 j() {
        C4734d b10;
        if (!this.f50491d.i().isTraceSampling() || (b10 = a().b()) == null) {
            return null;
        }
        Z(b10);
        return b10.T();
    }

    @Override // io.sentry.InterfaceC4780m0
    public void k(String str, Object obj) {
        if (this.f50489b.d()) {
            this.f50491d.i().getLogger().c(EnumC4788n3.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            this.f50489b.k(str, obj);
        }
    }

    @Override // io.sentry.InterfaceC4780m0
    public void l(f4 f4Var) {
        t(f4Var, null);
    }

    @Override // io.sentry.InterfaceC4780m0
    public C4739e m(List list) {
        C4734d b10;
        if (!this.f50491d.i().isTraceSampling() || (b10 = a().b()) == null) {
            return null;
        }
        Z(b10);
        return C4739e.a(b10, list);
    }

    @Override // io.sentry.InterfaceC4780m0
    public InterfaceC4765j0 makeCurrent() {
        this.f50491d.l(new N1() { // from class: io.sentry.Q3
            @Override // io.sentry.N1
            public final void a(InterfaceC4730c0 interfaceC4730c0) {
                S3.y(S3.this, interfaceC4730c0);
            }
        });
        return C4731c1.d();
    }

    @Override // io.sentry.InterfaceC4780m0
    public InterfaceC4780m0 n(String str, String str2, AbstractC4856v2 abstractC4856v2, EnumC4832t0 enumC4832t0) {
        return q(str, str2, abstractC4856v2, enumC4832t0, new e4());
    }

    @Override // io.sentry.InterfaceC4780m0
    public void o(String str, Number number, K0 k02) {
        this.f50489b.o(str, number, k02);
    }

    @Override // io.sentry.InterfaceC4790o0
    public InterfaceC4780m0 p() {
        ListIterator d10 = AbstractC4845c.d((CopyOnWriteArrayList) this.f50490c);
        while (d10.hasPrevious()) {
            Z3 z32 = (Z3) d10.previous();
            if (!z32.d()) {
                return z32;
            }
        }
        return null;
    }

    @Override // io.sentry.InterfaceC4780m0
    public InterfaceC4780m0 q(String str, String str2, AbstractC4856v2 abstractC4856v2, EnumC4832t0 enumC4832t0, e4 e4Var) {
        return G(str, str2, abstractC4856v2, enumC4832t0, e4Var);
    }

    @Override // io.sentry.InterfaceC4790o0
    public void r() {
        Long m10;
        InterfaceC4765j0 d10 = this.f50497j.d();
        try {
            if (this.f50496i != null && (m10 = this.f50505r.m()) != null) {
                E();
                this.f50499l.set(true);
                this.f50494g = new a();
                try {
                    this.f50496i.schedule(this.f50494g, m10.longValue());
                } catch (Throwable th2) {
                    this.f50491d.i().getLogger().b(EnumC4788n3.WARNING, "Failed to schedule finish timer", th2);
                    T();
                }
            }
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th3) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // io.sentry.InterfaceC4780m0
    public AbstractC4856v2 s() {
        return this.f50489b.s();
    }

    @Override // io.sentry.InterfaceC4780m0
    public void t(f4 f4Var, AbstractC4856v2 abstractC4856v2) {
        H(f4Var, abstractC4856v2, true, null);
    }

    @Override // io.sentry.InterfaceC4780m0
    public AbstractC4856v2 u() {
        return this.f50489b.u();
    }
}
