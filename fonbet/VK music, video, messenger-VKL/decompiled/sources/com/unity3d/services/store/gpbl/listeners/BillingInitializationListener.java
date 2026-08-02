package com.unity3d.services.store.gpbl.listeners;

/* compiled from: BillingInitializationListener.kt */
/* loaded from: classes14.dex */
public interface BillingInitializationListener extends BillingClientStateListener, PurchaseUpdatedResponseListener {
    void onIsAlreadyInitialized();
}
