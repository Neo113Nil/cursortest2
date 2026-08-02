package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.c3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2358c3 implements V<BannerAdView> {
    private final InterfaceC2371cg a;
    private final BannerAdLoaderListener b;

    public C2358c3(InterfaceC2371cg threadManager, BannerAdLoaderListener publisherListener) {
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.a = threadManager;
        this.b = publisherListener;
    }

    @Override // com.ironsource.V
    public void b(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.a(new Runnable() { // from class: com.ironsource.c3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C2358c3.a(IronSourceError.this, this);
            }
        });
    }

    @Override // com.ironsource.V
    public void a(final BannerAdView adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.a.a(new Runnable() { // from class: com.ironsource.c3$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C2358c3.a(BannerAdView.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BannerAdView adObject, C2358c3 this$0) {
        Intrinsics.checkNotNullParameter(adObject, "$adObject");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.b.onBannerAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error, C2358c3 this$0) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoadFailed error: " + error);
        this$0.b.onBannerAdLoadFailed(error);
    }
}
