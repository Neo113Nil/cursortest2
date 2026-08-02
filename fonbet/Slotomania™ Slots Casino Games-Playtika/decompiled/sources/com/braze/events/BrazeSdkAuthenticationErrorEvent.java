package com.braze.events;

import bo.app.d5;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000eR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/braze/events/BrazeSdkAuthenticationErrorEvent;", "", "Lbo/app/d5;", "component1", "", "toString", "sdkAuthError", "copy", "", "hashCode", "other", "", "equals", "getErrorReason", "()Ljava/lang/String;", "errorReason", "getErrorCode", "()I", IronSourceConstants.EVENTS_ERROR_CODE, "", "getRequestInitiationTime", "()Ljava/lang/Long;", "requestInitiationTime", "getSignature", InAppPurchaseMetaData.KEY_SIGNATURE, "getUserId", "userId", "<init>", "(Lbo/app/d5;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final /* data */ class BrazeSdkAuthenticationErrorEvent {
    private final d5 sdkAuthError;

    public BrazeSdkAuthenticationErrorEvent(d5 sdkAuthError) {
        Intrinsics.checkNotNullParameter(sdkAuthError, "sdkAuthError");
        this.sdkAuthError = sdkAuthError;
    }

    /* renamed from: component1, reason: from getter */
    private final d5 getSdkAuthError() {
        return this.sdkAuthError;
    }

    public static /* synthetic */ BrazeSdkAuthenticationErrorEvent copy$default(BrazeSdkAuthenticationErrorEvent brazeSdkAuthenticationErrorEvent, d5 d5Var, int i, Object obj) {
        if ((i & 1) != 0) {
            d5Var = brazeSdkAuthenticationErrorEvent.sdkAuthError;
        }
        return brazeSdkAuthenticationErrorEvent.copy(d5Var);
    }

    public final BrazeSdkAuthenticationErrorEvent copy(d5 sdkAuthError) {
        Intrinsics.checkNotNullParameter(sdkAuthError, "sdkAuthError");
        return new BrazeSdkAuthenticationErrorEvent(sdkAuthError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BrazeSdkAuthenticationErrorEvent) && Intrinsics.areEqual(this.sdkAuthError, ((BrazeSdkAuthenticationErrorEvent) other).sdkAuthError);
    }

    public final int getErrorCode() {
        return this.sdkAuthError.getB();
    }

    public final String getErrorReason() {
        return this.sdkAuthError.getC();
    }

    public final Long getRequestInitiationTime() {
        return this.sdkAuthError.getA().j();
    }

    public final String getSignature() {
        return this.sdkAuthError.getA().k();
    }

    public final String getUserId() {
        return this.sdkAuthError.getA().a();
    }

    public int hashCode() {
        return this.sdkAuthError.hashCode();
    }

    public String toString() {
        return this.sdkAuthError.toString();
    }
}
