package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.C4157k4;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class NativeAdProperties {

    @NotNull
    private final AdOptionsPosition adOptionsPosition;

    @NotNull
    private final AdOptionsPosition defaultAdOptionPosition;

    public NativeAdProperties(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.defaultAdOptionPosition = AdOptionsPosition.BOTTOM_LEFT;
        this.adOptionsPosition = getAdOptionsPosition(jSONObject);
    }

    private final AdOptionsPosition getAdOptionsPosition(JSONObject jSONObject) {
        String optString = jSONObject.optString(AdOptionsPosition.AD_OPTIONS_POSITION_KEY, this.defaultAdOptionPosition.toString());
        try {
            optString.getClass();
            return AdOptionsPosition.valueOf(optString);
        } catch (Exception e) {
            C4157k4.d().a(e);
            return this.defaultAdOptionPosition;
        }
    }

    @NotNull
    public final AdOptionsPosition getAdOptionsPosition() {
        return this.adOptionsPosition;
    }
}
