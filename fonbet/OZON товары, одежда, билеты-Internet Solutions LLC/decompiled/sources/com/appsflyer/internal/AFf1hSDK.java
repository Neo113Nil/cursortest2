package com.appsflyer.internal;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AFf1hSDK extends AFf1rSDK<String> {
    private static final AFf1zSDK[] afErrorLog = {AFf1zSDK.DLSDK, AFf1zSDK.ONELINK, AFf1zSDK.REGISTER};
    private final AFe1gSDK afInfoLog;
    private final AFd1kSDK afVerboseLog;
    private final AFg1vSDK afWarnLog;

    /* renamed from: e, reason: collision with root package name */
    public final AFa1pSDK f57416e;
    private final AFf1bSDK force;

    /* renamed from: i, reason: collision with root package name */
    protected final AFd1tSDK f57417i;

    /* renamed from: v, reason: collision with root package name */
    protected final AFg1qSDK f57418v;

    /* renamed from: w, reason: collision with root package name */
    @NonNull
    private final AFd1sSDK f57419w;

    public AFf1hSDK(@NonNull AFa1pSDK aFa1pSDK, @NonNull AFd1mSDK aFd1mSDK) {
        this(aFa1pSDK, aFd1mSDK, null);
    }

    @NonNull
    private static Map<String, Object> d(AFa1pSDK aFa1pSDK) {
        Map<String, Object> map = (Map) aFa1pSDK.valueOf().get("meta");
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        aFa1pSDK.valueOf().put("meta", hashMap);
        return hashMap;
    }

    protected void AFInAppEventParameterName(AFa1pSDK aFa1pSDK) {
        this.f57418v.AFInAppEventType(aFa1pSDK);
    }

    protected void AFInAppEventType(AFa1pSDK aFa1pSDK) {
        boolean z11 = true;
        try {
            AFKeystoreWrapper(aFa1pSDK);
            valueOf(aFa1pSDK);
            AFInAppEventParameterName(aFa1pSDK);
            values(aFa1pSDK);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Error while collecting payload params", th2, true, false);
        }
        if (aFa1pSDK.e()) {
            aFa1pSDK.AFInAppEventParameterName(new AFd1rSDK(aFa1pSDK.valueOf(), ((AFf1rSDK) this).registerClient.AFInAppEventType.valueOf));
            aFa1pSDK.AFInAppEventParameterName((Map<String, ?>) ((AFf1rSDK) this).registerClient.AFInAppEventType(aFa1pSDK.valueOf()));
            if (this.f57419w.values("com.appsflyer.security.enable")) {
                try {
                    new AFb1sSDK(aFa1pSDK).afInfoLog();
                } catch (Exception e11) {
                    AFLogger.afErrorLogForExcManagerOnly("native: reflection init failed", e11);
                }
            }
        }
        if (aFa1pSDK.d()) {
            aFa1pSDK.AFInAppEventParameterName((Map<String, ?>) ((AFf1rSDK) this).registerClient.values());
        }
        Set<AFf1zSDK> set = this.AFKeystoreWrapper;
        if (!set.contains(AFf1zSDK.LAUNCH) && !set.contains(AFf1zSDK.CONVERSION)) {
            z11 = false;
        }
        if (d() && z11) {
            aFa1pSDK.AFInAppEventType(this.f57417i.AFInAppEventParameterName("appsFlyerCount", 0));
        }
        if (aFa1pSDK.unregisterClient()) {
            Map<String, Object> d11 = d(aFa1pSDK);
            AFe1gSDK aFe1gSDK = this.afInfoLog;
            AFe1iSDK aFe1iSDK = new AFe1iSDK(aFe1gSDK.AFInAppEventType(), aFe1gSDK.AFInAppEventParameterName(), AFe1gSDK.valueOf() ? AFe1cSDK.DEFAULT : AFe1cSDK.API);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, aFe1iSDK.values);
            AFe1cSDK aFe1cSDK = aFe1iSDK.AFInAppEventParameterName;
            if (aFe1cSDK != AFe1cSDK.DEFAULT) {
                jSONObject.put("method", aFe1cSDK.valueOf);
            }
            String str = aFe1iSDK.valueOf;
            if (str != null && !kotlin.text.h.K(str)) {
                jSONObject.put("prefix", aFe1iSDK.valueOf);
            }
            d11.put("host", jSONObject);
        }
        if (this.f57419w.values("AF_PREINSTALL_DISABLED")) {
            d(aFa1pSDK).put("preinstall_disabled", Boolean.TRUE);
        }
        this.afWarnLog.AFInAppEventParameterName(aFa1pSDK.valueOf(), aFa1pSDK.AFKeystoreWrapper());
    }

    protected void AFKeystoreWrapper(AFa1pSDK aFa1pSDK) {
        this.f57418v.valueOf(aFa1pSDK.valueOf());
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final AppsFlyerRequestListener registerClient() {
        return this.f57416e.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected boolean unregisterClient() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010c  */
    @Override // com.appsflyer.internal.AFf1rSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final AFe1uSDK<String> valueOf(@NonNull String str) {
        double d11;
        String str2;
        String str3;
        String str4;
        AFInAppEventType(this.f57416e);
        if (this.f57416e.valueOf().containsKey("meta")) {
            try {
                d11 = this.force.valueOf.AFInAppEventParameterName.AFInAppEventType.AFInAppEventType.AFInAppEventParameterName;
            } catch (NullPointerException unused) {
                d11 = 1.0d;
            }
            if (AFa1pSDK.values(d11)) {
                this.f57416e.valueOf().remove("meta");
            }
        }
        AFa1pSDK aFa1pSDK = this.f57416e;
        String str5 = aFa1pSDK.unregisterClient;
        Map<String, Object> valueOf = aFa1pSDK.valueOf();
        String str6 = null;
        try {
            str2 = new JSONObject(valueOf).toString();
            try {
            } catch (NullPointerException e11) {
                e = e11;
                AFLogger.afErrorLog("JSONObject return null String object. Trying to create AFJsonObject.", e, true);
                try {
                    Object[] objArr = {valueOf};
                    Map<Integer, Object> map = AFa1ySDK.afErrorLog;
                    Object obj = map.get(1929890233);
                    if (obj == null) {
                        obj = ((Class) AFa1ySDK.AFKeystoreWrapper(73 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.indexOf("", "") + 37)).getMethod("values", Map.class);
                        map.put(1929890233, obj);
                    }
                    String str7 = (String) ((Method) obj).invoke(null, objArr);
                    try {
                    } catch (NullPointerException e12) {
                        e = e12;
                        str2 = str7;
                        AFLogger.afErrorLog("AFJsonObject return null String object.", e, true);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this);
                        sb2.append(": preparing data: ");
                        sb2.append(str3);
                        AFb1lSDK.values(sb2.toString());
                        ((AFf1rSDK) this).unregisterClient.valueOf(str5, str3);
                        return ((AFf1rSDK) this).f57438d.AFInAppEventParameterName(this.f57416e, str, this.afVerboseLog);
                    } catch (Exception e13) {
                        e = e13;
                        str2 = str7;
                        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        StringBuilder sb22 = new StringBuilder();
                        sb22.append(this);
                        sb22.append(": preparing data: ");
                        sb22.append(str3);
                        AFb1lSDK.values(sb22.toString());
                        ((AFf1rSDK) this).unregisterClient.valueOf(str5, str3);
                        return ((AFf1rSDK) this).f57438d.AFInAppEventParameterName(this.f57416e, str, this.afVerboseLog);
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = str7;
                        AFLogger.afErrorLog("Unexpected error", th, true);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        StringBuilder sb222 = new StringBuilder();
                        sb222.append(this);
                        sb222.append(": preparing data: ");
                        sb222.append(str3);
                        AFb1lSDK.values(sb222.toString());
                        ((AFf1rSDK) this).unregisterClient.valueOf(str5, str3);
                        return ((AFf1rSDK) this).f57438d.AFInAppEventParameterName(this.f57416e, str, this.afVerboseLog);
                    }
                    if (str7 == null) {
                        throw new NullPointerException("JSON toString of eventParams map returns null");
                    }
                    str3 = str7.replaceAll("\\p{C}", "*Non-printing character*");
                    str2 = str7;
                    if (str2 != null) {
                    }
                    if (str3.equals(str4)) {
                    }
                    StringBuilder sb2222 = new StringBuilder();
                    sb2222.append(this);
                    sb2222.append(": preparing data: ");
                    sb2222.append(str3);
                    AFb1lSDK.values(sb2222.toString());
                    ((AFf1rSDK) this).unregisterClient.valueOf(str5, str3);
                    return ((AFf1rSDK) this).f57438d.AFInAppEventParameterName(this.f57416e, str, this.afVerboseLog);
                } catch (Throwable th3) {
                    try {
                        Throwable cause = th3.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th3;
                    } catch (NullPointerException e14) {
                        e = e14;
                        AFLogger.afErrorLog("AFJsonObject return null String object.", e, true);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        StringBuilder sb22222 = new StringBuilder();
                        sb22222.append(this);
                        sb22222.append(": preparing data: ");
                        sb22222.append(str3);
                        AFb1lSDK.values(sb22222.toString());
                        ((AFf1rSDK) this).unregisterClient.valueOf(str5, str3);
                        return ((AFf1rSDK) this).f57438d.AFInAppEventParameterName(this.f57416e, str, this.afVerboseLog);
                    } catch (Exception e15) {
                        e = e15;
                        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        StringBuilder sb222222 = new StringBuilder();
                        sb222222.append(this);
                        sb222222.append(": preparing data: ");
                        sb222222.append(str3);
                        AFb1lSDK.values(sb222222.toString());
                        ((AFf1rSDK) this).unregisterClient.valueOf(str5, str3);
                        return ((AFf1rSDK) this).f57438d.AFInAppEventParameterName(this.f57416e, str, this.afVerboseLog);
                    } catch (Throwable th4) {
                        th = th4;
                        AFLogger.afErrorLog("Unexpected error", th, true);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        StringBuilder sb2222222 = new StringBuilder();
                        sb2222222.append(this);
                        sb2222222.append(": preparing data: ");
                        sb2222222.append(str3);
                        AFb1lSDK.values(sb2222222.toString());
                        ((AFf1rSDK) this).unregisterClient.valueOf(str5, str3);
                        return ((AFf1rSDK) this).f57438d.AFInAppEventParameterName(this.f57416e, str, this.afVerboseLog);
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                str6 = str2;
                AFLogger.afErrorLog("Unexpected error", th, true);
                str3 = "";
                str2 = str6;
                if (str2 != null) {
                }
                if (str3.equals(str4)) {
                }
                StringBuilder sb22222222 = new StringBuilder();
                sb22222222.append(this);
                sb22222222.append(": preparing data: ");
                sb22222222.append(str3);
                AFb1lSDK.values(sb22222222.toString());
                ((AFf1rSDK) this).unregisterClient.valueOf(str5, str3);
                return ((AFf1rSDK) this).f57438d.AFInAppEventParameterName(this.f57416e, str, this.afVerboseLog);
            }
        } catch (NullPointerException e16) {
            e = e16;
            str2 = null;
        } catch (Throwable th6) {
            th = th6;
        }
        if (str2 == null) {
            throw new NullPointerException("JSON toString of eventParams map returns null");
        }
        str3 = str2.replaceAll("\\p{C}", "*Non-printing character*");
        str4 = str2 != null ? str2 : "";
        if (str3.equals(str4)) {
            str3 = str4;
        } else {
            AFLogger.afWarnLog("Payload contains non-printing characters");
        }
        StringBuilder sb222222222 = new StringBuilder();
        sb222222222.append(this);
        sb222222222.append(": preparing data: ");
        sb222222222.append(str3);
        AFb1lSDK.values(sb222222222.toString());
        ((AFf1rSDK) this).unregisterClient.valueOf(str5, str3);
        return ((AFf1rSDK) this).f57438d.AFInAppEventParameterName(this.f57416e, str, this.afVerboseLog);
    }

    protected void values(AFa1pSDK aFa1pSDK) {
        this.f57418v.values(aFa1pSDK);
    }

    public AFf1hSDK(@NonNull AFa1pSDK aFa1pSDK, @NonNull AFd1mSDK aFd1mSDK, String str) {
        super(aFa1pSDK.AFKeystoreWrapper(), new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1mSDK, str);
        this.f57416e = aFa1pSDK;
        this.afInfoLog = aFd1mSDK.afVerboseLog();
        this.f57417i = aFd1mSDK.values();
        this.force = aFd1mSDK.d();
        this.afVerboseLog = aFd1mSDK.w();
        this.f57419w = aFd1mSDK.AFInAppEventType();
        this.f57418v = aFd1mSDK.unregisterClient();
        this.afWarnLog = aFd1mSDK.onInstallConversionFailureNative();
        for (AFf1zSDK aFf1zSDK : afErrorLog) {
            if (this.AFInAppEventParameterName == aFf1zSDK) {
                return;
            }
        }
        int i11 = this.f57416e.registerClient;
        AFf1zSDK aFf1zSDK2 = this.AFInAppEventParameterName;
        if (i11 > 0) {
            this.valueOf.add(AFf1zSDK.CONVERSION);
        } else {
            AFf1zSDK aFf1zSDK3 = AFf1zSDK.CONVERSION;
            if (aFf1zSDK2 != aFf1zSDK3) {
                this.AFKeystoreWrapper.add(aFf1zSDK3);
            }
        }
    }

    protected void valueOf(AFa1pSDK aFa1pSDK) {
        this.f57418v.valueOf(aFa1pSDK);
    }
}
