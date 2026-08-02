package spay.sdk.domain.model.response;

import N3.C3660k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006!"}, d2 = {"Lspay/sdk/domain/model/response/SPayApiError;", "Landroid/os/Parcelable;", "errorCode", "", "description", "fraudMonCheckResult", "Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;", "info", "(Ljava/lang/String;Ljava/lang/String;Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "getFraudMonCheckResult", "()Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;", "getInfo", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SPayApiError implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SPayApiError> CREATOR = new Creator();
    private final String description;

    @NotNull
    private final String errorCode;
    private final FraudMonCheckResult fraudMonCheckResult;
    private final String info;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SPayApiError> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SPayApiError createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SPayApiError(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FraudMonCheckResult.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SPayApiError[] newArray(int i11) {
            return new SPayApiError[i11];
        }
    }

    public SPayApiError(@NotNull String errorCode, String str, FraudMonCheckResult fraudMonCheckResult, String str2) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.errorCode = errorCode;
        this.description = str;
        this.fraudMonCheckResult = fraudMonCheckResult;
        this.info = str2;
    }

    public static /* synthetic */ SPayApiError copy$default(SPayApiError sPayApiError, String str, String str2, FraudMonCheckResult fraudMonCheckResult, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sPayApiError.errorCode;
        }
        if ((i11 & 2) != 0) {
            str2 = sPayApiError.description;
        }
        if ((i11 & 4) != 0) {
            fraudMonCheckResult = sPayApiError.fraudMonCheckResult;
        }
        if ((i11 & 8) != 0) {
            str3 = sPayApiError.info;
        }
        return sPayApiError.copy(str, str2, fraudMonCheckResult, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final FraudMonCheckResult getFraudMonCheckResult() {
        return this.fraudMonCheckResult;
    }

    /* renamed from: component4, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    @NotNull
    public final SPayApiError copy(@NotNull String errorCode, String description, FraudMonCheckResult fraudMonCheckResult, String info) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        return new SPayApiError(errorCode, description, fraudMonCheckResult, info);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SPayApiError)) {
            return false;
        }
        SPayApiError sPayApiError = (SPayApiError) other;
        return Intrinsics.d(this.errorCode, sPayApiError.errorCode) && Intrinsics.d(this.description, sPayApiError.description) && Intrinsics.d(this.fraudMonCheckResult, sPayApiError.fraudMonCheckResult) && Intrinsics.d(this.info, sPayApiError.info);
    }

    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    public final FraudMonCheckResult getFraudMonCheckResult() {
        return this.fraudMonCheckResult;
    }

    public final String getInfo() {
        return this.info;
    }

    public int hashCode() {
        int hashCode = this.errorCode.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        FraudMonCheckResult fraudMonCheckResult = this.fraudMonCheckResult;
        int hashCode3 = (hashCode2 + (fraudMonCheckResult == null ? 0 : fraudMonCheckResult.hashCode())) * 31;
        String str2 = this.info;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.errorCode;
        String str2 = this.description;
        FraudMonCheckResult fraudMonCheckResult = this.fraudMonCheckResult;
        String str3 = this.info;
        StringBuilder d11 = C3660k.d("SPayApiError(errorCode=", str, ", description=", str2, ", fraudMonCheckResult=");
        d11.append(fraudMonCheckResult);
        d11.append(", info=");
        d11.append(str3);
        d11.append(")");
        return d11.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.errorCode);
        parcel.writeString(this.description);
        FraudMonCheckResult fraudMonCheckResult = this.fraudMonCheckResult;
        if (fraudMonCheckResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fraudMonCheckResult.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.info);
    }
}
