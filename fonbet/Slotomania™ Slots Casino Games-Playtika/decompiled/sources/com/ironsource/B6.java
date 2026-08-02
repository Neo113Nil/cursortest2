package com.ironsource;

import android.app.Activity;
import com.ironsource.C2594p6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class B6 implements InterfaceC2683u6, C2594p6.b, C2594p6.a {
    public static final a f = new a(null);
    public static final String g = "Fullscreen ProgressiveOnShown Strategy";
    private final C2588p0 a;
    private final InterfaceC2612q6 b;
    private final InterfaceC2647s6 c;
    private final InterfaceC2665t6 d;
    private H6 e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public B6(C2588p0 adTools, InterfaceC2612q6 factory, InterfaceC2647s6 fullscreenAdUnitListener, InterfaceC2665t6 listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a = adTools;
        this.b = factory;
        this.c = fullscreenAdUnitListener;
        this.d = listener;
        this.e = new C6(this, null, false, 4, null);
    }

    public final C2588p0 a() {
        return this.a;
    }

    public final InterfaceC2612q6 b() {
        return this.b;
    }

    public final InterfaceC2647s6 c() {
        return this.c;
    }

    public final InterfaceC2665t6 d() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC2683u6
    public void loadAd() {
        this.e.loadAd();
    }

    @Override // com.ironsource.InterfaceC2683u6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.e.a(activity);
    }

    @Override // com.ironsource.C2594p6.b
    public void b(C2594p6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.c(adInfo);
    }

    @Override // com.ironsource.C2594p6.b
    public void c(C2594p6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.b(adInfo);
    }

    public final void a(H6 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.e = state;
    }

    @Override // com.ironsource.C2594p6.b
    public void b(C2594p6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.a(ironSourceError);
    }

    public final void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a.e().h().f("Fullscreen ProgressiveOnShown Strategy - " + message);
    }

    @Override // com.ironsource.C2594p6.a
    public void a(C2594p6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.a(adInfo);
    }

    @Override // com.ironsource.C2594p6.a
    public void a(C2594p6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.c(ironSourceError);
    }

    @Override // com.ironsource.C2594p6.b
    public void a(C2594p6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.a();
    }
}
