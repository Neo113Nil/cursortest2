package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFc1rSDK {

    @NotNull
    public final String AFLogger;
    public final int unregisterClient;

    public AFc1rSDK(int i, @NotNull String str) {
        str.getClass();
        this.unregisterClient = i;
        this.AFLogger = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1rSDK)) {
            return false;
        }
        AFc1rSDK aFc1rSDK = (AFc1rSDK) obj;
        return this.unregisterClient == aFc1rSDK.unregisterClient && Intrinsics.c(this.AFLogger, aFc1rSDK.AFLogger);
    }

    public final int hashCode() {
        return this.AFLogger.hashCode() + (Integer.hashCode(this.unregisterClient) * 31);
    }

    @NotNull
    public final String toString() {
        return i.g(this.unregisterClient, "AppSetIdModel(scope=", ", id=", this.AFLogger, ")");
    }
}
