package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdView;
import defpackage.s5l;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.a3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3952a3 implements V<BannerAdView> {

    @NotNull
    private final InterfaceC4080fg a;

    @NotNull
    private final BannerAdLoaderListener b;

    public C3952a3(@NotNull InterfaceC4080fg interfaceC4080fg, @NotNull BannerAdLoaderListener bannerAdLoaderListener) {
        interfaceC4080fg.getClass();
        bannerAdLoaderListener.getClass();
        this.a = interfaceC4080fg;
        this.b = bannerAdLoaderListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BannerAdView bannerAdView, C3952a3 c3952a3) {
        bannerAdView.getClass();
        c3952a3.getClass();
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoaded adInfo: " + bannerAdView.getAdInfo());
        c3952a3.b.onBannerAdLoaded(bannerAdView);
    }

    @Override // com.ironsource.V
    public void a(@NotNull BannerAdView bannerAdView) {
        bannerAdView.getClass();
        this.a.a(new s5l(15, bannerAdView, this));
    }

    @Override // com.ironsource.V
    public void a(@NotNull IronSourceError ironSourceError) {
        ironSourceError.getClass();
        this.a.a(new s5l(16, ironSourceError, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError ironSourceError, C3952a3 c3952a3) {
        ironSourceError.getClass();
        c3952a3.getClass();
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoadFailed error: " + ironSourceError);
        c3952a3.b.onBannerAdLoadFailed(ironSourceError);
    }
}
