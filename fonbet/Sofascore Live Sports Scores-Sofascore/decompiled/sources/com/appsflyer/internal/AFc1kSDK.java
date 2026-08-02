package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFc1kSDK {

    @NotNull
    final List<AFc1oSDK> AFLogger;

    public AFc1kSDK(@NotNull List<AFc1oSDK> list) {
        list.getClass();
        this.AFLogger = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AFc1kSDK) && Intrinsics.c(this.AFLogger, ((AFc1kSDK) obj).AFLogger);
    }

    public final int hashCode() {
        return this.AFLogger.hashCode();
    }

    @NotNull
    public final String toString() {
        return i.i("StorageConfig(typeEntries=", ")", this.AFLogger);
    }
}
