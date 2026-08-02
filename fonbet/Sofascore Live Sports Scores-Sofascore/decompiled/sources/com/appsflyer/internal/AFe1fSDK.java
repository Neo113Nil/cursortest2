package com.appsflyer.internal;

import android.os.SystemClock;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class AFe1fSDK extends AFe1oSDK<String> {
    private static final AFe1zSDK[] valueOf = {AFd1aSDK.v, AFd1aSDK.i, AFd1aSDK.afDebugLog};
    private final AFd1hSDK AFLoggerLogLevel;
    private final AFf1qSDK AppsFlyerLib;
    private final AFc1cSDK afDebugLog;
    private final AFf1uSDK afErrorLog;
    private final AFh1zSDK afInfoLog;
    protected final AFf1bSDK afWarnLog;

    @NonNull
    protected final AFc1hSDK e;
    protected final AFc1pSDK i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1fSDK(@NonNull AFh1zSDK aFh1zSDK, @NonNull AFc1aSDK aFc1aSDK, String str) {
        super(aFh1zSDK.d(), new AFe1zSDK[]{AFd1aSDK.registerClient, AFd1aSDK.AFKeystoreWrapper}, aFc1aSDK, str);
        this.afInfoLog = aFh1zSDK;
        this.AFLoggerLogLevel = aFc1aSDK.AppsFlyerLib();
        this.i = aFc1aSDK.registerClient();
        this.afErrorLog = aFc1aSDK.w();
        this.afDebugLog = aFc1aSDK.valueOf();
        this.e = aFc1aSDK.AFKeystoreWrapper();
        this.afWarnLog = aFc1aSDK.i();
        this.AppsFlyerLib = aFc1aSDK.updateServerUninstallToken();
        for (AFe1zSDK aFe1zSDK : valueOf) {
            if (this.d == aFe1zSDK) {
                return;
            }
        }
        int i = this.afInfoLog.afErrorLog;
        AFe1zSDK aFe1zSDK2 = this.d;
        if (i > 0) {
            this.AFLogger.add(AFd1aSDK.unregisterClient);
            return;
        }
        AFd1aSDK aFd1aSDK = AFd1aSDK.unregisterClient;
        if (aFe1zSDK2 != aFd1aSDK) {
            this.unregisterClient.add(aFd1aSDK);
        }
    }

    public void AFKeystoreWrapper(AFh1zSDK aFh1zSDK) {
        this.afWarnLog.unregisterClient(aFh1zSDK);
    }

    public void AFLogger(AFh1zSDK aFh1zSDK) {
        this.afWarnLog.registerClient(aFh1zSDK.AFKeystoreWrapper);
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    @Nullable
    public final AppsFlyerRequestListener AFLoggerLogLevel() {
        return this.afInfoLog.unregisterClient;
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    public boolean afInfoLog() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0148  */
    @Override // com.appsflyer.internal.AFe1oSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFd1qSDK<String> d(@NonNull String str) {
        double d;
        JSONObject jSONObject;
        String str2;
        String str3;
        Exception exc;
        String replaceAll;
        String str4;
        registerClient(this.afInfoLog);
        if (this.afInfoLog.AFKeystoreWrapper.containsKey("meta")) {
            try {
                d = this.afErrorLog.AFKeystoreWrapper.registerClient.AFKeystoreWrapper.AFLogger.registerClient;
            } catch (NullPointerException unused) {
                d = 1.0d;
            }
            if (AFh1zSDK.unregisterClient(d)) {
                this.afInfoLog.AFKeystoreWrapper.remove("meta");
            }
        }
        AFd1qSDK<String> AFLogger = ((AFe1oSDK) this).registerClient.AFLogger(this.afInfoLog, str, this.afDebugLog);
        Map<String, Object> map = this.afInfoLog.AFKeystoreWrapper;
        try {
            jSONObject = new JSONObject(map);
            try {
                str2 = jSONObject.toString();
                try {
                } catch (NullPointerException e) {
                    e = e;
                    AFLogger.INSTANCE.e(LogTag.GENERAL, "JSONObject return null String object. Trying to create AFJsonObject.", e);
                    try {
                        Object[] objArr = {map};
                        Map map2 = AFb1ySDK.getInstance;
                        Object obj = map2.get(1914455290);
                        if (obj == null) {
                            obj = ((Class) AFb1ySDK.AFLogger(36 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 199 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (15213 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))))).getMethod("registerClient", Map.class);
                            map2.put(1914455290, obj);
                        }
                        String str5 = (String) ((Method) obj).invoke(null, objArr);
                        try {
                        } catch (NullPointerException e2) {
                            e = e2;
                            str2 = str5;
                            AFLogger.INSTANCE.e(LogTag.GENERAL, "AFJsonObject return null String object.", e);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append(this);
                            sb.append(": preparing data: ");
                            AFg1kSDK.AFKeystoreWrapper(sb.toString(), jSONObject);
                            ((AFe1oSDK) this).v.unregisterClient(AFLogger != null ? AFLogger.unregisterClient.registerClient : null, str3);
                            return AFLogger;
                        } catch (Exception e3) {
                            exc = e3;
                            str2 = str5;
                            AFLogger.INSTANCE.e(LogTag.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this);
                            sb2.append(": preparing data: ");
                            AFg1kSDK.AFKeystoreWrapper(sb2.toString(), jSONObject);
                            ((AFe1oSDK) this).v.unregisterClient(AFLogger != null ? AFLogger.unregisterClient.registerClient : null, str3);
                            return AFLogger;
                        } catch (Throwable th) {
                            th = th;
                            str2 = str5;
                            AFLogger.INSTANCE.e(LogTag.GENERAL, "Unexpected error", th);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            StringBuilder sb22 = new StringBuilder();
                            sb22.append(this);
                            sb22.append(": preparing data: ");
                            AFg1kSDK.AFKeystoreWrapper(sb22.toString(), jSONObject);
                            ((AFe1oSDK) this).v.unregisterClient(AFLogger != null ? AFLogger.unregisterClient.registerClient : null, str3);
                            return AFLogger;
                        }
                        if (str5 == null) {
                            throw new NullPointerException("JSON toString of eventParams map returns null");
                        }
                        replaceAll = str5.replaceAll("\\p{C}", "*Non-printing character*");
                        str2 = str5;
                        str3 = replaceAll;
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        StringBuilder sb222 = new StringBuilder();
                        sb222.append(this);
                        sb222.append(": preparing data: ");
                        AFg1kSDK.AFKeystoreWrapper(sb222.toString(), jSONObject);
                        ((AFe1oSDK) this).v.unregisterClient(AFLogger != null ? AFLogger.unregisterClient.registerClient : null, str3);
                        return AFLogger;
                    } catch (Throwable th2) {
                        try {
                            Throwable cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th2;
                        } catch (NullPointerException e4) {
                            e = e4;
                            AFLogger.INSTANCE.e(LogTag.GENERAL, "AFJsonObject return null String object.", e);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            StringBuilder sb2222 = new StringBuilder();
                            sb2222.append(this);
                            sb2222.append(": preparing data: ");
                            AFg1kSDK.AFKeystoreWrapper(sb2222.toString(), jSONObject);
                            ((AFe1oSDK) this).v.unregisterClient(AFLogger != null ? AFLogger.unregisterClient.registerClient : null, str3);
                            return AFLogger;
                        } catch (Exception e5) {
                            exc = e5;
                            AFLogger.INSTANCE.e(LogTag.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            StringBuilder sb22222 = new StringBuilder();
                            sb22222.append(this);
                            sb22222.append(": preparing data: ");
                            AFg1kSDK.AFKeystoreWrapper(sb22222.toString(), jSONObject);
                            ((AFe1oSDK) this).v.unregisterClient(AFLogger != null ? AFLogger.unregisterClient.registerClient : null, str3);
                            return AFLogger;
                        } catch (Throwable th3) {
                            th = th3;
                            AFLogger.INSTANCE.e(LogTag.GENERAL, "Unexpected error", th);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            StringBuilder sb222222 = new StringBuilder();
                            sb222222.append(this);
                            sb222222.append(": preparing data: ");
                            AFg1kSDK.AFKeystoreWrapper(sb222222.toString(), jSONObject);
                            ((AFe1oSDK) this).v.unregisterClient(AFLogger != null ? AFLogger.unregisterClient.registerClient : null, str3);
                            return AFLogger;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    AFLogger.INSTANCE.e(LogTag.GENERAL, "Unexpected error", th);
                    str3 = "";
                    if (str2 != null) {
                    }
                    if (str3.equals(str4)) {
                    }
                    StringBuilder sb2222222 = new StringBuilder();
                    sb2222222.append(this);
                    sb2222222.append(": preparing data: ");
                    AFg1kSDK.AFKeystoreWrapper(sb2222222.toString(), jSONObject);
                    ((AFe1oSDK) this).v.unregisterClient(AFLogger != null ? AFLogger.unregisterClient.registerClient : null, str3);
                    return AFLogger;
                }
            } catch (NullPointerException e6) {
                e = e6;
                str2 = null;
            } catch (Throwable th5) {
                th = th5;
                str2 = null;
            }
        } catch (NullPointerException e7) {
            e = e7;
            jSONObject = null;
            str2 = null;
        } catch (Throwable th6) {
            th = th6;
            jSONObject = null;
            str2 = null;
        }
        if (str2 == null) {
            throw new NullPointerException("JSON toString of eventParams map returns null");
        }
        replaceAll = str2.replaceAll("\\p{C}", "*Non-printing character*");
        str3 = replaceAll;
        str4 = str2 != null ? str2 : "";
        if (str3.equals(str4)) {
            str3 = str4;
        } else {
            AFLogger.INSTANCE.w(LogTag.GENERAL, "Payload contains non-printing characters");
            try {
                jSONObject = new JSONObject(str3);
            } catch (JSONException e8) {
                AFLogger.INSTANCE.e(LogTag.GENERAL, "Couldn't parse the payload to a json object", e8);
            }
        }
        StringBuilder sb22222222 = new StringBuilder();
        sb22222222.append(this);
        sb22222222.append(": preparing data: ");
        AFg1kSDK.AFKeystoreWrapper(sb22222222.toString(), jSONObject);
        ((AFe1oSDK) this).v.unregisterClient(AFLogger != null ? AFLogger.unregisterClient.registerClient : null, str3);
        return AFLogger;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0085 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:3:0x001e, B:5:0x0024, B:6:0x004a, B:8:0x005e, B:12:0x006a, B:15:0x0072, B:16:0x007f, B:18:0x0085, B:20:0x009d, B:21:0x00a2, B:23:0x00b7, B:24:0x00be, B:26:0x00c2, B:29:0x00c9, B:30:0x00d0, B:31:0x00a0, B:32:0x00d3, B:34:0x00dd, B:36:0x00e3, B:37:0x00f0, B:45:0x0012, B:2:0x0000), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:3:0x001e, B:5:0x0024, B:6:0x004a, B:8:0x005e, B:12:0x006a, B:15:0x0072, B:16:0x007f, B:18:0x0085, B:20:0x009d, B:21:0x00a2, B:23:0x00b7, B:24:0x00be, B:26:0x00c2, B:29:0x00c9, B:30:0x00d0, B:31:0x00a0, B:32:0x00d3, B:34:0x00dd, B:36:0x00e3, B:37:0x00f0, B:45:0x0012, B:2:0x0000), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e3 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:3:0x001e, B:5:0x0024, B:6:0x004a, B:8:0x005e, B:12:0x006a, B:15:0x0072, B:16:0x007f, B:18:0x0085, B:20:0x009d, B:21:0x00a2, B:23:0x00b7, B:24:0x00be, B:26:0x00c2, B:29:0x00c9, B:30:0x00d0, B:31:0x00a0, B:32:0x00d3, B:34:0x00dd, B:36:0x00e3, B:37:0x00f0, B:45:0x0012, B:2:0x0000), top: B:1:0x0000, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void registerClient(AFh1zSDK aFh1zSDK) {
        boolean z;
        String AFLogger;
        try {
            try {
                d(aFh1zSDK);
                AFLogger(aFh1zSDK);
                unregisterClient(aFh1zSDK);
                AFKeystoreWrapper(aFh1zSDK);
                v(aFh1zSDK);
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(LogTag.QUEUE, "Error while collecting payload params", th, true, true, false);
            }
            if (aFh1zSDK.AFLogger()) {
                AFf1oSDK aFf1oSDK = this.force;
                aFh1zSDK.AFLogger((Map) AFf1oSDK.AFLogger(new Object[]{aFf1oSDK, aFh1zSDK.AFKeystoreWrapper}, -1693088583, 1693088584, System.identityHashCode(aFf1oSDK)));
                aFh1zSDK.AFLogger(this.force.AFKeystoreWrapper(aFh1zSDK.AFKeystoreWrapper));
            }
            aFh1zSDK.AFLogger(this.force.registerClient());
            Set<AFe1zSDK> set = this.unregisterClient;
            if (!set.contains(AFd1aSDK.afInfoLog) && !set.contains(AFd1aSDK.unregisterClient)) {
                z = false;
                if (e() && z) {
                    aFh1zSDK.AFKeystoreWrapper(this.e.AFKeystoreWrapper.d("appsFlyerCount", 0));
                }
                if (aFh1zSDK.registerClient()) {
                    Map<String, Object> d = AFj1tSDK.d(aFh1zSDK.AFKeystoreWrapper);
                    AFd1hSDK aFd1hSDK = this.AFLoggerLogLevel;
                    AFd1dSDK aFd1dSDK = new AFd1dSDK(aFd1hSDK.registerClient(), aFd1hSDK.AFKeystoreWrapper(), AFd1hSDK.d == null ? AFd1cSDK.DEFAULT : AFd1cSDK.API);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", aFd1dSDK.unregisterClient);
                    AFd1cSDK aFd1cSDK = aFd1dSDK.AFKeystoreWrapper;
                    if (aFd1cSDK != AFd1cSDK.DEFAULT) {
                        jSONObject.put("method", aFd1cSDK.d);
                    }
                    String str = aFd1dSDK.AFLogger;
                    if (str != null && !StringsKt.R(str)) {
                        jSONObject.put("prefix", aFd1dSDK.AFLogger);
                    }
                    d.put("host", jSONObject);
                }
                AFLogger = this.e.AFLogger("AF_PREINSTALL_DISABLED");
                if (AFLogger != null ? Boolean.parseBoolean(AFLogger) : false) {
                    AFj1tSDK.d(aFh1zSDK.AFKeystoreWrapper).put("preinstall_disabled", Boolean.TRUE);
                }
                this.AppsFlyerLib.unregisterClient(aFh1zSDK.AFKeystoreWrapper, aFh1zSDK.d());
            }
            z = true;
            if (e()) {
                aFh1zSDK.AFKeystoreWrapper(this.e.AFKeystoreWrapper.d("appsFlyerCount", 0));
            }
            if (aFh1zSDK.registerClient()) {
            }
            AFLogger = this.e.AFLogger("AF_PREINSTALL_DISABLED");
            if (AFLogger != null ? Boolean.parseBoolean(AFLogger) : false) {
            }
            this.AppsFlyerLib.unregisterClient(aFh1zSDK.AFKeystoreWrapper, aFh1zSDK.d());
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(LogTag.QUEUE, "Error while preparing to send event", th2, true, true, false);
        }
    }

    public void unregisterClient(AFh1zSDK aFh1zSDK) {
        this.afWarnLog.d(aFh1zSDK);
    }

    public void v(AFh1zSDK aFh1zSDK) {
        this.afWarnLog.AFKeystoreWrapper(aFh1zSDK);
    }

    public AFe1fSDK(@NonNull AFh1zSDK aFh1zSDK, @NonNull AFc1aSDK aFc1aSDK) {
        this(aFh1zSDK, aFc1aSDK, null);
    }

    public void d(AFh1zSDK aFh1zSDK) {
        this.afWarnLog.registerClient(aFh1zSDK);
    }
}
