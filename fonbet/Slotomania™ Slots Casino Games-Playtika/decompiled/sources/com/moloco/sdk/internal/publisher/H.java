package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class H implements RewardedInterstitialAd, s, FullscreenAd<RewardedInterstitialAdShowListener> {
    public static final a e = new a(null);
    public static final String f = "reward_on_skip_visible";
    public final v<RewardedInterstitialAdShowListener> a;
    public final String b;
    public final com.moloco.sdk.internal.services.config.a c;
    public final MetricsRecorder d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void a() {
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public H(v<? super RewardedInterstitialAdShowListener> fullscreenAd, String adUnitId, com.moloco.sdk.internal.services.config.a configService, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(fullscreenAd, "fullscreenAd");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = fullscreenAd;
        this.b = adUnitId;
        this.c = configService;
        this.d = metricsRecorder;
    }

    public static final com.moloco.sdk.internal.ortb.model.B a(H h) {
        return h.a.d();
    }

    public static final Boolean b(H h) {
        return h.a.f();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i c(H h) {
        return h.a.b();
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        this.a.destroy();
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public long getCreateAdObjectStartTime() {
        return this.a.getCreateAdObjectStartTime();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.a.isLoaded();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(String bidResponseJson, AdLoad.Listener listener) {
        Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        this.a.load(bidResponseJson, listener);
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public void setCreateAdObjectStartTime(long j) {
        this.a.setCreateAdObjectStartTime(j);
    }

    public static final Unit a(J j, H h, boolean z) {
        j.onRewardedVideoCompleted(MolocoAdKt.createAdInfo$default(h.b, null, null, 6, null));
        return Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.publisher.FullscreenAd
    public void show(RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener) {
        final J j = new J(new K(rewardedInterstitialAdShowListener, new Function0() { // from class: com.moloco.sdk.internal.publisher.H$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return H.a(H.this);
            }
        }, com.moloco.sdk.internal.y.b()), this.a.b() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.a, new Function0() { // from class: com.moloco.sdk.internal.publisher.H$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return H.b(H.this);
            }
        }, this.b, this.c.a(f), new Function0() { // from class: com.moloco.sdk.internal.publisher.H$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return H.c(H.this);
            }
        }, this.d);
        this.a.a(new Function1() { // from class: com.moloco.sdk.internal.publisher.H$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return H.a(J.this, this, ((Boolean) obj).booleanValue());
            }
        });
        this.a.a(new Function0() { // from class: com.moloco.sdk.internal.publisher.H$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return H.a(J.this);
            }
        });
        this.a.show(j);
    }

    public static final Unit a(J j) {
        j.a();
        return Unit.INSTANCE;
    }
}
