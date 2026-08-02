package ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title;

import HY.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v1.data.CartSplitV2DTO;
import ru.ozon.app.android.cart.ui.thermometer.presentation.vo.ThermometerMoleculeVO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001fB#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleVO$Header;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$SeparatorConfig;", "itemSeparatorConfig", "<init>", "(JLru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleVO$Header;Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$SeparatorConfig;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleVO$Header;", "getHeader", "()Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleVO$Header;", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$SeparatorConfig;", "getItemSeparatorConfig", "()Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$SeparatorConfig;", "Header", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CartSplitV2TitleVO implements c {
    private final Header header;
    private final long id;
    private final CartSplitV2DTO.SeparatorConfig itemSeparatorConfig;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleVO$Header;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleVO$Header$AdditionalAction;", "additionalAction", "Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO;", "thermometerMolecule", "", "disableRounding", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleVO$Header$AdditionalAction;Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleVO$Header$AdditionalAction;", "getAdditionalAction", "()Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleVO$Header$AdditionalAction;", "Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO;", "getThermometerMolecule", "()Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO;", "Z", "getDisableRounding", "()Z", "AdditionalAction", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Header {
        private final AdditionalAction additionalAction;
        private final List<BadgeDTO> badges;
        private final boolean disableRounding;
        private final TextAtom subtitle;
        private final ThermometerMoleculeVO thermometerMolecule;
        private final TextAtom title;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleVO$Header$AdditionalAction;", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "button", "", "tintColor", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "Ljava/lang/String;", "getTintColor", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        public Header(TextAtom textAtom, TextAtom textAtom2, List<BadgeDTO> list, AdditionalAction additionalAction, ThermometerMoleculeVO thermometerMoleculeVO, boolean z11) {
            this.title = textAtom;
            this.subtitle = textAtom2;
            this.badges = list;
            this.additionalAction = additionalAction;
            this.thermometerMolecule = thermometerMoleculeVO;
            this.disableRounding = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.d(this.title, header.title) && Intrinsics.d(this.subtitle, header.subtitle) && Intrinsics.d(this.badges, header.badges) && Intrinsics.d(this.additionalAction, header.additionalAction) && Intrinsics.d(this.thermometerMolecule, header.thermometerMolecule) && this.disableRounding == header.disableRounding;
        }

        public final AdditionalAction getAdditionalAction() {
            return this.additionalAction;
        }

        public final List<BadgeDTO> getBadges() {
            return this.badges;
        }

        public final boolean getDisableRounding() {
            return this.disableRounding;
        }

        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        public final ThermometerMoleculeVO getThermometerMolecule() {
            return this.thermometerMolecule;
        }

        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextAtom textAtom = this.title;
            int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
            TextAtom textAtom2 = this.subtitle;
            int hashCode2 = (hashCode + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
            List<BadgeDTO> list = this.badges;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            AdditionalAction additionalAction = this.additionalAction;
            int hashCode4 = (hashCode3 + (additionalAction == null ? 0 : additionalAction.hashCode())) * 31;
            ThermometerMoleculeVO thermometerMoleculeVO = this.thermometerMolecule;
            return Boolean.hashCode(this.disableRounding) + ((hashCode4 + (thermometerMoleculeVO != null ? thermometerMoleculeVO.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            List<BadgeDTO> list = this.badges;
            AdditionalAction additionalAction = this.additionalAction;
            ThermometerMoleculeVO thermometerMoleculeVO = this.thermometerMolecule;
            boolean z11 = this.disableRounding;
            StringBuilder a11 = a.a("Header(title=", textAtom, ", subtitle=", textAtom2, ", badges=");
            a11.append(list);
            a11.append(", additionalAction=");
            a11.append(additionalAction);
            a11.append(", thermometerMolecule=");
            a11.append(thermometerMoleculeVO);
            a11.append(", disableRounding=");
            a11.append(z11);
            a11.append(")");
            return a11.toString();
        }
    }

    public CartSplitV2TitleVO(long j11, Header header, CartSplitV2DTO.SeparatorConfig separatorConfig) {
        this.id = j11;
        this.header = header;
        this.itemSeparatorConfig = separatorConfig;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartSplitV2TitleVO)) {
            return false;
        }
        CartSplitV2TitleVO cartSplitV2TitleVO = (CartSplitV2TitleVO) other;
        return this.id == cartSplitV2TitleVO.id && Intrinsics.d(this.header, cartSplitV2TitleVO.header) && Intrinsics.d(this.itemSeparatorConfig, cartSplitV2TitleVO.itemSeparatorConfig);
    }

    public final Header getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Header header = this.header;
        int hashCode2 = (hashCode + (header == null ? 0 : header.hashCode())) * 31;
        CartSplitV2DTO.SeparatorConfig separatorConfig = this.itemSeparatorConfig;
        return hashCode2 + (separatorConfig != null ? separatorConfig.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CartSplitV2TitleVO(id=" + this.id + ", header=" + this.header + ", itemSeparatorConfig=" + this.itemSeparatorConfig + ")";
    }
}
