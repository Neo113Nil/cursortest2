package com.playtika.pras.sdk.network.models;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import io.sentry.protocol.Device;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class WidgetSessionRequest {
    private final String appSessionId;
    private final String appTxnId;
    private final String appUid;
    private final String appUserToken;
    private final Long appVersionCode;
    private final Integer clientType;
    private final String currency;
    private final String developerPayload;
    private final DeviceInfo device;
    private final String extraParamsJson;
    private final String idempotencyKey;
    private final String locale;
    private final String packageName;
    private final String platform;
    private final String productId;
    private final String sdkRuntimeGuid;
    private final String sdkType;
    private final Integer sdkVersionCode;
    private final String sessionType;

    public WidgetSessionRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Integer num, String str15, Integer num2, Long l, DeviceInfo deviceInfo) {
        this.appUid = str;
        this.packageName = str2;
        this.sessionType = str3;
        this.platform = str4;
        this.sdkRuntimeGuid = str5;
        this.sdkType = str6;
        this.appUserToken = str7;
        this.appSessionId = str8;
        this.productId = str9;
        this.locale = str10;
        this.currency = str11;
        this.idempotencyKey = str12;
        this.developerPayload = str13;
        this.appTxnId = str14;
        this.clientType = num;
        this.extraParamsJson = str15;
        this.sdkVersionCode = num2;
        this.appVersionCode = l;
        this.device = deviceInfo;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appUid", this.appUid);
        jSONObject.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, this.packageName);
        jSONObject.put("sessionType", this.sessionType);
        jSONObject.put("platform", this.platform);
        jSONObject.put("sdkRuntimeGuid", this.sdkRuntimeGuid);
        jSONObject.put("sdkType", this.sdkType);
        String str = this.appUserToken;
        if (str != null) {
            jSONObject.put("appUserToken", str);
        }
        String str2 = this.appSessionId;
        if (str2 != null) {
            jSONObject.put("appSessionId", str2);
        }
        String str3 = this.productId;
        if (str3 != null) {
            jSONObject.put(InAppPurchaseMetaData.KEY_PRODUCT_ID, str3);
        }
        String str4 = this.locale;
        if (str4 != null) {
            jSONObject.put(Device.JsonKeys.LOCALE, str4);
        }
        String str5 = this.currency;
        if (str5 != null) {
            jSONObject.put("currency", str5);
        }
        String str6 = this.idempotencyKey;
        if (str6 != null) {
            jSONObject.put("idempotencyKey", str6);
        }
        String str7 = this.developerPayload;
        if (str7 != null) {
            jSONObject.put(SDKConstants.PARAM_DEVELOPER_PAYLOAD, str7);
        }
        String str8 = this.appTxnId;
        if (str8 != null) {
            jSONObject.put("appTxnId", str8);
        }
        Integer num = this.clientType;
        if (num != null) {
            jSONObject.put("clientType", num);
        }
        String str9 = this.extraParamsJson;
        if (str9 != null) {
            jSONObject.put("extraParamsJson", str9);
        }
        Integer num2 = this.sdkVersionCode;
        if (num2 != null) {
            jSONObject.put("sdkVersionCode", num2);
        }
        Long l = this.appVersionCode;
        if (l != null) {
            jSONObject.put("appVersionCode", l);
        }
        if (this.device != null) {
            JSONObject jSONObject2 = new JSONObject();
            if (this.device.getSdkAndroidId() != null) {
                jSONObject2.put("sdkAndroidId", this.device.getSdkAndroidId());
            }
            if (this.device.getVendor() != null) {
                jSONObject2.put("vendor", this.device.getVendor());
            }
            if (this.device.getModel() != null) {
                jSONObject2.put("model", this.device.getModel());
            }
            if (this.device.getType() != null) {
                jSONObject2.put("type", this.device.getType());
            }
            jSONObject.put("deviceInfo", jSONObject2);
        }
        return jSONObject;
    }
}
