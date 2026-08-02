package com.unity3d.services.store.gpbl.bridges.billingclient;

import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import xsna.vtk0;
import xsna.xh50;

/* compiled from: BillingClientAdapter.kt */
/* loaded from: classes14.dex */
public abstract class BillingClientAdapter {
    private final xh50<Boolean> _isInitialized = vtk0.a(Boolean.FALSE);

    public abstract String getAdapterVersion();

    public final xh50<Boolean> get_isInitialized$unity_ads_defaultRelease() {
        return this._isInitialized;
    }

    public abstract void initialize(BillingInitializationListener billingInitializationListener);

    public abstract BillingResultResponseCode isFeatureSupported(String str);

    public final boolean isInitialized() {
        return this._isInitialized.getValue().booleanValue();
    }

    public abstract boolean isReady();

    public abstract void queryProductDetailsAsync(String str, String str2, ProductDetailsListener productDetailsListener);

    public abstract void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener);

    public abstract void startConnection(BillingClientStateListener billingClientStateListener);
}
