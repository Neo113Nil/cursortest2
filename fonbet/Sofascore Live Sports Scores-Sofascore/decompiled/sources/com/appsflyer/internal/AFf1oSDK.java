package com.appsflyer.internal;

import android.content.Context;
import android.os.Process;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.util.OptionalFeaturesValidator;
import com.appsflyer.sdk_base.util.SupportedOptionalFeatures;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFf1oSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFLoggerLogLevel = 1;
    private static char afInfoLog = 2163;
    private static int afWarnLog = 0;
    private static char force = 12746;
    private static char i = 43186;
    private static char w = 45430;

    @NonNull
    private final AFc1cSDK AFKeystoreWrapper;
    Map<String, Object> AFLogger;

    @NonNull
    private final OptionalFeaturesValidator d;
    private volatile String e;
    private long unregisterClient;
    private boolean registerClient = false;
    private volatile boolean v = false;

    public AFf1oSDK(@NonNull AFc1cSDK aFc1cSDK, @NonNull OptionalFeaturesValidator optionalFeaturesValidator) {
        this.AFKeystoreWrapper = aFc1cSDK;
        this.d = optionalFeaturesValidator;
    }

    public static /* synthetic */ Object AFLogger(Object[] objArr, int i2, int i3, int i4) {
        int i5 = (i3 * (-712)) + (i2 * 714);
        int i6 = ~i2;
        int i7 = ~i4;
        int i8 = (~(i6 | i3)) | (~(i6 | i7));
        int i9 = ~i3;
        int i10 = ~(i2 | i9 | i4);
        int i11 = ((~(i9 | i7)) * 713) + (i10 * 1426) + ((i8 | i10) * (-713)) + i5;
        return i11 != 1 ? i11 != 2 ? unregisterClient(objArr) : AFKeystoreWrapper(objArr) : registerClient(objArr);
    }

    private static void a(String str, int i2, Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i3 = $10 + 111;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        AFj1cSDK aFj1cSDK = new AFj1cSDK();
        char[] cArr3 = new char[cArr2.length];
        aFj1cSDK.d = 0;
        char[] cArr4 = new char[2];
        while (true) {
            int i4 = aFj1cSDK.d;
            if (i4 >= cArr2.length) {
                objArr[0] = new String(cArr3, 0, i2);
                return;
            }
            $11 = ($10 + 35) % 128;
            cArr4[0] = cArr2[i4];
            cArr4[1] = cArr2[i4 + 1];
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                int i7 = $10;
                char c = cArr4[1];
                char c2 = cArr4[0];
                char c3 = (char) (c - (((c2 + i5) ^ ((c2 << 4) + ((char) (force ^ (-4199718916349371482L))))) ^ ((c2 >>> 5) + ((char) (afInfoLog ^ (-4199718916349371482L))))));
                cArr4[1] = c3;
                cArr4[0] = (char) (c2 - (((c3 >>> 5) + ((char) (i ^ (-4199718916349371482L)))) ^ ((c3 + i5) ^ ((c3 << 4) + ((char) (w ^ (-4199718916349371482L)))))));
                i5 -= 40503;
                i6++;
                $11 = (i7 + 95) % 128;
            }
            int i8 = aFj1cSDK.d;
            cArr3[i8] = cArr4[0];
            cArr3[i8 + 1] = cArr4[1];
            aFj1cSDK.d = i8 + 2;
        }
    }

    private long force() {
        int i2 = afWarnLog;
        int i3 = i2 + 7;
        AFLoggerLogLevel = i3 % 128;
        int i4 = i3 % 2;
        long j = this.unregisterClient;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        AFLoggerLogLevel = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    private boolean i() {
        int i2 = afWarnLog;
        AFLoggerLogLevel = (i2 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        Map<String, Object> map = this.AFLogger;
        if (map != null) {
            AFLoggerLogLevel = (i2 + 29) % 128;
            if (!map.isEmpty()) {
                AFLoggerLogLevel = (afWarnLog + 71) % 128;
                return true;
            }
        }
        int i3 = AFLoggerLogLevel + 39;
        afWarnLog = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0033, code lost:
    
        if (r3.length() == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003d, code lost:
    
        r3 = r3.substring(0, 8);
        r7.d = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x003a, code lost:
    
        if (r3.length() == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object unregisterClient(Object[] objArr) {
        String str;
        int i2 = 0;
        AFh1zSDK aFh1zSDK = (AFh1zSDK) objArr[0];
        AFc1hSDK aFc1hSDK = (AFc1hSDK) objArr[1];
        String str2 = aFc1hSDK.d;
        if (str2 == null || str2.length() == 0) {
            String AFLogger = aFc1hSDK.AFLogger("com.appsflyer.security.uuid");
            if (AFLogger != null) {
                int i3 = afWarnLog + 15;
                AFLoggerLogLevel = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 55 / 0;
                }
                str = r3;
            }
            int i5 = AFLoggerLogLevel + 5;
            afWarnLog = i5 % 128;
            String str3 = null;
            if (i5 % 2 != 0) {
                throw null;
            }
            str = str3;
        } else {
            str = aFc1hSDK.d;
        }
        if (str != null) {
            afWarnLog = (AFLoggerLogLevel + 21) % 128;
            if (!str.isEmpty()) {
                try {
                    Map<String, Object> map = aFh1zSDK.AFKeystoreWrapper;
                    Object[] objArr2 = new Object[1];
                    a("᩿뺹屲\ue8bb垏✻㸍哢룵솾鐃㛈", 12 - KeyEvent.getDeadChar(0, 0), objArr2);
                    long parseLong = Long.parseLong(String.valueOf(map.get(((String) objArr2[0]).intern())));
                    char[] charArray = str.toCharArray();
                    int i6 = ((int) (parseLong % 94)) + 33;
                    while (i2 < charArray.length) {
                        int i7 = afWarnLog + 109;
                        AFLoggerLogLevel = i7 % 128;
                        if (i7 % 2 == 0) {
                            charArray[i2] = (char) (charArray[i2] ^ i6);
                            i2 += 35;
                        } else {
                            charArray[i2] = (char) (charArray[i2] ^ i6);
                            i2++;
                        }
                    }
                    aFh1zSDK.registerClient.put("af-sdk-sbid", Base64.encodeToString(new String(charArray).getBytes(Charset.defaultCharset()), 2));
                    return Boolean.TRUE;
                } catch (Exception e) {
                    AFLogger.INSTANCE.e(LogTag.GENERAL, "Exception occurred while generating sbid ", e);
                    return Boolean.FALSE;
                }
            }
        }
        AFLogger.INSTANCE.d(LogTag.SECURITY_SDK, "the module is not detected");
        return Boolean.FALSE;
    }

    @NonNull
    private static AFf1nSDK v() {
        AFf1nSDK aFf1nSDK = new AFf1nSDK();
        AFLoggerLogLevel = (afWarnLog + 25) % 128;
        return aFf1nSDK;
    }

    public final Map<String, Object> AFKeystoreWrapper(Map<String, Object> map) {
        try {
            try {
                Object[] objArr = {map, this.AFKeystoreWrapper.d};
                Map map2 = AFb1ySDK.getInstance;
                Object obj = map2.get(1262368928);
                if (obj == null) {
                    obj = ((Class) AFb1ySDK.AFLogger(MotionEvent.axisFromString("") + 37, 126 - (Process.myPid() >> 22), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getDeclaredConstructor(Map.class, Context.class);
                    map2.put(1262368928, obj);
                }
                Map<String, Object> map3 = (Map) ((Constructor) obj).newInstance(objArr);
                AFLoggerLogLevel = (afWarnLog + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
                return map3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(LogTag.ANTI_FRAUD, "AFCksmV3: reflection init failed", th2, false, false);
            return new HashMap();
        }
    }

    public final void d() {
        int i2 = AFLoggerLogLevel + 21;
        afWarnLog = i2 % 128;
        int i3 = i2 % 2;
        this.AFLogger.put("ttr", Long.valueOf(System.currentTimeMillis() - this.unregisterClient));
        this.AFLogger.put("lvl_timestamp", Long.valueOf(force()));
        afWarnLog = (AFLoggerLogLevel + 81) % 128;
    }

    @NonNull
    public final Map<String, Object> registerClient() {
        HashMap hashMap = new HashMap();
        if (i()) {
            AFLoggerLogLevel = (afWarnLog + 85) % 128;
            hashMap.put("lvl", this.AFLogger);
            return hashMap;
        }
        if (this.registerClient) {
            this.AFLogger = new HashMap();
            d();
            this.AFLogger.put("error", "pending LVL response");
            hashMap.put("lvl", this.AFLogger);
            afWarnLog = (AFLoggerLogLevel + 41) % 128;
        }
        return hashMap;
    }

    public final boolean AFLogger() {
        int i2 = AFLoggerLogLevel + 25;
        afWarnLog = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.v;
        if (i3 != 0) {
            throw null;
        }
        AFLoggerLogLevel = (afWarnLog + 95) % 128;
        return z;
    }

    public final Map<String, Object> d(Map<String, Object> map) {
        return (Map) AFLogger(new Object[]{this, map}, -1693088583, 1693088584, System.identityHashCode(this));
    }

    private static /* synthetic */ Object registerClient(Object[] objArr) {
        AFc1fSDK aFc1fSDK = new AFc1fSDK((Map) objArr[1], ((AFf1oSDK) objArr[0]).AFKeystoreWrapper.d);
        int i2 = AFLoggerLogLevel + 19;
        afWarnLog = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 12 / 0;
        }
        return aFc1fSDK;
    }

    public static boolean registerClient(AFh1zSDK aFh1zSDK, AFc1hSDK aFc1hSDK) {
        return ((Boolean) AFLogger(new Object[]{aFh1zSDK, aFc1hSDK}, 1357919408, -1357919408, (int) System.currentTimeMillis())).booleanValue();
    }

    private static /* synthetic */ Object AFKeystoreWrapper(Object[] objArr) {
        AFf1oSDK aFf1oSDK = (AFf1oSDK) objArr[0];
        afWarnLog = (AFLoggerLogLevel + 57) % 128;
        String str = aFf1oSDK.e;
        int i2 = AFLoggerLogLevel + 23;
        afWarnLog = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private long AFKeystoreWrapper(AFc1hSDK aFc1hSDK) {
        StringBuilder sb = new StringBuilder();
        sb.append(AFb1mSDK.unregisterClient(aFc1hSDK.AFKeystoreWrapper));
        sb.append(force());
        long unregisterClient = AFj1xSDK.unregisterClient(AFj1xSDK.d(sb.toString()));
        int i2 = AFLoggerLogLevel + 67;
        afWarnLog = i2 % 128;
        if (i2 % 2 == 0) {
            return unregisterClient;
        }
        throw null;
    }

    @Nullable
    public final String AFKeystoreWrapper() {
        return (String) AFLogger(new Object[]{this}, 343398987, -343398985, System.identityHashCode(this));
    }

    public final void unregisterClient(boolean z) {
        int i2 = afWarnLog + 87;
        AFLoggerLogLevel = i2 % 128;
        if (i2 % 2 != 0) {
            this.v = z;
        } else {
            this.v = z;
            throw null;
        }
    }

    public static void unregisterClient(AFh1zSDK aFh1zSDK, byte[] bArr) {
        try {
            new AFb1sSDK(aFh1zSDK, bArr).afInfoLog();
            afWarnLog = (AFLoggerLogLevel + 39) % 128;
        } catch (Exception e) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            aFLogger.e(LogTag.SECURITY, "native: reflection init failed", e, false, false);
            aFLogger.e(LogTag.SECURITY_SDK, "the module detected but malfunctioning", e, false, false);
        }
    }

    public final boolean unregisterClient() {
        if (!this.registerClient) {
            return false;
        }
        int i2 = afWarnLog + 41;
        AFLoggerLogLevel = i2 % 128;
        if (i2 % 2 == 0) {
            i();
            throw null;
        }
        if (i()) {
            return false;
        }
        afWarnLog = (AFLoggerLogLevel + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        r5 = com.appsflyer.internal.AFf1oSDK.afWarnLog + 49;
        com.appsflyer.internal.AFf1oSDK.AFLoggerLogLevel = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if ((r5 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (r1.isOptionalFeaturePresent(com.appsflyer.sdk_base.util.SupportedOptionalFeatures.LVL) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0032, code lost:
    
        r5.unregisterClient = java.lang.System.currentTimeMillis();
        r5.registerClient = v().AFKeystoreWrapper(AFKeystoreWrapper(r6), r5.AFKeystoreWrapper.d, new com.appsflyer.internal.AFf1oSDK.AnonymousClass4(r5));
        r5 = com.appsflyer.internal.AFf1oSDK.afWarnLog + 79;
        com.appsflyer.internal.AFf1oSDK.AFLoggerLogLevel = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0059, code lost:
    
        if ((r5 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005c, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void unregisterClient(AFc1hSDK aFc1hSDK) {
        int i2 = AFLoggerLogLevel + 35;
        afWarnLog = i2 % 128;
        int i3 = i2 % 2;
        OptionalFeaturesValidator optionalFeaturesValidator = this.d;
        if (i3 != 0) {
            boolean isOptionalFeaturePresent = optionalFeaturesValidator.isOptionalFeaturePresent(SupportedOptionalFeatures.LVL);
            int i4 = 90 / 0;
        }
    }

    public final void unregisterClient(String str) {
        afWarnLog = (AFLoggerLogLevel + 3) % 128;
        this.e = str;
        afWarnLog = (AFLoggerLogLevel + 89) % 128;
    }
}
