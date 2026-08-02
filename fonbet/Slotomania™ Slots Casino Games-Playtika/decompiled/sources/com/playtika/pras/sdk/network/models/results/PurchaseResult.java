package com.playtika.pras.sdk.network.models.results;

import android.os.Bundle;
import com.playtika.pras.sdk.network.models.PurchaseConfirmation;

/* loaded from: classes8.dex */
public class PurchaseResult extends BillingResult {
    private static final String BUNDLE_PURCHASE_DATA = "INAPP_PURCHASE_DATA";
    private static final String BUNDLE_PURCHASE_DATA_SIGNATURE = "INAPP_DATA_SIGNATURE";

    public PurchaseResult(PurchaseConfirmation purchaseConfirmation) {
        super(purchaseConfirmation);
    }

    @Override // com.playtika.pras.sdk.network.models.results.BillingResult
    public Bundle getBundle() {
        Bundle bundle = super.getBundle();
        PurchaseConfirmation purchaseConfirmation = (PurchaseConfirmation) getResponse();
        bundle.putString(BUNDLE_PURCHASE_DATA, purchaseConfirmation.getPurchaseData());
        bundle.putString(BUNDLE_PURCHASE_DATA_SIGNATURE, purchaseConfirmation.getPurchaseDataSignature());
        return bundle;
    }
}
