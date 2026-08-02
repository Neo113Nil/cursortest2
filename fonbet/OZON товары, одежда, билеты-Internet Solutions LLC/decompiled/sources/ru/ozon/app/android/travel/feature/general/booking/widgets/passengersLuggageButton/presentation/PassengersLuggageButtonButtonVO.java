package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersLuggageButton.presentation;

import TY.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b/\u0010\"¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersLuggageButton/presentation/PassengersLuggageButtonButtonVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "milesBadge", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "termsTitle", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getMilesBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTermsTitle", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PassengersLuggageButtonButtonVO implements c {
    private final ButtonV3DTO button;
    private final IconButtonV3DTO iconButton;
    private final long id;
    private final BadgeDTO milesBadge;
    private final PriceDTO price;
    private final TextDTO termsTitle;
    private final TextDTO title;

    public PassengersLuggageButtonButtonVO(long j11, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, BadgeDTO badgeDTO, PriceDTO priceDTO, ButtonV3DTO buttonV3DTO, TextDTO textDTO2) {
        this.id = j11;
        this.title = textDTO;
        this.iconButton = iconButtonV3DTO;
        this.milesBadge = badgeDTO;
        this.price = priceDTO;
        this.button = buttonV3DTO;
        this.termsTitle = textDTO2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassengersLuggageButtonButtonVO)) {
            return false;
        }
        PassengersLuggageButtonButtonVO passengersLuggageButtonButtonVO = (PassengersLuggageButtonButtonVO) other;
        return this.id == passengersLuggageButtonButtonVO.id && Intrinsics.d(this.title, passengersLuggageButtonButtonVO.title) && Intrinsics.d(this.iconButton, passengersLuggageButtonButtonVO.iconButton) && Intrinsics.d(this.milesBadge, passengersLuggageButtonButtonVO.milesBadge) && Intrinsics.d(this.price, passengersLuggageButtonButtonVO.price) && Intrinsics.d(this.button, passengersLuggageButtonButtonVO.button) && Intrinsics.d(this.termsTitle, passengersLuggageButtonButtonVO.termsTitle);
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final BadgeDTO getMilesBadge() {
        return this.milesBadge;
    }

    public final PriceDTO getPrice() {
        return this.price;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getTermsTitle() {
        return this.termsTitle;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.title;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.iconButton;
        int hashCode3 = (hashCode2 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.milesBadge;
        int hashCode4 = (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        PriceDTO priceDTO = this.price;
        int hashCode5 = (hashCode4 + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.button;
        int hashCode6 = (hashCode5 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        TextDTO textDTO2 = this.termsTitle;
        return hashCode6 + (textDTO2 != null ? textDTO2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        IconButtonV3DTO iconButtonV3DTO = this.iconButton;
        BadgeDTO badgeDTO = this.milesBadge;
        PriceDTO priceDTO = this.price;
        ButtonV3DTO buttonV3DTO = this.button;
        TextDTO textDTO2 = this.termsTitle;
        StringBuilder b11 = a.b("PassengersLuggageButtonButtonVO(id=", j11, ", title=", textDTO);
        b11.append(", iconButton=");
        b11.append(iconButtonV3DTO);
        b11.append(", milesBadge=");
        b11.append(badgeDTO);
        b11.append(", price=");
        b11.append(priceDTO);
        b11.append(", button=");
        b11.append(buttonV3DTO);
        b11.append(", termsTitle=");
        b11.append(textDTO2);
        b11.append(")");
        return b11.toString();
    }
}
