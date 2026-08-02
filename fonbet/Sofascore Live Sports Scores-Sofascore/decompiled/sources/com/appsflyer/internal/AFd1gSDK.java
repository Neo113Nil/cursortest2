package com.appsflyer.internal;

import defpackage.bf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFd1gSDK {

    @NotNull
    final String AFKeystoreWrapper;

    @NotNull
    final String d;

    public AFd1gSDK(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.d = str;
        this.AFKeystoreWrapper = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFd1gSDK)) {
            return false;
        }
        AFd1gSDK aFd1gSDK = (AFd1gSDK) obj;
        return Intrinsics.c(this.d, aFd1gSDK.d) && Intrinsics.c(this.AFKeystoreWrapper, aFd1gSDK.AFKeystoreWrapper);
    }

    public final int hashCode() {
        return this.AFKeystoreWrapper.hashCode() + (this.d.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return bf3.k("HostConfig(prefix=", this.d, ", host=", this.AFKeystoreWrapper, ")");
    }
}
