package com.appsflyer.internal;

import android.os.Build;
import com.amplitude.api.Constants;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class AFf1vSDK extends AFf1pSDK<String> {
    private final AFf1wSDK component3;
    private final AFg1iSDK copy;
    private final AFg1sSDK copydefault;
    private final AFd1pSDK equals;
    private final AFd1rSDK hashCode;
    private final Map<String, Object> toString;

    protected String AFAdRevenueData(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    protected boolean areAllFieldsValid() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    protected final AppsFlyerRequestListener component1() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    protected final boolean copydefault() {
        return true;
    }

    public abstract AFe1rSDK<String> getCurrencyIso4217Code(Map<String, Object> map, String str, String str2);

    protected String getCurrencyIso4217Code(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1vSDK(AFf1wSDK aFf1wSDK, AFf1wSDK[] aFf1wSDKArr, AFd1kSDK aFd1kSDK, String str, Map<String, ? extends Object> map) {
        super(aFf1wSDK, aFf1wSDKArr, aFd1kSDK, null);
        Intrinsics.checkNotNullParameter(aFf1wSDK, "");
        Intrinsics.checkNotNullParameter(aFf1wSDKArr, "");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.component3 = aFf1wSDK;
        this.toString = map;
        AFd1rSDK currencyIso4217Code = aFd1kSDK.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        this.hashCode = currencyIso4217Code;
        AFd1pSDK mediationNetwork = aFd1kSDK.getMediationNetwork();
        Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
        this.equals = mediationNetwork;
        AFg1iSDK component2 = aFd1kSDK.component2();
        Intrinsics.checkNotNullExpressionValue(component2, "");
        this.copy = component2;
        AFg1sSDK v = aFd1kSDK.v();
        Intrinsics.checkNotNullExpressionValue(v, "");
        this.copydefault = v;
    }

    protected void AFAdRevenueData(Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("app_id", this.hashCode.getMonetizationNetwork.getCurrencyIso4217Code.getPackageName());
        String AFAdRevenueData = AFd1rSDK.AFAdRevenueData();
        if (AFAdRevenueData != null) {
            map.put("cuid", AFAdRevenueData);
        }
        AFd1rSDK aFd1rSDK = this.hashCode;
        map.put("app_version_name", AFb1qSDK.getMediationNetwork(aFd1rSDK.getMonetizationNetwork.getCurrencyIso4217Code, aFd1rSDK.getMonetizationNetwork.getCurrencyIso4217Code.getPackageName()));
        if (areAllFieldsValid()) {
            map.put("event_timestamp", Long.valueOf(this.copy.getRevenue()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    protected final AFe1rSDK<String> getMonetizationNetwork(String str) {
        AFe1nSDK aFe1nSDK;
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Object> mutableMap = MapsKt.toMutableMap(this.toString);
        String currencyIso4217Code = getCurrencyIso4217Code(mutableMap);
        String AFAdRevenueData = AFAdRevenueData(mutableMap);
        Map<String, Object> mutableMap2 = MapsKt.toMutableMap(mutableMap);
        AFAdRevenueData(mutableMap2, currencyIso4217Code);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String currencyIso4217Code2 = this.hashCode.getCurrencyIso4217Code();
        String str2 = currencyIso4217Code2;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            linkedHashMap.put("advertising_id", currencyIso4217Code2);
        }
        AFb1tSDK currencyIso4217Code3 = AFb1uSDK.getCurrencyIso4217Code(this.hashCode.getMonetizationNetwork.getCurrencyIso4217Code);
        String str3 = null;
        String str4 = currencyIso4217Code3 != null ? currencyIso4217Code3.getMediationNetwork : null;
        String str5 = str4;
        if (str5 != null && !StringsKt.isBlank(str5)) {
            linkedHashMap.put("oaid", str4);
        }
        AFb1tSDK b_ = AFb1uSDK.b_(this.hashCode.getMonetizationNetwork.getCurrencyIso4217Code.getContentResolver());
        String str6 = b_ != null ? b_.getMediationNetwork : null;
        String str7 = str6;
        if (str7 != null && !StringsKt.isBlank(str7)) {
            linkedHashMap.put("amazon_aid", str6);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            mutableMap2.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        } else {
            String mediationNetwork = ((AFf1pSDK) this).component4.getMediationNetwork(this.equals);
            String str8 = mediationNetwork;
            if (str8 != null && !StringsKt.isBlank(str8)) {
                linkedHashMap.put("imei", mediationNetwork);
            }
        }
        AFd1rSDK aFd1rSDK = this.hashCode;
        String mediationNetwork2 = AFb1mSDK.getMediationNetwork(aFd1rSDK.getMonetizationNetwork, aFd1rSDK.getRevenue);
        if (mediationNetwork2 == null) {
            mediationNetwork2 = "";
        }
        linkedHashMap.put("appsflyer_id", mediationNetwork2);
        linkedHashMap.put(Constants.AMP_TRACKING_OPTION_OS_VERSION, String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("sdk_version", "6.15.1");
        String str9 = AFAdRevenueData;
        if (str9 != null && !StringsKt.isBlank(str9)) {
            linkedHashMap.put("sdk_connector_version", AFAdRevenueData);
        }
        mutableMap2.put("device_data", linkedHashMap);
        this.copydefault.getCurrencyIso4217Code(mutableMap2, this.component3);
        AFe1rSDK<String> currencyIso4217Code4 = getCurrencyIso4217Code(mutableMap2, str, currencyIso4217Code);
        if (currencyIso4217Code4 != null && (aFe1nSDK = currencyIso4217Code4.getRevenue) != null) {
            str3 = aFe1nSDK.AFAdRevenueData;
        }
        if (str3 != null) {
            JSONObject jSONObject = new JSONObject(mutableMap2);
            AFb1hSDK.getMediationNetwork(toString() + ": preparing data: ", jSONObject);
            AFb1aSDK aFb1aSDK = ((AFf1pSDK) this).component1;
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
            aFb1aSDK.getRevenue(str3, jSONObject2);
        }
        return currencyIso4217Code4;
    }
}
