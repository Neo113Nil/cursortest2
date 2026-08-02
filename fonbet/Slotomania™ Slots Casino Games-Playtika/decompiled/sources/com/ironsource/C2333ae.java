package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.ae, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2333ae implements V<RewardedAd> {
    private final InterfaceC2371cg a;
    private final RewardedAdLoaderListener b;

    public C2333ae(InterfaceC2371cg threadManager, RewardedAdLoaderListener publisherListener) {
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.a = threadManager;
        this.b = publisherListener;
    }

    @Override // com.ironsource.V
    public void b(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoadFailed error: " + error);
        this.a.a(new Runnable() { // from class: com.ironsource.ae$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C2333ae.a(C2333ae.this, error);
            }
        });
    }

    @Override // com.ironsource.V
    public void a(final RewardedAd adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.a.a(new Runnable() { // from class: com.ironsource.ae$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C2333ae.a(RewardedAd.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(RewardedAd adObject, C2333ae this$0) {
        Intrinsics.checkNotNullParameter(adObject, "$adObject");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.b.onRewardedAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2333ae this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.b.onRewardedAdLoadFailed(error);
    }
}
