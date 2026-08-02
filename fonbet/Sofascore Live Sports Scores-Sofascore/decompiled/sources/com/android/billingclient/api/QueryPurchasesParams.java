package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.android.billingclient.api.BillingClient;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class QueryPurchasesParams {
    public final String a;
    public final boolean b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Builder {
        public String a;
        public boolean b;

        @NonNull
        public QueryPurchasesParams build() {
            String str = this.a;
            if (str == null) {
                a70.p("Product type must be set");
                return null;
            }
            if (!this.b || str.equals(BillingClient.ProductType.SUBS)) {
                return new QueryPurchasesParams(this);
            }
            a70.p("includeSuspendedSubscriptions is only supported for subscription purchases");
            return null;
        }

        @NonNull
        public Builder includeSuspendedSubscriptions(boolean z) {
            this.b = z;
            return this;
        }

        @NonNull
        public Builder setProductType(@NonNull String str) {
            this.a = str;
            return this;
        }
    }

    public /* synthetic */ QueryPurchasesParams(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
    }

    @NonNull
    public static Builder newBuilder() {
        Builder builder = new Builder();
        builder.b = false;
        return builder;
    }

    public boolean getIncludeSuspendedSubscriptions() {
        return this.b;
    }

    @NonNull
    public final String zza() {
        return this.a;
    }
}
