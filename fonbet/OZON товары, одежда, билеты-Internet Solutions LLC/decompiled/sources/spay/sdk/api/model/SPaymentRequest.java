package spay.sdk.api.model;

import Lf.a;
import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.api.PaymentResult;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fHÆ\u0003Je\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006*"}, d2 = {"Lspay/sdk/api/model/SPaymentRequest;", "", "context", "Landroid/content/Context;", "apiKey", "", "bankInvoiceId", "orderNumber", "merchantLogin", "appPackage", "phoneNumber", "callback", "Lkotlin/Function1;", "Lspay/sdk/api/PaymentResult;", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getApiKey", "()Ljava/lang/String;", "getAppPackage", "getBankInvoiceId", "getCallback", "()Lkotlin/jvm/functions/Function1;", "getContext", "()Landroid/content/Context;", "getMerchantLogin", "getOrderNumber", "getPhoneNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SPaymentRequest {

    @NotNull
    private final String apiKey;

    @NotNull
    private final String appPackage;

    @NotNull
    private final String bankInvoiceId;

    @NotNull
    private final Function1<PaymentResult, Unit> callback;

    @NotNull
    private final Context context;

    @NotNull
    private final String merchantLogin;

    @NotNull
    private final String orderNumber;

    @NotNull
    private final String phoneNumber;

    /* JADX WARN: Multi-variable type inference failed */
    public SPaymentRequest(@NotNull Context context, @NotNull String apiKey, @NotNull String bankInvoiceId, @NotNull String orderNumber, @NotNull String merchantLogin, @NotNull String appPackage, @NotNull String phoneNumber, @NotNull Function1<? super PaymentResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(merchantLogin, "merchantLogin");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.context = context;
        this.apiKey = apiKey;
        this.bankInvoiceId = bankInvoiceId;
        this.orderNumber = orderNumber;
        this.merchantLogin = merchantLogin;
        this.appPackage = appPackage;
        this.phoneNumber = phoneNumber;
        this.callback = callback;
    }

    public static /* synthetic */ SPaymentRequest copy$default(SPaymentRequest sPaymentRequest, Context context, String str, String str2, String str3, String str4, String str5, String str6, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            context = sPaymentRequest.context;
        }
        if ((i11 & 2) != 0) {
            str = sPaymentRequest.apiKey;
        }
        if ((i11 & 4) != 0) {
            str2 = sPaymentRequest.bankInvoiceId;
        }
        if ((i11 & 8) != 0) {
            str3 = sPaymentRequest.orderNumber;
        }
        if ((i11 & 16) != 0) {
            str4 = sPaymentRequest.merchantLogin;
        }
        if ((i11 & 32) != 0) {
            str5 = sPaymentRequest.appPackage;
        }
        if ((i11 & 64) != 0) {
            str6 = sPaymentRequest.phoneNumber;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            function1 = sPaymentRequest.callback;
        }
        String str7 = str6;
        Function1 function12 = function1;
        String str8 = str4;
        String str9 = str5;
        return sPaymentRequest.copy(context, str, str2, str3, str8, str9, str7, function12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getBankInvoiceId() {
        return this.bankInvoiceId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getMerchantLogin() {
        return this.merchantLogin;
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
    public final Function1<PaymentResult, Unit> component8() {
        return this.callback;
    }

    @NotNull
    public final SPaymentRequest copy(@NotNull Context context, @NotNull String apiKey, @NotNull String bankInvoiceId, @NotNull String orderNumber, @NotNull String merchantLogin, @NotNull String appPackage, @NotNull String phoneNumber, @NotNull Function1<? super PaymentResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(merchantLogin, "merchantLogin");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new SPaymentRequest(context, apiKey, bankInvoiceId, orderNumber, merchantLogin, appPackage, phoneNumber, callback);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SPaymentRequest)) {
            return false;
        }
        SPaymentRequest sPaymentRequest = (SPaymentRequest) other;
        return Intrinsics.d(this.context, sPaymentRequest.context) && Intrinsics.d(this.apiKey, sPaymentRequest.apiKey) && Intrinsics.d(this.bankInvoiceId, sPaymentRequest.bankInvoiceId) && Intrinsics.d(this.orderNumber, sPaymentRequest.orderNumber) && Intrinsics.d(this.merchantLogin, sPaymentRequest.merchantLogin) && Intrinsics.d(this.appPackage, sPaymentRequest.appPackage) && Intrinsics.d(this.phoneNumber, sPaymentRequest.phoneNumber) && Intrinsics.d(this.callback, sPaymentRequest.callback);
    }

    @NotNull
    public final String getApiKey() {
        return this.apiKey;
    }

    @NotNull
    public final String getAppPackage() {
        return this.appPackage;
    }

    @NotNull
    public final String getBankInvoiceId() {
        return this.bankInvoiceId;
    }

    @NotNull
    public final Function1<PaymentResult, Unit> getCallback() {
        return this.callback;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final String getMerchantLogin() {
        return this.merchantLogin;
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
        return this.callback.hashCode() + a.b0(a.b0(a.b0(a.b0(a.b0(a.b0(this.context.hashCode() * 31, this.apiKey), this.bankInvoiceId), this.orderNumber), this.merchantLogin), this.appPackage), this.phoneNumber);
    }

    @NotNull
    public String toString() {
        Context context = this.context;
        String str = this.apiKey;
        String str2 = this.bankInvoiceId;
        String str3 = this.orderNumber;
        String str4 = this.merchantLogin;
        String str5 = this.appPackage;
        String str6 = this.phoneNumber;
        Function1<PaymentResult, Unit> function1 = this.callback;
        StringBuilder sb2 = new StringBuilder("SPaymentRequest(context=");
        sb2.append(context);
        sb2.append(", apiKey=");
        sb2.append(str);
        sb2.append(", bankInvoiceId=");
        Nh.a.h(sb2, str2, ", orderNumber=", str3, ", merchantLogin=");
        Nh.a.h(sb2, str4, ", appPackage=", str5, ", phoneNumber=");
        sb2.append(str6);
        sb2.append(", callback=");
        sb2.append(function1);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ SPaymentRequest(Context context, String str, String str2, String str3, String str4, String str5, String str6, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, str3, str4, str5, (i11 & 64) != 0 ? "" : str6, function1);
    }
}
