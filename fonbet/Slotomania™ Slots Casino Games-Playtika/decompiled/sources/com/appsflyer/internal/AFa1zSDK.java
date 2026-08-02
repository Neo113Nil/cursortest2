package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.android.billingclient.api.BillingClient;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFb1aSDK;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFe1sSDK.AnonymousClass3;
import com.appsflyer.internal.AFj1ySDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.GoogleApiAvailability;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.sse.ServerSentEventKt;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AFa1zSDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String AFAdRevenueData;
    private static int AFInAppEventType = 1;
    private static long AFKeystoreWrapper;
    private static int AFLogger;
    private static AFa1zSDK areAllFieldsValid;
    static AppsFlyerInAppPurchaseValidatorListener getMediationNetwork;
    public static final String getMonetizationNetwork;
    Application component3;
    private boolean copy;
    private AFf1sSDK copydefault;
    private SharedPreferences equals;
    private Map<Long, String> hashCode;
    public volatile AppsFlyerConversionListener getRevenue = null;
    private long component4 = -1;
    long getCurrencyIso4217Code = -1;
    private long component2 = TimeUnit.SECONDS.toMillis(5);
    boolean component1 = false;
    private final AFc1gSDK toString = new AFc1gSDK();

    private static void a(String str, int i, Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = $11 + 11;
        int i4 = i3 % 128;
        $10 = i4;
        int i5 = i3 % 2;
        char[] cArr = str;
        if (str != null) {
            int i6 = i4 + 89;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr = str.toCharArray();
        }
        AFk1nSDK aFk1nSDK = new AFk1nSDK();
        char[] AFAdRevenueData2 = AFk1nSDK.AFAdRevenueData(AFKeystoreWrapper ^ (-2935546008654967297L), cArr, i);
        aFk1nSDK.getRevenue = 4;
        while (aFk1nSDK.getRevenue < AFAdRevenueData2.length) {
            int i8 = $10 + 93;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            aFk1nSDK.getMediationNetwork = aFk1nSDK.getRevenue - 4;
            AFAdRevenueData2[aFk1nSDK.getRevenue] = (char) ((AFAdRevenueData2[aFk1nSDK.getRevenue] ^ AFAdRevenueData2[aFk1nSDK.getRevenue % 4]) ^ (aFk1nSDK.getMediationNetwork * (AFKeystoreWrapper ^ (-2935546008654967297L))));
            aFk1nSDK.getRevenue++;
        }
        objArr[0] = new String(AFAdRevenueData2, 4, AFAdRevenueData2.length - 4);
    }

    static {
        areAllFieldsValid();
        getMonetizationNetwork = "340";
        AFAdRevenueData = "6.16.2".substring(0, "6.16.2".lastIndexOf("."));
        getMediationNetwork = null;
        areAllFieldsValid = new AFa1zSDK();
        int i = AFLogger + 3;
        AFInAppEventType = i % 128;
        int i2 = i % 2;
    }

    public final AFc1fSDK AFAdRevenueData() {
        int i = 2 % 2;
        int i2 = AFInAppEventType;
        int i3 = i2 + 105;
        AFLogger = i3 % 128;
        int i4 = i3 % 2;
        AFc1gSDK aFc1gSDK = this.toString;
        int i5 = i2 + 37;
        AFLogger = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 89 / 0;
        }
        return aFc1gSDK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        r2 = r2 + 103;
        com.appsflyer.internal.AFa1zSDK.AFLogger = r2 % 128;
        r2 = r2 % 2;
        r1 = r1.AFAdRevenueData;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r5 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        r1.getMonetizationNetwork = r5.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0019, code lost:
    
        if (r5 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r5 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getCurrencyIso4217Code(Context context) {
        AFc1gSDK aFc1gSDK;
        int i = 2 % 2;
        int i2 = AFLogger + 25;
        int i3 = i2 % 128;
        AFInAppEventType = i3;
        if (i2 % 2 == 0) {
            aFc1gSDK = this.toString;
            int i4 = 46 / 0;
        } else {
            aFc1gSDK = this.toString;
        }
        int i5 = AFLogger + 79;
        AFInAppEventType = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object copydefault(Object[] objArr) {
        AFa1zSDK aFa1zSDK = (AFa1zSDK) objArr[0];
        AFf1qSDK aFf1qSDK = (AFf1qSDK) objArr[1];
        int i = 2 % 2;
        AFc1fSDK AFAdRevenueData2 = aFa1zSDK.AFAdRevenueData();
        if (aFf1qSDK == AFf1qSDK.SUCCESS) {
            AFAdRevenueData2.afRDLog().getCurrencyIso4217Code();
            int i2 = AFLogger + 77;
            AFInAppEventType = i2 % 128;
            int i3 = i2 % 2;
        }
        Object obj = null;
        if (AFAdRevenueData2.copy().getCurrencyIso4217Code()) {
            AFAdRevenueData2.force().getRevenue();
            int i4 = AFInAppEventType + 33;
            AFLogger = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        int i5 = AFInAppEventType + 85;
        AFLogger = i5 % 128;
        if (i5 % 2 == 0) {
            AFAdRevenueData2.force().getCurrencyIso4217Code();
            return null;
        }
        AFAdRevenueData2.force().getCurrencyIso4217Code();
        throw null;
    }

    final synchronized AFf1sSDK getMediationNetwork() {
        AFf1sSDK aFf1sSDK;
        int i = 2 % 2;
        if (this.copydefault == null) {
            int i2 = AFLogger + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            AFInAppEventType = i2 % 128;
            if (i2 % 2 != 0) {
                this.copydefault = new AFf1sSDK() { // from class: com.appsflyer.internal.AFa1zSDK$$ExternalSyntheticLambda5
                    @Override // com.appsflyer.internal.AFf1sSDK
                    public final void onRemoteConfigUpdateFinished(AFf1qSDK aFf1qSDK) {
                        AFa1zSDK.this.getMonetizationNetwork(aFf1qSDK);
                    }
                };
            } else {
                this.copydefault = new AFf1sSDK() { // from class: com.appsflyer.internal.AFa1zSDK$$ExternalSyntheticLambda5
                    @Override // com.appsflyer.internal.AFf1sSDK
                    public final void onRemoteConfigUpdateFinished(AFf1qSDK aFf1qSDK) {
                        AFa1zSDK.this.getMonetizationNetwork(aFf1qSDK);
                    }
                };
                throw null;
            }
        }
        aFf1sSDK = this.copydefault;
        int i3 = AFInAppEventType + 73;
        AFLogger = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        return aFf1sSDK;
    }

    public AFa1zSDK() {
        AFAdRevenueData().force().getRevenue();
        AFAdRevenueData().force().getMediationNetwork();
        AFe1sSDK equals = AFAdRevenueData().equals();
        equals.getMonetizationNetwork.add(new C0114AFa1zSDK());
    }

    public static AFa1zSDK getMonetizationNetwork() {
        int i = 2 % 2;
        int i2 = AFLogger;
        int i3 = i2 + 87;
        AFInAppEventType = i3 % 128;
        int i4 = i3 % 2;
        AFa1zSDK aFa1zSDK = areAllFieldsValid;
        int i5 = i2 + 105;
        AFInAppEventType = i5 % 128;
        int i6 = i5 % 2;
        return aFa1zSDK;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(Context context, URI uri) {
        int i = 2 % 2;
        if (uri != null) {
            int i2 = AFInAppEventType + 63;
            AFLogger = i2 % 128;
            int i3 = i2 % 2;
            if (!uri.toString().isEmpty()) {
                if (context == null) {
                    AFAdRevenueData().e().AFAdRevenueData(new StringBuilder("Context is \"").append(context).append("\"").toString(), DeepLinkResult.Error.NETWORK);
                    return;
                }
                getCurrencyIso4217Code(context);
                AFAdRevenueData().e().f_(AFa1kSDK.getMonetizationNetwork(AFAdRevenueData().afErrorLogForExcManagerOnly()), Uri.parse(uri.toString()));
                int i4 = AFLogger + 103;
                AFInAppEventType = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
        }
        AFAdRevenueData().e().AFAdRevenueData(new StringBuilder("Link is \"").append(uri).append("\"").toString(), DeepLinkResult.Error.NETWORK);
        int i6 = AFInAppEventType + 75;
        AFLogger = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(String... strArr) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 45;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        setSharingFilterForPartners(strArr);
        int i4 = AFLogger + 79;
        AFInAppEventType = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i = 2 % 2;
        int i2 = AFLogger + 73;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 != 0) {
            setSharingFilterForPartners(TtmlNode.COMBINE_ALL);
            return;
        }
        String[] strArr = new String[1];
        strArr[1] = TtmlNode.COMBINE_ALL;
        setSharingFilterForPartners(strArr);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        int i = 2 % 2;
        AFAdRevenueData().afErrorLog().getMonetizationNetwork = new AFb1qSDK(strArr);
        int i2 = AFLogger + 93;
        AFInAppEventType = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        PurchaseHandler areAllFieldsValid2;
        int i = 2 % 2;
        int i2 = AFLogger + 101;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 == 0) {
            getCurrencyIso4217Code(context);
            areAllFieldsValid2 = AFAdRevenueData().areAllFieldsValid();
            String[] strArr = new String[0];
            strArr[0] = BillingClient.FeatureType.SUBSCRIPTIONS;
            if (!areAllFieldsValid2.getMediationNetwork(map, purchaseValidationCallback, strArr)) {
                return;
            }
        } else {
            getCurrencyIso4217Code(context);
            areAllFieldsValid2 = AFAdRevenueData().areAllFieldsValid();
            if (!areAllFieldsValid2.getMediationNetwork(map, purchaseValidationCallback, BillingClient.FeatureType.SUBSCRIPTIONS)) {
                return;
            }
        }
        AFe1pSDK aFe1pSDK = new AFe1pSDK(map, purchaseValidationCallback, areAllFieldsValid2.getMonetizationNetwork);
        AFe1sSDK aFe1sSDK = areAllFieldsValid2.getCurrencyIso4217Code;
        aFe1sSDK.getRevenue.execute(aFe1sSDK.new AnonymousClass3(aFe1pSDK));
        int i3 = AFLogger + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        AFInAppEventType = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 % 3;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 83;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code(context);
        PurchaseHandler areAllFieldsValid2 = AFAdRevenueData().areAllFieldsValid();
        if (areAllFieldsValid2.getMediationNetwork(map, purchaseValidationCallback, "purchases")) {
            AFe1bSDK aFe1bSDK = new AFe1bSDK(map, purchaseValidationCallback, areAllFieldsValid2.getMonetizationNetwork);
            AFe1sSDK aFe1sSDK = areAllFieldsValid2.getCurrencyIso4217Code;
            aFe1sSDK.getRevenue.execute(aFe1sSDK.new AnonymousClass3(aFe1bSDK));
            int i4 = AFLogger + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            AFInAppEventType = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 51;
        AFLogger = i2 % 128;
        if (i2 % 2 == 0) {
            AFa1oSDK e = AFAdRevenueData().e();
            e.AFAdRevenueData = str;
            e.getRevenue = map;
        } else {
            AFa1oSDK e2 = AFAdRevenueData().e();
            e2.AFAdRevenueData = str;
            e2.getRevenue = map;
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        int i = 2 % 2;
        int i2 = AFLogger + 69;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 != 0) {
            subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
            int i3 = AFInAppEventType + 55;
            AFLogger = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 55 / 0;
                return;
            }
            return;
        }
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        throw null;
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFa1zSDK aFa1zSDK = (AFa1zSDK) objArr[0];
        DeepLinkListener deepLinkListener = (DeepLinkListener) objArr[1];
        long longValue = ((Number) objArr[2]).longValue();
        int i = 2 % 2;
        int i2 = AFLogger + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        AFInAppEventType = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            aFa1zSDK.AFAdRevenueData().e().getMonetizationNetwork = deepLinkListener;
            aFa1zSDK.AFAdRevenueData().e().component1 = longValue;
            return null;
        }
        aFa1zSDK.AFAdRevenueData().e().getMonetizationNetwork = deepLinkListener;
        aFa1zSDK.AFAdRevenueData().e().component1 = longValue;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void d_(Context context, Intent intent) {
        Uri uri;
        boolean z;
        int i = 2 % 2;
        int i2 = AFLogger + 71;
        AFInAppEventType = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code(context);
        AFa1oSDK e = AFAdRevenueData().e();
        AFc1sSDK component1 = AFAdRevenueData().component1();
        Object obj = null;
        if (intent != null) {
            int i4 = AFLogger + 45;
            AFInAppEventType = i4 % 128;
            if (i4 % 2 == 0) {
                "android.intent.action.VIEW".equals(intent.getAction());
                obj.hashCode();
                throw null;
            }
            if ("android.intent.action.VIEW".equals(intent.getAction())) {
                uri = intent.getData();
                if (uri != null || uri.toString().isEmpty()) {
                    z = false;
                } else {
                    int i5 = AFLogger + 49;
                    AFInAppEventType = i5 % 128;
                    int i6 = i5 % 2;
                    z = true;
                }
                if (component1.AFAdRevenueData("ddl_sent", false)) {
                    int i7 = AFInAppEventType + 111;
                    AFLogger = i7 % 128;
                    if (i7 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (!z) {
                        e.AFAdRevenueData("No direct deep link", null);
                        return;
                    }
                }
                e.e_(AFa1kSDK.getMonetizationNetwork(e.areAllFieldsValid.afErrorLogForExcManagerOnly()), intent, context);
            }
        }
        uri = null;
        if (uri != null) {
        }
        z = false;
        if (component1.AFAdRevenueData("ddl_sent", false)) {
        }
        e.e_(AFa1kSDK.getMonetizationNetwork(e.areAllFieldsValid.afErrorLogForExcManagerOnly()), intent, context);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(final Intent intent, Context context) {
        int i = 2 % 2;
        Object obj = null;
        if (intent == null) {
            int i2 = AFLogger + 97;
            AFInAppEventType = i2 % 128;
            if (i2 % 2 != 0) {
                AFAdRevenueData().e().AFAdRevenueData("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
                return;
            } else {
                AFAdRevenueData().e().AFAdRevenueData("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
                obj.hashCode();
                throw null;
            }
        }
        if (context == null) {
            AFAdRevenueData().e().AFAdRevenueData("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
            int i3 = AFInAppEventType + 31;
            AFLogger = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        final Context applicationContext = context.getApplicationContext();
        getCurrencyIso4217Code(applicationContext);
        AFAdRevenueData().AFAdRevenueData().execute(new Runnable() { // from class: com.appsflyer.internal.AFa1zSDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFa1zSDK.this.d_(applicationContext, intent);
            }
        });
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i = 2 % 2;
        int i2 = AFLogger + 63;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 != 0) {
            List<String> asList = Arrays.asList(strArr);
            List<List<String>> list = AFAdRevenueData().e().getMediationNetwork;
            if (list.contains(asList)) {
                return;
            }
            int i3 = AFInAppEventType + 111;
            AFLogger = i3 % 128;
            int i4 = i3 % 2;
            list.add(asList);
            return;
        }
        AFAdRevenueData().e().getMediationNetwork.contains(Arrays.asList(strArr));
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(String str, Map<String, Object> map) {
        String concat;
        int i = 2 % 2;
        AFc1oSDK afErrorLog = AFAdRevenueData().afErrorLog();
        if (afErrorLog.AFAdRevenueData == null) {
            afErrorLog.AFAdRevenueData = new AFb1vSDK();
        }
        AFb1vSDK aFb1vSDK = afErrorLog.AFAdRevenueData;
        if (str != null) {
            int i2 = AFInAppEventType + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            AFLogger = i2 % 128;
            int i3 = i2 % 2;
            if (!str.isEmpty()) {
                if (map == null || map.isEmpty()) {
                    if (aFb1vSDK.getMonetizationNetwork.remove(str) == null) {
                        concat = "Partner data is missing or `null`";
                    } else {
                        concat = "Cleared partner data for ".concat(String.valueOf(str));
                        int i4 = AFLogger + 115;
                        AFInAppEventType = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    AFLogger.afWarnLog(concat);
                    return;
                }
                AFLogger.afDebugLog(new StringBuilder("Setting partner data for ").append(str).append(": ").append(map).toString());
                int length = new JSONObject(map).toString().length();
                if (length > 1000) {
                    AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
                    HashMap hashMap = new HashMap();
                    hashMap.put("error", "limit exceeded: ".concat(String.valueOf(length)));
                    aFb1vSDK.getRevenue.put(str, hashMap);
                    return;
                }
                aFb1vSDK.getMonetizationNetwork.put(str, map);
                aFb1vSDK.getRevenue.remove(str);
                int i6 = AFLogger + 67;
                AFInAppEventType = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
        }
        AFLogger.afWarnLog("Partner ID is missing or `null`");
        int i8 = AFLogger + 13;
        AFInAppEventType = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r6 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if ((!r6) != true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003f, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        boolean z = false;
        AFa1zSDK aFa1zSDK = (AFa1zSDK) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = AFLogger + 31;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 == 0) {
            AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(booleanValue)));
            int i3 = 40 / 0;
        } else {
            AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(booleanValue)));
        }
        AFb1iSDK.getRevenue = Boolean.valueOf(z);
        AFc1fSDK AFAdRevenueData2 = aFa1zSDK.AFAdRevenueData();
        AFAdRevenueData2.afErrorLog().component3 = booleanValue;
        if (!booleanValue) {
            AFe1sSDK equals = AFAdRevenueData2.equals();
            equals.getRevenue.execute(equals.new AnonymousClass3(new AFe1hSDK(aFa1zSDK.AFAdRevenueData())));
            int i4 = AFInAppEventType + 21;
            AFLogger = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        AFAdRevenueData2.afErrorLog().component2 = null;
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 45;
        AFLogger = i2 % 128;
        if (i2 % 2 != 0) {
            AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
            getCurrencyIso4217Code(AppsFlyerProperties.DISABLE_NETWORK_DATA, z);
            int i3 = 1 / 0;
        } else {
            AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
            getCurrencyIso4217Code(AppsFlyerProperties.DISABLE_NETWORK_DATA, z);
        }
        int i4 = AFInAppEventType + 91;
        AFLogger = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        AFa1zSDK aFa1zSDK = (AFa1zSDK) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        AFj1pSDK aFj1pSDK = new AFj1pSDK((Intent) objArr[2]);
        if (aFj1pSDK.getRevenue("appsflyer_preinstall") != null) {
            int i2 = AFLogger + 93;
            AFInAppEventType = i2 % 128;
            if (i2 % 2 == 0) {
                AFAdRevenueData(new Object[]{aFj1pSDK.getRevenue("appsflyer_preinstall")}, 1419097846, -1419097845, (int) System.currentTimeMillis());
                throw null;
            }
            AFAdRevenueData(new Object[]{aFj1pSDK.getRevenue("appsflyer_preinstall")}, 1419097846, -1419097845, (int) System.currentTimeMillis());
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String revenue = aFj1pSDK.getRevenue("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(revenue)));
        if (revenue != null) {
            ((AFc1sSDK) AFAdRevenueData(new Object[]{aFa1zSDK, context}, -1165261210, 1165261210, System.identityHashCode(aFa1zSDK))).getRevenue("referrer", revenue);
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            appsFlyerProperties.set("AF_REFERRER", revenue);
            appsFlyerProperties.getMediationNetwork = revenue;
            if (AppsFlyerProperties.getInstance().getMediationNetwork()) {
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                aFa1zSDK.AFAdRevenueData(context, AFh1wSDK.onReceive);
                aFa1zSDK.AFAdRevenueData(revenue);
            }
        }
        int i3 = AFInAppEventType + 95;
        AFLogger = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 30 / 0;
        }
        return null;
    }

    private static void getMonetizationNetwork(JSONObject jSONObject) {
        String str;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            int i2 = 0;
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                while (i2 < jSONArray.length()) {
                    int i3 = AFInAppEventType + 39;
                    AFLogger = i3 % 128;
                    if (i3 % 2 != 0) {
                        arrayList.add(Long.valueOf(jSONArray.getLong(i2)));
                        i2 += 74;
                    } else {
                        arrayList.add(Long.valueOf(jSONArray.getLong(i2)));
                        i2++;
                    }
                }
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (!(!keys2.hasNext()) && str == null) {
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i4 = AFInAppEventType + 39;
                    AFLogger = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = 0;
                    while (i6 < jSONArray2.length()) {
                        int i7 = AFInAppEventType + 43;
                        AFLogger = i7 % 128;
                        if (i7 % 2 == 0) {
                            if (jSONArray2.getLong(i6) == ((Long) arrayList.get(0)).longValue()) {
                                break;
                            }
                            if (jSONArray2.getLong(i6) == ((Long) arrayList.get(1)).longValue()) {
                                break;
                            }
                            i6++;
                            str = next;
                        } else if (jSONArray2.getLong(i6) != ((Long) arrayList.get(1)).longValue()) {
                            if (jSONArray2.getLong(i6) == ((Long) arrayList.get(1)).longValue() && jSONArray2.getLong(i6) != ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                i6++;
                                str = next;
                            }
                        }
                    }
                } catch (JSONException e2) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e2);
                }
            }
        }
        if (str != null) {
            int i8 = AFLogger + 37;
            AFInAppEventType = i8 % 128;
            if (i8 % 2 == 0) {
                jSONObject.remove(str);
                int i9 = 46 / 0;
            } else {
                jSONObject.remove(str);
            }
        }
        int i10 = AFLogger + 99;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public final void getRevenue(Context context, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        int i = 2 % 2;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String AFAdRevenueData2 = ((AFc1sSDK) AFAdRevenueData(new Object[]{this, context}, -1165261210, 1165261210, System.identityHashCode(this))).AFAdRevenueData("extraReferrers", (String) null);
            if (AFAdRevenueData2 == null) {
                jSONObject = new JSONObject();
                jSONArray2 = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(AFAdRevenueData2);
                if (jSONObject2.has(str)) {
                    jSONArray = new JSONArray((String) jSONObject2.get(str));
                } else {
                    jSONArray = new JSONArray();
                    int i2 = AFInAppEventType + 45;
                    AFLogger = i2 % 128;
                    int i3 = i2 % 2;
                }
                jSONArray2 = jSONArray;
                jSONObject = jSONObject2;
            }
            if (jSONArray2.length() < 5) {
                int i4 = AFLogger + 85;
                AFInAppEventType = i4 % 128;
                int i5 = i4 % 2;
                jSONArray2.put(currentTimeMillis);
            }
            if (jSONObject.length() >= 4) {
                int i6 = AFInAppEventType + 111;
                AFLogger = i6 % 128;
                int i7 = i6 % 2;
                getMonetizationNetwork(jSONObject);
            }
            jSONObject.put(str, jSONArray2.toString());
            ((AFc1sSDK) AFAdRevenueData(new Object[]{this, context}, -1165261210, 1165261210, System.identityHashCode(this))).getRevenue("extraReferrers", jSONObject.toString());
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e);
        } catch (Throwable th) {
            AFLogger.afErrorLog(new StringBuilder("Couldn't save referrer - ").append(str).append(": ").toString(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getCurrencyIso4217Code(AFc1fSDK aFc1fSDK) {
        int i = 2 % 2;
        int i2 = AFLogger + 107;
        AFInAppEventType = i2 % 128;
        int i3 = i2 % 2;
        aFc1fSDK.registerClient().getCurrencyIso4217Code();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z, Context context) {
        int i = 2 % 2;
        getCurrencyIso4217Code(context);
        final AFc1fSDK AFAdRevenueData2 = AFAdRevenueData();
        AFAdRevenueData2.AFKeystoreWrapper().getRevenue(z);
        AFAdRevenueData2.AFAdRevenueData().submit(new Runnable() { // from class: com.appsflyer.internal.AFa1zSDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AFa1zSDK.getCurrencyIso4217Code(AFc1fSDK.this);
            }
        });
        if (z) {
            AFAdRevenueData2.component1().getCurrencyIso4217Code("is_stop_tracking_used", true);
            int i2 = AFLogger + 101;
            AFInAppEventType = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = AFLogger + 35;
        AFInAppEventType = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 75;
        AFLogger = i2 % 128;
        if (i2 % 2 == 0) {
            getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z));
        } else {
            getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z));
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 115;
        AFLogger = i2 % 128;
        if (i2 % 2 == 0) {
            AFAdRevenueData().afDebugLog().getCurrencyIso4217Code();
            return;
        }
        AFAdRevenueData().afDebugLog().getCurrencyIso4217Code();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        getCurrencyIso4217Code(context);
        AFg1zSDK aFg1zSDK = new AFg1zSDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.INSTANCE.w(AFh1zSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.INSTANCE.i(AFh1zSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(String.valueOf(str)));
        AFf1bSDK mediationNetwork = aFg1zSDK.getMediationNetwork();
        if (mediationNetwork == null || !str.equals(mediationNetwork.AFAdRevenueData)) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = mediationNetwork == null || currentTimeMillis - mediationNetwork.getMediationNetwork > TimeUnit.SECONDS.toMillis(2L);
            AFf1bSDK aFf1bSDK = new AFf1bSDK(str, currentTimeMillis, !z);
            aFg1zSDK.getMediationNetwork.getRevenue("afUninstallToken", aFf1bSDK.AFAdRevenueData);
            aFg1zSDK.getMediationNetwork.AFAdRevenueData("afUninstallToken_received_time", aFf1bSDK.getMediationNetwork);
            aFg1zSDK.getMediationNetwork.getCurrencyIso4217Code("afUninstallToken_queued", aFf1bSDK.getRevenue);
            if (z) {
                AFc1fSDK AFAdRevenueData2 = getMonetizationNetwork().AFAdRevenueData();
                AFf1vSDK aFf1vSDK = new AFf1vSDK(str, AFAdRevenueData2);
                AFe1sSDK equals = AFAdRevenueData2.equals();
                equals.getRevenue.execute(equals.new AnonymousClass3(aFf1vSDK));
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z) {
        AFLogger.LogLevel logLevel;
        int i = 2 % 2;
        int i2 = AFLogger + 9;
        AFInAppEventType = i2 % 128;
        int i3 = i2 % 2;
        if (z) {
            logLevel = AFLogger.LogLevel.DEBUG;
            int i4 = AFInAppEventType + 55;
            AFLogger = i4 % 128;
            int i5 = i4 % 2;
        } else {
            logLevel = AFLogger.LogLevel.NONE;
        }
        setLogLevel(logLevel);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 85;
        AFLogger = i2 % 128;
        if (i2 % 2 != 0) {
            AFd1sSDK copy = AFAdRevenueData().copy();
            String[] strArr = new String[0];
            strArr[0] = str;
            copy.AFAdRevenueData("setImeiData", strArr);
        } else {
            AFAdRevenueData().copy().AFAdRevenueData("setImeiData", str);
        }
        AFAdRevenueData().AFKeystoreWrapper().getRevenue(str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 47;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        AFAdRevenueData().copy().AFAdRevenueData("setOaidData", str);
        AFb1iSDK.AFAdRevenueData = str;
        int i4 = AFLogger + 59;
        AFInAppEventType = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 3;
        AFLogger = i2 % 128;
        if (i2 % 2 != 0) {
            AFd1sSDK copy = AFAdRevenueData().copy();
            String[] strArr = new String[1];
            strArr[1] = str;
            copy.AFAdRevenueData("setAndroidIdData", strArr);
        } else {
            AFAdRevenueData().copy().AFAdRevenueData("setAndroidIdData", str);
        }
        AFAdRevenueData().afErrorLog().getCurrencyIso4217Code = str;
        int i3 = AFInAppEventType + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        AFLogger = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void getMediationNetwork(String str, String str2) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 75;
        AFLogger = i2 % 128;
        if (i2 % 2 != 0) {
            AppsFlyerProperties.getInstance().set(str, str2);
            int i3 = 82 / 0;
        } else {
            AppsFlyerProperties.getInstance().set(str, str2);
        }
    }

    private static void getCurrencyIso4217Code(String str, boolean z) {
        int i = 2 % 2;
        int i2 = AFLogger + 57;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 != 0) {
            AppsFlyerProperties.getInstance().set(str, z);
        } else {
            AppsFlyerProperties.getInstance().set(str, z);
            throw null;
        }
    }

    private static String getMonetizationNetwork(String str) {
        int i = 2 % 2;
        int i2 = AFLogger + 45;
        AFInAppEventType = i2 % 128;
        int i3 = i2 % 2;
        String string = AppsFlyerProperties.getInstance().getString(str);
        int i4 = AFLogger + 65;
        AFInAppEventType = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return string;
    }

    private static /* synthetic */ Object equals(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        int i2 = AFLogger + 107;
        AFInAppEventType = i2 % 128;
        int i3 = i2 % 2;
        boolean z = AppsFlyerProperties.getInstance().getBoolean(str, false);
        int i4 = AFInAppEventType + 113;
        AFLogger = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(z);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getCurrencyIso4217Code() {
        int i = 2 % 2;
        if (getCurrencyIso4217Code(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID)) {
            int i2 = AFLogger + 3;
            AFInAppEventType = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (((String) AFAdRevenueData(new Object[0], -775349742, 775349749, (int) System.currentTimeMillis())) == null) {
                int i3 = AFInAppEventType + 89;
                AFLogger = i3 % 128;
                return i3 % 2 == 0;
            }
        }
        return false;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z) {
        int i = 2 % 2;
        int i2 = AFLogger + 105;
        AFInAppEventType = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        getCurrencyIso4217Code(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, Context context) {
        int i = 2 % 2;
        if (context != null) {
            int i2 = AFLogger + 61;
            AFInAppEventType = i2 % 128;
            int i3 = i2 % 2;
            if (getCurrencyIso4217Code()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog(new StringBuilder("CustomerUserId set: ").append(str).append(" - Initializing AppsFlyer Tacking").toString(), true);
                String referrer = AppsFlyerProperties.getInstance().getReferrer(AFAdRevenueData().component1());
                AFAdRevenueData(context, AFh1wSDK.setCustomerIdAndLogSession);
                AFAdRevenueData().AFKeystoreWrapper().getRevenue();
                if (referrer == null) {
                    referrer = "";
                }
                if (!(!(context instanceof Activity))) {
                    int i4 = AFInAppEventType + 37;
                    AFLogger = i4 % 128;
                    int i5 = i4 % 2;
                    ((Activity) context).getIntent();
                }
                AFAdRevenueData(new Object[]{this, context, referrer}, -1040148397, 1040148409, System.identityHashCode(this));
                int i6 = AFLogger + 67;
                AFInAppEventType = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            setCustomerUserId(str);
            AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        int i = 2 % 2;
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        Object obj = null;
        if (string == null) {
            String mediationNetwork = getMediationNetwork(context, "AF_STORE");
            if (mediationNetwork != null) {
                int i2 = AFInAppEventType + 97;
                AFLogger = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 82 / 0;
                }
                return mediationNetwork;
            }
            AFLogger.afInfoLog("No out-of-store value set");
            return null;
        }
        int i4 = AFLogger + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        AFInAppEventType = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 83;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
        } else {
            AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
            int i4 = AFInAppEventType + 59;
            AFLogger = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppInviteOneLink(String str) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 111;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        AFAdRevenueData().copy().AFAdRevenueData("setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str == null || !str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
            int i4 = AFLogger + 9;
            AFInAppEventType = i4 % 128;
            int i5 = i4 % 2;
        }
        getMediationNetwork(AppsFlyerProperties.ONELINK_ID, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 95;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        if (map != null) {
            AFAdRevenueData().copy().AFAdRevenueData("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
            int i4 = AFInAppEventType + 21;
            AFLogger = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0174  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendPushNotificationData(Activity activity) {
        long j;
        long j2;
        int i = 2 % 2;
        if (activity != null && activity.getIntent() != null) {
            AFAdRevenueData().copy().AFAdRevenueData("sendPushNotificationData", activity.getLocalClassName(), new StringBuilder("activity_intent_").append(activity.getIntent().toString()).toString());
        } else if (activity != null) {
            AFAdRevenueData().copy().AFAdRevenueData("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
        } else {
            AFAdRevenueData().copy().AFAdRevenueData("sendPushNotificationData", "activity_null");
        }
        AFc1oSDK afErrorLog = AFAdRevenueData().afErrorLog();
        afErrorLog.getRevenue = getCurrencyIso4217Code(activity);
        if (afErrorLog.getRevenue != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.hashCode == null) {
                AFLogger.afInfoLog("pushes: initializing pushes history..");
                this.hashCode = new ConcurrentHashMap();
                j2 = currentTimeMillis;
                j = j2;
            } else {
                try {
                    long j3 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                    j2 = currentTimeMillis;
                    for (Long l : this.hashCode.keySet()) {
                        try {
                            JSONObject jSONObject = new JSONObject(afErrorLog.getRevenue);
                            JSONObject jSONObject2 = new JSONObject(this.hashCode.get(l));
                            j = currentTimeMillis;
                            try {
                                if (jSONObject.opt("pid").equals(jSONObject2.opt("pid")) && jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                    AFLogger.afInfoLog(new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ").append(jSONObject2).append(", new: ").append(jSONObject).append(")").toString());
                                    afErrorLog.getRevenue = null;
                                    return;
                                } else {
                                    if (j - l.longValue() > j3) {
                                        this.hashCode.remove(l);
                                    }
                                    if (l.longValue() <= j2) {
                                        j2 = l.longValue();
                                    }
                                    currentTimeMillis = j;
                                }
                            } catch (Throwable th) {
                                th = th;
                                AFLogger.afErrorLog(new StringBuilder("Error while handling push notification measurement: ").append(th.getClass().getSimpleName()).toString(), th);
                                if (this.hashCode.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                                }
                                this.hashCode.put(Long.valueOf(j), afErrorLog.getRevenue);
                                start(activity);
                                int i2 = AFLogger + 99;
                                AFInAppEventType = i2 % 128;
                                int i3 = i2 % 2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j = currentTimeMillis;
                        }
                    }
                    j = currentTimeMillis;
                } catch (Throwable th3) {
                    th = th3;
                    j = currentTimeMillis;
                    j2 = j;
                }
            }
            if (this.hashCode.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                AFLogger.afInfoLog(new StringBuilder("pushes: removing oldest overflowing push (oldest push:").append(j2).append(")").toString());
                this.hashCode.remove(Long.valueOf(j2));
                int i4 = AFInAppEventType + 21;
                AFLogger = i4 % 128;
                int i5 = i4 % 2;
            }
            this.hashCode.put(Long.valueOf(j), afErrorLog.getRevenue);
            start(activity);
            int i22 = AFLogger + 99;
            AFInAppEventType = i22 % 128;
            int i32 = i22 % 2;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 87;
        AFLogger = i2 % 128;
        if (i2 % 2 != 0) {
            AFAdRevenueData().copy().AFAdRevenueData("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            int i3 = 9 / 0;
        } else {
            AFAdRevenueData().copy().AFAdRevenueData("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        }
    }

    /* renamed from: com.appsflyer.internal.AFa1zSDK$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] getMediationNetwork;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            getMediationNetwork = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getMediationNetwork[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        AFAdRevenueData().copy().AFAdRevenueData("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        String str = null;
        for (String str2 : strArr) {
            int i2 = AFInAppEventType + 65;
            AFLogger = i2 % 128;
            int i3 = i2 % 2;
            if (AnonymousClass4.getMediationNetwork[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFj1hSDK.getCurrencyIso4217Code(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                int i4 = AFLogger + 105;
                AFInAppEventType = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 3 % 3;
                }
                str = "plain_el_arr";
            }
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z) {
        int i = 2 % 2;
        int i2 = AFLogger + 115;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 == 0) {
            AFd1sSDK copy = AFAdRevenueData().copy();
            String[] strArr = new String[0];
            strArr[0] = String.valueOf(z);
            copy.AFAdRevenueData("setCollectAndroidID", strArr);
        } else {
            AFAdRevenueData().copy().AFAdRevenueData("setCollectAndroidID", String.valueOf(z));
        }
        getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z));
        getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z));
        int i3 = AFInAppEventType + 97;
        AFLogger = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z) {
        int i = 2 % 2;
        int i2 = AFLogger + 95;
        AFInAppEventType = i2 % 128;
        int i3 = i2 % 2;
        AFAdRevenueData().copy().AFAdRevenueData("setCollectIMEI", String.valueOf(z));
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z));
        int i4 = AFLogger + 67;
        AFInAppEventType = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        AFAdRevenueData().copy().AFAdRevenueData("setCollectOaid", String.valueOf(z));
        getMediationNetwork(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z));
        int i4 = AFInAppEventType + 85;
        AFLogger = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 51;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        AFa1oSDK e = AFAdRevenueData().e();
        e.component3.clear();
        e.component3.addAll(Arrays.asList(strArr));
        int i4 = AFLogger + 83;
        AFInAppEventType = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void copy() {
        int i = 2 % 2;
        int i2 = AFLogger + 77;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 == 0) {
            AFAdRevenueData().registerClient().getMediationNetwork();
            component4();
            int i3 = 96 / 0;
        } else {
            AFAdRevenueData().registerClient().getMediationNetwork();
            component4();
        }
        int i4 = AFLogger + 55;
        AFInAppEventType = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMonetizationNetwork(boolean z) {
        int i = 2 % 2;
        if (z) {
            int i2 = AFLogger + 83;
            AFInAppEventType = i2 % 128;
            int i3 = i2 % 2;
            AFAdRevenueData().force().getMonetizationNetwork();
            int i4 = AFInAppEventType + 73;
            AFLogger = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        AFAdRevenueData().force().AFAdRevenueData();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        int i = 2 % 2;
        if (!this.copy) {
            this.copy = true;
            AFf1iSDK AFKeystoreWrapper2 = AFAdRevenueData().AFKeystoreWrapper();
            AFf1iSDK.AFAdRevenueData(new Object[]{AFKeystoreWrapper2, str}, 99232209, -99232207, System.identityHashCode(AFKeystoreWrapper2));
            if (context != null) {
                getCurrencyIso4217Code(context);
                Application M_ = AFj1nSDK.M_(context);
                if (M_ != null) {
                    int i2 = AFInAppEventType + 53;
                    AFLogger = i2 % 128;
                    int i3 = i2 % 2;
                    this.component3 = M_;
                    AFAdRevenueData().AFAdRevenueData().execute(new Runnable() { // from class: com.appsflyer.internal.AFa1zSDK$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFa1zSDK.this.copy();
                        }
                    });
                    AFAdRevenueData().component2().getCurrencyIso4217Code = System.currentTimeMillis();
                    AFe1sSDK equals = AFAdRevenueData().equals();
                    equals.getRevenue.execute(equals.new AnonymousClass3(new AFe1hSDK(AFAdRevenueData())));
                    AFi1ySDK w = AFAdRevenueData().w();
                    w.getRevenue = Build.VERSION.SDK_INT >= 31 ? new AFi1uSDK(w.AFAdRevenueData) : new AFi1vSDK(w.AFAdRevenueData);
                    AFAdRevenueData().afRDLog().getMediationNetwork(new AFc1bSDK.AFa1vSDK() { // from class: com.appsflyer.internal.AFa1zSDK$$ExternalSyntheticLambda3
                        @Override // com.appsflyer.internal.AFc1bSDK.AFa1vSDK
                        public final void onConfigurationChanged(boolean z) {
                            AFa1zSDK.this.getMonetizationNetwork(z);
                        }
                    });
                    AFAdRevenueData().component4().getMonetizationNetwork(getMediationNetwork());
                    AFj1zSDK AFInAppEventParameterName = AFAdRevenueData().AFInAppEventParameterName();
                    Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.AFa1zSDK$$ExternalSyntheticLambda4
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFa1zSDK.this.equals();
                        }
                    };
                    AFi1iSDK monetizationNetwork = AFInAppEventParameterName.getMonetizationNetwork(runnable);
                    Runnable mediationNetwork = AFInAppEventParameterName.getMediationNetwork(monetizationNetwork, runnable);
                    AFInAppEventParameterName.getMonetizationNetwork(monetizationNetwork);
                    AFInAppEventParameterName.getMonetizationNetwork(new AFj1sSDK(AFInAppEventParameterName.getMonetizationNetwork.getRevenue(), mediationNetwork));
                    AFInAppEventParameterName.getMonetizationNetwork(new AFi1dSDK(mediationNetwork, AFInAppEventParameterName.getMonetizationNetwork, new AFi1bSDK()));
                    AFInAppEventParameterName.getMonetizationNetwork(new AFj1wSDK(mediationNetwork, AFInAppEventParameterName.getMonetizationNetwork));
                    AFInAppEventParameterName.getMonetizationNetwork(new AFj1xSDK(AFInAppEventParameterName.getMonetizationNetwork.AFAdRevenueData(), AFInAppEventParameterName.getMonetizationNetwork.getRevenue(), mediationNetwork));
                    AFInAppEventParameterName.getMediationNetwork(mediationNetwork);
                    if (!AFInAppEventParameterName.getMediationNetwork()) {
                        Context context2 = AFInAppEventParameterName.getMonetizationNetwork.AFLogger().getMonetizationNetwork;
                        AFc1fSDK aFc1fSDK = AFInAppEventParameterName.getMonetizationNetwork;
                        List<ResolveInfo> queryIntentContentProviders = context2.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
                        if (queryIntentContentProviders != null && !queryIntentContentProviders.isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            Iterator<ResolveInfo> it = queryIntentContentProviders.iterator();
                            while (it.hasNext()) {
                                int i4 = AFLogger + 15;
                                AFInAppEventType = i4 % 128;
                                int i5 = i4 % 2;
                                ProviderInfo providerInfo = it.next().providerInfo;
                                if (providerInfo != null) {
                                    arrayList.add(new AFj1vSDK(providerInfo, mediationNetwork, aFc1fSDK));
                                } else {
                                    AFLogger.INSTANCE.w(AFh1zSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                AFInAppEventParameterName.AFAdRevenueData.addAll(arrayList);
                                AFLogger.INSTANCE.d(AFh1zSDK.PREINSTALL, new StringBuilder("Detected ").append(arrayList.size()).append(" valid preinstall provider(s)").toString());
                                int i6 = AFLogger + 23;
                                AFInAppEventType = i6 % 128;
                                int i7 = i6 % 2;
                            }
                        }
                    }
                    for (AFj1ySDK aFj1ySDK : AFInAppEventParameterName.getRevenue()) {
                        aFj1ySDK.getRevenue(AFInAppEventParameterName.getMonetizationNetwork.AFLogger().getMonetizationNetwork);
                    }
                    AFAdRevenueData().AFKeystoreWrapper().getCurrencyIso4217Code(AFAdRevenueData().getRevenue());
                    if (AFAdRevenueData().afLogForce().getRevenue()) {
                        AFAdRevenueData().afLogForce().getMediationNetwork();
                    }
                }
            } else {
                AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
            }
            AFd1sSDK copy = AFAdRevenueData().copy();
            String[] strArr = new String[2];
            strArr[0] = str;
            strArr[1] = appsFlyerConversionListener == null ? AbstractJsonLexerKt.NULL : "conversionDataListener";
            copy.AFAdRevenueData("init", strArr);
            AFLogger.INSTANCE.force(AFh1zSDK.GENERAL, String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.16.2", getMonetizationNetwork));
            this.getRevenue = appsFlyerConversionListener;
            return this;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getRevenue(AFi1kSDK aFi1kSDK) {
        int i = 2 % 2;
        AFe1eSDK aFe1eSDK = new AFe1eSDK(aFi1kSDK, AFAdRevenueData().getRevenue(), AFAdRevenueData());
        AFe1sSDK equals = AFAdRevenueData().equals();
        equals.getRevenue.execute(equals.new AnonymousClass3(aFe1eSDK));
        int i2 = AFLogger + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void component4() {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 61;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        try {
            final AFi1kSDK afInfoLog = AFAdRevenueData().afInfoLog();
            if (afInfoLog != null) {
                int i4 = AFInAppEventType + 21;
                AFLogger = i4 % 128;
                int i5 = i4 % 2;
                if (afInfoLog.getRevenue()) {
                    int i6 = AFLogger + 43;
                    AFInAppEventType = i6 % 128;
                    int i7 = i6 % 2;
                    afInfoLog.getMediationNetwork(new AFi1gSDK() { // from class: com.appsflyer.internal.AFa1zSDK$$ExternalSyntheticLambda6
                        @Override // com.appsflyer.internal.AFi1gSDK
                        public final void onRequestFinished() {
                            AFa1zSDK.this.getRevenue(afInfoLog);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("Error at attempt to request PIA token", th);
            AFLogger.afRDLog("Get PIA token failed with exception:".concat(String.valueOf(th)));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 35;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        AFAdRevenueData().d().getCurrencyIso4217Code(z);
        int i4 = AFLogger + 101;
        AFInAppEventType = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context) {
        int i = 2 % 2;
        int i2 = AFLogger + 73;
        AFInAppEventType = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            start(context, null);
            int i3 = AFLogger + 75;
            AFInAppEventType = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 98 / 0;
                return;
            }
            return;
        }
        start(context, null);
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str) {
        int i = 2 % 2;
        int i2 = AFLogger + 77;
        AFInAppEventType = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        start(context, str, null);
        int i4 = AFLogger + 83;
        AFInAppEventType = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static void getMediationNetwork(Context context) {
        int i = 2 % 2;
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                int i2 = AFInAppEventType + 31;
                AFLogger = i2 % 128;
                int i3 = i2 % 2;
                if (Build.VERSION.SDK_INT >= 31) {
                    int i4 = AFInAppEventType + 55;
                    AFLogger = i4 % 128;
                    int i5 = i4 % 2;
                    if (context.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", context.getPackageName()) != 0) {
                        AFLogger.INSTANCE.i(AFh1zSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
                        return;
                    } else {
                        AFLogger.INSTANCE.w(AFh1zSDK.GENERAL, "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                        return;
                    }
                }
                if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) == 0) {
                    AFLogger.INSTANCE.w(AFh1zSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                    return;
                }
                int i6 = AFLogger + 41;
                AFInAppEventType = i6 % 128;
                int i7 = i6 % 2;
                AFLogger.INSTANCE.i(AFh1zSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
            }
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "Exception while checking BackupRules: ", th);
        }
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        int i = 2 % 2;
        int i2 = AFLogger + 89;
        AFInAppEventType = i2 % 128;
        int i3 = i2 % 2;
        String monetizationNetwork = getMonetizationNetwork(AppsFlyerProperties.APP_USER_ID);
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        return monetizationNetwork;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        int i = 2 % 2;
        int i2 = AFLogger + 81;
        AFInAppEventType = i2 % 128;
        int i3 = i2 % 2;
        AFAdRevenueData().copy().AFAdRevenueData("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        getMediationNetwork(AppsFlyerProperties.APP_USER_ID, str);
        getCurrencyIso4217Code(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        int i4 = AFInAppEventType + 111;
        AFLogger = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i = 2 % 2;
        int i2 = AFLogger + 75;
        AFInAppEventType = i2 % 128;
        int i3 = i2 % 2;
        AFAdRevenueData().afErrorLog().getMediationNetwork = AFj1hSDK.getCurrencyIso4217Code(str);
        int i4 = AFLogger + 45;
        AFInAppEventType = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        int i = 2 % 2;
        int i2 = AFLogger + 27;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 == 0) {
            AFd1sSDK copy = AFAdRevenueData().copy();
            String[] strArr = new String[1];
            strArr[1] = str;
            copy.AFAdRevenueData("setAppId", strArr);
        } else {
            AFAdRevenueData().copy().AFAdRevenueData("setAppId", str);
        }
        getMediationNetwork(AppsFlyerProperties.APP_ID, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 3;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        AFAdRevenueData().copy().AFAdRevenueData("setIsUpdate", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
        int i4 = AFLogger + 103;
        AFInAppEventType = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d, double d2) {
        int i = 2 % 2;
        AFAdRevenueData().copy().AFAdRevenueData("logLocation", String.valueOf(d), String.valueOf(d2));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d2));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d));
        getMonetizationNetwork(context, AFInAppEventType.LOCATION_COORDINATES, hashMap);
        int i2 = AFLogger + 39;
        AFInAppEventType = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        int i = 2 % 2;
        int i2 = AFLogger + 29;
        AFInAppEventType = i2 % 128;
        int i3 = i2 % 2;
        AFAdRevenueData().copy().AFAdRevenueData("logSession", new String[0]);
        AFAdRevenueData().copy().getRevenue();
        AFAdRevenueData(context, AFh1wSDK.logSession);
        Object obj = null;
        getMonetizationNetwork(context, null, null);
        int i4 = AFLogger + 29;
        AFInAppEventType = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void AFAdRevenueData(Context context, AFh1wSDK aFh1wSDK) {
        int i = 2 % 2;
        int i2 = AFLogger + 95;
        AFInAppEventType = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code(context);
        AFh1uSDK component2 = AFAdRevenueData().component2();
        AFg1aSDK revenue = AFg1aSDK.getRevenue(context);
        if (component2.getCurrencyIso4217Code()) {
            component2.getMediationNetwork.put("api_name", aFh1wSDK.toString());
            component2.getMediationNetwork(revenue);
            int i4 = AFLogger + 91;
            AFInAppEventType = i4 % 128;
            int i5 = i4 % 2;
        }
        component2.AFAdRevenueData();
        int i6 = AFLogger + 85;
        AFInAppEventType = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 20 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logAdRevenue(AFAdRevenueData aFAdRevenueData, Map<String, Object> map) {
        int i = 2 % 2;
        Object obj = null;
        if (!this.copy) {
            getMediationNetwork("logAdRevenue");
            int i2 = AFLogger + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            AFInAppEventType = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (!aFAdRevenueData.areAllFieldsValid()) {
            AFLogger.INSTANCE.w(AFh1zSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
            return;
        }
        if (!AFAdRevenueData().AFKeystoreWrapper().getMediationNetwork()) {
            if (!(!AFj1eSDK.getCurrencyIso4217Code(AFAdRevenueData().AFKeystoreWrapper().getRevenue()))) {
                AFAdRevenueData(new Object[0], -847594301, 847594306, (int) System.currentTimeMillis());
                return;
            } else {
                getMediationNetwork(new AFh1pSDK(aFAdRevenueData, map));
                return;
            }
        }
        int i3 = AFInAppEventType + 1;
        AFLogger = i3 % 128;
        if (i3 % 2 == 0) {
            AFLogger.INSTANCE.w(AFh1zSDK.AD_REVENUE, "SDK is stopped");
        } else {
            AFLogger.INSTANCE.w(AFh1zSDK.AD_REVENUE, "SDK is stopped");
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 25;
        AFLogger = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            logEvent(context, str, map, null);
            int i3 = AFLogger + 53;
            AFInAppEventType = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        logEvent(context, str, map, null);
        obj.hashCode();
        throw null;
    }

    private AFh1vSDK areAllFieldsValid(Context context) {
        int i = 2 % 2;
        int i2 = AFLogger + 29;
        int i3 = i2 % 128;
        AFInAppEventType = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = context instanceof Activity;
            obj.hashCode();
            throw null;
        }
        if (context instanceof Activity) {
            AFh1vSDK aFh1vSDK = new AFh1vSDK((Activity) context, AFAdRevenueData().unregisterClient());
            int i4 = AFInAppEventType + 77;
            AFLogger = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 10 / 0;
            }
            return aFh1vSDK;
        }
        int i6 = i3 + 69;
        AFLogger = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private void getMonetizationNetwork(Context context, String str, Map<String, Object> map) {
        int i = 2 % 2;
        AFh1mSDK aFh1mSDK = new AFh1mSDK();
        aFh1mSDK.component3 = str;
        aFh1mSDK.getRevenue = map;
        AFAdRevenueData(aFh1mSDK, areAllFieldsValid(context));
        int i2 = AFInAppEventType + 109;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
    }

    final void AFAdRevenueData(AFh1tSDK aFh1tSDK, AFh1vSDK aFh1vSDK) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 109;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        getRevenue(aFh1tSDK, aFh1vSDK);
        if (AFAdRevenueData().AFKeystoreWrapper().getRevenue() == null) {
            AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            AppsFlyerRequestListener appsFlyerRequestListener = aFh1tSDK.AFAdRevenueData;
            if (appsFlyerRequestListener != null) {
                int i4 = AFLogger + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                AFInAppEventType = i4 % 128;
                int i5 = i4 % 2;
                appsFlyerRequestListener.onError(41, "No dev key");
                return;
            }
            return;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(AFAdRevenueData().component1());
        if (referrer == null) {
            referrer = "";
        }
        aFh1tSDK.areAllFieldsValid = referrer;
        getMediationNetwork(aFh1tSDK);
    }

    private static void getRevenue(AFh1tSDK aFh1tSDK, AFh1vSDK aFh1vSDK) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 41;
        int i3 = i2 % 128;
        AFLogger = i3;
        int i4 = i2 % 2;
        if (aFh1vSDK != null) {
            int i5 = i3 + 81;
            AFInAppEventType = i5 % 128;
            if (i5 % 2 != 0) {
                aFh1tSDK.getMediationNetwork = aFh1vSDK.getMediationNetwork;
                aFh1tSDK.component4 = aFh1vSDK.AFAdRevenueData;
            } else {
                aFh1tSDK.getMediationNetwork = aFh1vSDK.getMediationNetwork;
                aFh1tSDK.component4 = aFh1vSDK.AFAdRevenueData;
                throw null;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z) {
        int i = 2 % 2;
        int i2 = AFLogger + 63;
        AFInAppEventType = i2 % 128;
        int i3 = i2 % 2;
        AFAdRevenueData().copy().AFAdRevenueData("anonymizeUser", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
        int i4 = AFLogger + 65;
        AFInAppEventType = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFa1zSDK aFa1zSDK = (AFa1zSDK) objArr[0];
        AppsFlyerConversionListener appsFlyerConversionListener = (AppsFlyerConversionListener) objArr[2];
        int i = 2 % 2;
        int i2 = AFLogger + 53;
        AFInAppEventType = i2 % 128;
        int i3 = i2 % 2;
        aFa1zSDK.AFAdRevenueData().copy().AFAdRevenueData("registerConversionListener", new String[0]);
        aFa1zSDK.getRevenue(appsFlyerConversionListener);
        int i4 = AFLogger + 49;
        AFInAppEventType = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        r3.getRevenue = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r2 = r2 + 83;
        com.appsflyer.internal.AFa1zSDK.AFInAppEventType = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getRevenue(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 103;
        int i3 = i2 % 128;
        AFLogger = i3;
        if (i2 % 2 != 0) {
            int i4 = 22 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        int i = 2 % 2;
        int i2 = AFLogger + 51;
        AFInAppEventType = i2 % 128;
        int i3 = i2 % 2;
        AFAdRevenueData().copy().AFAdRevenueData("unregisterConversionListener", new String[0]);
        this.getRevenue = null;
        int i4 = AFLogger + 25;
        AFInAppEventType = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 105;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        AFAdRevenueData().copy().AFAdRevenueData("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            AFLogger.afDebugLog("registerValidatorListener null listener");
            return;
        }
        getMediationNetwork = appsFlyerInAppPurchaseValidatorListener;
        int i4 = AFLogger + 69;
        AFInAppEventType = i4 % 128;
        int i5 = i4 % 2;
    }

    public static String getMediationNetwork(SimpleDateFormat simpleDateFormat, long j) {
        int i = 2 % 2;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date(j));
        int i2 = AFLogger + 79;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 != 0) {
            return format;
        }
        throw null;
    }

    private void getMediationNetwork(AFh1tSDK aFh1tSDK) {
        boolean z;
        int i = 2 % 2;
        if (aFh1tSDK.component3 == null) {
            int i2 = AFLogger + 3;
            AFInAppEventType = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getCurrencyIso4217Code()) {
            AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (z) {
            int i4 = AFInAppEventType + 87;
            AFLogger = i4 % 128;
            if (i4 % 2 == 0 ? !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true) : !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, false)) {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            } else {
                int i5 = AFLogger + 25;
                AFInAppEventType = i5 % 128;
                int i6 = i5 % 2;
                if (component3()) {
                    AppsFlyerRequestListener appsFlyerRequestListener = aFh1tSDK.AFAdRevenueData;
                    if (appsFlyerRequestListener != null) {
                        appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                        return;
                    }
                    return;
                }
            }
            this.component4 = System.currentTimeMillis();
        }
        AFj1gSDK.getMediationNetwork(AFAdRevenueData().getMonetizationNetwork(), new AFa1vSDK(aFh1tSDK), 0L, TimeUnit.MILLISECONDS);
    }

    private void AFAdRevenueData(String str) {
        int i = 2 % 2;
        AFh1tSDK revenue = new AFh1sSDK().getRevenue(AFAdRevenueData().getRevenue().getRevenue.AFAdRevenueData("appsFlyerCount", 0));
        revenue.areAllFieldsValid = str;
        if (str != null) {
            int i2 = AFInAppEventType + 45;
            AFLogger = i2 % 128;
            if (i2 % 2 != 0) {
                if (str.length() <= 3) {
                    return;
                }
            } else if (str.length() <= 5) {
                return;
            }
            int i3 = AFLogger + 71;
            AFInAppEventType = i3 % 128;
            int i4 = i3 % 2;
            if (AFAdRevenueData().AFInAppEventParameterName().getRevenue(revenue)) {
                AFj1gSDK.getMediationNetwork(AFAdRevenueData().getMonetizationNetwork(), new AFa1vSDK(revenue), 5L, TimeUnit.MILLISECONDS);
                int i5 = AFLogger + 57;
                AFInAppEventType = i5 % 128;
                int i6 = i5 % 2;
            }
        }
    }

    final void getCurrencyIso4217Code(AFh1tSDK aFh1tSDK) {
        AFj1ySDK[] component1;
        int length;
        int i = 2 % 2;
        Context context = AFAdRevenueData().AFLogger().getMonetizationNetwork;
        boolean z = true;
        if (context == null) {
            AFLogger.INSTANCE.d(AFh1zSDK.ATTRIBUTION, "sendWithEvent - got null context. skipping event/launch.", true);
            return;
        }
        String revenue = AFAdRevenueData().AFKeystoreWrapper().getRevenue();
        AppsFlyerRequestListener appsFlyerRequestListener = aFh1tSDK.AFAdRevenueData;
        if (revenue != null) {
            int i2 = AFInAppEventType + 35;
            AFLogger = i2 % 128;
            int i3 = i2 % 2;
            if (revenue.length() != 0) {
                AFc1sSDK aFc1sSDK = (AFc1sSDK) AFAdRevenueData(new Object[]{this, context}, -1165261210, 1165261210, System.identityHashCode(this));
                AppsFlyerProperties.getInstance().saveProperties(aFc1sSDK);
                if (!AFAdRevenueData().AFKeystoreWrapper().getMediationNetwork()) {
                    AFLogger.INSTANCE.i(AFh1zSDK.GENERAL, new StringBuilder("sendWithEvent from activity: ").append(context.getClass().getName()).toString(), true);
                }
                boolean AFAdRevenueData2 = aFh1tSDK.AFAdRevenueData();
                Map<String, ?> monetizationNetwork = getMonetizationNetwork(aFh1tSDK);
                if (AFAdRevenueData().AFKeystoreWrapper().getMediationNetwork()) {
                    AFLogger.INSTANCE.i(AFh1zSDK.GENERAL, "AppsFlyerLib.sendWithEvent");
                }
                int revenue2 = getRevenue(aFc1sSDK, false);
                getCurrencyIso4217Code(monetizationNetwork);
                AFa1tSDK aFa1tSDK = new AFa1tSDK(AFAdRevenueData(), aFh1tSDK.getCurrencyIso4217Code(monetizationNetwork).getRevenue(revenue2), AFAdRevenueData().d().getCurrencyIso4217Code());
                if (AFAdRevenueData2) {
                    int i4 = AFLogger + 33;
                    AFInAppEventType = i4 % 128;
                    if (i4 % 2 == 0) {
                        component1 = component1();
                        length = component1.length;
                    } else {
                        component1 = component1();
                        length = component1.length;
                    }
                    boolean z2 = false;
                    for (int i5 = 0; i5 < length; i5++) {
                        int i6 = AFLogger + 1;
                        AFInAppEventType = i6 % 128;
                        int i7 = i6 % 2;
                        AFj1ySDK aFj1ySDK = component1[i5];
                        if (aFj1ySDK.component1 == AFj1ySDK.AFa1vSDK.STARTED) {
                            AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, new StringBuilder("Failed to get ").append(aFj1ySDK.component4).append(" referrer, wait ...").toString());
                            z2 = true;
                        }
                    }
                    if (AFAdRevenueData().d().AFAdRevenueData()) {
                        int i8 = AFInAppEventType + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                        AFLogger = i8 % 128;
                        int i9 = i8 % 2;
                        AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "fetching Facebook deferred AppLink data, wait ...");
                        z2 = true;
                    }
                    if (!AFAdRevenueData().AFKeystoreWrapper().getMonetizationNetwork()) {
                        z = z2;
                    }
                } else {
                    z = false;
                }
                AFj1gSDK.getMediationNetwork(AFAdRevenueData().getMonetizationNetwork(), aFa1tSDK, !z ? 0L : 500L, TimeUnit.MILLISECONDS);
                return;
            }
        }
        AFLogger.INSTANCE.i(AFh1zSDK.GENERAL, "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ", true);
        AFLogger.INSTANCE.i(AFh1zSDK.GENERAL, "AppsFlyer will not track this event.", true);
        if (appsFlyerRequestListener != null) {
            appsFlyerRequestListener.onError(41, "No dev key");
        }
    }

    private void getCurrencyIso4217Code(Map<String, Object> map) {
        int i = 2 % 2;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            return;
        }
        int i2 = AFLogger + 33;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 == 0) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                return;
            }
        } else if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return;
        }
        if (map.get("advertiserId") != null) {
            int i3 = AFLogger + 75;
            AFInAppEventType = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    AFj1eSDK.getCurrencyIso4217Code(AFAdRevenueData().afErrorLog().getCurrencyIso4217Code);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (AFj1eSDK.getCurrencyIso4217Code(AFAdRevenueData().afErrorLog().getCurrencyIso4217Code) && map.remove("android_id") != null) {
                    int i4 = AFLogger + 53;
                    AFInAppEventType = i4 % 128;
                    int i5 = i4 % 2;
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                }
                if (AFj1eSDK.getCurrencyIso4217Code(AFAdRevenueData().AFKeystoreWrapper().AFAdRevenueData())) {
                    int i6 = AFInAppEventType + 51;
                    AFLogger = i6 % 128;
                    int i7 = i6 % 2;
                    if (map.remove("imei") != null) {
                        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                    }
                }
            } catch (Exception e) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e);
            }
        }
    }

    final Map<String, Object> getMonetizationNetwork(AFh1tSDK aFh1tSDK) {
        String str;
        int i = 2 % 2;
        Context context = AFAdRevenueData().AFLogger().getMonetizationNetwork;
        AFc1sSDK aFc1sSDK = (AFc1sSDK) AFAdRevenueData(new Object[]{this, context}, -1165261210, 1165261210, System.identityHashCode(this));
        AFg1tSDK component3 = AFAdRevenueData().component3();
        boolean mediationNetwork = AFAdRevenueData().AFKeystoreWrapper().getMediationNetwork();
        boolean AFAdRevenueData2 = aFh1tSDK.AFAdRevenueData();
        Map<String, Object> map = aFh1tSDK.getMonetizationNetwork;
        long time = new Date().getTime();
        Object[] objArr = new Object[1];
        a("逘遹욥ꈚ噸龕⣊ص̕婊ଋ\ue956뚤⧚꙯緩", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (mediationNetwork) {
                int i2 = AFInAppEventType + 91;
                AFLogger = i2 % 128;
                int i3 = i2 % 2;
                AFLogger.INSTANCE.i(AFh1zSDK.GENERAL, "AppsFlyer SDK Reporting has been stopped", true);
            } else {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1zSDK aFh1zSDK = AFh1zSDK.GENERAL;
                StringBuilder sb = new StringBuilder("******* sendTrackingWithEvent: ");
                if (AFAdRevenueData2) {
                    int i4 = AFLogger + 101;
                    AFInAppEventType = i4 % 128;
                    if (i4 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    str = "Launch";
                } else {
                    str = aFh1tSDK.component3;
                }
                aFLogger.i(aFh1zSDK, sb.append(str).toString(), true);
                int i5 = AFLogger + 19;
                AFInAppEventType = i5 % 128;
                int i6 = i5 % 2;
            }
            component3(context);
            int revenue = getRevenue(aFc1sSDK, AFAdRevenueData2);
            int mediationNetwork2 = getMediationNetwork(aFc1sSDK, aFh1tSDK.component3 != null);
            if (AFAdRevenueData2 && revenue == 1) {
                AppsFlyerProperties.getInstance().getCurrencyIso4217Code = true;
            }
            component3.AFAdRevenueData(map, revenue, mediationNetwork2);
            return map;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "Error while preparing to send event", th, true, true, true);
            return map;
        }
    }

    private static void component3(Context context) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 43;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        try {
            List asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
            if (!asList.contains("android.permission.INTERNET")) {
                AFLogger.INSTANCE.w(AFh1zSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
            }
            if (!asList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                int i4 = AFLogger + 61;
                AFInAppEventType = i4 % 128;
                if (i4 % 2 == 0) {
                    AFLogger.INSTANCE.w(AFh1zSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
                    throw null;
                }
                AFLogger.INSTANCE.w(AFh1zSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (Build.VERSION.SDK_INT > 32) {
                int i5 = AFLogger + 15;
                AFInAppEventType = i5 % 128;
                int i6 = i5 % 2;
                if (asList.contains("com.google.android.gms.permission.AD_ID")) {
                    return;
                }
                AFLogger.INSTANCE.w(AFh1zSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
            }
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "Exception while validation permissions. ", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return (java.util.Map) r5.get(io.sentry.protocol.Mechanism.JsonKeys.META);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r5.containsKey(io.sentry.protocol.Mechanism.JsonKeys.META) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if ((!r5.containsKey(io.sentry.protocol.Mechanism.JsonKeys.META)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
    
        r1 = new java.util.HashMap();
        r5.put(io.sentry.protocol.Mechanism.JsonKeys.META, r1);
        r5 = com.appsflyer.internal.AFa1zSDK.AFInAppEventType + 65;
        com.appsflyer.internal.AFa1zSDK.AFLogger = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        if ((r5 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r5 = 4 % 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map<String, Object> AFAdRevenueData(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = AFLogger + 59;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 1 / 0;
        }
    }

    private static String getCurrencyIso4217Code(Activity activity) {
        int i = 2 % 2;
        String str = null;
        if (activity == null) {
            return null;
        }
        int i2 = AFLogger + 97;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 != 0) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                try {
                    Bundle extras = intent.getExtras();
                    if (extras != null && (str = extras.getString("af")) != null) {
                        int i3 = AFInAppEventType + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                        AFLogger = i3 % 128;
                        int i4 = i3 % 2;
                        AFLogger.INSTANCE.w(AFh1zSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(String.valueOf(str)));
                        extras.remove("af");
                        activity.setIntent(intent.putExtras(extras));
                    }
                    int i5 = AFInAppEventType + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                    AFLogger = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 4 / 2;
                    }
                    return str;
                } catch (Throwable th) {
                    AFLogger.INSTANCE.e(AFh1zSDK.ENGAGEMENT, th.getMessage(), th);
                }
            }
            return null;
        }
        activity.getIntent();
        throw null;
    }

    public static boolean getMonetizationNetwork(Context context) {
        int i = 2 % 2;
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                int i2 = AFInAppEventType + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                AFLogger = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            int i4 = AFLogger + 29;
            AFInAppEventType = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 94 / 0;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    private String getMediationNetwork(Context context, String str) {
        int i = 2 % 2;
        int i2 = AFInAppEventType;
        int i3 = i2 + 113;
        AFLogger = i3 % 128;
        int i4 = i3 % 2;
        if (context != null) {
            getCurrencyIso4217Code(context);
            String currencyIso4217Code = AFAdRevenueData().getRevenue().getCurrencyIso4217Code(str);
            int i5 = AFInAppEventType + 89;
            AFLogger = i5 % 128;
            int i6 = i5 % 2;
            return currencyIso4217Code;
        }
        int i7 = i2 + 81;
        AFLogger = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        int i = 2 % 2;
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put("pid", str);
            } catch (JSONException e) {
                AFLogger.afErrorLog(e.getMessage(), e);
            }
        }
        Object obj = null;
        if (str2 != null) {
            int i2 = AFLogger + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            AFInAppEventType = i2 % 128;
            if (i2 % 2 == 0) {
                jSONObject.put("c", str2);
                obj.hashCode();
                throw null;
            }
            jSONObject.put("c", str2);
        }
        if (str3 != null) {
            int i3 = AFInAppEventType + 105;
            AFLogger = i3 % 128;
            if (i3 % 2 != 0) {
                jSONObject.put("af_siteid", str3);
                obj.hashCode();
                throw null;
            }
            jSONObject.put("af_siteid", str3);
        }
        if (!jSONObject.has("pid")) {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            return;
        }
        int i4 = AFLogger + 21;
        AFInAppEventType = i4 % 128;
        int i5 = i4 % 2;
        getMediationNetwork("preInstallName", jSONObject.toString());
        int i6 = AFLogger + 55;
        AFInAppEventType = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        try {
            if (!new JSONObject(str).has("pid")) {
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                int i2 = AFLogger + 115;
                AFInAppEventType = i2 % 128;
                if (i2 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            int i3 = AFInAppEventType + 85;
            AFLogger = i3 % 128;
            int i4 = i3 % 2;
            getMediationNetwork("preInstallName", str);
            return null;
        } catch (JSONException e) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
            return null;
        }
    }

    public static String AFAdRevenueData(AFc1sSDK aFc1sSDK, String str) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 41;
        AFLogger = i2 % 128;
        if (i2 % 2 == 0) {
            String AFAdRevenueData2 = aFc1sSDK.AFAdRevenueData("CACHED_CHANNEL", (String) null);
            if (AFAdRevenueData2 == null) {
                aFc1sSDK.getRevenue("CACHED_CHANNEL", str);
                return str;
            }
            int i3 = AFLogger + 53;
            AFInAppEventType = i3 % 128;
            int i4 = i3 % 2;
            return AFAdRevenueData2;
        }
        aFc1sSDK.AFAdRevenueData("CACHED_CHANNEL", (String) null);
        throw null;
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        AFa1zSDK aFa1zSDK = (AFa1zSDK) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        int i2 = AFLogger + 13;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 != 0) {
            aFa1zSDK.getCurrencyIso4217Code(context);
            String mediationNetwork = aFa1zSDK.AFAdRevenueData().getRevenue().getMediationNetwork(context);
            int i3 = AFInAppEventType + 79;
            AFLogger = i3 % 128;
            int i4 = i3 % 2;
            return mediationNetwork;
        }
        aFa1zSDK.getCurrencyIso4217Code(context);
        aFa1zSDK.AFAdRevenueData().getRevenue().getMediationNetwork(context);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    public static synchronized SharedPreferences c_(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (AFa1zSDK.class) {
            int i = 2 % 2;
            int i2 = AFLogger + 11;
            AFInAppEventType = i2 % 128;
            int i3 = i2 % 2;
            if (getMonetizationNetwork().equals == null) {
                int i4 = AFLogger + 101;
                AFInAppEventType = i4 % 128;
                StrictMode.ThreadPolicy threadPolicy = i4 % 2;
                try {
                    if (threadPolicy == 0) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        getMonetizationNetwork().equals = context.getApplicationContext().getSharedPreferences("appsflyer-data", 1);
                        threadPolicy = allowThreadDiskReads;
                    } else {
                        StrictMode.ThreadPolicy allowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        getMonetizationNetwork().equals = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                        threadPolicy = allowThreadDiskReads2;
                    }
                    StrictMode.setThreadPolicy(threadPolicy);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th;
                }
            }
            sharedPreferences = getMonetizationNetwork().equals;
            int i5 = AFInAppEventType + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            AFLogger = i5 % 128;
            if (i5 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return sharedPreferences;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFa1zSDK aFa1zSDK = (AFa1zSDK) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        int i2 = AFInAppEventType + 17;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        aFa1zSDK.getCurrencyIso4217Code(context);
        AFc1sSDK component1 = aFa1zSDK.AFAdRevenueData().component1();
        int i4 = AFLogger + 39;
        AFInAppEventType = i4 % 128;
        if (i4 % 2 != 0) {
            return component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int getRevenue(AFc1sSDK aFc1sSDK, boolean z) {
        int i = 2 % 2;
        int i2 = AFLogger + 103;
        AFInAppEventType = i2 % 128;
        int i3 = i2 % 2;
        int revenue = getRevenue(aFc1sSDK, "appsFlyerCount", z);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        return revenue;
    }

    private static int getMediationNetwork(AFc1sSDK aFc1sSDK, boolean z) {
        int i = 2 % 2;
        int i2 = AFLogger + 99;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 != 0) {
            return getRevenue(aFc1sSDK, "appsFlyerInAppEventCount", z);
        }
        getRevenue(aFc1sSDK, "appsFlyerInAppEventCount", z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static int getRevenue(AFc1sSDK aFc1sSDK, String str, boolean z) {
        int i = 2 % 2;
        int AFAdRevenueData2 = aFc1sSDK.AFAdRevenueData(str, 0);
        if (z) {
            int i2 = AFInAppEventType + 7;
            AFLogger = i2 % 128;
            AFAdRevenueData2 = i2 % 2 != 0 ? AFAdRevenueData2 + 26 : AFAdRevenueData2 + 1;
            aFc1sSDK.getMonetizationNetwork(str, AFAdRevenueData2);
        }
        int i3 = AFInAppEventType + 23;
        AFLogger = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 48 / 0;
        }
        return AFAdRevenueData2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003b, code lost:
    
        getCurrencyIso4217Code(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004c, code lost:
    
        return com.appsflyer.internal.AFb1kSDK.getMonetizationNetwork(AFAdRevenueData().getRevenue().getRevenue);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        r5 = com.appsflyer.internal.AFa1zSDK.AFLogger + 83;
        com.appsflyer.internal.AFa1zSDK.AFInAppEventType = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        return null;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getAppsFlyerUID(Context context) {
        int i = 2 % 2;
        int i2 = AFLogger + 95;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 == 0) {
            AFAdRevenueData().copy().AFAdRevenueData("getAppsFlyerUID", new String[0]);
        } else {
            AFAdRevenueData().copy().AFAdRevenueData("getAppsFlyerUID", new String[0]);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        boolean mediationNetwork;
        int i = 2 % 2;
        int i2 = AFInAppEventType + 109;
        AFLogger = i2 % 128;
        if (i2 % 2 != 0) {
            mediationNetwork = AFAdRevenueData().AFKeystoreWrapper().getMediationNetwork();
            int i3 = 86 / 0;
        } else {
            mediationNetwork = AFAdRevenueData().AFKeystoreWrapper().getMediationNetwork();
        }
        int i4 = AFLogger + 49;
        AFInAppEventType = i4 % 128;
        int i5 = i4 % 2;
        return mediationNetwork;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        boolean z;
        int i = 2 % 2;
        int i2 = AFInAppEventType + 3;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            int i4 = AFInAppEventType + 65;
            AFLogger = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 3;
            }
            z = true;
        } else {
            z = false;
        }
        AFAdRevenueData().copy().AFAdRevenueData(CreativeInfo.f, String.valueOf(z));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        if (!z) {
            AFAdRevenueData().force().getMediationNetwork();
        } else {
            AFAdRevenueData().force().component1();
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, String str2) {
        String str3;
        int i = 2 % 2;
        if (!AFj1eSDK.AFAdRevenueData(str2)) {
            int i2 = AFInAppEventType + 69;
            int i3 = i2 % 128;
            AFLogger = i3;
            int i4 = i2 % 2;
            if (str != null) {
                int i5 = i3 + 5;
                AFInAppEventType = i5 % 128;
                int i6 = i5 % 2;
                str3 = str.trim();
            } else {
                str3 = "";
            }
            AFe1ySDK.getMediationNetwork(new AFd1bSDK(str3, str2.trim()));
            return;
        }
        AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
        int i7 = AFInAppEventType + 67;
        AFLogger = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        int i = 2 % 2;
        int i2 = AFLogger + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        AFInAppEventType = i2 % 128;
        int i3 = i2 % 2;
        AFe1ySDK AFInAppEventType2 = AFAdRevenueData().AFInAppEventType();
        if (i3 != 0) {
            return AFInAppEventType2.AFAdRevenueData();
        }
        AFInAppEventType2.AFAdRevenueData();
        throw null;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFa1zSDK aFa1zSDK = (AFa1zSDK) objArr[0];
        int i = 2 % 2;
        int i2 = AFInAppEventType + 79;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        String currencyIso4217Code = aFa1zSDK.AFAdRevenueData().AFInAppEventType().getCurrencyIso4217Code();
        int i4 = AFInAppEventType + 95;
        AFLogger = i4 % 128;
        if (i4 % 2 == 0) {
            return currencyIso4217Code;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i) {
        int i2 = 2 % 2;
        int i3 = AFInAppEventType + 59;
        AFLogger = i3 % 128;
        int i4 = i3 % 2;
        this.component2 = TimeUnit.SECONDS.toMillis(i);
        int i5 = AFLogger + 23;
        AFInAppEventType = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AFj1ySDK[] component1() {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 37;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        AFj1ySDK[] revenue = AFAdRevenueData().AFInAppEventParameterName().getRevenue();
        int i4 = AFInAppEventType + 57;
        AFLogger = i4 % 128;
        int i5 = i4 % 2;
        return revenue;
    }

    class AFa1vSDK implements Runnable {
        private final AFh1tSDK AFAdRevenueData;

        AFa1vSDK(AFh1tSDK aFh1tSDK) {
            this.AFAdRevenueData = aFh1tSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFa1zSDK.this.getCurrencyIso4217Code(this.AFAdRevenueData);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(PluginInfo pluginInfo) {
        int i = 2 % 2;
        int i2 = AFLogger + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        AFInAppEventType = i2 % 128;
        int i3 = i2 % 2;
        Objects.requireNonNull(pluginInfo);
        AFAdRevenueData().i().getMediationNetwork(pluginInfo);
        int i4 = AFLogger + 35;
        AFInAppEventType = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        int i = 2 % 2;
        AFe1sSDK equals = this.toString.equals();
        equals.getRevenue.execute(equals.new AnonymousClass3(new AFe1dSDK(this.toString, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        int i2 = AFLogger + 9;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void getMediationNetwork(String str) {
        int i = 2 % 2;
        AFLogger.INSTANCE.w(AFh1zSDK.SDK_LIFECYCLE, new StringBuilder("ERROR: AppsFlyer SDK is not initialized! The API call '").append(str).append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.").toString());
        int i2 = AFLogger + 37;
        AFInAppEventType = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 75;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.INSTANCE.w(AFh1zSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
        int i4 = AFLogger + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        AFInAppEventType = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* renamed from: com.appsflyer.internal.AFa1zSDK$AFa1zSDK, reason: collision with other inner class name */
    class C0114AFa1zSDK implements AFe1qSDK {
        @Override // com.appsflyer.internal.AFe1qSDK
        public final void AFAdRevenueData(AFe1tSDK<?> aFe1tSDK) {
        }

        C0114AFa1zSDK() {
        }

        @Override // com.appsflyer.internal.AFe1qSDK
        public final void getMediationNetwork(AFe1tSDK<?> aFe1tSDK) {
            if (aFe1tSDK instanceof AFf1rSDK) {
                AFa1zSDK.this.AFAdRevenueData().component2().getRevenue(((AFf1tSDK) aFe1tSDK).component1.component1);
            }
        }

        @Override // com.appsflyer.internal.AFe1qSDK
        public final void getRevenue(AFe1tSDK<?> aFe1tSDK, AFe1rSDK aFe1rSDK) {
            JSONObject currencyIso4217Code;
            AFf1bSDK mediationNetwork;
            if (aFe1tSDK instanceof AFf1tSDK) {
                AFf1tSDK aFf1tSDK = (AFf1tSDK) aFe1tSDK;
                boolean z = aFe1tSDK instanceof AFf1rSDK;
                if (z && getRevenue()) {
                    AFf1rSDK aFf1rSDK = (AFf1rSDK) aFe1tSDK;
                    if (aFf1rSDK.getMediationNetwork == AFe1rSDK.SUCCESS || aFf1rSDK.getCurrencyIso4217Code == 1) {
                        AFg1nSDK aFg1nSDK = new AFg1nSDK(aFf1rSDK, AFa1zSDK.this.AFAdRevenueData().component1());
                        AFe1sSDK equals = AFa1zSDK.this.AFAdRevenueData().equals();
                        equals.getRevenue.execute(equals.new AnonymousClass3(aFg1nSDK));
                    }
                }
                if (aFe1rSDK == AFe1rSDK.SUCCESS) {
                    AFa1zSDK aFa1zSDK = AFa1zSDK.this;
                    ((AFc1sSDK) AFa1zSDK.AFAdRevenueData(new Object[]{aFa1zSDK, aFa1zSDK.component3}, -1165261210, 1165261210, System.identityHashCode(aFa1zSDK))).getRevenue("sentSuccessfully", "true");
                    if (!(aFe1tSDK instanceof AFf1vSDK) && (mediationNetwork = new AFg1zSDK(AFa1zSDK.this.component3).getMediationNetwork()) != null && mediationNetwork.getRevenue) {
                        String str = mediationNetwork.AFAdRevenueData;
                        AFLogger.INSTANCE.d(AFh1zSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                        AFc1fSDK AFAdRevenueData = AFa1zSDK.getMonetizationNetwork().AFAdRevenueData();
                        AFf1vSDK aFf1vSDK = new AFf1vSDK(str, AFAdRevenueData);
                        AFe1sSDK equals2 = AFAdRevenueData.equals();
                        equals2.getRevenue.execute(equals2.new AnonymousClass3(aFf1vSDK));
                    }
                    ResponseNetwork responseNetwork = ((AFe1kSDK) aFf1tSDK).component2;
                    if (responseNetwork != null && (currencyIso4217Code = AFa1qSDK.getCurrencyIso4217Code((String) responseNetwork.getBody())) != null) {
                        AFa1zSDK.this.component1 = currencyIso4217Code.optBoolean("send_background", false);
                    }
                    if (z) {
                        AFa1zSDK.this.getCurrencyIso4217Code = System.currentTimeMillis();
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(aFe1tSDK instanceof AFg1nSDK) || aFe1rSDK == AFe1rSDK.SUCCESS) {
                return;
            }
            AFg1qSDK aFg1qSDK = new AFg1qSDK(AFa1zSDK.this.AFAdRevenueData());
            AFe1sSDK equals3 = AFa1zSDK.this.AFAdRevenueData().equals();
            equals3.getRevenue.execute(equals3.new AnonymousClass3(aFg1qSDK));
        }

        private boolean getRevenue() {
            return AFa1zSDK.this.getRevenue != null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap = map == null ? null : new HashMap(map);
        getCurrencyIso4217Code(context);
        AFh1mSDK aFh1mSDK = new AFh1mSDK();
        aFh1mSDK.component3 = str;
        aFh1mSDK.AFAdRevenueData = appsFlyerRequestListener;
        if (hashMap != null && hashMap.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap hashMap2 = new HashMap();
            Object obj = hashMap.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap hashMap3 = new HashMap();
                hashMap3.put("x", Float.valueOf(motionEvent.getX()));
                hashMap3.put("y", Float.valueOf(motionEvent.getY()));
                hashMap2.put("loc", hashMap3);
                hashMap2.put("pf", Float.valueOf(motionEvent.getPressure()));
                hashMap2.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                hashMap2.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.w(AFh1zSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> singletonMap = Collections.singletonMap("tch_data", hashMap2);
            hashMap.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1mSDK.getCurrencyIso4217Code(singletonMap);
        }
        aFh1mSDK.getRevenue = hashMap;
        AFd1sSDK copy = AFAdRevenueData().copy();
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = new JSONObject(aFh1mSDK.getRevenue == null ? new HashMap() : aFh1mSDK.getRevenue).toString();
        copy.AFAdRevenueData("logEvent", strArr);
        if (str == null) {
            AFAdRevenueData(context, AFh1wSDK.logEvent);
        }
        AFAdRevenueData(aFh1mSDK, areAllFieldsValid(context));
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i, int i2, int i3) {
        String obj;
        String format;
        int i4 = ~i2;
        int i5 = ~i3;
        switch ((i * (-830)) + (i2 * 832) + (((~(i4 | i5)) | (~(i | i2 | i3))) * (-831)) + ((~(i4 | i | i3)) * (-1662)) + (((~(i | i3)) | (~((~i) | i5)) | (~(i2 | i3))) * 831)) {
            case 1:
                return getCurrencyIso4217Code(objArr);
            case 2:
                AFa1zSDK aFa1zSDK = (AFa1zSDK) objArr[0];
                Context context = (Context) objArr[1];
                int i6 = 2 % 2;
                int i7 = AFInAppEventType + 113;
                AFLogger = i7 % 128;
                int i8 = i7 % 2;
                aFa1zSDK.getCurrencyIso4217Code(context);
                aFa1zSDK.AFAdRevenueData().getRevenue();
                boolean revenue = AFc1kSDK.getRevenue(context);
                int i9 = AFInAppEventType + 27;
                AFLogger = i9 % 128;
                int i10 = i9 % 2;
                return Boolean.valueOf(revenue);
            case 3:
                AFa1zSDK aFa1zSDK2 = (AFa1zSDK) objArr[0];
                AppsFlyerConsent appsFlyerConsent = (AppsFlyerConsent) objArr[1];
                int i11 = 2 % 2;
                int i12 = AFLogger + 35;
                AFInAppEventType = i12 % 128;
                int i13 = i12 % 2;
                Objects.requireNonNull(appsFlyerConsent);
                aFa1zSDK2.AFAdRevenueData().afErrorLog().component4 = appsFlyerConsent;
                int i14 = AFLogger + 85;
                AFInAppEventType = i14 % 128;
                int i15 = i14 % 2;
                return null;
            case 4:
                AFa1zSDK aFa1zSDK3 = (AFa1zSDK) objArr[0];
                int i16 = 2 % 2;
                int i17 = AFLogger + 75;
                AFInAppEventType = i17 % 128;
                int i18 = i17 % 2;
                aFa1zSDK3.AFAdRevenueData().copy().AFAdRevenueData("getSdkVersion", new String[0]);
                String areAllFieldsValid2 = AFc1kSDK.areAllFieldsValid();
                int i19 = AFInAppEventType + 111;
                AFLogger = i19 % 128;
                int i20 = i19 % 2;
                return areAllFieldsValid2;
            case 5:
                return getMonetizationNetwork(objArr);
            case 6:
                int i21 = 2 % 2;
                ((AFa1zSDK) objArr[0]).getCurrencyIso4217Code(new AFh1oSDK());
                int i22 = AFLogger + 15;
                AFInAppEventType = i22 % 128;
                int i23 = i22 % 2;
                return null;
            case 7:
                return AFAdRevenueData(objArr);
            case 8:
                return getMediationNetwork(objArr);
            case 9:
                return areAllFieldsValid(objArr);
            case 10:
                AFa1zSDK aFa1zSDK4 = (AFa1zSDK) objArr[0];
                String str = (String) objArr[1];
                int i24 = 2 % 2;
                int i25 = AFLogger + 113;
                AFInAppEventType = i25 % 128;
                if (i25 % 2 == 0) {
                    AFd1sSDK copy = aFa1zSDK4.AFAdRevenueData().copy();
                    String[] strArr = new String[0];
                    strArr[1] = str;
                    copy.AFAdRevenueData("setCurrencyCode", strArr);
                } else {
                    aFa1zSDK4.AFAdRevenueData().copy().AFAdRevenueData("setCurrencyCode", str);
                }
                AppsFlyerProperties.getInstance().set("currencyCode", str);
                int i26 = AFInAppEventType + 47;
                AFLogger = i26 % 128;
                int i27 = i26 % 2;
                return null;
            case 11:
                return component2(objArr);
            case 12:
                AFa1zSDK aFa1zSDK5 = (AFa1zSDK) objArr[0];
                Context context2 = (Context) objArr[1];
                String str2 = (String) objArr[2];
                int i28 = 2 % 2;
                AFh1nSDK aFh1nSDK = new AFh1nSDK();
                aFa1zSDK5.getCurrencyIso4217Code(context2);
                aFh1nSDK.component3 = null;
                aFh1nSDK.getRevenue = null;
                aFh1nSDK.areAllFieldsValid = str2;
                aFh1nSDK.getMediationNetwork = null;
                aFa1zSDK5.getMediationNetwork(aFh1nSDK);
                int i29 = AFInAppEventType + 105;
                AFLogger = i29 % 128;
                int i30 = i29 % 2;
                return null;
            case 13:
                AFa1zSDK aFa1zSDK6 = (AFa1zSDK) objArr[0];
                Context context3 = (Context) objArr[1];
                String str3 = (String) objArr[2];
                final AppsFlyerRequestListener appsFlyerRequestListener = (AppsFlyerRequestListener) objArr[3];
                int i31 = 2 % 2;
                if (aFa1zSDK6.AFAdRevenueData().afDebugLog().AFAdRevenueData()) {
                    return null;
                }
                if (!aFa1zSDK6.copy) {
                    getMediationNetwork(TtmlNode.START);
                    if (str3 == null) {
                        if (appsFlyerRequestListener != null) {
                            appsFlyerRequestListener.onError(41, "No dev key");
                        }
                        return null;
                    }
                }
                aFa1zSDK6.getCurrencyIso4217Code(context3);
                final AFh1uSDK component2 = aFa1zSDK6.AFAdRevenueData().component2();
                component2.getMediationNetwork(AFg1aSDK.getRevenue(context3));
                if (aFa1zSDK6.component3 == null) {
                    Application M_ = AFj1nSDK.M_(context3);
                    if (M_ == null) {
                        return null;
                    }
                    int i32 = AFInAppEventType + 23;
                    AFLogger = i32 % 128;
                    int i33 = i32 % 2;
                    aFa1zSDK6.component3 = M_;
                }
                aFa1zSDK6.AFAdRevenueData().copy().AFAdRevenueData(TtmlNode.START, str3);
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1zSDK aFh1zSDK = AFh1zSDK.GENERAL;
                String str4 = getMonetizationNetwork;
                aFLogger.i(aFh1zSDK, String.format("Starting AppsFlyer: (v%s.%s)", "6.16.2", str4));
                AFLogger.INSTANCE.i(AFh1zSDK.GENERAL, new StringBuilder("Build Number: ").append(str4).toString());
                AppsFlyerProperties.getInstance().loadProperties(aFa1zSDK6.AFAdRevenueData().component1());
                if (!TextUtils.isEmpty(str3)) {
                    AFf1iSDK AFKeystoreWrapper2 = aFa1zSDK6.AFAdRevenueData().AFKeystoreWrapper();
                    AFf1iSDK.AFAdRevenueData(new Object[]{AFKeystoreWrapper2, str3}, 99232209, -99232207, System.identityHashCode(AFKeystoreWrapper2));
                } else if (TextUtils.isEmpty(aFa1zSDK6.AFAdRevenueData().AFKeystoreWrapper().getRevenue())) {
                    int i34 = AFInAppEventType + 59;
                    AFLogger = i34 % 128;
                    int i35 = i34 % 2;
                    AFAdRevenueData(new Object[0], -847594301, 847594306, (int) System.currentTimeMillis());
                    if (appsFlyerRequestListener != null) {
                        appsFlyerRequestListener.onError(41, "No dev key");
                    }
                    return null;
                }
                aFa1zSDK6.AFAdRevenueData().component4().getMonetizationNetwork(aFa1zSDK6.getMediationNetwork());
                AFAdRevenueData(new Object[]{aFa1zSDK6}, 905210815, -905210799, System.identityHashCode(aFa1zSDK6));
                getMediationNetwork(aFa1zSDK6.component3.getBaseContext());
                aFa1zSDK6.AFAdRevenueData().d().getRevenue();
                aFa1zSDK6.toString.afDebugLog().getMonetizationNetwork(context3, new AFb1aSDK.AFa1uSDK() { // from class: com.appsflyer.internal.AFa1zSDK.3
                    @Override // com.appsflyer.internal.AFb1aSDK.AFa1uSDK
                    public final void getMonetizationNetwork(AFh1vSDK aFh1vSDK) {
                        component2.AFAdRevenueData();
                        AFc1fSDK AFAdRevenueData2 = AFa1zSDK.this.AFAdRevenueData();
                        AFAdRevenueData2.component4().getMonetizationNetwork(AFa1zSDK.this.getMediationNetwork());
                        AFa1zSDK aFa1zSDK7 = AFa1zSDK.this;
                        AFa1zSDK.AFAdRevenueData(new Object[]{aFa1zSDK7}, 905210815, -905210799, System.identityHashCode(aFa1zSDK7));
                        int AFAdRevenueData3 = AFAdRevenueData2.getRevenue().getRevenue.AFAdRevenueData("appsFlyerCount", 0);
                        AFLogger.afInfoLog("onBecameForeground");
                        if (AFAdRevenueData3 < 2) {
                            AFa1zSDK.this.AFAdRevenueData().copydefault().getMediationNetwork();
                        }
                        AFh1nSDK aFh1nSDK2 = new AFh1nSDK();
                        if (aFh1vSDK != null) {
                            AFa1zSDK.this.AFAdRevenueData().e().e_(AFa1kSDK.getCurrencyIso4217Code(aFh1nSDK2), aFh1vSDK.getCurrencyIso4217Code, AFAdRevenueData2.AFLogger().getMonetizationNetwork);
                        }
                        AFa1zSDK aFa1zSDK8 = AFa1zSDK.this;
                        aFh1nSDK2.AFAdRevenueData = appsFlyerRequestListener;
                        aFa1zSDK8.AFAdRevenueData(aFh1nSDK2, aFh1vSDK);
                        AFa1zSDK.this.AFAdRevenueData().getCurrencyIso4217Code().getRevenue();
                        AFa1zSDK.this.AFAdRevenueData().getCurrencyIso4217Code().getMediationNetwork.getCurrencyIso4217Code("didSendRevenueTriggerOnLastBackground", false);
                    }

                    @Override // com.appsflyer.internal.AFb1aSDK.AFa1uSDK
                    public final void getRevenue() {
                        Context context4 = AFa1zSDK.this.AFAdRevenueData().AFLogger().getMonetizationNetwork;
                        AFLogger.afInfoLog("onBecameBackground");
                        AFh1uSDK aFh1uSDK = component2;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (aFh1uSDK.component3 != 0) {
                            long j = currentTimeMillis - aFh1uSDK.component3;
                            if (j > 0 && j < 1000) {
                                j = 1000;
                            }
                            aFh1uSDK.copydefault = TimeUnit.MILLISECONDS.toSeconds(j);
                            aFh1uSDK.getRevenue.AFAdRevenueData("prev_session_dur", aFh1uSDK.copydefault);
                        } else {
                            AFLogger.afInfoLog("Metrics: fg ts is missing");
                        }
                        AFLogger.afInfoLog("callStatsBackground background call");
                        AFa1zSDK.this.AFAdRevenueData().afRDLog().getMediationNetwork();
                        AFd1sSDK copy2 = AFa1zSDK.this.AFAdRevenueData().copy();
                        if (copy2.areAllFieldsValid()) {
                            copy2.AFAdRevenueData();
                            if (context4 != null && !AppsFlyerLib.getInstance().isStopped()) {
                                copy2.o_(context4.getPackageName(), context4.getPackageManager());
                            }
                            copy2.getMediationNetwork();
                        } else {
                            AFLogger.afDebugLog("RD status is OFF");
                        }
                        AFa1zSDK.this.AFAdRevenueData().copydefault().getCurrencyIso4217Code();
                        AFa1zSDK.this.AFAdRevenueData().afErrorLogForExcManagerOnly().AFAdRevenueData();
                        AFa1zSDK.this.AFAdRevenueData().getCurrencyIso4217Code().getRevenue();
                    }
                });
                int i36 = AFInAppEventType + 25;
                AFLogger = i36 % 128;
                int i37 = i36 % 2;
                return null;
            case 14:
                AFa1zSDK aFa1zSDK7 = (AFa1zSDK) objArr[0];
                int i38 = 2 % 2;
                if (aFa1zSDK7.component4 > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - aFa1zSDK7.component4;
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
                    String mediationNetwork = getMediationNetwork(simpleDateFormat, aFa1zSDK7.component4);
                    String mediationNetwork2 = getMediationNetwork(simpleDateFormat, aFa1zSDK7.getCurrencyIso4217Code);
                    if (currentTimeMillis < aFa1zSDK7.component2 && !aFa1zSDK7.isStopped()) {
                        int i39 = AFInAppEventType + 63;
                        AFLogger = i39 % 128;
                        if (i39 % 2 == 0) {
                            AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", mediationNetwork, mediationNetwork2, Long.valueOf(currentTimeMillis), Long.valueOf(aFa1zSDK7.component2)));
                            return true;
                        }
                        Locale locale = Locale.US;
                        Object[] objArr2 = new Object[3];
                        objArr2[1] = mediationNetwork;
                        objArr2[1] = mediationNetwork2;
                        objArr2[2] = Long.valueOf(currentTimeMillis);
                        objArr2[2] = Long.valueOf(aFa1zSDK7.component2);
                        AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", objArr2));
                        return false;
                    }
                    if (!aFa1zSDK7.isStopped()) {
                        int i40 = AFInAppEventType + 67;
                        AFLogger = i40 % 128;
                        int i41 = i40 % 2;
                        AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", mediationNetwork, mediationNetwork2, Long.valueOf(currentTimeMillis)));
                    }
                } else if (!aFa1zSDK7.isStopped()) {
                    AFLogger.afInfoLog("Sending first launch for this session!");
                    int i42 = AFLogger + 5;
                    AFInAppEventType = i42 % 128;
                    int i43 = i42 % 2;
                }
                return false;
            case 15:
                return component4(objArr);
            case 16:
                AFa1zSDK aFa1zSDK8 = (AFa1zSDK) objArr[0];
                int i44 = 2 % 2;
                int i45 = AFLogger + 61;
                AFInAppEventType = i45 % 128;
                int i46 = i45 % 2;
                if (AFe1fSDK.component1()) {
                    return null;
                }
                AFc1fSDK AFAdRevenueData2 = aFa1zSDK8.AFAdRevenueData();
                AFe1sSDK equals = AFAdRevenueData2.equals();
                equals.getRevenue.execute(equals.new AnonymousClass3(new AFe1fSDK(AFAdRevenueData2)));
                int i47 = AFInAppEventType + 109;
                AFLogger = i47 % 128;
                int i48 = i47 % 2;
                return null;
            case 17:
                AFa1zSDK aFa1zSDK9 = (AFa1zSDK) objArr[0];
                Context context4 = (Context) objArr[1];
                String str5 = (String) objArr[2];
                String str6 = (String) objArr[3];
                String str7 = (String) objArr[4];
                String str8 = (String) objArr[5];
                String str9 = (String) objArr[6];
                Map map = (Map) objArr[7];
                int i49 = 2 % 2;
                AFd1sSDK copy2 = aFa1zSDK9.AFAdRevenueData().copy();
                String[] strArr2 = new String[6];
                strArr2[0] = str5;
                strArr2[1] = str6;
                strArr2[2] = str7;
                strArr2[3] = str8;
                strArr2[4] = str9;
                if (map == null) {
                    int i50 = AFLogger;
                    int i51 = i50 + 59;
                    AFInAppEventType = i51 % 128;
                    int i52 = i51 % 2;
                    int i53 = i50 + 71;
                    AFInAppEventType = i53 % 128;
                    int i54 = i53 % 2;
                    obj = "";
                } else {
                    obj = map.toString();
                    int i55 = AFLogger + 77;
                    AFInAppEventType = i55 % 128;
                    int i56 = i55 % 2;
                }
                strArr2[5] = obj;
                copy2.AFAdRevenueData("validateAndTrackInAppPurchase", strArr2);
                if (!aFa1zSDK9.AFAdRevenueData().AFKeystoreWrapper().getMediationNetwork()) {
                    AFLogger.INSTANCE.i(AFh1zSDK.PURCHASE_VALIDATION, new StringBuilder("Validate in app called with parameters: ").append(str7).append(ServerSentEventKt.SPACE).append(str8).append(ServerSentEventKt.SPACE).append(str9).toString());
                    int i57 = AFInAppEventType + 77;
                    AFLogger = i57 % 128;
                    int i58 = i57 % 2;
                }
                if (str5 != null && str8 != null) {
                    int i59 = AFInAppEventType + 105;
                    AFLogger = i59 % 128;
                    int i60 = i59 % 2;
                    if (str6 != null && str9 != null && str7 != null) {
                        new Thread(new com.appsflyer.internal.AFa1vSDK(context4.getApplicationContext(), aFa1zSDK9.AFAdRevenueData().AFKeystoreWrapper().getRevenue(), str5, str6, str7, str8, str9, map)).start();
                        return null;
                    }
                }
                AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = getMediationNetwork;
                if (appsFlyerInAppPurchaseValidatorListener != null) {
                    appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                }
                return null;
            case 18:
                AFa1zSDK aFa1zSDK10 = (AFa1zSDK) objArr[0];
                String[] strArr3 = (String[]) objArr[1];
                int i61 = 2 % 2;
                int i62 = AFLogger + 29;
                AFInAppEventType = i62 % 128;
                if (i62 % 2 == 0) {
                    Object[] objArr3 = new Object[0];
                    objArr3[0] = Arrays.toString(strArr3);
                    format = String.format("setOneLinkCustomDomain %s", objArr3);
                } else {
                    format = String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr3));
                }
                AFLogger.afDebugLog(format);
                aFa1zSDK10.AFAdRevenueData().e().component4 = strArr3;
                int i63 = AFLogger + 91;
                AFInAppEventType = i63 % 128;
                int i64 = i63 % 2;
                return null;
            case 19:
                return component3(objArr);
            case 20:
                return component1(objArr);
            case 21:
                return copydefault(objArr);
            case 22:
                return equals(objArr);
            case 23:
                AFa1zSDK aFa1zSDK11 = (AFa1zSDK) objArr[0];
                String str10 = (String) objArr[1];
                int i65 = 2 % 2;
                int i66 = AFInAppEventType + 57;
                AFLogger = i66 % 128;
                int i67 = i66 % 2;
                aFa1zSDK11.AFAdRevenueData().copy().AFAdRevenueData("setExtension", str10);
                AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str10);
                int i68 = AFLogger + 25;
                AFInAppEventType = i68 % 128;
                int i69 = i68 % 2;
                return null;
            default:
                return getRevenue(objArr);
        }
    }

    static void areAllFieldsValid() {
        AFKeystoreWrapper = 8149218016702064934L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMonetizationNetwork(AFf1qSDK aFf1qSDK) {
        AFAdRevenueData(new Object[]{this, aFf1qSDK}, 26715012, -26714991, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void equals() {
        AFAdRevenueData(new Object[]{this}, 1516479698, -1516479692, System.identityHashCode(this));
    }

    private static void copydefault() {
        AFAdRevenueData(new Object[0], -847594301, 847594306, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(AppsFlyerConsent appsFlyerConsent) {
        AFAdRevenueData(new Object[]{this, appsFlyerConsent}, -683364181, 683364184, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        return (String) AFAdRevenueData(new Object[]{this}, -545244941, 545244949, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        AFAdRevenueData(new Object[]{this, context, str, str2, str3, str4, str5, map}, 1523375125, -1523375108, System.identityHashCode(this));
    }

    public final AFc1sSDK getRevenue(Context context) {
        return (AFc1sSDK) AFAdRevenueData(new Object[]{this, context}, -1165261210, 1165261210, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        return (String) AFAdRevenueData(new Object[]{this, context}, 239252226, -239252215, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        return ((Boolean) AFAdRevenueData(new Object[]{this, context}, -790987167, 790987169, System.identityHashCode(this))).booleanValue();
    }

    final void component2() {
        AFAdRevenueData(new Object[]{this}, 905210815, -905210799, System.identityHashCode(this));
    }

    private static void getRevenue(String str) {
        AFAdRevenueData(new Object[]{str}, 1419097846, -1419097845, (int) System.currentTimeMillis());
    }

    private boolean component3() {
        return ((Boolean) AFAdRevenueData(new Object[]{this}, 1228084525, -1228084511, System.identityHashCode(this))).booleanValue();
    }

    private void AFAdRevenueData(Context context, String str) {
        AFAdRevenueData(new Object[]{this, context, str}, -1040148397, 1040148409, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        AFAdRevenueData(new Object[]{this, context, appsFlyerConversionListener}, 1442055838, -1442055818, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        AFAdRevenueData(new Object[]{this, str}, 709829413, -709829403, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        AFAdRevenueData(new Object[]{this, str}, 153321320, -153321297, System.identityHashCode(this));
    }

    public static String getRevenue() {
        return (String) AFAdRevenueData(new Object[0], -775349742, 775349749, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str, AppsFlyerRequestListener appsFlyerRequestListener) {
        AFAdRevenueData(new Object[]{this, context, str, appsFlyerRequestListener}, -1649362845, 1649362858, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        AFAdRevenueData(new Object[]{this, strArr}, 1589809094, -1589809076, System.identityHashCode(this));
    }

    private static boolean getCurrencyIso4217Code(String str) {
        return ((Boolean) AFAdRevenueData(new Object[]{str}, 2030646709, -2030646687, (int) System.currentTimeMillis())).booleanValue();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        return (String) AFAdRevenueData(new Object[]{this}, 424762749, -424762745, System.identityHashCode(this));
    }

    final void b_(Context context, Intent intent) {
        AFAdRevenueData(new Object[]{this, context, intent}, -1435995239, 1435995258, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z) {
        AFAdRevenueData(new Object[]{this, Boolean.valueOf(z)}, -1490728992, 1490729001, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j) {
        AFAdRevenueData(new Object[]{this, deepLinkListener, Long.valueOf(j)}, -447082179, 447082194, System.identityHashCode(this));
    }
}
