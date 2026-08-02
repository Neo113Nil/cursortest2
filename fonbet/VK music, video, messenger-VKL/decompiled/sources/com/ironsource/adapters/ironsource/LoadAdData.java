package com.ironsource.adapters.ironsource;

import org.json.JSONObject;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class LoadAdData {
    private final JSONObject localAdData;

    /* JADX WARN: Multi-variable type inference failed */
    public LoadAdData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String adUnitId() {
        String optString = this.localAdData.optString("adUnitId");
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    public final boolean isMultipleAdObjectsFlow() {
        return this.localAdData.optBoolean("isMultipleAdUnits", false);
    }

    public LoadAdData(JSONObject jSONObject) {
        this.localAdData = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public /* synthetic */ LoadAdData(JSONObject jSONObject, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : jSONObject);
    }
}
