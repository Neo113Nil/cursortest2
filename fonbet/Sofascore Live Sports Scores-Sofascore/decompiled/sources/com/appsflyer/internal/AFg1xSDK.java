package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface AFg1xSDK {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class AFa1zSDK {
        final float AFLogger;

        @Nullable
        final String d;

        public AFa1zSDK(float f, @Nullable String str) {
            this.AFLogger = f;
            this.d = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1zSDK)) {
                return false;
            }
            AFa1zSDK aFa1zSDK = (AFa1zSDK) obj;
            return Float.compare(this.AFLogger, aFa1zSDK.AFLogger) == 0 && Intrinsics.c(this.d, aFa1zSDK.d);
        }

        public final int hashCode() {
            int hashCode = Float.hashCode(this.AFLogger) * 31;
            String str = this.d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            return "BatteryData(level=" + this.AFLogger + ", charging=" + this.d + ")";
        }
    }

    @NotNull
    AFa1zSDK AFKeystoreWrapper(@NotNull Context context);
}
