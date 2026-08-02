package com.unity3d.services.store.gpbl.bridges.billingclient;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.X3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: BillingClientAdapter.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\u0013\u001a\u00020\u0005H&J \u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H&J\u001c\u0010\u0019\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\u0012\u0010\u001c\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "", "()V", "_isInitialized", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "get_isInitialized$unity_ads_defaultRelease", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "isInitialized", "()Z", "getAdapterVersion", "", MobileAdsBridgeBase.initializeMethodName, "", "billingInitializationListener", "Lcom/unity3d/services/store/gpbl/listeners/BillingInitializationListener;", "isFeatureSupported", "Lcom/unity3d/services/store/gpbl/BillingResultResponseCode;", "purchaseType", "isReady", BillingClientBridge.QUERY_PRODUCT_DETAILS_ASYNC_METHOD, InAppPurchaseMetaData.KEY_PRODUCT_ID, X3.i.m, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsListener;", BillingClientBridge.QUERY_PURCHASES_ASYNC_METHOD, "purchasesResponseListener", "Lcom/unity3d/services/store/gpbl/listeners/PurchasesResponseListener;", "startConnection", "billingClientStateListener", "Lcom/unity3d/services/store/gpbl/listeners/BillingClientStateListener;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BillingClientAdapter {
    private final MutableStateFlow<Boolean> _isInitialized = StateFlowKt.MutableStateFlow(false);

    public abstract String getAdapterVersion();

    public abstract void initialize(BillingInitializationListener billingInitializationListener);

    public abstract BillingResultResponseCode isFeatureSupported(String purchaseType);

    public abstract boolean isReady();

    public abstract void queryProductDetailsAsync(String productId, String productType, ProductDetailsListener listener);

    public abstract void queryPurchasesAsync(String purchaseType, PurchasesResponseListener purchasesResponseListener);

    public abstract void startConnection(BillingClientStateListener billingClientStateListener);

    public final MutableStateFlow<Boolean> get_isInitialized$unity_ads_defaultRelease() {
        return this._isInitialized;
    }

    public final boolean isInitialized() {
        return this._isInitialized.getValue().booleanValue();
    }
}
