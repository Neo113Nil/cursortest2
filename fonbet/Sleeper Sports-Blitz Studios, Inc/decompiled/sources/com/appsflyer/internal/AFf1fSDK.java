package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFj1qSDK;
import com.google.android.gms.iid.InstanceID;
import io.sentry.protocol.Response;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFf1fSDK extends AFf1gSDK {
    private final AFc1gSDK AFInAppEventParameterName;
    private final AFg1xSDK AFInAppEventType;
    private final AFi1jSDK AFKeystoreWrapper;
    private final AFd1pSDK copy;
    public Map<String, Object> copydefault;
    private final AFj1sSDK toString;
    private final AFh1sSDK valueOf;
    private final AppsFlyerProperties values;

    public AFf1fSDK(AFa1mSDK aFa1mSDK, AFd1kSDK aFd1kSDK) {
        super(aFa1mSDK, aFd1kSDK);
        this.toString = aFd1kSDK.copy();
        this.copy = aFd1kSDK.getMediationNetwork();
        this.valueOf = aFd1kSDK.component4();
        this.AFInAppEventType = aFd1kSDK.component1();
        this.values = AppsFlyerProperties.getInstance();
        this.AFInAppEventParameterName = aFd1kSDK.force();
        this.AFKeystoreWrapper = aFd1kSDK.i();
        this.AFAdRevenueData.add(AFf1wSDK.RESOLVE_ESP);
        this.AFAdRevenueData.add(AFf1wSDK.DLSDK);
        if (this.getCurrencyIso4217Code == AFf1wSDK.CONVERSION) {
            this.AFAdRevenueData.add(AFf1wSDK.PLAY_INTEGRITY_API);
        }
    }

    @Override // com.appsflyer.internal.AFf1pSDK, com.appsflyer.internal.AFe1bSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        AFh1sSDK aFh1sSDK = this.valueOf;
        int i = ((AFf1gSDK) this).component3.component4;
        long currentTimeMillis = System.currentTimeMillis();
        if (i == 1) {
            if (aFh1sSDK.component3 != 0) {
                aFh1sSDK.AFAdRevenueData.put("net", Long.valueOf(currentTimeMillis - aFh1sSDK.component3));
                aFh1sSDK.getMonetizationNetwork.getMonetizationNetwork("first_launch", new JSONObject(aFh1sSDK.AFAdRevenueData).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: launch start ts is missing");
        }
    }

    @Override // com.appsflyer.internal.AFf1gSDK
    protected final void getMonetizationNetwork(AFa1mSDK aFa1mSDK) {
        Map<String, ?> map;
        AFi1gSDK revenue;
        super.getMonetizationNetwork(aFa1mSDK);
        int i = aFa1mSDK.component4;
        this.valueOf.AFAdRevenueData(i);
        Map map2 = (Map) aFa1mSDK.getMonetizationNetwork().get("meta");
        if (map2 == null) {
            map2 = new HashMap();
            aFa1mSDK.getMonetizationNetwork().put("meta", map2);
        }
        if (!aFa1mSDK.getMonetizationNetwork().containsKey("af_deeplink")) {
            aFa1mSDK.getRevenue(this.AFInAppEventParameterName.getMediationNetwork());
        }
        AFi1xSDK AFAdRevenueData = this.AFInAppEventType.AFAdRevenueData();
        if (AFAdRevenueData != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("cdn_token", AFAdRevenueData.getMonetizationNetwork);
            if (AFAdRevenueData.getRevenue != null) {
                hashMap.put("c_ver", AFAdRevenueData.getRevenue);
            }
            if (AFAdRevenueData.getMediationNetwork > 0) {
                hashMap.put("latency", Long.valueOf(AFAdRevenueData.getMediationNetwork));
            }
            if (AFAdRevenueData.AFAdRevenueData > 0) {
                hashMap.put("delay", Long.valueOf(AFAdRevenueData.AFAdRevenueData));
            }
            if (AFAdRevenueData.getCurrencyIso4217Code > 0) {
                hashMap.put("res_code", Integer.valueOf(AFAdRevenueData.getCurrencyIso4217Code));
            }
            if (AFAdRevenueData.component1 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(AFAdRevenueData.component1.getClass().getSimpleName());
                sb.append(": ");
                sb.append(AFAdRevenueData.component1.getMessage());
                hashMap.put("error", sb.toString());
            }
            if (AFAdRevenueData.component4 != null) {
                hashMap.put("sig", AFAdRevenueData.component4.toString());
            }
            if (AFAdRevenueData.areAllFieldsValid != null) {
                hashMap.put("cdn_cache_status", AFAdRevenueData.areAllFieldsValid);
            }
            map2.put("rc", hashMap);
        }
        ((AFf1gSDK) this).hashCode.getMediationNetwork(aFa1mSDK.getMonetizationNetwork());
        if (i == 1) {
            if (this.values.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFa1mSDK.getMonetizationNetwork().put("wait_cid", Boolean.toString(true));
            }
            HashMap hashMap2 = new HashMap(this.valueOf.getCurrencyIso4217Code);
            this.valueOf.getMonetizationNetwork.getMediationNetwork("ddl");
            if (!hashMap2.isEmpty()) {
                map2.put("ddl", hashMap2);
            }
            HashMap hashMap3 = new HashMap(this.valueOf.AFAdRevenueData);
            if (!hashMap3.isEmpty()) {
                map2.put("first_launch", hashMap3);
            }
        } else if (i == 2) {
            HashMap hashMap4 = new HashMap(this.valueOf.AFAdRevenueData);
            if (!hashMap4.isEmpty()) {
                map2.put("first_launch", hashMap4);
            }
            this.valueOf.getMonetizationNetwork.getMediationNetwork("first_launch");
        }
        if (map2.isEmpty()) {
            aFa1mSDK.getMonetizationNetwork().remove("meta");
        }
        if (i <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFj1qSDK aFj1qSDK : this.toString.AFAdRevenueData()) {
                boolean z = aFj1qSDK instanceof AFi1eSDK;
                int i2 = AnonymousClass3.getMediationNetwork[aFj1qSDK.component2.ordinal()];
                if (i2 == 1) {
                    if (z) {
                        aFa1mSDK.getMediationNetwork("rfr", ((AFi1eSDK) aFj1qSDK).getMonetizationNetwork);
                        this.copy.getMediationNetwork(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFj1qSDK.AFAdRevenueData);
                } else if (i2 == 2 && i == 2 && !z) {
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put("source", aFj1qSDK.component3);
                    hashMap5.put(Response.TYPE, InstanceID.ERROR_TIMEOUT);
                    hashMap5.put("type", aFj1qSDK.component1);
                    arrayList.add(hashMap5);
                }
            }
            if (!arrayList.isEmpty()) {
                aFa1mSDK.getMediationNetwork("referrers", arrayList);
            }
            Object obj = this.copydefault;
            if (obj != null) {
                aFa1mSDK.getMediationNetwork("fb_ddl", obj);
            }
            if (this.getCurrencyIso4217Code == AFf1wSDK.CONVERSION) {
                AFi1jSDK aFi1jSDK = this.AFKeystoreWrapper;
                if (aFi1jSDK == null || (revenue = aFi1jSDK.getRevenue()) == null) {
                    map = null;
                } else {
                    map = new HashMap<>();
                    HashMap hashMap6 = new HashMap();
                    hashMap6.put("pia_timestamp", Long.valueOf(revenue.getMonetizationNetwork));
                    hashMap6.put("ttr_millis", Long.valueOf(revenue.getRevenue));
                    if (revenue.getCurrencyIso4217Code != null) {
                        hashMap6.put("pia_token", revenue.getCurrencyIso4217Code);
                    }
                    if (revenue.getMediationNetwork != null) {
                        hashMap6.put("error_code", revenue.getMediationNetwork);
                    }
                    map.put("pia", hashMap6);
                }
                if (map != null) {
                    aFa1mSDK.getRevenue(map);
                }
            }
        }
        ((AFf1gSDK) this).hashCode.getCurrencyIso4217Code(aFa1mSDK);
    }

    /* renamed from: com.appsflyer.internal.AFf1fSDK$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getMediationNetwork;

        static {
            int[] iArr = new int[AFj1qSDK.AFa1vSDK.values().length];
            getMediationNetwork = iArr;
            try {
                iArr[AFj1qSDK.AFa1vSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getMediationNetwork[AFj1qSDK.AFa1vSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
