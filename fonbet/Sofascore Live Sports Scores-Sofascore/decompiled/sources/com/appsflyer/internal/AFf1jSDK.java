package com.appsflyer.internal;

import defpackage.lnb;
import defpackage.me4;
import defpackage.mz1;
import defpackage.wv8;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFf1jSDK {
    final int AFKeystoreWrapper;
    final int AFLogger;

    @NotNull
    final String d;
    final int registerClient;
    final int unregisterClient;

    public AFf1jSDK(int i, int i2, int i3, int i4, @NotNull String str) {
        str.getClass();
        this.AFLogger = i;
        this.unregisterClient = i2;
        this.registerClient = i3;
        this.AFKeystoreWrapper = i4;
        this.d = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1jSDK)) {
            return false;
        }
        AFf1jSDK aFf1jSDK = (AFf1jSDK) obj;
        return this.AFLogger == aFf1jSDK.AFLogger && this.unregisterClient == aFf1jSDK.unregisterClient && this.registerClient == aFf1jSDK.registerClient && this.AFKeystoreWrapper == aFf1jSDK.AFKeystoreWrapper && Intrinsics.c(this.d, aFf1jSDK.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + wv8.a(this.AFKeystoreWrapper, wv8.a(this.registerClient, wv8.a(this.unregisterClient, Integer.hashCode(this.AFLogger) * 31, 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        int i = this.AFLogger;
        int i2 = this.unregisterClient;
        int i3 = this.registerClient;
        int i4 = this.AFKeystoreWrapper;
        String str = this.d;
        StringBuilder s = lnb.s(i, i2, "CmpTcfData(policyVersion=", ", gdprApplies=", ", cmpSdkId=");
        me4.q(s, i3, ", cmpSdkVersion=", i4, ", tcString=");
        return mz1.o(s, str, ")");
    }
}
