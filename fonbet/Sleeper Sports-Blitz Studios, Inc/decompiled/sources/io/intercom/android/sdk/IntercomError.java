package io.intercom.android.sdk;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomStatusCallback.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0003H×\u0001J\t\u0010\u0013\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/IntercomError;", "", "errorCode", "", "errorMessage", "", "<init>", "(ILjava/lang/String;)V", "getErrorCode", "()I", "getErrorMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class IntercomError {
    public static final int $stable = 0;
    private final int errorCode;
    private final String errorMessage;

    /* JADX WARN: Multi-variable type inference failed */
    public IntercomError() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ IntercomError copy$default(IntercomError intercomError, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = intercomError.errorCode;
        }
        if ((i2 & 2) != 0) {
            str = intercomError.errorMessage;
        }
        return intercomError.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final IntercomError copy(int errorCode, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new IntercomError(errorCode, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntercomError)) {
            return false;
        }
        IntercomError intercomError = (IntercomError) other;
        return this.errorCode == intercomError.errorCode && Intrinsics.areEqual(this.errorMessage, intercomError.errorMessage);
    }

    public int hashCode() {
        return (Integer.hashCode(this.errorCode) * 31) + this.errorMessage.hashCode();
    }

    public String toString() {
        return "IntercomError(errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ')';
    }

    public IntercomError(int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.errorCode = i;
        this.errorMessage = errorMessage;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public /* synthetic */ IntercomError(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
