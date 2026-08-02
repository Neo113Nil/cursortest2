package com.appsflyer.share;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.AFa1zSDK;
import com.appsflyer.internal.AFc1dSDK;
import com.appsflyer.internal.AFe1nSDK;
import com.appsflyer.internal.AFe1ySDK;
import com.appsflyer.internal.AFe1ySDK.AnonymousClass1;
import com.appsflyer.internal.AFj1nSDK;
import com.appsflyer.internal.AFj1rSDK;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class CrossPromotionHelper {
    private static String registerClient = "https://%simpression.%s";

    private static void AFKeystoreWrapper(@NonNull String str, @NonNull Context context, @Nullable AFj1nSDK aFj1nSDK) {
        AFa1zSDK d = AFa1zSDK.d();
        AFc1dSDK aFc1dSDK = d.AFKeystoreWrapper;
        if (context != null) {
            aFc1dSDK.registerClient.d = context.getApplicationContext();
        }
        AFc1dSDK aFc1dSDK2 = d.AFKeystoreWrapper;
        AFe1nSDK aFe1nSDK = new AFe1nSDK(aFc1dSDK2, str, aFj1nSDK);
        AFe1ySDK afWarnLog = aFc1dSDK2.afWarnLog();
        afWarnLog.unregisterClient.execute(afWarnLog.new AnonymousClass1(aFe1nSDK));
    }

    @NonNull
    private static LinkGenerator AFLogger(@NonNull Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.d = str3;
        linkGenerator.unregisterClient = str;
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
        LinkGenerator AFLogger = AFLogger(context, str, str2, map, String.format(Locale.US, AFj1rSDK.AFLogger, AppsFlyerLib.getInstance().getHostPrefix(), AFa1zSDK.d().getHostName()));
        if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.i(LogTag.CROSS_PROMOTION, "SDK is stopped, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        AFKeystoreWrapper(AFLogger.generateLink(), context, new AFj1nSDK(context));
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.i(LogTag.CROSS_PROMOTION, "SDK is stopped, Promote Impression is disabled", true);
        } else {
            AFKeystoreWrapper(AFLogger(context, str, str2, map, String.format(Locale.US, registerClient, AppsFlyerLib.getInstance().getHostPrefix(), AFa1zSDK.d().getHostName())).generateLink(), context, null);
        }
    }

    public static void setUrl(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            key.getClass();
            if (key.equals("app")) {
                AFj1rSDK.AFLogger = value;
            } else if (key.equals("impression")) {
                registerClient = value;
            }
        }
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }
}
