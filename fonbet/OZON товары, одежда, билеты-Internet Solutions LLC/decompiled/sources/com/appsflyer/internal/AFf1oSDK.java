package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import java.util.Map;

/* loaded from: classes8.dex */
public final class AFf1oSDK extends AFf1sSDK {
    public AFf1oSDK(@NonNull Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFd1mSDK aFd1mSDK) {
        super(AFf1zSDK.PURCHASE_VALIDATE, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1mSDK, map, purchaseValidationCallback);
        this.valueOf.add(AFf1zSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final AFe1uSDK<String> valueOf(@NonNull String str) {
        AFe1uSDK<String> AFInAppEventType = ((AFf1rSDK) this).f57438d.AFInAppEventType(force(), str, w());
        if (AFInAppEventType != null) {
            AFInAppEventParameterName(AFInAppEventType.AFKeystoreWrapper.valueOf);
        }
        return AFInAppEventType;
    }
}
