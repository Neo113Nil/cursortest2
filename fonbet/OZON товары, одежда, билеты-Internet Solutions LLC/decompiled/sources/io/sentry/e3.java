package io.sentry;

import com.google.android.gms.common.Scopes;
import io.sentry.B0;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.C7107h;
import io.sentry.protocol.C7187c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class e3 implements InterfaceC7142f0 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final i3 f67867b;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C7229z1 f67869d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private String f67870e;

    /* renamed from: g, reason: collision with root package name */
    private volatile TimerTask f67872g;

    /* renamed from: h, reason: collision with root package name */
    private volatile TimerTask f67873h;

    /* renamed from: i, reason: collision with root package name */
    private volatile Timer f67874i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f67875j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f67876k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f67877l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f67878m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.D f67879n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final EnumC7162k0 f67880o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final C7187c f67881p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC7157j f67882q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final u3 f67883r;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.protocol.t f67866a = new io.sentry.protocol.t();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList f67868c = new CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private b f67871f = b.f67885c;

    final class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            e3.v(e3.this);
        }
    }

    private static final class b {

        /* renamed from: c, reason: collision with root package name */
        static final b f67885c = new b(false, null);

        /* renamed from: a, reason: collision with root package name */
        private final boolean f67886a;

        /* renamed from: b, reason: collision with root package name */
        private final n3 f67887b;

        private b(boolean z11, n3 n3Var) {
            this.f67886a = z11;
            this.f67887b = n3Var;
        }

        @NotNull
        static b c(n3 n3Var) {
            return new b(true, n3Var);
        }
    }

    e3(@NotNull t3 t3Var, @NotNull C7229z1 c7229z1, @NotNull u3 u3Var, InterfaceC7157j interfaceC7157j) {
        this.f67874i = null;
        io.sentry.util.a aVar = new io.sentry.util.a();
        this.f67875j = aVar;
        this.f67876k = new io.sentry.util.a();
        this.f67877l = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f67878m = atomicBoolean;
        C7187c c7187c = new C7187c();
        this.f67881p = c7187c;
        i3 i3Var = new i3(t3Var, this, c7229z1, u3Var);
        this.f67867b = i3Var;
        this.f67870e = t3Var.u();
        this.f67880o = t3Var.d();
        this.f67869d = c7229z1;
        Boolean bool = Boolean.TRUE;
        interfaceC7157j = bool.equals(i3Var.E()) ? interfaceC7157j : null;
        this.f67882q = interfaceC7157j;
        this.f67879n = t3Var.w();
        this.f67883r = u3Var;
        J(i3Var);
        io.sentry.protocol.t D11 = D();
        if (!D11.equals(io.sentry.protocol.t.f68325b) && bool.equals(i3Var.E())) {
            c7187c.l(new C7155i1(D11), Scopes.PROFILE);
        }
        if (interfaceC7157j != null) {
            interfaceC7157j.a(this);
        }
        if (u3Var.i() == null && u3Var.h() == null) {
            return;
        }
        this.f67874i = new Timer(true);
        Long h11 = u3Var.h();
        if (h11 != null) {
            InterfaceC7097a0 a11 = aVar.a();
            try {
                if (this.f67874i != null) {
                    x();
                    atomicBoolean.set(true);
                    this.f67873h = new f3(this);
                    try {
                        this.f67874i.schedule(this.f67873h, h11.longValue());
                    } catch (Throwable th2) {
                        this.f67869d.getOptions().getLogger().a(I2.WARNING, "Failed to schedule finish timer", th2);
                        I();
                    }
                }
                a11.close();
            } catch (Throwable th3) {
                try {
                    a11.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        d();
    }

    @NotNull
    private io.sentry.protocol.t D() {
        i3 i3Var = this.f67867b;
        return !i3Var.e().i().equals(io.sentry.protocol.t.f68325b) ? i3Var.e().i() : this.f67869d.getOptions().getContinuousProfiler().d();
    }

    private boolean H() {
        ListIterator listIterator = this.f67868c.listIterator();
        while (listIterator.hasNext()) {
            i3 i3Var = (i3) listIterator.next();
            if (!i3Var.h() && i3Var.r() == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        n3 status = this.f67867b.getStatus();
        if (status == null) {
            status = n3.DEADLINE_EXCEEDED;
        }
        a(status, this.f67883r.i() != null, null);
        this.f67878m.set(false);
    }

    private void J(@NotNull i3 i3Var) {
        io.sentry.util.thread.a threadChecker = this.f67869d.getOptions().getThreadChecker();
        io.sentry.protocol.t D11 = D();
        if (!D11.equals(io.sentry.protocol.t.f68325b) && Boolean.TRUE.equals(i3Var.E())) {
            i3Var.c(D11.toString(), "profiler_id");
        }
        i3Var.c(String.valueOf(threadChecker.c()), "thread.id");
        i3Var.c(threadChecker.b(), "thread.name");
    }

    public static void t(e3 e3Var, i3 i3Var) {
        InterfaceC7157j interfaceC7157j = e3Var.f67882q;
        if (interfaceC7157j != null) {
            interfaceC7157j.c(i3Var);
        }
        b bVar = e3Var.f67871f;
        u3 u3Var = e3Var.f67883r;
        if (u3Var.i() == null) {
            if (bVar.f67886a) {
                e3Var.f(bVar.f67887b, null);
            }
        } else if (!u3Var.m() || e3Var.H()) {
            e3Var.d();
        }
    }

    public static void u(e3 e3Var, k3 k3Var, AtomicReference atomicReference, i3 i3Var) {
        if (k3Var != null) {
            k3Var.e(i3Var);
        }
        C7107h j11 = e3Var.f67883r.j();
        if (j11 != null) {
            ActivityLifecycleIntegration.o(j11.f67101a, j11.f67102b, j11.f67103c, e3Var);
        }
        InterfaceC7157j interfaceC7157j = e3Var.f67882q;
        if (interfaceC7157j != null) {
            atomicReference.set(interfaceC7157j.b(e3Var));
        }
    }

    static void v(e3 e3Var) {
        n3 status = e3Var.f67867b.getStatus();
        if (status == null) {
            status = n3.OK;
        }
        e3Var.f(status, null);
        e3Var.f67877l.set(false);
    }

    private void x() {
        InterfaceC7097a0 a11 = this.f67875j.a();
        try {
            if (this.f67873h != null) {
                this.f67873h.cancel();
                this.f67878m.set(false);
                this.f67873h = null;
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

    private void y() {
        InterfaceC7097a0 a11 = this.f67875j.a();
        try {
            if (this.f67872g != null) {
                this.f67872g.cancel();
                this.f67877l.set(false);
                this.f67872g = null;
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

    @NotNull
    public final List<i3> A() {
        return this.f67868c;
    }

    @NotNull
    public final C7187c B() {
        return this.f67881p;
    }

    public final Map<String, Object> C() {
        return this.f67867b.t();
    }

    @NotNull
    final i3 E() {
        return this.f67867b;
    }

    @NotNull
    public final List<i3> F() {
        return this.f67868c;
    }

    @NotNull
    public final io.sentry.protocol.D G() {
        return this.f67879n;
    }

    public final void K(@NotNull String str, @NotNull Long l11, @NotNull B0.a aVar) {
        if (((ConcurrentHashMap) this.f67867b.u()).containsKey(str)) {
            return;
        }
        b(str, l11, aVar);
    }

    public final void L(@NotNull String str, @NotNull Number number) {
        if (((ConcurrentHashMap) this.f67867b.u()).containsKey(str)) {
            return;
        }
        l(str, number);
    }

    @NotNull
    final InterfaceC7134d0 M(@NotNull l3 l3Var, @NotNull String str, String str2, T1 t12, @NotNull EnumC7162k0 enumC7162k0, @NotNull m3 m3Var) {
        i3 i3Var = this.f67867b;
        j3 a11 = i3Var.e().a(str, l3Var);
        a11.f68021f = str2;
        a11.q(enumC7162k0);
        m3Var.f(t12);
        if (i3Var.h()) {
            return W0.t();
        }
        if (!this.f67880o.equals(a11.d())) {
            return W0.t();
        }
        C7229z1 c7229z1 = this.f67869d;
        if (io.sentry.util.v.b(m3Var.f68089d, c7229z1.getOptions().getIgnoredSpanOrigins())) {
            return W0.t();
        }
        l3 g10 = a11.g();
        String str3 = a11.f68021f;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f67868c;
        int size = copyOnWriteArrayList.size();
        int maxSpans = c7229z1.getOptions().getMaxSpans();
        String str4 = a11.f68020e;
        if (size >= maxSpans) {
            c7229z1.getOptions().getLogger().c(I2.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str4, str3);
            return W0.t();
        }
        io.sentry.util.p.b(g10, "parentSpanId is required");
        io.sentry.util.p.b(str4, "operation is required");
        y();
        i3 i3Var2 = new i3(this, this.f67869d, a11, m3Var, new B90.E(this, 5));
        J(i3Var2);
        copyOnWriteArrayList.add(i3Var2);
        InterfaceC7157j interfaceC7157j = this.f67882q;
        if (interfaceC7157j != null) {
            interfaceC7157j.e(i3Var2);
        }
        return i3Var2;
    }

    @Override // io.sentry.InterfaceC7142f0
    @NotNull
    public final void a(@NotNull n3 n3Var, boolean z11, E e11) {
        if (this.f67867b.h()) {
            return;
        }
        T1 now = this.f67869d.getOptions().getDateProvider().now();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.f67868c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            i3 i3Var = (i3) listIterator.previous();
            i3Var.F(null);
            i3Var.f(n3Var, now);
        }
        z(n3Var, now, z11, e11);
    }

    @Override // io.sentry.InterfaceC7134d0
    public final void b(@NotNull String str, @NotNull Long l11, @NotNull B0.a aVar) {
        this.f67867b.b(str, l11, aVar);
    }

    @Override // io.sentry.InterfaceC7134d0
    public final void c(Object obj, String str) {
        i3 i3Var = this.f67867b;
        if (i3Var.h()) {
            this.f67869d.getOptions().getLogger().c(I2.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            i3Var.c(obj, str);
        }
    }

    @Override // io.sentry.InterfaceC7142f0
    public final void d() {
        Long i11;
        InterfaceC7097a0 a11 = this.f67875j.a();
        try {
            if (this.f67874i != null && (i11 = this.f67883r.i()) != null) {
                y();
                this.f67877l.set(true);
                this.f67872g = new a();
                try {
                    this.f67874i.schedule(this.f67872g, i11.longValue());
                } catch (Throwable th2) {
                    this.f67869d.getOptions().getLogger().a(I2.WARNING, "Failed to schedule finish timer", th2);
                    n3 status = this.f67867b.getStatus();
                    if (status == null) {
                        status = n3.OK;
                    }
                    f(status, null);
                    this.f67877l.set(false);
                }
            }
            a11.close();
        } catch (Throwable th3) {
            try {
                a11.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.InterfaceC7134d0
    @NotNull
    public final j3 e() {
        return this.f67867b.e();
    }

    @Override // io.sentry.InterfaceC7134d0
    public final void f(n3 n3Var, T1 t12) {
        z(n3Var, t12, true, null);
    }

    @Override // io.sentry.InterfaceC7134d0
    public final void finish() {
        f(this.f67867b.getStatus(), null);
    }

    @Override // io.sentry.InterfaceC7134d0
    @NotNull
    public final InterfaceC7134d0 g(String str, T1 t12, @NotNull EnumC7162k0 enumC7162k0) {
        return q("activity.load", str, t12, enumC7162k0, new m3());
    }

    @Override // io.sentry.InterfaceC7134d0
    public final String getDescription() {
        return this.f67867b.getDescription();
    }

    @Override // io.sentry.InterfaceC7142f0
    @NotNull
    public final String getName() {
        return this.f67870e;
    }

    @Override // io.sentry.InterfaceC7134d0
    public final n3 getStatus() {
        return this.f67867b.getStatus();
    }

    @Override // io.sentry.InterfaceC7134d0
    public final boolean h() {
        return this.f67867b.h();
    }

    @Override // io.sentry.InterfaceC7142f0
    public final void i(@NotNull String str, @NotNull io.sentry.protocol.D d11) {
        if (this.f67867b.h()) {
            this.f67869d.getOptions().getLogger().c(I2.DEBUG, "The transaction is already finished. Name %s cannot be set", str);
        } else {
            this.f67870e = str;
            this.f67879n = d11;
        }
    }

    @Override // io.sentry.InterfaceC7134d0
    public final void j(String str) {
        i3 i3Var = this.f67867b;
        if (i3Var.h()) {
            this.f67869d.getOptions().getLogger().c(I2.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            i3Var.j(str);
        }
    }

    @Override // io.sentry.InterfaceC7142f0
    @NotNull
    public final io.sentry.protocol.t k() {
        return this.f67866a;
    }

    @Override // io.sentry.InterfaceC7134d0
    public final void l(@NotNull String str, @NotNull Number number) {
        this.f67867b.l(str, number);
    }

    @Override // io.sentry.InterfaceC7134d0
    public final q3 m() {
        C7229z1 c7229z1 = this.f67869d;
        if (!c7229z1.getOptions().isTraceSampling()) {
            return null;
        }
        i3 i3Var = this.f67867b;
        C7133d c7133d = i3Var.e().f68028m;
        if (c7133d == null) {
            return null;
        }
        InterfaceC7097a0 a11 = this.f67876k.a();
        try {
            if (c7133d.f()) {
                AtomicReference atomicReference = new AtomicReference();
                c7229z1.m(new B90.F(atomicReference, 3));
                c7133d.k(i3Var.e().o(), (io.sentry.protocol.t) atomicReference.get(), c7229z1.getOptions(), i3Var.y(), this.f67870e, this.f67879n);
                c7133d.a();
            }
            a11.close();
            return c7133d.l();
        } finally {
        }
    }

    @Override // io.sentry.InterfaceC7134d0
    public final void n(n3 n3Var) {
        f(n3Var, null);
    }

    @Override // io.sentry.InterfaceC7134d0
    @NotNull
    public final P0 o() {
        this.f67869d.m(new B90.G(this));
        return P0.c();
    }

    @Override // io.sentry.InterfaceC7142f0
    public final InterfaceC7134d0 p() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.f67868c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            i3 i3Var = (i3) listIterator.previous();
            if (!i3Var.h()) {
                return i3Var;
            }
        }
        return null;
    }

    @Override // io.sentry.InterfaceC7134d0
    @NotNull
    public final InterfaceC7134d0 q(@NotNull String str, String str2, T1 t12, @NotNull EnumC7162k0 enumC7162k0, @NotNull m3 m3Var) {
        if (!this.f67867b.h() && this.f67880o.equals(enumC7162k0)) {
            int size = this.f67868c.size();
            C7229z1 c7229z1 = this.f67869d;
            if (size < c7229z1.getOptions().getMaxSpans()) {
                return this.f67867b.q(str, str2, t12, enumC7162k0, m3Var);
            }
            c7229z1.getOptions().getLogger().c(I2.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
            return W0.t();
        }
        return W0.t();
    }

    @Override // io.sentry.InterfaceC7134d0
    public final T1 r() {
        return this.f67867b.r();
    }

    @Override // io.sentry.InterfaceC7134d0
    @NotNull
    public final T1 s() {
        return this.f67867b.s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [io.sentry.c3] */
    public final void z(n3 n3Var, T1 t12, boolean z11, E e11) {
        T1 r11 = this.f67867b.r();
        if (t12 == null) {
            t12 = r11;
        }
        if (t12 == null) {
            t12 = this.f67869d.getOptions().getDateProvider().now();
        }
        Iterator it = this.f67868c.iterator();
        while (it.hasNext()) {
            ((i3) it.next()).w().getClass();
        }
        this.f67871f = b.c(n3Var);
        if (this.f67867b.h()) {
            return;
        }
        if (!this.f67883r.m() || H()) {
            final AtomicReference atomicReference = new AtomicReference();
            final k3 z12 = this.f67867b.z();
            this.f67867b.F(new k3() { // from class: io.sentry.c3
                @Override // io.sentry.k3
                public final void e(i3 i3Var) {
                    e3.u(e3.this, z12, atomicReference, i3Var);
                }
            });
            this.f67867b.f(this.f67871f.f67887b, t12);
            Boolean bool = Boolean.TRUE;
            C7167l1 b11 = (bool.equals(this.f67867b.E()) && bool.equals(this.f67867b.D())) ? this.f67869d.getOptions().getTransactionProfiler().b(this, (List) atomicReference.get(), this.f67869d.getOptions()) : null;
            if (this.f67869d.getOptions().isContinuousProfilingEnabled()) {
                EnumC7159j1 profileLifecycle = this.f67869d.getOptions().getProfileLifecycle();
                EnumC7159j1 enumC7159j1 = EnumC7159j1.TRACE;
                if (profileLifecycle == enumC7159j1 && this.f67867b.e().i().equals(io.sentry.protocol.t.f68325b)) {
                    this.f67869d.getOptions().getContinuousProfiler().e(enumC7159j1);
                }
            }
            if (atomicReference.get() != null) {
                ((List) atomicReference.get()).clear();
            }
            this.f67869d.m(new An.b(this));
            io.sentry.protocol.A a11 = new io.sentry.protocol.A(this);
            if (this.f67874i != null) {
                InterfaceC7097a0 a12 = this.f67875j.a();
                try {
                    if (this.f67874i != null) {
                        y();
                        x();
                        this.f67874i.cancel();
                        this.f67874i = null;
                    }
                    a12.close();
                } catch (Throwable th2) {
                    try {
                        a12.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            if (z11 && this.f67868c.isEmpty() && this.f67883r.i() != null) {
                this.f67869d.getOptions().getLogger().c(I2.DEBUG, "Dropping idle transaction %s because it has no child spans", this.f67870e);
            } else {
                ((HashMap) a11.k0()).putAll(this.f67867b.u());
                this.f67869d.v(a11, m(), e11, b11);
            }
        }
    }
}
