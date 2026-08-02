package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.AFf1zSDK.AnonymousClass3;

/* loaded from: classes6.dex */
public final class AFg1lSDK {
    public static String getRevenue;
    public final AFd1pSDK AFAdRevenueData;

    static {
        StringBuilder sb = new StringBuilder("https://%sregister.%s/api/v");
        sb.append(AFb1rSDK.getMediationNetwork);
        getRevenue = sb.toString();
    }

    public AFg1lSDK(Context context) {
        this.AFAdRevenueData = AFb1rSDK.getRevenue().getCurrencyIso4217Code(context);
    }

    public static boolean getRevenue(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            Class.forName("com.google.firebase.messaging.FirebaseMessagingService");
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1xSDK.UNINSTALL, "An error occurred while trying to verify manifest declarations: ", th);
        }
        return AFb1qSDK.c_(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class));
    }

    public static boolean getCurrencyIso4217Code(AFd1pSDK aFd1pSDK) {
        return aFd1pSDK.AFAdRevenueData("sentRegisterRequestToAF");
    }

    public static void getCurrencyIso4217Code(String str) {
        AFd1kSDK currencyIso4217Code = AFb1rSDK.getRevenue().getCurrencyIso4217Code();
        AFf1cSDK aFf1cSDK = new AFf1cSDK(str, currencyIso4217Code);
        AFf1zSDK copydefault = currencyIso4217Code.copydefault();
        copydefault.getRevenue.execute(copydefault.new AnonymousClass3(aFf1cSDK));
    }

    public final AFg1mSDK AFAdRevenueData() {
        String string;
        String string2;
        String AFAdRevenueData = this.AFAdRevenueData.AFAdRevenueData("afUninstallToken", (String) null);
        long revenue = this.AFAdRevenueData.getRevenue("afUninstallToken_received_time", 0L);
        boolean AFAdRevenueData2 = this.AFAdRevenueData.AFAdRevenueData("afUninstallToken_queued");
        this.AFAdRevenueData.getMediationNetwork("afUninstallToken_queued", false);
        if (AFAdRevenueData == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            AFAdRevenueData = string2.split(",")[r0.length - 1];
        }
        if (revenue == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] split = string.split(",");
            if (split.length >= 2) {
                try {
                    revenue = Long.parseLong(split[split.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (AFAdRevenueData != null) {
            return new AFg1mSDK(AFAdRevenueData, revenue, AFAdRevenueData2);
        }
        return null;
    }
}
