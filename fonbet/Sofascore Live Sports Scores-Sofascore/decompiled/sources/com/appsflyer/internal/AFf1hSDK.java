package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFf1hSDK implements AFf1lSDK {

    @NotNull
    private final Context d;

    @NotNull
    private final AFc1gSDK unregisterClient;

    public AFf1hSDK(@NotNull Context context, @NotNull AFc1gSDK aFc1gSDK) {
        context.getClass();
        aFc1gSDK.getClass();
        this.d = context;
        this.unregisterClient = aFc1gSDK;
    }

    @Override // com.appsflyer.internal.AFf1lSDK
    @Nullable
    public final AFf1jSDK registerClient() {
        String string;
        if (!Intrinsics.c(this.unregisterClient.w, Boolean.TRUE)) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.d);
            int i = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i2 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i3 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
            int i4 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = "";
            if (i == 1 && (string = defaultSharedPreferences.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, "")) != null) {
                str = string;
            }
            return new AFf1jSDK(i3, i, i2, i4, str);
        } catch (Exception e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DMA, "TCF data collection exception", e, false, false, false, false, 120, null);
            return null;
        }
    }
}
