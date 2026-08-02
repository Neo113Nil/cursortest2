package defpackage;

import android.content.Context;
import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.MediationMetaData;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jbk {
    public static jbk a;

    public final void a(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        if (UnityAds.isInitialized()) {
            iUnityAdsInitializationListener.onInitializationComplete();
            return;
        }
        MediationMetaData mediationMetaData = new MediationMetaData(context);
        mediationMetaData.setName(MolocoMediationAdapter.MEDIATION_PLATFORM_NAME);
        mediationMetaData.setVersion(UnityAds.getVersion());
        mediationMetaData.set("adapter_version", "4.19.0.0");
        mediationMetaData.commit();
        UnityAds.initialize(context, str, false, iUnityAdsInitializationListener);
    }
}
