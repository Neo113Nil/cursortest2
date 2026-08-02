package com.appsflyer;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFb1mSDK;
import com.appsflyer.internal.AFd1mSDK;
import com.appsflyer.internal.AFd1sSDK;
import com.appsflyer.internal.AFe1fSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* loaded from: classes8.dex */
public final class PurchaseHandler {

    @NonNull
    private final AFd1sSDK AFInAppEventParameterName;

    @NonNull
    public final AFd1mSDK AFKeystoreWrapper;

    @NonNull
    public final AFe1fSDK valueOf;

    public interface PurchaseValidationCallback {
        void onFailure(@NonNull Throwable th2);

        void onResponse(@NonNull ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(@NonNull AFd1mSDK aFd1mSDK) {
        this.AFKeystoreWrapper = aFd1mSDK;
        this.AFInAppEventParameterName = aFd1mSDK.AFInAppEventType();
        this.valueOf = aFd1mSDK.afInfoLog();
    }

    public final boolean valueOf(Map<String, Object> map, PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean AFInAppEventType = AFb1mSDK.AFInAppEventType(map, strArr, this.AFInAppEventParameterName);
        if (!AFInAppEventType && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return AFInAppEventType;
    }
}
