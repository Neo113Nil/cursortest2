package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class J implements E {
    public static final int j = 8;
    public final RewardedInterstitialAdShowListener a;
    public final boolean b;
    public final Function0<Boolean> c;
    public final String d;
    public final boolean e;
    public final Function0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> f;
    public final MetricsRecorder g;
    public final String h;
    public boolean i;

    /* JADX WARN: Multi-variable type inference failed */
    public J(RewardedInterstitialAdShowListener listenerTracker, boolean z, Function0<Boolean> isAdForciblyClosed, String adUnitId, boolean z2, Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> getCreativeType, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(listenerTracker, "listenerTracker");
        Intrinsics.checkNotNullParameter(isAdForciblyClosed, "isAdForciblyClosed");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(getCreativeType, "getCreativeType");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = listenerTracker;
        this.b = z;
        this.c = isAdForciblyClosed;
        this.d = adUnitId;
        this.e = z2;
        this.f = getCreativeType;
        this.g = metricsRecorder;
        this.h = "RewardedInterstitialAdShowListenerImpl";
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
    
        if (r0 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MolocoAd molocoAd) {
        String lowerCase;
        String name;
        if (this.i) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, this.h, "issuing of reward is already handled", false, 4, null);
            return;
        }
        this.i = true;
        if (!Intrinsics.areEqual(this.c.invoke(), Boolean.FALSE)) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, this.h, "reward can't be issued: ad was forcibly closed or ad was missing", false, 4, null);
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i invoke = this.f.invoke();
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, this.h, "issuing of reward... creativeType: " + invoke, false, 4, null);
        MetricsRecorder metricsRecorder = this.g;
        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.X.c());
        String c = com.moloco.sdk.internal.client_metrics_data.d.h.c();
        if (invoke != null && (name = invoke.name()) != null) {
            lowerCase = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        }
        lowerCase = "UNKNOWN".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        metricsRecorder.recordCountEvent(countEvent.withTag(c, lowerCase));
        onUserRewarded(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdClicked(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdHidden(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        a(molocoAd);
        this.a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowFailed(MolocoAdError molocoAdError) {
        Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        this.a.onAdShowFailed(molocoAdError);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowSuccess(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.a.onAdShowSuccess(molocoAd);
        if (this.b) {
            onRewardedVideoStarted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onRewardedVideoCompleted(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        a(molocoAd);
        this.a.onRewardedVideoCompleted(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onRewardedVideoStarted(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.a.onRewardedVideoStarted(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onUserRewarded(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.a.onUserRewarded(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.E
    public void a() {
        if (this.e) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, this.h, "onCloseOrSkipButtonShown called - granting reward as skip button is now available (feature flag enabled)", null, false, 12, null);
            a(MolocoAdKt.createAdInfo$default(this.d, null, null, 6, null));
        } else {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, this.h, "onCloseOrSkipButtonShown called - skip button shown but reward requires user click (feature flag disabled)", null, false, 12, null);
        }
    }
}
