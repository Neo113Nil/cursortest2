package com.ironsource;

import com.ironsource.H;
import com.ironsource.Vg;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class Eg implements G, Og {
    private final V0 a;
    private final AbstractC2731x0 b;
    private final Mg c;
    private final InterfaceC2726wd d;
    private final F e;
    private final Vg f;
    private final Hg g;
    private H h;
    private Pg i;
    private final List<B> j;
    private B k;
    private boolean l;
    private boolean m;
    private int n;

    public Eg(V0 adTools, AbstractC2731x0 adUnitData, boolean z, Mg listener, InterfaceC2726wd interfaceC2726wd, F f) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a = adTools;
        this.b = adUnitData;
        this.c = listener;
        this.d = interfaceC2726wd;
        this.e = f;
        this.f = Vg.a.a.a(z, this);
        this.g = Hg.d.a(adTools, adUnitData);
        this.j = new ArrayList();
    }

    private final void c(B b) {
        if (this.l || i()) {
            if (!b.A()) {
                b.c();
                return;
            }
            InterfaceC2726wd interfaceC2726wd = this.d;
            if (interfaceC2726wd != null) {
                interfaceC2726wd.a(this.b.b().c(), false);
                return;
            }
            return;
        }
        F f = this.e;
        if (f != null) {
            b.a(f);
        }
        Pg pg = this.i;
        if (pg != null) {
            pg.a(b);
        }
        this.j.add(b);
        if (this.j.size() == 1) {
            Pg pg2 = this.i;
            if (pg2 != null) {
                pg2.b(b);
            }
            this.c.b(b);
            return;
        }
        H h = this.h;
        if (h == null || !h.a(b)) {
            return;
        }
        this.c.a(b);
    }

    private final List<B> f() {
        H.c c;
        List<B> d;
        H h = this.h;
        return (h == null || (c = h.c()) == null || (d = c.d()) == null) ? CollectionsKt.emptyList() : d;
    }

    private final boolean i() {
        return this.k != null;
    }

    private final void j() {
        H h = this.h;
        H.b d = h != null ? h.d() : null;
        if (d == null || d.e()) {
            this.c.a(509, "Mediation No fill");
            return;
        }
        if (d.f()) {
            Pg pg = this.i;
            if (pg != null) {
                pg.a();
                return;
            }
            return;
        }
        for (B b : d.a()) {
            this.n++;
            if (b.A()) {
                this.m = false;
                b(b);
            } else {
                b.a(this);
            }
        }
    }

    public final void d() {
        this.l = true;
        B b = this.k;
        if (b != null) {
            b.b();
        }
    }

    public final B e() {
        H.c c;
        H h = this.h;
        if (h == null || (c = h.c()) == null) {
            return null;
        }
        return c.c();
    }

    public final Nd g() {
        return this.f.b();
    }

    public final boolean h() {
        Iterator<B> it = this.j.iterator();
        while (it.hasNext()) {
            if (it.next().B()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.G
    public void b(B instance) {
        InterfaceC2726wd interfaceC2726wd;
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.n--;
        c(instance);
        if (this.n > 0 || !this.m || (interfaceC2726wd = this.d) == null) {
            return;
        }
        interfaceC2726wd.a(this.b.b().c(), false);
    }

    public final void d(B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Pg pg = this.i;
        if (pg != null) {
            pg.a(instance, this.b.l(), this.b.o());
        }
    }

    public final void a(E adInstanceFactory) {
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        this.g.a(adInstanceFactory, new a());
    }

    @Override // com.ironsource.Og
    public boolean b() {
        return !this.j.isEmpty();
    }

    public final void a(K adInstancePresenter, boolean z) {
        Pg pg;
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        B c = this.f.c();
        if (c != null) {
            this.f.a(c);
            if (!z && (pg = this.i) != null) {
                pg.a(c, f());
            }
            c.a(adInstancePresenter);
        }
    }

    @Override // com.ironsource.G
    public void a(IronSourceError error, B instance) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.n--;
        if (this.l) {
            return;
        }
        j();
    }

    public /* synthetic */ Eg(V0 v0, AbstractC2731x0 abstractC2731x0, boolean z, Mg mg, InterfaceC2726wd interfaceC2726wd, F f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(v0, abstractC2731x0, z, mg, (i & 16) != 0 ? null : interfaceC2726wd, (i & 32) != 0 ? null : f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Jg jg) {
        H a2 = H.c.a(this.b, jg);
        this.h = a2;
        this.i = Pg.c.a(this.a, this.b, this.g.a(), jg, a2);
        j();
    }

    public final void c() {
        this.f.a();
    }

    @Override // com.ironsource.Og
    public void a(B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.k = instance;
        this.j.remove(instance);
    }

    @Override // com.ironsource.Og
    public void a() {
        IronLog.INTERNAL.verbose(C2588p0.a(this.a, "destroyReadyToShowInstances", (String) null, 2, (Object) null));
        if (this.j.isEmpty()) {
            return;
        }
        String c = this.b.b().c();
        for (B b : this.j) {
            if (b.A()) {
                InterfaceC2726wd interfaceC2726wd = this.d;
                if (interfaceC2726wd != null) {
                    interfaceC2726wd.a(c, false);
                }
            } else {
                b.c();
            }
        }
        this.j.clear();
        this.a.e().h().a();
    }

    @Override // com.ironsource.Og
    public B a(int i) {
        List<B> f = f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : f) {
            if (((B) obj).x()) {
                arrayList.add(obj);
            }
        }
        return (B) CollectionsKt.getOrNull(arrayList, i);
    }

    public static final class a implements Ig {
        a() {
        }

        @Override // com.ironsource.Ig
        public void a(Jg waterfallInstances) {
            boolean z;
            Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            if (Eg.this.l) {
                return;
            }
            Eg eg = Eg.this;
            List<B> b = waterfallInstances.b();
            if (!(b instanceof Collection) || !b.isEmpty()) {
                Iterator<T> it = b.iterator();
                while (it.hasNext()) {
                    if (((B) it.next()).A()) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            eg.m = z;
            Eg.this.a(waterfallInstances);
        }

        @Override // com.ironsource.Ig
        public void a(int i, String errorReason) {
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            if (Eg.this.l) {
                return;
            }
            Eg.this.c.a(i, errorReason);
        }
    }
}
