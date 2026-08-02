package com.playtika.plugins.googleplay.billingclient.adapters;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class BillingClientResult {
    public BillingResult billingResult;
    public List<Purchase> purchaseList;

    public BillingClientResult(BillingResult billingResult, List<Purchase> list) {
        this.billingResult = billingResult;
        this.purchaseList = list == null ? new ArrayList<>() : list;
    }

    public Boolean isOk() {
        return Boolean.valueOf(this.billingResult.getResponseCode() == 0);
    }

    public Boolean containsInPurchaseList(String str) {
        Iterator<Purchase> it = this.purchaseList.iterator();
        while (it.hasNext()) {
            ArrayList<String> skus = it.next().getSkus();
            if (skus.size() > 1) {
                throw new RuntimeException("Cordova billing client does not support multi skus purchases");
            }
            if (skus.size() > 0 && skus.get(0).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResponseCode = ");
        sb.append(this.billingResult.getResponseCode()).append(", debugMessage = ").append(this.billingResult.getDebugMessage());
        sb.append(", PurchaseList = [");
        int size = this.purchaseList.size();
        for (int i = 0; i < size; i++) {
            Purchase purchase = this.purchaseList.get(i);
            ArrayList<String> skus = purchase.getSkus();
            if (skus.size() > 1) {
                throw new RuntimeException("Cordova billing client does not support multi skus purchases");
            }
            if (skus.size() != 0) {
                sb.append(purchase.getSkus().get(0));
            }
            if (i != size - 1) {
                sb.append(",");
            }
        }
        sb.append(X3.j.e);
        return sb.toString();
    }
}
