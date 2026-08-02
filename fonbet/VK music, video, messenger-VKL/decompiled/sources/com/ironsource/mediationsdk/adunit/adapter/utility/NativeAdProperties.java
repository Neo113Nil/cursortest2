package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.C4452n4;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class NativeAdProperties {
    private final AdOptionsPosition adOptionsPosition;
    private final AdOptionsPosition defaultAdOptionPosition = AdOptionsPosition.BOTTOM_LEFT;

    public NativeAdProperties(JSONObject jSONObject) {
        this.adOptionsPosition = getAdOptionsPosition(jSONObject);
    }

    public final AdOptionsPosition getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    private final AdOptionsPosition getAdOptionsPosition(JSONObject jSONObject) {
        try {
            return AdOptionsPosition.valueOf(jSONObject.optString(AdOptionsPosition.AD_OPTIONS_POSITION_KEY, this.defaultAdOptionPosition.toString()));
        } catch (Exception e) {
            C4452n4.d().a(e);
            return this.defaultAdOptionPosition;
        }
    }
}
