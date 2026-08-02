package com.appsflyer.internal;

import android.os.Build;
import androidx.appcompat.widget.c1;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFj1tSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@SourceDebugExtension({"SMAP\nResolveDdlTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResolveDdlTask.kt\ncom/appsflyer/internal/components/queue/tasks/ResolveDdlTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,278:1\n1#2:279\n1#2:290\n1603#3,9:280\n1855#3:289\n1856#3:291\n1612#3:292\n1855#3,2:296\n3792#4:293\n4307#4,2:294\n*S KotlinDebug\n*F\n+ 1 ResolveDdlTask.kt\ncom/appsflyer/internal/components/queue/tasks/ResolveDdlTask\n*L\n104#1:290\n104#1:280,9\n104#1:289\n104#1:291\n104#1:292\n202#1:296,2\n197#1:293\n197#1:294,2\n*E\n"})
/* loaded from: classes.dex */
public final class AFf1xSDK extends AFe1fSDK<AFa1oSDK> {
    private int AFInAppEventParameterName;

    @NotNull
    private final CountDownLatch AFInAppEventType;
    private int AFKeystoreWrapper;

    @NotNull
    private final List<AFj1tSDK> AFLogger;

    @NotNull
    private final AFa1rSDK component2;

    @NotNull
    private final AFh1xSDK copy;

    @NotNull
    private final AFc1oSDK copydefault;

    @NotNull
    private final AFj1sSDK equals;

    @NotNull
    private final AFa1mSDK hashCode;
    private int registerClient;

    @NotNull
    private final AFc1eSDK toString;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] getMonetizationNetwork;
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFe1uSDK.values().length];
            try {
                iArr[AFe1uSDK.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1uSDK.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getRevenue = iArr;
            int[] iArr2 = new int[AFj1tSDK.AFa1tSDK.values().length];
            try {
                iArr2[AFj1tSDK.AFa1tSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AFj1tSDK.AFa1tSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            getMonetizationNetwork = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1xSDK(@NotNull AFa1rSDK aFa1rSDK, @NotNull AFd1zSDK aFd1zSDK) {
        super(AFe1pSDK.DLSDK, new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, "DdlSdk");
        Intrinsics.checkNotNullParameter(aFa1rSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.component2 = aFa1rSDK;
        this.AFInAppEventType = new CountDownLatch(1);
        this.AFLogger = new ArrayList();
        AFc1oSDK AFAdRevenueData = aFd1zSDK.AFAdRevenueData();
        Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
        this.copydefault = AFAdRevenueData;
        AFc1eSDK force = aFd1zSDK.force();
        Intrinsics.checkNotNullExpressionValue(force, "");
        this.toString = force;
        AFa1mSDK i5 = aFd1zSDK.i();
        Intrinsics.checkNotNullExpressionValue(i5, "");
        this.hashCode = i5;
        AFh1xSDK areAllFieldsValid = aFd1zSDK.areAllFieldsValid();
        Intrinsics.checkNotNullExpressionValue(areAllFieldsValid, "");
        this.copy = areAllFieldsValid;
        AFj1sSDK AFLogger = aFd1zSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(AFLogger, "");
        this.equals = AFLogger;
        AFj1tSDK[] aFj1tSDKArr = (AFj1tSDK[]) AFLogger.getRevenue.toArray(new AFj1tSDK[0]);
        Intrinsics.checkNotNullExpressionValue(aFj1tSDKArr, "");
        ArrayList arrayList = new ArrayList();
        for (AFj1tSDK aFj1tSDK : aFj1tSDKArr) {
            if (aFj1tSDK != null && aFj1tSDK.component4 != AFj1tSDK.AFa1tSDK.NOT_STARTED) {
                arrayList.add(aFj1tSDK);
            }
        }
        this.AFInAppEventParameterName = arrayList.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final AFj1tSDK aFj1tSDK2 = (AFj1tSDK) it.next();
            AFj1tSDK.AFa1tSDK aFa1tSDK = aFj1tSDK2.component4;
            int i10 = aFa1tSDK == null ? -1 : AFa1uSDK.getMonetizationNetwork[aFa1tSDK.ordinal()];
            if (i10 == 1) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, aFj1tSDK2.getMediationNetwork.get(AdRevenueConstants.SOURCE_KEY) + " referrer collected earlier", false, 4, null);
                Intrinsics.checkNotNullExpressionValue(aFj1tSDK2, "");
                getCurrencyIso4217Code(aFj1tSDK2);
            } else if (i10 == 2) {
                aFj1tSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.k
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        AFf1xSDK.getRevenue(AFj1tSDK.this, this, observable, obj);
                    }
                });
            }
        }
    }

    private final boolean equals() {
        Object obj = this.component2.AFAdRevenueData.get("referrers");
        List list = obj instanceof List ? (List) obj : null;
        return (list != null ? list.size() : 0) < this.AFInAppEventParameterName && !this.component2.AFAdRevenueData.containsKey("referrers");
    }

    private final void getCurrencyIso4217Code(AFj1tSDK aFj1tSDK) {
        if (getRevenue(aFj1tSDK)) {
            this.AFLogger.add(aFj1tSDK);
            this.AFInAppEventType.countDown();
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Added non-organic ".concat(aFj1tSDK.getClass().getSimpleName()), false, 4, null);
        } else {
            int i5 = this.AFKeystoreWrapper + 1;
            this.AFKeystoreWrapper = i5;
            if (i5 == this.AFInAppEventParameterName) {
                this.AFInAppEventType.countDown();
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return this.hashCode.component2;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener component2() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:5:0x0011, B:9:0x001d, B:11:0x002e, B:12:0x006e, B:17:0x007b, B:19:0x0083, B:20:0x008d, B:23:0x00b6, B:25:0x00c8, B:27:0x00dc, B:29:0x00e0, B:31:0x00e6, B:33:0x00ec, B:35:0x010c, B:36:0x011e, B:38:0x0124, B:40:0x013a, B:42:0x0119, B:43:0x013f, B:45:0x0043, B:46:0x005a), top: B:4:0x0011 }] */
    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFe1uSDK getRevenue() {
        int i5;
        AFe1uSDK aFe1uSDK = AFe1uSDK.FAILURE;
        try {
            AFe1uSDK revenue = super.getRevenue();
            Intrinsics.checkNotNullExpressionValue(revenue, "");
            try {
                AFh1xSDK aFh1xSDK = this.copy;
                int i10 = this.registerClient;
                if (i10 > 0 && i10 <= 2) {
                    int i11 = i10 - 1;
                    aFh1xSDK.component2[i11] = System.currentTimeMillis();
                    long j = aFh1xSDK.component3[i11];
                    if (j != 0) {
                        long[] jArr = aFh1xSDK.component1;
                        jArr[i11] = aFh1xSDK.component2[i11] - j;
                        aFh1xSDK.getMediationNetwork.put("net", jArr);
                    } else {
                        StringBuilder sb2 = new StringBuilder("Metrics: ddlStart[");
                        sb2.append(i11);
                        sb2.append("] ts is missing");
                        AFLogger.afInfoLog(sb2.toString());
                    }
                    i5 = AFa1uSDK.getRevenue[revenue.ordinal()];
                    if (i5 == 1) {
                        if (i5 != 2) {
                            return revenue;
                        }
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
                        ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
                        AFh1ySDK.d$default(aFLogger, aFg1cSDK, "Error occurred. Server response code = " + (responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null), false, 4, null);
                        DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                        this.copy.getCurrencyIso4217Code(deepLinkResult, this.hashCode.component2);
                        this.hashCode.getRevenue(deepLinkResult);
                        return revenue;
                    }
                    ResponseNetwork responseNetwork2 = ((AFe1fSDK) this).areAllFieldsValid;
                    Intrinsics.checkNotNull(responseNetwork2);
                    Object body = responseNetwork2.getBody();
                    Intrinsics.checkNotNullExpressionValue(body, "");
                    AFa1oSDK aFa1oSDK = (AFa1oSDK) body;
                    DeepLink deepLink = aFa1oSDK.getCurrencyIso4217Code;
                    if (deepLink != null) {
                        DeepLinkResult deepLinkResult2 = new DeepLinkResult(deepLink, null);
                        this.copy.getCurrencyIso4217Code(deepLinkResult2, this.hashCode.component2);
                        this.hashCode.getRevenue(deepLinkResult2);
                        return revenue;
                    }
                    if (this.registerClient > 1 || !aFa1oSDK.getAFAdRevenueData() || !equals()) {
                        DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                        this.copy.getCurrencyIso4217Code(deepLinkResult3, this.hashCode.component2);
                        this.hashCode.getRevenue(deepLinkResult3);
                        return revenue;
                    }
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Waiting for referrers...", false, 4, null);
                    this.AFInAppEventType.await();
                    AFh1xSDK aFh1xSDK2 = this.copy;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j6 = aFh1xSDK2.component2[0];
                    if (j6 != 0) {
                        aFh1xSDK2.getMediationNetwork.put("rfr_wait", Long.valueOf(currentTimeMillis - j6));
                    } else {
                        AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                    }
                    if (this.AFKeystoreWrapper != this.AFInAppEventParameterName) {
                        return getRevenue();
                    }
                    DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
                    this.copy.getCurrencyIso4217Code(deepLinkResult4, this.hashCode.component2);
                    this.hashCode.getRevenue(deepLinkResult4);
                    return AFe1uSDK.SUCCESS;
                }
                AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i10))));
                i5 = AFa1uSDK.getRevenue[revenue.ordinal()];
                if (i5 == 1) {
                }
            } catch (Exception e7) {
                e = e7;
                aFe1uSDK = revenue;
                Throwable cause = e.getCause();
                if (cause instanceof InterruptedException ? true : cause instanceof InterruptedIOException) {
                    AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Timeout, didn't manage to find deferred deeplink after " + this.registerClient + " attempt(s) within " + this.hashCode.component2 + " milliseconds", false, 4, null);
                    DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                    this.copy.getCurrencyIso4217Code(deepLinkResult5, this.hashCode.component2);
                    this.hashCode.getRevenue(deepLinkResult5);
                    return AFe1uSDK.TIMEOUT;
                }
                if (cause instanceof IOException) {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                    DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                    this.copy.getCurrencyIso4217Code(deepLinkResult6, this.hashCode.component2);
                    this.hashCode.getRevenue(deepLinkResult6);
                    return aFe1uSDK;
                }
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Unexpected Exception: " + e, false, 4, null);
                DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                this.copy.getCurrencyIso4217Code(deepLinkResult7, this.hashCode.component2);
                this.hashCode.getRevenue(deepLinkResult7);
                return aFe1uSDK;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x014c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100 A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFe1fSDK
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFd1hSDK<AFa1oSDK> AFAdRevenueData(@NotNull String str) {
        Map map;
        String[] strArr;
        Intrinsics.checkNotNullParameter(str, "");
        int i5 = this.registerClient + 1;
        this.registerClient = i5;
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, c1.i(i5, "Preparing request "), false, 4, null);
        Map<String, Object> map2 = this.component2.AFAdRevenueData;
        if (this.registerClient == 1) {
            map2.put("is_first", Boolean.valueOf(this.copydefault.getMediationNetwork.getRevenue("appsFlyerCount", 0) == 0));
            map2.put("lang", Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry());
            map2.put("os", Build.VERSION.RELEASE);
            map2.put("type", Build.MODEL);
            map2.put(CommonUrlParts.REQUEST_ID, AFb1kSDK.getCurrencyIso4217Code(this.copydefault.getMediationNetwork));
            AFb1tSDK aFb1tSDK = this.toString.getRevenue;
            if (aFb1tSDK != null && (strArr = aFb1tSDK.AFAdRevenueData) != null) {
                Intrinsics.checkNotNullExpressionValue(strArr, "");
                map2.put("sharing_filter", strArr);
            }
            AFh1rSDK aFh1rSDK = this.copydefault.getMonetizationNetwork.component3;
            Map<String, String> currencyIso4217Code = getCurrencyIso4217Code(aFh1rSDK != null ? new AFb1jSDK(aFh1rSDK.getMediationNetwork, aFh1rSDK.component2) : null);
            if (currencyIso4217Code != null) {
                map2.put("gaid", currencyIso4217Code);
            }
            Map<String, String> currencyIso4217Code2 = getCurrencyIso4217Code(AFb1lSDK.getMediationNetwork(this.copydefault.getCurrencyIso4217Code.getMonetizationNetwork));
            if (currencyIso4217Code2 != null) {
                map2.put(CommonUrlParts.HUAWEI_OAID, currencyIso4217Code2);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        map2.put("timestamp", simpleDateFormat.format(new Date(currentTimeMillis)));
        map2.put("request_count", Integer.valueOf(this.registerClient));
        List<AFj1tSDK> list = this.AFLogger;
        ArrayList arrayList = new ArrayList();
        for (AFj1tSDK aFj1tSDK : list) {
            if (aFj1tSDK.component4 == AFj1tSDK.AFa1tSDK.FINISHED) {
                Object obj = aFj1tSDK.getMediationNetwork.get("referrer");
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 != null) {
                    Object obj2 = aFj1tSDK.getMediationNetwork.get(AdRevenueConstants.SOURCE_KEY);
                    Intrinsics.checkNotNull(obj2, "");
                    map = n0.e(new Pair(AdRevenueConstants.SOURCE_KEY, (String) obj2), new Pair("value", str2));
                    if (map == null) {
                        arrayList.add(map);
                    }
                }
            }
            map = null;
            if (map == null) {
            }
        }
        if (!arrayList.isEmpty()) {
            map2.put("referrers", arrayList);
        }
        AFa1rSDK aFa1rSDK = this.component2;
        AFj1cSDK aFj1cSDK = new AFj1cSDK(this.copydefault, null, 2, null);
        String mediationNetwork = ((AFe1fSDK) this).component1.getMediationNetwork();
        Object obj3 = this.component2.AFAdRevenueData.get("timestamp");
        Intrinsics.checkNotNull(obj3, "");
        aFa1rSDK.component2 = aFj1cSDK.getMonetizationNetwork(mediationNetwork, (String) obj3);
        AFh1xSDK aFh1xSDK = this.copy;
        int i10 = this.registerClient;
        if (i10 > 0 && i10 <= 2) {
            int i11 = i10 - 1;
            aFh1xSDK.component3[i11] = System.currentTimeMillis();
            if (i11 == 0) {
                long j = aFh1xSDK.component4;
                if (j != 0) {
                    aFh1xSDK.getMediationNetwork.put("from_fg", Long.valueOf(aFh1xSDK.component3[i11] - j));
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
            }
        } else {
            AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i10))));
        }
        AFd1hSDK<AFa1oSDK> monetizationNetwork = ((AFe1fSDK) this).component4.getMonetizationNetwork(this.component2);
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        return monetizationNetwork;
    }

    private static Map<String, String> getCurrencyIso4217Code(AFb1jSDK aFb1jSDK) {
        String str;
        if (aFb1jSDK == null || (str = aFb1jSDK.getRevenue) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        Boolean bool = aFb1jSDK.getCurrencyIso4217Code;
        if (bool == null || !bool.booleanValue()) {
            return n0.e(new Pair("type", "unhashed"), new Pair("value", str));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFj1tSDK aFj1tSDK, AFf1xSDK aFf1xSDK, Observable observable, Object obj) {
        Intrinsics.checkNotNullParameter(aFf1xSDK, "");
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, aFj1tSDK.getMediationNetwork.get(AdRevenueConstants.SOURCE_KEY) + " referrer collected via observer", false, 4, null);
        Intrinsics.checkNotNull(observable, "");
        aFf1xSDK.getCurrencyIso4217Code((AFj1tSDK) observable);
    }

    private static boolean getRevenue(AFj1tSDK aFj1tSDK) {
        Object obj = aFj1tSDK.getMediationNetwork.get("click_ts");
        Long l6 = obj instanceof Long ? (Long) obj : null;
        if (l6 != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l6.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }
}
