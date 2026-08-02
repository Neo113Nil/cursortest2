package com.appsflyer.share;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFd1mSDK;
import com.appsflyer.internal.AFe1fSDK;
import com.appsflyer.internal.AFe1fSDK.AnonymousClass3;
import com.appsflyer.internal.AFf1tSDK;
import com.appsflyer.internal.AFg1gSDK;
import com.appsflyer.internal.AFj1vSDK;
import com.appsflyer.internal.AFj1ySDK;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class CrossPromotionHelper {
    private static String AFInAppEventType = "https://%simpression.%s";

    private static void AFKeystoreWrapper(@NonNull String str, @NonNull Context context, AFj1ySDK aFj1ySDK) {
        AFb1tSDK valueOf = AFb1tSDK.valueOf();
        valueOf.AFInAppEventParameterName(context);
        AFd1mSDK values = valueOf.values();
        AFf1tSDK aFf1tSDK = new AFf1tSDK(values, str, aFj1ySDK);
        AFe1fSDK afInfoLog = values.afInfoLog();
        afInfoLog.AFKeystoreWrapper.execute(afInfoLog.new AnonymousClass3(aFf1tSDK));
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    public static void setUrl(Map<String, String> map) {
        char c11;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            int hashCode = key.hashCode();
            if (hashCode != 96801) {
                if (hashCode == 120623625 && key.equals("impression")) {
                    c11 = 1;
                }
                c11 = 65535;
            } else {
                if (key.equals("app")) {
                    c11 = 0;
                }
                c11 = 65535;
            }
            if (c11 == 0) {
                AFj1vSDK.valueOf = value;
            } else if (c11 == 1) {
                AFInAppEventType = value;
            }
        }
    }

    @NonNull
    private static LinkGenerator values(@NonNull Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.values = str3;
        linkGenerator.AFInAppEventParameterName = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        return linkGenerator;
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator values = values(context, str, str2, map, String.format(AFj1vSDK.valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.valueOf().getHostName()));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.INSTANCE.i(AFg1gSDK.CROSS_PROMOTION, "CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.i(AFg1gSDK.CROSS_PROMOTION, "SDK is stopped, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        AFKeystoreWrapper(values.generateLink(), context, new AFj1ySDK(context));
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.INSTANCE.i(AFg1gSDK.CROSS_PROMOTION, "CustomerUserId not set, Promote Impression is disabled", true);
        } else if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.i(AFg1gSDK.CROSS_PROMOTION, "SDK is stopped, Promote Impression is disabled", true);
        } else {
            AFKeystoreWrapper(values(context, str, str2, map, String.format(AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.valueOf().getHostName())).generateLink(), context, null);
        }
    }
}
