package com.appsflyer.internal;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class AFg1uSDK {
    public volatile String areAllFieldsValid;
    public volatile String component2;
    public final AFd1lSDK getCurrencyIso4217Code;
    Map<String, Object> getMediationNetwork;
    public long getMonetizationNetwork;
    public final AFg1tSDK getRevenue;
    public boolean AFAdRevenueData = false;
    public volatile boolean component3 = false;

    public AFg1uSDK(AFd1lSDK aFd1lSDK, AFg1tSDK aFg1tSDK) {
        this.getCurrencyIso4217Code = aFd1lSDK;
        this.getRevenue = aFg1tSDK;
    }

    public final boolean getRevenue() {
        return this.component3;
    }

    public final String getMediationNetwork(AFd1pSDK aFd1pSDK) {
        String str;
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String AFAdRevenueData = aFd1pSDK.AFAdRevenueData("imeiCached", (String) null);
        if (!z || !AFc1rSDK.getMediationNetwork(this.areAllFieldsValid)) {
            if (this.areAllFieldsValid != null) {
                str = this.areAllFieldsValid;
            }
            str = null;
        } else {
            Context context = this.getCurrencyIso4217Code.getCurrencyIso4217Code;
            if (context != null && getRevenue(context)) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    str = (String) telephonyManager.getClass().getMethod("getDeviceId", null).invoke(telephonyManager, null);
                } catch (InvocationTargetException e) {
                    if (AFAdRevenueData != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(AFAdRevenueData)));
                    } else {
                        AFAdRevenueData = null;
                    }
                    StringBuilder sb = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
                    sb.append(e.getMessage());
                    AFLogger.afErrorLog(sb.toString(), e);
                } catch (Exception e2) {
                    if (AFAdRevenueData != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(AFAdRevenueData)));
                    } else {
                        AFAdRevenueData = null;
                    }
                    StringBuilder sb2 = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
                    sb2.append(e2.getMessage());
                    AFLogger.afErrorLog(sb2.toString(), e2);
                }
                if (str == null) {
                    if (AFAdRevenueData != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(AFAdRevenueData)));
                    } else {
                        AFAdRevenueData = null;
                    }
                    str = AFAdRevenueData;
                }
            }
            str = null;
        }
        if (!AFc1rSDK.getMediationNetwork(str)) {
            aFd1pSDK.getMonetizationNetwork("imeiCached", str);
            return str;
        }
        AFLogger.afInfoLog("IMEI was not collected.");
        return null;
    }

    public final Map<String, Object> getMonetizationNetwork(Map<String, Object> map) {
        try {
            try {
                Object[] objArr = {map, this.getCurrencyIso4217Code.getCurrencyIso4217Code};
                Object obj = AFa1vSDK.AFLogger.get(-600174924);
                if (obj == null) {
                    obj = ((Class) AFa1vSDK.AFAdRevenueData((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 357 - TextUtils.indexOf("", "", 0), 36 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).getDeclaredConstructor(Map.class, Context.class);
                    AFa1vSDK.AFLogger.put(-600174924, obj);
                }
                return (Map) ((Constructor) obj).newInstance(objArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("AFCksmV3: reflection init failed", th2);
            return new HashMap();
        }
    }

    public final Map<String, Object> getCurrencyIso4217Code() {
        HashMap hashMap = new HashMap();
        if (getMonetizationNetwork()) {
            hashMap.put("lvl", this.getMediationNetwork);
            return hashMap;
        }
        if (this.AFAdRevenueData) {
            this.getMediationNetwork = new HashMap();
            AFAdRevenueData();
            this.getMediationNetwork.put("error", "pending LVL response");
            hashMap.put("lvl", this.getMediationNetwork);
        }
        return hashMap;
    }

    private boolean getMonetizationNetwork() {
        Map<String, Object> map = this.getMediationNetwork;
        return (map == null || map.isEmpty()) ? false : true;
    }

    public final boolean getMediationNetwork() {
        return this.AFAdRevenueData && !getMonetizationNetwork();
    }

    final void AFAdRevenueData() {
        this.getMediationNetwork.put("ttr", Long.valueOf(System.currentTimeMillis() - this.getMonetizationNetwork));
        this.getMediationNetwork.put("lvl_timestamp", Long.valueOf(this.getMonetizationNetwork));
    }

    private static boolean getRevenue(Context context) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        AFb1rSDK.getRevenue();
        return !AFb1rSDK.AFAdRevenueData(context);
    }
}
