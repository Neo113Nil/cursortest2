package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerProperties;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AFf1dSDK implements AFf1eSDK {
    private final AppsFlyerProperties AFAdRevenueData;
    private final AFc1oSDK getMonetizationNetwork;
    private final AFf1cSDK getRevenue;

    public AFf1dSDK(AFf1cSDK aFf1cSDK, AFc1oSDK aFc1oSDK, AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(aFf1cSDK, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.getRevenue = aFf1cSDK;
        this.getMonetizationNetwork = aFc1oSDK;
        this.AFAdRevenueData = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    public final void getMediationNetwork(Map<String, Object> map, AFe1uSDK aFe1uSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFe1uSDK, "");
        AFf1fSDK mediationNetwork = this.getRevenue.getMediationNetwork();
        AppsFlyerConsent appsFlyerConsent = this.getMonetizationNetwork.component4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (appsFlyerConsent != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Boolean isUserSubjectToGDPR = appsFlyerConsent.isUserSubjectToGDPR();
            if (isUserSubjectToGDPR != null) {
                linkedHashMap2.put("gdpr_applies", Boolean.valueOf(isUserSubjectToGDPR.booleanValue()));
            }
            Boolean hasConsentForDataUsage = appsFlyerConsent.getHasConsentForDataUsage();
            if (hasConsentForDataUsage != null) {
                linkedHashMap2.put("ad_user_data_enabled", Boolean.valueOf(hasConsentForDataUsage.booleanValue()));
            }
            Boolean hasConsentForAdsPersonalization = appsFlyerConsent.getHasConsentForAdsPersonalization();
            if (hasConsentForAdsPersonalization != null) {
                linkedHashMap2.put("ad_personalization_enabled", Boolean.valueOf(hasConsentForAdsPersonalization.booleanValue()));
            }
            Boolean hasConsentForAdStorage = appsFlyerConsent.getHasConsentForAdStorage();
            if (hasConsentForAdStorage != null) {
                linkedHashMap2.put("ad_storage_enabled", Boolean.valueOf(hasConsentForAdStorage.booleanValue()));
            }
            linkedHashMap.put("manual", linkedHashMap2);
        }
        if (mediationNetwork != null) {
            boolean z = appsFlyerConsent != null;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("policy_version", Integer.valueOf(mediationNetwork.getRevenue));
            linkedHashMap3.put("cmp_sdk_id", Integer.valueOf(mediationNetwork.AFAdRevenueData));
            linkedHashMap3.put("cmp_sdk_version", Integer.valueOf(mediationNetwork.getMonetizationNetwork));
            if (z) {
                linkedHashMap3.put("gdpr_applies", -1);
                linkedHashMap3.put("tcstring", "");
            } else {
                linkedHashMap3.put("gdpr_applies", Integer.valueOf(mediationNetwork.getMediationNetwork));
                linkedHashMap3.put("tcstring", mediationNetwork.getCurrencyIso4217Code);
            }
            linkedHashMap.put("tcf", linkedHashMap3);
        }
        if (!linkedHashMap.isEmpty()) {
            map.put("consent_data", linkedHashMap);
        }
        if (aFe1uSDK != AFe1uSDK.CONVERSION || this.AFAdRevenueData.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION) == null) {
            return;
        }
        Map<String, Object> AFAdRevenueData = AFa1zSDK.AFAdRevenueData(map);
        Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
        AFAdRevenueData.put("api", MapsKt.mapOf(TuplesKt.to(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, this.AFAdRevenueData.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))));
    }
}
