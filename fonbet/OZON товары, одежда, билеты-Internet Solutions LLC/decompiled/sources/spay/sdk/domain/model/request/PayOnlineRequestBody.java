package spay.sdk.domain.model.request;

import B0.C2454a;
import Ds.C2880a;
import Lf.a;
import N3.C3660k;
import T7.E;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.FraudMonInfo;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\b\u0080\b\u0018\u00002\u00020\u0001Bu\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0011J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0088\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\bHÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0013¨\u00064"}, d2 = {"Lspay/sdk/domain/model/request/PayOnlineRequestBody;", "", "userName", "", "sessionId", "merchantLogin", "deviceInfo", "paymentId", "", "priorityCardOnly", "", "orderId", "isBnplEnabled", "fraudMonInfo", "Lspay/sdk/domain/model/FraudMonInfo;", "paymentInBonuses", "sumBonuses", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/String;ZLspay/sdk/domain/model/FraudMonInfo;Ljava/lang/Boolean;Ljava/lang/Object;)V", "getDeviceInfo", "()Ljava/lang/String;", "getFraudMonInfo", "()Lspay/sdk/domain/model/FraudMonInfo;", "()Z", "getMerchantLogin", "getOrderId", "getPaymentId", "()I", "getPaymentInBonuses", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPriorityCardOnly", "getSessionId", "getSumBonuses", "()Ljava/lang/Object;", "getUserName", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/String;ZLspay/sdk/domain/model/FraudMonInfo;Ljava/lang/Boolean;Ljava/lang/Object;)Lspay/sdk/domain/model/request/PayOnlineRequestBody;", "equals", "other", "hashCode", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PayOnlineRequestBody {

    @NotNull
    private final String deviceInfo;
    private final FraudMonInfo fraudMonInfo;
    private final boolean isBnplEnabled;
    private final String merchantLogin;

    @NotNull
    private final String orderId;
    private final int paymentId;
    private final Boolean paymentInBonuses;
    private final Boolean priorityCardOnly;

    @NotNull
    private final String sessionId;
    private final Object sumBonuses;
    private final String userName;

    public PayOnlineRequestBody(String str, @NotNull String sessionId, String str2, @NotNull String deviceInfo, int i11, Boolean bool, @NotNull String orderId, boolean z11, FraudMonInfo fraudMonInfo, Boolean bool2, Object obj) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.userName = str;
        this.sessionId = sessionId;
        this.merchantLogin = str2;
        this.deviceInfo = deviceInfo;
        this.paymentId = i11;
        this.priorityCardOnly = bool;
        this.orderId = orderId;
        this.isBnplEnabled = z11;
        this.fraudMonInfo = fraudMonInfo;
        this.paymentInBonuses = bool2;
        this.sumBonuses = obj;
    }

    public static /* synthetic */ PayOnlineRequestBody copy$default(PayOnlineRequestBody payOnlineRequestBody, String str, String str2, String str3, String str4, int i11, Boolean bool, String str5, boolean z11, FraudMonInfo fraudMonInfo, Boolean bool2, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            str = payOnlineRequestBody.userName;
        }
        if ((i12 & 2) != 0) {
            str2 = payOnlineRequestBody.sessionId;
        }
        if ((i12 & 4) != 0) {
            str3 = payOnlineRequestBody.merchantLogin;
        }
        if ((i12 & 8) != 0) {
            str4 = payOnlineRequestBody.deviceInfo;
        }
        if ((i12 & 16) != 0) {
            i11 = payOnlineRequestBody.paymentId;
        }
        if ((i12 & 32) != 0) {
            bool = payOnlineRequestBody.priorityCardOnly;
        }
        if ((i12 & 64) != 0) {
            str5 = payOnlineRequestBody.orderId;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            z11 = payOnlineRequestBody.isBnplEnabled;
        }
        if ((i12 & 256) != 0) {
            fraudMonInfo = payOnlineRequestBody.fraudMonInfo;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            bool2 = payOnlineRequestBody.paymentInBonuses;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            obj = payOnlineRequestBody.sumBonuses;
        }
        Boolean bool3 = bool2;
        Object obj3 = obj;
        boolean z12 = z11;
        FraudMonInfo fraudMonInfo2 = fraudMonInfo;
        Boolean bool4 = bool;
        String str6 = str5;
        int i13 = i11;
        String str7 = str3;
        return payOnlineRequestBody.copy(str, str2, str7, str4, i13, bool4, str6, z12, fraudMonInfo2, bool3, obj3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getPaymentInBonuses() {
        return this.paymentInBonuses;
    }

    /* renamed from: component11, reason: from getter */
    public final Object getSumBonuses() {
        return this.sumBonuses;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDeviceInfo() {
        return this.deviceInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPaymentId() {
        return this.paymentId;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getPriorityCardOnly() {
        return this.priorityCardOnly;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsBnplEnabled() {
        return this.isBnplEnabled;
    }

    /* renamed from: component9, reason: from getter */
    public final FraudMonInfo getFraudMonInfo() {
        return this.fraudMonInfo;
    }

    @NotNull
    public final PayOnlineRequestBody copy(String userName, @NotNull String sessionId, String merchantLogin, @NotNull String deviceInfo, int paymentId, Boolean priorityCardOnly, @NotNull String orderId, boolean isBnplEnabled, FraudMonInfo fraudMonInfo, Boolean paymentInBonuses, Object sumBonuses) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return new PayOnlineRequestBody(userName, sessionId, merchantLogin, deviceInfo, paymentId, priorityCardOnly, orderId, isBnplEnabled, fraudMonInfo, paymentInBonuses, sumBonuses);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayOnlineRequestBody)) {
            return false;
        }
        PayOnlineRequestBody payOnlineRequestBody = (PayOnlineRequestBody) other;
        return Intrinsics.d(this.userName, payOnlineRequestBody.userName) && Intrinsics.d(this.sessionId, payOnlineRequestBody.sessionId) && Intrinsics.d(this.merchantLogin, payOnlineRequestBody.merchantLogin) && Intrinsics.d(this.deviceInfo, payOnlineRequestBody.deviceInfo) && this.paymentId == payOnlineRequestBody.paymentId && Intrinsics.d(this.priorityCardOnly, payOnlineRequestBody.priorityCardOnly) && Intrinsics.d(this.orderId, payOnlineRequestBody.orderId) && this.isBnplEnabled == payOnlineRequestBody.isBnplEnabled && Intrinsics.d(this.fraudMonInfo, payOnlineRequestBody.fraudMonInfo) && Intrinsics.d(this.paymentInBonuses, payOnlineRequestBody.paymentInBonuses) && Intrinsics.d(this.sumBonuses, payOnlineRequestBody.sumBonuses);
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

    public final Boolean getPaymentInBonuses() {
        return this.paymentInBonuses;
    }

    public final Boolean getPriorityCardOnly() {
        return this.priorityCardOnly;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public final Object getSumBonuses() {
        return this.sumBonuses;
    }

    public final String getUserName() {
        return this.userName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.userName;
        int b02 = a.b0((str == null ? 0 : str.hashCode()) * 31, this.sessionId);
        String str2 = this.merchantLogin;
        int a11 = C2454a.a(this.paymentId, a.b0((b02 + (str2 == null ? 0 : str2.hashCode())) * 31, this.deviceInfo), 31);
        Boolean bool = this.priorityCardOnly;
        int b03 = a.b0((a11 + (bool == null ? 0 : bool.hashCode())) * 31, this.orderId);
        boolean z11 = this.isBnplEnabled;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (b03 + i11) * 31;
        FraudMonInfo fraudMonInfo = this.fraudMonInfo;
        int hashCode = (i12 + (fraudMonInfo == null ? 0 : fraudMonInfo.hashCode())) * 31;
        Boolean bool2 = this.paymentInBonuses;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Object obj = this.sumBonuses;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final boolean isBnplEnabled() {
        return this.isBnplEnabled;
    }

    @NotNull
    public String toString() {
        String str = this.userName;
        String str2 = this.sessionId;
        String str3 = this.merchantLogin;
        String str4 = this.deviceInfo;
        int i11 = this.paymentId;
        Boolean bool = this.priorityCardOnly;
        String str5 = this.orderId;
        boolean z11 = this.isBnplEnabled;
        FraudMonInfo fraudMonInfo = this.fraudMonInfo;
        Boolean bool2 = this.paymentInBonuses;
        Object obj = this.sumBonuses;
        StringBuilder d11 = C3660k.d("PayOnlineRequestBody(userName=", str, ", sessionId=", str2, ", merchantLogin=");
        Nh.a.h(d11, str3, ", deviceInfo=", str4, ", paymentId=");
        d11.append(i11);
        d11.append(", priorityCardOnly=");
        d11.append(bool);
        d11.append(", orderId=");
        C2880a.c(str5, ", isBnplEnabled=", ", fraudMonInfo=", d11, z11);
        d11.append(fraudMonInfo);
        d11.append(", paymentInBonuses=");
        d11.append(bool2);
        d11.append(", sumBonuses=");
        return E.c(obj, ")", d11);
    }

    public /* synthetic */ PayOnlineRequestBody(String str, String str2, String str3, String str4, int i11, Boolean bool, String str5, boolean z11, FraudMonInfo fraudMonInfo, Boolean bool2, Object obj, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : str, str2, (i12 & 4) != 0 ? null : str3, str4, i11, (i12 & 32) != 0 ? null : bool, str5, z11, (i12 & 256) != 0 ? null : fraudMonInfo, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : bool2, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : obj);
    }
}
