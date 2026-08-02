package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.sdk.AppLovinErrorCodes;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.common.ConnectionResult;
import com.moloco.sdk.internal.services.bidtoken.s;
import com.vungle.ads.internal.protos.Sdk;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.Mechanism;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class AFd1lSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static String AFAdRevenueData = null;
    private static int component1 = 1;
    private static long component2;
    private static int component4;
    public static String getCurrencyIso4217Code;
    private final AFe1ySDK areAllFieldsValid;
    private final AFj1kSDK component3;
    private final AppsFlyerProperties getMediationNetwork;
    private final AFc1kSDK getMonetizationNetwork;
    private final AFd1nSDK getRevenue;

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i * AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT) + (i2 * AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT);
        int i5 = ~i2;
        int i6 = ~(i5 | i);
        int i7 = ~i;
        int i8 = i4 + ((i6 | (~(i7 | i2 | i3))) * 501) + ((~(i5 | i7)) * 1002) + ((~(i7 | (~i3) | i2)) * 501);
        if (i8 == 1) {
            return getRevenue(objArr);
        }
        if (i8 != 2) {
            return getCurrencyIso4217Code(objArr);
        }
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        int i9 = 2 % 2;
        AFd1mSDK aFd1mSDK = (AFd1mSDK) AFAdRevenueData(new Object[]{aFd1lSDK, AFd1oSDK.getMonetizationNetwork(aFd1lSDK.getMonetizationNetwork.AFAdRevenueData.getMonetizationNetwork.getPackageName(), AFb1kSDK.getMonetizationNetwork(aFd1lSDK.getMonetizationNetwork.getRevenue), (String) objArr[1], (String) objArr[2]), new AFd1fSDK()}, -609567536, 609567536, System.identityHashCode(aFd1lSDK));
        int i10 = component1 + 45;
        component4 = i10 % 128;
        int i11 = i10 % 2;
        return aFd1mSDK;
    }

    static {
        getCurrencyIso4217Code();
        getCurrencyIso4217Code = "https://%sgcdsdk.%s/install_data/v5.0/";
        AFAdRevenueData = "https://%sonelink.%s/shortlink-sdk/v2";
        int i = component1 + 87;
        component4 = i % 128;
        if (i % 2 != 0) {
            int i2 = 87 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0017, code lost:
    
        r10 = r10.toCharArray();
        r1 = com.appsflyer.internal.AFd1lSDK.$11 + 57;
        com.appsflyer.internal.AFd1lSDK.$10 = r1 % 128;
        r1 = r1 % 2;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0015, code lost:
    
        if (r10 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r10 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(String str, int i, Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = $11 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        $10 = i3 % 128;
        char[] cArr = str;
        if (i3 % 2 != 0) {
            int i4 = 40 / 0;
            cArr = str;
        }
        char[] cArr2 = cArr;
        AFk1sSDK aFk1sSDK = new AFk1sSDK();
        aFk1sSDK.getMonetizationNetwork = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        aFk1sSDK.getRevenue = 0;
        while (aFk1sSDK.getRevenue < cArr2.length) {
            jArr[aFk1sSDK.getRevenue] = (cArr2[aFk1sSDK.getRevenue] ^ (aFk1sSDK.getRevenue * aFk1sSDK.getMonetizationNetwork)) ^ (component2 ^ (-5092038237760324761L));
            aFk1sSDK.getRevenue++;
        }
        char[] cArr3 = new char[length];
        aFk1sSDK.getRevenue = 0;
        while (aFk1sSDK.getRevenue < cArr2.length) {
            cArr3[aFk1sSDK.getRevenue] = (char) jArr[aFk1sSDK.getRevenue];
            aFk1sSDK.getRevenue++;
        }
        objArr[0] = new String(cArr3);
    }

    public AFd1lSDK(AFd1nSDK aFd1nSDK, AFc1kSDK aFc1kSDK, AppsFlyerProperties appsFlyerProperties, AFe1ySDK aFe1ySDK, AFj1kSDK aFj1kSDK) {
        this.getRevenue = aFd1nSDK;
        this.getMonetizationNetwork = aFc1kSDK;
        this.getMediationNetwork = appsFlyerProperties;
        this.areAllFieldsValid = aFe1ySDK;
        this.component3 = aFj1kSDK;
    }

    public final AFd1mSDK<String> getRevenue(Map<String, Object> map, String str, String str2) {
        String mediationNetwork;
        String revenue;
        int i = 2 % 2;
        try {
            Object[] objArr = {map, str};
            Object obj = AFa1gSDK.e.get(1923025431);
            if (obj == null) {
                obj = ((Class) AFa1gSDK.getMonetizationNetwork((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37, 197 - TextUtils.indexOf((CharSequence) "", '0'), (char) (Drawable.resolveOpacity(0, 0) + 13426))).getMethod("AFAdRevenueData", Map.class, String.class);
                AFa1gSDK.e.put(1923025431, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            int i2 = component1 + 53;
            component4 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            AFj1kSDK aFj1kSDK = this.component3;
            String str3 = str2;
            if (str3 != null && str3.length() != 0) {
                String str4 = str2;
                if (!new Regex("4.?(\\d+)?.?(\\d+)").matches(str4) && !new Regex("3.?(\\d+)?.?(\\d+)").matches(str4)) {
                    mediationNetwork = aFj1kSDK.getRevenue.getMediationNetwork("https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=");
                    int i3 = component4 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    revenue = aFj1kSDK.getRevenue(aFj1kSDK.getMonetizationNetwork(mediationNetwork), false);
                    return (AFd1mSDK) AFAdRevenueData(new Object[]{this, new AFd1aSDK(revenue, bArr, "POST", Collections.emptyMap(), true), new AFd1iSDK()}, -609567536, 609567536, System.identityHashCode(this));
                }
            }
            int i5 = component4 + 57;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 43 / 0;
                mediationNetwork = aFj1kSDK.getRevenue.getMediationNetwork("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
            } else {
                mediationNetwork = aFj1kSDK.getRevenue.getMediationNetwork("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
            }
            revenue = aFj1kSDK.getRevenue(aFj1kSDK.getMonetizationNetwork(mediationNetwork), false);
            return (AFd1mSDK) AFAdRevenueData(new Object[]{this, new AFd1aSDK(revenue, bArr, "POST", Collections.emptyMap(), true), new AFd1iSDK()}, -609567536, 609567536, System.identityHashCode(this));
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFh1zSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th2, false, false);
                return null;
            }
        }
    }

    public final AFd1mSDK<String> getMonetizationNetwork(Map<String, Object> map, String str, String str2) {
        String mediationNetwork;
        String revenue;
        int i = 2 % 2;
        try {
            Object[] objArr = {map, str};
            Object obj = AFa1gSDK.e.get(1923025431);
            if (obj == null) {
                obj = ((Class) AFa1gSDK.getMonetizationNetwork((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 38, 198 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (13426 - TextUtils.indexOf("", "", 0, 0)))).getMethod("AFAdRevenueData", Map.class, String.class);
                AFa1gSDK.e.put(1923025431, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            AFj1kSDK aFj1kSDK = this.component3;
            String str3 = str2;
            if (str3 == null || str3.length() == 0 || new Regex("4.?(\\d+)?.?(\\d+)").matches(str3) || new Regex("3.?(\\d+)?.?(\\d+)").matches(str3)) {
                int i2 = component1 + 101;
                component4 = i2 % 128;
                int i3 = i2 % 2;
                mediationNetwork = aFj1kSDK.getRevenue.getMediationNetwork("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
            } else {
                int i4 = component1 + 11;
                component4 = i4 % 128;
                int i5 = i4 % 2;
                mediationNetwork = aFj1kSDK.getRevenue.getMediationNetwork("https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=");
            }
            revenue = aFj1kSDK.getRevenue(aFj1kSDK.getMonetizationNetwork(mediationNetwork), false);
            return (AFd1mSDK) AFAdRevenueData(new Object[]{this, new AFd1aSDK(revenue, bArr, "POST", Collections.emptyMap(), true), new AFd1iSDK()}, -609567536, 609567536, System.identityHashCode(this));
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFh1zSDK.ENGAGEMENT, "AFFinalizer: reflection init failed.", th2, false, false);
                return null;
            }
        }
    }

    public final AFd1mSDK<String> AFAdRevenueData(Map<String, Object> map, String str) {
        int i = 2 % 2;
        int i2 = component4 + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Object[] objArr = {map, str};
            Object obj = AFa1gSDK.e.get(1923025431);
            if (obj == null) {
                obj = ((Class) AFa1gSDK.getMonetizationNetwork(38 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 198, (char) (13426 - (ViewConfiguration.getWindowTouchSlop() >> 8)))).getMethod("AFAdRevenueData", Map.class, String.class);
                AFa1gSDK.e.put(1923025431, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            AFj1kSDK aFj1kSDK = this.component3;
            AFd1mSDK<String> aFd1mSDK = (AFd1mSDK) AFAdRevenueData(new Object[]{this, new AFd1aSDK(aFj1kSDK.getMonetizationNetwork(aFj1kSDK.getRevenue.getMediationNetwork("https://%svalidate-and-log.%s/api/v1.0/android/validateAndLog?app_id=")), bArr, "POST", Collections.emptyMap(), true), new AFd1iSDK()}, -609567536, 609567536, System.identityHashCode(this));
            int i4 = component4 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return aFd1mSDK;
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFh1zSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th2, false, false);
                return null;
            }
        }
    }

    public final AFd1mSDK<AFi1zSDK> getCurrencyIso4217Code(boolean z, boolean z2, String str, int i) {
        String str2;
        int i2 = 2 % 2;
        AFe1ySDK aFe1ySDK = this.areAllFieldsValid;
        Intrinsics.checkNotNullParameter(str, "");
        String str3 = z ? AFe1ySDK.getMonetizationNetwork : AFe1ySDK.getRevenue;
        String str4 = z2 ? "stg" : "";
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        if (AFe1ySDK.getRevenue()) {
            int i3 = component4 + 61;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            str2 = (String) aFe1ySDK.getMediationNetwork.getValue();
        } else {
            str2 = "";
        }
        String format = String.format(str3, Arrays.copyOf(new Object[]{str2, str4, aFe1ySDK.AFAdRevenueData(), str}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "");
        AFd1aSDK aFd1aSDK = new AFd1aSDK(format, "GET");
        aFd1aSDK.component2 = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        AFd1mSDK<AFi1zSDK> aFd1mSDK = (AFd1mSDK) AFAdRevenueData(new Object[]{this, aFd1aSDK, new AFd1hSDK()}, -609567536, 609567536, System.identityHashCode(this));
        int i5 = component1 + 1;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
        return aFd1mSDK;
    }

    public final AFd1mSDK<String> AFAdRevenueData(AFh1tSDK aFh1tSDK, String str, AFc1hSDK aFc1hSDK) {
        Throwable th;
        AFd1mSDK<String> aFd1mSDK;
        byte[] bArr;
        String mediationNetwork;
        String mediationNetwork2;
        int i = 2 % 2;
        int i2 = component4 + 83;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            try {
                try {
                    Object[] objArr = {aFh1tSDK, str, aFc1hSDK};
                    Object obj2 = AFa1gSDK.e.get(-1357306406);
                    if (obj2 == null) {
                        obj2 = ((Class) AFa1gSDK.getMonetizationNetwork((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 37, 198 - View.MeasureSpec.getSize(0), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13426))).getMethod("getMonetizationNetwork", AFh1tSDK.class, String.class, AFc1hSDK.class);
                        AFa1gSDK.e.put(-1357306406, obj2);
                    }
                    bArr = (byte[]) ((Method) obj2).invoke(null, objArr);
                    int i3 = 57 / 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                aFd1mSDK = null;
                AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "AFFinalizer: reflection init failed.", th, false, false);
                return aFd1mSDK;
            }
        } else {
            try {
                Object[] objArr2 = {aFh1tSDK, str, aFc1hSDK};
                Object obj3 = AFa1gSDK.e.get(-1357306406);
                if (obj3 == null) {
                    obj3 = ((Class) AFa1gSDK.getMonetizationNetwork(38 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), View.resolveSize(0, 0) + 198, (char) (13426 - View.MeasureSpec.makeMeasureSpec(0, 0)))).getMethod("getMonetizationNetwork", AFh1tSDK.class, String.class, AFc1hSDK.class);
                    AFa1gSDK.e.put(-1357306406, obj3);
                }
                bArr = (byte[]) ((Method) obj3).invoke(null, objArr2);
            } catch (Throwable th4) {
                aFd1mSDK = null;
                try {
                    Throwable cause2 = th4.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th4;
                } catch (Throwable th5) {
                    th = th5;
                    AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "AFFinalizer: reflection init failed.", th, false, false);
                    return aFd1mSDK;
                }
            }
        }
        byte[] bArr2 = bArr;
        AFj1kSDK aFj1kSDK = this.component3;
        Intrinsics.checkNotNullParameter(aFh1tSDK, "");
        boolean AFAdRevenueData2 = aFh1tSDK.AFAdRevenueData();
        boolean z = aFh1tSDK instanceof AFh1pSDK;
        boolean z2 = aFh1tSDK instanceof AFh1sSDK;
        boolean z3 = aFh1tSDK instanceof AFh1oSDK;
        boolean z4 = aFh1tSDK instanceof AFh1eSDK;
        boolean z5 = aFh1tSDK instanceof AFh1kSDK;
        boolean z6 = aFh1tSDK instanceof AFg1xSDK;
        if (aFh1tSDK instanceof AFh1lSDK) {
            mediationNetwork = aFj1kSDK.getRevenue.getMediationNetwork("https://%spia.%s/api/v1.0/pia-android-event?app_id=");
            int i4 = component4 + 59;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 3;
            }
        } else {
            if (!z3) {
                int i6 = component1 + 5;
                int i7 = i6 % 128;
                component4 = i7;
                if (i6 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (!z2) {
                    if (z) {
                        mediationNetwork = aFj1kSDK.getRevenue.getMediationNetwork(AFj1kSDK.getMediationNetwork);
                    } else if (z4) {
                        mediationNetwork = aFj1kSDK.getRevenue.getMediationNetwork(AFj1kSDK.areAllFieldsValid);
                    } else {
                        if (z5) {
                            int i8 = i7 + 27;
                            component1 = i8 % 128;
                            if (i8 % 2 == 0) {
                                mediationNetwork2 = aFj1kSDK.getRevenue.getMediationNetwork("https://%ssdk-services.%s/validate-android-signature");
                                int i9 = 87 / 0;
                            } else {
                                mediationNetwork2 = aFj1kSDK.getRevenue.getMediationNetwork("https://%ssdk-services.%s/validate-android-signature");
                            }
                            return (AFd1mSDK) AFAdRevenueData(new Object[]{this, new AFd1aSDK(mediationNetwork2, bArr2, "POST", Collections.emptyMap(), aFh1tSDK.getCurrencyIso4217Code()), new AFd1iSDK()}, -609567536, 609567536, System.identityHashCode(this));
                        }
                        mediationNetwork = z6 ? aFj1kSDK.getRevenue.getMediationNetwork(AFj1kSDK.component4) : AFAdRevenueData2 ? aFh1tSDK.component1 < 2 ? aFj1kSDK.getRevenue.getMediationNetwork(AFj1kSDK.getMonetizationNetwork) : aFj1kSDK.getRevenue.getMediationNetwork(AFj1kSDK.component3) : aFj1kSDK.getRevenue.getMediationNetwork(AFj1kSDK.component2);
                    }
                }
            }
            mediationNetwork = aFj1kSDK.getRevenue.getMediationNetwork(AFj1kSDK.AFAdRevenueData);
        }
        mediationNetwork2 = aFj1kSDK.getRevenue(AFj1kSDK.getMonetizationNetwork(aFj1kSDK.getMonetizationNetwork(mediationNetwork), z), z6);
        return (AFd1mSDK) AFAdRevenueData(new Object[]{this, new AFd1aSDK(mediationNetwork2, bArr2, "POST", Collections.emptyMap(), aFh1tSDK.getCurrencyIso4217Code()), new AFd1iSDK()}, -609567536, 609567536, System.identityHashCode(this));
    }

    public final AFd1mSDK<AFa1rSDK> getMediationNetwork(AFa1pSDK aFa1pSDK) {
        int i = 2 % 2;
        AFd1mSDK<AFa1rSDK> aFd1mSDK = (AFd1mSDK) AFAdRevenueData(new Object[]{this, new AFd1aSDK(aFa1pSDK.component2, AFg1mSDK.getMediationNetwork(aFa1pSDK.getMonetizationNetwork).toString().getBytes(Charset.defaultCharset()), "POST", Collections.emptyMap(), aFa1pSDK.getCurrencyIso4217Code()), new AFa1mSDK()}, -609567536, 609567536, System.identityHashCode(this));
        int i2 = component4 + 75;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return aFd1mSDK;
    }

    public final AFd1mSDK<String> getCurrencyIso4217Code(AFh1rSDK aFh1rSDK) {
        int i = 2 % 2;
        AFd1mSDK<String> aFd1mSDK = (AFd1mSDK) AFAdRevenueData(new Object[]{this, new AFd1aSDK(aFh1rSDK.component2, aFh1rSDK.getRevenue(), "POST", Collections.emptyMap(), true), new AFd1iSDK()}, -609567536, 609567536, System.identityHashCode(this));
        int i2 = component1 + 113;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return aFd1mSDK;
    }

    public final AFd1mSDK<String> getCurrencyIso4217Code(String str, Map<String, String> map, String str2, UUID uuid, String str3) {
        int i = 2 % 2;
        String obj = uuid.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", "-1");
        hashMap.put(DebugImage.JsonKeys.UUID, obj);
        hashMap.put("data", map);
        hashMap.put(Mechanism.JsonKeys.META, getMonetizationNetwork());
        if (str2 != null) {
            int i2 = component1 + 45;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            hashMap.put("brand_domain", str2);
            int i4 = component4 + 27;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
        String jSONObject = AFg1mSDK.getMediationNetwork(hashMap).toString();
        HashMap hashMap2 = new HashMap();
        Object[] objArr = new Object[1];
        a("勯먩荁\ue85e\uf143\udeac➆೨ᗒ紲䨖占", 59616 - TextUtils.lastIndexOf("", '0', 0), objArr);
        hashMap2.put(((String) objArr[0]).intern(), (String) AFAdRevenueData(new Object[]{str3, obj, new String[]{"POST", jSONObject}}, -1993823111, 1993823112, (int) System.currentTimeMillis()));
        return getRevenue(new AFd1aSDK(new StringBuilder().append(String.format(AFAdRevenueData, AppsFlyerLib.getInstance().getHostPrefix(), AFa1zSDK.getMonetizationNetwork().getHostName())).append("/").append(str).toString(), jSONObject.getBytes(Charset.defaultCharset()), "POST", hashMap2, false), (AFd1dSDK) new AFd1iSDK(), true);
    }

    public final AFd1mSDK<Map<String, String>> getCurrencyIso4217Code(String str, String str2, UUID uuid, String str3) {
        int i = 2 % 2;
        String obj = uuid.toString();
        String obj2 = new StringBuilder().append(String.format(AFAdRevenueData, AppsFlyerLib.getInstance().getHostPrefix(), AFa1zSDK.getMonetizationNetwork().getHostName())).append("/").append(str).append("?id=").append(str2).toString();
        Map<String, Object> monetizationNetwork = getMonetizationNetwork();
        String valueOf = String.valueOf(monetizationNetwork.get("build_number"));
        HashMap hashMap = new HashMap();
        hashMap.put("Af-UUID", uuid.toString());
        hashMap.put("Af-Meta-Sdk-Ver", valueOf);
        hashMap.put("Af-Meta-Counter", String.valueOf(monetizationNetwork.get("counter")));
        hashMap.put("Af-Meta-Model", String.valueOf(monetizationNetwork.get("model")));
        hashMap.put("Af-Meta-Platform", String.valueOf(monetizationNetwork.get("platformextension")));
        hashMap.put("Af-Meta-System-Version", String.valueOf(monetizationNetwork.get("sdk")));
        Object[] objArr = new Object[1];
        a("勯먩荁\ue85e\uf143\udeac➆೨ᗒ紲䨖占", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 59618, objArr);
        hashMap.put(((String) objArr[0]).intern(), (String) AFAdRevenueData(new Object[]{str3, obj, new String[]{"GET", obj, str, str2, valueOf}}, -1993823111, 1993823112, (int) System.currentTimeMillis()));
        AFd1mSDK<Map<String, String>> aFd1mSDK = (AFd1mSDK) AFAdRevenueData(new Object[]{this, new AFd1aSDK(obj2, null, "GET", hashMap, false), new AFd1eSDK()}, -609567536, 609567536, System.identityHashCode(this));
        int i2 = component4 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return aFd1mSDK;
        }
        throw null;
    }

    public final AFd1mSDK<String> getMediationNetwork(String str) {
        int i = 2 % 2;
        AFd1aSDK aFd1aSDK = new AFd1aSDK(str, null, "GET", Collections.emptyMap(), false);
        aFd1aSDK.component2 = 10000;
        aFd1aSDK.getMonetizationNetwork = false;
        AFd1mSDK<String> aFd1mSDK = (AFd1mSDK) AFAdRevenueData(new Object[]{this, aFd1aSDK, new AFd1iSDK()}, -609567536, 609567536, System.identityHashCode(this));
        int i2 = component1 + 99;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 81 / 0;
        }
        return aFd1mSDK;
    }

    public final AFd1qSDK getRevenue(Map<String, Object> map, String str) {
        int i = 2 % 2;
        int i2 = component1 + 7;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        try {
            try {
                Object[] objArr = {map, str};
                Object obj = AFa1gSDK.e.get(1923025431);
                if (obj == null) {
                    obj = ((Class) AFa1gSDK.getMonetizationNetwork(View.getDefaultSize(0, 0) + 37, 197 - ExpandableListView.getPackedPositionChild(0L), (char) (13426 - TextUtils.indexOf("", "", 0)))).getMethod("AFAdRevenueData", Map.class, String.class);
                    AFa1gSDK.e.put(1923025431, obj);
                }
                byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
                if (bArr == null) {
                    AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "AFFinalizer: failed to create bytes.", new IllegalArgumentException("Failed to create bytes from proxyData, bytes are null"), false, false);
                    return null;
                }
                AFd1qSDK aFd1qSDK = new AFd1qSDK(this.getMonetizationNetwork, bArr);
                int i4 = component1 + 91;
                component4 = i4 % 128;
                if (i4 % 2 == 0) {
                    return aFd1qSDK;
                }
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "AFFinalizer: reflection init failed.", th2, false, false);
            return null;
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        AFd1aSDK aFd1aSDK = (AFd1aSDK) objArr[1];
        AFd1dSDK aFd1dSDK = (AFd1dSDK) objArr[2];
        int i = 2 % 2;
        int i2 = component4 + 101;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        AFd1mSDK revenue = aFd1lSDK.getRevenue(aFd1aSDK, aFd1dSDK, aFd1lSDK.getMediationNetwork());
        int i4 = component1 + 77;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
        return revenue;
    }

    private <T> AFd1mSDK<T> getRevenue(AFd1aSDK aFd1aSDK, AFd1dSDK<T> aFd1dSDK, boolean z) {
        int i = 2 % 2;
        aFd1aSDK.getRevenue = z;
        AFd1nSDK aFd1nSDK = this.getRevenue;
        AFd1mSDK<T> aFd1mSDK = new AFd1mSDK<>(aFd1aSDK, aFd1nSDK.AFAdRevenueData, aFd1nSDK.getCurrencyIso4217Code, aFd1dSDK);
        int i2 = component1 + 59;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return aFd1mSDK;
    }

    private Map<String, Object> getMonetizationNetwork() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.16.2");
        hashMap.put("counter", Integer.valueOf(this.getMonetizationNetwork.getRevenue.AFAdRevenueData("appsFlyerCount", 0)));
        hashMap.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        a("勌\uefe9⢥敟ꘞ", Color.alpha(0) + 48437, objArr);
        hashMap.put(((String) objArr[0]).intern(), Build.BRAND);
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        AFc1kSDK aFc1kSDK = this.getMonetizationNetwork;
        hashMap.put("app_version_name", AFj1nSDK.getCurrencyIso4217Code(aFc1kSDK.AFAdRevenueData.getMonetizationNetwork, aFc1kSDK.AFAdRevenueData.getMonetizationNetwork.getPackageName()));
        hashMap.put("app_id", this.getMonetizationNetwork.AFAdRevenueData.getMonetizationNetwork.getPackageName());
        hashMap.put("platformextension", new AFa1ySDK().getMediationNetwork());
        int i2 = component4 + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return hashMap;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(Arrays.asList((String[]) objArr[2]));
        arrayList.add(1, s.a);
        String AFAdRevenueData2 = AFj1hSDK.AFAdRevenueData(TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0])), new StringBuilder().append(str).append(str2).append(s.a).toString());
        int i2 = component4 + 49;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return AFAdRevenueData2;
        }
        throw null;
    }

    private boolean getMediationNetwork() {
        int i = 2 % 2;
        if (!(!this.getMediationNetwork.getBoolean(AppsFlyerProperties.HTTP_CACHE, true))) {
            return false;
        }
        int i2 = component1 + 15;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 57;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
        return true;
    }

    static void getCurrencyIso4217Code() {
        component2 = -4707319230439183927L;
    }

    private static String AFAdRevenueData(String str, String str2, String... strArr) {
        return (String) AFAdRevenueData(new Object[]{str, str2, strArr}, -1993823111, 1993823112, (int) System.currentTimeMillis());
    }

    private <T> AFd1mSDK<T> getMediationNetwork(AFd1aSDK aFd1aSDK, AFd1dSDK<T> aFd1dSDK) {
        return (AFd1mSDK) AFAdRevenueData(new Object[]{this, aFd1aSDK, aFd1dSDK}, -609567536, 609567536, System.identityHashCode(this));
    }

    public final AFd1mSDK<Map<String, Object>> getCurrencyIso4217Code(String str, String str2) {
        return (AFd1mSDK) AFAdRevenueData(new Object[]{this, str, str2}, -957016153, 957016155, System.identityHashCode(this));
    }
}
