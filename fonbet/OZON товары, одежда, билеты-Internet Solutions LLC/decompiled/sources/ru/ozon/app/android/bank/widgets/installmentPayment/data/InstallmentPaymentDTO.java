package ru.ozon.app.android.bank.widgets.installmentPayment.data;

import B90.C2619v;
import C.o0;
import G.g;
import HY.a;
import Ve.C4636t5;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u000267B\u0081\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0097\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00068"}, d2 = {"Lru/ozon/app/android/bank/widgets/installmentPayment/data/InstallmentPaymentDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "payments", "", "Lru/ozon/app/android/bank/widgets/installmentPayment/data/InstallmentPaymentDTO$PaymentDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "titleGrace", "subtitleGrace", "paymentsGrace", "paymentsSwitch", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "paymentsGraceSwitch", "iconTitle", "Lru/ozon/app/android/bank/widgets/installmentPayment/data/InstallmentPaymentDTO$IconTitleDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/util/Map;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;Lru/ozon/app/android/bank/widgets/installmentPayment/data/InstallmentPaymentDTO$IconTitleDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getPayments", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "getTitleGrace", "getSubtitleGrace", "getPaymentsGrace", "getPaymentsSwitch", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "getPaymentsGraceSwitch", "getIconTitle", "()Lru/ozon/app/android/bank/widgets/installmentPayment/data/InstallmentPaymentDTO$IconTitleDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "IconTitleDTO", "PaymentDTO", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InstallmentPaymentDTO {
    private final IconTitleDTO iconTitle;

    @NotNull
    private final List<PaymentDTO> payments;
    private final List<PaymentDTO> paymentsGrace;
    private final ButtonV3Atom.SmallBorderlessButtonWithIcon paymentsGraceSwitch;
    private final ButtonV3Atom.SmallBorderlessButtonWithIcon paymentsSwitch;
    private final TextAtom subtitle;
    private final TextAtom subtitleGrace;
    private final TextAtom title;
    private final TextAtom titleGrace;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/bank/widgets/installmentPayment/data/InstallmentPaymentDTO$PaymentDTO;", "", "amount", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "date", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)V", "getAmount", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDate", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaymentDTO {

        @NotNull
        private final TextAtom amount;

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final TextAtom date;

        public PaymentDTO(@NotNull TextAtom amount, @NotNull TextAtom date, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.amount = amount;
            this.date = date;
            this.backgroundColor = backgroundColor;
        }

        public static /* synthetic */ PaymentDTO copy$default(PaymentDTO paymentDTO, TextAtom textAtom, TextAtom textAtom2, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = paymentDTO.amount;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = paymentDTO.date;
            }
            if ((i11 & 4) != 0) {
                str = paymentDTO.backgroundColor;
            }
            return paymentDTO.copy(textAtom, textAtom2, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getAmount() {
            return this.amount;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getDate() {
            return this.date;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final PaymentDTO copy(@NotNull TextAtom amount, @NotNull TextAtom date, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
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
        public final TextAtom getAmount() {
            return this.amount;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final TextAtom getDate() {
            return this.date;
        }

        public int hashCode() {
            return this.backgroundColor.hashCode() + C2619v.b(this.amount.hashCode() * 31, 31, this.date);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.amount;
            TextAtom textAtom2 = this.date;
            return o0.c(a.a("PaymentDTO(amount=", textAtom, ", date=", textAtom2, ", backgroundColor="), this.backgroundColor, ")");
        }
    }

    public InstallmentPaymentDTO(TextAtom textAtom, TextAtom textAtom2, @NotNull List<PaymentDTO> payments, Map<String, TokenizedTrackingInfo> map, TextAtom textAtom3, TextAtom textAtom4, List<PaymentDTO> list, ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon, ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon2, IconTitleDTO iconTitleDTO) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        this.title = textAtom;
        this.subtitle = textAtom2;
        this.payments = payments;
        this.trackingInfo = map;
        this.titleGrace = textAtom3;
        this.subtitleGrace = textAtom4;
        this.paymentsGrace = list;
        this.paymentsSwitch = smallBorderlessButtonWithIcon;
        this.paymentsGraceSwitch = smallBorderlessButtonWithIcon2;
        this.iconTitle = iconTitleDTO;
    }

    public static /* synthetic */ InstallmentPaymentDTO copy$default(InstallmentPaymentDTO installmentPaymentDTO, TextAtom textAtom, TextAtom textAtom2, List list, Map map, TextAtom textAtom3, TextAtom textAtom4, List list2, ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon, ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon2, IconTitleDTO iconTitleDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = installmentPaymentDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = installmentPaymentDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            list = installmentPaymentDTO.payments;
        }
        if ((i11 & 8) != 0) {
            map = installmentPaymentDTO.trackingInfo;
        }
        if ((i11 & 16) != 0) {
            textAtom3 = installmentPaymentDTO.titleGrace;
        }
        if ((i11 & 32) != 0) {
            textAtom4 = installmentPaymentDTO.subtitleGrace;
        }
        if ((i11 & 64) != 0) {
            list2 = installmentPaymentDTO.paymentsGrace;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            smallBorderlessButtonWithIcon = installmentPaymentDTO.paymentsSwitch;
        }
        if ((i11 & 256) != 0) {
            smallBorderlessButtonWithIcon2 = installmentPaymentDTO.paymentsGraceSwitch;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            iconTitleDTO = installmentPaymentDTO.iconTitle;
        }
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon3 = smallBorderlessButtonWithIcon2;
        IconTitleDTO iconTitleDTO2 = iconTitleDTO;
        List list3 = list2;
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon4 = smallBorderlessButtonWithIcon;
        TextAtom textAtom5 = textAtom3;
        TextAtom textAtom6 = textAtom4;
        return installmentPaymentDTO.copy(textAtom, textAtom2, list, map, textAtom5, textAtom6, list3, smallBorderlessButtonWithIcon4, smallBorderlessButtonWithIcon3, iconTitleDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final IconTitleDTO getIconTitle() {
        return this.iconTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<PaymentDTO> component3() {
        return this.payments;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final TextAtom getTitleGrace() {
        return this.titleGrace;
    }

    /* renamed from: component6, reason: from getter */
    public final TextAtom getSubtitleGrace() {
        return this.subtitleGrace;
    }

    public final List<PaymentDTO> component7() {
        return this.paymentsGrace;
    }

    /* renamed from: component8, reason: from getter */
    public final ButtonV3Atom.SmallBorderlessButtonWithIcon getPaymentsSwitch() {
        return this.paymentsSwitch;
    }

    /* renamed from: component9, reason: from getter */
    public final ButtonV3Atom.SmallBorderlessButtonWithIcon getPaymentsGraceSwitch() {
        return this.paymentsGraceSwitch;
    }

    @NotNull
    public final InstallmentPaymentDTO copy(TextAtom title, TextAtom subtitle, @NotNull List<PaymentDTO> payments, Map<String, TokenizedTrackingInfo> trackingInfo, TextAtom titleGrace, TextAtom subtitleGrace, List<PaymentDTO> paymentsGrace, ButtonV3Atom.SmallBorderlessButtonWithIcon paymentsSwitch, ButtonV3Atom.SmallBorderlessButtonWithIcon paymentsGraceSwitch, IconTitleDTO iconTitle) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        return new InstallmentPaymentDTO(title, subtitle, payments, trackingInfo, titleGrace, subtitleGrace, paymentsGrace, paymentsSwitch, paymentsGraceSwitch, iconTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallmentPaymentDTO)) {
            return false;
        }
        InstallmentPaymentDTO installmentPaymentDTO = (InstallmentPaymentDTO) other;
        return Intrinsics.d(this.title, installmentPaymentDTO.title) && Intrinsics.d(this.subtitle, installmentPaymentDTO.subtitle) && Intrinsics.d(this.payments, installmentPaymentDTO.payments) && Intrinsics.d(this.trackingInfo, installmentPaymentDTO.trackingInfo) && Intrinsics.d(this.titleGrace, installmentPaymentDTO.titleGrace) && Intrinsics.d(this.subtitleGrace, installmentPaymentDTO.subtitleGrace) && Intrinsics.d(this.paymentsGrace, installmentPaymentDTO.paymentsGrace) && Intrinsics.d(this.paymentsSwitch, installmentPaymentDTO.paymentsSwitch) && Intrinsics.d(this.paymentsGraceSwitch, installmentPaymentDTO.paymentsGraceSwitch) && Intrinsics.d(this.iconTitle, installmentPaymentDTO.iconTitle);
    }

    public final IconTitleDTO getIconTitle() {
        return this.iconTitle;
    }

    @NotNull
    public final List<PaymentDTO> getPayments() {
        return this.payments;
    }

    public final List<PaymentDTO> getPaymentsGrace() {
        return this.paymentsGrace;
    }

    public final ButtonV3Atom.SmallBorderlessButtonWithIcon getPaymentsGraceSwitch() {
        return this.paymentsGraceSwitch;
    }

    public final ButtonV3Atom.SmallBorderlessButtonWithIcon getPaymentsSwitch() {
        return this.paymentsSwitch;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final TextAtom getSubtitleGrace() {
        return this.subtitleGrace;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final TextAtom getTitleGrace() {
        return this.titleGrace;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextAtom textAtom = this.title;
        int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
        TextAtom textAtom2 = this.subtitle;
        int b11 = g.b((hashCode + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31, 31, this.payments);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (b11 + (map == null ? 0 : map.hashCode())) * 31;
        TextAtom textAtom3 = this.titleGrace;
        int hashCode3 = (hashCode2 + (textAtom3 == null ? 0 : textAtom3.hashCode())) * 31;
        TextAtom textAtom4 = this.subtitleGrace;
        int hashCode4 = (hashCode3 + (textAtom4 == null ? 0 : textAtom4.hashCode())) * 31;
        List<PaymentDTO> list = this.paymentsGrace;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon = this.paymentsSwitch;
        int hashCode6 = (hashCode5 + (smallBorderlessButtonWithIcon == null ? 0 : smallBorderlessButtonWithIcon.hashCode())) * 31;
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon2 = this.paymentsGraceSwitch;
        int hashCode7 = (hashCode6 + (smallBorderlessButtonWithIcon2 == null ? 0 : smallBorderlessButtonWithIcon2.hashCode())) * 31;
        IconTitleDTO iconTitleDTO = this.iconTitle;
        return hashCode7 + (iconTitleDTO != null ? iconTitleDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        List<PaymentDTO> list = this.payments;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TextAtom textAtom3 = this.titleGrace;
        TextAtom textAtom4 = this.subtitleGrace;
        List<PaymentDTO> list2 = this.paymentsGrace;
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon = this.paymentsSwitch;
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon2 = this.paymentsGraceSwitch;
        IconTitleDTO iconTitleDTO = this.iconTitle;
        StringBuilder a11 = a.a("InstallmentPaymentDTO(title=", textAtom, ", subtitle=", textAtom2, ", payments=");
        a11.append(list);
        a11.append(", trackingInfo=");
        a11.append(map);
        a11.append(", titleGrace=");
        C4636t5.c(", subtitleGrace=", ", paymentsGrace=", a11, textAtom3, textAtom4);
        a11.append(list2);
        a11.append(", paymentsSwitch=");
        a11.append(smallBorderlessButtonWithIcon);
        a11.append(", paymentsGraceSwitch=");
        a11.append(smallBorderlessButtonWithIcon2);
        a11.append(", iconTitle=");
        a11.append(iconTitleDTO);
        a11.append(")");
        return a11.toString();
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/bank/widgets/installmentPayment/data/InstallmentPaymentDTO$IconTitleDTO;", "", "icon", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getIcon", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconTitleDTO {
        private final AtomActionDTO action;

        @NotNull
        private final String icon;

        public IconTitleDTO(@NotNull String icon, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.action = atomActionDTO;
        }

        public static /* synthetic */ IconTitleDTO copy$default(IconTitleDTO iconTitleDTO, String str, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = iconTitleDTO.icon;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = iconTitleDTO.action;
            }
            return iconTitleDTO.copy(str, atomActionDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final IconTitleDTO copy(@NotNull String icon, AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new IconTitleDTO(icon, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconTitleDTO)) {
                return false;
            }
            IconTitleDTO iconTitleDTO = (IconTitleDTO) other;
            return Intrinsics.d(this.icon, iconTitleDTO.icon) && Intrinsics.d(this.action, iconTitleDTO.action);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            return hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "IconTitleDTO(icon=" + this.icon + ", action=" + this.action + ")";
        }

        public /* synthetic */ IconTitleDTO(String str, AtomActionDTO atomActionDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : atomActionDTO);
        }
    }
}
