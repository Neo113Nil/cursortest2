package com.appsflyer.internal;

import Ij.C3261b;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import spay.sdk.api.ErrorCode;

/* loaded from: classes.dex */
public final class AFe1wSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static String AFInAppEventType = null;
    private static char[] AFLogger = null;

    /* renamed from: e, reason: collision with root package name */
    private static char f57407e = 0;
    private static int registerClient = 1;
    private static int unregisterClient;
    public static String values;
    private final AFe1vSDK AFInAppEventParameterName;
    private final AFd1sSDK AFKeystoreWrapper;

    /* renamed from: d, reason: collision with root package name */
    private final AFe1gSDK f57408d;
    private final AppsFlyerProperties valueOf;

    static {
        AFKeystoreWrapper();
        values = "https://%sgcdsdk.%s/install_data/v5.0/";
        AFInAppEventType = "https://%sonelink.%s/shortlink-sdk/v2";
        registerClient = (unregisterClient + 65) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    public AFe1wSDK(AFe1vSDK aFe1vSDK, AFd1sSDK aFd1sSDK, AppsFlyerProperties appsFlyerProperties, AFe1gSDK aFe1gSDK) {
        this.AFInAppEventParameterName = aFe1vSDK;
        this.AFKeystoreWrapper = aFd1sSDK;
        this.valueOf = appsFlyerProperties;
        this.f57408d = aFe1gSDK;
    }

    static void AFKeystoreWrapper() {
        AFLogger = new char[]{29503, 29494, 29489, 29465, 29557, 29484, 29482, 28867, 29500, 29497, 29498, 29485, 28866, 29501, 29502, 29451};
        f57407e = (char) 18118;
    }

    private static void a(byte b11, int i11, String str, Object[] objArr) {
        int i12;
        $11 = ($10 + 109) % UserVerificationMethods.USER_VERIFY_PATTERN;
        char[] charArray = str != null ? str.toCharArray() : str;
        AFj1gSDK aFj1gSDK = new AFj1gSDK();
        char[] cArr = AFLogger;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i13 = 0; i13 < length; i13++) {
                cArr2[i13] = (char) (cArr[i13] ^ (-5398819829411789118L));
            }
            cArr = cArr2;
        }
        char c11 = (char) ((-5398819829411789118L) ^ f57407e);
        char[] cArr3 = new char[i11];
        if (i11 % 2 != 0) {
            int i14 = $10 + 59;
            $11 = i14 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i14 % 2 == 0) {
                i12 = i11 + 97;
                cArr3[i12] = (char) (charArray[i12] >>> b11);
            } else {
                i12 = i11 - 1;
                cArr3[i12] = (char) (charArray[i12] - b11);
            }
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            aFj1gSDK.AFInAppEventType = 0;
            while (true) {
                int i15 = aFj1gSDK.AFInAppEventType;
                if (i15 >= i12) {
                    break;
                }
                char c12 = charArray[i15];
                aFj1gSDK.AFInAppEventParameterName = c12;
                char c13 = charArray[i15 + 1];
                aFj1gSDK.values = c13;
                if (c12 == c13) {
                    cArr3[i15] = (char) (c12 - b11);
                    cArr3[i15 + 1] = (char) (c13 - b11);
                } else {
                    int i16 = c12 / c11;
                    aFj1gSDK.valueOf = i16;
                    int i17 = c12 % c11;
                    aFj1gSDK.f57492d = i17;
                    int i18 = c13 / c11;
                    aFj1gSDK.AFKeystoreWrapper = i18;
                    int i19 = c13 % c11;
                    aFj1gSDK.registerClient = i19;
                    if (i17 == i19) {
                        int i21 = ((i16 + c11) - 1) % c11;
                        aFj1gSDK.valueOf = i21;
                        int i22 = ((i18 + c11) - 1) % c11;
                        aFj1gSDK.AFKeystoreWrapper = i22;
                        cArr3[i15] = cArr[(i21 * c11) + i17];
                        cArr3[i15 + 1] = cArr[(i22 * c11) + i19];
                    } else if (i16 == i18) {
                        int i23 = $10;
                        $11 = (i23 + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
                        int i24 = ((i17 + c11) - 1) % c11;
                        aFj1gSDK.f57492d = i24;
                        int i25 = ((i19 + c11) - 1) % c11;
                        aFj1gSDK.registerClient = i25;
                        cArr3[i15] = cArr[(i16 * c11) + i24];
                        cArr3[i15 + 1] = cArr[(i18 * c11) + i25];
                        $11 = (i23 + 19) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    } else {
                        cArr3[i15] = cArr[(i16 * c11) + i19];
                        cArr3[i15 + 1] = cArr[(i18 * c11) + i17];
                    }
                }
                aFj1gSDK.AFInAppEventType = i15 + 2;
            }
        }
        for (int i26 = 0; i26 < i11; i26++) {
            cArr3[i26] = (char) (cArr3[i26] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    public final AFe1uSDK<String> AFInAppEventParameterName(Map<String, Object> map, String str, String str2) {
        String AFInAppEventType2;
        unregisterClient = (registerClient + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            Object[] objArr = {map, str};
            Map<Integer, Object> map2 = AFa1ySDK.afErrorLog;
            Object obj = map2.get(1391384416);
            if (obj == null) {
                obj = ((Class) AFa1ySDK.AFKeystoreWrapper(72 - ExpandableListView.getPackedPositionGroup(0L), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36)).getMethod("AFInAppEventType", Map.class, String.class);
                map2.put(1391384416, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            AFi1eSDK aFi1eSDK = new AFi1eSDK(this.AFKeystoreWrapper);
            if (str2 != null) {
                int i11 = registerClient + 77;
                unregisterClient = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i11 % 2 != 0) {
                    throw null;
                }
                if (str2.length() != 0 && !new Regex("4.?(\\d+)?.?(\\d+)").f(str2) && !new Regex("3.?(\\d+)?.?(\\d+)").f(str2)) {
                    unregisterClient = (registerClient + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    AFInAppEventType2 = aFi1eSDK.AFInAppEventType.AFInAppEventType("https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=");
                    StringBuilder e11 = C3261b.e(AFInAppEventType2);
                    e11.append(aFi1eSDK.AFKeystoreWrapper.AFInAppEventParameterName.valueOf.getPackageName());
                    return AFInAppEventParameterName(new AFe1oSDK(aFi1eSDK.valueOf(e11.toString()), bArr, "POST", Collections.EMPTY_MAP, true), new AFe1lSDK());
                }
            }
            int i12 = registerClient + 125;
            unregisterClient = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i12 % 2 != 0) {
                aFi1eSDK.AFInAppEventType.AFInAppEventType("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
                throw null;
            }
            AFInAppEventType2 = aFi1eSDK.AFInAppEventType.AFInAppEventType("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
            StringBuilder e112 = C3261b.e(AFInAppEventType2);
            e112.append(aFi1eSDK.AFKeystoreWrapper.AFInAppEventParameterName.valueOf.getPackageName());
            return AFInAppEventParameterName(new AFe1oSDK(aFi1eSDK.valueOf(e112.toString()), bArr, "POST", Collections.EMPTY_MAP, true), new AFe1lSDK());
        } catch (Throwable th2) {
            try {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            } catch (Exception e12) {
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e12);
                return null;
            }
        }
    }

    public final AFe1uSDK<String> AFInAppEventType(Map<String, Object> map, String str, String str2) {
        String AFInAppEventType2;
        int i11 = registerClient + 13;
        unregisterClient = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            if (i11 % 2 != 0) {
                try {
                    Object[] objArr = {map, str};
                    Map<Integer, Object> map2 = AFa1ySDK.afErrorLog;
                    Object obj = map2.get(1391384416);
                    if (obj == null) {
                        obj = ((Class) AFa1ySDK.AFKeystoreWrapper(KeyEvent.getDeadChar(0, 0) + 72, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37)).getMethod("AFInAppEventType", Map.class, String.class);
                        map2.put(1391384416, obj);
                    }
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            try {
                Object[] objArr2 = {map, str};
                Map<Integer, Object> map3 = AFa1ySDK.afErrorLog;
                Object obj2 = map3.get(1391384416);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1ySDK.AFKeystoreWrapper(MotionEvent.axisFromString("") + 73, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 37)).getMethod("AFInAppEventType", Map.class, String.class);
                    map3.put(1391384416, obj2);
                }
                byte[] bArr = (byte[]) ((Method) obj2).invoke(null, objArr2);
                AFi1eSDK aFi1eSDK = new AFi1eSDK(this.AFKeystoreWrapper);
                if (str2 != null) {
                    int i12 = unregisterClient + 27;
                    registerClient = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i12 % 2 == 0) {
                        str2.length();
                        throw null;
                    }
                    if (str2.length() != 0) {
                        unregisterClient = (registerClient + 13) % UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (!new Regex("4.?(\\d+)?.?(\\d+)").f(str2) && !new Regex("3.?(\\d+)?.?(\\d+)").f(str2)) {
                            AFInAppEventType2 = aFi1eSDK.AFInAppEventType.AFInAppEventType("https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=");
                            StringBuilder e11 = C3261b.e(AFInAppEventType2);
                            e11.append(aFi1eSDK.AFKeystoreWrapper.AFInAppEventParameterName.valueOf.getPackageName());
                            return AFInAppEventParameterName(new AFe1oSDK(aFi1eSDK.valueOf(e11.toString()), bArr, "POST", Collections.EMPTY_MAP, true), new AFe1lSDK());
                        }
                    }
                }
                AFInAppEventType2 = aFi1eSDK.AFInAppEventType.AFInAppEventType("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
                StringBuilder e112 = C3261b.e(AFInAppEventType2);
                e112.append(aFi1eSDK.AFKeystoreWrapper.AFInAppEventParameterName.valueOf.getPackageName());
                return AFInAppEventParameterName(new AFe1oSDK(aFi1eSDK.valueOf(e112.toString()), bArr, "POST", Collections.EMPTY_MAP, true), new AFe1lSDK());
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th3;
            }
        } catch (Exception e12) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e12);
            return null;
        }
        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e12);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        r3 = com.appsflyer.internal.AFe1gSDK.values;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001f, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        r3 = com.appsflyer.internal.AFe1gSDK.AFKeystoreWrapper;
     */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFe1uSDK<AFh1hSDK> valueOf(boolean z11, boolean z12, @NonNull String str, int i11) {
        AFe1gSDK aFe1gSDK;
        String str2;
        String str3;
        int i12 = unregisterClient + 109;
        registerClient = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 == 0) {
            aFe1gSDK = this.f57408d;
            Intrinsics.checkNotNullParameter(str, "");
            int i13 = 78 / 0;
        } else {
            aFe1gSDK = this.f57408d;
            Intrinsics.checkNotNullParameter(str, "");
        }
        if (z12) {
            registerClient = (unregisterClient + 25) % UserVerificationMethods.USER_VERIFY_PATTERN;
            str3 = "stg";
        } else {
            str3 = "";
        }
        AFe1oSDK aFe1oSDK = new AFe1oSDK(V.e.b(new Object[]{AFe1gSDK.valueOf() ? (String) aFe1gSDK.AFInAppEventType.getValue() : "", str3, aFe1gSDK.AFInAppEventType(), str}, 4, str2, ""), "GET");
        aFe1oSDK.unregisterClient = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        return AFInAppEventParameterName(aFe1oSDK, new AFe1nSDK());
    }

    public final AFe1uSDK<Map<String, String>> values(@NonNull String str, @NonNull String str2, @NonNull UUID uuid, @NonNull String str3) {
        String obj = uuid.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.valueOf().getHostName()));
        sb2.append("/");
        sb2.append(str);
        sb2.append("?id=");
        sb2.append(str2);
        String obj2 = sb2.toString();
        Map<String, Object> valueOf = valueOf();
        String valueOf2 = String.valueOf(valueOf.get("build_number"));
        HashMap hashMap = new HashMap();
        hashMap.put("Af-UUID", uuid.toString());
        hashMap.put("Af-Meta-Sdk-Ver", valueOf2);
        hashMap.put("Af-Meta-Counter", String.valueOf(valueOf.get("counter")));
        hashMap.put("Af-Meta-Model", String.valueOf(valueOf.get("model")));
        hashMap.put("Af-Meta-Platform", String.valueOf(valueOf.get("platformextension")));
        hashMap.put("Af-Meta-System-Version", String.valueOf(valueOf.get("sdk")));
        Object[] objArr = new Object[1];
        a((byte) ((KeyEvent.getMaxKeyCode() >> 16) + 11), 13 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u0002\u000f\u0007\f\u0003\u0001\u0005\r\u0007\t\u0005\u000e", objArr);
        hashMap.put(((String) objArr[0]).intern(), values(str3, obj, "GET", obj, str, str2, valueOf2));
        AFe1uSDK<Map<String, String>> AFInAppEventParameterName = AFInAppEventParameterName(new AFe1oSDK(obj2, null, "GET", hashMap, false), new AFe1pSDK());
        registerClient = (unregisterClient + 17) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return AFInAppEventParameterName;
    }

    @NonNull
    public final AFe1uSDK<AFc1qSDK> AFKeystoreWrapper(AFc1kSDK aFc1kSDK) {
        AFe1uSDK<AFc1qSDK> AFInAppEventParameterName = AFInAppEventParameterName(new AFe1oSDK(aFc1kSDK.unregisterClient, AFa1qSDK.valueOf(aFc1kSDK.valueOf()).toString().getBytes(Charset.defaultCharset()), "POST", Collections.EMPTY_MAP, aFc1kSDK.AFInAppEventParameterName()), new AFc1jSDK());
        int i11 = registerClient + 35;
        unregisterClient = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            return AFInAppEventParameterName;
        }
        throw null;
    }

    public final AFe1uSDK<String> AFKeystoreWrapper(@NonNull String str, @NonNull Map<String, String> map, String str2, @NonNull UUID uuid, @NonNull String str3) {
        String obj = uuid.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE);
        hashMap.put("uuid", obj);
        hashMap.put("data", map);
        hashMap.put("meta", valueOf());
        if (str2 != null) {
            registerClient = (unregisterClient + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
            hashMap.put("brand_domain", str2);
        }
        String jSONObject = AFa1qSDK.valueOf(hashMap).toString();
        HashMap hashMap2 = new HashMap();
        Object[] objArr = new Object[1];
        a((byte) (11 - Color.blue(0)), ((Process.getThreadPriority(0) + 20) >> 6) + 12, "\u0002\u000f\u0007\f\u0003\u0001\u0005\r\u0007\t\u0005\u000e", objArr);
        hashMap2.put(((String) objArr[0]).intern(), values(str3, obj, "POST", jSONObject));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.valueOf().getHostName()));
        sb2.append("/");
        sb2.append(str);
        AFe1uSDK<String> AFInAppEventType2 = AFInAppEventType(new AFe1oSDK(sb2.toString(), jSONObject.getBytes(Charset.defaultCharset()), "POST", hashMap2, false), (AFe1jSDK) new AFe1lSDK(), true);
        int i11 = unregisterClient + 3;
        registerClient = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            return AFInAppEventType2;
        }
        throw null;
    }

    private static String values(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String join = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append("v2");
        String AFInAppEventType2 = AFb1mSDK.AFInAppEventType(join, sb2.toString());
        int i11 = unregisterClient + 103;
        registerClient = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            return AFInAppEventType2;
        }
        throw null;
    }

    public final AFe1uSDK<String> valueOf(AFh1qSDK aFh1qSDK) {
        AFe1uSDK<String> AFInAppEventParameterName = AFInAppEventParameterName(new AFe1oSDK(aFh1qSDK.unregisterClient, aFh1qSDK.AFInAppEventType(), "POST", Collections.EMPTY_MAP, true), new AFe1lSDK());
        unregisterClient = (registerClient + 75) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return AFInAppEventParameterName;
    }

    private Map<String, Object> valueOf() {
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.13.1");
        hashMap.put("counter", Integer.valueOf(this.AFKeystoreWrapper.AFKeystoreWrapper.AFInAppEventParameterName("appsFlyerCount", 0)));
        hashMap.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        a((byte) (50 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 5 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u000e\n\r\u0005㘰", objArr);
        hashMap.put(((String) objArr[0]).intern(), Build.BRAND);
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        Context context = this.AFKeystoreWrapper.AFInAppEventParameterName.valueOf;
        hashMap.put("app_version_name", AFb1uSDK.AFKeystoreWrapper(context, context.getPackageName()));
        hashMap.put("app_id", this.AFKeystoreWrapper.AFInAppEventParameterName.valueOf.getPackageName());
        hashMap.put("platformextension", new AFb1cSDK().valueOf());
        registerClient = (unregisterClient + 111) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return hashMap;
    }

    private boolean values() {
        int i11 = unregisterClient + 113;
        registerClient = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            if (this.valueOf.getBoolean(AppsFlyerProperties.HTTP_CACHE, true)) {
                return false;
            }
        } else if (this.valueOf.getBoolean(AppsFlyerProperties.HTTP_CACHE, true)) {
            return false;
        }
        unregisterClient = (registerClient + 73) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return true;
    }

    public final AFe1uSDK<String> AFInAppEventParameterName(AFa1pSDK aFa1pSDK, String str, AFd1kSDK aFd1kSDK) {
        int i11 = registerClient + 53;
        unregisterClient = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            if (i11 % 2 != 0) {
                try {
                    Object[] objArr = {aFa1pSDK, str, aFd1kSDK};
                    Map<Integer, Object> map = AFa1ySDK.afErrorLog;
                    Object obj = map.get(-829551611);
                    if (obj == null) {
                        obj = ((Class) AFa1ySDK.AFKeystoreWrapper(72 - View.MeasureSpec.getSize(0), (char) KeyEvent.getDeadChar(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 37)).getMethod("AFInAppEventType", AFa1pSDK.class, String.class, AFd1kSDK.class);
                        map.put(-829551611, obj);
                    }
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            try {
                Object[] objArr2 = {aFa1pSDK, str, aFd1kSDK};
                Map<Integer, Object> map2 = AFa1ySDK.afErrorLog;
                Object obj2 = map2.get(-829551611);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1ySDK.AFKeystoreWrapper(View.MeasureSpec.getSize(0) + 72, (char) (Process.getGidForName("") + 1), Color.argb(0, 0, 0, 0) + 37)).getMethod("AFInAppEventType", AFa1pSDK.class, String.class, AFd1kSDK.class);
                    map2.put(-829551611, obj2);
                }
                AFe1uSDK<String> AFInAppEventParameterName = AFInAppEventParameterName(new AFe1oSDK(aFa1pSDK.unregisterClient, (byte[]) ((Method) obj2).invoke(null, objArr2), "POST", Collections.EMPTY_MAP, aFa1pSDK.AFInAppEventParameterName()), new AFe1lSDK());
                int i12 = unregisterClient + 31;
                registerClient = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i12 % 2 == 0) {
                    int i13 = 23 / 0;
                }
                return AFInAppEventParameterName;
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th3;
            }
        } catch (Throwable th4) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", th4);
            return null;
        }
        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", th4);
        return null;
    }

    public final AFe1uSDK<Map<String, Object>> AFInAppEventType(String str, String str2) {
        String packageName = this.AFKeystoreWrapper.AFInAppEventParameterName.valueOf.getPackageName();
        AFd1sSDK aFd1sSDK = this.AFKeystoreWrapper;
        AFe1uSDK<Map<String, Object>> AFInAppEventParameterName = AFInAppEventParameterName(AFe1qSDK.valueOf(packageName, AFb1kSDK.AFInAppEventType(aFd1sSDK.AFInAppEventParameterName, aFd1sSDK.AFKeystoreWrapper), str, str2), new AFe1tSDK());
        int i11 = unregisterClient + 17;
        registerClient = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            return AFInAppEventParameterName;
        }
        throw null;
    }

    private <T> AFe1uSDK<T> AFInAppEventParameterName(AFe1oSDK aFe1oSDK, AFe1jSDK<T> aFe1jSDK) {
        AFe1uSDK<T> AFInAppEventType2;
        int i11 = registerClient + 45;
        unregisterClient = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            AFInAppEventType2 = AFInAppEventType(aFe1oSDK, aFe1jSDK, values());
            int i12 = 41 / 0;
        } else {
            AFInAppEventType2 = AFInAppEventType(aFe1oSDK, aFe1jSDK, values());
        }
        registerClient = (unregisterClient + 115) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return AFInAppEventType2;
    }

    public final AFe1uSDK<String> AFInAppEventType(@NonNull String str) {
        AFe1oSDK aFe1oSDK = new AFe1oSDK(str, null, "GET", Collections.EMPTY_MAP, false);
        aFe1oSDK.unregisterClient = 10000;
        aFe1oSDK.AFInAppEventType = false;
        AFe1uSDK<String> AFInAppEventParameterName = AFInAppEventParameterName(aFe1oSDK, new AFe1lSDK());
        int i11 = registerClient + 125;
        unregisterClient = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            return AFInAppEventParameterName;
        }
        throw null;
    }

    public final AFe1xSDK AFInAppEventType(Map<String, Object> map, String str) {
        unregisterClient = (registerClient + 69) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            try {
                Object[] objArr = {map, str};
                Map<Integer, Object> map2 = AFa1ySDK.afErrorLog;
                Object obj = map2.get(1391384416);
                if (obj == null) {
                    obj = ((Class) AFa1ySDK.AFKeystoreWrapper((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 73, (char) (ViewConfiguration.getEdgeSlop() >> 16), 36 - ImageFormat.getBitsPerPixel(0))).getMethod("AFInAppEventType", Map.class, String.class);
                    map2.put(1391384416, obj);
                }
                byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
                if (bArr != null) {
                    return new AFe1xSDK(this.AFKeystoreWrapper, bArr);
                }
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: failed to create bytes", new IllegalArgumentException("failed to create bytes from proxyData"));
                unregisterClient = (registerClient + 9) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return null;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } catch (Exception e11) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e11);
            return null;
        }
    }

    private <T> AFe1uSDK<T> AFInAppEventType(AFe1oSDK aFe1oSDK, AFe1jSDK<T> aFe1jSDK, boolean z11) {
        aFe1oSDK.AFKeystoreWrapper = z11;
        AFe1vSDK aFe1vSDK = this.AFInAppEventParameterName;
        AFe1uSDK<T> aFe1uSDK = new AFe1uSDK<>(aFe1oSDK, aFe1vSDK.values, aFe1vSDK.AFKeystoreWrapper, aFe1jSDK);
        int i11 = unregisterClient + 5;
        registerClient = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            return aFe1uSDK;
        }
        throw null;
    }
}
