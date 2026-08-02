package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.sdk_base.logger.LogTag;
import com.ironsource.L6;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.vungle.ads.internal.protos.Sdk;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFd1xSDK implements AFd1ySDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean AFLoggerLogLevel = false;
    private static int afDebugLog = 0;
    private static int afErrorLog = 0;
    private static boolean afInfoLog = false;
    private static char[] afWarnLog = null;
    private static int getLevel = 1;
    private static final int unregisterClient;
    private int AFKeystoreWrapper;
    private boolean e;
    private final AFc1aSDK force;
    private boolean i;
    private AppsFlyerProperties w;
    private List<String> AFLogger = new ArrayList();
    private boolean d = true;

    @NonNull
    private final Map<String, Object> registerClient = new HashMap();
    private SecureRandom v = new SecureRandom();

    static {
        force();
        unregisterClient = 98166;
        afErrorLog = (getLevel + 89) % 128;
    }

    public AFd1xSDK(AFc1aSDK aFc1aSDK) {
        this.w = aFc1aSDK.AFLogger();
        String AFLogger = aFc1aSDK.AFKeystoreWrapper().AFLogger("AF_DISABLE_REMOTE_DEBUGGER");
        this.i = true ^ (AFLogger != null ? Boolean.parseBoolean(AFLogger) : false);
        this.AFKeystoreWrapper = 0;
        this.e = false;
        this.force = aFc1aSDK;
    }

    private synchronized void AFKeystoreWrapper(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.registerClient.put(MBridgeConstans.APP_ID, str);
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null) {
            try {
                getLevel = (afErrorLog + 31) % 128;
                if (str2.length() > 0) {
                    this.registerClient.put("app_version", str2);
                }
            } finally {
            }
        }
        if (str3 != null && str3.length() > 0) {
            afErrorLog = (getLevel + 61) % 128;
            this.registerClient.put("channel", str3);
        }
        if (str4 != null && str4.length() > 0) {
            int i = afErrorLog + 97;
            getLevel = i % 128;
            int i2 = i % 2;
            Map<String, Object> map = this.registerClient;
            if (i2 == 0) {
                map.put("preInstall", str4);
                throw null;
            }
            map.put("preInstall", str4);
        }
    }

    private synchronized void AFLogger(String str, String str2, String str3, String str4) {
        int i = getLevel + 107;
        afErrorLog = i % 128;
        int i2 = i % 2;
        Map<String, Object> map = this.registerClient;
        try {
            if (i2 != 0) {
                map.put("sdk_version", str);
                throw null;
            }
            map.put("sdk_version", str);
            if (str2 != null) {
                getLevel = (afErrorLog + 67) % 128;
                if (str2.length() > 0) {
                    this.registerClient.put("devkey", str2);
                }
            }
            if (str3 != null) {
                afErrorLog = (getLevel + 107) % 128;
                if (str3.length() > 0) {
                    int i3 = getLevel + 87;
                    afErrorLog = i3 % 128;
                    int i4 = i3 % 2;
                    Map<String, Object> map2 = this.registerClient;
                    if (i4 != 0) {
                        map2.put("originalAppsFlyerId", str3);
                        throw null;
                    }
                    map2.put("originalAppsFlyerId", str3);
                }
            }
            if (str4 != null && str4.length() > 0) {
                this.registerClient.put("uid", str4);
            }
        } catch (Throwable unused) {
        }
    }

    private void AFLoggerLogLevel() {
        afErrorLog = (getLevel + 55) % 128;
        this.force.registerClient().AFLogger("participantInProxy");
        int i = getLevel + 55;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b9 -> B:35:0x00a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int[] iArr, String str, String str2, int i, Object[] objArr) {
        char[] cArr;
        int i2;
        int i3;
        int i4 = ($10 + 65) % 128;
        $11 = i4;
        byte[] bArr = str2;
        if (str2 != null) {
            int i5 = i4 + 101;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                str2.getBytes("ISO-8859-1");
                throw null;
            }
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] cArr2 = str;
        if (str != null) {
            int i6 = $11 + 105;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            cArr2 = str.toCharArray();
        }
        char[] cArr3 = cArr2;
        AFj1fSDK aFj1fSDK = new AFj1fSDK();
        char[] cArr4 = afWarnLog;
        if (cArr4 != null) {
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                cArr5[i7] = (char) (cArr4[i7] ^ 1887514039464720753L);
            }
            cArr4 = cArr5;
        }
        int i8 = (int) (1887514039464720753L ^ afDebugLog);
        if (AFLoggerLogLevel) {
            int length2 = bArr2.length;
            aFj1fSDK.AFKeystoreWrapper = length2;
            char[] cArr6 = new char[length2];
            aFj1fSDK.registerClient = 0;
            while (true) {
                int i9 = aFj1fSDK.registerClient;
                int i10 = aFj1fSDK.AFKeystoreWrapper;
                if (i9 >= i10) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    $11 = ($10 + 29) % 128;
                    cArr6[i9] = (char) (cArr4[bArr2[(i10 - 1) - i9] + i] - i8);
                    aFj1fSDK.registerClient = i9 + 1;
                }
            }
        } else if (afInfoLog) {
            int i11 = $10 + 107;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                int length3 = cArr3.length;
                aFj1fSDK.AFKeystoreWrapper = length3;
                cArr = new char[length3];
                int i12 = 1;
                aFj1fSDK.registerClient = i12;
                i2 = aFj1fSDK.registerClient;
                i3 = aFj1fSDK.AFKeystoreWrapper;
                if (i2 < i3) {
                    cArr[i2] = (char) (cArr4[cArr3[(i3 - 1) - i2] - i] - i8);
                    i12 = i2 + 1;
                    aFj1fSDK.registerClient = i12;
                    i2 = aFj1fSDK.registerClient;
                    i3 = aFj1fSDK.AFKeystoreWrapper;
                    if (i2 < i3) {
                        objArr[0] = new String(cArr);
                    }
                }
            } else {
                int length4 = cArr3.length;
                aFj1fSDK.AFKeystoreWrapper = length4;
                cArr = new char[length4];
                aFj1fSDK.registerClient = 0;
                i2 = aFj1fSDK.registerClient;
                i3 = aFj1fSDK.AFKeystoreWrapper;
                if (i2 < i3) {
                }
            }
        } else {
            int length5 = iArr.length;
            aFj1fSDK.AFKeystoreWrapper = length5;
            char[] cArr7 = new char[length5];
            aFj1fSDK.registerClient = 0;
            while (true) {
                int i13 = aFj1fSDK.registerClient;
                int i14 = aFj1fSDK.AFKeystoreWrapper;
                if (i13 >= i14) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    $11 = ($10 + 21) % 128;
                    cArr7[i13] = (char) (cArr4[iArr[(i14 - 1) - i13] - i] - i8);
                    aFj1fSDK.registerClient = i13 + 1;
                }
            }
        }
    }

    @NonNull
    private synchronized Map<String, Object> afDebugLog() {
        Map<String, Object> map;
        getLevel = (afErrorLog + 23) % 128;
        this.registerClient.put("data", this.AFLogger);
        afErrorLog();
        map = this.registerClient;
        afErrorLog = (getLevel + 1) % 128;
        return map;
    }

    private synchronized void afErrorLog() {
        this.AFLogger = new ArrayList();
        this.AFKeystoreWrapper = 0;
        int i = afErrorLog + Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE;
        getLevel = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private boolean afInfoLog() {
        afErrorLog = (getLevel + 79) % 128;
        boolean registerClient = this.force.registerClient().registerClient("participantInProxy");
        int i = getLevel + 57;
        afErrorLog = i % 128;
        if (i % 2 == 0) {
            return registerClient;
        }
        throw null;
    }

    private boolean afWarnLog() {
        if (this.i) {
            int i = getLevel;
            int i2 = i + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            afErrorLog = i2 % 128;
            int i3 = i2 % 2;
            boolean z = this.d;
            if (i3 != 0) {
                throw null;
            }
            if (z) {
                return true;
            }
            int i4 = i + 43;
            afErrorLog = i4 % 128;
            int i5 = i4 % 2;
            boolean z2 = this.e;
            if (i5 != 0) {
                int i6 = 39 / 0;
                if (z2) {
                    return true;
                }
            } else if (z2) {
                return true;
            }
        }
        return false;
    }

    private synchronized void d(String str, String str2, String str3) {
        afErrorLog = (getLevel + 49) % 128;
        try {
            Map<String, Object> map = this.registerClient;
            Object[] objArr = new Object[1];
            a(null, null, "\u0085\u0084\u0083\u0082\u0081", Color.green(0) + Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.registerClient.put(L6.B, Build.MODEL);
            this.registerClient.put(L6.H, U3.d);
            this.registerClient.put("platform_version", Build.VERSION.RELEASE);
            if (str != null && str.length() > 0) {
                int i = getLevel + 55;
                afErrorLog = i % 128;
                int i2 = i % 2;
                Map<String, Object> map2 = this.registerClient;
                if (i2 != 0) {
                    map2.put("advertiserId", str);
                    throw null;
                }
                map2.put("advertiserId", str);
                afErrorLog = (getLevel + 7) % 128;
            }
            if (str2 != null && str2.length() > 0) {
                this.registerClient.put("imei", str2);
            }
            if (str3 != null) {
                afErrorLog = (getLevel + 93) % 128;
                if (str3.length() > 0) {
                    this.registerClient.put("android_id", str3);
                }
            }
            int i3 = getLevel + 57;
            afErrorLog = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 13 / 0;
            }
        } catch (Throwable unused) {
        }
    }

    public static void force() {
        afWarnLog = new char[]{31120, 31104, 31121, 31132, 31122};
        afDebugLog = -1227130610;
        afInfoLog = true;
        AFLoggerLogLevel = true;
    }

    private float i() {
        int i = getLevel + 25;
        afErrorLog = i % 128;
        int i2 = i % 2;
        SecureRandom secureRandom = this.v;
        if (i2 == 0) {
            return secureRandom.nextFloat();
        }
        secureRandom.nextFloat();
        throw null;
    }

    private synchronized void registerClient(String str, String str2, String... strArr) {
        String obj;
        if (afWarnLog()) {
            getLevel = (afErrorLog + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
            if (this.AFKeystoreWrapper < 98304) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    String join = TextUtils.join(", ", strArr);
                    if (str != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(currentTimeMillis);
                        sb.append(" ");
                        sb.append(Thread.currentThread().getId());
                        sb.append(" _/AppsFlyer_7.0.0 [");
                        sb.append(str);
                        sb.append("] ");
                        sb.append(str2);
                        sb.append(" ");
                        sb.append(join);
                        obj = sb.toString();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(currentTimeMillis);
                        sb2.append(" ");
                        sb2.append(Thread.currentThread().getId());
                        sb2.append(" ");
                        sb2.append(str2);
                        sb2.append("/AppsFlyer_7.0.0 ");
                        sb2.append(join);
                        obj = sb2.toString();
                    }
                    int length = this.AFKeystoreWrapper + (obj.length() << 1);
                    int i = unregisterClient;
                    boolean z = false;
                    if (length > i) {
                        obj = obj.substring(0, (i - this.AFKeystoreWrapper) / 2);
                        z = true;
                    }
                    this.AFLogger.add(obj);
                    this.AFKeystoreWrapper += obj.length() << 1;
                    if (z) {
                        afErrorLog = (getLevel + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
                        this.AFLogger.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                        this.AFKeystoreWrapper += 138;
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private synchronized void unregisterClient(String str, AFc1gSDK aFc1gSDK) {
        int i = afErrorLog + 99;
        getLevel = i % 128;
        String str2 = null;
        if (i % 2 == 0) {
            this.w.getString("remote_debug_static_data");
            this.registerClient.clear();
            throw null;
        }
        String string = this.w.getString("remote_debug_static_data");
        this.registerClient.clear();
        if (string != null) {
            try {
                this.registerClient.putAll(AFg1nSDK.registerClient(new JSONObject(string)));
            } catch (Throwable unused) {
            }
        } else {
            d(this.force.AFKeystoreWrapper().AFKeystoreWrapper(), aFc1gSDK.force, aFc1gSDK.AFLogger);
            StringBuilder sb = new StringBuilder("7.0.0.");
            sb.append(AFa1zSDK.registerClient);
            String obj = sb.toString();
            AFf1oSDK values = this.force.values();
            AFLogger(obj, (String) AFf1oSDK.AFLogger(new Object[]{values}, 343398987, -343398985, System.identityHashCode(values)), this.w.getString("KSAppsFlyerId"), AFb1mSDK.unregisterClient(this.force.AFKeystoreWrapper().AFKeystoreWrapper));
            try {
                int i2 = this.force.AFKeystoreWrapper().r_().versionCode;
                String AFLogger = this.force.AFKeystoreWrapper().AFLogger("CHANNEL");
                if (AFLogger == null || !AFLogger.equals("")) {
                    str2 = AFLogger;
                } else {
                    getLevel = (afErrorLog + 27) % 128;
                }
                AFKeystoreWrapper(str, String.valueOf(i2), str2, this.w.getString("preInstallName"));
                afErrorLog = (getLevel + 85) % 128;
            } catch (Throwable unused2) {
            }
            this.w.set("remote_debug_static_data", new JSONObject(this.registerClient).toString());
        }
        this.registerClient.put("launch_counter", String.valueOf(this.force.AFKeystoreWrapper().AFKeystoreWrapper.d("appsFlyerCount", 0)));
        int i3 = afErrorLog + 15;
        getLevel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 4 / 0;
        }
    }

    private static String v() {
        int i = afErrorLog + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        getLevel = i % 128;
        if (i % 2 == 0) {
            int i2 = 41 / 0;
        }
        return "7.0.0";
    }

    private synchronized void w() {
        try {
            int i = afErrorLog + 95;
            getLevel = i % 128;
            int i2 = i % 2;
            boolean z = this.e;
            if (i2 == 0) {
                throw null;
            }
            if (z) {
                return;
            }
            this.e = true;
            try {
                registerClient("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
                int i3 = getLevel + 19;
                afErrorLog = i3 % 128;
                if (i3 % 2 == 0) {
                    return;
                } else {
                    throw null;
                }
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(LogTag.PROXY, "Error while starting remote debugger", th, true, true, true);
                return;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    @Override // com.appsflyer.internal.AFd1ySDK
    public final boolean e() {
        return ((Boolean) AFKeystoreWrapper(new Object[]{this}, 1762433421, -1762433420, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.appsflyer.internal.AFd1ySDK
    public final void v_(String str, PackageManager packageManager) {
        AFKeystoreWrapper(new Object[]{this, str, packageManager}, -673799095, 673799098, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1ySDK
    public final synchronized void AFKeystoreWrapper() {
        try {
            int i = afErrorLog + 75;
            getLevel = i % 128;
            int i2 = i % 2;
            Map<String, Object> map = this.registerClient;
            if (i2 == 0) {
                map.clear();
                this.AFLogger.clear();
                this.AFKeystoreWrapper = 1;
            } else {
                map.clear();
                this.AFLogger.clear();
                this.AFKeystoreWrapper = 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFd1ySDK
    public final void AFKeystoreWrapper(String str, String... strArr) {
        getLevel = (afErrorLog + 51) % 128;
        registerClient("public_api_call", str, strArr);
        afErrorLog = (getLevel + 93) % 128;
    }

    @Override // com.appsflyer.internal.AFd1ySDK
    public final void AFLogger(String str, String str2) {
        getLevel = (afErrorLog + 7) % 128;
        registerClient(null, str, str2);
        getLevel = (afErrorLog + 87) % 128;
    }

    @Override // com.appsflyer.internal.AFd1ySDK
    public final void AFKeystoreWrapper(Throwable th) {
        String message;
        StackTraceElement[] stackTrace;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        if (cause == null) {
            afErrorLog = (getLevel + 65) % 128;
            message = th.getMessage();
            getLevel = (afErrorLog + 13) % 128;
        } else {
            message = cause.getMessage();
        }
        if (cause == null) {
            int i = getLevel + 65;
            afErrorLog = i % 128;
            if (i % 2 == 0) {
                stackTrace = th.getStackTrace();
            } else {
                th.getStackTrace();
                throw null;
            }
        } else {
            stackTrace = cause.getStackTrace();
        }
        registerClient("exception", simpleName, unregisterClient(message, stackTrace));
        getLevel = (afErrorLog + 19) % 128;
    }

    private static /* synthetic */ Object AFLogger(Object[] objArr) {
        AFd1xSDK aFd1xSDK = (AFd1xSDK) objArr[0];
        int i = afErrorLog + 81;
        getLevel = i % 128;
        int i2 = i % 2;
        boolean z = aFd1xSDK.e;
        if (i2 != 0) {
            return Boolean.valueOf(z);
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1ySDK
    public final boolean AFLogger() {
        boolean d = d(d(this.force.w().AFKeystoreWrapper.registerClient), d(this.force.w().AFKeystoreWrapper.unregisterClient));
        if (d) {
            getLevel = (afErrorLog + 61) % 128;
            w();
            afErrorLog = (getLevel + 81) % 128;
            return d;
        }
        registerClient();
        d();
        return d;
    }

    public static /* synthetic */ Object AFKeystoreWrapper(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * (-667)) + (i * (-1335));
        int i5 = ~i2;
        int i6 = i | i3;
        int i7 = ((i5 | i6) * 668) + ((i | (~(i3 | i5))) * 1336) + (((~i6) | i5) * (-668)) + i4;
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? unregisterClient(objArr) : d(objArr) : registerClient(objArr) : AFLogger(objArr);
    }

    private boolean AFLogger(@NonNull AFh1jSDK aFh1jSDK, @Nullable AFh1jSDK aFh1jSDK2) {
        boolean z;
        int i = getLevel + 57;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            aFh1jSDK.equals(aFh1jSDK2);
            throw null;
        }
        if (aFh1jSDK.equals(aFh1jSDK2)) {
            z = afInfoLog();
        } else {
            boolean registerClient = registerClient(aFh1jSDK.AFLogger);
            AFKeystoreWrapper(new Object[]{this, Boolean.valueOf(registerClient)}, -45396201, 45396201, System.identityHashCode(this));
            z = registerClient;
        }
        int i2 = afErrorLog + 105;
        getLevel = i2 % 128;
        if (i2 % 2 != 0) {
            return z;
        }
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        AFd1xSDK aFd1xSDK = (AFd1xSDK) objArr[0];
        String str = (String) objArr[1];
        int i = getLevel + 25;
        afErrorLog = i % 128;
        try {
            if (i % 2 == 0) {
                Map<String, Object> unregisterClient2 = aFd1xSDK.unregisterClient(str);
                AFf1oSDK values = aFd1xSDK.force.values();
                AFd1uSDK AFKeystoreWrapper = aFd1xSDK.force.d().AFKeystoreWrapper(unregisterClient2, (String) AFf1oSDK.AFLogger(new Object[]{values}, 343398987, -343398985, System.identityHashCode(values)));
                if (AFKeystoreWrapper == null) {
                    AFLogger.INSTANCE.e(LogTag.PROXY, "Could not send proxy data: request is null", new NullPointerException("request was null"), false, false);
                    int i2 = afErrorLog + 11;
                    getLevel = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 0 / 0;
                    }
                    return null;
                }
                aFd1xSDK.force.unregisterClient().execute(new h(AFKeystoreWrapper, 2));
                afErrorLog = (getLevel + 93) % 128;
                return null;
            }
            Map<String, Object> unregisterClient3 = aFd1xSDK.unregisterClient(str);
            AFf1oSDK values2 = aFd1xSDK.force.values();
            aFd1xSDK.force.d().AFKeystoreWrapper(unregisterClient3, (String) AFf1oSDK.AFLogger(new Object[]{values2}, 343398987, -343398985, System.identityHashCode(values2)));
            throw null;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(LogTag.PROXY, "Could not send proxy data", th, false, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFd1ySDK
    public final void d(String str, int i, String str2) {
        int i2 = getLevel + 31;
        afErrorLog = i2 % 128;
        if (i2 % 2 == 0) {
            registerClient("server_response", str, String.valueOf(i), str2);
            return;
        }
        String[] strArr = new String[3];
        strArr[0] = String.valueOf(i);
        strArr[1] = str2;
        registerClient("server_response", str, strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        r8.e = false;
        r8.d = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        registerClient("r_debugging_off", new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", java.util.Locale.ENGLISH).format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), new java.lang.String[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.e(com.appsflyer.sdk_base.logger.LogTag.PROXY, "Error while stopping remote debugger", r0, true, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x001c, code lost:
    
        r0 = r0 + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        com.appsflyer.internal.AFd1xSDK.getLevel = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0024, code lost:
    
        r1 = r8.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0026, code lost:
    
        if (r0 != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002a, code lost:
    
        r0 = 82 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002b, code lost:
    
        if (r1 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0031, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002e, code lost:
    
        if (r1 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x001a, code lost:
    
        if (r2 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r2 == false) goto L15;
     */
    @Override // com.appsflyer.internal.AFd1ySDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void d() {
        try {
            int i = afErrorLog;
            int i2 = i + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            getLevel = i2 % 128;
            int i3 = i2 % 2;
            boolean z = this.e;
            if (i3 == 0) {
                int i4 = 91 / 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized boolean d(@Nullable AFh1jSDK aFh1jSDK, @Nullable AFh1jSDK aFh1jSDK2) {
        int i = getLevel + 95;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (aFh1jSDK == null) {
            AFLoggerLogLevel();
            return false;
        }
        if (TimeUnit.SECONDS.toMillis(aFh1jSDK.unregisterClient) <= AFh1jSDK.registerClient()) {
            return false;
        }
        if (this.force.AFKeystoreWrapper().AFKeystoreWrapper.d("appsFlyerCount", 0) <= aFh1jSDK.registerClient) {
            afErrorLog = (getLevel + 47) % 128;
            if (!AFLogger(aFh1jSDK, aFh1jSDK2)) {
                return false;
            }
            if (!d(aFh1jSDK.d)) {
                getLevel = (afErrorLog + 53) % 128;
                return false;
            }
            if (registerClient(aFh1jSDK.e)) {
                return true;
            }
            int i2 = getLevel + 93;
            afErrorLog = i2 % 128;
            return i2 % 2 != 0 ? false : false;
        }
        getLevel = (afErrorLog + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        return false;
    }

    @Override // com.appsflyer.internal.AFd1ySDK
    public final synchronized void registerClient() {
        try {
            int i = getLevel + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            afErrorLog = i % 128;
            if (i % 2 != 0) {
                this.d = true;
            } else {
                this.d = false;
            }
            AFKeystoreWrapper();
            afErrorLog();
        } catch (Throwable th) {
            throw th;
        }
    }

    private static /* synthetic */ Object registerClient(Object[] objArr) {
        AFd1xSDK aFd1xSDK = (AFd1xSDK) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = afErrorLog + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        getLevel = i % 128;
        if (i % 2 == 0) {
            String[] strArr = new String[0];
            strArr[0] = str2;
            aFd1xSDK.registerClient("server_request", str, strArr);
        } else {
            aFd1xSDK.registerClient("server_request", str, str2);
        }
        int i2 = getLevel + 67;
        afErrorLog = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static boolean registerClient(String str) {
        getLevel = (afErrorLog + 83) % 128;
        if (str == null || str.trim().length() == 0) {
            return true;
        }
        getLevel = (afErrorLog + 27) % 128;
        new AFd1vSDK();
        boolean AFLogger = AFd1vSDK.AFLogger(v(), str);
        int i = getLevel + 39;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            int i2 = 36 / 0;
        }
        return AFLogger;
    }

    private boolean registerClient(float f) {
        double d = f;
        if (d >= 1.0d) {
            int i = getLevel + 35;
            afErrorLog = i % 128;
            return i % 2 == 0;
        }
        if (d <= 0.0d) {
            getLevel = (afErrorLog + 107) % 128;
            return false;
        }
        if (i() > f) {
            return false;
        }
        afErrorLog = (getLevel + 93) % 128;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r3.trim().length() == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r3.trim().length() == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        return r3.equals(r2.force.AFKeystoreWrapper().r_().versionName);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean d(String str) {
        if (str != null) {
            int i = getLevel + 113;
            afErrorLog = i % 128;
            if (i % 2 != 0) {
                int i2 = 61 / 0;
            }
        }
        afErrorLog = (getLevel + 19) % 128;
        return true;
    }

    @Nullable
    private static AFh1jSDK d(@Nullable AFh1lSDK aFh1lSDK) {
        AFh1rSDK aFh1rSDK;
        if (aFh1lSDK == null) {
            return null;
        }
        int i = getLevel;
        int i2 = i + 87;
        afErrorLog = i2 % 128;
        if (i2 % 2 != 0) {
            aFh1rSDK = aFh1lSDK.AFKeystoreWrapper;
            int i3 = 43 / 0;
            if (aFh1rSDK == null) {
                return null;
            }
        } else {
            aFh1rSDK = aFh1lSDK.AFKeystoreWrapper;
            if (aFh1rSDK == null) {
                return null;
            }
        }
        AFh1jSDK aFh1jSDK = aFh1rSDK.unregisterClient;
        afErrorLog = (i + 109) % 128;
        return aFh1jSDK;
    }

    private Map<String, Object> unregisterClient(String str) {
        int i = getLevel + 85;
        afErrorLog = i % 128;
        int i2 = i % 2;
        AFc1aSDK aFc1aSDK = this.force;
        if (i2 == 0) {
            unregisterClient(str, aFc1aSDK.setImeiData());
            return afDebugLog();
        }
        unregisterClient(str, aFc1aSDK.setImeiData());
        afDebugLog();
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1ySDK
    public final void unregisterClient() {
        int i = afErrorLog + 37;
        getLevel = i % 128;
        this.i = i % 2 == 0;
    }

    private static String[] unregisterClient(String str, StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            int i = afErrorLog + 79;
            getLevel = i % 128;
            return i % 2 == 0 ? new String[]{str} : new String[]{str};
        }
        String[] strArr = new String[stackTraceElementArr.length + 1];
        strArr[0] = str;
        getLevel = (afErrorLog + 61) % 128;
        for (int i2 = 1; i2 < stackTraceElementArr.length; i2++) {
            strArr[i2] = stackTraceElementArr[i2].toString();
        }
        return strArr;
    }

    private static /* synthetic */ Object unregisterClient(Object[] objArr) {
        AFd1xSDK aFd1xSDK = (AFd1xSDK) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        afErrorLog = (getLevel + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
        aFd1xSDK.force.registerClient().unregisterClient("participantInProxy", booleanValue);
        int i = getLevel + 79;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            int i2 = 64 / 0;
        }
        return null;
    }

    private void unregisterClient(boolean z) {
        AFKeystoreWrapper(new Object[]{this, Boolean.valueOf(z)}, -45396201, 45396201, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1ySDK
    public final void unregisterClient(String str, String str2) {
        AFKeystoreWrapper(new Object[]{this, str, str2}, 591779139, -591779137, System.identityHashCode(this));
    }
}
