package ru.ozon.app.android.travel.feature.avia.widgets.tariffLuggage.v2.presentation;

import B90.C2619v;
import Bl.C2639a;
import Kk.C3532b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.extraLuggage.presentation.ExtraLuggageVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002Bc\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b%\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b(\u0010$R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b\u000f\u0010-R\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b.\u0010$R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b/\u0010$R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/tariffLuggage/v2/presentation/TariffLuggageV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "themeImageUrl", "textInfo", "", "Lru/ozon/app/android/travel/feature/avia/shared/extraLuggage/presentation/ExtraLuggageVO;", "flightTicketLuggages", "", "isPricesVisible", "totalPrice", "priceDescription", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "smallButton", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;ZLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Ljava/lang/String;", "getThemeImageUrl", "getTextInfo", "Ljava/util/List;", "getFlightTicketLuggages", "()Ljava/util/List;", "Z", "()Z", "getTotalPrice", "getPriceDescription", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getSmallButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TariffLuggageV2VO implements c {
    private final List<ExtraLuggageVO> flightTicketLuggages;
    private final long id;
    private final boolean isPricesVisible;

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

    public TariffLuggageV2VO(long j11, @NotNull TextAtom title, @NotNull TextAtom subtitle, String str, TextAtom textAtom, List<ExtraLuggageVO> list, boolean z11, @NotNull TextAtom totalPrice, @NotNull TextAtom priceDescription, @NotNull ButtonV3Atom.SmallButton smallButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
        Intrinsics.checkNotNullParameter(smallButton, "smallButton");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitle;
        this.themeImageUrl = str;
        this.textInfo = textAtom;
        this.flightTicketLuggages = list;
        this.isPricesVisible = z11;
        this.totalPrice = totalPrice;
        this.priceDescription = priceDescription;
        this.smallButton = smallButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TariffLuggageV2VO)) {
            return false;
        }
        TariffLuggageV2VO tariffLuggageV2VO = (TariffLuggageV2VO) other;
        return this.id == tariffLuggageV2VO.id && Intrinsics.d(this.title, tariffLuggageV2VO.title) && Intrinsics.d(this.subtitle, tariffLuggageV2VO.subtitle) && Intrinsics.d(this.themeImageUrl, tariffLuggageV2VO.themeImageUrl) && Intrinsics.d(this.textInfo, tariffLuggageV2VO.textInfo) && Intrinsics.d(this.flightTicketLuggages, tariffLuggageV2VO.flightTicketLuggages) && this.isPricesVisible == tariffLuggageV2VO.isPricesVisible && Intrinsics.d(this.totalPrice, tariffLuggageV2VO.totalPrice) && Intrinsics.d(this.priceDescription, tariffLuggageV2VO.priceDescription) && Intrinsics.d(this.smallButton, tariffLuggageV2VO.smallButton);
    }

    public final List<ExtraLuggageVO> getFlightTicketLuggages() {
        return this.flightTicketLuggages;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final TextAtom getPriceDescription() {
        return this.priceDescription;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
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

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = C2619v.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.subtitle);
        String str = this.themeImageUrl;
        int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
        TextAtom textAtom = this.textInfo;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        List<ExtraLuggageVO> list = this.flightTicketLuggages;
        return this.smallButton.hashCode() + C2619v.b(C2619v.b(C3532b.a((hashCode2 + (list != null ? list.hashCode() : 0)) * 31, 31, this.isPricesVisible), 31, this.totalPrice), 31, this.priceDescription);
    }

    /* renamed from: isPricesVisible, reason: from getter */
    public final boolean getIsPricesVisible() {
        return this.isPricesVisible;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        String str = this.themeImageUrl;
        TextAtom textAtom3 = this.textInfo;
        List<ExtraLuggageVO> list = this.flightTicketLuggages;
        boolean z11 = this.isPricesVisible;
        TextAtom textAtom4 = this.totalPrice;
        TextAtom textAtom5 = this.priceDescription;
        ButtonV3Atom.SmallButton smallButton = this.smallButton;
        StringBuilder c11 = C2639a.c("TariffLuggageV2VO(id=", j11, ", title=", textAtom);
        c11.append(", subtitle=");
        c11.append(textAtom2);
        c11.append(", themeImageUrl=");
        c11.append(str);
        c11.append(", textInfo=");
        c11.append(textAtom3);
        c11.append(", flightTicketLuggages=");
        c11.append(list);
        c11.append(", isPricesVisible=");
        c11.append(z11);
        c11.append(", totalPrice=");
        c11.append(textAtom4);
        c11.append(", priceDescription=");
        c11.append(textAtom5);
        c11.append(", smallButton=");
        c11.append(smallButton);
        c11.append(")");
        return c11.toString();
    }
}
