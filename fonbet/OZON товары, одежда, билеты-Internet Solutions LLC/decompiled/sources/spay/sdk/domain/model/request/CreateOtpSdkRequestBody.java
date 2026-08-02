package spay.sdk.domain.model.request;

import K00.b;
import Lf.a;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lspay/sdk/domain/model/request/CreateOtpSdkRequestBody;", "", "bankInvoiceId", "", "sessionId", "paymentId", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getBankInvoiceId", "()Ljava/lang/String;", "getPaymentId", "()I", "getSessionId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CreateOtpSdkRequestBody {

    @NotNull
    private final String bankInvoiceId;
    private final int paymentId;

    @NotNull
    private final String sessionId;

    public CreateOtpSdkRequestBody(@NotNull String bankInvoiceId, @NotNull String sessionId, int i11) {
        Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.bankInvoiceId = bankInvoiceId;
        this.sessionId = sessionId;
        this.paymentId = i11;
    }

    public static /* synthetic */ CreateOtpSdkRequestBody copy$default(CreateOtpSdkRequestBody createOtpSdkRequestBody, String str, String str2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = createOtpSdkRequestBody.bankInvoiceId;
        }
        if ((i12 & 2) != 0) {
            str2 = createOtpSdkRequestBody.sessionId;
        }
        if ((i12 & 4) != 0) {
            i11 = createOtpSdkRequestBody.paymentId;
        }
        return createOtpSdkRequestBody.copy(str, str2, i11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBankInvoiceId() {
        return this.bankInvoiceId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPaymentId() {
        return this.paymentId;
    }

    @NotNull
    public final CreateOtpSdkRequestBody copy(@NotNull String bankInvoiceId, @NotNull String sessionId, int paymentId) {
        Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new CreateOtpSdkRequestBody(bankInvoiceId, sessionId, paymentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateOtpSdkRequestBody)) {
            return false;
        }
        CreateOtpSdkRequestBody createOtpSdkRequestBody = (CreateOtpSdkRequestBody) other;
        return Intrinsics.d(this.bankInvoiceId, createOtpSdkRequestBody.bankInvoiceId) && Intrinsics.d(this.sessionId, createOtpSdkRequestBody.sessionId) && this.paymentId == createOtpSdkRequestBody.paymentId;
    }

    @NotNull
    public final String getBankInvoiceId() {
        return this.bankInvoiceId;
    }

    public final int getPaymentId() {
        return this.paymentId;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return Integer.hashCode(this.paymentId) + a.b0(this.bankInvoiceId.hashCode() * 31, this.sessionId);
    }

    @NotNull
    public String toString() {
        return b.e(this.paymentId, ")", C3660k.d("CreateOtpSdkRequestBody(bankInvoiceId=", this.bankInvoiceId, ", sessionId=", this.sessionId, ", paymentId="));
    }
}
