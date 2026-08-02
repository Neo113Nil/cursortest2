package com.playtika.pras.sdk.network.models.results;

import android.os.Bundle;
import com.playtika.pras.sdk.network.models.Products;

/* loaded from: classes3.dex */
public class ProductDetailsResult extends BillingResult {
    private static final String BUNDLE_DETAILS_LIST = "DETAILS_LIST";

    public ProductDetailsResult(Products products) {
        super(products);
    }

    @Override // com.playtika.pras.sdk.network.models.results.BillingResult
    public Bundle getBundle() {
        Bundle bundle = super.getBundle();
        Products products = (Products) getResponse();
        if (products != null) {
            bundle.putStringArrayList(BUNDLE_DETAILS_LIST, products.getProducts());
        }
        return bundle;
    }
}
