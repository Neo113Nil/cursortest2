package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;
import org.json.JSONException;
import org.json.JSONObject;

@AdNetworkIdentifier(packageName = h.c)
/* loaded from: classes5.dex */
public class ChartboostCreativeInfo extends CreativeInfo {
    private static final String a = "advertised_content";
    private static final long serialVersionUID = 0;
    private String E;

    public ChartboostCreativeInfo() {
    }

    public ChartboostCreativeInfo(BrandSafetyUtils.AdType adType, String sdk, String sdkVersion) {
        super(adType, sdk, null, null, null, null, null, sdkVersion);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle b() {
        Bundle b = super.b();
        if (!TextUtils.isEmpty(this.E)) {
            b.putString(a, this.E);
        }
        return b;
    }

    public void a(String str) {
        this.E = str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject i = super.i();
        if (!TextUtils.isEmpty(this.E)) {
            i.put("advertisedContent", this.E);
        }
        return i;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.E = jSONObject.optString("advertisedContent", "");
        }
    }
}
