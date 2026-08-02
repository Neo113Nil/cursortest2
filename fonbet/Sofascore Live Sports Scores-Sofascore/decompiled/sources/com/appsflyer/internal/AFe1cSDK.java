package com.appsflyer.internal;

import com.appsflyer.share.AFAdRevenueData;
import com.appsflyer.share.AdRevenueScheme;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFe1cSDK extends AFe1fSDK {

    @NotNull
    private final AFh1uSDK afInfoLog;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1cSDK(@NotNull AFh1uSDK aFh1uSDK, @NotNull AFc1aSDK aFc1aSDK) {
        super(aFh1uSDK, aFc1aSDK);
        aFh1uSDK.getClass();
        aFc1aSDK.getClass();
        this.afInfoLog = aFh1uSDK;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final void registerClient(@NotNull AFh1zSDK aFh1zSDK) {
        aFh1zSDK.getClass();
        super.registerClient(aFh1zSDK);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        AFAdRevenueData aFAdRevenueData = this.afInfoLog.AFLoggerLogLevel;
        aFAdRevenueData.getClass();
        linkedHashMap.put("monetization_network", aFAdRevenueData.getMonetizationNetwork());
        linkedHashMap.put("event_revenue_currency", aFAdRevenueData.getCurrencyIso4217Code());
        linkedHashMap.put("mediation_network", aFAdRevenueData.getMediationNetwork().getValue());
        linkedHashMap.put("event_revenue", Double.valueOf(aFAdRevenueData.getRevenue()));
        Map<String, Object> map = this.afInfoLog.afWarnLog;
        if (map != null && !map.isEmpty()) {
            List j = kotlin.collections.b.j("ad_type", AdRevenueScheme.AD_UNIT, "country", "placement");
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (j.contains(key)) {
                    linkedHashMap.put(key, value);
                } else {
                    linkedHashMap2.put(key, value);
                }
            }
            linkedHashMap.put("custom_parameters", linkedHashMap2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("name", "adrevenue_sdk");
        linkedHashMap3.put("payload", linkedHashMap);
        Map<String, Object> map2 = aFh1zSDK.AFKeystoreWrapper;
        map2.getClass();
        map2.put("ad_network", linkedHashMap3);
    }
}
