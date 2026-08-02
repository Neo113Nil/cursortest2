package io.appmetrica.analytics.coreapi.internal.identifiers;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import d9.e;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class AdTrackingInfoResult {
    public final AdTrackingInfo mAdTrackingInfo;
    public final String mErrorExplanation;

    @NonNull
    public final IdentifierStatus mStatus;

    public AdTrackingInfoResult() {
        this(null, IdentifierStatus.UNKNOWN, "identifier info has never been updated");
    }

    @NonNull
    public static AdTrackingInfoResult getProviderUnavailableResult(@NonNull String str) {
        return new AdTrackingInfoResult(null, IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, str);
    }

    public boolean isValid() {
        AdTrackingInfo adTrackingInfo = this.mAdTrackingInfo;
        return (adTrackingInfo == null || TextUtils.isEmpty(adTrackingInfo.advId)) ? false : true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdTrackingInfoResult{mAdTrackingInfo=");
        sb2.append(this.mAdTrackingInfo);
        sb2.append(", mStatus=");
        sb2.append(this.mStatus);
        sb2.append(", mErrorExplanation='");
        return e.l(sb2, this.mErrorExplanation, "'}");
    }

    public AdTrackingInfoResult(AdTrackingInfo adTrackingInfo, @NonNull IdentifierStatus identifierStatus, String str) {
        this.mAdTrackingInfo = adTrackingInfo;
        this.mStatus = identifierStatus;
        this.mErrorExplanation = str;
    }
}
