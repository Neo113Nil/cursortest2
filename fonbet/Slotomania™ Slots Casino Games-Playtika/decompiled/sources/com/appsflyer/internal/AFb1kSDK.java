package com.appsflyer.internal;

import com.appsflyer.AppsFlyerProperties;
import java.security.SecureRandom;

/* loaded from: classes7.dex */
public final class AFb1kSDK {
    private static String getRevenue;

    public static synchronized String getMonetizationNetwork(AFc1sSDK aFc1sSDK) {
        String str;
        synchronized (AFb1kSDK.class) {
            if (getRevenue == null) {
                String AFAdRevenueData = aFc1sSDK.AFAdRevenueData("AF_INSTALLATION", (String) null);
                if (AFAdRevenueData != null) {
                    getRevenue = AFAdRevenueData;
                } else {
                    String obj = new StringBuilder().append(System.currentTimeMillis()).append("-").append(Math.abs(new SecureRandom().nextLong())).toString();
                    getRevenue = obj;
                    aFc1sSDK.getRevenue("AF_INSTALLATION", obj);
                }
                if (getRevenue != null) {
                    AppsFlyerProperties.getInstance().set("uid", getRevenue);
                }
            }
            str = getRevenue;
        }
        return str;
    }
}
