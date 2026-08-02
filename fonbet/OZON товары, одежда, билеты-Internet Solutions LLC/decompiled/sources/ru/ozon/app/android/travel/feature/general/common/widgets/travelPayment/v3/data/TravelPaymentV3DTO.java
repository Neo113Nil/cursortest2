package ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.data;

import G.g;
import Kk.C3532b;
import T7.P;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002-.BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jc\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/data/TravelPaymentV3DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "paymentMethods", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/data/TravelPaymentV3DTO$PaymentMethodDTO;", "annotation", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "optionsTitle", "paymentOptions", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "confirmButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "milesButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPaymentMethods", "()Ljava/util/List;", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getOptionsTitle", "getPaymentOptions", "getConfirmButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getMilesButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PaymentMethodDTO", "StyleType", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelPaymentV3DTO {
    public static final int $stable = 8;
    private final DisclaimerAtom annotation;
    private final ButtonV3Atom.LargeButton confirmButton;
    private final ButtonV3Atom.SmallBorderlessButton milesButton;
    private final TextAtom optionsTitle;

    @NotNull
    private final List<PaymentMethodDTO> paymentMethods;

    @NotNull
    private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> paymentOptions;

    @NotNull
    private final TextAtom title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/data/TravelPaymentV3DTO$StyleType;", "", "<init>", "(Ljava/lang/String;I)V", "STYLE_TYPE_DEFAULT", "STYLE_TYPE_CARD", "STYLE_TYPE_IMAGE", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StyleType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ StyleType[] $VALUES;
        public static final StyleType STYLE_TYPE_DEFAULT = new StyleType("STYLE_TYPE_DEFAULT", 0);
        public static final StyleType STYLE_TYPE_CARD = new StyleType("STYLE_TYPE_CARD", 1);
        public static final StyleType STYLE_TYPE_IMAGE = new StyleType("STYLE_TYPE_IMAGE", 2);

        private static final /* synthetic */ StyleType[] $values() {
            return new StyleType[]{STYLE_TYPE_DEFAULT, STYLE_TYPE_CARD, STYLE_TYPE_IMAGE};
        }

        static {
            StyleType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private StyleType(String str, int i11) {
        }

        public static StyleType valueOf(String str) {
            return (StyleType) Enum.valueOf(StyleType.class, str);
        }

        public static StyleType[] values() {
            return (StyleType[]) $VALUES.clone();
        }
    }

    public TravelPaymentV3DTO(@NotNull TextAtom title, @NotNull List<PaymentMethodDTO> paymentMethods, DisclaimerAtom disclaimerAtom, TextAtom textAtom, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> paymentOptions, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(paymentOptions, "paymentOptions");
        this.title = title;
        this.paymentMethods = paymentMethods;
        this.annotation = disclaimerAtom;
        this.optionsTitle = textAtom;
        this.paymentOptions = paymentOptions;
        this.confirmButton = largeButton;
        this.milesButton = smallBorderlessButton;
    }

    public static /* synthetic */ TravelPaymentV3DTO copy$default(TravelPaymentV3DTO travelPaymentV3DTO, TextAtom textAtom, List list, DisclaimerAtom disclaimerAtom, TextAtom textAtom2, List list2, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = travelPaymentV3DTO.title;
        }
        if ((i11 & 2) != 0) {
            list = travelPaymentV3DTO.paymentMethods;
        }
        if ((i11 & 4) != 0) {
            disclaimerAtom = travelPaymentV3DTO.annotation;
        }
        if ((i11 & 8) != 0) {
            textAtom2 = travelPaymentV3DTO.optionsTitle;
        }
        if ((i11 & 16) != 0) {
            list2 = travelPaymentV3DTO.paymentOptions;
        }
        if ((i11 & 32) != 0) {
            largeButton = travelPaymentV3DTO.confirmButton;
        }
        if ((i11 & 64) != 0) {
            smallBorderlessButton = travelPaymentV3DTO.milesButton;
        }
        ButtonV3Atom.LargeButton largeButton2 = largeButton;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton2 = smallBorderlessButton;
        List list3 = list2;
        DisclaimerAtom disclaimerAtom2 = disclaimerAtom;
        return travelPaymentV3DTO.copy(textAtom, list, disclaimerAtom2, textAtom2, list3, largeButton2, smallBorderlessButton2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final List<PaymentMethodDTO> component2() {
        return this.paymentMethods;
    }

    /* renamed from: component3, reason: from getter */
    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    /* renamed from: component4, reason: from getter */
    public final TextAtom getOptionsTitle() {
        return this.optionsTitle;
    }

    @NotNull
    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> component5() {
        return this.paymentOptions;
    }

    /* renamed from: component6, reason: from getter */
    public final ButtonV3Atom.LargeButton getConfirmButton() {
        return this.confirmButton;
    }

    /* renamed from: component7, reason: from getter */
    public final ButtonV3Atom.SmallBorderlessButton getMilesButton() {
        return this.milesButton;
    }

    @NotNull
    public final TravelPaymentV3DTO copy(@NotNull TextAtom title, @NotNull List<PaymentMethodDTO> paymentMethods, DisclaimerAtom annotation, TextAtom optionsTitle, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> paymentOptions, ButtonV3Atom.LargeButton confirmButton, ButtonV3Atom.SmallBorderlessButton milesButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(paymentOptions, "paymentOptions");
        return new TravelPaymentV3DTO(title, paymentMethods, annotation, optionsTitle, paymentOptions, confirmButton, milesButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelPaymentV3DTO)) {
            return false;
        }
        TravelPaymentV3DTO travelPaymentV3DTO = (TravelPaymentV3DTO) other;
        return Intrinsics.d(this.title, travelPaymentV3DTO.title) && Intrinsics.d(this.paymentMethods, travelPaymentV3DTO.paymentMethods) && Intrinsics.d(this.annotation, travelPaymentV3DTO.annotation) && Intrinsics.d(this.optionsTitle, travelPaymentV3DTO.optionsTitle) && Intrinsics.d(this.paymentOptions, travelPaymentV3DTO.paymentOptions) && Intrinsics.d(this.confirmButton, travelPaymentV3DTO.confirmButton) && Intrinsics.d(this.milesButton, travelPaymentV3DTO.milesButton);
    }

    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    public final ButtonV3Atom.LargeButton getConfirmButton() {
        return this.confirmButton;
    }

    public final ButtonV3Atom.SmallBorderlessButton getMilesButton() {
        return this.milesButton;
    }

    public final TextAtom getOptionsTitle() {
        return this.optionsTitle;
    }

    @NotNull
    public final List<PaymentMethodDTO> getPaymentMethods() {
        return this.paymentMethods;
    }

    @NotNull
    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> getPaymentOptions() {
        return this.paymentOptions;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b11 = g.b(this.title.hashCode() * 31, 31, this.paymentMethods);
        DisclaimerAtom disclaimerAtom = this.annotation;
        int hashCode = (b11 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
        TextAtom textAtom = this.optionsTitle;
        int b12 = g.b((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.paymentOptions);
        ButtonV3Atom.LargeButton largeButton = this.confirmButton;
        int hashCode2 = (b12 + (largeButton == null ? 0 : largeButton.hashCode())) * 31;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.milesButton;
        return hashCode2 + (smallBorderlessButton != null ? smallBorderlessButton.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TravelPaymentV3DTO(title=" + this.title + ", paymentMethods=" + this.paymentMethods + ", annotation=" + this.annotation + ", optionsTitle=" + this.optionsTitle + ", paymentOptions=" + this.paymentOptions + ", confirmButton=" + this.confirmButton + ", milesButton=" + this.milesButton + ")";
    }

    public TravelPaymentV3DTO(TextAtom textAtom, List list, DisclaimerAtom disclaimerAtom, TextAtom textAtom2, List list2, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, (i11 & 2) != 0 ? K.f71697a : list, disclaimerAtom, textAtom2, (i11 & 16) != 0 ? K.f71697a : list2, largeButton, smallBorderlessButton);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003J\u0017\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J{\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001J\u0013\u0010.\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010!R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/data/TravelPaymentV3DTO$PaymentMethodDTO;", "", "type", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/data/TravelPaymentV3DTO$StyleType;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "iconRight", "backgroundColor", "", "backgroundImage", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "isSelected", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/data/TravelPaymentV3DTO$StyleType;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;ZLjava/util/Map;)V", "getType", "()Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/data/TravelPaymentV3DTO$StyleType;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getIconRight", "getBackgroundColor", "()Ljava/lang/String;", "getBackgroundImage", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "()Z", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaymentMethodDTO {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;
        private final String backgroundColor;
        private final String backgroundImage;
        private final Icon icon;
        private final Icon iconRight;
        private final boolean isSelected;
        private final TextAtom title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @NotNull
        private final StyleType type;

        public PaymentMethodDTO(@NotNull StyleType type, TextAtom textAtom, Icon icon, Icon icon2, String str, String str2, @NotNull AtomActionDTO action, boolean z11, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(action, "action");
            this.type = type;
            this.title = textAtom;
            this.icon = icon;
            this.iconRight = icon2;
            this.backgroundColor = str;
            this.backgroundImage = str2;
            this.action = action;
            this.isSelected = z11;
            this.trackingInfo = map;
        }

        public static /* synthetic */ PaymentMethodDTO copy$default(PaymentMethodDTO paymentMethodDTO, StyleType styleType, TextAtom textAtom, Icon icon, Icon icon2, String str, String str2, AtomActionDTO atomActionDTO, boolean z11, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                styleType = paymentMethodDTO.type;
            }
            if ((i11 & 2) != 0) {
                textAtom = paymentMethodDTO.title;
            }
            if ((i11 & 4) != 0) {
                icon = paymentMethodDTO.icon;
            }
            if ((i11 & 8) != 0) {
                icon2 = paymentMethodDTO.iconRight;
            }
            if ((i11 & 16) != 0) {
                str = paymentMethodDTO.backgroundColor;
            }
            if ((i11 & 32) != 0) {
                str2 = paymentMethodDTO.backgroundImage;
            }
            if ((i11 & 64) != 0) {
                atomActionDTO = paymentMethodDTO.action;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                z11 = paymentMethodDTO.isSelected;
            }
            if ((i11 & 256) != 0) {
                map = paymentMethodDTO.trackingInfo;
            }
            boolean z12 = z11;
            Map map2 = map;
            String str3 = str2;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            String str4 = str;
            Icon icon3 = icon;
            return paymentMethodDTO.copy(styleType, textAtom, icon3, icon2, str4, str3, atomActionDTO2, z12, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final StyleType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        /* renamed from: component4, reason: from getter */
        public final Icon getIconRight() {
            return this.iconRight;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBackgroundImage() {
            return this.backgroundImage;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.trackingInfo;
        }

        @NotNull
        public final PaymentMethodDTO copy(@NotNull StyleType type, TextAtom title, Icon icon, Icon iconRight, String backgroundColor, String backgroundImage, @NotNull AtomActionDTO action, boolean isSelected, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(action, "action");
            return new PaymentMethodDTO(type, title, icon, iconRight, backgroundColor, backgroundImage, action, isSelected, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentMethodDTO)) {
                return false;
            }
            PaymentMethodDTO paymentMethodDTO = (PaymentMethodDTO) other;
            return this.type == paymentMethodDTO.type && Intrinsics.d(this.title, paymentMethodDTO.title) && Intrinsics.d(this.icon, paymentMethodDTO.icon) && Intrinsics.d(this.iconRight, paymentMethodDTO.iconRight) && Intrinsics.d(this.backgroundColor, paymentMethodDTO.backgroundColor) && Intrinsics.d(this.backgroundImage, paymentMethodDTO.backgroundImage) && Intrinsics.d(this.action, paymentMethodDTO.action) && this.isSelected == paymentMethodDTO.isSelected && Intrinsics.d(this.trackingInfo, paymentMethodDTO.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getBackgroundImage() {
            return this.backgroundImage;
        }

        public final Icon getIcon() {
            return this.icon;
        }

        public final Icon getIconRight() {
            return this.iconRight;
        }

        public final TextAtom getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final StyleType getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            TextAtom textAtom = this.title;
            int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            Icon icon = this.icon;
            int hashCode3 = (hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
            Icon icon2 = this.iconRight;
            int hashCode4 = (hashCode3 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.backgroundImage;
            int a11 = C3532b.a(Ih.a.b(this.action, (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.isSelected);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return a11 + (map != null ? map.hashCode() : 0);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            StyleType styleType = this.type;
            TextAtom textAtom = this.title;
            Icon icon = this.icon;
            Icon icon2 = this.iconRight;
            String str = this.backgroundColor;
            String str2 = this.backgroundImage;
            AtomActionDTO atomActionDTO = this.action;
            boolean z11 = this.isSelected;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("PaymentMethodDTO(type=");
            sb2.append(styleType);
            sb2.append(", title=");
            sb2.append(textAtom);
            sb2.append(", icon=");
            sb2.append(icon);
            sb2.append(", iconRight=");
            sb2.append(icon2);
            sb2.append(", backgroundColor=");
            Nh.a.h(sb2, str, ", backgroundImage=", str2, ", action=");
            sb2.append(atomActionDTO);
            sb2.append(", isSelected=");
            sb2.append(z11);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }

        public /* synthetic */ PaymentMethodDTO(StyleType styleType, TextAtom textAtom, Icon icon, Icon icon2, String str, String str2, AtomActionDTO atomActionDTO, boolean z11, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? StyleType.STYLE_TYPE_DEFAULT : styleType, textAtom, icon, icon2, str, str2, atomActionDTO, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z11, map);
        }
    }
}
