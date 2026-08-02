package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;
import java.sql.Timestamp;
import org.json.JSONException;
import org.json.JSONObject;

@AdNetworkIdentifier(packageName = h.d)
/* loaded from: classes4.dex */
public class VungleCreativeInfo extends CreativeInfo {
    private static final String a = "vungle_mraid";
    private static final long serialVersionUID = 0;
    private boolean Y;

    public VungleCreativeInfo() {
        this.Y = false;
    }

    public VungleCreativeInfo(BrandSafetyUtils.AdType adType, String id, String creativeId, String clickUrl, String videoUrl, BrandSafetyEvent.AdFormatType adFormat, String placement_id, String sdkVersion, long expiry, String struct) {
        super(adType, h.d, id, creativeId, clickUrl, videoUrl, struct, sdkVersion);
        this.Y = false;
        a(adFormat);
        this.K = placement_id;
        this.R = new Timestamp(expiry);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean a() {
        return TextUtils.isEmpty(N()) || TextUtils.isEmpty(M());
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean v(String str) {
        return super.v(str);
    }

    public boolean as() {
        return this.Y;
    }

    public void i(boolean z) {
        this.Y = z;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject i = super.i();
        i.put("isLoopingVideo", this.Y);
        return i;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.Y = jSONObject.optBoolean("isLoopingVideo", false);
        }
    }

    public VungleCreativeInfo a(VungleCreativeInfo vungleCreativeInfo) {
        this.bd = this.bd || vungleCreativeInfo.bd;
        if (this.J == null) {
            this.J = vungleCreativeInfo.J;
        }
        if (this.ad == null) {
            this.ad = vungleCreativeInfo.ad;
        }
        if (this.M == null) {
            this.M = vungleCreativeInfo.M;
        }
        return this;
    }
}
