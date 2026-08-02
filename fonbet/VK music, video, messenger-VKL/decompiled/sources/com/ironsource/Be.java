package com.ironsource;

import android.content.Context;
import com.ironsource.Kb;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Lambda;
import xsna.bpn0;
import xsna.gzs;
import xsna.h12;
import xsna.qd0;
import xsna.sv6;
import xsna.tv6;
import xsna.uv6;
import xsna.vv6;
import xsna.wv6;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Be {
    public static final b l = new b(null);
    private static final Lazy<Be> m = new bpn0(a.a);
    private final Ge a;
    private final Re b;
    private final He c;
    private Ze d;
    private final Lazy e;
    private final String f;
    private final List<InterfaceC4569te> g;
    private C4462ne h;
    private C4498pe i;
    private boolean j;
    private long k;

    public static final class a extends Lambda implements gzs<Be> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Be invoke() {
            return new Be(null, null, null, 7, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(zcl zclVar) {
            this();
        }

        public final Be a() {
            return (Be) Be.m.getValue();
        }

        private b() {
        }
    }

    public static final class c extends Lambda implements gzs<InterfaceC4419l7> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4419l7 invoke() {
            return Kb.u.d().k();
        }
    }

    public static final class d implements InterfaceC4569te {
        final /* synthetic */ Context b;

        public d(Context context) {
            this.b = context;
        }

        @Override // com.ironsource.InterfaceC4569te
        public void a(C4462ne c4462ne) {
            Be.this.a.c(new wv6(Be.this, this.b, c4462ne, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Be be, Context context, C4462ne c4462ne) {
            be.a(context, c4462ne);
        }

        @Override // com.ironsource.InterfaceC4569te
        public void a(C4498pe c4498pe, C4278d9 c4278d9) {
            Be.this.a.c(new vv6(Be.this, c4498pe, c4278d9, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Be be, C4498pe c4498pe, C4278d9 c4278d9) {
            be.a(c4498pe, c4278d9);
        }
    }

    public Be() {
        this(null, null, null, 7, null);
    }

    public Be(Ge ge, Re re, He he) {
        this.a = ge;
        this.b = re;
        this.c = he;
        this.e = new bpn0(c.a);
        this.f = "Be";
        this.g = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Be be) {
        be.a(true);
    }

    private final InterfaceC4419l7 c() {
        return (InterfaceC4419l7) this.e.getValue();
    }

    public final void d() {
        this.a.c(new qd0(this, 2));
    }

    private final void b(C4462ne c4462ne) {
        this.h = c4462ne;
        a(false);
    }

    private final void a(Context context, U9 u9, Ve ve) {
        u9.i(ve.g().h());
        u9.c(ve.g().d());
        C1 b2 = ve.c().b();
        u9.a(b2.a());
        u9.d(b2.c().b());
        u9.b(b2.k().b());
        u9.a(Boolean.valueOf(IronSourceUtils.c(context)));
        u9.b(ve.c().b().f().b());
    }

    private final De b() {
        if (this.h != null) {
            return De.INITIATED;
        }
        if (this.i != null) {
            return De.INIT_FAILED;
        }
        if (this.j) {
            return De.INIT_IN_PROGRESS;
        }
        return De.NOT_INIT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Be(Ge ge, Re re, He he, int i, zcl zclVar) {
        this((i & 1) != 0 ? new Fe() : ge, (i & 2) != 0 ? new Qe(null, 1, 0 == true ? 1 : 0) : re, (i & 4) != 0 ? new He(null, null, null, null, null, 31, null) : he);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC4569te interfaceC4569te, C4462ne c4462ne) {
        interfaceC4569te.a(c4462ne);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC4569te interfaceC4569te, C4498pe c4498pe) {
        InterfaceC4569te.a(interfaceC4569te, c4498pe, null, 2, null);
    }

    private final void b(Context context, C4462ne c4462ne) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        String str3;
        Context context2;
        J1 b2;
        Qb e;
        J1 g;
        U2 c2;
        J1 g2;
        E9 d2;
        J1 i;
        C4301ee f;
        J1 m2;
        J1 b3;
        Ve d3 = c4462ne.d();
        C1 b4 = d3.c().b();
        if (b4 == null || (b3 = b4.b()) == null) {
            z = false;
            str = null;
        } else {
            z = b3.l();
            str = b3.d();
        }
        N3 c3 = d3.c();
        if (c3 == null || (f = c3.f()) == null || (m2 = f.m()) == null) {
            z2 = false;
            str2 = null;
        } else {
            boolean l2 = m2.l();
            str2 = m2.d();
            z2 = l2;
        }
        N3 c4 = d3.c();
        if (c4 == null || (d2 = c4.d()) == null || (i = d2.i()) == null) {
            z3 = false;
            str3 = null;
        } else {
            boolean l3 = i.l();
            str3 = i.d();
            z3 = l3;
        }
        N3 c5 = d3.c();
        boolean l4 = (c5 == null || (c2 = c5.c()) == null || (g2 = c2.g()) == null) ? false : g2.l();
        N3 c6 = d3.c();
        boolean l5 = (c6 == null || (e = c6.e()) == null || (g = e.g()) == null) ? false : g.l();
        Kb.b bVar = Kb.u;
        bVar.d().q().b(str, context);
        if (z) {
            C1 b5 = d3.c().b();
            if (b5 != null && (b2 = b5.b()) != null) {
                a(this, bVar.d().q(), b2, context, d3, false, 16, null);
            }
        } else {
            bVar.d().q().a(false);
        }
        C4337ge.i().b(str2, context);
        if (z2) {
            N3 c7 = d3.c();
            a(this, C4337ge.i(), (c7 != null ? c7.f() : null).m(), context, d3, false, 16, null);
        } else {
            C4337ge.i().a(false);
        }
        G9.i().b(str3, context);
        if (z3) {
            N3 c8 = d3.c();
            a(this, G9.i(), (c8 != null ? c8.d() : null).i(), context, d3, false, 16, null);
            context2 = context;
        } else if (l4) {
            N3 c9 = d3.c();
            context2 = context;
            a(this, G9.i(), (c9 != null ? c9.c() : null).g(), context2, d3, false, 16, null);
        } else if (l5) {
            N3 c10 = d3.c();
            context2 = context;
            a(this, G9.i(), (c10 != null ? c10.e() : null).g(), context2, d3, false, 16, null);
        } else {
            context2 = context;
            G9.i().a(false);
        }
        N3 c11 = d3.c();
        C4300ed i2 = (c11 != null ? c11.b() : null).i();
        boolean a2 = i2.a();
        String b6 = i2.b();
        boolean c12 = i2.c();
        int d4 = i2.d();
        int[] e2 = i2.e();
        int[] f2 = i2.f();
        C4282dd c4282dd = C4282dd.P;
        c4282dd.a(a2);
        c4282dd.b(b6, context2);
        if (a2) {
            c4282dd.b(e2, context2);
            c4282dd.c(f2, context2);
            c4282dd.b(c12);
            c4282dd.c(d4);
        }
    }

    public final void a(Context context, C4605ve c4605ve, InterfaceC4569te interfaceC4569te) {
        this.a.c(new sv6(this, interfaceC4569te, context, c4605ve, context.getApplicationContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Be be, InterfaceC4569te interfaceC4569te, Context context, C4605ve c4605ve, Context context2) {
        C4462ne c4462ne = be.h;
        if (c4462ne != null) {
            be.a(interfaceC4569te, c4462ne);
            return;
        }
        be.g.add(interfaceC4569te);
        if (be.j) {
            return;
        }
        be.i = null;
        be.a(true);
        be.k = new Date().getTime();
        be.b.a(context, c4605ve, be.a, be.new d(context2));
    }

    public final void a(C4623we c4623we) {
        this.a.c(new uv6(0, c4623we, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4623we c4623we, Be be) {
        C4462ne c4462ne = new C4462ne(c4623we, null, null, 6, null);
        be.b(c4462ne);
        be.a(c4462ne);
    }

    public final void a(C4498pe c4498pe) {
        this.a.c(new xsna.k0(1, this, c4498pe));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Be be, C4498pe c4498pe) {
        be.a(c4498pe, (C4278d9) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C4498pe c4498pe, C4278d9 c4278d9) {
        this.i = c4498pe;
        a(false);
        Iterator<InterfaceC4569te> it = this.g.iterator();
        while (it.hasNext()) {
            a(it.next(), c4498pe);
        }
        this.g.clear();
        if (c4278d9 != null) {
            c4278d9.b();
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: " + c4498pe, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, C4462ne c4462ne) {
        Se i;
        b(c4462ne);
        M1 a2 = c4462ne.a();
        V4 v4 = V4.a;
        v4.c(a2.g());
        Kb.b bVar = Kb.u;
        bVar.a().o().a(a2.c());
        if (bVar.d().h().e() && (i = c4462ne.i()) != null) {
            this.c.a(context, i);
        }
        C4278d9 f = c4462ne.f();
        if (f != null) {
            f.b();
        }
        v4.a(a2.f());
        v4.a(a2.j());
        IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(a2.h());
        c().a(a2);
        a(context, this.a.g(), c4462ne.d());
        this.a.a(new Date().getTime() - this.k, c4462ne.g());
        Ze ze = new Ze();
        this.d = ze;
        ze.a(c());
        IronSourceUtils.e(context, c4462ne.d().toString());
        bVar.d().q().c(true);
        G9.i().c(true);
        C4337ge.i().c(true);
        C4282dd c4282dd = C4282dd.P;
        c4282dd.c(true);
        b(context, c4462ne);
        IronSourceLoggerManager.getLogger(0).setDebugLevel(c4462ne.e().b());
        F1 b2 = c4462ne.b();
        if (b2.f()) {
            this.a.a(b2);
        }
        a(c4462ne);
        c4282dd.i();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("parameters for init url: " + Xe.a());
        ironLog.verbose("parameters for init POST data: " + Xe.b());
    }

    private final void a(C4462ne c4462ne) {
        Iterator<InterfaceC4569te> it = this.g.iterator();
        while (it.hasNext()) {
            a(it.next(), c4462ne);
        }
        this.g.clear();
    }

    private final void a(boolean z) {
        this.j = z;
        this.a.a(b());
    }

    private final void a(InterfaceC4569te interfaceC4569te, C4462ne c4462ne) {
        this.a.a(new tv6(interfaceC4569te, c4462ne, 0));
    }

    private final void a(InterfaceC4569te interfaceC4569te, C4498pe c4498pe) {
        this.a.a(new h12(1, interfaceC4569te, c4498pe));
    }

    public static /* synthetic */ void a(Be be, AbstractC4415l3 abstractC4415l3, J1 j1, Context context, Ve ve, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        be.a(abstractC4415l3, j1, context, ve, z);
    }

    private final void a(AbstractC4415l3 abstractC4415l3, J1 j1, Context context, Ve ve, boolean z) {
        abstractC4415l3.a(z);
        abstractC4415l3.a(j1.c(), context);
        abstractC4415l3.b(j1.d(), context);
        abstractC4415l3.a(j1.f());
        abstractC4415l3.d(j1.e());
        abstractC4415l3.b(j1.a());
        abstractC4415l3.b(j1.i(), context);
        abstractC4415l3.c(j1.h(), context);
        abstractC4415l3.a(j1.j(), context);
        abstractC4415l3.d(j1.g(), context);
        abstractC4415l3.a(ve.c().b().j());
        abstractC4415l3.b(j1.k());
        abstractC4415l3.c(j1.b());
    }
}
