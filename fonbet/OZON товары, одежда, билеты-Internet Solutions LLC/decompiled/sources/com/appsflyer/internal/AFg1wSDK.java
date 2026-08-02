package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFg1wSDK implements AFg1sSDK {

    @NotNull
    private final AppsFlyerProperties AFInAppEventParameterName;

    @NotNull
    private final Context values;

    public AFg1wSDK(@NotNull Context context, @NotNull AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.values = context;
        this.AFInAppEventParameterName = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFg1sSDK
    public final AFg1tSDK AFInAppEventType() {
        String string;
        if (!Boolean.parseBoolean(this.AFInAppEventParameterName.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.values);
            int i11 = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i12 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i13 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
            int i14 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = "";
            if (i11 == 1 && (string = defaultSharedPreferences.getString("IABTCF_TCString", "")) != null) {
                Intrinsics.checkNotNullExpressionValue(string, "");
                str = string;
            }
            return new AFg1tSDK(i13, i11, i12, i14, str);
        } catch (Exception e11) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1gSDK.DMA, "TCF data collection exception", e11, false, false, false, false, 120, null);
            return null;
        }
    }
}
