package ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation;

import B90.C2618u;
import N3.C3660k;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.promoIcon.PromoIconPosition;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000489:;Bm\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u00105\u001a\u0004\b6\u00107¨\u0006<"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "scrollWidgetKey", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Header;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subHeader", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Products;", "products", "", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO;", "dynamicElements", "LWZ/t;", "tokenizedEvent", "", "showSeparator", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Footer;", CommentV3DTO.FOOTER_FIELD_NAME, "<init>", "(JLjava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Header;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Products;Ljava/util/List;LWZ/t;ZLru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Footer;)V", "J", "getId", "()J", "Ljava/lang/Integer;", "getScrollWidgetKey", "()Ljava/lang/Integer;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Header;", "getHeader", "()Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Header;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Products;", "getProducts", "()Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Products;", "Ljava/util/List;", "getDynamicElements", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "getShowSeparator", "()Z", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Footer;", "getFooter", "()Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Footer;", "Header", "Footer", "Products", "Product", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RealFbsSplitVO implements c {
    private final AtomActionDTO action;
    private final List<SplitDynamicElementVO> dynamicElements;
    private final Footer footer;
    private final Header header;
    private final long id;
    private final Products products;
    private final Integer scrollWidgetKey;
    private final boolean showSeparator;
    private final TextAtom subHeader;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Footer;", "", "", "isRounded", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Footer {
        private final boolean isRounded;

        public Footer(boolean z11) {
            this.isRounded = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Footer) && this.isRounded == ((Footer) other).isRounded;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isRounded);
        }

        /* renamed from: isRounded, reason: from getter */
        public final boolean getIsRounded() {
            return this.isRounded;
        }

        @NotNull
        public String toString() {
            return C2618u.g("Footer(isRounded=", ")", this.isRounded);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\t\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Header;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "Lru/ozon/uni/atoms/data/button/Icon;", "leftIcon", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "rightIconButton", "", "isRounded", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/button/Icon;", "getLeftIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "getRightIconButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "Z", "()Z", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Header {
        public static final int $stable = (ButtonV3Atom.LargeIconButton.$stable | Icon.$stable) | TextAtom.$stable;
        private final boolean isRounded;
        private final Icon leftIcon;
        private final ButtonV3Atom.LargeIconButton rightIconButton;
        private final TextAtom text;

        public Header(TextAtom textAtom, Icon icon, ButtonV3Atom.LargeIconButton largeIconButton, boolean z11) {
            this.text = textAtom;
            this.leftIcon = icon;
            this.rightIconButton = largeIconButton;
            this.isRounded = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.d(this.text, header.text) && Intrinsics.d(this.leftIcon, header.leftIcon) && Intrinsics.d(this.rightIconButton, header.rightIconButton) && this.isRounded == header.isRounded;
        }

        public final Icon getLeftIcon() {
            return this.leftIcon;
        }

        public final ButtonV3Atom.LargeIconButton getRightIconButton() {
            return this.rightIconButton;
        }

        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            TextAtom textAtom = this.text;
            int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
            Icon icon = this.leftIcon;
            int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
            ButtonV3Atom.LargeIconButton largeIconButton = this.rightIconButton;
            return Boolean.hashCode(this.isRounded) + ((hashCode2 + (largeIconButton != null ? largeIconButton.hashCode() : 0)) * 31);
        }

        /* renamed from: isRounded, reason: from getter */
        public final boolean getIsRounded() {
            return this.isRounded;
        }

        @NotNull
        public String toString() {
            return "Header(text=" + this.text + ", leftIcon=" + this.leftIcon + ", rightIconButton=" + this.rightIconButton + ", isRounded=" + this.isRounded + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001d\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Product;", "", "", "image", "text", "Lru/ozon/uni/atoms/data/badge/Badge;", "badge", "borderColor", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "promoIcon", "Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "promoIconPosition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "getText", "Lru/ozon/uni/atoms/data/badge/Badge;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getBorderColor", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPromoIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "getPromoIconPosition", "()Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Product {
        public static final int $stable = IconDTO.$stable | Badge.$stable;
        private final Badge badge;
        private final String borderColor;

        @NotNull
        private final String image;
        private final IconDTO promoIcon;
        private final PromoIconPosition promoIconPosition;
        private final String text;

        public Product(@NotNull String image, String str, Badge badge, String str2, IconDTO iconDTO, PromoIconPosition promoIconPosition) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.text = str;
            this.badge = badge;
            this.borderColor = str2;
            this.promoIcon = iconDTO;
            this.promoIconPosition = promoIconPosition;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Product)) {
                return false;
            }
            Product product = (Product) other;
            return Intrinsics.d(this.image, product.image) && Intrinsics.d(this.text, product.text) && Intrinsics.d(this.badge, product.badge) && Intrinsics.d(this.borderColor, product.borderColor) && Intrinsics.d(this.promoIcon, product.promoIcon) && this.promoIconPosition == product.promoIconPosition;
        }

        public final Badge getBadge() {
            return this.badge;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final IconDTO getPromoIcon() {
            return this.promoIcon;
        }

        public final PromoIconPosition getPromoIconPosition() {
            return this.promoIconPosition;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            String str = this.text;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Badge badge = this.badge;
            int hashCode3 = (hashCode2 + (badge == null ? 0 : badge.hashCode())) * 31;
            String str2 = this.borderColor;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            IconDTO iconDTO = this.promoIcon;
            int hashCode5 = (hashCode4 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            PromoIconPosition promoIconPosition = this.promoIconPosition;
            return hashCode5 + (promoIconPosition != null ? promoIconPosition.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String str2 = this.text;
            Badge badge = this.badge;
            String str3 = this.borderColor;
            IconDTO iconDTO = this.promoIcon;
            PromoIconPosition promoIconPosition = this.promoIconPosition;
            StringBuilder d11 = C3660k.d("Product(image=", str, ", text=", str2, ", badge=");
            d11.append(badge);
            d11.append(", borderColor=");
            d11.append(str3);
            d11.append(", promoIcon=");
            d11.append(iconDTO);
            d11.append(", promoIconPosition=");
            d11.append(promoIconPosition);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Products;", "", "", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Product;", "elements", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getElements", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Products {
        private final AtomActionDTO action;

        @NotNull
        private final List<Product> elements;

        public Products(@NotNull List<Product> elements, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.elements = elements;
            this.action = atomActionDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Products)) {
                return false;
            }
            Products products = (Products) other;
            return Intrinsics.d(this.elements, products.elements) && Intrinsics.d(this.action, products.action);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final List<Product> getElements() {
            return this.elements;
        }

        public int hashCode() {
            int hashCode = this.elements.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            return hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "Products(elements=" + this.elements + ", action=" + this.action + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RealFbsSplitVO(long j11, Integer num, AtomActionDTO atomActionDTO, Header header, TextAtom textAtom, Products products, List<? extends SplitDynamicElementVO> list, t tVar, boolean z11, Footer footer) {
        this.id = j11;
        this.scrollWidgetKey = num;
        this.action = atomActionDTO;
        this.header = header;
        this.subHeader = textAtom;
        this.products = products;
        this.dynamicElements = list;
        this.tokenizedEvent = tVar;
        this.showSeparator = z11;
        this.footer = footer;
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final List<SplitDynamicElementVO> getDynamicElements() {
        return this.dynamicElements;
    }

    public final Footer getFooter() {
        return this.footer;
    }

    public final Header getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Products getProducts() {
        return this.products;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return this.scrollWidgetKey;
    }

    public final TextAtom getSubHeader() {
        return this.subHeader;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }
}
