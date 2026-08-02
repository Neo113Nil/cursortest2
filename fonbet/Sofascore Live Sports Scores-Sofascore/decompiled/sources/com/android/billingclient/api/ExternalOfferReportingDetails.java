package com.android.billingclient.api;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@zzi
/* loaded from: classes.dex */
public final class ExternalOfferReportingDetails {
    public final String a;

    public ExternalOfferReportingDetails(String str) {
        this.a = new JSONObject(str).optString("externalTransactionToken");
    }

    @NonNull
    public String getExternalTransactionToken() {
        return this.a;
    }
}
