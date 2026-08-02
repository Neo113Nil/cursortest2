package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@zzu
/* loaded from: classes.dex */
public final class QueryProductDetailsResult {
    public final List a;
    public final List b;

    public QueryProductDetailsResult(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @NonNull
    public static QueryProductDetailsResult create(@NonNull List<ProductDetails> list, @NonNull List<UnfetchedProduct> list2) {
        return new QueryProductDetailsResult(list, list2);
    }

    @NonNull
    @zzu
    public List<ProductDetails> getProductDetailsList() {
        return this.a;
    }

    @NonNull
    @zzu
    public List<UnfetchedProduct> getUnfetchedProductList() {
        return this.b;
    }
}
