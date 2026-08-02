package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.C3783x;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkErrorType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B-\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\""}, d2 = {"Lcom/plaid/link/result/LinkError;", "Landroid/os/Parcelable;", "errorCode", "Lcom/plaid/link/result/LinkErrorCode;", "errorMessage", "", "displayMessage", "errorJson", "(Lcom/plaid/link/result/LinkErrorCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayMessage", "()Ljava/lang/String;", "getErrorCode", "()Lcom/plaid/link/result/LinkErrorCode;", "getErrorJson", "getErrorMessage", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LinkError implements Parcelable {

    @Nullable
    private final String displayMessage;

    @NotNull
    private final LinkErrorCode errorCode;

    @Nullable
    private final String errorJson;

    @NotNull
    private final String errorMessage;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<LinkError> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/plaid/link/result/LinkError$Companion;", "", "()V", "fromException", "Lcom/plaid/link/result/LinkError;", "exception", "", "fromException$link_sdk_release", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LinkError fromException$link_sdk_release(@Nullable Throwable exception) {
            String str;
            String str2;
            if (exception == null || (str = exception.getMessage()) == null) {
                str = "Internal Error";
            }
            String simpleName = exception != null ? exception.getClass().getSimpleName() : null;
            LinkErrorCode.INTERNAL_ERROR internal_error = new LinkErrorCode.INTERNAL_ERROR(str, new LinkErrorType.INTERNAL_ERROR_TYPE(simpleName != null ? simpleName : "Internal Error"));
            String localizedMessage = exception != null ? exception.getLocalizedMessage() : null;
            if (localizedMessage == null) {
                localizedMessage = "Internal exception occurred";
            }
            String str3 = localizedMessage;
            if (exception == null || (str2 = exception.getMessage()) == null) {
                str2 = "An unknown error occurred, please try again later";
            }
            return new LinkError(internal_error, str3, str2, null, 8, null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkError> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LinkError createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkError((LinkErrorCode) parcel.readParcelable(LinkError.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LinkError[] newArray(int i10) {
            return new LinkError[i10];
        }
    }

    public LinkError(@NotNull LinkErrorCode errorCode, @NotNull String errorMessage, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.displayMessage = str;
        this.errorJson = str2;
    }

    public static /* synthetic */ LinkError copy$default(LinkError linkError, LinkErrorCode linkErrorCode, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            linkErrorCode = linkError.errorCode;
        }
        if ((i10 & 2) != 0) {
            str = linkError.errorMessage;
        }
        if ((i10 & 4) != 0) {
            str2 = linkError.displayMessage;
        }
        if ((i10 & 8) != 0) {
            str3 = linkError.errorJson;
        }
        return linkError.copy(linkErrorCode, str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final LinkErrorCode getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getDisplayMessage() {
        return this.displayMessage;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getErrorJson() {
        return this.errorJson;
    }

    @NotNull
    public final LinkError copy(@NotNull LinkErrorCode errorCode, @NotNull String errorMessage, @Nullable String displayMessage, @Nullable String errorJson) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new LinkError(errorCode, errorMessage, displayMessage, errorJson);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkError)) {
            return false;
        }
        LinkError linkError = (LinkError) other;
        return Intrinsics.areEqual(this.errorCode, linkError.errorCode) && Intrinsics.areEqual(this.errorMessage, linkError.errorMessage) && Intrinsics.areEqual(this.displayMessage, linkError.displayMessage) && Intrinsics.areEqual(this.errorJson, linkError.errorJson);
    }

    @Nullable
    public final String getDisplayMessage() {
        return this.displayMessage;
    }

    @NotNull
    public final LinkErrorCode getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorJson() {
        return this.errorJson;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        int a10 = C3783x.a(this.errorMessage, this.errorCode.hashCode() * 31, 31);
        String str = this.displayMessage;
        int hashCode = (a10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorJson;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LinkError(errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", displayMessage=" + this.displayMessage + ", errorJson=" + this.errorJson + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.errorCode, flags);
        parcel.writeString(this.errorMessage);
        parcel.writeString(this.displayMessage);
        parcel.writeString(this.errorJson);
    }

    public /* synthetic */ LinkError(LinkErrorCode linkErrorCode, String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(linkErrorCode, str, str2, (i10 & 8) != 0 ? null : str3);
    }
}
