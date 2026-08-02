package com.ironsource;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class Ba implements InterfaceC2741xa {
    private final C2588p0 a;
    private final W2 b;
    private final long c;
    private final long d;
    private final J2 e;
    private InterfaceC2759ya f;
    private final N2 g;
    private final Ef h;
    private final InterfaceC2592p4 i;
    private final boolean j;
    private M0 k;
    private InterfaceC2767z0 l;
    private O2 m;
    private La n;

    public static final class a implements O2 {
        a() {
        }

        public void a() {
            Ba.this.n().onAdLeftApplication();
        }

        public void b() {
            Ba.this.n().k();
        }

        public void c() {
            Ba.this.n().i();
        }

        @Override // com.ironsource.K0
        public void e() {
            Ba.this.n().onAdClicked();
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ Unit g() {
            a();
            return Unit.INSTANCE;
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ Unit h() {
            c();
            return Unit.INSTANCE;
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ Unit j() {
            b();
            return Unit.INSTANCE;
        }
    }

    public static final class b implements M0 {
        b() {
        }

        @Override // com.ironsource.M0
        public void a(C2677u0 adUnitCallback) {
            Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
            Ba.this.m().a(adUnitCallback);
        }

        @Override // com.ironsource.M0
        public void a(IronSourceError ironSourceError) {
            Ba.this.m().a(ironSourceError);
        }
    }

    public static final class c implements InterfaceC2767z0 {
        c() {
        }

        @Override // com.ironsource.InterfaceC2767z0
        public void a(LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            Ba.this.n().onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.InterfaceC2767z0
        public void c(IronSourceError ironSourceError) {
            Ba.this.n().d(ironSourceError);
        }
    }

    static final class d extends Lambda implements Function0<Unit> {
        final /* synthetic */ L2 b;
        final /* synthetic */ AbstractC2412f3 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(L2 l2, AbstractC2412f3 abstractC2412f3) {
            super(0);
            this.b = l2;
            this.c = abstractC2412f3;
        }

        public final void a() {
            Ba.a(Ba.this, this.b, this.c, false, 4, (Object) null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    static final class e extends Lambda implements Function0<Unit> {
        final /* synthetic */ L2 b;
        final /* synthetic */ Long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(L2 l2, Long l) {
            super(0);
            this.b = l2;
            this.c = l;
        }

        public final void a() {
            Ba ba = Ba.this;
            ba.a((La) new Fa(ba, this.b, this.c));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class f implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ L2 b;
        final /* synthetic */ AbstractC2412f3 c;
        final /* synthetic */ Long d;

        static final class a extends Lambda implements Function0<Unit> {
            final /* synthetic */ Ba a;
            final /* synthetic */ L2 b;
            final /* synthetic */ AbstractC2412f3 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ba ba, L2 l2, AbstractC2412f3 abstractC2412f3) {
                super(0);
                this.a = ba;
                this.b = l2;
                this.c = abstractC2412f3;
            }

            public final void a() {
                Ba.a(this.a, this.b, this.c, false, 4, (Object) null);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        static final class b extends Lambda implements Function0<Unit> {
            final /* synthetic */ Ba a;
            final /* synthetic */ L2 b;
            final /* synthetic */ Long c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Ba ba, L2 l2, Long l) {
                super(0);
                this.a = ba;
                this.b = l2;
                this.c = l;
            }

            public final void a() {
                Ba ba = this.a;
                ba.a((La) new Fa(ba, this.b, this.c));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        f(L2 l2, AbstractC2412f3 abstractC2412f3, Long l) {
            this.b = l2;
            this.c = abstractC2412f3;
            this.d = l;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Ba.this.k().getViewTreeObserver().isAlive()) {
                Ba.this.k().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            if (Cg.a(Ba.this.k(), new Rect())) {
                C2688ub.a((C2688ub) Ba.this.a(), AbstractRunnableC2512ke.a.a(new a(Ba.this, this.b, this.c)), 0L, 2, (Object) null);
            } else {
                C2688ub.a((C2688ub) Ba.this.a(), AbstractRunnableC2512ke.a.a(new b(Ba.this, this.b, this.d)), 0L, 2, (Object) null);
            }
        }
    }

    public Ba(C2588p0 adTools, W2 bannerContainer, long j, long j2, J2 bannerAdProperties, InterfaceC2759ya strategyListener, N2 bannerAdUnitFactory, Ef taskScheduler, InterfaceC2592p4 timeProvider, boolean z) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        Intrinsics.checkNotNullParameter(strategyListener, "strategyListener");
        Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.a = adTools;
        this.b = bannerContainer;
        this.c = j;
        this.d = j2;
        this.e = bannerAdProperties;
        this.f = strategyListener;
        this.g = bannerAdUnitFactory;
        this.h = taskScheduler;
        this.i = timeProvider;
        this.j = z;
        this.k = new b();
        this.l = new c();
        this.m = new a();
        this.n = new Da(this, false, 2, null);
    }

    public final C2588p0 a() {
        return this.a;
    }

    public final void b(InterfaceC2759ya interfaceC2759ya) {
        Intrinsics.checkNotNullParameter(interfaceC2759ya, "<set-?>");
        this.f = interfaceC2759ya;
    }

    @Override // com.ironsource.InterfaceC2741xa
    public void c() {
        this.n.c();
    }

    @Override // com.ironsource.InterfaceC2741xa
    public void d() {
        this.n.d();
    }

    public final O2 e() {
        return this.m;
    }

    @Override // com.ironsource.InterfaceC2741xa
    public void f() {
        this.n.f();
    }

    public final M0 g() {
        return this.k;
    }

    public final InterfaceC2767z0 h() {
        return this.l;
    }

    public final J2 i() {
        return this.e;
    }

    public final N2 j() {
        return this.g;
    }

    public final W2 k() {
        return this.b;
    }

    public final long l() {
        return this.c;
    }

    public final La m() {
        return this.n;
    }

    public final InterfaceC2759ya n() {
        return this.f;
    }

    public final Ef o() {
        return this.h;
    }

    public final InterfaceC2592p4 p() {
        return this.i;
    }

    public final long q() {
        return this.d;
    }

    public final void r() {
        this.a.e().h().h("Banner view is not visible");
    }

    public final void a(M0 m0) {
        Intrinsics.checkNotNullParameter(m0, "<set-?>");
        this.k = m0;
    }

    @Override // com.ironsource.InterfaceC2741xa
    public void b() {
        this.n.b();
    }

    public final void a(InterfaceC2767z0 interfaceC2767z0) {
        Intrinsics.checkNotNullParameter(interfaceC2767z0, "<set-?>");
        this.l = interfaceC2767z0;
    }

    public final void a(O2 o2) {
        Intrinsics.checkNotNullParameter(o2, "<set-?>");
        this.m = o2;
    }

    public final void a(La la) {
        Intrinsics.checkNotNullParameter(la, "<set-?>");
        this.n = la;
    }

    public final void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a.e().h().f("Banner Reload Strategy - " + message);
    }

    public final void a(C2677u0 adUnitCallback, L2 currentAdUnit, L2 l2, AbstractC2412f3 reloadReason, boolean z, Long l) {
        Unit unit;
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        currentAdUnit.a(this.b.getViewBinder(), this.l);
        LevelPlayAdInfo c2 = adUnitCallback.c();
        if (c2 != null) {
            this.f.onAdLoaded(c2);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            IronLog.INTERNAL.error(C2588p0.a(this.a, "adInfo is null in handleLoadSuccess", (String) null, 2, (Object) null));
        }
        if (l2 != null) {
            l2.a(false);
        }
        if (z) {
            this.n = new Ha(this, currentAdUnit);
        } else {
            a(currentAdUnit, reloadReason, l);
        }
    }

    public final void a(IronSourceError ironSourceError, L2 currentAdUnit, AbstractC2412f3 reloadReason, boolean z, boolean z2, Long l) {
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        this.f.b(ironSourceError);
        if (z2) {
            this.n = new Ha(this, currentAdUnit);
        } else if (z) {
            a(currentAdUnit, reloadReason, l);
        } else {
            a(currentAdUnit, reloadReason, this.j);
        }
    }

    public final void a(final L2 currentAdUnit, final AbstractC2412f3 reloadReason, final Long l) {
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        C2688ub.a(this.a, new Runnable() { // from class: com.ironsource.Ba$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Ba.a(Ba.this, currentAdUnit, reloadReason, l);
            }
        }, 0L, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ba this$0, L2 currentAdUnit, AbstractC2412f3 reloadReason, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(currentAdUnit, "$currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "$reloadReason");
        if (Cg.a(this$0.b, new Rect())) {
            C2688ub.a((C2688ub) this$0.a, AbstractRunnableC2512ke.a.a(this$0.new d(currentAdUnit, reloadReason)), 0L, 2, (Object) null);
        } else if (!this$0.b.getViewTreeObserver().isAlive()) {
            C2688ub.a((C2688ub) this$0.a, AbstractRunnableC2512ke.a.a(this$0.new e(currentAdUnit, l)), 0L, 2, (Object) null);
        } else {
            this$0.b.getViewTreeObserver().addOnGlobalLayoutListener(this$0.new f(currentAdUnit, reloadReason, l));
        }
    }

    public /* synthetic */ Ba(C2588p0 c2588p0, W2 w2, long j, long j2, J2 j22, InterfaceC2759ya interfaceC2759ya, N2 n2, Ef ef, InterfaceC2592p4 interfaceC2592p4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2588p0, w2, j, j2, j22, interfaceC2759ya, n2, (i & 128) != 0 ? new S6(T6.a(c2588p0.a())) : ef, interfaceC2592p4, z);
    }

    public static /* synthetic */ void a(Ba ba, L2 l2, AbstractC2412f3 abstractC2412f3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        ba.a(l2, abstractC2412f3, z);
    }

    public final void a(L2 currentAdUnit, AbstractC2412f3 reloadReason, boolean z) {
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        L2 a2 = this.g.a(false);
        Ia ia = new Ia(this, currentAdUnit, a2, this.i.a(), z);
        a(reloadReason);
        this.n = ia;
        a2.a(this.k);
    }

    private final void a(AbstractC2412f3 abstractC2412f3) {
        this.a.e().h().a(abstractC2412f3.c(), abstractC2412f3.b(), abstractC2412f3.a());
    }

    @Override // com.ironsource.InterfaceC2741xa
    public void a(InterfaceC2759ya listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f = listener;
    }
}
