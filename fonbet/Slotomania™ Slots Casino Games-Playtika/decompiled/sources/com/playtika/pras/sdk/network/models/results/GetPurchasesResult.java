package com.playtika.pras.sdk.network.models.results;

import android.os.Bundle;
import com.playtika.pras.sdk.network.models.Purchases;

/* loaded from: classes5.dex */
public class GetPurchasesResult extends BillingResult {
    private static final String BUNDLE_CONTINUATION_TOKEN = "INAPP_CONTINUATION_TOKEN";
    private static final String BUNDLE_DATA_SIGNATURES = "INAPP_DATA_SIGNATURE_LIST";
    private static final String BUNDLE_PURCHASE_DATA_LIST = "INAPP_PURCHASE_DATA_LIST";
    private static final String BUNDLE_PURCHASE_ITEMS = "INAPP_PURCHASE_ITEM_LIST";

    public GetPurchasesResult(Purchases purchases) {
        super(purchases);
    }

    @Override // com.playtika.pras.sdk.network.models.results.BillingResult
    public Bundle getBundle() {
        Bundle bundle = super.getBundle();
        Purchases purchases = (Purchases) getResponse();
        if (purchases != null) {
            bundle.putStringArrayList(BUNDLE_PURCHASE_ITEMS, purchases.getPurchaseItems());
            bundle.putStringArrayList(BUNDLE_PURCHASE_DATA_LIST, purchases.getPurchaseDataList());
            bundle.putStringArrayList(BUNDLE_DATA_SIGNATURES, purchases.getDataSignatures());
            bundle.putString(BUNDLE_CONTINUATION_TOKEN, purchases.getContinuationToken());
        }
        return bundle;
    }
}
