package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFf1tSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.AFf1zSDK.AnonymousClass3;
import com.appsflyer.internal.AFh1xSDK;
import com.appsflyer.internal.AFj1bSDK;
import com.appsflyer.internal.AFj1cSDK;
import io.sentry.protocol.App;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class CrossPromotionHelper {
    private static String AFAdRevenueData = "https://%simpression.%s";

    public static void logAndOpenStore(Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logAndOpenStore(Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator AFAdRevenueData2 = AFAdRevenueData(context, str, str2, map, String.format(AFj1cSDK.getMediationNetwork, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName()));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.INSTANCE.i(AFh1xSDK.CROSS_PROMOTION, "CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.i(AFh1xSDK.CROSS_PROMOTION, "SDK is stopped, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        AFAdRevenueData(AFAdRevenueData2.generateLink(), context, new AFj1bSDK(context));
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.INSTANCE.i(AFh1xSDK.CROSS_PROMOTION, "CustomerUserId not set, Promote Impression is disabled", true);
        } else if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.i(AFh1xSDK.CROSS_PROMOTION, "SDK is stopped, Promote Impression is disabled", true);
        } else {
            AFAdRevenueData(AFAdRevenueData(context, str, str2, map, String.format(AFAdRevenueData, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName())).generateLink(), context, null);
        }
    }

    private static void AFAdRevenueData(String str, Context context, AFj1bSDK aFj1bSDK) {
        AFb1rSDK revenue = AFb1rSDK.getRevenue();
        revenue.getRevenue(context);
        AFd1kSDK currencyIso4217Code = revenue.getCurrencyIso4217Code();
        AFf1tSDK aFf1tSDK = new AFf1tSDK(currencyIso4217Code, str, aFj1bSDK);
        AFf1zSDK copydefault = currencyIso4217Code.copydefault();
        copydefault.getRevenue.execute(copydefault.new AnonymousClass3(aFf1tSDK));
    }

    private static LinkGenerator AFAdRevenueData(Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.AFAdRevenueData = str3;
        linkGenerator.getRevenue = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        return linkGenerator;
    }

    public static void setUrl(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            key.hashCode();
            if (key.equals(App.TYPE)) {
                AFj1cSDK.getMediationNetwork = value;
            } else if (key.equals("impression")) {
                AFAdRevenueData = value;
            }
        }
    }
}
