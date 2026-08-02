package com.adsbynimbus.google;

import com.google.android.gms.ads.rewarded.RewardItem;
import com.ironsource.Wf;
import defpackage.qcd;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/adsbynimbus/google/NimbusRewardCallback;", "", "", "onAdImpression", "()V", Wf.f, "onAdPresented", Wf.g, "Lcom/google/android/gms/ads/rewarded/RewardItem;", "rewardItem", "onUserEarnedReward", "(Lcom/google/android/gms/ads/rewarded/RewardItem;)V", "Lqcd;", "nimbusError", "onError", "(Lqcd;)V", "google_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface NimbusRewardCallback {
    void onAdClicked();

    void onAdClosed();

    void onAdImpression();

    void onAdPresented();

    void onError(@NotNull qcd nimbusError);

    void onUserEarnedReward(@NotNull RewardItem rewardItem);
}
