package spay.sdk.domain.model.request;

import B0.C2454a;
import Ds.C2880a;
import Lf.a;
import N3.C3660k;
import Pk0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.FraudMonInfo;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006$"}, d2 = {"Lspay/sdk/domain/model/request/PaymentTokenRequestBody;", "", "sessionId", "", "deviceInfo", "paymentId", "", "merchantLogin", "orderId", "isBnplEnabled", "", "fraudMonInfo", "Lspay/sdk/domain/model/FraudMonInfo;", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLspay/sdk/domain/model/FraudMonInfo;)V", "getDeviceInfo", "()Ljava/lang/String;", "getFraudMonInfo", "()Lspay/sdk/domain/model/FraudMonInfo;", "()Z", "getMerchantLogin", "getOrderId", "getPaymentId", "()I", "getSessionId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentTokenRequestBody {

    @NotNull
    private final String deviceInfo;
    private final FraudMonInfo fraudMonInfo;
    private final boolean isBnplEnabled;
    private final String merchantLogin;

    @NotNull
    private final String orderId;
    private final int paymentId;

    @NotNull
    private final String sessionId;

    public PaymentTokenRequestBody(@NotNull String sessionId, @NotNull String deviceInfo, int i11, String str, @NotNull String orderId, boolean z11, FraudMonInfo fraudMonInfo) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.sessionId = sessionId;
        this.deviceInfo = deviceInfo;
        this.paymentId = i11;
        this.merchantLogin = str;
        this.orderId = orderId;
        this.isBnplEnabled = z11;
        this.fraudMonInfo = fraudMonInfo;
    }

    public static /* synthetic */ PaymentTokenRequestBody copy$default(PaymentTokenRequestBody paymentTokenRequestBody, String str, String str2, int i11, String str3, String str4, boolean z11, FraudMonInfo fraudMonInfo, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = paymentTokenRequestBody.sessionId;
        }
        if ((i12 & 2) != 0) {
            str2 = paymentTokenRequestBody.deviceInfo;
        }
        if ((i12 & 4) != 0) {
            i11 = paymentTokenRequestBody.paymentId;
        }
        if ((i12 & 8) != 0) {
            str3 = paymentTokenRequestBody.merchantLogin;
        }
        if ((i12 & 16) != 0) {
            str4 = paymentTokenRequestBody.orderId;
        }
        if ((i12 & 32) != 0) {
            z11 = paymentTokenRequestBody.isBnplEnabled;
        }
        if ((i12 & 64) != 0) {
            fraudMonInfo = paymentTokenRequestBody.fraudMonInfo;
        }
        boolean z12 = z11;
        FraudMonInfo fraudMonInfo2 = fraudMonInfo;
        String str5 = str4;
        int i13 = i11;
        return paymentTokenRequestBody.copy(str, str2, i13, str3, str5, z12, fraudMonInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDeviceInfo() {
        return this.deviceInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPaymentId() {
        return this.paymentId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsBnplEnabled() {
        return this.isBnplEnabled;
    }

    /* renamed from: component7, reason: from getter */
    public final FraudMonInfo getFraudMonInfo() {
        return this.fraudMonInfo;
    }

    @NotNull
    public final PaymentTokenRequestBody copy(@NotNull String sessionId, @NotNull String deviceInfo, int paymentId, String merchantLogin, @NotNull String orderId, boolean isBnplEnabled, FraudMonInfo fraudMonInfo) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return new PaymentTokenRequestBody(sessionId, deviceInfo, paymentId, merchantLogin, orderId, isBnplEnabled, fraudMonInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentTokenRequestBody)) {
            return false;
        }
        PaymentTokenRequestBody paymentTokenRequestBody = (PaymentTokenRequestBody) other;
        return Intrinsics.d(this.sessionId, paymentTokenRequestBody.sessionId) && Intrinsics.d(this.deviceInfo, paymentTokenRequestBody.deviceInfo) && this.paymentId == paymentTokenRequestBody.paymentId && Intrinsics.d(this.merchantLogin, paymentTokenRequestBody.merchantLogin) && Intrinsics.d(this.orderId, paymentTokenRequestBody.orderId) && this.isBnplEnabled == paymentTokenRequestBody.isBnplEnabled && Intrinsics.d(this.fraudMonInfo, paymentTokenRequestBody.fraudMonInfo);
    }

    @NotNull
    public final String getDeviceInfo() {
        return this.deviceInfo;
    }

    public final FraudMonInfo getFraudMonInfo() {
        return this.fraudMonInfo;
    }

    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    public final int getPaymentId() {
        return this.paymentId;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a11 = C2454a.a(this.paymentId, a.b0(this.sessionId.hashCode() * 31, this.deviceInfo), 31);
        String str = this.merchantLogin;
        int b02 = a.b0((a11 + (str == null ? 0 : str.hashCode())) * 31, this.orderId);
        boolean z11 = this.isBnplEnabled;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (b02 + i11) * 31;
        FraudMonInfo fraudMonInfo = this.fraudMonInfo;
        return i12 + (fraudMonInfo != null ? fraudMonInfo.hashCode() : 0);
    }

    public final boolean isBnplEnabled() {
        return this.isBnplEnabled;
    }

    @NotNull
    public String toString() {
        String str = this.sessionId;
        String str2 = this.deviceInfo;
        int i11 = this.paymentId;
        String str3 = this.merchantLogin;
        String str4 = this.orderId;
        boolean z11 = this.isBnplEnabled;
        FraudMonInfo fraudMonInfo = this.fraudMonInfo;
        StringBuilder d11 = C3660k.d("PaymentTokenRequestBody(sessionId=", str, ", deviceInfo=", str2, ", paymentId=");
        i.c(i11, ", merchantLogin=", str3, ", orderId=", d11);
        C2880a.c(str4, ", isBnplEnabled=", ", fraudMonInfo=", d11, z11);
        d11.append(fraudMonInfo);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ PaymentTokenRequestBody(String str, String str2, int i11, String str3, String str4, boolean z11, FraudMonInfo fraudMonInfo, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i11, (i12 & 8) != 0 ? null : str3, str4, (i12 & 32) != 0 ? false : z11, (i12 & 64) != 0 ? null : fraudMonInfo);
    }
}
