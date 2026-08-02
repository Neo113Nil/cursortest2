package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFj1ySDK;
import io.sentry.protocol.Mechanism;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class AFf1rSDK extends AFf1tSDK {
    private final AFa1lSDK AFInAppEventParameterName;
    private final AFf1mSDK AFInAppEventType;
    private final AFh1uSDK AFKeystoreWrapper;
    private final AppsFlyerProperties AFLogger;
    public Map<String, Object> copy;
    private final AFj1zSDK copydefault;
    private final AFc1sSDK equals;

    public AFf1rSDK(AFh1tSDK aFh1tSDK, AFc1fSDK aFc1fSDK) {
        super(aFh1tSDK, aFc1fSDK);
        this.copydefault = aFc1fSDK.AFInAppEventParameterName();
        this.equals = aFc1fSDK.component1();
        this.AFKeystoreWrapper = aFc1fSDK.component2();
        this.AFInAppEventType = aFc1fSDK.component4();
        this.AFLogger = AppsFlyerProperties.getInstance();
        this.AFInAppEventParameterName = aFc1fSDK.afErrorLogForExcManagerOnly();
        this.getRevenue.add(AFe1uSDK.RESOLVE_ESP);
        this.getRevenue.add(AFe1uSDK.DLSDK);
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1tSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        AFh1uSDK aFh1uSDK = this.AFKeystoreWrapper;
        int i = ((AFf1tSDK) this).component1.component1;
        long currentTimeMillis = System.currentTimeMillis();
        if (i == 1) {
            if (aFh1uSDK.component4 != 0) {
                aFh1uSDK.getMediationNetwork.put("net", Long.valueOf(currentTimeMillis - aFh1uSDK.component4));
                aFh1uSDK.getRevenue.getRevenue("first_launch", new JSONObject(aFh1uSDK.getMediationNetwork).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: launch start ts is missing");
        }
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    protected void getRevenue(AFh1tSDK aFh1tSDK) {
        super.getRevenue(aFh1tSDK);
        int i = aFh1tSDK.component1;
        getMediationNetwork(i);
        Map map = (Map) aFh1tSDK.getMonetizationNetwork.get(Mechanism.JsonKeys.META);
        if (map == null) {
            map = new HashMap();
            aFh1tSDK.getMonetizationNetwork.put(Mechanism.JsonKeys.META, map);
        }
        if (!aFh1tSDK.getMonetizationNetwork.containsKey("af_deeplink")) {
            aFh1tSDK.getCurrencyIso4217Code(this.AFInAppEventParameterName.getCurrencyIso4217Code());
        }
        AFh1cSDK revenue = this.AFInAppEventType.getRevenue();
        if (revenue != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("cdn_token", revenue.getCurrencyIso4217Code);
            if (revenue.getMediationNetwork != null) {
                hashMap.put("c_ver", revenue.getMediationNetwork);
            }
            if (revenue.getRevenue > 0) {
                hashMap.put("latency", Long.valueOf(revenue.getRevenue));
            }
            if (revenue.getMonetizationNetwork > 0) {
                hashMap.put("delay", Long.valueOf(revenue.getMonetizationNetwork));
            }
            if (revenue.AFAdRevenueData > 0) {
                hashMap.put("res_code", Integer.valueOf(revenue.AFAdRevenueData));
            }
            if (revenue.component1 != null) {
                hashMap.put("error", new StringBuilder().append(revenue.component1.getClass().getSimpleName()).append(": ").append(revenue.component1.getMessage()).toString());
            }
            if (revenue.component3 != null) {
                hashMap.put("sig", revenue.component3.toString());
            }
            if (revenue.areAllFieldsValid != null) {
                hashMap.put("cdn_cache_status", revenue.areAllFieldsValid);
            }
            map.put("rc", hashMap);
        }
        ((AFf1tSDK) this).hashCode.getCurrencyIso4217Code(aFh1tSDK.getMonetizationNetwork);
        if (i == 1) {
            if (this.AFLogger.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFh1tSDK.getMonetizationNetwork.put("wait_cid", Boolean.toString(true));
            }
            HashMap hashMap2 = new HashMap(this.AFKeystoreWrapper.AFAdRevenueData);
            this.AFKeystoreWrapper.getRevenue.getMediationNetwork("ddl");
            if (!hashMap2.isEmpty()) {
                map.put("ddl", hashMap2);
            }
            HashMap hashMap3 = new HashMap(this.AFKeystoreWrapper.getMediationNetwork);
            if (!hashMap3.isEmpty()) {
                map.put("first_launch", hashMap3);
            }
        } else if (i == 2) {
            HashMap hashMap4 = new HashMap(this.AFKeystoreWrapper.getMediationNetwork);
            if (!hashMap4.isEmpty()) {
                map.put("first_launch", hashMap4);
            }
            this.AFKeystoreWrapper.getRevenue.getMediationNetwork("first_launch");
        }
        if (map.isEmpty()) {
            aFh1tSDK.getMonetizationNetwork.remove(Mechanism.JsonKeys.META);
        }
        if (i <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFj1ySDK aFj1ySDK : this.copydefault.getRevenue()) {
                boolean z = aFj1ySDK instanceof AFi1iSDK;
                int i2 = AnonymousClass5.getCurrencyIso4217Code[aFj1ySDK.component1.ordinal()];
                if (i2 == 1) {
                    if (z) {
                        aFh1tSDK.getMonetizationNetwork("rfr", ((AFi1iSDK) aFj1ySDK).getMediationNetwork);
                        this.equals.getCurrencyIso4217Code(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFj1ySDK.AFAdRevenueData);
                } else if (i2 == 2 && i == 2 && !z) {
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put("source", aFj1ySDK.component4);
                    hashMap5.put("response", "TIMEOUT");
                    hashMap5.put("type", aFj1ySDK.component2);
                    arrayList.add(hashMap5);
                }
            }
            if (!arrayList.isEmpty()) {
                aFh1tSDK.getMonetizationNetwork("referrers", arrayList);
            }
            Object obj = this.copy;
            if (obj != null) {
                aFh1tSDK.getMonetizationNetwork("fb_ddl", obj);
            }
        }
        ((AFf1tSDK) this).hashCode.AFAdRevenueData(aFh1tSDK);
    }

    /* renamed from: com.appsflyer.internal.AFf1rSDK$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AFj1ySDK.AFa1vSDK.values().length];
            getCurrencyIso4217Code = iArr;
            try {
                iArr[AFj1ySDK.AFa1vSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getCurrencyIso4217Code[AFj1ySDK.AFa1vSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    protected void getMediationNetwork(int i) {
        this.AFKeystoreWrapper.getRevenue(i);
    }
}
