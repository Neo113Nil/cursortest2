package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.header;

import AZ.c;
import D3.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.ui.thermometer.presentation.vo.ThermometerMoleculeVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.cartClickTile.presentation.CartClickTileVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001:\u0001.BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/HeaderVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/HeaderVO$AdditionalAction;", "additionalAction", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "removeSplitIconButton", "Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO;", "thermometerMolecule", "Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileVO;", "clickDelivery", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "rightBadge", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/HeaderVO$AdditionalAction;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO;Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileVO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/HeaderVO$AdditionalAction;", "getAdditionalAction", "()Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/HeaderVO$AdditionalAction;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRemoveSplitIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO;", "getThermometerMolecule", "()Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileVO;", "getClickDelivery", "()Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileVO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getRightBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "AdditionalAction", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class HeaderVO {
    private final AdditionalAction additionalAction;
    private final CartClickTileVO clickDelivery;
    private final IconButtonV3DTO removeSplitIconButton;
    private final BadgeDTO rightBadge;
    private final TextDTO subtitle;
    private final ThermometerMoleculeVO thermometerMolecule;
    private final TextDTO title;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/HeaderVO$AdditionalAction;", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "button", "", "tintColor", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "Ljava/lang/String;", "getTintColor", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public HeaderVO(TextDTO textDTO, TextDTO textDTO2, AdditionalAction additionalAction, IconButtonV3DTO iconButtonV3DTO, ThermometerMoleculeVO thermometerMoleculeVO, CartClickTileVO cartClickTileVO, BadgeDTO badgeDTO) {
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.additionalAction = additionalAction;
        this.removeSplitIconButton = iconButtonV3DTO;
        this.thermometerMolecule = thermometerMoleculeVO;
        this.clickDelivery = cartClickTileVO;
        this.rightBadge = badgeDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderVO)) {
            return false;
        }
        HeaderVO headerVO = (HeaderVO) other;
        return Intrinsics.d(this.title, headerVO.title) && Intrinsics.d(this.subtitle, headerVO.subtitle) && Intrinsics.d(this.additionalAction, headerVO.additionalAction) && Intrinsics.d(this.removeSplitIconButton, headerVO.removeSplitIconButton) && Intrinsics.d(this.thermometerMolecule, headerVO.thermometerMolecule) && Intrinsics.d(this.clickDelivery, headerVO.clickDelivery) && Intrinsics.d(this.rightBadge, headerVO.rightBadge);
    }

    public final AdditionalAction getAdditionalAction() {
        return this.additionalAction;
    }

    public final CartClickTileVO getClickDelivery() {
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

    public final ThermometerMoleculeVO getThermometerMolecule() {
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
        ThermometerMoleculeVO thermometerMoleculeVO = this.thermometerMolecule;
        int hashCode5 = (hashCode4 + (thermometerMoleculeVO == null ? 0 : thermometerMoleculeVO.hashCode())) * 31;
        CartClickTileVO cartClickTileVO = this.clickDelivery;
        int hashCode6 = (hashCode5 + (cartClickTileVO == null ? 0 : cartClickTileVO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.rightBadge;
        return hashCode6 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        AdditionalAction additionalAction = this.additionalAction;
        IconButtonV3DTO iconButtonV3DTO = this.removeSplitIconButton;
        ThermometerMoleculeVO thermometerMoleculeVO = this.thermometerMolecule;
        CartClickTileVO cartClickTileVO = this.clickDelivery;
        BadgeDTO badgeDTO = this.rightBadge;
        StringBuilder g10 = g.g("HeaderVO(title=", textDTO, ", subtitle=", textDTO2, ", additionalAction=");
        g10.append(additionalAction);
        g10.append(", removeSplitIconButton=");
        g10.append(iconButtonV3DTO);
        g10.append(", thermometerMolecule=");
        g10.append(thermometerMoleculeVO);
        g10.append(", clickDelivery=");
        g10.append(cartClickTileVO);
        g10.append(", rightBadge=");
        return c.b(g10, badgeDTO, ")");
    }
}
