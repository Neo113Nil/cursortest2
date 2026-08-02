package com.appsflyer.internal;

import defpackage.mz1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFh1gSDK {

    @NotNull
    public final String AFKeystoreWrapper;

    @Nullable
    public final String d;

    @Nullable
    public final String registerClient;
    public final boolean unregisterClient;

    public AFh1gSDK(@NotNull String str, @Nullable String str2, @Nullable String str3, boolean z) {
        str.getClass();
        this.AFKeystoreWrapper = str;
        this.d = str2;
        this.registerClient = str3;
        this.unregisterClient = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFh1gSDK)) {
            return false;
        }
        AFh1gSDK aFh1gSDK = (AFh1gSDK) obj;
        return Intrinsics.c(this.AFKeystoreWrapper, aFh1gSDK.AFKeystoreWrapper) && Intrinsics.c(this.d, aFh1gSDK.d) && Intrinsics.c(this.registerClient, aFh1gSDK.registerClient) && this.unregisterClient == aFh1gSDK.unregisterClient;
    }

    public final int hashCode() {
        int hashCode = this.AFKeystoreWrapper.hashCode() * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.registerClient;
        return Boolean.hashCode(this.unregisterClient) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.AFKeystoreWrapper;
        String str2 = this.d;
        String str3 = this.registerClient;
        boolean z = this.unregisterClient;
        StringBuilder s = mz1.s("NetworkData(networkType=", str, ", carrierName=", str2, ", simOperator=");
        s.append(str3);
        s.append(", isVpnEnabled=");
        s.append(z);
        s.append(")");
        return s.toString();
    }
}
