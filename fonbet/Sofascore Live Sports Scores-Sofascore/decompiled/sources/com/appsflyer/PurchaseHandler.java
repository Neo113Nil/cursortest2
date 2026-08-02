package com.appsflyer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.internal.AFc1aSDK;
import com.appsflyer.internal.AFc1hSDK;
import com.appsflyer.internal.AFe1ySDK;
import com.appsflyer.internal.AFj1xSDK;
import com.appsflyer.share.network.http.ResponseNetwork;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class PurchaseHandler {

    @NonNull
    public final AFe1ySDK AFLogger;

    @NonNull
    public final AFc1aSDK d;

    @NonNull
    private final AFc1hSDK unregisterClient;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface PurchaseValidationCallback {
        void onFailure(@NonNull Throwable th);

        void onResponse(@NonNull ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(@NonNull AFc1aSDK aFc1aSDK) {
        this.d = aFc1aSDK;
        this.unregisterClient = aFc1aSDK.AFKeystoreWrapper();
        this.AFLogger = aFc1aSDK.afWarnLog();
    }

    public final boolean d(Map<String, Object> map, @Nullable PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean AFLogger = AFj1xSDK.AFLogger(map, strArr, this.unregisterClient);
        if (!AFLogger && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return AFLogger;
    }
}
