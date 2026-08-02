package com.appsflyer.internal;

import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AdRevenueScheme;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFf1dSDK extends AFf1gSDK {
    private final AFh1lSDK copy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1dSDK(AFh1lSDK aFh1lSDK, AFd1kSDK aFd1kSDK) {
        super(aFh1lSDK, aFd1kSDK);
        Intrinsics.checkNotNullParameter(aFh1lSDK, "");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.copy = aFh1lSDK;
    }

    @Override // com.appsflyer.internal.AFf1gSDK
    protected final void getMonetizationNetwork(AFa1mSDK aFa1mSDK) {
        Intrinsics.checkNotNullParameter(aFa1mSDK, "");
        super.getMonetizationNetwork(aFa1mSDK);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        AFAdRevenueData aFAdRevenueData = this.copy.toString;
        Intrinsics.checkNotNullExpressionValue(aFAdRevenueData, "");
        linkedHashMap.put("monetization_network", aFAdRevenueData.getMonetizationNetwork());
        linkedHashMap.put("event_revenue_currency", aFAdRevenueData.getCurrencyIso4217Code());
        linkedHashMap.put("mediation_network", aFAdRevenueData.getMediationNetwork().getValue());
        linkedHashMap.put("event_revenue", Double.valueOf(aFAdRevenueData.getRevenue()));
        Map<String, Object> map = this.copy.equals;
        if (map != null && !map.isEmpty()) {
            List listOf = CollectionsKt.listOf((Object[]) new String[]{"ad_type", AdRevenueScheme.AD_UNIT, "country", AdRevenueScheme.PLACEMENT});
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
        Map<String, Object> monetizationNetwork = aFa1mSDK.getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        monetizationNetwork.put("ad_network", linkedHashMap3);
    }
}
