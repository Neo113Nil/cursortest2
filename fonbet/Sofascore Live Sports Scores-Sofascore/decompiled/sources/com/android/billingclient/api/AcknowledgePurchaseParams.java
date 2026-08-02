package com.android.billingclient.api;

import androidx.annotation.NonNull;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class AcknowledgePurchaseParams {
    public String a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
        public String a;

        @NonNull
        public AcknowledgePurchaseParams build() {
            String str = this.a;
            if (str == null) {
                a70.p("Purchase token must be set");
                return null;
            }
            AcknowledgePurchaseParams acknowledgePurchaseParams = new AcknowledgePurchaseParams();
            acknowledgePurchaseParams.a = str;
            return acknowledgePurchaseParams;
        }

        @NonNull
        public Builder setPurchaseToken(@NonNull String str) {
            this.a = str;
            return this;
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    @NonNull
    public String getPurchaseToken() {
        return this.a;
    }
}
