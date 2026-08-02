package com.playtika.pras.sdk.network.models;

import org.json.JSONObject;

/* loaded from: classes8.dex */
public class RetryPolicy {
    private final double backoffMultiplier;
    private final int initialInterval;
    private final int initialTimeout;
    private final int maxAttempts;
    private final int maxInterval;
    private final int maxTimeout;

    public RetryPolicy(JSONObject jSONObject) {
        this.maxAttempts = jSONObject.getInt("maxAttempts");
        this.initialInterval = jSONObject.getInt("initialInterval");
        this.maxInterval = jSONObject.getInt("maxInterval");
        this.initialTimeout = jSONObject.getInt("initialTimeout");
        this.maxTimeout = jSONObject.getInt("maxTimeout");
        this.backoffMultiplier = jSONObject.getDouble("backoffMultiplier");
    }

    public double getBackoffMultiplier() {
        return this.backoffMultiplier;
    }

    public int getInitialInterval() {
        return this.initialInterval;
    }

    public int getInitialTimeout() {
        return this.initialTimeout;
    }

    public int getMaxAttempts() {
        return this.maxAttempts;
    }

    public int getMaxInterval() {
        return this.maxInterval;
    }

    public int getMaxTimeout() {
        return this.maxTimeout;
    }
}
