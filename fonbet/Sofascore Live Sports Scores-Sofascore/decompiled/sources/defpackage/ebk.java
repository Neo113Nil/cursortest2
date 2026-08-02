package defpackage;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.MetaData;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class ebk {
    public static AdError a(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        int i = dbk.b[unityAdsInitializationError.ordinal()];
        return new AdError(i != 1 ? i != 2 ? i != 3 ? 300 : 303 : Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE : Sdk.SDKError.Reason.MRAID_ERROR_VALUE, str, "com.unity3d.ads");
    }

    public static AdError b(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        int i = dbk.c[unityAdsLoadError.ordinal()];
        return new AdError(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 400 : 405 : 404 : 403 : TTAdConstant.AD_ID_IS_NULL_CODE : 401, str, "com.unity3d.ads");
    }

    public static AdError c(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        int i;
        switch (dbk.d[unityAdsShowError.ordinal()]) {
            case 1:
                i = 501;
                break;
            case 2:
                i = 502;
                break;
            case 3:
                i = PglCryptUtils.COMPRESS_FAILED;
                break;
            case 4:
                i = PglCryptUtils.BASE64_FAILED;
                break;
            case 5:
                i = 505;
                break;
            case 6:
                i = 506;
                break;
            case 7:
                i = PglCryptUtils.UNKNOWN_ERR;
                break;
            case 8:
                i = IronSourceError.ERROR_CODE_INIT_FAILED;
                break;
            default:
                i = 500;
                break;
        }
        return new AdError(i, str, "com.unity3d.ads");
    }

    public static void d(RequestConfiguration requestConfiguration, MetaData metaData) {
        int tagForChildDirectedTreatment = requestConfiguration.getTagForChildDirectedTreatment();
        int tagForUnderAgeOfConsent = requestConfiguration.getTagForUnderAgeOfConsent();
        if (tagForChildDirectedTreatment == 1 || tagForUnderAgeOfConsent == 1 || !(tagForChildDirectedTreatment == 0 || tagForUnderAgeOfConsent == 0)) {
            metaData.set("user.nonbehavioral", Boolean.TRUE);
        } else {
            metaData.set("user.nonbehavioral", Boolean.FALSE);
        }
        metaData.commit();
    }
}
