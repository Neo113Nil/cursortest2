package com.appsflyer.internal;

import defpackage.ljg;
import defpackage.wt3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFh1aSDK {

    @Nullable
    public final String AFLogger;
    public final long d;

    @Nullable
    public final String registerClient;
    public final long unregisterClient;

    public AFh1aSDK(long j, long j2, @Nullable String str, @Nullable String str2) {
        this.d = j;
        this.unregisterClient = j2;
        this.AFLogger = str;
        this.registerClient = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFh1aSDK)) {
            return false;
        }
        AFh1aSDK aFh1aSDK = (AFh1aSDK) obj;
        return this.d == aFh1aSDK.d && this.unregisterClient == aFh1aSDK.unregisterClient && Intrinsics.c(this.AFLogger, aFh1aSDK.AFLogger) && Intrinsics.c(this.registerClient, aFh1aSDK.registerClient);
    }

    public final int hashCode() {
        int c = ljg.c(Long.hashCode(this.d) * 31, 31, this.unregisterClient);
        String str = this.AFLogger;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.registerClient;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        long j = this.d;
        long j2 = this.unregisterClient;
        String str = this.AFLogger;
        String str2 = this.registerClient;
        StringBuilder o = ljg.o("PlayIntegrityApiData(piaTimestamp=", j, ", ttrMillis=");
        o.append(j2);
        o.append(", piaToken=");
        o.append(str);
        return wt3.m(", errorCode=", str2, o, ")");
    }
}
