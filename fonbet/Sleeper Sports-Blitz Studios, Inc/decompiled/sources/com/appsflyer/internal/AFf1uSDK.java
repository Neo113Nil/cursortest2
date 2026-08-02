package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class AFf1uSDK extends AFf1vSDK {
    private final PurchaseHandler.PurchaseValidationCallback component3;

    @Override // com.appsflyer.internal.AFf1vSDK
    protected final boolean areAllFieldsValid() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1uSDK(AFf1wSDK aFf1wSDK, AFf1wSDK[] aFf1wSDKArr, AFd1kSDK aFd1kSDK, Map<String, ? extends Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFf1wSDK, aFf1wSDKArr, aFd1kSDK, null, map);
        Intrinsics.checkNotNullParameter(aFf1wSDK, "");
        Intrinsics.checkNotNullParameter(aFf1wSDKArr, "");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.component3 = purchaseValidationCallback;
    }

    @Override // com.appsflyer.internal.AFf1pSDK, com.appsflyer.internal.AFe1bSDK
    public final void getCurrencyIso4217Code() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.getCurrencyIso4217Code();
        Throwable component4 = component4();
        if (component4 != null && (purchaseValidationCallback2 = this.component3) != null) {
            purchaseValidationCallback2.onFailure(component4);
        }
        ResponseNetwork<String> responseNetwork = ((AFf1pSDK) this).areAllFieldsValid;
        if (responseNetwork == null || (purchaseValidationCallback = this.component3) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }

    @Override // com.appsflyer.internal.AFf1vSDK
    protected final String getCurrencyIso4217Code(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (map.containsKey("billing_library_version")) {
            Object remove = map.remove("billing_library_version");
            if (remove instanceof String) {
                return (String) remove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFf1vSDK
    protected final String AFAdRevenueData(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (map.containsKey("connector_version")) {
            Object remove = map.remove("connector_version");
            if (remove instanceof String) {
                return (String) remove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFf1pSDK, com.appsflyer.internal.AFe1bSDK
    public boolean getMonetizationNetwork() {
        if (((AFf1pSDK) this).areAllFieldsValid != null) {
            ResponseNetwork responseNetwork = ((AFf1pSDK) this).areAllFieldsValid;
            Intrinsics.checkNotNull(responseNetwork);
            if (responseNetwork.getStatusCode() == 503) {
                return true;
            }
        }
        return super.getMonetizationNetwork();
    }
}
