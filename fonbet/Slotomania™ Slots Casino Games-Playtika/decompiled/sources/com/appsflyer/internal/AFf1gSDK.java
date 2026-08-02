package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.vungle.ads.internal.model.Cookie;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFf1gSDK implements AFf1cSDK {
    private final Context AFAdRevenueData;
    private final AppsFlyerProperties getMediationNetwork;

    public AFf1gSDK(Context context, AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.AFAdRevenueData = context;
        this.getMediationNetwork = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFf1cSDK
    public final AFf1fSDK getMediationNetwork() {
        String string;
        if (!Boolean.parseBoolean(this.getMediationNetwork.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.AFAdRevenueData);
            int i = defaultSharedPreferences.getInt(Cookie.IABTCF_GDPR_APPLIES, -1);
            int i2 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i3 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
            int i4 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = "";
            if (i == 1 && (string = defaultSharedPreferences.getString("IABTCF_TCString", "")) != null) {
                Intrinsics.checkNotNullExpressionValue(string, "");
                str = string;
            }
            return new AFf1fSDK(i3, i, i2, i4, str);
        } catch (Exception e) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.DMA, "TCF data collection exception", e, false, false, false, false, 120, null);
            return null;
        }
    }
}
