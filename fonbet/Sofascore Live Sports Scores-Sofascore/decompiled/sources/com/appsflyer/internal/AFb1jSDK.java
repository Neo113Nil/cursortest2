package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.oaid.OaidClient;
import com.appsflyer.sdk_base.logger.LogTag;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFb1jSDK {
    public static String d;

    @Nullable
    public static Boolean registerClient;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AFb1kSDK d(Context context) {
        OaidClient.Info fetch;
        Boolean lat;
        AFc1gSDK imeiData = AFa1zSDK.d().AFKeystoreWrapper.setImeiData();
        String str = d;
        boolean z = str != null;
        if (!z) {
            Boolean bool = registerClient;
            if (bool == null || bool.booleanValue()) {
                try {
                    OaidClient oaidClient = new OaidClient(context);
                    oaidClient.setLogging(imeiData.getEntries.getLevel() > AFLogger.LogLevel.NONE.getLevel());
                    fetch = oaidClient.fetch();
                } catch (Throwable unused) {
                    str = null;
                }
                if (fetch != null) {
                    String id = fetch.getId();
                    try {
                        lat = fetch.getLat();
                        str = id;
                    } catch (Throwable unused2) {
                        str = id;
                        AFLogger.INSTANCE.d(LogTag.ADVERTISING_ID, "OAID library not available in application");
                        lat = null;
                        if (str != null) {
                        }
                    }
                    if (str != null) {
                        return null;
                    }
                    AFb1kSDK aFb1kSDK = new AFb1kSDK(str, lat);
                    aFb1kSDK.unregisterClient = Boolean.valueOf(z);
                    return aFb1kSDK;
                }
            }
            lat = null;
            str = null;
            if (str != null) {
            }
        }
        lat = null;
        if (str != null) {
        }
    }

    @Nullable
    public static AFb1kSDK h_(ContentResolver contentResolver) {
        String str;
        Boolean bool = registerClient;
        if ((bool != null && !bool.booleanValue()) || contentResolver == null || AFa1zSDK.d().AFKeystoreWrapper.AFLogger().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i == 0) {
            return new AFb1kSDK(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
        }
        if (i == 2) {
            return null;
        }
        try {
            str = Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(LogTag.ADVERTISING_ID, "Failed to fetch Amazon Advertising ID: ad tracking may be limited", th);
            str = "";
        }
        return new AFb1kSDK(str, Boolean.TRUE);
    }
}
