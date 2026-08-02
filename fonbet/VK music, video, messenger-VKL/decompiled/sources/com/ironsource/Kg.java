package com.ironsource;

import com.ironsource.H;
import com.ironsource.bh;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.j5g;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Kg implements G, Ug {
    private final V0 a;
    private final AbstractC4627x0 b;
    private final Sg c;
    private final InterfaceC4622wd d;
    private final F e;
    private final bh f;
    private final Ng g;
    private H h;
    private Vg i;
    private final List<B> j;
    private B k;
    private boolean l;
    private boolean m;
    private int n;

    public Kg(V0 v0, AbstractC4627x0 abstractC4627x0, boolean z, Sg sg2, InterfaceC4622wd interfaceC4622wd, F f) {
        this.a = v0;
        this.b = abstractC4627x0;
        this.c = sg2;
        this.d = interfaceC4622wd;
        this.e = f;
        this.f = bh.a.a.a(z, this);
        this.g = Ng.d.a(v0, abstractC4627x0);
        this.j = new ArrayList();
    }

    private final void c(B b) {
        if (this.l || i()) {
            if (!b.A()) {
                b.c();
                return;
            }
            InterfaceC4622wd interfaceC4622wd = this.d;
            if (interfaceC4622wd != null) {
                interfaceC4622wd.a(this.b.b().c(), false);
                return;
            }
            return;
        }
        F f = this.e;
        if (f != null) {
            b.a(f);
        }
        Vg vg = this.i;
        if (vg != null) {
            vg.a(b);
        }
        this.j.add(b);
        if (this.j.size() == 1) {
            Vg vg2 = this.i;
            if (vg2 != null) {
                vg2.b(b);
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
        return (h == null || (c = h.c()) == null || (d = c.d()) == null) ? EmptyList.b : d;
    }

    private final boolean i() {
        return this.k != null;
    }

    private final void j() {
        H h = this.h;
        H.b d = h != null ? h.d() : null;
        if (d == null || d.e()) {
            this.c.a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill");
            return;
        }
        if (d.f()) {
            Vg vg = this.i;
            if (vg != null) {
                vg.a();
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
    public void b(B b) {
        InterfaceC4622wd interfaceC4622wd;
        this.n--;
        c(b);
        if (this.n > 0 || !this.m || (interfaceC4622wd = this.d) == null) {
            return;
        }
        interfaceC4622wd.a(this.b.b().c(), false);
    }

    public final void d(B b) {
        Vg vg = this.i;
        if (vg != null) {
            vg.a(b, this.b.l(), this.b.o());
        }
    }

    public final void a(E e) {
        this.g.a(e, new a());
    }

    public static final class a implements Og {
        public a() {
        }

        @Override // com.ironsource.Og
        public void a(Pg pg) {
            boolean z;
            if (Kg.this.l) {
                return;
            }
            Kg kg = Kg.this;
            List<B> b = pg.b();
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
            kg.m = z;
            Kg.this.a(pg);
        }

        @Override // com.ironsource.Og
        public void a(int i, String str) {
            if (Kg.this.l) {
                return;
            }
            Kg.this.c.a(i, str);
        }
    }

    @Override // com.ironsource.Ug
    public boolean b() {
        return !this.j.isEmpty();
    }

    public final void a(K k, boolean z) {
        Vg vg;
        B c = this.f.c();
        if (c != null) {
            this.f.a(c);
            if (!z && (vg = this.i) != null) {
                vg.a(c, f());
            }
            c.a(k);
        }
    }

    public /* synthetic */ Kg(V0 v0, AbstractC4627x0 abstractC4627x0, boolean z, Sg sg2, InterfaceC4622wd interfaceC4622wd, F f, int i, zcl zclVar) {
        this(v0, abstractC4627x0, z, sg2, (i & 16) != 0 ? null : interfaceC4622wd, (i & 32) != 0 ? null : f);
    }

    @Override // com.ironsource.G
    public void a(IronSourceError ironSourceError, B b) {
        this.n--;
        if (this.l) {
            return;
        }
        j();
    }

    public final void c() {
        this.f.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Pg pg) {
        H a2 = H.c.a(this.b, pg);
        this.h = a2;
        this.i = Vg.c.a(this.a, this.b, this.g.a(), pg, a2);
        j();
    }

    @Override // com.ironsource.Ug
    public void a(B b) {
        this.k = b;
        this.j.remove(b);
    }

    @Override // com.ironsource.Ug
    public void a() {
        IronLog.INTERNAL.verbose(C4484p0.a(this.a, "destroyReadyToShowInstances", (String) null, 2, (Object) null));
        if (this.j.isEmpty()) {
            return;
        }
        String c = this.b.b().c();
        for (B b : this.j) {
            if (b.A()) {
                InterfaceC4622wd interfaceC4622wd = this.d;
                if (interfaceC4622wd != null) {
                    interfaceC4622wd.a(c, false);
                }
            } else {
                b.c();
            }
        }
        this.j.clear();
        this.a.d().h().a();
    }

    @Override // com.ironsource.Ug
    public B a(int i) {
        List<B> f = f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : f) {
            if (((B) obj).x()) {
                arrayList.add(obj);
            }
        }
        return (B) j5g.b0(i, arrayList);
    }
}
