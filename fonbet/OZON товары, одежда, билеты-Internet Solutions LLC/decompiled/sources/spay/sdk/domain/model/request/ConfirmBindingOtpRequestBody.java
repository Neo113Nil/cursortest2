package spay.sdk.domain.model.request;

import V.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lspay/sdk/domain/model/request/ConfirmBindingOtpRequestBody;", "", "otpHash", "", "sessionId", "(Ljava/lang/String;Ljava/lang/String;)V", "getOtpHash", "()Ljava/lang/String;", "getSessionId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ConfirmBindingOtpRequestBody {

    @NotNull
    private final String otpHash;

    @NotNull
    private final String sessionId;

    public ConfirmBindingOtpRequestBody(@NotNull String otpHash, @NotNull String sessionId) {
        Intrinsics.checkNotNullParameter(otpHash, "otpHash");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.otpHash = otpHash;
        this.sessionId = sessionId;
    }

    public static /* synthetic */ ConfirmBindingOtpRequestBody copy$default(ConfirmBindingOtpRequestBody confirmBindingOtpRequestBody, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = confirmBindingOtpRequestBody.otpHash;
        }
        if ((i11 & 2) != 0) {
            str2 = confirmBindingOtpRequestBody.sessionId;
        }
        return confirmBindingOtpRequestBody.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getOtpHash() {
        return this.otpHash;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final ConfirmBindingOtpRequestBody copy(@NotNull String otpHash, @NotNull String sessionId) {
        Intrinsics.checkNotNullParameter(otpHash, "otpHash");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new ConfirmBindingOtpRequestBody(otpHash, sessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmBindingOtpRequestBody)) {
            return false;
        }
        ConfirmBindingOtpRequestBody confirmBindingOtpRequestBody = (ConfirmBindingOtpRequestBody) other;
        return Intrinsics.d(this.otpHash, confirmBindingOtpRequestBody.otpHash) && Intrinsics.d(this.sessionId, confirmBindingOtpRequestBody.sessionId);
    }

    @NotNull
    public final String getOtpHash() {
        return this.otpHash;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return this.sessionId.hashCode() + (this.otpHash.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return e.a("ConfirmBindingOtpRequestBody(otpHash=", this.otpHash, ", sessionId=", this.sessionId, ")");
    }
}
