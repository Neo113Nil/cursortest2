package com.appsflyer.internal;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFg1xSDK;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.util.AndroidExtensionsKt;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.ironsource.L6;
import com.ironsource.U3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.dmi;
import defpackage.joa;
import defpackage.p2g;
import defpackage.tub;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.ypa;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFg1uSDK implements AFf1bSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static byte[] AppsFlyerLib = {-102, -17, 1, 19, -46, 27, -21, -9, 10, 11, -42, 31, 31, 39, 17, -108, 118, 65, 111, 84};
    private static int enableTCFDataCollection = 0;
    private static short[] getEntries = null;
    private static int getInstance = 1;
    private static int getLevel = 522035573;
    private static int valueOf = 843830731;
    private static int values = -1494695906;

    @NotNull
    private final AFi1jSDK AFKeystoreWrapper;

    @NotNull
    private final AFg1xSDK AFLogger;

    @NotNull
    private final AppsFlyerProperties AFLoggerLogLevel;

    @NotNull
    private final AFc1gSDK afDebugLog;

    @NotNull
    private final AFc1cSDK afErrorLog;

    @NotNull
    private final joa afInfoLog;

    @NotNull
    private final AFf1iSDK afWarnLog;

    @NotNull
    private final Context d;

    @NotNull
    private final AFf1oSDK e;

    @NotNull
    private final AFh1fSDK force;

    @NotNull
    private final AFc1hSDK i;

    @NotNull
    private final AFg1ySDK registerClient;

    @NotNull
    private final AFj1mSDK unregisterClient;

    @NotNull
    private final AFc1pSDK v;

    @NotNull
    private final AFg1fSDK w;

    public AFg1uSDK(@NotNull Context context, @NotNull AFj1mSDK aFj1mSDK, @NotNull AFg1xSDK aFg1xSDK, @NotNull AFi1jSDK aFi1jSDK, @NotNull AFg1ySDK aFg1ySDK, @NotNull AFg1fSDK aFg1fSDK, @NotNull AFc1pSDK aFc1pSDK, @NotNull AFc1hSDK aFc1hSDK, @NotNull AFh1fSDK aFh1fSDK, @NotNull AFf1oSDK aFf1oSDK, @NotNull AFc1cSDK aFc1cSDK, @NotNull AFf1iSDK aFf1iSDK, @NotNull AFc1gSDK aFc1gSDK, @NotNull AppsFlyerProperties appsFlyerProperties) {
        context.getClass();
        aFj1mSDK.getClass();
        aFg1xSDK.getClass();
        aFi1jSDK.getClass();
        aFg1ySDK.getClass();
        aFg1fSDK.getClass();
        aFc1pSDK.getClass();
        aFc1hSDK.getClass();
        aFh1fSDK.getClass();
        aFf1oSDK.getClass();
        aFc1cSDK.getClass();
        aFf1iSDK.getClass();
        aFc1gSDK.getClass();
        appsFlyerProperties.getClass();
        this.d = context;
        this.unregisterClient = aFj1mSDK;
        this.AFLogger = aFg1xSDK;
        this.AFKeystoreWrapper = aFi1jSDK;
        this.registerClient = aFg1ySDK;
        this.w = aFg1fSDK;
        this.v = aFc1pSDK;
        this.i = aFc1hSDK;
        this.force = aFh1fSDK;
        this.e = aFf1oSDK;
        this.afErrorLog = aFc1cSDK;
        this.afWarnLog = aFf1iSDK;
        this.afDebugLog = aFc1gSDK;
        this.AFLoggerLogLevel = appsFlyerProperties;
        this.afInfoLog = ypa.b(new com.appsflyer.c(4));
    }

    private final void AFKeystoreWrapper(Map<String, Object> map, int i) {
        try {
            if (this.i.r_().versionCode > this.v.d("versionCode", 0)) {
                getInstance = (enableTCFDataCollection + 79) % 128;
                this.v.AFKeystoreWrapper("versionCode", this.i.r_().versionCode);
                enableTCFDataCollection = (getInstance + 3) % 128;
            }
            map.put("app_version_code", String.valueOf(this.i.r_().versionCode));
            map.put("app_version_name", this.i.r_().versionName);
            map.put("targetSDKver", Integer.valueOf(this.i.registerClient.d.getApplicationInfo().targetSdkVersion));
            map.put("date1", AFLogger().format(new Date(d().longValue())));
            map.put("date2", AFLogger().format(new Date(this.i.r_().lastUpdateTime)));
            Object[] objArr = new Object[1];
            a((byte) (83 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (short) (TextUtils.indexOf("", "") - 6), (ViewConfiguration.getWindowTouchSlop() >> 8) - 52, 1175101199 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 760640653, objArr);
            String intern = ((String) objArr[0]).intern();
            SimpleDateFormat AFLogger = AFLogger();
            AFLogger.getClass();
            map.put(intern, (String) AFLogger(new Object[]{this, AFLogger, Integer.valueOf(i)}, 1110413021, -1110413020, i));
        } catch (Throwable th) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Failed to collect app version and update date information", th, false, true, false, false, 104, null);
        }
    }

    public static Object AFLogger(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = (((~(i | (~i2))) | (~(i2 | i4 | i3))) * 235) + (((~(i4 | i3)) | i2) * (-470)) + (((~((~i3) | i4)) | i2) * (-235)) + (i2 * 471) + (i * 236);
        boolean z = true;
        switch (i5) {
            case 1:
                return d(objArr);
            case 2:
                return unregisterClient(objArr);
            case 3:
                return registerClient(objArr);
            case 4:
                return AFKeystoreWrapper(objArr);
            case 5:
                return i(objArr);
            case 6:
                return force(objArr);
            case 7:
                AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
                AFh1zSDK aFh1zSDK = (AFh1zSDK) objArr[1];
                aFh1zSDK.getClass();
                Map<String, Object> map = aFh1zSDK.AFKeystoreWrapper;
                map.getClass();
                if (aFh1zSDK.v == null) {
                    int i6 = enableTCFDataCollection;
                    getInstance = (i6 + 21) % 128;
                    if (aFh1zSDK.e == null) {
                        getInstance = (i6 + 105) % 128;
                        aFg1uSDK.unregisterClient(map, z);
                        v(map);
                        getSdkVersion(map);
                        aFg1uSDK.unregisterClient(map);
                        aFg1uSDK.unregisterClient(map, aFg1uSDK.afDebugLog.AFLogger);
                        aFg1uSDK.enableTCFDataCollection(map);
                        map.put("cell", tub.h(new Pair("mcc", Integer.valueOf(aFg1uSDK.d.getResources().getConfiguration().mcc)), new Pair("mnc", Integer.valueOf(aFg1uSDK.d.getResources().getConfiguration().mnc))));
                        map.put("sig", aFg1uSDK.AFKeystoreWrapper());
                        map.put("last_boot_time", Long.valueOf(((Long) AFLogger(new Object[0], 597719915, -597719907, (int) System.currentTimeMillis())).longValue()));
                        map.put("disk", w());
                        return null;
                    }
                }
                z = false;
                aFg1uSDK.unregisterClient(map, z);
                v(map);
                getSdkVersion(map);
                aFg1uSDK.unregisterClient(map);
                aFg1uSDK.unregisterClient(map, aFg1uSDK.afDebugLog.AFLogger);
                aFg1uSDK.enableTCFDataCollection(map);
                map.put("cell", tub.h(new Pair("mcc", Integer.valueOf(aFg1uSDK.d.getResources().getConfiguration().mcc)), new Pair("mnc", Integer.valueOf(aFg1uSDK.d.getResources().getConfiguration().mnc))));
                map.put("sig", aFg1uSDK.AFKeystoreWrapper());
                map.put("last_boot_time", Long.valueOf(((Long) AFLogger(new Object[0], 597719915, -597719907, (int) System.currentTimeMillis())).longValue()));
                map.put("disk", w());
                return null;
            case 8:
                return e(objArr);
            case 9:
                AFg1uSDK aFg1uSDK2 = (AFg1uSDK) objArr[0];
                Map map2 = (Map) objArr[1];
                enableTCFDataCollection = (getInstance + 77) % 128;
                map2.getClass();
                String unregisterClient = AFb1mSDK.unregisterClient(aFg1uSDK2.i.AFKeystoreWrapper);
                if (unregisterClient != null) {
                    map2.put("uid", unregisterClient);
                    if (aFg1uSDK2.i.AFKeystoreWrapper.registerClient("CUSTOM_INSTALL_ID_APPLIED")) {
                        map2.put("custom_install_id", Boolean.TRUE);
                        getInstance = (enableTCFDataCollection + 3) % 128;
                    }
                }
                return null;
            case 10:
                return v(objArr);
            case 11:
                return w(objArr);
            default:
                return AFLogger(objArr);
        }
    }

    private final String AFLoggerLogLevel() {
        int i = enableTCFDataCollection + 97;
        getInstance = i % 128;
        if (i % 2 == 0) {
            AFLogger((File) AFLogger(new Object[]{AFLogger("ro.appsflyer.preinstall.path")}, -672101371, 672101373, (int) System.currentTimeMillis()));
            throw null;
        }
        File file = (File) AFLogger(new Object[]{AFLogger("ro.appsflyer.preinstall.path")}, -672101371, 672101373, (int) System.currentTimeMillis());
        if (AFLogger(file)) {
            file = (File) AFLogger(new Object[]{unregisterClient("AF_PRE_INSTALL_PATH")}, -672101371, 672101373, (int) System.currentTimeMillis());
        }
        if (AFLogger(file)) {
            file = (File) AFLogger(new Object[]{"/data/local/tmp/pre_install.appsflyer"}, -672101371, 672101373, (int) System.currentTimeMillis());
        }
        if (AFLogger(file)) {
            enableTCFDataCollection = (getInstance + 41) % 128;
            file = (File) AFLogger(new Object[]{"/etc/pre_install.appsflyer"}, -672101371, 672101373, (int) System.currentTimeMillis());
        }
        if (AFLogger(file)) {
            return null;
        }
        String packageName = this.d.getPackageName();
        packageName.getClass();
        return d(file, packageName);
    }

    private void AppsFlyerLib(@NotNull Map<String, Object> map) {
        getInstance = (enableTCFDataCollection + 101) % 128;
        map.getClass();
        AFa1tSDK aFa1tSDK = AFa1tSDK.INSTANCE;
        Object unregisterClient = AFa1tSDK.unregisterClient(this.AFLoggerLogLevel);
        String AFLogger = AFa1tSDK.AFLogger(this.AFLoggerLogLevel);
        if (unregisterClient == null || AFLogger == null) {
            return;
        }
        int i = getInstance + 73;
        enableTCFDataCollection = i % 128;
        if (i % 2 != 0) {
            Integer.parseInt(AFLogger);
            throw null;
        }
        if (Integer.parseInt(AFLogger) > 0) {
            int i2 = getInstance + 81;
            enableTCFDataCollection = i2 % 128;
            if (i2 % 2 == 0) {
                map.put("reinstallCounter", AFLogger);
                map.put("originalAppsflyerId", unregisterClient);
            } else {
                map.put("reinstallCounter", AFLogger);
                map.put("originalAppsflyerId", unregisterClient);
                throw null;
            }
        }
    }

    private static void a(byte b, short s, int i, int i2, int i3, Object[] objArr) {
        int i4;
        char c;
        int length;
        byte[] bArr;
        int length2;
        byte[] bArr2;
        AFj1eSDK aFj1eSDK = new AFj1eSDK();
        StringBuilder sb = new StringBuilder();
        int i5 = i + ((int) (getLevel ^ 8464533719416152390L));
        boolean z = i5 == -1;
        if (z) {
            byte[] bArr3 = AppsFlyerLib;
            if (bArr3 != null) {
                int i6 = $10 + 47;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    length2 = bArr3.length;
                    bArr2 = new byte[length2];
                } else {
                    length2 = bArr3.length;
                    bArr2 = new byte[length2];
                }
                int i7 = 0;
                while (i7 < length2) {
                    int i8 = $10 + 109;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        bArr2[i7] = (byte) (bArr3[i7] % 8464533719416152390L);
                        i7 >>= 1;
                    } else {
                        bArr2[i7] = (byte) (bArr3[i7] ^ 8464533719416152390L);
                        i7++;
                    }
                }
                bArr3 = bArr2;
            }
            if (bArr3 != null) {
                i5 = (byte) (((byte) (AppsFlyerLib[i3 + ((int) (valueOf ^ 8464533719416152390L))] ^ 8464533719416152390L)) + ((int) (getLevel ^ 8464533719416152390L)));
            } else {
                i5 = (short) (((short) (getEntries[i3 + ((int) (valueOf ^ 8464533719416152390L))] ^ 8464533719416152390L)) + ((int) (getLevel ^ 8464533719416152390L)));
                $10 = ($11 + 5) % 128;
            }
        }
        if (i5 > 0) {
            int i9 = ((i3 + i5) - 2) + ((int) (valueOf ^ 8464533719416152390L));
            if (z) {
                $10 = ($11 + 41) % 128;
                i4 = 1;
            } else {
                i4 = 0;
            }
            aFj1eSDK.registerClient = i9 + i4;
            char c2 = (char) (((int) (values ^ 8464533719416152390L)) + i2);
            aFj1eSDK.AFKeystoreWrapper = c2;
            sb.append(c2);
            aFj1eSDK.AFLogger = aFj1eSDK.AFKeystoreWrapper;
            byte[] bArr4 = AppsFlyerLib;
            if (bArr4 != null) {
                int i10 = $10 + 15;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    length = bArr4.length;
                    bArr = new byte[length];
                } else {
                    length = bArr4.length;
                    bArr = new byte[length];
                }
                for (int i11 = 0; i11 < length; i11++) {
                    bArr[i11] = (byte) (bArr4[i11] ^ 8464533719416152390L);
                }
                bArr4 = bArr;
            }
            boolean z2 = bArr4 != null;
            aFj1eSDK.d = 1;
            while (aFj1eSDK.d < i5) {
                $11 = ($10 + 21) % 128;
                int i12 = aFj1eSDK.registerClient;
                if (z2) {
                    byte[] bArr5 = AppsFlyerLib;
                    aFj1eSDK.registerClient = i12 - 1;
                    c = (char) (aFj1eSDK.AFLogger + (((byte) (((byte) (bArr5[i12] ^ 8464533719416152390L)) + s)) ^ b));
                    aFj1eSDK.AFKeystoreWrapper = c;
                } else {
                    short[] sArr = getEntries;
                    aFj1eSDK.registerClient = i12 - 1;
                    c = (char) (aFj1eSDK.AFLogger + (((short) (((short) (sArr[i12] ^ 8464533719416152390L)) + s)) ^ b));
                    aFj1eSDK.AFKeystoreWrapper = c;
                }
                sb.append(c);
                aFj1eSDK.AFLogger = aFj1eSDK.AFKeystoreWrapper;
                aFj1eSDK.d++;
            }
        }
        objArr[0] = sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat afDebugLog() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
        int i = enableTCFDataCollection + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        getInstance = i % 128;
        if (i % 2 != 0) {
            return simpleDateFormat;
        }
        throw null;
    }

    private final String afErrorLog() {
        String d = this.v.d("androidIdCached");
        try {
            String string = Settings.Secure.getString(this.d.getContentResolver(), "android_id");
            if (string != null) {
                enableTCFDataCollection = (getInstance + 113) % 128;
                return string;
            }
        } catch (Exception e) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.DEVICE_DATA;
            String message = e.getMessage();
            if (message == null) {
                message = "Failed to retrieve Android ID from Settings.Secure";
            }
            AFLoggerBase.e$default(aFLogger, logTag, message, e, false, false, false, false, 120, null);
        }
        if (d == null) {
            int i = getInstance + 101;
            enableTCFDataCollection = i % 128;
            if (i % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i2 = getInstance + 97;
        enableTCFDataCollection = i2 % 128;
        if (i2 % 2 != 0) {
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, dmi.q("Using cached Android ID (current retrieval failed): ", d), false, 5, null);
            return d;
        }
        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, dmi.q("Using cached Android ID (current retrieval failed): ", d), false, 4, null);
        return d;
    }

    private void afInfoLog(@NotNull Map<String, Object> map) {
        long j;
        map.getClass();
        long AFKeystoreWrapper = this.v.AFKeystoreWrapper("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        this.v.AFLogger("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        if (AFKeystoreWrapper > 0) {
            int i = getInstance + 49;
            enableTCFDataCollection = i % 128;
            int i2 = i % 2;
            j = (currentTimeMillis - AFKeystoreWrapper) / 1000;
        } else {
            j = -1;
        }
        map.put("timepassedsincelastlaunch", String.valueOf(j));
        getInstance = (enableTCFDataCollection + 19) % 128;
    }

    private final boolean afWarnLog() {
        int i = getInstance + 105;
        enableTCFDataCollection = i % 128;
        int i2 = i % 2;
        AFc1gSDK aFc1gSDK = this.afDebugLog;
        if (i2 != 0) {
            boolean z = aFc1gSDK.e;
            int i3 = 54 / 0;
            if (z) {
                return true;
            }
        } else if (aFc1gSDK.e) {
            return true;
        }
        if (!AFi1cSDK.d(this.d)) {
            return true;
        }
        int i4 = enableTCFDataCollection + 65;
        getInstance = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String d(File file, String str) {
        Throwable th;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        int i = enableTCFDataCollection;
        getInstance = (i + 9) % 128;
        if (file == null) {
            int i2 = i + 89;
            getInstance = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        }
        try {
            Properties properties = new Properties();
            inputStreamReader2 = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                properties.load(inputStreamReader2);
                AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.PREINSTALL, "Preinstall configuration file found and loaded successfully", false, 4, null);
                String property = properties.getProperty(str);
                try {
                    inputStreamReader2.close();
                    return property;
                } catch (Throwable th2) {
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    LogTag logTag = LogTag.PREINSTALL;
                    String message = th2.getMessage();
                    AFLoggerBase.e$default(aFLogger, logTag, "Error closing preinstall configuration file reader: ".concat(message != null ? message : "unknown error"), th2, false, false, false, false, 120, null);
                    getInstance = (enableTCFDataCollection + 87) % 128;
                    return property;
                }
            } catch (FileNotFoundException unused) {
                try {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.PREINSTALL, "Preinstall configuration file not found at path: " + file.getAbsolutePath(), false, 4, null);
                    if (inputStreamReader2 != null) {
                        try {
                            inputStreamReader2.close();
                        } catch (Throwable th3) {
                            AFLogger aFLogger2 = AFLogger.INSTANCE;
                            LogTag logTag2 = LogTag.PREINSTALL;
                            String message2 = th3.getMessage();
                            AFLoggerBase.e$default(aFLogger2, logTag2, "Error closing preinstall configuration file reader: ".concat(message2 != null ? message2 : "unknown error"), th3, false, false, false, false, 120, null);
                        }
                    }
                    return null;
                } catch (Throwable th4) {
                    th = th4;
                    Throwable th5 = th;
                    if (inputStreamReader2 != null) {
                        getInstance = (enableTCFDataCollection + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
                        throw th5;
                    }
                    try {
                        inputStreamReader2.close();
                        throw th5;
                    } catch (Throwable th6) {
                        AFLogger aFLogger3 = AFLogger.INSTANCE;
                        LogTag logTag3 = LogTag.PREINSTALL;
                        String message3 = th6.getMessage();
                        AFLoggerBase.e$default(aFLogger3, logTag3, "Error closing preinstall configuration file reader: ".concat(message3 != null ? message3 : "unknown error"), th6, false, false, false, false, 120, null);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                inputStreamReader = inputStreamReader2;
                try {
                    AFLogger aFLogger4 = AFLogger.INSTANCE;
                    LogTag logTag4 = LogTag.PREINSTALL;
                    String message4 = th.getMessage();
                    if (message4 == null) {
                        message4 = "unknown error";
                    }
                    AFLoggerBase.e$default(aFLogger4, logTag4, "Error reading preinstall configuration file: ".concat(message4), th, false, false, false, false, 120, null);
                    if (inputStreamReader != null) {
                        try {
                            inputStreamReader.close();
                        } catch (Throwable th8) {
                            AFLogger aFLogger5 = AFLogger.INSTANCE;
                            LogTag logTag5 = LogTag.PREINSTALL;
                            String message5 = th8.getMessage();
                            AFLoggerBase.e$default(aFLogger5, logTag5, "Error closing preinstall configuration file reader: ".concat(message5 != null ? message5 : "unknown error"), th8, false, false, false, false, 120, null);
                        }
                    }
                    return null;
                } catch (Throwable th9) {
                    th = th9;
                    inputStreamReader2 = inputStreamReader;
                    Throwable th52 = th;
                    if (inputStreamReader2 != null) {
                    }
                }
            }
        } catch (FileNotFoundException unused2) {
            inputStreamReader2 = null;
        } catch (Throwable th10) {
            th = th10;
            inputStreamReader = null;
        }
    }

    private void e(@NotNull Map<String, Object> map) {
        map.getClass();
        String str = this.afDebugLog.AFLoggerLogLevel;
        String string = this.AFLoggerLogLevel.getString(AppsFlyerProperties.ONELINK_VERSION);
        if (str != null) {
            int i = enableTCFDataCollection + 65;
            getInstance = i % 128;
            if (i % 2 == 0) {
                map.put("onelink_id", str);
                int i2 = 43 / 0;
            } else {
                map.put("onelink_id", str);
            }
            enableTCFDataCollection = (getInstance + 113) % 128;
        }
        if (string != null) {
            map.put("onelink_ver", string);
        }
        getInstance = (enableTCFDataCollection + 91) % 128;
    }

    private void enableTCFDataCollection(@NotNull Map<String, Object> map) {
        getInstance = (enableTCFDataCollection + 87) % 128;
        map.getClass();
        AFb1kSDK h_ = AFb1jSDK.h_(this.d.getContentResolver());
        if (h_ != null) {
            map.put("amazon_aid", h_.registerClient);
            map.put("amazon_aid_limit", String.valueOf(h_.AFKeystoreWrapper));
            int i = getInstance + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            enableTCFDataCollection = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    private static /* synthetic */ Object force(Object[] objArr) {
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        Map map = (Map) objArr[1];
        map.getClass();
        AFf1oSDK aFf1oSDK = aFg1uSDK.e;
        String str = (String) AFf1oSDK.AFLogger(new Object[]{aFf1oSDK}, 343398987, -343398985, System.identityHashCode(aFf1oSDK));
        if (str != null) {
            enableTCFDataCollection = (getInstance + 83) % 128;
            if (str.length() != 0) {
                map.put("appsflyerKey", str);
            }
        }
        int i = getInstance + 51;
        enableTCFDataCollection = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    private void getEntries(@NotNull Map<String, Object> map) {
        enableTCFDataCollection = (getInstance + 103) % 128;
        map.getClass();
        map.putAll(this.afWarnLog.d());
        int i = enableTCFDataCollection + 95;
        getInstance = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if (r0 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r0 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        r9.put("tokenRefreshConfigured", java.lang.Boolean.FALSE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getInstance(@NotNull Map<String, Object> map) {
        int i = enableTCFDataCollection + 21;
        getInstance = i % 128;
        if (i % 2 == 0) {
            map.getClass();
            boolean registerClient = AFf1fSDK.registerClient(this.d);
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.UNINSTALL, i.j("didConfigureTokenRefreshService=", registerClient), false, 3, null);
        } else {
            map.getClass();
            boolean registerClient2 = AFf1fSDK.registerClient(this.d);
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.UNINSTALL, i.j("didConfigureTokenRefreshService=", registerClient2), false, 4, null);
        }
        map.put("registeredUninstall", Boolean.valueOf(this.v.registerClient("sentRegisterRequestToAF")));
        enableTCFDataCollection = (getInstance + 101) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getLevel(@NotNull Map<String, Object> map) {
        boolean z;
        int i = getInstance + 35;
        enableTCFDataCollection = i % 128;
        if (i % 2 != 0) {
            map.getClass();
            this.i.AFLogger("CHANNEL");
            throw null;
        }
        map.getClass();
        String AFLogger = this.i.AFLogger("CHANNEL");
        if (AFLogger != null && AFLogger.equals("")) {
            AFLogger = null;
        }
        String AFLogger2 = AFLogger(this.v, AFLogger);
        boolean z2 = false;
        if (AFLogger2 == null || AFLogger2.equals(AFLogger)) {
            z = false;
        } else {
            getInstance = (enableTCFDataCollection + 57) % 128;
            z = true;
        }
        if (AFLogger2 == null) {
            int i2 = enableTCFDataCollection;
            int i3 = i2 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            getInstance = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (AFLogger != null) {
                getInstance = (i2 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
                z2 = true;
            }
        }
        if (!z) {
            enableTCFDataCollection = (getInstance + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
        }
        map.put("af_latestchannel", AFLogger);
        String str = (String) AFLogger(new Object[]{this}, 1378434609, -1378434599, System.identityHashCode(this));
        if (str != null) {
            Locale locale = Locale.ROOT;
            locale.getClass();
            Object lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            map.put("af_installstore", lowerCase);
        }
        String v = v();
        if (v != null) {
            Locale locale2 = Locale.ROOT;
            locale2.getClass();
            Object lowerCase2 = v.toLowerCase(locale2);
            lowerCase2.getClass();
            map.put("af_preinstall_name", lowerCase2);
        }
        String str2 = (String) AFLogger(new Object[]{this}, 1657001612, -1657001607, System.identityHashCode(this));
        if (str2 != null) {
            Locale locale3 = Locale.ROOT;
            locale3.getClass();
            Object lowerCase3 = str2.toLowerCase(locale3);
            lowerCase3.getClass();
            map.put("af_currentstore", lowerCase3);
        }
    }

    private static void getSdkVersion(@NotNull Map<String, Object> map) {
        getInstance = (enableTCFDataCollection + 43) % 128;
        map.getClass();
        Locale locale = Locale.getDefault();
        try {
            map.put(L6.q, locale.getDisplayLanguage());
            enableTCFDataCollection = (getInstance + 43) % 128;
        } catch (Exception e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Failed to retrieve device display language name", e, false, false, false, false, 120, null);
            map.put(L6.q, locale.getLanguage());
        }
        try {
            map.put("lang_code", locale.getLanguage());
        } catch (Exception e2) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Failed to retrieve device language code", e2, false, false, false, false, 120, null);
        }
        try {
            map.put("country", locale.getCountry());
            enableTCFDataCollection = (getInstance + 107) % 128;
        } catch (Exception e3) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Failed to retrieve device country code", e3, false, false, false, false, 120, null);
        }
    }

    private final void i(Map<String, Object> map) {
        try {
            long longValue = d().longValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(longValue)));
            getInstance = (enableTCFDataCollection + 47) % 128;
        } catch (Exception e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Failed to retrieve or format app install date", e, false, false, false, false, 120, null);
        }
    }

    private void onPause(@NotNull Map<String, Object> map) {
        int i = enableTCFDataCollection + 53;
        getInstance = i % 128;
        if (i % 2 == 0) {
            map.getClass();
            this.v.AFKeystoreWrapper("is_stop_tracking_used");
            throw null;
        }
        map.getClass();
        if (this.v.AFKeystoreWrapper("is_stop_tracking_used")) {
            map.put("istu", String.valueOf(this.v.registerClient("is_stop_tracking_used")));
        }
        getInstance = (enableTCFDataCollection + 45) % 128;
    }

    private void setDebugLog(@NotNull Map<String, Object> map) {
        String str;
        enableTCFDataCollection = (getInstance + 17) % 128;
        map.getClass();
        String AFLogger = this.i.AFLogger("AF_COLLECT_FACEBOOK_ATTR_ID");
        if (AFLogger != null ? Boolean.parseBoolean(AFLogger) : true) {
            getInstance = (enableTCFDataCollection + 13) % 128;
            try {
                this.d.getPackageManager().getApplicationInfo(FbValidationUtils.FB_PACKAGE, 0);
                str = this.i.unregisterClient(this.d);
            } catch (Throwable unused) {
                str = null;
            }
            if (str != null) {
                enableTCFDataCollection = (getInstance + 111) % 128;
                map.put("fb", str);
                getInstance = (enableTCFDataCollection + 97) % 128;
            }
        }
    }

    private void stop(@NotNull Map<String, Object> map) {
        AFLogger(new Object[]{this, map}, 402873589, -402873583, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0050, code lost:
    
        if (r4.i.AFKeystoreWrapper.d("appsFlyerCount", 0) <= 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0060, code lost:
    
        com.appsflyer.internal.AFg1uSDK.enableTCFDataCollection = (com.appsflyer.internal.AFg1uSDK.getInstance + 47) % 128;
        r0.putAll(r4.AFKeystoreWrapper.AFKeystoreWrapper());
        com.appsflyer.internal.AFg1uSDK.enableTCFDataCollection = (com.appsflyer.internal.AFg1uSDK.getInstance + 41) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005e, code lost:
    
        if (r4.i.AFKeystoreWrapper.d("appsFlyerCount", 0) <= 2) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void unregisterClient(@NotNull Map<String, Object> map, boolean z) {
        map.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", AFLogger("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", AFLogger("ro.product.cpu.abi2"));
        hashMap.put("arch", AFLogger("os.arch"));
        hashMap.put("build_display_id", AFLogger("ro.build.display.id"));
        if (z) {
            int i = enableTCFDataCollection + 67;
            getInstance = i % 128;
            if (i % 2 == 0) {
                w(hashMap);
            } else {
                w(hashMap);
            }
        }
        hashMap.put("dim", this.registerClient.registerClient(this.d));
        map.put("deviceData", hashMap);
    }

    private static void v(@NotNull Map<String, Object> map) {
        getInstance = (enableTCFDataCollection + 9) % 128;
        map.getClass();
        Object[] objArr = new Object[1];
        a((byte) (100 - (ViewConfiguration.getScrollBarSize() >> 8)), (short) (99 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 52, 1175101193 - TextUtils.indexOf((CharSequence) "", '0', 0), (-760640638) - View.combineMeasuredStates(0, 0), objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put(U3.i.G, Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put(L6.B, Build.MODEL);
        map.put("deviceType", Build.TYPE);
        enableTCFDataCollection = (getInstance + 87) % 128;
    }

    private void valueOf(@NotNull Map<String, Object> map) {
        int i = enableTCFDataCollection + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        getInstance = i % 128;
        if (i % 2 == 0) {
            map.getClass();
            map.put("af_preinstalled", String.valueOf(this.i.registerClient(this.d)));
            throw null;
        }
        map.getClass();
        map.put("af_preinstalled", String.valueOf(this.i.registerClient(this.d)));
        int i2 = getInstance + Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE;
        enableTCFDataCollection = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private void values(@NotNull Map<String, Object> map) {
        AFLogger(new Object[]{this, map}, 2083181279, -2083181275, System.identityHashCode(this));
    }

    @NotNull
    private static String w() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double pow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / pow)) + "/" + ((long) (blockCountLong / pow));
        getInstance = (enableTCFDataCollection + 79) % 128;
        return str;
    }

    @Override // com.appsflyer.internal.AFf1bSDK
    public final void registerClient(@NotNull Map<String, Object> map) {
        Object obj;
        map.getClass();
        Object obj2 = this.afDebugLog.afErrorLog;
        if (obj2 != null) {
            enableTCFDataCollection = (getInstance + 95) % 128;
            map.put("appid", obj2);
        }
        String str = this.afDebugLog.getLevel;
        if (str != null) {
            if (str.length() != 3) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                LogTag logTag = LogTag.GENERAL;
                StringBuilder sb = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb.append(str);
                sb.append("' is not a legal value.");
                AFLoggerBase.w$default(aFLogger, logTag, sb.toString(), false, 4, null);
            }
            map.put(InAppPurchaseMetaData.KEY_CURRENCY, str);
            getInstance = (enableTCFDataCollection + 69) % 128;
        }
        map.put("isUpdate", Boolean.valueOf(this.afDebugLog.afWarnLog));
        Object obj3 = this.afDebugLog.values;
        if (obj3 != null) {
            map.put("customData", obj3);
            getInstance = (enableTCFDataCollection + 15) % 128;
        }
        Object obj4 = this.afDebugLog.afDebugLog;
        if (obj4 != null) {
            map.put("appUserId", obj4);
        }
        Object obj5 = this.afDebugLog.valueOf;
        if (obj5 != null) {
            map.put("user_emails", obj5);
        }
        AFb1qSDK aFb1qSDK = this.afDebugLog.registerClient;
        if (aFb1qSDK == null || (obj = aFb1qSDK.AFKeystoreWrapper) == null) {
            return;
        }
        map.put("sharing_filter", obj);
        int i = getInstance + 49;
        enableTCFDataCollection = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private final void afDebugLog(Map<String, Object> map) {
        AFLogger(new Object[]{this, map}, -2067034288, 2067034288, System.identityHashCode(this));
    }

    private void afWarnLog(@NotNull Map<String, Object> map) {
        getInstance = (enableTCFDataCollection + 63) % 128;
        map.getClass();
        map.put("is_pc", Boolean.valueOf(this.d.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        getInstance = (enableTCFDataCollection + 27) % 128;
    }

    private static List<AFd1aSDK> afInfoLog() {
        enableTCFDataCollection = (getInstance + 77) % 128;
        List<AFd1aSDK> j = kotlin.collections.b.j(AFd1aSDK.unregisterClient, AFd1aSDK.afInfoLog, AFd1aSDK.afWarnLog, AFd1aSDK.AFLoggerLogLevel, AFd1aSDK.getEntries, AFd1aSDK.valueOf, AFd1aSDK.AppsFlyerLib);
        enableTCFDataCollection = (getInstance + 15) % 128;
        return j;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        enableTCFDataCollection = (getInstance + 41) % 128;
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        int i = enableTCFDataCollection + 1;
        getInstance = i % 128;
        if (i % 2 != 0) {
            return Long.valueOf(currentTimeMillis);
        }
        int i2 = 24 / 0;
        return Long.valueOf(currentTimeMillis);
    }

    @Nullable
    private String e() {
        return (String) AFLogger(new Object[]{this}, 1378434609, -1378434599, System.identityHashCode(this));
    }

    private static /* synthetic */ Object i(Object[] objArr) {
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        int i = enableTCFDataCollection;
        int i2 = i + 69;
        getInstance = i2 % 128;
        if (i2 % 2 != 0) {
            String str = aFg1uSDK.afDebugLog.afInfoLog;
            if (str == null) {
                str = aFg1uSDK.unregisterClient("AF_STORE");
                i = (getInstance + 27) % 128;
                enableTCFDataCollection = i;
            }
            getInstance = (i + 91) % 128;
            return str;
        }
        String str2 = aFg1uSDK.afDebugLog.afInfoLog;
        throw null;
    }

    private static /* synthetic */ Object w(Object[] objArr) {
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i = enableTCFDataCollection + 97;
        getInstance = i % 128;
        if (i % 2 != 0) {
            String str = aFg1uSDK.afDebugLog.setCustomerUserId;
            if (str == null) {
                return null;
            }
            map.put("net_token", str);
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "Network token added to event", false, 4, null);
            int i2 = getInstance + 43;
            enableTCFDataCollection = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        }
        String str2 = aFg1uSDK.afDebugLog.setCustomerUserId;
        throw null;
    }

    private boolean force() {
        int i = getInstance + 29;
        enableTCFDataCollection = i % 128;
        int i2 = i % 2;
        String d = this.v.d("sentSuccessfully");
        if (i2 != 0) {
            Boolean.parseBoolean(d);
            throw null;
        }
        boolean parseBoolean = Boolean.parseBoolean(d);
        int i3 = enableTCFDataCollection + 107;
        getInstance = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 38 / 0;
        }
        return parseBoolean;
    }

    private void force(@NotNull Map<String, Object> map) {
        map.getClass();
        AFg1fSDK aFg1fSDK = this.w;
        HashMap hashMap = new HashMap(aFg1fSDK.AFKeystoreWrapper);
        aFg1fSDK.AFKeystoreWrapper.clear();
        aFg1fSDK.AFLogger.AFLogger("gcd");
        if (hashMap.isEmpty()) {
            return;
        }
        int i = (getInstance + 75) % 128;
        enableTCFDataCollection = i;
        getInstance = (i + 105) % 128;
        AFj1tSDK.d(map).put("gcd", hashMap);
    }

    @Nullable
    private String i() {
        return (String) AFLogger(new Object[]{this}, 1657001612, -1657001607, System.identityHashCode(this));
    }

    private final void w(Map<String, Object> map) {
        enableTCFDataCollection = (getInstance + 93) % 128;
        AFg1xSDK.AFa1zSDK AFKeystoreWrapper = this.AFLogger.AFKeystoreWrapper(this.d);
        float f = AFKeystoreWrapper.AFLogger;
        String str = AFKeystoreWrapper.d;
        map.put("btl", String.valueOf(f));
        if (str != null) {
            enableTCFDataCollection = (getInstance + 109) % 128;
            map.put("btch", str);
        }
    }

    private final void afErrorLog(Map<String, Object> map) {
        UiModeManager uiModeManager;
        int i = getInstance + 19;
        enableTCFDataCollection = i % 128;
        if (i % 2 != 0 && Build.VERSION.SDK_INT < 69) {
            Object systemService = this.d.getSystemService("uimode");
            if (systemService instanceof UiModeManager) {
                getInstance = (enableTCFDataCollection + 1) % 128;
                uiModeManager = (UiModeManager) systemService;
            } else {
                uiModeManager = null;
            }
        } else {
            uiModeManager = (UiModeManager) this.d.getSystemService(UiModeManager.class);
        }
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            return;
        }
        enableTCFDataCollection = (getInstance + 81) % 128;
        map.put("tv", Boolean.TRUE);
        enableTCFDataCollection = (getInstance + 71) % 128;
    }

    @Nullable
    private String v() {
        int i;
        int i2 = getInstance + 65;
        enableTCFDataCollection = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerProperties appsFlyerProperties = this.AFLoggerLogLevel;
        if (i3 == 0) {
            String string = appsFlyerProperties.getString("preInstallName");
            if (string != null) {
                return string;
            }
            String d = this.v.d("preInstallName");
            if (d != null) {
                this.AFLoggerLogLevel.set("preInstallName", d);
                i = getInstance + 101;
            } else {
                d = AFLoggerLogLevel();
                if (d == null) {
                    d = unregisterClient("AF_PRE_INSTALL_NAME");
                }
                if (d == null) {
                    return d;
                }
                this.v.d("preInstallName", d);
                this.AFLoggerLogLevel.set("preInstallName", d);
                i = getInstance + 35;
            }
            enableTCFDataCollection = i % 128;
            return d;
        }
        appsFlyerProperties.getString("preInstallName");
        throw null;
    }

    private void unregisterClient(@NotNull Map<String, Object> map, @Nullable String str) {
        map.getClass();
        AFc1gSDK aFc1gSDK = this.afDebugLog;
        if (aFc1gSDK.v) {
            map.put("deviceTrackingDisabled", "true");
            return;
        }
        String str2 = aFc1gSDK.force;
        if (str2 != null && str2.length() != 0) {
            map.put("imei", str2);
        } else {
            getInstance = (enableTCFDataCollection + 85) % 128;
        }
        String AFKeystoreWrapper = AFKeystoreWrapper(str);
        if (AFKeystoreWrapper != null) {
            int i = getInstance + 81;
            enableTCFDataCollection = i % 128;
            int i2 = i % 2;
            AFc1pSDK aFc1pSDK = this.v;
            if (i2 == 0) {
                aFc1pSDK.d("androidIdCached", AFKeystoreWrapper);
                map.put("android_id", AFKeystoreWrapper);
            } else {
                aFc1pSDK.d("androidIdCached", AFKeystoreWrapper);
                map.put("android_id", AFKeystoreWrapper);
                throw null;
            }
        } else {
            AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, "Android ID collection skipped: not available or not permitted", false, 4, null);
        }
        AFb1kSDK d = AFb1jSDK.d(this.d);
        if (d != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("isManual", d.unregisterClient);
            linkedHashMap.put("val", d.registerClient);
            Boolean bool = d.AFKeystoreWrapper;
            if (bool != null) {
                linkedHashMap.put("isLat", bool);
            }
            map.put("oaid", linkedHashMap);
        }
    }

    private static /* synthetic */ Object v(Object[] objArr) {
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        String d = aFg1uSDK.v.d("INSTALL_STORE");
        if (d != null) {
            getInstance = (enableTCFDataCollection + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
            return d;
        }
        String str = (String) AFLogger(new Object[]{aFg1uSDK}, 1657001612, -1657001607, System.identityHashCode(aFg1uSDK));
        if (str != null) {
            int i = enableTCFDataCollection + 67;
            getInstance = i % 128;
            int i2 = i % 2;
            AFc1pSDK aFc1pSDK = aFg1uSDK.v;
            if (i2 == 0) {
                aFc1pSDK.d("INSTALL_STORE", str);
                int i3 = 5 / 0;
                return str;
            }
            aFc1pSDK.d("INSTALL_STORE", str);
        }
        return str;
    }

    @Override // com.appsflyer.internal.AFf1bSDK
    public final void registerClient(@NotNull Map<String, Object> map, int i, int i2) {
        boolean z;
        map.getClass();
        map.put("counter", String.valueOf(i));
        map.put("iaecounter", String.valueOf(i2));
        if (force()) {
            z = false;
        } else {
            enableTCFDataCollection = (getInstance + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
            z = true;
        }
        map.put("isFirstCall", String.valueOf(z));
        enableTCFDataCollection = (getInstance + 81) % 128;
    }

    private final void AFLoggerLogLevel(Map<String, Object> map) {
        int i = getInstance + 91;
        enableTCFDataCollection = i % 128;
        int i2 = i % 2;
        AFg1xSDK aFg1xSDK = this.AFLogger;
        if (i2 != 0) {
            map.put(U3.j.Y, String.valueOf(aFg1xSDK.AFKeystoreWrapper(this.d).AFLogger));
            int i3 = 49 / 0;
        } else {
            map.put(U3.j.Y, String.valueOf(aFg1xSDK.AFKeystoreWrapper(this.d).AFLogger));
        }
    }

    @Override // com.appsflyer.internal.AFf1bSDK
    public final void unregisterClient(@NotNull Map<String, Object> map) {
        AFh1gSDK aFh1gSDK;
        map.getClass();
        AFh1iSDK aFh1iSDK = this.force.d;
        if (aFh1iSDK != null) {
            int i = enableTCFDataCollection + 69;
            getInstance = i % 128;
            if (i % 2 != 0) {
                aFh1gSDK = aFh1iSDK.registerClient();
            } else {
                aFh1iSDK.registerClient();
                throw null;
            }
        } else {
            aFh1gSDK = null;
        }
        if (aFh1gSDK != null) {
            getInstance = (enableTCFDataCollection + 9) % 128;
            map.put("network", aFh1gSDK.AFKeystoreWrapper);
            map.put("ivc", Boolean.valueOf(aFh1gSDK.unregisterClient));
            if (this.afDebugLog.i) {
                return;
            }
            String str = aFh1gSDK.registerClient;
            if (str != null) {
                map.put("operator", str);
            }
            String str2 = aFh1gSDK.d;
            if (str2 != null) {
                int i2 = enableTCFDataCollection + 71;
                getInstance = i2 % 128;
                if (i2 % 2 != 0) {
                    map.put(L6.R0, str2);
                } else {
                    map.put(L6.R0, str2);
                    throw null;
                }
            }
        }
    }

    private void registerClient(@NotNull Map<String, Object> map, boolean z) {
        map.getClass();
        map.put("platformextension", this.unregisterClient.d());
        if (z) {
            map.put("platform_extension_v2", this.unregisterClient.registerClient());
            getInstance = (enableTCFDataCollection + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
        }
        int i = getInstance + 53;
        enableTCFDataCollection = i % 128;
        if (i % 2 != 0) {
            int i2 = 23 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFf1bSDK
    public final void registerClient(@NotNull AFh1zSDK aFh1zSDK) {
        enableTCFDataCollection = (getInstance + 47) % 128;
        aFh1zSDK.getClass();
        Map<String, Object> map = aFh1zSDK.AFKeystoreWrapper;
        map.getClass();
        i(map);
        Map<String, Object> map2 = aFh1zSDK.AFKeystoreWrapper;
        map2.getClass();
        AFKeystoreWrapper(map2, aFh1zSDK.afErrorLog);
        Map<String, Object> map3 = aFh1zSDK.AFKeystoreWrapper;
        map3.getClass();
        getLevel(map3);
        Map<String, Object> map4 = aFh1zSDK.AFKeystoreWrapper;
        map4.getClass();
        valueOf(map4);
        Map<String, Object> map5 = aFh1zSDK.AFKeystoreWrapper;
        map5.getClass();
        setDebugLog(map5);
        Map<String, Object> map6 = aFh1zSDK.AFKeystoreWrapper;
        map6.getClass();
        AFe1zSDK d = aFh1zSDK.d();
        d.getClass();
        AFKeystoreWrapper(map6, d);
        enableTCFDataCollection = (getInstance + 61) % 128;
    }

    @Override // com.appsflyer.internal.AFf1bSDK
    public final long unregisterClient() {
        int i = enableTCFDataCollection + 59;
        getInstance = i % 128;
        if (i % 2 != 0) {
            return System.currentTimeMillis();
        }
        System.currentTimeMillis();
        throw null;
    }

    private final String unregisterClient(String str) {
        enableTCFDataCollection = (getInstance + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        String AFLogger = this.i.AFLogger(str);
        getInstance = (enableTCFDataCollection + 89) % 128;
        return AFLogger;
    }

    private static /* synthetic */ Object unregisterClient(Object[] objArr) {
        String str = (String) objArr[0];
        if (str != null) {
            int i = enableTCFDataCollection + 1;
            getInstance = i % 128;
            try {
                if (i % 2 != 0) {
                    if (StringsKt.l0(str).toString().length() > 0) {
                        getInstance = (enableTCFDataCollection + 71) % 128;
                        return new File(StringsKt.l0(str).toString());
                    }
                } else {
                    StringsKt.l0(str).toString().length();
                    throw null;
                }
            } catch (Throwable th) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                LogTag logTag = LogTag.PREINSTALL;
                String message = th.getMessage();
                if (message == null) {
                    message = "Failed to create File object from path";
                }
                AFLoggerBase.e$default(aFLogger, logTag, message, th, false, false, false, false, 120, null);
            }
        }
        return null;
    }

    private static /* synthetic */ Object registerClient(Object[] objArr) {
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        enableTCFDataCollection = (getInstance + 111) % 128;
        map.getClass();
        str.getClass();
        try {
            String d = aFg1uSDK.v.d("prev_event_name");
            if (d != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", aFg1uSDK.v.AFKeystoreWrapper("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", d);
                map.put("prev_event", jSONObject);
                getInstance = (enableTCFDataCollection + 87) % 128;
            }
            aFg1uSDK.v.d("prev_event_name", str);
            aFg1uSDK.v.AFLogger("prev_event_timestamp", System.currentTimeMillis());
            return null;
        } catch (Exception e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "Failed to save previous event metadata to preferences", e, false, false, false, false, 120, null);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFf1bSDK
    public final void unregisterClient(@NotNull AFh1zSDK aFh1zSDK) {
        AFLogger(new Object[]{this, aFh1zSDK}, 1357288958, -1357288951, System.identityHashCode(this));
    }

    private static File registerClient(String str) {
        return (File) AFLogger(new Object[]{str}, -672101371, 672101373, (int) System.currentTimeMillis());
    }

    private static long registerClient() {
        return ((Long) AFLogger(new Object[0], 597719915, -597719907, (int) System.currentTimeMillis())).longValue();
    }

    private void AFKeystoreWrapper(@NotNull AFh1zSDK aFh1zSDK, @Nullable String str, @Nullable AFb1vSDK aFb1vSDK) {
        aFh1zSDK.getClass();
        Map<String, Object> map = aFh1zSDK.AFKeystoreWrapper;
        if (aFh1zSDK.d() == AFd1aSDK.unregisterClient) {
            map.getClass();
            AFLoggerLogLevel(map);
            afErrorLog(map);
            AFLogger(new Object[]{this, map}, -2067034288, 2067034288, System.identityHashCode(this));
            AFa1tSDK.AFKeystoreWrapper(this.afErrorLog, this.i, this.AFLoggerLogLevel);
        }
        map.getClass();
        afInfoLog(map);
        e(map);
        force(map);
        d(map, str);
        AFLogger(new Object[]{this, map}, 2083181279, -2083181275, System.identityHashCode(this));
        if (aFb1vSDK == null) {
            getInstance = (enableTCFDataCollection + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
            return;
        }
        int i = getInstance + 75;
        enableTCFDataCollection = i % 128;
        if (i % 2 == 0) {
            aFb1vSDK.AFKeystoreWrapper(map);
        } else {
            aFb1vSDK.AFKeystoreWrapper(map);
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1bSDK
    public final void AFKeystoreWrapper(@NotNull AFh1zSDK aFh1zSDK) {
        aFh1zSDK.getClass();
        AFc1gSDK aFc1gSDK = this.i.unregisterClient;
        if (!aFc1gSDK.setAndroidIdData) {
            enableTCFDataCollection = (getInstance + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
            AFg1cSDK aFg1cSDK = aFc1gSDK.getInstance;
            if (aFg1cSDK == null) {
                return;
            }
            String str = aFg1cSDK.force;
            if (str != null && str.length() != 0) {
                aFh1zSDK.registerClient("gaidError", aFg1cSDK.force);
            }
            String str2 = aFg1cSDK.d;
            if (str2 != null && aFg1cSDK.AFKeystoreWrapper != null) {
                enableTCFDataCollection = (getInstance + 71) % 128;
                aFh1zSDK.registerClient("advertiserId", str2);
                aFh1zSDK.registerClient("advertiserIdEnabled", String.valueOf(aFg1cSDK.AFKeystoreWrapper));
                aFh1zSDK.registerClient("isGaidWithGps", String.valueOf(aFg1cSDK.AFLogger));
            }
        } else {
            Map<String, Object> map = aFh1zSDK.AFKeystoreWrapper;
            map.getClass();
            AFj1tSDK.d(map).put("ad_ids_disabled", Boolean.TRUE);
        }
        AFg1cSDK aFg1cSDK2 = this.i.unregisterClient.getInstance;
        aFh1zSDK.registerClient("GAID_retry", String.valueOf(aFg1cSDK2 != null ? Intrinsics.c(aFg1cSDK2.w, Boolean.TRUE) : false));
        if (CollectionsKt.R(kotlin.collections.b.j(AFd1aSDK.unregisterClient, AFd1aSDK.afInfoLog), aFh1zSDK.d())) {
            int i = enableTCFDataCollection + 109;
            getInstance = i % 128;
            int i2 = i % 2;
            AFc1gSDK aFc1gSDK2 = this.afDebugLog;
            if (i2 != 0) {
                AFd1kSDK aFd1kSDK = aFc1gSDK2.stop;
                if (aFd1kSDK != null) {
                    Map<String, Object> map2 = aFh1zSDK.AFKeystoreWrapper;
                    map2.getClass();
                    AFj1tSDK.d(map2).put("fetchAdIdLatency", Long.valueOf(aFd1kSDK.registerClient));
                    return;
                }
                return;
            }
            AFd1kSDK aFd1kSDK2 = aFc1gSDK2.stop;
            throw null;
        }
    }

    private static void d(@NotNull Map<String, Object> map, @Nullable String str) {
        map.getClass();
        if (str != null) {
            int i = getInstance + 93;
            enableTCFDataCollection = i % 128;
            if (i % 2 == 0) {
                map.put("phone", str);
            } else {
                map.put("phone", str);
                throw null;
            }
        }
        getInstance = (enableTCFDataCollection + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
    }

    @NotNull
    private Long d() {
        int i = enableTCFDataCollection + 91;
        getInstance = i % 128;
        int i2 = i % 2;
        PackageInfo r_ = this.i.r_();
        if (i2 != 0) {
            return Long.valueOf(r_.firstInstallTime);
        }
        long j = r_.firstInstallTime;
        throw null;
    }

    @Override // com.appsflyer.internal.AFf1bSDK
    public final void d(@NotNull Map<String, Object> map) {
        Object u2gVar;
        enableTCFDataCollection = (getInstance + 1) % 128;
        map.getClass();
        String str = this.afDebugLog.unregisterClient;
        if (str != null) {
            if (map.get("af_deeplink") != null) {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GENERAL, "Skipping push payload processing: deeplink already extracted from intent", false, 4, null);
            } else {
                try {
                    p2g p2gVar = w2g.b;
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("isPush", "true");
                    map.put("af_deeplink", jSONObject.toString());
                    u2gVar = Unit.a;
                } catch (Throwable th) {
                    p2g p2gVar2 = w2g.b;
                    u2gVar = new u2g(th);
                }
                Throwable a = w2g.a(u2gVar);
                if (a != null) {
                    enableTCFDataCollection = (getInstance + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
                    AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "Exception while trying to create JSONObject from pushPayload", a, false, false, false, false, 120, null);
                    enableTCFDataCollection = (getInstance + 111) % 128;
                }
            }
        }
        this.afDebugLog.unregisterClient = null;
    }

    @Nullable
    private String AFKeystoreWrapper() throws CertificateException, NoSuchAlgorithmException, PackageManager.NameNotFoundException {
        int i = getInstance + 89;
        enableTCFDataCollection = i % 128;
        int i2 = i % 2;
        Context context = this.d;
        if (i2 == 0) {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            packageManager.getClass();
            String packageName = this.d.getApplicationContext().getPackageName();
            packageName.getClass();
            return AndroidExtensionsKt.signature(packageManager, packageName);
        }
        PackageManager packageManager2 = context.getApplicationContext().getPackageManager();
        packageManager2.getClass();
        String packageName2 = this.d.getApplicationContext().getPackageName();
        packageName2.getClass();
        AndroidExtensionsKt.signature(packageManager2, packageName2);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r3.length() == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String AFKeystoreWrapper(String str) {
        if (this.afDebugLog.e) {
            int i = (enableTCFDataCollection + 17) % 128;
            getInstance = i;
            if (str != null) {
                enableTCFDataCollection = (i + 91) % 128;
            }
            getInstance = (enableTCFDataCollection + 21) % 128;
            if (afWarnLog()) {
                return afErrorLog();
            }
            return null;
        }
        if (str == null) {
            return null;
        }
        int i2 = getInstance + 97;
        enableTCFDataCollection = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFf1bSDK
    public final void AFLogger(@NotNull AFh1zSDK aFh1zSDK) {
        aFh1zSDK.getClass();
        Map<String, Object> map = aFh1zSDK.AFKeystoreWrapper;
        map.getClass();
        map.put("open_referrer", aFh1zSDK.i);
        String str = aFh1zSDK.afDebugLog;
        if (str != null) {
            int i = enableTCFDataCollection + 85;
            getInstance = i % 128;
            if (i % 2 == 0) {
                StringsKt.R(str);
                throw null;
            }
            if (StringsKt.R(str)) {
                return;
            }
            map.put("af_web_referrer", aFh1zSDK.afDebugLog);
            enableTCFDataCollection = (getInstance + 53) % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        r4.put("prev_session_dur", java.lang.Long.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r0 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r0 != 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object AFKeystoreWrapper(Object[] objArr) {
        long j;
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i = getInstance + 99;
        enableTCFDataCollection = i % 128;
        if (i % 2 != 0) {
            map.getClass();
            j = aFg1uSDK.w.afWarnLog;
        } else {
            map.getClass();
            j = aFg1uSDK.w.afWarnLog;
        }
        int i2 = getInstance + 65;
        enableTCFDataCollection = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final SimpleDateFormat AFLogger() {
        getInstance = (enableTCFDataCollection + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.afInfoLog.getValue();
        getInstance = (enableTCFDataCollection + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
        return simpleDateFormat;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        String str;
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) objArr[1];
        int intValue = ((Number) objArr[2]).intValue();
        simpleDateFormat.getClass();
        String d = aFg1uSDK.v.d("appsFlyerFirstInstall");
        if (d == null) {
            getInstance = (enableTCFDataCollection + 33) % 128;
            if (intValue <= 1) {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "First app launch detected, recording install timestamp", false, 4, null);
                str = simpleDateFormat.format(new Date());
            } else {
                str = "";
            }
            d = str;
            aFg1uSDK.v.d("appsFlyerFirstInstall", d);
        }
        AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.GENERAL, dmi.q("AppsFlyer: first launch date: ", d), false, 4, null);
        d.getClass();
        int i = enableTCFDataCollection + 69;
        getInstance = i % 128;
        if (i % 2 == 0) {
            int i2 = 44 / 0;
        }
        return d;
    }

    private static /* synthetic */ Object AFLogger(Object[] objArr) {
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        Map map = (Map) objArr[1];
        if (AFg1wSDK.AFKeystoreWrapper(aFg1uSDK.d)) {
            map.put("inst_app", Boolean.TRUE);
            getInstance = (enableTCFDataCollection + 23) % 128;
        }
        int i = enableTCFDataCollection + 91;
        getInstance = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0074, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0075, code lost:
    
        com.appsflyer.sdk_base.logger.AFLoggerBase.i$default(com.appsflyer.AFLogger.INSTANCE, com.appsflyer.sdk_base.logger.LogTag.APP_SET_ID, "App Set ID collection is disabled. Skipping inclusion in the event payload.", false, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
    
        r12 = r14.setImeiData;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0084, code lost:
    
        if (r12 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0086, code lost:
    
        r13.put("app_set_id", defpackage.tub.h(new kotlin.Pair("scope", java.lang.Integer.valueOf(r12.unregisterClient)), new kotlin.Pair("id", r12.AFLogger)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        r12 = com.appsflyer.internal.AFg1uSDK.getInstance + 109;
        com.appsflyer.internal.AFg1uSDK.enableTCFDataCollection = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if ((r12 % 2) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        r12 = 64 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002f, code lost:
    
        if (kotlin.collections.CollectionsKt.R(afInfoLog(), r14) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (kotlin.collections.CollectionsKt.R(afInfoLog(), r14) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0042, code lost:
    
        r14 = r12.afDebugLog;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0048, code lost:
    
        if (r14.updateServerUninstallToken == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004a, code lost:
    
        com.appsflyer.internal.AFg1uSDK.getInstance = (com.appsflyer.internal.AFg1uSDK.enableTCFDataCollection + 85) % 128;
        r13.put("app_set_id", defpackage.sub.d(new kotlin.Pair("app_set_id_disabled", java.lang.Boolean.TRUE)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0066, code lost:
    
        if (r12.afDebugLog.setImeiData == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0068, code lost:
    
        com.appsflyer.sdk_base.logger.AFLoggerBase.i$default(com.appsflyer.AFLogger.INSTANCE, com.appsflyer.sdk_base.logger.LogTag.APP_SET_ID, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK.", false, 4, null);
     */
    @Override // com.appsflyer.internal.AFf1bSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AFKeystoreWrapper(@NotNull Map<String, Object> map, @NotNull AFe1zSDK aFe1zSDK) {
        int i = enableTCFDataCollection + 3;
        getInstance = i % 128;
        if (i % 2 == 0) {
            map.getClass();
            aFe1zSDK.getClass();
            int i2 = 51 / 0;
        } else {
            map.getClass();
            aFe1zSDK.getClass();
        }
    }

    private static String AFLogger(AFc1pSDK aFc1pSDK, String str) {
        String d = aFc1pSDK.d("CACHED_CHANNEL");
        if (d != null) {
            int i = getInstance + 55;
            enableTCFDataCollection = i % 128;
            if (i % 2 == 0) {
                return d;
            }
            throw null;
        }
        aFc1pSDK.d("CACHED_CHANNEL", str);
        int i2 = getInstance + 21;
        enableTCFDataCollection = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Nullable
    private static String AFLogger(@Nullable String str) {
        enableTCFDataCollection = (getInstance + 21) % 128;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            invoke.getClass();
            String str2 = (String) invoke;
            int i = enableTCFDataCollection + 51;
            getInstance = i % 128;
            if (i % 2 != 0) {
                return str2;
            }
            throw null;
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.DEVICE_DATA;
            String message = th.getMessage();
            if (message == null) {
                message = "Failed to retrieve system property via reflection";
            }
            AFLoggerBase.e$default(aFLogger, logTag, message, th, false, false, false, false, 120, null);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d2  */
    @Override // com.appsflyer.internal.AFf1bSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(@NotNull AFh1zSDK aFh1zSDK) {
        AFd1aSDK aFd1aSDK;
        AFd1aSDK aFd1aSDK2;
        boolean z;
        aFh1zSDK.getClass();
        Map<String, Object> map = aFh1zSDK.AFKeystoreWrapper;
        if (aFh1zSDK.v == null) {
            int i = enableTCFDataCollection;
            getInstance = (i + 1) % 128;
            if (aFh1zSDK.e == null) {
                int i2 = (i + 55) % 128;
                getInstance = i2;
                int i3 = i2 + 37;
                enableTCFDataCollection = i3 % 128;
                int i4 = i3 % 2;
                AFc1gSDK aFc1gSDK = this.afDebugLog;
                if (i4 == 0) {
                    AFKeystoreWrapper(aFh1zSDK, aFc1gSDK.d, aFc1gSDK.AFKeystoreWrapper);
                    aFd1aSDK = AFd1aSDK.unregisterClient;
                    aFd1aSDK2 = AFd1aSDK.afInfoLog;
                    if (CollectionsKt.R(kotlin.collections.b.j(aFd1aSDK, aFd1aSDK2, AFd1aSDK.afWarnLog), aFh1zSDK.d())) {
                        map.getClass();
                        afWarnLog(map);
                    }
                    if (CollectionsKt.R(kotlin.collections.b.j(aFd1aSDK, aFd1aSDK2, AFd1aSDK.force), aFh1zSDK.d())) {
                        getInstance = (enableTCFDataCollection + 25) % 128;
                        map.getClass();
                        AFLogger(new Object[]{this, map}, -1925162614, 1925162625, System.identityHashCode(this));
                    }
                    map.getClass();
                    AFLogger(new Object[]{this, map}, 402873589, -402873583, System.identityHashCode(this));
                    AppsFlyerLib(map);
                    getEntries(map);
                    AFLogger(new Object[]{this, map}, -907041187, 907041196, System.identityHashCode(this));
                    if (aFh1zSDK.v == null) {
                        int i5 = (enableTCFDataCollection + 101) % 128;
                        getInstance = i5;
                        if (aFh1zSDK.e == null) {
                            enableTCFDataCollection = (i5 + 7) % 128;
                            z = true;
                            registerClient(map, z);
                            getInstance(map);
                            onPause(map);
                            AFLogger(map, aFh1zSDK);
                            map.put("af_events_api", "1");
                        }
                    }
                    z = false;
                    registerClient(map, z);
                    getInstance(map);
                    onPause(map);
                    AFLogger(map, aFh1zSDK);
                    map.put("af_events_api", "1");
                }
                AFKeystoreWrapper(aFh1zSDK, aFc1gSDK.d, aFc1gSDK.AFKeystoreWrapper);
                throw null;
            }
        }
        if (!(aFh1zSDK instanceof AFh1oSDK)) {
            map.getClass();
            String str = aFh1zSDK.v;
            str.getClass();
            AFLogger(new Object[]{this, map, str}, -1182724807, 1182724810, System.identityHashCode(this));
        }
        aFd1aSDK = AFd1aSDK.unregisterClient;
        aFd1aSDK2 = AFd1aSDK.afInfoLog;
        if (CollectionsKt.R(kotlin.collections.b.j(aFd1aSDK, aFd1aSDK2, AFd1aSDK.afWarnLog), aFh1zSDK.d())) {
        }
        if (CollectionsKt.R(kotlin.collections.b.j(aFd1aSDK, aFd1aSDK2, AFd1aSDK.force), aFh1zSDK.d())) {
        }
        map.getClass();
        AFLogger(new Object[]{this, map}, 402873589, -402873583, System.identityHashCode(this));
        AppsFlyerLib(map);
        getEntries(map);
        AFLogger(new Object[]{this, map}, -907041187, 907041196, System.identityHashCode(this));
        if (aFh1zSDK.v == null) {
        }
        z = false;
        registerClient(map, z);
        getInstance(map);
        onPause(map);
        AFLogger(map, aFh1zSDK);
        map.put("af_events_api", "1");
    }

    private static boolean AFLogger(File file) {
        int i = getInstance + 81;
        enableTCFDataCollection = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (file == null || !file.exists()) {
            return true;
        }
        int i2 = getInstance + 55;
        enableTCFDataCollection = i2 % 128;
        if (i2 % 2 == 0) {
            return false;
        }
        throw null;
    }

    private static void AFLogger(@NotNull Map<String, Object> map, @NotNull AFh1zSDK aFh1zSDK) {
        map.getClass();
        aFh1zSDK.getClass();
        String str = aFh1zSDK.v;
        if (str != null) {
            map.put(U3.i.j0, str);
            Map map2 = aFh1zSDK.d;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    private final void AFLogger(Map<String, Object> map) {
        AFLogger(new Object[]{this, map}, -1925162614, 1925162625, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFf1bSDK
    public final void AFKeystoreWrapper(@NotNull Map<String, Object> map) {
        AFLogger(new Object[]{this, map}, -907041187, 907041196, System.identityHashCode(this));
    }

    private void AFKeystoreWrapper(@NotNull Map<String, Object> map, @NotNull String str) {
        AFLogger(new Object[]{this, map, str}, -1182724807, 1182724810, System.identityHashCode(this));
    }

    @NotNull
    private String d(@NotNull SimpleDateFormat simpleDateFormat, int i) {
        return (String) AFLogger(new Object[]{this, simpleDateFormat, Integer.valueOf(i)}, 1110413021, -1110413020, i);
    }
}
