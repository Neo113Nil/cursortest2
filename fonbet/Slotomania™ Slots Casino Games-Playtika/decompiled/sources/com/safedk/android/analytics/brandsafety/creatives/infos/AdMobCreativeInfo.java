package com.safedk.android.analytics.brandsafety.creatives.infos;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;

@AdNetworkIdentifier(packageName = h.h)
/* loaded from: classes6.dex */
public class AdMobCreativeInfo extends CreativeInfo {
    private static String[] Y = {"googleusercontent.com", "/simgad/", "mts0.google.com", "gstatic.com", "pageadimg/imgad"};
    private static final String a = "AdMobCreativeInfo";
    private static final long serialVersionUID = 0;

    public AdMobCreativeInfo() {
    }

    public AdMobCreativeInfo(String id, BrandSafetyUtils.AdType adType, String creativeId, String clickUrl, String placementId, String videoUrl, String sdkVersion, String downstreamStruct, String appPackageName) {
        super(adType, h.h, id, creativeId, clickUrl, videoUrl, downstreamStruct, sdkVersion);
        this.K = placementId;
        if (p() == null && appPackageName != null) {
            q(appPackageName);
        }
    }

    public static boolean a(String str) {
        for (String str2 : Y) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    protected boolean b(String str) {
        return a(str) || super.b(str);
    }
}
