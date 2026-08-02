package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@zzc
@KeepForSdk
/* loaded from: classes.dex */
public final class AlternativeBillingOnlyReportingDetails {
    public final String a;

    public AlternativeBillingOnlyReportingDetails(String str) {
        this.a = new JSONObject(str).optString("externalTransactionToken");
    }

    @NonNull
    public String getExternalTransactionToken() {
        return this.a;
    }
}
