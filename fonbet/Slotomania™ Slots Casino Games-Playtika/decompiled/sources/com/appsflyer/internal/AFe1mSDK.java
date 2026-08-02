package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class AFe1mSDK extends AFe1gSDK {
    private final PurchaseHandler.PurchaseValidationCallback component1;

    @Override // com.appsflyer.internal.AFe1gSDK
    protected final boolean component1() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1mSDK(AFe1uSDK aFe1uSDK, AFe1uSDK[] aFe1uSDKArr, AFc1fSDK aFc1fSDK, Map<String, ? extends Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFe1uSDK, aFe1uSDKArr, aFc1fSDK, null, map);
        Intrinsics.checkNotNullParameter(aFe1uSDK, "");
        Intrinsics.checkNotNullParameter(aFe1uSDKArr, "");
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.component1 = purchaseValidationCallback;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1tSDK
    public final void getCurrencyIso4217Code() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.getCurrencyIso4217Code();
        Throwable component3 = component3();
        if (component3 != null && (purchaseValidationCallback2 = this.component1) != null) {
            purchaseValidationCallback2.onFailure(component3);
        }
        ResponseNetwork<String> responseNetwork = ((AFe1kSDK) this).component2;
        if (responseNetwork == null || (purchaseValidationCallback = this.component1) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }

    @Override // com.appsflyer.internal.AFe1gSDK
    protected final String getMonetizationNetwork(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (map.containsKey("billing_library_version")) {
            Object remove = map.remove("billing_library_version");
            if (remove instanceof String) {
                return (String) remove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFe1gSDK
    protected final String getCurrencyIso4217Code(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (map.containsKey("connector_version")) {
            Object remove = map.remove("connector_version");
            if (remove instanceof String) {
                return (String) remove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1tSDK
    public boolean getMonetizationNetwork() {
        if (((AFe1kSDK) this).component2 != null) {
            ResponseNetwork responseNetwork = ((AFe1kSDK) this).component2;
            Intrinsics.checkNotNull(responseNetwork);
            if (responseNetwork.getStatusCode() == 503) {
                return true;
            }
        }
        return super.getMonetizationNetwork();
    }
}
