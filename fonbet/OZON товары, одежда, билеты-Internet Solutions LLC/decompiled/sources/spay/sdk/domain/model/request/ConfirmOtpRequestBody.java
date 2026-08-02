package spay.sdk.domain.model.request;

import C.o0;
import Lf.a;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JW\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lspay/sdk/domain/model/request/ConfirmOtpRequestBody;", "", "bankInvoiceId", "", "bindingId", "orderNumber", "otpHash", "environmentParams", "merchantLogin", "sessionId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankInvoiceId", "()Ljava/lang/String;", "getBindingId", "getEnvironmentParams", "getMerchantLogin", "getOrderNumber", "getOtpHash", "getSessionId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ConfirmOtpRequestBody {

    @NotNull
    private final String bankInvoiceId;
    private final String bindingId;
    private final String environmentParams;
    private final String merchantLogin;
    private final String orderNumber;

    @NotNull
    private final String otpHash;

    @NotNull
    private final String sessionId;

    public ConfirmOtpRequestBody(@NotNull String bankInvoiceId, String str, String str2, @NotNull String otpHash, String str3, String str4, @NotNull String sessionId) {
        Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
        Intrinsics.checkNotNullParameter(otpHash, "otpHash");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.bankInvoiceId = bankInvoiceId;
        this.bindingId = str;
        this.orderNumber = str2;
        this.otpHash = otpHash;
        this.environmentParams = str3;
        this.merchantLogin = str4;
        this.sessionId = sessionId;
    }

    public static /* synthetic */ ConfirmOtpRequestBody copy$default(ConfirmOtpRequestBody confirmOtpRequestBody, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = confirmOtpRequestBody.bankInvoiceId;
        }
        if ((i11 & 2) != 0) {
            str2 = confirmOtpRequestBody.bindingId;
        }
        if ((i11 & 4) != 0) {
            str3 = confirmOtpRequestBody.orderNumber;
        }
        if ((i11 & 8) != 0) {
            str4 = confirmOtpRequestBody.otpHash;
        }
        if ((i11 & 16) != 0) {
            str5 = confirmOtpRequestBody.environmentParams;
        }
        if ((i11 & 32) != 0) {
            str6 = confirmOtpRequestBody.merchantLogin;
        }
        if ((i11 & 64) != 0) {
            str7 = confirmOtpRequestBody.sessionId;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return confirmOtpRequestBody.copy(str, str2, str11, str4, str10, str8, str9);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBankInvoiceId() {
        return this.bankInvoiceId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBindingId() {
        return this.bindingId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getOtpHash() {
        return this.otpHash;
    }

    /* renamed from: component5, reason: from getter */
    public final String getEnvironmentParams() {
        return this.environmentParams;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final ConfirmOtpRequestBody copy(@NotNull String bankInvoiceId, String bindingId, String orderNumber, @NotNull String otpHash, String environmentParams, String merchantLogin, @NotNull String sessionId) {
        Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
        Intrinsics.checkNotNullParameter(otpHash, "otpHash");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new ConfirmOtpRequestBody(bankInvoiceId, bindingId, orderNumber, otpHash, environmentParams, merchantLogin, sessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmOtpRequestBody)) {
            return false;
        }
        ConfirmOtpRequestBody confirmOtpRequestBody = (ConfirmOtpRequestBody) other;
        return Intrinsics.d(this.bankInvoiceId, confirmOtpRequestBody.bankInvoiceId) && Intrinsics.d(this.bindingId, confirmOtpRequestBody.bindingId) && Intrinsics.d(this.orderNumber, confirmOtpRequestBody.orderNumber) && Intrinsics.d(this.otpHash, confirmOtpRequestBody.otpHash) && Intrinsics.d(this.environmentParams, confirmOtpRequestBody.environmentParams) && Intrinsics.d(this.merchantLogin, confirmOtpRequestBody.merchantLogin) && Intrinsics.d(this.sessionId, confirmOtpRequestBody.sessionId);
    }

    @NotNull
    public final String getBankInvoiceId() {
        return this.bankInvoiceId;
    }

    public final String getBindingId() {
        return this.bindingId;
    }

    public final String getEnvironmentParams() {
        return this.environmentParams;
    }

    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    public final String getOrderNumber() {
        return this.orderNumber;
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
        int hashCode = this.bankInvoiceId.hashCode() * 31;
        String str = this.bindingId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.orderNumber;
        int b02 = a.b0((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, this.otpHash);
        String str3 = this.environmentParams;
        int hashCode3 = (b02 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.merchantLogin;
        return this.sessionId.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.bankInvoiceId;
        String str2 = this.bindingId;
        String str3 = this.orderNumber;
        String str4 = this.otpHash;
        String str5 = this.environmentParams;
        String str6 = this.merchantLogin;
        String str7 = this.sessionId;
        StringBuilder d11 = C3660k.d("ConfirmOtpRequestBody(bankInvoiceId=", str, ", bindingId=", str2, ", orderNumber=");
        Nh.a.h(d11, str3, ", otpHash=", str4, ", environmentParams=");
        Nh.a.h(d11, str5, ", merchantLogin=", str6, ", sessionId=");
        return o0.c(d11, str7, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ConfirmOtpRequestBody(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, r7, r8, r9);
        String str8;
        String str9;
        String str10;
        str2 = (i11 & 2) != 0 ? null : str2;
        str3 = (i11 & 4) != 0 ? null : str3;
        if ((i11 & 16) != 0) {
            str8 = str7;
            str9 = str6;
            str10 = null;
        } else {
            str8 = str7;
            str9 = str6;
            str10 = str5;
        }
    }
}
