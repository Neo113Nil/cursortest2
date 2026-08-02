package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface AFd1uSDK {

    public static final class AFa1zSDK {
        public final float AFKeystoreWrapper;
        public final String values;

        public AFa1zSDK(float f7, String str) {
            this.AFKeystoreWrapper = f7;
            this.values = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1zSDK)) {
                return false;
            }
            AFa1zSDK aFa1zSDK = (AFa1zSDK) obj;
            return Float.valueOf(this.AFKeystoreWrapper).equals(Float.valueOf(aFa1zSDK.AFKeystoreWrapper)) && Intrinsics.d(this.values, aFa1zSDK.values);
        }

        public final int hashCode() {
            int hashCode = Float.hashCode(this.AFKeystoreWrapper) * 31;
            String str = this.values;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BatteryData(level=");
            sb2.append(this.AFKeystoreWrapper);
            sb2.append(", charging=");
            sb2.append(this.values);
            sb2.append(')');
            return sb2.toString();
        }
    }

    @NotNull
    AFa1zSDK values(@NotNull Context context);
}
