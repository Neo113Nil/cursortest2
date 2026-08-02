package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class AFe1gSDK extends AFe1kSDK<String> {
    private final AFe1uSDK component1;
    private final Map<String, Object> copy;
    private final AFc1sSDK copydefault;
    private final AFf1eSDK equals;
    private final AFc1kSDK hashCode;
    private final AFg1tSDK toString;

    public abstract AFd1mSDK<String> AFAdRevenueData(Map<String, Object> map, String str, String str2);

    protected boolean component1() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    protected final AppsFlyerRequestListener component2() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    protected final boolean copydefault() {
        return true;
    }

    protected String getCurrencyIso4217Code(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    protected String getMonetizationNetwork(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1gSDK(AFe1uSDK aFe1uSDK, AFe1uSDK[] aFe1uSDKArr, AFc1fSDK aFc1fSDK, String str, Map<String, ? extends Object> map) {
        super(aFe1uSDK, aFe1uSDKArr, aFc1fSDK, null);
        Intrinsics.checkNotNullParameter(aFe1uSDK, "");
        Intrinsics.checkNotNullParameter(aFe1uSDKArr, "");
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.component1 = aFe1uSDK;
        this.copy = map;
        AFc1kSDK revenue = aFc1fSDK.getRevenue();
        Intrinsics.checkNotNullExpressionValue(revenue, "");
        this.hashCode = revenue;
        AFc1sSDK component1 = aFc1fSDK.component1();
        Intrinsics.checkNotNullExpressionValue(component1, "");
        this.copydefault = component1;
        AFg1tSDK component3 = aFc1fSDK.component3();
        Intrinsics.checkNotNullExpressionValue(component3, "");
        this.toString = component3;
        AFf1eSDK v = aFc1fSDK.v();
        Intrinsics.checkNotNullExpressionValue(v, "");
        this.equals = v;
    }

    protected void getRevenue(Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("app_id", this.hashCode.AFAdRevenueData.getMonetizationNetwork.getPackageName());
        String mediationNetwork = AFc1kSDK.getMediationNetwork();
        if (mediationNetwork != null) {
            map.put("cuid", mediationNetwork);
        }
        AFc1kSDK aFc1kSDK = this.hashCode;
        map.put("app_version_name", AFj1nSDK.getCurrencyIso4217Code(aFc1kSDK.AFAdRevenueData.getMonetizationNetwork, aFc1kSDK.AFAdRevenueData.getMonetizationNetwork.getPackageName()));
        if (component1()) {
            map.put("event_timestamp", Long.valueOf(this.toString.AFAdRevenueData()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    protected final AFd1mSDK<String> getMediationNetwork(String str) {
        AFd1aSDK aFd1aSDK;
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Object> mutableMap = MapsKt.toMutableMap(this.copy);
        String monetizationNetwork = getMonetizationNetwork(mutableMap);
        String currencyIso4217Code = getCurrencyIso4217Code(mutableMap);
        Map<String, Object> mutableMap2 = MapsKt.toMutableMap(mutableMap);
        getRevenue(mutableMap2, monetizationNetwork);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String currencyIso4217Code2 = this.hashCode.getCurrencyIso4217Code();
        String str2 = currencyIso4217Code2;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            linkedHashMap.put("advertising_id", currencyIso4217Code2);
        }
        AFb1lSDK monetizationNetwork2 = AFb1iSDK.getMonetizationNetwork(this.hashCode.AFAdRevenueData.getMonetizationNetwork);
        String str3 = null;
        String str4 = monetizationNetwork2 != null ? monetizationNetwork2.getMonetizationNetwork : null;
        String str5 = str4;
        if (str5 != null && !StringsKt.isBlank(str5)) {
            linkedHashMap.put("oaid", str4);
        }
        AFb1lSDK k_ = AFb1iSDK.k_(this.hashCode.AFAdRevenueData.getMonetizationNetwork.getContentResolver());
        String str6 = k_ != null ? k_.getMonetizationNetwork : null;
        String str7 = str6;
        if (str7 != null && !StringsKt.isBlank(str7)) {
            linkedHashMap.put("amazon_aid", str6);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            mutableMap2.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        } else {
            AFf1iSDK aFf1iSDK = ((AFe1kSDK) this).component4;
            String str8 = (String) AFf1iSDK.AFAdRevenueData(new Object[]{aFf1iSDK, this.copydefault}, 527487030, -527487030, System.identityHashCode(aFf1iSDK));
            String str9 = str8;
            if (str9 != null && !StringsKt.isBlank(str9)) {
                linkedHashMap.put("imei", str8);
            }
        }
        String monetizationNetwork3 = AFb1kSDK.getMonetizationNetwork(this.hashCode.getRevenue);
        if (monetizationNetwork3 == null) {
            monetizationNetwork3 = "";
        }
        linkedHashMap.put("appsflyer_id", monetizationNetwork3);
        linkedHashMap.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("sdk_version", "6.16.2");
        String str10 = currencyIso4217Code;
        if (str10 != null && !StringsKt.isBlank(str10)) {
            linkedHashMap.put("sdk_connector_version", currencyIso4217Code);
        }
        mutableMap2.put("device_data", linkedHashMap);
        this.equals.getMediationNetwork(mutableMap2, this.component1);
        AFd1mSDK<String> AFAdRevenueData = AFAdRevenueData(mutableMap2, str, monetizationNetwork);
        if (AFAdRevenueData != null && (aFd1aSDK = AFAdRevenueData.getMediationNetwork) != null) {
            str3 = aFd1aSDK.getCurrencyIso4217Code;
        }
        if (str3 != null) {
            JSONObject jSONObject = new JSONObject(mutableMap2);
            AFg1hSDK.getRevenue(toString() + ": preparing data: ", jSONObject);
            AFd1sSDK aFd1sSDK = this.component3;
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
            aFd1sSDK.getCurrencyIso4217Code(str3, jSONObject2);
        }
        return AFAdRevenueData;
    }
}
