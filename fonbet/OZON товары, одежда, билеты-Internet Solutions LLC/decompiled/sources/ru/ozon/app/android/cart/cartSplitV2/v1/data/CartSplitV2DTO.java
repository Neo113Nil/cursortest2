package ru.ozon.app.android.cart.cartSplitV2.v1.data;

import Am.C2438a;
import B0.C2454a;
import Cm.e;
import G.g;
import HY.a;
import N3.C3660k;
import T7.P;
import Tl.b;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.cart.common.product.ProductDTO;
import ru.ozon.app.android.cart.ui.thermometer.data.ThermometerMoleculeDTO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004#$%&B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Header;", "items", "", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item;", "itemSeparatorConfig", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$SeparatorConfig;", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Footer;", "<init>", "(Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Header;Ljava/util/List;Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$SeparatorConfig;Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Footer;)V", "getHeader", "()Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Header;", "getItems$annotations", "()V", "getItems", "()Ljava/util/List;", "getItemSeparatorConfig", "()Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$SeparatorConfig;", "getFooter", "()Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Footer;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Header", "Item", "SeparatorConfig", "Footer", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CartSplitV2DTO {
    public static final int $stable = 8;
    private final Footer footer;
    private final Header header;
    private final SeparatorConfig itemSeparatorConfig;

    @NotNull
    private final List<Item> items;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Footer;", "", "isRounded", "", "<init>", "(Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Footer;", "equals", "other", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Footer {
        public static final int $stable = 0;
        private final Boolean isRounded;

        public Footer(Boolean bool) {
            this.isRounded = bool;
        }

        public static /* synthetic */ Footer copy$default(Footer footer, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = footer.isRounded;
            }
            return footer.copy(bool);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getIsRounded() {
            return this.isRounded;
        }

        @NotNull
        public final Footer copy(Boolean isRounded) {
            return new Footer(isRounded);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Footer) && Intrinsics.d(this.isRounded, ((Footer) other).isRounded);
        }

        public int hashCode() {
            Boolean bool = this.isRounded;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final Boolean isRounded() {
            return this.isRounded;
        }

        @NotNull
        public String toString() {
            return "Footer(isRounded=" + this.isRounded + ")";
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001aJ\\\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Header;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "badges", "", "Lru/ozon/uni/atoms/data/badge/Badge;", "additionalAction", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Header$AdditionalAction;", "thermometerMolecule", "Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO;", "disableRounding", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Header$AdditionalAction;Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO;Ljava/lang/Boolean;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getBadges", "()Ljava/util/List;", "getAdditionalAction", "()Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Header$AdditionalAction;", "getThermometerMolecule", "()Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO;", "getDisableRounding", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Header$AdditionalAction;Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO;Ljava/lang/Boolean;)Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Header;", "equals", "other", "hashCode", "", "toString", "", "AdditionalAction", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Header {
        public static final int $stable = 8;
        private final AdditionalAction additionalAction;
        private final List<Badge> badges;
        private final Boolean disableRounding;
        private final TextAtom subtitle;
        private final ThermometerMoleculeDTO thermometerMolecule;
        private final TextAtom title;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Header$AdditionalAction;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "tintColor", "", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Ljava/lang/String;)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getTintColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        public Header(TextAtom textAtom, TextAtom textAtom2, List<Badge> list, AdditionalAction additionalAction, ThermometerMoleculeDTO thermometerMoleculeDTO, Boolean bool) {
            this.title = textAtom;
            this.subtitle = textAtom2;
            this.badges = list;
            this.additionalAction = additionalAction;
            this.thermometerMolecule = thermometerMoleculeDTO;
            this.disableRounding = bool;
        }

        public static /* synthetic */ Header copy$default(Header header, TextAtom textAtom, TextAtom textAtom2, List list, AdditionalAction additionalAction, ThermometerMoleculeDTO thermometerMoleculeDTO, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = header.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = header.subtitle;
            }
            if ((i11 & 4) != 0) {
                list = header.badges;
            }
            if ((i11 & 8) != 0) {
                additionalAction = header.additionalAction;
            }
            if ((i11 & 16) != 0) {
                thermometerMoleculeDTO = header.thermometerMolecule;
            }
            if ((i11 & 32) != 0) {
                bool = header.disableRounding;
            }
            ThermometerMoleculeDTO thermometerMoleculeDTO2 = thermometerMoleculeDTO;
            Boolean bool2 = bool;
            return header.copy(textAtom, textAtom2, list, additionalAction, thermometerMoleculeDTO2, bool2);
        }

        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        public final List<Badge> component3() {
            return this.badges;
        }

        /* renamed from: component4, reason: from getter */
        public final AdditionalAction getAdditionalAction() {
            return this.additionalAction;
        }

        /* renamed from: component5, reason: from getter */
        public final ThermometerMoleculeDTO getThermometerMolecule() {
            return this.thermometerMolecule;
        }

        /* renamed from: component6, reason: from getter */
        public final Boolean getDisableRounding() {
            return this.disableRounding;
        }

        @NotNull
        public final Header copy(TextAtom title, TextAtom subtitle, List<Badge> badges, AdditionalAction additionalAction, ThermometerMoleculeDTO thermometerMolecule, Boolean disableRounding) {
            return new Header(title, subtitle, badges, additionalAction, thermometerMolecule, disableRounding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.d(this.title, header.title) && Intrinsics.d(this.subtitle, header.subtitle) && Intrinsics.d(this.badges, header.badges) && Intrinsics.d(this.additionalAction, header.additionalAction) && Intrinsics.d(this.thermometerMolecule, header.thermometerMolecule) && Intrinsics.d(this.disableRounding, header.disableRounding);
        }

        public final AdditionalAction getAdditionalAction() {
            return this.additionalAction;
        }

        public final List<Badge> getBadges() {
            return this.badges;
        }

        public final Boolean getDisableRounding() {
            return this.disableRounding;
        }

        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        public final ThermometerMoleculeDTO getThermometerMolecule() {
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
            List<Badge> list = this.badges;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            AdditionalAction additionalAction = this.additionalAction;
            int hashCode4 = (hashCode3 + (additionalAction == null ? 0 : additionalAction.hashCode())) * 31;
            ThermometerMoleculeDTO thermometerMoleculeDTO = this.thermometerMolecule;
            int hashCode5 = (hashCode4 + (thermometerMoleculeDTO == null ? 0 : thermometerMoleculeDTO.hashCode())) * 31;
            Boolean bool = this.disableRounding;
            return hashCode5 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            List<Badge> list = this.badges;
            AdditionalAction additionalAction = this.additionalAction;
            ThermometerMoleculeDTO thermometerMoleculeDTO = this.thermometerMolecule;
            Boolean bool = this.disableRounding;
            StringBuilder a11 = a.a("Header(title=", textAtom, ", subtitle=", textAtom2, ", badges=");
            a11.append(list);
            a11.append(", additionalAction=");
            a11.append(additionalAction);
            a11.append(", thermometerMolecule=");
            a11.append(thermometerMoleculeDTO);
            a11.append(", disableRounding=");
            a11.append(bool);
            a11.append(")");
            return a11.toString();
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002!\"B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item;", "", "checkbox", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Checkbox;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/app/android/cart/common/product/ProductDTO;", "dynamicElements", "", "Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementDTO;", "controls", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls;", "<init>", "(Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Checkbox;Lru/ozon/app/android/cart/common/product/ProductDTO;Ljava/util/List;Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls;)V", "getCheckbox", "()Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Checkbox;", "getProduct", "()Lru/ozon/app/android/cart/common/product/ProductDTO;", "getDynamicElements", "()Ljava/util/List;", "getControls", "()Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Checkbox", "Controls", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final Checkbox checkbox;
        private final Controls controls;
        private final List<DynamicElementDTO> dynamicElements;

        @NotNull
        private final ProductDTO product;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Checkbox;", "", "isSelected", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Checkbox {
            public static final int $stable = 8;
            private final AtomActionDTO action;
            private final boolean isSelected;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public Checkbox(boolean z11, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
                this.isSelected = z11;
                this.action = atomActionDTO;
                this.trackingInfo = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Checkbox copy$default(Checkbox checkbox, boolean z11, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    z11 = checkbox.isSelected;
                }
                if ((i11 & 2) != 0) {
                    atomActionDTO = checkbox.action;
                }
                if ((i11 & 4) != 0) {
                    map = checkbox.trackingInfo;
                }
                return checkbox.copy(z11, atomActionDTO, map);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            /* renamed from: component2, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> component3() {
                return this.trackingInfo;
            }

            @NotNull
            public final Checkbox copy(boolean isSelected, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
                return new Checkbox(isSelected, action, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Checkbox)) {
                    return false;
                }
                Checkbox checkbox = (Checkbox) other;
                return this.isSelected == checkbox.isSelected && Intrinsics.d(this.action, checkbox.action) && Intrinsics.d(this.trackingInfo, checkbox.trackingInfo);
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = Boolean.hashCode(this.isSelected) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode2 + (map != null ? map.hashCode() : 0);
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                boolean z11 = this.isSelected;
                AtomActionDTO atomActionDTO = this.action;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder sb2 = new StringBuilder("Checkbox(isSelected=");
                sb2.append(z11);
                sb2.append(", action=");
                sb2.append(atomActionDTO);
                sb2.append(", trackingInfo=");
                return P.f(sb2, map, ")");
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002 !B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls;", "", "favoriteProduct", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", ProductAction.ACTION_REMOVE, "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls$RemoveControl;", "quantity", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls$QuantityControl;", "buyInOneClick", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls$RemoveControl;Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls$QuantityControl;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getFavoriteProduct", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "getRemove", "()Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls$RemoveControl;", "getQuantity", "()Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls$QuantityControl;", "getBuyInOneClick", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "RemoveControl", "QuantityControl", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Controls {
            public static final int $stable = 8;
            private final ButtonV3DTO buyInOneClick;

            @NotNull
            private final FavoriteProductMolecule favoriteProduct;
            private final QuantityControl quantity;

            @NotNull
            private final RemoveControl remove;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0017\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003J\u0017\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0096\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0003HÖ\u0001J\t\u00107\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b&\u0010\u001c¨\u00068"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls$QuantityControl;", "", "minimum", "", "maximum", "current", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "multiplicity", "debounceDelay", "", "incrementTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "decrementTrackingInfo", "quantityChangeDisabledNotificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "quantSize", "<init>", "(IIILru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/Map;Ljava/util/Map;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/lang/Integer;)V", "getMinimum", "()I", "getMaximum", "getCurrent", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getMultiplicity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDebounceDelay", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getIncrementTrackingInfo", "()Ljava/util/Map;", "getDecrementTrackingInfo", "getQuantityChangeDisabledNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getQuantSize", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(IIILru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/Map;Ljava/util/Map;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/lang/Integer;)Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls$QuantityControl;", "equals", "", "other", "hashCode", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class QuantityControl {
                public static final int $stable = 8;

                @NotNull
                private final AtomActionDTO action;
                private final int current;
                private final Long debounceDelay;
                private final Map<String, TokenizedTrackingInfo> decrementTrackingInfo;
                private final Map<String, TokenizedTrackingInfo> incrementTrackingInfo;
                private final int maximum;
                private final int minimum;
                private final Integer multiplicity;
                private final Integer quantSize;
                private final NotificationDTO quantityChangeDisabledNotificationBar;

                public QuantityControl(int i11, int i12, int i13, @NotNull AtomActionDTO action, Integer num, Long l11, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, NotificationDTO notificationDTO, Integer num2) {
                    Intrinsics.checkNotNullParameter(action, "action");
                    this.minimum = i11;
                    this.maximum = i12;
                    this.current = i13;
                    this.action = action;
                    this.multiplicity = num;
                    this.debounceDelay = l11;
                    this.incrementTrackingInfo = map;
                    this.decrementTrackingInfo = map2;
                    this.quantityChangeDisabledNotificationBar = notificationDTO;
                    this.quantSize = num2;
                }

                public static /* synthetic */ QuantityControl copy$default(QuantityControl quantityControl, int i11, int i12, int i13, AtomActionDTO atomActionDTO, Integer num, Long l11, Map map, Map map2, NotificationDTO notificationDTO, Integer num2, int i14, Object obj) {
                    if ((i14 & 1) != 0) {
                        i11 = quantityControl.minimum;
                    }
                    if ((i14 & 2) != 0) {
                        i12 = quantityControl.maximum;
                    }
                    if ((i14 & 4) != 0) {
                        i13 = quantityControl.current;
                    }
                    if ((i14 & 8) != 0) {
                        atomActionDTO = quantityControl.action;
                    }
                    if ((i14 & 16) != 0) {
                        num = quantityControl.multiplicity;
                    }
                    if ((i14 & 32) != 0) {
                        l11 = quantityControl.debounceDelay;
                    }
                    if ((i14 & 64) != 0) {
                        map = quantityControl.incrementTrackingInfo;
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                        map2 = quantityControl.decrementTrackingInfo;
                    }
                    if ((i14 & 256) != 0) {
                        notificationDTO = quantityControl.quantityChangeDisabledNotificationBar;
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                        num2 = quantityControl.quantSize;
                    }
                    NotificationDTO notificationDTO2 = notificationDTO;
                    Integer num3 = num2;
                    Map map3 = map;
                    Map map4 = map2;
                    Integer num4 = num;
                    Long l12 = l11;
                    return quantityControl.copy(i11, i12, i13, atomActionDTO, num4, l12, map3, map4, notificationDTO2, num3);
                }

                /* renamed from: component1, reason: from getter */
                public final int getMinimum() {
                    return this.minimum;
                }

                /* renamed from: component10, reason: from getter */
                public final Integer getQuantSize() {
                    return this.quantSize;
                }

                /* renamed from: component2, reason: from getter */
                public final int getMaximum() {
                    return this.maximum;
                }

                /* renamed from: component3, reason: from getter */
                public final int getCurrent() {
                    return this.current;
                }

                @NotNull
                /* renamed from: component4, reason: from getter */
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                /* renamed from: component5, reason: from getter */
                public final Integer getMultiplicity() {
                    return this.multiplicity;
                }

                /* renamed from: component6, reason: from getter */
                public final Long getDebounceDelay() {
                    return this.debounceDelay;
                }

                public final Map<String, TokenizedTrackingInfo> component7() {
                    return this.incrementTrackingInfo;
                }

                public final Map<String, TokenizedTrackingInfo> component8() {
                    return this.decrementTrackingInfo;
                }

                /* renamed from: component9, reason: from getter */
                public final NotificationDTO getQuantityChangeDisabledNotificationBar() {
                    return this.quantityChangeDisabledNotificationBar;
                }

                @NotNull
                public final QuantityControl copy(int minimum, int maximum, int current, @NotNull AtomActionDTO action, Integer multiplicity, Long debounceDelay, Map<String, TokenizedTrackingInfo> incrementTrackingInfo, Map<String, TokenizedTrackingInfo> decrementTrackingInfo, NotificationDTO quantityChangeDisabledNotificationBar, Integer quantSize) {
                    Intrinsics.checkNotNullParameter(action, "action");
                    return new QuantityControl(minimum, maximum, current, action, multiplicity, debounceDelay, incrementTrackingInfo, decrementTrackingInfo, quantityChangeDisabledNotificationBar, quantSize);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof QuantityControl)) {
                        return false;
                    }
                    QuantityControl quantityControl = (QuantityControl) other;
                    return this.minimum == quantityControl.minimum && this.maximum == quantityControl.maximum && this.current == quantityControl.current && Intrinsics.d(this.action, quantityControl.action) && Intrinsics.d(this.multiplicity, quantityControl.multiplicity) && Intrinsics.d(this.debounceDelay, quantityControl.debounceDelay) && Intrinsics.d(this.incrementTrackingInfo, quantityControl.incrementTrackingInfo) && Intrinsics.d(this.decrementTrackingInfo, quantityControl.decrementTrackingInfo) && Intrinsics.d(this.quantityChangeDisabledNotificationBar, quantityControl.quantityChangeDisabledNotificationBar) && Intrinsics.d(this.quantSize, quantityControl.quantSize);
                }

                @NotNull
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final int getCurrent() {
                    return this.current;
                }

                public final Long getDebounceDelay() {
                    return this.debounceDelay;
                }

                public final Map<String, TokenizedTrackingInfo> getDecrementTrackingInfo() {
                    return this.decrementTrackingInfo;
                }

                public final Map<String, TokenizedTrackingInfo> getIncrementTrackingInfo() {
                    return this.incrementTrackingInfo;
                }

                public final int getMaximum() {
                    return this.maximum;
                }

                public final int getMinimum() {
                    return this.minimum;
                }

                public final Integer getMultiplicity() {
                    return this.multiplicity;
                }

                public final Integer getQuantSize() {
                    return this.quantSize;
                }

                public final NotificationDTO getQuantityChangeDisabledNotificationBar() {
                    return this.quantityChangeDisabledNotificationBar;
                }

                public int hashCode() {
                    int b11 = Ih.a.b(this.action, C2454a.a(this.current, C2454a.a(this.maximum, Integer.hashCode(this.minimum) * 31, 31), 31), 31);
                    Integer num = this.multiplicity;
                    int hashCode = (b11 + (num == null ? 0 : num.hashCode())) * 31;
                    Long l11 = this.debounceDelay;
                    int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.incrementTrackingInfo;
                    int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map2 = this.decrementTrackingInfo;
                    int hashCode4 = (hashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
                    NotificationDTO notificationDTO = this.quantityChangeDisabledNotificationBar;
                    int hashCode5 = (hashCode4 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31;
                    Integer num2 = this.quantSize;
                    return hashCode5 + (num2 != null ? num2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    int i11 = this.minimum;
                    int i12 = this.maximum;
                    int i13 = this.current;
                    AtomActionDTO atomActionDTO = this.action;
                    Integer num = this.multiplicity;
                    Long l11 = this.debounceDelay;
                    Map<String, TokenizedTrackingInfo> map = this.incrementTrackingInfo;
                    Map<String, TokenizedTrackingInfo> map2 = this.decrementTrackingInfo;
                    NotificationDTO notificationDTO = this.quantityChangeDisabledNotificationBar;
                    Integer num2 = this.quantSize;
                    StringBuilder a11 = C2438a.a("QuantityControl(minimum=", i11, ", maximum=", ", current=", i12);
                    a11.append(i13);
                    a11.append(", action=");
                    a11.append(atomActionDTO);
                    a11.append(", multiplicity=");
                    a11.append(num);
                    a11.append(", debounceDelay=");
                    a11.append(l11);
                    a11.append(", incrementTrackingInfo=");
                    b.g(a11, map, ", decrementTrackingInfo=", map2, ", quantityChangeDisabledNotificationBar=");
                    a11.append(notificationDTO);
                    a11.append(", quantSize=");
                    a11.append(num2);
                    a11.append(")");
                    return a11.toString();
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls$RemoveControl;", "", "icon", "", "tintColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getIcon", "()Ljava/lang/String;", "getTintColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class RemoveControl {
                public static final int $stable = 8;
                private final AtomActionDTO action;

                @NotNull
                private final String icon;

                @NotNull
                private final String tintColor;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                public RemoveControl(@NotNull String icon, @NotNull String tintColor, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
                    Intrinsics.checkNotNullParameter(icon, "icon");
                    Intrinsics.checkNotNullParameter(tintColor, "tintColor");
                    this.icon = icon;
                    this.tintColor = tintColor;
                    this.action = atomActionDTO;
                    this.trackingInfo = map;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ RemoveControl copy$default(RemoveControl removeControl, String str, String str2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = removeControl.icon;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = removeControl.tintColor;
                    }
                    if ((i11 & 4) != 0) {
                        atomActionDTO = removeControl.action;
                    }
                    if ((i11 & 8) != 0) {
                        map = removeControl.trackingInfo;
                    }
                    return removeControl.copy(str, str2, atomActionDTO, map);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getIcon() {
                    return this.icon;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final String getTintColor() {
                    return this.tintColor;
                }

                /* renamed from: component3, reason: from getter */
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final Map<String, TokenizedTrackingInfo> component4() {
                    return this.trackingInfo;
                }

                @NotNull
                public final RemoveControl copy(@NotNull String icon, @NotNull String tintColor, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
                    Intrinsics.checkNotNullParameter(icon, "icon");
                    Intrinsics.checkNotNullParameter(tintColor, "tintColor");
                    return new RemoveControl(icon, tintColor, action, trackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof RemoveControl)) {
                        return false;
                    }
                    RemoveControl removeControl = (RemoveControl) other;
                    return Intrinsics.d(this.icon, removeControl.icon) && Intrinsics.d(this.tintColor, removeControl.tintColor) && Intrinsics.d(this.action, removeControl.action) && Intrinsics.d(this.trackingInfo, removeControl.trackingInfo);
                }

                public final AtomActionDTO getAction() {
                    return this.action;
                }

                @NotNull
                public final String getIcon() {
                    return this.icon;
                }

                @NotNull
                public final String getTintColor() {
                    return this.tintColor;
                }

                public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                public int hashCode() {
                    int a11 = g.a(this.icon.hashCode() * 31, 31, this.tintColor);
                    AtomActionDTO atomActionDTO = this.action;
                    int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    return hashCode + (map != null ? map.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.icon;
                    String str2 = this.tintColor;
                    return D40.a.d(C3660k.d("RemoveControl(icon=", str, ", tintColor=", str2, ", action="), this.action, ", trackingInfo=", this.trackingInfo, ")");
                }
            }

            public Controls(@NotNull FavoriteProductMolecule favoriteProduct, @NotNull RemoveControl remove, QuantityControl quantityControl, ButtonV3DTO buttonV3DTO) {
                Intrinsics.checkNotNullParameter(favoriteProduct, "favoriteProduct");
                Intrinsics.checkNotNullParameter(remove, "remove");
                this.favoriteProduct = favoriteProduct;
                this.remove = remove;
                this.quantity = quantityControl;
                this.buyInOneClick = buttonV3DTO;
            }

            public static /* synthetic */ Controls copy$default(Controls controls, FavoriteProductMolecule favoriteProductMolecule, RemoveControl removeControl, QuantityControl quantityControl, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    favoriteProductMolecule = controls.favoriteProduct;
                }
                if ((i11 & 2) != 0) {
                    removeControl = controls.remove;
                }
                if ((i11 & 4) != 0) {
                    quantityControl = controls.quantity;
                }
                if ((i11 & 8) != 0) {
                    buttonV3DTO = controls.buyInOneClick;
                }
                return controls.copy(favoriteProductMolecule, removeControl, quantityControl, buttonV3DTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final FavoriteProductMolecule getFavoriteProduct() {
                return this.favoriteProduct;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final RemoveControl getRemove() {
                return this.remove;
            }

            /* renamed from: component3, reason: from getter */
            public final QuantityControl getQuantity() {
                return this.quantity;
            }

            /* renamed from: component4, reason: from getter */
            public final ButtonV3DTO getBuyInOneClick() {
                return this.buyInOneClick;
            }

            @NotNull
            public final Controls copy(@NotNull FavoriteProductMolecule favoriteProduct, @NotNull RemoveControl remove, QuantityControl quantity, ButtonV3DTO buyInOneClick) {
                Intrinsics.checkNotNullParameter(favoriteProduct, "favoriteProduct");
                Intrinsics.checkNotNullParameter(remove, "remove");
                return new Controls(favoriteProduct, remove, quantity, buyInOneClick);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Controls)) {
                    return false;
                }
                Controls controls = (Controls) other;
                return Intrinsics.d(this.favoriteProduct, controls.favoriteProduct) && Intrinsics.d(this.remove, controls.remove) && Intrinsics.d(this.quantity, controls.quantity) && Intrinsics.d(this.buyInOneClick, controls.buyInOneClick);
            }

            public final ButtonV3DTO getBuyInOneClick() {
                return this.buyInOneClick;
            }

            @NotNull
            public final FavoriteProductMolecule getFavoriteProduct() {
                return this.favoriteProduct;
            }

            public final QuantityControl getQuantity() {
                return this.quantity;
            }

            @NotNull
            public final RemoveControl getRemove() {
                return this.remove;
            }

            public int hashCode() {
                int hashCode = (this.remove.hashCode() + (this.favoriteProduct.hashCode() * 31)) * 31;
                QuantityControl quantityControl = this.quantity;
                int hashCode2 = (hashCode + (quantityControl == null ? 0 : quantityControl.hashCode())) * 31;
                ButtonV3DTO buttonV3DTO = this.buyInOneClick;
                return hashCode2 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Controls(favoriteProduct=" + this.favoriteProduct + ", remove=" + this.remove + ", quantity=" + this.quantity + ", buyInOneClick=" + this.buyInOneClick + ")";
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Item(Checkbox checkbox, @NotNull ProductDTO product, List<? extends DynamicElementDTO> list, Controls controls) {
            Intrinsics.checkNotNullParameter(product, "product");
            this.checkbox = checkbox;
            this.product = product;
            this.dynamicElements = list;
            this.controls = controls;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Item copy$default(Item item, Checkbox checkbox, ProductDTO productDTO, List list, Controls controls, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                checkbox = item.checkbox;
            }
            if ((i11 & 2) != 0) {
                productDTO = item.product;
            }
            if ((i11 & 4) != 0) {
                list = item.dynamicElements;
            }
            if ((i11 & 8) != 0) {
                controls = item.controls;
            }
            return item.copy(checkbox, productDTO, list, controls);
        }

        /* renamed from: component1, reason: from getter */
        public final Checkbox getCheckbox() {
            return this.checkbox;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ProductDTO getProduct() {
            return this.product;
        }

        public final List<DynamicElementDTO> component3() {
            return this.dynamicElements;
        }

        /* renamed from: component4, reason: from getter */
        public final Controls getControls() {
            return this.controls;
        }

        @NotNull
        public final Item copy(Checkbox checkbox, @NotNull ProductDTO product, List<? extends DynamicElementDTO> dynamicElements, Controls controls) {
            Intrinsics.checkNotNullParameter(product, "product");
            return new Item(checkbox, product, dynamicElements, controls);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.d(this.checkbox, item.checkbox) && Intrinsics.d(this.product, item.product) && Intrinsics.d(this.dynamicElements, item.dynamicElements) && Intrinsics.d(this.controls, item.controls);
        }

        public final Checkbox getCheckbox() {
            return this.checkbox;
        }

        public final Controls getControls() {
            return this.controls;
        }

        public final List<DynamicElementDTO> getDynamicElements() {
            return this.dynamicElements;
        }

        @NotNull
        public final ProductDTO getProduct() {
            return this.product;
        }

        public int hashCode() {
            Checkbox checkbox = this.checkbox;
            int hashCode = (this.product.hashCode() + ((checkbox == null ? 0 : checkbox.hashCode()) * 31)) * 31;
            List<DynamicElementDTO> list = this.dynamicElements;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            Controls controls = this.controls;
            return hashCode2 + (controls != null ? controls.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Item(checkbox=" + this.checkbox + ", product=" + this.product + ", dynamicElements=" + this.dynamicElements + ", controls=" + this.controls + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011JF\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$SeparatorConfig;", "", "height", "", "backgroundColor", "", "tintColor", "leftPadding", "rightPadding", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getHeight", "()I", "getBackgroundColor", "()Ljava/lang/String;", "getTintColor", "getLeftPadding", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRightPadding", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$SeparatorConfig;", "equals", "", "other", "hashCode", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeparatorConfig {
        public static final int $stable = 0;

        @NotNull
        private final String backgroundColor;
        private final int height;
        private final Integer leftPadding;
        private final Integer rightPadding;
        private final String tintColor;

        public SeparatorConfig(int i11, @NotNull String backgroundColor, String str, Integer num, Integer num2) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.height = i11;
            this.backgroundColor = backgroundColor;
            this.tintColor = str;
            this.leftPadding = num;
            this.rightPadding = num2;
        }

        public static /* synthetic */ SeparatorConfig copy$default(SeparatorConfig separatorConfig, int i11, String str, String str2, Integer num, Integer num2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = separatorConfig.height;
            }
            if ((i12 & 2) != 0) {
                str = separatorConfig.backgroundColor;
            }
            if ((i12 & 4) != 0) {
                str2 = separatorConfig.tintColor;
            }
            if ((i12 & 8) != 0) {
                num = separatorConfig.leftPadding;
            }
            if ((i12 & 16) != 0) {
                num2 = separatorConfig.rightPadding;
            }
            Integer num3 = num2;
            String str3 = str2;
            return separatorConfig.copy(i11, str, str3, num, num3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTintColor() {
            return this.tintColor;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getLeftPadding() {
            return this.leftPadding;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        public final SeparatorConfig copy(int height, @NotNull String backgroundColor, String tintColor, Integer leftPadding, Integer rightPadding) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new SeparatorConfig(height, backgroundColor, tintColor, leftPadding, rightPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeparatorConfig)) {
                return false;
            }
            SeparatorConfig separatorConfig = (SeparatorConfig) other;
            return this.height == separatorConfig.height && Intrinsics.d(this.backgroundColor, separatorConfig.backgroundColor) && Intrinsics.d(this.tintColor, separatorConfig.tintColor) && Intrinsics.d(this.leftPadding, separatorConfig.leftPadding) && Intrinsics.d(this.rightPadding, separatorConfig.rightPadding);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final int getHeight() {
            return this.height;
        }

        public final Integer getLeftPadding() {
            return this.leftPadding;
        }

        public final Integer getRightPadding() {
            return this.rightPadding;
        }

        public final String getTintColor() {
            return this.tintColor;
        }

        public int hashCode() {
            int a11 = g.a(Integer.hashCode(this.height) * 31, 31, this.backgroundColor);
            String str = this.tintColor;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.leftPadding;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.rightPadding;
            return hashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.height;
            String str = this.backgroundColor;
            String str2 = this.tintColor;
            Integer num = this.leftPadding;
            Integer num2 = this.rightPadding;
            StringBuilder g10 = e.g(i11, "SeparatorConfig(height=", ", backgroundColor=", str, ", tintColor=");
            C2454a.f(num, str2, ", leftPadding=", ", rightPadding=", g10);
            return Ep.a.c(g10, num2, ")");
        }
    }

    public CartSplitV2DTO(Header header, @NotNull List<Item> items, SeparatorConfig separatorConfig, Footer footer) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.header = header;
        this.items = items;
        this.itemSeparatorConfig = separatorConfig;
        this.footer = footer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CartSplitV2DTO copy$default(CartSplitV2DTO cartSplitV2DTO, Header header, List list, SeparatorConfig separatorConfig, Footer footer, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            header = cartSplitV2DTO.header;
        }
        if ((i11 & 2) != 0) {
            list = cartSplitV2DTO.items;
        }
        if ((i11 & 4) != 0) {
            separatorConfig = cartSplitV2DTO.itemSeparatorConfig;
        }
        if ((i11 & 8) != 0) {
            footer = cartSplitV2DTO.footer;
        }
        return cartSplitV2DTO.copy(header, list, separatorConfig, footer);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getItems$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    @NotNull
    public final List<Item> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final SeparatorConfig getItemSeparatorConfig() {
        return this.itemSeparatorConfig;
    }

    /* renamed from: component4, reason: from getter */
    public final Footer getFooter() {
        return this.footer;
    }

    @NotNull
    public final CartSplitV2DTO copy(Header header, @NotNull List<Item> items, SeparatorConfig itemSeparatorConfig, Footer footer) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new CartSplitV2DTO(header, items, itemSeparatorConfig, footer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartSplitV2DTO)) {
            return false;
        }
        CartSplitV2DTO cartSplitV2DTO = (CartSplitV2DTO) other;
        return Intrinsics.d(this.header, cartSplitV2DTO.header) && Intrinsics.d(this.items, cartSplitV2DTO.items) && Intrinsics.d(this.itemSeparatorConfig, cartSplitV2DTO.itemSeparatorConfig) && Intrinsics.d(this.footer, cartSplitV2DTO.footer);
    }

    public final Footer getFooter() {
        return this.footer;
    }

    public final Header getHeader() {
        return this.header;
    }

    public final SeparatorConfig getItemSeparatorConfig() {
        return this.itemSeparatorConfig;
    }

    @NotNull
    public final List<Item> getItems() {
        return this.items;
    }

    public int hashCode() {
        Header header = this.header;
        int b11 = g.b((header == null ? 0 : header.hashCode()) * 31, 31, this.items);
        SeparatorConfig separatorConfig = this.itemSeparatorConfig;
        int hashCode = (b11 + (separatorConfig == null ? 0 : separatorConfig.hashCode())) * 31;
        Footer footer = this.footer;
        return hashCode + (footer != null ? footer.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CartSplitV2DTO(header=" + this.header + ", items=" + this.items + ", itemSeparatorConfig=" + this.itemSeparatorConfig + ", footer=" + this.footer + ")";
    }
}
