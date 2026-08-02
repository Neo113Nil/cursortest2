package com.monetization.ads.quality.base.result;

import com.monetization.ads.quality.base.AdQualityVerificationStateFlow;
import com.monetization.ads.quality.base.model.AdQualityVerificationError;

/* loaded from: classes14.dex */
public interface AdQualityVerificationResult {

    public static final class NotVerified implements AdQualityVerificationResult {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotVerified)) {
                return false;
            }
            ((NotVerified) obj).getClass();
            return true;
        }

        public final AdQualityVerificationError getReason() {
            return null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "NotVerified(reason=null)";
        }
    }

    public static final class Verified implements AdQualityVerificationResult {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Verified)) {
                return false;
            }
            ((Verified) obj).getClass();
            return true;
        }

        public final AdQualityVerificationStateFlow getVerifiedAd() {
            return null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "Verified(verifiedAd=null)";
        }
    }

    public static final class WaitingForVerification implements AdQualityVerificationResult {
        public static final WaitingForVerification INSTANCE = new WaitingForVerification();

        private WaitingForVerification() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof WaitingForVerification);
        }

        public int hashCode() {
            return 393213194;
        }

        public String toString() {
            return "WaitingForVerification";
        }
    }
}
