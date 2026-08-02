package defpackage;

import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tuc extends xka implements Function2 {
    public final /* synthetic */ uuc i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tuc(uuc uucVar) {
        super(2);
        this.i = uucVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        RewardedInterstitialAd rewardedInterstitialAd = (RewardedInterstitialAd) obj;
        MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) obj2;
        uuc uucVar = this.i;
        MediationAdLoadCallback mediationAdLoadCallback = uucVar.a;
        if (adCreateError != null) {
            mediationAdLoadCallback.onFailure(new AdError(adCreateError.getErrorCode(), adCreateError.getDescription(), "com.moloco.sdk"));
        } else if (rewardedInterstitialAd == null) {
            mediationAdLoadCallback.onFailure(new AdError(103, MolocoMediationAdapter.ERROR_MSG_AD_IS_NULL, MolocoMediationAdapter.ADAPTER_ERROR_DOMAIN));
        } else {
            uucVar.e = rewardedInterstitialAd;
            rewardedInterstitialAd.load(uucVar.c, uucVar);
        }
        return Unit.a;
    }
}
