package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.PurchaseHandler;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFe1iSDK extends AFe1tSDK {
    public AFe1iSDK(@NonNull Map<String, Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFc1aSDK aFc1aSDK) {
        super(AFd1aSDK.valueOf, new AFe1zSDK[]{AFd1aSDK.registerClient, AFd1aSDK.AFKeystoreWrapper}, aFc1aSDK, map, purchaseValidationCallback);
        this.AFLogger.add(AFd1aSDK.unregisterClient);
    }

    @Override // com.appsflyer.internal.AFe1rSDK
    @Nullable
    public final AFd1qSDK<String> AFLogger(@NonNull Map<String, Object> map, @NonNull String str) {
        return ((AFe1oSDK) this).registerClient.d(map, str);
    }
}
