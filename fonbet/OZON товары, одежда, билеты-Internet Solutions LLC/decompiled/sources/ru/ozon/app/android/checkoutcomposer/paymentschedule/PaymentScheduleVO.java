package ru.ozon.app.android.checkoutcomposer.paymentschedule;

import Ak.C2436a;
import Co.a;
import D3.h;
import G.g;
import N3.C3660k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001*BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b!\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\"\u0010\u0013R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b)\u0010%¨\u0006+"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "icon", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO$PaymentItem$Payment;", "payments", "Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO$PaymentItem$PaymentTotal;", "paymentTotal", "Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO$PaymentItem$TotalPrice;", "totalPrices", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO$PaymentItem$PaymentTotal;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getIcon", "getTitle", "getSubtitle", "Ljava/util/List;", "getPayments", "()Ljava/util/List;", "Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO$PaymentItem$PaymentTotal;", "getPaymentTotal", "()Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO$PaymentItem$PaymentTotal;", "getTotalPrices", "PaymentItem", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PaymentScheduleVO implements c {
    private final String icon;
    private final long id;

    @NotNull
    private final PaymentItem.PaymentTotal paymentTotal;

    @NotNull
    private final List<PaymentItem.Payment> payments;
    private final String subtitle;
    private final String title;

    @NotNull
    private final List<PaymentItem.TotalPrice> totalPrices;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO$PaymentItem;", "", "<init>", "()V", "Payment", "PaymentTotal", "TotalPrice", "Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO$PaymentItem$Payment;", "Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO$PaymentItem$PaymentTotal;", "Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO$PaymentItem$TotalPrice;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class PaymentItem {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO$PaymentItem$Payment;", "Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO$PaymentItem;", "", "date", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "amount", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDate", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getAmount", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Payment extends PaymentItem {
            public static final int $stable = OzonSpannableString.$stable;

            @NotNull
            private final OzonSpannableString amount;

            @NotNull
            private final String date;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Payment(@NotNull String date, @NotNull OzonSpannableString amount) {
                super(null);
                Intrinsics.checkNotNullParameter(date, "date");
                Intrinsics.checkNotNullParameter(amount, "amount");
                this.date = date;
                this.amount = amount;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Payment)) {
                    return false;
                }
                Payment payment = (Payment) other;
                return Intrinsics.d(this.date, payment.date) && Intrinsics.d(this.amount, payment.amount);
            }

            @NotNull
            public final OzonSpannableString getAmount() {
                return this.amount;
            }

            @NotNull
            public final String getDate() {
                return this.date;
            }

            public int hashCode() {
                return this.amount.hashCode() + (this.date.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Payment(date=" + this.date + ", amount=" + ((Object) this.amount) + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO$PaymentItem$PaymentTotal;", "Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO$PaymentItem;", "", "totalTitle", "totalSubtitle", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "totalAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTotalTitle", "getTotalSubtitle", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTotalAmount", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PaymentTotal extends PaymentItem {
            public static final int $stable = OzonSpannableString.$stable;
            private final OzonSpannableString totalAmount;
            private final String totalSubtitle;
            private final String totalTitle;

            public PaymentTotal(String str, String str2, OzonSpannableString ozonSpannableString) {
                super(null);
                this.totalTitle = str;
                this.totalSubtitle = str2;
                this.totalAmount = ozonSpannableString;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PaymentTotal)) {
                    return false;
                }
                PaymentTotal paymentTotal = (PaymentTotal) other;
                return Intrinsics.d(this.totalTitle, paymentTotal.totalTitle) && Intrinsics.d(this.totalSubtitle, paymentTotal.totalSubtitle) && Intrinsics.d(this.totalAmount, paymentTotal.totalAmount);
            }

            public final OzonSpannableString getTotalAmount() {
                return this.totalAmount;
            }

            public final String getTotalSubtitle() {
                return this.totalSubtitle;
            }

            public final String getTotalTitle() {
                return this.totalTitle;
            }

            public int hashCode() {
                String str = this.totalTitle;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.totalSubtitle;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                OzonSpannableString ozonSpannableString = this.totalAmount;
                return hashCode2 + (ozonSpannableString != null ? ozonSpannableString.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.totalTitle;
                String str2 = this.totalSubtitle;
                OzonSpannableString ozonSpannableString = this.totalAmount;
                StringBuilder d11 = C3660k.d("PaymentTotal(totalTitle=", str, ", totalSubtitle=", str2, ", totalAmount=");
                d11.append((Object) ozonSpannableString);
                d11.append(")");
                return d11.toString();
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO$PaymentItem$TotalPrice;", "Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO$PaymentItem;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "amount", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAmount", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TotalPrice extends PaymentItem {
            public static final int $stable = TextAtom.$stable;

            @NotNull
            private final TextAtom amount;

            @NotNull
            private final TextAtom text;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TotalPrice(@NotNull TextAtom text, @NotNull TextAtom amount) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(amount, "amount");
                this.text = text;
                this.amount = amount;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TotalPrice)) {
                    return false;
                }
                TotalPrice totalPrice = (TotalPrice) other;
                return Intrinsics.d(this.text, totalPrice.text) && Intrinsics.d(this.amount, totalPrice.amount);
            }

            @NotNull
            public final TextAtom getAmount() {
                return this.amount;
            }

            @NotNull
            public final TextAtom getText() {
                return this.text;
            }

            public int hashCode() {
                return this.amount.hashCode() + (this.text.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return a.a("TotalPrice(text=", this.text, ", amount=", this.amount, ")");
            }
        }

        public /* synthetic */ PaymentItem(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private PaymentItem() {
        }
    }

    public PaymentScheduleVO(long j11, String str, String str2, String str3, @NotNull List<PaymentItem.Payment> payments, @NotNull PaymentItem.PaymentTotal paymentTotal, @NotNull List<PaymentItem.TotalPrice> totalPrices) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(paymentTotal, "paymentTotal");
        Intrinsics.checkNotNullParameter(totalPrices, "totalPrices");
        this.id = j11;
        this.icon = str;
        this.title = str2;
        this.subtitle = str3;
        this.payments = payments;
        this.paymentTotal = paymentTotal;
        this.totalPrices = totalPrices;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentScheduleVO)) {
            return false;
        }
        PaymentScheduleVO paymentScheduleVO = (PaymentScheduleVO) other;
        return this.id == paymentScheduleVO.id && Intrinsics.d(this.icon, paymentScheduleVO.icon) && Intrinsics.d(this.title, paymentScheduleVO.title) && Intrinsics.d(this.subtitle, paymentScheduleVO.subtitle) && Intrinsics.d(this.payments, paymentScheduleVO.payments) && Intrinsics.d(this.paymentTotal, paymentScheduleVO.paymentTotal) && Intrinsics.d(this.totalPrices, paymentScheduleVO.totalPrices);
    }

    public final String getIcon() {
        return this.icon;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final PaymentItem.PaymentTotal getPaymentTotal() {
        return this.paymentTotal;
    }

    @NotNull
    public final List<PaymentItem.Payment> getPayments() {
        return this.payments;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<PaymentItem.TotalPrice> getTotalPrices() {
        return this.totalPrices;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.icon;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        return this.totalPrices.hashCode() + ((this.paymentTotal.hashCode() + g.b((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.payments)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.icon;
        String str2 = this.title;
        String str3 = this.subtitle;
        List<PaymentItem.Payment> list = this.payments;
        PaymentItem.PaymentTotal paymentTotal = this.paymentTotal;
        List<PaymentItem.TotalPrice> list2 = this.totalPrices;
        StringBuilder c11 = C2436a.c(j11, "PaymentScheduleVO(id=", ", icon=", str);
        Nh.a.h(c11, ", title=", str2, ", subtitle=", str3);
        c11.append(", payments=");
        c11.append(list);
        c11.append(", paymentTotal=");
        c11.append(paymentTotal);
        return h.c(c11, ", totalPrices=", list2, ")");
    }
}
