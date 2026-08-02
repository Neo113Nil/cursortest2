package ru.ozon.app.android.fresh.unsorted.widgets.installmentPaymentSchedule.data;

import C.o0;
import D3.g;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003Jf\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/installmentPaymentSchedule/data/FreshPaymentScheduleDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "payments", "", "Lru/ozon/app/android/fresh/unsorted/widgets/installmentPaymentSchedule/data/FreshPaymentScheduleDTO$PaymentDTO;", "description", "showPaymentsAnimation", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getPayments", "()Ljava/util/List;", "getDescription", "getShowPaymentsAnimation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/app/android/fresh/unsorted/widgets/installmentPaymentSchedule/data/FreshPaymentScheduleDTO;", "equals", "other", "hashCode", "", "toString", "PaymentDTO", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FreshPaymentScheduleDTO {
    public static final int $stable = 8;
    private final TextDTO description;

    @NotNull
    private final List<PaymentDTO> payments;
    private final Boolean showPaymentsAnimation;
    private final TextDTO subtitle;
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/installmentPaymentSchedule/data/FreshPaymentScheduleDTO$PaymentDTO;", "", "amount", "Lru/ozon/uni/atoms/data/text/TextDTO;", "date", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "getAmount", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDate", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaymentDTO {
        public static final int $stable = 0;

        @NotNull
        private final TextDTO amount;
        private final String backgroundColor;

        @NotNull
        private final TextDTO date;

        public PaymentDTO(@NotNull TextDTO amount, @NotNull TextDTO date, String str) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(date, "date");
            this.amount = amount;
            this.date = date;
            this.backgroundColor = str;
        }

        public static /* synthetic */ PaymentDTO copy$default(PaymentDTO paymentDTO, TextDTO textDTO, TextDTO textDTO2, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = paymentDTO.amount;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = paymentDTO.date;
            }
            if ((i11 & 4) != 0) {
                str = paymentDTO.backgroundColor;
            }
            return paymentDTO.copy(textDTO, textDTO2, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getAmount() {
            return this.amount;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getDate() {
            return this.date;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final PaymentDTO copy(@NotNull TextDTO amount, @NotNull TextDTO date, String backgroundColor) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(date, "date");
            return new PaymentDTO(amount, date, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentDTO)) {
                return false;
            }
            PaymentDTO paymentDTO = (PaymentDTO) other;
            return Intrinsics.d(this.amount, paymentDTO.amount) && Intrinsics.d(this.date, paymentDTO.date) && Intrinsics.d(this.backgroundColor, paymentDTO.backgroundColor);
        }

        @NotNull
        public final TextDTO getAmount() {
            return this.amount;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final TextDTO getDate() {
            return this.date;
        }

        public int hashCode() {
            int a11 = b.a(this.date, this.amount.hashCode() * 31, 31);
            String str = this.backgroundColor;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.amount;
            TextDTO textDTO2 = this.date;
            return o0.c(g.g("PaymentDTO(amount=", textDTO, ", date=", textDTO2, ", backgroundColor="), this.backgroundColor, ")");
        }
    }

    public FreshPaymentScheduleDTO(TextDTO textDTO, TextDTO textDTO2, @NotNull List<PaymentDTO> payments, TextDTO textDTO3, Boolean bool, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.payments = payments;
        this.description = textDTO3;
        this.showPaymentsAnimation = bool;
        this.trackingInfo = map;
    }

    public static /* synthetic */ FreshPaymentScheduleDTO copy$default(FreshPaymentScheduleDTO freshPaymentScheduleDTO, TextDTO textDTO, TextDTO textDTO2, List list, TextDTO textDTO3, Boolean bool, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = freshPaymentScheduleDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = freshPaymentScheduleDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            list = freshPaymentScheduleDTO.payments;
        }
        if ((i11 & 8) != 0) {
            textDTO3 = freshPaymentScheduleDTO.description;
        }
        if ((i11 & 16) != 0) {
            bool = freshPaymentScheduleDTO.showPaymentsAnimation;
        }
        if ((i11 & 32) != 0) {
            map = freshPaymentScheduleDTO.trackingInfo;
        }
        Boolean bool2 = bool;
        Map map2 = map;
        return freshPaymentScheduleDTO.copy(textDTO, textDTO2, list, textDTO3, bool2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<PaymentDTO> component3() {
        return this.payments;
    }

    /* renamed from: component4, reason: from getter */
    public final TextDTO getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getShowPaymentsAnimation() {
        return this.showPaymentsAnimation;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final FreshPaymentScheduleDTO copy(TextDTO title, TextDTO subtitle, @NotNull List<PaymentDTO> payments, TextDTO description, Boolean showPaymentsAnimation, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        return new FreshPaymentScheduleDTO(title, subtitle, payments, description, showPaymentsAnimation, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreshPaymentScheduleDTO)) {
            return false;
        }
        FreshPaymentScheduleDTO freshPaymentScheduleDTO = (FreshPaymentScheduleDTO) other;
        return Intrinsics.d(this.title, freshPaymentScheduleDTO.title) && Intrinsics.d(this.subtitle, freshPaymentScheduleDTO.subtitle) && Intrinsics.d(this.payments, freshPaymentScheduleDTO.payments) && Intrinsics.d(this.description, freshPaymentScheduleDTO.description) && Intrinsics.d(this.showPaymentsAnimation, freshPaymentScheduleDTO.showPaymentsAnimation) && Intrinsics.d(this.trackingInfo, freshPaymentScheduleDTO.trackingInfo);
    }

    public final TextDTO getDescription() {
        return this.description;
    }

    @NotNull
    public final List<PaymentDTO> getPayments() {
        return this.payments;
    }

    public final Boolean getShowPaymentsAnimation() {
        return this.showPaymentsAnimation;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        TextDTO textDTO2 = this.subtitle;
        int b11 = G.g.b((hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31, 31, this.payments);
        TextDTO textDTO3 = this.description;
        int hashCode2 = (b11 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31;
        Boolean bool = this.showPaymentsAnimation;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        List<PaymentDTO> list = this.payments;
        TextDTO textDTO3 = this.description;
        Boolean bool = this.showPaymentsAnimation;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = g.g("FreshPaymentScheduleDTO(title=", textDTO, ", subtitle=", textDTO2, ", payments=");
        g10.append(list);
        g10.append(", description=");
        g10.append(textDTO3);
        g10.append(", showPaymentsAnimation=");
        g10.append(bool);
        g10.append(", trackingInfo=");
        g10.append(map);
        g10.append(")");
        return g10.toString();
    }
}
