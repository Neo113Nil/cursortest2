package com.ironsource;

import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class I2 implements H2 {
    private final InterfaceC2642s1 a;
    private final Executor b;

    public I2(InterfaceC2642s1 analytics, Executor callbackExecutor) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.a = analytics;
        this.b = callbackExecutor;
    }

    @Override // com.ironsource.H2
    public BannerAdView a(J9 adInstance, C2417f8 adContainer, Y1 auctionDataReporter) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        return new BannerAdView(new P2(adInstance, adContainer, auctionDataReporter, this.a, null, null, null, null, null, 496, null));
    }
}
