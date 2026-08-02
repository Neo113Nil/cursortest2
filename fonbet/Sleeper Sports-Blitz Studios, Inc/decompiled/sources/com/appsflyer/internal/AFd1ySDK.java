package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface AFd1ySDK {
    AFa1uSDK getRevenue(Context context);

    public static final class AFa1uSDK {
        public final String getCurrencyIso4217Code;
        public final float getMediationNetwork;

        public AFa1uSDK(float f, String str) {
            this.getMediationNetwork = f;
            this.getCurrencyIso4217Code = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1uSDK)) {
                return false;
            }
            AFa1uSDK aFa1uSDK = (AFa1uSDK) obj;
            return Float.compare(this.getMediationNetwork, aFa1uSDK.getMediationNetwork) == 0 && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFa1uSDK.getCurrencyIso4217Code);
        }

        public final int hashCode() {
            int hashCode = Float.hashCode(this.getMediationNetwork) * 31;
            String str = this.getCurrencyIso4217Code;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "BatteryData(level=" + this.getMediationNetwork + ", charging=" + this.getCurrencyIso4217Code + ")";
        }
    }
}
