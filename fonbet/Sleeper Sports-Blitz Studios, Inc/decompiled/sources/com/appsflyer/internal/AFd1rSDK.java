package com.appsflyer.internal;

import android.content.pm.PackageItemInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.UUID;

/* loaded from: classes6.dex */
public final class AFd1rSDK {
    private static String getMediationNetwork = "298";
    public final AFd1tSDK AFAdRevenueData;
    private Bundle getCurrencyIso4217Code = null;
    public final AFd1lSDK getMonetizationNetwork;
    public final AFd1pSDK getRevenue;

    public AFd1rSDK(AFd1lSDK aFd1lSDK, AFd1pSDK aFd1pSDK, AFd1tSDK aFd1tSDK) {
        this.getMonetizationNetwork = aFd1lSDK;
        this.getRevenue = aFd1pSDK;
        this.AFAdRevenueData = aFd1tSDK;
    }

    public static String getRevenue() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static String getMediationNetwork() {
        return "6.15.1";
    }

    public static String getMonetizationNetwork() {
        return UUID.randomUUID().toString();
    }

    public static String AFAdRevenueData() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    public final boolean component1() {
        return !this.AFAdRevenueData.getMediationNetwork();
    }

    public final String getMonetizationNetwork(String str) {
        Object obj;
        try {
            if (this.getCurrencyIso4217Code == null) {
                this.getCurrencyIso4217Code = ((PackageItemInfo) this.getMonetizationNetwork.getCurrencyIso4217Code.getPackageManager().getApplicationInfo(this.getMonetizationNetwork.getCurrencyIso4217Code.getPackageName(), 128)).metaData;
            }
            Bundle bundle = this.getCurrencyIso4217Code;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Could not load manifest metadata!");
            sb.append(th.getMessage());
            AFLogger.afErrorLog(sb.toString(), th);
            return null;
        }
    }

    public final boolean getRevenue(String str) {
        String monetizationNetwork = getMonetizationNetwork(str);
        if (monetizationNetwork != null) {
            return Boolean.parseBoolean(monetizationNetwork);
        }
        return false;
    }

    public static String component2() {
        StringBuilder sb = new StringBuilder("version: 6.15.1 (build ");
        sb.append(getMediationNetwork);
        sb.append(")");
        return sb.toString();
    }

    public final String areAllFieldsValid() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = getMonetizationNetwork("CHANNEL");
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }

    public final String getCurrencyIso4217Code() {
        AFh1pSDK aFh1pSDK = this.AFAdRevenueData.areAllFieldsValid;
        AFb1tSDK aFb1tSDK = aFh1pSDK != null ? new AFb1tSDK(aFh1pSDK.getMediationNetwork, aFh1pSDK.component1) : null;
        if (aFb1tSDK != null) {
            return aFb1tSDK.getMediationNetwork;
        }
        return null;
    }

    public final String AFAdRevenueData(String str) {
        try {
            int identifier = this.getMonetizationNetwork.getCurrencyIso4217Code.getResources().getIdentifier(str, "string", this.getMonetizationNetwork.getCurrencyIso4217Code.getPackageName());
            if (identifier != 0) {
                return this.getMonetizationNetwork.getCurrencyIso4217Code.getString(identifier);
            }
            return null;
        } catch (Resources.NotFoundException e) {
            StringBuilder sb = new StringBuilder("Could not load string resource!");
            sb.append(e.getMessage());
            AFLogger.afErrorLog(sb.toString(), e);
            return null;
        }
    }
}
