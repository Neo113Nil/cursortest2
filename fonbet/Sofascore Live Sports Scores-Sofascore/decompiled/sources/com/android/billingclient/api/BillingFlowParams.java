package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.billingclient.api.ProductDetails;
import com.google.android.gms.internal.play_billing.zzca;
import defpackage.a70;
import defpackage.dqn;
import defpackage.yhk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class BillingFlowParams {
    public boolean a;
    public String b;
    public String c;
    public SubscriptionUpdateParams d;
    public zzca e;
    public ArrayList f;
    public boolean g;
    public DeveloperBillingOptionParams h;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Builder {
        public String a;
        public String b;
        public ArrayList c;
        public boolean d;
        public SubscriptionUpdateParams.Builder e;
        public DeveloperBillingOptionParams f;

        @NonNull
        public BillingFlowParams build() {
            zzca zzcaVar;
            ArrayList arrayList = this.c;
            if (arrayList == null || arrayList.isEmpty()) {
                a70.p("Details of the products must be provided.");
                return null;
            }
            ArrayList arrayList2 = this.c;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((ProductDetailsParams) it.next()) == null) {
                        a70.p("ProductDetailsParams cannot be null.");
                        return null;
                    }
                }
            }
            BillingFlowParams billingFlowParams = new BillingFlowParams();
            billingFlowParams.a = !((ProductDetailsParams) this.c.get(0)).zza().zza().isEmpty();
            billingFlowParams.b = this.a;
            billingFlowParams.c = this.b;
            billingFlowParams.d = this.e.build();
            billingFlowParams.f = new ArrayList();
            billingFlowParams.g = this.d;
            ArrayList arrayList3 = this.c;
            if (arrayList3 != null) {
                zzcaVar = zzca.t(arrayList3);
            } else {
                dqn dqnVar = zzca.b;
                zzcaVar = com.google.android.gms.internal.play_billing.a.e;
            }
            billingFlowParams.e = zzcaVar;
            billingFlowParams.h = this.f;
            return billingFlowParams;
        }

        @NonNull
        @zzk
        public Builder enableDeveloperBillingOption(@NonNull DeveloperBillingOptionParams developerBillingOptionParams) {
            this.f = developerBillingOptionParams;
            return this;
        }

        @NonNull
        public Builder setIsOfferPersonalized(boolean z) {
            this.d = z;
            return this;
        }

        @NonNull
        public Builder setObfuscatedAccountId(@NonNull String str) {
            this.a = str;
            return this;
        }

        @NonNull
        public Builder setObfuscatedProfileId(@NonNull String str) {
            this.b = str;
            return this;
        }

        @NonNull
        public Builder setProductDetailsParamsList(@NonNull List<ProductDetailsParams> list) {
            this.c = new ArrayList(list);
            return this;
        }

        @NonNull
        public Builder setSubscriptionUpdateParams(@NonNull SubscriptionUpdateParams subscriptionUpdateParams) {
            SubscriptionUpdateParams.Builder newBuilder = SubscriptionUpdateParams.newBuilder();
            newBuilder.setOldPurchaseToken(subscriptionUpdateParams.a);
            newBuilder.setSubscriptionReplacementMode(subscriptionUpdateParams.c);
            newBuilder.setOriginalExternalTransactionId(subscriptionUpdateParams.b);
            this.e = newBuilder;
            return this;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class ProductDetailsParams {
        public final SubscriptionProductReplacementParams a;
        public final ProductDetails b;
        public final String c;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static class Builder {
            public SubscriptionProductReplacementParams a;
            public ProductDetails b;
            public String c;

            @NonNull
            public ProductDetailsParams build() {
                if (this.b != null) {
                    return new ProductDetailsParams(this);
                }
                yhk.s("ProductDetails is required for constructing ProductDetailsParams.");
                return null;
            }

            @NonNull
            public Builder setOfferToken(@NonNull String str) {
                if (TextUtils.isEmpty(str)) {
                    a70.p("offerToken can not be empty");
                    return null;
                }
                this.c = str;
                return this;
            }

            @NonNull
            public Builder setProductDetails(@NonNull ProductDetails productDetails) {
                this.b = productDetails;
                if (productDetails.getOneTimePurchaseOfferDetails() != null) {
                    productDetails.getOneTimePurchaseOfferDetails().getClass();
                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                    if (oneTimePurchaseOfferDetails.getOfferToken() != null) {
                        this.c = oneTimePurchaseOfferDetails.getOfferToken();
                    }
                }
                return this;
            }

            @NonNull
            @zzx
            public Builder setSubscriptionProductReplacementParams(@NonNull SubscriptionProductReplacementParams subscriptionProductReplacementParams) {
                this.a = subscriptionProductReplacementParams;
                return this;
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @zzx
        public static class SubscriptionProductReplacementParams {
            public String a;
            public int b;

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @zzx
            public static class Builder {
                public String a;
                public int b;

                @NonNull
                @zzx
                public SubscriptionProductReplacementParams build() {
                    SubscriptionProductReplacementParams subscriptionProductReplacementParams = new SubscriptionProductReplacementParams();
                    subscriptionProductReplacementParams.a = this.a;
                    subscriptionProductReplacementParams.b = this.b;
                    return subscriptionProductReplacementParams;
                }

                @NonNull
                @zzx
                public Builder setOldProductId(@NonNull String str) {
                    this.a = str;
                    return this;
                }

                @NonNull
                @zzx
                public Builder setReplacementMode(int i) {
                    this.b = i;
                    return this;
                }
            }

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Retention(RetentionPolicy.SOURCE)
            public @interface ReplacementMode {
                public static final int CHARGE_FULL_PRICE = 4;
                public static final int CHARGE_PRORATED_PRICE = 2;
                public static final int DEFERRED = 5;
                public static final int KEEP_EXISTING = 6;
                public static final int UNKNOWN_REPLACEMENT_MODE = 0;
                public static final int WITHOUT_PRORATION = 3;
                public static final int WITH_TIME_PRORATION = 1;
            }

            @NonNull
            public static Builder newBuilder() {
                Builder builder = new Builder();
                builder.b = 0;
                return builder;
            }

            @NonNull
            @zzx
            public String getOldProductId() {
                return this.a;
            }

            @zzx
            public int getReplacementMode() {
                return this.b;
            }
        }

        public /* synthetic */ ProductDetailsParams(Builder builder) {
            this.b = builder.b;
            this.c = builder.c;
            this.a = builder.a;
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder();
        }

        @Nullable
        @zzx
        public SubscriptionProductReplacementParams getSubscriptionProductReplacementParams() {
            return this.a;
        }

        @NonNull
        public final ProductDetails zza() {
            return this.b;
        }

        @Nullable
        public final String zzb() {
            return this.c;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class SubscriptionUpdateParams {
        public String a;
        public String b;
        public int c;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static class Builder {
            public String a;
            public String b;
            public boolean c;
            public int d;

            @NonNull
            public SubscriptionUpdateParams build() {
                boolean z = true;
                if (TextUtils.isEmpty(this.a) && TextUtils.isEmpty(null)) {
                    z = false;
                }
                boolean isEmpty = TextUtils.isEmpty(this.b);
                if (z && !isEmpty) {
                    a70.p("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                    return null;
                }
                if (!this.c && !z && isEmpty) {
                    a70.p("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                    return null;
                }
                SubscriptionUpdateParams subscriptionUpdateParams = new SubscriptionUpdateParams();
                subscriptionUpdateParams.a = this.a;
                subscriptionUpdateParams.c = this.d;
                subscriptionUpdateParams.b = this.b;
                return subscriptionUpdateParams;
            }

            @NonNull
            public Builder setOldPurchaseToken(@NonNull String str) {
                this.a = str;
                return this;
            }

            @NonNull
            @zzb
            public Builder setOriginalExternalTransactionId(@NonNull String str) {
                this.b = str;
                return this;
            }

            @NonNull
            @Deprecated
            public Builder setSubscriptionReplacementMode(int i) {
                this.d = i;
                return this;
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Retention(RetentionPolicy.SOURCE)
        public @interface ReplacementMode {
            public static final int CHARGE_FULL_PRICE = 5;
            public static final int CHARGE_PRORATED_PRICE = 2;
            public static final int DEFERRED = 6;
            public static final int UNKNOWN_REPLACEMENT_MODE = 0;
            public static final int WITHOUT_PRORATION = 3;
            public static final int WITH_TIME_PRORATION = 1;
        }

        @NonNull
        public static Builder newBuilder() {
            Builder builder = new Builder();
            builder.d = 0;
            return builder;
        }
    }

    @NonNull
    public static Builder newBuilder() {
        Builder builder = new Builder();
        SubscriptionUpdateParams.Builder newBuilder = SubscriptionUpdateParams.newBuilder();
        newBuilder.c = true;
        builder.e = newBuilder;
        return builder;
    }

    @Nullable
    @zzk
    public DeveloperBillingOptionParams getDeveloperBillingOptionParams() {
        return this.h;
    }

    public int zza() {
        return 0;
    }

    public final int zzb() {
        return this.d.c;
    }

    public long zzc() {
        return 0L;
    }

    @Nullable
    public final String zze() {
        return this.b;
    }

    @Nullable
    public final String zzf() {
        return this.c;
    }

    @Nullable
    @Deprecated
    public String zzg() {
        return null;
    }

    @Nullable
    @Deprecated
    public final String zzh() {
        return this.d.a;
    }

    @Nullable
    public final String zzi() {
        return this.d.b;
    }

    @NonNull
    public final ArrayList zzj() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f);
        return arrayList;
    }

    @NonNull
    public final List zzk() {
        return this.e;
    }

    public final boolean zzt() {
        return this.g;
    }
}
