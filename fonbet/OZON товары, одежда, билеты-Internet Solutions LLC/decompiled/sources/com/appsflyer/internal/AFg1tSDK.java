package com.appsflyer.internal;

import B0.C2454a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class AFg1tSDK {
    final int AFInAppEventParameterName;

    @NotNull
    final String AFInAppEventType;
    final int AFKeystoreWrapper;
    final int valueOf;
    final int values;

    public AFg1tSDK(int i11, int i12, int i13, int i14, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = i11;
        this.AFKeystoreWrapper = i12;
        this.values = i13;
        this.AFInAppEventParameterName = i14;
        this.AFInAppEventType = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1tSDK)) {
            return false;
        }
        AFg1tSDK aFg1tSDK = (AFg1tSDK) obj;
        return this.valueOf == aFg1tSDK.valueOf && this.AFKeystoreWrapper == aFg1tSDK.AFKeystoreWrapper && this.values == aFg1tSDK.values && this.AFInAppEventParameterName == aFg1tSDK.AFInAppEventParameterName && Intrinsics.d(this.AFInAppEventType, aFg1tSDK.AFInAppEventType);
    }

    public final int hashCode() {
        return this.AFInAppEventType.hashCode() + C2454a.a(this.AFInAppEventParameterName, C2454a.a(this.values, C2454a.a(this.AFKeystoreWrapper, Integer.hashCode(this.valueOf) * 31, 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CmpTcfData(policyVersion=");
        sb2.append(this.valueOf);
        sb2.append(", gdprApplies=");
        sb2.append(this.AFKeystoreWrapper);
        sb2.append(", cmpSdkId=");
        sb2.append(this.values);
        sb2.append(", cmpSdkVersion=");
        sb2.append(this.AFInAppEventParameterName);
        sb2.append(", tcString=");
        sb2.append(this.AFInAppEventType);
        sb2.append(')');
        return sb2.toString();
    }
}
