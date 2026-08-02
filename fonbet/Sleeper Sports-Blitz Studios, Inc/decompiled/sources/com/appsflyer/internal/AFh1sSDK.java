package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFh1sSDK {
    public final Map<String, Object> AFAdRevenueData;
    public final long[] areAllFieldsValid;
    public final long[] component1;
    public long component2;
    public long component3;
    public final long[] component4;
    public long copy;
    public final Map<String, Object> getCurrencyIso4217Code;
    public long getMediationNetwork;
    public final AFd1pSDK getMonetizationNetwork;
    public final Map<String, Object> getRevenue;
    public long hashCode;

    public AFh1sSDK(AFd1pSDK aFd1pSDK) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.AFAdRevenueData = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.getCurrencyIso4217Code = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        this.getRevenue = concurrentHashMap3;
        this.getMediationNetwork = 0L;
        this.component2 = 0L;
        this.areAllFieldsValid = new long[2];
        this.component4 = new long[2];
        this.component1 = new long[2];
        this.component3 = 0L;
        this.copy = 0L;
        this.getMonetizationNetwork = aFd1pSDK;
        concurrentHashMap.putAll(getMediationNetwork("first_launch"));
        concurrentHashMap2.putAll(getMediationNetwork("ddl"));
        concurrentHashMap3.putAll(getMediationNetwork("gcd"));
        this.hashCode = aFd1pSDK.getRevenue("prev_session_dur", 0L);
    }

    public final void AFAdRevenueData() {
        this.component2 = System.currentTimeMillis();
        if (getMediationNetwork()) {
            long j = this.getMediationNetwork;
            if (j != 0) {
                this.AFAdRevenueData.put("init_to_fg", Long.valueOf(this.component2 - j));
                this.getMonetizationNetwork.getMonetizationNetwork("first_launch", new JSONObject(this.AFAdRevenueData).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: init ts is missing");
        }
    }

    public final void AFAdRevenueData(AFh1qSDK aFh1qSDK) {
        if (getMediationNetwork()) {
            this.AFAdRevenueData.put("start_with", aFh1qSDK.toString());
            this.getMonetizationNetwork.getMonetizationNetwork("first_launch", new JSONObject(this.AFAdRevenueData).toString());
        }
    }

    public final void AFAdRevenueData(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.component3 = currentTimeMillis;
        if (i == 1) {
            long j = this.component2;
            if (j != 0) {
                this.AFAdRevenueData.put("from_fg", Long.valueOf(currentTimeMillis - j));
                this.getMonetizationNetwork.getMonetizationNetwork("first_launch", new JSONObject(this.AFAdRevenueData).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: fg ts is missing");
        }
    }

    public final void getMediationNetwork(DeepLinkResult deepLinkResult, long j) {
        this.getCurrencyIso4217Code.put("status", deepLinkResult.getStatus().toString());
        this.getCurrencyIso4217Code.put("timeout_value", Long.valueOf(j));
        this.getMonetizationNetwork.getMonetizationNetwork("ddl", new JSONObject(this.getCurrencyIso4217Code).toString());
    }

    public final void getRevenue(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.copy;
        if (j != 0) {
            this.getRevenue.put("net", Long.valueOf(currentTimeMillis - j));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.getRevenue.put("retries", Integer.valueOf(i));
        this.getMonetizationNetwork.getMonetizationNetwork("gcd", new JSONObject(this.getRevenue).toString());
    }

    private Map<String, Object> getMediationNetwork(String str) {
        Map<String, Object> map = Collections.EMPTY_MAP;
        String AFAdRevenueData = this.getMonetizationNetwork.AFAdRevenueData(str, (String) null);
        if (AFAdRevenueData != null) {
            try {
                return AFa1oSDK.getMonetizationNetwork(new JSONObject(AFAdRevenueData));
            } catch (Exception e) {
                AFLogger.afErrorLog("Error while parsing cached json data", e, true);
            }
        }
        return map;
    }

    public final boolean getMediationNetwork() {
        return this.getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0) == 0;
    }
}
