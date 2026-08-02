package io.appmetrica.analytics.billinginterface.internal.config;

import androidx.annotation.NonNull;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class BillingConfig {
    public final int firstCollectingInappMaxAgeSeconds;
    public final int sendFrequencySeconds;

    public BillingConfig(int i5, int i10) {
        this.sendFrequencySeconds = i5;
        this.firstCollectingInappMaxAgeSeconds = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BillingConfig billingConfig = (BillingConfig) obj;
        return this.sendFrequencySeconds == billingConfig.sendFrequencySeconds && this.firstCollectingInappMaxAgeSeconds == billingConfig.firstCollectingInappMaxAgeSeconds;
    }

    public int hashCode() {
        return (this.sendFrequencySeconds * 31) + this.firstCollectingInappMaxAgeSeconds;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BillingConfig{sendFrequencySeconds=");
        sb2.append(this.sendFrequencySeconds);
        sb2.append(", firstCollectingInappMaxAgeSeconds=");
        return k.n(sb2, this.firstCollectingInappMaxAgeSeconds, "}");
    }
}
