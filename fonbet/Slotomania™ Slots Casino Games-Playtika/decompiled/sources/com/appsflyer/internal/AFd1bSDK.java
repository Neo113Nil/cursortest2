package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AFd1bSDK {
    final String getCurrencyIso4217Code;
    final String getRevenue;

    public AFd1bSDK(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.getCurrencyIso4217Code = str;
        this.getRevenue = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFd1bSDK)) {
            return false;
        }
        AFd1bSDK aFd1bSDK = (AFd1bSDK) obj;
        return Intrinsics.areEqual(this.getCurrencyIso4217Code, aFd1bSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.getRevenue, aFd1bSDK.getRevenue);
    }

    public final int hashCode() {
        return (this.getCurrencyIso4217Code.hashCode() * 31) + this.getRevenue.hashCode();
    }

    public final String toString() {
        return "HostConfig(prefix=" + this.getCurrencyIso4217Code + ", host=" + this.getRevenue + ")";
    }
}
