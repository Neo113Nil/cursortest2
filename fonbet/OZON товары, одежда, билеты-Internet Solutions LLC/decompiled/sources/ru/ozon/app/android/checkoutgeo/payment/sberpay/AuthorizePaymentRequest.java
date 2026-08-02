package ru.ozon.app.android.checkoutgeo.payment.sberpay;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/AuthorizePaymentRequest;", "", "parameters", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/AuthorizePaymentRequest$GooglePayRequest;", "paymentToken", "", "<init>", "(Lru/ozon/app/android/checkoutgeo/payment/sberpay/AuthorizePaymentRequest$GooglePayRequest;Ljava/lang/String;)V", "getParameters", "()Lru/ozon/app/android/checkoutgeo/payment/sberpay/AuthorizePaymentRequest$GooglePayRequest;", "getPaymentToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "GooglePayRequest", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AuthorizePaymentRequest {

    @NotNull
    private final GooglePayRequest parameters;

    @NotNull
    private final String paymentToken;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/AuthorizePaymentRequest$GooglePayRequest;", "", "mobilePaymentToken", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/MobilePaymentToken;", "<init>", "(Lru/ozon/app/android/checkoutgeo/payment/sberpay/MobilePaymentToken;)V", "getMobilePaymentToken", "()Lru/ozon/app/android/checkoutgeo/payment/sberpay/MobilePaymentToken;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GooglePayRequest {

        @NotNull
        private final MobilePaymentToken mobilePaymentToken;

        public GooglePayRequest(@NotNull MobilePaymentToken mobilePaymentToken) {
            Intrinsics.checkNotNullParameter(mobilePaymentToken, "mobilePaymentToken");
            this.mobilePaymentToken = mobilePaymentToken;
        }

        public static /* synthetic */ GooglePayRequest copy$default(GooglePayRequest googlePayRequest, MobilePaymentToken mobilePaymentToken, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                mobilePaymentToken = googlePayRequest.mobilePaymentToken;
            }
            return googlePayRequest.copy(mobilePaymentToken);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final MobilePaymentToken getMobilePaymentToken() {
            return this.mobilePaymentToken;
        }

        @NotNull
        public final GooglePayRequest copy(@NotNull MobilePaymentToken mobilePaymentToken) {
            Intrinsics.checkNotNullParameter(mobilePaymentToken, "mobilePaymentToken");
            return new GooglePayRequest(mobilePaymentToken);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GooglePayRequest) && Intrinsics.d(this.mobilePaymentToken, ((GooglePayRequest) other).mobilePaymentToken);
        }

        @NotNull
        public final MobilePaymentToken getMobilePaymentToken() {
            return this.mobilePaymentToken;
        }

        public int hashCode() {
            return this.mobilePaymentToken.hashCode();
        }

        @NotNull
        public String toString() {
            return "GooglePayRequest(mobilePaymentToken=" + this.mobilePaymentToken + ")";
        }
    }

    public AuthorizePaymentRequest(@NotNull GooglePayRequest parameters, @NotNull String paymentToken) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
        this.parameters = parameters;
        this.paymentToken = paymentToken;
    }

    public static /* synthetic */ AuthorizePaymentRequest copy$default(AuthorizePaymentRequest authorizePaymentRequest, GooglePayRequest googlePayRequest, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            googlePayRequest = authorizePaymentRequest.parameters;
        }
        if ((i11 & 2) != 0) {
            str = authorizePaymentRequest.paymentToken;
        }
        return authorizePaymentRequest.copy(googlePayRequest, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final GooglePayRequest getParameters() {
        return this.parameters;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPaymentToken() {
        return this.paymentToken;
    }

    @NotNull
    public final AuthorizePaymentRequest copy(@NotNull GooglePayRequest parameters, @NotNull String paymentToken) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
        return new AuthorizePaymentRequest(parameters, paymentToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorizePaymentRequest)) {
            return false;
        }
        AuthorizePaymentRequest authorizePaymentRequest = (AuthorizePaymentRequest) other;
        return Intrinsics.d(this.parameters, authorizePaymentRequest.parameters) && Intrinsics.d(this.paymentToken, authorizePaymentRequest.paymentToken);
    }

    @NotNull
    public final GooglePayRequest getParameters() {
        return this.parameters;
    }

    @NotNull
    public final String getPaymentToken() {
        return this.paymentToken;
    }

    public int hashCode() {
        return this.paymentToken.hashCode() + (this.parameters.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AuthorizePaymentRequest(parameters=" + this.parameters + ", paymentToken=" + this.paymentToken + ")";
    }
}
