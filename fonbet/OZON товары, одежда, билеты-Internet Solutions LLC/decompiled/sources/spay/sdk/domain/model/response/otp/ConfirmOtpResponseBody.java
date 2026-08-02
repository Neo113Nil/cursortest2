package spay.sdk.domain.model.response.otp;

import Nh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lspay/sdk/domain/model/response/otp/ConfirmOtpResponseBody;", "", "errorCode", "", "message", "", "(ILjava/lang/String;)V", "getErrorCode", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ConfirmOtpResponseBody {
    private final int errorCode;
    private final String message;

    public ConfirmOtpResponseBody(int i11, String str) {
        this.errorCode = i11;
        this.message = str;
    }

    public static /* synthetic */ ConfirmOtpResponseBody copy$default(ConfirmOtpResponseBody confirmOtpResponseBody, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = confirmOtpResponseBody.errorCode;
        }
        if ((i12 & 2) != 0) {
            str = confirmOtpResponseBody.message;
        }
        return confirmOtpResponseBody.copy(i11, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final ConfirmOtpResponseBody copy(int errorCode, String message) {
        return new ConfirmOtpResponseBody(errorCode, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmOtpResponseBody)) {
            return false;
        }
        ConfirmOtpResponseBody confirmOtpResponseBody = (ConfirmOtpResponseBody) other;
        return this.errorCode == confirmOtpResponseBody.errorCode && Intrinsics.d(this.message, confirmOtpResponseBody.message);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.errorCode) * 31;
        String str = this.message;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return a.c(this.errorCode, "ConfirmOtpResponseBody(errorCode=", ", message=", this.message, ")");
    }
}
