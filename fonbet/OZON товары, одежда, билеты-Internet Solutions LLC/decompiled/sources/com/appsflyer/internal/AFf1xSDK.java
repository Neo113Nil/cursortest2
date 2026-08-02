package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* loaded from: classes8.dex */
public final class AFf1xSDK extends AFf1sSDK {
    public AFf1xSDK(@NonNull Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFd1mSDK aFd1mSDK) {
        super(AFf1zSDK.ARS_VALIDATE, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1mSDK, map, purchaseValidationCallback);
        this.valueOf.add(AFf1zSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1sSDK, com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean AFInAppEventParameterName() {
        ResponseNetwork responseNetwork = this.AFLogger;
        if (responseNetwork == null || responseNetwork.getStatusCode() != 424) {
            return super.AFInAppEventParameterName();
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final AFe1uSDK<String> valueOf(@NonNull String str) {
        AFe1uSDK<String> AFInAppEventParameterName = ((AFf1rSDK) this).f57438d.AFInAppEventParameterName(force(), str, w());
        if (AFInAppEventParameterName != null) {
            AFInAppEventParameterName(AFInAppEventParameterName.AFKeystoreWrapper.valueOf);
        }
        return AFInAppEventParameterName;
    }
}
