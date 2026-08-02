package spay.sdk.domain.model.response.otp;

import C.o0;
import Cm.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lspay/sdk/domain/model/response/otp/CreateOtpSdkResponseBody;", "", "errorCode", "", "errorMessage", "", "mobilePhone", "(ILjava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()I", "getErrorMessage", "()Ljava/lang/String;", "getMobilePhone", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CreateOtpSdkResponseBody {
    private final int errorCode;
    private final String errorMessage;

    @NotNull
    private final String mobilePhone;

    public CreateOtpSdkResponseBody(int i11, String str, @NotNull String mobilePhone) {
        Intrinsics.checkNotNullParameter(mobilePhone, "mobilePhone");
        this.errorCode = i11;
        this.errorMessage = str;
        this.mobilePhone = mobilePhone;
    }

    public static /* synthetic */ CreateOtpSdkResponseBody copy$default(CreateOtpSdkResponseBody createOtpSdkResponseBody, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = createOtpSdkResponseBody.errorCode;
        }
        if ((i12 & 2) != 0) {
            str = createOtpSdkResponseBody.errorMessage;
        }
        if ((i12 & 4) != 0) {
            str2 = createOtpSdkResponseBody.mobilePhone;
        }
        return createOtpSdkResponseBody.copy(i11, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getMobilePhone() {
        return this.mobilePhone;
    }

    @NotNull
    public final CreateOtpSdkResponseBody copy(int errorCode, String errorMessage, @NotNull String mobilePhone) {
        Intrinsics.checkNotNullParameter(mobilePhone, "mobilePhone");
        return new CreateOtpSdkResponseBody(errorCode, errorMessage, mobilePhone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateOtpSdkResponseBody)) {
            return false;
        }
        CreateOtpSdkResponseBody createOtpSdkResponseBody = (CreateOtpSdkResponseBody) other;
        return this.errorCode == createOtpSdkResponseBody.errorCode && Intrinsics.d(this.errorMessage, createOtpSdkResponseBody.errorMessage) && Intrinsics.d(this.mobilePhone, createOtpSdkResponseBody.mobilePhone);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final String getMobilePhone() {
        return this.mobilePhone;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.errorCode) * 31;
        String str = this.errorMessage;
        return this.mobilePhone.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.errorCode;
        String str = this.errorMessage;
        return o0.c(e.g(i11, "CreateOtpSdkResponseBody(errorCode=", ", errorMessage=", str, ", mobilePhone="), this.mobilePhone, ")");
    }
}
