package com.unity3d.services.store.gpbl.listeners;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge;

/* compiled from: ProductDetailsResponseListener.kt */
/* loaded from: classes14.dex */
public interface ProductDetailsResponseListener {
    void onProductDetailsResponse(BillingResultBridge billingResultBridge, QueryProductDetailsResultsBridge queryProductDetailsResultsBridge);
}
