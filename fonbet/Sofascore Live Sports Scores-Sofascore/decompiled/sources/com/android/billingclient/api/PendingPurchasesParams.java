package com.android.billingclient.api;

import androidx.annotation.NonNull;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@zzt
/* loaded from: classes.dex */
public final class PendingPurchasesParams {
    public final boolean a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @zzt
    public static final class Builder {
        public boolean a;
        public boolean b;

        @NonNull
        public PendingPurchasesParams build() {
            if (this.a) {
                return new PendingPurchasesParams(this.b);
            }
            a70.p("Pending purchases for one-time products must be supported.");
            return null;
        }

        @NonNull
        public Builder enableOneTimeProducts() {
            this.a = true;
            return this;
        }

        @NonNull
        public Builder enablePrepaidPlans() {
            this.b = true;
            return this;
        }
    }

    public PendingPurchasesParams(boolean z) {
        this.a = z;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }
}
