package com.playtika.pras.sdk.network.models;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class SdkInitRequest {
    private final String appSessionId;
    private final String appUid;
    private final String appUserToken;
    private final long appVersionCode;
    private final Integer clientType;
    private final String packageName;
    private final String platform;
    private final String sdkType;
    private final int sdkVersionCode;

    public SdkInitRequest(String str, String str2, String str3, String str4, String str5, int i, long j, Integer num, String str6) {
        this.packageName = str;
        this.appUid = str2;
        this.platform = str3;
        this.sdkType = str4;
        this.appUserToken = str5;
        this.sdkVersionCode = i;
        this.appVersionCode = j;
        this.clientType = num;
        this.appSessionId = str6;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, this.packageName);
        jSONObject.put("appUid", this.appUid);
        jSONObject.put("platform", this.platform);
        jSONObject.put("sdkType", this.sdkType);
        jSONObject.put("appUserToken", this.appUserToken);
        jSONObject.put("sdkVersionCode", this.sdkVersionCode);
        jSONObject.put("appVersionCode", this.appVersionCode);
        Integer num = this.clientType;
        if (num != null) {
            jSONObject.put("clientType", num);
        }
        String str = this.appSessionId;
        if (str != null) {
            jSONObject.put("appSessionId", str);
        }
        return jSONObject;
    }
}
