package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFi1zSDK {

    @NotNull
    public final String AFInAppEventParameterName;
    private final boolean AFInAppEventType;
    public final String AFKeystoreWrapper;
    public final String valueOf;

    public AFi1zSDK(@NotNull String str, String str2, String str3, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFInAppEventParameterName = str;
        this.AFKeystoreWrapper = str2;
        this.valueOf = str3;
        this.AFInAppEventType = z11;
    }

    public final boolean AFInAppEventParameterName() {
        return this.AFInAppEventType;
    }
}
