package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerProperties;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.sentry.SpanContext;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFg1pSDK implements AFg1sSDK {
    private final AFg1rSDK getMediationNetwork;
    private final AFd1tSDK getMonetizationNetwork;
    private final AppsFlyerProperties getRevenue;

    public AFg1pSDK(AFg1rSDK aFg1rSDK, AFd1tSDK aFd1tSDK, AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(aFg1rSDK, "");
        Intrinsics.checkNotNullParameter(aFd1tSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.getMediationNetwork = aFg1rSDK;
        this.getMonetizationNetwork = aFd1tSDK;
        this.getRevenue = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFg1sSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map, AFf1wSDK aFf1wSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFf1wSDK, "");
        AFg1oSDK AFAdRevenueData = this.getMediationNetwork.AFAdRevenueData();
        AppsFlyerConsent appsFlyerConsent = this.getMonetizationNetwork.component2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (appsFlyerConsent != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("gdpr_applies", Boolean.valueOf(appsFlyerConsent.isUserSubjectToGDPR()));
            Boolean hasConsentForDataUsage = appsFlyerConsent.getHasConsentForDataUsage();
            if (hasConsentForDataUsage != null) {
                hasConsentForDataUsage.booleanValue();
                linkedHashMap2.put("ad_user_data_enabled", hasConsentForDataUsage);
            }
            Boolean hasConsentForAdsPersonalization = appsFlyerConsent.getHasConsentForAdsPersonalization();
            if (hasConsentForAdsPersonalization != null) {
                hasConsentForAdsPersonalization.booleanValue();
                linkedHashMap2.put("ad_personalization_enabled", hasConsentForAdsPersonalization);
            }
            linkedHashMap.put(SpanContext.DEFAULT_ORIGIN, linkedHashMap2);
        }
        if (AFAdRevenueData != null) {
            boolean z = appsFlyerConsent != null;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("policy_version", Integer.valueOf(AFAdRevenueData.AFAdRevenueData));
            linkedHashMap3.put("cmp_sdk_id", Integer.valueOf(AFAdRevenueData.getRevenue));
            linkedHashMap3.put("cmp_sdk_version", Integer.valueOf(AFAdRevenueData.getMonetizationNetwork));
            if (z) {
                linkedHashMap3.put("gdpr_applies", -1);
                linkedHashMap3.put("tcstring", "");
            } else {
                linkedHashMap3.put("gdpr_applies", Integer.valueOf(AFAdRevenueData.getCurrencyIso4217Code));
                linkedHashMap3.put("tcstring", AFAdRevenueData.getMediationNetwork);
            }
            linkedHashMap.put("tcf", linkedHashMap3);
        }
        if (!linkedHashMap.isEmpty()) {
            map.put("consent_data", linkedHashMap);
        }
        if (aFf1wSDK != AFf1wSDK.CONVERSION || this.getRevenue.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION) == null) {
            return;
        }
        Map<String, Object> revenue = AFb1rSDK.getRevenue(map);
        Intrinsics.checkNotNullExpressionValue(revenue, "");
        revenue.put(MetricTracker.Place.API, MapsKt.mapOf(TuplesKt.to(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, this.getRevenue.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))));
    }
}
