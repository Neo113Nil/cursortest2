package com.appsflyer.internal;

import com.appsflyer.share.AppsFlyerConsent;
import defpackage.sub;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFf1kSDK implements AFf1qSDK {

    @NotNull
    private final AFf1lSDK AFKeystoreWrapper;

    @NotNull
    private final AFc1gSDK registerClient;

    public AFf1kSDK(@NotNull AFf1lSDK aFf1lSDK, @NotNull AFc1gSDK aFc1gSDK) {
        aFf1lSDK.getClass();
        aFc1gSDK.getClass();
        this.AFKeystoreWrapper = aFf1lSDK;
        this.registerClient = aFc1gSDK;
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final void unregisterClient(@NotNull Map<String, Object> map, @NotNull AFe1zSDK aFe1zSDK) {
        map.getClass();
        aFe1zSDK.getClass();
        AFf1jSDK registerClient = this.AFKeystoreWrapper.registerClient();
        AppsFlyerConsent appsFlyerConsent = this.registerClient.onPause;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (appsFlyerConsent != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Boolean isUserSubjectToGDPR = appsFlyerConsent.isUserSubjectToGDPR();
            if (isUserSubjectToGDPR != null) {
                linkedHashMap2.put("gdpr_applies", isUserSubjectToGDPR);
            }
            Boolean hasConsentForDataUsage = appsFlyerConsent.getHasConsentForDataUsage();
            if (hasConsentForDataUsage != null) {
                linkedHashMap2.put("ad_user_data_enabled", hasConsentForDataUsage);
            }
            Boolean hasConsentForAdsPersonalization = appsFlyerConsent.getHasConsentForAdsPersonalization();
            if (hasConsentForAdsPersonalization != null) {
                linkedHashMap2.put("ad_personalization_enabled", hasConsentForAdsPersonalization);
            }
            Boolean hasConsentForAdStorage = appsFlyerConsent.getHasConsentForAdStorage();
            if (hasConsentForAdStorage != null) {
                linkedHashMap2.put("ad_storage_enabled", hasConsentForAdStorage);
            }
            linkedHashMap.put("manual", linkedHashMap2);
        }
        if (registerClient != null) {
            boolean z = appsFlyerConsent != null;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("policy_version", Integer.valueOf(registerClient.AFLogger));
            linkedHashMap3.put("cmp_sdk_id", Integer.valueOf(registerClient.registerClient));
            linkedHashMap3.put("cmp_sdk_version", Integer.valueOf(registerClient.AFKeystoreWrapper));
            if (z) {
                linkedHashMap3.put("gdpr_applies", -1);
                linkedHashMap3.put("tcstring", "");
            } else {
                linkedHashMap3.put("gdpr_applies", Integer.valueOf(registerClient.unregisterClient));
                linkedHashMap3.put("tcstring", registerClient.d);
            }
            linkedHashMap.put("tcf", linkedHashMap3);
        }
        if (!linkedHashMap.isEmpty()) {
            map.put("consent_data", linkedHashMap);
        }
        if (aFe1zSDK != AFd1aSDK.unregisterClient || this.registerClient.w == null) {
            return;
        }
        AFj1tSDK.d(map).put("api", sub.d(new Pair("enableTCFDataCollection", this.registerClient.w)));
    }
}
