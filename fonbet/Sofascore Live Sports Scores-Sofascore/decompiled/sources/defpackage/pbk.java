package defpackage;

import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pbk implements IUnityAdsShowListener {
    public final /* synthetic */ rbk a;

    public pbk(rbk rbkVar) {
        this.a = rbkVar;
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowClick(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.a.d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        rbk rbkVar = this.a;
        MediationRewardedAdCallback mediationRewardedAdCallback = rbkVar.d;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        if (unityAdsShowCompletionState == UnityAds.UnityAdsShowCompletionState.COMPLETED) {
            mediationRewardedAdCallback.onVideoComplete();
            rbkVar.d.onUserEarnedReward();
        }
        rbkVar.d.onAdClosed();
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        rbk rbkVar = this.a;
        if (rbkVar.d != null) {
            rbkVar.d.onAdFailedToShow(ebk.c(unityAdsShowError, str2));
        }
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowStart(String str) {
        rbk rbkVar = this.a;
        MediationRewardedAdCallback mediationRewardedAdCallback = rbkVar.d;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onAdOpened();
        rbkVar.d.reportAdImpression();
        rbkVar.d.onVideoStart();
    }
}
