package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFg1bSDK extends AFg1hSDK {

    @NotNull
    private final AFd1mSDK AFInAppEventParameterName;
    private final boolean valueOf;

    public AFg1bSDK(@NotNull AFd1mSDK aFd1mSDK) {
        Intrinsics.checkNotNullParameter(aFd1mSDK, "");
        this.AFInAppEventParameterName = aFd1mSDK;
        this.valueOf = true;
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void d(@NotNull AFg1gSDK aFg1gSDK, @NotNull String str, boolean z11) {
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z11) {
            this.AFInAppEventParameterName.i().AFInAppEventType("D", AFInAppEventParameterName(str, aFg1gSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void e(@NotNull AFg1gSDK aFg1gSDK, @NotNull String str, @NotNull Throwable th2, boolean z11, boolean z12, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        if (z14) {
            this.AFInAppEventParameterName.i().AFInAppEventType("E", AFInAppEventParameterName(str, aFg1gSDK));
        }
        if (z14) {
            this.AFInAppEventParameterName.i().AFInAppEventType(th2);
        }
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void force(@NotNull AFg1gSDK aFg1gSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AFInAppEventParameterName.i().AFInAppEventType("F", AFInAppEventParameterName(str, aFg1gSDK));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final boolean getShouldExtendMsg() {
        return this.valueOf;
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void i(@NotNull AFg1gSDK aFg1gSDK, @NotNull String str, boolean z11) {
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z11) {
            this.AFInAppEventParameterName.i().AFInAppEventType("I", AFInAppEventParameterName(str, aFg1gSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void v(@NotNull AFg1gSDK aFg1gSDK, @NotNull String str, boolean z11) {
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z11) {
            this.AFInAppEventParameterName.i().AFInAppEventType("V", AFInAppEventParameterName(str, aFg1gSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void w(@NotNull AFg1gSDK aFg1gSDK, @NotNull String str, boolean z11) {
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z11) {
            this.AFInAppEventParameterName.i().AFInAppEventType("W", AFInAppEventParameterName(str, aFg1gSDK));
        }
    }
}
