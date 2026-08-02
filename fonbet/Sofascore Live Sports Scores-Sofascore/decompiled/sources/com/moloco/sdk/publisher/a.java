package com.moloco.sdk.publisher;

import android.app.Activity;
import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ a(Activity activity, int i) {
        this.a = i;
        this.b = activity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit onCreate$lambda$0;
        Unit onCreate$lambda$02;
        Unit onCreate$lambda$03;
        int i = this.a;
        Activity activity = this.b;
        switch (i) {
            case 0:
                onCreate$lambda$0 = BannerActivitySample.onCreate$lambda$0((BannerActivitySample) activity, (Banner) obj, (MolocoAdError.AdCreateError) obj2);
                return onCreate$lambda$0;
            case 1:
                onCreate$lambda$02 = InterstitialAdActivitySample.onCreate$lambda$0((InterstitialAdActivitySample) activity, (InterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
                return onCreate$lambda$02;
            default:
                onCreate$lambda$03 = RewardedInterstitialAdSample.onCreate$lambda$0((RewardedInterstitialAdSample) activity, (RewardedInterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
                return onCreate$lambda$03;
        }
    }
}
