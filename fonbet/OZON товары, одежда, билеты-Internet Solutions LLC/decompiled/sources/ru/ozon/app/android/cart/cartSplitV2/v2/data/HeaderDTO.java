package ru.ozon.app.android.cart.cartSplitV2.v2.data;

import AZ.c;
import D3.g;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.ui.thermometer.data.ThermometerMoleculeDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.cartClickTile.data.CartClickTileDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001-BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003J]\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/HeaderDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "additionalAction", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/HeaderDTO$AdditionalAction;", "removeSplitIconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "thermometerMolecule", "Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO;", "clickDelivery", "Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/data/CartClickTileDTO;", "rightBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/cart/cartSplitV2/v2/data/HeaderDTO$AdditionalAction;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO;Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/data/CartClickTileDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getAdditionalAction", "()Lru/ozon/app/android/cart/cartSplitV2/v2/data/HeaderDTO$AdditionalAction;", "getRemoveSplitIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getThermometerMolecule", "()Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO;", "getClickDelivery", "()Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/data/CartClickTileDTO;", "getRightBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "AdditionalAction", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HeaderDTO {
    public static final int $stable = 8;
    private final AdditionalAction additionalAction;
    private final CartClickTileDTO clickDelivery;
    private final IconButtonV3DTO removeSplitIconButton;
    private final BadgeDTO rightBadge;
    private final TextDTO subtitle;
    private final ThermometerMoleculeDTO thermometerMolecule;
    private final TextDTO title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/HeaderDTO$AdditionalAction;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "tintColor", "", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Ljava/lang/String;)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getTintColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AdditionalAction {
        public static final int $stable = ButtonV3Atom.SmallBorderlessButton.$stable;

        @NotNull
        private final ButtonV3Atom.SmallBorderlessButton button;
        private final String tintColor;

        public AdditionalAction(@NotNull ButtonV3Atom.SmallBorderlessButton button, String str) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
            this.tintColor = str;
        }

        public static /* synthetic */ AdditionalAction copy$default(AdditionalAction additionalAction, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                smallBorderlessButton = additionalAction.button;
            }
            if ((i11 & 2) != 0) {
                str = additionalAction.tintColor;
            }
            return additionalAction.copy(smallBorderlessButton, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ButtonV3Atom.SmallBorderlessButton getButton() {
            return this.button;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTintColor() {
            return this.tintColor;
        }

        @NotNull
        public final AdditionalAction copy(@NotNull ButtonV3Atom.SmallBorderlessButton button, String tintColor) {
            Intrinsics.checkNotNullParameter(button, "button");
            return new AdditionalAction(button, tintColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdditionalAction)) {
                return false;
            }
            AdditionalAction additionalAction = (AdditionalAction) other;
            return Intrinsics.d(this.button, additionalAction.button) && Intrinsics.d(this.tintColor, additionalAction.tintColor);
        }

        @NotNull
        public final ButtonV3Atom.SmallBorderlessButton getButton() {
            return this.button;
        }

        public final String getTintColor() {
            return this.tintColor;
        }

        public int hashCode() {
            int hashCode = this.button.hashCode() * 31;
            String str = this.tintColor;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "AdditionalAction(button=" + this.button + ", tintColor=" + this.tintColor + ")";
        }
    }

    public HeaderDTO(TextDTO textDTO, TextDTO textDTO2, AdditionalAction additionalAction, IconButtonV3DTO iconButtonV3DTO, ThermometerMoleculeDTO thermometerMoleculeDTO, CartClickTileDTO cartClickTileDTO, BadgeDTO badgeDTO) {
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.additionalAction = additionalAction;
        this.removeSplitIconButton = iconButtonV3DTO;
        this.thermometerMolecule = thermometerMoleculeDTO;
        this.clickDelivery = cartClickTileDTO;
        this.rightBadge = badgeDTO;
    }

    public static /* synthetic */ HeaderDTO copy$default(HeaderDTO headerDTO, TextDTO textDTO, TextDTO textDTO2, AdditionalAction additionalAction, IconButtonV3DTO iconButtonV3DTO, ThermometerMoleculeDTO thermometerMoleculeDTO, CartClickTileDTO cartClickTileDTO, BadgeDTO badgeDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = headerDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = headerDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            additionalAction = headerDTO.additionalAction;
        }
        if ((i11 & 8) != 0) {
            iconButtonV3DTO = headerDTO.removeSplitIconButton;
        }
        if ((i11 & 16) != 0) {
            thermometerMoleculeDTO = headerDTO.thermometerMolecule;
        }
        if ((i11 & 32) != 0) {
            cartClickTileDTO = headerDTO.clickDelivery;
        }
        if ((i11 & 64) != 0) {
            badgeDTO = headerDTO.rightBadge;
        }
        CartClickTileDTO cartClickTileDTO2 = cartClickTileDTO;
        BadgeDTO badgeDTO2 = badgeDTO;
        ThermometerMoleculeDTO thermometerMoleculeDTO2 = thermometerMoleculeDTO;
        AdditionalAction additionalAction2 = additionalAction;
        return headerDTO.copy(textDTO, textDTO2, additionalAction2, iconButtonV3DTO, thermometerMoleculeDTO2, cartClickTileDTO2, badgeDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final AdditionalAction getAdditionalAction() {
        return this.additionalAction;
    }

    /* renamed from: component4, reason: from getter */
    public final IconButtonV3DTO getRemoveSplitIconButton() {
        return this.removeSplitIconButton;
    }

    /* renamed from: component5, reason: from getter */
    public final ThermometerMoleculeDTO getThermometerMolecule() {
        return this.thermometerMolecule;
    }

    /* renamed from: component6, reason: from getter */
    public final CartClickTileDTO getClickDelivery() {
        return this.clickDelivery;
    }

    /* renamed from: component7, reason: from getter */
    public final BadgeDTO getRightBadge() {
        return this.rightBadge;
    }

    @NotNull
    public final HeaderDTO copy(TextDTO title, TextDTO subtitle, AdditionalAction additionalAction, IconButtonV3DTO removeSplitIconButton, ThermometerMoleculeDTO thermometerMolecule, CartClickTileDTO clickDelivery, BadgeDTO rightBadge) {
        return new HeaderDTO(title, subtitle, additionalAction, removeSplitIconButton, thermometerMolecule, clickDelivery, rightBadge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderDTO)) {
            return false;
        }
        HeaderDTO headerDTO = (HeaderDTO) other;
        return Intrinsics.d(this.title, headerDTO.title) && Intrinsics.d(this.subtitle, headerDTO.subtitle) && Intrinsics.d(this.additionalAction, headerDTO.additionalAction) && Intrinsics.d(this.removeSplitIconButton, headerDTO.removeSplitIconButton) && Intrinsics.d(this.thermometerMolecule, headerDTO.thermometerMolecule) && Intrinsics.d(this.clickDelivery, headerDTO.clickDelivery) && Intrinsics.d(this.rightBadge, headerDTO.rightBadge);
    }

    public final AdditionalAction getAdditionalAction() {
        return this.additionalAction;
    }

    public final CartClickTileDTO getClickDelivery() {
        return this.clickDelivery;
    }

    public final IconButtonV3DTO getRemoveSplitIconButton() {
        return this.removeSplitIconButton;
    }

    public final BadgeDTO getRightBadge() {
        return this.rightBadge;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final ThermometerMoleculeDTO getThermometerMolecule() {
        return this.thermometerMolecule;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        TextDTO textDTO2 = this.subtitle;
        int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        AdditionalAction additionalAction = this.additionalAction;
        int hashCode3 = (hashCode2 + (additionalAction == null ? 0 : additionalAction.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.removeSplitIconButton;
        int hashCode4 = (hashCode3 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        ThermometerMoleculeDTO thermometerMoleculeDTO = this.thermometerMolecule;
        int hashCode5 = (hashCode4 + (thermometerMoleculeDTO == null ? 0 : thermometerMoleculeDTO.hashCode())) * 31;
        CartClickTileDTO cartClickTileDTO = this.clickDelivery;
        int hashCode6 = (hashCode5 + (cartClickTileDTO == null ? 0 : cartClickTileDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.rightBadge;
        return hashCode6 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        AdditionalAction additionalAction = this.additionalAction;
        IconButtonV3DTO iconButtonV3DTO = this.removeSplitIconButton;
        ThermometerMoleculeDTO thermometerMoleculeDTO = this.thermometerMolecule;
        CartClickTileDTO cartClickTileDTO = this.clickDelivery;
        BadgeDTO badgeDTO = this.rightBadge;
        StringBuilder g10 = g.g("HeaderDTO(title=", textDTO, ", subtitle=", textDTO2, ", additionalAction=");
        g10.append(additionalAction);
        g10.append(", removeSplitIconButton=");
        g10.append(iconButtonV3DTO);
        g10.append(", thermometerMolecule=");
        g10.append(thermometerMoleculeDTO);
        g10.append(", clickDelivery=");
        g10.append(cartClickTileDTO);
        g10.append(", rightBadge=");
        return c.b(g10, badgeDTO, ")");
    }
}
