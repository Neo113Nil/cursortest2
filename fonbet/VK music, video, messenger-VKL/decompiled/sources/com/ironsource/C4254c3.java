package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdView;
import xsna.e50;
import xsna.he6;

/* renamed from: com.ironsource.c3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4254c3 implements V<BannerAdView> {
    private final InterfaceC4357hg a;
    private final BannerAdLoaderListener b;

    public C4254c3(InterfaceC4357hg interfaceC4357hg, BannerAdLoaderListener bannerAdLoaderListener) {
        this.a = interfaceC4357hg;
        this.b = bannerAdLoaderListener;
    }

    @Override // com.ironsource.V
    public void a(BannerAdView bannerAdView) {
        this.a.a(new e50(10, bannerAdView, this));
    }

    @Override // com.ironsource.V
    public void b(IronSourceError ironSourceError) {
        this.a.a(new he6(8, ironSourceError, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BannerAdView bannerAdView, C4254c3 c4254c3) {
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoaded adInfo: " + bannerAdView.getAdInfo());
        c4254c3.b.onBannerAdLoaded(bannerAdView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError ironSourceError, C4254c3 c4254c3) {
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoadFailed error: " + ironSourceError);
        c4254c3.b.onBannerAdLoadFailed(ironSourceError);
    }
}
