package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFj1ySDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.ironsource.M6;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFf1zSDK extends AFe1kSDK<AFa1rSDK> {
    private final List<AFj1ySDK> AFInAppEventParameterName;
    private final CountDownLatch AFInAppEventType;
    private int AFKeystoreWrapper;
    private int AFLogger;
    private final AFa1pSDK component1;
    private final AFh1uSDK copy;
    private final AFa1oSDK copydefault;
    private final AFj1zSDK equals;
    private final AFc1oSDK hashCode;
    private int registerClient;
    private final AFc1kSDK toString;

    @Override // com.appsflyer.internal.AFe1kSDK
    protected final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener component2() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1tSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1zSDK(AFa1pSDK aFa1pSDK, AFc1fSDK aFc1fSDK) {
        super(AFe1uSDK.DLSDK, new AFe1uSDK[]{AFe1uSDK.RC_CDN, AFe1uSDK.FETCH_ADVERTISING_ID}, aFc1fSDK, "DdlSdk");
        Intrinsics.checkNotNullParameter(aFa1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        this.component1 = aFa1pSDK;
        this.AFInAppEventType = new CountDownLatch(1);
        this.AFInAppEventParameterName = new ArrayList();
        AFc1kSDK revenue = aFc1fSDK.getRevenue();
        Intrinsics.checkNotNullExpressionValue(revenue, "");
        this.toString = revenue;
        AFc1oSDK afErrorLog = aFc1fSDK.afErrorLog();
        Intrinsics.checkNotNullExpressionValue(afErrorLog, "");
        this.hashCode = afErrorLog;
        AFa1oSDK e = aFc1fSDK.e();
        Intrinsics.checkNotNullExpressionValue(e, "");
        this.copydefault = e;
        AFh1uSDK component2 = aFc1fSDK.component2();
        Intrinsics.checkNotNullExpressionValue(component2, "");
        this.copy = component2;
        AFj1zSDK AFInAppEventParameterName = aFc1fSDK.AFInAppEventParameterName();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
        this.equals = AFInAppEventParameterName;
        AFj1ySDK[] revenue2 = AFInAppEventParameterName.getRevenue();
        Intrinsics.checkNotNullExpressionValue(revenue2, "");
        ArrayList arrayList = new ArrayList();
        for (AFj1ySDK aFj1ySDK : revenue2) {
            AFj1ySDK aFj1ySDK2 = aFj1ySDK;
            if (aFj1ySDK2 != null && aFj1ySDK2.component1 != AFj1ySDK.AFa1vSDK.NOT_STARTED) {
                arrayList.add(aFj1ySDK);
            }
        }
        ArrayList<AFj1ySDK> arrayList2 = arrayList;
        this.AFLogger = arrayList2.size();
        for (final AFj1ySDK aFj1ySDK3 : arrayList2) {
            AFj1ySDK.AFa1vSDK aFa1vSDK = aFj1ySDK3.component1;
            int i = aFa1vSDK == null ? -1 : AFa1uSDK.AFAdRevenueData[aFa1vSDK.ordinal()];
            if (i == 1) {
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.DDL, aFj1ySDK3.AFAdRevenueData.get("source") + " referrer collected earlier", false, 4, null);
                Intrinsics.checkNotNullExpressionValue(aFj1ySDK3, "");
                AFAdRevenueData(aFj1ySDK3);
            } else if (i == 2) {
                aFj1ySDK3.addObserver(new Observer() { // from class: com.appsflyer.internal.AFf1zSDK$$ExternalSyntheticLambda0
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        AFf1zSDK.AFAdRevenueData(AFj1ySDK.this, this, observable, obj);
                    }
                });
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1tSDK
    public final AFe1rSDK AFAdRevenueData() {
        AFe1rSDK AFAdRevenueData;
        AFe1rSDK aFe1rSDK = AFe1rSDK.FAILURE;
        try {
            AFAdRevenueData = super.AFAdRevenueData();
            Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
        } catch (Exception e) {
            e = e;
        }
        try {
            AFh1uSDK aFh1uSDK = this.copy;
            int i = this.AFKeystoreWrapper;
            if (i <= 0 || i > 2) {
                AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i))));
            } else {
                int i2 = i - 1;
                aFh1uSDK.areAllFieldsValid[i2] = System.currentTimeMillis();
                if (aFh1uSDK.component1[i2] != 0) {
                    aFh1uSDK.component2[i2] = aFh1uSDK.areAllFieldsValid[i2] - aFh1uSDK.component1[i2];
                    aFh1uSDK.AFAdRevenueData.put("net", aFh1uSDK.component2);
                    aFh1uSDK.getRevenue.getRevenue("ddl", new JSONObject(aFh1uSDK.AFAdRevenueData).toString());
                } else {
                    AFLogger.afInfoLog(new StringBuilder("Metrics: ddlStart[").append(i2).append("] ts is missing").toString());
                }
            }
            int i3 = AFa1uSDK.getRevenue[AFAdRevenueData.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    return AFAdRevenueData;
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1zSDK aFh1zSDK = AFh1zSDK.DDL;
                ResponseNetwork responseNetwork = ((AFe1kSDK) this).component2;
                AFg1gSDK.d$default(aFLogger, aFh1zSDK, "Error occurred. Server response code = " + (responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null), false, 4, null);
                DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                this.copy.AFAdRevenueData(deepLinkResult, this.copydefault.component1);
                this.copydefault.getCurrencyIso4217Code(deepLinkResult);
                return AFAdRevenueData;
            }
            ResponseNetwork responseNetwork2 = ((AFe1kSDK) this).component2;
            Intrinsics.checkNotNull(responseNetwork2);
            Object body = responseNetwork2.getBody();
            Intrinsics.checkNotNullExpressionValue(body, "");
            AFa1rSDK aFa1rSDK = (AFa1rSDK) body;
            if (aFa1rSDK.getMediationNetwork != null) {
                DeepLinkResult deepLinkResult2 = new DeepLinkResult(aFa1rSDK.getMediationNetwork, null);
                this.copy.AFAdRevenueData(deepLinkResult2, this.copydefault.component1);
                this.copydefault.getCurrencyIso4217Code(deepLinkResult2);
                return AFAdRevenueData;
            }
            if (this.AFKeystoreWrapper > 1 || !aFa1rSDK.getAFAdRevenueData() || !copy()) {
                DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                this.copy.AFAdRevenueData(deepLinkResult3, this.copydefault.component1);
                this.copydefault.getCurrencyIso4217Code(deepLinkResult3);
                return AFAdRevenueData;
            }
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.DDL, "Waiting for referrers...", false, 4, null);
            this.AFInAppEventType.await();
            AFh1uSDK aFh1uSDK2 = this.copy;
            long currentTimeMillis = System.currentTimeMillis();
            if (aFh1uSDK2.areAllFieldsValid[0] != 0) {
                aFh1uSDK2.AFAdRevenueData.put("rfr_wait", Long.valueOf(currentTimeMillis - aFh1uSDK2.areAllFieldsValid[0]));
                aFh1uSDK2.getRevenue.getRevenue("ddl", new JSONObject(aFh1uSDK2.AFAdRevenueData).toString());
            } else {
                AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
            }
            if (this.registerClient != this.AFLogger) {
                return AFAdRevenueData();
            }
            DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
            this.copy.AFAdRevenueData(deepLinkResult4, this.copydefault.component1);
            this.copydefault.getCurrencyIso4217Code(deepLinkResult4);
            return AFe1rSDK.SUCCESS;
        } catch (Exception e2) {
            e = e2;
            aFe1rSDK = AFAdRevenueData;
            Throwable cause = e.getCause();
            if (cause instanceof InterruptedException ? true : cause instanceof InterruptedIOException) {
                AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.DDL, "Timeout, didn't manage to find deferred deeplink after " + this.AFKeystoreWrapper + " attempt(s) within " + this.copydefault.component1 + " milliseconds", false, 4, null);
                DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                this.copy.AFAdRevenueData(deepLinkResult5, this.copydefault.component1);
                this.copydefault.getCurrencyIso4217Code(deepLinkResult5);
                return AFe1rSDK.TIMEOUT;
            }
            if (cause instanceof IOException) {
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                this.copy.AFAdRevenueData(deepLinkResult6, this.copydefault.component1);
                this.copydefault.getCurrencyIso4217Code(deepLinkResult6);
                return aFe1rSDK;
            }
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.DDL, "Unexpected Exception: " + e, false, 4, null);
            DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
            this.copy.AFAdRevenueData(deepLinkResult7, this.copydefault.component1);
            this.copydefault.getCurrencyIso4217Code(deepLinkResult7);
            return aFe1rSDK;
        }
    }

    private final void AFAdRevenueData(AFj1ySDK aFj1ySDK) {
        if (getMonetizationNetwork(aFj1ySDK)) {
            this.AFInAppEventParameterName.add(aFj1ySDK);
            this.AFInAppEventType.countDown();
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.DDL, "Added non-organic " + aFj1ySDK.getClass().getSimpleName(), false, 4, null);
            return;
        }
        int i = this.registerClient + 1;
        this.registerClient = i;
        if (i == this.AFLogger) {
            this.AFInAppEventType.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFj1ySDK aFj1ySDK, AFf1zSDK aFf1zSDK, Observable observable, Object obj) {
        Intrinsics.checkNotNullParameter(aFf1zSDK, "");
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.DDL, aFj1ySDK.AFAdRevenueData.get("source") + " referrer collected via observer", false, 4, null);
        Intrinsics.checkNotNull(observable, "");
        aFf1zSDK.AFAdRevenueData((AFj1ySDK) observable);
    }

    private final boolean copy() {
        Object obj = this.component1.getMonetizationNetwork.get("referrers");
        List list = obj instanceof List ? (List) obj : null;
        return (list != null ? list.size() : 0) < this.AFLogger && !this.component1.getMonetizationNetwork.containsKey("referrers");
    }

    private static boolean getMonetizationNetwork(AFj1ySDK aFj1ySDK) {
        Object obj = aFj1ySDK.AFAdRevenueData.get("click_ts");
        Long l = obj instanceof Long ? (Long) obj : null;
        if (l != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1tSDK
    public final long getRevenue() {
        return this.copydefault.component1;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011c A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFe1kSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final AFd1mSDK<AFa1rSDK> getMediationNetwork(String str) {
        Map map;
        String[] strArr;
        Intrinsics.checkNotNullParameter(str, "");
        this.AFKeystoreWrapper++;
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.DDL, "Preparing request " + this.AFKeystoreWrapper, false, 4, null);
        Map<String, Object> map2 = this.component1.getMonetizationNetwork;
        if (this.AFKeystoreWrapper == 1) {
            map2.put("is_first", Boolean.valueOf(this.toString.getRevenue.AFAdRevenueData("appsFlyerCount", 0) == 0));
            map2.put(M6.q, Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry());
            map2.put("os", Build.VERSION.RELEASE);
            map2.put("type", Build.MODEL);
            map2.put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, AFb1kSDK.getMonetizationNetwork(this.toString.getRevenue));
            AFb1qSDK aFb1qSDK = this.hashCode.getMonetizationNetwork;
            if (aFb1qSDK != null && (strArr = aFb1qSDK.getRevenue) != null) {
                Intrinsics.checkNotNullExpressionValue(strArr, "");
                map2.put("sharing_filter", strArr);
            }
            AFh1xSDK aFh1xSDK = this.toString.getMediationNetwork.component2;
            Map<String, String> mediationNetwork = getMediationNetwork(aFh1xSDK != null ? new AFb1lSDK(aFh1xSDK.getMonetizationNetwork, aFh1xSDK.component3) : null);
            if (mediationNetwork != null) {
                map2.put(M6.X0, mediationNetwork);
            }
            Map<String, String> mediationNetwork2 = getMediationNetwork(AFb1iSDK.getMonetizationNetwork(this.toString.AFAdRevenueData.getMonetizationNetwork));
            if (mediationNetwork2 != null) {
                map2.put("oaid", mediationNetwork2);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        map2.put("timestamp", simpleDateFormat.format(new Date(currentTimeMillis)));
        map2.put("request_count", Integer.valueOf(this.AFKeystoreWrapper));
        List<AFj1ySDK> list = this.AFInAppEventParameterName;
        ArrayList arrayList = new ArrayList();
        for (AFj1ySDK aFj1ySDK : list) {
            if (aFj1ySDK.component1 == AFj1ySDK.AFa1vSDK.FINISHED) {
                Object obj = aFj1ySDK.AFAdRevenueData.get("referrer");
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 != null) {
                    Object obj2 = aFj1ySDK.AFAdRevenueData.get("source");
                    Intrinsics.checkNotNull(obj2, "");
                    map = MapsKt.mapOf(TuplesKt.to("source", (String) obj2), TuplesKt.to("value", str2));
                    if (map == null) {
                        arrayList.add(map);
                    }
                }
            }
            map = null;
            if (map == null) {
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            map2.put("referrers", arrayList2);
        }
        AFa1pSDK aFa1pSDK = this.component1;
        AFj1kSDK aFj1kSDK = new AFj1kSDK(this.toString, null, 2, null);
        String revenue = ((AFe1kSDK) this).component4.getRevenue();
        Object obj3 = this.component1.getMonetizationNetwork.get("timestamp");
        Intrinsics.checkNotNull(obj3, "");
        aFa1pSDK.component2 = aFj1kSDK.getCurrencyIso4217Code(revenue, (String) obj3);
        AFh1uSDK aFh1uSDK = this.copy;
        int i = this.AFKeystoreWrapper;
        if (i <= 0 || i > 2) {
            AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i))));
        } else {
            int i2 = i - 1;
            aFh1uSDK.component1[i2] = System.currentTimeMillis();
            if (i2 == 0) {
                if (aFh1uSDK.component3 != 0) {
                    aFh1uSDK.AFAdRevenueData.put("from_fg", Long.valueOf(aFh1uSDK.component1[i2] - aFh1uSDK.component3));
                    aFh1uSDK.getRevenue.getRevenue("ddl", new JSONObject(aFh1uSDK.AFAdRevenueData).toString());
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
            }
        }
        AFd1mSDK<AFa1rSDK> mediationNetwork3 = ((AFe1kSDK) this).areAllFieldsValid.getMediationNetwork(this.component1);
        Intrinsics.checkNotNullExpressionValue(mediationNetwork3, "");
        return mediationNetwork3;
    }

    private static Map<String, String> getMediationNetwork(AFb1lSDK aFb1lSDK) {
        String str;
        if (aFb1lSDK == null || (str = aFb1lSDK.getMonetizationNetwork) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        Boolean bool = aFb1lSDK.getCurrencyIso4217Code;
        if (bool == null || !bool.booleanValue()) {
            return MapsKt.mapOf(TuplesKt.to("type", "unhashed"), TuplesKt.to("value", str));
        }
        return null;
    }

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] AFAdRevenueData;
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFe1rSDK.values().length];
            try {
                iArr[AFe1rSDK.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1rSDK.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getRevenue = iArr;
            int[] iArr2 = new int[AFj1ySDK.AFa1vSDK.values().length];
            try {
                iArr2[AFj1ySDK.AFa1vSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AFj1ySDK.AFa1vSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            AFAdRevenueData = iArr2;
        }
    }
}
