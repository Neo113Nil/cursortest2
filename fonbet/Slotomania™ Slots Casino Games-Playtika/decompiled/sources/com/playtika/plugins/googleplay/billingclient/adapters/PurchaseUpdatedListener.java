package com.playtika.plugins.googleplay.billingclient.adapters;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class PurchaseUpdatedListener implements PurchasesUpdatedListener {
    private final ArrayList<Handler> _handlers = new ArrayList<>();

    public interface Handler {
        void run(BillingClientResult billingClientResult, Handler handler);
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        BillingClientResult billingClientResult = new BillingClientResult(billingResult, list);
        Iterator it = new ArrayList(this._handlers).iterator();
        while (it.hasNext()) {
            Handler handler = (Handler) it.next();
            handler.run(billingClientResult, handler);
        }
    }

    public void addHandler(Handler handler) {
        this._handlers.add(handler);
    }

    public void removeHandler(Handler handler) {
        this._handlers.remove(handler);
    }
}
