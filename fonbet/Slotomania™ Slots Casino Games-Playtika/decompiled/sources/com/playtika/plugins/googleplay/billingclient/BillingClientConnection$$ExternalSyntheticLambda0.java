package com.playtika.plugins.googleplay.billingclient;

import com.playtika.plugins.googleplay.billingclient.adapters.BillingClientResult;
import com.playtika.plugins.googleplay.billingclient.adapters.PurchaseUpdatedListener;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class BillingClientConnection$$ExternalSyntheticLambda0 implements PurchaseUpdatedListener.Handler {
    public final /* synthetic */ BillingClientConnection f$0;

    public /* synthetic */ BillingClientConnection$$ExternalSyntheticLambda0(BillingClientConnection billingClientConnection) {
        this.f$0 = billingClientConnection;
    }

    @Override // com.playtika.plugins.googleplay.billingclient.adapters.PurchaseUpdatedListener.Handler
    public final void run(BillingClientResult billingClientResult, PurchaseUpdatedListener.Handler handler) {
        this.f$0.onPurchaseUpdated(billingClientResult, handler);
    }
}
