package defpackage;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class obk implements IUnityAdsLoadListener {
    public final /* synthetic */ rbk a;

    public obk(rbk rbkVar) {
        this.a = rbkVar;
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public final void onUnityAdsAdLoaded(String str) {
        rbk rbkVar = this.a;
        rbkVar.e = str;
        rbkVar.d = (MediationRewardedAdCallback) rbkVar.a.onSuccess(rbkVar);
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public final void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        rbk rbkVar = this.a;
        rbkVar.e = str;
        AdError b = ebk.b(unityAdsLoadError, str2);
        b.toString();
        rbkVar.a.onFailure(b);
    }
}
