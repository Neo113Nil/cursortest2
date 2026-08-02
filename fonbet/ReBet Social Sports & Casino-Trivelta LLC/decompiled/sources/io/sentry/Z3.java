package io.sentry;

import io.sentry.protocol.C4802d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class Z3 implements InterfaceC4780m0 {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC4856v2 f50576a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC4856v2 f50577b;

    /* renamed from: c, reason: collision with root package name */
    public final a4 f50578c;

    /* renamed from: d, reason: collision with root package name */
    public final S3 f50579d;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f50580e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC4740e0 f50581f;

    /* renamed from: i, reason: collision with root package name */
    public final e4 f50584i;

    /* renamed from: j, reason: collision with root package name */
    public c4 f50585j;

    /* renamed from: g, reason: collision with root package name */
    public boolean f50582g = false;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f50583h = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    public final Map f50586k = new ConcurrentHashMap();

    /* renamed from: l, reason: collision with root package name */
    public final Map f50587l = new ConcurrentHashMap();

    /* renamed from: m, reason: collision with root package name */
    public final C4802d f50588m = new C4802d();

    public Z3(S3 s32, InterfaceC4740e0 interfaceC4740e0, a4 a4Var, e4 e4Var, c4 c4Var) {
        this.f50578c = a4Var;
        a4Var.v(e4Var.a());
        this.f50579d = (S3) io.sentry.util.w.c(s32, "transaction is required");
        this.f50581f = (InterfaceC4740e0) io.sentry.util.w.c(interfaceC4740e0, "Scopes are required");
        this.f50584i = e4Var;
        this.f50585j = c4Var;
        AbstractC4856v2 c10 = e4Var.c();
        if (c10 != null) {
            this.f50576a = c10;
        } else {
            this.f50576a = interfaceC4740e0.i().getDateProvider().now();
        }
    }

    public d4 A() {
        return this.f50578c.i();
    }

    public l4 B() {
        return this.f50578c.m();
    }

    public c4 C() {
        return this.f50585j;
    }

    public d4 D() {
        return this.f50578c.n();
    }

    public Map E() {
        return this.f50578c.p();
    }

    public io.sentry.protocol.u F() {
        return this.f50578c.q();
    }

    public Boolean G() {
        return this.f50578c.j();
    }

    public void H(c4 c4Var) {
        this.f50585j = c4Var;
    }

    public boolean I(AbstractC4856v2 abstractC4856v2) {
        if (this.f50577b == null) {
            return false;
        }
        this.f50577b = abstractC4856v2;
        return true;
    }

    public final void J(AbstractC4856v2 abstractC4856v2) {
        this.f50576a = abstractC4856v2;
    }

    @Override // io.sentry.InterfaceC4780m0
    public a4 a() {
        return this.f50578c;
    }

    @Override // io.sentry.InterfaceC4780m0
    public Boolean b() {
        return this.f50578c.l();
    }

    @Override // io.sentry.InterfaceC4780m0
    public void c(String str) {
        this.f50578c.s(str);
    }

    @Override // io.sentry.InterfaceC4780m0
    public boolean d() {
        return this.f50582g;
    }

    @Override // io.sentry.InterfaceC4780m0
    public L3 e() {
        return new L3(this.f50578c.q(), this.f50578c.n(), this.f50578c.l());
    }

    @Override // io.sentry.InterfaceC4780m0
    public void g() {
        l(this.f50578c.o());
    }

    @Override // io.sentry.InterfaceC4780m0
    public String getDescription() {
        return this.f50578c.d();
    }

    @Override // io.sentry.InterfaceC4780m0
    public f4 getStatus() {
        return this.f50578c.o();
    }

    @Override // io.sentry.InterfaceC4780m0
    public void i(String str, Number number) {
        if (d()) {
            this.f50581f.i().getLogger().c(EnumC4788n3.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f50587l.put(str, new io.sentry.protocol.l(number, null));
        if (this.f50579d.M() != this) {
            this.f50579d.W(str, number);
        }
    }

    @Override // io.sentry.InterfaceC4780m0
    public void k(String str, Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            this.f50586k.remove(str);
        } else {
            this.f50586k.put(str, obj);
        }
    }

    @Override // io.sentry.InterfaceC4780m0
    public void l(f4 f4Var) {
        t(f4Var, this.f50581f.i().getDateProvider().now());
    }

    @Override // io.sentry.InterfaceC4780m0
    public InterfaceC4780m0 n(String str, String str2, AbstractC4856v2 abstractC4856v2, EnumC4832t0 enumC4832t0) {
        return q(str, str2, abstractC4856v2, enumC4832t0, new e4());
    }

    @Override // io.sentry.InterfaceC4780m0
    public void o(String str, Number number, K0 k02) {
        if (d()) {
            this.f50581f.i().getLogger().c(EnumC4788n3.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f50587l.put(str, new io.sentry.protocol.l(number, k02.apiName()));
        if (this.f50579d.M() != this) {
            this.f50579d.X(str, number, k02);
        }
    }

    @Override // io.sentry.InterfaceC4780m0
    public InterfaceC4780m0 q(String str, String str2, AbstractC4856v2 abstractC4856v2, EnumC4832t0 enumC4832t0, e4 e4Var) {
        return this.f50582g ? C4771k1.v() : this.f50579d.Y(this.f50578c.n(), str, str2, abstractC4856v2, enumC4832t0, e4Var);
    }

    @Override // io.sentry.InterfaceC4780m0
    public AbstractC4856v2 s() {
        return this.f50577b;
    }

    @Override // io.sentry.InterfaceC4780m0
    public void t(f4 f4Var, AbstractC4856v2 abstractC4856v2) {
        AbstractC4856v2 abstractC4856v22;
        if (this.f50582g || !this.f50583h.compareAndSet(false, true)) {
            return;
        }
        this.f50578c.x(f4Var);
        if (abstractC4856v2 == null) {
            abstractC4856v2 = this.f50581f.i().getDateProvider().now();
        }
        this.f50577b = abstractC4856v2;
        if (this.f50584i.f() || this.f50584i.e()) {
            AbstractC4856v2 abstractC4856v23 = null;
            AbstractC4856v2 abstractC4856v24 = null;
            for (Z3 z32 : this.f50579d.M().D().equals(D()) ? this.f50579d.I() : w()) {
                if (abstractC4856v23 == null || z32.u().d(abstractC4856v23)) {
                    abstractC4856v23 = z32.u();
                }
                if (abstractC4856v24 == null || (z32.s() != null && z32.s().c(abstractC4856v24))) {
                    abstractC4856v24 = z32.s();
                }
            }
            if (this.f50584i.f() && abstractC4856v23 != null && this.f50576a.d(abstractC4856v23)) {
                J(abstractC4856v23);
            }
            if (this.f50584i.e() && abstractC4856v24 != null && ((abstractC4856v22 = this.f50577b) == null || abstractC4856v22.c(abstractC4856v24))) {
                I(abstractC4856v24);
            }
        }
        Throwable th2 = this.f50580e;
        if (th2 != null) {
            this.f50581f.h(th2, this, this.f50579d.getName());
        }
        c4 c4Var = this.f50585j;
        if (c4Var != null) {
            c4Var.a(this);
        }
        this.f50582g = true;
    }

    @Override // io.sentry.InterfaceC4780m0
    public AbstractC4856v2 u() {
        return this.f50576a;
    }

    public Map v() {
        return this.f50586k;
    }

    public final List w() {
        ArrayList arrayList = new ArrayList();
        for (Z3 z32 : this.f50579d.O()) {
            if (z32.A() != null && z32.A().equals(D())) {
                arrayList.add(z32);
            }
        }
        return arrayList;
    }

    public Map x() {
        return this.f50587l;
    }

    public String y() {
        return this.f50578c.g();
    }

    public e4 z() {
        return this.f50584i;
    }

    public Z3(m4 m4Var, S3 s32, InterfaceC4740e0 interfaceC4740e0, e4 e4Var) {
        a4 a4Var = (a4) io.sentry.util.w.c(m4Var, "context is required");
        this.f50578c = a4Var;
        a4Var.v(e4Var.a());
        this.f50579d = (S3) io.sentry.util.w.c(s32, "sentryTracer is required");
        this.f50581f = (InterfaceC4740e0) io.sentry.util.w.c(interfaceC4740e0, "scopes are required");
        this.f50585j = null;
        AbstractC4856v2 c10 = e4Var.c();
        if (c10 != null) {
            this.f50576a = c10;
        } else {
            this.f50576a = interfaceC4740e0.i().getDateProvider().now();
        }
        this.f50584i = e4Var;
    }
}
