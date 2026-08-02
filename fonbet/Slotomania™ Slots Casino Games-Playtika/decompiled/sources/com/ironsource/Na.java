package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Na implements InterfaceC2741xa {
    private final C2588p0 a;
    private final W2 b;
    private final N2 c;
    private InterfaceC2759ya d;
    private Sa e;
    private L2 f;
    private final M0 g;
    private final InterfaceC2767z0 h;
    private final O2 i;

    public static final class a implements O2 {
        a() {
        }

        public void a() {
            InterfaceC2759ya m = Na.this.m();
            if (m != null) {
                m.onAdLeftApplication();
            }
        }

        public void b() {
            InterfaceC2759ya m = Na.this.m();
            if (m != null) {
                m.k();
            }
        }

        public void c() {
            InterfaceC2759ya m = Na.this.m();
            if (m != null) {
                m.i();
            }
        }

        @Override // com.ironsource.K0
        public void e() {
            InterfaceC2759ya m = Na.this.m();
            if (m != null) {
                m.onAdClicked();
            }
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
            Na.this.l().a(adUnitCallback);
        }

        @Override // com.ironsource.M0
        public void a(IronSourceError ironSourceError) {
            Na.this.l().a(ironSourceError);
        }
    }

    public static final class c implements InterfaceC2767z0 {
        c() {
        }

        @Override // com.ironsource.InterfaceC2767z0
        public void a(LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            InterfaceC2759ya m = Na.this.m();
            if (m != null) {
                m.onAdDisplayed(adInfo);
            }
        }

        @Override // com.ironsource.InterfaceC2767z0
        public void c(IronSourceError ironSourceError) {
            InterfaceC2759ya m = Na.this.m();
            if (m != null) {
                m.d(ironSourceError);
            }
        }
    }

    public Na(C2588p0 adTools, W2 bannerContainer, N2 bannerAdUnitFactory) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        this.a = adTools;
        this.b = bannerContainer;
        this.c = bannerAdUnitFactory;
        this.e = new Oa(this);
        this.g = new b();
        this.h = new c();
        this.i = new a();
    }

    public final C2588p0 a() {
        return this.a;
    }

    public final void b(InterfaceC2759ya interfaceC2759ya) {
        this.d = interfaceC2759ya;
    }

    @Override // com.ironsource.InterfaceC2741xa
    public void c() {
        this.e.c();
    }

    @Override // com.ironsource.InterfaceC2741xa
    public void d() {
    }

    public final O2 e() {
        return this.i;
    }

    @Override // com.ironsource.InterfaceC2741xa
    public void f() {
    }

    public final M0 g() {
        return this.g;
    }

    public final InterfaceC2767z0 h() {
        return this.h;
    }

    public final N2 i() {
        return this.c;
    }

    public final W2 j() {
        return this.b;
    }

    public final L2 k() {
        return this.f;
    }

    public final Sa l() {
        return this.e;
    }

    public final InterfaceC2759ya m() {
        return this.d;
    }

    public final void a(Sa sa) {
        Intrinsics.checkNotNullParameter(sa, "<set-?>");
        this.e = sa;
    }

    @Override // com.ironsource.InterfaceC2741xa
    public void b() {
        this.e.b();
    }

    public final void a(L2 l2) {
        this.f = l2;
    }

    public final void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a.e().h().f("Banner Single Ad Unit Strategy - " + message);
    }

    public final void a(C2677u0 adUnitCallback, L2 adUnit) {
        InterfaceC2759ya interfaceC2759ya;
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        adUnit.a(this.b.getViewBinder(), this.h);
        LevelPlayAdInfo c2 = adUnitCallback.c();
        if (c2 == null || (interfaceC2759ya = this.d) == null) {
            return;
        }
        interfaceC2759ya.onAdLoaded(c2);
    }

    public final void a(IronSourceError ironSourceError) {
        InterfaceC2759ya interfaceC2759ya = this.d;
        if (interfaceC2759ya != null) {
            interfaceC2759ya.b(ironSourceError);
        }
    }

    @Override // com.ironsource.InterfaceC2741xa
    public void a(InterfaceC2759ya listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.d = listener;
    }
}
