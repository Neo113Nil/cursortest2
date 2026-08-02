package ru.ozon.app.android.storefront.data.tiles.smalltile;

import C.o0;
import Kk.C3532b;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.labelList.LabelListAtom;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.app.android.storefront.data.tiles.blur.BlurMoleculeDTO;
import ru.ozon.app.android.storefront.data.tiles.common.ContentMode;
import ru.ozon.app.android.storefront.data.tiles.labellist.LabelListDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0004/012B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jr\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u000f2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u000e\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00063"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "imageComponent", "Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$ImageComponent;", "mainState", "", "addToCartButton", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "isTextTagSupported", "", "islandBackgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$ImageComponent;Ljava/util/List;Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getImageComponent", "()Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$ImageComponent;", "getMainState", "()Ljava/util/List;", "getAddToCartButton", "()Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIslandBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$ImageComponent;Ljava/util/List;Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;Ljava/lang/Boolean;Ljava/lang/String;)Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO;", "equals", "other", "hashCode", "", "toString", "Companion", "ImageComponent", "ImageItem", "SmallTileOptions", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SmallTileMoleculeDTO {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String LABEL_LIST = "labelList";

    @Deprecated
    @NotNull
    public static final String LABEL_LIST_V2 = "labelListV2";

    @Deprecated
    @NotNull
    public static final String PRICE = "price";

    @Deprecated
    @NotNull
    public static final String TEXT = "textAtom";
    private final AtomActionDTO action;
    private final AddToCartButtonDTO addToCartButton;

    @NotNull
    private final ImageComponent imageComponent;
    private final Boolean isTextTagSupported;
    private final String islandBackgroundColor;
    private final List<Object> mainState;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$Companion;", "", "<init>", "()V", "TEXT", "", "PRICE", "LABEL_LIST", "LABEL_LIST_V2", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$ImageComponent;", "", "imageItem", "Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$ImageItem;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "favoriteProductMoleculeV2", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;", "blurItem", "Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeDTO;", "<init>", "(Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$ImageItem;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeDTO;)V", "getImageItem", "()Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$ImageItem;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getFavoriteProductMoleculeV2", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;", "getBlurItem", "()Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageComponent {
        private final BadgeDTO badge;
        private final BlurMoleculeDTO blurItem;
        private final FavoriteProductMoleculeV2 favoriteProductMoleculeV2;

        @NotNull
        private final ImageItem imageItem;

        public ImageComponent(@NotNull ImageItem imageItem, BadgeDTO badgeDTO, FavoriteProductMoleculeV2 favoriteProductMoleculeV2, BlurMoleculeDTO blurMoleculeDTO) {
            Intrinsics.checkNotNullParameter(imageItem, "imageItem");
            this.imageItem = imageItem;
            this.badge = badgeDTO;
            this.favoriteProductMoleculeV2 = favoriteProductMoleculeV2;
            this.blurItem = blurMoleculeDTO;
        }

        public static /* synthetic */ ImageComponent copy$default(ImageComponent imageComponent, ImageItem imageItem, BadgeDTO badgeDTO, FavoriteProductMoleculeV2 favoriteProductMoleculeV2, BlurMoleculeDTO blurMoleculeDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageItem = imageComponent.imageItem;
            }
            if ((i11 & 2) != 0) {
                badgeDTO = imageComponent.badge;
            }
            if ((i11 & 4) != 0) {
                favoriteProductMoleculeV2 = imageComponent.favoriteProductMoleculeV2;
            }
            if ((i11 & 8) != 0) {
                blurMoleculeDTO = imageComponent.blurItem;
            }
            return imageComponent.copy(imageItem, badgeDTO, favoriteProductMoleculeV2, blurMoleculeDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageItem getImageItem() {
            return this.imageItem;
        }

        /* renamed from: component2, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        /* renamed from: component3, reason: from getter */
        public final FavoriteProductMoleculeV2 getFavoriteProductMoleculeV2() {
            return this.favoriteProductMoleculeV2;
        }

        /* renamed from: component4, reason: from getter */
        public final BlurMoleculeDTO getBlurItem() {
            return this.blurItem;
        }

        @NotNull
        public final ImageComponent copy(@NotNull ImageItem imageItem, BadgeDTO badge, FavoriteProductMoleculeV2 favoriteProductMoleculeV2, BlurMoleculeDTO blurItem) {
            Intrinsics.checkNotNullParameter(imageItem, "imageItem");
            return new ImageComponent(imageItem, badge, favoriteProductMoleculeV2, blurItem);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageComponent)) {
                return false;
            }
            ImageComponent imageComponent = (ImageComponent) other;
            return Intrinsics.d(this.imageItem, imageComponent.imageItem) && Intrinsics.d(this.badge, imageComponent.badge) && Intrinsics.d(this.favoriteProductMoleculeV2, imageComponent.favoriteProductMoleculeV2) && Intrinsics.d(this.blurItem, imageComponent.blurItem);
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final BlurMoleculeDTO getBlurItem() {
            return this.blurItem;
        }

        public final FavoriteProductMoleculeV2 getFavoriteProductMoleculeV2() {
            return this.favoriteProductMoleculeV2;
        }

        @NotNull
        public final ImageItem getImageItem() {
            return this.imageItem;
        }

        public int hashCode() {
            int hashCode = this.imageItem.hashCode() * 31;
            BadgeDTO badgeDTO = this.badge;
            int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            FavoriteProductMoleculeV2 favoriteProductMoleculeV2 = this.favoriteProductMoleculeV2;
            int hashCode3 = (hashCode2 + (favoriteProductMoleculeV2 == null ? 0 : favoriteProductMoleculeV2.hashCode())) * 31;
            BlurMoleculeDTO blurMoleculeDTO = this.blurItem;
            return hashCode3 + (blurMoleculeDTO != null ? blurMoleculeDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ImageComponent(imageItem=" + this.imageItem + ", badge=" + this.badge + ", favoriteProductMoleculeV2=" + this.favoriteProductMoleculeV2 + ", blurItem=" + this.blurItem + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$ImageItem;", "", "imageUrl", "", "contentMode", "Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;)V", "getImageUrl", "()Ljava/lang/String;", "getContentMode", "()Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageItem {
        private final ContentMode contentMode;

        @NotNull
        private final String imageUrl;

        public ImageItem(@NotNull String imageUrl, ContentMode contentMode) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            this.imageUrl = imageUrl;
            this.contentMode = contentMode;
        }

        public static /* synthetic */ ImageItem copy$default(ImageItem imageItem, String str, ContentMode contentMode, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = imageItem.imageUrl;
            }
            if ((i11 & 2) != 0) {
                contentMode = imageItem.contentMode;
            }
            return imageItem.copy(str, contentMode);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final ContentMode getContentMode() {
            return this.contentMode;
        }

        @NotNull
        public final ImageItem copy(@NotNull String imageUrl, ContentMode contentMode) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            return new ImageItem(imageUrl, contentMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageItem)) {
                return false;
            }
            ImageItem imageItem = (ImageItem) other;
            return Intrinsics.d(this.imageUrl, imageItem.imageUrl) && this.contentMode == imageItem.contentMode;
        }

        public final ContentMode getContentMode() {
            return this.contentMode;
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }

        public int hashCode() {
            int hashCode = this.imageUrl.hashCode() * 31;
            ContentMode contentMode = this.contentMode;
            return hashCode + (contentMode == null ? 0 : contentMode.hashCode());
        }

        @NotNull
        public String toString() {
            return "ImageItem(imageUrl=" + this.imageUrl + ", contentMode=" + this.contentMode + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$SmallTileOptions;", "", "isCompactFavoriteIcon", "", "enableParanja", "imageRatio", "Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$SmallTileOptions$ImageRatio;", "<init>", "(ZZLru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$SmallTileOptions$ImageRatio;)V", "()Z", "getEnableParanja", "getImageRatio", "()Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$SmallTileOptions$ImageRatio;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "ImageRatio", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class SmallTileOptions {
        private final boolean enableParanja;

        @NotNull
        private final ImageRatio imageRatio;
        private final boolean isCompactFavoriteIcon;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$SmallTileOptions$ImageRatio;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE_RATIO_1_1", "IMAGE_RATIO_3_4", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ImageRatio {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ ImageRatio[] $VALUES;

            @i(name = "IMAGE_RATIO_1_1")
            public static final ImageRatio IMAGE_RATIO_1_1 = new ImageRatio("IMAGE_RATIO_1_1", 0);

            @i(name = "IMAGE_RATIO_3_4")
            public static final ImageRatio IMAGE_RATIO_3_4 = new ImageRatio("IMAGE_RATIO_3_4", 1);

            private static final /* synthetic */ ImageRatio[] $values() {
                return new ImageRatio[]{IMAGE_RATIO_1_1, IMAGE_RATIO_3_4};
            }

            static {
                ImageRatio[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private ImageRatio(String str, int i11) {
            }

            public static ImageRatio valueOf(String str) {
                return (ImageRatio) Enum.valueOf(ImageRatio.class, str);
            }

            public static ImageRatio[] values() {
                return (ImageRatio[]) $VALUES.clone();
            }
        }

        public SmallTileOptions() {
            this(false, false, null, 7, null);
        }

        public static /* synthetic */ SmallTileOptions copy$default(SmallTileOptions smallTileOptions, boolean z11, boolean z12, ImageRatio imageRatio, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = smallTileOptions.isCompactFavoriteIcon;
            }
            if ((i11 & 2) != 0) {
                z12 = smallTileOptions.enableParanja;
            }
            if ((i11 & 4) != 0) {
                imageRatio = smallTileOptions.imageRatio;
            }
            return smallTileOptions.copy(z11, z12, imageRatio);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCompactFavoriteIcon() {
            return this.isCompactFavoriteIcon;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getEnableParanja() {
            return this.enableParanja;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ImageRatio getImageRatio() {
            return this.imageRatio;
        }

        @NotNull
        public final SmallTileOptions copy(boolean isCompactFavoriteIcon, boolean enableParanja, @NotNull ImageRatio imageRatio) {
            Intrinsics.checkNotNullParameter(imageRatio, "imageRatio");
            return new SmallTileOptions(isCompactFavoriteIcon, enableParanja, imageRatio);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SmallTileOptions)) {
                return false;
            }
            SmallTileOptions smallTileOptions = (SmallTileOptions) other;
            return this.isCompactFavoriteIcon == smallTileOptions.isCompactFavoriteIcon && this.enableParanja == smallTileOptions.enableParanja && this.imageRatio == smallTileOptions.imageRatio;
        }

        public final boolean getEnableParanja() {
            return this.enableParanja;
        }

        @NotNull
        public final ImageRatio getImageRatio() {
            return this.imageRatio;
        }

        public int hashCode() {
            return this.imageRatio.hashCode() + C3532b.a(Boolean.hashCode(this.isCompactFavoriteIcon) * 31, 31, this.enableParanja);
        }

        public final boolean isCompactFavoriteIcon() {
            return this.isCompactFavoriteIcon;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isCompactFavoriteIcon;
            boolean z12 = this.enableParanja;
            ImageRatio imageRatio = this.imageRatio;
            StringBuilder d11 = Lh.a.d("SmallTileOptions(isCompactFavoriteIcon=", ", enableParanja=", ", imageRatio=", z11, z12);
            d11.append(imageRatio);
            d11.append(")");
            return d11.toString();
        }

        public SmallTileOptions(boolean z11, boolean z12, @NotNull ImageRatio imageRatio) {
            Intrinsics.checkNotNullParameter(imageRatio, "imageRatio");
            this.isCompactFavoriteIcon = z11;
            this.enableParanja = z12;
            this.imageRatio = imageRatio;
        }

        public /* synthetic */ SmallTileOptions(boolean z11, boolean z12, ImageRatio imageRatio, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? ImageRatio.IMAGE_RATIO_1_1 : imageRatio);
        }
    }

    public SmallTileMoleculeDTO(AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, @NotNull ImageComponent imageComponent, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "textAtom", type = TextDTO.class), @ProtoOneOfSignature(name = "labelList", type = LabelListAtom.class), @ProtoOneOfSignature(name = "price", type = PriceDTO.class), @ProtoOneOfSignature(name = "labelListV2", type = LabelListDTO.class)}) @ProtoOneOf(label = "type") List<? extends Object> list, AddToCartButtonDTO addToCartButtonDTO, Boolean bool, String str) {
        Intrinsics.checkNotNullParameter(imageComponent, "imageComponent");
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.imageComponent = imageComponent;
        this.mainState = list;
        this.addToCartButton = addToCartButtonDTO;
        this.isTextTagSupported = bool;
        this.islandBackgroundColor = str;
    }

    public static /* synthetic */ SmallTileMoleculeDTO copy$default(SmallTileMoleculeDTO smallTileMoleculeDTO, AtomActionDTO atomActionDTO, Map map, ImageComponent imageComponent, List list, AddToCartButtonDTO addToCartButtonDTO, Boolean bool, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomActionDTO = smallTileMoleculeDTO.action;
        }
        if ((i11 & 2) != 0) {
            map = smallTileMoleculeDTO.trackingInfo;
        }
        if ((i11 & 4) != 0) {
            imageComponent = smallTileMoleculeDTO.imageComponent;
        }
        if ((i11 & 8) != 0) {
            list = smallTileMoleculeDTO.mainState;
        }
        if ((i11 & 16) != 0) {
            addToCartButtonDTO = smallTileMoleculeDTO.addToCartButton;
        }
        if ((i11 & 32) != 0) {
            bool = smallTileMoleculeDTO.isTextTagSupported;
        }
        if ((i11 & 64) != 0) {
            str = smallTileMoleculeDTO.islandBackgroundColor;
        }
        Boolean bool2 = bool;
        String str2 = str;
        AddToCartButtonDTO addToCartButtonDTO2 = addToCartButtonDTO;
        ImageComponent imageComponent2 = imageComponent;
        return smallTileMoleculeDTO.copy(atomActionDTO, map, imageComponent2, list, addToCartButtonDTO2, bool2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ImageComponent getImageComponent() {
        return this.imageComponent;
    }

    public final List<Object> component4() {
        return this.mainState;
    }

    /* renamed from: component5, reason: from getter */
    public final AddToCartButtonDTO getAddToCartButton() {
        return this.addToCartButton;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsTextTagSupported() {
        return this.isTextTagSupported;
    }

    /* renamed from: component7, reason: from getter */
    public final String getIslandBackgroundColor() {
        return this.islandBackgroundColor;
    }

    @NotNull
    public final SmallTileMoleculeDTO copy(AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull ImageComponent imageComponent, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "textAtom", type = TextDTO.class), @ProtoOneOfSignature(name = "labelList", type = LabelListAtom.class), @ProtoOneOfSignature(name = "price", type = PriceDTO.class), @ProtoOneOfSignature(name = "labelListV2", type = LabelListDTO.class)}) @ProtoOneOf(label = "type") List<? extends Object> mainState, AddToCartButtonDTO addToCartButton, Boolean isTextTagSupported, String islandBackgroundColor) {
        Intrinsics.checkNotNullParameter(imageComponent, "imageComponent");
        return new SmallTileMoleculeDTO(action, trackingInfo, imageComponent, mainState, addToCartButton, isTextTagSupported, islandBackgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmallTileMoleculeDTO)) {
            return false;
        }
        SmallTileMoleculeDTO smallTileMoleculeDTO = (SmallTileMoleculeDTO) other;
        return Intrinsics.d(this.action, smallTileMoleculeDTO.action) && Intrinsics.d(this.trackingInfo, smallTileMoleculeDTO.trackingInfo) && Intrinsics.d(this.imageComponent, smallTileMoleculeDTO.imageComponent) && Intrinsics.d(this.mainState, smallTileMoleculeDTO.mainState) && Intrinsics.d(this.addToCartButton, smallTileMoleculeDTO.addToCartButton) && Intrinsics.d(this.isTextTagSupported, smallTileMoleculeDTO.isTextTagSupported) && Intrinsics.d(this.islandBackgroundColor, smallTileMoleculeDTO.islandBackgroundColor);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final AddToCartButtonDTO getAddToCartButton() {
        return this.addToCartButton;
    }

    @NotNull
    public final ImageComponent getImageComponent() {
        return this.imageComponent;
    }

    public final String getIslandBackgroundColor() {
        return this.islandBackgroundColor;
    }

    public final List<Object> getMainState() {
        return this.mainState;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (this.imageComponent.hashCode() + ((hashCode + (map == null ? 0 : map.hashCode())) * 31)) * 31;
        List<Object> list = this.mainState;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        AddToCartButtonDTO addToCartButtonDTO = this.addToCartButton;
        int hashCode4 = (hashCode3 + (addToCartButtonDTO == null ? 0 : addToCartButtonDTO.hashCode())) * 31;
        Boolean bool = this.isTextTagSupported;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.islandBackgroundColor;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final Boolean isTextTagSupported() {
        return this.isTextTagSupported;
    }

    @NotNull
    public String toString() {
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        ImageComponent imageComponent = this.imageComponent;
        List<Object> list = this.mainState;
        AddToCartButtonDTO addToCartButtonDTO = this.addToCartButton;
        Boolean bool = this.isTextTagSupported;
        String str = this.islandBackgroundColor;
        StringBuilder sb2 = new StringBuilder("SmallTileMoleculeDTO(action=");
        sb2.append(atomActionDTO);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", imageComponent=");
        sb2.append(imageComponent);
        sb2.append(", mainState=");
        sb2.append(list);
        sb2.append(", addToCartButton=");
        sb2.append(addToCartButtonDTO);
        sb2.append(", isTextTagSupported=");
        sb2.append(bool);
        sb2.append(", islandBackgroundColor=");
        return o0.c(sb2, str, ")");
    }
}
