package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFe1ySDK.AnonymousClass1;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.share.AppsFlyerConversionListener;
import com.appsflyer.share.network.http.ResponseNetwork;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFf1wSDK extends AFe1fSDK {

    @NonNull
    private final AFi1lSDK AFLoggerLogLevel;

    @NonNull
    private final AFa1kSDK AppsFlyerLib;
    public Map<String, Object> afDebugLog;

    @NonNull
    private final AFg1fSDK afErrorLog;

    @NonNull
    private final AFd1zSDK<AppsFlyerConversionListener> afInfoLog;

    @Nullable
    private final AFg1aSDK enableTCFDataCollection;

    @NonNull
    private final AFf1uSDK getEntries;

    @NonNull
    private final AFf1cSDK getLevel;

    @NonNull
    private final AFc1gSDK valueOf;

    @NonNull
    private final AFe1ySDK values;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.appsflyer.internal.AFf1wSDK$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[Referrer.State.values().length];
            AFKeystoreWrapper = iArr;
            try {
                iArr[Referrer.State.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFKeystoreWrapper[Referrer.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFf1wSDK(@NonNull AFh1zSDK aFh1zSDK, @NonNull AFc1aSDK aFc1aSDK) {
        super(aFh1zSDK, aFc1aSDK);
        Objects.requireNonNull(aFc1aSDK);
        this.afInfoLog = new AFd1zSDK<>(new e(aFc1aSDK, 2));
        this.AFLoggerLogLevel = aFc1aSDK.afDebugLog();
        this.afErrorLog = aFc1aSDK.force();
        this.getEntries = aFc1aSDK.w();
        this.AppsFlyerLib = aFc1aSDK.getOutOfStore();
        this.valueOf = aFc1aSDK.setImeiData();
        this.enableTCFDataCollection = aFc1aSDK.setAppInviteOneLink();
        this.values = aFc1aSDK.afWarnLog();
        this.getLevel = aFc1aSDK.v();
        this.AFLogger.add(AFd1aSDK.e);
        this.AFLogger.add(AFd1aSDK.v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit afErrorLog() {
        this.getLevel.AFLogger(new AFh1vSDK());
        return Unit.a;
    }

    @Override // com.appsflyer.internal.AFe1oSDK, com.appsflyer.internal.AFe1vSDK
    public final void AFLogger() {
        super.AFLogger();
        AFd1bSDK aFd1bSDK = this.AFKeystoreWrapper;
        AFd1bSDK aFd1bSDK2 = AFd1bSDK.SUCCESS;
        if (aFd1bSDK == aFd1bSDK2) {
            this.valueOf.enableTCFDataCollection = System.currentTimeMillis();
        }
        AFg1fSDK aFg1fSDK = this.afErrorLog;
        if (aFg1fSDK.d.AFKeystoreWrapper.d("appsFlyerCount", 0) == 1) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = aFg1fSDK.afInfoLog;
            if (j != 0) {
                aFg1fSDK.registerClient.put("net", Long.valueOf(currentTimeMillis - j));
                aFg1fSDK.AFLogger.d("first_launch", new JSONObject(aFg1fSDK.registerClient).toString());
            } else {
                AFLogger.INSTANCE.i(LogTag.GENERAL, "Metrics collection skipped: launch start timestamp not recorded");
            }
        }
        AppsFlyerConversionListener appsFlyerConversionListener = (AppsFlyerConversionListener) this.afInfoLog.unregisterClient.invoke();
        if (appsFlyerConversionListener != null && (this.AFKeystoreWrapper == aFd1bSDK2 || AFKeystoreWrapper() == 1)) {
            AFg1sSDK aFg1sSDK = new AFg1sSDK(this, ((AFe1fSDK) this).i, ((AFe1fSDK) this).e, appsFlyerConversionListener);
            AFe1ySDK aFe1ySDK = this.values;
            aFe1ySDK.unregisterClient.execute(aFe1ySDK.new AnonymousClass1(aFg1sSDK));
        }
        AFg1aSDK aFg1aSDK = this.enableTCFDataCollection;
        if (aFg1aSDK != null) {
            aFg1aSDK.registerClient(this, new e(this, 3));
        }
    }

    @Override // com.appsflyer.internal.AFe1oSDK, com.appsflyer.internal.AFe1vSDK
    public final boolean d() {
        if (!super.d()) {
            ResponseNetwork responseNetwork = ((AFe1oSDK) this).w;
            boolean z = this.AFKeystoreWrapper == AFd1bSDK.FAILURE && responseNetwork != null && responseNetwork.getStatusCode() / 500 == 1;
            AFe1zSDK aFe1zSDK = this.d;
            boolean z2 = aFe1zSDK == AFd1aSDK.unregisterClient || aFe1zSDK == AFd1aSDK.force;
            if (!z || !z2) {
                return false;
            }
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final void registerClient(AFh1zSDK aFh1zSDK) {
        AFg1aSDK aFg1aSDK;
        AFg1aSDK aFg1aSDK2;
        super.registerClient(aFh1zSDK);
        int i = aFh1zSDK.afErrorLog;
        AFg1fSDK aFg1fSDK = this.afErrorLog;
        if (aFg1fSDK.d.AFKeystoreWrapper.d("appsFlyerCount", 0) == 1) {
            long currentTimeMillis = System.currentTimeMillis();
            aFg1fSDK.afInfoLog = currentTimeMillis;
            long j = aFg1fSDK.w;
            if (j != 0) {
                aFg1fSDK.registerClient.put("from_fg", Long.valueOf(currentTimeMillis - j));
                aFg1fSDK.AFLogger.d("first_launch", new JSONObject(aFg1fSDK.registerClient).toString());
            } else {
                AFLogger.INSTANCE.i(LogTag.GENERAL, "Metrics: fg ts is missing");
            }
        }
        Map map = (Map) aFh1zSDK.AFKeystoreWrapper.get("meta");
        if (map == null) {
            map = new HashMap();
            aFh1zSDK.AFKeystoreWrapper.put("meta", map);
        }
        Map<String, ?> registerClient = this.AppsFlyerLib.registerClient();
        if (!registerClient.isEmpty()) {
            aFh1zSDK.AFLogger(registerClient);
        }
        AFh1kSDK AFLogger = this.getEntries.AFLogger();
        if (AFLogger != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("cdn_token", AFLogger.d);
            String str = AFLogger.unregisterClient;
            if (str != null) {
                hashMap.put("c_ver", str);
            }
            long j2 = AFLogger.AFLogger;
            if (j2 > 0) {
                hashMap.put(Payload.LATENCY, Long.valueOf(j2));
            }
            long j3 = AFLogger.AFKeystoreWrapper;
            if (j3 > 0) {
                hashMap.put("delay", Long.valueOf(j3));
            }
            int i2 = AFLogger.registerClient;
            if (i2 > 0) {
                hashMap.put("res_code", Integer.valueOf(i2));
            }
            Throwable th = AFLogger.i;
            if (th != null) {
                StringBuilder sb = new StringBuilder(th.getClass().getSimpleName());
                sb.append(": ");
                sb.append(AFLogger.i.getMessage());
                hashMap.put("error", sb.toString());
            }
            AFh1nSDK aFh1nSDK = AFLogger.force;
            if (aFh1nSDK != null) {
                hashMap.put("sig", aFh1nSDK.toString());
            }
            String str2 = AFLogger.w;
            if (str2 != null) {
                hashMap.put("cdn_cache_status", str2);
            }
            map.put(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT, hashMap);
        }
        this.afWarnLog.d(aFh1zSDK.AFKeystoreWrapper);
        if (i == 1) {
            AFg1fSDK aFg1fSDK2 = this.afErrorLog;
            HashMap hashMap2 = new HashMap(aFg1fSDK2.unregisterClient);
            aFg1fSDK2.unregisterClient.clear();
            if (!hashMap2.isEmpty()) {
                map.put("ddl", hashMap2);
            }
            HashMap hashMap3 = new HashMap(this.afErrorLog.registerClient);
            if (!hashMap3.isEmpty()) {
                map.put("first_launch", hashMap3);
            }
            AFg1aSDK aFg1aSDK3 = this.enableTCFDataCollection;
            if (aFg1aSDK3 != null) {
                aFg1aSDK3.AFLogger(aFh1zSDK);
            }
        } else if (i == 2) {
            AFg1fSDK aFg1fSDK3 = this.afErrorLog;
            aFg1fSDK3.AFLogger.AFLogger("first_launch");
            HashMap hashMap4 = new HashMap(aFg1fSDK3.registerClient);
            if (!hashMap4.isEmpty()) {
                map.put("first_launch", hashMap4);
            }
            if ((aFh1zSDK instanceof AFh1vSDK) && (aFg1aSDK2 = this.enableTCFDataCollection) != null && !aFg1aSDK2.d()) {
                this.enableTCFDataCollection.unregisterClient(aFh1zSDK);
            }
        }
        if (map.isEmpty()) {
            aFh1zSDK.AFKeystoreWrapper.remove("meta");
        }
        if (i <= 2) {
            ArrayList arrayList = new ArrayList();
            for (Referrer referrer : (Referrer[]) this.AFLoggerLogLevel.unregisterClient.toArray(new Referrer[0])) {
                boolean z = referrer instanceof AFi1sSDK;
                int i3 = AnonymousClass4.AFKeystoreWrapper[referrer.getState().ordinal()];
                if (i3 == 1) {
                    if (z) {
                        ((AFe1fSDK) this).i.unregisterClient(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(referrer.map);
                } else if (i3 == 2 && i == 2 && !z) {
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put("source", referrer.getSource());
                    hashMap5.put("response", Payload.RESPONSE_TIMEOUT);
                    hashMap5.put("type", referrer.getType());
                    arrayList.add(hashMap5);
                }
            }
            if (!arrayList.isEmpty()) {
                aFh1zSDK.registerClient(Payload.RFRS, arrayList);
            }
            Object obj = this.afDebugLog;
            if (obj != null) {
                aFh1zSDK.registerClient("fb_ddl", obj);
            }
        }
        if (aFh1zSDK.d() == AFd1aSDK.afInfoLog && (aFg1aSDK = this.enableTCFDataCollection) != null && aFg1aSDK.unregisterClient()) {
            this.enableTCFDataCollection.registerClient(aFh1zSDK);
        }
        this.afWarnLog.AFLogger(aFh1zSDK);
    }
}
