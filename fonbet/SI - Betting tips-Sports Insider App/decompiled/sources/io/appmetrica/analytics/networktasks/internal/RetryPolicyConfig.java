package io.appmetrica.analytics.networktasks.internal;

import d9.e;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class RetryPolicyConfig {
    public final int exponentialMultiplier;
    public final int maxIntervalSeconds;

    public RetryPolicyConfig(int i5, int i10) {
        this.maxIntervalSeconds = i5;
        this.exponentialMultiplier = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RetryPolicyConfig retryPolicyConfig = (RetryPolicyConfig) obj;
            if (this.maxIntervalSeconds == retryPolicyConfig.maxIntervalSeconds && this.exponentialMultiplier == retryPolicyConfig.exponentialMultiplier) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.maxIntervalSeconds * 31) + this.exponentialMultiplier;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RetryPolicyConfig{maxIntervalSeconds=");
        sb2.append(this.maxIntervalSeconds);
        sb2.append(", exponentialMultiplier=");
        return e.i(sb2, this.exponentialMultiplier, '}');
    }
}
