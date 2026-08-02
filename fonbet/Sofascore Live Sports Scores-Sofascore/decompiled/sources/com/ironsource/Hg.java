package com.ironsource;

import com.ironsource.H;
import com.ironsource.S4;
import com.ironsource.Yg;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.dmi;
import defpackage.km5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* loaded from: classes4.dex */
public final class Hg implements G, Rg {

    @NotNull
    private final T0 a;

    @NotNull
    private final AbstractC4386x0 b;

    @NotNull
    private final Pg c;

    @Nullable
    private final InterfaceC4363vd d;

    @Nullable
    private final F e;

    @NotNull
    private final Yg f;

    @NotNull
    private final Kg g;

    @Nullable
    private H h;

    @Nullable
    private Sg i;

    @NotNull
    private final List<B> j;

    @Nullable
    private B k;
    private boolean l;
    private boolean m;
    private int n;

    public Hg(@NotNull T0 t0, @NotNull AbstractC4386x0 abstractC4386x0, boolean z, @NotNull Pg pg, @Nullable InterfaceC4363vd interfaceC4363vd, @Nullable F f) {
        t0.getClass();
        abstractC4386x0.getClass();
        pg.getClass();
        this.a = t0;
        this.b = abstractC4386x0;
        this.c = pg;
        this.d = interfaceC4363vd;
        this.e = f;
        this.f = Yg.a.a.a(z, this);
        this.g = Kg.d.a(t0, abstractC4386x0);
        this.j = new ArrayList();
    }

    private final void c(B b) {
        if (this.l || h()) {
            if (!b.A()) {
                b.c();
                return;
            }
            InterfaceC4363vd interfaceC4363vd = this.d;
            if (interfaceC4363vd != null) {
                interfaceC4363vd.a(this.b.b().c(), false);
                return;
            }
            return;
        }
        F f = this.e;
        if (f != null) {
            b.a(f);
        }
        Sg sg = this.i;
        if (sg != null) {
            sg.a(b);
        }
        this.j.add(b);
        if (this.j.size() == 1) {
            Sg sg2 = this.i;
            if (sg2 != null) {
                sg2.b(b);
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

    private final List<B> e() {
        H.c c;
        List<B> d;
        H h = this.h;
        return (h == null || (c = h.c()) == null || (d = c.d()) == null) ? km5.a : d;
    }

    private final boolean h() {
        return this.k != null;
    }

    private final void i() {
        H h = this.h;
        H.b d = h != null ? h.d() : null;
        if (d == null || d.e()) {
            this.c.a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill");
            return;
        }
        if (d.f()) {
            Sg sg = this.i;
            if (sg != null) {
                sg.a();
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

    @Override // com.ironsource.Rg
    public void a(@NotNull S4 s4) {
        s4.getClass();
        IronLog.INTERNAL.verbose(C4243p0.a(this.a, dmi.q("destroyReadyToShowInstances reason=", s4.a()), (String) null, 2, (Object) null));
        if (this.j.isEmpty()) {
            return;
        }
        String c = this.b.b().c();
        for (B b : this.j) {
            if (b.A()) {
                InterfaceC4363vd interfaceC4363vd = this.d;
                if (interfaceC4363vd != null) {
                    interfaceC4363vd.a(c, false);
                }
            } else {
                b.c();
            }
        }
        this.j.clear();
        S4.a aVar = s4 instanceof S4.a ? (S4.a) s4 : null;
        this.a.f().h().a(s4.a(), aVar != null ? Long.valueOf(aVar.c()) : null);
    }

    @Override // com.ironsource.G
    public void b(@NotNull B b) {
        InterfaceC4363vd interfaceC4363vd;
        b.getClass();
        this.n--;
        c(b);
        if (this.n > 0 || !this.m || (interfaceC4363vd = this.d) == null) {
            return;
        }
        interfaceC4363vd.a(this.b.b().c(), false);
    }

    public final void d(@NotNull B b) {
        b.getClass();
        Sg sg = this.i;
        if (sg != null) {
            sg.a(b, this.b.l(), this.b.o());
        }
    }

    @NotNull
    public final Md f() {
        return this.f.b();
    }

    public final boolean g() {
        Iterator<B> it = this.j.iterator();
        while (it.hasNext()) {
            if (it.next().B()) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final B d() {
        H.c c;
        H h = this.h;
        if (h == null || (c = h.c()) == null) {
            return null;
        }
        return c.c();
    }

    public final void b() {
        this.f.a();
    }

    public /* synthetic */ Hg(T0 t0, AbstractC4386x0 abstractC4386x0, boolean z, Pg pg, InterfaceC4363vd interfaceC4363vd, F f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(t0, abstractC4386x0, z, pg, (i & 16) != 0 ? null : interfaceC4363vd, (i & 32) != 0 ? null : f);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Lg {
        public a() {
        }

        @Override // com.ironsource.Lg
        public void a(@NotNull Mg mg) {
            boolean z;
            mg.getClass();
            if (Hg.this.l) {
                return;
            }
            Hg hg = Hg.this;
            List<B> b = mg.b();
            if (b == null || !b.isEmpty()) {
                Iterator<T> it = b.iterator();
                while (it.hasNext()) {
                    if (((B) it.next()).A()) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            hg.m = z;
            Hg.this.a(mg);
        }

        @Override // com.ironsource.Lg
        public void a(int i, @NotNull String str) {
            str.getClass();
            if (Hg.this.l) {
                return;
            }
            Hg.this.c.a(i, str);
        }
    }

    public final void c() {
        this.l = true;
        B b = this.k;
        if (b != null) {
            b.b();
        }
    }

    public final void a(@NotNull E e) {
        e.getClass();
        this.g.a(e, new a());
    }

    public final void a(@NotNull K k, boolean z) {
        Sg sg;
        k.getClass();
        B c = this.f.c();
        if (c != null) {
            this.f.a(c);
            if (!z && (sg = this.i) != null) {
                sg.a(c, e());
            }
            c.a(k);
        }
    }

    @Override // com.ironsource.G
    public void a(@NotNull IronSourceError ironSourceError, @NotNull B b) {
        ironSourceError.getClass();
        b.getClass();
        this.n--;
        if (this.l) {
            return;
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Mg mg) {
        H a2 = H.c.a(this.b, mg);
        this.h = a2;
        this.i = Sg.c.a(this.a, this.b, this.g.a(), mg, a2);
        i();
    }

    @Override // com.ironsource.Rg
    public void a(@NotNull B b) {
        b.getClass();
        this.k = b;
        this.j.remove(b);
    }

    @Override // com.ironsource.Rg
    public boolean a() {
        return !this.j.isEmpty();
    }

    @Override // com.ironsource.Rg
    @Nullable
    public B a(int i) {
        List<B> e = e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : e) {
            if (((B) obj).x()) {
                arrayList.add(obj);
            }
        }
        return (B) CollectionsKt.a0(i, arrayList);
    }
}
