package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFc1eSDK implements AFc1oSDK {

    @NotNull
    private final AFd1tSDK AFInAppEventParameterName;

    public AFc1eSDK(@NotNull AFd1tSDK aFd1tSDK) {
        Intrinsics.checkNotNullParameter(aFd1tSDK, "");
        this.AFInAppEventParameterName = aFd1tSDK;
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    @NotNull
    public final Map<String, Object> AFInAppEventParameterName() {
        if (this.AFInAppEventParameterName.valueOf("deeplink_data")) {
            try {
                String AFKeystoreWrapper = this.AFInAppEventParameterName.AFKeystoreWrapper("deeplink_data", (String) null);
                return AFKeystoreWrapper == null ? U.c() : AFi1cSDK.AFInAppEventType(new JSONObject(AFKeystoreWrapper));
            } catch (Throwable th2) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th2, true, false);
            }
        }
        return U.c();
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final void values() {
        this.AFInAppEventParameterName.AFInAppEventType("deeplink_data");
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final void values(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.AFInAppEventParameterName.valueOf("deeplink_data", new JSONObject(map).toString());
    }
}
