package com.appsflyer.internal;

import com.braze.configuration.BrazeConfigurationProvider;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b%\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'"}, d2 = {"Lcom/appsflyer/internal/AFh1xSDK;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMonetizationNetwork", "Ljava/lang/String;", "AFAdRevenueData", "getMediationNetwork", "getRevenue", "getCurrencyIso4217Code", "component4", "areAllFieldsValid", "component3", "component1", "component2", "equals", InAppPurchaseConstants.METHOD_TO_STRING, "copydefault", "hashCode", "copy", "AFInAppEventType", "i", "values", "AFKeystoreWrapper", "afInfoLog", "afDebugLog", "AFInAppEventParameterName", "afVerboseLog", "valueOf", "d", "afErrorLog", JWKParameterNames.RSA_EXPONENT, "unregisterClient", "AFLogger", "registerClient", "v", "force", "w"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum AFh1xSDK {
    SDK_LIFECYCLE("SDK Lifecycle"),
    PRIVACY_SANDBOX("Privacy Sandbox"),
    PLAY_INTEGRITY_API("Play Integrity Api"),
    OTHER("Other"),
    HTTP_CLIENT("HTTP Client"),
    QUEUE("Queue"),
    CACHE("Cache"),
    REMOTE_CONTROL("CFG"),
    DDL("DDL"),
    REFERRER("Referrer"),
    META_REFERRER("Meta Referrer"),
    SAMSUNG_PRELOAD_REFERRER("Samsung Preload Referrer"),
    ADVERTISING_ID("Advertising Id"),
    CROSS_PROMOTION("Cross Promotion"),
    EXCEPTION_MANAGER("Exception Manager"),
    ATTRIBUTION("Attribution"),
    RD("RD"),
    ENGAGEMENT("Engagement"),
    ANTI_FRAUD("Anti Fraud"),
    PUBLIC_API("Public API"),
    AD_REVENUE("Ad Revenue"),
    SDK_SETTERS("Setter"),
    PREDICT("Predict"),
    DEVICE_DATA("Device Data"),
    SECURITY("Security"),
    GENERAL(BrazeConfigurationProvider.DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE),
    PREINSTALL("Preinstall"),
    UNINSTALL("Uninstall"),
    PURCHASE_VALIDATION("Purchase Validation"),
    DMA("DMA"),
    PROXY("PROXY"),
    AFEXECUTOR("AFEXECUTOR");


    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    final String AFAdRevenueData;

    AFh1xSDK(String str) {
        this.AFAdRevenueData = str;
    }
}
