package ru.ozon.app.android.checkoutcomposer.rfbsSplit.data;

import N3.C3660k;
import Sh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.common.promoIcon.PromoIconPosition;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004=>?@Bs\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0017\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u00105\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u008c\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u00132\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR$\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006A"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Header;", "subHeader", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "products", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Products;", "dynamicElements", "", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "scrollWidgetKey", "showSeparator", "", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Footer;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Header;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Products;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Footer;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHeader", "()Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Header;", "getSubHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getProducts", "()Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Products;", "getDynamicElements$annotations", "()V", "getDynamicElements", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "getScrollWidgetKey", "()Ljava/lang/String;", "getShowSeparator", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFooter", "()Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Footer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Header;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Products;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Footer;)Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO;", "equals", "other", "hashCode", "", "toString", "Header", "Footer", "Products", "Product", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RealFbsSplitDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final List<DynamicElementDTO> dynamicElements;
    private final Footer footer;
    private final Header header;
    private final Products products;
    private final String scrollWidgetKey;
    private final Boolean showSeparator;
    private final TextAtom subHeader;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Footer;", "", "isRounded", "", "<init>", "(Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Footer;", "equals", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012J>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\b\u0010\u0012¨\u0006 "}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Header;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "leftIcon", "Lru/ozon/uni/atoms/data/button/Icon;", "rightIconButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "isRounded", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;Ljava/lang/Boolean;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getLeftIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getRightIconButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;Ljava/lang/Boolean;)Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Header;", "equals", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Header {
        public static final int $stable = (ButtonV3Atom.LargeIconButton.$stable | Icon.$stable) | TextAtom.$stable;
        private final Boolean isRounded;
        private final Icon leftIcon;
        private final ButtonV3Atom.LargeIconButton rightIconButton;
        private final TextAtom text;

        public Header(TextAtom textAtom, Icon icon, ButtonV3Atom.LargeIconButton largeIconButton, Boolean bool) {
            this.text = textAtom;
            this.leftIcon = icon;
            this.rightIconButton = largeIconButton;
            this.isRounded = bool;
        }

        public static /* synthetic */ Header copy$default(Header header, TextAtom textAtom, Icon icon, ButtonV3Atom.LargeIconButton largeIconButton, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = header.text;
            }
            if ((i11 & 2) != 0) {
                icon = header.leftIcon;
            }
            if ((i11 & 4) != 0) {
                largeIconButton = header.rightIconButton;
            }
            if ((i11 & 8) != 0) {
                bool = header.isRounded;
            }
            return header.copy(textAtom, icon, largeIconButton, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final TextAtom getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final Icon getLeftIcon() {
            return this.leftIcon;
        }

        /* renamed from: component3, reason: from getter */
        public final ButtonV3Atom.LargeIconButton getRightIconButton() {
            return this.rightIconButton;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getIsRounded() {
            return this.isRounded;
        }

        @NotNull
        public final Header copy(TextAtom text, Icon leftIcon, ButtonV3Atom.LargeIconButton rightIconButton, Boolean isRounded) {
            return new Header(text, leftIcon, rightIconButton, isRounded);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.d(this.text, header.text) && Intrinsics.d(this.leftIcon, header.leftIcon) && Intrinsics.d(this.rightIconButton, header.rightIconButton) && Intrinsics.d(this.isRounded, header.isRounded);
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
            int hashCode3 = (hashCode2 + (largeIconButton == null ? 0 : largeIconButton.hashCode())) * 31;
            Boolean bool = this.isRounded;
            return hashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        public final Boolean isRounded() {
            return this.isRounded;
        }

        @NotNull
        public String toString() {
            return "Header(text=" + this.text + ", leftIcon=" + this.leftIcon + ", rightIconButton=" + this.rightIconButton + ", isRounded=" + this.isRounded + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Product;", "", "image", "", "text", "badge", "Lru/ozon/uni/atoms/data/badge/Badge;", "borderColor", "promoIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "promoIconPosition", "Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;)V", "getImage", "()Ljava/lang/String;", "getText", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getBorderColor", "getPromoIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPromoIconPosition", "()Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        public static /* synthetic */ Product copy$default(Product product, String str, String str2, Badge badge, String str3, IconDTO iconDTO, PromoIconPosition promoIconPosition, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = product.image;
            }
            if ((i11 & 2) != 0) {
                str2 = product.text;
            }
            if ((i11 & 4) != 0) {
                badge = product.badge;
            }
            if ((i11 & 8) != 0) {
                str3 = product.borderColor;
            }
            if ((i11 & 16) != 0) {
                iconDTO = product.promoIcon;
            }
            if ((i11 & 32) != 0) {
                promoIconPosition = product.promoIconPosition;
            }
            IconDTO iconDTO2 = iconDTO;
            PromoIconPosition promoIconPosition2 = promoIconPosition;
            return product.copy(str, str2, badge, str3, iconDTO2, promoIconPosition2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component3, reason: from getter */
        public final Badge getBadge() {
            return this.badge;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: component5, reason: from getter */
        public final IconDTO getPromoIcon() {
            return this.promoIcon;
        }

        /* renamed from: component6, reason: from getter */
        public final PromoIconPosition getPromoIconPosition() {
            return this.promoIconPosition;
        }

        @NotNull
        public final Product copy(@NotNull String image, String text, Badge badge, String borderColor, IconDTO promoIcon, PromoIconPosition promoIconPosition) {
            Intrinsics.checkNotNullParameter(image, "image");
            return new Product(image, text, badge, borderColor, promoIcon, promoIconPosition);
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

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Products;", "", "elements", "", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Product;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getElements", "()Ljava/util/List;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Products {
        public static final int $stable = 8;
        private final AtomActionDTO action;

        @NotNull
        private final List<Product> elements;

        public Products(@NotNull List<Product> elements, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.elements = elements;
            this.action = atomActionDTO;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Products copy$default(Products products, List list, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = products.elements;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = products.action;
            }
            return products.copy(list, atomActionDTO);
        }

        @NotNull
        public final List<Product> component1() {
            return this.elements;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final Products copy(@NotNull List<Product> elements, AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return new Products(elements, action);
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
    public RealFbsSplitDTO(AtomActionDTO atomActionDTO, Header header, TextAtom textAtom, Products products, List<? extends DynamicElementDTO> list, Map<String, TokenizedTrackingInfo> map, String str, Boolean bool, Footer footer) {
        this.action = atomActionDTO;
        this.header = header;
        this.subHeader = textAtom;
        this.products = products;
        this.dynamicElements = list;
        this.trackingInfo = map;
        this.scrollWidgetKey = str;
        this.showSeparator = bool;
        this.footer = footer;
    }

    public static /* synthetic */ RealFbsSplitDTO copy$default(RealFbsSplitDTO realFbsSplitDTO, AtomActionDTO atomActionDTO, Header header, TextAtom textAtom, Products products, List list, Map map, String str, Boolean bool, Footer footer, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomActionDTO = realFbsSplitDTO.action;
        }
        if ((i11 & 2) != 0) {
            header = realFbsSplitDTO.header;
        }
        if ((i11 & 4) != 0) {
            textAtom = realFbsSplitDTO.subHeader;
        }
        if ((i11 & 8) != 0) {
            products = realFbsSplitDTO.products;
        }
        if ((i11 & 16) != 0) {
            list = realFbsSplitDTO.dynamicElements;
        }
        if ((i11 & 32) != 0) {
            map = realFbsSplitDTO.trackingInfo;
        }
        if ((i11 & 64) != 0) {
            str = realFbsSplitDTO.scrollWidgetKey;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            bool = realFbsSplitDTO.showSeparator;
        }
        if ((i11 & 256) != 0) {
            footer = realFbsSplitDTO.footer;
        }
        Boolean bool2 = bool;
        Footer footer2 = footer;
        Map map2 = map;
        String str2 = str;
        List list2 = list;
        TextAtom textAtom2 = textAtom;
        return realFbsSplitDTO.copy(atomActionDTO, header, textAtom2, products, list2, map2, str2, bool2, footer2);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getDynamicElements$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    /* renamed from: component3, reason: from getter */
    public final TextAtom getSubHeader() {
        return this.subHeader;
    }

    /* renamed from: component4, reason: from getter */
    public final Products getProducts() {
        return this.products;
    }

    public final List<DynamicElementDTO> component5() {
        return this.dynamicElements;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final String getScrollWidgetKey() {
        return this.scrollWidgetKey;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getShowSeparator() {
        return this.showSeparator;
    }

    /* renamed from: component9, reason: from getter */
    public final Footer getFooter() {
        return this.footer;
    }

    @NotNull
    public final RealFbsSplitDTO copy(AtomActionDTO action, Header header, TextAtom subHeader, Products products, List<? extends DynamicElementDTO> dynamicElements, Map<String, TokenizedTrackingInfo> trackingInfo, String scrollWidgetKey, Boolean showSeparator, Footer footer) {
        return new RealFbsSplitDTO(action, header, subHeader, products, dynamicElements, trackingInfo, scrollWidgetKey, showSeparator, footer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealFbsSplitDTO)) {
            return false;
        }
        RealFbsSplitDTO realFbsSplitDTO = (RealFbsSplitDTO) other;
        return Intrinsics.d(this.action, realFbsSplitDTO.action) && Intrinsics.d(this.header, realFbsSplitDTO.header) && Intrinsics.d(this.subHeader, realFbsSplitDTO.subHeader) && Intrinsics.d(this.products, realFbsSplitDTO.products) && Intrinsics.d(this.dynamicElements, realFbsSplitDTO.dynamicElements) && Intrinsics.d(this.trackingInfo, realFbsSplitDTO.trackingInfo) && Intrinsics.d(this.scrollWidgetKey, realFbsSplitDTO.scrollWidgetKey) && Intrinsics.d(this.showSeparator, realFbsSplitDTO.showSeparator) && Intrinsics.d(this.footer, realFbsSplitDTO.footer);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final List<DynamicElementDTO> getDynamicElements() {
        return this.dynamicElements;
    }

    public final Footer getFooter() {
        return this.footer;
    }

    public final Header getHeader() {
        return this.header;
    }

    public final Products getProducts() {
        return this.products;
    }

    public final String getScrollWidgetKey() {
        return this.scrollWidgetKey;
    }

    public final Boolean getShowSeparator() {
        return this.showSeparator;
    }

    public final TextAtom getSubHeader() {
        return this.subHeader;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
        Header header = this.header;
        int hashCode2 = (hashCode + (header == null ? 0 : header.hashCode())) * 31;
        TextAtom textAtom = this.subHeader;
        int hashCode3 = (hashCode2 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        Products products = this.products;
        int hashCode4 = (hashCode3 + (products == null ? 0 : products.hashCode())) * 31;
        List<DynamicElementDTO> list = this.dynamicElements;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.scrollWidgetKey;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.showSeparator;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Footer footer = this.footer;
        return hashCode8 + (footer != null ? footer.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        AtomActionDTO atomActionDTO = this.action;
        Header header = this.header;
        TextAtom textAtom = this.subHeader;
        Products products = this.products;
        List<DynamicElementDTO> list = this.dynamicElements;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        String str = this.scrollWidgetKey;
        Boolean bool = this.showSeparator;
        Footer footer = this.footer;
        StringBuilder sb2 = new StringBuilder("RealFbsSplitDTO(action=");
        sb2.append(atomActionDTO);
        sb2.append(", header=");
        sb2.append(header);
        sb2.append(", subHeader=");
        sb2.append(textAtom);
        sb2.append(", products=");
        sb2.append(products);
        sb2.append(", dynamicElements=");
        sb2.append(list);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", scrollWidgetKey=");
        a.d(bool, str, ", showSeparator=", ", footer=", sb2);
        sb2.append(footer);
        sb2.append(")");
        return sb2.toString();
    }
}
