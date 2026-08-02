package com.ironsource;

import android.content.Context;
import com.ironsource.Ib;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import defpackage.dp1;
import defpackage.joa;
import defpackage.ml;
import defpackage.s3n;
import defpackage.wem;
import defpackage.xka;
import defpackage.xtl;
import defpackage.ypa;
import defpackage.zol;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.ze, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4436ze {

    @NotNull
    public static final b l = new b(null);

    @NotNull
    private static final joa m = ypa.b(a.a);

    @NotNull
    private final Ee a;

    @NotNull
    private final Pe b;

    @NotNull
    private final Fe c;
    private Xe d;

    @NotNull
    private final joa e;
    private final String f;

    @NotNull
    private final List<InterfaceC4292re> g;

    @Nullable
    private C4185le h;

    @Nullable
    private C4221ne i;
    private boolean j;
    private long k;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.ze$a */
    public static final class a extends xka implements Function0<C4436ze> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4436ze invoke() {
            return new C4436ze(null, null, null, 7, null);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.ze$c */
    public static final class c extends xka implements Function0<InterfaceC4107h7> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4107h7 invoke() {
            return Ib.v.d().k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C4436ze(Ee ee, Pe pe, Fe fe, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new De() : ee, (i & 2) != 0 ? new Oe(null, 1, 0 == true ? 1 : 0) : pe, (i & 4) != 0 ? new Fe(null, null, null, null, null, 31, null) : fe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, C4185le c4185le) {
        Qe i;
        b(c4185le);
        K1 a2 = c4185le.a();
        T4 t4 = T4.a;
        t4.c(a2.h());
        Ib.b bVar = Ib.v;
        bVar.a().o().a(a2.c());
        if (bVar.d().h().e() && (i = c4185le.i()) != null) {
            this.c.a(context, i);
        }
        C4037d9 f = c4185le.f();
        if (f != null) {
            f.b();
        }
        t4.a(a2.g());
        t4.a(a2.k());
        IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(a2.i());
        c().a(a2);
        a(context, this.a.g(), c4185le.d());
        this.a.a(new Date().getTime() - this.k, c4185le.g());
        Xe xe = new Xe();
        this.d = xe;
        xe.a(c());
        IronSourceUtils.e(context, c4185le.d().toString());
        bVar.d().q().c(true);
        F9.i().c(true);
        C4078fe.i().c(true);
        C4023cd c4023cd = C4023cd.P;
        c4023cd.c(true);
        b(context, c4185le);
        IronSourceLoggerManager.getLogger(0).setDebugLevel(c4185le.e().b());
        D1 b2 = c4185le.b();
        if (b2.f()) {
            this.a.a(b2);
        }
        a(c4185le);
        c4023cd.i();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("parameters for init url: " + Ve.a());
        ironLog.verbose("parameters for init POST data: " + Ve.b());
    }

    private final void b(Context context, C4185le c4185le) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        String str3;
        Context context2;
        H1 b2;
        Pb e;
        H1 g;
        S2 c2;
        H1 g2;
        D9 d2;
        H1 i;
        C4042de f;
        H1 m2;
        H1 b3;
        Te d3 = c4185le.d();
        A1 b4 = d3.c().b();
        if (b4 == null || (b3 = b4.b()) == null) {
            z = false;
            str = null;
        } else {
            z = b3.l();
            str = b3.d();
        }
        K3 c3 = d3.c();
        if (c3 == null || (f = c3.f()) == null || (m2 = f.m()) == null) {
            z2 = false;
            str2 = null;
        } else {
            boolean l2 = m2.l();
            str2 = m2.d();
            z2 = l2;
        }
        K3 c4 = d3.c();
        if (c4 == null || (d2 = c4.d()) == null || (i = d2.i()) == null) {
            z3 = false;
            str3 = null;
        } else {
            boolean l3 = i.l();
            str3 = i.d();
            z3 = l3;
        }
        K3 c5 = d3.c();
        boolean l4 = (c5 == null || (c2 = c5.c()) == null || (g2 = c2.g()) == null) ? false : g2.l();
        K3 c6 = d3.c();
        boolean l5 = (c6 == null || (e = c6.e()) == null || (g = e.g()) == null) ? false : g.l();
        Ib.b bVar = Ib.v;
        bVar.d().q().b(str, context);
        if (z) {
            A1 b5 = d3.c().b();
            if (b5 != null && (b2 = b5.b()) != null) {
                a(this, bVar.d().q(), b2, context, d3, false, 16, null);
            }
        } else {
            bVar.d().q().a(false);
        }
        C4078fe.i().b(str2, context);
        if (z2) {
            K3 c7 = d3.c();
            C4042de f2 = c7 != null ? c7.f() : null;
            f2.getClass();
            H1 m3 = f2.m();
            C4078fe i2 = C4078fe.i();
            i2.getClass();
            m3.getClass();
            a(this, i2, m3, context, d3, false, 16, null);
        } else {
            C4078fe.i().a(false);
        }
        F9.i().b(str3, context);
        if (z3) {
            K3 c8 = d3.c();
            D9 d4 = c8 != null ? c8.d() : null;
            d4.getClass();
            H1 i3 = d4.i();
            F9 i4 = F9.i();
            i4.getClass();
            i3.getClass();
            a(this, i4, i3, context, d3, false, 16, null);
            context2 = context;
        } else if (l4) {
            K3 c9 = d3.c();
            S2 c10 = c9 != null ? c9.c() : null;
            c10.getClass();
            H1 g3 = c10.g();
            F9 i5 = F9.i();
            i5.getClass();
            g3.getClass();
            context2 = context;
            a(this, i5, g3, context2, d3, false, 16, null);
        } else if (l5) {
            K3 c11 = d3.c();
            Pb e2 = c11 != null ? c11.e() : null;
            e2.getClass();
            H1 g4 = e2.g();
            F9 i6 = F9.i();
            i6.getClass();
            context2 = context;
            a(this, i6, g4, context2, d3, false, 16, null);
        } else {
            context2 = context;
            F9.i().a(false);
        }
        K3 c12 = d3.c();
        A1 b6 = c12 != null ? c12.b() : null;
        b6.getClass();
        C4041dd i7 = b6.i();
        boolean a2 = i7.a();
        String b7 = i7.b();
        boolean c13 = i7.c();
        int d5 = i7.d();
        int[] e3 = i7.e();
        int[] f3 = i7.f();
        C4023cd c4023cd = C4023cd.P;
        c4023cd.a(a2);
        c4023cd.b(b7, context2);
        if (a2) {
            c4023cd.b(e3, context2);
            c4023cd.c(f3, context2);
            c4023cd.b(c13);
            c4023cd.c(d5);
        }
    }

    private final InterfaceC4107h7 c() {
        return (InterfaceC4107h7) this.e.getValue();
    }

    public final void d() {
        this.a.c(new xtl(this, 19));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.ze$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final C4436ze a() {
            return (C4436ze) C4436ze.m.getValue();
        }

        private b() {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.ze$d */
    public static final class d implements InterfaceC4292re {
        final /* synthetic */ Context b;

        public d(Context context) {
            this.b = context;
        }

        @Override // com.ironsource.InterfaceC4292re
        public void a(@NotNull C4185le c4185le) {
            c4185le.getClass();
            C4436ze.this.a.c(new zol(18, C4436ze.this, this.b, c4185le));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4436ze c4436ze, Context context, C4185le c4185le) {
            c4436ze.getClass();
            c4185le.getClass();
            context.getClass();
            c4436ze.a(context, c4185le);
        }

        @Override // com.ironsource.InterfaceC4292re
        public void a(@NotNull C4221ne c4221ne, @Nullable C4037d9 c4037d9) {
            c4221ne.getClass();
            C4436ze.this.a.c(new zol(19, C4436ze.this, c4221ne, c4037d9));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4436ze c4436ze, C4221ne c4221ne, C4037d9 c4037d9) {
            c4436ze.getClass();
            c4221ne.getClass();
            c4436ze.a(c4221ne, c4037d9);
        }
    }

    public C4436ze(@NotNull Ee ee, @NotNull Pe pe, @NotNull Fe fe) {
        ee.getClass();
        pe.getClass();
        fe.getClass();
        this.a = ee;
        this.b = pe;
        this.c = fe;
        this.e = ypa.b(c.a);
        this.f = "ze";
        this.g = new ArrayList();
    }

    public C4436ze() {
        this(null, null, null, 7, null);
    }

    private final void a(Context context, T9 t9, Te te) {
        t9.i(te.g().h());
        t9.c(te.g().d());
        A1 b2 = te.c().b();
        b2.getClass();
        t9.a(b2.a());
        t9.d(b2.c().b());
        t9.b(b2.k().b());
        t9.a(Boolean.valueOf(IronSourceUtils.c(context)));
        A1 b3 = te.c().b();
        b3.getClass();
        t9.b(b3.f().b());
    }

    public final void a(@NotNull Context context, @NotNull C4328te c4328te, @NotNull InterfaceC4292re interfaceC4292re) {
        context.getClass();
        c4328te.getClass();
        interfaceC4292re.getClass();
        this.a.c(new dp1(this, interfaceC4292re, context, c4328te, context.getApplicationContext(), 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4436ze c4436ze, InterfaceC4292re interfaceC4292re, Context context, C4328te c4328te, Context context2) {
        c4436ze.getClass();
        interfaceC4292re.getClass();
        context.getClass();
        c4328te.getClass();
        C4185le c4185le = c4436ze.h;
        if (c4185le != null) {
            c4436ze.a(interfaceC4292re, c4185le);
            return;
        }
        c4436ze.g.add(interfaceC4292re);
        if (c4436ze.j) {
            return;
        }
        c4436ze.i = null;
        c4436ze.a(true);
        c4436ze.k = new Date().getTime();
        c4436ze.b.a(context, c4328te, c4436ze.a, c4436ze.new d(context2));
    }

    public final void a(@NotNull C4346ue c4346ue) {
        c4346ue.getClass();
        this.a.c(new s3n(c4346ue, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4346ue c4346ue, C4436ze c4436ze) {
        c4346ue.getClass();
        c4436ze.getClass();
        C4185le c4185le = new C4185le(c4346ue, null, null, 6, null);
        c4436ze.b(c4185le);
        c4436ze.a(c4185le);
    }

    public final void a(@NotNull C4221ne c4221ne) {
        c4221ne.getClass();
        this.a.c(new s3n(this, c4221ne));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4436ze c4436ze, C4221ne c4221ne) {
        c4436ze.getClass();
        c4221ne.getClass();
        c4436ze.a(c4221ne, (C4037d9) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C4221ne c4221ne, C4037d9 c4037d9) {
        this.i = c4221ne;
        a(false);
        Iterator<InterfaceC4292re> it = this.g.iterator();
        while (it.hasNext()) {
            a(it.next(), c4221ne);
        }
        this.g.clear();
        if (c4037d9 != null) {
            c4037d9.b();
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: " + c4221ne, 1);
    }

    private final void a(C4185le c4185le) {
        Iterator<InterfaceC4292re> it = this.g.iterator();
        while (it.hasNext()) {
            a(it.next(), c4185le);
        }
        this.g.clear();
    }

    private final void a(boolean z) {
        this.j = z;
        this.a.a(b());
    }

    private final void a(InterfaceC4292re interfaceC4292re, C4185le c4185le) {
        this.a.a(new ml(interfaceC4292re, c4185le, 2));
    }

    private final void a(InterfaceC4292re interfaceC4292re, C4221ne c4221ne) {
        this.a.a(new wem(29, interfaceC4292re, c4221ne));
    }

    public static /* synthetic */ void a(C4436ze c4436ze, AbstractC4121i3 abstractC4121i3, H1 h1, Context context, Te te, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        c4436ze.a(abstractC4121i3, h1, context, te, z);
    }

    private final void a(AbstractC4121i3 abstractC4121i3, H1 h1, Context context, Te te, boolean z) {
        abstractC4121i3.a(z);
        abstractC4121i3.a(h1.c(), context);
        abstractC4121i3.b(h1.d(), context);
        abstractC4121i3.a(h1.f());
        abstractC4121i3.d(h1.e());
        abstractC4121i3.b(h1.a());
        abstractC4121i3.b(h1.i(), context);
        abstractC4121i3.c(h1.h(), context);
        abstractC4121i3.a(h1.j(), context);
        abstractC4121i3.d(h1.g(), context);
        A1 b2 = te.c().b();
        b2.getClass();
        abstractC4121i3.a(b2.j());
        abstractC4121i3.b(h1.k());
        abstractC4121i3.c(h1.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4436ze c4436ze) {
        c4436ze.getClass();
        c4436ze.a(true);
    }

    private final void b(C4185le c4185le) {
        this.h = c4185le;
        a(false);
    }

    private final Be b() {
        if (this.h != null) {
            return Be.INITIATED;
        }
        if (this.i != null) {
            return Be.INIT_FAILED;
        }
        if (this.j) {
            return Be.INIT_IN_PROGRESS;
        }
        return Be.NOT_INIT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC4292re interfaceC4292re, C4185le c4185le) {
        interfaceC4292re.getClass();
        c4185le.getClass();
        interfaceC4292re.a(c4185le);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC4292re interfaceC4292re, C4221ne c4221ne) {
        interfaceC4292re.getClass();
        c4221ne.getClass();
        InterfaceC4292re.a(interfaceC4292re, c4221ne, null, 2, null);
    }
}
