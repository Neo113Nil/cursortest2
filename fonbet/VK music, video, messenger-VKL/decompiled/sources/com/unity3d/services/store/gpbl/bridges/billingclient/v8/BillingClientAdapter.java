package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsResponseListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy;
import com.unity3d.services.store.gpbl.proxies.ProductDetailsResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* compiled from: BillingClientAdapter.kt */
/* loaded from: classes14.dex */
public final class BillingClientAdapter extends com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter {
    private BillingClientBridge billingClient;
    private final BillingClientBuilderBridge billingClientBuilderBridge;

    public BillingClientAdapter(BillingClientBuilderBridge billingClientBuilderBridge) {
        this.billingClientBuilderBridge = billingClientBuilderBridge;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public String getAdapterVersion() {
        return "8";
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void initialize(BillingInitializationListener billingInitializationListener) {
        if (isInitialized()) {
            billingInitializationListener.onIsAlreadyInitialized();
            return;
        }
        this.billingClientBuilderBridge.setListener(new PurchaseUpdatedListenerProxy(billingInitializationListener));
        this.billingClientBuilderBridge.enablePendingPurchases();
        this.billingClient = (BillingClientBridge) this.billingClientBuilderBridge.build();
        startConnection(billingInitializationListener);
        get_isInitialized$unity_ads_defaultRelease().setValue(Boolean.TRUE);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public BillingResultResponseCode isFeatureSupported(String str) {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            billingClientBridge = null;
        }
        return billingClientBridge.isFeatureSupported(str);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public boolean isReady() {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            billingClientBridge = null;
        }
        return billingClientBridge.isReady();
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void queryProductDetailsAsync(String str, String str2, final ProductDetailsListener productDetailsListener) {
        QueryProductDetailsParamsBridge build = QueryProductDetailsParamsBridge.Companion.newBuilder().setProductList(Collections.singletonList(ProductBridge.Companion.newBuilder().setProductId(str).setProductType(str2).build())).build();
        ProductDetailsResponseListenerProxy productDetailsResponseListenerProxy = new ProductDetailsResponseListenerProxy(new ProductDetailsResponseListener() { // from class: com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter$queryProductDetailsAsync$productDetailsResponseListenerProxy$1
            @Override // com.unity3d.services.store.gpbl.listeners.ProductDetailsResponseListener
            public void onProductDetailsResponse(BillingResultBridge billingResultBridge, QueryProductDetailsResultsBridge queryProductDetailsResultsBridge) {
                List<ProductDetailsBridge> productDetailsList = queryProductDetailsResultsBridge.getProductDetailsList();
                if (productDetailsList.isEmpty()) {
                    ProductDetailsListener.this.onProductDetailsResponse(billingResultBridge, null);
                } else {
                    JSONObject originalJson = productDetailsList.get(0).getOriginalJson();
                    ProductDetailsListener.this.onProductDetailsResponse(billingResultBridge, originalJson != null ? originalJson.toString() : null);
                }
            }
        });
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            billingClientBridge = null;
        }
        billingClientBridge.queryProductDetailsAsync(build, productDetailsResponseListenerProxy);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener) {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            billingClientBridge = null;
        }
        billingClientBridge.queryPurchasesAsync(str, new PurchasesResponseListenerProxy(purchasesResponseListener));
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void startConnection(BillingClientStateListener billingClientStateListener) {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            billingClientBridge = null;
        }
        billingClientBridge.startConnection(new BillingClientStateListenerProxy(billingClientStateListener));
    }
}
