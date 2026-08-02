package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import com.appsflyer.share.network.http.ResponseNetwork;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class AFe1tSDK extends AFe1rSDK {

    @Nullable
    private final PurchaseHandler.PurchaseValidationCallback e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1tSDK(@NotNull AFe1zSDK aFe1zSDK, @NotNull AFe1zSDK[] aFe1zSDKArr, @NotNull AFc1aSDK aFc1aSDK, @NotNull Map<String, ? extends Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFe1zSDK, aFe1zSDKArr, aFc1aSDK, null, map);
        aFe1zSDK.getClass();
        aFe1zSDKArr.getClass();
        aFc1aSDK.getClass();
        map.getClass();
        this.e = purchaseValidationCallback;
    }

    @Override // com.appsflyer.internal.AFe1rSDK
    @Nullable
    public final String AFKeystoreWrapper(@NotNull Map<String, Object> map) {
        map.getClass();
        if (map.containsKey("billing_library_version")) {
            Object remove = map.remove("billing_library_version");
            if (remove instanceof String) {
                return (String) remove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFe1oSDK, com.appsflyer.internal.AFe1vSDK
    public final void AFLogger() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.AFLogger();
        Throwable force = force();
        if (force != null && (purchaseValidationCallback2 = this.e) != null) {
            purchaseValidationCallback2.onFailure(force);
        }
        ResponseNetwork<String> responseNetwork = ((AFe1oSDK) this).w;
        if (responseNetwork == null || (purchaseValidationCallback = this.e) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }

    @Override // com.appsflyer.internal.AFe1rSDK
    @Nullable
    public final String d(@NotNull Map<String, Object> map) {
        map.getClass();
        if (map.containsKey("connector_version")) {
            Object remove = map.remove("connector_version");
            if (remove instanceof String) {
                return (String) remove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFe1rSDK
    public final boolean i() {
        return true;
    }

    @Override // com.appsflyer.internal.AFe1oSDK, com.appsflyer.internal.AFe1vSDK
    public boolean d() {
        ResponseNetwork responseNetwork = ((AFe1oSDK) this).w;
        if (responseNetwork != null) {
            responseNetwork.getClass();
            if (responseNetwork.getStatusCode() == 503) {
                return true;
            }
        }
        return super.d();
    }
}
