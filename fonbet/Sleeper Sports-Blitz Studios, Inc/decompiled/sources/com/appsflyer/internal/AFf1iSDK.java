package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFj1qSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import io.sentry.protocol.OperatingSystem;
import j$.util.DesugarTimeZone;
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
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFf1iSDK extends AFf1pSDK<AFc1oSDK> {
    private final List<AFj1qSDK> AFInAppEventParameterName;
    private int AFInAppEventType;
    private int AFKeystoreWrapper;
    private final AFc1jSDK component3;
    private final AFj1sSDK copy;
    private final AFc1kSDK copydefault;
    private final AFh1sSDK equals;
    private final AFd1tSDK hashCode;
    private final AFd1rSDK toString;
    private final CountDownLatch valueOf;
    private int values;

    @Override // com.appsflyer.internal.AFf1pSDK
    protected final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener component1() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1pSDK, com.appsflyer.internal.AFe1bSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1iSDK(AFc1jSDK aFc1jSDK, AFd1kSDK aFd1kSDK) {
        super(AFf1wSDK.DLSDK, new AFf1wSDK[]{AFf1wSDK.RC_CDN, AFf1wSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, "DdlSdk");
        Intrinsics.checkNotNullParameter(aFc1jSDK, "");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.component3 = aFc1jSDK;
        this.valueOf = new CountDownLatch(1);
        this.AFInAppEventParameterName = new ArrayList();
        AFd1rSDK currencyIso4217Code = aFd1kSDK.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        this.toString = currencyIso4217Code;
        AFd1tSDK e = aFd1kSDK.e();
        Intrinsics.checkNotNullExpressionValue(e, "");
        this.hashCode = e;
        AFc1kSDK d = aFd1kSDK.d();
        Intrinsics.checkNotNullExpressionValue(d, "");
        this.copydefault = d;
        AFh1sSDK component4 = aFd1kSDK.component4();
        Intrinsics.checkNotNullExpressionValue(component4, "");
        this.equals = component4;
        AFj1sSDK copy = aFd1kSDK.copy();
        Intrinsics.checkNotNullExpressionValue(copy, "");
        this.copy = copy;
        AFj1qSDK[] AFAdRevenueData = copy.AFAdRevenueData();
        Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
        ArrayList arrayList = new ArrayList();
        for (AFj1qSDK aFj1qSDK : AFAdRevenueData) {
            AFj1qSDK aFj1qSDK2 = aFj1qSDK;
            if (aFj1qSDK2 != null && aFj1qSDK2.component2 != AFj1qSDK.AFa1vSDK.NOT_STARTED) {
                arrayList.add(aFj1qSDK);
            }
        }
        ArrayList<AFj1qSDK> arrayList2 = arrayList;
        this.AFInAppEventType = arrayList2.size();
        for (final AFj1qSDK aFj1qSDK3 : arrayList2) {
            AFj1qSDK.AFa1vSDK aFa1vSDK = aFj1qSDK3.component2;
            int i = aFa1vSDK == null ? -1 : AFa1tSDK.getRevenue[aFa1vSDK.ordinal()];
            if (i == 1) {
                AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.DDL, aFj1qSDK3.AFAdRevenueData.get("source") + " referrer collected earlier", false, 4, null);
                Intrinsics.checkNotNullExpressionValue(aFj1qSDK3, "");
                getCurrencyIso4217Code(aFj1qSDK3);
            } else if (i == 2) {
                aFj1qSDK3.addObserver(new Observer() { // from class: com.appsflyer.internal.AFf1iSDK$$ExternalSyntheticLambda0
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        AFf1iSDK.getRevenue(AFj1qSDK.this, this, observable, obj);
                    }
                });
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1pSDK, com.appsflyer.internal.AFe1bSDK
    public final AFe1dSDK AFAdRevenueData() {
        AFe1dSDK AFAdRevenueData;
        AFe1dSDK aFe1dSDK = AFe1dSDK.FAILURE;
        try {
            AFAdRevenueData = super.AFAdRevenueData();
            Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
        } catch (Exception e) {
            e = e;
        }
        try {
            AFh1sSDK aFh1sSDK = this.equals;
            int i = this.AFKeystoreWrapper;
            if (i <= 0 || i > 2) {
                AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i))));
            } else {
                int i2 = i - 1;
                aFh1sSDK.component4[i2] = System.currentTimeMillis();
                if (aFh1sSDK.areAllFieldsValid[i2] != 0) {
                    aFh1sSDK.component1[i2] = aFh1sSDK.component4[i2] - aFh1sSDK.areAllFieldsValid[i2];
                    aFh1sSDK.getCurrencyIso4217Code.put("net", aFh1sSDK.component1);
                    aFh1sSDK.getMonetizationNetwork.getMonetizationNetwork("ddl", new JSONObject(aFh1sSDK.getCurrencyIso4217Code).toString());
                } else {
                    StringBuilder sb = new StringBuilder("Metrics: ddlStart[");
                    sb.append(i2);
                    sb.append("] ts is missing");
                    AFLogger.afInfoLog(sb.toString());
                }
            }
            int i3 = AFa1tSDK.getCurrencyIso4217Code[AFAdRevenueData.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    return AFAdRevenueData;
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1xSDK aFh1xSDK = AFh1xSDK.DDL;
                ResponseNetwork responseNetwork = ((AFf1pSDK) this).areAllFieldsValid;
                AFh1wSDK.d$default(aFLogger, aFh1xSDK, "Error occurred. Server response code = " + (responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null), false, 4, null);
                DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                this.equals.getMediationNetwork(deepLinkResult, this.copydefault.component4);
                this.copydefault.getMediationNetwork(deepLinkResult);
                return AFAdRevenueData;
            }
            ResponseNetwork responseNetwork2 = ((AFf1pSDK) this).areAllFieldsValid;
            Intrinsics.checkNotNull(responseNetwork2);
            Object body = responseNetwork2.getBody();
            Intrinsics.checkNotNullExpressionValue(body, "");
            AFc1oSDK aFc1oSDK = (AFc1oSDK) body;
            if (aFc1oSDK.getCurrencyIso4217Code != null) {
                DeepLinkResult deepLinkResult2 = new DeepLinkResult(aFc1oSDK.getCurrencyIso4217Code, null);
                this.equals.getMediationNetwork(deepLinkResult2, this.copydefault.component4);
                this.copydefault.getMediationNetwork(deepLinkResult2);
                return AFAdRevenueData;
            }
            if (this.AFKeystoreWrapper > 1 || !aFc1oSDK.getGetMediationNetwork() || !copy()) {
                DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                this.equals.getMediationNetwork(deepLinkResult3, this.copydefault.component4);
                this.copydefault.getMediationNetwork(deepLinkResult3);
                return AFAdRevenueData;
            }
            AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.DDL, "Waiting for referrers...", false, 4, null);
            this.valueOf.await();
            AFh1sSDK aFh1sSDK2 = this.equals;
            long currentTimeMillis = System.currentTimeMillis();
            if (aFh1sSDK2.component4[0] != 0) {
                aFh1sSDK2.getCurrencyIso4217Code.put("rfr_wait", Long.valueOf(currentTimeMillis - aFh1sSDK2.component4[0]));
                aFh1sSDK2.getMonetizationNetwork.getMonetizationNetwork("ddl", new JSONObject(aFh1sSDK2.getCurrencyIso4217Code).toString());
            } else {
                AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
            }
            if (this.values != this.AFInAppEventType) {
                return AFAdRevenueData();
            }
            DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
            this.equals.getMediationNetwork(deepLinkResult4, this.copydefault.component4);
            this.copydefault.getMediationNetwork(deepLinkResult4);
            return AFe1dSDK.SUCCESS;
        } catch (Exception e2) {
            e = e2;
            aFe1dSDK = AFAdRevenueData;
            Throwable cause = e.getCause();
            if (cause instanceof InterruptedException ? true : cause instanceof InterruptedIOException) {
                AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.DDL, "Timeout, didn't manage to find deferred deeplink after " + this.AFKeystoreWrapper + " attempt(s) within " + this.copydefault.component4 + " milliseconds", false, 4, null);
                DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                this.equals.getMediationNetwork(deepLinkResult5, this.copydefault.component4);
                this.copydefault.getMediationNetwork(deepLinkResult5);
                return AFe1dSDK.TIMEOUT;
            }
            if (cause instanceof IOException) {
                AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                this.equals.getMediationNetwork(deepLinkResult6, this.copydefault.component4);
                this.copydefault.getMediationNetwork(deepLinkResult6);
                return aFe1dSDK;
            }
            AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.DDL, "Unexpected Exception: " + e, false, 4, null);
            DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
            this.equals.getMediationNetwork(deepLinkResult7, this.copydefault.component4);
            this.copydefault.getMediationNetwork(deepLinkResult7);
            return aFe1dSDK;
        }
    }

    private final void getCurrencyIso4217Code(AFj1qSDK aFj1qSDK) {
        if (getMonetizationNetwork(aFj1qSDK)) {
            this.AFInAppEventParameterName.add(aFj1qSDK);
            this.valueOf.countDown();
            AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.DDL, "Added non-organic " + aFj1qSDK.getClass().getSimpleName(), false, 4, null);
            return;
        }
        int i = this.values + 1;
        this.values = i;
        if (i == this.AFInAppEventType) {
            this.valueOf.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFj1qSDK aFj1qSDK, AFf1iSDK aFf1iSDK, Observable observable, Object obj) {
        Intrinsics.checkNotNullParameter(aFf1iSDK, "");
        AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.DDL, aFj1qSDK.AFAdRevenueData.get("source") + " referrer collected via observer", false, 4, null);
        Intrinsics.checkNotNull(observable, "");
        aFf1iSDK.getCurrencyIso4217Code((AFj1qSDK) observable);
    }

    private final boolean copy() {
        Object obj = this.component3.getMonetizationNetwork().get("referrers");
        List list = obj instanceof List ? (List) obj : null;
        return (list != null ? list.size() : 0) < this.AFInAppEventType && !this.component3.getMonetizationNetwork().containsKey("referrers");
    }

    private static boolean getMonetizationNetwork(AFj1qSDK aFj1qSDK) {
        Object obj = aFj1qSDK.AFAdRevenueData.get("click_ts");
        Long l = obj instanceof Long ? (Long) obj : null;
        if (l != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFf1pSDK, com.appsflyer.internal.AFe1bSDK
    public final long getMediationNetwork() {
        return this.copydefault.component4;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011b A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFf1pSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final AFe1rSDK<AFc1oSDK> getMonetizationNetwork(String str) {
        Map map;
        String[] strArr;
        Intrinsics.checkNotNullParameter(str, "");
        this.AFKeystoreWrapper++;
        AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.DDL, "Preparing request " + this.AFKeystoreWrapper, false, 4, null);
        Map<String, Object> monetizationNetwork = this.component3.getMonetizationNetwork();
        if (this.AFKeystoreWrapper == 1) {
            monetizationNetwork.put("is_first", Boolean.valueOf(this.toString.getRevenue.AFAdRevenueData("appsFlyerCount", 0) == 0));
            monetizationNetwork.put("lang", Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry());
            monetizationNetwork.put(OperatingSystem.TYPE, Build.VERSION.RELEASE);
            monetizationNetwork.put("type", Build.MODEL);
            AFd1rSDK aFd1rSDK = this.toString;
            monetizationNetwork.put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, AFb1mSDK.getMediationNetwork(aFd1rSDK.getMonetizationNetwork, aFd1rSDK.getRevenue));
            AFc1aSDK aFc1aSDK = this.hashCode.getMonetizationNetwork;
            if (aFc1aSDK != null && (strArr = aFc1aSDK.getCurrencyIso4217Code) != null) {
                Intrinsics.checkNotNullExpressionValue(strArr, "");
                monetizationNetwork.put("sharing_filter", strArr);
            }
            AFh1pSDK aFh1pSDK = this.toString.AFAdRevenueData.areAllFieldsValid;
            Map<String, String> AFAdRevenueData = AFAdRevenueData(aFh1pSDK != null ? new AFb1tSDK(aFh1pSDK.getMediationNetwork, aFh1pSDK.component1) : null);
            if (AFAdRevenueData != null) {
                monetizationNetwork.put("gaid", AFAdRevenueData);
            }
            Map<String, String> AFAdRevenueData2 = AFAdRevenueData(AFb1uSDK.getCurrencyIso4217Code(this.toString.getMonetizationNetwork.getCurrencyIso4217Code));
            if (AFAdRevenueData2 != null) {
                monetizationNetwork.put("oaid", AFAdRevenueData2);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        monetizationNetwork.put("timestamp", simpleDateFormat.format(new Date(currentTimeMillis)));
        monetizationNetwork.put("request_count", Integer.valueOf(this.AFKeystoreWrapper));
        List<AFj1qSDK> list = this.AFInAppEventParameterName;
        ArrayList arrayList = new ArrayList();
        for (AFj1qSDK aFj1qSDK : list) {
            if (aFj1qSDK.component2 == AFj1qSDK.AFa1vSDK.FINISHED) {
                Object obj = aFj1qSDK.AFAdRevenueData.get("referrer");
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 != null) {
                    Object obj2 = aFj1qSDK.AFAdRevenueData.get("source");
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
            monetizationNetwork.put("referrers", arrayList2);
        }
        AFc1jSDK aFc1jSDK = this.component3;
        AFj1iSDK aFj1iSDK = new AFj1iSDK(this.toString, null, 2, null);
        String str3 = ((AFf1pSDK) this).component4.component2;
        Object obj3 = this.component3.getMonetizationNetwork().get("timestamp");
        Intrinsics.checkNotNull(obj3, "");
        aFc1jSDK.getMonetizationNetwork(aFj1iSDK.getMonetizationNetwork(str3, (String) obj3));
        AFh1sSDK aFh1sSDK = this.equals;
        int i = this.AFKeystoreWrapper;
        if (i <= 0 || i > 2) {
            AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i))));
        } else {
            int i2 = i - 1;
            aFh1sSDK.areAllFieldsValid[i2] = System.currentTimeMillis();
            if (i2 == 0) {
                if (aFh1sSDK.component2 != 0) {
                    aFh1sSDK.getCurrencyIso4217Code.put("from_fg", Long.valueOf(aFh1sSDK.areAllFieldsValid[i2] - aFh1sSDK.component2));
                    aFh1sSDK.getMonetizationNetwork.getMonetizationNetwork("ddl", new JSONObject(aFh1sSDK.getCurrencyIso4217Code).toString());
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
            }
        }
        AFe1qSDK aFe1qSDK = this.component2;
        AFe1rSDK<AFc1oSDK> aFe1rSDK = (AFe1rSDK) AFe1qSDK.getMediationNetwork(new Object[]{aFe1qSDK, this.component3}, -1667700185, 1667700187, System.identityHashCode(aFe1qSDK));
        Intrinsics.checkNotNullExpressionValue(aFe1rSDK, "");
        return aFe1rSDK;
    }

    private static Map<String, String> AFAdRevenueData(AFb1tSDK aFb1tSDK) {
        String str;
        if (aFb1tSDK == null || (str = aFb1tSDK.getMediationNetwork) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        Boolean bool = aFb1tSDK.getMonetizationNetwork;
        if (bool == null || !bool.booleanValue()) {
            return MapsKt.mapOf(TuplesKt.to("type", "unhashed"), TuplesKt.to("value", str));
        }
        return null;
    }

    public /* synthetic */ class AFa1tSDK {
        public static final /* synthetic */ int[] getCurrencyIso4217Code;
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFe1dSDK.values().length];
            try {
                iArr[AFe1dSDK.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1dSDK.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getCurrencyIso4217Code = iArr;
            int[] iArr2 = new int[AFj1qSDK.AFa1vSDK.values().length];
            try {
                iArr2[AFj1qSDK.AFa1vSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AFj1qSDK.AFa1vSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            getRevenue = iArr2;
        }
    }
}
