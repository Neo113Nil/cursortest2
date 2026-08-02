package ru.ozon.app.android.ugc.widgets.selectionsList.data;

import B0.A0;
import Bl.C2639a;
import El.C2971a;
import G.g;
import Ns.b;
import Pk0.h;
import WZ.t;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0081\b\u0018\u00002\u00020\u0001:\u00071234567BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00068"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI;", "items", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "horizontalPadding", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO$LayoutType;", "layout", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Landroid/os/Parcelable;", "scrollState", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO$LayoutType;LWZ/t;Landroid/os/Parcelable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getHorizontalPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO$LayoutType;", "getLayout", "()Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO$LayoutType;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Landroid/os/Parcelable;", "getScrollState", "()Landroid/os/Parcelable;", "setScrollState", "(Landroid/os/Parcelable;)V", "SelectionsListItemVI", "HeaderVO", "MediaContent", "TileFooterContent", "SelectionItemCommon", "Background", "TopRightContent", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SelectionsListVI implements c {
    private final CommonCellSettings.LayoutPadding horizontalPadding;
    private final long id;

    @NotNull
    private final List<SelectionsListItemVI> items;

    @NotNull
    private final SelectionsListDTO.LayoutType layout;
    private Parcelable scrollState;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$Background;", "", "ImageWrapper", "ColorWrapper", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$Background$ColorWrapper;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$Background$ImageWrapper;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Background {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$Background$ColorWrapper;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$Background;", "", "color", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getColor", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ColorWrapper implements Background {

            @NotNull
            private final String color;

            public ColorWrapper(@NotNull String color) {
                Intrinsics.checkNotNullParameter(color, "color");
                this.color = color;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ColorWrapper) && Intrinsics.d(this.color, ((ColorWrapper) other).color);
            }

            @NotNull
            public final String getColor() {
                return this.color;
            }

            public int hashCode() {
                return this.color.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("ColorWrapper(color=", this.color, ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$Background$ImageWrapper;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$Background;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ImageWrapper implements Background {

            @NotNull
            private final ImageDTO image;

            public ImageWrapper(@NotNull ImageDTO image) {
                Intrinsics.checkNotNullParameter(image, "image");
                this.image = image;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ImageWrapper) && Intrinsics.d(this.image, ((ImageWrapper) other).image);
            }

            @NotNull
            public final ImageDTO getImage() {
                return this.image;
            }

            public int hashCode() {
                return this.image.hashCode();
            }

            @NotNull
            public String toString() {
                return "ImageWrapper(image=" + this.image + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$HeaderVO;", "", "SocialHeader", "BadgeWrapper", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$HeaderVO$BadgeWrapper;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$HeaderVO$SocialHeader;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface HeaderVO {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$HeaderVO$BadgeWrapper;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$HeaderVO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BadgeWrapper implements HeaderVO {

            @NotNull
            private final BadgeDTO badge;

            public BadgeWrapper(@NotNull BadgeDTO badge) {
                Intrinsics.checkNotNullParameter(badge, "badge");
                this.badge = badge;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BadgeWrapper) && Intrinsics.d(this.badge, ((BadgeWrapper) other).badge);
            }

            @NotNull
            public final BadgeDTO getBadge() {
                return this.badge;
            }

            public int hashCode() {
                return this.badge.hashCode();
            }

            @NotNull
            public String toString() {
                return "BadgeWrapper(badge=" + this.badge + ")";
            }
        }

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$HeaderVO$SocialHeader;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$HeaderVO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "verifyIcon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getVerifyIcon", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SocialHeader implements HeaderVO {
            private final AtomAction action;

            @NotNull
            private final IconDTO icon;

            @NotNull
            private final TextDTO title;
            private final t tokenizedEvent;
            private final IconDTO verifyIcon;

            public SocialHeader(@NotNull IconDTO icon, @NotNull TextDTO title, IconDTO iconDTO, AtomAction atomAction, t tVar) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(title, "title");
                this.icon = icon;
                this.title = title;
                this.verifyIcon = iconDTO;
                this.action = atomAction;
                this.tokenizedEvent = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SocialHeader)) {
                    return false;
                }
                SocialHeader socialHeader = (SocialHeader) other;
                return Intrinsics.d(this.icon, socialHeader.icon) && Intrinsics.d(this.title, socialHeader.title) && Intrinsics.d(this.verifyIcon, socialHeader.verifyIcon) && Intrinsics.d(this.action, socialHeader.action) && Intrinsics.d(this.tokenizedEvent, socialHeader.tokenizedEvent);
            }

            public final AtomAction getAction() {
                return this.action;
            }

            @NotNull
            public final IconDTO getIcon() {
                return this.icon;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public final IconDTO getVerifyIcon() {
                return this.verifyIcon;
            }

            public int hashCode() {
                int a11 = b.a(this.title, this.icon.hashCode() * 31, 31);
                IconDTO iconDTO = this.verifyIcon;
                int hashCode = (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
                AtomAction atomAction = this.action;
                int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                IconDTO iconDTO = this.icon;
                TextDTO textDTO = this.title;
                IconDTO iconDTO2 = this.verifyIcon;
                AtomAction atomAction = this.action;
                t tVar = this.tokenizedEvent;
                StringBuilder i11 = Bi.b.i("SocialHeader(icon=", ", title=", ", verifyIcon=", iconDTO, textDTO);
                i11.append(iconDTO2);
                i11.append(", action=");
                i11.append(atomAction);
                i11.append(", tokenizedEvent=");
                return Tl.b.d(i11, tVar, ")");
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$MediaContent;", "", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MediaContent {

        @NotNull
        private final ImageDTO image;

        public MediaContent(@NotNull ImageDTO image) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MediaContent) && Intrinsics.d(this.image, ((MediaContent) other).image);
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public int hashCode() {
            return this.image.hashCode();
        }

        @NotNull
        public String toString() {
            return "MediaContent(image=" + this.image + ")";
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b(\u0010'R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionItemCommon;", "", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$Background;", "background", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TopRightContent;", "topRightContent", "", "", "topGradient", "bottomGradient", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$Background;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TopRightContent;Ljava/util/List;Ljava/util/List;LWZ/t;Lru/ozon/uni/atoms/data/TestInfo;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$Background;", "getBackground", "()Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$Background;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TopRightContent;", "getTopRightContent", "()Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TopRightContent;", "Ljava/util/List;", "getTopGradient", "()Ljava/util/List;", "getBottomGradient", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectionItemCommon {
        private final AtomAction action;
        private final Background background;
        private final List<String> bottomGradient;
        private final TestInfo testInfo;
        private final t tokenizedEvent;
        private final List<String> topGradient;
        private final TopRightContent topRightContent;

        public SelectionItemCommon(Background background, AtomAction atomAction, TopRightContent topRightContent, List<String> list, List<String> list2, t tVar, TestInfo testInfo) {
            this.background = background;
            this.action = atomAction;
            this.topRightContent = topRightContent;
            this.topGradient = list;
            this.bottomGradient = list2;
            this.tokenizedEvent = tVar;
            this.testInfo = testInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectionItemCommon)) {
                return false;
            }
            SelectionItemCommon selectionItemCommon = (SelectionItemCommon) other;
            return Intrinsics.d(this.background, selectionItemCommon.background) && Intrinsics.d(this.action, selectionItemCommon.action) && Intrinsics.d(this.topRightContent, selectionItemCommon.topRightContent) && Intrinsics.d(this.topGradient, selectionItemCommon.topGradient) && Intrinsics.d(this.bottomGradient, selectionItemCommon.bottomGradient) && Intrinsics.d(this.tokenizedEvent, selectionItemCommon.tokenizedEvent) && Intrinsics.d(this.testInfo, selectionItemCommon.testInfo);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final Background getBackground() {
            return this.background;
        }

        public final List<String> getBottomGradient() {
            return this.bottomGradient;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public final List<String> getTopGradient() {
            return this.topGradient;
        }

        public final TopRightContent getTopRightContent() {
            return this.topRightContent;
        }

        public int hashCode() {
            Background background = this.background;
            int hashCode = (background == null ? 0 : background.hashCode()) * 31;
            AtomAction atomAction = this.action;
            int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            TopRightContent topRightContent = this.topRightContent;
            int hashCode3 = (hashCode2 + (topRightContent == null ? 0 : topRightContent.hashCode())) * 31;
            List<String> list = this.topGradient;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.bottomGradient;
            int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            int hashCode6 = (hashCode5 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode6 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Background background = this.background;
            AtomAction atomAction = this.action;
            TopRightContent topRightContent = this.topRightContent;
            List<String> list = this.topGradient;
            List<String> list2 = this.bottomGradient;
            t tVar = this.tokenizedEvent;
            TestInfo testInfo = this.testInfo;
            StringBuilder sb2 = new StringBuilder("SelectionItemCommon(background=");
            sb2.append(background);
            sb2.append(", action=");
            sb2.append(atomAction);
            sb2.append(", topRightContent=");
            sb2.append(topRightContent);
            sb2.append(", topGradient=");
            sb2.append(list);
            sb2.append(", bottomGradient=");
            sb2.append(list2);
            sb2.append(", tokenizedEvent=");
            sb2.append(tVar);
            sb2.append(", testInfo=");
            return h.c(sb2, testInfo, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent;", "", "SelectionInfo", "SelectionItemFooter", "ReviewPreviewTitleRating", "PriceWrapper", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent$PriceWrapper;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent$ReviewPreviewTitleRating;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent$SelectionInfo;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent$SelectionItemFooter;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface TileFooterContent {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent$PriceWrapper;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PriceWrapper implements TileFooterContent {
            public static final int $stable = PriceDTO.$stable;

            @NotNull
            private final PriceDTO price;

            public PriceWrapper(@NotNull PriceDTO price) {
                Intrinsics.checkNotNullParameter(price, "price");
                this.price = price;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PriceWrapper) && Intrinsics.d(this.price, ((PriceWrapper) other).price);
            }

            @NotNull
            public final PriceDTO getPrice() {
                return this.price;
            }

            public int hashCode() {
                return this.price.hashCode();
            }

            @NotNull
            public String toString() {
                return "PriceWrapper(price=" + this.price + ")";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent$ReviewPreviewTitleRating;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent;", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/icon/IconDTO;", "ratingIcon", "ratingValue", "separator", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRatingIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRatingValue", "getSeparator", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ReviewPreviewTitleRating implements TileFooterContent {
            public static final int $stable = IconDTO.$stable;
            private final IconDTO ratingIcon;
            private final TextDTO ratingValue;
            private final TextDTO separator;

            @NotNull
            private final TextDTO title;

            public ReviewPreviewTitleRating(@NotNull TextDTO title, IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.ratingIcon = iconDTO;
                this.ratingValue = textDTO;
                this.separator = textDTO2;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReviewPreviewTitleRating)) {
                    return false;
                }
                ReviewPreviewTitleRating reviewPreviewTitleRating = (ReviewPreviewTitleRating) other;
                return Intrinsics.d(this.title, reviewPreviewTitleRating.title) && Intrinsics.d(this.ratingIcon, reviewPreviewTitleRating.ratingIcon) && Intrinsics.d(this.ratingValue, reviewPreviewTitleRating.ratingValue) && Intrinsics.d(this.separator, reviewPreviewTitleRating.separator);
            }

            public final IconDTO getRatingIcon() {
                return this.ratingIcon;
            }

            public final TextDTO getRatingValue() {
                return this.ratingValue;
            }

            public final TextDTO getSeparator() {
                return this.separator;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                IconDTO iconDTO = this.ratingIcon;
                int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
                TextDTO textDTO = this.ratingValue;
                int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                TextDTO textDTO2 = this.separator;
                return hashCode3 + (textDTO2 != null ? textDTO2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.title;
                IconDTO iconDTO = this.ratingIcon;
                TextDTO textDTO2 = this.ratingValue;
                TextDTO textDTO3 = this.separator;
                StringBuilder d11 = C2639a.d("ReviewPreviewTitleRating(title=", ", ratingIcon=", ", ratingValue=", iconDTO, textDTO);
                d11.append(textDTO2);
                d11.append(", separator=");
                d11.append(textDTO3);
                d11.append(")");
                return d11.toString();
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent$SelectionInfo;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent;", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "productImages", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getProductImages", "()Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SelectionInfo implements TileFooterContent {
            private final List<ProductMediaDTO> productImages;

            @NotNull
            private final TextDTO title;

            public SelectionInfo(@NotNull TextDTO title, List<ProductMediaDTO> list) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.productImages = list;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelectionInfo)) {
                    return false;
                }
                SelectionInfo selectionInfo = (SelectionInfo) other;
                return Intrinsics.d(this.title, selectionInfo.title) && Intrinsics.d(this.productImages, selectionInfo.productImages);
            }

            public final List<ProductMediaDTO> getProductImages() {
                return this.productImages;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                List<ProductMediaDTO> list = this.productImages;
                return hashCode + (list == null ? 0 : list.hashCode());
            }

            @NotNull
            public String toString() {
                return "SelectionInfo(title=" + this.title + ", productImages=" + this.productImages + ")";
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent$SelectionItemFooter;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent;", "", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent$SelectionItemFooter$StatusSelectionVO;", "statusList", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getStatusList", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "StatusSelectionVO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SelectionItemFooter implements TileFooterContent {
            private final AtomAction action;
            private final IconDTO icon;

            @NotNull
            private final List<StatusSelectionVO> statusList;

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent$SelectionItemFooter$StatusSelectionVO;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class StatusSelectionVO {
                public static final int $stable = IconDTO.$stable;

                @NotNull
                private final IconDTO icon;

                @NotNull
                private final TextDTO text;

                public StatusSelectionVO(@NotNull IconDTO icon, @NotNull TextDTO text) {
                    Intrinsics.checkNotNullParameter(icon, "icon");
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.icon = icon;
                    this.text = text;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof StatusSelectionVO)) {
                        return false;
                    }
                    StatusSelectionVO statusSelectionVO = (StatusSelectionVO) other;
                    return Intrinsics.d(this.icon, statusSelectionVO.icon) && Intrinsics.d(this.text, statusSelectionVO.text);
                }

                @NotNull
                public final IconDTO getIcon() {
                    return this.icon;
                }

                @NotNull
                public final TextDTO getText() {
                    return this.text;
                }

                public int hashCode() {
                    return this.text.hashCode() + (this.icon.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return "StatusSelectionVO(icon=" + this.icon + ", text=" + this.text + ")";
                }
            }

            public SelectionItemFooter(@NotNull List<StatusSelectionVO> statusList, IconDTO iconDTO, AtomAction atomAction) {
                Intrinsics.checkNotNullParameter(statusList, "statusList");
                this.statusList = statusList;
                this.icon = iconDTO;
                this.action = atomAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelectionItemFooter)) {
                    return false;
                }
                SelectionItemFooter selectionItemFooter = (SelectionItemFooter) other;
                return Intrinsics.d(this.statusList, selectionItemFooter.statusList) && Intrinsics.d(this.icon, selectionItemFooter.icon) && Intrinsics.d(this.action, selectionItemFooter.action);
            }

            public final AtomAction getAction() {
                return this.action;
            }

            public final IconDTO getIcon() {
                return this.icon;
            }

            @NotNull
            public final List<StatusSelectionVO> getStatusList() {
                return this.statusList;
            }

            public int hashCode() {
                int hashCode = this.statusList.hashCode() * 31;
                IconDTO iconDTO = this.icon;
                int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
                AtomAction atomAction = this.action;
                return hashCode2 + (atomAction != null ? atomAction.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                List<StatusSelectionVO> list = this.statusList;
                IconDTO iconDTO = this.icon;
                AtomAction atomAction = this.action;
                StringBuilder sb2 = new StringBuilder("SelectionItemFooter(statusList=");
                sb2.append(list);
                sb2.append(", icon=");
                sb2.append(iconDTO);
                sb2.append(", action=");
                return B6.b.b(sb2, atomAction, ")");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TopRightContent;", "", "IconWrapper", "FavoriteWrapper", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TopRightContent$FavoriteWrapper;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TopRightContent$IconWrapper;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface TopRightContent {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TopRightContent$FavoriteWrapper;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TopRightContent;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "favoriteMolecule", "<init>", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "getFavoriteMolecule", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FavoriteWrapper implements TopRightContent {

            @NotNull
            private final FavoriteProductMolecule favoriteMolecule;

            public FavoriteWrapper(@NotNull FavoriteProductMolecule favoriteMolecule) {
                Intrinsics.checkNotNullParameter(favoriteMolecule, "favoriteMolecule");
                this.favoriteMolecule = favoriteMolecule;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FavoriteWrapper) && Intrinsics.d(this.favoriteMolecule, ((FavoriteWrapper) other).favoriteMolecule);
            }

            @NotNull
            public final FavoriteProductMolecule getFavoriteMolecule() {
                return this.favoriteMolecule;
            }

            public int hashCode() {
                return this.favoriteMolecule.hashCode();
            }

            @NotNull
            public String toString() {
                return "FavoriteWrapper(favoriteMolecule=" + this.favoriteMolecule + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TopRightContent$IconWrapper;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TopRightContent;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class IconWrapper implements TopRightContent {
            public static final int $stable = IconDTO.$stable;

            @NotNull
            private final IconDTO icon;

            public IconWrapper(@NotNull IconDTO icon) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.icon = icon;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IconWrapper) && Intrinsics.d(this.icon, ((IconWrapper) other).icon);
            }

            @NotNull
            public final IconDTO getIcon() {
                return this.icon;
            }

            public int hashCode() {
                return this.icon.hashCode();
            }

            @NotNull
            public String toString() {
                return "IconWrapper(icon=" + this.icon + ")";
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectionsListVI(long j11, @NotNull List<? extends SelectionsListItemVI> items, CommonCellSettings.LayoutPadding layoutPadding, @NotNull SelectionsListDTO.LayoutType layout, t tVar, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.id = j11;
        this.items = items;
        this.horizontalPadding = layoutPadding;
        this.layout = layout;
        this.tokenizedEvent = tVar;
        this.scrollState = parcelable;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionsListVI)) {
            return false;
        }
        SelectionsListVI selectionsListVI = (SelectionsListVI) other;
        return this.id == selectionsListVI.id && Intrinsics.d(this.items, selectionsListVI.items) && this.horizontalPadding == selectionsListVI.horizontalPadding && this.layout == selectionsListVI.layout && Intrinsics.d(this.tokenizedEvent, selectionsListVI.tokenizedEvent) && Intrinsics.d(this.scrollState, selectionsListVI.scrollState);
    }

    public final CommonCellSettings.LayoutPadding getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<SelectionsListItemVI> getItems() {
        return this.items;
    }

    public final Parcelable getScrollState() {
        return this.scrollState;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.items);
        CommonCellSettings.LayoutPadding layoutPadding = this.horizontalPadding;
        int hashCode = (this.layout.hashCode() + ((b11 + (layoutPadding == null ? 0 : layoutPadding.hashCode())) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Parcelable parcelable = this.scrollState;
        return hashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    public final void setScrollState(Parcelable parcelable) {
        this.scrollState = parcelable;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<SelectionsListItemVI> list = this.items;
        CommonCellSettings.LayoutPadding layoutPadding = this.horizontalPadding;
        SelectionsListDTO.LayoutType layoutType = this.layout;
        t tVar = this.tokenizedEvent;
        Parcelable parcelable = this.scrollState;
        StringBuilder b11 = Lh.b.b(j11, "SelectionsListVI(id=", ", items=", list);
        b11.append(", horizontalPadding=");
        b11.append(layoutPadding);
        b11.append(", layout=");
        b11.append(layoutType);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", scrollState=");
        b11.append(parcelable);
        b11.append(")");
        return b11.toString();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI;", "Ll20/c;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionItemCommon;", "getSelectionItemCommon", "()Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionItemCommon;", "selectionItemCommon", "TileItem", "EmptyItem", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI$EmptyItem;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI$TileItem;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface SelectionsListItemVI extends c {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class DefaultImpls {
            public static Integer getScrollWidgetKey(@NotNull SelectionsListItemVI selectionsListItemVI) {
                return null;
            }

            public static int getViewItemKey(@NotNull SelectionsListItemVI selectionsListItemVI) {
                return selectionsListItemVI.hashCode();
            }
        }

        SelectionItemCommon getSelectionItemCommon();

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010\u0012¨\u0006,"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI$EmptyItem;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI;", "", "id", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionItemCommon;", "selectionItemCommon", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "widgetViewEvent", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "overlayColor", "<init>", "(JLru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionItemCommon;LWZ/t;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionItemCommon;", "getSelectionItemCommon", "()Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionItemCommon;", "LWZ/t;", "getWidgetViewEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getOverlayColor", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class EmptyItem implements SelectionsListItemVI {

            @NotNull
            private final IconDTO icon;
            private final long id;
            private final String overlayColor;
            private final SelectionItemCommon selectionItemCommon;

            @NotNull
            private final TextDTO title;
            private final t widgetViewEvent;

            public EmptyItem(long j11, SelectionItemCommon selectionItemCommon, t tVar, @NotNull IconDTO icon, @NotNull TextDTO title, String str) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(title, "title");
                this.id = j11;
                this.selectionItemCommon = selectionItemCommon;
                this.widgetViewEvent = tVar;
                this.icon = icon;
                this.title = title;
                this.overlayColor = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EmptyItem)) {
                    return false;
                }
                EmptyItem emptyItem = (EmptyItem) other;
                return this.id == emptyItem.id && Intrinsics.d(this.selectionItemCommon, emptyItem.selectionItemCommon) && Intrinsics.d(this.widgetViewEvent, emptyItem.widgetViewEvent) && Intrinsics.d(this.icon, emptyItem.icon) && Intrinsics.d(this.title, emptyItem.title) && Intrinsics.d(this.overlayColor, emptyItem.overlayColor);
            }

            @NotNull
            public final IconDTO getIcon() {
                return this.icon;
            }

            @Override // l20.c
            public long getId() {
                return this.id;
            }

            public final String getOverlayColor() {
                return this.overlayColor;
            }

            @Override // l20.c
            public Integer getScrollWidgetKey() {
                return DefaultImpls.getScrollWidgetKey(this);
            }

            @Override // ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI.SelectionsListItemVI
            public SelectionItemCommon getSelectionItemCommon() {
                return this.selectionItemCommon;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            @Override // l20.c
            public int getViewItemKey() {
                return DefaultImpls.getViewItemKey(this);
            }

            public t getWidgetViewEvent() {
                return this.widgetViewEvent;
            }

            public int hashCode() {
                int hashCode = Long.hashCode(this.id) * 31;
                SelectionItemCommon selectionItemCommon = this.selectionItemCommon;
                int hashCode2 = (hashCode + (selectionItemCommon == null ? 0 : selectionItemCommon.hashCode())) * 31;
                t tVar = this.widgetViewEvent;
                int a11 = b.a(this.title, C2971a.a(this.icon, (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31), 31);
                String str = this.overlayColor;
                return a11 + (str != null ? str.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "EmptyItem(id=" + this.id + ", selectionItemCommon=" + this.selectionItemCommon + ", widgetViewEvent=" + this.widgetViewEvent + ", icon=" + this.icon + ", title=" + this.title + ", overlayColor=" + this.overlayColor + ")";
            }

            public /* synthetic */ EmptyItem(long j11, SelectionItemCommon selectionItemCommon, t tVar, IconDTO iconDTO, TextDTO textDTO, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(j11, selectionItemCommon, (i11 & 4) != 0 ? null : tVar, iconDTO, textDTO, str);
            }
        }

        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI$TileItem;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI;", "", "id", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionItemCommon;", "selectionItemCommon", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "widgetViewEvent", "", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent;", "footerItems", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$MediaContent;", "mediaContent", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$HeaderVO;", CommentV3DTO.HEADER_FIELD_NAME, "<init>", "(JLru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionItemCommon;LWZ/t;Ljava/util/List;Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$MediaContent;Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$HeaderVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionItemCommon;", "getSelectionItemCommon", "()Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionItemCommon;", "LWZ/t;", "getWidgetViewEvent", "()LWZ/t;", "Ljava/util/List;", "getFooterItems", "()Ljava/util/List;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$MediaContent;", "getMediaContent", "()Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$MediaContent;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$HeaderVO;", "getHeader", "()Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$HeaderVO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TileItem implements SelectionsListItemVI {
            private final List<TileFooterContent> footerItems;
            private final HeaderVO header;
            private final long id;

            @NotNull
            private final MediaContent mediaContent;
            private final SelectionItemCommon selectionItemCommon;
            private final t widgetViewEvent;

            /* JADX WARN: Multi-variable type inference failed */
            public TileItem(long j11, SelectionItemCommon selectionItemCommon, t tVar, List<? extends TileFooterContent> list, @NotNull MediaContent mediaContent, HeaderVO headerVO) {
                Intrinsics.checkNotNullParameter(mediaContent, "mediaContent");
                this.id = j11;
                this.selectionItemCommon = selectionItemCommon;
                this.widgetViewEvent = tVar;
                this.footerItems = list;
                this.mediaContent = mediaContent;
                this.header = headerVO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TileItem)) {
                    return false;
                }
                TileItem tileItem = (TileItem) other;
                return this.id == tileItem.id && Intrinsics.d(this.selectionItemCommon, tileItem.selectionItemCommon) && Intrinsics.d(this.widgetViewEvent, tileItem.widgetViewEvent) && Intrinsics.d(this.footerItems, tileItem.footerItems) && Intrinsics.d(this.mediaContent, tileItem.mediaContent) && Intrinsics.d(this.header, tileItem.header);
            }

            public final List<TileFooterContent> getFooterItems() {
                return this.footerItems;
            }

            public final HeaderVO getHeader() {
                return this.header;
            }

            @Override // l20.c
            public long getId() {
                return this.id;
            }

            @NotNull
            public final MediaContent getMediaContent() {
                return this.mediaContent;
            }

            @Override // l20.c
            public Integer getScrollWidgetKey() {
                return DefaultImpls.getScrollWidgetKey(this);
            }

            @Override // ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI.SelectionsListItemVI
            public SelectionItemCommon getSelectionItemCommon() {
                return this.selectionItemCommon;
            }

            @Override // l20.c
            public int getViewItemKey() {
                return DefaultImpls.getViewItemKey(this);
            }

            public t getWidgetViewEvent() {
                return this.widgetViewEvent;
            }

            public int hashCode() {
                int hashCode = Long.hashCode(this.id) * 31;
                SelectionItemCommon selectionItemCommon = this.selectionItemCommon;
                int hashCode2 = (hashCode + (selectionItemCommon == null ? 0 : selectionItemCommon.hashCode())) * 31;
                t tVar = this.widgetViewEvent;
                int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
                List<TileFooterContent> list = this.footerItems;
                int hashCode4 = (this.mediaContent.hashCode() + ((hashCode3 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
                HeaderVO headerVO = this.header;
                return hashCode4 + (headerVO != null ? headerVO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "TileItem(id=" + this.id + ", selectionItemCommon=" + this.selectionItemCommon + ", widgetViewEvent=" + this.widgetViewEvent + ", footerItems=" + this.footerItems + ", mediaContent=" + this.mediaContent + ", header=" + this.header + ")";
            }

            public /* synthetic */ TileItem(long j11, SelectionItemCommon selectionItemCommon, t tVar, List list, MediaContent mediaContent, HeaderVO headerVO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(j11, selectionItemCommon, (i11 & 4) != 0 ? null : tVar, list, mediaContent, headerVO);
            }
        }
    }

    public /* synthetic */ SelectionsListVI(long j11, List list, CommonCellSettings.LayoutPadding layoutPadding, SelectionsListDTO.LayoutType layoutType, t tVar, Parcelable parcelable, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, layoutPadding, layoutType, tVar, (i11 & 32) != 0 ? null : parcelable);
    }
}
