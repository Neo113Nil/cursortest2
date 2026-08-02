package com.appsflyer.internal;

import Sc.InterfaceC4008j;
import Sc.r;
import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFd1uSDK;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;

/* loaded from: classes.dex */
public final class AFg1lSDK implements AFg1qSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long afDebugLog = -215349531926575058L;
    private static int afErrorLog = 0;
    private static int afRDLog = 1;

    @NotNull
    private final AFd1uSDK AFInAppEventParameterName;

    @NotNull
    private final AFi1qSDK AFInAppEventType;

    @NotNull
    private final AFb1ySDK AFKeystoreWrapper;

    @NotNull
    private final AFd1sSDK AFLogger;

    @NotNull
    private final AFd1kSDK afInfoLog;

    @NotNull
    private final InterfaceC4008j afVerboseLog;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AFg1xSDK f57472d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final AFd1tSDK f57473e;

    @NotNull
    private final AFd1qSDK force;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f57474i;

    @NotNull
    private final AFg1cSDK registerClient;

    @NotNull
    private final AFh1aSDK unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final AFg1pSDK f57475v;

    @NotNull
    private final AFi1dSDK valueOf;

    @NotNull
    private final Context values;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final AFb1cSDK f57476w;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/AppsFlyerProperties;", "valueOf", "()Lcom/appsflyer/AppsFlyerProperties;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFg1lSDK$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<AppsFlyerProperties> {
        public static final AnonymousClass2 AFInAppEventType = new AnonymousClass2();

        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
        public final AppsFlyerProperties invoke() {
            return AppsFlyerProperties.getInstance();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/text/SimpleDateFormat;", "AFKeystoreWrapper", "()Ljava/text/SimpleDateFormat;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFg1lSDK$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function0<SimpleDateFormat> {
        public static final AnonymousClass3 valueOf = new AnonymousClass3();

        AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
        }
    }

    public AFg1lSDK(@NotNull Context context, @NotNull AFi1qSDK aFi1qSDK, @NotNull AFd1uSDK aFd1uSDK, @NotNull AFi1dSDK aFi1dSDK, @NotNull AFb1ySDK aFb1ySDK, @NotNull AFg1cSDK aFg1cSDK, @NotNull AFd1tSDK aFd1tSDK, @NotNull AFd1sSDK aFd1sSDK, @NotNull AFh1aSDK aFh1aSDK, @NotNull AFg1xSDK aFg1xSDK, @NotNull AFb1cSDK aFb1cSDK, @NotNull AFd1kSDK aFd1kSDK, @NotNull AFg1pSDK aFg1pSDK, @NotNull AFd1qSDK aFd1qSDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1qSDK, "");
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        Intrinsics.checkNotNullParameter(aFi1dSDK, "");
        Intrinsics.checkNotNullParameter(aFb1ySDK, "");
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(aFd1tSDK, "");
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(aFh1aSDK, "");
        Intrinsics.checkNotNullParameter(aFg1xSDK, "");
        Intrinsics.checkNotNullParameter(aFb1cSDK, "");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(aFg1pSDK, "");
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        this.values = context;
        this.AFInAppEventType = aFi1qSDK;
        this.AFInAppEventParameterName = aFd1uSDK;
        this.valueOf = aFi1dSDK;
        this.AFKeystoreWrapper = aFb1ySDK;
        this.registerClient = aFg1cSDK;
        this.f57473e = aFd1tSDK;
        this.AFLogger = aFd1sSDK;
        this.unregisterClient = aFh1aSDK;
        this.f57472d = aFg1xSDK;
        this.f57476w = aFb1cSDK;
        this.afInfoLog = aFd1kSDK;
        this.f57475v = aFg1pSDK;
        this.force = aFd1qSDK;
        this.f57474i = Sc.k.b(AnonymousClass2.AFInAppEventType);
        this.afVerboseLog = Sc.k.b(AnonymousClass3.valueOf);
    }

    private final SimpleDateFormat AFInAppEventType() {
        afErrorLog = (afRDLog + 109) % UserVerificationMethods.USER_VERIFY_PATTERN;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.afVerboseLog.getValue();
        afErrorLog = (afRDLog + 123) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return simpleDateFormat;
    }

    private final AppsFlyerProperties AFKeystoreWrapper() {
        afRDLog = (afErrorLog + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) this.f57474i.getValue();
        afErrorLog = (afRDLog + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return appsFlyerProperties;
    }

    private void AFLogger(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String string = AFKeystoreWrapper().getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = AFKeystoreWrapper().getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string != null) {
            afRDLog = (afErrorLog + 111) % UserVerificationMethods.USER_VERIFY_PATTERN;
            map.put("onelink_id", string);
        }
        if (string2 != null) {
            afErrorLog = (afRDLog + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
            map.put("onelink_ver", string2);
        }
    }

    private void AFLogger$LogLevel(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (this.f57473e.valueOf("is_stop_tracking_used")) {
            afErrorLog = (afRDLog + 119) % UserVerificationMethods.USER_VERIFY_PATTERN;
            map.put("istu", String.valueOf(this.f57473e.values("is_stop_tracking_used")));
        }
        int i11 = afRDLog + 55;
        afErrorLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            int i12 = 69 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
    
        if (r0.length() == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r0.length() == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFVersionDeclaration(@NotNull Map<String, Object> map) {
        boolean z11;
        Intrinsics.checkNotNullParameter(map, "");
        String str = this.f57472d.registerClient;
        if (str != null) {
            int i11 = afErrorLog + 119;
            afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i11 % 2 == 0) {
                int i12 = 84 / 0;
            }
            if (!z11) {
                return;
            }
            int i13 = afErrorLog + 37;
            afRDLog = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
            int i14 = i13 % 2;
            map.put("appsflyerKey", str);
            if (i14 == 0) {
                int i15 = 87 / 0;
                return;
            }
            return;
        }
        afErrorLog = (afRDLog + 117) % UserVerificationMethods.USER_VERIFY_PATTERN;
        z11 = true;
        if (!z11) {
        }
    }

    private static void a(String str, int i11, Object[] objArr) {
        $11 = ($10 + 33) % UserVerificationMethods.USER_VERIFY_PATTERN;
        char[] cArr = str;
        if (str != null) {
            char[] charArray = str.toCharArray();
            $11 = ($10 + 49) % UserVerificationMethods.USER_VERIFY_PATTERN;
            cArr = charArray;
        }
        AFj1nSDK aFj1nSDK = new AFj1nSDK();
        char[] AFInAppEventType = AFj1nSDK.AFInAppEventType(afDebugLog ^ 6430695199931119772L, cArr, i11);
        aFj1nSDK.values = 4;
        while (true) {
            int i12 = aFj1nSDK.values;
            if (i12 >= AFInAppEventType.length) {
                objArr[0] = new String(AFInAppEventType, 4, AFInAppEventType.length - 4);
                return;
            }
            $10 = ($11 + 33) % UserVerificationMethods.USER_VERIFY_PATTERN;
            aFj1nSDK.valueOf = i12 - 4;
            AFInAppEventType[i12] = (char) ((AFInAppEventType[i12] ^ AFInAppEventType[i12 % 4]) ^ (r2 * (afDebugLog ^ 6430695199931119772L)));
            aFj1nSDK.values = i12 + 1;
        }
    }

    private void afDebugLog(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        try {
            String AFInAppEventType = AFb1kSDK.AFInAppEventType(this.afInfoLog, this.f57473e);
            if (AFInAppEventType != null) {
                map.put("uid", AFInAppEventType);
                afErrorLog = (afRDLog + 35) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return;
            }
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("ERROR: could not get uid ");
            sb2.append(th2.getMessage());
            String obj = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(obj, "");
            AFLogger.afErrorLog(obj, th2);
        }
        int i11 = afErrorLog + 83;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private void afErrorLog(@NotNull Map<String, Object> map) {
        afErrorLog = (afRDLog + 51) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(map, "");
        String AFLogger = this.AFLogger.AFLogger();
        String values = values(this.f57473e, AFLogger);
        boolean z11 = false;
        boolean z12 = (values == null || Intrinsics.d(values, AFLogger)) ? false : true;
        if (values != null || AFLogger == null) {
            afErrorLog = (afRDLog + 29) % UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            z11 = true;
        }
        if (z12 || z11) {
            map.put("af_latestchannel", AFLogger);
        }
        String unregisterClient = unregisterClient();
        if (unregisterClient != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            Object lowerCase = unregisterClient.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            map.put("af_installstore", lowerCase);
        }
        String force = force();
        if (force != null) {
            afRDLog = (afErrorLog + 71) % UserVerificationMethods.USER_VERIFY_PATTERN;
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            Object lowerCase2 = force.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            map.put("af_preinstall_name", lowerCase2);
        }
        String AFLogger2 = AFLogger();
        if (AFLogger2 != null) {
            afRDLog = (afErrorLog + 63) % UserVerificationMethods.USER_VERIFY_PATTERN;
            Locale locale3 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale3, "");
            Object lowerCase3 = AFLogger2.toLowerCase(locale3);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            map.put("af_currentstore", lowerCase3);
        }
    }

    private void afErrorLogForExcManagerOnly(@NotNull Map<String, Object> map) {
        afErrorLog = (afRDLog + 119) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(map, "");
        boolean valueOf = AFg1oSDK.valueOf(this.values);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=".concat(String.valueOf(valueOf)));
        if (!valueOf) {
            int i11 = afErrorLog + 85;
            afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i11 % 2 == 0) {
                map.put("tokenRefreshConfigured", Boolean.FALSE);
                throw null;
            }
            map.put("tokenRefreshConfigured", Boolean.FALSE);
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1oSDK.values(this.f57473e)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r0 > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r0 > 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0051, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        com.appsflyer.internal.AFg1lSDK.afErrorLog = (com.appsflyer.internal.AFg1lSDK.afRDLog + 27) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r5 - r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void afInfoLog(@NotNull Map<String, Object> map) {
        long AFKeystoreWrapper;
        long currentTimeMillis;
        long seconds;
        int i11 = afRDLog + 7;
        afErrorLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFKeystoreWrapper = this.f57473e.AFKeystoreWrapper("AppsFlyerTimePassedSincePrevLaunch", 1L);
            currentTimeMillis = System.currentTimeMillis();
            this.f57473e.AFInAppEventParameterName("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            AFKeystoreWrapper = this.f57473e.AFKeystoreWrapper("AppsFlyerTimePassedSincePrevLaunch", 0L);
            currentTimeMillis = System.currentTimeMillis();
            this.f57473e.AFInAppEventParameterName("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        }
        map.put("timepassedsincelastlaunch", String.valueOf(seconds));
    }

    private void afLogForce(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFa1bSDK valueOf = AFb1rSDK.valueOf(this.values.getContentResolver());
        if (valueOf == null) {
            int i11 = afRDLog + 97;
            afErrorLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i11 % 2 != 0) {
                int i12 = 99 / 0;
                return;
            }
            return;
        }
        int i13 = afRDLog + 59;
        afErrorLog = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i13 % 2 == 0) {
            map.put("amazon_aid", valueOf.AFInAppEventParameterName);
            map.put("amazon_aid_limit", String.valueOf(valueOf.AFKeystoreWrapper));
        } else {
            map.put("amazon_aid", valueOf.AFInAppEventParameterName);
            map.put("amazon_aid_limit", String.valueOf(valueOf.AFKeystoreWrapper));
            throw null;
        }
    }

    private static void afRDLog(@NotNull Map<String, Object> map) {
        int i11 = afRDLog + 47;
        afErrorLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            if (i11 % 2 != 0) {
                Intrinsics.checkNotNullParameter(map, "");
                map.put("lang", Locale.getDefault().getDisplayLanguage());
                int i12 = 12 / 0;
            } else {
                Intrinsics.checkNotNullParameter(map, "");
                map.put("lang", Locale.getDefault().getDisplayLanguage());
            }
        } catch (Exception e11) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e11);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
            afErrorLog = (afRDLog + 75) % UserVerificationMethods.USER_VERIFY_PATTERN;
        } catch (Exception e12) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e12);
        }
        try {
            map.put("country", Locale.getDefault().getCountry());
        } catch (Exception e13) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e13);
        }
    }

    private void afVerboseLog(@NotNull Map<String, Object> map) {
        afRDLog = (afErrorLog + 101) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(map, "");
        map.putAll(this.f57475v.values());
        int i11 = afErrorLog + 105;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private void afWarnLog(@NotNull Map<String, Object> map) {
        afErrorLog = (afRDLog + 109) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(map, "");
        String string = AFKeystoreWrapper().getString(AppsFlyerProperties.EXTENSION);
        if (string != null && string.length() != 0) {
            int i11 = afErrorLog + 59;
            afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            int i12 = i11 % 2;
            map.put(AppsFlyerProperties.EXTENSION, string);
            if (i12 == 0) {
                throw null;
            }
        }
        int i13 = afErrorLog + 19;
        afRDLog = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i13 % 2 == 0) {
            int i14 = 20 / 0;
        }
    }

    private final void d(Map<String, Object> map) {
        int i11 = afRDLog + 91;
        afErrorLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            map.put("btl", String.valueOf(this.AFInAppEventParameterName.values(this.values).AFKeystoreWrapper));
            throw null;
        }
        AFd1uSDK.AFa1zSDK values = this.AFInAppEventParameterName.values(this.values);
        float f7 = values.AFKeystoreWrapper;
        String str = values.values;
        map.put("btl", String.valueOf(f7));
        if (str != null) {
            int i12 = afRDLog + 91;
            afErrorLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
            int i13 = i12 % 2;
            map.put("btch", str);
            if (i13 != 0) {
                throw null;
            }
        }
    }

    private static long e() {
        afErrorLog = (afRDLog + 99) % UserVerificationMethods.USER_VERIFY_PATTERN;
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        afRDLog = (afErrorLog + 123) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return currentTimeMillis;
    }

    private String force() {
        int i11 = afErrorLog + 85;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            AFKeystoreWrapper().getString("preInstallName");
            throw null;
        }
        String string = AFKeystoreWrapper().getString("preInstallName");
        if (string != null) {
            int i12 = afRDLog + 27;
            afErrorLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i12 % 2 != 0) {
                int i13 = 89 / 0;
            }
            return string;
        }
        if (this.f57473e.valueOf("preInstallName")) {
            string = this.f57473e.AFKeystoreWrapper("preInstallName", (String) null);
        } else {
            if (d() && (string = afInfoLog()) == null) {
                string = valueOf("AF_PRE_INSTALL_NAME");
            }
            if (string != null) {
                afRDLog = (afErrorLog + 87) % UserVerificationMethods.USER_VERIFY_PATTERN;
                this.f57473e.valueOf("preInstallName", string);
                afErrorLog = (afRDLog + 57) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
        }
        if (string != null) {
            AFKeystoreWrapper().set("preInstallName", string);
        }
        return string;
    }

    private static void i(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        Object AFKeystoreWrapper = AFb1gSDK.AFKeystoreWrapper();
        String valueOf = AFb1gSDK.valueOf();
        if (AFKeystoreWrapper == null || valueOf == null) {
            return;
        }
        int i11 = afRDLog + 101;
        afErrorLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            Integer.parseInt(valueOf);
            throw null;
        }
        if (Integer.parseInt(valueOf) > 0) {
            map.put("reinstallCounter", valueOf);
            map.put("originalAppsflyerId", AFKeystoreWrapper);
            afRDLog = (afErrorLog + 123) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
    }

    @NotNull
    private static String registerClient() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double pow = Math.pow(2.0d, 20.0d);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((long) (availableBlocksLong / pow));
        sb2.append('/');
        sb2.append((long) (blockCountLong / pow));
        String obj = sb2.toString();
        int i11 = afErrorLog + 123;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            int i12 = 65 / 0;
        }
        return obj;
    }

    private String unregisterClient() {
        String str = null;
        if (this.f57473e.valueOf("INSTALL_STORE")) {
            afRDLog = (afErrorLog + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return this.f57473e.AFKeystoreWrapper("INSTALL_STORE", (String) null);
        }
        if (!(!d())) {
            str = AFLogger();
        } else {
            afErrorLog = (afRDLog + 119) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        this.f57473e.valueOf("INSTALL_STORE", str);
        afErrorLog = (afRDLog + 5) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return str;
    }

    @SuppressLint({"HardwareIds"})
    private final String v() {
        String AFKeystoreWrapper = this.f57473e.AFKeystoreWrapper("androidIdCached", (String) null);
        try {
            String string = Settings.Secure.getString(this.values.getContentResolver(), "android_id");
            if (string != null) {
                afErrorLog = (afRDLog + 9) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return string;
            }
        } catch (Exception e11) {
            AFLogger.afErrorLog(e11.getMessage(), e11);
        }
        if (AFKeystoreWrapper == null) {
            afRDLog = (afErrorLog + 43) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return null;
        }
        int i11 = afRDLog + 103;
        afErrorLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            AFLogger.afDebugLog("use cached AndroidId: ".concat(String.valueOf(AFKeystoreWrapper)));
            return AFKeystoreWrapper;
        }
        AFLogger.afDebugLog("use cached AndroidId: ".concat(String.valueOf(AFKeystoreWrapper)));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r1.versionCode > r10.f57473e.AFInAppEventParameterName("versionCode", 0)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void values(Map<String, Object> map) {
        PackageInfo packageInfo;
        int i11 = afRDLog + 91;
        afErrorLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            if (i11 % 2 != 0) {
                packageInfo = this.values.getPackageManager().getPackageInfo(this.values.getPackageName(), 1);
                if (packageInfo.versionCode > this.f57473e.AFInAppEventParameterName("versionCode", 0)) {
                    afErrorLog = (afRDLog + 49) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    this.f57473e.values("versionCode", packageInfo.versionCode);
                }
                map.put("app_version_code", String.valueOf(packageInfo.versionCode));
                Context context = this.AFLogger.AFInAppEventParameterName.valueOf;
                map.put("app_version_name", AFb1uSDK.AFKeystoreWrapper(context, context.getPackageName()));
                map.put("targetSDKver", Integer.valueOf(this.AFLogger.AFInAppEventParameterName.valueOf.getApplicationInfo().targetSdkVersion));
                long j11 = packageInfo.firstInstallTime;
                long j12 = packageInfo.lastUpdateTime;
                map.put("date1", AFInAppEventType().format(new Date(j11)));
                map.put("date2", AFInAppEventType().format(new Date(j12)));
                Object[] objArr = new Object[1];
                a("ᑱᐗ耧聜\uf0fc慊\ueb63뤆훍댑␑\uffc8醏瘆\ue6c0㲁屈㥙ꦅ", TextUtils.indexOf("", "", 0), objArr);
                String intern = ((String) objArr[0]).intern();
                SimpleDateFormat AFInAppEventType = AFInAppEventType();
                Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
                map.put(intern, values(AFInAppEventType));
                int i12 = afRDLog + 17;
                afErrorLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i12 % 2 != 0) {
                    int i13 = 9 / 0;
                    return;
                }
                return;
            }
            packageInfo = this.values.getPackageManager().getPackageInfo(this.values.getPackageName(), 0);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th2, true);
        }
        AFLogger.afErrorLog("Exception while collecting app version data ", th2, true);
    }

    private boolean w() {
        int i11 = afErrorLog + 53;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            Boolean.parseBoolean(this.f57473e.AFKeystoreWrapper("sentSuccessfully", (String) null));
            throw null;
        }
        boolean parseBoolean = Boolean.parseBoolean(this.f57473e.AFKeystoreWrapper("sentSuccessfully", (String) null));
        afRDLog = (afErrorLog + 105) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return parseBoolean;
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final Long AFInAppEventParameterName() {
        afRDLog = (afErrorLog + 29) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Context context = this.afInfoLog.valueOf;
        if (context != null) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                String packageName = context.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "");
                PackageInfo valueOf = valueOf(packageManager, packageName);
                if (valueOf != null) {
                    Long valueOf2 = Long.valueOf(valueOf.firstInstallTime);
                    int i11 = afErrorLog + 111;
                    afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i11 % 2 != 0) {
                        return valueOf2;
                    }
                    throw null;
                }
            }
            afRDLog = (afErrorLog + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void valueOf(@NotNull AFa1pSDK aFa1pSDK) {
        int i11 = afErrorLog + 95;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFa1pSDK, "");
            aFa1pSDK.valueOf();
            aFa1pSDK.values();
            throw null;
        }
        Intrinsics.checkNotNullParameter(aFa1pSDK, "");
        Map<String, Object> valueOf = aFa1pSDK.valueOf();
        if (aFa1pSDK.values()) {
            String str = aFa1pSDK.f57364d;
            AFd1qSDK aFd1qSDK = this.force;
            values(aFa1pSDK, str, aFd1qSDK.valueOf, aFd1qSDK.AFInAppEventParameterName);
            afErrorLog = (afRDLog + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
        } else if (!(aFa1pSDK instanceof AFh1lSDK)) {
            Intrinsics.checkNotNullExpressionValue(valueOf, "");
            String str2 = aFa1pSDK.AFLogger;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            AFInAppEventParameterName(valueOf, str2);
        }
        Intrinsics.checkNotNullExpressionValue(valueOf, "");
        AFVersionDeclaration(valueOf);
        i(valueOf);
        afVerboseLog(valueOf);
        afWarnLog(valueOf);
        afDebugLog(valueOf);
        AFInAppEventType(valueOf, aFa1pSDK.values());
        afErrorLogForExcManagerOnly(valueOf);
        AFLogger$LogLevel(valueOf);
        valueOf(valueOf, aFa1pSDK);
        valueOf.put("af_events_api", "1");
    }

    private final void AFInAppEventType(Map<String, Object> map) {
        try {
            long j11 = this.values.getPackageManager().getPackageInfo(this.values.getPackageName(), 0).firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(j11)));
            int i11 = afRDLog + 99;
            afErrorLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i11 % 2 != 0) {
                int i12 = 61 / 0;
            }
        } catch (Exception e11) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e11);
        }
    }

    private void e(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFg1cSDK aFg1cSDK = this.registerClient;
        HashMap hashMap = new HashMap(aFg1cSDK.values);
        aFg1cSDK.values.clear();
        this.registerClient.AFInAppEventType.AFInAppEventType("gcd");
        Intrinsics.checkNotNullExpressionValue(hashMap, "");
        if (!hashMap.isEmpty()) {
            afErrorLog = (afRDLog + 13) % UserVerificationMethods.USER_VERIFY_PATTERN;
            Map<String, Object> values = AFb1tSDK.values(map);
            Intrinsics.checkNotNullExpressionValue(values, "");
            values.put("gcd", hashMap);
            afRDLog = (afErrorLog + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i11 = afRDLog + 53;
        afErrorLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private void w(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        long j11 = this.registerClient.f57461i;
        if (j11 != 0) {
            afErrorLog = (afRDLog + 71) % UserVerificationMethods.USER_VERIFY_PATTERN;
            map.put("prev_session_dur", Long.valueOf(j11));
        }
        afRDLog = (afErrorLog + 29) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void AFKeystoreWrapper(@NotNull Map<String, Object> map, boolean z11, @NotNull Function0<String> function0) {
        afErrorLog = (afRDLog + 67) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function0, "");
        AFInAppEventType(map);
        values(map);
        afErrorLog(map);
        values(map, z11);
        values(map, function0);
        int i11 = afRDLog + 75;
        afErrorLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0053, code lost:
    
        if (r4.AFLogger.AFKeystoreWrapper.AFInAppEventParameterName("appsFlyerCount", 0) <= 5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0063, code lost:
    
        r0.putAll(r4.valueOf.AFKeystoreWrapper());
        com.appsflyer.internal.AFg1lSDK.afErrorLog = (com.appsflyer.internal.AFg1lSDK.afRDLog + 93) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0061, code lost:
    
        if (r4.AFLogger.AFKeystoreWrapper.AFInAppEventParameterName("appsFlyerCount", 0) <= 2) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFInAppEventParameterName(@NotNull Map<String, Object> map, boolean z11) {
        Intrinsics.checkNotNullParameter(map, "");
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", AFKeystoreWrapper("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", AFKeystoreWrapper("ro.product.cpu.abi2"));
        hashMap.put("arch", AFKeystoreWrapper("os.arch"));
        hashMap.put("build_display_id", AFKeystoreWrapper("ro.build.display.id"));
        if (z11) {
            int i11 = afErrorLog + 49;
            afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i11 % 2 == 0) {
                d(hashMap);
            } else {
                d(hashMap);
            }
        }
        hashMap.put("dim", this.AFKeystoreWrapper.AFInAppEventType(this.values));
        map.put("deviceData", hashMap);
    }

    private String AFLogger() {
        afRDLog = (afErrorLog + 37) % UserVerificationMethods.USER_VERIFY_PATTERN;
        String string = AFKeystoreWrapper().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string == null) {
            string = valueOf("AF_STORE");
        }
        afErrorLog = (afRDLog + 35) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean i() {
        boolean z11;
        int i11 = afErrorLog + 123;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0 ? !AFKeystoreWrapper().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) : !AFKeystoreWrapper().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, true)) {
            int i12 = afRDLog + 25;
            afErrorLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i12 % 2 == 0 ? !AFKeystoreWrapper().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) : !AFKeystoreWrapper().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, true)) {
                z11 = false;
                if (!z11) {
                    int i13 = afErrorLog + 99;
                    afRDLog = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    int i14 = i13 % 2;
                    AFb1tSDK.valueOf();
                    if (i14 == 0) {
                        AFb1tSDK.valueOf(this.values);
                        throw null;
                    }
                    if (AFb1tSDK.valueOf(this.values)) {
                        return false;
                    }
                }
                return true;
            }
        }
        z11 = true;
        if (!z11) {
        }
        return true;
    }

    private static void registerClient(@NotNull Map<String, Object> map) {
        afErrorLog = (afRDLog + 41) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a("蟤螆⫚㰁娚\udd04蓒횪䕈", TextUtils.indexOf("", ""), objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        afErrorLog = (afRDLog + 81) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private final void unregisterClient(Map<String, Object> map) {
        int i11 = afErrorLog + 3;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            int i12 = 20 / 0;
            if (AFKeystoreWrapper().isOtherSdkStringDisabled()) {
                return;
            }
        } else if (AFKeystoreWrapper().isOtherSdkStringDisabled()) {
            return;
        }
        map.put("batteryLevel", String.valueOf(this.AFInAppEventParameterName.values(this.values).AFKeystoreWrapper));
        afRDLog = (afErrorLog + 75) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private final void v(Map<String, Object> map) {
        int i11 = afRDLog + 77;
        afErrorLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            UiModeManager uiModeManager = (UiModeManager) this.values.getSystemService(UiModeManager.class);
            if (uiModeManager != null) {
                afRDLog = (afErrorLog + 119) % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (uiModeManager.getCurrentModeType() == 4) {
                    map.put("tv", Boolean.TRUE);
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void AFKeystoreWrapper(@NotNull AFa1pSDK aFa1pSDK) {
        boolean z11;
        Intrinsics.checkNotNullParameter(aFa1pSDK, "");
        Map<String, Object> valueOf = aFa1pSDK.valueOf();
        Intrinsics.checkNotNullExpressionValue(valueOf, "");
        valueOf.put("open_referrer", aFa1pSDK.values);
        String str = aFa1pSDK.f57365e;
        if (str == null || kotlin.text.h.K(str)) {
            z11 = true;
        } else {
            afErrorLog = (afRDLog + 101) % UserVerificationMethods.USER_VERIFY_PATTERN;
            z11 = false;
        }
        if (!z11) {
            afRDLog = (afErrorLog + 89) % UserVerificationMethods.USER_VERIFY_PATTERN;
            valueOf.put("af_web_referrer", aFa1pSDK.f57365e);
        }
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void AFInAppEventType(@NotNull AFa1pSDK aFa1pSDK) {
        afErrorLog = (afRDLog + 67) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(aFa1pSDK, "");
        Map<String, Object> valueOf = aFa1pSDK.valueOf();
        Intrinsics.checkNotNullExpressionValue(valueOf, "");
        AFInAppEventParameterName(valueOf, aFa1pSDK.values());
        registerClient(valueOf);
        afRDLog(valueOf);
        AFInAppEventParameterName(valueOf);
        values(valueOf, this.force.values);
        afLogForce(valueOf);
        valueOf.put("cell", U.j(new Pair("mcc", Integer.valueOf(this.values.getResources().getConfiguration().mcc)), new Pair("mnc", Integer.valueOf(this.values.getResources().getConfiguration().mnc))));
        valueOf.put("sig", valueOf());
        valueOf.put("last_boot_time", Long.valueOf(e()));
        valueOf.put("disk", registerClient());
        afErrorLog = (afRDLog + 91) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private boolean d() {
        if (this.f57473e.valueOf("appsFlyerCount")) {
            afErrorLog = (afRDLog + 31) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return false;
        }
        afErrorLog = (afRDLog + 69) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return true;
    }

    private final String afInfoLog() {
        File values = values(AFKeystoreWrapper("ro.appsflyer.preinstall.path"));
        if (AFInAppEventParameterName(values)) {
            values = values(valueOf("AF_PRE_INSTALL_PATH"));
        }
        if (AFInAppEventParameterName(values)) {
            values = values("/data/local/tmp/pre_install.appsflyer");
        }
        if (AFInAppEventParameterName(values)) {
            int i11 = afRDLog + 121;
            afErrorLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i11 % 2 != 0) {
                values = values("/etc/pre_install.appsflyer");
                int i12 = 93 / 0;
            } else {
                values = values("/etc/pre_install.appsflyer");
            }
        }
        if (AFInAppEventParameterName(values)) {
            return null;
        }
        String packageName = this.values.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String valueOf = valueOf(values, packageName);
        afErrorLog = (afRDLog + 9) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return valueOf;
    }

    private final void force(Map<String, Object> map) {
        int i11 = afErrorLog + 43;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            if (!AFg1kSDK.AFInAppEventType(this.values)) {
                return;
            }
            afRDLog = (afErrorLog + 63) % UserVerificationMethods.USER_VERIFY_PATTERN;
            map.put("inst_app", Boolean.TRUE);
            return;
        }
        AFg1kSDK.AFInAppEventType(this.values);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r5 != null) goto L11;
     */
    @SuppressLint({"PrivateApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String AFKeystoreWrapper(String str) {
        Object invoke;
        int i11 = afRDLog + 115;
        afErrorLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            if (i11 % 2 != 0) {
                Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
                Object[] objArr = new Object[0];
                objArr[0] = str;
                invoke = method.invoke(null, objArr);
                if (invoke != null) {
                    String str2 = (String) invoke;
                    afRDLog = (afErrorLog + 109) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    return str2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void AFInAppEventParameterName(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFh1dSDK aFh1dSDK = this.unregisterClient.values;
        AFi1zSDK AFInAppEventType = aFh1dSDK != null ? aFh1dSDK.AFInAppEventType() : null;
        if (AFInAppEventType != null) {
            map.put("network", AFInAppEventType.AFInAppEventParameterName);
            map.put("ivc", Boolean.valueOf(AFInAppEventType.AFInAppEventParameterName()));
            if (AFKeystoreWrapper().getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                return;
            }
            String str = AFInAppEventType.valueOf;
            if (str != null) {
                map.put("operator", str);
                afErrorLog = (afRDLog + 43) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            String str2 = AFInAppEventType.AFKeystoreWrapper;
            if (str2 != null) {
                map.put("carrier", str2);
                afRDLog = (afErrorLog + 9) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void AFKeystoreWrapper(@NotNull Map<String, Object> map) {
        Object a11;
        afRDLog = (afErrorLog + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(map, "");
        String str = this.force.AFKeystoreWrapper;
        if (str != null) {
            if (map.get("af_deeplink") != null) {
                AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
            } else {
                try {
                    r.Companion companion = Sc.r.INSTANCE;
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("isPush", "true");
                    map.put("af_deeplink", jSONObject.toString());
                    a11 = Unit.f71690a;
                } catch (Throwable th2) {
                    r.Companion companion2 = Sc.r.INSTANCE;
                    a11 = Sc.s.a(th2);
                }
                Throwable b11 = Sc.r.b(a11);
                if (b11 != null) {
                    afRDLog = (afErrorLog + 79) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1gSDK.GENERAL, "Exception while trying to create JSONObject from pushPayload", b11, false, false, false, false, 120, null);
                } else {
                    afErrorLog = (afRDLog + 103) % UserVerificationMethods.USER_VERIFY_PATTERN;
                }
            }
        }
        this.force.AFKeystoreWrapper = null;
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void valueOf(@NotNull Map<String, Object> map) {
        afErrorLog = (afRDLog + 35) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(map, "");
        String string = AFKeystoreWrapper().getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            map.put(AppsFlyerProperties.APP_ID, string);
        }
        String string2 = AFKeystoreWrapper().getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            if (string2.length() != 3) {
                StringBuilder sb2 = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb2.append(string2);
                sb2.append("' is not a legal value.");
                String obj = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(obj, "");
                AFLogger.afWarnLog(obj);
            }
            map.put("currency", string2);
        }
        String string3 = AFKeystoreWrapper().getString(AppsFlyerProperties.IS_UPDATE);
        if (string3 != null) {
            afRDLog = (afErrorLog + 21) % UserVerificationMethods.USER_VERIFY_PATTERN;
            map.put("isUpdate", string3);
        }
        String string4 = AFKeystoreWrapper().getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string4 != null) {
            map.put("customData", string4);
        }
        String string5 = AFKeystoreWrapper().getString(AppsFlyerProperties.APP_USER_ID);
        if (string5 != null) {
            afErrorLog = (afRDLog + 5) % UserVerificationMethods.USER_VERIFY_PATTERN;
            map.put("appUserId", string5);
        }
        String string6 = AFKeystoreWrapper().getString(AppsFlyerProperties.USER_EMAILS);
        if (string6 != null) {
            map.put("user_emails", string6);
            afErrorLog = (afRDLog + 93) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        AFd1ySDK aFd1ySDK = this.force.AFInAppEventType;
        if (aFd1ySDK != null) {
            afErrorLog = (afRDLog + 11) % UserVerificationMethods.USER_VERIFY_PATTERN;
            String[] strArr = aFd1ySDK.AFInAppEventType;
            if (strArr != null) {
                map.put("sharing_filter", strArr);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        r0 = r5.AFLogger.valueOf.f57393e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        r6 = (com.appsflyer.internal.AFg1lSDK.afRDLog + 47) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
        com.appsflyer.internal.AFg1lSDK.afErrorLog = r6;
        com.appsflyer.internal.AFg1lSDK.afRDLog = (r6 + 23) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        r3 = r0.values;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        if (r3 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        com.appsflyer.internal.AFg1lSDK.afRDLog = (com.appsflyer.internal.AFg1lSDK.afErrorLog + 15) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (r3.length() != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        r6.AFInAppEventType("gaidError", r0.values);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        r3 = r0.AFInAppEventType;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (r3 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        com.appsflyer.internal.AFg1lSDK.afRDLog = (com.appsflyer.internal.AFg1lSDK.afErrorLog + 95) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        if (r0.valueOf == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
    
        r6.AFInAppEventType("advertiserId", r3);
        r6.AFInAppEventType("advertiserIdEnabled", java.lang.String.valueOf(r0.valueOf));
        r6.AFInAppEventType("isGaidWithGps", java.lang.String.valueOf(r0.AFInAppEventParameterName));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0029, code lost:
    
        if (r5.AFLogger.unregisterClient() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if ((!r5.AFLogger.unregisterClient()) != true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
    
        r0 = com.appsflyer.internal.AFb1tSDK.values(r6.valueOf());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r0.put("ad_ids_disabled", java.lang.Boolean.TRUE);
     */
    @Override // com.appsflyer.internal.AFg1qSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void values(@NotNull AFa1pSDK aFa1pSDK) {
        AFe1mSDK aFe1mSDK;
        int i11 = afErrorLog + 113;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        boolean z11 = false;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFa1pSDK, "");
            int i12 = 89 / 0;
        } else {
            Intrinsics.checkNotNullParameter(aFa1pSDK, "");
        }
        AFh1xSDK aFh1xSDK = this.AFLogger.valueOf.f57393e;
        if (aFh1xSDK != null) {
            int i13 = afRDLog + 117;
            afErrorLog = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i13 % 2 == 0) {
                z11 = Intrinsics.d(aFh1xSDK.d, Boolean.TRUE);
            } else {
                Intrinsics.d(aFh1xSDK.d, Boolean.TRUE);
                throw null;
            }
        }
        aFa1pSDK.AFInAppEventType("GAID_retry", String.valueOf(z11));
        if (!C7714v.b0(AFf1zSDK.CONVERSION, AFf1zSDK.LAUNCH).contains(aFa1pSDK.AFKeystoreWrapper()) || (aFe1mSDK = this.force.AFLogger) == null) {
            return;
        }
        Map<String, Object> values = AFb1tSDK.values(aFa1pSDK.valueOf());
        Intrinsics.checkNotNullExpressionValue(values, "");
        values.put("fetchAdIdLatency", Long.valueOf(aFe1mSDK.AFKeystoreWrapper));
    }

    private void AFInAppEventType(@NotNull Map<String, Object> map, boolean z11) {
        int i11 = afRDLog + 123;
        afErrorLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("platformextension", this.f57476w.valueOf());
            int i12 = 6 / 0;
            if (!z11) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("platformextension", this.f57476w.valueOf());
            if (!z11) {
                return;
            }
        }
        afRDLog = (afErrorLog + 121) % UserVerificationMethods.USER_VERIFY_PATTERN;
        map.put("platform_extension_v2", this.AFInAppEventType.valueOf());
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void AFInAppEventParameterName(@NotNull Map<String, Object> map, int i11, int i12) {
        boolean z11;
        afRDLog = (afErrorLog + 77) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i11));
        map.put("iaecounter", String.valueOf(i12));
        if (w()) {
            afErrorLog = (afRDLog + 123) % UserVerificationMethods.USER_VERIFY_PATTERN;
            z11 = false;
        } else {
            afRDLog = (afErrorLog + 101) % UserVerificationMethods.USER_VERIFY_PATTERN;
            z11 = true;
        }
        map.put("isFirstCall", String.valueOf(z11));
    }

    private static void AFInAppEventType(@NotNull Map<String, Object> map, String str) {
        afErrorLog = (afRDLog + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(map, "");
        if (str != null) {
            map.put("phone", str);
            afRDLog = (afErrorLog + 41) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0058, code lost:
    
        r7.f57473e.valueOf("prev_event_name", r9);
        r7.f57473e.AFInAppEventParameterName("prev_event_timestamp", java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        com.appsflyer.internal.AFg1lSDK.afErrorLog = (com.appsflyer.internal.AFg1lSDK.afRDLog + 33) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        r1 = new org.json.JSONObject();
        r1.put("prev_event_timestamp", r7.f57473e.AFKeystoreWrapper("prev_event_timestamp", -1));
        r1.put("prev_event_name", r0);
        r8.put("prev_event", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        com.appsflyer.internal.AFg1lSDK.afRDLog = (com.appsflyer.internal.AFg1lSDK.afErrorLog + 1) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r0 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFInAppEventParameterName(@NotNull Map<String, Object> map, @NotNull String str) {
        String AFKeystoreWrapper;
        int i11 = afErrorLog + 53;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            if (i11 % 2 == 0) {
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(str, "");
                AFKeystoreWrapper = this.f57473e.AFKeystoreWrapper("prev_event_name", (String) null);
                int i12 = 9 / 0;
            } else {
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(str, "");
                AFKeystoreWrapper = this.f57473e.AFKeystoreWrapper("prev_event_name", (String) null);
            }
        } catch (Exception e11) {
            AFLogger.afErrorLog("Error while processing previous event.", e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r4 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (r4.length() == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String AFInAppEventParameterName(String str) {
        afErrorLog = (afRDLog + 1) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (AFKeystoreWrapper().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false)) {
            if (str != null) {
                int i11 = afErrorLog + 45;
                afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i11 % 2 == 0) {
                    throw null;
                }
            }
            int i12 = afErrorLog + 81;
            afRDLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i12 % 2 != 0) {
                if (i()) {
                    str = v();
                    afErrorLog = (afRDLog + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    return str;
                }
                str = null;
                afErrorLog = (afRDLog + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return str;
            }
            i();
            throw null;
        }
    }

    private static PackageInfo valueOf(PackageManager packageManager, String str) {
        PackageManager.PackageInfoFlags of2;
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of3;
        PackageInfo packageInfo2;
        afRDLog = (afErrorLog + 37) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (Build.VERSION.SDK_INT >= 33) {
            int i11 = afRDLog + 43;
            afErrorLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i11 % 2 != 0) {
                of3 = PackageManager.PackageInfoFlags.of(1L);
                packageInfo2 = packageManager.getPackageInfo(str, of3);
                Intrinsics.checkNotNullExpressionValue(packageInfo2, "");
                return packageInfo2;
            }
            of2 = PackageManager.PackageInfoFlags.of(0L);
            packageInfo = packageManager.getPackageInfo(str, of2);
            Intrinsics.checkNotNullExpressionValue(packageInfo, "");
            return packageInfo;
        }
        PackageInfo packageInfo3 = packageManager.getPackageInfo(str, 0);
        Intrinsics.checkNotNullExpressionValue(packageInfo3, "");
        afRDLog = (afErrorLog + 103) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return packageInfo3;
    }

    private static boolean AFInAppEventParameterName(File file) {
        afErrorLog = (afRDLog + 121) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (file != null && file.exists()) {
            return false;
        }
        int i11 = afErrorLog + 93;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            return true;
        }
        throw null;
    }

    private String valueOf() throws CertificateException, NoSuchAlgorithmException, PackageManager.NameNotFoundException {
        int i11 = afErrorLog + 59;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            AFb1uSDK.AFInAppEventParameterName(this.values.getApplicationContext().getPackageManager(), this.values.getApplicationContext().getPackageName());
            throw null;
        }
        String AFInAppEventParameterName = AFb1uSDK.AFInAppEventParameterName(this.values.getApplicationContext().getPackageManager(), this.values.getApplicationContext().getPackageName());
        afErrorLog = (afRDLog + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return AFInAppEventParameterName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if (r7.length() == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r7.length() == 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void valueOf(@NotNull Map<String, Object> map, String str) {
        afRDLog = (afErrorLog + 19) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(map, "");
        if (str != null) {
            afRDLog = (afErrorLog + 107) % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (str.length() != 0) {
                afRDLog = (afErrorLog + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
                map.put("referrer", str);
            }
        }
        String AFKeystoreWrapper = this.f57473e.AFKeystoreWrapper("extraReferrers", (String) null);
        boolean z11 = false;
        if (AFKeystoreWrapper != null) {
            int i11 = afErrorLog + 115;
            afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i11 % 2 == 0) {
                map.put("extraReferrers", AFKeystoreWrapper);
                int i12 = 15 / 0;
            } else {
                map.put("extraReferrers", AFKeystoreWrapper);
            }
        }
        String referrer = AFKeystoreWrapper().getReferrer(this.f57473e);
        if (referrer != null) {
            int i13 = afRDLog + 27;
            afErrorLog = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i13 % 2 != 0) {
                int i14 = 14 / 0;
            }
            if (z11) {
                afErrorLog = (afRDLog + 91) % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (map.get("referrer") == null) {
                    map.put("referrer", referrer);
                    return;
                }
                return;
            }
            return;
        }
        z11 = true;
        if (z11) {
        }
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final long values() {
        int i11 = afErrorLog + 95;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            System.currentTimeMillis();
            throw null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        afRDLog = (afErrorLog + 27) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return currentTimeMillis;
    }

    @NotNull
    private String values(@NotNull SimpleDateFormat simpleDateFormat) {
        afRDLog = (afErrorLog + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        String AFKeystoreWrapper = this.f57473e.AFKeystoreWrapper("appsFlyerFirstInstall", (String) null);
        if (AFKeystoreWrapper == null) {
            int i11 = afErrorLog + 111;
            afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i11 % 2 != 0) {
                if (!d()) {
                    AFKeystoreWrapper = "";
                } else {
                    AFLogger.afDebugLog("AppsFlyer: first launch detected");
                    AFKeystoreWrapper = simpleDateFormat.format(new Date());
                }
                this.f57473e.valueOf("appsFlyerFirstInstall", AFKeystoreWrapper);
            } else {
                d();
                throw null;
            }
        }
        AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1gSDK.GENERAL, "AppsFlyer: first launch date: ".concat(String.valueOf(AFKeystoreWrapper)), false, 4, null);
        Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
        return AFKeystoreWrapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void values(@NotNull Map<String, Object> map, String str) {
        boolean z11;
        String AFInAppEventParameterName;
        AFa1bSDK AFInAppEventParameterName2;
        Intrinsics.checkNotNullParameter(map, "");
        if (!AFKeystoreWrapper().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            String values = this.f57472d.values(this.f57473e);
            if (values != null) {
                int i11 = afErrorLog + 53;
                afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i11 % 2 != 0) {
                    if (values.length() != 0) {
                        z11 = false;
                        if (!z11) {
                            map.put("imei", values);
                        }
                        AFInAppEventParameterName = AFInAppEventParameterName(str);
                        if (AFInAppEventParameterName == null) {
                            int i12 = afErrorLog + 9;
                            afRDLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
                            if (i12 % 2 != 0) {
                                this.f57473e.valueOf("androidIdCached", AFInAppEventParameterName);
                                map.put("android_id", AFInAppEventParameterName);
                            } else {
                                this.f57473e.valueOf("androidIdCached", AFInAppEventParameterName);
                                map.put("android_id", AFInAppEventParameterName);
                                throw null;
                            }
                        } else {
                            AFLogger.afInfoLog("Android ID was not collected.");
                        }
                        AFInAppEventParameterName2 = AFb1rSDK.AFInAppEventParameterName(this.values);
                        if (AFInAppEventParameterName2 == null) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Boolean bool = AFInAppEventParameterName2.values;
                            Intrinsics.checkNotNullExpressionValue(bool, "");
                            linkedHashMap.put("isManual", bool);
                            String str2 = AFInAppEventParameterName2.AFInAppEventParameterName;
                            Intrinsics.checkNotNullExpressionValue(str2, "");
                            linkedHashMap.put("val", str2);
                            Boolean bool2 = AFInAppEventParameterName2.AFKeystoreWrapper;
                            if (bool2 != null) {
                                int i13 = afRDLog + 5;
                                afErrorLog = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
                                if (i13 % 2 != 0) {
                                    linkedHashMap.put("isLat", bool2);
                                    int i14 = 23 / 0;
                                } else {
                                    linkedHashMap.put("isLat", bool2);
                                }
                            }
                            map.put("oaid", linkedHashMap);
                            return;
                        }
                        return;
                    }
                } else {
                    values.length();
                    throw null;
                }
            }
            afErrorLog = (afRDLog + 31) % UserVerificationMethods.USER_VERIFY_PATTERN;
            z11 = true;
            if (!z11) {
            }
            AFInAppEventParameterName = AFInAppEventParameterName(str);
            if (AFInAppEventParameterName == null) {
            }
            AFInAppEventParameterName2 = AFb1rSDK.AFInAppEventParameterName(this.values);
            if (AFInAppEventParameterName2 == null) {
            }
        } else {
            int i15 = afRDLog + 95;
            afErrorLog = i15 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i15 % 2 == 0) {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            } else {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                int i16 = 79 / 0;
            }
        }
    }

    private final String valueOf(String str) {
        afErrorLog = (afRDLog + 115) % UserVerificationMethods.USER_VERIFY_PATTERN;
        String AFInAppEventParameterName = this.AFLogger.AFInAppEventParameterName(str);
        afRDLog = (afErrorLog + 89) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return AFInAppEventParameterName;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x004f -> B:25:0x007d). Please report as a decompilation issue!!! */
    private static String valueOf(File file, String str) {
        InputStreamReader inputStreamReader;
        Properties properties;
        try {
            try {
                if (file == null) {
                    return null;
                }
                try {
                    properties = new Properties();
                    inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
                } catch (FileNotFoundException unused) {
                    inputStreamReader = null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStreamReader = null;
                }
                try {
                    properties.load(inputStreamReader);
                    AFLogger.afInfoLog("Found PreInstall property!");
                    String property = properties.getProperty(str);
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th3) {
                        AFLogger.afErrorLog(th3.getMessage(), th3);
                    }
                    int i11 = afRDLog + 23;
                    afErrorLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i11 % 2 == 0) {
                        return property;
                    }
                    throw null;
                } catch (FileNotFoundException unused2) {
                    StringBuilder sb2 = new StringBuilder("PreInstall file wasn't found: ");
                    sb2.append(file.getAbsolutePath());
                    AFLogger.afDebugLog(sb2.toString());
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    } else {
                        afErrorLog = (afRDLog + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    return null;
                } catch (Throwable th4) {
                    th = th4;
                    AFLogger.afErrorLog(th.getMessage(), th);
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    return null;
                }
            } catch (Throwable th5) {
                if (inputStreamReader != null) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th6) {
                        AFLogger.afErrorLog(th6.getMessage(), th6);
                    }
                }
                throw th5;
            }
        } catch (Throwable th7) {
            AFLogger.afErrorLog(th7.getMessage(), th7);
        }
    }

    private static void valueOf(@NotNull Map<String, Object> map, @NotNull AFa1pSDK aFa1pSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFa1pSDK, "");
        String str = aFa1pSDK.AFLogger;
        if (str != null) {
            map.put("eventName", str);
            Map map2 = aFa1pSDK.AFKeystoreWrapper;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        com.appsflyer.internal.AFg1lSDK.afRDLog = (com.appsflyer.internal.AFg1lSDK.afErrorLog + 11) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        unregisterClient(r0);
        v(r0);
        force(r0);
        com.appsflyer.internal.AFb1gSDK.AFKeystoreWrapper(r4.afInfoLog, r4.f57473e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r5.AFKeystoreWrapper() == com.appsflyer.internal.AFf1zSDK.CONVERSION) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r5.AFKeystoreWrapper() == com.appsflyer.internal.AFf1zSDK.CONVERSION) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void values(@NotNull AFa1pSDK aFa1pSDK, String str, String str2, AFc1dSDK aFc1dSDK) {
        Map<String, Object> valueOf;
        int i11 = afErrorLog + 83;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFa1pSDK, "");
            valueOf = aFa1pSDK.valueOf();
            int i12 = 90 / 0;
        } else {
            Intrinsics.checkNotNullParameter(aFa1pSDK, "");
            valueOf = aFa1pSDK.valueOf();
        }
        Intrinsics.checkNotNullExpressionValue(valueOf, "");
        afInfoLog(valueOf);
        AFLogger(valueOf);
        e(valueOf);
        AFInAppEventType(valueOf, str2);
        valueOf(valueOf, str);
        w(valueOf);
        if (aFc1dSDK != null) {
            int i13 = afRDLog + 5;
            afErrorLog = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i13 % 2 == 0) {
                aFc1dSDK.AFKeystoreWrapper(valueOf);
            } else {
                aFc1dSDK.AFKeystoreWrapper(valueOf);
                int i14 = 29 / 0;
            }
        }
    }

    private static void values(@NotNull Map<String, Object> map, boolean z11) {
        int i11 = afErrorLog + 49;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("af_preinstalled", String.valueOf(z11));
            int i12 = 80 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("af_preinstalled", String.valueOf(z11));
        }
        afRDLog = (afErrorLog + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private void values(@NotNull Map<String, Object> map, @NotNull Function0<String> function0) {
        afRDLog = (afErrorLog + 27) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (AFKeystoreWrapper().getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
            String str = null;
            try {
                this.values.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                str = function0.invoke();
            } catch (PackageManager.NameNotFoundException e11) {
                AFLogger.afErrorLogForExcManagerOnly("com.facebook.katana not found", e11, true);
                AFLogger.afWarnLog("Exception while collecting facebook's attribution ID. ");
            } catch (Throwable th2) {
                AFLogger.afErrorLog("Exception while collecting facebook's attribution ID. ", th2);
            }
            if (str != null) {
                afErrorLog = (afRDLog + 73) % UserVerificationMethods.USER_VERIFY_PATTERN;
                map.put("fb", str);
                afRDLog = (afErrorLog + 95) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
        }
    }

    private static String values(AFd1tSDK aFd1tSDK, String str) {
        afRDLog = (afErrorLog + 57) % UserVerificationMethods.USER_VERIFY_PATTERN;
        String AFKeystoreWrapper = aFd1tSDK.AFKeystoreWrapper("CACHED_CHANNEL", (String) null);
        if (AFKeystoreWrapper != null) {
            int i11 = afRDLog + 97;
            afErrorLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i11 % 2 != 0) {
                int i12 = 75 / 0;
            }
            return AFKeystoreWrapper;
        }
        aFd1tSDK.valueOf("CACHED_CHANNEL", str);
        return str;
    }

    private static File values(String str) {
        int i11 = afRDLog + 51;
        afErrorLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            try {
                int i12 = 61 / 0;
                if (str == null) {
                    return null;
                }
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getMessage(), th2);
                return null;
            }
        } else if (str == null) {
            return null;
        }
        if (kotlin.text.h.z0(str).toString().length() <= 0) {
            return null;
        }
        afRDLog = (afErrorLog + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return new File(kotlin.text.h.z0(str).toString());
    }
}
