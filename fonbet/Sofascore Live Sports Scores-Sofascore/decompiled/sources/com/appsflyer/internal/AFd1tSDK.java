package com.appsflyer.internal;

import android.graphics.Color;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.C4094gc;
import com.ironsource.L6;
import com.ironsource.Y1;
import com.mbridge.msdk.MBridgeConstans;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFd1tSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int afErrorLog = 1;
    private static int afWarnLog = 0;
    private static char e = 28653;
    private static char force = 55171;
    private static char v = 65036;
    private static char w = 37107;
    private final AFd1hSDK AFKeystoreWrapper;
    private final AFc1hSDK AFLogger;
    private final AFj1ySDK d;
    private final AFf1oSDK i;
    private final AFd1wSDK registerClient;
    private final AFj1mSDK unregisterClient;

    public AFd1tSDK(AFd1wSDK aFd1wSDK, AFc1hSDK aFc1hSDK, AFd1hSDK aFd1hSDK, AFj1ySDK aFj1ySDK, AFj1mSDK aFj1mSDK, AFf1oSDK aFf1oSDK) {
        this.registerClient = aFd1wSDK;
        this.AFLogger = aFc1hSDK;
        this.AFKeystoreWrapper = aFd1hSDK;
        this.d = aFj1ySDK;
        this.unregisterClient = aFj1mSDK;
        this.i = aFf1oSDK;
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $10 = ($11 + 39) % 128;
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
            int i2 = aFj1cSDK.d;
            if (i2 >= cArr2.length) {
                objArr[0] = new String(cArr3, 0, i);
                return;
            }
            $10 = ($11 + 71) % 128;
            cArr4[0] = cArr2[i2];
            cArr4[1] = cArr2[i2 + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (v ^ (-4199718916349371482L))))) ^ ((c2 >>> 5) + ((char) (e ^ (-4199718916349371482L))))));
                cArr4[1] = c3;
                cArr4[0] = (char) (c2 - (((c3 >>> 5) + ((char) (w ^ (-4199718916349371482L)))) ^ ((c3 + i3) ^ ((c3 << 4) + ((char) (force ^ (-4199718916349371482L)))))));
                i3 -= 40503;
                i4++;
                $11 = ($10 + 57) % 128;
            }
            int i5 = aFj1cSDK.d;
            cArr3[i5] = cArr4[0];
            cArr3[i5 + 1] = cArr4[1];
            aFj1cSDK.d = i5 + 2;
        }
    }

    @Nullable
    public final AFd1uSDK AFKeystoreWrapper(Map<String, Object> map, String str) {
        int i = afWarnLog + 11;
        afErrorLog = i % 128;
        try {
            if (i % 2 == 0) {
                try {
                    Object[] objArr = {map, str};
                    Map map2 = AFb1ySDK.getInstance;
                    Object obj = map2.get(834644675);
                    if (obj == null) {
                        obj = ((Class) AFb1ySDK.AFLogger(36 - TextUtils.getOffsetAfter("", 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 197, (char) (View.getDefaultSize(0, 0) + 15212))).getMethod("unregisterClient", Map.class, String.class);
                        map2.put(834644675, obj);
                    }
                    throw null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            try {
                Object[] objArr2 = {map, str};
                Map map3 = AFb1ySDK.getInstance;
                Object obj2 = map3.get(834644675);
                if (obj2 == null) {
                    obj2 = ((Class) AFb1ySDK.AFLogger(35 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 198 - KeyEvent.normalizeMetaState(0), (char) (TextUtils.lastIndexOf("", '0', 0) + 15213))).getMethod("unregisterClient", Map.class, String.class);
                    map3.put(834644675, obj2);
                }
                byte[] bArr = (byte[]) ((Method) obj2).invoke(null, objArr2);
                if (bArr != null) {
                    return new AFd1uSDK(this.AFLogger, bArr);
                }
                AFLogger.INSTANCE.e(LogTag.GENERAL, "AFFinalizer: failed to create bytes.", new IllegalArgumentException("Failed to create bytes from proxyData, bytes are null"), false, false);
                int i2 = afWarnLog + 81;
                afErrorLog = i2 % 128;
                if (i2 % 2 != 0) {
                    return null;
                }
                throw null;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, "AFFinalizer: reflection init failed.", th3, false, false);
            return null;
        }
        AFLogger.INSTANCE.e(LogTag.GENERAL, "AFFinalizer: reflection init failed.", th3, false, false);
        return null;
    }

    @Nullable
    public final AFd1qSDK<String> AFLogger(AFh1zSDK aFh1zSDK, String str, AFc1cSDK aFc1cSDK) {
        String d;
        afWarnLog = (afErrorLog + 113) % 128;
        try {
            try {
                Object[] objArr = {aFh1zSDK, str, aFc1cSDK};
                Map map = AFb1ySDK.getInstance;
                Object obj = map.get(1918414115);
                if (obj == null) {
                    obj = ((Class) AFb1ySDK.AFLogger((ViewConfiguration.getScrollDefaultDelay() >> 16) + 36, 198 - ExpandableListView.getPackedPositionType(0L), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15211))).getMethod("registerClient", AFh1zSDK.class, String.class, AFc1cSDK.class);
                    map.put(1918414115, obj);
                }
                byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
                registerClient(new Object[]{this, aFh1zSDK, bArr}, 1392357412, -1392357412, System.identityHashCode(this));
                afWarnLog = (afErrorLog + 47) % 128;
                AFj1ySDK aFj1ySDK = this.d;
                aFh1zSDK.getClass();
                boolean z = aFh1zSDK.v == null && aFh1zSDK.e == null;
                boolean z2 = aFh1zSDK instanceof AFh1uSDK;
                boolean z3 = aFh1zSDK instanceof AFh1vSDK;
                boolean z4 = aFh1zSDK instanceof AFf1gSDK;
                if (aFh1zSDK instanceof AFh1pSDK) {
                    d = AFj1ySDK.afDebugLog();
                } else if (z3) {
                    d = AFj1ySDK.registerClient();
                } else if (z2) {
                    d = AFj1ySDK.AFLogger();
                    afWarnLog = (afErrorLog + 47) % 128;
                } else if (z4) {
                    d = AFj1ySDK.w();
                } else if (!z) {
                    d = AFj1ySDK.d();
                } else if (aFh1zSDK.afErrorLog < 2) {
                    afWarnLog = (afErrorLog + 95) % 128;
                    d = AFj1ySDK.AFKeystoreWrapper();
                } else {
                    d = AFj1ySDK.unregisterClient();
                }
                return (AFd1qSDK) registerClient(new Object[]{this, new AFd1lSDK(aFj1ySDK.d(AFj1ySDK.registerClient(aFj1ySDK.unregisterClient(d), z2), z4), bArr, C4094gc.b, aFh1zSDK.registerClient, aFh1zSDK.AFLogger), new AFd1oSDK()}, 1902379518, -1902379516, System.identityHashCode(this));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, "AFFinalizer: reflection init failed.", th2, false, false);
            return null;
        }
    }

    @Nullable
    public final AFd1qSDK<String> d(Map<String, Object> map, String str) {
        String d;
        afWarnLog = (afErrorLog + 89) % 128;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFb1ySDK.getInstance;
            Object obj = map2.get(834644675);
            if (obj == null) {
                obj = ((Class) AFb1ySDK.AFLogger(37 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 199 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (Color.red(0) + 15212))).getMethod("unregisterClient", Map.class, String.class);
                map2.put(834644675, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            AFj1ySDK aFj1ySDK = this.d;
            d = aFj1ySDK.d(aFj1ySDK.unregisterClient(AFj1ySDK.e()), false);
            AFd1qSDK<String> aFd1qSDK = (AFd1qSDK) registerClient(new Object[]{this, new AFd1lSDK(d, bArr, C4094gc.b, Collections.EMPTY_MAP, true), new AFd1oSDK()}, 1902379518, -1902379516, System.identityHashCode(this));
            int i = afErrorLog + 79;
            afWarnLog = i % 128;
            if (i % 2 == 0) {
                return aFd1qSDK;
            }
            throw null;
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(LogTag.ENGAGEMENT, "AFFinalizer: reflection init failed.", th2, false, false);
                return null;
            }
        }
    }

    public final AFd1qSDK<String> registerClient(Map<String, Object> map, String str) {
        int i = afWarnLog + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        afErrorLog = i % 128;
        try {
            if (i % 2 == 0) {
                try {
                    Object[] objArr = {map, str};
                    Map map2 = AFb1ySDK.getInstance;
                    Object obj = map2.get(834644675);
                    if (obj == null) {
                        obj = ((Class) AFb1ySDK.AFLogger(36 - Color.argb(0, 0, 0, 0), 197 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (15211 - MotionEvent.axisFromString("")))).getMethod("unregisterClient", Map.class, String.class);
                        map2.put(834644675, obj);
                    }
                    throw null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            try {
                Object[] objArr2 = {map, str};
                Map map3 = AFb1ySDK.getInstance;
                Object obj2 = map3.get(834644675);
                if (obj2 == null) {
                    obj2 = ((Class) AFb1ySDK.AFLogger(View.resolveSize(0, 0) + 36, 198 - View.getDefaultSize(0, 0), (char) (ExpandableListView.getPackedPositionType(0L) + 15212))).getMethod("unregisterClient", Map.class, String.class);
                    map3.put(834644675, obj2);
                }
                byte[] bArr = (byte[]) ((Method) obj2).invoke(null, objArr2);
                afErrorLog = (afWarnLog + Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE) % 128;
                return (AFd1qSDK) registerClient(new Object[]{this, new AFd1lSDK(this.d.unregisterClient(AFj1ySDK.i()), bArr, C4094gc.b, Collections.EMPTY_MAP, true), new AFd1oSDK()}, 1902379518, -1902379516, System.identityHashCode(this));
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(LogTag.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th3, false, false);
            return null;
        }
        AFLogger.INSTANCE.e(LogTag.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th3, false, false);
        return null;
    }

    public final AFd1qSDK<Map<String, String>> unregisterClient(@NonNull String str, @NonNull String str2, @NonNull UUID uuid, @NonNull String str3) {
        String obj = uuid.toString();
        Map<String, Object> AFLogger = AFLogger();
        String valueOf = String.valueOf(AFLogger.get("build_number"));
        HashMap hashMap = new HashMap();
        hashMap.put("Af-UUID", uuid.toString());
        hashMap.put("Af-Meta-Sdk-Ver", valueOf);
        hashMap.put("Af-Meta-Counter", String.valueOf(AFLogger.get("counter")));
        hashMap.put("Af-Meta-Model", String.valueOf(AFLogger.get(L6.B)));
        hashMap.put("Af-Meta-Platform", String.valueOf(AFLogger.get("platformextension")));
        hashMap.put("Af-Meta-System-Version", String.valueOf(AFLogger.get("sdk")));
        Object[] objArr = new Object[1];
        a("城유宂謓ﺔ쟶谍諡\uee91좱벜ꓷ", 12 - TextUtils.getTrimmedLength(""), objArr);
        hashMap.put(((String) objArr[0]).intern(), AFKeystoreWrapper(str3, obj, C4094gc.a, obj, str, str2, valueOf));
        AFd1qSDK<Map<String, String>> aFd1qSDK = (AFd1qSDK) registerClient(new Object[]{this, new AFd1lSDK(AFj1ySDK.AFKeystoreWrapper(str, str2), null, C4094gc.a, hashMap, false), new AFd1fSDK()}, 1902379518, -1902379516, System.identityHashCode(this));
        afErrorLog = (afWarnLog + 79) % 128;
        return aFd1qSDK;
    }

    public final AFd1qSDK<String> d(@NonNull String str) {
        AFd1lSDK aFd1lSDK = new AFd1lSDK(str, null, C4094gc.a, Collections.EMPTY_MAP, false);
        aFd1lSDK.v = 10000;
        aFd1lSDK.w = false;
        AFd1qSDK<String> aFd1qSDK = (AFd1qSDK) registerClient(new Object[]{this, aFd1lSDK, new AFd1oSDK()}, 1902379518, -1902379516, System.identityHashCode(this));
        afWarnLog = (afErrorLog + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
        return aFd1qSDK;
    }

    @NonNull
    public final AFd1qSDK<AFh1lSDK> unregisterClient(boolean z, boolean z2, @NonNull String str, int i) {
        String str2;
        String str3;
        afWarnLog = (afErrorLog + 89) % 128;
        AFd1hSDK aFd1hSDK = this.AFKeystoreWrapper;
        str.getClass();
        if (z) {
            afErrorLog = (afWarnLog + 81) % 128;
            str2 = AFd1hSDK.AFKeystoreWrapper;
        } else {
            str2 = AFd1hSDK.AFLogger;
            afErrorLog = (afWarnLog + 57) % 128;
        }
        String str4 = "";
        if (!z2) {
            str3 = "";
        } else {
            str3 = "stg";
        }
        Locale locale = Locale.US;
        if (AFd1hSDK.unregisterClient()) {
            str4 = (String) aFd1hSDK.i.getValue();
        }
        AFd1lSDK aFd1lSDK = new AFd1lSDK(String.format(locale, str2, Arrays.copyOf(new Object[]{str4, str3, aFd1hSDK.registerClient(), str}, 4)), C4094gc.a);
        aFd1lSDK.v = TTAdConstant.STYLE_SIZE_RADIO_3_2;
        return (AFd1qSDK) registerClient(new Object[]{this, aFd1lSDK, new AFd1mSDK()}, 1902379518, -1902379516, System.identityHashCode(this));
    }

    private boolean d() {
        boolean z;
        afErrorLog = (afWarnLog + 55) % 128;
        String AFLogger = this.AFLogger.AFLogger("AF_ENABLE_HTTP_CACHE");
        if (AFLogger != null) {
            int i = afErrorLog + 85;
            afWarnLog = i % 128;
            if (i % 2 != 0) {
                z = Boolean.parseBoolean(AFLogger);
                int i2 = 60 / 0;
            } else {
                z = Boolean.parseBoolean(AFLogger);
            }
        } else {
            z = true;
        }
        if (z) {
            return false;
        }
        afErrorLog = (afWarnLog + 105) % 128;
        return true;
    }

    private void d(AFh1zSDK aFh1zSDK, byte[] bArr) {
        registerClient(new Object[]{this, aFh1zSDK, bArr}, 1392357412, -1392357412, System.identityHashCode(this));
    }

    @Nullable
    public final AFd1qSDK<String> unregisterClient(Map<String, Object> map, String str) {
        String d;
        afWarnLog = (afErrorLog + 63) % 128;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFb1ySDK.getInstance;
            Object obj = map2.get(834644675);
            if (obj == null) {
                obj = ((Class) AFb1ySDK.AFLogger(TextUtils.getOffsetAfter("", 0) + 36, 198 - View.resolveSize(0, 0), (char) (15212 - TextUtils.getOffsetBefore("", 0)))).getMethod("unregisterClient", Map.class, String.class);
                map2.put(834644675, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            afErrorLog = (afWarnLog + 85) % 128;
            AFj1ySDK aFj1ySDK = this.d;
            d = aFj1ySDK.d(aFj1ySDK.unregisterClient(AFj1ySDK.force()), false);
            return (AFd1qSDK) registerClient(new Object[]{this, new AFd1lSDK(d, bArr, C4094gc.b, Collections.EMPTY_MAP, true), new AFd1oSDK()}, 1902379518, -1902379516, System.identityHashCode(this));
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(LogTag.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th2, false, false);
                return null;
            }
        }
    }

    private static /* synthetic */ Object AFKeystoreWrapper(Object[] objArr) {
        AFd1tSDK aFd1tSDK = (AFd1tSDK) objArr[0];
        String str = (String) objArr[1];
        AFd1qSDK aFd1qSDK = (AFd1qSDK) registerClient(new Object[]{aFd1tSDK, AFd1rSDK.unregisterClient(aFd1tSDK.d.d(str), aFd1tSDK.AFLogger.registerClient.d.getPackageName(), AFb1mSDK.unregisterClient(aFd1tSDK.AFLogger.AFKeystoreWrapper), str, (String) objArr[2]), new AFd1sSDK()}, 1902379518, -1902379516, System.identityHashCode(aFd1tSDK));
        int i = afWarnLog + Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE;
        afErrorLog = i % 128;
        if (i % 2 == 0) {
            int i2 = 16 / 0;
        }
        return aFd1qSDK;
    }

    private static String AFKeystoreWrapper(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String join = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append("v2");
        String d = AFj1xSDK.d(join, sb.toString());
        int i = afErrorLog + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            return d;
        }
        throw null;
    }

    public static /* synthetic */ Object registerClient(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = (((~(i | i2)) | (~(i3 | i4))) * 433) + (((~((~i2) | i3)) | i4) * (-433)) + ((~((~i3) | i4 | i2)) * 433) + (i2 * 434) + (i * (-432));
        if (i5 == 1) {
            return AFKeystoreWrapper(objArr);
        }
        if (i5 != 2) {
            boolean z = false;
            AFd1tSDK aFd1tSDK = (AFd1tSDK) objArr[0];
            AFh1zSDK aFh1zSDK = (AFh1zSDK) objArr[1];
            byte[] bArr = (byte[]) objArr[2];
            afWarnLog = (afErrorLog + 23) % 128;
            String AFLogger = aFd1tSDK.AFLogger.AFLogger("com.appsflyer.security.enable");
            if (AFLogger != null) {
                afErrorLog = (afWarnLog + 29) % 128;
                z = Boolean.parseBoolean(AFLogger);
            } else {
                afWarnLog = (afErrorLog + 39) % 128;
            }
            if (!aFh1zSDK.AFLogger() || !z || !((Boolean) AFf1oSDK.AFLogger(new Object[]{aFh1zSDK, aFd1tSDK.AFLogger}, 1357919408, -1357919408, (int) System.currentTimeMillis())).booleanValue()) {
                return null;
            }
            AFf1oSDK.unregisterClient(aFh1zSDK, bArr);
            AFLogger.INSTANCE.d(LogTag.SECURITY_SDK, "the module works properly");
            afErrorLog = (afWarnLog + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
            return null;
        }
        return AFLogger(objArr);
    }

    public final AFd1qSDK<String> AFKeystoreWrapper(AFh1xSDK aFh1xSDK) {
        AFd1qSDK<String> aFd1qSDK = (AFd1qSDK) registerClient(new Object[]{this, new AFd1lSDK(aFh1xSDK.w, aFh1xSDK.force, C4094gc.b, aFh1xSDK.registerClient, true), new AFd1oSDK()}, 1902379518, -1902379516, System.identityHashCode(this));
        afWarnLog = (afErrorLog + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        return aFd1qSDK;
    }

    private <T> AFd1qSDK<T> AFKeystoreWrapper(AFd1lSDK aFd1lSDK, AFd1jSDK<T> aFd1jSDK, boolean z) {
        aFd1lSDK.i = z;
        AFd1wSDK aFd1wSDK = this.registerClient;
        AFd1qSDK<T> aFd1qSDK = new AFd1qSDK<>(aFd1lSDK, aFd1wSDK.registerClient, aFd1wSDK.unregisterClient, aFd1jSDK);
        afWarnLog = (afErrorLog + 101) % 128;
        return aFd1qSDK;
    }

    public final AFd1qSDK<String> registerClient(@NonNull String str, @NonNull Map<String, String> map, @Nullable String str2, @NonNull UUID uuid, @NonNull String str3) {
        String AFKeystoreWrapper;
        String obj = uuid.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", Y1.f);
        hashMap.put("uuid", obj);
        hashMap.put("data", map);
        hashMap.put("meta", AFLogger());
        if (str2 != null) {
            int i = afErrorLog + 75;
            afWarnLog = i % 128;
            if (i % 2 == 0) {
                hashMap.put("brand_domain", str2);
            } else {
                hashMap.put("brand_domain", str2);
                throw null;
            }
        }
        String jSONObject = AFg1nSDK.d(hashMap).toString();
        HashMap hashMap2 = new HashMap();
        Object[] objArr = new Object[1];
        a("城유宂謓ﺔ쟶谍諡\uee91좱벜ꓷ", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12, objArr);
        hashMap2.put(((String) objArr[0]).intern(), AFKeystoreWrapper(str3, obj, C4094gc.b, jSONObject));
        AFj1ySDK aFj1ySDK = this.d;
        str.getClass();
        AFKeystoreWrapper = AFj1ySDK.AFKeystoreWrapper(str, null);
        return AFKeystoreWrapper(new AFd1lSDK(AFKeystoreWrapper, jSONObject.getBytes(Charset.defaultCharset()), C4094gc.b, hashMap2, false), (AFd1jSDK) new AFd1oSDK(), true);
    }

    @NonNull
    public final AFd1qSDK<AFa1lSDK> registerClient(AFa1rSDK aFa1rSDK) {
        AFd1qSDK<AFa1lSDK> aFd1qSDK = (AFd1qSDK) registerClient(new Object[]{this, new AFd1lSDK(aFa1rSDK.w, AFg1nSDK.d((Map<String, ?>) aFa1rSDK.AFKeystoreWrapper).toString().getBytes(Charset.defaultCharset()), C4094gc.b, Collections.EMPTY_MAP, aFa1rSDK.AFLogger), new AFa1gSDK()}, 1902379518, -1902379516, System.identityHashCode(this));
        int i = afErrorLog + 83;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            return aFd1qSDK;
        }
        throw null;
    }

    private <T> AFd1qSDK<T> registerClient(AFd1lSDK aFd1lSDK, AFd1jSDK<T> aFd1jSDK) {
        return (AFd1qSDK) registerClient(new Object[]{this, aFd1lSDK, aFd1jSDK}, 1902379518, -1902379516, System.identityHashCode(this));
    }

    public final AFd1qSDK<Map<String, Object>> registerClient(String str, String str2) {
        return (AFd1qSDK) registerClient(new Object[]{this, str, str2}, 886078342, -886078341, System.identityHashCode(this));
    }

    @Nullable
    public final AFd1qSDK<String> AFLogger(Map<String, Object> map, String str) {
        int i = afWarnLog + 7;
        afErrorLog = i % 128;
        try {
            if (i % 2 != 0) {
                try {
                    Object[] objArr = {map, str};
                    Map map2 = AFb1ySDK.getInstance;
                    Object obj = map2.get(834644675);
                    if (obj == null) {
                        obj = ((Class) AFb1ySDK.AFLogger(TextUtils.getOffsetBefore("", 0) + 36, MotionEvent.axisFromString("") + 199, (char) (TextUtils.lastIndexOf("", '0') + 15213))).getMethod("unregisterClient", Map.class, String.class);
                        map2.put(834644675, obj);
                    }
                    byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
                    afErrorLog = (afWarnLog + 13) % 128;
                    return (AFd1qSDK) registerClient(new Object[]{this, new AFd1lSDK(this.d.unregisterClient(AFj1ySDK.v()), bArr, C4094gc.b, Collections.EMPTY_MAP, true), new AFd1oSDK()}, 1902379518, -1902379516, System.identityHashCode(this));
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            try {
                Object[] objArr2 = {map, str};
                Map map3 = AFb1ySDK.getInstance;
                Object obj2 = map3.get(834644675);
                if (obj2 == null) {
                    obj2 = ((Class) AFb1ySDK.AFLogger((KeyEvent.getMaxKeyCode() >> 16) + 36, 198 - Color.red(0), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 15212))).getMethod("unregisterClient", Map.class, String.class);
                    map3.put(834644675, obj2);
                }
                throw null;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(LogTag.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th3, false, false);
            return null;
        }
        AFLogger.INSTANCE.e(LogTag.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th3, false, false);
        return null;
    }

    private static /* synthetic */ Object AFLogger(Object[] objArr) {
        AFd1tSDK aFd1tSDK = (AFd1tSDK) objArr[0];
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[1];
        AFd1jSDK aFd1jSDK = (AFd1jSDK) objArr[2];
        afWarnLog = (afErrorLog + 97) % 128;
        AFd1qSDK AFKeystoreWrapper = aFd1tSDK.AFKeystoreWrapper(aFd1lSDK, aFd1jSDK, aFd1tSDK.d());
        int i = afErrorLog + 45;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            return AFKeystoreWrapper;
        }
        throw null;
    }

    private Map<String, Object> AFLogger() {
        HashMap l = i.l("build_number", "7.0.0");
        l.put("counter", Integer.valueOf(this.AFLogger.AFKeystoreWrapper.d("appsFlyerCount", 0)));
        l.put(L6.B, Build.MODEL);
        Object[] objArr = new Object[1];
        a("䚘䄎슌\ue6f2쾿\uf491", View.MeasureSpec.makeMeasureSpec(0, 0) + 5, objArr);
        l.put(((String) objArr[0]).intern(), Build.BRAND);
        l.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        l.put("app_version_name", this.AFLogger.r_().versionName);
        l.put(MBridgeConstans.APP_ID, this.AFLogger.registerClient.d.getPackageName());
        l.put("platformextension", this.unregisterClient.d());
        int i = afErrorLog + 67;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            return l;
        }
        throw null;
    }
}
