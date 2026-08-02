package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zzca;
import defpackage.a70;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class QueryProductDetailsParams {
    public final zzca a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Builder {
        public zzca a;

        @NonNull
        public QueryProductDetailsParams build() {
            if (this.a != null) {
                return new QueryProductDetailsParams(this);
            }
            a70.p("Product list must be set to a non empty list.");
            return null;
        }

        @NonNull
        public Builder setProductList(@NonNull List<Product> list) {
            if (list == null || list.isEmpty()) {
                a70.p("Product list cannot be empty.");
                return null;
            }
            HashSet hashSet = new HashSet();
            for (Product product : list) {
                if (!"play_pass_subs".equals(product.zzb())) {
                    hashSet.add(product.zzb());
                }
            }
            if (hashSet.size() <= 1) {
                this.a = zzca.t(list);
                return this;
            }
            a70.p("All products should be of the same product type.");
            return null;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Product {
        public final String a;
        public final String b;
        public final String c;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static class Builder {
            public String a;
            public String b;
            public String c;

            @NonNull
            public Product build() {
                String str = this.c;
                if ("first_party".equals(str)) {
                    a70.p("Serialized doc id must be provided for first party products.");
                    return null;
                }
                if (this.b == null) {
                    a70.p("Product id must be provided.");
                    return null;
                }
                if (str != null) {
                    return new Product(this);
                }
                a70.p("Product type must be provided.");
                return null;
            }

            @NonNull
            @zzg
            public Builder setDynamicProductToken(@NonNull String str) {
                this.a = str;
                return this;
            }

            @NonNull
            public Builder setProductId(@NonNull String str) {
                this.b = str;
                return this;
            }

            @NonNull
            public Builder setProductType(@NonNull String str) {
                this.c = str;
                return this;
            }
        }

        public /* synthetic */ Product(Builder builder) {
            this.b = builder.b;
            this.c = builder.c;
            this.a = builder.a;
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder();
        }

        @Nullable
        @zzg
        public String getDynamicProductToken() {
            return this.a;
        }

        @NonNull
        public final String zza() {
            return this.b;
        }

        @NonNull
        public final String zzb() {
            return this.c;
        }
    }

    public /* synthetic */ QueryProductDetailsParams(Builder builder) {
        this.a = builder.a;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    public final zzca zza() {
        return this.a;
    }

    @NonNull
    public final String zzb() {
        return ((Product) this.a.get(0)).zzb();
    }
}
