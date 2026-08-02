package com.appsflyer.internal;

import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;
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

/* loaded from: classes6.dex */
public final class AFe1qSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    public static String AFAdRevenueData = null;
    private static int component2 = 0;
    private static int component3 = 1;
    private static long component4;
    private static String getRevenue;
    private final AFe1gSDK areAllFieldsValid;
    private final AppsFlyerProperties getCurrencyIso4217Code;
    private final AFe1vSDK getMediationNetwork;
    private final AFd1rSDK getMonetizationNetwork;

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = (i * (-1831)) + (i2 * 917) + ((~(i4 | i2)) * 2748);
        int i6 = i4 | (~i2);
        int i7 = i5 + (i6 * (-916)) + (((~(i | i2)) | (~i6)) * 916);
        return i7 != 1 ? i7 != 2 ? getCurrencyIso4217Code(objArr) : AFAdRevenueData(objArr) : getMonetizationNetwork(objArr);
    }

    static {
        getMonetizationNetwork();
        AFAdRevenueData = "https://%sgcdsdk.%s/install_data/v5.0/";
        getRevenue = "https://%sonelink.%s/shortlink-sdk/v2";
        int i = component2 + 89;
        component3 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
    
        r13 = r13.toCharArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
    
        if (r13 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r13 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(String str, int i, Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = $11 + 113;
        $10 = i3 % 128;
        char[] cArr = str;
        if (i3 % 2 != 0) {
            int i4 = 69 / 0;
            cArr = str;
        }
        AFk1nSDK aFk1nSDK = new AFk1nSDK();
        char[] AFAdRevenueData2 = AFk1nSDK.AFAdRevenueData(component4 ^ 5831764823114026367L, cArr, i);
        aFk1nSDK.AFAdRevenueData = 4;
        while (aFk1nSDK.AFAdRevenueData < AFAdRevenueData2.length) {
            aFk1nSDK.getMediationNetwork = aFk1nSDK.AFAdRevenueData - 4;
            AFAdRevenueData2[aFk1nSDK.AFAdRevenueData] = (char) ((AFAdRevenueData2[aFk1nSDK.AFAdRevenueData] ^ AFAdRevenueData2[aFk1nSDK.AFAdRevenueData % 4]) ^ (aFk1nSDK.getMediationNetwork * (component4 ^ 5831764823114026367L)));
            aFk1nSDK.AFAdRevenueData++;
            int i5 = $10 + 57;
            $11 = i5 % 128;
            int i6 = i5 % 2;
        }
        objArr[0] = new String(AFAdRevenueData2, 4, AFAdRevenueData2.length - 4);
    }

    public AFe1qSDK(AFe1vSDK aFe1vSDK, AFd1rSDK aFd1rSDK, AppsFlyerProperties appsFlyerProperties, AFe1gSDK aFe1gSDK) {
        this.getMediationNetwork = aFe1vSDK;
        this.getMonetizationNetwork = aFd1rSDK;
        this.getCurrencyIso4217Code = appsFlyerProperties;
        this.areAllFieldsValid = aFe1gSDK;
    }

    public final AFe1rSDK<String> getMonetizationNetwork(Map<String, Object> map, String str, String str2) {
        String mediationNetwork;
        int i = 2 % 2;
        int i2 = component2 + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Object[] objArr = {map, str};
            Object obj = AFa1vSDK.AFLogger.get(-1592476798);
            if (obj == null) {
                obj = ((Class) AFa1vSDK.AFAdRevenueData((char) (59275 - View.MeasureSpec.getMode(0)), Gravity.getAbsoluteGravity(0, 0) + 37, TextUtils.lastIndexOf("", '0') + 38)).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                AFa1vSDK.AFLogger.put(-1592476798, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            AFj1iSDK aFj1iSDK = new AFj1iSDK(this.getMonetizationNetwork);
            String str3 = str2;
            if (str3 != null) {
                int i4 = component3 + 35;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                if (str3.length() != 0) {
                    if (!new Regex("4.?(\\d+)?.?(\\d+)").matches(str3) && !new Regex("3.?(\\d+)?.?(\\d+)").matches(str3)) {
                        mediationNetwork = aFj1iSDK.getMediationNetwork.getMediationNetwork("https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=");
                        return getRevenue(new AFe1nSDK(aFj1iSDK.getMonetizationNetwork(aFj1iSDK.getCurrencyIso4217Code(mediationNetwork)), bArr, "POST", Collections.EMPTY_MAP, true), new AFe1oSDK());
                    }
                    mediationNetwork = aFj1iSDK.getMediationNetwork.getMediationNetwork("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
                    return getRevenue(new AFe1nSDK(aFj1iSDK.getMonetizationNetwork(aFj1iSDK.getCurrencyIso4217Code(mediationNetwork)), bArr, "POST", Collections.EMPTY_MAP, true), new AFe1oSDK());
                }
            }
            int i6 = component3 + 25;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            mediationNetwork = aFj1iSDK.getMediationNetwork.getMediationNetwork("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
            return getRevenue(new AFe1nSDK(aFj1iSDK.getMonetizationNetwork(aFj1iSDK.getCurrencyIso4217Code(mediationNetwork)), bArr, "POST", Collections.EMPTY_MAP, true), new AFe1oSDK());
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Exception e) {
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
                return null;
            }
        }
    }

    public final AFe1rSDK<String> getMediationNetwork(Map<String, Object> map, String str, String str2) {
        String mediationNetwork;
        int i = 2 % 2;
        int i2 = component3 + 81;
        component2 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                try {
                    Object[] objArr = {map, str};
                    Object obj2 = AFa1vSDK.AFLogger.get(-1592476798);
                    if (obj2 == null) {
                        obj2 = ((Class) AFa1vSDK.AFAdRevenueData((char) (59275 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 37 - (ViewConfiguration.getFadingEdgeLength() >> 16), 37 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                        AFa1vSDK.AFLogger.put(-1592476798, obj2);
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
                Object obj3 = AFa1vSDK.AFLogger.get(-1592476798);
                if (obj3 == null) {
                    obj3 = ((Class) AFa1vSDK.AFAdRevenueData((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 59275), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36, 37 - TextUtils.getCapsMode("", 0, 0))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                    AFa1vSDK.AFLogger.put(-1592476798, obj3);
                }
                byte[] bArr = (byte[]) ((Method) obj3).invoke(null, objArr2);
                AFj1iSDK aFj1iSDK = new AFj1iSDK(this.getMonetizationNetwork);
                String str3 = str2;
                if (str3 != null) {
                    int i3 = component3 + 53;
                    component2 = i3 % 128;
                    if (i3 % 2 != 0) {
                        str3.length();
                        obj.hashCode();
                        throw null;
                    }
                    if (str3.length() != 0 && !new Regex("4.?(\\d+)?.?(\\d+)").matches(str3) && !new Regex("3.?(\\d+)?.?(\\d+)").matches(str3)) {
                        mediationNetwork = aFj1iSDK.getMediationNetwork.getMediationNetwork("https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=");
                        return getRevenue(new AFe1nSDK(aFj1iSDK.getMonetizationNetwork(aFj1iSDK.getCurrencyIso4217Code(mediationNetwork)), bArr, "POST", Collections.EMPTY_MAP, true), new AFe1oSDK());
                    }
                }
                mediationNetwork = aFj1iSDK.getMediationNetwork.getMediationNetwork("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
                return getRevenue(new AFe1nSDK(aFj1iSDK.getMonetizationNetwork(aFj1iSDK.getCurrencyIso4217Code(mediationNetwork)), bArr, "POST", Collections.EMPTY_MAP, true), new AFe1oSDK());
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
            return null;
        }
        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
        return null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFe1qSDK aFe1qSDK = (AFe1qSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = component3 + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Object[] objArr2 = {map, str};
            Object obj = AFa1vSDK.AFLogger.get(-1592476798);
            if (obj == null) {
                obj = ((Class) AFa1vSDK.AFAdRevenueData((char) (TextUtils.indexOf("", "") + 59275), 37 - (ViewConfiguration.getFadingEdgeLength() >> 16), 37 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                AFa1vSDK.AFLogger.put(-1592476798, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr2);
            AFj1iSDK aFj1iSDK = new AFj1iSDK(aFe1qSDK.getMonetizationNetwork);
            AFe1rSDK revenue = aFe1qSDK.getRevenue(new AFe1nSDK(aFj1iSDK.getCurrencyIso4217Code(aFj1iSDK.getMediationNetwork.getMediationNetwork("https://%svalidate-and-log.%s/api/v1.0/android/validateAndLog?app_id=")), bArr, "POST", Collections.EMPTY_MAP, true), new AFe1oSDK());
            int i4 = component2 + 21;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return revenue;
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
                AFLogger.INSTANCE.e(AFh1xSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed", th2, false, false);
                return null;
            }
        }
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        String str;
        AFe1qSDK aFe1qSDK = (AFe1qSDK) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
        String str2 = (String) objArr[3];
        ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = component2 + 19;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        AFe1gSDK aFe1gSDK = aFe1qSDK.areAllFieldsValid;
        Intrinsics.checkNotNullParameter(str2, "");
        String str3 = booleanValue ? AFe1gSDK.getRevenue : AFe1gSDK.getMediationNetwork;
        String str4 = booleanValue2 ? "stg" : "";
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        if (AFe1gSDK.getMediationNetwork()) {
            int i4 = component2 + 109;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str = (String) aFe1gSDK.getRevenue.getValue();
        } else {
            str = "";
        }
        String format = String.format(str3, Arrays.copyOf(new Object[]{str, str4, aFe1gSDK.getCurrencyIso4217Code(), str2}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "");
        AFe1nSDK aFe1nSDK = new AFe1nSDK(format, "GET");
        aFe1nSDK.component4 = 1500;
        return aFe1qSDK.getRevenue(aFe1nSDK, new AFe1pSDK());
    }

    public final AFe1rSDK<String> getRevenue(AFa1mSDK aFa1mSDK, String str, AFd1lSDK aFd1lSDK) {
        int i = 2 % 2;
        int i2 = component2 + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Object[] objArr = {aFa1mSDK, str, aFd1lSDK};
            Object obj = AFa1vSDK.AFLogger.get(1104110112);
            if (obj == null) {
                obj = ((Class) AFa1vSDK.AFAdRevenueData((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 59276), 37 - View.getDefaultSize(0, 0), Color.red(0) + 37)).getMethod("getMediationNetwork", AFa1mSDK.class, String.class, AFd1lSDK.class);
                AFa1vSDK.AFLogger.put(1104110112, obj);
            }
            AFe1rSDK<String> revenue = getRevenue(new AFe1nSDK(aFa1mSDK.component1, (byte[]) ((Method) obj).invoke(null, objArr), "POST", Collections.EMPTY_MAP, aFa1mSDK.getRevenue()), new AFe1oSDK());
            int i4 = component3 + 89;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return revenue;
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", th2);
                return null;
            }
        }
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFe1qSDK aFe1qSDK = (AFe1qSDK) objArr[0];
        AFc1jSDK aFc1jSDK = (AFc1jSDK) objArr[1];
        int i = 2 % 2;
        AFe1rSDK revenue = aFe1qSDK.getRevenue(new AFe1nSDK(aFc1jSDK.component1, AFa1oSDK.getMonetizationNetwork((Map<String, ?>) aFc1jSDK.getMonetizationNetwork()).toString().getBytes(Charset.defaultCharset()), "POST", Collections.EMPTY_MAP, aFc1jSDK.getRevenue()), new AFc1qSDK());
        int i2 = component2 + 99;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 15 / 0;
        }
        return revenue;
    }

    public final AFe1rSDK<Map<String, Object>> getRevenue(String str, String str2) {
        int i = 2 % 2;
        String packageName = this.getMonetizationNetwork.getMonetizationNetwork.getCurrencyIso4217Code.getPackageName();
        AFd1rSDK aFd1rSDK = this.getMonetizationNetwork;
        AFe1rSDK<Map<String, Object>> revenue = getRevenue(AFe1uSDK.getCurrencyIso4217Code(packageName, AFb1mSDK.getMediationNetwork(aFd1rSDK.getMonetizationNetwork, aFd1rSDK.getRevenue), str, str2), new AFe1tSDK());
        int i2 = component3 + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return revenue;
    }

    public final AFe1rSDK<String> getMonetizationNetwork(AFh1eSDK aFh1eSDK) {
        int i = 2 % 2;
        AFe1rSDK<String> revenue = getRevenue(new AFe1nSDK(aFh1eSDK.component1, aFh1eSDK.getMediationNetwork(), "POST", Collections.EMPTY_MAP, true), new AFe1oSDK());
        int i2 = component3 + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return revenue;
    }

    public final AFe1rSDK<String> getMonetizationNetwork(String str, Map<String, String> map, String str2, UUID uuid, String str3) {
        int i = 2 % 2;
        String obj = uuid.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", CreateTicketViewModelKt.EmailId);
        hashMap.put("uuid", obj);
        hashMap.put("data", map);
        hashMap.put("meta", getCurrencyIso4217Code());
        if (str2 != null) {
            hashMap.put("brand_domain", str2);
            int i2 = component2 + 71;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 % 5;
            }
        }
        String jSONObject = AFa1oSDK.getMonetizationNetwork(hashMap).toString();
        HashMap hashMap2 = new HashMap();
        Object[] objArr = new Object[1];
        a("廖뻁퀁店\u12bf릴蠜붯\ueedf\ue2de\ud8ffൽ㹢뉬梃\udcd9", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, objArr);
        hashMap2.put(((String) objArr[0]).intern(), getRevenue(str3, obj, "POST", jSONObject));
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName()));
        sb.append("/");
        sb.append(str);
        AFe1rSDK<String> currencyIso4217Code = getCurrencyIso4217Code(new AFe1nSDK(sb.toString(), jSONObject.getBytes(Charset.defaultCharset()), "POST", hashMap2, false), new AFe1oSDK(), true);
        int i4 = component2 + 87;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return currencyIso4217Code;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final AFe1rSDK<Map<String, String>> getRevenue(String str, String str2, UUID uuid, String str3) {
        int i = 2 % 2;
        String obj = uuid.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName()));
        sb.append("/");
        sb.append(str);
        sb.append("?id=");
        sb.append(str2);
        String obj2 = sb.toString();
        Map<String, Object> currencyIso4217Code = getCurrencyIso4217Code();
        String valueOf = String.valueOf(currencyIso4217Code.get(AnalyticsConstantsKt.KEY_BUILD_NUMBER));
        HashMap hashMap = new HashMap();
        hashMap.put("Af-UUID", uuid.toString());
        hashMap.put("Af-Meta-Sdk-Ver", valueOf);
        hashMap.put("Af-Meta-Counter", String.valueOf(currencyIso4217Code.get("counter")));
        hashMap.put("Af-Meta-Model", String.valueOf(currencyIso4217Code.get("model")));
        hashMap.put("Af-Meta-Platform", String.valueOf(currencyIso4217Code.get("platformextension")));
        hashMap.put("Af-Meta-System-Version", String.valueOf(currencyIso4217Code.get("sdk")));
        Object[] objArr = new Object[1];
        a("廖뻁퀁店\u12bf릴蠜붯\ueedf\ue2de\ud8ffൽ㹢뉬梃\udcd9", ViewConfiguration.getJumpTapTimeout() >> 16, objArr);
        hashMap.put(((String) objArr[0]).intern(), getRevenue(str3, obj, "GET", obj, str, str2, valueOf));
        AFe1rSDK<Map<String, String>> revenue = getRevenue(new AFe1nSDK(obj2, null, "GET", hashMap, false), new AFe1hSDK());
        int i2 = component2 + 75;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return revenue;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final AFe1rSDK<String> getRevenue(String str) {
        int i = 2 % 2;
        AFe1nSDK aFe1nSDK = new AFe1nSDK(str, null, "GET", Collections.EMPTY_MAP, false);
        aFe1nSDK.component4 = 10000;
        aFe1nSDK.getMonetizationNetwork = false;
        AFe1rSDK<String> revenue = getRevenue(aFe1nSDK, new AFe1oSDK());
        int i2 = component2 + 109;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return revenue;
        }
        throw null;
    }

    public final AFe1zSDK AFAdRevenueData(Map<String, Object> map, String str) {
        int i = 2 % 2;
        int i2 = component3 + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        try {
            try {
                Object[] objArr = {map, str};
                Object obj2 = AFa1vSDK.AFLogger.get(-1592476798);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1vSDK.AFAdRevenueData((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 59275), 38 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 37 - TextUtils.indexOf("", ""))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                    AFa1vSDK.AFLogger.put(-1592476798, obj2);
                }
                byte[] bArr = (byte[]) ((Method) obj2).invoke(null, objArr);
                if (bArr != null) {
                    return new AFe1zSDK(this.getMonetizationNetwork, bArr);
                }
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: failed to create bytes", new IllegalArgumentException("failed to create bytes from proxyData"));
                int i4 = component2 + 25;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
            return null;
        }
    }

    private <T> AFe1rSDK<T> getRevenue(AFe1nSDK aFe1nSDK, AFe1kSDK<T> aFe1kSDK) {
        int i = 2 % 2;
        int i2 = component2 + 49;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return getCurrencyIso4217Code(aFe1nSDK, aFe1kSDK, AFAdRevenueData());
        }
        getCurrencyIso4217Code(aFe1nSDK, aFe1kSDK, AFAdRevenueData());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private <T> AFe1rSDK<T> getCurrencyIso4217Code(AFe1nSDK aFe1nSDK, AFe1kSDK<T> aFe1kSDK, boolean z) {
        int i = 2 % 2;
        aFe1nSDK.getMediationNetwork = z;
        AFe1vSDK aFe1vSDK = this.getMediationNetwork;
        AFe1rSDK<T> aFe1rSDK = new AFe1rSDK<>(aFe1nSDK, aFe1vSDK.AFAdRevenueData, aFe1vSDK.getMediationNetwork, aFe1kSDK);
        int i2 = component2 + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return aFe1rSDK;
    }

    private Map<String, Object> getCurrencyIso4217Code() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put(AnalyticsConstantsKt.KEY_BUILD_NUMBER, "6.15.1");
        hashMap.put("counter", Integer.valueOf(this.getMonetizationNetwork.getRevenue.AFAdRevenueData("appsFlyerCount", 0)));
        hashMap.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        a("⹈泼\ufbc8⸪삖䎦ꎙ䞀鹌", ViewConfiguration.getEdgeSlop() >> 16, objArr);
        hashMap.put(((String) objArr[0]).intern(), Build.BRAND);
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        AFd1rSDK aFd1rSDK = this.getMonetizationNetwork;
        hashMap.put("app_version_name", AFb1qSDK.getMediationNetwork(aFd1rSDK.getMonetizationNetwork.getCurrencyIso4217Code, aFd1rSDK.getMonetizationNetwork.getCurrencyIso4217Code.getPackageName()));
        hashMap.put("app_id", this.getMonetizationNetwork.getMonetizationNetwork.getCurrencyIso4217Code.getPackageName());
        hashMap.put("platformextension", new AFb1cSDK().getRevenue());
        int i2 = component2 + 125;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return hashMap;
        }
        throw null;
    }

    private static String getRevenue(String str, String str2, String... strArr) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String join = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append("v2");
        String currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(join, sb.toString());
        int i2 = component2 + 119;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return currencyIso4217Code;
        }
        throw null;
    }

    private boolean AFAdRevenueData() {
        int i = 2 % 2;
        int i2 = component2 + 65;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (this.getCurrencyIso4217Code.getBoolean(AppsFlyerProperties.HTTP_CACHE, true)) {
            return false;
        }
        int i4 = component2 + 79;
        component3 = i4 % 128;
        return i4 % 2 != 0;
    }

    static void getMonetizationNetwork() {
        component4 = -1635884646589849241L;
    }

    public final AFe1rSDK<AFc1oSDK> AFAdRevenueData(AFc1jSDK aFc1jSDK) {
        return (AFe1rSDK) getMediationNetwork(new Object[]{this, aFc1jSDK}, -1667700185, 1667700187, System.identityHashCode(this));
    }

    public final AFe1rSDK<AFi1ySDK> getMonetizationNetwork(boolean z, boolean z2, String str, int i) {
        return (AFe1rSDK) getMediationNetwork(new Object[]{this, Boolean.valueOf(z), Boolean.valueOf(z2), str, Integer.valueOf(i)}, 1386933028, -1386933027, i);
    }

    public final AFe1rSDK<String> getMonetizationNetwork(Map<String, Object> map, String str) {
        return (AFe1rSDK) getMediationNetwork(new Object[]{this, map, str}, -1279437846, 1279437846, System.identityHashCode(this));
    }
}
