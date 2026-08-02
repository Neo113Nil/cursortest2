package com.android.billingclient.api;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@zzl
/* loaded from: classes.dex */
public final class BillingConfig {
    public final String a;

    public BillingConfig(String str) {
        this.a = new JSONObject(str).optString("countryCode");
    }

    @NonNull
    public String getCountryCode() {
        return this.a;
    }

    public BillingConfig(String str, int i) {
        this.a = str;
    }
}
