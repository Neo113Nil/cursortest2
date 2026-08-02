package ru.ozon.app.android.travel.feature.avia.widgets.tariffLuggage.v2.data;

import B90.C2619v;
import HY.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.extraLuggage.data.ExtraLuggageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003Je\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/tariffLuggage/v2/data/TariffLuggageV2DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "themeImageUrl", "", "textInfo", "flightTicketLuggages", "", "Lru/ozon/app/android/travel/feature/avia/shared/extraLuggage/data/ExtraLuggageDTO;", "totalPrice", "priceDescription", "smallButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getThemeImageUrl", "()Ljava/lang/String;", "getTextInfo", "getFlightTicketLuggages", "()Ljava/util/List;", "getTotalPrice", "getPriceDescription", "getSmallButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TariffLuggageV2DTO {
    public static final int $stable = 8;
    private final List<ExtraLuggageDTO> flightTicketLuggages;

    @NotNull
    private final TextAtom priceDescription;

    @NotNull
    private final ButtonV3Atom.SmallButton smallButton;

    @NotNull
    private final TextAtom subtitle;
    private final TextAtom textInfo;
    private final String themeImageUrl;

    @NotNull
    private final TextAtom title;

    @NotNull
    private final TextAtom totalPrice;

    public TariffLuggageV2DTO(@NotNull TextAtom title, @NotNull TextAtom subtitle, String str, TextAtom textAtom, List<ExtraLuggageDTO> list, @NotNull TextAtom totalPrice, @NotNull TextAtom priceDescription, @NotNull ButtonV3Atom.SmallButton smallButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
        Intrinsics.checkNotNullParameter(smallButton, "smallButton");
        this.title = title;
        this.subtitle = subtitle;
        this.themeImageUrl = str;
        this.textInfo = textAtom;
        this.flightTicketLuggages = list;
        this.totalPrice = totalPrice;
        this.priceDescription = priceDescription;
        this.smallButton = smallButton;
    }

    public static /* synthetic */ TariffLuggageV2DTO copy$default(TariffLuggageV2DTO tariffLuggageV2DTO, TextAtom textAtom, TextAtom textAtom2, String str, TextAtom textAtom3, List list, TextAtom textAtom4, TextAtom textAtom5, ButtonV3Atom.SmallButton smallButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = tariffLuggageV2DTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = tariffLuggageV2DTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            str = tariffLuggageV2DTO.themeImageUrl;
        }
        if ((i11 & 8) != 0) {
            textAtom3 = tariffLuggageV2DTO.textInfo;
        }
        if ((i11 & 16) != 0) {
            list = tariffLuggageV2DTO.flightTicketLuggages;
        }
        if ((i11 & 32) != 0) {
            textAtom4 = tariffLuggageV2DTO.totalPrice;
        }
        if ((i11 & 64) != 0) {
            textAtom5 = tariffLuggageV2DTO.priceDescription;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            smallButton = tariffLuggageV2DTO.smallButton;
        }
        TextAtom textAtom6 = textAtom5;
        ButtonV3Atom.SmallButton smallButton2 = smallButton;
        List list2 = list;
        TextAtom textAtom7 = textAtom4;
        return tariffLuggageV2DTO.copy(textAtom, textAtom2, str, textAtom3, list2, textAtom7, textAtom6, smallButton2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getThemeImageUrl() {
        return this.themeImageUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final TextAtom getTextInfo() {
        return this.textInfo;
    }

    public final List<ExtraLuggageDTO> component5() {
        return this.flightTicketLuggages;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final TextAtom getTotalPrice() {
        return this.totalPrice;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final TextAtom getPriceDescription() {
        return this.priceDescription;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final ButtonV3Atom.SmallButton getSmallButton() {
        return this.smallButton;
    }

    @NotNull
    public final TariffLuggageV2DTO copy(@NotNull TextAtom title, @NotNull TextAtom subtitle, String themeImageUrl, TextAtom textInfo, List<ExtraLuggageDTO> flightTicketLuggages, @NotNull TextAtom totalPrice, @NotNull TextAtom priceDescription, @NotNull ButtonV3Atom.SmallButton smallButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
        Intrinsics.checkNotNullParameter(smallButton, "smallButton");
        return new TariffLuggageV2DTO(title, subtitle, themeImageUrl, textInfo, flightTicketLuggages, totalPrice, priceDescription, smallButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TariffLuggageV2DTO)) {
            return false;
        }
        TariffLuggageV2DTO tariffLuggageV2DTO = (TariffLuggageV2DTO) other;
        return Intrinsics.d(this.title, tariffLuggageV2DTO.title) && Intrinsics.d(this.subtitle, tariffLuggageV2DTO.subtitle) && Intrinsics.d(this.themeImageUrl, tariffLuggageV2DTO.themeImageUrl) && Intrinsics.d(this.textInfo, tariffLuggageV2DTO.textInfo) && Intrinsics.d(this.flightTicketLuggages, tariffLuggageV2DTO.flightTicketLuggages) && Intrinsics.d(this.totalPrice, tariffLuggageV2DTO.totalPrice) && Intrinsics.d(this.priceDescription, tariffLuggageV2DTO.priceDescription) && Intrinsics.d(this.smallButton, tariffLuggageV2DTO.smallButton);
    }

    public final List<ExtraLuggageDTO> getFlightTicketLuggages() {
        return this.flightTicketLuggages;
    }

    @NotNull
    public final TextAtom getPriceDescription() {
        return this.priceDescription;
    }

    @NotNull
    public final ButtonV3Atom.SmallButton getSmallButton() {
        return this.smallButton;
    }

    @NotNull
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final TextAtom getTextInfo() {
        return this.textInfo;
    }

    public final String getThemeImageUrl() {
        return this.themeImageUrl;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final TextAtom getTotalPrice() {
        return this.totalPrice;
    }

    public int hashCode() {
        int b11 = C2619v.b(this.title.hashCode() * 31, 31, this.subtitle);
        String str = this.themeImageUrl;
        int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
        TextAtom textAtom = this.textInfo;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        List<ExtraLuggageDTO> list = this.flightTicketLuggages;
        return this.smallButton.hashCode() + C2619v.b(C2619v.b((hashCode2 + (list != null ? list.hashCode() : 0)) * 31, 31, this.totalPrice), 31, this.priceDescription);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        String str = this.themeImageUrl;
        TextAtom textAtom3 = this.textInfo;
        List<ExtraLuggageDTO> list = this.flightTicketLuggages;
        TextAtom textAtom4 = this.totalPrice;
        TextAtom textAtom5 = this.priceDescription;
        ButtonV3Atom.SmallButton smallButton = this.smallButton;
        StringBuilder a11 = a.a("TariffLuggageV2DTO(title=", textAtom, ", subtitle=", textAtom2, ", themeImageUrl=");
        a11.append(str);
        a11.append(", textInfo=");
        a11.append(textAtom3);
        a11.append(", flightTicketLuggages=");
        a11.append(list);
        a11.append(", totalPrice=");
        a11.append(textAtom4);
        a11.append(", priceDescription=");
        a11.append(textAtom5);
        a11.append(", smallButton=");
        a11.append(smallButton);
        a11.append(")");
        return a11.toString();
    }
}
