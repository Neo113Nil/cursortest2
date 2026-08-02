package defpackage;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mbk implements IUnityAdsInitializationListener {
    public final /* synthetic */ InitializationCompleteCallback a;

    public mbk(InitializationCompleteCallback initializationCompleteCallback) {
        this.a = initializationCompleteCallback;
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationComplete() {
        this.a.onInitializationSucceeded();
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        AdError a = ebk.a(unityAdsInitializationError, "Unity Ads initialization failed: [" + unityAdsInitializationError + "] " + str);
        a.toString();
        this.a.onInitializationFailed(a.toString());
    }
}
