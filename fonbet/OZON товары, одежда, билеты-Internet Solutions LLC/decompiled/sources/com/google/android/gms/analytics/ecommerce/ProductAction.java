package com.google.android.gms.analytics.ecommerce;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

@VisibleForTesting
/* loaded from: classes9.dex */
public class ProductAction {

    @RecentlyNonNull
    public static final String ACTION_ADD = "add";

    @RecentlyNonNull
    public static final String ACTION_CHECKOUT = "checkout";

    @RecentlyNonNull
    public static final String ACTION_CHECKOUT_OPTION = "checkout_option";

    @RecentlyNonNull
    @Deprecated
    public static final String ACTION_CHECKOUT_OPTIONS = "checkout_options";

    @RecentlyNonNull
    public static final String ACTION_CLICK = "click";

    @RecentlyNonNull
    public static final String ACTION_DETAIL = "detail";

    @RecentlyNonNull
    public static final String ACTION_PURCHASE = "purchase";

    @RecentlyNonNull
    public static final String ACTION_REFUND = "refund";

    @RecentlyNonNull
    public static final String ACTION_REMOVE = "remove";
    Map<String, String> zza = new HashMap();

    public ProductAction(@RecentlyNonNull String str) {
        zzb("&pa", str);
    }

    @RecentlyNonNull
    public ProductAction setCheckoutOptions(@RecentlyNonNull String str) {
        zzb("&col", str);
        return this;
    }

    @RecentlyNonNull
    public ProductAction setCheckoutStep(int i11) {
        zzb("&cos", Integer.toString(i11));
        return this;
    }

    @RecentlyNonNull
    public ProductAction setProductActionList(@RecentlyNonNull String str) {
        zzb("&pal", str);
        return this;
    }

    @RecentlyNonNull
    public ProductAction setProductListSource(@RecentlyNonNull String str) {
        zzb("&pls", str);
        return this;
    }

    @RecentlyNonNull
    public ProductAction setTransactionAffiliation(@RecentlyNonNull String str) {
        zzb("&ta", str);
        return this;
    }

    @RecentlyNonNull
    public ProductAction setTransactionCouponCode(@RecentlyNonNull String str) {
        zzb("&tcc", str);
        return this;
    }

    @RecentlyNonNull
    public ProductAction setTransactionId(@RecentlyNonNull String str) {
        zzb("&ti", str);
        return this;
    }

    @RecentlyNonNull
    public ProductAction setTransactionRevenue(double d11) {
        zzb("&tr", Double.toString(d11));
        return this;
    }

    @RecentlyNonNull
    public ProductAction setTransactionShipping(double d11) {
        zzb("&ts", Double.toString(d11));
        return this;
    }

    @RecentlyNonNull
    public ProductAction setTransactionTax(double d11) {
        zzb("&tt", Double.toString(d11));
        return this;
    }

    @RecentlyNonNull
    public String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : this.zza.entrySet()) {
            if (entry.getKey().startsWith("&")) {
                hashMap.put(entry.getKey().substring(1), entry.getValue());
            } else {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return zzj.zzb(hashMap);
    }

    @RecentlyNonNull
    @VisibleForTesting
    public final Map<String, String> zza() {
        return new HashMap(this.zza);
    }

    final void zzb(String str, String str2) {
        Preconditions.checkNotNull(str, "Name should be non-null");
        this.zza.put(str, str2);
    }
}
