package io.sentry;

import io.sentry.B0;
import io.sentry.protocol.C7187c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class i3 implements InterfaceC7134d0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private T1 f67981a;

    /* renamed from: b, reason: collision with root package name */
    private T1 f67982b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final j3 f67983c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final e3 f67984d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C7229z1 f67985e;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final m3 f67988h;

    /* renamed from: i, reason: collision with root package name */
    private k3 f67989i;

    /* renamed from: f, reason: collision with root package name */
    private boolean f67986f = false;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f67987g = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap f67990j = new ConcurrentHashMap();

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap f67991k = new ConcurrentHashMap();

    i3(@NotNull e3 e3Var, @NotNull C7229z1 c7229z1, @NotNull j3 j3Var, @NotNull m3 m3Var, B90.E e11) {
        new C7187c();
        this.f67983c = j3Var;
        j3Var.f68024i = m3Var.f68089d;
        io.sentry.util.p.b(e3Var, "transaction is required");
        this.f67984d = e3Var;
        io.sentry.util.p.b(c7229z1, "Scopes are required");
        this.f67985e = c7229z1;
        this.f67988h = m3Var;
        this.f67989i = e11;
        T1 c11 = m3Var.c();
        if (c11 != null) {
            this.f67981a = c11;
        } else {
            this.f67981a = c7229z1.getOptions().getDateProvider().now();
        }
    }

    @NotNull
    public final l3 A() {
        return this.f67983c.l();
    }

    public final Map<String, String> B() {
        return this.f67983c.f68023h;
    }

    @NotNull
    public final io.sentry.protocol.t C() {
        return this.f67983c.o();
    }

    public final Boolean D() {
        return this.f67983c.h();
    }

    public final Boolean E() {
        return this.f67983c.j();
    }

    final void F(c3 c3Var) {
        this.f67989i = c3Var;
    }

    @Override // io.sentry.InterfaceC7134d0
    public final void b(@NotNull String str, @NotNull Long l11, @NotNull B0.a aVar) {
        if (this.f67986f) {
            this.f67985e.getOptions().getLogger().c(I2.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f67991k.put(str, new io.sentry.protocol.k(aVar.apiName(), l11));
        e3 e3Var = this.f67984d;
        if (e3Var.E() != this) {
            e3Var.K(str, l11, aVar);
        }
    }

    @Override // io.sentry.InterfaceC7134d0
    public final void c(Object obj, String str) {
        ConcurrentHashMap concurrentHashMap = this.f67990j;
        if (obj == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, obj);
        }
    }

    @Override // io.sentry.InterfaceC7134d0
    @NotNull
    public final j3 e() {
        return this.f67983c;
    }

    @Override // io.sentry.InterfaceC7134d0
    public final void f(n3 n3Var, T1 t12) {
        List<i3> list;
        T1 t13;
        T1 t14;
        if (this.f67986f || !this.f67987g.compareAndSet(false, true)) {
            return;
        }
        j3 j3Var = this.f67983c;
        j3Var.f68022g = n3Var;
        if (t12 == null) {
            t12 = this.f67985e.getOptions().getDateProvider().now();
        }
        this.f67982b = t12;
        m3 m3Var = this.f67988h;
        m3Var.getClass();
        if (m3Var.d()) {
            e3 e3Var = this.f67984d;
            if (e3Var.E().f67983c.l().equals(j3Var.l())) {
                list = e3Var.A();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((CopyOnWriteArrayList) e3Var.F()).iterator();
                while (it.hasNext()) {
                    i3 i3Var = (i3) it.next();
                    if (i3Var.f67983c.g() != null && i3Var.f67983c.g().equals(j3Var.l())) {
                        arrayList.add(i3Var);
                    }
                }
                list = arrayList;
            }
            T1 t15 = null;
            T1 t16 = null;
            for (i3 i3Var2 : list) {
                if (t15 == null || i3Var2.f67981a.b(t15) < 0) {
                    t15 = i3Var2.f67981a;
                }
                if (t16 == null || ((t14 = i3Var2.f67982b) != null && t14.b(t16) > 0)) {
                    t16 = i3Var2.f67982b;
                }
            }
            if (m3Var.d() && t16 != null && (((t13 = this.f67982b) == null || t13.b(t16) > 0) && this.f67982b != null)) {
                this.f67982b = t16;
            }
        }
        k3 k3Var = this.f67989i;
        if (k3Var != null) {
            k3Var.e(this);
        }
        this.f67986f = true;
    }

    @Override // io.sentry.InterfaceC7134d0
    public final void finish() {
        n(this.f67983c.f68022g);
    }

    @Override // io.sentry.InterfaceC7134d0
    @NotNull
    public final InterfaceC7134d0 g(String str, T1 t12, @NotNull EnumC7162k0 enumC7162k0) {
        return q("activity.load", str, t12, enumC7162k0, new m3());
    }

    @Override // io.sentry.InterfaceC7134d0
    public final String getDescription() {
        return this.f67983c.f68021f;
    }

    @Override // io.sentry.InterfaceC7134d0
    public final n3 getStatus() {
        return this.f67983c.f68022g;
    }

    @Override // io.sentry.InterfaceC7134d0
    public final boolean h() {
        return this.f67986f;
    }

    @Override // io.sentry.InterfaceC7134d0
    public final void j(String str) {
        this.f67983c.f68021f = str;
    }

    @Override // io.sentry.InterfaceC7134d0
    public final void l(@NotNull String str, @NotNull Number number) {
        if (this.f67986f) {
            this.f67985e.getOptions().getLogger().c(I2.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f67991k.put(str, new io.sentry.protocol.k(null, number));
        e3 e3Var = this.f67984d;
        if (e3Var.E() != this) {
            e3Var.L(str, number);
        }
    }

    @Override // io.sentry.InterfaceC7134d0
    public final void n(n3 n3Var) {
        f(n3Var, this.f67985e.getOptions().getDateProvider().now());
    }

    @Override // io.sentry.InterfaceC7134d0
    @NotNull
    public final InterfaceC7134d0 q(@NotNull String str, String str2, T1 t12, @NotNull EnumC7162k0 enumC7162k0, @NotNull m3 m3Var) {
        if (this.f67986f) {
            return W0.t();
        }
        return this.f67984d.M(this.f67983c.l(), str, str2, t12, enumC7162k0, m3Var);
    }

    @Override // io.sentry.InterfaceC7134d0
    public final T1 r() {
        return this.f67982b;
    }

    @Override // io.sentry.InterfaceC7134d0
    @NotNull
    public final T1 s() {
        return this.f67981a;
    }

    @NotNull
    public final Map<String, Object> t() {
        return this.f67990j;
    }

    @NotNull
    public final Map<String, io.sentry.protocol.k> u() {
        return this.f67991k;
    }

    @NotNull
    public final String v() {
        return this.f67983c.f68020e;
    }

    @NotNull
    final m3 w() {
        return this.f67988h;
    }

    public final l3 x() {
        return this.f67983c.g();
    }

    public final s3 y() {
        return this.f67983c.k();
    }

    final k3 z() {
        return this.f67989i;
    }

    public i3(@NotNull t3 t3Var, @NotNull e3 e3Var, @NotNull C7229z1 c7229z1, @NotNull u3 u3Var) {
        new C7187c();
        this.f67983c = t3Var;
        t3Var.f68024i = u3Var.f68089d;
        io.sentry.util.p.b(e3Var, "sentryTracer is required");
        this.f67984d = e3Var;
        this.f67985e = c7229z1;
        this.f67989i = null;
        T1 c11 = u3Var.c();
        if (c11 != null) {
            this.f67981a = c11;
        } else {
            this.f67981a = c7229z1.getOptions().getDateProvider().now();
        }
        this.f67988h = u3Var;
    }
}
