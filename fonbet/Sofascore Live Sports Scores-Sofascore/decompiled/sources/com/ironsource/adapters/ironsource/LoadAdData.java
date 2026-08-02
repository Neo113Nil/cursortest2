package com.ironsource.adapters.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class LoadAdData {

    @NotNull
    private final JSONObject localAdData;

    public LoadAdData(@Nullable JSONObject jSONObject) {
        this.localAdData = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Nullable
    public final String adUnitId() {
        String optString = this.localAdData.optString("adUnitId");
        optString.getClass();
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    public final boolean isMultipleAdObjectsFlow() {
        return this.localAdData.optBoolean("isMultipleAdUnits", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoadAdData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ LoadAdData(JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jSONObject);
    }
}
