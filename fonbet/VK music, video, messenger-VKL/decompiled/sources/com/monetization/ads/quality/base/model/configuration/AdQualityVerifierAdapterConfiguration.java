package com.monetization.ads.quality.base.model.configuration;

import xsna.bh10;
import xsna.epx;
import xsna.rqi;

/* loaded from: classes14.dex */
public final class AdQualityVerifierAdapterConfiguration {
    private final String apiKey;
    private final boolean debug;
    private final long verificationTimeoutInSec;

    public AdQualityVerifierAdapterConfiguration(String str, long j, boolean z) {
        this.apiKey = str;
        this.verificationTimeoutInSec = j;
        this.debug = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdQualityVerifierAdapterConfiguration)) {
            return false;
        }
        AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration = (AdQualityVerifierAdapterConfiguration) obj;
        return epx.f(this.apiKey, adQualityVerifierAdapterConfiguration.apiKey) && this.verificationTimeoutInSec == adQualityVerifierAdapterConfiguration.verificationTimeoutInSec && this.debug == adQualityVerifierAdapterConfiguration.debug;
    }

    public final long getVerificationTimeoutInSec() {
        return this.verificationTimeoutInSec;
    }

    public int hashCode() {
        return Boolean.hashCode(this.debug) + bh10.a(this.apiKey.hashCode() * 31, 31, this.verificationTimeoutInSec);
    }

    public String toString() {
        String str = this.apiKey;
        long j = this.verificationTimeoutInSec;
        boolean z = this.debug;
        StringBuilder d = rqi.d(j, "AdQualityVerifierAdapterConfiguration(apiKey=", str, ", verificationTimeoutInSec=");
        d.append(", debug=");
        d.append(z);
        d.append(")");
        return d.toString();
    }
}
