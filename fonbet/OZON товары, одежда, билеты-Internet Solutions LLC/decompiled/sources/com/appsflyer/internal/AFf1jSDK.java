package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFi1jSDK;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFf1jSDK extends AFf1hSDK {

    @NonNull
    private final AppsFlyerProperties afDebugLog;

    @NonNull
    private final AFf1bSDK afErrorLog;
    public Map<String, Object> afInfoLog;

    @NonNull
    private final AFg1cSDK afRDLog;

    @NonNull
    private final AFc1oSDK afWarnLog;

    @NonNull
    private final AFi1iSDK force;

    /* renamed from: w, reason: collision with root package name */
    @NonNull
    private final AFd1tSDK f57421w;

    /* renamed from: com.appsflyer.internal.AFf1jSDK$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] AFInAppEventParameterName;

        static {
            int[] iArr = new int[AFi1jSDK.AFa1tSDK.values().length];
            AFInAppEventParameterName = iArr;
            try {
                iArr[AFi1jSDK.AFa1tSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFInAppEventParameterName[AFi1jSDK.AFa1tSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFf1jSDK(@NonNull AFa1pSDK aFa1pSDK, @NonNull AFd1mSDK aFd1mSDK) {
        super(aFa1pSDK, aFd1mSDK);
        this.force = aFd1mSDK.v();
        this.f57421w = aFd1mSDK.values();
        this.afRDLog = aFd1mSDK.AFLogger();
        this.afErrorLog = aFd1mSDK.d();
        this.afDebugLog = AppsFlyerProperties.getInstance();
        this.afWarnLog = aFd1mSDK.AppsFlyer2dXConversionCallback();
        this.valueOf.add(AFf1zSDK.RESOLVE_ESP);
        this.valueOf.add(AFf1zSDK.DLSDK);
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    protected final void AFInAppEventType(AFa1pSDK aFa1pSDK) {
        super.AFInAppEventType(aFa1pSDK);
        int i11 = aFa1pSDK.registerClient;
        this.afRDLog.valueOf(i11);
        Map map = (Map) aFa1pSDK.valueOf().get("meta");
        if (map == null) {
            map = new HashMap();
            aFa1pSDK.valueOf().put("meta", map);
        }
        if (!aFa1pSDK.valueOf().containsKey("af_deeplink")) {
            aFa1pSDK.AFInAppEventParameterName(this.afWarnLog.AFInAppEventParameterName());
        }
        AFh1eSDK AFInAppEventParameterName = this.afErrorLog.AFInAppEventParameterName();
        if (AFInAppEventParameterName != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("cdn_token", AFInAppEventParameterName.valueOf);
            String str = AFInAppEventParameterName.AFInAppEventParameterName;
            if (str != null) {
                hashMap.put("c_ver", str);
            }
            long j11 = AFInAppEventParameterName.values;
            if (j11 > 0) {
                hashMap.put("latency", Long.valueOf(j11));
            }
            long j12 = AFInAppEventParameterName.AFKeystoreWrapper;
            if (j12 > 0) {
                hashMap.put("delay", Long.valueOf(j12));
            }
            int i12 = AFInAppEventParameterName.AFInAppEventType;
            if (i12 > 0) {
                hashMap.put("res_code", Integer.valueOf(i12));
            }
            if (AFInAppEventParameterName.AFLogger != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AFInAppEventParameterName.AFLogger.getClass().getSimpleName());
                sb2.append(": ");
                sb2.append(AFInAppEventParameterName.AFLogger.getMessage());
                hashMap.put("error", sb2.toString());
            }
            AFh1bSDK aFh1bSDK = AFInAppEventParameterName.f57478d;
            if (aFh1bSDK != null) {
                hashMap.put("sig", aFh1bSDK.toString());
            }
            String str2 = AFInAppEventParameterName.unregisterClient;
            if (str2 != null) {
                hashMap.put("cdn_cache_status", str2);
            }
            map.put("rc", hashMap);
        }
        ((AFf1hSDK) this).f57418v.AFKeystoreWrapper(aFa1pSDK.valueOf());
        if (i11 == 1) {
            if (this.afDebugLog.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFa1pSDK.valueOf().put("wait_cid", Boolean.toString(true));
            }
            HashMap hashMap2 = new HashMap(this.afRDLog.AFKeystoreWrapper);
            this.afRDLog.AFInAppEventType.AFInAppEventType("ddl");
            if (!hashMap2.isEmpty()) {
                map.put("ddl", hashMap2);
            }
            HashMap hashMap3 = new HashMap(this.afRDLog.AFInAppEventParameterName);
            if (!hashMap3.isEmpty()) {
                map.put("first_launch", hashMap3);
            }
        } else if (i11 == 2) {
            HashMap hashMap4 = new HashMap(this.afRDLog.AFInAppEventParameterName);
            if (!hashMap4.isEmpty()) {
                map.put("first_launch", hashMap4);
            }
            this.afRDLog.AFInAppEventType.AFInAppEventType("first_launch");
        }
        if (map.isEmpty()) {
            aFa1pSDK.valueOf().remove("meta");
        }
        if (i11 <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFi1jSDK aFi1jSDK : this.force.AFKeystoreWrapper()) {
                boolean z11 = aFi1jSDK instanceof AFi1sSDK;
                int i13 = AnonymousClass5.AFInAppEventParameterName[aFi1jSDK.f57489d.ordinal()];
                if (i13 == 1) {
                    if (z11) {
                        aFa1pSDK.AFInAppEventType("rfr", ((AFi1sSDK) aFi1jSDK).values);
                        this.f57421w.values(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFi1jSDK.valueOf);
                } else if (i13 == 2 && i11 == 2 && !z11) {
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put("source", aFi1jSDK.AFKeystoreWrapper);
                    hashMap5.put("response", "TIMEOUT");
                    hashMap5.put("type", aFi1jSDK.unregisterClient);
                    arrayList.add(hashMap5);
                }
            }
            if (!arrayList.isEmpty()) {
                aFa1pSDK.AFInAppEventType("referrers", arrayList);
            }
            Object obj = this.afInfoLog;
            if (obj != null) {
                aFa1pSDK.AFInAppEventType("fb_ddl", obj);
            }
        }
        ((AFf1hSDK) this).f57418v.AFKeystoreWrapper(aFa1pSDK);
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1eSDK
    public final void AFKeystoreWrapper() {
        super.AFKeystoreWrapper();
        AFg1cSDK aFg1cSDK = this.afRDLog;
        int i11 = ((AFf1hSDK) this).f57416e.registerClient;
        long currentTimeMillis = System.currentTimeMillis();
        if (i11 == 1) {
            long j11 = aFg1cSDK.registerClient;
            if (j11 == 0) {
                AFLogger.afInfoLog("Metrics: launch start ts is missing");
                return;
            }
            aFg1cSDK.AFInAppEventParameterName.put("net", Long.valueOf(currentTimeMillis - j11));
            aFg1cSDK.AFInAppEventType.valueOf("first_launch", new JSONObject(aFg1cSDK.AFInAppEventParameterName).toString());
        }
    }
}
