package com.ironsource;

import android.content.Context;
import com.ironsource.Be;
import com.ironsource.Jb;
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
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class Be {
    public static final b l = new b(null);
    private static final Lazy<Be> m = LazyKt.lazy(a.a);
    private final Ge a;
    private final Re b;
    private final He c;
    private Ze d;
    private final Lazy e;
    private final String f;
    private final List<InterfaceC2673te> g;
    private C2566ne h;
    private C2602pe i;
    private boolean j;
    private long k;

    static final class a extends Lambda implements Function0<Be> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Be invoke() {
            return new Be(null, null, null, 7, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Be a() {
            return (Be) Be.m.getValue();
        }

        private b() {
        }
    }

    static final class c extends Lambda implements Function0<InterfaceC2505k7> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2505k7 invoke() {
            return Jb.u.d().k();
        }
    }

    public static final class d implements InterfaceC2673te {
        final /* synthetic */ Context b;

        d(Context context) {
            this.b = context;
        }

        @Override // com.ironsource.InterfaceC2673te
        public void a(final C2566ne sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            Ge ge = Be.this.a;
            final Be be = Be.this;
            final Context context = this.b;
            ge.c(new Runnable() { // from class: com.ironsource.Be$d$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Be.d.a(Be.this, context, sdkConfig);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Be this$0, Context applicationContext, C2566ne sdkConfig) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            this$0.a(applicationContext, sdkConfig);
        }

        @Override // com.ironsource.InterfaceC2673te
        public void a(final C2602pe error, final C2364c9 c2364c9) {
            Intrinsics.checkNotNullParameter(error, "error");
            Ge ge = Be.this.a;
            final Be be = Be.this;
            ge.c(new Runnable() { // from class: com.ironsource.Be$d$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    Be.d.a(Be.this, error, c2364c9);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Be this$0, C2602pe error, C2364c9 c2364c9) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(error, "$error");
            this$0.a(error, c2364c9);
        }
    }

    public Be() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Be this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a(true);
    }

    private final InterfaceC2505k7 c() {
        return (InterfaceC2505k7) this.e.getValue();
    }

    public final void d() {
        this.a.d(new Runnable() { // from class: com.ironsource.Be$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                Be.b(Be.this);
            }
        });
    }

    public Be(Ge tools, Re serverInit, He sdkServicesInitializer) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(serverInit, "serverInit");
        Intrinsics.checkNotNullParameter(sdkServicesInitializer, "sdkServicesInitializer");
        this.a = tools;
        this.b = serverInit;
        this.c = sdkServicesInitializer;
        this.e = LazyKt.lazy(c.a);
        this.f = "Be";
        this.g = new ArrayList();
    }

    private final void b(C2566ne c2566ne) {
        this.h = c2566ne;
        a(false);
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

    private final void a(Context context, T9 t9, Ve ve) {
        t9.i(ve.g().h());
        t9.c(ve.g().d());
        C1 b2 = ve.c().b();
        Intrinsics.checkNotNull(b2);
        t9.a(b2.a());
        t9.d(b2.c().b());
        t9.b(b2.k().b());
        t9.a(Boolean.valueOf(IronSourceUtils.c(context)));
        C1 b3 = ve.c().b();
        Intrinsics.checkNotNull(b3);
        t9.b(b3.f().b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC2673te listener, C2566ne sdkConfig) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
        listener.a(sdkConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC2673te listener, C2602pe error) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(error, "$error");
        InterfaceC2673te.a(listener, error, null, 2, null);
    }

    private final void b(Context context, C2566ne c2566ne) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        String str3;
        Context context2;
        J1 b2;
        Pb e;
        J1 g;
        U2 c2;
        J1 g2;
        D9 d2;
        J1 i;
        C2405ee f;
        J1 m2;
        J1 b3;
        Ve d3 = c2566ne.d();
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
        Jb.b bVar = Jb.u;
        bVar.d().q().b(str, context);
        if (z) {
            C1 b5 = d3.c().b();
            if (b5 != null && (b2 = b5.b()) != null) {
                a(this, bVar.d().q(), b2, context, d3, false, 16, null);
            }
        } else {
            bVar.d().q().a(false);
        }
        C2441ge.i().b(str2, context);
        if (z2) {
            N3 c7 = d3.c();
            C2405ee f2 = c7 != null ? c7.f() : null;
            Intrinsics.checkNotNull(f2);
            J1 rewardedVideoConfig = f2.m();
            C2441ge i2 = C2441ge.i();
            Intrinsics.checkNotNullExpressionValue(i2, "getInstance()");
            Intrinsics.checkNotNullExpressionValue(rewardedVideoConfig, "rewardedVideoConfig");
            a(this, i2, rewardedVideoConfig, context, d3, false, 16, null);
        } else {
            C2441ge.i().a(false);
        }
        F9.i().b(str3, context);
        if (z3) {
            N3 c8 = d3.c();
            D9 d4 = c8 != null ? c8.d() : null;
            Intrinsics.checkNotNull(d4);
            J1 interstitialConfig = d4.i();
            F9 i3 = F9.i();
            Intrinsics.checkNotNullExpressionValue(i3, "getInstance()");
            Intrinsics.checkNotNullExpressionValue(interstitialConfig, "interstitialConfig");
            a(this, i3, interstitialConfig, context, d3, false, 16, null);
            context2 = context;
        } else if (l4) {
            N3 c9 = d3.c();
            U2 c10 = c9 != null ? c9.c() : null;
            Intrinsics.checkNotNull(c10);
            J1 bannerConfig = c10.g();
            F9 i4 = F9.i();
            Intrinsics.checkNotNullExpressionValue(i4, "getInstance()");
            Intrinsics.checkNotNullExpressionValue(bannerConfig, "bannerConfig");
            context2 = context;
            a(this, i4, bannerConfig, context2, d3, false, 16, null);
        } else if (l5) {
            N3 c11 = d3.c();
            Pb e2 = c11 != null ? c11.e() : null;
            Intrinsics.checkNotNull(e2);
            J1 g3 = e2.g();
            F9 i5 = F9.i();
            Intrinsics.checkNotNullExpressionValue(i5, "getInstance()");
            context2 = context;
            a(this, i5, g3, context2, d3, false, 16, null);
        } else {
            context2 = context;
            F9.i().a(false);
        }
        N3 c12 = d3.c();
        C1 b6 = c12 != null ? c12.b() : null;
        Intrinsics.checkNotNull(b6);
        C2404ed i6 = b6.i();
        boolean a2 = i6.a();
        String b7 = i6.b();
        boolean c13 = i6.c();
        int d5 = i6.d();
        int[] e3 = i6.e();
        int[] f3 = i6.f();
        C2386dd c2386dd = C2386dd.P;
        c2386dd.a(a2);
        c2386dd.b(b7, context2);
        if (a2) {
            c2386dd.b(e3, context2);
            c2386dd.c(f3, context2);
            c2386dd.b(c13);
            c2386dd.c(d5);
        }
    }

    public final void a(final Context context, final C2709ve initRequest, final InterfaceC2673te listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        final Context applicationContext = context.getApplicationContext();
        this.a.d(new Runnable() { // from class: com.ironsource.Be$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Be.a(Be.this, listener, context, initRequest, applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Be this$0, InterfaceC2673te listener, Context context, C2709ve initRequest, Context context2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        C2566ne c2566ne = this$0.h;
        if (c2566ne != null) {
            this$0.a(listener, c2566ne);
            return;
        }
        this$0.g.add(listener);
        if (this$0.j) {
            return;
        }
        this$0.i = null;
        this$0.a(true);
        this$0.k = new Date().getTime();
        this$0.b.a(context, initRequest, this$0.a, this$0.new d(context2));
    }

    public /* synthetic */ Be(Ge ge, Re re, He he, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Fe() : ge, (i & 2) != 0 ? new Qe(null, 1, null) : re, (i & 4) != 0 ? new He(null, null, null, null, null, 31, null) : he);
    }

    public final void a(final C2727we serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.a.d(new Runnable() { // from class: com.ironsource.Be$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                Be.a(C2727we.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2727we serverResponse, Be this$0) {
        Intrinsics.checkNotNullParameter(serverResponse, "$serverResponse");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C2566ne c2566ne = new C2566ne(serverResponse, null, null, 6, null);
        this$0.b(c2566ne);
        this$0.a(c2566ne);
    }

    public final void a(final C2602pe error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.d(new Runnable() { // from class: com.ironsource.Be$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Be.a(Be.this, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Be this$0, C2602pe error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.a(error, (C2364c9) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C2602pe c2602pe, C2364c9 c2364c9) {
        this.i = c2602pe;
        a(false);
        Iterator<InterfaceC2673te> it = this.g.iterator();
        while (it.hasNext()) {
            a(it.next(), c2602pe);
        }
        this.g.clear();
        if (c2364c9 != null) {
            c2364c9.b();
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: " + c2602pe, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, C2566ne c2566ne) {
        Se i;
        b(c2566ne);
        M1 a2 = c2566ne.a();
        V4 v4 = V4.a;
        v4.c(a2.g());
        Jb.b bVar = Jb.u;
        bVar.a().o().a(a2.c());
        if (bVar.d().h().e() && (i = c2566ne.i()) != null) {
            this.c.a(context, i);
        }
        C2364c9 f = c2566ne.f();
        if (f != null) {
            f.b();
        }
        v4.a(a2.f());
        v4.a(a2.j());
        IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(a2.h());
        c().a(a2);
        a(context, this.a.g(), c2566ne.d());
        this.a.a(new Date().getTime() - this.k, c2566ne.g());
        Ze ze = new Ze();
        this.d = ze;
        ze.a(c());
        IronSourceUtils.e(context, c2566ne.d().toString());
        bVar.d().q().c(true);
        F9.i().c(true);
        C2441ge.i().c(true);
        C2386dd c2386dd = C2386dd.P;
        c2386dd.c(true);
        b(context, c2566ne);
        IronSourceLoggerManager.getLogger(0).setDebugLevel(c2566ne.e().b());
        F1 b2 = c2566ne.b();
        if (b2.f()) {
            this.a.a(b2);
        }
        a(c2566ne);
        c2386dd.i();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("parameters for init url: " + Xe.a());
        ironLog.verbose("parameters for init POST data: " + Xe.b());
    }

    private final void a(C2566ne c2566ne) {
        Iterator<InterfaceC2673te> it = this.g.iterator();
        while (it.hasNext()) {
            a(it.next(), c2566ne);
        }
        this.g.clear();
    }

    private final void a(boolean z) {
        this.j = z;
        this.a.a(b());
    }

    private final void a(final InterfaceC2673te interfaceC2673te, final C2566ne c2566ne) {
        this.a.a(new Runnable() { // from class: com.ironsource.Be$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                Be.b(InterfaceC2673te.this, c2566ne);
            }
        });
    }

    private final void a(final InterfaceC2673te interfaceC2673te, final C2602pe c2602pe) {
        this.a.a(new Runnable() { // from class: com.ironsource.Be$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Be.b(InterfaceC2673te.this, c2602pe);
            }
        });
    }

    static /* synthetic */ void a(Be be, AbstractC2519l3 abstractC2519l3, J1 j1, Context context, Ve ve, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        be.a(abstractC2519l3, j1, context, ve, z);
    }

    private final void a(AbstractC2519l3 abstractC2519l3, J1 j1, Context context, Ve ve, boolean z) {
        abstractC2519l3.a(z);
        abstractC2519l3.a(j1.c(), context);
        abstractC2519l3.b(j1.d(), context);
        abstractC2519l3.a(j1.f());
        abstractC2519l3.d(j1.e());
        abstractC2519l3.b(j1.a());
        abstractC2519l3.b(j1.i(), context);
        abstractC2519l3.c(j1.h(), context);
        abstractC2519l3.a(j1.j(), context);
        abstractC2519l3.d(j1.g(), context);
        C1 b2 = ve.c().b();
        Intrinsics.checkNotNull(b2);
        abstractC2519l3.a(b2.j());
        abstractC2519l3.b(j1.k());
        abstractC2519l3.c(j1.b());
    }
}
