package com.appsflyer.internal;

import android.net.Uri;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFi1jSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class AFf1nSDK extends AFf1rSDK<AFc1qSDK> {
    private int afDebugLog;

    @NotNull
    private final CountDownLatch afErrorLog;

    @NotNull
    private final AFd1qSDK afInfoLog;

    @NotNull
    private final List<AFi1jSDK> afRDLog;
    private int afVerboseLog;
    private int afWarnLog;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final AFc1kSDK f57430e;

    @NotNull
    private final AFd1sSDK force;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final AFi1iSDK f57431i;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final AFg1cSDK f57432v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final AFc1uSDK f57433w;

    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] AFKeystoreWrapper;
        public static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[AFe1dSDK.values().length];
            iArr[AFe1dSDK.SUCCESS.ordinal()] = 1;
            iArr[AFe1dSDK.FAILURE.ordinal()] = 2;
            values = iArr;
            int[] iArr2 = new int[AFi1jSDK.AFa1tSDK.values().length];
            iArr2[AFi1jSDK.AFa1tSDK.FINISHED.ordinal()] = 1;
            iArr2[AFi1jSDK.AFa1tSDK.STARTED.ordinal()] = 2;
            AFKeystoreWrapper = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1nSDK(@NotNull AFc1kSDK aFc1kSDK, @NotNull AFd1mSDK aFd1mSDK) {
        super(AFf1zSDK.DLSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1mSDK, "DdlSdk");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFd1mSDK, "");
        this.f57430e = aFc1kSDK;
        this.afErrorLog = new CountDownLatch(1);
        this.afRDLog = new ArrayList();
        AFd1sSDK AFInAppEventType = aFd1mSDK.AFInAppEventType();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
        this.force = AFInAppEventType;
        AFd1qSDK afErrorLogForExcManagerOnly = aFd1mSDK.afErrorLogForExcManagerOnly();
        Intrinsics.checkNotNullExpressionValue(afErrorLogForExcManagerOnly, "");
        this.afInfoLog = afErrorLogForExcManagerOnly;
        AFc1uSDK afWarnLog = aFd1mSDK.afWarnLog();
        Intrinsics.checkNotNullExpressionValue(afWarnLog, "");
        this.f57433w = afWarnLog;
        AFg1cSDK AFLogger = aFd1mSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(AFLogger, "");
        this.f57432v = AFLogger;
        AFi1iSDK v11 = aFd1mSDK.v();
        Intrinsics.checkNotNullExpressionValue(v11, "");
        this.f57431i = v11;
        AFi1jSDK[] AFKeystoreWrapper = v11.AFKeystoreWrapper();
        Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
        ArrayList arrayList = new ArrayList();
        for (AFi1jSDK aFi1jSDK : AFKeystoreWrapper) {
            if (aFi1jSDK != null && aFi1jSDK.f57489d != AFi1jSDK.AFa1tSDK.NOT_STARTED) {
                arrayList.add(aFi1jSDK);
            }
        }
        this.afWarnLog = arrayList.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final AFi1jSDK aFi1jSDK2 = (AFi1jSDK) it.next();
            AFi1jSDK.AFa1tSDK aFa1tSDK = aFi1jSDK2.f57489d;
            int i11 = aFa1tSDK == null ? -1 : AFa1ySDK.AFKeystoreWrapper[aFa1tSDK.ordinal()];
            if (i11 == 1) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1gSDK aFg1gSDK = AFg1gSDK.DDL;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(aFi1jSDK2.valueOf.get("source"));
                sb2.append(" referrer collected earlier");
                AFg1hSDK.d$default(aFLogger, aFg1gSDK, sb2.toString(), false, 4, null);
                Intrinsics.checkNotNullExpressionValue(aFi1jSDK2, "");
                values(aFi1jSDK2);
            } else if (i11 == 2) {
                aFi1jSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.m
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        AFf1nSDK.values(AFi1jSDK.this, this, observable, obj);
                    }
                });
            }
        }
    }

    private static Map<String, String> AFKeystoreWrapper(AFa1bSDK aFa1bSDK) {
        String str;
        if (aFa1bSDK == null || (str = aFa1bSDK.AFInAppEventParameterName) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        Boolean bool = aFa1bSDK.AFKeystoreWrapper;
        if (bool == null || !bool.booleanValue()) {
            return U.j(new Pair("type", "unhashed"), new Pair(AppMeasurementSdk.ConditionalUserProperty.VALUE, str));
        }
        return null;
    }

    private final boolean w() {
        Object obj = this.f57430e.valueOf().get("referrers");
        List list = obj instanceof List ? (List) obj : null;
        return (list != null ? list.size() : 0) < this.afWarnLog && !this.f57430e.valueOf().containsKey("referrers");
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1eSDK
    public final long AFInAppEventType() {
        return this.f57433w.registerClient;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener registerClient() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final boolean unregisterClient() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final boolean v() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010f A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFf1rSDK
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final AFe1uSDK<AFc1qSDK> valueOf(@NotNull String str) {
        Map map;
        String[] strArr;
        Intrinsics.checkNotNullParameter(str, "");
        this.afVerboseLog++;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1gSDK aFg1gSDK = AFg1gSDK.DDL;
        StringBuilder sb2 = new StringBuilder("Preparing request ");
        sb2.append(this.afVerboseLog);
        AFg1hSDK.d$default(aFLogger, aFg1gSDK, sb2.toString(), false, 4, null);
        Map<String, Object> valueOf = this.f57430e.valueOf();
        if (this.afVerboseLog == 1) {
            valueOf.put("is_first", Boolean.valueOf(this.force.AFKeystoreWrapper.AFInAppEventParameterName("appsFlyerCount", 0) == 0));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Locale.getDefault().getLanguage());
            sb3.append('-');
            sb3.append(Locale.getDefault().getCountry());
            valueOf.put("lang", sb3.toString());
            valueOf.put("os", Build.VERSION.RELEASE);
            valueOf.put("type", Build.MODEL);
            AFd1sSDK aFd1sSDK = this.force;
            valueOf.put("request_id", AFb1kSDK.AFInAppEventType(aFd1sSDK.AFInAppEventParameterName, aFd1sSDK.AFKeystoreWrapper));
            AFd1ySDK aFd1ySDK = this.afInfoLog.AFInAppEventType;
            if (aFd1ySDK != null && (strArr = aFd1ySDK.AFInAppEventType) != null) {
                Intrinsics.checkNotNullExpressionValue(strArr, "");
                valueOf.put("sharing_filter", strArr);
            }
            AFh1xSDK aFh1xSDK = this.force.valueOf.f57393e;
            Map<String, String> AFKeystoreWrapper = AFKeystoreWrapper(aFh1xSDK != null ? new AFa1bSDK(aFh1xSDK.AFInAppEventType, aFh1xSDK.unregisterClient) : null);
            if (AFKeystoreWrapper != null) {
                valueOf.put("gaid", AFKeystoreWrapper);
            }
            Map<String, String> AFKeystoreWrapper2 = AFKeystoreWrapper(AFb1rSDK.AFInAppEventParameterName(this.force.AFInAppEventParameterName.valueOf));
            if (AFKeystoreWrapper2 != null) {
                valueOf.put("oaid", AFKeystoreWrapper2);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        valueOf.put("timestamp", simpleDateFormat.format(new Date(currentTimeMillis)));
        valueOf.put("request_count", Integer.valueOf(this.afVerboseLog));
        List<AFi1jSDK> list = this.afRDLog;
        ArrayList arrayList = new ArrayList();
        for (AFi1jSDK aFi1jSDK : list) {
            if (aFi1jSDK.f57489d == AFi1jSDK.AFa1tSDK.FINISHED) {
                Object obj = aFi1jSDK.valueOf.get("referrer");
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 != null) {
                    Object obj2 = aFi1jSDK.valueOf.get("source");
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    map = U.j(new Pair("source", (String) obj2), new Pair(AppMeasurementSdk.ConditionalUserProperty.VALUE, str2));
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
            valueOf.put("referrers", arrayList);
        }
        AFc1kSDK aFc1kSDK = this.f57430e;
        AFi1eSDK aFi1eSDK = new AFi1eSDK(this.force, null, 2, null);
        String str3 = ((AFf1rSDK) this).registerClient.registerClient;
        Object obj3 = this.f57430e.valueOf().get("timestamp");
        if (obj3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        String str4 = (String) obj3;
        String packageName = aFi1eSDK.AFKeystoreWrapper.AFInAppEventParameterName.valueOf.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String AFLogger = aFi1eSDK.AFKeystoreWrapper.AFLogger();
        if (AFLogger != null && !kotlin.text.h.K(AFLogger)) {
            AFLogger = "-".concat(String.valueOf(kotlin.text.h.z0(AFLogger).toString()));
        }
        if (AFLogger == null) {
            AFLogger = "";
        }
        String obj4 = kotlin.text.h.z0(AFLogger).toString();
        Uri.Builder buildUpon = Uri.parse(aFi1eSDK.AFInAppEventType.AFInAppEventType("https://%sdlsdk.%s/v1.0/android/")).buildUpon();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(packageName);
        sb4.append(obj4);
        Uri.Builder appendPath = buildUpon.appendPath(sb4.toString());
        Intrinsics.checkNotNullExpressionValue(appendPath, "");
        String obj5 = AFi1eSDK.AFInAppEventParameterName(appendPath, str3, str4).appendQueryParameter("sdk_version", AFb1tSDK.values).build().toString();
        Intrinsics.checkNotNullExpressionValue(obj5, "");
        aFc1kSDK.AFInAppEventParameterName(obj5);
        AFg1cSDK aFg1cSDK = this.f57432v;
        int i11 = this.afVerboseLog;
        if (i11 <= 0 || i11 > 2) {
            AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i11))));
        } else {
            int i12 = i11 - 1;
            aFg1cSDK.AFLogger[i12] = System.currentTimeMillis();
            if (i12 == 0) {
                long j11 = aFg1cSDK.f57459d;
                if (j11 != 0) {
                    aFg1cSDK.AFKeystoreWrapper.put("from_fg", Long.valueOf(aFg1cSDK.AFLogger[i12] - j11));
                    aFg1cSDK.AFInAppEventType.valueOf("ddl", new JSONObject(aFg1cSDK.AFKeystoreWrapper).toString());
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
            }
        }
        AFe1uSDK<AFc1qSDK> AFKeystoreWrapper3 = ((AFf1rSDK) this).f57438d.AFKeystoreWrapper(this.f57430e);
        Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper3, "");
        return AFKeystoreWrapper3;
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1eSDK
    @NotNull
    public final AFe1dSDK values() {
        AFe1dSDK aFe1dSDK = AFe1dSDK.FAILURE;
        try {
            AFe1dSDK values = super.values();
            Intrinsics.checkNotNullExpressionValue(values, "");
            try {
                AFg1cSDK aFg1cSDK = this.f57432v;
                int i11 = this.afVerboseLog;
                if (i11 <= 0 || i11 > 2) {
                    AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i11))));
                } else {
                    int i12 = i11 - 1;
                    aFg1cSDK.unregisterClient[i12] = System.currentTimeMillis();
                    long j11 = aFg1cSDK.AFLogger[i12];
                    if (j11 != 0) {
                        long[] jArr = aFg1cSDK.f57460e;
                        jArr[i12] = aFg1cSDK.unregisterClient[i12] - j11;
                        aFg1cSDK.AFKeystoreWrapper.put("net", jArr);
                        aFg1cSDK.AFInAppEventType.valueOf("ddl", new JSONObject(aFg1cSDK.AFKeystoreWrapper).toString());
                    } else {
                        StringBuilder sb2 = new StringBuilder("Metrics: ddlStart[");
                        sb2.append(i12);
                        sb2.append("] ts is missing");
                        AFLogger.afInfoLog(sb2.toString());
                    }
                }
                int i13 = AFa1ySDK.values[values.ordinal()];
                if (i13 != 1) {
                    if (i13 != 2) {
                        return values;
                    }
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1gSDK aFg1gSDK = AFg1gSDK.DDL;
                    StringBuilder sb3 = new StringBuilder("Error occurred. Server response code = ");
                    ResponseNetwork responseNetwork = this.AFLogger;
                    sb3.append(responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null);
                    AFg1hSDK.d$default(aFLogger, aFg1gSDK, sb3.toString(), false, 4, null);
                    DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                    this.f57432v.valueOf(deepLinkResult, this.f57433w.registerClient);
                    this.f57433w.valueOf(deepLinkResult);
                    return values;
                }
                ResponseNetwork responseNetwork2 = this.AFLogger;
                Intrinsics.f(responseNetwork2);
                Object body = responseNetwork2.getBody();
                Intrinsics.checkNotNullExpressionValue(body, "");
                AFc1qSDK aFc1qSDK = (AFc1qSDK) body;
                DeepLink deepLink = aFc1qSDK.values;
                if (deepLink != null) {
                    DeepLinkResult deepLinkResult2 = new DeepLinkResult(deepLink, null);
                    this.f57432v.valueOf(deepLinkResult2, this.f57433w.registerClient);
                    this.f57433w.valueOf(deepLinkResult2);
                    return values;
                }
                if (this.afVerboseLog > 1 || !aFc1qSDK.getAFKeystoreWrapper() || !w()) {
                    DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                    this.f57432v.valueOf(deepLinkResult3, this.f57433w.registerClient);
                    this.f57433w.valueOf(deepLinkResult3);
                    return values;
                }
                AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1gSDK.DDL, "Waiting for referrers...", false, 4, null);
                this.afErrorLog.await();
                AFg1cSDK aFg1cSDK2 = this.f57432v;
                long currentTimeMillis = System.currentTimeMillis();
                long j12 = aFg1cSDK2.unregisterClient[0];
                if (j12 != 0) {
                    aFg1cSDK2.AFKeystoreWrapper.put("rfr_wait", Long.valueOf(currentTimeMillis - j12));
                    aFg1cSDK2.AFInAppEventType.valueOf("ddl", new JSONObject(aFg1cSDK2.AFKeystoreWrapper).toString());
                } else {
                    AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                }
                if (this.afDebugLog != this.afWarnLog) {
                    return values();
                }
                DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
                this.f57432v.valueOf(deepLinkResult4, this.f57433w.registerClient);
                this.f57433w.valueOf(deepLinkResult4);
                return AFe1dSDK.SUCCESS;
            } catch (Exception e11) {
                e = e11;
                aFe1dSDK = values;
                Throwable cause = e.getCause();
                if (!(cause instanceof InterruptedException ? true : cause instanceof InterruptedIOException)) {
                    if (cause instanceof IOException) {
                        AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1gSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                        DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                        this.f57432v.valueOf(deepLinkResult5, this.f57433w.registerClient);
                        this.f57433w.valueOf(deepLinkResult5);
                        return aFe1dSDK;
                    }
                    AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1gSDK.DDL, "Unexpected Exception: ".concat(String.valueOf(e)), false, 4, null);
                    DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                    this.f57432v.valueOf(deepLinkResult6, this.f57433w.registerClient);
                    this.f57433w.valueOf(deepLinkResult6);
                    return aFe1dSDK;
                }
                AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                AFg1gSDK aFg1gSDK2 = AFg1gSDK.DDL;
                StringBuilder sb4 = new StringBuilder("Timeout, didn't manage to find deferred deeplink after ");
                sb4.append(this.afVerboseLog);
                sb4.append(" attempt(s) within ");
                sb4.append(this.f57433w.registerClient);
                sb4.append(" milliseconds");
                AFg1hSDK.d$default(aFLogger2, aFg1gSDK2, sb4.toString(), false, 4, null);
                DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                this.f57432v.valueOf(deepLinkResult7, this.f57433w.registerClient);
                this.f57433w.valueOf(deepLinkResult7);
                return AFe1dSDK.TIMEOUT;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    private static boolean AFInAppEventParameterName(AFi1jSDK aFi1jSDK) {
        Object obj = aFi1jSDK.valueOf.get("click_ts");
        Long l11 = obj instanceof Long ? (Long) obj : null;
        if (l11 != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l11.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }

    private final void values(AFi1jSDK aFi1jSDK) {
        if (AFInAppEventParameterName(aFi1jSDK)) {
            this.afRDLog.add(aFi1jSDK);
            this.afErrorLog.countDown();
            AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1gSDK.DDL, "Added non-organic ".concat(aFi1jSDK.getClass().getSimpleName()), false, 4, null);
        } else {
            int i11 = this.afDebugLog + 1;
            this.afDebugLog = i11;
            if (i11 == this.afWarnLog) {
                this.afErrorLog.countDown();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(AFi1jSDK aFi1jSDK, AFf1nSDK aFf1nSDK, Observable observable, Object obj) {
        Intrinsics.checkNotNullParameter(aFf1nSDK, "");
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1gSDK aFg1gSDK = AFg1gSDK.DDL;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aFi1jSDK.valueOf.get("source"));
        sb2.append(" referrer collected via observer");
        AFg1hSDK.d$default(aFLogger, aFg1gSDK, sb2.toString(), false, 4, null);
        if (observable == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.appsflyer.internal.referrer.Referrer");
        }
        aFf1nSDK.values((AFi1jSDK) observable);
    }
}
