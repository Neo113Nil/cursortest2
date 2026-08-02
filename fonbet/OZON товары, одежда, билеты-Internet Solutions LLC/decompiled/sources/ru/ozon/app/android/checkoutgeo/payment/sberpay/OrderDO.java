package ru.ozon.app.android.checkoutgeo.payment.sberpay;

import B0.A0;
import De.C2859b;
import G.g;
import I0.C3173b;
import N3.C3660k;
import V.e;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO;", "", "<init>", "()V", "WithAction", "PayByOther", "PayByNative", "PayByFastPay", "PayBySberPay", "OrderRedirect", "OrderError", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$OrderError;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$OrderRedirect;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByFastPay;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByOther;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayBySberPay;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$WithAction;", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class OrderDO {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$OrderError;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$OrderError$TYPE;", "type", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "message", "", "duration", "<init>", "(Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$OrderError$TYPE;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$OrderError$TYPE;", "getType", "()Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$OrderError$TYPE;", "Ljava/lang/String;", "getTitle", "getMessage", "Ljava/lang/Long;", "getDuration", "()Ljava/lang/Long;", "TYPE", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrderError extends OrderDO {
        private final Long duration;

        @NotNull
        private final String message;
        private final String title;

        @NotNull
        private final TYPE type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$OrderError$TYPE;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "DEFAULT", "REFRESH", "RETRY", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class TYPE {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ TYPE[] $VALUES;
            public static final TYPE DEFAULT = new TYPE("DEFAULT", 0, "default");
            public static final TYPE REFRESH = new TYPE("REFRESH", 1, "refresh");
            public static final TYPE RETRY = new TYPE("RETRY", 2, "retry");

            @NotNull
            private final String key;

            private static final /* synthetic */ TYPE[] $values() {
                return new TYPE[]{DEFAULT, REFRESH, RETRY};
            }

            static {
                TYPE[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private TYPE(String str, int i11, String str2) {
                this.key = str2;
            }

            public static TYPE valueOf(String str) {
                return (TYPE) Enum.valueOf(TYPE.class, str);
            }

            public static TYPE[] values() {
                return (TYPE[]) $VALUES.clone();
            }

            @NotNull
            public final String getKey() {
                return this.key;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderError(@NotNull TYPE type, String str, @NotNull String message, Long l11) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(message, "message");
            this.type = type;
            this.title = str;
            this.message = message;
            this.duration = l11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderError)) {
                return false;
            }
            OrderError orderError = (OrderError) other;
            return this.type == orderError.type && Intrinsics.d(this.title, orderError.title) && Intrinsics.d(this.message, orderError.message) && Intrinsics.d(this.duration, orderError.duration);
        }

        public final Long getDuration() {
            return this.duration;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final TYPE getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.title;
            int a11 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.message);
            Long l11 = this.duration;
            return a11 + (l11 != null ? l11.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "OrderError(type=" + this.type + ", title=" + this.title + ", message=" + this.message + ", duration=" + this.duration + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$OrderRedirect;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO;", "", "redirectLink", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRedirectLink", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrderRedirect extends OrderDO {

        @NotNull
        private final String redirectLink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderRedirect(@NotNull String redirectLink) {
            super(null);
            Intrinsics.checkNotNullParameter(redirectLink, "redirectLink");
            this.redirectLink = redirectLink;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OrderRedirect) && Intrinsics.d(this.redirectLink, ((OrderRedirect) other).redirectLink);
        }

        @NotNull
        public final String getRedirectLink() {
            return this.redirectLink;
        }

        public int hashCode() {
            return this.redirectLink.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("OrderRedirect(redirectLink=", this.redirectLink, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByFastPay;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO;", "", "externalLink", "cancelLink", "", "isRedirectBank", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExternalLink", "getCancelLink", "Z", "()Z", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PayByFastPay extends OrderDO {
        private final String cancelLink;

        @NotNull
        private final String externalLink;
        private final boolean isRedirectBank;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PayByFastPay(@NotNull String externalLink, String str, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(externalLink, "externalLink");
            this.externalLink = externalLink;
            this.cancelLink = str;
            this.isRedirectBank = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PayByFastPay)) {
                return false;
            }
            PayByFastPay payByFastPay = (PayByFastPay) other;
            return Intrinsics.d(this.externalLink, payByFastPay.externalLink) && Intrinsics.d(this.cancelLink, payByFastPay.cancelLink) && this.isRedirectBank == payByFastPay.isRedirectBank;
        }

        public final String getCancelLink() {
            return this.cancelLink;
        }

        @NotNull
        public final String getExternalLink() {
            return this.externalLink;
        }

        public int hashCode() {
            int hashCode = this.externalLink.hashCode() * 31;
            String str = this.cancelLink;
            return Boolean.hashCode(this.isRedirectBank) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        /* renamed from: isRedirectBank, reason: from getter */
        public final boolean getIsRedirectBank() {
            return this.isRedirectBank;
        }

        @NotNull
        public String toString() {
            String str = this.externalLink;
            String str2 = this.cancelLink;
            return Pk0.a.a(")", C3660k.d("PayByFastPay(externalLink=", str, ", cancelLink=", str2, ", isRedirectBank="), this.isRedirectBank);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO;", "", "authorizePaymentUrl", "cancelLink", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative$NativePaymentInfo;", "nativePaymentInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative$NativePaymentInfo;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAuthorizePaymentUrl", "getCancelLink", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative$NativePaymentInfo;", "getNativePaymentInfo", "()Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative$NativePaymentInfo;", "NativePaymentInfo", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PayByNative extends OrderDO {
        private final String authorizePaymentUrl;
        private final String cancelLink;

        @NotNull
        private final NativePaymentInfo nativePaymentInfo;

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b%\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b&\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b'\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b)\u0010\u0018¨\u0006*"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative$NativePaymentInfo;", "Landroid/os/Parcelable;", "", "orderNumber", "Ljava/math/BigDecimal;", "fullOrderSum", "orderSum", "paymentToken", "provider", "merchant", "gateway", "authorizeComposerActionName", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrderNumber", "Ljava/math/BigDecimal;", "getFullOrderSum", "()Ljava/math/BigDecimal;", "getOrderSum", "getPaymentToken", "getProvider", "getMerchant", "getGateway", "getAuthorizeComposerActionName", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NativePaymentInfo implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<NativePaymentInfo> CREATOR = new Creator();
            private final String authorizeComposerActionName;

            @NotNull
            private final BigDecimal fullOrderSum;

            @NotNull
            private final String gateway;

            @NotNull
            private final String merchant;

            @NotNull
            private final String orderNumber;

            @NotNull
            private final BigDecimal orderSum;

            @NotNull
            private final String paymentToken;

            @NotNull
            private final String provider;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<NativePaymentInfo> {
                @Override // android.os.Parcelable.Creator
                public final NativePaymentInfo createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NativePaymentInfo(parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final NativePaymentInfo[] newArray(int i11) {
                    return new NativePaymentInfo[i11];
                }
            }

            public NativePaymentInfo(@NotNull String orderNumber, @NotNull BigDecimal fullOrderSum, @NotNull BigDecimal orderSum, @NotNull String paymentToken, @NotNull String provider, @NotNull String merchant, @NotNull String gateway, String str) {
                Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
                Intrinsics.checkNotNullParameter(fullOrderSum, "fullOrderSum");
                Intrinsics.checkNotNullParameter(orderSum, "orderSum");
                Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
                Intrinsics.checkNotNullParameter(provider, "provider");
                Intrinsics.checkNotNullParameter(merchant, "merchant");
                Intrinsics.checkNotNullParameter(gateway, "gateway");
                this.orderNumber = orderNumber;
                this.fullOrderSum = fullOrderSum;
                this.orderSum = orderSum;
                this.paymentToken = paymentToken;
                this.provider = provider;
                this.merchant = merchant;
                this.gateway = gateway;
                this.authorizeComposerActionName = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NativePaymentInfo)) {
                    return false;
                }
                NativePaymentInfo nativePaymentInfo = (NativePaymentInfo) other;
                return Intrinsics.d(this.orderNumber, nativePaymentInfo.orderNumber) && Intrinsics.d(this.fullOrderSum, nativePaymentInfo.fullOrderSum) && Intrinsics.d(this.orderSum, nativePaymentInfo.orderSum) && Intrinsics.d(this.paymentToken, nativePaymentInfo.paymentToken) && Intrinsics.d(this.provider, nativePaymentInfo.provider) && Intrinsics.d(this.merchant, nativePaymentInfo.merchant) && Intrinsics.d(this.gateway, nativePaymentInfo.gateway) && Intrinsics.d(this.authorizeComposerActionName, nativePaymentInfo.authorizeComposerActionName);
            }

            public final String getAuthorizeComposerActionName() {
                return this.authorizeComposerActionName;
            }

            @NotNull
            public final String getGateway() {
                return this.gateway;
            }

            @NotNull
            public final String getMerchant() {
                return this.merchant;
            }

            @NotNull
            public final String getOrderNumber() {
                return this.orderNumber;
            }

            @NotNull
            public final BigDecimal getOrderSum() {
                return this.orderSum;
            }

            @NotNull
            public final String getPaymentToken() {
                return this.paymentToken;
            }

            public int hashCode() {
                int a11 = g.a(g.a(g.a(g.a((this.orderSum.hashCode() + ((this.fullOrderSum.hashCode() + (this.orderNumber.hashCode() * 31)) * 31)) * 31, 31, this.paymentToken), 31, this.provider), 31, this.merchant), 31, this.gateway);
                String str = this.authorizeComposerActionName;
                return a11 + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                String str = this.orderNumber;
                BigDecimal bigDecimal = this.fullOrderSum;
                BigDecimal bigDecimal2 = this.orderSum;
                String str2 = this.paymentToken;
                String str3 = this.provider;
                String str4 = this.merchant;
                String str5 = this.gateway;
                String str6 = this.authorizeComposerActionName;
                StringBuilder sb2 = new StringBuilder("NativePaymentInfo(orderNumber=");
                sb2.append(str);
                sb2.append(", fullOrderSum=");
                sb2.append(bigDecimal);
                sb2.append(", orderSum=");
                sb2.append(bigDecimal2);
                sb2.append(", paymentToken=");
                sb2.append(str2);
                sb2.append(", provider=");
                Nh.a.h(sb2, str3, ", merchant=", str4, ", gateway=");
                return C3173b.c(sb2, str5, ", authorizeComposerActionName=", str6, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.orderNumber);
                dest.writeSerializable(this.fullOrderSum);
                dest.writeSerializable(this.orderSum);
                dest.writeString(this.paymentToken);
                dest.writeString(this.provider);
                dest.writeString(this.merchant);
                dest.writeString(this.gateway);
                dest.writeString(this.authorizeComposerActionName);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PayByNative(String str, String str2, @NotNull NativePaymentInfo nativePaymentInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(nativePaymentInfo, "nativePaymentInfo");
            this.authorizePaymentUrl = str;
            this.cancelLink = str2;
            this.nativePaymentInfo = nativePaymentInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PayByNative)) {
                return false;
            }
            PayByNative payByNative = (PayByNative) other;
            return Intrinsics.d(this.authorizePaymentUrl, payByNative.authorizePaymentUrl) && Intrinsics.d(this.cancelLink, payByNative.cancelLink) && Intrinsics.d(this.nativePaymentInfo, payByNative.nativePaymentInfo);
        }

        public final String getCancelLink() {
            return this.cancelLink;
        }

        @NotNull
        public final NativePaymentInfo getNativePaymentInfo() {
            return this.nativePaymentInfo;
        }

        public int hashCode() {
            String str = this.authorizePaymentUrl;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.cancelLink;
            return this.nativePaymentInfo.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.authorizePaymentUrl;
            String str2 = this.cancelLink;
            NativePaymentInfo nativePaymentInfo = this.nativePaymentInfo;
            StringBuilder d11 = C3660k.d("PayByNative(authorizePaymentUrl=", str, ", cancelLink=", str2, ", nativePaymentInfo=");
            d11.append(nativePaymentInfo);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByOther;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO;", "", "link", "cancelLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "getCancelLink", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PayByOther extends OrderDO {
        private final String cancelLink;
        private final String link;

        public PayByOther(String str, String str2) {
            super(null);
            this.link = str;
            this.cancelLink = str2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PayByOther)) {
                return false;
            }
            PayByOther payByOther = (PayByOther) other;
            return Intrinsics.d(this.link, payByOther.link) && Intrinsics.d(this.cancelLink, payByOther.cancelLink);
        }

        public final String getCancelLink() {
            return this.cancelLink;
        }

        public final String getLink() {
            return this.link;
        }

        public int hashCode() {
            String str = this.link;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.cancelLink;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return e.a("PayByOther(link=", this.link, ", cancelLink=", this.cancelLink, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001bB-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayBySberPay;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO;", "", "link", "cancelLink", "redirectLink", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayBySberPay$SberPayInfo;", "sberPayInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayBySberPay$SberPayInfo;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "getCancelLink", "getRedirectLink", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayBySberPay$SberPayInfo;", "getSberPayInfo", "()Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayBySberPay$SberPayInfo;", "SberPayInfo", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PayBySberPay extends OrderDO {
        private final String cancelLink;
        private final String link;
        private final String redirectLink;

        @NotNull
        private final SberPayInfo sberPayInfo;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayBySberPay$SberPayInfo;", "Landroid/os/Parcelable;", "", "apiKey", "merchant", "bankInvoiceId", "orderNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApiKey", "getMerchant", "getBankInvoiceId", "getOrderNumber", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SberPayInfo implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<SberPayInfo> CREATOR = new Creator();

            @NotNull
            private final String apiKey;

            @NotNull
            private final String bankInvoiceId;

            @NotNull
            private final String merchant;

            @NotNull
            private final String orderNumber;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SberPayInfo> {
                @Override // android.os.Parcelable.Creator
                public final SberPayInfo createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SberPayInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final SberPayInfo[] newArray(int i11) {
                    return new SberPayInfo[i11];
                }
            }

            public SberPayInfo(@NotNull String apiKey, @NotNull String merchant, @NotNull String bankInvoiceId, @NotNull String orderNumber) {
                Intrinsics.checkNotNullParameter(apiKey, "apiKey");
                Intrinsics.checkNotNullParameter(merchant, "merchant");
                Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
                Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
                this.apiKey = apiKey;
                this.merchant = merchant;
                this.bankInvoiceId = bankInvoiceId;
                this.orderNumber = orderNumber;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SberPayInfo)) {
                    return false;
                }
                SberPayInfo sberPayInfo = (SberPayInfo) other;
                return Intrinsics.d(this.apiKey, sberPayInfo.apiKey) && Intrinsics.d(this.merchant, sberPayInfo.merchant) && Intrinsics.d(this.bankInvoiceId, sberPayInfo.bankInvoiceId) && Intrinsics.d(this.orderNumber, sberPayInfo.orderNumber);
            }

            @NotNull
            public final String getApiKey() {
                return this.apiKey;
            }

            @NotNull
            public final String getBankInvoiceId() {
                return this.bankInvoiceId;
            }

            @NotNull
            public final String getMerchant() {
                return this.merchant;
            }

            @NotNull
            public final String getOrderNumber() {
                return this.orderNumber;
            }

            public int hashCode() {
                return this.orderNumber.hashCode() + g.a(g.a(this.apiKey.hashCode() * 31, 31, this.merchant), 31, this.bankInvoiceId);
            }

            @NotNull
            public String toString() {
                String str = this.apiKey;
                String str2 = this.merchant;
                return C3173b.c(C3660k.d("SberPayInfo(apiKey=", str, ", merchant=", str2, ", bankInvoiceId="), this.bankInvoiceId, ", orderNumber=", this.orderNumber, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.apiKey);
                dest.writeString(this.merchant);
                dest.writeString(this.bankInvoiceId);
                dest.writeString(this.orderNumber);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PayBySberPay(String str, String str2, String str3, @NotNull SberPayInfo sberPayInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(sberPayInfo, "sberPayInfo");
            this.link = str;
            this.cancelLink = str2;
            this.redirectLink = str3;
            this.sberPayInfo = sberPayInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PayBySberPay)) {
                return false;
            }
            PayBySberPay payBySberPay = (PayBySberPay) other;
            return Intrinsics.d(this.link, payBySberPay.link) && Intrinsics.d(this.cancelLink, payBySberPay.cancelLink) && Intrinsics.d(this.redirectLink, payBySberPay.redirectLink) && Intrinsics.d(this.sberPayInfo, payBySberPay.sberPayInfo);
        }

        public final String getCancelLink() {
            return this.cancelLink;
        }

        public final String getLink() {
            return this.link;
        }

        public final String getRedirectLink() {
            return this.redirectLink;
        }

        @NotNull
        public final SberPayInfo getSberPayInfo() {
            return this.sberPayInfo;
        }

        public int hashCode() {
            String str = this.link;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.cancelLink;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.redirectLink;
            return this.sberPayInfo.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.link;
            String str2 = this.cancelLink;
            String str3 = this.redirectLink;
            SberPayInfo sberPayInfo = this.sberPayInfo;
            StringBuilder d11 = C3660k.d("PayBySberPay(link=", str, ", cancelLink=", str2, ", redirectLink=");
            d11.append(str3);
            d11.append(", sberPayInfo=");
            d11.append(sberPayInfo);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$WithAction;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WithAction extends OrderDO {

        @NotNull
        private final AtomActionDTO action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithAction(@NotNull AtomActionDTO action) {
            super(null);
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WithAction) && Intrinsics.d(this.action, ((WithAction) other).action);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        @NotNull
        public String toString() {
            return C2859b.f("WithAction(action=", ")", this.action);
        }
    }

    public /* synthetic */ OrderDO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OrderDO() {
    }
}
