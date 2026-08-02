package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@AdNetworkIdentifier(packageName = h.C)
/* loaded from: classes8.dex */
public class PubMaticCreativeInfo extends CreativeInfo {
    private String E;
    private String a;

    public PubMaticCreativeInfo(BrandSafetyUtils.AdType adType, String id, String creativeId, BrandSafetyEvent.AdFormatType adFormatType, String placementId, String sdkVersion, String eventId) {
        super(adType, h.F, id, creativeId, null, null, null, sdkVersion);
        this.E = null;
        this.K = placementId;
        a(adFormatType);
        h(eventId);
    }

    public String as() {
        return this.a;
    }

    public void d(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        this.a = sb.toString();
    }

    public String at() {
        return this.E;
    }

    public void a(String str) {
        this.E = str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject i = super.i();
        if (!TextUtils.isEmpty(this.a)) {
            i.put("allMediaUrls", this.a);
        }
        if (!TextUtils.isEmpty(this.E)) {
            i.put("innerImpressionUrl", this.E);
        }
        return i;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.a = jSONObject.optString("allMediaUrls", "");
            this.E = jSONObject.optString("innerImpressionUrl", "");
        }
    }
}
