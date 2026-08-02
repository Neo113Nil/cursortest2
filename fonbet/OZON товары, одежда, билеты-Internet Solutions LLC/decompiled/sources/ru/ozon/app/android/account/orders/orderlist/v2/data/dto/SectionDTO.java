package ru.ozon.app.android.account.orders.orderlist.v2.data.dto;

import B90.C2618u;
import G.g;
import N3.C3660k;
import Nh.a;
import Pk0.c;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import g.C6594f;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0005789:;Bs\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0087\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006<"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "buttons", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "description", "Lru/ozon/uni/atoms/data/AtomDTO;", "paymentInfo", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$PaymentInfo;", "statusProvider", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$StatusProvider;", "products", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$Product;", "status", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$Status;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$Timer;", "deliveryInfo", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$PaymentInfo;Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$StatusProvider;Ljava/util/List;Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$Status;Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$Timer;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getTitle", "()Ljava/lang/String;", "getButtons", "()Ljava/util/List;", "getDescription", "getPaymentInfo", "()Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$PaymentInfo;", "getStatusProvider", "()Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$StatusProvider;", "getProducts", "getStatus", "()Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$Status;", "getTimer", "()Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$Timer;", "getDeliveryInfo", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentInfo", "StatusProvider", "Product", "Status", "Timer", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SectionDTO {
    public static final int $stable = 8;
    private final List<ButtonV3Atom.SmallButton> buttons;
    private final TextDTO deliveryInfo;
    private final List<AtomDTO> description;
    private final PaymentInfo paymentInfo;
    private final List<Product> products;
    private final Status status;
    private final StatusProvider statusProvider;
    private final Timer timer;
    private final String title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jl\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u0006/"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$PaymentInfo;", "", "link", "", "orderNumber", "payerEmail", "payerFirstName", "payerLastName", "paymentTypeId", "", "totalPrice", "Ljava/math/BigDecimal;", "useNewPaymentForm", "", "cardToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/String;)V", "getLink", "()Ljava/lang/String;", "getOrderNumber", "getPayerEmail", "getPayerFirstName", "getPayerLastName", "getPaymentTypeId", "()J", "getTotalPrice", "()Ljava/math/BigDecimal;", "getUseNewPaymentForm", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCardToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/String;)Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$PaymentInfo;", "equals", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaymentInfo {
        public static final int $stable = 8;
        private final String cardToken;

        @NotNull
        private final String link;

        @NotNull
        private final String orderNumber;

        @NotNull
        private final String payerEmail;

        @NotNull
        private final String payerFirstName;

        @NotNull
        private final String payerLastName;
        private final long paymentTypeId;

        @NotNull
        private final BigDecimal totalPrice;
        private final Boolean useNewPaymentForm;

        public PaymentInfo(@NotNull String link, @NotNull String orderNumber, @NotNull String payerEmail, @NotNull String payerFirstName, @NotNull String payerLastName, long j11, @NotNull BigDecimal totalPrice, Boolean bool, String str) {
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
            Intrinsics.checkNotNullParameter(payerEmail, "payerEmail");
            Intrinsics.checkNotNullParameter(payerFirstName, "payerFirstName");
            Intrinsics.checkNotNullParameter(payerLastName, "payerLastName");
            Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
            this.link = link;
            this.orderNumber = orderNumber;
            this.payerEmail = payerEmail;
            this.payerFirstName = payerFirstName;
            this.payerLastName = payerLastName;
            this.paymentTypeId = j11;
            this.totalPrice = totalPrice;
            this.useNewPaymentForm = bool;
            this.cardToken = str;
        }

        public static /* synthetic */ PaymentInfo copy$default(PaymentInfo paymentInfo, String str, String str2, String str3, String str4, String str5, long j11, BigDecimal bigDecimal, Boolean bool, String str6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = paymentInfo.link;
            }
            if ((i11 & 2) != 0) {
                str2 = paymentInfo.orderNumber;
            }
            if ((i11 & 4) != 0) {
                str3 = paymentInfo.payerEmail;
            }
            if ((i11 & 8) != 0) {
                str4 = paymentInfo.payerFirstName;
            }
            if ((i11 & 16) != 0) {
                str5 = paymentInfo.payerLastName;
            }
            if ((i11 & 32) != 0) {
                j11 = paymentInfo.paymentTypeId;
            }
            if ((i11 & 64) != 0) {
                bigDecimal = paymentInfo.totalPrice;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                bool = paymentInfo.useNewPaymentForm;
            }
            if ((i11 & 256) != 0) {
                str6 = paymentInfo.cardToken;
            }
            String str7 = str6;
            BigDecimal bigDecimal2 = bigDecimal;
            long j12 = j11;
            String str8 = str4;
            String str9 = str5;
            String str10 = str3;
            return paymentInfo.copy(str, str2, str10, str8, str9, j12, bigDecimal2, bool, str7);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getOrderNumber() {
            return this.orderNumber;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getPayerEmail() {
            return this.payerEmail;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getPayerFirstName() {
            return this.payerFirstName;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getPayerLastName() {
            return this.payerLastName;
        }

        /* renamed from: component6, reason: from getter */
        public final long getPaymentTypeId() {
            return this.paymentTypeId;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final BigDecimal getTotalPrice() {
            return this.totalPrice;
        }

        /* renamed from: component8, reason: from getter */
        public final Boolean getUseNewPaymentForm() {
            return this.useNewPaymentForm;
        }

        /* renamed from: component9, reason: from getter */
        public final String getCardToken() {
            return this.cardToken;
        }

        @NotNull
        public final PaymentInfo copy(@NotNull String link, @NotNull String orderNumber, @NotNull String payerEmail, @NotNull String payerFirstName, @NotNull String payerLastName, long paymentTypeId, @NotNull BigDecimal totalPrice, Boolean useNewPaymentForm, String cardToken) {
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
            Intrinsics.checkNotNullParameter(payerEmail, "payerEmail");
            Intrinsics.checkNotNullParameter(payerFirstName, "payerFirstName");
            Intrinsics.checkNotNullParameter(payerLastName, "payerLastName");
            Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
            return new PaymentInfo(link, orderNumber, payerEmail, payerFirstName, payerLastName, paymentTypeId, totalPrice, useNewPaymentForm, cardToken);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentInfo)) {
                return false;
            }
            PaymentInfo paymentInfo = (PaymentInfo) other;
            return Intrinsics.d(this.link, paymentInfo.link) && Intrinsics.d(this.orderNumber, paymentInfo.orderNumber) && Intrinsics.d(this.payerEmail, paymentInfo.payerEmail) && Intrinsics.d(this.payerFirstName, paymentInfo.payerFirstName) && Intrinsics.d(this.payerLastName, paymentInfo.payerLastName) && this.paymentTypeId == paymentInfo.paymentTypeId && Intrinsics.d(this.totalPrice, paymentInfo.totalPrice) && Intrinsics.d(this.useNewPaymentForm, paymentInfo.useNewPaymentForm) && Intrinsics.d(this.cardToken, paymentInfo.cardToken);
        }

        public final String getCardToken() {
            return this.cardToken;
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        @NotNull
        public final String getOrderNumber() {
            return this.orderNumber;
        }

        @NotNull
        public final String getPayerEmail() {
            return this.payerEmail;
        }

        @NotNull
        public final String getPayerFirstName() {
            return this.payerFirstName;
        }

        @NotNull
        public final String getPayerLastName() {
            return this.payerLastName;
        }

        public final long getPaymentTypeId() {
            return this.paymentTypeId;
        }

        @NotNull
        public final BigDecimal getTotalPrice() {
            return this.totalPrice;
        }

        public final Boolean getUseNewPaymentForm() {
            return this.useNewPaymentForm;
        }

        public int hashCode() {
            int hashCode = (this.totalPrice.hashCode() + c.a(g.a(g.a(g.a(g.a(this.link.hashCode() * 31, 31, this.orderNumber), 31, this.payerEmail), 31, this.payerFirstName), 31, this.payerLastName), 31, this.paymentTypeId)) * 31;
            Boolean bool = this.useNewPaymentForm;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.cardToken;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.link;
            String str2 = this.orderNumber;
            String str3 = this.payerEmail;
            String str4 = this.payerFirstName;
            String str5 = this.payerLastName;
            long j11 = this.paymentTypeId;
            BigDecimal bigDecimal = this.totalPrice;
            Boolean bool = this.useNewPaymentForm;
            String str6 = this.cardToken;
            StringBuilder d11 = C3660k.d("PaymentInfo(link=", str, ", orderNumber=", str2, ", payerEmail=");
            a.h(d11, str3, ", payerFirstName=", str4, ", payerLastName=");
            d11.append(str5);
            d11.append(", paymentTypeId=");
            d11.append(j11);
            d11.append(", totalPrice=");
            d11.append(bigDecimal);
            d11.append(", useNewPaymentForm=");
            d11.append(bool);
            return C6594f.a(", cardToken=", str6, ")", d11);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$StatusProvider;", "", "image", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "deliveryName", "status", "Lru/ozon/uni/atoms/data/badge/Badge;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;)V", "getImage", "()Ljava/lang/String;", "getTitle", "getDeliveryName", "getStatus", "()Lru/ozon/uni/atoms/data/badge/Badge;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StatusProvider {
        public static final int $stable = Badge.$stable;

        @NotNull
        private final String deliveryName;
        private final String image;

        @NotNull
        private final Badge status;

        @NotNull
        private final String title;

        public StatusProvider(String str, @NotNull String title, @NotNull String deliveryName, @NotNull Badge status) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deliveryName, "deliveryName");
            Intrinsics.checkNotNullParameter(status, "status");
            this.image = str;
            this.title = title;
            this.deliveryName = deliveryName;
            this.status = status;
        }

        public static /* synthetic */ StatusProvider copy$default(StatusProvider statusProvider, String str, String str2, String str3, Badge badge, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = statusProvider.image;
            }
            if ((i11 & 2) != 0) {
                str2 = statusProvider.title;
            }
            if ((i11 & 4) != 0) {
                str3 = statusProvider.deliveryName;
            }
            if ((i11 & 8) != 0) {
                badge = statusProvider.status;
            }
            return statusProvider.copy(str, str2, str3, badge);
        }

        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getDeliveryName() {
            return this.deliveryName;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Badge getStatus() {
            return this.status;
        }

        @NotNull
        public final StatusProvider copy(String image, @NotNull String title, @NotNull String deliveryName, @NotNull Badge status) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deliveryName, "deliveryName");
            Intrinsics.checkNotNullParameter(status, "status");
            return new StatusProvider(image, title, deliveryName, status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatusProvider)) {
                return false;
            }
            StatusProvider statusProvider = (StatusProvider) other;
            return Intrinsics.d(this.image, statusProvider.image) && Intrinsics.d(this.title, statusProvider.title) && Intrinsics.d(this.deliveryName, statusProvider.deliveryName) && Intrinsics.d(this.status, statusProvider.status);
        }

        @NotNull
        public final String getDeliveryName() {
            return this.deliveryName;
        }

        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final Badge getStatus() {
            return this.status;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.image;
            return this.status.hashCode() + g.a(g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.deliveryName);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String str2 = this.title;
            String str3 = this.deliveryName;
            Badge badge = this.status;
            StringBuilder d11 = C3660k.d("StatusProvider(image=", str, ", title=", str2, ", deliveryName=");
            d11.append(str3);
            d11.append(", status=");
            d11.append(badge);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$Timer;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "timeLeft", "", "<init>", "(Ljava/lang/String;I)V", "getTitle", "()Ljava/lang/String;", "getTimeLeft", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Timer {
        public static final int $stable = 0;
        private final int timeLeft;

        @NotNull
        private final String title;

        public Timer(@NotNull String title, int i11) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.timeLeft = i11;
        }

        public static /* synthetic */ Timer copy$default(Timer timer, String str, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = timer.title;
            }
            if ((i12 & 2) != 0) {
                i11 = timer.timeLeft;
            }
            return timer.copy(str, i11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTimeLeft() {
            return this.timeLeft;
        }

        @NotNull
        public final Timer copy(@NotNull String title, int timeLeft) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Timer(title, timeLeft);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Timer)) {
                return false;
            }
            Timer timer = (Timer) other;
            return Intrinsics.d(this.title, timer.title) && this.timeLeft == timer.timeLeft;
        }

        public final int getTimeLeft() {
            return this.timeLeft;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Integer.hashCode(this.timeLeft) + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2618u.f(this.timeLeft, "Timer(title=", this.title, ", timeLeft=", ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SectionDTO(String str, List<ButtonV3Atom.SmallButton> list, List<? extends AtomDTO> list2, PaymentInfo paymentInfo, StatusProvider statusProvider, List<Product> list3, Status status, Timer timer, TextDTO textDTO) {
        this.title = str;
        this.buttons = list;
        this.description = list2;
        this.paymentInfo = paymentInfo;
        this.statusProvider = statusProvider;
        this.products = list3;
        this.status = status;
        this.timer = timer;
        this.deliveryInfo = textDTO;
    }

    public static /* synthetic */ SectionDTO copy$default(SectionDTO sectionDTO, String str, List list, List list2, PaymentInfo paymentInfo, StatusProvider statusProvider, List list3, Status status, Timer timer, TextDTO textDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sectionDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = sectionDTO.buttons;
        }
        if ((i11 & 4) != 0) {
            list2 = sectionDTO.description;
        }
        if ((i11 & 8) != 0) {
            paymentInfo = sectionDTO.paymentInfo;
        }
        if ((i11 & 16) != 0) {
            statusProvider = sectionDTO.statusProvider;
        }
        if ((i11 & 32) != 0) {
            list3 = sectionDTO.products;
        }
        if ((i11 & 64) != 0) {
            status = sectionDTO.status;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            timer = sectionDTO.timer;
        }
        if ((i11 & 256) != 0) {
            textDTO = sectionDTO.deliveryInfo;
        }
        Timer timer2 = timer;
        TextDTO textDTO2 = textDTO;
        List list4 = list3;
        Status status2 = status;
        StatusProvider statusProvider2 = statusProvider;
        List list5 = list2;
        return sectionDTO.copy(str, list, list5, paymentInfo, statusProvider2, list4, status2, timer2, textDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<ButtonV3Atom.SmallButton> component2() {
        return this.buttons;
    }

    public final List<AtomDTO> component3() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final StatusProvider getStatusProvider() {
        return this.statusProvider;
    }

    public final List<Product> component6() {
        return this.products;
    }

    /* renamed from: component7, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component8, reason: from getter */
    public final Timer getTimer() {
        return this.timer;
    }

    /* renamed from: component9, reason: from getter */
    public final TextDTO getDeliveryInfo() {
        return this.deliveryInfo;
    }

    @NotNull
    public final SectionDTO copy(String title, List<ButtonV3Atom.SmallButton> buttons, List<? extends AtomDTO> description, PaymentInfo paymentInfo, StatusProvider statusProvider, List<Product> products, Status status, Timer timer, TextDTO deliveryInfo) {
        return new SectionDTO(title, buttons, description, paymentInfo, statusProvider, products, status, timer, deliveryInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SectionDTO)) {
            return false;
        }
        SectionDTO sectionDTO = (SectionDTO) other;
        return Intrinsics.d(this.title, sectionDTO.title) && Intrinsics.d(this.buttons, sectionDTO.buttons) && Intrinsics.d(this.description, sectionDTO.description) && Intrinsics.d(this.paymentInfo, sectionDTO.paymentInfo) && Intrinsics.d(this.statusProvider, sectionDTO.statusProvider) && Intrinsics.d(this.products, sectionDTO.products) && Intrinsics.d(this.status, sectionDTO.status) && Intrinsics.d(this.timer, sectionDTO.timer) && Intrinsics.d(this.deliveryInfo, sectionDTO.deliveryInfo);
    }

    public final List<ButtonV3Atom.SmallButton> getButtons() {
        return this.buttons;
    }

    public final TextDTO getDeliveryInfo() {
        return this.deliveryInfo;
    }

    public final List<AtomDTO> getDescription() {
        return this.description;
    }

    public final PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    public final List<Product> getProducts() {
        return this.products;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final StatusProvider getStatusProvider() {
        return this.statusProvider;
    }

    public final Timer getTimer() {
        return this.timer;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ButtonV3Atom.SmallButton> list = this.buttons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<AtomDTO> list2 = this.description;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        PaymentInfo paymentInfo = this.paymentInfo;
        int hashCode4 = (hashCode3 + (paymentInfo == null ? 0 : paymentInfo.hashCode())) * 31;
        StatusProvider statusProvider = this.statusProvider;
        int hashCode5 = (hashCode4 + (statusProvider == null ? 0 : statusProvider.hashCode())) * 31;
        List<Product> list3 = this.products;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Status status = this.status;
        int hashCode7 = (hashCode6 + (status == null ? 0 : status.hashCode())) * 31;
        Timer timer = this.timer;
        int hashCode8 = (hashCode7 + (timer == null ? 0 : timer.hashCode())) * 31;
        TextDTO textDTO = this.deliveryInfo;
        return hashCode8 + (textDTO != null ? textDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        List<ButtonV3Atom.SmallButton> list = this.buttons;
        List<AtomDTO> list2 = this.description;
        PaymentInfo paymentInfo = this.paymentInfo;
        StatusProvider statusProvider = this.statusProvider;
        List<Product> list3 = this.products;
        Status status = this.status;
        Timer timer = this.timer;
        TextDTO textDTO = this.deliveryInfo;
        StringBuilder f7 = b.f("SectionDTO(title=", str, ", buttons=", ", description=", list);
        f7.append(list2);
        f7.append(", paymentInfo=");
        f7.append(paymentInfo);
        f7.append(", statusProvider=");
        f7.append(statusProvider);
        f7.append(", products=");
        f7.append(list3);
        f7.append(", status=");
        f7.append(status);
        f7.append(", timer=");
        f7.append(timer);
        f7.append(", deliveryInfo=");
        return b.e(f7, textDTO, ")");
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$Product;", "", "image", "", "deeplink", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getImage", "()Ljava/lang/String;", "getDeeplink", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Product {
        public static final int $stable = 0;
        private final String deeplink;

        @NotNull
        private final String image;
        private final boolean isAdult;

        public Product(@NotNull String image, String str, boolean z11) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.deeplink = str;
            this.isAdult = z11;
        }

        public static /* synthetic */ Product copy$default(Product product, String str, String str2, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = product.image;
            }
            if ((i11 & 2) != 0) {
                str2 = product.deeplink;
            }
            if ((i11 & 4) != 0) {
                z11 = product.isAdult;
            }
            return product.copy(str, str2, z11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsAdult() {
            return this.isAdult;
        }

        @NotNull
        public final Product copy(@NotNull String image, String deeplink, boolean isAdult) {
            Intrinsics.checkNotNullParameter(image, "image");
            return new Product(image, deeplink, isAdult);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Product)) {
                return false;
            }
            Product product = (Product) other;
            return Intrinsics.d(this.image, product.image) && Intrinsics.d(this.deeplink, product.deeplink) && this.isAdult == product.isAdult;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            String str = this.deeplink;
            return Boolean.hashCode(this.isAdult) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final boolean isAdult() {
            return this.isAdult;
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String str2 = this.deeplink;
            return Pk0.a.a(")", C3660k.d("Product(image=", str, ", deeplink=", str2, ", isAdult="), this.isAdult);
        }

        public /* synthetic */ Product(String str, String str2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? false : z11);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$Status;", "", "color", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getColor", "()Ljava/lang/String;", "getName", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Status {
        public static final int $stable = 8;
        private final AtomActionDTO action;

        @NotNull
        private final String color;

        @NotNull
        private final String name;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Status(@NotNull String color, @NotNull String name, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(name, "name");
            this.color = color;
            this.name = name;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Status copy$default(Status status, String str, String str2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = status.color;
            }
            if ((i11 & 2) != 0) {
                str2 = status.name;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = status.action;
            }
            if ((i11 & 8) != 0) {
                map = status.trackingInfo;
            }
            return status.copy(str, str2, atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        @NotNull
        public final Status copy(@NotNull String color, @NotNull String name, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(name, "name");
            return new Status(color, name, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Status)) {
                return false;
            }
            Status status = (Status) other;
            return Intrinsics.d(this.color, status.color) && Intrinsics.d(this.name, status.name) && Intrinsics.d(this.action, status.action) && Intrinsics.d(this.trackingInfo, status.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = g.a(this.color.hashCode() * 31, 31, this.name);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.color;
            String str2 = this.name;
            return D40.a.d(C3660k.d("Status(color=", str, ", name=", str2, ", action="), this.action, ", trackingInfo=", this.trackingInfo, ")");
        }

        public /* synthetic */ Status(String str, String str2, AtomActionDTO atomActionDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, atomActionDTO, (i11 & 8) != 0 ? null : map);
        }
    }
}
