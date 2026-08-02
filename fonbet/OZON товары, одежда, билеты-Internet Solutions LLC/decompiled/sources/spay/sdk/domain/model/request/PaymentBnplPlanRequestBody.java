package spay.sdk.domain.model.request;

import C.o0;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lspay/sdk/domain/model/request/PaymentBnplPlanRequestBody;", "", "sessionId", "", "merchantLogin", "orderId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMerchantLogin", "()Ljava/lang/String;", "getOrderId", "getSessionId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentBnplPlanRequestBody {
    private final String merchantLogin;

    @NotNull
    private final String orderId;

    @NotNull
    private final String sessionId;

    public PaymentBnplPlanRequestBody(@NotNull String sessionId, String str, @NotNull String orderId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.sessionId = sessionId;
        this.merchantLogin = str;
        this.orderId = orderId;
    }

    public static /* synthetic */ PaymentBnplPlanRequestBody copy$default(PaymentBnplPlanRequestBody paymentBnplPlanRequestBody, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = paymentBnplPlanRequestBody.sessionId;
        }
        if ((i11 & 2) != 0) {
            str2 = paymentBnplPlanRequestBody.merchantLogin;
        }
        if ((i11 & 4) != 0) {
            str3 = paymentBnplPlanRequestBody.orderId;
        }
        return paymentBnplPlanRequestBody.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final PaymentBnplPlanRequestBody copy(@NotNull String sessionId, String merchantLogin, @NotNull String orderId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return new PaymentBnplPlanRequestBody(sessionId, merchantLogin, orderId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentBnplPlanRequestBody)) {
            return false;
        }
        PaymentBnplPlanRequestBody paymentBnplPlanRequestBody = (PaymentBnplPlanRequestBody) other;
        return Intrinsics.d(this.sessionId, paymentBnplPlanRequestBody.sessionId) && Intrinsics.d(this.merchantLogin, paymentBnplPlanRequestBody.merchantLogin) && Intrinsics.d(this.orderId, paymentBnplPlanRequestBody.orderId);
    }

    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int hashCode = this.sessionId.hashCode() * 31;
        String str = this.merchantLogin;
        return this.orderId.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.sessionId;
        String str2 = this.merchantLogin;
        return o0.c(C3660k.d("PaymentBnplPlanRequestBody(sessionId=", str, ", merchantLogin=", str2, ", orderId="), this.orderId, ")");
    }

    public /* synthetic */ PaymentBnplPlanRequestBody(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, str3);
    }
}
