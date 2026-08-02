package com.appsflyer.internal;

import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AdRevenueScheme;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AFf1xSDK extends AFf1tSDK {
    private final AFh1pSDK copy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1xSDK(AFh1pSDK aFh1pSDK, AFc1fSDK aFc1fSDK) {
        super(aFh1pSDK, aFc1fSDK);
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        this.copy = aFh1pSDK;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    protected final void getRevenue(AFh1tSDK aFh1tSDK) {
        Intrinsics.checkNotNullParameter(aFh1tSDK, "");
        super.getRevenue(aFh1tSDK);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        AFAdRevenueData aFAdRevenueData = this.copy.hashCode;
        Intrinsics.checkNotNullExpressionValue(aFAdRevenueData, "");
        linkedHashMap.put("monetization_network", aFAdRevenueData.getMonetizationNetwork());
        linkedHashMap.put("event_revenue_currency", aFAdRevenueData.getCurrencyIso4217Code());
        linkedHashMap.put("mediation_network", aFAdRevenueData.getMediationNetwork().getValue());
        linkedHashMap.put("event_revenue", Double.valueOf(aFAdRevenueData.getRevenue()));
        Map<String, Object> map = this.copy.toString;
        if (map != null && !map.isEmpty()) {
            List listOf = CollectionsKt.listOf((Object[]) new String[]{"ad_type", AdRevenueScheme.AD_UNIT, "country", "placement"});
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (listOf.contains(key)) {
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
        Map<String, Object> map2 = aFh1tSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        map2.put("ad_network", linkedHashMap3);
    }
}
