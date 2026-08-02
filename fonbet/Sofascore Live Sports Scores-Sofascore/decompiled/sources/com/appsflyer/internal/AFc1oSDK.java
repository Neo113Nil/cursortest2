package com.appsflyer.internal;

import defpackage.dmi;
import defpackage.fc6;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFc1oSDK {
    final int AFLogger;

    @NotNull
    final String d;

    @NotNull
    final List<AFe1zSDK> registerClient;

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1oSDK(@NotNull String str, @NotNull List<? extends AFe1zSDK> list, int i) {
        str.getClass();
        list.getClass();
        this.d = str;
        this.registerClient = list;
        this.AFLogger = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1oSDK)) {
            return false;
        }
        AFc1oSDK aFc1oSDK = (AFc1oSDK) obj;
        return Intrinsics.c(this.d, aFc1oSDK.d) && Intrinsics.c(this.registerClient, aFc1oSDK.registerClient) && this.AFLogger == aFc1oSDK.AFLogger;
    }

    public final int hashCode() {
        return Integer.hashCode(this.AFLogger) + dmi.d(this.d.hashCode() * 31, 31, this.registerClient);
    }

    @NotNull
    public final String toString() {
        String str = this.d;
        List<AFe1zSDK> list = this.registerClient;
        int i = this.AFLogger;
        StringBuilder sb = new StringBuilder("StorageConfigTypeEntry(cacheDirName=");
        sb.append(str);
        sb.append(", eventTypes=");
        sb.append(list);
        sb.append(", maxCapacity=");
        return fc6.h(i, ")", sb);
    }
}
