package com.safedk.android.analytics.brandsafety.creatives;

import android.os.Bundle;

/* loaded from: classes5.dex */
public class b {
    private Bundle a = new Bundle();

    public boolean a(AdNetworkConfiguration adNetworkConfiguration) {
        return this.a.containsKey(adNetworkConfiguration.name());
    }

    public boolean b(AdNetworkConfiguration adNetworkConfiguration) {
        return this.a.getBoolean(adNetworkConfiguration.name());
    }

    public boolean a(AdNetworkConfiguration adNetworkConfiguration, boolean z) {
        return this.a.getBoolean(adNetworkConfiguration.name(), z);
    }

    public String c(AdNetworkConfiguration adNetworkConfiguration) {
        return this.a.getString(adNetworkConfiguration.name());
    }

    public String a(AdNetworkConfiguration adNetworkConfiguration, String str) {
        return this.a.getString(adNetworkConfiguration.name(), str);
    }

    public float d(AdNetworkConfiguration adNetworkConfiguration) {
        return this.a.getFloat(adNetworkConfiguration.name());
    }

    public long e(AdNetworkConfiguration adNetworkConfiguration) {
        return this.a.getLong(adNetworkConfiguration.name());
    }

    public void b(AdNetworkConfiguration adNetworkConfiguration, boolean z) {
        this.a.putBoolean(adNetworkConfiguration.name(), z);
    }

    public void b(AdNetworkConfiguration adNetworkConfiguration, String str) {
        this.a.putString(adNetworkConfiguration.name(), str);
    }

    public void a(AdNetworkConfiguration adNetworkConfiguration, float f) {
        this.a.putFloat(adNetworkConfiguration.name(), f);
    }

    public void a(AdNetworkConfiguration adNetworkConfiguration, long j) {
        this.a.putLong(adNetworkConfiguration.name(), j);
    }

    public String toString() {
        return this.a.toString();
    }
}
