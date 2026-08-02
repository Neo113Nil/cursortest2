package com.ironsource;

import android.app.Activity;
import com.ironsource.InterfaceC2683u6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.c6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2361c6 extends AbstractC2533m implements InterfaceC2647s6, InterfaceC2665t6 {
    private final InterfaceC2397e6 b;
    private final C2445h0 c;
    private final InterfaceC2683u6 d;

    public /* synthetic */ C2361c6(InterfaceC2397e6 interfaceC2397e6, C2588p0 c2588p0, C2445h0 c2445h0, InterfaceC2683u6.b bVar, InterfaceC2612q6 interfaceC2612q6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2397e6, c2588p0, c2445h0, (i & 8) != 0 ? new InterfaceC2683u6.b() : bVar, interfaceC2612q6);
    }

    public final void a(Activity activity, C2440gd c2440gd) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.c.a(c2440gd);
        this.d.a(activity);
    }

    @Override // com.ironsource.InterfaceC2665t6
    public void b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.b.onAdLoaded(adInfo);
    }

    @Override // com.ironsource.InterfaceC2665t6
    public void c(IronSourceError ironSourceError) {
        InterfaceC2397e6 interfaceC2397e6 = this.b;
        String uuid = this.c.b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adProperties.adId.toString()");
        interfaceC2397e6.a(new LevelPlayAdError(ironSourceError, uuid, this.c.c()));
    }

    @Override // com.ironsource.K0
    public void e() {
        this.b.onAdClicked();
    }

    public final void m() {
        this.d.loadAd();
    }

    @Override // com.ironsource.InterfaceC2665t6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.b.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.InterfaceC2647s6
    public void onClosed() {
        this.b.onAdClosed();
    }

    public C2361c6(InterfaceC2397e6 listener, C2588p0 adTools, C2445h0 adProperties, InterfaceC2683u6.b adUnitStrategyFactory, InterfaceC2612q6 fullscreenAdUnitFactory) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitStrategyFactory, "adUnitStrategyFactory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        this.b = listener;
        this.c = adProperties;
        this.d = adUnitStrategyFactory.a(adTools, adTools.b(adProperties.e(), adProperties.c()), fullscreenAdUnitFactory, this, this);
    }

    @Override // com.ironsource.InterfaceC2665t6
    public void a(IronSourceError ironSourceError) {
        InterfaceC2397e6 interfaceC2397e6 = this.b;
        String uuid = this.c.b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adProperties.adId.toString()");
        interfaceC2397e6.onAdLoadFailed(new LevelPlayAdError(ironSourceError, uuid, this.c.c()));
    }

    @Override // com.ironsource.InterfaceC2665t6
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.b.onAdDisplayed(adInfo);
    }

    @Override // com.ironsource.InterfaceC2647s6
    public void a(LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.b.a(reward);
    }

    @Override // com.ironsource.InterfaceC2665t6
    public void a() {
        this.b.a();
    }
}
