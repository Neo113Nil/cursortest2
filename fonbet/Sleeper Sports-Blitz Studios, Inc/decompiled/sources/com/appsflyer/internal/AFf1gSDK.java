package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class AFf1gSDK extends AFf1pSDK<String> {
    private static final AFf1wSDK[] AFInAppEventParameterName = {AFf1wSDK.DLSDK, AFf1wSDK.ONELINK, AFf1wSDK.REGISTER};
    private final AFd1lSDK AFInAppEventType;
    public final AFa1mSDK component3;
    private final AFd1rSDK copy;
    private final AFe1gSDK copydefault;
    protected final AFd1pSDK equals;
    protected final AFg1iSDK hashCode;
    private final AFg1xSDK toString;
    private final AFg1sSDK values;

    @Override // com.appsflyer.internal.AFf1pSDK
    protected boolean copydefault() {
        return true;
    }

    public AFf1gSDK(AFa1mSDK aFa1mSDK, AFd1kSDK aFd1kSDK) {
        this(aFa1mSDK, aFd1kSDK, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1gSDK(AFa1mSDK aFa1mSDK, AFd1kSDK aFd1kSDK, String str) {
        super(aFa1mSDK.AFAdRevenueData(), new AFf1wSDK[]{AFf1wSDK.RC_CDN, AFf1wSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, str);
        this.component3 = aFa1mSDK;
        this.copydefault = aFd1kSDK.values();
        this.equals = aFd1kSDK.getMediationNetwork();
        this.toString = aFd1kSDK.component1();
        this.AFInAppEventType = aFd1kSDK.AFInAppEventParameterName();
        this.copy = aFd1kSDK.getCurrencyIso4217Code();
        this.hashCode = aFd1kSDK.component2();
        this.values = aFd1kSDK.v();
        for (AFf1wSDK aFf1wSDK : AFInAppEventParameterName) {
            if (this.getCurrencyIso4217Code == aFf1wSDK) {
                return;
            }
        }
        int i = this.component3.component4;
        AFf1wSDK aFf1wSDK2 = this.getCurrencyIso4217Code;
        if (i <= 0) {
            if (aFf1wSDK2 != AFf1wSDK.CONVERSION) {
                this.getRevenue.add(AFf1wSDK.CONVERSION);
                return;
            }
            return;
        }
        this.AFAdRevenueData.add(AFf1wSDK.CONVERSION);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013a  */
    @Override // com.appsflyer.internal.AFf1pSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final AFe1rSDK<String> getMonetizationNetwork(String str) {
        double d;
        String str2;
        JSONObject jSONObject;
        String str3;
        String str4;
        getMonetizationNetwork(this.component3);
        if (this.component3.getMonetizationNetwork().containsKey("meta")) {
            try {
                d = this.toString.getMediationNetwork.getMonetizationNetwork.getRevenue.getMonetizationNetwork.getCurrencyIso4217Code;
            } catch (NullPointerException unused) {
                d = 1.0d;
            }
            if (AFa1mSDK.getCurrencyIso4217Code(d)) {
                this.component3.getMonetizationNetwork().remove("meta");
            }
        }
        String str5 = this.component3.component1;
        Map<String, Object> monetizationNetwork = this.component3.getMonetizationNetwork();
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(monetizationNetwork);
            try {
                str2 = jSONObject.toString();
                try {
                } catch (NullPointerException e) {
                    e = e;
                    AFLogger.INSTANCE.e(AFh1xSDK.GENERAL, "JSONObject return null String object. Trying to create AFJsonObject.", e, true);
                    try {
                        Object[] objArr = {monetizationNetwork};
                        Object obj = AFa1vSDK.AFLogger.get(-422631575);
                        if (obj == null) {
                            obj = ((Class) AFa1vSDK.AFAdRevenueData((char) (59274 - MotionEvent.axisFromString("")), 37 - TextUtils.getOffsetAfter("", 0), 37 - ExpandableListView.getPackedPositionGroup(0L))).getMethod("getRevenue", Map.class);
                            AFa1vSDK.AFLogger.put(-422631575, obj);
                        }
                        String str6 = (String) ((Method) obj).invoke(null, objArr);
                        try {
                        } catch (NullPointerException e2) {
                            e = e2;
                            str2 = str6;
                            AFLogger.INSTANCE.e(AFh1xSDK.GENERAL, "AFJsonObject return null String object.", e, true);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append(this);
                            sb.append(": preparing data: ");
                            AFb1hSDK.getMediationNetwork(sb.toString(), jSONObject);
                            ((AFf1pSDK) this).component1.getRevenue(str5, str3);
                            return this.component2.getRevenue(this.component3, str, this.AFInAppEventType);
                        } catch (Exception e3) {
                            e = e3;
                            str2 = str6;
                            AFLogger.INSTANCE.e(AFh1xSDK.GENERAL, "AFFinalizer: reflection init failed", e);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this);
                            sb2.append(": preparing data: ");
                            AFb1hSDK.getMediationNetwork(sb2.toString(), jSONObject);
                            ((AFf1pSDK) this).component1.getRevenue(str5, str3);
                            return this.component2.getRevenue(this.component3, str, this.AFInAppEventType);
                        } catch (Throwable th) {
                            th = th;
                            str2 = str6;
                            AFLogger.INSTANCE.e(AFh1xSDK.GENERAL, "Unexpected error", th, true);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            StringBuilder sb22 = new StringBuilder();
                            sb22.append(this);
                            sb22.append(": preparing data: ");
                            AFb1hSDK.getMediationNetwork(sb22.toString(), jSONObject);
                            ((AFf1pSDK) this).component1.getRevenue(str5, str3);
                            return this.component2.getRevenue(this.component3, str, this.AFInAppEventType);
                        }
                        if (str6 != null) {
                            str3 = str6.replaceAll("\\p{C}", "*Non-printing character*");
                            str2 = str6;
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            StringBuilder sb222 = new StringBuilder();
                            sb222.append(this);
                            sb222.append(": preparing data: ");
                            AFb1hSDK.getMediationNetwork(sb222.toString(), jSONObject);
                            ((AFf1pSDK) this).component1.getRevenue(str5, str3);
                            return this.component2.getRevenue(this.component3, str, this.AFInAppEventType);
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
                            AFLogger.INSTANCE.e(AFh1xSDK.GENERAL, "AFJsonObject return null String object.", e, true);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            StringBuilder sb2222 = new StringBuilder();
                            sb2222.append(this);
                            sb2222.append(": preparing data: ");
                            AFb1hSDK.getMediationNetwork(sb2222.toString(), jSONObject);
                            ((AFf1pSDK) this).component1.getRevenue(str5, str3);
                            return this.component2.getRevenue(this.component3, str, this.AFInAppEventType);
                        } catch (Exception e5) {
                            e = e5;
                            AFLogger.INSTANCE.e(AFh1xSDK.GENERAL, "AFFinalizer: reflection init failed", e);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            StringBuilder sb22222 = new StringBuilder();
                            sb22222.append(this);
                            sb22222.append(": preparing data: ");
                            AFb1hSDK.getMediationNetwork(sb22222.toString(), jSONObject);
                            ((AFf1pSDK) this).component1.getRevenue(str5, str3);
                            return this.component2.getRevenue(this.component3, str, this.AFInAppEventType);
                        } catch (Throwable th3) {
                            th = th3;
                            AFLogger.INSTANCE.e(AFh1xSDK.GENERAL, "Unexpected error", th, true);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            StringBuilder sb222222 = new StringBuilder();
                            sb222222.append(this);
                            sb222222.append(": preparing data: ");
                            AFb1hSDK.getMediationNetwork(sb222222.toString(), jSONObject);
                            ((AFf1pSDK) this).component1.getRevenue(str5, str3);
                            return this.component2.getRevenue(this.component3, str, this.AFInAppEventType);
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    jSONObject2 = jSONObject;
                    AFLogger.INSTANCE.e(AFh1xSDK.GENERAL, "Unexpected error", th, true);
                    str3 = "";
                    jSONObject = jSONObject2;
                    if (str2 != null) {
                    }
                    if (str3.equals(str4)) {
                    }
                    StringBuilder sb2222222 = new StringBuilder();
                    sb2222222.append(this);
                    sb2222222.append(": preparing data: ");
                    AFb1hSDK.getMediationNetwork(sb2222222.toString(), jSONObject);
                    ((AFf1pSDK) this).component1.getRevenue(str5, str3);
                    return this.component2.getRevenue(this.component3, str, this.AFInAppEventType);
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
            str2 = null;
        }
        if (str2 != null) {
            str3 = str2.replaceAll("\\p{C}", "*Non-printing character*");
            str4 = str2 != null ? str2 : "";
            if (str3.equals(str4)) {
                str3 = str4;
            } else {
                AFLogger.INSTANCE.w(AFh1xSDK.GENERAL, "Payload contains non-printing characters");
                try {
                    jSONObject = new JSONObject(str3);
                } catch (JSONException e8) {
                    AFLogger.INSTANCE.e(AFh1xSDK.GENERAL, "Couldn't parse the payload to a json object", e8);
                }
            }
            StringBuilder sb22222222 = new StringBuilder();
            sb22222222.append(this);
            sb22222222.append(": preparing data: ");
            AFb1hSDK.getMediationNetwork(sb22222222.toString(), jSONObject);
            ((AFf1pSDK) this).component1.getRevenue(str5, str3);
            return this.component2.getRevenue(this.component3, str, this.AFInAppEventType);
        }
        throw new NullPointerException("JSON toString of eventParams map returns null");
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    protected final AppsFlyerRequestListener component1() {
        return this.component3.getMediationNetwork;
    }

    protected void getMediationNetwork(AFa1mSDK aFa1mSDK) {
        this.hashCode.AFAdRevenueData(aFa1mSDK.getMonetizationNetwork());
    }

    protected void getCurrencyIso4217Code(AFa1mSDK aFa1mSDK) {
        this.hashCode.getRevenue(aFa1mSDK);
    }

    protected void AFAdRevenueData(AFa1mSDK aFa1mSDK) {
        this.hashCode.getMediationNetwork(aFa1mSDK);
    }

    private static Map<String, Object> component4(AFa1mSDK aFa1mSDK) {
        Map<String, Object> map = (Map) aFa1mSDK.getMonetizationNetwork().get("meta");
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        aFa1mSDK.getMonetizationNetwork().put("meta", hashMap);
        return hashMap;
    }

    protected void getRevenue(AFa1mSDK aFa1mSDK) {
        this.hashCode.getMonetizationNetwork(aFa1mSDK);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0093 A[Catch: all -> 0x0108, TryCatch #1 {all -> 0x0108, blocks: (B:4:0x0015, B:6:0x001b, B:8:0x0044, B:10:0x0046, B:13:0x0050, B:14:0x0055, B:16:0x005b, B:17:0x0064, B:19:0x006e, B:23:0x007a, B:26:0x0082, B:27:0x008d, B:29:0x0093, B:31:0x00ab, B:32:0x00b0, B:34:0x00c5, B:35:0x00ce, B:37:0x00d4, B:40:0x00db, B:41:0x00e2, B:42:0x00ae, B:43:0x00e5, B:45:0x00ef, B:46:0x00fa, B:56:0x0010, B:3:0x0002), top: B:2:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef A[Catch: all -> 0x0108, TryCatch #1 {all -> 0x0108, blocks: (B:4:0x0015, B:6:0x001b, B:8:0x0044, B:10:0x0046, B:13:0x0050, B:14:0x0055, B:16:0x005b, B:17:0x0064, B:19:0x006e, B:23:0x007a, B:26:0x0082, B:27:0x008d, B:29:0x0093, B:31:0x00ab, B:32:0x00b0, B:34:0x00c5, B:35:0x00ce, B:37:0x00d4, B:40:0x00db, B:41:0x00e2, B:42:0x00ae, B:43:0x00e5, B:45:0x00ef, B:46:0x00fa, B:56:0x0010, B:3:0x0002), top: B:2:0x0002, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void getMonetizationNetwork(AFa1mSDK aFa1mSDK) {
        boolean z;
        AFe1cSDK aFe1cSDK;
        try {
            try {
                getMediationNetwork(aFa1mSDK);
                AFAdRevenueData(aFa1mSDK);
                getCurrencyIso4217Code(aFa1mSDK);
                getRevenue(aFa1mSDK);
            } catch (Throwable th) {
                AFLogger.afErrorLog("Error while collecting payload params", th, true, false);
            }
            if (aFa1mSDK.component2()) {
                aFa1mSDK.getRevenue(new AFd1oSDK(aFa1mSDK.getMonetizationNetwork(), ((AFf1pSDK) this).component4.getCurrencyIso4217Code.getCurrencyIso4217Code));
                aFa1mSDK.getRevenue((Map<String, ?>) ((AFf1pSDK) this).component4.getMonetizationNetwork(aFa1mSDK.getMonetizationNetwork()));
                if (this.copy.getRevenue("com.appsflyer.security.enable")) {
                    AFg1uSDK aFg1uSDK = ((AFf1pSDK) this).component4;
                    try {
                        new AFb1sSDK(aFa1mSDK).afInfoLog();
                    } catch (Exception e) {
                        AFLogger.afErrorLogForExcManagerOnly("native: reflection init failed", e);
                    }
                }
            }
            if (aFa1mSDK.component1()) {
                aFa1mSDK.getRevenue((Map<String, ?>) ((AFf1pSDK) this).component4.getCurrencyIso4217Code());
            }
            Set<AFf1wSDK> set = this.getRevenue;
            if (!set.contains(AFf1wSDK.LAUNCH) && !set.contains(AFf1wSDK.CONVERSION)) {
                z = false;
                if (component2() && z) {
                    aFa1mSDK.getMediationNetwork(this.equals.AFAdRevenueData("appsFlyerCount", 0));
                }
                if (aFa1mSDK.component4()) {
                    Map<String, Object> component4 = component4(aFa1mSDK);
                    AFe1gSDK aFe1gSDK = this.copydefault;
                    String currencyIso4217Code = aFe1gSDK.getCurrencyIso4217Code();
                    String monetizationNetwork = aFe1gSDK.getMonetizationNetwork();
                    if (AFe1gSDK.getMediationNetwork()) {
                        aFe1cSDK = AFe1cSDK.DEFAULT;
                    } else {
                        aFe1cSDK = AFe1cSDK.API;
                    }
                    AFe1eSDK aFe1eSDK = new AFe1eSDK(currencyIso4217Code, monetizationNetwork, aFe1cSDK);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", aFe1eSDK.getMediationNetwork);
                    if (aFe1eSDK.getCurrencyIso4217Code != AFe1cSDK.DEFAULT) {
                        jSONObject.put("method", aFe1eSDK.getCurrencyIso4217Code.getCurrencyIso4217Code);
                    }
                    String str = aFe1eSDK.AFAdRevenueData;
                    if (str != null && !StringsKt.isBlank(str)) {
                        jSONObject.put("prefix", aFe1eSDK.AFAdRevenueData);
                    }
                    component4.put("host", jSONObject);
                }
                if (this.copy.getRevenue("AF_PREINSTALL_DISABLED")) {
                    component4(aFa1mSDK).put("preinstall_disabled", Boolean.TRUE);
                }
                this.values.getCurrencyIso4217Code(aFa1mSDK.getMonetizationNetwork(), aFa1mSDK.AFAdRevenueData());
            }
            z = true;
            if (component2()) {
                aFa1mSDK.getMediationNetwork(this.equals.AFAdRevenueData("appsFlyerCount", 0));
            }
            if (aFa1mSDK.component4()) {
            }
            if (this.copy.getRevenue("AF_PREINSTALL_DISABLED")) {
            }
            this.values.getCurrencyIso4217Code(aFa1mSDK.getMonetizationNetwork(), aFa1mSDK.AFAdRevenueData());
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Error while preparing to send event", th2, true, false);
        }
    }
}
