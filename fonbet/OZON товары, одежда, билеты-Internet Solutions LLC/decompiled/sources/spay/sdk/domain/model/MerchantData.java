package spay.sdk.domain.model;

import C.o0;
import Lf.a;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000e¨\u0006$"}, d2 = {"Lspay/sdk/domain/model/MerchantData;", "", "authorization", "", "merchantLogin", "orderId", "bindingId", "orderNumber", "appPackage", "phoneNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppPackage", "()Ljava/lang/String;", "setAppPackage", "(Ljava/lang/String;)V", "getAuthorization", "getBindingId", "getMerchantLogin", "getOrderId", "getOrderNumber", "getPhoneNumber", "setPhoneNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MerchantData {

    @NotNull
    private String appPackage;

    @NotNull
    private final String authorization;
    private final String bindingId;

    @NotNull
    private final String merchantLogin;

    @NotNull
    private final String orderId;

    @NotNull
    private final String orderNumber;

    @NotNull
    private String phoneNumber;

    public MerchantData(@NotNull String authorization, @NotNull String merchantLogin, @NotNull String orderId, String str, @NotNull String orderNumber, @NotNull String appPackage, @NotNull String phoneNumber) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(merchantLogin, "merchantLogin");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.authorization = authorization;
        this.merchantLogin = merchantLogin;
        this.orderId = orderId;
        this.bindingId = str;
        this.orderNumber = orderNumber;
        this.appPackage = appPackage;
        this.phoneNumber = phoneNumber;
    }

    public static /* synthetic */ MerchantData copy$default(MerchantData merchantData, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = merchantData.authorization;
        }
        if ((i11 & 2) != 0) {
            str2 = merchantData.merchantLogin;
        }
        if ((i11 & 4) != 0) {
            str3 = merchantData.orderId;
        }
        if ((i11 & 8) != 0) {
            str4 = merchantData.bindingId;
        }
        if ((i11 & 16) != 0) {
            str5 = merchantData.orderNumber;
        }
        if ((i11 & 32) != 0) {
            str6 = merchantData.appPackage;
        }
        if ((i11 & 64) != 0) {
            str7 = merchantData.phoneNumber;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return merchantData.copy(str, str2, str11, str4, str10, str8, str9);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAuthorization() {
        return this.authorization;
    }

    @NotNull
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
    public final String getBindingId() {
        return this.bindingId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getAppPackage() {
        return this.appPackage;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    public final MerchantData copy(@NotNull String authorization, @NotNull String merchantLogin, @NotNull String orderId, String bindingId, @NotNull String orderNumber, @NotNull String appPackage, @NotNull String phoneNumber) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(merchantLogin, "merchantLogin");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        return new MerchantData(authorization, merchantLogin, orderId, bindingId, orderNumber, appPackage, phoneNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantData)) {
            return false;
        }
        MerchantData merchantData = (MerchantData) other;
        return Intrinsics.d(this.authorization, merchantData.authorization) && Intrinsics.d(this.merchantLogin, merchantData.merchantLogin) && Intrinsics.d(this.orderId, merchantData.orderId) && Intrinsics.d(this.bindingId, merchantData.bindingId) && Intrinsics.d(this.orderNumber, merchantData.orderNumber) && Intrinsics.d(this.appPackage, merchantData.appPackage) && Intrinsics.d(this.phoneNumber, merchantData.phoneNumber);
    }

    @NotNull
    public final String getAppPackage() {
        return this.appPackage;
    }

    @NotNull
    public final String getAuthorization() {
        return this.authorization;
    }

    public final String getBindingId() {
        return this.bindingId;
    }

    @NotNull
    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    @NotNull
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        int b02 = a.b0(a.b0(this.authorization.hashCode() * 31, this.merchantLogin), this.orderId);
        String str = this.bindingId;
        return this.phoneNumber.hashCode() + a.b0(a.b0((b02 + (str == null ? 0 : str.hashCode())) * 31, this.orderNumber), this.appPackage);
    }

    public final void setAppPackage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appPackage = str;
    }

    public final void setPhoneNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phoneNumber = str;
    }

    @NotNull
    public String toString() {
        String str = this.authorization;
        String str2 = this.merchantLogin;
        String str3 = this.orderId;
        String str4 = this.bindingId;
        String str5 = this.orderNumber;
        String str6 = this.appPackage;
        String str7 = this.phoneNumber;
        StringBuilder d11 = C3660k.d("MerchantData(authorization=", str, ", merchantLogin=", str2, ", orderId=");
        Nh.a.h(d11, str3, ", bindingId=", str4, ", orderNumber=");
        Nh.a.h(d11, str5, ", appPackage=", str6, ", phoneNumber=");
        return o0.c(d11, str7, ")");
    }

    public /* synthetic */ MerchantData(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? null : str4, str5, str6, (i11 & 64) != 0 ? "" : str7);
    }
}
