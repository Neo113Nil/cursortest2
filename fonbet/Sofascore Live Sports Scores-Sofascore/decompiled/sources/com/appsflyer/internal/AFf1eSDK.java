package com.appsflyer.internal;

import defpackage.ljg;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFf1eSDK {
    public final boolean d;
    public final long registerClient;

    @NotNull
    public final String unregisterClient;

    public AFf1eSDK(@NotNull String str, long j, boolean z) {
        str.getClass();
        this.unregisterClient = str;
        this.registerClient = j;
        this.d = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1eSDK)) {
            return false;
        }
        AFf1eSDK aFf1eSDK = (AFf1eSDK) obj;
        return Intrinsics.c(this.unregisterClient, aFf1eSDK.unregisterClient) && this.registerClient == aFf1eSDK.registerClient && this.d == aFf1eSDK.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ljg.c(this.unregisterClient.hashCode() * 31, 31, this.registerClient);
    }

    @NotNull
    public final String toString() {
        return "AFUninstallToken(token=" + this.unregisterClient + ", receivedTime=" + this.registerClient + ", isQueued=" + this.d + ")";
    }
}
