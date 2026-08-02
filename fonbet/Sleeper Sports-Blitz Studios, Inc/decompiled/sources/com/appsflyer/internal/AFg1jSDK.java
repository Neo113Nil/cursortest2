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
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.amplitude.api.Constants;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFd1ySDK;
import io.sentry.protocol.DebugImage;
import j$.util.DesugarTimeZone;
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
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
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
import org.chromium.net.NetError;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFg1jSDK implements AFg1iSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char AFInAppEventParameterName = 37224;
    private static char AFInAppEventType = 14838;
    private static int registerClient = 0;
    private static int unregisterClient = 1;
    private static char valueOf = 26042;
    private static char values = 54402;
    private final AFj1oSDK AFAdRevenueData;
    private final Lazy AFKeystoreWrapper;
    private final AFd1rSDK areAllFieldsValid;
    private final AFi1sSDK component1;
    private final AFb1zSDK component2;
    private final AFd1pSDK component3;
    private final AFh1sSDK component4;
    private final Lazy copy;
    private final AFd1tSDK copydefault;
    private final AFg1uSDK equals;
    private final String getCurrencyIso4217Code;
    private final AFd1ySDK getMediationNetwork;
    private final Context getMonetizationNetwork;
    private final AFi1lSDK getRevenue;
    private final AFd1lSDK hashCode;
    private final AFg1nSDK toString;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009e, code lost:
    
        if (r0.areAllFieldsValid.getRevenue.AFAdRevenueData("appsFlyerCount", 1) <= 5) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ae, code lost:
    
        r8.putAll(r0.AFAdRevenueData.getMediationNetwork());
        r6 = com.appsflyer.internal.AFg1jSDK.unregisterClient + 113;
        com.appsflyer.internal.AFg1jSDK.registerClient = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ac, code lost:
    
        if (r0.areAllFieldsValid.getRevenue.AFAdRevenueData("appsFlyerCount", 0) <= 2) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object getMonetizationNetwork(Object[] objArr, int i, int i2, int i3) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        int i4 = (i * NetError.ERR_TOO_MANY_RETRIES) + (i2 * NetError.ERR_TOO_MANY_RETRIES);
        int i5 = ~i;
        int i6 = (~((~i2) | i5)) | i3;
        int i7 = ~(i | i2);
        switch (i4 + ((i6 | i7) * 376) + (((~(i | (~i3))) | i7) * NetError.ERR_HTTP2_STREAM_CLOSED) + (((~(i5 | i3)) | i2) * 376)) {
            case 1:
                return getMonetizationNetwork(objArr);
            case 2:
                return getMediationNetwork(objArr);
            case 3:
                return getCurrencyIso4217Code(objArr);
            case 4:
                return getRevenue(objArr);
            case 5:
                return component2(objArr);
            case 6:
                return component1(objArr);
            case 7:
                return component3(objArr);
            case 8:
                return areAllFieldsValid(objArr);
            case 9:
                PackageManager packageManager = (PackageManager) objArr[0];
                String str = (String) objArr[1];
                int i8 = 2 % 2;
                int i9 = unregisterClient + 43;
                registerClient = i9 % 128;
                if (i9 % 2 == 0 ? Build.VERSION.SDK_INT >= 33 : Build.VERSION.SDK_INT >= 113) {
                    of = PackageManager.PackageInfoFlags.of(0L);
                    packageInfo = packageManager.getPackageInfo(str, of);
                    Intrinsics.checkNotNullExpressionValue(packageInfo, "");
                    return packageInfo;
                }
                PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 0);
                Intrinsics.checkNotNullExpressionValue(packageInfo2, "");
                int i10 = unregisterClient + 97;
                registerClient = i10 % 128;
                int i11 = i10 % 2;
                return packageInfo2;
            case 10:
                AFg1jSDK aFg1jSDK = (AFg1jSDK) objArr[0];
                Map map = (Map) objArr[1];
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                int i12 = 2 % 2;
                Intrinsics.checkNotNullParameter(map, "");
                HashMap hashMap = new HashMap();
                hashMap.put("cpu_abi", getCurrencyIso4217Code("ro.product.cpu.abi"));
                hashMap.put("cpu_abi2", getCurrencyIso4217Code("ro.product.cpu.abi2"));
                hashMap.put(DebugImage.JsonKeys.ARCH, getCurrencyIso4217Code("os.arch"));
                hashMap.put("build_display_id", getCurrencyIso4217Code("ro.build.display.id"));
                if (booleanValue) {
                    int i13 = unregisterClient + 115;
                    registerClient = i13 % 128;
                    if (i13 % 2 == 0) {
                        aFg1jSDK.component3(hashMap);
                        break;
                    } else {
                        aFg1jSDK.component3(hashMap);
                        break;
                    }
                }
                hashMap.put("dim", aFg1jSDK.component2.getCurrencyIso4217Code(aFg1jSDK.getMonetizationNetwork));
                map.put("deviceData", hashMap);
                int i14 = registerClient + 61;
                unregisterClient = i14 % 128;
                int i15 = i14 % 2;
                return null;
            case 11:
                return component4(objArr);
            case 12:
                return hashCode(objArr);
            default:
                return AFAdRevenueData(objArr);
        }
    }

    public AFg1jSDK(String str, Context context, AFi1lSDK aFi1lSDK, AFd1ySDK aFd1ySDK, AFj1oSDK aFj1oSDK, AFb1zSDK aFb1zSDK, AFh1sSDK aFh1sSDK, AFd1pSDK aFd1pSDK, AFd1rSDK aFd1rSDK, AFi1sSDK aFi1sSDK, AFg1uSDK aFg1uSDK, AFd1lSDK aFd1lSDK, AFg1nSDK aFg1nSDK, AFd1tSDK aFd1tSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1lSDK, "");
        Intrinsics.checkNotNullParameter(aFd1ySDK, "");
        Intrinsics.checkNotNullParameter(aFj1oSDK, "");
        Intrinsics.checkNotNullParameter(aFb1zSDK, "");
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        Intrinsics.checkNotNullParameter(aFd1rSDK, "");
        Intrinsics.checkNotNullParameter(aFi1sSDK, "");
        Intrinsics.checkNotNullParameter(aFg1uSDK, "");
        Intrinsics.checkNotNullParameter(aFd1lSDK, "");
        Intrinsics.checkNotNullParameter(aFg1nSDK, "");
        Intrinsics.checkNotNullParameter(aFd1tSDK, "");
        this.getCurrencyIso4217Code = str;
        this.getMonetizationNetwork = context;
        this.getRevenue = aFi1lSDK;
        this.getMediationNetwork = aFd1ySDK;
        this.AFAdRevenueData = aFj1oSDK;
        this.component2 = aFb1zSDK;
        this.component4 = aFh1sSDK;
        this.component3 = aFd1pSDK;
        this.areAllFieldsValid = aFd1rSDK;
        this.component1 = aFi1sSDK;
        this.equals = aFg1uSDK;
        this.hashCode = aFd1lSDK;
        this.toString = aFg1nSDK;
        this.copydefault = aFd1tSDK;
        this.copy = LazyKt.lazy(new Function0<AppsFlyerProperties>() { // from class: com.appsflyer.internal.AFg1jSDK.4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final AppsFlyerProperties invoke() {
                return AppsFlyerProperties.getInstance();
            }
        });
        this.AFKeystoreWrapper = LazyKt.lazy(new Function0<SimpleDateFormat>() { // from class: com.appsflyer.internal.AFg1jSDK.5
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final SimpleDateFormat invoke() {
                return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            }
        });
    }

    private final AppsFlyerProperties getMonetizationNetwork() {
        int i = 2 % 2;
        int i2 = unregisterClient + 105;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) this.copy.getValue();
        int i4 = registerClient + 99;
        unregisterClient = i4 % 128;
        if (i4 % 2 != 0) {
            return appsFlyerProperties;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFg1jSDK aFg1jSDK = (AFg1jSDK) objArr[0];
        int i = 2 % 2;
        int i2 = registerClient + 113;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) aFg1jSDK.AFKeystoreWrapper.getValue();
        if (i3 != 0) {
            return simpleDateFormat;
        }
        throw null;
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        int i2 = 2 % 2;
        if (str != null) {
            int i3 = $11 + 63;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            cArr = str.toCharArray();
            int i5 = $11 + 41;
            $10 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        AFk1sSDK aFk1sSDK = new AFk1sSDK();
        char[] cArr3 = new char[cArr2.length];
        aFk1sSDK.getMediationNetwork = 0;
        char[] cArr4 = new char[2];
        while (aFk1sSDK.getMediationNetwork < cArr2.length) {
            int i7 = $11 + 71;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr4[0] = cArr2[aFk1sSDK.getMediationNetwork];
            cArr4[1] = cArr2[aFk1sSDK.getMediationNetwork + 1];
            int i9 = 58224;
            for (int i10 = 0; i10 < 16; i10++) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                char c3 = (char) (c - (((c2 + i9) ^ ((c2 << 4) + ((char) (valueOf ^ 2181514254689940565L)))) ^ ((c2 >>> 5) + ((char) (values ^ 2181514254689940565L)))));
                cArr4[1] = c3;
                cArr4[0] = (char) (c2 - (((c3 >>> 5) + ((char) (AFInAppEventParameterName ^ 2181514254689940565L))) ^ ((c3 + i9) ^ ((c3 << 4) + ((char) (AFInAppEventType ^ 2181514254689940565L))))));
                i9 -= 40503;
            }
            cArr3[aFk1sSDK.getMediationNetwork] = cArr4[0];
            cArr3[aFk1sSDK.getMediationNetwork + 1] = cArr4[1];
            aFk1sSDK.getMediationNetwork += 2;
            int i11 = $10 + 85;
            $11 = i11 % 128;
            int i12 = i11 % 2;
        }
        objArr[0] = new String(cArr3, 0, i);
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        AFg1jSDK aFg1jSDK = (AFg1jSDK) objArr[0];
        AFa1mSDK aFa1mSDK = (AFa1mSDK) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFa1mSDK, "");
        Map<String, Object> monetizationNetwork = aFa1mSDK.getMonetizationNetwork();
        Object obj = null;
        if (aFa1mSDK.getCurrencyIso4217Code()) {
            int i2 = unregisterClient + 99;
            registerClient = i2 % 128;
            if (i2 % 2 != 0) {
                getMonetizationNetwork(new Object[]{aFg1jSDK, aFa1mSDK, aFa1mSDK.areAllFieldsValid, aFg1jSDK.copydefault.getRevenue, aFg1jSDK.copydefault.AFAdRevenueData}, 476184655, -476184644, System.identityHashCode(aFg1jSDK));
                obj.hashCode();
                throw null;
            }
            getMonetizationNetwork(new Object[]{aFg1jSDK, aFa1mSDK, aFa1mSDK.areAllFieldsValid, aFg1jSDK.copydefault.getRevenue, aFg1jSDK.copydefault.AFAdRevenueData}, 476184655, -476184644, System.identityHashCode(aFg1jSDK));
        } else if (!(aFa1mSDK instanceof AFh1hSDK)) {
            int i3 = registerClient + 35;
            unregisterClient = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                String str = aFa1mSDK.component3;
                Intrinsics.checkNotNullExpressionValue(str, "");
                aFg1jSDK.getRevenue(monetizationNetwork, str);
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            String str2 = aFa1mSDK.component3;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            aFg1jSDK.getRevenue(monetizationNetwork, str2);
        }
        if (CollectionsKt.listOf((Object[]) new AFf1wSDK[]{AFf1wSDK.CONVERSION, AFf1wSDK.LAUNCH, AFf1wSDK.INAPP}).contains(aFa1mSDK.AFAdRevenueData())) {
            int i4 = unregisterClient + 21;
            registerClient = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            aFg1jSDK.toString(monetizationNetwork);
            int i6 = unregisterClient + 99;
            registerClient = i6 % 128;
            int i7 = i6 % 2;
        }
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        aFg1jSDK.unregisterClient(monetizationNetwork);
        AFKeystoreWrapper(monetizationNetwork);
        aFg1jSDK.AFInAppEventType(monetizationNetwork);
        aFg1jSDK.values(monetizationNetwork);
        aFg1jSDK.e(monetizationNetwork);
        getMonetizationNetwork(new Object[]{aFg1jSDK, monetizationNetwork, Boolean.valueOf(aFa1mSDK.getCurrencyIso4217Code())}, 1766708889, -1766708886, System.identityHashCode(aFg1jSDK));
        aFg1jSDK.registerClient(monetizationNetwork);
        aFg1jSDK.d(monetizationNetwork);
        AFAdRevenueData(monetizationNetwork, aFa1mSDK);
        monetizationNetwork.put("af_events_api", "1");
        return null;
    }

    @Override // com.appsflyer.internal.AFg1iSDK
    public final void getMonetizationNetwork(Map<String, Object> map, boolean z, Function0<String> function0) {
        int i = 2 % 2;
        int i2 = registerClient + 107;
        unregisterClient = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(function0, "");
            getRevenue(map);
            getMonetizationNetwork(new Object[]{this, map}, 92189032, -92189024, System.identityHashCode(this));
            AFInAppEventParameterName(map);
            getMonetizationNetwork(map, z);
            getMonetizationNetwork(new Object[]{this, map, function0}, 1991315843, -1991315841, System.identityHashCode(this));
            int i3 = 93 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(function0, "");
            getRevenue(map);
            getMonetizationNetwork(new Object[]{this, map}, 92189032, -92189024, System.identityHashCode(this));
            AFInAppEventParameterName(map);
            getMonetizationNetwork(map, z);
            getMonetizationNetwork(new Object[]{this, map, function0}, 1991315843, -1991315841, System.identityHashCode(this));
        }
        int i4 = registerClient + 69;
        unregisterClient = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
    }

    private final void getRevenue(Map<String, Object> map) {
        int i = 2 % 2;
        try {
            long j = this.getMonetizationNetwork.getPackageManager().getPackageInfo(this.getMonetizationNetwork.getPackageName(), 0).firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(j)));
            int i2 = unregisterClient + 65;
            registerClient = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r5.versionCode > r2.component3.AFAdRevenueData("versionCode", 0)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        PackageInfo packageInfo;
        AFg1jSDK aFg1jSDK = (AFg1jSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i = 2 % 2;
        int i2 = unregisterClient + 71;
        registerClient = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                packageInfo = aFg1jSDK.getMonetizationNetwork.getPackageManager().getPackageInfo(aFg1jSDK.getMonetizationNetwork.getPackageName(), 0);
                if (packageInfo.versionCode > aFg1jSDK.component3.AFAdRevenueData("versionCode", 0)) {
                    aFg1jSDK.component3.getRevenue("versionCode", packageInfo.versionCode);
                }
                map.put("app_version_code", String.valueOf(packageInfo.versionCode));
                AFd1rSDK aFd1rSDK = aFg1jSDK.areAllFieldsValid;
                map.put("app_version_name", AFb1qSDK.getMediationNetwork(aFd1rSDK.getMonetizationNetwork.getCurrencyIso4217Code, aFd1rSDK.getMonetizationNetwork.getCurrencyIso4217Code.getPackageName()));
                map.put("targetSDKver", Integer.valueOf(aFg1jSDK.areAllFieldsValid.getMonetizationNetwork.getCurrencyIso4217Code.getApplicationInfo().targetSdkVersion));
                long j = packageInfo.firstInstallTime;
                long j2 = packageInfo.lastUpdateTime;
                map.put("date1", ((SimpleDateFormat) getMonetizationNetwork(new Object[]{aFg1jSDK}, 1239753694, -1239753688, System.identityHashCode(aFg1jSDK))).format(new Date(j)));
                map.put("date2", ((SimpleDateFormat) getMonetizationNetwork(new Object[]{aFg1jSDK}, 1239753694, -1239753688, System.identityHashCode(aFg1jSDK))).format(new Date(j2)));
                Object[] objArr2 = new Object[1];
                a("\ueba7岇憠\uef8aẵכ\uf3aa칛松\u0dd5\ue805\uf880楖挺㇊\udbbc", 14 - TextUtils.lastIndexOf("", '0', 0, 0), objArr2);
                String intern = ((String) objArr2[0]).intern();
                SimpleDateFormat simpleDateFormat = (SimpleDateFormat) getMonetizationNetwork(new Object[]{aFg1jSDK}, 1239753694, -1239753688, System.identityHashCode(aFg1jSDK));
                Intrinsics.checkNotNullExpressionValue(simpleDateFormat, "");
                map.put(intern, aFg1jSDK.getMonetizationNetwork(simpleDateFormat));
                int i3 = registerClient + 41;
                unregisterClient = i3 % 128;
                int i4 = i3 % 2;
                return null;
            }
            packageInfo = aFg1jSDK.getMonetizationNetwork.getPackageManager().getPackageInfo(aFg1jSDK.getMonetizationNetwork.getPackageName(), 0);
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
            return null;
        }
        AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
        return null;
    }

    @Override // com.appsflyer.internal.AFg1iSDK
    public final void getRevenue(AFa1mSDK aFa1mSDK) {
        int i = 2 % 2;
        int i2 = unregisterClient + 13;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aFa1mSDK, "");
        Map<String, Object> monetizationNetwork = aFa1mSDK.getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        getMonetizationNetwork(new Object[]{this, monetizationNetwork, Boolean.valueOf(aFa1mSDK.getCurrencyIso4217Code())}, -1299976287, 1299976297, System.identityHashCode(this));
        areAllFieldsValid(monetizationNetwork);
        valueOf(monetizationNetwork);
        getMonetizationNetwork(new Object[]{this, monetizationNetwork}, 171091670, -171091665, System.identityHashCode(this));
        getCurrencyIso4217Code(monetizationNetwork, this.copydefault.getMediationNetwork);
        AFLogger(monetizationNetwork);
        monetizationNetwork.put("cell", MapsKt.mapOf(TuplesKt.to("mcc", Integer.valueOf(this.getMonetizationNetwork.getResources().getConfiguration().mcc)), TuplesKt.to("mnc", Integer.valueOf(this.getMonetizationNetwork.getResources().getConfiguration().mnc))));
        monetizationNetwork.put("sig", (String) getMonetizationNetwork(new Object[]{this}, 333533232, -333533231, System.identityHashCode(this)));
        monetizationNetwork.put("last_boot_time", Long.valueOf(component3()));
        monetizationNetwork.put("disk", component2());
        int i4 = registerClient + 103;
        unregisterClient = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1iSDK
    public final void AFAdRevenueData(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String string = getMonetizationNetwork().getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            int i2 = registerClient + 65;
            unregisterClient = i2 % 128;
            int i3 = i2 % 2;
            map.put(AppsFlyerProperties.APP_ID, string);
            int i4 = unregisterClient + 63;
            registerClient = i4 % 128;
            int i5 = i4 % 2;
        }
        String string2 = getMonetizationNetwork().getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            if (string2.length() != 3) {
                StringBuilder sb = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb.append(string2);
                sb.append("' is not a legal value.");
                String obj = sb.toString();
                Intrinsics.checkNotNullExpressionValue(obj, "");
                AFLogger.afWarnLog(obj);
            }
            map.put("currency", string2);
        }
        String string3 = getMonetizationNetwork().getString(AppsFlyerProperties.IS_UPDATE);
        if (string3 != null) {
            int i6 = registerClient + 93;
            unregisterClient = i6 % 128;
            int i7 = i6 % 2;
            map.put("isUpdate", string3);
        }
        String string4 = getMonetizationNetwork().getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string4 != null) {
            map.put("customData", string4);
            int i8 = unregisterClient + 21;
            registerClient = i8 % 128;
            int i9 = i8 % 2;
        }
        String string5 = getMonetizationNetwork().getString(AppsFlyerProperties.APP_USER_ID);
        if (string5 != null) {
            int i10 = registerClient + 99;
            unregisterClient = i10 % 128;
            if (i10 % 2 == 0) {
                map.put("appUserId", string5);
                int i11 = 30 / 0;
            } else {
                map.put("appUserId", string5);
            }
        }
        String string6 = getMonetizationNetwork().getString(AppsFlyerProperties.USER_EMAILS);
        if (string6 != null) {
            map.put("user_emails", string6);
        } else {
            int i12 = registerClient + 53;
            unregisterClient = i12 % 128;
            int i13 = i12 % 2;
        }
        AFc1aSDK aFc1aSDK = this.copydefault.getMonetizationNetwork;
        if (aFc1aSDK != null) {
            int i14 = unregisterClient + 63;
            registerClient = i14 % 128;
            int i15 = i14 % 2;
            String[] strArr = aFc1aSDK.getCurrencyIso4217Code;
            if (strArr != null) {
                map.put("sharing_filter", strArr);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        if (r4.length() == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        r8.getMediationNetwork("gaidError", r2.getRevenue);
        r4 = com.appsflyer.internal.AFg1jSDK.unregisterClient + 63;
        com.appsflyer.internal.AFg1jSDK.registerClient = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        if (r4.length() == 0) goto L19;
     */
    @Override // com.appsflyer.internal.AFg1iSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getMonetizationNetwork(AFa1mSDK aFa1mSDK) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFa1mSDK, "");
        if (this.areAllFieldsValid.component1()) {
            AFh1pSDK aFh1pSDK = this.areAllFieldsValid.AFAdRevenueData.areAllFieldsValid;
            if (aFh1pSDK == null) {
                return;
            }
            String str = aFh1pSDK.getRevenue;
            if (str != null) {
                int i2 = registerClient + 47;
                unregisterClient = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 47 / 0;
                }
            }
            if (aFh1pSDK.getMediationNetwork != null && aFh1pSDK.getMonetizationNetwork != null) {
                aFa1mSDK.getMediationNetwork("advertiserId", aFh1pSDK.getMediationNetwork);
                aFa1mSDK.getMediationNetwork("advertiserIdEnabled", String.valueOf(aFh1pSDK.getMonetizationNetwork));
                aFa1mSDK.getMediationNetwork("isGaidWithGps", String.valueOf(aFh1pSDK.AFAdRevenueData));
            }
        } else {
            Map<String, Object> revenue = AFb1rSDK.getRevenue(aFa1mSDK.getMonetizationNetwork());
            Intrinsics.checkNotNullExpressionValue(revenue, "");
            revenue.put("ad_ids_disabled", Boolean.TRUE);
        }
        AFh1pSDK aFh1pSDK2 = this.areAllFieldsValid.AFAdRevenueData.areAllFieldsValid;
        aFa1mSDK.getMediationNetwork("GAID_retry", String.valueOf(aFh1pSDK2 != null ? Intrinsics.areEqual(aFh1pSDK2.areAllFieldsValid, Boolean.TRUE) : false));
        if (CollectionsKt.listOf((Object[]) new AFf1wSDK[]{AFf1wSDK.CONVERSION, AFf1wSDK.LAUNCH}).contains(aFa1mSDK.AFAdRevenueData())) {
            int i4 = registerClient + 87;
            unregisterClient = i4 % 128;
            int i5 = i4 % 2;
            AFe1mSDK aFe1mSDK = this.copydefault.component4;
            if (aFe1mSDK != null) {
                int i6 = registerClient + 9;
                unregisterClient = i6 % 128;
                if (i6 % 2 == 0) {
                    Map<String, Object> revenue2 = AFb1rSDK.getRevenue(aFa1mSDK.getMonetizationNetwork());
                    Intrinsics.checkNotNullExpressionValue(revenue2, "");
                    revenue2.put("fetchAdIdLatency", Long.valueOf(aFe1mSDK.getCurrencyIso4217Code));
                    int i7 = 52 / 0;
                } else {
                    Map<String, Object> revenue3 = AFb1rSDK.getRevenue(aFa1mSDK.getMonetizationNetwork());
                    Intrinsics.checkNotNullExpressionValue(revenue3, "");
                    revenue3.put("fetchAdIdLatency", Long.valueOf(aFe1mSDK.getCurrencyIso4217Code));
                }
                int i8 = registerClient + 23;
                unregisterClient = i8 % 128;
                int i9 = i8 % 2;
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1iSDK
    public final Long getCurrencyIso4217Code() {
        int i = 2 % 2;
        Context context = this.hashCode.getCurrencyIso4217Code;
        if (context != null) {
            int i2 = unregisterClient + 3;
            registerClient = i2 % 128;
            int i3 = i2 % 2;
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                int i4 = unregisterClient + 33;
                registerClient = i4 % 128;
                int i5 = i4 % 2;
                String packageName = context.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "");
                PackageInfo packageInfo = (PackageInfo) getMonetizationNetwork(new Object[]{packageManager, packageName}, -1027178174, 1027178183, (int) System.currentTimeMillis());
                if (packageInfo != null) {
                    int i6 = registerClient + 7;
                    unregisterClient = i6 % 128;
                    if (i6 % 2 != 0) {
                        return Long.valueOf(packageInfo.firstInstallTime);
                    }
                    Long.valueOf(packageInfo.firstInstallTime);
                    throw null;
                }
            }
        }
        return null;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFg1jSDK aFg1jSDK = (AFg1jSDK) objArr[0];
        int i = 2 % 2;
        int i2 = unregisterClient + 5;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            AFb1qSDK.e_(aFg1jSDK.getMonetizationNetwork.getApplicationContext().getPackageManager(), aFg1jSDK.getMonetizationNetwork.getApplicationContext().getPackageName());
            throw null;
        }
        String e_ = AFb1qSDK.e_(aFg1jSDK.getMonetizationNetwork.getApplicationContext().getPackageManager(), aFg1jSDK.getMonetizationNetwork.getApplicationContext().getPackageName());
        int i3 = registerClient + 83;
        unregisterClient = i3 % 128;
        if (i3 % 2 != 0) {
            return e_;
        }
        throw null;
    }

    private static long component3() {
        int i = 2 % 2;
        int i2 = registerClient + 19;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        int i4 = unregisterClient + 93;
        registerClient = i4 % 128;
        int i5 = i4 % 2;
        return currentTimeMillis;
    }

    @Override // com.appsflyer.internal.AFg1iSDK
    public final long getRevenue() {
        int i = 2 % 2;
        int i2 = unregisterClient + 95;
        registerClient = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            System.currentTimeMillis();
            throw null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i3 = unregisterClient + 41;
        registerClient = i3 % 128;
        if (i3 % 2 == 0) {
            return currentTimeMillis;
        }
        obj.hashCode();
        throw null;
    }

    private static String component2() {
        int i = 2 % 2;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double pow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / pow)) + "/" + ((long) (blockCountLong / pow));
        int i2 = registerClient + 75;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFg1jSDK aFg1jSDK = (AFg1jSDK) objArr[0];
        Map map = (Map) objArr[1];
        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = registerClient + 31;
        unregisterClient = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("platformextension", aFg1jSDK.getCurrencyIso4217Code);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("platformextension", aFg1jSDK.getCurrencyIso4217Code);
        if (booleanValue) {
            map.put("platform_extension_v2", aFg1jSDK.getRevenue.getRevenue());
        }
        int i3 = registerClient + 93;
        unregisterClient = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        AFi1pSDK aFi1pSDK;
        AFg1jSDK aFg1jSDK = (AFg1jSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i = 2 % 2;
        int i2 = unregisterClient + 67;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFi1rSDK aFi1rSDK = aFg1jSDK.component1.getMonetizationNetwork;
        Object obj = null;
        if (aFi1rSDK != null) {
            int i4 = registerClient + 99;
            unregisterClient = i4 % 128;
            int i5 = i4 % 2;
            aFi1pSDK = aFi1rSDK.getMediationNetwork();
        } else {
            aFi1pSDK = null;
        }
        if (aFi1pSDK == null) {
            int i6 = registerClient + 89;
            unregisterClient = i6 % 128;
            if (i6 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        map.put("network", aFi1pSDK.getMonetizationNetwork);
        map.put("ivc", Boolean.valueOf(aFi1pSDK.getMonetizationNetwork()));
        if (!aFg1jSDK.getMonetizationNetwork().getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
            String str = aFi1pSDK.AFAdRevenueData;
            if (str != null) {
                map.put("operator", str);
            }
            String str2 = aFi1pSDK.getMediationNetwork;
            if (str2 != null) {
                map.put(Constants.AMP_TRACKING_OPTION_CARRIER, str2);
                return null;
            }
        }
        int i7 = registerClient + 25;
        unregisterClient = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        if (copydefault() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (copydefault() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
    
        r8 = com.appsflyer.internal.AFg1jSDK.unregisterClient + 61;
        com.appsflyer.internal.AFg1jSDK.registerClient = r8 % 128;
        r8 = r8 % 2;
        r2 = true;
     */
    @Override // com.appsflyer.internal.AFg1iSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getRevenue(Map<String, Object> map, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = registerClient + 117;
        unregisterClient = i4 % 128;
        boolean z = false;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("counter", String.valueOf(i));
            map.put("iaecounter", String.valueOf(i2));
            int i5 = 74 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("counter", String.valueOf(i));
            map.put("iaecounter", String.valueOf(i2));
        }
        map.put("isFirstCall", String.valueOf(z));
    }

    @Override // com.appsflyer.internal.AFg1iSDK
    public final void getMediationNetwork(Map<String, Object> map) {
        Object m13470constructorimpl;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String str = this.copydefault.getCurrencyIso4217Code;
        Object obj = null;
        if (str != null) {
            int i2 = unregisterClient + 109;
            registerClient = i2 % 128;
            if (i2 % 2 != 0) {
                map.get("af_deeplink");
                throw null;
            }
            if (map.get("af_deeplink") != null) {
                int i3 = unregisterClient + 119;
                registerClient = i3 % 128;
                if (i3 % 2 != 0) {
                    AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                    obj.hashCode();
                    throw null;
                }
                AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                int i4 = unregisterClient + 27;
                registerClient = i4 % 128;
                int i5 = i4 % 2;
            } else {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    AFg1jSDK aFg1jSDK = this;
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("isPush", "true");
                    map.put("af_deeplink", jSONObject.toString());
                    m13470constructorimpl = Result.m13470constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                }
                Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                if (m13473exceptionOrNullimpl != null) {
                    int i6 = registerClient + 119;
                    unregisterClient = i6 % 128;
                    int i7 = i6 % 2;
                    AFh1wSDK.e$default(AFLogger.INSTANCE, AFh1xSDK.GENERAL, "Exception while trying to create JSONObject from pushPayload", m13473exceptionOrNullimpl, false, false, false, false, 120, null);
                }
                Result.m13469boximpl(m13470constructorimpl);
            }
        }
        this.copydefault.getCurrencyIso4217Code = null;
    }

    @Override // com.appsflyer.internal.AFg1iSDK
    public final void getCurrencyIso4217Code(AFa1mSDK aFa1mSDK) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFa1mSDK, "");
        Map<String, Object> monetizationNetwork = aFa1mSDK.getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        monetizationNetwork.put("open_referrer", aFa1mSDK.getMonetizationNetwork);
        String str = aFa1mSDK.component2;
        if (str != null) {
            int i2 = registerClient + 37;
            unregisterClient = i2 % 128;
            int i3 = i2 % 2;
            if (StringsKt.isBlank(str)) {
                return;
            }
            int i4 = registerClient + 73;
            unregisterClient = i4 % 128;
            int i5 = i4 % 2;
            monetizationNetwork.put("af_web_referrer", aFa1mSDK.component2);
        }
    }

    private final void component3(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = registerClient + 87;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        AFd1ySDK.AFa1uSDK revenue = this.getMediationNetwork.getRevenue(this.getMonetizationNetwork);
        float f = revenue.getMediationNetwork;
        String str = revenue.getCurrencyIso4217Code;
        map.put("btl", String.valueOf(f));
        if (str != null) {
            int i4 = registerClient + 23;
            unregisterClient = i4 % 128;
            int i5 = i4 % 2;
            map.put("btch", str);
            int i6 = registerClient + 53;
            unregisterClient = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = registerClient + 75;
        unregisterClient = i8 % 128;
        int i9 = i8 % 2;
    }

    private void component4(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = registerClient + 101;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String string = getMonetizationNetwork().getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = getMonetizationNetwork().getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string != null) {
            map.put("onelink_id", string);
            int i4 = registerClient + 31;
            unregisterClient = i4 % 128;
            int i5 = i4 % 2;
        }
        if (string2 != null) {
            int i6 = unregisterClient + 41;
            registerClient = i6 % 128;
            if (i6 % 2 == 0) {
                map.put("onelink_ver", string2);
            } else {
                map.put("onelink_ver", string2);
                throw null;
            }
        }
    }

    private void component1(Map<String, ? extends Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFh1sSDK aFh1sSDK = this.component4;
        HashMap hashMap = new HashMap(aFh1sSDK.getRevenue);
        aFh1sSDK.getRevenue.clear();
        this.component4.getMonetizationNetwork.getMediationNetwork("gcd");
        Intrinsics.checkNotNullExpressionValue(hashMap, "");
        if (hashMap.isEmpty()) {
            return;
        }
        int i2 = unregisterClient + 1;
        int i3 = i2 % 128;
        registerClient = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 99;
        unregisterClient = i5 % 128;
        if (i5 % 2 != 0) {
            Map<String, Object> revenue = AFb1rSDK.getRevenue(map);
            Intrinsics.checkNotNullExpressionValue(revenue, "");
            revenue.put("gcd", hashMap);
        } else {
            Map<String, Object> revenue2 = AFb1rSDK.getRevenue(map);
            Intrinsics.checkNotNullExpressionValue(revenue2, "");
            revenue2.put("gcd", hashMap);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
    
        r9.component3.getMonetizationNetwork("prev_event_name", r11);
        r9.component3.AFAdRevenueData("prev_event_timestamp", java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
    
        r10 = com.appsflyer.internal.AFg1jSDK.unregisterClient + 85;
        com.appsflyer.internal.AFg1jSDK.registerClient = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        if ((r10 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        r5 = new org.json.JSONObject();
        r5.put("prev_event_timestamp", r9.component3.getRevenue("prev_event_timestamp", -1L));
        r5.put("prev_event_name", r1);
        r10.put("prev_event", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0038, code lost:
    
        if (r1 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r1 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getRevenue(Map<String, Object> map, String str) {
        String AFAdRevenueData;
        int i = 2 % 2;
        int i2 = registerClient + 121;
        unregisterClient = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(str, "");
                AFAdRevenueData = this.component3.AFAdRevenueData("prev_event_name", (String) null);
                int i3 = 88 / 0;
            } else {
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(str, "");
                AFAdRevenueData = this.component3.AFAdRevenueData("prev_event_name", (String) null);
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("Error while processing previous event.", e);
        }
    }

    private static /* synthetic */ Object hashCode(Object[] objArr) {
        AFg1jSDK aFg1jSDK = (AFg1jSDK) objArr[0];
        int i = 2 % 2;
        String str = null;
        if (aFg1jSDK.component3.getMonetizationNetwork("INSTALL_STORE")) {
            int i2 = unregisterClient + 101;
            registerClient = i2 % 128;
            int i3 = i2 % 2;
            return aFg1jSDK.component3.AFAdRevenueData("INSTALL_STORE", (String) null);
        }
        if (aFg1jSDK.areAllFieldsValid()) {
            int i4 = unregisterClient + 115;
            registerClient = i4 % 128;
            if (i4 % 2 != 0) {
                aFg1jSDK.component1();
                throw null;
            }
            str = aFg1jSDK.component1();
        } else {
            int i5 = unregisterClient + 37;
            registerClient = i5 % 128;
            int i6 = i5 % 2;
        }
        aFg1jSDK.component3.getMonetizationNetwork("INSTALL_STORE", str);
        int i7 = unregisterClient + 83;
        registerClient = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    private String component1() {
        int i = 2 % 2;
        String string = getMonetizationNetwork().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string == null) {
            int i2 = registerClient + 77;
            unregisterClient = i2 % 128;
            if (i2 % 2 == 0) {
                string = getMonetizationNetwork("AF_STORE");
                int i3 = 44 / 0;
            } else {
                string = getMonetizationNetwork("AF_STORE");
            }
            int i4 = registerClient + 53;
            unregisterClient = i4 % 128;
            int i5 = i4 % 2;
        }
        return string;
    }

    private String getMonetizationNetwork(SimpleDateFormat simpleDateFormat) {
        int i = 2 % 2;
        int i2 = unregisterClient + 101;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        String AFAdRevenueData = this.component3.AFAdRevenueData("appsFlyerFirstInstall", (String) null);
        if (AFAdRevenueData == null) {
            if (areAllFieldsValid()) {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                AFAdRevenueData = simpleDateFormat.format(new Date());
            } else {
                AFAdRevenueData = "";
            }
            this.component3.getMonetizationNetwork("appsFlyerFirstInstall", AFAdRevenueData);
            int i4 = unregisterClient + 125;
            registerClient = i4 % 128;
            int i5 = i4 % 2;
        }
        AFh1wSDK.i$default(AFLogger.INSTANCE, AFh1xSDK.GENERAL, "AppsFlyer: first launch date: " + AFAdRevenueData, false, 4, null);
        Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
        return AFAdRevenueData;
    }

    private boolean areAllFieldsValid() {
        int i = 2 % 2;
        if (!this.component3.getMonetizationNetwork("appsFlyerCount")) {
            int i2 = registerClient + 91;
            unregisterClient = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = registerClient + 15;
        unregisterClient = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFg1jSDK aFg1jSDK = (AFg1jSDK) objArr[0];
        int i = 2 % 2;
        int i2 = unregisterClient + 125;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        boolean parseBoolean = Boolean.parseBoolean(aFg1jSDK.component3.AFAdRevenueData("sentSuccessfully", (String) null));
        int i4 = unregisterClient + 115;
        registerClient = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(parseBoolean);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        r3 = com.appsflyer.internal.AFg1jSDK.registerClient + 3;
        com.appsflyer.internal.AFg1jSDK.unregisterClient = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        r1 = com.appsflyer.internal.AFg1jSDK.registerClient + 101;
        com.appsflyer.internal.AFg1jSDK.unregisterClient = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if ((r1 % 2) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        r1 = getMonetizationNetwork("AF_PRE_INSTALL_NAME");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        getMonetizationNetwork("AF_PRE_INSTALL_NAME");
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if (r1 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String equals() {
        int i = 2 % 2;
        String string = getMonetizationNetwork().getString("preInstallName");
        if (string != null) {
            return string;
        }
        Object obj = null;
        if (this.component3.getMonetizationNetwork("preInstallName")) {
            int i2 = registerClient + 9;
            unregisterClient = i2 % 128;
            if (i2 % 2 == 0) {
                this.component3.AFAdRevenueData("preInstallName", (String) null);
                obj.hashCode();
                throw null;
            }
            string = this.component3.AFAdRevenueData("preInstallName", (String) null);
        } else {
            if (areAllFieldsValid()) {
                int i3 = unregisterClient + 81;
                registerClient = i3 % 128;
                if (i3 % 2 != 0) {
                    string = values();
                    int i4 = 49 / 0;
                } else {
                    string = values();
                }
            }
            if (string != null) {
                this.component3.getMonetizationNetwork("preInstallName", string);
            }
        }
        if (string != null) {
            getMonetizationNetwork().set("preInstallName", string);
            int i5 = unregisterClient + 115;
            registerClient = i5 % 128;
            int i6 = i5 % 2;
        }
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0058, code lost:
    
        r7 = getRevenue(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        if (r7 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        r5.component3.getMonetizationNetwork("androidIdCached", r7);
        r6.put("android_id", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
    
        r7 = com.appsflyer.internal.AFb1uSDK.getCurrencyIso4217Code(r5.getMonetizationNetwork);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0076, code lost:
    
        if (r7 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0078, code lost:
    
        r1 = new java.util.LinkedHashMap();
        r2 = r7.AFAdRevenueData;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "");
        r1.put("isManual", r2);
        r2 = r7.getMediationNetwork;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "");
        r1.put("val", r2);
        r7 = r7.getMonetizationNetwork;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0096, code lost:
    
        if (r7 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0098, code lost:
    
        r2 = com.appsflyer.internal.AFg1jSDK.unregisterClient + 119;
        com.appsflyer.internal.AFg1jSDK.registerClient = r2 % 128;
        r2 = r2 % 2;
        r1.put("isLat", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
    
        r6.put("oaid", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ab, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("Android ID was not collected.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        r6.put(com.appsflyer.AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
    
        if (getMonetizationNetwork().getBoolean(com.appsflyer.AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (getMonetizationNetwork().getBoolean(com.appsflyer.AppsFlyerProperties.DEVICE_TRACKING_DISABLED, true) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0036, code lost:
    
        r1 = r5.equals.getMediationNetwork(r5.component3);
        r2 = (java.lang.CharSequence) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0041, code lost:
    
        if (r2 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
    
        if (r2.length() != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
    
        r2 = com.appsflyer.internal.AFg1jSDK.registerClient + 87;
        com.appsflyer.internal.AFg1jSDK.unregisterClient = r2 % 128;
        r2 = r2 % 2;
        r6.put("imei", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getCurrencyIso4217Code(Map<String, Object> map, String str) {
        int i = 2 % 2;
        int i2 = unregisterClient + 97;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
        } else {
            Intrinsics.checkNotNullParameter(map, "");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r1.length() == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String getRevenue(String str) {
        int i = 2 % 2;
        if (getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false)) {
            String str2 = str;
            if (str2 != null) {
                int i2 = registerClient + 91;
                unregisterClient = i2 % 128;
                int i3 = i2 % 2;
            }
            int i4 = unregisterClient + 21;
            registerClient = i4 % 128;
            if (i4 % 2 == 0) {
                if (valueOf()) {
                    return copy();
                }
                return null;
            }
            valueOf();
            throw null;
        }
        if (str != null) {
            return str;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v8 */
    private final String copy() {
        int i = 2 % 2;
        int i2 = registerClient + 85;
        unregisterClient = i2 % 128;
        String str = i2 % 2;
        try {
            if (str == 0) {
                String AFAdRevenueData = this.component3.AFAdRevenueData("androidIdCached", (String) null);
                String string = Settings.Secure.getString(this.getMonetizationNetwork.getContentResolver(), "android_id");
                int i3 = 1 / 0;
                str = AFAdRevenueData;
                if (string != null) {
                    return string;
                }
            } else {
                String AFAdRevenueData2 = this.component3.AFAdRevenueData("androidIdCached", (String) null);
                String string2 = Settings.Secure.getString(this.getMonetizationNetwork.getContentResolver(), "android_id");
                str = AFAdRevenueData2;
                if (string2 != null) {
                    return string2;
                }
            }
        } catch (Exception e) {
            AFLogger.afErrorLog(e.getMessage(), e);
        }
        if (str == 0) {
            return null;
        }
        int i4 = unregisterClient + 67;
        registerClient = i4 % 128;
        int i5 = i4 % 2;
        AFLogger.afDebugLog("use cached AndroidId: " + str);
        return str;
    }

    private static void areAllFieldsValid(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = registerClient + 15;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a("\ueac2읤榾ﰕ筌짏", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4, objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        int i4 = unregisterClient + 35;
        registerClient = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFg1jSDK aFg1jSDK = (AFg1jSDK) objArr[0];
        AFa1mSDK aFa1mSDK = (AFa1mSDK) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        AFc1cSDK aFc1cSDK = (AFc1cSDK) objArr[4];
        int i = 2 % 2;
        int i2 = unregisterClient + 25;
        registerClient = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFa1mSDK, "");
            aFa1mSDK.getMonetizationNetwork();
            aFa1mSDK.AFAdRevenueData();
            AFf1wSDK aFf1wSDK = AFf1wSDK.CONVERSION;
            throw null;
        }
        Intrinsics.checkNotNullParameter(aFa1mSDK, "");
        Map<String, Object> monetizationNetwork = aFa1mSDK.getMonetizationNetwork();
        if (aFa1mSDK.AFAdRevenueData() == AFf1wSDK.CONVERSION) {
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            aFg1jSDK.component2(monetizationNetwork);
            aFg1jSDK.copy(monetizationNetwork);
            aFg1jSDK.copydefault(monetizationNetwork);
            AFc1vSDK.getMediationNetwork(aFg1jSDK.hashCode, aFg1jSDK.component3);
        }
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        aFg1jSDK.equals(monetizationNetwork);
        aFg1jSDK.component4(monetizationNetwork);
        aFg1jSDK.component1((Map<String, ? extends Object>) monetizationNetwork);
        AFAdRevenueData(monetizationNetwork, str2);
        aFg1jSDK.getMonetizationNetwork(monetizationNetwork, str);
        aFg1jSDK.hashCode(monetizationNetwork);
        if (aFc1cSDK == null) {
            return null;
        }
        aFc1cSDK.getRevenue(monetizationNetwork);
        int i3 = unregisterClient + 105;
        registerClient = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void component2(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = registerClient + 49;
        unregisterClient = i2 % 128;
        if (i2 % 2 == 0) {
            getMonetizationNetwork().isOtherSdkStringDisabled();
            throw null;
        }
        if (!getMonetizationNetwork().isOtherSdkStringDisabled()) {
            map.put("batteryLevel", String.valueOf(this.getMediationNetwork.getRevenue(this.getMonetizationNetwork).getMediationNetwork));
        }
        int i3 = unregisterClient + 43;
        registerClient = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void copy(Map<String, Object> map) {
        UiModeManager uiModeManager;
        int i = 2 % 2;
        int i2 = unregisterClient + 89;
        registerClient = i2 % 128;
        if (i2 % 2 == 0 || Build.VERSION.SDK_INT >= 27) {
            int i3 = registerClient + 113;
            unregisterClient = i3 % 128;
            int i4 = i3 % 2;
            uiModeManager = (UiModeManager) this.getMonetizationNetwork.getSystemService(UiModeManager.class);
        } else {
            Object systemService = this.getMonetizationNetwork.getSystemService("uimode");
            if (systemService instanceof UiModeManager) {
                uiModeManager = (UiModeManager) systemService;
                int i5 = unregisterClient + 9;
                registerClient = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 3 / 2;
                }
            } else {
                uiModeManager = null;
            }
        }
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            return;
        }
        int i7 = unregisterClient + 21;
        registerClient = i7 % 128;
        if (i7 % 2 == 0) {
            map.put("tv", Boolean.TRUE);
        } else {
            map.put("tv", Boolean.TRUE);
            throw null;
        }
    }

    private void toString(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = registerClient + 107;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("is_pc", Boolean.valueOf(this.getMonetizationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        int i4 = unregisterClient + 13;
        registerClient = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void copydefault(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = registerClient + 109;
        unregisterClient = i2 % 128;
        if (i2 % 2 == 0) {
            AFg1cSDK.getRevenue(this.getMonetizationNetwork);
            throw null;
        }
        if (AFg1cSDK.getRevenue(this.getMonetizationNetwork)) {
            map.put("inst_app", Boolean.TRUE);
        }
        int i3 = registerClient + 113;
        unregisterClient = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r1 > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r1 > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004b, code lost:
    
        r1 = com.appsflyer.internal.AFg1jSDK.registerClient + 97;
        com.appsflyer.internal.AFg1jSDK.unregisterClient = r1 % 128;
        r1 = r1 % 2;
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r6 - r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void equals(Map<String, Object> map) {
        long revenue;
        long currentTimeMillis;
        long seconds;
        int i = 2 % 2;
        int i2 = unregisterClient + 19;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            revenue = this.component3.getRevenue("AppsFlyerTimePassedSincePrevLaunch", 1L);
            currentTimeMillis = System.currentTimeMillis();
            this.component3.AFAdRevenueData("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            revenue = this.component3.getRevenue("AppsFlyerTimePassedSincePrevLaunch", 0L);
            currentTimeMillis = System.currentTimeMillis();
            this.component3.AFAdRevenueData("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        }
        map.put("timepassedsincelastlaunch", String.valueOf(seconds));
    }

    private static void AFAdRevenueData(Map<String, Object> map, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (str != null) {
            int i2 = registerClient + 53;
            unregisterClient = i2 % 128;
            int i3 = i2 % 2;
            map.put("phone", str);
            int i4 = registerClient + 63;
            unregisterClient = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = unregisterClient + 49;
        registerClient = i6 % 128;
        int i7 = i6 % 2;
    }

    private void getMonetizationNetwork(Map<String, Object> map, String str) {
        int i = 2 % 2;
        int i2 = unregisterClient + 121;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String str2 = str;
        if (str2 != null && str2.length() != 0) {
            int i4 = unregisterClient + 19;
            registerClient = i4 % 128;
            int i5 = i4 % 2;
            map.put("referrer", str);
        }
        String AFAdRevenueData = this.component3.AFAdRevenueData("extraReferrers", (String) null);
        if (AFAdRevenueData != null) {
            int i6 = unregisterClient + 117;
            registerClient = i6 % 128;
            int i7 = i6 % 2;
            map.put("extraReferrers", AFAdRevenueData);
            int i8 = unregisterClient + 115;
            registerClient = i8 % 128;
            int i9 = i8 % 2;
        }
        String referrer = getMonetizationNetwork().getReferrer(this.component3);
        String str3 = referrer;
        if (str3 == null || str3.length() == 0 || map.get("referrer") != null) {
            return;
        }
        map.put("referrer", referrer);
    }

    private void hashCode(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        long j = this.component4.hashCode;
        if (j != 0) {
            int i2 = registerClient + 29;
            unregisterClient = i2 % 128;
            int i3 = i2 % 2;
            map.put("prev_session_dur", Long.valueOf(j));
            int i4 = unregisterClient + 101;
            registerClient = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static void AFKeystoreWrapper(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFc1vSDK aFc1vSDK = AFc1vSDK.INSTANCE;
        Object currencyIso4217Code = AFc1vSDK.getCurrencyIso4217Code();
        AFc1vSDK aFc1vSDK2 = AFc1vSDK.INSTANCE;
        String mediationNetwork = AFc1vSDK.getMediationNetwork();
        if (currencyIso4217Code != null && mediationNetwork != null && Integer.parseInt(mediationNetwork) > 0) {
            map.put("reinstallCounter", mediationNetwork);
            map.put("originalAppsflyerId", currencyIso4217Code);
            int i2 = registerClient + 53;
            unregisterClient = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = unregisterClient + 89;
        registerClient = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
    }

    private void AFInAppEventType(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = unregisterClient + 103;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(this.toString.getCurrencyIso4217Code());
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.putAll(this.toString.getCurrencyIso4217Code());
        int i3 = registerClient + 9;
        unregisterClient = i3 % 128;
        int i4 = i3 % 2;
    }

    private void values(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = unregisterClient + 79;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String string = getMonetizationNetwork().getString(AppsFlyerProperties.EXTENSION);
        String str = string;
        if (str == null || str.length() == 0) {
            return;
        }
        int i4 = registerClient + 79;
        unregisterClient = i4 % 128;
        int i5 = i4 % 2;
        map.put(AppsFlyerProperties.EXTENSION, string);
        int i6 = unregisterClient + 67;
        registerClient = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r4 != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFInAppEventParameterName(Map<String, Object> map) {
        boolean z;
        int i = 2 % 2;
        int i2 = registerClient + 109;
        unregisterClient = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            getMonetizationNetwork(this.component3, this.areAllFieldsValid.areAllFieldsValid());
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String areAllFieldsValid = this.areAllFieldsValid.areAllFieldsValid();
        String monetizationNetwork = getMonetizationNetwork(this.component3, areAllFieldsValid);
        boolean z2 = false;
        if (monetizationNetwork == null || Intrinsics.areEqual(monetizationNetwork, areAllFieldsValid)) {
            z = false;
        } else {
            int i3 = unregisterClient + 39;
            registerClient = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        }
        if (monetizationNetwork == null && areAllFieldsValid != null) {
            int i5 = registerClient + 51;
            unregisterClient = i5 % 128;
            int i6 = i5 % 2;
            z2 = true;
        }
        if (!z) {
            int i7 = unregisterClient + 37;
            registerClient = i7 % 128;
            int i8 = i7 % 2;
        }
        map.put("af_latestchannel", areAllFieldsValid);
        String str = (String) getMonetizationNetwork(new Object[]{this}, 2135258060, -2135258048, System.identityHashCode(this));
        if (str != null) {
            int i9 = registerClient + 31;
            unregisterClient = i9 % 128;
            int i10 = i9 % 2;
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            Object lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            map.put("af_installstore", lowerCase);
        }
        String equals = equals();
        if (equals != null) {
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            Object lowerCase2 = equals.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            map.put("af_preinstall_name", lowerCase2);
        }
        String component1 = component1();
        if (component1 != null) {
            Locale locale3 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale3, "");
            Object lowerCase3 = component1.toLowerCase(locale3);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            map.put("af_currentstore", lowerCase3);
        }
    }

    private static void getMonetizationNetwork(Map<String, Object> map, boolean z) {
        int i = 2 % 2;
        int i2 = unregisterClient + 121;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("af_preinstalled", String.valueOf(z));
        int i4 = unregisterClient + 41;
        registerClient = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0037 -> B:9:0x003e). Please report as a decompilation issue!!! */
    private static void valueOf(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = registerClient + 93;
        unregisterClient = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(map, "");
                map.put("lang", Locale.getDefault().getDisplayLanguage());
                int i3 = 72 / 0;
            } else {
                Intrinsics.checkNotNullParameter(map, "");
                map.put("lang", Locale.getDefault().getDisplayLanguage());
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
        } catch (Exception e2) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e2);
        }
        try {
            map.put("country", Locale.getDefault().getCountry());
            int i4 = unregisterClient + 59;
            registerClient = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 67 / 0;
            }
        } catch (Exception e3) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e3);
        }
    }

    private void e(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        try {
            String mediationNetwork = AFb1mSDK.getMediationNetwork(this.hashCode, this.component3);
            if (mediationNetwork != null) {
                int i2 = registerClient + 67;
                unregisterClient = i2 % 128;
                int i3 = i2 % 2;
                map.put("uid", mediationNetwork);
                return;
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("ERROR: could not get uid ");
            sb.append(th.getMessage());
            String obj = sb.toString();
            Intrinsics.checkNotNullExpressionValue(obj, "");
            AFLogger.afErrorLog(obj, th);
        }
        int i4 = unregisterClient + 23;
        registerClient = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
    }

    private void registerClient(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = unregisterClient + 107;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        boolean revenue = AFg1lSDK.getRevenue(this.getMonetizationNetwork);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=" + revenue);
        if (!revenue) {
            map.put("tokenRefreshConfigured", Boolean.FALSE);
            int i4 = unregisterClient + 85;
            registerClient = i4 % 128;
            int i5 = i4 % 2;
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1lSDK.getCurrencyIso4217Code(this.component3)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0056, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r4.put("amazon_aid", r1.getMediationNetwork);
        r4.put("amazon_aid_limit", java.lang.String.valueOf(r1.getMonetizationNetwork));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0046, code lost:
    
        r4 = com.appsflyer.internal.AFg1jSDK.registerClient + 41;
        com.appsflyer.internal.AFg1jSDK.unregisterClient = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004f, code lost:
    
        if ((r4 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0051, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0052, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFLogger(Map<String, Object> map) {
        AFb1tSDK b_;
        int i = 2 % 2;
        int i2 = unregisterClient + 77;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            b_ = AFb1uSDK.b_(this.getMonetizationNetwork.getContentResolver());
            int i3 = 98 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            b_ = AFb1uSDK.b_(this.getMonetizationNetwork.getContentResolver());
        }
    }

    private void d(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (this.component3.getMonetizationNetwork("is_stop_tracking_used")) {
            int i2 = registerClient + 59;
            unregisterClient = i2 % 128;
            if (i2 % 2 == 0) {
                map.put("istu", String.valueOf(this.component3.AFAdRevenueData("is_stop_tracking_used")));
                int i3 = 13 / 0;
            } else {
                map.put("istu", String.valueOf(this.component3.AFAdRevenueData("is_stop_tracking_used")));
            }
            int i4 = registerClient + 103;
            unregisterClient = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private void unregisterClient(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = unregisterClient + 103;
        registerClient = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            String str = this.equals.component2;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String str2 = this.equals.component2;
        String str3 = str2;
        if (str3 != null) {
            int i3 = unregisterClient + 95;
            registerClient = i3 % 128;
            if (i3 % 2 != 0) {
                str3.length();
                throw null;
            }
            if (str3.length() != 0) {
                int i4 = registerClient + 123;
                int i5 = i4 % 128;
                unregisterClient = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 23;
                registerClient = i7 % 128;
                if (i7 % 2 == 0) {
                    map.put("appsflyerKey", str2);
                    return;
                } else {
                    map.put("appsflyerKey", str2);
                    throw null;
                }
            }
        }
        int i8 = registerClient + 93;
        unregisterClient = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0069, code lost:
    
        r0 = com.appsflyer.internal.AFg1jSDK.registerClient + 83;
        com.appsflyer.internal.AFg1jSDK.unregisterClient = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0074, code lost:
    
        if ((r0 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0076, code lost:
    
        r4.put("fb", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007a, code lost:
    
        r4.put("fb", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        com.appsflyer.AFLogger.afErrorLogForExcManagerOnly("com.facebook.katana not found", r10, true);
        com.appsflyer.AFLogger.afWarnLog("Exception while collecting facebook's attribution ID. ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        com.appsflyer.AFLogger.afErrorLog("Exception while collecting facebook's attribution ID. ", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (r2.getMonetizationNetwork().getBoolean(com.appsflyer.AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
    
        if (r2.getMonetizationNetwork().getBoolean(com.appsflyer.AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
    
        r2.getMonetizationNetwork.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
        r10 = (java.lang.String) r10.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0067, code lost:
    
        if (r10 != null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFg1jSDK aFg1jSDK = (AFg1jSDK) objArr[0];
        Map map = (Map) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        int i = 2 % 2;
        int i2 = unregisterClient + 103;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(function0, "");
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(function0, "");
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r5 = com.appsflyer.internal.AFg1jSDK.registerClient + 7;
        com.appsflyer.internal.AFg1jSDK.unregisterClient = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if ((r5 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0020, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0032, code lost:
    
        r5.getMonetizationNetwork("CACHED_CHANNEL", r6);
        r5 = com.appsflyer.internal.AFg1jSDK.registerClient + 95;
        com.appsflyer.internal.AFg1jSDK.unregisterClient = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
        if ((r5 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        r3.hashCode();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String getMonetizationNetwork(AFd1pSDK aFd1pSDK, String str) {
        String AFAdRevenueData;
        int i = 2 % 2;
        int i2 = registerClient + 63;
        unregisterClient = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            AFAdRevenueData = aFd1pSDK.AFAdRevenueData("CACHED_CHANNEL", (String) null);
            int i3 = 37 / 0;
        } else {
            AFAdRevenueData = aFd1pSDK.AFAdRevenueData("CACHED_CHANNEL", (String) null);
        }
    }

    private static String getCurrencyIso4217Code(String str) {
        int i = 2 % 2;
        int i2 = registerClient + 69;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.checkNotNull(invoke, "");
            String str2 = (String) invoke;
            int i4 = registerClient + 97;
            unregisterClient = i4 % 128;
            if (i4 % 2 != 0) {
                return str2;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    private final String getMonetizationNetwork(String str) {
        int i = 2 % 2;
        int i2 = registerClient + 15;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        String monetizationNetwork = this.areAllFieldsValid.getMonetizationNetwork(str);
        int i4 = registerClient + 83;
        unregisterClient = i4 % 128;
        if (i4 % 2 != 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    private final String values() {
        int i = 2 % 2;
        int i2 = unregisterClient + 43;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        File AFAdRevenueData = AFAdRevenueData(getCurrencyIso4217Code("ro.appsflyer.preinstall.path"));
        if (getMonetizationNetwork(AFAdRevenueData)) {
            int i4 = registerClient + 51;
            unregisterClient = i4 % 128;
            if (i4 % 2 == 0) {
                AFAdRevenueData = AFAdRevenueData(getMonetizationNetwork("AF_PRE_INSTALL_PATH"));
                int i5 = 93 / 0;
            } else {
                AFAdRevenueData = AFAdRevenueData(getMonetizationNetwork("AF_PRE_INSTALL_PATH"));
            }
        }
        if (getMonetizationNetwork(AFAdRevenueData)) {
            AFAdRevenueData = AFAdRevenueData("/data/local/tmp/pre_install.appsflyer");
        }
        if (getMonetizationNetwork(AFAdRevenueData)) {
            AFAdRevenueData = AFAdRevenueData("/etc/pre_install.appsflyer");
            int i6 = registerClient + 121;
            unregisterClient = i6 % 128;
            int i7 = i6 % 2;
        }
        if (!getMonetizationNetwork(AFAdRevenueData)) {
            String packageName = this.getMonetizationNetwork.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            return (String) getMonetizationNetwork(new Object[]{AFAdRevenueData, packageName}, 1240499772, -1240499768, (int) System.currentTimeMillis());
        }
        int i8 = registerClient + 37;
        unregisterClient = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    private static File AFAdRevenueData(String str) {
        int i = 2 % 2;
        int i2 = unregisterClient + 111;
        registerClient = i2 % 128;
        try {
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            if (StringsKt.trim((CharSequence) str).toString().length() <= 0) {
                int i3 = unregisterClient + 105;
                registerClient = i3 % 128;
                int i4 = i3 % 2;
            } else {
                return new File(StringsKt.trim((CharSequence) str).toString());
            }
        }
        return null;
    }

    private static boolean getMonetizationNetwork(File file) {
        int i = 2 % 2;
        int i2 = unregisterClient + 93;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        if (file != null && file.exists()) {
            return false;
        }
        int i4 = registerClient + 79;
        unregisterClient = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:31|32|(3:34|(1:36)|25)|26|27|25) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        if (r5 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        com.appsflyer.AFLogger.afErrorLog(r8.getMessage(), r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        InputStreamReader inputStreamReader;
        Properties properties;
        File file = (File) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = registerClient + 121;
        unregisterClient = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        try {
            if (file == null) {
                return null;
            }
            try {
                properties = new Properties();
                inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            } catch (FileNotFoundException unused) {
                inputStreamReader = null;
            } catch (Throwable th) {
                th = th;
                inputStreamReader = null;
            }
            try {
                properties.load(inputStreamReader);
                AFLogger.afInfoLog("Found PreInstall property!");
                String property = properties.getProperty(str);
                try {
                    inputStreamReader.close();
                    return property;
                } catch (Throwable th2) {
                    AFLogger.afErrorLog(th2.getMessage(), th2);
                    return property;
                }
            } catch (FileNotFoundException unused2) {
                AFLogger.afDebugLog("PreInstall file wasn't found: " + file.getAbsolutePath());
            } catch (Throwable th3) {
                th = th3;
                AFLogger.afErrorLog(th.getMessage(), th);
                if (inputStreamReader == null) {
                    int i3 = unregisterClient + 5;
                    registerClient = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 4 % 5;
                    }
                    return null;
                }
                inputStreamReader.close();
                return null;
            }
        } catch (Throwable th4) {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th5) {
                    AFLogger.afErrorLog(th5.getMessage(), th5);
                }
            } else {
                int i5 = registerClient + 21;
                unregisterClient = i5 % 128;
                int i6 = i5 % 2;
            }
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (com.appsflyer.internal.AFb1rSDK.AFAdRevenueData(r6.getMonetizationNetwork) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        r1 = com.appsflyer.internal.AFg1jSDK.registerClient + 19;
        com.appsflyer.internal.AFg1jSDK.unregisterClient = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (com.appsflyer.internal.AFb1rSDK.AFAdRevenueData(r6.getMonetizationNetwork) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean valueOf() {
        int i = 2 % 2;
        int i2 = unregisterClient + 19;
        registerClient = i2 % 128;
        if (i2 % 2 == 0 ? !getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) : !getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, true)) {
            int i3 = unregisterClient + 123;
            registerClient = i3 % 128;
            if (i3 % 2 == 0 ? !getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) : !getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, true)) {
                int i4 = unregisterClient;
                int i5 = i4 + 107;
                registerClient = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 7;
                registerClient = i7 % 128;
                if (i7 % 2 != 0) {
                    AFb1rSDK.getRevenue();
                    int i8 = 74 / 0;
                } else {
                    AFb1rSDK.getRevenue();
                }
            }
        }
        int i9 = unregisterClient + 69;
        registerClient = i9 % 128;
        int i10 = i9 % 2;
        return true;
    }

    private static void AFAdRevenueData(Map<String, Object> map, AFa1mSDK aFa1mSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFa1mSDK, "");
        String str = aFa1mSDK.component3;
        if (str != null) {
            map.put("eventName", str);
            map.put("eventValue", new JSONObject(aFa1mSDK.getCurrencyIso4217Code == null ? new HashMap() : aFa1mSDK.getCurrencyIso4217Code).toString());
        }
    }

    private static String getRevenue(File file, String str) {
        return (String) getMonetizationNetwork(new Object[]{file, str}, 1240499772, -1240499768, (int) System.currentTimeMillis());
    }

    private void getMediationNetwork(Map<String, Object> map, Function0<String> function0) {
        getMonetizationNetwork(new Object[]{this, map, function0}, 1991315843, -1991315841, System.identityHashCode(this));
    }

    private void getMediationNetwork(AFa1mSDK aFa1mSDK, String str, String str2, AFc1cSDK aFc1cSDK) {
        getMonetizationNetwork(new Object[]{this, aFa1mSDK, str, str2, aFc1cSDK}, 476184655, -476184644, System.identityHashCode(this));
    }

    private boolean copydefault() {
        return ((Boolean) getMonetizationNetwork(new Object[]{this}, -413936631, 413936631, System.identityHashCode(this))).booleanValue();
    }

    private String component4() {
        return (String) getMonetizationNetwork(new Object[]{this}, 2135258060, -2135258048, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1iSDK
    public final void getMonetizationNetwork(Map<String, Object> map) {
        getMonetizationNetwork(new Object[]{this, map}, 171091670, -171091665, System.identityHashCode(this));
    }

    private void AFAdRevenueData(Map<String, Object> map, boolean z) {
        getMonetizationNetwork(new Object[]{this, map, Boolean.valueOf(z)}, -1299976287, 1299976297, System.identityHashCode(this));
    }

    private void getMediationNetwork(Map<String, Object> map, boolean z) {
        getMonetizationNetwork(new Object[]{this, map, Boolean.valueOf(z)}, 1766708889, -1766708886, System.identityHashCode(this));
    }

    private String AFAdRevenueData() throws CertificateException, NoSuchAlgorithmException, PackageManager.NameNotFoundException {
        return (String) getMonetizationNetwork(new Object[]{this}, 333533232, -333533231, System.identityHashCode(this));
    }

    private static PackageInfo u_(PackageManager packageManager, String str) {
        return (PackageInfo) getMonetizationNetwork(new Object[]{packageManager, str}, -1027178174, 1027178183, (int) System.currentTimeMillis());
    }

    private final void getCurrencyIso4217Code(Map<String, Object> map) {
        getMonetizationNetwork(new Object[]{this, map}, 92189032, -92189024, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1iSDK
    public final void getMediationNetwork(AFa1mSDK aFa1mSDK) {
        getMonetizationNetwork(new Object[]{this, aFa1mSDK}, 1083131520, -1083131513, System.identityHashCode(this));
    }

    private final SimpleDateFormat getMediationNetwork() {
        return (SimpleDateFormat) getMonetizationNetwork(new Object[]{this}, 1239753694, -1239753688, System.identityHashCode(this));
    }
}
