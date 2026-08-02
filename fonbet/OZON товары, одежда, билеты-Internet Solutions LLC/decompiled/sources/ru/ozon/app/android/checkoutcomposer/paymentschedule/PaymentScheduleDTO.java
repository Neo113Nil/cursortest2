package ru.ozon.app.android.checkoutcomposer.paymentschedule;

import Co.a;
import G.g;
import I1.w;
import N3.C3660k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002+,Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007HÆ\u0003Js\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016¨\u0006-"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleDTO;", "", "icon", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "payments", "", "Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleDTO$PaymentDTO;", "totalAmount", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "totalTitle", "totalSubtitle", "totalPrices", "Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleDTO$TotalPriceDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getIcon", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getPayments", "()Ljava/util/List;", "getTotalAmount", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTotalTitle", "getTotalSubtitle", "getTotalPrices", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentDTO", "TotalPriceDTO", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PaymentScheduleDTO {
    public static final int $stable = 8;
    private final String icon;

    @NotNull
    private final List<PaymentDTO> payments;
    private final String subtitle;
    private final String title;
    private final OzonSpannableString totalAmount;
    private final List<TotalPriceDTO> totalPrices;
    private final String totalSubtitle;
    private final String totalTitle;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleDTO$PaymentDTO;", "", "amount", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "date", "", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;)V", "getAmount", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getDate", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaymentDTO {
        public static final int $stable = OzonSpannableString.$stable;

        @NotNull
        private final OzonSpannableString amount;

        @NotNull
        private final String date;

        public PaymentDTO(@NotNull OzonSpannableString amount, @NotNull String date) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(date, "date");
            this.amount = amount;
            this.date = date;
        }

        public static /* synthetic */ PaymentDTO copy$default(PaymentDTO paymentDTO, OzonSpannableString ozonSpannableString, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = paymentDTO.amount;
            }
            if ((i11 & 2) != 0) {
                str = paymentDTO.date;
            }
            return paymentDTO.copy(ozonSpannableString, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getAmount() {
            return this.amount;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        @NotNull
        public final PaymentDTO copy(@NotNull OzonSpannableString amount, @NotNull String date) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(date, "date");
            return new PaymentDTO(amount, date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentDTO)) {
                return false;
            }
            PaymentDTO paymentDTO = (PaymentDTO) other;
            return Intrinsics.d(this.amount, paymentDTO.amount) && Intrinsics.d(this.date, paymentDTO.date);
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
            return this.date.hashCode() + (this.amount.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.amount;
            return "PaymentDTO(amount=" + ((Object) ozonSpannableString) + ", date=" + this.date + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleDTO$TotalPriceDTO;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "amount", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAmount", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TotalPriceDTO {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final TextAtom amount;

        @NotNull
        private final TextAtom text;

        public TotalPriceDTO(@NotNull TextAtom text, @NotNull TextAtom amount) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.text = text;
            this.amount = amount;
        }

        public static /* synthetic */ TotalPriceDTO copy$default(TotalPriceDTO totalPriceDTO, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = totalPriceDTO.text;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = totalPriceDTO.amount;
            }
            return totalPriceDTO.copy(textAtom, textAtom2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getAmount() {
            return this.amount;
        }

        @NotNull
        public final TotalPriceDTO copy(@NotNull TextAtom text, @NotNull TextAtom amount) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(amount, "amount");
            return new TotalPriceDTO(text, amount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TotalPriceDTO)) {
                return false;
            }
            TotalPriceDTO totalPriceDTO = (TotalPriceDTO) other;
            return Intrinsics.d(this.text, totalPriceDTO.text) && Intrinsics.d(this.amount, totalPriceDTO.amount);
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
            return a.a("TotalPriceDTO(text=", this.text, ", amount=", this.amount, ")");
        }
    }

    public PaymentScheduleDTO(String str, String str2, String str3, @NotNull List<PaymentDTO> payments, OzonSpannableString ozonSpannableString, String str4, String str5, List<TotalPriceDTO> list) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        this.icon = str;
        this.title = str2;
        this.subtitle = str3;
        this.payments = payments;
        this.totalAmount = ozonSpannableString;
        this.totalTitle = str4;
        this.totalSubtitle = str5;
        this.totalPrices = list;
    }

    public static /* synthetic */ PaymentScheduleDTO copy$default(PaymentScheduleDTO paymentScheduleDTO, String str, String str2, String str3, List list, OzonSpannableString ozonSpannableString, String str4, String str5, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = paymentScheduleDTO.icon;
        }
        if ((i11 & 2) != 0) {
            str2 = paymentScheduleDTO.title;
        }
        if ((i11 & 4) != 0) {
            str3 = paymentScheduleDTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            list = paymentScheduleDTO.payments;
        }
        if ((i11 & 16) != 0) {
            ozonSpannableString = paymentScheduleDTO.totalAmount;
        }
        if ((i11 & 32) != 0) {
            str4 = paymentScheduleDTO.totalTitle;
        }
        if ((i11 & 64) != 0) {
            str5 = paymentScheduleDTO.totalSubtitle;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            list2 = paymentScheduleDTO.totalPrices;
        }
        String str6 = str5;
        List list3 = list2;
        OzonSpannableString ozonSpannableString2 = ozonSpannableString;
        String str7 = str4;
        return paymentScheduleDTO.copy(str, str2, str3, list, ozonSpannableString2, str7, str6, list3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<PaymentDTO> component4() {
        return this.payments;
    }

    /* renamed from: component5, reason: from getter */
    public final OzonSpannableString getTotalAmount() {
        return this.totalAmount;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTotalTitle() {
        return this.totalTitle;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTotalSubtitle() {
        return this.totalSubtitle;
    }

    public final List<TotalPriceDTO> component8() {
        return this.totalPrices;
    }

    @NotNull
    public final PaymentScheduleDTO copy(String icon, String title, String subtitle, @NotNull List<PaymentDTO> payments, OzonSpannableString totalAmount, String totalTitle, String totalSubtitle, List<TotalPriceDTO> totalPrices) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        return new PaymentScheduleDTO(icon, title, subtitle, payments, totalAmount, totalTitle, totalSubtitle, totalPrices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentScheduleDTO)) {
            return false;
        }
        PaymentScheduleDTO paymentScheduleDTO = (PaymentScheduleDTO) other;
        return Intrinsics.d(this.icon, paymentScheduleDTO.icon) && Intrinsics.d(this.title, paymentScheduleDTO.title) && Intrinsics.d(this.subtitle, paymentScheduleDTO.subtitle) && Intrinsics.d(this.payments, paymentScheduleDTO.payments) && Intrinsics.d(this.totalAmount, paymentScheduleDTO.totalAmount) && Intrinsics.d(this.totalTitle, paymentScheduleDTO.totalTitle) && Intrinsics.d(this.totalSubtitle, paymentScheduleDTO.totalSubtitle) && Intrinsics.d(this.totalPrices, paymentScheduleDTO.totalPrices);
    }

    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final List<PaymentDTO> getPayments() {
        return this.payments;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final OzonSpannableString getTotalAmount() {
        return this.totalAmount;
    }

    public final List<TotalPriceDTO> getTotalPrices() {
        return this.totalPrices;
    }

    public final String getTotalSubtitle() {
        return this.totalSubtitle;
    }

    public final String getTotalTitle() {
        return this.totalTitle;
    }

    public int hashCode() {
        String str = this.icon;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int b11 = g.b((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.payments);
        OzonSpannableString ozonSpannableString = this.totalAmount;
        int hashCode3 = (b11 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
        String str4 = this.totalTitle;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.totalSubtitle;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<TotalPriceDTO> list = this.totalPrices;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.icon;
        String str2 = this.title;
        String str3 = this.subtitle;
        List<PaymentDTO> list = this.payments;
        OzonSpannableString ozonSpannableString = this.totalAmount;
        String str4 = this.totalTitle;
        String str5 = this.totalSubtitle;
        List<TotalPriceDTO> list2 = this.totalPrices;
        StringBuilder d11 = C3660k.d("PaymentScheduleDTO(icon=", str, ", title=", str2, ", subtitle=");
        w.d(str3, ", payments=", ", totalAmount=", d11, list);
        HY.a.c(", totalTitle=", str4, ", totalSubtitle=", d11, ozonSpannableString);
        d11.append(str5);
        d11.append(", totalPrices=");
        d11.append(list2);
        d11.append(")");
        return d11.toString();
    }
}
