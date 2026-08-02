package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.model;

import An.C2439a;
import B0.A0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.vo.WannaDiscountV2VO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Action;", "", "<init>", "()V", "QuantitySuccess", "PriceError", "QuantityError", "UpdateDiscounts", "SendDiscount", "PriceSuccess", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Action$PriceError;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Action$PriceSuccess;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Action$QuantityError;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Action$QuantitySuccess;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Action$SendDiscount;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Action$UpdateDiscounts;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class WannaDiscountV2Action {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Action$PriceError;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Action;", "", "message", "", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/vo/WannaDiscountV2VO$Discount;", "discounts", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Ljava/util/List;", "getDiscounts", "()Ljava/util/List;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceError extends WannaDiscountV2Action {

        @NotNull
        private final List<WannaDiscountV2VO.Discount> discounts;

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PriceError(@NotNull String message, @NotNull List<WannaDiscountV2VO.Discount> discounts) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(discounts, "discounts");
            this.message = message;
            this.discounts = discounts;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceError)) {
                return false;
            }
            PriceError priceError = (PriceError) other;
            return Intrinsics.d(this.message, priceError.message) && Intrinsics.d(this.discounts, priceError.discounts);
        }

        @NotNull
        public final List<WannaDiscountV2VO.Discount> getDiscounts() {
            return this.discounts;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.discounts.hashCode() + (this.message.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2439a.a("PriceError(message=", this.message, ", discounts=", ")", this.discounts);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Action$PriceSuccess;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Action;", "", "price", "", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/vo/WannaDiscountV2VO$Discount;", "discounts", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPrice", "Ljava/util/List;", "getDiscounts", "()Ljava/util/List;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceSuccess extends WannaDiscountV2Action {

        @NotNull
        private final List<WannaDiscountV2VO.Discount> discounts;

        @NotNull
        private final String price;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PriceSuccess(@NotNull String price, @NotNull List<WannaDiscountV2VO.Discount> discounts) {
            super(null);
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(discounts, "discounts");
            this.price = price;
            this.discounts = discounts;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceSuccess)) {
                return false;
            }
            PriceSuccess priceSuccess = (PriceSuccess) other;
            return Intrinsics.d(this.price, priceSuccess.price) && Intrinsics.d(this.discounts, priceSuccess.discounts);
        }

        @NotNull
        public final List<WannaDiscountV2VO.Discount> getDiscounts() {
            return this.discounts;
        }

        @NotNull
        public final String getPrice() {
            return this.price;
        }

        public int hashCode() {
            return this.discounts.hashCode() + (this.price.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2439a.a("PriceSuccess(price=", this.price, ", discounts=", ")", this.discounts);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Action$QuantityError;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Action;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuantityError extends WannaDiscountV2Action {

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuantityError(@NotNull String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof QuantityError) && Intrinsics.d(this.message, ((QuantityError) other).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("QuantityError(message=", this.message, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Action$QuantitySuccess;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Action;", "<init>", "()V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class QuantitySuccess extends WannaDiscountV2Action {

        @NotNull
        public static final QuantitySuccess INSTANCE = new QuantitySuccess();

        private QuantitySuccess() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Action$SendDiscount;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Action;", "", "action", "", "sku", "", "userPrice", "userQuantity", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAction", "Ljava/lang/Long;", "getSku", "()Ljava/lang/Long;", "Ljava/lang/Double;", "getUserPrice", "()Ljava/lang/Double;", "getUserQuantity", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SendDiscount extends WannaDiscountV2Action {

        @NotNull
        private final String action;
        private final Long sku;
        private final Double userPrice;
        private final Long userQuantity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendDiscount(@NotNull String action, Long l11, Double d11, Long l12) {
            super(null);
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
            this.sku = l11;
            this.userPrice = d11;
            this.userQuantity = l12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SendDiscount)) {
                return false;
            }
            SendDiscount sendDiscount = (SendDiscount) other;
            return Intrinsics.d(this.action, sendDiscount.action) && Intrinsics.d(this.sku, sendDiscount.sku) && Intrinsics.d(this.userPrice, sendDiscount.userPrice) && Intrinsics.d(this.userQuantity, sendDiscount.userQuantity);
        }

        @NotNull
        public final String getAction() {
            return this.action;
        }

        public final Long getSku() {
            return this.sku;
        }

        public final Double getUserPrice() {
            return this.userPrice;
        }

        public final Long getUserQuantity() {
            return this.userQuantity;
        }

        public int hashCode() {
            int hashCode = this.action.hashCode() * 31;
            Long l11 = this.sku;
            int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            Double d11 = this.userPrice;
            int hashCode3 = (hashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
            Long l12 = this.userQuantity;
            return hashCode3 + (l12 != null ? l12.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SendDiscount(action=" + this.action + ", sku=" + this.sku + ", userPrice=" + this.userPrice + ", userQuantity=" + this.userQuantity + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Action$UpdateDiscounts;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Action;", "", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/vo/WannaDiscountV2VO$Discount;", "discounts", "", "position", "<init>", "(Ljava/util/List;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getDiscounts", "()Ljava/util/List;", "I", "getPosition", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateDiscounts extends WannaDiscountV2Action {

        @NotNull
        private final List<WannaDiscountV2VO.Discount> discounts;
        private final int position;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateDiscounts(@NotNull List<WannaDiscountV2VO.Discount> discounts, int i11) {
            super(null);
            Intrinsics.checkNotNullParameter(discounts, "discounts");
            this.discounts = discounts;
            this.position = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateDiscounts)) {
                return false;
            }
            UpdateDiscounts updateDiscounts = (UpdateDiscounts) other;
            return Intrinsics.d(this.discounts, updateDiscounts.discounts) && this.position == updateDiscounts.position;
        }

        @NotNull
        public final List<WannaDiscountV2VO.Discount> getDiscounts() {
            return this.discounts;
        }

        public final int getPosition() {
            return this.position;
        }

        public int hashCode() {
            return Integer.hashCode(this.position) + (this.discounts.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "UpdateDiscounts(discounts=" + this.discounts + ", position=" + this.position + ")";
        }
    }

    public /* synthetic */ WannaDiscountV2Action(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private WannaDiscountV2Action() {
    }
}
