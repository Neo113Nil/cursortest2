package com.android.billingclient.api;

import androidx.annotation.NonNull;
import defpackage.fc6;
import defpackage.lun;
import defpackage.ukn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class BillingResult {
    public int a;
    public int b;
    public String c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Builder {
        public int a;
        public int b;
        public String c;

        @NonNull
        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.a = this.a;
            billingResult.b = this.b;
            billingResult.c = this.c;
            return billingResult;
        }

        @NonNull
        public Builder setDebugMessage(@NonNull String str) {
            this.c = str;
            return this;
        }

        @NonNull
        @zzp
        public Builder setOnPurchasesUpdatedSubResponseCode(int i) {
            this.b = i;
            return this;
        }

        @NonNull
        public Builder setResponseCode(int i) {
            this.a = i;
            return this;
        }
    }

    @NonNull
    public static Builder newBuilder() {
        Builder builder = new Builder();
        builder.b = 0;
        builder.c = "";
        return builder;
    }

    @NonNull
    public String getDebugMessage() {
        return this.c;
    }

    @zzp
    public int getOnPurchasesUpdatedSubResponseCode() {
        return this.b;
    }

    public int getResponseCode() {
        return this.a;
    }

    @NonNull
    public String toString() {
        int i = this.a;
        int i2 = com.google.android.gms.internal.play_billing.zzc.a;
        lun lunVar = ukn.c;
        Integer valueOf = Integer.valueOf(i);
        return fc6.n("Response Code: ", (!lunVar.containsKey(valueOf) ? ukn.RESPONSE_CODE_UNSPECIFIED : (ukn) lunVar.get(valueOf)).toString(), ", Debug Message: ", this.c);
    }
}
