package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFg1qSDK implements AFg1rSDK {
    private final Context AFAdRevenueData;
    private final AppsFlyerProperties getRevenue;

    public AFg1qSDK(Context context, AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.AFAdRevenueData = context;
        this.getRevenue = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final AFg1oSDK AFAdRevenueData() {
        String string;
        if (!Boolean.parseBoolean(this.getRevenue.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.AFAdRevenueData);
            int i = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i2 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i3 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
            int i4 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = "";
            if (i == 1 && (string = defaultSharedPreferences.getString("IABTCF_TCString", "")) != null) {
                Intrinsics.checkNotNullExpressionValue(string, "");
                str = string;
            }
            return new AFg1oSDK(i3, i, i2, i4, str);
        } catch (Exception e) {
            AFh1wSDK.e$default(AFLogger.INSTANCE, AFh1xSDK.DMA, "TCF data collection exception", e, false, false, false, false, 120, null);
            return null;
        }
    }
}
