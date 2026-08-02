package com.playtika.pras.sdk.network.models;

import org.json.JSONObject;

/* loaded from: classes5.dex */
public class WidgetParams {
    private final boolean fullScreen;
    private final int generation;
    private final String lockOrientation;

    public WidgetParams(JSONObject jSONObject) {
        this.lockOrientation = jSONObject.optString("lockOrientation", null);
        this.fullScreen = jSONObject.optBoolean("fullScreen", false);
        this.generation = jSONObject.getInt("generation");
    }

    public int getGeneration() {
        return this.generation;
    }

    public String getLockOrientation() {
        return this.lockOrientation;
    }

    public boolean isFullScreen() {
        return this.fullScreen;
    }
}
