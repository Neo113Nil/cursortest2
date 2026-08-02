package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class AFd1bSDK implements AFd1dSDK {

    @NotNull
    private final AFd1gSDK AFKeystoreWrapper;

    public AFd1bSDK(@NotNull AFd1gSDK aFd1gSDK) {
        Intrinsics.checkNotNullParameter(aFd1gSDK, "");
        this.AFKeystoreWrapper = aFd1gSDK;
    }

    @Override // com.appsflyer.internal.AFd1dSDK
    public final void valueOf(@NotNull byte[] bArr, Map<String, String> map, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        if (new AFd1cSDK(bArr, map, 2000).values()) {
            this.AFKeystoreWrapper.AFInAppEventParameterName();
        }
    }
}
