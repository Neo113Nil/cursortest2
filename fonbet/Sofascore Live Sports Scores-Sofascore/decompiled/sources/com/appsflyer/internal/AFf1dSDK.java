package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.km5;
import defpackage.lnb;
import defpackage.ph0;
import defpackage.vxd;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFf1dSDK implements AFf1cSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int afDebugLog = 0;
    private static int afErrorLog = 1;
    private static long afWarnLog = -2859194159656813137L;

    @NotNull
    private final AFc1hSDK AFKeystoreWrapper;

    @NotNull
    private final AFc1gSDK AFLogger;

    @NotNull
    private final AFc1aSDK d;

    @NotNull
    private final AFf1bSDK e;

    @NotNull
    private final AppsFlyerProperties force;

    @NotNull
    private final AFc1cSDK i;

    @NotNull
    private final AFa1aSDK registerClient;

    @NotNull
    private final AFi1lSDK unregisterClient;

    @NotNull
    private final ScheduledExecutorService v;

    @NotNull
    private final AFf1oSDK w;

    public AFf1dSDK(@NotNull AFc1aSDK aFc1aSDK, @NotNull AFa1aSDK aFa1aSDK, @NotNull AFi1lSDK aFi1lSDK, @NotNull AFc1hSDK aFc1hSDK, @NotNull AFc1gSDK aFc1gSDK, @NotNull AFc1cSDK aFc1cSDK, @NotNull AFf1bSDK aFf1bSDK, @NotNull AFf1oSDK aFf1oSDK, @NotNull AppsFlyerProperties appsFlyerProperties, @NotNull ScheduledExecutorService scheduledExecutorService) {
        aFc1aSDK.getClass();
        aFa1aSDK.getClass();
        aFi1lSDK.getClass();
        aFc1hSDK.getClass();
        aFc1gSDK.getClass();
        aFc1cSDK.getClass();
        aFf1bSDK.getClass();
        aFf1oSDK.getClass();
        appsFlyerProperties.getClass();
        scheduledExecutorService.getClass();
        this.d = aFc1aSDK;
        this.registerClient = aFa1aSDK;
        this.unregisterClient = aFi1lSDK;
        this.AFKeystoreWrapper = aFc1hSDK;
        this.AFLogger = aFc1gSDK;
        this.i = aFc1cSDK;
        this.e = aFf1bSDK;
        this.w = aFf1oSDK;
        this.force = appsFlyerProperties;
        this.v = scheduledExecutorService;
    }

    private void AFKeystoreWrapper(@NotNull AFh1zSDK aFh1zSDK) {
        aFh1zSDK.getClass();
        AFc1aSDK aFc1aSDK = this.d;
        int i = 0;
        AFh1zSDK AFKeystoreWrapper = aFh1zSDK.AFKeystoreWrapper(this.AFKeystoreWrapper.AFKeystoreWrapper.d("appsFlyerCount", 0));
        AFKeystoreWrapper.getClass();
        AFa1pSDK aFa1pSDK = new AFa1pSDK(aFc1aSDK, AFKeystoreWrapper, this.registerClient.d());
        long j = 0;
        if (aFh1zSDK.v == null && aFh1zSDK.e == null) {
            afDebugLog = (afErrorLog + 79) % 128;
            Referrer[] referrerArr = (Referrer[]) this.unregisterClient.unregisterClient.toArray(new Referrer[0]);
            int length = referrerArr.length;
            while (i < length) {
                Referrer referrer = referrerArr[i];
                if (referrer.getState() == Referrer.State.STARTED) {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.REFERRER, lnb.o("Failed to get ", referrer.getSource(), " referrer, wait ..."), false, 4, null);
                    afDebugLog = (afErrorLog + 93) % 128;
                    j = 500;
                }
                i++;
                afErrorLog = (afDebugLog + 107) % 128;
            }
            if (this.registerClient.unregisterClient()) {
                int i2 = afDebugLog + 101;
                afErrorLog = i2 % 128;
                if (i2 % 2 == 0) {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.REFERRER, "fetching Facebook deferred AppLink data, wait ...", false, 5, null);
                } else {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.REFERRER, "fetching Facebook deferred AppLink data, wait ...", false, 4, null);
                }
                j = 500;
            }
            if (this.w.unregisterClient()) {
                afDebugLog = (afErrorLog + 59) % 128;
                j = 500;
            }
        }
        AFj1tSDK.d(this.v, aFa1pSDK, j, TimeUnit.MILLISECONDS);
    }

    private boolean AFLogger() {
        if (this.AFLogger.AppsFlyerLib <= 0) {
            if (this.w.AFLogger()) {
                return false;
            }
            AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Sending first launch for this session!", false, 4, null);
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.AFLogger.AppsFlyerLib;
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
        long j = this.AFLogger.AppsFlyerLib;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date(j));
        long j2 = this.AFLogger.enableTCFDataCollection;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format2 = simpleDateFormat.format(new Date(j2));
        if (currentTimeMillis < this.AFLogger.getSdkVersion) {
            int i = afErrorLog + 55;
            afDebugLog = i % 128;
            int i2 = i % 2;
            AFf1oSDK aFf1oSDK = this.w;
            if (i2 != 0) {
                aFf1oSDK.AFLogger();
                throw null;
            }
            if (!aFf1oSDK.AFLogger()) {
                AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", Arrays.copyOf(new Object[]{format, format2, Long.valueOf(currentTimeMillis), Long.valueOf(this.AFLogger.getSdkVersion)}, 4)), false, 4, null);
                return true;
            }
        }
        if (this.w.AFLogger()) {
            return false;
        }
        afErrorLog = (afDebugLog + 27) % 128;
        AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", Arrays.copyOf(new Object[]{format, format2, Long.valueOf(currentTimeMillis)}, 3)), false, 4, null);
        return false;
    }

    private static void a(String str, int i, Object[] objArr) {
        int i2 = $11 + 61;
        $10 = i2 % 128;
        char[] cArr = str;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFj1bSDK aFj1bSDK = new AFj1bSDK();
        aFj1bSDK.AFLogger = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        aFj1bSDK.AFKeystoreWrapper = 0;
        while (true) {
            int i3 = aFj1bSDK.AFKeystoreWrapper;
            if (i3 >= cArr2.length) {
                break;
            }
            int i4 = $11 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                jArr[i3] = (afWarnLog / 469819795863357686L) * (cArr2[i3] | (i3 + aFj1bSDK.AFLogger));
            } else {
                jArr[i3] = (afWarnLog ^ 469819795863357686L) ^ (cArr2[i3] ^ (i3 * aFj1bSDK.AFLogger));
                i3++;
            }
            aFj1bSDK.AFKeystoreWrapper = i3;
        }
        char[] cArr3 = new char[length];
        aFj1bSDK.AFKeystoreWrapper = 0;
        while (true) {
            int i5 = aFj1bSDK.AFKeystoreWrapper;
            if (i5 >= cArr2.length) {
                objArr[0] = new String(cArr3);
                return;
            } else {
                cArr3[i5] = (char) jArr[i5];
                aFj1bSDK.AFKeystoreWrapper = i5 + 1;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r2 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r0 = r10.AFKeystoreWrapper.AFLogger("AF_LAUNCH_PROTECT_ENABLED");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r0 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        r0 = java.lang.Boolean.parseBoolean(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r0 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (AFLogger() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        com.appsflyer.internal.AFf1dSDK.afDebugLog = (com.appsflyer.internal.AFf1dSDK.afErrorLog + 53) % 128;
        r10 = r11.unregisterClient;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r10 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r10.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        r10.AFLogger.AppsFlyerLib = java.lang.System.currentTimeMillis();
        com.appsflyer.internal.AFf1dSDK.afDebugLog = (com.appsflyer.internal.AFf1dSDK.afErrorLog + 15) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        com.appsflyer.sdk_base.logger.AFLoggerBase.i$default(com.appsflyer.AFLogger.INSTANCE, com.appsflyer.sdk_base.logger.LogTag.SDK_LIFECYCLE, defpackage.vxd.m("Allowing multiple launches within a ", r10.AFLogger.getSdkVersion / 1000, " second time window."), false, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0023, code lost:
    
        if (r2 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean d(@NotNull AFh1zSDK aFh1zSDK) {
        aFh1zSDK.getClass();
        if (!aFh1zSDK.unregisterClient() && aFh1zSDK.v == null) {
            int i = afDebugLog + 49;
            afErrorLog = i % 128;
            int i2 = i % 2;
            String str = aFh1zSDK.e;
            if (i2 == 0) {
                int i3 = 71 / 0;
            }
        }
        return false;
    }

    @NotNull
    private Map<String, Object> registerClient(@NotNull Context context, @NotNull AFh1zSDK aFh1zSDK) {
        context.getClass();
        aFh1zSDK.getClass();
        boolean z = true;
        boolean z2 = aFh1zSDK.v == null && aFh1zSDK.e == null;
        Map<String, Object> map = aFh1zSDK.AFKeystoreWrapper;
        long time = new Date().getTime();
        map.getClass();
        Object[] objArr = new Object[1];
        a("甸攔啐䖬㖜◣ᐾЇ\uf475\ue4bb풚쓰", 4139 - (Process.myTid() >> 22), objArr);
        map.put(((String) objArr[0]).intern(), String.valueOf(time));
        try {
            if (this.w.AFLogger()) {
                AFLogger.INSTANCE.i(LogTag.GENERAL, "AppsFlyer SDK Reporting has been stopped", true);
            } else {
                String str = z2 ? "Launch" : aFh1zSDK.v;
                AFLogger.INSTANCE.i(LogTag.GENERAL, "******* sendTrackingWithEvent: " + str, true);
            }
            AFKeystoreWrapper(context);
            AFc1hSDK aFc1hSDK = this.AFKeystoreWrapper;
            int d = aFc1hSDK.AFKeystoreWrapper.d("appsFlyerCount", 0);
            if (z2) {
                int i = afErrorLog + 47;
                afDebugLog = i % 128;
                int i2 = i % 2;
                AFc1pSDK aFc1pSDK = aFc1hSDK.AFKeystoreWrapper;
                if (i2 != 0) {
                    d += 109;
                    aFc1pSDK.AFKeystoreWrapper("appsFlyerCount", d);
                } else {
                    d++;
                    aFc1pSDK.AFKeystoreWrapper("appsFlyerCount", d);
                }
            }
            AFc1hSDK aFc1hSDK2 = this.AFKeystoreWrapper;
            if (z2) {
                z = false;
            } else {
                afDebugLog = (afErrorLog + 11) % 128;
            }
            int d2 = aFc1hSDK2.AFKeystoreWrapper.d("appsFlyerInAppEventCount", 0);
            if (z) {
                d2++;
                aFc1hSDK2.AFKeystoreWrapper.AFKeystoreWrapper("appsFlyerInAppEventCount", d2);
            }
            this.e.registerClient(map, d, d2);
            return map;
        } catch (Throwable th) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "Error while preparing to send event", th, true, true, true, false, 64, null);
            return map;
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        AFf1dSDK aFf1dSDK = (AFf1dSDK) objArr[0];
        AFh1zSDK aFh1zSDK = (AFh1zSDK) objArr[1];
        aFh1zSDK.getClass();
        Map<String, Object> map = aFh1zSDK.AFKeystoreWrapper;
        if (!aFf1dSDK.AFLogger.e) {
            int i = afDebugLog + 67;
            afErrorLog = i % 128;
            if (i % 2 != 0) {
                if (map.get("advertiserId") != null) {
                    try {
                        String str = aFf1dSDK.AFLogger.AFLogger;
                        if (str == null || str.length() == 0) {
                            afErrorLog = (afDebugLog + 29) % 128;
                            if (map.remove("android_id") != null) {
                                AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.GENERAL, "validateGaidAndAndroidId :: removing: android_id", false, 4, null);
                                return null;
                            }
                        }
                    } catch (Exception e) {
                        AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "failed to remove AndroidID key from params; ", e, false, false, false, false, 120, null);
                    }
                    return null;
                }
            } else {
                map.get("advertiserId");
                throw null;
            }
        }
        return null;
    }

    private static void AFKeystoreWrapper(Context context) {
        List list;
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                afDebugLog = (afErrorLog + 35) % 128;
                list = ph0.X(strArr);
                afDebugLog = (afErrorLog + 77) % 128;
            } else {
                list = null;
            }
            if (list == null) {
                list = km5.a;
            }
            if (!list.contains("android.permission.INTERNET")) {
                AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml", false, 4, null);
            }
            if (!list.contains("android.permission.ACCESS_NETWORK_STATE")) {
                int i = afErrorLog + Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE;
                afDebugLog = i % 128;
                if (i % 2 != 0) {
                    AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml", false, 2, null);
                } else {
                    AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml", false, 4, null);
                }
            }
            if (Build.VERSION.SDK_INT <= 32 || list.contains("com.google.android.gms.permission.AD_ID")) {
                return;
            }
            afDebugLog = (afErrorLog + 65) % 128;
            AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml", false, 4, null);
        } catch (Exception e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "Exception while validation permissions. ", e, false, false, false, false, 120, null);
        }
    }

    public static /* synthetic */ Object AFLogger(Object[] objArr, int i, int i2, int i3) {
        return d(objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFLogger(AFf1dSDK aFf1dSDK, AFh1zSDK aFh1zSDK, Context context) {
        afDebugLog = (afErrorLog + 53) % 128;
        aFf1dSDK.AFLogger(aFh1zSDK, context);
        afDebugLog = (afErrorLog + 33) % 128;
    }

    private void AFLogger(@NotNull AFh1zSDK aFh1zSDK, @NotNull Context context) {
        int i = afErrorLog + 45;
        afDebugLog = i % 128;
        if (i % 2 == 0) {
            aFh1zSDK.getClass();
            context.getClass();
            this.force.saveProperties();
            if (!this.w.AFLogger()) {
                int i2 = afErrorLog + 109;
                afDebugLog = i2 % 128;
                int i3 = i2 % 2;
                AFLogger.INSTANCE.i(LogTag.GENERAL, "sendTrackingWith with context: ".concat(context.getClass().getName()), true);
            }
            aFh1zSDK.AFLogger(registerClient(context, aFh1zSDK));
            AFLogger(new Object[]{this, aFh1zSDK}, -1236293330, 1236293330, System.identityHashCode(this));
            AFKeystoreWrapper(aFh1zSDK);
            return;
        }
        aFh1zSDK.getClass();
        context.getClass();
        this.force.saveProperties();
        this.w.AFLogger();
        throw null;
    }

    private void registerClient(@NotNull AFh1zSDK aFh1zSDK) {
        AFLogger(new Object[]{this, aFh1zSDK}, -1236293330, 1236293330, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFf1cSDK
    public final void AFLogger(@NotNull AFh1zSDK aFh1zSDK) {
        aFh1zSDK.getClass();
        int i = 0;
        if (d(aFh1zSDK)) {
            int i2 = afDebugLog + 27;
            afErrorLog = i2 % 128;
            int i3 = i2 % 2;
            AFc1gSDK aFc1gSDK = this.AFLogger;
            if (i3 == 0) {
                AFLogger.INSTANCE.d(LogTag.GENERAL, vxd.m("Blocking multiple consecutive Launch events within ", aFc1gSDK.getSdkVersion / 1000, " seconds time window"), false);
                return;
            } else {
                AFLogger.INSTANCE.d(LogTag.GENERAL, vxd.m("Blocking multiple consecutive Launch events within ", aFc1gSDK.getSdkVersion / 1000, " seconds time window"), true);
                return;
            }
        }
        Context context = this.i.d;
        if (context == null) {
            int i4 = afErrorLog + 89;
            afDebugLog = i4 % 128;
            if (i4 % 2 != 0) {
                AFLogger.INSTANCE.d(LogTag.ATTRIBUTION, "sendWithEvent - got null context. skipping event/launch.", true);
                return;
            } else {
                AFLogger.INSTANCE.d(LogTag.ATTRIBUTION, "sendWithEvent - got null context. skipping event/launch.", true);
                return;
            }
        }
        AFf1oSDK aFf1oSDK = this.w;
        String str = (String) AFf1oSDK.AFLogger(new Object[]{aFf1oSDK}, 343398987, -343398985, System.identityHashCode(aFf1oSDK));
        if (str != null && str.length() != 0) {
            AFj1tSDK.d(this.v, new p(i, this, aFh1zSDK, context), 0L, TimeUnit.MILLISECONDS);
            return;
        }
        afErrorLog = (afDebugLog + 75) % 128;
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.GENERAL;
        aFLogger.i(logTag, "AppsFlyer dev key is missing! AppsFlyer's SDK cannot send any events without providing the dev key.", true);
        aFLogger.i(logTag, "AppsFlyer will not track this event.", true);
        AppsFlyerRequestListener appsFlyerRequestListener = aFh1zSDK.unregisterClient;
        if (appsFlyerRequestListener != null) {
            appsFlyerRequestListener.onError(41, "No dev key");
        } else {
            afDebugLog = (afErrorLog + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
        }
    }
}
