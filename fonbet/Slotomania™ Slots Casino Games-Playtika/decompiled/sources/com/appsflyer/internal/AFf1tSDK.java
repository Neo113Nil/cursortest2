package com.appsflyer.internal;

import android.graphics.Color;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import io.sentry.protocol.Mechanism;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class AFf1tSDK extends AFe1kSDK<String> {
    private static final AFe1uSDK[] AFInAppEventType = {AFe1uSDK.DLSDK, AFe1uSDK.ONELINK, AFe1uSDK.REGISTER};
    private final AFc1hSDK AFInAppEventParameterName;
    private final AFf1eSDK AFKeystoreWrapper;
    public final AFh1tSDK component1;
    private final AFf1mSDK copy;
    private final AFe1ySDK copydefault;
    private final AFc1kSDK equals;
    protected final AFg1tSDK hashCode;
    protected final AFc1sSDK toString;

    @Override // com.appsflyer.internal.AFe1kSDK
    protected boolean copydefault() {
        return true;
    }

    public AFf1tSDK(AFh1tSDK aFh1tSDK, AFc1fSDK aFc1fSDK) {
        this(aFh1tSDK, aFc1fSDK, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1tSDK(AFh1tSDK aFh1tSDK, AFc1fSDK aFc1fSDK, String str) {
        super(aFh1tSDK.getMediationNetwork(), new AFe1uSDK[]{AFe1uSDK.RC_CDN, AFe1uSDK.FETCH_ADVERTISING_ID}, aFc1fSDK, str);
        this.component1 = aFh1tSDK;
        this.copydefault = aFc1fSDK.AFInAppEventType();
        this.toString = aFc1fSDK.component1();
        this.copy = aFc1fSDK.component4();
        this.AFInAppEventParameterName = aFc1fSDK.AFLogger();
        this.equals = aFc1fSDK.getRevenue();
        this.hashCode = aFc1fSDK.component3();
        this.AFKeystoreWrapper = aFc1fSDK.v();
        for (AFe1uSDK aFe1uSDK : AFInAppEventType) {
            if (this.getMonetizationNetwork == aFe1uSDK) {
                return;
            }
        }
        int i = this.component1.component1;
        AFe1uSDK aFe1uSDK2 = this.getMonetizationNetwork;
        if (i <= 0) {
            if (aFe1uSDK2 != AFe1uSDK.CONVERSION) {
                this.AFAdRevenueData.add(AFe1uSDK.CONVERSION);
                return;
            }
            return;
        }
        this.getRevenue.add(AFe1uSDK.CONVERSION);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0144  */
    @Override // com.appsflyer.internal.AFe1kSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final AFd1mSDK<String> getMediationNetwork(String str) {
        double d;
        JSONObject jSONObject;
        String str2;
        String str3;
        Exception exc;
        String str4;
        getRevenue(this.component1);
        if (this.component1.getMonetizationNetwork.containsKey(Mechanism.JsonKeys.META)) {
            try {
                d = this.copy.getMonetizationNetwork.getMediationNetwork.getRevenue.AFAdRevenueData.getRevenue;
            } catch (NullPointerException unused) {
                d = 1.0d;
            }
            if (AFh1tSDK.AFAdRevenueData(d)) {
                this.component1.getMonetizationNetwork.remove(Mechanism.JsonKeys.META);
            }
        }
        AFd1mSDK<String> AFAdRevenueData = ((AFe1kSDK) this).areAllFieldsValid.AFAdRevenueData(this.component1, str, this.AFInAppEventParameterName);
        Map<String, Object> map = this.component1.getMonetizationNetwork;
        try {
            jSONObject = new JSONObject(map);
            try {
                str2 = jSONObject.toString();
                try {
                } catch (NullPointerException e) {
                    e = e;
                    AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "JSONObject return null String object. Trying to create AFJsonObject.", e);
                    try {
                        Object[] objArr = {map};
                        Object obj = AFa1gSDK.e.get(1754929537);
                        if (obj == null) {
                            obj = ((Class) AFa1gSDK.getMonetizationNetwork(37 - KeyEvent.getDeadChar(0, 0), Color.argb(0, 0, 0, 0) + 198, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 13426))).getMethod("getRevenue", Map.class);
                            AFa1gSDK.e.put(1754929537, obj);
                        }
                        String str5 = (String) ((Method) obj).invoke(null, objArr);
                        try {
                        } catch (NullPointerException e2) {
                            e = e2;
                            str2 = str5;
                            AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "AFJsonObject return null String object.", e);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            AFg1hSDK.getRevenue(new StringBuilder().append(this).append(": preparing data: ").toString(), jSONObject);
                            this.component3.getCurrencyIso4217Code(AFAdRevenueData != null ? AFAdRevenueData.getMediationNetwork.getCurrencyIso4217Code : null, str3);
                            return AFAdRevenueData;
                        } catch (Exception e3) {
                            exc = e3;
                            str2 = str5;
                            AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, true);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            AFg1hSDK.getRevenue(new StringBuilder().append(this).append(": preparing data: ").toString(), jSONObject);
                            this.component3.getCurrencyIso4217Code(AFAdRevenueData != null ? AFAdRevenueData.getMediationNetwork.getCurrencyIso4217Code : null, str3);
                            return AFAdRevenueData;
                        } catch (Throwable th) {
                            th = th;
                            str2 = str5;
                            AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "Unexpected error", th);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            AFg1hSDK.getRevenue(new StringBuilder().append(this).append(": preparing data: ").toString(), jSONObject);
                            this.component3.getCurrencyIso4217Code(AFAdRevenueData != null ? AFAdRevenueData.getMediationNetwork.getCurrencyIso4217Code : null, str3);
                            return AFAdRevenueData;
                        }
                        if (str5 != null) {
                            str3 = str5.replaceAll("\\p{C}", "*Non-printing character*");
                            str2 = str5;
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            AFg1hSDK.getRevenue(new StringBuilder().append(this).append(": preparing data: ").toString(), jSONObject);
                            this.component3.getCurrencyIso4217Code(AFAdRevenueData != null ? AFAdRevenueData.getMediationNetwork.getCurrencyIso4217Code : null, str3);
                            return AFAdRevenueData;
                        }
                        throw new NullPointerException("JSON toString of eventParams map returns null");
                    } catch (Throwable th2) {
                        try {
                            Throwable cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th2;
                        } catch (NullPointerException e4) {
                            e = e4;
                            AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "AFJsonObject return null String object.", e);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            AFg1hSDK.getRevenue(new StringBuilder().append(this).append(": preparing data: ").toString(), jSONObject);
                            this.component3.getCurrencyIso4217Code(AFAdRevenueData != null ? AFAdRevenueData.getMediationNetwork.getCurrencyIso4217Code : null, str3);
                            return AFAdRevenueData;
                        } catch (Exception e5) {
                            exc = e5;
                            AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, true);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            AFg1hSDK.getRevenue(new StringBuilder().append(this).append(": preparing data: ").toString(), jSONObject);
                            this.component3.getCurrencyIso4217Code(AFAdRevenueData != null ? AFAdRevenueData.getMediationNetwork.getCurrencyIso4217Code : null, str3);
                            return AFAdRevenueData;
                        } catch (Throwable th3) {
                            th = th3;
                            AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "Unexpected error", th);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            AFg1hSDK.getRevenue(new StringBuilder().append(this).append(": preparing data: ").toString(), jSONObject);
                            this.component3.getCurrencyIso4217Code(AFAdRevenueData != null ? AFAdRevenueData.getMediationNetwork.getCurrencyIso4217Code : null, str3);
                            return AFAdRevenueData;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "Unexpected error", th);
                    str3 = "";
                    if (str2 != null) {
                    }
                    if (str3.equals(str4)) {
                    }
                    AFg1hSDK.getRevenue(new StringBuilder().append(this).append(": preparing data: ").toString(), jSONObject);
                    this.component3.getCurrencyIso4217Code(AFAdRevenueData != null ? AFAdRevenueData.getMediationNetwork.getCurrencyIso4217Code : null, str3);
                    return AFAdRevenueData;
                }
            } catch (NullPointerException e6) {
                e = e6;
                str2 = null;
            } catch (Throwable th5) {
                th = th5;
                str2 = null;
            }
        } catch (NullPointerException e7) {
            e = e7;
            jSONObject = null;
            str2 = null;
        } catch (Throwable th6) {
            th = th6;
            jSONObject = null;
            str2 = null;
        }
        if (str2 != null) {
            str3 = str2.replaceAll("\\p{C}", "*Non-printing character*");
            str4 = str2 != null ? str2 : "";
            if (str3.equals(str4)) {
                str3 = str4;
            } else {
                AFLogger.INSTANCE.w(AFh1zSDK.GENERAL, "Payload contains non-printing characters");
                try {
                    jSONObject = new JSONObject(str3);
                } catch (JSONException e8) {
                    AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "Couldn't parse the payload to a json object", e8);
                }
            }
            AFg1hSDK.getRevenue(new StringBuilder().append(this).append(": preparing data: ").toString(), jSONObject);
            this.component3.getCurrencyIso4217Code(AFAdRevenueData != null ? AFAdRevenueData.getMediationNetwork.getCurrencyIso4217Code : null, str3);
            return AFAdRevenueData;
        }
        throw new NullPointerException("JSON toString of eventParams map returns null");
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    protected final AppsFlyerRequestListener component2() {
        return this.component1.AFAdRevenueData;
    }

    protected void getMonetizationNetwork(AFh1tSDK aFh1tSDK) {
        this.hashCode.getMediationNetwork(aFh1tSDK.getMonetizationNetwork);
    }

    protected void getCurrencyIso4217Code(AFh1tSDK aFh1tSDK) {
        this.hashCode.getCurrencyIso4217Code(aFh1tSDK);
    }

    protected void AFAdRevenueData(AFh1tSDK aFh1tSDK) {
        this.hashCode.getMonetizationNetwork(aFh1tSDK);
    }

    protected void getMediationNetwork(AFh1tSDK aFh1tSDK) {
        this.hashCode.getRevenue(aFh1tSDK);
    }

    protected void component3(AFh1tSDK aFh1tSDK) {
        this.hashCode.getMediationNetwork(aFh1tSDK);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0088 A[Catch: all -> 0x00fd, TryCatch #1 {all -> 0x00fd, blocks: (B:3:0x001e, B:5:0x0025, B:7:0x0045, B:8:0x004a, B:10:0x0050, B:11:0x0059, B:13:0x0063, B:17:0x006f, B:20:0x0077, B:21:0x0082, B:23:0x0088, B:25:0x00a0, B:26:0x00a5, B:28:0x00ba, B:29:0x00c3, B:31:0x00c9, B:34:0x00d0, B:35:0x00d8, B:36:0x00a3, B:37:0x00db, B:39:0x00e5, B:40:0x00f1, B:48:0x0012, B:2:0x0000), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5 A[Catch: all -> 0x00fd, TryCatch #1 {all -> 0x00fd, blocks: (B:3:0x001e, B:5:0x0025, B:7:0x0045, B:8:0x004a, B:10:0x0050, B:11:0x0059, B:13:0x0063, B:17:0x006f, B:20:0x0077, B:21:0x0082, B:23:0x0088, B:25:0x00a0, B:26:0x00a5, B:28:0x00ba, B:29:0x00c3, B:31:0x00c9, B:34:0x00d0, B:35:0x00d8, B:36:0x00a3, B:37:0x00db, B:39:0x00e5, B:40:0x00f1, B:48:0x0012, B:2:0x0000), top: B:1:0x0000, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void getRevenue(AFh1tSDK aFh1tSDK) {
        boolean z;
        AFe1wSDK aFe1wSDK;
        try {
            try {
                getMediationNetwork(aFh1tSDK);
                getMonetizationNetwork(aFh1tSDK);
                AFAdRevenueData(aFh1tSDK);
                getCurrencyIso4217Code(aFh1tSDK);
                component3(aFh1tSDK);
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFh1zSDK.QUEUE, "Error while collecting payload params", th, true, true, false);
            }
            if (aFh1tSDK.getMonetizationNetwork()) {
                aFh1tSDK.getCurrencyIso4217Code(((AFe1kSDK) this).component4.getMediationNetwork(aFh1tSDK.getMonetizationNetwork));
                aFh1tSDK.getCurrencyIso4217Code(((AFe1kSDK) this).component4.getRevenue(aFh1tSDK.getMonetizationNetwork));
                if (this.equals.getRevenue("com.appsflyer.security.enable", false)) {
                    AFf1iSDK aFf1iSDK = ((AFe1kSDK) this).component4;
                    AFf1iSDK.getMonetizationNetwork(aFh1tSDK);
                }
            }
            if (aFh1tSDK.component1()) {
                aFh1tSDK.getCurrencyIso4217Code(((AFe1kSDK) this).component4.getCurrencyIso4217Code());
            }
            Set<AFe1uSDK> set = this.AFAdRevenueData;
            if (!set.contains(AFe1uSDK.LAUNCH) && !set.contains(AFe1uSDK.CONVERSION)) {
                z = false;
                if (areAllFieldsValid() && z) {
                    aFh1tSDK.getRevenue(this.toString.AFAdRevenueData("appsFlyerCount", 0));
                }
                if (aFh1tSDK.component4()) {
                    Map<String, Object> component1 = component1(aFh1tSDK);
                    AFe1ySDK aFe1ySDK = this.copydefault;
                    String AFAdRevenueData = aFe1ySDK.AFAdRevenueData();
                    String currencyIso4217Code = aFe1ySDK.getCurrencyIso4217Code();
                    if (AFe1ySDK.getRevenue()) {
                        aFe1wSDK = AFe1wSDK.DEFAULT;
                    } else {
                        aFe1wSDK = AFe1wSDK.API;
                    }
                    AFe1xSDK aFe1xSDK = new AFe1xSDK(AFAdRevenueData, currencyIso4217Code, aFe1wSDK);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", aFe1xSDK.getMonetizationNetwork);
                    if (aFe1xSDK.getRevenue != AFe1wSDK.DEFAULT) {
                        jSONObject.put("method", aFe1xSDK.getRevenue.AFAdRevenueData);
                    }
                    String str = aFe1xSDK.AFAdRevenueData;
                    if (str != null && !StringsKt.isBlank(str)) {
                        jSONObject.put("prefix", aFe1xSDK.AFAdRevenueData);
                    }
                    component1.put("host", jSONObject);
                }
                if (this.equals.getRevenue("AF_PREINSTALL_DISABLED", false)) {
                    component1(aFh1tSDK).put("preinstall_disabled", Boolean.TRUE);
                }
                this.AFKeystoreWrapper.getMediationNetwork(aFh1tSDK.getMonetizationNetwork, aFh1tSDK.getMediationNetwork());
            }
            z = true;
            if (areAllFieldsValid()) {
                aFh1tSDK.getRevenue(this.toString.AFAdRevenueData("appsFlyerCount", 0));
            }
            if (aFh1tSDK.component4()) {
            }
            if (this.equals.getRevenue("AF_PREINSTALL_DISABLED", false)) {
            }
            this.AFKeystoreWrapper.getMediationNetwork(aFh1tSDK.getMonetizationNetwork, aFh1tSDK.getMediationNetwork());
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFh1zSDK.QUEUE, "Error while preparing to send event", th2, true, true, false);
        }
    }

    protected static Map<String, Object> component1(AFh1tSDK aFh1tSDK) {
        Map<String, Object> map = (Map) aFh1tSDK.getMonetizationNetwork.get(Mechanism.JsonKeys.META);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        aFh1tSDK.getMonetizationNetwork.put(Mechanism.JsonKeys.META, hashMap);
        return hashMap;
    }
}
