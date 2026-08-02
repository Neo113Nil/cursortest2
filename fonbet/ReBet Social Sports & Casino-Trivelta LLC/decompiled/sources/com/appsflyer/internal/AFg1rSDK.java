package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFg1uSDK;
import com.facebook.react.devsupport.StackTraceHelper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFg1rSDK implements AFg1nSDK {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: e, reason: collision with root package name */
    private static int f29216e = 1;
    private static int unregisterClient;

    @NotNull
    private final String AFAdRevenueData;

    @NotNull
    private final Lazy AFKeystoreWrapper;

    @NotNull
    private final AFh1xSDK areAllFieldsValid;

    @NotNull
    private final AFc1qSDK component1;

    @NotNull
    private final AFg1vSDK component2;

    @NotNull
    private final AFi1pSDK component3;

    @NotNull
    private final AFc1oSDK component4;

    @NotNull
    private final AFc1hSDK copy;

    @NotNull
    private final AFg1zSDK copydefault;

    @NotNull
    private final Lazy equals;

    @NotNull
    private final Context getCurrencyIso4217Code;

    @NotNull
    private final AFi1kSDK getMediationNetwork;

    @NotNull
    private final AFg1uSDK getMonetizationNetwork;

    @NotNull
    private final AFj1lSDK getRevenue;

    @NotNull
    private final AFf1eSDK hashCode;

    @NotNull
    private final AFc1eSDK toString;
    private static char[] AFInAppEventParameterName = {35909, 35928, 35921, 35926, 35927, 35903, 35904, 35924, 35933, 35910, 35931, 35879, 35908, 35905, 35911};
    private static int registerClient = 1912311267;
    private static boolean AFLogger = true;
    private static boolean AFInAppEventType = true;

    public AFg1rSDK(@NotNull String str, @NotNull Context context, @NotNull AFi1kSDK aFi1kSDK, @NotNull AFg1uSDK aFg1uSDK, @NotNull AFj1lSDK aFj1lSDK, @NotNull AFg1vSDK aFg1vSDK, @NotNull AFh1xSDK aFh1xSDK, @NotNull AFc1qSDK aFc1qSDK, @NotNull AFc1oSDK aFc1oSDK, @NotNull AFi1pSDK aFi1pSDK, @NotNull AFf1eSDK aFf1eSDK, @NotNull AFc1hSDK aFc1hSDK, @NotNull AFg1zSDK aFg1zSDK, @NotNull AFc1eSDK aFc1eSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1kSDK, "");
        Intrinsics.checkNotNullParameter(aFg1uSDK, "");
        Intrinsics.checkNotNullParameter(aFj1lSDK, "");
        Intrinsics.checkNotNullParameter(aFg1vSDK, "");
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFi1pSDK, "");
        Intrinsics.checkNotNullParameter(aFf1eSDK, "");
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFg1zSDK, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        this.AFAdRevenueData = str;
        this.getCurrencyIso4217Code = context;
        this.getMediationNetwork = aFi1kSDK;
        this.getMonetizationNetwork = aFg1uSDK;
        this.getRevenue = aFj1lSDK;
        this.component2 = aFg1vSDK;
        this.areAllFieldsValid = aFh1xSDK;
        this.component1 = aFc1qSDK;
        this.component4 = aFc1oSDK;
        this.component3 = aFi1pSDK;
        this.hashCode = aFf1eSDK;
        this.copy = aFc1hSDK;
        this.copydefault = aFg1zSDK;
        this.toString = aFc1eSDK;
        this.equals = LazyKt.lazy(new Function0<AppsFlyerProperties>() { // from class: com.appsflyer.internal.AFg1rSDK.5
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AppsFlyerProperties invoke() {
                return AppsFlyerProperties.getInstance();
            }
        });
        this.AFKeystoreWrapper = LazyKt.lazy(new Function0<SimpleDateFormat>() { // from class: com.appsflyer.internal.AFg1rSDK.4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final SimpleDateFormat invoke() {
                return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            }
        });
    }

    private void AFAdRevenueData(@NotNull AFh1mSDK aFh1mSDK, @Nullable String str, @Nullable String str2, @Nullable AFb1rSDK aFb1rSDK) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        if (aFh1mSDK.AFAdRevenueData() == AFe1pSDK.CONVERSION) {
            int i10 = unregisterClient + 73;
            f29216e = i10 % 128;
            if (i10 % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(map, "");
                areAllFieldsValid(map);
                toString(map);
                copydefault(map);
                AFa1vSDK.getMonetizationNetwork(this.copy, this.component4);
                throw null;
            }
            Intrinsics.checkNotNullExpressionValue(map, "");
            areAllFieldsValid(map);
            toString(map);
            copydefault(map);
            AFa1vSDK.getMonetizationNetwork(this.copy, this.component4);
        }
        Intrinsics.checkNotNullExpressionValue(map, "");
        getRevenue(new Object[]{this, map}, -1147564241, 1147564241, System.identityHashCode(this));
        component3(map);
        getRevenue(new Object[]{this, map}, -841219204, 841219208, System.identityHashCode(this));
        getMonetizationNetwork(map, str2);
        getRevenue(map, str);
        copy(map);
        if (aFb1rSDK == null) {
            f29216e = (unregisterClient + 25) % 128;
            return;
        }
        int i11 = f29216e + 103;
        unregisterClient = i11 % 128;
        if (i11 % 2 == 0) {
            aFb1rSDK.getCurrencyIso4217Code(map);
        } else {
            aFb1rSDK.getCurrencyIso4217Code(map);
            throw null;
        }
    }

    private void AFInAppEventParameterName(@NotNull Map<String, Object> map) {
        unregisterClient = (f29216e + 11) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.putAll(this.copydefault.AFAdRevenueData());
        int i10 = unregisterClient + 65;
        f29216e = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    private final String AFInAppEventType() {
        File revenue = getRevenue(getCurrencyIso4217Code("ro.appsflyer.preinstall.path"));
        if (getMediationNetwork(revenue)) {
            int i10 = f29216e + 121;
            unregisterClient = i10 % 128;
            if (i10 % 2 != 0) {
                revenue = getRevenue(getMediationNetwork("AF_PRE_INSTALL_PATH"));
                int i11 = 28 / 0;
            } else {
                revenue = getRevenue(getMediationNetwork("AF_PRE_INSTALL_PATH"));
            }
        }
        if (getMediationNetwork(revenue)) {
            revenue = getRevenue("/data/local/tmp/pre_install.appsflyer");
        }
        if (getMediationNetwork(revenue)) {
            int i12 = unregisterClient + 25;
            f29216e = i12 % 128;
            if (i12 % 2 == 0) {
                getRevenue("/etc/pre_install.appsflyer");
                throw null;
            }
            revenue = getRevenue("/etc/pre_install.appsflyer");
        }
        if (getMediationNetwork(revenue)) {
            int i13 = (unregisterClient + 101) % 128;
            f29216e = i13;
            unregisterClient = (i13 + 37) % 128;
            return null;
        }
        String packageName = this.getCurrencyIso4217Code.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String mediationNetwork = getMediationNetwork(revenue, packageName);
        unregisterClient = (f29216e + 33) % 128;
        return mediationNetwork;
    }

    private void AFKeystoreWrapper(@NotNull Map<String, Object> map) {
        int i10 = f29216e + 37;
        unregisterClient = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.EXTENSION);
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.EXTENSION);
        if (string != null) {
            int i11 = f29216e + 113;
            unregisterClient = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            if (string.length() == 0) {
                return;
            }
            int i12 = unregisterClient + 11;
            f29216e = i12 % 128;
            if (i12 % 2 != 0) {
                map.put(AppsFlyerProperties.EXTENSION, string);
            } else {
                map.put(AppsFlyerProperties.EXTENSION, string);
                throw null;
            }
        }
    }

    private void AFLogger(@NotNull Map<String, Object> map) {
        unregisterClient = (f29216e + 93) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("af_preinstalled", String.valueOf(this.component4.getMonetizationNetwork(this.getCurrencyIso4217Code)));
        f29216e = (unregisterClient + 19) % 128;
    }

    private static void a(String str, int[] iArr, String str2, int i10, Object[] objArr) {
        char[] cArr = str2;
        if (str2 != null) {
            int i11 = $10 + 51;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                str2.toCharArray();
                throw null;
            }
            cArr = str2.toCharArray();
        }
        char[] cArr2 = cArr;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr2 = bArr;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr3 = AFInAppEventParameterName;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i12 = 0;
            while (i12 < length) {
                int i13 = $11 + 7;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    cArr4[i12] = (char) (cArr3[i12] + 1825820251896122634L);
                    i12 /= 0;
                } else {
                    cArr4[i12] = (char) (cArr3[i12] ^ 1825820251896122634L);
                    i12++;
                }
            }
            cArr3 = cArr4;
        }
        int i14 = (int) (1825820251896122634L ^ registerClient);
        if (AFInAppEventType) {
            int i15 = $10 + 43;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            int length2 = bArr2.length;
            aFk1oSDK.getMonetizationNetwork = length2;
            char[] cArr5 = new char[length2];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i17 = aFk1oSDK.AFAdRevenueData;
                int i18 = aFk1oSDK.getMonetizationNetwork;
                if (i17 >= i18) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i17] = (char) (cArr3[bArr2[(i18 - 1) - i17] + i10] - i14);
                    aFk1oSDK.AFAdRevenueData = i17 + 1;
                }
            }
        } else if (AFLogger) {
            int length3 = cArr2.length;
            aFk1oSDK.getMonetizationNetwork = length3;
            char[] cArr6 = new char[length3];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i19 = aFk1oSDK.AFAdRevenueData;
                int i20 = aFk1oSDK.getMonetizationNetwork;
                if (i19 >= i20) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i19] = (char) (cArr3[cArr2[(i20 - 1) - i19] - i10] - i14);
                    aFk1oSDK.AFAdRevenueData = i19 + 1;
                }
            }
        } else {
            int length4 = iArr.length;
            aFk1oSDK.getMonetizationNetwork = length4;
            char[] cArr7 = new char[length4];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i21 = aFk1oSDK.AFAdRevenueData;
                int i22 = aFk1oSDK.getMonetizationNetwork;
                if (i21 >= i22) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    cArr7[i21] = (char) (cArr3[iArr[(i22 - 1) - i21] - i10] - i14);
                    aFk1oSDK.AFAdRevenueData = i21 + 1;
                }
            }
        }
    }

    private void afInfoLog(@NotNull Map<String, Object> map) {
        String str;
        Intrinsics.checkNotNullParameter(map, "");
        if (((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
            f29216e = (unregisterClient + 55) % 128;
            try {
                this.getCurrencyIso4217Code.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                str = this.component4.AFAdRevenueData(this.getCurrencyIso4217Code);
            } catch (Throwable unused) {
                str = null;
            }
            if (str != null) {
                int i10 = unregisterClient + 17;
                f29216e = i10 % 128;
                if (i10 % 2 != 0) {
                    map.put("fb", str);
                } else {
                    map.put("fb", str);
                    throw null;
                }
            }
        }
    }

    private boolean areAllFieldsValid() {
        unregisterClient = (f29216e + 45) % 128;
        boolean parseBoolean = Boolean.parseBoolean(this.component1.getMonetizationNetwork("sentSuccessfully", (String) null));
        unregisterClient = (f29216e + 73) % 128;
        return parseBoolean;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        try {
            long longValue = ((Long) getRevenue(new Object[]{aFg1rSDK}, 1297709710, -1297709700, System.identityHashCode(aFg1rSDK))).longValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(longValue)));
            unregisterClient = (f29216e + 13) % 128;
            return null;
        } catch (Exception e10) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e10);
            return null;
        }
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        int i10 = unregisterClient + 15;
        f29216e = i10 % 128;
        int i11 = i10 % 2;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) aFg1rSDK.equals.getValue();
        if (i11 == 0) {
            int i12 = 65 / 0;
        }
        int i13 = f29216e + 91;
        unregisterClient = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 19 / 0;
        }
        return appsFlyerProperties;
    }

    private void component3(@NotNull Map<String, Object> map) {
        int i10 = unregisterClient + 81;
        f29216e = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string != null) {
            map.put("onelink_id", string);
        }
        if (string2 != null) {
            f29216e = (unregisterClient + 85) % 128;
            map.put("onelink_ver", string2);
        }
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        f29216e = (unregisterClient + 79) % 128;
        Long valueOf = Long.valueOf(aFg1rSDK.component4.n_().firstInstallTime);
        int i10 = unregisterClient + 85;
        f29216e = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 20 / 0;
        }
        return valueOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"HardwareIds"})
    private final String copy() {
        String str;
        int i10 = f29216e + 103;
        unregisterClient = i10 % 128;
        int i11 = i10 % 2;
        try {
        } catch (Exception e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10);
            str = i11;
        }
        if (i11 != 0) {
            this.component1.getMonetizationNetwork("androidIdCached", (String) null);
            Settings.Secure.getString(this.getCurrencyIso4217Code.getContentResolver(), "android_id");
            throw null;
        }
        String monetizationNetwork = this.component1.getMonetizationNetwork("androidIdCached", (String) null);
        String string = Settings.Secure.getString(this.getCurrencyIso4217Code.getContentResolver(), "android_id");
        str = monetizationNetwork;
        if (string != null) {
            int i12 = unregisterClient + 99;
            f29216e = i12 % 128;
            if (i12 % 2 != 0) {
                return string;
            }
            throw null;
        }
        if (str == 0) {
            return null;
        }
        int i13 = f29216e + 63;
        unregisterClient = i13 % 128;
        if (i13 % 2 != 0) {
            AFLogger.afDebugLog("use cached AndroidId: " + str);
            int i14 = 53 / 0;
        } else {
            AFLogger.afDebugLog("use cached AndroidId: " + str);
        }
        return str;
    }

    private final void copydefault(Map<String, Object> map) {
        f29216e = (unregisterClient + 45) % 128;
        if (AFg1iSDK.getMonetizationNetwork(this.getCurrencyIso4217Code)) {
            map.put("inst_app", Boolean.TRUE);
            unregisterClient = (f29216e + 61) % 128;
        }
    }

    private void d(@NotNull Map<String, Object> map) {
        f29216e = (unregisterClient + 115) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        if (this.component1.getMonetizationNetwork("is_stop_tracking_used")) {
            map.put("istu", String.valueOf(this.component1.getMediationNetwork("is_stop_tracking_used", false)));
        }
        int i10 = unregisterClient + 83;
        f29216e = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        if (r0 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (r0 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004f, code lost:
    
        r4.put("tokenRefreshConfigured", java.lang.Boolean.FALSE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void e(@NotNull Map<String, Object> map) {
        int i10 = unregisterClient + 63;
        f29216e = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            boolean monetizationNetwork = AFg1sSDK.getMonetizationNetwork(this.getCurrencyIso4217Code);
            AFLogger.afDebugLog("didConfigureTokenRefreshService=" + monetizationNetwork);
            int i11 = 64 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            boolean monetizationNetwork2 = AFg1sSDK.getMonetizationNetwork(this.getCurrencyIso4217Code);
            AFLogger.afDebugLog("didConfigureTokenRefreshService=" + monetizationNetwork2);
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1sSDK.AFAdRevenueData(this.component1)));
        f29216e = (unregisterClient + 51) % 128;
    }

    private void equals(@NotNull Map<String, Object> map) {
        int i10 = unregisterClient + 41;
        f29216e = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(this.getCurrencyIso4217Code.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(this.getCurrencyIso4217Code.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            throw null;
        }
    }

    private void hashCode(@NotNull Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -1147564241, 1147564241, System.identityHashCode(this));
    }

    private void i(@NotNull Map<String, Object> map) {
        unregisterClient = (f29216e + 47) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        AFb1jSDK l_ = AFb1lSDK.l_(this.getCurrencyIso4217Code.getContentResolver());
        if (l_ == null) {
            f29216e = (unregisterClient + 109) % 128;
            return;
        }
        unregisterClient = (f29216e + 33) % 128;
        map.put("amazon_aid", l_.getRevenue);
        map.put("amazon_aid_limit", String.valueOf(l_.getCurrencyIso4217Code));
    }

    private void registerClient(@NotNull Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, 1731268052, -1731268046, System.identityHashCode(this));
    }

    private static /* synthetic */ Object toString(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        AFg1uSDK.AFa1zSDK currencyIso4217Code = aFg1rSDK.getMonetizationNetwork.getCurrencyIso4217Code(aFg1rSDK.getCurrencyIso4217Code);
        float f10 = currencyIso4217Code.getMonetizationNetwork;
        String str = currencyIso4217Code.AFAdRevenueData;
        map.put("btl", String.valueOf(f10));
        if (str != null) {
            int i10 = f29216e + 109;
            unregisterClient = i10 % 128;
            if (i10 % 2 != 0) {
                map.put("btch", str);
                throw null;
            }
            map.put("btch", str);
        }
        int i11 = f29216e + 67;
        unregisterClient = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static void unregisterClient(@NotNull Map<String, Object> map) {
        getRevenue(new Object[]{map}, -1950585912, 1950585914, (int) System.currentTimeMillis());
    }

    private void w(@NotNull Map<String, Object> map) {
        int i10 = f29216e + 87;
        unregisterClient = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            this.hashCode.getMediationNetwork();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String mediationNetwork = this.hashCode.getMediationNetwork();
        if (mediationNetwork != null) {
            int i11 = unregisterClient + 71;
            f29216e = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            if (mediationNetwork.length() != 0) {
                map.put("appsflyerKey", mediationNetwork);
            }
        }
        int i12 = unregisterClient + 43;
        f29216e = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 60 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getCurrencyIso4217Code(@NotNull AFh1mSDK aFh1mSDK) {
        f29216e = (unregisterClient + 25) % 128;
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        AFAdRevenueData(map, aFh1mSDK.getRevenue());
        component2(map);
        getRevenue(new Object[]{map}, -1950585912, 1950585914, (int) System.currentTimeMillis());
        getRevenue(map);
        getRevenue(new Object[]{this, map, this.toString.getCurrencyIso4217Code}, 274047423, -274047418, System.identityHashCode(this));
        i(map);
        map.put("cell", MapsKt.mapOf(TuplesKt.to("mcc", Integer.valueOf(this.getCurrencyIso4217Code.getResources().getConfiguration().mcc)), TuplesKt.to("mnc", Integer.valueOf(this.getCurrencyIso4217Code.getResources().getConfiguration().mnc))));
        map.put("sig", AFAdRevenueData());
        map.put("last_boot_time", Long.valueOf(component1()));
        map.put("disk", component2());
        int i10 = unregisterClient + 75;
        f29216e = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMediationNetwork(@NotNull AFh1mSDK aFh1mSDK) {
        boolean z10;
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        if (this.component4.component2()) {
            AdvertisingIdData advertisingIdData = this.component4.getMonetizationNetwork.component3;
            if (advertisingIdData == null) {
                return;
            }
            String str = advertisingIdData.gaidError;
            if (str != null && str.length() != 0) {
                aFh1mSDK.getMonetizationNetwork("gaidError", advertisingIdData.gaidError);
            }
            String str2 = advertisingIdData.advertisingId;
            if (str2 != null && advertisingIdData.isEnabled != null) {
                f29216e = (unregisterClient + 89) % 128;
                aFh1mSDK.getMonetizationNetwork("advertiserId", str2);
                aFh1mSDK.getMonetizationNetwork("advertiserIdEnabled", String.valueOf(advertisingIdData.isEnabled));
                aFh1mSDK.getMonetizationNetwork("isGaidWithGps", String.valueOf(advertisingIdData.isGaidWithGps));
            }
        } else {
            int i10 = unregisterClient + 91;
            f29216e = i10 % 128;
            if (i10 % 2 == 0) {
                Map<String, Object> mediationNetwork = AFa1ySDK.getMediationNetwork(aFh1mSDK.AFAdRevenueData);
                Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
                mediationNetwork.put("ad_ids_disabled", Boolean.TRUE);
                throw null;
            }
            Map<String, Object> mediationNetwork2 = AFa1ySDK.getMediationNetwork(aFh1mSDK.AFAdRevenueData);
            Intrinsics.checkNotNullExpressionValue(mediationNetwork2, "");
            mediationNetwork2.put("ad_ids_disabled", Boolean.TRUE);
            f29216e = (unregisterClient + 83) % 128;
        }
        AdvertisingIdData advertisingIdData2 = this.component4.getMonetizationNetwork.component3;
        if (advertisingIdData2 != null) {
            f29216e = (unregisterClient + 81) % 128;
            z10 = Intrinsics.areEqual(advertisingIdData2.retry, Boolean.TRUE);
        } else {
            z10 = false;
        }
        aFh1mSDK.getMonetizationNetwork("GAID_retry", String.valueOf(z10));
        if (CollectionsKt.listOf((Object[]) new AFe1pSDK[]{AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH}).contains(aFh1mSDK.AFAdRevenueData())) {
            AFd1aSDK aFd1aSDK = this.toString.component4;
            if (aFd1aSDK == null) {
                unregisterClient = (f29216e + 77) % 128;
                return;
            }
            Map<String, Object> mediationNetwork3 = AFa1ySDK.getMediationNetwork(aFh1mSDK.AFAdRevenueData);
            Intrinsics.checkNotNullExpressionValue(mediationNetwork3, "");
            mediationNetwork3.put("fetchAdIdLatency", Long.valueOf(aFd1aSDK.getMediationNetwork));
        }
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMonetizationNetwork(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        Object string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            map.put(AppsFlyerProperties.APP_ID, string);
        }
        String string2 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.CURRENCY_CODE);
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
        } else {
            f29216e = (unregisterClient + 67) % 128;
        }
        Object string3 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.IS_UPDATE);
        if (string3 != null) {
            map.put("isUpdate", string3);
        }
        Object string4 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string4 != null) {
            map.put("customData", string4);
        }
        Object string5 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.APP_USER_ID);
        if (string5 != null) {
            map.put("appUserId", string5);
            f29216e = (unregisterClient + 35) % 128;
        }
        Object string6 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.USER_EMAILS);
        if (string6 != null) {
            map.put("user_emails", string6);
        }
        AFb1tSDK aFb1tSDK = this.toString.getRevenue;
        if (aFb1tSDK != null) {
            int i10 = unregisterClient + 1;
            f29216e = i10 % 128;
            if (i10 % 2 == 0) {
                String[] strArr = aFb1tSDK.AFAdRevenueData;
                throw null;
            }
            Object obj2 = aFb1tSDK.AFAdRevenueData;
            if (obj2 != null) {
                map.put("sharing_filter", obj2);
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getRevenue(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFi1qSDK aFi1qSDK = this.component3.getMonetizationNetwork;
        AFi1rSDK monetizationNetwork = aFi1qSDK != null ? aFi1qSDK.getMonetizationNetwork() : null;
        if (monetizationNetwork != null) {
            map.put("network", monetizationNetwork.getCurrencyIso4217Code);
            map.put("ivc", Boolean.valueOf(monetizationNetwork.getMediationNetwork()));
            if (((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                f29216e = (unregisterClient + 41) % 128;
                return;
            }
            int i10 = f29216e;
            unregisterClient = (i10 + 69) % 128;
            String str = monetizationNetwork.getMonetizationNetwork;
            if (str != null) {
                map.put("operator", str);
            } else {
                unregisterClient = (i10 + 99) % 128;
            }
            String str2 = monetizationNetwork.getRevenue;
            if (str2 != null) {
                map.put("carrier", str2);
            }
        }
    }

    private final void areAllFieldsValid(Map<String, Object> map) {
        int i10 = f29216e + 125;
        unregisterClient = i10 % 128;
        if (i10 % 2 != 0) {
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).isOtherSdkStringDisabled();
            throw null;
        }
        if (((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).isOtherSdkStringDisabled()) {
            return;
        }
        int i11 = unregisterClient + 9;
        f29216e = i11 % 128;
        if (i11 % 2 != 0) {
            map.put("batteryLevel", String.valueOf(this.getMonetizationNetwork.getCurrencyIso4217Code(this.getCurrencyIso4217Code).getMonetizationNetwork));
        } else {
            map.put("batteryLevel", String.valueOf(this.getMonetizationNetwork.getCurrencyIso4217Code(this.getCurrencyIso4217Code).getMonetizationNetwork));
            throw null;
        }
    }

    @NotNull
    private static String component2() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double pow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / pow)) + "/" + ((long) (blockCountLong / pow));
        f29216e = (unregisterClient + 21) % 128;
        return str;
    }

    @Nullable
    private String component4() {
        int i10 = unregisterClient + 61;
        f29216e = i10 % 128;
        if (i10 % 2 == 0) {
            this.component1.getMonetizationNetwork("INSTALL_STORE", (String) null);
            throw null;
        }
        String monetizationNetwork = this.component1.getMonetizationNetwork("INSTALL_STORE", (String) null);
        if (monetizationNetwork != null) {
            int i11 = unregisterClient + 37;
            f29216e = i11 % 128;
            if (i11 % 2 != 0) {
                return monetizationNetwork;
            }
            throw null;
        }
        String component3 = component3();
        if (component3 != null) {
            this.component1.getRevenue("INSTALL_STORE", component3);
        }
        int i12 = unregisterClient + 67;
        f29216e = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 79 / 0;
        }
        return component3;
    }

    private static List<AFe1pSDK> copydefault() {
        unregisterClient = (f29216e + 107) % 128;
        List<AFe1pSDK> listOf = CollectionsKt.listOf((Object[]) new AFe1pSDK[]{AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH, AFe1pSDK.INAPP, AFe1pSDK.MANUAL_PURCHASE_VALIDATION, AFe1pSDK.ARS_VALIDATE, AFe1pSDK.PURCHASE_VALIDATE, AFe1pSDK.ADREVENUE});
        f29216e = (unregisterClient + 41) % 128;
        return listOf;
    }

    private static void component2(@NotNull Map<String, Object> map) {
        f29216e = (unregisterClient + 123) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a("\u008f\u0089\u0087\u0083\u008e", null, null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        int i10 = unregisterClient + 71;
        f29216e = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    private final void toString(Map<String, Object> map) {
        int i10 = unregisterClient + 93;
        f29216e = i10 % 128;
        if (i10 % 2 != 0) {
            UiModeManager uiModeManager = (UiModeManager) this.getCurrencyIso4217Code.getSystemService(UiModeManager.class);
            if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
                return;
            }
            int i11 = unregisterClient + 33;
            f29216e = i11 % 128;
            if (i11 % 2 == 0) {
                map.put("tv", Boolean.TRUE);
                int i12 = 55 / 0;
                return;
            } else {
                map.put("tv", Boolean.TRUE);
                return;
            }
        }
        throw null;
    }

    private final boolean AFKeystoreWrapper() {
        unregisterClient = (f29216e + 29) % 128;
        if (((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            f29216e = (unregisterClient + 67) % 128;
            return true;
        }
        AFa1ySDK.getRevenue();
        return !AFa1ySDK.getRevenue(this.getCurrencyIso4217Code);
    }

    private static long component1() {
        f29216e = (unregisterClient + 73) % 128;
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        f29216e = (unregisterClient + 3) % 128;
        return currentTimeMillis;
    }

    private void component1(@NotNull Map<String, ? extends Object> map) {
        getRevenue(new Object[]{this, map}, -841219204, 841219208, System.identityHashCode(this));
    }

    private final void component4(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -753773633, 753773645, System.identityHashCode(this));
    }

    @Nullable
    private String component3() {
        f29216e = (unregisterClient + 107) % 128;
        String string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            return string;
        }
        int i10 = f29216e + 43;
        unregisterClient = i10 % 128;
        if (i10 % 2 == 0) {
            return getMediationNetwork("AF_STORE");
        }
        getMediationNetwork("AF_STORE");
        throw null;
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        boolean z10 = false;
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        Intrinsics.checkNotNullParameter(map, "");
        String component3 = aFg1rSDK.component4.component3();
        String AFAdRevenueData = AFAdRevenueData(aFg1rSDK.component1, component3);
        boolean z11 = (AFAdRevenueData == null || Intrinsics.areEqual(AFAdRevenueData, component3)) ? false : true;
        if (AFAdRevenueData == null && component3 != null) {
            z10 = true;
        }
        if (z11 || z10) {
            map.put("af_latestchannel", component3);
        }
        String component4 = aFg1rSDK.component4();
        if (component4 != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = component4.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            map.put("af_installstore", lowerCase);
        }
        String str = (String) getRevenue(new Object[]{aFg1rSDK}, -994471321, 994471330, System.identityHashCode(aFg1rSDK));
        if (str != null) {
            f29216e = (unregisterClient + 125) % 128;
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            String lowerCase2 = str.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            map.put("af_preinstall_name", lowerCase2);
        }
        String component32 = aFg1rSDK.component3();
        if (component32 == null) {
            return null;
        }
        int i10 = unregisterClient + 29;
        f29216e = i10 % 128;
        if (i10 % 2 != 0) {
            Locale locale3 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale3, "");
            String lowerCase3 = component32.toLowerCase(locale3);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            map.put("af_currentstore", lowerCase3);
            return null;
        }
        Locale locale4 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale4, "");
        String lowerCase4 = component32.toLowerCase(locale4);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
        map.put("af_currentstore", lowerCase4);
        throw null;
    }

    @Nullable
    private String equals() {
        return (String) getRevenue(new Object[]{this}, -994471321, 994471330, System.identityHashCode(this));
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        String string = ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).getString("preInstallName");
        if (string != null) {
            f29216e = (unregisterClient + 39) % 128;
            return string;
        }
        String monetizationNetwork = aFg1rSDK.component1.getMonetizationNetwork("preInstallName", (String) null);
        if (monetizationNetwork != null) {
            ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).set("preInstallName", monetizationNetwork);
            int i10 = f29216e + 71;
            unregisterClient = i10 % 128;
            if (i10 % 2 == 0) {
                return monetizationNetwork;
            }
            throw null;
        }
        String AFInAppEventType2 = aFg1rSDK.AFInAppEventType();
        if (AFInAppEventType2 == null) {
            int i11 = f29216e + 45;
            unregisterClient = i11 % 128;
            if (i11 % 2 != 0) {
                AFInAppEventType2 = aFg1rSDK.getMediationNetwork("AF_PRE_INSTALL_NAME");
                int i12 = 98 / 0;
            } else {
                AFInAppEventType2 = aFg1rSDK.getMediationNetwork("AF_PRE_INSTALL_NAME");
            }
        }
        if (AFInAppEventType2 != null) {
            aFg1rSDK.component1.getRevenue("preInstallName", AFInAppEventType2);
            ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).set("preInstallName", AFInAppEventType2);
        }
        unregisterClient = (f29216e + 15) % 128;
        return AFInAppEventType2;
    }

    private void copy(@NotNull Map<String, Object> map) {
        f29216e = (unregisterClient + 113) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        long j10 = this.areAllFieldsValid.copydefault;
        if (j10 != 0) {
            int i10 = unregisterClient + 59;
            f29216e = i10 % 128;
            if (i10 % 2 != 0) {
                map.put("prev_session_dur", Long.valueOf(j10));
            } else {
                map.put("prev_session_dur", Long.valueOf(j10));
                throw null;
            }
        }
    }

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i10, int i11, int i12) {
        long j10;
        int i13 = ~i12;
        int i14 = (i10 * 522) + (i11 * (-520)) + (((~(i13 | i11)) | i10) * (-1042)) + ((i11 | i12) * 521);
        int i15 = ~i10;
        switch (i14 + (((~(i10 | i13 | i11)) | (~(i12 | i15)) | (~((~i11) | i15))) * 521)) {
            case 1:
                return AFAdRevenueData(objArr);
            case 2:
                return getCurrencyIso4217Code(objArr);
            case 3:
                return getRevenue(objArr);
            case 4:
                return getMediationNetwork(objArr);
            case 5:
                return getMonetizationNetwork(objArr);
            case 6:
                return areAllFieldsValid(objArr);
            case 7:
                return component2(objArr);
            case 8:
                return component1(objArr);
            case 9:
                return component3(objArr);
            case 10:
                return component4(objArr);
            case 11:
                AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
                AFh1mSDK aFh1mSDK = (AFh1mSDK) objArr[1];
                f29216e = (unregisterClient + 29) % 128;
                Intrinsics.checkNotNullParameter(aFh1mSDK, "");
                Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map, "");
                getRevenue(new Object[]{aFg1rSDK, map}, -539509618, 539509626, System.identityHashCode(aFg1rSDK));
                Map<String, Object> map2 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map2, "");
                aFg1rSDK.getMediationNetwork(map2, aFh1mSDK.component4);
                Map<String, Object> map3 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map3, "");
                getRevenue(new Object[]{aFg1rSDK, map3}, 1731268052, -1731268046, System.identityHashCode(aFg1rSDK));
                Map<String, Object> map4 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map4, "");
                aFg1rSDK.AFLogger(map4);
                Map<String, Object> map5 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map5, "");
                aFg1rSDK.afInfoLog(map5);
                Map<String, Object> map6 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map6, "");
                AFe1pSDK AFAdRevenueData = aFh1mSDK.AFAdRevenueData();
                Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
                aFg1rSDK.getMediationNetwork(map6, AFAdRevenueData);
                unregisterClient = (f29216e + 51) % 128;
                return null;
            case 12:
                return toString(objArr);
            default:
                AFg1rSDK aFg1rSDK2 = (AFg1rSDK) objArr[0];
                Map map7 = (Map) objArr[1];
                unregisterClient = (f29216e + 23) % 128;
                Intrinsics.checkNotNullParameter(map7, "");
                long monetizationNetwork = aFg1rSDK2.component1.getMonetizationNetwork("AppsFlyerTimePassedSincePrevLaunch", 0L);
                long currentTimeMillis = System.currentTimeMillis();
                aFg1rSDK2.component1.AFAdRevenueData("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
                if (monetizationNetwork > 0) {
                    int i16 = unregisterClient + 35;
                    f29216e = i16 % 128;
                    j10 = i16 % 2 == 0 ? TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis ^ monetizationNetwork) : TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - monetizationNetwork);
                } else {
                    f29216e = (unregisterClient + 1) % 128;
                    j10 = -1;
                }
                map7.put("timepassedsincelastlaunch", String.valueOf(j10));
                return null;
        }
    }

    private static void AFInAppEventType(@NotNull Map<String, Object> map) {
        getRevenue(new Object[]{map}, -1520031212, 1520031215, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final long getCurrencyIso4217Code() {
        unregisterClient = (f29216e + 103) % 128;
        long currentTimeMillis = System.currentTimeMillis();
        unregisterClient = (f29216e + 119) % 128;
        return currentTimeMillis;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getCurrencyIso4217Code(@NotNull Map<String, Object> map, int i10, int i11) {
        boolean z10;
        int i12 = unregisterClient + 121;
        f29216e = i12 % 128;
        if (i12 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("counter", String.valueOf(i10));
            map.put("iaecounter", String.valueOf(i11));
            if (areAllFieldsValid()) {
                z10 = false;
            } else {
                f29216e = (unregisterClient + 103) % 128;
                z10 = true;
            }
            map.put("isFirstCall", String.valueOf(z10));
            f29216e = (unregisterClient + 103) % 128;
            return;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i10));
        map.put("iaecounter", String.valueOf(i11));
        areAllFieldsValid();
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void AFAdRevenueData(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(this.component4.getMediationNetwork);
        if (currencyIso4217Code != null) {
            map.put("uid", currencyIso4217Code);
            boolean mediationNetwork = this.component4.getMediationNetwork.getMediationNetwork("CUSTOM_INSTALL_ID_APPLIED", false);
            Intrinsics.checkNotNullExpressionValue(Boolean.valueOf(mediationNetwork), "");
            if (mediationNetwork) {
                int i10 = f29216e + 53;
                unregisterClient = i10 % 128;
                if (i10 % 2 == 0) {
                    map.put("custom_install_id", Boolean.TRUE);
                } else {
                    map.put("custom_install_id", Boolean.TRUE);
                    throw null;
                }
            }
            f29216e = (unregisterClient + 5) % 128;
        }
    }

    private void getMonetizationNetwork(@NotNull Map<String, Object> map, boolean z10) {
        unregisterClient = (f29216e + 89) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("platformextension", this.AFAdRevenueData);
        if (z10) {
            map.put("platform_extension_v2", this.getMediationNetwork.getCurrencyIso4217Code());
            unregisterClient = (f29216e + 89) % 128;
        }
    }

    @NotNull
    private String getCurrencyIso4217Code(@NotNull SimpleDateFormat simpleDateFormat, int i10) {
        int i11 = f29216e + 57;
        unregisterClient = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(simpleDateFormat, "");
            String monetizationNetwork = this.component1.getMonetizationNetwork("appsFlyerFirstInstall", (String) null);
            if (monetizationNetwork == null) {
                int i12 = unregisterClient + 99;
                f29216e = i12 % 128;
                if (i12 % 2 != 0 ? i10 > 1 : i10 > 0) {
                    monetizationNetwork = "";
                } else {
                    AFLogger.afDebugLog("AppsFlyer: first launch detected");
                    monetizationNetwork = simpleDateFormat.format(new Date());
                }
                this.component1.getRevenue("appsFlyerFirstInstall", monetizationNetwork);
                unregisterClient = (f29216e + 77) % 128;
            }
            AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "AppsFlyer: first launch date: " + monetizationNetwork, false, 4, null);
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            return monetizationNetwork;
        }
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        this.component1.getMonetizationNetwork("appsFlyerFirstInstall", (String) null);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0092, code lost:
    
        r0.putAll(r7.getRevenue.getMediationNetwork());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0078, code lost:
    
        if (r7.component4.getMediationNetwork.getRevenue("appsFlyerCount", 0) <= 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0062, code lost:
    
        if (r7.component4.getMediationNetwork.getRevenue("appsFlyerCount", 1) <= 4) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x007a, code lost:
    
        r9 = com.appsflyer.internal.AFg1rSDK.unregisterClient + 63;
        com.appsflyer.internal.AFg1rSDK.f29216e = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0083, code lost:
    
        if ((r9 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0085, code lost:
    
        r0.putAll(r7.getRevenue.getMediationNetwork());
        r9 = 65 / 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFAdRevenueData(@NotNull Map<String, Object> map, boolean z10) {
        Intrinsics.checkNotNullParameter(map, "");
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", getCurrencyIso4217Code("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", getCurrencyIso4217Code("ro.product.cpu.abi2"));
        hashMap.put("arch", getCurrencyIso4217Code("os.arch"));
        hashMap.put("build_display_id", getCurrencyIso4217Code("ro.build.display.id"));
        if (z10) {
            int i10 = unregisterClient + 55;
            f29216e = i10 % 128;
            if (i10 % 2 == 0) {
                getRevenue(new Object[]{this, hashMap}, -753773633, 753773645, System.identityHashCode(this));
            } else {
                getRevenue(new Object[]{this, hashMap}, -753773633, 753773645, System.identityHashCode(this));
            }
        }
        hashMap.put("dim", this.component2.getMediationNetwork(this.getCurrencyIso4217Code));
        map.put("deviceData", hashMap);
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMonetizationNetwork(@NotNull AFh1mSDK aFh1mSDK) {
        int i10 = unregisterClient + 125;
        f29216e = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFh1mSDK, "");
            Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
            Intrinsics.checkNotNullExpressionValue(map, "");
            map.put("open_referrer", aFh1mSDK.getMonetizationNetwork);
            String str = aFh1mSDK.copydefault;
            if (str != null && !StringsKt.isBlank(str)) {
                map.put("af_web_referrer", aFh1mSDK.copydefault);
            }
            f29216e = (unregisterClient + 7) % 128;
            return;
        }
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map2 = aFh1mSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        map2.put("open_referrer", aFh1mSDK.getMonetizationNetwork);
        throw null;
    }

    private final void getMediationNetwork(Map<String, Object> map, int i10) {
        try {
            if (this.component4.n_().versionCode > this.component1.getRevenue("versionCode", 0)) {
                f29216e = (unregisterClient + 43) % 128;
                this.component1.getMediationNetwork("versionCode", this.component4.n_().versionCode);
            }
            map.put("app_version_code", String.valueOf(this.component4.n_().versionCode));
            map.put("app_version_name", this.component4.n_().versionName);
            map.put("targetSDKver", Integer.valueOf(this.component4.getCurrencyIso4217Code.getMonetizationNetwork.getApplicationInfo().targetSdkVersion));
            map.put("date1", getRevenue().format(new Date(((Long) getRevenue(new Object[]{this}, 1297709710, -1297709700, System.identityHashCode(this))).longValue())));
            map.put("date2", getRevenue().format(new Date(this.component4.n_().lastUpdateTime)));
            Object[] objArr = new Object[1];
            a("\u008d\u0085\u0087\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            String intern = ((String) objArr[0]).intern();
            SimpleDateFormat revenue = getRevenue();
            Intrinsics.checkNotNullExpressionValue(revenue, "");
            map.put(intern, getCurrencyIso4217Code(revenue, i10));
            int i11 = f29216e + 51;
            unregisterClient = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th2, true);
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        Map map = (Map) objArr[0];
        f29216e = (unregisterClient + 65) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        try {
            map.put("lang", Locale.getDefault().getDisplayLanguage());
            unregisterClient = (f29216e + 25) % 128;
        } catch (Exception e10) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e10);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
        } catch (Exception e11) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e11);
        }
        try {
            map.put(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
            return null;
        } catch (Exception e12) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e12);
            return null;
        }
    }

    private final SimpleDateFormat getRevenue() {
        f29216e = (unregisterClient + 23) % 128;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.AFKeystoreWrapper.getValue();
        f29216e = (unregisterClient + 101) % 128;
        return simpleDateFormat;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getRevenue(@NotNull AFh1mSDK aFh1mSDK) {
        int i10 = unregisterClient + 113;
        f29216e = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFh1mSDK, "");
            Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
            if (aFh1mSDK.getRevenue()) {
                String str = aFh1mSDK.component1;
                AFc1eSDK aFc1eSDK = this.toString;
                AFAdRevenueData(aFh1mSDK, str, aFc1eSDK.getMediationNetwork, aFc1eSDK.AFAdRevenueData);
                f29216e = (unregisterClient + 53) % 128;
            } else if (!(aFh1mSDK instanceof AFh1fSDK)) {
                int i11 = f29216e + 93;
                unregisterClient = i11 % 128;
                if (i11 % 2 != 0) {
                    Intrinsics.checkNotNullExpressionValue(map, "");
                    String str2 = aFh1mSDK.areAllFieldsValid;
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    getMediationNetwork(map, str2);
                    int i12 = 79 / 0;
                } else {
                    Intrinsics.checkNotNullExpressionValue(map, "");
                    String str3 = aFh1mSDK.areAllFieldsValid;
                    Intrinsics.checkNotNullExpressionValue(str3, "");
                    getMediationNetwork(map, str3);
                }
            }
            if (CollectionsKt.listOf((Object[]) new AFe1pSDK[]{AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH, AFe1pSDK.INAPP}).contains(aFh1mSDK.AFAdRevenueData())) {
                int i13 = f29216e + 33;
                unregisterClient = i13 % 128;
                if (i13 % 2 != 0) {
                    Intrinsics.checkNotNullExpressionValue(map, "");
                    equals(map);
                    int i14 = 79 / 0;
                } else {
                    Intrinsics.checkNotNullExpressionValue(map, "");
                    equals(map);
                }
            }
            Intrinsics.checkNotNullExpressionValue(map, "");
            w(map);
            getRevenue(new Object[]{map}, -1520031212, 1520031215, (int) System.currentTimeMillis());
            AFInAppEventParameterName(map);
            AFKeystoreWrapper(map);
            AFAdRevenueData(map);
            getMonetizationNetwork(map, aFh1mSDK.getRevenue());
            e(map);
            d(map);
            getMonetizationNetwork(map, aFh1mSDK);
            map.put("af_events_api", "1");
            return;
        }
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map2 = aFh1mSDK.AFAdRevenueData;
        aFh1mSDK.getRevenue();
        throw null;
    }

    @SuppressLint({"PrivateApi"})
    @Nullable
    private static String getCurrencyIso4217Code(@Nullable String str) {
        f29216e = (unregisterClient + 19) % 128;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.checkNotNull(invoke, "");
            String str2 = (String) invoke;
            unregisterClient = (f29216e + 117) % 128;
            return str2;
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        String AFAdRevenueData;
        AFb1jSDK mediationNetwork;
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        Intrinsics.checkNotNullParameter(map, "");
        if (((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i10 = unregisterClient + 33;
            f29216e = i10 % 128;
            if (i10 % 2 != 0) {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                return null;
            }
            map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            throw null;
        }
        String monetizationNetwork = aFg1rSDK.hashCode.getMonetizationNetwork(aFg1rSDK.component1);
        if (monetizationNetwork != null) {
            f29216e = (unregisterClient + 79) % 128;
            if (monetizationNetwork.length() != 0) {
                f29216e = (unregisterClient + 71) % 128;
                map.put("imei", monetizationNetwork);
                AFAdRevenueData = aFg1rSDK.AFAdRevenueData(str);
                if (AFAdRevenueData == null) {
                    aFg1rSDK.component1.getRevenue("androidIdCached", AFAdRevenueData);
                    map.put("android_id", AFAdRevenueData);
                } else {
                    AFLogger.afInfoLog("Android ID was not collected.");
                }
                mediationNetwork = AFb1lSDK.getMediationNetwork(aFg1rSDK.getCurrencyIso4217Code);
                if (mediationNetwork != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Boolean bool = mediationNetwork.getMonetizationNetwork;
                    Intrinsics.checkNotNullExpressionValue(bool, "");
                    linkedHashMap.put("isManual", bool);
                    String str2 = mediationNetwork.getRevenue;
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    linkedHashMap.put("val", str2);
                    Boolean bool2 = mediationNetwork.getCurrencyIso4217Code;
                    if (bool2 != null) {
                        linkedHashMap.put("isLat", bool2);
                    }
                    map.put("oaid", linkedHashMap);
                }
                return null;
            }
        }
        f29216e = (unregisterClient + 33) % 128;
        AFAdRevenueData = aFg1rSDK.AFAdRevenueData(str);
        if (AFAdRevenueData == null) {
        }
        mediationNetwork = AFb1lSDK.getMediationNetwork(aFg1rSDK.getCurrencyIso4217Code);
        if (mediationNetwork != null) {
        }
        return null;
    }

    @Nullable
    private String AFAdRevenueData() {
        unregisterClient = (f29216e + 31) % 128;
        String N_ = AFj1kSDK.N_(this.getCurrencyIso4217Code.getApplicationContext().getPackageManager(), this.getCurrencyIso4217Code.getApplicationContext().getPackageName());
        unregisterClient = (f29216e + 71) % 128;
        return N_;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        Object m147constructorimpl;
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        Intrinsics.checkNotNullParameter(map, "");
        String str = aFg1rSDK.toString.getMonetizationNetwork;
        if (str != null) {
            int i10 = unregisterClient + 83;
            f29216e = i10 % 128;
            if (i10 % 2 != 0) {
                if (map.get("af_deeplink") != null) {
                    AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                } else {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        JSONObject jSONObject = new JSONObject(str);
                        jSONObject.put("isPush", "true");
                        map.put("af_deeplink", jSONObject.toString());
                        m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.INSTANCE;
                        m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
                    }
                    Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                    if (m150exceptionOrNullimpl != null) {
                        AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "Exception while trying to create JSONObject from pushPayload", m150exceptionOrNullimpl, false, false, false, false, 120, null);
                        unregisterClient = (f29216e + 33) % 128;
                    }
                    Result.m146boximpl(m147constructorimpl);
                }
            } else {
                map.get("af_deeplink");
                throw null;
            }
        }
        aFg1rSDK.toString.getMonetizationNetwork = null;
        return null;
    }

    private void getCurrencyIso4217Code(@NotNull Map<String, Object> map, @Nullable String str) {
        getRevenue(new Object[]{this, map, str}, 274047423, -274047418, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getCurrencyIso4217Code(@NotNull Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, 528204691, -528204690, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        Intrinsics.checkNotNullParameter(map, "");
        AFh1xSDK aFh1xSDK = aFg1rSDK.areAllFieldsValid;
        HashMap hashMap = new HashMap(aFh1xSDK.getRevenue);
        aFh1xSDK.getRevenue.clear();
        aFh1xSDK.getMonetizationNetwork.AFAdRevenueData("gcd");
        Intrinsics.checkNotNullExpressionValue(hashMap, "");
        if (hashMap.isEmpty()) {
            return null;
        }
        int i10 = (unregisterClient + 21) % 128;
        f29216e = i10;
        int i11 = i10 + 47;
        unregisterClient = i11 % 128;
        if (i11 % 2 != 0) {
            Map<String, Object> mediationNetwork = AFa1ySDK.getMediationNetwork((Map<String, Object>) map);
            Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
            mediationNetwork.put("gcd", hashMap);
            int i12 = 34 / 0;
            return null;
        }
        Map<String, Object> mediationNetwork2 = AFa1ySDK.getMediationNetwork((Map<String, Object>) map);
        Intrinsics.checkNotNullExpressionValue(mediationNetwork2, "");
        mediationNetwork2.put("gcd", hashMap);
        return null;
    }

    private final String AFAdRevenueData(String str) {
        int i10 = unregisterClient + 95;
        f29216e = i10 % 128;
        if (i10 % 2 != 0 ? ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false) : ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false)) {
            int i11 = unregisterClient + 43;
            f29216e = i11 % 128;
            if (i11 % 2 != 0) {
                if (str == null || str.length() == 0) {
                    if (!AFKeystoreWrapper()) {
                        return null;
                    }
                    f29216e = (unregisterClient + 75) % 128;
                    return copy();
                }
            } else {
                throw null;
            }
        }
        if (str == null) {
            return null;
        }
        int i12 = unregisterClient + 23;
        f29216e = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static void getMonetizationNetwork(@NotNull Map<String, Object> map, @Nullable String str) {
        unregisterClient = (f29216e + 77) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        if (str != null) {
            f29216e = (unregisterClient + 81) % 128;
            map.put("phone", str);
        }
    }

    private void getMediationNetwork(@NotNull Map<String, Object> map, @NotNull String str) {
        int i10 = unregisterClient + 7;
        f29216e = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(str, "");
                String monetizationNetwork = this.component1.getMonetizationNetwork("prev_event_name", (String) null);
                if (monetizationNetwork != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("prev_event_timestamp", this.component1.getMonetizationNetwork("prev_event_timestamp", -1L));
                    jSONObject.put("prev_event_name", monetizationNetwork);
                    map.put("prev_event", jSONObject);
                    unregisterClient = (f29216e + 107) % 128;
                }
                this.component1.getRevenue("prev_event_name", str);
                this.component1.AFAdRevenueData("prev_event_timestamp", System.currentTimeMillis());
                return;
            }
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.component1.getMonetizationNetwork("prev_event_name", (String) null);
            throw null;
        } catch (Exception e10) {
            AFLogger.afErrorLog("Error while processing previous event.", e10);
        }
    }

    private static void getMonetizationNetwork(@NotNull Map<String, Object> map, @NotNull AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        String str = aFh1mSDK.areAllFieldsValid;
        if (str != null) {
            map.put("eventName", str);
            Map map2 = aFh1mSDK.getRevenue;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        com.appsflyer.internal.AFg1rSDK.f29216e = (com.appsflyer.internal.AFg1rSDK.unregisterClient + 23) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        r4.getRevenue("CACHED_CHANNEL", r5);
        r4 = com.appsflyer.internal.AFg1rSDK.f29216e + 99;
        com.appsflyer.internal.AFg1rSDK.unregisterClient = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if ((r4 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String AFAdRevenueData(AFc1qSDK aFc1qSDK, String str) {
        String monetizationNetwork;
        int i10 = unregisterClient + 17;
        f29216e = i10 % 128;
        if (i10 % 2 == 0) {
            monetizationNetwork = aFc1qSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
            int i11 = 81 / 0;
        } else {
            monetizationNetwork = aFc1qSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
        }
    }

    private void getRevenue(@NotNull Map<String, Object> map, @Nullable String str) {
        int i10 = unregisterClient + 75;
        f29216e = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            if (str != null) {
                unregisterClient = (f29216e + 33) % 128;
                if (str.length() != 0) {
                    int i11 = f29216e + 61;
                    unregisterClient = i11 % 128;
                    if (i11 % 2 == 0) {
                        map.put("referrer", str);
                        unregisterClient = (f29216e + 41) % 128;
                    } else {
                        map.put("referrer", str);
                        throw null;
                    }
                }
            }
            Object monetizationNetwork = this.component1.getMonetizationNetwork("extraReferrers", (String) null);
            if (monetizationNetwork != null) {
                map.put("extraReferrers", monetizationNetwork);
            }
            String referrer = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getReferrer(this.component1);
            if (referrer != null) {
                unregisterClient = (f29216e + 65) % 128;
                if (referrer.length() != 0) {
                    if (map.get("referrer") == null) {
                        map.put("referrer", referrer);
                        return;
                    }
                    return;
                }
            }
            unregisterClient = (f29216e + 97) % 128;
            return;
        }
        Intrinsics.checkNotNullParameter(map, "");
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    @NotNull
    public final Long getMonetizationNetwork() {
        return (Long) getRevenue(new Object[]{this}, 1297709710, -1297709700, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void AFAdRevenueData(@NotNull AFh1mSDK aFh1mSDK) {
        getRevenue(new Object[]{this, aFh1mSDK}, 572486758, -572486747, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMediationNetwork(@NotNull Map<String, Object> map, @NotNull AFe1pSDK aFe1pSDK) {
        f29216e = (unregisterClient + 113) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFe1pSDK, "");
        if (!copydefault().contains(aFe1pSDK)) {
            f29216e = (unregisterClient + 39) % 128;
            return;
        }
        if (this.toString.getMediationNetwork()) {
            map.put("app_set_id", MapsKt.mapOf(TuplesKt.to("app_set_id_disabled", Boolean.TRUE)));
            if (this.toString.copydefault != null) {
                f29216e = (unregisterClient + 85) % 128;
                AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK.", false, 4, null);
                f29216e = (unregisterClient + 1) % 128;
                return;
            } else {
                AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set ID collection is disabled. Skipping inclusion in the event payload.", false, 4, null);
                int i10 = unregisterClient + 41;
                f29216e = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        AFb1gSDK aFb1gSDK = this.toString.copydefault;
        if (aFb1gSDK != null) {
            map.put("app_set_id", MapsKt.mapOf(TuplesKt.to("scope", Integer.valueOf(aFb1gSDK.getMonetizationNetwork)), TuplesKt.to(StackTraceHelper.ID_KEY, aFb1gSDK.getMediationNetwork)));
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        Map map = (Map) objArr[0];
        f29216e = (unregisterClient + 45) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        String monetizationNetwork = AFa1vSDK.getMonetizationNetwork();
        String currencyIso4217Code = AFa1vSDK.getCurrencyIso4217Code();
        if (monetizationNetwork != null) {
            int i10 = f29216e + 93;
            unregisterClient = i10 % 128;
            if (i10 % 2 == 0) {
                if (currencyIso4217Code != null && Integer.parseInt(currencyIso4217Code) > 0) {
                    unregisterClient = (f29216e + 1) % 128;
                    map.put("reinstallCounter", currencyIso4217Code);
                    map.put("originalAppsflyerId", monetizationNetwork);
                }
            } else {
                throw null;
            }
        }
        int i11 = f29216e + 13;
        unregisterClient = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static File getRevenue(String str) {
        int i10 = (unregisterClient + 9) % 128;
        f29216e = i10;
        if (str != null) {
            int i11 = i10 + 71;
            unregisterClient = i11 % 128;
            try {
                if (i11 % 2 == 0) {
                    if (StringsKt.trim((CharSequence) str).toString().length() > 0) {
                        return new File(StringsKt.trim((CharSequence) str).toString());
                    }
                } else {
                    StringsKt.trim((CharSequence) str).toString().length();
                    throw null;
                }
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getMessage(), th2);
            }
        }
        int i12 = unregisterClient + 41;
        f29216e = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 94 / 0;
        }
        return null;
    }

    private final String getMediationNetwork(String str) {
        unregisterClient = (f29216e + 73) % 128;
        String currencyIso4217Code = this.component4.getCurrencyIso4217Code(str);
        f29216e = (unregisterClient + 57) % 128;
        return currencyIso4217Code;
    }

    private static boolean getMediationNetwork(File file) {
        int i10 = (unregisterClient + 55) % 128;
        f29216e = i10;
        if (file == null) {
            return true;
        }
        int i11 = i10 + 43;
        unregisterClient = i11 % 128;
        if (i11 % 2 == 0) {
            return !file.exists();
        }
        file.exists();
        throw null;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x004a -> B:24:0x007a). Please report as a decompilation issue!!! */
    private static String getMediationNetwork(File file, String str) {
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
                    unregisterClient = (f29216e + 73) % 128;
                    return property;
                } catch (FileNotFoundException unused2) {
                    AFLogger.afDebugLog("PreInstall file wasn't found: " + file.getAbsolutePath());
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                        unregisterClient = (f29216e + 93) % 128;
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

    private final void getMediationNetwork(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -539509618, 539509626, System.identityHashCode(this));
    }

    private final AppsFlyerProperties getMediationNetwork() {
        return (AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this));
    }
}
