package defpackage;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.internal.ads.zzeem;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class o3o extends RewardedInterstitialAdLoadCallback {
    public final /* synthetic */ String a;
    public final /* synthetic */ zzeem b;

    public o3o(zzeem zzeemVar, String str) {
        this.a = str;
        Objects.requireNonNull(zzeemVar);
        this.b = zzeemVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.b.F4(zzeem.I4(loadAdError));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd) {
        String str = this.a;
        this.b.E4(rewardedInterstitialAd, str);
    }
}
