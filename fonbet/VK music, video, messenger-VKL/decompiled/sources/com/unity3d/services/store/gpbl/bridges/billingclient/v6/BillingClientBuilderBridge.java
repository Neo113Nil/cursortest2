package com.unity3d.services.store.gpbl.bridges.billingclient.v6;

import com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import kotlin.Pair;
import xsna.pn00;
import xsna.zcl;

/* compiled from: BillingClientBuilderBridge.kt */
/* loaded from: classes14.dex */
public final class BillingClientBuilderBridge extends BillingClientBuilderBridgeCommon {
    public static final Companion Companion = new Companion(null);
    public static final String ENABLE_PENDING_PURCHASES_METHOD = "enablePendingPurchases";

    /* compiled from: BillingClientBuilderBridge.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public BillingClientBuilderBridge(Object obj) {
        super(obj, pn00.i(new Pair("enablePendingPurchases", new Class[0])));
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
    public IBillingClientBuilderBridge enablePendingPurchases() {
        this._billingClientBuilderInternalInstance = callNonVoidMethod("enablePendingPurchases", this._billingClientBuilderInternalInstance, new Object[0]);
        return this;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
    public BillingClientBridgeCommon build() throws ClassNotFoundException {
        return new BillingClientBridge(callNonVoidMethod("build", this._billingClientBuilderInternalInstance, new Object[0]));
    }
}
