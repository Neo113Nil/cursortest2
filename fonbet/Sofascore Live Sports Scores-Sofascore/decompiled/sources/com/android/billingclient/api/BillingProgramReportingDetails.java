package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@zzf
/* loaded from: classes.dex */
public final class BillingProgramReportingDetails {
    public final String a;
    public final int b;

    public BillingProgramReportingDetails(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public int getBillingProgram() {
        return this.b;
    }

    @NonNull
    public String getExternalTransactionToken() {
        return this.a;
    }
}
