package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.appsflyer.share.deeplink.DeepLink;
import com.appsflyer.share.deeplink.DeepLinkResult;
import com.appsflyer.share.network.http.ResponseNetwork;
import com.ironsource.L6;
import com.ironsource.U3;
import defpackage.ljg;
import defpackage.tub;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFe1jSDK extends AFe1oSDK<AFa1lSDK> {

    @NotNull
    private final AFc1gSDK AFLoggerLogLevel;

    @NotNull
    private final List<Referrer> AppsFlyerLib;
    private int afDebugLog;

    @NotNull
    private final AFi1lSDK afErrorLog;

    @NotNull
    private final AFg1fSDK afInfoLog;

    @NotNull
    private final AFa1mSDK afWarnLog;

    @NotNull
    private final AFc1hSDK e;

    @NotNull
    private final CountDownLatch getEntries;
    private int getLevel;

    @NotNull
    private final AFa1rSDK i;
    private int valueOf;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] unregisterClient;

        static {
            int[] iArr = new int[AFd1bSDK.values().length];
            try {
                iArr[AFd1bSDK.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFd1bSDK.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            d = iArr;
            int[] iArr2 = new int[Referrer.State.values().length];
            try {
                iArr2[Referrer.State.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Referrer.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            unregisterClient = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1jSDK(@NotNull AFc1aSDK aFc1aSDK) {
        super(AFd1aSDK.v, new AFd1aSDK[]{AFd1aSDK.registerClient, AFd1aSDK.AFKeystoreWrapper}, aFc1aSDK, "DdlSdk");
        aFc1aSDK.getClass();
        this.i = new AFa1rSDK();
        AFc1hSDK AFKeystoreWrapper = aFc1aSDK.AFKeystoreWrapper();
        AFKeystoreWrapper.getClass();
        this.e = AFKeystoreWrapper;
        AFc1gSDK imeiData = aFc1aSDK.setImeiData();
        imeiData.getClass();
        this.AFLoggerLogLevel = imeiData;
        AFa1mSDK onPause = aFc1aSDK.onPause();
        onPause.getClass();
        this.afWarnLog = onPause;
        AFg1fSDK force = aFc1aSDK.force();
        force.getClass();
        this.afInfoLog = force;
        AFi1lSDK afDebugLog = aFc1aSDK.afDebugLog();
        afDebugLog.getClass();
        this.afErrorLog = afDebugLog;
        this.getEntries = new CountDownLatch(1);
        this.AppsFlyerLib = new ArrayList();
        int i = 0;
        Referrer[] referrerArr = (Referrer[]) afDebugLog.unregisterClient.toArray(new Referrer[0]);
        referrerArr.getClass();
        ArrayList arrayList = new ArrayList();
        for (Referrer referrer : referrerArr) {
            if (referrer != null && referrer.getState() != Referrer.State.NOT_STARTED) {
                arrayList.add(referrer);
            }
        }
        this.getLevel = arrayList.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Referrer referrer2 = (Referrer) it.next();
            int i2 = AFa1uSDK.unregisterClient[referrer2.getState().ordinal()];
            if (i2 == 1) {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.DDL, referrer2.map.get("source") + " referrer collected earlier", false, 4, null);
                registerClient(referrer2);
            } else if (i2 == 2) {
                referrer2.setAdditionalReferrerDataCollectionFinishedCallback(new n(i, referrer2, this));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFKeystoreWrapper(Referrer referrer, AFe1jSDK aFe1jSDK) {
        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.DDL, referrer.map.get("source") + " referrer collected via callback", false, 4, null);
        aFe1jSDK.registerClient(referrer);
    }

    private final void registerClient(Referrer referrer) {
        if (unregisterClient(referrer)) {
            this.AppsFlyerLib.add(referrer);
            this.getEntries.countDown();
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.DDL, "Added non-organic ".concat(referrer.getClass().getSimpleName()), false, 4, null);
        } else {
            int i = this.valueOf + 1;
            this.valueOf = i;
            if (i == this.getLevel) {
                this.getEntries.countDown();
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener AFLoggerLogLevel() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    public final boolean afInfoLog() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f6 A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFe1oSDK
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFd1qSDK<AFa1lSDK> d(@NotNull String str) {
        Map map;
        String[] strArr;
        str.getClass();
        int i = this.afDebugLog + 1;
        this.afDebugLog = i;
        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.DDL, ljg.j(i, "Preparing request "), false, 4, null);
        Map<String, Object> map2 = this.i.AFKeystoreWrapper;
        if (this.afDebugLog == 1) {
            map2.put("is_first", Boolean.valueOf(this.e.AFKeystoreWrapper.d("appsFlyerCount", 0) == 0));
            Locale locale = Locale.getDefault();
            map2.put(L6.q, locale.getLanguage() + "-" + locale.getCountry());
            map2.put(L6.F, Build.VERSION.RELEASE);
            map2.put("type", Build.MODEL);
            map2.put("request_id", AFb1mSDK.unregisterClient(this.e.AFKeystoreWrapper));
            AFb1qSDK aFb1qSDK = this.AFLoggerLogLevel.registerClient;
            if (aFb1qSDK != null && (strArr = aFb1qSDK.AFKeystoreWrapper) != null) {
                map2.put("sharing_filter", strArr);
            }
            AFg1cSDK aFg1cSDK = this.e.unregisterClient.getInstance;
            Map<String, String> unregisterClient = unregisterClient(aFg1cSDK != null ? new AFb1kSDK(aFg1cSDK.d, aFg1cSDK.unregisterClient) : null);
            if (unregisterClient != null) {
                map2.put(L6.X0, unregisterClient);
            }
            Map<String, String> unregisterClient2 = unregisterClient(AFb1jSDK.d(this.e.registerClient.d));
            if (unregisterClient2 != null) {
                map2.put("oaid", unregisterClient2);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        map2.put("timestamp", simpleDateFormat.format(new Date(currentTimeMillis)));
        map2.put("request_count", Integer.valueOf(this.afDebugLog));
        List<Referrer> list = this.AppsFlyerLib;
        ArrayList arrayList = new ArrayList();
        for (Referrer referrer : list) {
            if (referrer.getState() == Referrer.State.FINISHED) {
                Object obj = referrer.map.get(Payload.RFR);
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 != null) {
                    Object obj2 = referrer.map.get("source");
                    obj2.getClass();
                    map = tub.h(new Pair("source", (String) obj2), new Pair(U3.i.X, str2));
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
            map2.put(Payload.RFRS, arrayList);
        }
        AFa1rSDK aFa1rSDK = this.i;
        AFj1ySDK aFj1ySDK = new AFj1ySDK(this.e);
        AFf1oSDK aFf1oSDK = this.force;
        String str3 = (String) AFf1oSDK.AFLogger(new Object[]{aFf1oSDK}, 343398987, -343398985, System.identityHashCode(aFf1oSDK));
        Object obj3 = this.i.AFKeystoreWrapper.get("timestamp");
        obj3.getClass();
        aFa1rSDK.w = aFj1ySDK.AFLogger(str3, (String) obj3);
        AFg1fSDK aFg1fSDK = this.afInfoLog;
        int i2 = this.afDebugLog;
        if (i2 <= 0 || i2 > 2) {
            AFLogger.INSTANCE.e(LogTag.DDL, "Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i2))), false, false);
        } else {
            int i3 = i2 - 1;
            aFg1fSDK.i[i3] = System.currentTimeMillis();
            if (i3 == 0) {
                long j = aFg1fSDK.w;
                if (j != 0) {
                    aFg1fSDK.unregisterClient.put("from_fg", Long.valueOf(aFg1fSDK.i[i3] - j));
                } else {
                    AFLogger.INSTANCE.i(LogTag.GENERAL, "Metrics: fg ts is missing");
                }
            }
        }
        AFd1qSDK<AFa1lSDK> registerClient = ((AFe1oSDK) this).registerClient.registerClient(this.i);
        registerClient.getClass();
        return registerClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bd A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:3:0x0009, B:7:0x001a, B:9:0x002b, B:10:0x0075, B:15:0x0082, B:17:0x008a, B:18:0x0094, B:21:0x00bd, B:23:0x00cf, B:25:0x00e3, B:27:0x00e7, B:29:0x00eb, B:31:0x00f7, B:34:0x00fe, B:35:0x0104, B:37:0x0108, B:39:0x0112, B:41:0x0131, B:42:0x0145, B:44:0x014b, B:46:0x0161, B:48:0x013e, B:51:0x0166, B:53:0x003f, B:54:0x005a), top: B:2:0x0009 }] */
    @Override // com.appsflyer.internal.AFe1oSDK, com.appsflyer.internal.AFe1vSDK
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFd1bSDK unregisterClient() {
        int i;
        AFd1bSDK aFd1bSDK = AFd1bSDK.FAILURE;
        try {
            AFd1bSDK unregisterClient = super.unregisterClient();
            AFg1fSDK aFg1fSDK = this.afInfoLog;
            int i2 = this.afDebugLog;
            if (i2 > 0 && i2 <= 2) {
                int i3 = i2 - 1;
                aFg1fSDK.v[i3] = System.currentTimeMillis();
                long j = aFg1fSDK.i[i3];
                if (j != 0) {
                    long[] jArr = aFg1fSDK.force;
                    jArr[i3] = aFg1fSDK.v[i3] - j;
                    aFg1fSDK.unregisterClient.put("net", jArr);
                } else {
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    LogTag logTag = LogTag.GENERAL;
                    StringBuilder sb = new StringBuilder("Metrics: ddlStart[");
                    sb.append(i3);
                    sb.append("] ts is missing");
                    aFLogger.i(logTag, sb.toString());
                }
                i = AFa1uSDK.d[unregisterClient.ordinal()];
                if (i == 1) {
                    if (i != 2) {
                        return unregisterClient;
                    }
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    LogTag logTag2 = LogTag.DDL;
                    ResponseNetwork responseNetwork = ((AFe1oSDK) this).w;
                    AFLoggerBase.d$default(aFLogger2, logTag2, "Error occurred. Server response code = " + (responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null), false, 4, null);
                    DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                    this.afInfoLog.unregisterClient(deepLinkResult, this.afWarnLog.AFKeystoreWrapper);
                    this.afWarnLog.registerClient(deepLinkResult);
                    return unregisterClient;
                }
                ResponseNetwork responseNetwork2 = ((AFe1oSDK) this).w;
                responseNetwork2.getClass();
                Object body = responseNetwork2.getBody();
                body.getClass();
                AFa1lSDK aFa1lSDK = (AFa1lSDK) body;
                DeepLink deepLink = aFa1lSDK.d;
                if (deepLink != null) {
                    DeepLinkResult deepLinkResult2 = new DeepLinkResult(deepLink, null);
                    this.afInfoLog.unregisterClient(deepLinkResult2, this.afWarnLog.AFKeystoreWrapper);
                    this.afWarnLog.registerClient(deepLinkResult2);
                    return unregisterClient;
                }
                if (this.afDebugLog <= 1 && aFa1lSDK.unregisterClient) {
                    Object obj = this.i.AFKeystoreWrapper.get(Payload.RFRS);
                    List list = obj instanceof List ? (List) obj : null;
                    if ((list != null ? list.size() : 0) < this.getLevel && !this.i.AFKeystoreWrapper.containsKey(Payload.RFRS)) {
                        AFLogger aFLogger3 = AFLogger.INSTANCE;
                        AFLoggerBase.d$default(aFLogger3, LogTag.DDL, "Waiting for referrers...", false, 4, null);
                        this.getEntries.await();
                        AFg1fSDK aFg1fSDK2 = this.afInfoLog;
                        long currentTimeMillis = System.currentTimeMillis();
                        long j2 = aFg1fSDK2.v[0];
                        if (j2 != 0) {
                            aFg1fSDK2.unregisterClient.put("rfr_wait", Long.valueOf(currentTimeMillis - j2));
                        } else {
                            aFLogger3.i(LogTag.GENERAL, "Metrics: ddlEnd[0] ts is missing");
                        }
                        if (this.valueOf != this.getLevel) {
                            return unregisterClient();
                        }
                        DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                        this.afInfoLog.unregisterClient(deepLinkResult3, this.afWarnLog.AFKeystoreWrapper);
                        this.afWarnLog.registerClient(deepLinkResult3);
                        return AFd1bSDK.SUCCESS;
                    }
                }
                DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
                this.afInfoLog.unregisterClient(deepLinkResult4, this.afWarnLog.AFKeystoreWrapper);
                this.afWarnLog.registerClient(deepLinkResult4);
                return unregisterClient;
            }
            AFLogger.INSTANCE.e(LogTag.DDL, "Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i2))), false, false);
            i = AFa1uSDK.d[unregisterClient.ordinal()];
            if (i == 1) {
            }
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if ((cause instanceof InterruptedException) || (cause instanceof InterruptedIOException)) {
                AFLogger aFLogger4 = AFLogger.INSTANCE;
                LogTag logTag3 = LogTag.DDL;
                AFLoggerBase.e$default(aFLogger4, logTag3, "[DDL] Timeout", new TimeoutException(), false, false, false, false, 96, null);
                AFLoggerBase.d$default(aFLogger4, logTag3, "Timeout, didn't manage to find deferred deeplink after " + this.afDebugLog + " attempt(s) within " + this.afWarnLog.AFKeystoreWrapper + " milliseconds", false, 4, null);
                DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                this.afInfoLog.unregisterClient(deepLinkResult5, this.afWarnLog.AFKeystoreWrapper);
                this.afWarnLog.registerClient(deepLinkResult5);
                return AFd1bSDK.TIMEOUT;
            }
            if (cause instanceof IOException) {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                this.afInfoLog.unregisterClient(deepLinkResult6, this.afWarnLog.AFKeystoreWrapper);
                this.afWarnLog.registerClient(deepLinkResult6);
                return aFd1bSDK;
            }
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.DDL, "Unexpected Exception: " + e, false, 4, null);
            DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
            this.afInfoLog.unregisterClient(deepLinkResult7, this.afWarnLog.AFKeystoreWrapper);
            this.afWarnLog.registerClient(deepLinkResult7);
            return aFd1bSDK;
        }
    }

    @Override // com.appsflyer.internal.AFe1oSDK, com.appsflyer.internal.AFe1vSDK
    public final long registerClient() {
        return this.afWarnLog.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFe1oSDK, com.appsflyer.internal.AFe1vSDK
    public final boolean d() {
        return false;
    }

    private static boolean unregisterClient(Referrer referrer) {
        Object obj = referrer.map.get(Payload.CLICK_TS);
        Long l = obj instanceof Long ? (Long) obj : null;
        if (l != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l.longValue()) < 86400000) {
                return true;
            }
        }
        return false;
    }

    private static Map<String, String> unregisterClient(AFb1kSDK aFb1kSDK) {
        String str;
        if (aFb1kSDK == null || (str = aFb1kSDK.registerClient) == null) {
            return null;
        }
        Boolean bool = aFb1kSDK.AFKeystoreWrapper;
        if (bool == null || !bool.booleanValue()) {
            return tub.h(new Pair("type", "unhashed"), new Pair(U3.i.X, str));
        }
        return null;
    }
}
