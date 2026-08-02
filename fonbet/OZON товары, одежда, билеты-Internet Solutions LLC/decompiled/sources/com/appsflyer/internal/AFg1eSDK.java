package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class AFg1eSDK extends AFg1hSDK {

    @NotNull
    private final AFd1mSDK values;

    public AFg1eSDK(@NotNull AFd1mSDK aFd1mSDK) {
        Intrinsics.checkNotNullParameter(aFd1mSDK, "");
        this.values = aFd1mSDK;
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void e(@NotNull AFg1gSDK aFg1gSDK, @NotNull String str, @NotNull Throwable th2, boolean z11, boolean z12, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        if (z13) {
            if (kotlin.text.h.K(str)) {
                str = "missing label";
            }
            this.values.onAppOpenAttributionNative().AFKeystoreWrapper(th2, withTag$SDK_prodRelease(str, aFg1gSDK));
        }
    }
}
