package spay.sdk.domain.model.request;

import Bk.C2638a;
import D3.g;
import D40.c;
import Lf.a;
import N3.C3660k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u0010J\u0080\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u0006,"}, d2 = {"Lspay/sdk/domain/model/request/PaymentOrderRequestBody;", "", "operationId", "", "merchantLogin", "orderId", "paymentToken", "paymentTokenId", "jsonParams", "", "threeDSMethodNotificationUrl", "termUrl", "bindingNotNeeded", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getBindingNotNeeded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getJsonParams", "()Ljava/util/Map;", "getMerchantLogin", "()Ljava/lang/String;", "getOperationId", "getOrderId", "getPaymentToken", "getPaymentTokenId", "getTermUrl", "getThreeDSMethodNotificationUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lspay/sdk/domain/model/request/PaymentOrderRequestBody;", "equals", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentOrderRequestBody {
    private final Boolean bindingNotNeeded;

    @NotNull
    private final Map<String, String> jsonParams;
    private final String merchantLogin;

    @NotNull
    private final String operationId;

    @NotNull
    private final String orderId;
    private final String paymentToken;
    private final String paymentTokenId;
    private final String termUrl;
    private final String threeDSMethodNotificationUrl;

    public PaymentOrderRequestBody(@NotNull String operationId, String str, @NotNull String orderId, String str2, String str3, @NotNull Map<String, String> jsonParams, String str4, String str5, Boolean bool) {
        Intrinsics.checkNotNullParameter(operationId, "operationId");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(jsonParams, "jsonParams");
        this.operationId = operationId;
        this.merchantLogin = str;
        this.orderId = orderId;
        this.paymentToken = str2;
        this.paymentTokenId = str3;
        this.jsonParams = jsonParams;
        this.threeDSMethodNotificationUrl = str4;
        this.termUrl = str5;
        this.bindingNotNeeded = bool;
    }

    public static /* synthetic */ PaymentOrderRequestBody copy$default(PaymentOrderRequestBody paymentOrderRequestBody, String str, String str2, String str3, String str4, String str5, Map map, String str6, String str7, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = paymentOrderRequestBody.operationId;
        }
        if ((i11 & 2) != 0) {
            str2 = paymentOrderRequestBody.merchantLogin;
        }
        if ((i11 & 4) != 0) {
            str3 = paymentOrderRequestBody.orderId;
        }
        if ((i11 & 8) != 0) {
            str4 = paymentOrderRequestBody.paymentToken;
        }
        if ((i11 & 16) != 0) {
            str5 = paymentOrderRequestBody.paymentTokenId;
        }
        if ((i11 & 32) != 0) {
            map = paymentOrderRequestBody.jsonParams;
        }
        if ((i11 & 64) != 0) {
            str6 = paymentOrderRequestBody.threeDSMethodNotificationUrl;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str7 = paymentOrderRequestBody.termUrl;
        }
        if ((i11 & 256) != 0) {
            bool = paymentOrderRequestBody.bindingNotNeeded;
        }
        String str8 = str7;
        Boolean bool2 = bool;
        Map map2 = map;
        String str9 = str6;
        String str10 = str5;
        String str11 = str3;
        return paymentOrderRequestBody.copy(str, str2, str11, str4, str10, map2, str9, str8, bool2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getOperationId() {
        return this.operationId;
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

    /* renamed from: component4, reason: from getter */
    public final String getPaymentToken() {
        return this.paymentToken;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPaymentTokenId() {
        return this.paymentTokenId;
    }

    @NotNull
    public final Map<String, String> component6() {
        return this.jsonParams;
    }

    /* renamed from: component7, reason: from getter */
    public final String getThreeDSMethodNotificationUrl() {
        return this.threeDSMethodNotificationUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTermUrl() {
        return this.termUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getBindingNotNeeded() {
        return this.bindingNotNeeded;
    }

    @NotNull
    public final PaymentOrderRequestBody copy(@NotNull String operationId, String merchantLogin, @NotNull String orderId, String paymentToken, String paymentTokenId, @NotNull Map<String, String> jsonParams, String threeDSMethodNotificationUrl, String termUrl, Boolean bindingNotNeeded) {
        Intrinsics.checkNotNullParameter(operationId, "operationId");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(jsonParams, "jsonParams");
        return new PaymentOrderRequestBody(operationId, merchantLogin, orderId, paymentToken, paymentTokenId, jsonParams, threeDSMethodNotificationUrl, termUrl, bindingNotNeeded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentOrderRequestBody)) {
            return false;
        }
        PaymentOrderRequestBody paymentOrderRequestBody = (PaymentOrderRequestBody) other;
        return Intrinsics.d(this.operationId, paymentOrderRequestBody.operationId) && Intrinsics.d(this.merchantLogin, paymentOrderRequestBody.merchantLogin) && Intrinsics.d(this.orderId, paymentOrderRequestBody.orderId) && Intrinsics.d(this.paymentToken, paymentOrderRequestBody.paymentToken) && Intrinsics.d(this.paymentTokenId, paymentOrderRequestBody.paymentTokenId) && Intrinsics.d(this.jsonParams, paymentOrderRequestBody.jsonParams) && Intrinsics.d(this.threeDSMethodNotificationUrl, paymentOrderRequestBody.threeDSMethodNotificationUrl) && Intrinsics.d(this.termUrl, paymentOrderRequestBody.termUrl) && Intrinsics.d(this.bindingNotNeeded, paymentOrderRequestBody.bindingNotNeeded);
    }

    public final Boolean getBindingNotNeeded() {
        return this.bindingNotNeeded;
    }

    @NotNull
    public final Map<String, String> getJsonParams() {
        return this.jsonParams;
    }

    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    @NotNull
    public final String getOperationId() {
        return this.operationId;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPaymentToken() {
        return this.paymentToken;
    }

    public final String getPaymentTokenId() {
        return this.paymentTokenId;
    }

    public final String getTermUrl() {
        return this.termUrl;
    }

    public final String getThreeDSMethodNotificationUrl() {
        return this.threeDSMethodNotificationUrl;
    }

    public int hashCode() {
        int hashCode = this.operationId.hashCode() * 31;
        String str = this.merchantLogin;
        int b02 = a.b0((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.orderId);
        String str2 = this.paymentToken;
        int hashCode2 = (b02 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentTokenId;
        int a11 = c.a(this.jsonParams, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.threeDSMethodNotificationUrl;
        int hashCode3 = (a11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.termUrl;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.bindingNotNeeded;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.operationId;
        String str2 = this.merchantLogin;
        String str3 = this.orderId;
        String str4 = this.paymentToken;
        String str5 = this.paymentTokenId;
        Map<String, String> map = this.jsonParams;
        String str6 = this.threeDSMethodNotificationUrl;
        String str7 = this.termUrl;
        Boolean bool = this.bindingNotNeeded;
        StringBuilder d11 = C3660k.d("PaymentOrderRequestBody(operationId=", str, ", merchantLogin=", str2, ", orderId=");
        Nh.a.h(d11, str3, ", paymentToken=", str4, ", paymentTokenId=");
        C2638a.e(d11, str5, ", jsonParams=", map, ", threeDSMethodNotificationUrl=");
        Nh.a.h(d11, str6, ", termUrl=", str7, ", bindingNotNeeded=");
        return g.d(d11, bool, ")");
    }

    public /* synthetic */ PaymentOrderRequestBody(String str, String str2, String str3, String str4, String str5, Map map, String str6, String str7, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, map, (i11 & 64) != 0 ? null : str6, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str7, (i11 & 256) != 0 ? null : bool);
    }
}
