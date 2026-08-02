package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;
import org.json.JSONException;
import org.json.JSONObject;

@AdNetworkIdentifier(packageName = h.f)
/* loaded from: classes6.dex */
public class IronSourceCreativeInfo extends CreativeInfo {
    private static final String Y = "playableAd";
    private static final String Z = "creativeURL&quot;:&quot;";
    private static final String a = "cpvi";
    private static final long serialVersionUID = 0;
    private String aa;
    private String ab;
    private String ac;

    public IronSourceCreativeInfo() {
    }

    public IronSourceCreativeInfo(String id, String creativeId, String clickUrl, String videoUrl, String sdkAdType, String playableAd, BrandSafetyEvent.AdFormatType adFormat, String placementId, String endCardUrl, String sdkVersion, String buyerID) {
        super(BrandSafetyUtils.AdType.INTERSTITIAL, h.f, id, creativeId, clickUrl, videoUrl, sdkAdType, sdkVersion);
        this.aa = playableAd;
        y(playableAd);
        a(adFormat);
        this.K = placementId;
        this.ab = sdkAdType;
        this.ar = buyerID;
        this.W = !TextUtils.isEmpty(playableAd);
        this.at = endCardUrl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        if (r3.equals(com.safedk.android.analytics.brandsafety.creatives.infos.IronSourceCreativeInfo.a) != false) goto L22;
     */
    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a() {
        char c = 0;
        boolean z = TextUtils.isEmpty(N()) || TextUtils.isEmpty(M());
        if (!z) {
            String str = this.ab;
            int hashCode = str.hashCode();
            if (hashCode != 3060704) {
                if (hashCode == 1967260497 && str.equals(Y)) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                return TextUtils.isEmpty(this.J);
            }
            if (c == 1) {
                return TextUtils.isEmpty(this.aa);
            }
            return z;
        }
        return z;
    }

    public String as() {
        return this.ac;
    }

    public String at() {
        return this.ab;
    }

    public String au() {
        return this.aa;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public void F(String str) {
        super.F(str);
        if (str != null && str.indexOf(Z) > -1) {
            this.ac = str.split(Z)[1].split("&quot;,&quot;")[0];
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject i = super.i();
        if (!TextUtils.isEmpty(this.aa)) {
            i.put("playableUrl", this.aa);
        }
        if (!TextUtils.isEmpty(this.ab)) {
            i.put("sdkAdType", this.ab);
        }
        if (!TextUtils.isEmpty(this.ac)) {
            i.put("creativeUrl", this.ac);
        }
        return i;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.aa = jSONObject.optString("playableUrl", "");
            this.ab = jSONObject.optString("sdkAdType", "");
            this.ac = jSONObject.optString("creativeUrl", "");
        }
    }
}
