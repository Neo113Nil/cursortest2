package com.appsflyer.internal;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.autofill.HintConstants;
import com.applovin.sdk.AppLovinEventTypes;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFf1aSDK;
import com.ironsource.M6;
import com.ironsource.X3;
import com.safedk.android.utils.j;
import com.vungle.ads.internal.protos.Sdk;
import io.sentry.protocol.DebugImage;
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
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class AFg1uSDK implements AFg1tSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static byte[] AFInAppEventParameterName = {100, -122, -120, 73, -112, 96, 108, -127, Byte.MIN_VALUE, 77, -108, -108, -100, -106, 99, -104, 122, -123, -107, -107};
    private static int AFKeystoreWrapper = 828425900;
    private static int AFLogger = -463888315;
    private static short[] d = null;
    private static int i = 1;
    private static int registerClient = 586908576;
    private static int w;
    private final Context AFAdRevenueData;
    private final Lazy AFInAppEventType;
    private final AFc1sSDK areAllFieldsValid;
    private final AFh1uSDK component1;
    private final AFi1ySDK component2;
    private final AFc1kSDK component3;
    private final AFg1vSDK component4;
    private final AFc1oSDK copy;
    private final AFc1hSDK copydefault;
    private final AFf1iSDK equals;
    private final String getCurrencyIso4217Code;
    private final AFj1rSDK getMediationNetwork;
    private final AFf1aSDK getMonetizationNetwork;
    private final AFi1sSDK getRevenue;
    private final AFg1ySDK hashCode;
    private final Lazy toString;

    /* JADX WARN: Removed duplicated region for block: B:34:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object getRevenue(Object[] objArr, int i2, int i3, int i4) {
        int i5;
        int i6 = (i2 * Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE) + (i3 * (-219));
        int i7 = ~((~i2) | (~i3));
        int i8 = ~i4;
        switch (i6 + ((i7 | (~(i8 | i2 | i3))) * Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE) + (((~(i8 | i3)) | i2) * (-440)) + ((i2 | i3 | i4) * Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE)) {
            case 1:
                return getRevenue(objArr);
            case 2:
                AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
                AFh1tSDK aFh1tSDK = (AFh1tSDK) objArr[1];
                int i9 = 2 % 2;
                Intrinsics.checkNotNullParameter(aFh1tSDK, "");
                if (aFg1uSDK.component3.component3()) {
                    AFh1xSDK aFh1xSDK = aFg1uSDK.component3.getMediationNetwork.component2;
                    if (aFh1xSDK == null) {
                        return null;
                    }
                    String str = aFh1xSDK.getRevenue;
                    if (str != null && str.length() != 0) {
                        int i10 = i + 73;
                        w = i10 % 128;
                        int i11 = i10 % 2;
                        aFh1tSDK.getMonetizationNetwork("gaidError", aFh1xSDK.getRevenue);
                    }
                    if (aFh1xSDK.getMonetizationNetwork != null) {
                        int i12 = w + 45;
                        i = i12 % 128;
                        int i13 = i12 % 2;
                        if (aFh1xSDK.getMediationNetwork != null) {
                            aFh1tSDK.getMonetizationNetwork("advertiserId", aFh1xSDK.getMonetizationNetwork);
                            aFh1tSDK.getMonetizationNetwork("advertiserIdEnabled", String.valueOf(aFh1xSDK.getMediationNetwork));
                            aFh1tSDK.getMonetizationNetwork("isGaidWithGps", String.valueOf(aFh1xSDK.AFAdRevenueData));
                            i5 = w + 99;
                            i = i5 % 128;
                        }
                    }
                    AFh1xSDK aFh1xSDK2 = aFg1uSDK.component3.getMediationNetwork.component2;
                    aFh1tSDK.getMonetizationNetwork("GAID_retry", String.valueOf(aFh1xSDK2 == null ? Intrinsics.areEqual(aFh1xSDK2.component4, Boolean.TRUE) : false));
                    if (CollectionsKt.listOf((Object[]) new AFe1uSDK[]{AFe1uSDK.CONVERSION, AFe1uSDK.LAUNCH}).contains(aFh1tSDK.getMediationNetwork())) {
                        int i14 = i + 19;
                        w = i14 % 128;
                        int i15 = i14 % 2;
                        AFd1gSDK aFd1gSDK = aFg1uSDK.copy.component1;
                        if (aFd1gSDK != null) {
                            int i16 = i + 87;
                            w = i16 % 128;
                            int i17 = i16 % 2;
                            Map<String, Object> AFAdRevenueData = AFa1zSDK.AFAdRevenueData(aFh1tSDK.getMonetizationNetwork);
                            Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
                            AFAdRevenueData.put("fetchAdIdLatency", Long.valueOf(aFd1gSDK.getMonetizationNetwork));
                        }
                    }
                    return null;
                }
                Map<String, Object> AFAdRevenueData2 = AFa1zSDK.AFAdRevenueData(aFh1tSDK.getMonetizationNetwork);
                Intrinsics.checkNotNullExpressionValue(AFAdRevenueData2, "");
                AFAdRevenueData2.put("ad_ids_disabled", Boolean.TRUE);
                i5 = i + 53;
                w = i5 % 128;
                int i18 = i5 % 2;
                AFh1xSDK aFh1xSDK22 = aFg1uSDK.component3.getMediationNetwork.component2;
                aFh1tSDK.getMonetizationNetwork("GAID_retry", String.valueOf(aFh1xSDK22 == null ? Intrinsics.areEqual(aFh1xSDK22.component4, Boolean.TRUE) : false));
                if (CollectionsKt.listOf((Object[]) new AFe1uSDK[]{AFe1uSDK.CONVERSION, AFe1uSDK.LAUNCH}).contains(aFh1tSDK.getMediationNetwork())) {
                }
                return null;
            case 3:
                return getMonetizationNetwork(objArr);
            case 4:
                AFg1uSDK aFg1uSDK2 = (AFg1uSDK) objArr[0];
                Map map = (Map) objArr[1];
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                int i19 = 2 % 2;
                int i20 = w + 113;
                i = i20 % 128;
                int i21 = i20 % 2;
                Intrinsics.checkNotNullParameter(map, "");
                map.put("platformextension", aFg1uSDK2.getCurrencyIso4217Code);
                if (booleanValue) {
                    int i22 = w + 95;
                    i = i22 % 128;
                    int i23 = i22 % 2;
                    map.put("platform_extension_v2", aFg1uSDK2.getRevenue.getRevenue());
                    int i24 = w + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                    i = i24 % 128;
                    int i25 = i24 % 2;
                }
                return null;
            case 5:
                return getMediationNetwork(objArr);
            case 6:
                AFg1uSDK aFg1uSDK3 = (AFg1uSDK) objArr[0];
                AFh1tSDK aFh1tSDK2 = (AFh1tSDK) objArr[1];
                int i26 = 2 % 2;
                int i27 = w + 25;
                i = i27 % 128;
                int i28 = i27 % 2;
                Intrinsics.checkNotNullParameter(aFh1tSDK2, "");
                Map<String, Object> map2 = aFh1tSDK2.getMonetizationNetwork;
                Intrinsics.checkNotNullExpressionValue(map2, "");
                aFg1uSDK3.getCurrencyIso4217Code(map2, aFh1tSDK2.AFAdRevenueData());
                getRevenue(new Object[]{map2}, -260988684, 260988687, (int) System.currentTimeMillis());
                unregisterClient(map2);
                aFg1uSDK3.getRevenue(map2);
                aFg1uSDK3.getMediationNetwork(map2, aFg1uSDK3.copy.getCurrencyIso4217Code);
                aFg1uSDK3.e(map2);
                map2.put("cell", MapsKt.mapOf(TuplesKt.to("mcc", Integer.valueOf(aFg1uSDK3.AFAdRevenueData.getResources().getConfiguration().mcc)), TuplesKt.to("mnc", Integer.valueOf(aFg1uSDK3.AFAdRevenueData.getResources().getConfiguration().mnc))));
                map2.put("sig", aFg1uSDK3.component4());
                map2.put("last_boot_time", Long.valueOf(component3()));
                map2.put("disk", component2());
                int i29 = i + 77;
                w = i29 % 128;
                int i30 = i29 % 2;
                return null;
            case 7:
                return AFAdRevenueData(objArr);
            case 8:
                return component4(objArr);
            case 9:
                return areAllFieldsValid(objArr);
            case 10:
                return component2(objArr);
            case 11:
                return component3(objArr);
            case 12:
                return component1(objArr);
            default:
                return getCurrencyIso4217Code(objArr);
        }
    }

    public AFg1uSDK(String str, Context context, AFi1sSDK aFi1sSDK, AFf1aSDK aFf1aSDK, AFj1rSDK aFj1rSDK, AFg1vSDK aFg1vSDK, AFh1uSDK aFh1uSDK, AFc1sSDK aFc1sSDK, AFc1kSDK aFc1kSDK, AFi1ySDK aFi1ySDK, AFf1iSDK aFf1iSDK, AFc1hSDK aFc1hSDK, AFg1ySDK aFg1ySDK, AFc1oSDK aFc1oSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1sSDK, "");
        Intrinsics.checkNotNullParameter(aFf1aSDK, "");
        Intrinsics.checkNotNullParameter(aFj1rSDK, "");
        Intrinsics.checkNotNullParameter(aFg1vSDK, "");
        Intrinsics.checkNotNullParameter(aFh1uSDK, "");
        Intrinsics.checkNotNullParameter(aFc1sSDK, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFi1ySDK, "");
        Intrinsics.checkNotNullParameter(aFf1iSDK, "");
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFg1ySDK, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        this.getCurrencyIso4217Code = str;
        this.AFAdRevenueData = context;
        this.getRevenue = aFi1sSDK;
        this.getMonetizationNetwork = aFf1aSDK;
        this.getMediationNetwork = aFj1rSDK;
        this.component4 = aFg1vSDK;
        this.component1 = aFh1uSDK;
        this.areAllFieldsValid = aFc1sSDK;
        this.component3 = aFc1kSDK;
        this.component2 = aFi1ySDK;
        this.equals = aFf1iSDK;
        this.copydefault = aFc1hSDK;
        this.hashCode = aFg1ySDK;
        this.copy = aFc1oSDK;
        this.toString = LazyKt.lazy(new Function0<AppsFlyerProperties>() { // from class: com.appsflyer.internal.AFg1uSDK.3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final AppsFlyerProperties invoke() {
                return AppsFlyerProperties.getInstance();
            }
        });
        this.AFInAppEventType = LazyKt.lazy(new Function0<SimpleDateFormat>() { // from class: com.appsflyer.internal.AFg1uSDK.1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final SimpleDateFormat invoke() {
                return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            }
        });
    }

    private final AppsFlyerProperties getMonetizationNetwork() {
        int i2 = 2 % 2;
        int i3 = w + 19;
        i = i3 % 128;
        int i4 = i3 % 2;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) this.toString.getValue();
        int i5 = i + 19;
        w = i5 % 128;
        if (i5 % 2 == 0) {
            return appsFlyerProperties;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        int i2 = 2 % 2;
        int i3 = i + 27;
        w = i3 % 128;
        int i4 = i3 % 2;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) aFg1uSDK.AFInAppEventType.getValue();
        int i5 = i + 105;
        w = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
        return simpleDateFormat;
    }

    @Override // com.appsflyer.internal.AFg1tSDK
    public final void getMonetizationNetwork(AFh1tSDK aFh1tSDK) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(aFh1tSDK, "");
        Map<String, Object> map = aFh1tSDK.getMonetizationNetwork;
        if (aFh1tSDK.AFAdRevenueData()) {
            int i3 = w + 13;
            i = i3 % 128;
            if (i3 % 2 == 0) {
                getCurrencyIso4217Code(aFh1tSDK, aFh1tSDK.areAllFieldsValid, this.copy.getMediationNetwork, this.copy.AFAdRevenueData);
                throw null;
            }
            getCurrencyIso4217Code(aFh1tSDK, aFh1tSDK.areAllFieldsValid, this.copy.getMediationNetwork, this.copy.AFAdRevenueData);
        } else if (!(aFh1tSDK instanceof AFh1jSDK)) {
            Intrinsics.checkNotNullExpressionValue(map, "");
            String str = aFh1tSDK.component3;
            Intrinsics.checkNotNullExpressionValue(str, "");
            getRevenue(new Object[]{this, map, str}, 22668144, -22668132, System.identityHashCode(this));
            int i4 = w + 43;
            i = i4 % 128;
            int i5 = i4 % 2;
        }
        if (CollectionsKt.listOf((Object[]) new AFe1uSDK[]{AFe1uSDK.CONVERSION, AFe1uSDK.LAUNCH, AFe1uSDK.INAPP}).contains(aFh1tSDK.getMediationNetwork())) {
            Intrinsics.checkNotNullExpressionValue(map, "");
            equals(map);
        }
        if (aFh1tSDK.getMonetizationNetwork()) {
            int i6 = i + 61;
            w = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.checkNotNullExpressionValue(map, "");
            getRevenue(new Object[]{this, map}, 252198665, -252198654, System.identityHashCode(this));
        }
        Intrinsics.checkNotNullExpressionValue(map, "");
        getRevenue(new Object[]{this, map}, 1072860105, -1072860098, System.identityHashCode(this));
        getRevenue(new Object[]{map}, 1729638864, -1729638864, (int) System.currentTimeMillis());
        AFLogger(map);
        getRevenue(new Object[]{this, map}, -952054668, 952054677, System.identityHashCode(this));
        w(map);
        getRevenue(new Object[]{this, map, Boolean.valueOf(aFh1tSDK.AFAdRevenueData())}, 491464520, -491464516, System.identityHashCode(this));
        i(map);
        afDebugLog(map);
        getCurrencyIso4217Code(map, aFh1tSDK);
        map.put("af_events_api", "1");
    }

    @Override // com.appsflyer.internal.AFg1tSDK
    public final void getRevenue(AFh1tSDK aFh1tSDK) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(aFh1tSDK, "");
        Map<String, Object> map = aFh1tSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map, "");
        AFAdRevenueData(map);
        Map<String, Object> map2 = aFh1tSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        getMonetizationNetwork(map2);
        Map<String, Object> map3 = aFh1tSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map3, "");
        AFKeystoreWrapper(map3);
        Map<String, Object> map4 = aFh1tSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map4, "");
        d(map4);
        Map<String, Object> map5 = aFh1tSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map5, "");
        v(map5);
        if (!(!getMediationNetwork().contains(aFh1tSDK.getMediationNetwork()))) {
            int i3 = i + 55;
            w = i3 % 128;
            if (i3 % 2 != 0) {
                Map<String, Object> map6 = aFh1tSDK.getMonetizationNetwork;
                Intrinsics.checkNotNullExpressionValue(map6, "");
                afErrorLog(map6);
                int i4 = 66 / 0;
            } else {
                Map<String, Object> map7 = aFh1tSDK.getMonetizationNetwork;
                Intrinsics.checkNotNullExpressionValue(map7, "");
                afErrorLog(map7);
            }
        }
        int i5 = w + 15;
        i = i5 % 128;
        int i6 = i5 % 2;
    }

    private static List<AFe1uSDK> getMediationNetwork() {
        int i2 = 2 % 2;
        int i3 = w + 19;
        i = i3 % 128;
        int i4 = i3 % 2;
        List<AFe1uSDK> listOf = CollectionsKt.listOf((Object[]) new AFe1uSDK[]{AFe1uSDK.CONVERSION, AFe1uSDK.LAUNCH, AFe1uSDK.INAPP, AFe1uSDK.MANUAL_PURCHASE_VALIDATION, AFe1uSDK.ARS_VALIDATE, AFe1uSDK.PURCHASE_VALIDATE});
        int i5 = w + 71;
        i = i5 % 128;
        int i6 = i5 % 2;
        return listOf;
    }

    private final void AFAdRevenueData(Map<String, Object> map) {
        int i2 = 2 % 2;
        try {
            long j = this.AFAdRevenueData.getPackageManager().getPackageInfo(this.AFAdRevenueData.getPackageName(), 0).firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(j)));
            int i3 = w + 21;
            i = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e);
        }
    }

    private final void getMonetizationNetwork(Map<String, Object> map) {
        int i2 = 2 % 2;
        try {
            PackageInfo packageInfo = this.AFAdRevenueData.getPackageManager().getPackageInfo(this.AFAdRevenueData.getPackageName(), 0);
            if (packageInfo.versionCode > this.areAllFieldsValid.AFAdRevenueData(j.h, 0)) {
                int i3 = i + 3;
                w = i3 % 128;
                if (i3 % 2 == 0) {
                    this.areAllFieldsValid.getMonetizationNetwork(j.h, packageInfo.versionCode);
                    int i4 = w + 31;
                    i = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    this.areAllFieldsValid.getMonetizationNetwork(j.h, packageInfo.versionCode);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            map.put("app_version_code", String.valueOf(packageInfo.versionCode));
            AFc1kSDK aFc1kSDK = this.component3;
            map.put("app_version_name", AFj1nSDK.getCurrencyIso4217Code(aFc1kSDK.AFAdRevenueData.getMonetizationNetwork, aFc1kSDK.AFAdRevenueData.getMonetizationNetwork.getPackageName()));
            map.put("targetSDKver", Integer.valueOf(this.component3.AFAdRevenueData.getMonetizationNetwork.getApplicationInfo().targetSdkVersion));
            long j = packageInfo.firstInstallTime;
            long j2 = packageInfo.lastUpdateTime;
            map.put("date1", ((SimpleDateFormat) getRevenue(new Object[]{this}, -65907378, 65907386, System.identityHashCode(this))).format(new Date(j)));
            map.put("date2", ((SimpleDateFormat) getRevenue(new Object[]{this}, -65907378, 65907386, System.identityHashCode(this))).format(new Date(j2)));
            Object[] objArr = new Object[1];
            a((-328942803) - View.MeasureSpec.getSize(0), View.getDefaultSize(0, 0) + 962452528, (ViewConfiguration.getWindowTouchSlop() >> 8) - 38, (byte) (TextUtils.lastIndexOf("", '0', 0) + 1), (short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
            String intern = ((String) objArr[0]).intern();
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) getRevenue(new Object[]{this}, -65907378, 65907386, System.identityHashCode(this));
            Intrinsics.checkNotNullExpressionValue(simpleDateFormat, "");
            map.put(intern, getMonetizationNetwork(simpleDateFormat));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
        }
    }

    private static void a(int i2, int i3, int i4, byte b, short s, Object[] objArr) {
        int i5;
        boolean z;
        char c;
        int length;
        byte[] bArr;
        int i6 = 2 % 2;
        AFk1pSDK aFk1pSDK = new AFk1pSDK();
        StringBuilder sb = new StringBuilder();
        int i7 = i4 + ((int) (registerClient ^ (-1123129136953719915L)));
        boolean z2 = i7 == -1;
        if (z2) {
            byte[] bArr2 = AFInAppEventParameterName;
            if (bArr2 != null) {
                int i8 = $10 + 59;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    length = bArr2.length;
                    bArr = new byte[length];
                } else {
                    length = bArr2.length;
                    bArr = new byte[length];
                }
                for (int i9 = 0; i9 < length; i9++) {
                    bArr[i9] = (byte) (bArr2[i9] ^ (-1123129136953719915L));
                }
                bArr2 = bArr;
            }
            i7 = bArr2 != null ? (byte) (((byte) (AFInAppEventParameterName[((int) (AFLogger ^ (-1123129136953719915L))) + i3] ^ (-1123129136953719915L))) + ((int) (registerClient ^ (-1123129136953719915L)))) : (short) (((short) (d[((int) (AFLogger ^ (-1123129136953719915L))) + i3] ^ (-1123129136953719915L))) + ((int) (registerClient ^ (-1123129136953719915L))));
        }
        if (i7 > 0) {
            int i10 = ((i3 + i7) - 2) + ((int) (AFLogger ^ (-1123129136953719915L)));
            if (z2) {
                int i11 = $10 + 105;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                i5 = 1;
            } else {
                i5 = 0;
            }
            aFk1pSDK.getCurrencyIso4217Code = i10 + i5;
            aFk1pSDK.AFAdRevenueData = (char) (i2 + ((int) (AFKeystoreWrapper ^ (-1123129136953719915L))));
            sb.append(aFk1pSDK.AFAdRevenueData);
            aFk1pSDK.getMonetizationNetwork = aFk1pSDK.AFAdRevenueData;
            byte[] bArr3 = AFInAppEventParameterName;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                int i13 = $11 + 79;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                for (int i15 = 0; i15 < length2; i15++) {
                    bArr4[i15] = (byte) (bArr3[i15] ^ (-1123129136953719915L));
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                int i16 = $10 + 35;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                z = true;
            } else {
                z = false;
            }
            aFk1pSDK.getMediationNetwork = 1;
            while (aFk1pSDK.getMediationNetwork < i7) {
                if (z) {
                    int i18 = $10 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                    $11 = i18 % 128;
                    if (i18 % 2 == 0) {
                        byte[] bArr5 = AFInAppEventParameterName;
                        int i19 = aFk1pSDK.getCurrencyIso4217Code;
                        aFk1pSDK.getCurrencyIso4217Code = 0;
                        c = (char) (aFk1pSDK.getMonetizationNetwork >>> (((byte) (((byte) (bArr5[i19] - (-1123129136953719915L))) >>> s)) ^ b));
                    } else {
                        byte[] bArr6 = AFInAppEventParameterName;
                        aFk1pSDK.getCurrencyIso4217Code = aFk1pSDK.getCurrencyIso4217Code - 1;
                        c = (char) (aFk1pSDK.getMonetizationNetwork + (((byte) (((byte) (bArr6[r4] ^ (-1123129136953719915L))) + s)) ^ b));
                    }
                    aFk1pSDK.AFAdRevenueData = c;
                } else {
                    short[] sArr = d;
                    aFk1pSDK.getCurrencyIso4217Code = aFk1pSDK.getCurrencyIso4217Code - 1;
                    aFk1pSDK.AFAdRevenueData = (char) (aFk1pSDK.getMonetizationNetwork + (((short) (((short) (sArr[r4] ^ (-1123129136953719915L))) + s)) ^ b));
                }
                sb.append(aFk1pSDK.AFAdRevenueData);
                aFk1pSDK.getMonetizationNetwork = aFk1pSDK.AFAdRevenueData;
                aFk1pSDK.getMediationNetwork++;
            }
        }
        objArr[0] = sb.toString();
    }

    @Override // com.appsflyer.internal.AFg1tSDK
    public final void getMediationNetwork(Map<String, Object> map) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String string = getMonetizationNetwork().getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            map.put(AppsFlyerProperties.APP_ID, string);
        } else {
            int i3 = i + 51;
            w = i3 % 128;
            int i4 = i3 % 2;
        }
        String string2 = getMonetizationNetwork().getString("currencyCode");
        if (string2 != null) {
            if (string2.length() != 3) {
                String obj = new StringBuilder("WARNING: currency code should be 3 characters!!! '").append(string2).append("' is not a legal value.").toString();
                Intrinsics.checkNotNullExpressionValue(obj, "");
                AFLogger.afWarnLog(obj);
            }
            map.put("currency", string2);
        }
        String string3 = getMonetizationNetwork().getString(AppsFlyerProperties.IS_UPDATE);
        if (string3 != null) {
            int i5 = w + 73;
            i = i5 % 128;
            int i6 = i5 % 2;
            map.put("isUpdate", string3);
        } else {
            int i7 = w + 21;
            i = i7 % 128;
            int i8 = i7 % 2;
        }
        String string4 = getMonetizationNetwork().getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string4 != null) {
            map.put("customData", string4);
        }
        String string5 = getMonetizationNetwork().getString(AppsFlyerProperties.APP_USER_ID);
        if (string5 != null) {
            map.put("appUserId", string5);
        }
        String string6 = getMonetizationNetwork().getString(AppsFlyerProperties.USER_EMAILS);
        if (string6 != null) {
            map.put("user_emails", string6);
        }
        AFb1qSDK aFb1qSDK = this.copy.getMonetizationNetwork;
        if (aFb1qSDK != null) {
            int i9 = i + 21;
            w = i9 % 128;
            if (i9 % 2 != 0) {
                String[] strArr = aFb1qSDK.getRevenue;
                throw null;
            }
            String[] strArr2 = aFb1qSDK.getRevenue;
            if (strArr2 != null) {
                map.put("sharing_filter", strArr2);
            }
        }
    }

    private static PackageInfo s_(PackageManager packageManager, String str) {
        int i2 = 2 % 2;
        int i3 = i + 109;
        w = i3 % 128;
        int i4 = i3 % 2;
        if (Build.VERSION.SDK_INT < 33) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            Intrinsics.checkNotNullExpressionValue(packageInfo, "");
            return packageInfo;
        }
        int i5 = i + 45;
        w = i5 % 128;
        int i6 = i5 % 2;
        PackageInfo packageInfo2 = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
        Intrinsics.checkNotNullExpressionValue(packageInfo2, "");
        return packageInfo2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
    
        return java.lang.Long.valueOf(r6.firstInstallTime);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r6 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r6 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object component2(Object[] objArr) {
        PackageInfo s_;
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        int i2 = 2 % 2;
        int i3 = w + 59;
        i = i3 % 128;
        int i4 = i3 % 2;
        Context context = aFg1uSDK.copydefault.getMonetizationNetwork;
        Object obj = null;
        if (context == null) {
            return null;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            int i5 = i + 17;
            w = i5 % 128;
            if (i5 % 2 != 0) {
                String packageName = context.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "");
                s_ = s_(packageManager, packageName);
                int i6 = 81 / 0;
            } else {
                String packageName2 = context.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName2, "");
                s_ = s_(packageManager, packageName2);
            }
        }
        int i7 = i + 65;
        w = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private String component4() throws CertificateException, NoSuchAlgorithmException, PackageManager.NameNotFoundException {
        int i2 = 2 % 2;
        int i3 = w + 103;
        i = i3 % 128;
        int i4 = i3 % 2;
        PackageManager packageManager = this.AFAdRevenueData.getApplicationContext().getPackageManager();
        if (i4 != 0) {
            return AFj1nSDK.L_(packageManager, this.AFAdRevenueData.getApplicationContext().getPackageName());
        }
        AFj1nSDK.L_(packageManager, this.AFAdRevenueData.getApplicationContext().getPackageName());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static long component3() {
        int i2 = 2 % 2;
        int i3 = w + 39;
        i = i3 % 128;
        return i3 % 2 == 0 ? System.currentTimeMillis() + SystemClock.elapsedRealtime() : System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    @Override // com.appsflyer.internal.AFg1tSDK
    public final long AFAdRevenueData() {
        int i2 = 2 % 2;
        int i3 = w + 83;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            System.currentTimeMillis();
            throw null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i4 = i + 55;
        w = i4 % 128;
        int i5 = i4 % 2;
        return currentTimeMillis;
    }

    private static String component2() {
        int i2 = 2 % 2;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double pow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / pow)) + "/" + ((long) (blockCountLong / pow));
        int i3 = w + 87;
        i = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i2 = 2 % 2;
        int i3 = i + 73;
        w = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFf1iSDK aFf1iSDK = aFg1uSDK.equals;
            AFf1iSDK.getRevenue(map, aFg1uSDK.component3);
            return null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        AFf1iSDK aFf1iSDK2 = aFg1uSDK.equals;
        AFf1iSDK.getRevenue(map, aFg1uSDK.component3);
        obj.hashCode();
        throw null;
    }

    private void getCurrencyIso4217Code(Map<String, Object> map, boolean z) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", getMediationNetwork("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", getMediationNetwork("ro.product.cpu.abi2"));
        hashMap.put(DebugImage.JsonKeys.ARCH, getMediationNetwork("os.arch"));
        hashMap.put("build_display_id", getMediationNetwork("ro.build.display.id"));
        if (z) {
            int i3 = i + 61;
            w = i3 % 128;
            int i4 = i3 % 2;
            component1(hashMap);
            if (this.component3.getRevenue.AFAdRevenueData("appsFlyerCount", 0) <= 2) {
                int i5 = i + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                w = i5 % 128;
                if (i5 % 2 != 0) {
                    hashMap.putAll(this.getMediationNetwork.getRevenue());
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                hashMap.putAll(this.getMediationNetwork.getRevenue());
            }
        }
        hashMap.put("dim", this.component4.getCurrencyIso4217Code(this.AFAdRevenueData));
        map.put("deviceData", hashMap);
    }

    @Override // com.appsflyer.internal.AFg1tSDK
    public final void getRevenue(Map<String, Object> map) {
        AFi1wSDK aFi1wSDK;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFi1xSDK aFi1xSDK = this.component2.getRevenue;
        Object obj = null;
        if (aFi1xSDK != null) {
            int i3 = i + 33;
            w = i3 % 128;
            int i4 = i3 % 2;
            aFi1wSDK = aFi1xSDK.getMediationNetwork();
        } else {
            aFi1wSDK = null;
        }
        if (aFi1wSDK == null) {
            int i5 = w + 107;
            i = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        map.put("network", aFi1wSDK.AFAdRevenueData);
        map.put("ivc", Boolean.valueOf(aFi1wSDK.getMediationNetwork()));
        if (getMonetizationNetwork().getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
            return;
        }
        int i6 = i + 25;
        w = i6 % 128;
        int i7 = i6 % 2;
        String str = aFi1wSDK.getCurrencyIso4217Code;
        if (str != null) {
            map.put("operator", str);
            int i8 = w + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            i = i8 % 128;
            int i9 = i8 % 2;
        }
        String str2 = aFi1wSDK.getMonetizationNetwork;
        if (str2 != null) {
            map.put(M6.R0, str2);
        }
    }

    @Override // com.appsflyer.internal.AFg1tSDK
    public final void AFAdRevenueData(Map<String, Object> map, int i2, int i3) {
        boolean z;
        int i4 = 2 % 2;
        int i5 = w + 17;
        i = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i2));
        map.put("iaecounter", String.valueOf(i3));
        if (copy()) {
            int i7 = w + 93;
            i = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 5;
            }
            z = false;
        } else {
            z = true;
        }
        map.put("isFirstCall", String.valueOf(z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        r3 = kotlin.Result.INSTANCE;
        r3 = r12;
        r3 = new org.json.JSONObject(r0);
        r3.put("isPush", "true");
        r13.put("af_deeplink", r3.toString());
        r13 = kotlin.Result.m11180constructorimpl(kotlin.Unit.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        r13 = kotlin.Result.m11180constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0025, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (r13.get("af_deeplink") == null) goto L23;
     */
    @Override // com.appsflyer.internal.AFg1tSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getCurrencyIso4217Code(Map<String, Object> map) {
        String str;
        Object m11180constructorimpl;
        int i2 = 2 % 2;
        int i3 = i + 37;
        w = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            str = this.copy.getRevenue;
            int i4 = 33 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            str = this.copy.getRevenue;
        }
        this.copy.getRevenue = null;
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
        if (m11183exceptionOrNullimpl != null) {
            int i5 = i + 39;
            w = i5 % 128;
            int i6 = i5 % 2;
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.GENERAL, "Exception while trying to create JSONObject from pushPayload", m11183exceptionOrNullimpl, false, false, false, false, 120, null);
        } else {
            int i7 = i + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            w = i7 % 128;
            int i8 = i7 % 2;
        }
        Result.m11179boximpl(m11180constructorimpl);
        this.copy.getRevenue = null;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        int i2;
        AFh1tSDK aFh1tSDK = (AFh1tSDK) objArr[1];
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(aFh1tSDK, "");
        Map<String, Object> map = aFh1tSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map, "");
        map.put("open_referrer", aFh1tSDK.getMediationNetwork);
        String str = aFh1tSDK.component4;
        Object obj = null;
        if (str == null || StringsKt.isBlank(str)) {
            i2 = w + 87;
        } else {
            int i4 = i + 31;
            w = i4 % 128;
            if (i4 % 2 != 0) {
                map.put("af_web_referrer", aFh1tSDK.component4);
                obj.hashCode();
                throw null;
            }
            map.put("af_web_referrer", aFh1tSDK.component4);
            i2 = w + 17;
        }
        i = i2 % 128;
        int i5 = i2 % 2;
        return null;
    }

    private final void component1(Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = w + 79;
        i = i3 % 128;
        if (i3 % 2 != 0) {
            AFf1aSDK.AFa1ySDK monetizationNetwork = this.getMonetizationNetwork.getMonetizationNetwork(this.AFAdRevenueData);
            float f = monetizationNetwork.getMediationNetwork;
            String str = monetizationNetwork.getRevenue;
            map.put("btl", String.valueOf(f));
            if (str != null) {
                int i4 = w + 59;
                i = i4 % 128;
                int i5 = i4 % 2;
                map.put("btch", str);
                return;
            }
            return;
        }
        AFf1aSDK.AFa1ySDK monetizationNetwork2 = this.getMonetizationNetwork.getMonetizationNetwork(this.AFAdRevenueData);
        float f2 = monetizationNetwork2.getMediationNetwork;
        String str2 = monetizationNetwork2.getRevenue;
        map.put("btl", String.valueOf(f2));
        throw null;
    }

    private void component2(Map<String, Object> map) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String string = getMonetizationNetwork().getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = getMonetizationNetwork().getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string != null) {
            int i3 = i + 87;
            w = i3 % 128;
            int i4 = i3 % 2;
            map.put("onelink_id", string);
            int i5 = w + 39;
            i = i5 % 128;
            int i6 = i5 % 2;
        }
        if (string2 != null) {
            int i7 = i + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            w = i7 % 128;
            if (i7 % 2 == 0) {
                map.put("onelink_ver", string2);
            } else {
                map.put("onelink_ver", string2);
                int i8 = 61 / 0;
            }
        }
    }

    private void component4(Map<String, ? extends Object> map) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFh1uSDK aFh1uSDK = this.component1;
        HashMap hashMap = new HashMap(aFh1uSDK.getMonetizationNetwork);
        aFh1uSDK.getMonetizationNetwork.clear();
        this.component1.getRevenue.getMediationNetwork("gcd");
        Intrinsics.checkNotNullExpressionValue(hashMap, "");
        if (hashMap.isEmpty()) {
            int i3 = i + 67;
            w = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        } else {
            int i5 = w + 37;
            i = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (z) {
            int i7 = w + 85;
            i = i7 % 128;
            int i8 = i7 % 2;
            Map<String, Object> AFAdRevenueData = AFa1zSDK.AFAdRevenueData(map);
            Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
            AFAdRevenueData.put("gcd", hashMap);
        }
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        int i2 = 2 % 2;
        int i3 = w + 89;
        i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            String AFAdRevenueData = aFg1uSDK.areAllFieldsValid.AFAdRevenueData("prev_event_name", (String) null);
            if (AFAdRevenueData != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", aFg1uSDK.areAllFieldsValid.getMediationNetwork("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", AFAdRevenueData);
                map.put("prev_event", jSONObject);
            }
            aFg1uSDK.areAllFieldsValid.getRevenue("prev_event_name", str);
            aFg1uSDK.areAllFieldsValid.AFAdRevenueData("prev_event_timestamp", System.currentTimeMillis());
            int i5 = w + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            i = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            throw null;
        } catch (Exception e) {
            AFLogger.afErrorLog("Error while processing previous event.", e);
            return null;
        }
    }

    private String areAllFieldsValid() {
        int i2 = 2 % 2;
        String str = null;
        if (this.areAllFieldsValid.getCurrencyIso4217Code("INSTALL_STORE")) {
            int i3 = w + 43;
            i = i3 % 128;
            int i4 = i3 % 2;
            return this.areAllFieldsValid.AFAdRevenueData("INSTALL_STORE", (String) null);
        }
        if (equals()) {
            int i5 = w + 91;
            i = i5 % 128;
            int i6 = i5 % 2;
            str = (String) getRevenue(new Object[]{this}, -1813533339, 1813533344, System.identityHashCode(this));
        }
        this.areAllFieldsValid.getRevenue("INSTALL_STORE", str);
        return str;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        int i2 = 2 % 2;
        String string = aFg1uSDK.getMonetizationNetwork().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            return string;
        }
        int i3 = w + 21;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            aFg1uSDK.getCurrencyIso4217Code("AF_STORE");
            throw null;
        }
        String currencyIso4217Code = aFg1uSDK.getCurrencyIso4217Code("AF_STORE");
        int i4 = i + 25;
        w = i4 % 128;
        int i5 = i4 % 2;
        return currencyIso4217Code;
    }

    private String getMonetizationNetwork(SimpleDateFormat simpleDateFormat) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        String AFAdRevenueData = this.areAllFieldsValid.AFAdRevenueData("appsFlyerFirstInstall", (String) null);
        if (AFAdRevenueData == null) {
            int i3 = w + 79;
            i = i3 % 128;
            int i4 = i3 % 2;
            if (equals()) {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                AFAdRevenueData = simpleDateFormat.format(new Date());
            } else {
                AFAdRevenueData = "";
            }
            this.areAllFieldsValid.getRevenue("appsFlyerFirstInstall", AFAdRevenueData);
            int i5 = i + 89;
            w = i5 % 128;
            int i6 = i5 % 2;
        }
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFh1zSDK.GENERAL, "AppsFlyer: first launch date: " + AFAdRevenueData, false, 4, null);
        Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
        return AFAdRevenueData;
    }

    private boolean equals() {
        int i2 = 2 % 2;
        int i3 = i + 61;
        w = i3 % 128;
        if (i3 % 2 == 0 ? this.component3.getRevenue.AFAdRevenueData("appsFlyerCount", 0) <= 1 : this.component3.getRevenue.AFAdRevenueData("appsFlyerCount", 1) <= 1) {
            return true;
        }
        int i4 = i + 23;
        w = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return false;
    }

    private boolean copy() {
        int i2 = 2 % 2;
        int i3 = i + 57;
        w = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Boolean.parseBoolean(this.areAllFieldsValid.AFAdRevenueData("sentSuccessfully", (String) null));
            throw null;
        }
        boolean parseBoolean = Boolean.parseBoolean(this.areAllFieldsValid.AFAdRevenueData("sentSuccessfully", (String) null));
        int i4 = i + 113;
        w = i4 % 128;
        if (i4 % 2 == 0) {
            return parseBoolean;
        }
        obj.hashCode();
        throw null;
    }

    private String copydefault() {
        int i2;
        int i3 = 2 % 2;
        String string = getMonetizationNetwork().getString("preInstallName");
        if (string != null) {
            i2 = w + 23;
        } else {
            if (this.areAllFieldsValid.getCurrencyIso4217Code("preInstallName")) {
                string = this.areAllFieldsValid.AFAdRevenueData("preInstallName", (String) null);
            } else {
                if (equals()) {
                    int i4 = i + 99;
                    w = i4 % 128;
                    int i5 = i4 % 2;
                    string = registerClient();
                    if (string == null) {
                        int i6 = i + 29;
                        w = i6 % 128;
                        int i7 = i6 % 2;
                        string = getCurrencyIso4217Code("AF_PRE_INSTALL_NAME");
                    }
                }
                if (string != null) {
                    this.areAllFieldsValid.getRevenue("preInstallName", string);
                }
            }
            if (string != null) {
                getMonetizationNetwork().set("preInstallName", string);
            }
            i2 = w + 103;
        }
        i = i2 % 128;
        int i8 = i2 % 2;
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getMediationNetwork(Map<String, Object> map, String str) {
        boolean z;
        String revenue;
        AFb1lSDK monetizationNetwork;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (getMonetizationNetwork().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            return;
        }
        AFf1iSDK aFf1iSDK = this.equals;
        Object obj = (String) AFf1iSDK.AFAdRevenueData(new Object[]{aFf1iSDK, this.areAllFieldsValid}, 527487030, -527487030, System.identityHashCode(aFf1iSDK));
        String str2 = (CharSequence) obj;
        Object obj2 = null;
        if (str2 != null) {
            int i3 = w + 11;
            i = i3 % 128;
            if (i3 % 2 == 0) {
                str2.length();
                obj2.hashCode();
                throw null;
            }
            if (str2.length() != 0) {
                z = false;
                if (!z) {
                    map.put("imei", obj);
                }
                revenue = getRevenue(str);
                if (revenue == null) {
                    int i4 = w + 41;
                    i = i4 % 128;
                    if (i4 % 2 == 0) {
                        this.areAllFieldsValid.getRevenue("androidIdCached", revenue);
                        map.put("android_id", revenue);
                        throw null;
                    }
                    this.areAllFieldsValid.getRevenue("androidIdCached", revenue);
                    map.put("android_id", revenue);
                } else {
                    AFLogger.afInfoLog("Android ID was not collected.");
                }
                monetizationNetwork = AFb1iSDK.getMonetizationNetwork(this.AFAdRevenueData);
                if (monetizationNetwork == null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Boolean bool = monetizationNetwork.AFAdRevenueData;
                    Intrinsics.checkNotNullExpressionValue(bool, "");
                    linkedHashMap.put("isManual", bool);
                    String str3 = monetizationNetwork.getMonetizationNetwork;
                    Intrinsics.checkNotNullExpressionValue(str3, "");
                    linkedHashMap.put("val", str3);
                    Boolean bool2 = monetizationNetwork.getCurrencyIso4217Code;
                    if (bool2 != null) {
                        int i5 = i + 45;
                        w = i5 % 128;
                        if (i5 % 2 != 0) {
                            linkedHashMap.put("isLat", bool2);
                            int i6 = 30 / 0;
                        } else {
                            linkedHashMap.put("isLat", bool2);
                        }
                    }
                    map.put("oaid", linkedHashMap);
                    return;
                }
                return;
            }
        }
        z = true;
        if (!z) {
        }
        revenue = getRevenue(str);
        if (revenue == null) {
        }
        monetizationNetwork = AFb1iSDK.getMonetizationNetwork(this.AFAdRevenueData);
        if (monetizationNetwork == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r1.length() == 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String getRevenue(String str) {
        int i2 = 2 % 2;
        int i3 = i + 103;
        w = i3 % 128;
        if (i3 % 2 == 0 ? getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false) : !(!getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, true))) {
            String str2 = str;
            if (str2 != null) {
                int i4 = i + 107;
                w = i4 % 128;
                int i5 = i4 % 2;
            }
            if (!AFInAppEventType()) {
                return null;
            }
            String AFLogger2 = AFLogger();
            int i6 = i + 71;
            w = i6 % 128;
            int i7 = i6 % 2;
            return AFLogger2;
        }
        if (str == null) {
            return null;
        }
        int i8 = i + 99;
        w = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    private final String AFLogger() {
        int i2 = 2 % 2;
        Object obj = null;
        String AFAdRevenueData = this.areAllFieldsValid.AFAdRevenueData("androidIdCached", (String) null);
        try {
            String string = Settings.Secure.getString(this.AFAdRevenueData.getContentResolver(), "android_id");
            if (string != null) {
                int i3 = i;
                int i4 = i3 + 43;
                w = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 33;
                w = i6 % 128;
                int i7 = i6 % 2;
                return string;
            }
        } catch (Exception e) {
            AFLogger.afErrorLog(e.getMessage(), e);
        }
        if (AFAdRevenueData == null) {
            return null;
        }
        int i8 = w + 43;
        i = i8 % 128;
        if (i8 % 2 != 0) {
            AFLogger.afDebugLog("use cached AndroidId: " + AFAdRevenueData);
            return AFAdRevenueData;
        }
        AFLogger.afDebugLog("use cached AndroidId: " + AFAdRevenueData);
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        Map map = (Map) objArr[0];
        int i2 = 2 % 2;
        int i3 = w + 17;
        i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr2 = new Object[1];
        a((-328942807) - View.MeasureSpec.makeMeasureSpec(0, 0), Color.argb(0, 0, 0, 0) + 962452542, TextUtils.lastIndexOf("", '0', 0) - 47, (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
        map.put(((String) objArr2[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        int i5 = i + 27;
        w = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
        return null;
    }

    private void getCurrencyIso4217Code(AFh1tSDK aFh1tSDK, String str, String str2, AFb1vSDK aFb1vSDK) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(aFh1tSDK, "");
        Map<String, Object> map = aFh1tSDK.getMonetizationNetwork;
        if (aFh1tSDK.getMediationNetwork() == AFe1uSDK.CONVERSION) {
            int i3 = i + 71;
            w = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(map, "");
                hashCode(map);
                copy(map);
                toString(map);
                AFa1uSDK.getMonetizationNetwork(this.copydefault, this.areAllFieldsValid);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullExpressionValue(map, "");
            hashCode(map);
            copy(map);
            toString(map);
            AFa1uSDK.getMonetizationNetwork(this.copydefault, this.areAllFieldsValid);
        }
        Intrinsics.checkNotNullExpressionValue(map, "");
        copydefault(map);
        component2(map);
        component4((Map<String, ? extends Object>) map);
        getCurrencyIso4217Code(map, str2);
        getRevenue(map, str);
        registerClient(map);
        if (aFb1vSDK != null) {
            int i4 = i + 67;
            w = i4 % 128;
            int i5 = i4 % 2;
            aFb1vSDK.getRevenue(map);
        }
    }

    private final void hashCode(Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = w + 1;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 62 / 0;
            if (getMonetizationNetwork().isOtherSdkStringDisabled()) {
                return;
            }
        } else if (getMonetizationNetwork().isOtherSdkStringDisabled()) {
            return;
        }
        int i5 = w + 81;
        i = i5 % 128;
        if (i5 % 2 == 0) {
            map.put(X3.j.Y, String.valueOf(this.getMonetizationNetwork.getMonetizationNetwork(this.AFAdRevenueData).getMediationNetwork));
            int i6 = 14 / 0;
        } else {
            map.put(X3.j.Y, String.valueOf(this.getMonetizationNetwork.getMonetizationNetwork(this.AFAdRevenueData).getMediationNetwork));
        }
    }

    private final void copy(Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = w + 87;
        i = i3 % 128;
        int i4 = i3 % 2;
        UiModeManager uiModeManager = (UiModeManager) this.AFAdRevenueData.getSystemService(UiModeManager.class);
        if (uiModeManager != null) {
            int i5 = i + 37;
            w = i5 % 128;
            int i6 = i5 % 2;
            if (uiModeManager.getCurrentModeType() == 4) {
                int i7 = i + 7;
                w = i7 % 128;
                int i8 = i7 % 2;
                map.put("tv", Boolean.TRUE);
            }
        }
    }

    private void equals(Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = w + 91;
        i = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(this.AFAdRevenueData.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(this.AFAdRevenueData.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void toString(Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = i + 51;
        w = i3 % 128;
        if (i3 % 2 == 0) {
            if (AFg1rSDK.getCurrencyIso4217Code(this.AFAdRevenueData)) {
                int i4 = i + 73;
                w = i4 % 128;
                int i5 = i4 % 2;
                map.put("inst_app", Boolean.TRUE);
                return;
            }
            return;
        }
        AFg1rSDK.getCurrencyIso4217Code(this.AFAdRevenueData);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r1 > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r1 > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0054, code lost:
    
        r1 = com.appsflyer.internal.AFg1uSDK.w + 59;
        com.appsflyer.internal.AFg1uSDK.i = r1 % 128;
        r1 = r1 % 2;
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        r3 = com.appsflyer.internal.AFg1uSDK.w + 29;
        com.appsflyer.internal.AFg1uSDK.i = r3 % 128;
        r3 = r3 % 2;
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r6 - r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void copydefault(Map<String, Object> map) {
        long mediationNetwork;
        long currentTimeMillis;
        long seconds;
        int i2 = 2 % 2;
        int i3 = i + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        w = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            mediationNetwork = this.areAllFieldsValid.getMediationNetwork("AppsFlyerTimePassedSincePrevLaunch", 1L);
            currentTimeMillis = System.currentTimeMillis();
            this.areAllFieldsValid.AFAdRevenueData("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            mediationNetwork = this.areAllFieldsValid.getMediationNetwork("AppsFlyerTimePassedSincePrevLaunch", 0L);
            currentTimeMillis = System.currentTimeMillis();
            this.areAllFieldsValid.AFAdRevenueData("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        }
        map.put("timepassedsincelastlaunch", String.valueOf(seconds));
    }

    private static void getCurrencyIso4217Code(Map<String, Object> map, String str) {
        int i2 = 2 % 2;
        int i3 = i + 55;
        w = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (str != null) {
            int i5 = w + 57;
            i = i5 % 128;
            if (i5 % 2 != 0) {
                map.put(HintConstants.AUTOFILL_HINT_PHONE, str);
            } else {
                map.put(HintConstants.AUTOFILL_HINT_PHONE, str);
                throw null;
            }
        }
    }

    private void getRevenue(Map<String, Object> map, String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String str2 = str;
        if (str2 != null && str2.length() != 0) {
            int i3 = w + 85;
            i = i3 % 128;
            int i4 = i3 % 2;
            map.put("referrer", str);
        }
        String AFAdRevenueData = this.areAllFieldsValid.AFAdRevenueData("extraReferrers", (String) null);
        if (AFAdRevenueData != null) {
            map.put("extraReferrers", AFAdRevenueData);
        }
        String referrer = getMonetizationNetwork().getReferrer(this.areAllFieldsValid);
        String str3 = referrer;
        if (str3 == null || str3.length() == 0) {
            return;
        }
        int i5 = i + 111;
        w = i5 % 128;
        int i6 = i5 % 2;
        if (map.get("referrer") == null) {
            map.put("referrer", referrer);
            int i7 = i + 1;
            w = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 / 4;
            }
        }
    }

    private void registerClient(Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = i + 11;
        w = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        long j = this.component1.copydefault;
        if (j != 0) {
            int i5 = i + 65;
            w = i5 % 128;
            int i6 = i5 % 2;
            map.put("prev_session_dur", Long.valueOf(j));
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        Map map = (Map) objArr[0];
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFa1uSDK aFa1uSDK = AFa1uSDK.INSTANCE;
        String monetizationNetwork = AFa1uSDK.getMonetizationNetwork();
        AFa1uSDK aFa1uSDK2 = AFa1uSDK.INSTANCE;
        String AFAdRevenueData = AFa1uSDK.AFAdRevenueData();
        if (monetizationNetwork != null && AFAdRevenueData != null) {
            int i3 = i + 49;
            w = i3 % 128;
            if (i3 % 2 != 0) {
                Integer.parseInt(AFAdRevenueData);
                throw null;
            }
            if (Integer.parseInt(AFAdRevenueData) > 0) {
                map.put("reinstallCounter", AFAdRevenueData);
                map.put("originalAppsflyerId", monetizationNetwork);
                int i4 = i + 11;
                w = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        return null;
    }

    private void AFLogger(Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = i + 17;
        w = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(this.hashCode.getRevenue());
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.putAll(this.hashCode.getRevenue());
        int i4 = w + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        i = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String string = aFg1uSDK.getMonetizationNetwork().getString(AppsFlyerProperties.EXTENSION);
        String str = string;
        Object obj = null;
        if (str != null) {
            int i3 = w + 17;
            i = i3 % 128;
            if (i3 % 2 == 0) {
                str.length();
                throw null;
            }
            if (str.length() != 0) {
                map.put(AppsFlyerProperties.EXTENSION, string);
            }
        }
        int i4 = i + 19;
        w = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFKeystoreWrapper(Map<String, Object> map) {
        boolean z;
        String areAllFieldsValid;
        String copydefault;
        String str;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String component1 = this.component3.component1();
        String monetizationNetwork = getMonetizationNetwork(this.areAllFieldsValid, component1);
        boolean z2 = true;
        Object obj = null;
        if (monetizationNetwork != null) {
            int i3 = i + 99;
            w = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.areEqual(monetizationNetwork, component1);
                obj.hashCode();
                throw null;
            }
            if (!Intrinsics.areEqual(monetizationNetwork, component1)) {
                z = true;
                if (monetizationNetwork == null) {
                    int i4 = i + 111;
                    int i5 = i4 % 128;
                    w = i5;
                    int i6 = i4 % 2;
                    if (component1 != null) {
                        int i7 = i5 + 73;
                        i = i7 % 128;
                        int i8 = i7 % 2;
                        if (!z || z2) {
                            map.put("af_latestchannel", component1);
                        }
                        areAllFieldsValid = areAllFieldsValid();
                        if (areAllFieldsValid != null) {
                            int i9 = i + 79;
                            w = i9 % 128;
                            if (i9 % 2 != 0) {
                                Locale locale = Locale.getDefault();
                                Intrinsics.checkNotNullExpressionValue(locale, "");
                                Object lowerCase = areAllFieldsValid.toLowerCase(locale);
                                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                                map.put("af_installstore", lowerCase);
                                obj.hashCode();
                                throw null;
                            }
                            Locale locale2 = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale2, "");
                            Object lowerCase2 = areAllFieldsValid.toLowerCase(locale2);
                            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                            map.put("af_installstore", lowerCase2);
                        }
                        copydefault = copydefault();
                        if (copydefault != null) {
                            int i10 = w + 83;
                            i = i10 % 128;
                            if (i10 % 2 == 0) {
                                Locale locale3 = Locale.getDefault();
                                Intrinsics.checkNotNullExpressionValue(locale3, "");
                                Object lowerCase3 = copydefault.toLowerCase(locale3);
                                Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                                map.put("af_preinstall_name", lowerCase3);
                                int i11 = 8 / 0;
                            } else {
                                Locale locale4 = Locale.getDefault();
                                Intrinsics.checkNotNullExpressionValue(locale4, "");
                                Object lowerCase4 = copydefault.toLowerCase(locale4);
                                Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
                                map.put("af_preinstall_name", lowerCase4);
                            }
                        }
                        str = (String) getRevenue(new Object[]{this}, -1813533339, 1813533344, System.identityHashCode(this));
                        if (str != null) {
                            Locale locale5 = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale5, "");
                            Object lowerCase5 = str.toLowerCase(locale5);
                            Intrinsics.checkNotNullExpressionValue(lowerCase5, "");
                            map.put("af_currentstore", lowerCase5);
                            return;
                        }
                        return;
                    }
                }
                z2 = false;
                if (!z) {
                }
                map.put("af_latestchannel", component1);
                areAllFieldsValid = areAllFieldsValid();
                if (areAllFieldsValid != null) {
                }
                copydefault = copydefault();
                if (copydefault != null) {
                }
                str = (String) getRevenue(new Object[]{this}, -1813533339, 1813533344, System.identityHashCode(this));
                if (str != null) {
                }
            }
        }
        z = false;
        if (monetizationNetwork == null) {
        }
        z2 = false;
        if (!z) {
        }
        map.put("af_latestchannel", component1);
        areAllFieldsValid = areAllFieldsValid();
        if (areAllFieldsValid != null) {
        }
        copydefault = copydefault();
        if (copydefault != null) {
        }
        str = (String) getRevenue(new Object[]{this}, -1813533339, 1813533344, System.identityHashCode(this));
        if (str != null) {
        }
    }

    private void d(Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = w + 91;
        i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("af_preinstalled", String.valueOf(AFc1kSDK.getRevenue(this.AFAdRevenueData)));
        int i5 = i + 79;
        w = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void unregisterClient(Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = w + 13;
        i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        try {
            map.put(M6.q, Locale.getDefault().getDisplayLanguage());
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
            int i5 = w + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            i = i5 % 128;
            int i6 = i5 % 2;
        } catch (Exception e3) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e3);
        }
    }

    private void w(Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = i + 79;
        w = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        try {
            String monetizationNetwork = AFb1kSDK.getMonetizationNetwork(this.areAllFieldsValid);
            if (monetizationNetwork != null) {
                map.put("uid", monetizationNetwork);
                return;
            }
        } catch (Throwable th) {
            String obj = new StringBuilder("ERROR: could not get uid ").append(th.getMessage()).toString();
            Intrinsics.checkNotNullExpressionValue(obj, "");
            AFLogger.afErrorLog(obj, th);
        }
        int i5 = i + 3;
        w = i5 % 128;
        int i6 = i5 % 2;
    }

    private void i(Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = i + 27;
        w = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        boolean AFAdRevenueData = AFg1zSDK.AFAdRevenueData(this.AFAdRevenueData);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=" + AFAdRevenueData);
        if (!AFAdRevenueData) {
            map.put("tokenRefreshConfigured", Boolean.FALSE);
            int i5 = w + 25;
            i = i5 % 128;
            int i6 = i5 % 2;
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1zSDK.getRevenue(this.areAllFieldsValid)));
    }

    private void e(Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = w + 21;
        i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFb1lSDK k_ = AFb1iSDK.k_(this.AFAdRevenueData.getContentResolver());
        if (k_ == null) {
            int i5 = i + 37;
            w = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        int i7 = i + 77;
        w = i7 % 128;
        if (i7 % 2 == 0) {
            map.put("amazon_aid", k_.getMonetizationNetwork);
            map.put("amazon_aid_limit", String.valueOf(k_.getCurrencyIso4217Code));
        } else {
            map.put("amazon_aid", k_.getMonetizationNetwork);
            map.put("amazon_aid_limit", String.valueOf(k_.getCurrencyIso4217Code));
            int i8 = 47 / 0;
        }
    }

    private void afDebugLog(Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = i + 59;
        w = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            this.areAllFieldsValid.getCurrencyIso4217Code("is_stop_tracking_used");
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        if (this.areAllFieldsValid.getCurrencyIso4217Code("is_stop_tracking_used")) {
            map.put("istu", String.valueOf(this.areAllFieldsValid.AFAdRevenueData("is_stop_tracking_used", false)));
            int i4 = w + 35;
            i = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = i + 49;
        w = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i2 = 2 % 2;
        int i3 = i + 13;
        w = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            aFg1uSDK.equals.getRevenue();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String revenue = aFg1uSDK.equals.getRevenue();
        String str = revenue;
        if (str != null) {
            int i4 = i + 25;
            w = i4 % 128;
            if (i4 % 2 != 0) {
                str.length();
                throw null;
            }
            if (str.length() != 0) {
                map.put("appsflyerKey", revenue);
                return null;
            }
        }
        int i5 = i + 85;
        w = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private void v(Map<String, Object> map) {
        String str;
        AFc1kSDK aFc1kSDK;
        int i2 = 2 % 2;
        int i3 = w + 19;
        i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
            int i5 = w + 37;
            i = i5 % 128;
            try {
                if (i5 % 2 == 0) {
                    this.AFAdRevenueData.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                    aFc1kSDK = this.component3;
                } else {
                    this.AFAdRevenueData.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                    aFc1kSDK = this.component3;
                }
                str = aFc1kSDK.getMediationNetwork(this.AFAdRevenueData);
            } catch (Throwable unused) {
                str = null;
            }
            if (str != null) {
                int i6 = i + 55;
                w = i6 % 128;
                if (i6 % 2 == 0) {
                    map.put("fb", str);
                } else {
                    map.put("fb", str);
                    int i7 = 64 / 0;
                }
            }
        }
    }

    private void afErrorLog(Map<String, Object> map) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFb1cSDK aFb1cSDK = this.copy.areAllFieldsValid;
        if (aFb1cSDK != null) {
            map.put("app_set_id", MapsKt.mapOf(TuplesKt.to("scope", Integer.valueOf(aFb1cSDK.getCurrencyIso4217Code)), TuplesKt.to("id", aFb1cSDK.AFAdRevenueData)));
            int i3 = i + 73;
            w = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i4 = w + 27;
        i = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
    }

    private static String getMonetizationNetwork(AFc1sSDK aFc1sSDK, String str) {
        int i2 = 2 % 2;
        String AFAdRevenueData = aFc1sSDK.AFAdRevenueData("CACHED_CHANNEL", (String) null);
        if (AFAdRevenueData != null) {
            int i3 = i + 115;
            int i4 = i3 % 128;
            w = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = i4 + 85;
            i = i5 % 128;
            int i6 = i5 % 2;
            return AFAdRevenueData;
        }
        aFc1sSDK.getRevenue("CACHED_CHANNEL", str);
        int i7 = i + 65;
        w = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    private static String getMediationNetwork(String str) {
        int i2 = 2 % 2;
        int i3 = i + 97;
        w = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.checkNotNull(invoke, "");
            String str2 = (String) invoke;
            int i5 = i + 35;
            w = i5 % 128;
            if (i5 % 2 == 0) {
                return str2;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    private final String getCurrencyIso4217Code(String str) {
        int i2 = 2 % 2;
        int i3 = i + 63;
        w = i3 % 128;
        int i4 = i3 % 2;
        AFc1kSDK aFc1kSDK = this.component3;
        if (i4 == 0) {
            return aFc1kSDK.getCurrencyIso4217Code(str);
        }
        aFc1kSDK.getCurrencyIso4217Code(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String registerClient() {
        int i2 = 2 % 2;
        File AFAdRevenueData = AFAdRevenueData(getMediationNetwork("ro.appsflyer.preinstall.path"));
        if (getMonetizationNetwork(AFAdRevenueData)) {
            int i3 = w + 41;
            i = i3 % 128;
            int i4 = i3 % 2;
            AFAdRevenueData = AFAdRevenueData(getCurrencyIso4217Code("AF_PRE_INSTALL_PATH"));
        }
        if (getMonetizationNetwork(AFAdRevenueData)) {
            int i5 = w + 87;
            i = i5 % 128;
            if (i5 % 2 == 0) {
                AFAdRevenueData("/data/local/tmp/pre_install.appsflyer");
                throw null;
            }
            AFAdRevenueData = AFAdRevenueData("/data/local/tmp/pre_install.appsflyer");
        }
        if (getMonetizationNetwork(AFAdRevenueData)) {
            int i6 = i + 45;
            w = i6 % 128;
            if (i6 % 2 != 0) {
                AFAdRevenueData = AFAdRevenueData("/etc/pre_install.appsflyer");
                int i7 = 57 / 0;
            } else {
                AFAdRevenueData = AFAdRevenueData("/etc/pre_install.appsflyer");
            }
            int i8 = i + 109;
            w = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 5 % 2;
            }
        }
        if (getMonetizationNetwork(AFAdRevenueData)) {
            return null;
        }
        String packageName = this.AFAdRevenueData.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        return getCurrencyIso4217Code(AFAdRevenueData, packageName);
    }

    private static File AFAdRevenueData(String str) {
        int i2 = 2 % 2;
        if (str != null) {
            try {
                if (StringsKt.trim((CharSequence) str).toString().length() > 0) {
                    int i3 = i + 21;
                    w = i3 % 128;
                    if (i3 % 2 == 0) {
                        return new File(StringsKt.trim((CharSequence) str).toString());
                    }
                } else {
                    int i4 = w + 27;
                    i = i4 % 128;
                    int i5 = i4 % 2;
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getMessage(), th);
            }
        }
        int i6 = i + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        w = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    private static boolean getMonetizationNetwork(File file) {
        int i2 = 2 % 2;
        int i3 = i;
        int i4 = i3 + 35;
        w = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (file == null) {
            return true;
        }
        int i5 = i3 + 15;
        w = i5 % 128;
        int i6 = i5 % 2;
        boolean exists = file.exists();
        if (i6 != 0) {
            int i7 = 72 / 0;
            if (!exists) {
                return true;
            }
        } else if (!exists) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0056 -> B:25:0x0082). Please report as a decompilation issue!!! */
    private static String getCurrencyIso4217Code(File file, String str) {
        InputStreamReader inputStreamReader;
        int i2 = 2 % 2;
        int i3 = i + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        w = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        try {
            try {
                if (file == null) {
                    return null;
                }
                try {
                    Properties properties = new Properties();
                    inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
                    try {
                        properties.load(inputStreamReader);
                        AFLogger.afInfoLog("Found PreInstall property!");
                        String property = properties.getProperty(str);
                        try {
                            inputStreamReader.close();
                            return property;
                        } catch (Throwable th) {
                            AFLogger.afErrorLog(th.getMessage(), th);
                            return property;
                        }
                    } catch (FileNotFoundException unused) {
                        AFLogger.afDebugLog("PreInstall file wasn't found: " + file.getAbsolutePath());
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        AFLogger.afErrorLog(th.getMessage(), th);
                        if (inputStreamReader == null) {
                            int i4 = i + 93;
                            w = i4 % 128;
                            int i5 = i4 % 2;
                        } else {
                            inputStreamReader.close();
                        }
                        return null;
                    }
                } catch (FileNotFoundException unused2) {
                    inputStreamReader = null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = null;
                }
            } catch (Throwable th4) {
                if (inputStreamReader != null) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th5) {
                        AFLogger.afErrorLog(th5.getMessage(), th5);
                    }
                }
                throw th4;
            }
        } catch (Throwable th6) {
            AFLogger.afErrorLog(th6.getMessage(), th6);
        }
    }

    private final boolean AFInAppEventType() {
        int i2 = 2 % 2;
        if (!getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            int i3 = w + 19;
            i = i3 % 128;
            int i4 = i3 % 2;
            if (!getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                int i5 = w + 93;
                i = i5 % 128;
                int i6 = i5 % 2;
                AFa1zSDK.getMonetizationNetwork();
                if (i6 == 0) {
                    AFa1zSDK.getMonetizationNetwork(this.AFAdRevenueData);
                    throw null;
                }
                if (AFa1zSDK.getMonetizationNetwork(this.AFAdRevenueData)) {
                    return false;
                }
            }
        }
        int i7 = w + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        i = i7 % 128;
        if (i7 % 2 != 0) {
            return true;
        }
        throw null;
    }

    private static void getCurrencyIso4217Code(Map<String, Object> map, AFh1tSDK aFh1tSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFh1tSDK, "");
        String str = aFh1tSDK.component3;
        if (str != null) {
            map.put(X3.i.j0, str);
            map.put("eventValue", new JSONObject(aFh1tSDK.getRevenue == null ? new HashMap() : aFh1tSDK.getRevenue).toString());
        }
    }

    private void afInfoLog(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, 1072860105, -1072860098, System.identityHashCode(this));
    }

    private void AFInAppEventType(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -952054668, 952054677, System.identityHashCode(this));
    }

    private static void AFInAppEventParameterName(Map<String, Object> map) {
        getRevenue(new Object[]{map}, 1729638864, -1729638864, (int) System.currentTimeMillis());
    }

    private static void component3(Map<String, Object> map) {
        getRevenue(new Object[]{map}, -260988684, 260988687, (int) System.currentTimeMillis());
    }

    private String component1() {
        return (String) getRevenue(new Object[]{this}, -1813533339, 1813533344, System.identityHashCode(this));
    }

    private void AFAdRevenueData(Map<String, Object> map, String str) {
        getRevenue(new Object[]{this, map, str}, 22668144, -22668132, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1tSDK
    public final void AFAdRevenueData(AFh1tSDK aFh1tSDK) {
        getRevenue(new Object[]{this, aFh1tSDK}, 919507137, -919507136, System.identityHashCode(this));
    }

    private void areAllFieldsValid(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, 252198665, -252198654, System.identityHashCode(this));
    }

    private void getMonetizationNetwork(Map<String, Object> map, boolean z) {
        getRevenue(new Object[]{this, map, Boolean.valueOf(z)}, 491464520, -491464516, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1tSDK
    public final Long getCurrencyIso4217Code() {
        return (Long) getRevenue(new Object[]{this}, 544119822, -544119812, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1tSDK
    public final void getMediationNetwork(AFh1tSDK aFh1tSDK) {
        getRevenue(new Object[]{this, aFh1tSDK}, 773674548, -773674546, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1tSDK
    public final void getCurrencyIso4217Code(AFh1tSDK aFh1tSDK) {
        getRevenue(new Object[]{this, aFh1tSDK}, 2099834135, -2099834129, System.identityHashCode(this));
    }

    private final SimpleDateFormat getRevenue() {
        return (SimpleDateFormat) getRevenue(new Object[]{this}, -65907378, 65907386, System.identityHashCode(this));
    }
}
