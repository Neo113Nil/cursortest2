package ru.ozon.app.android.universalwidgets.messenger.tilescroll.data;

import G.g;
import HY.b;
import Xc.a;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.labelList.LabelListAtom;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.app.android.storefront.data.tiles.blur.BlurMoleculeContentDTO;
import ru.ozon.app.android.storefront.data.tiles.blur.BlurMoleculeDTO;
import ru.ozon.app.android.storefront.data.tiles.common.ContentMode;
import ru.ozon.app.android.storefront.data.tiles.labellist.LabelListDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003'()BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000eHÆ\u0003JU\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "items", "", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Tile;", "options", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "sharedData", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$SharedData;", "<init>", "(Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;Ljava/util/List;Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options;Ljava/util/Map;Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$SharedData;)V", "getHeader", "()Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "getItems", "()Ljava/util/List;", "getOptions", "()Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options;", "getTrackingInfo", "()Ljava/util/Map;", "getSharedData", "()Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$SharedData;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Tile", "Options", "SharedData", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TileScrollBlockDTO {
    private final HeaderDTO header;

    @NotNull
    private final List<Tile> items;
    private final Options options;
    private final SharedData sharedData;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$SharedData;", "", "blurItemInfo", "", "", "Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeContentDTO;", "<init>", "(Ljava/util/Map;)V", "getBlurItemInfo", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SharedData {
        private final Map<String, BlurMoleculeContentDTO> blurItemInfo;

        public SharedData(Map<String, BlurMoleculeContentDTO> map) {
            this.blurItemInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SharedData copy$default(SharedData sharedData, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = sharedData.blurItemInfo;
            }
            return sharedData.copy(map);
        }

        public final Map<String, BlurMoleculeContentDTO> component1() {
            return this.blurItemInfo;
        }

        @NotNull
        public final SharedData copy(Map<String, BlurMoleculeContentDTO> blurItemInfo) {
            return new SharedData(blurItemInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SharedData) && Intrinsics.d(this.blurItemInfo, ((SharedData) other).blurItemInfo);
        }

        public final Map<String, BlurMoleculeContentDTO> getBlurItemInfo() {
            return this.blurItemInfo;
        }

        public int hashCode() {
            Map<String, BlurMoleculeContentDTO> map = this.blurItemInfo;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        @NotNull
        public String toString() {
            return b.b("SharedData(blurItemInfo=", ")", this.blurItemInfo);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001cJf\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u000e\u0010\u001c¨\u0006,"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Tile;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "imageComponent", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Tile$ImageComponent;", "mainState", "", "addToCartButton", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "isTextTagSupported", "", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Tile$ImageComponent;Ljava/util/List;Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;Ljava/lang/Boolean;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getImageComponent", "()Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Tile$ImageComponent;", "getMainState", "()Ljava/util/List;", "getAddToCartButton", "()Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Tile$ImageComponent;Ljava/util/List;Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;Ljava/lang/Boolean;)Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Tile;", "equals", "other", "hashCode", "", "toString", "ImageComponent", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Tile {
        private final AtomActionDTO action;
        private final AddToCartButtonDTO addToCartButton;

        @NotNull
        private final ImageComponent imageComponent;
        private final Boolean isTextTagSupported;
        private final List<Object> mainState;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Tile$ImageComponent;", "", "imageItem", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Tile$ImageComponent$ImageItem;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "favoriteProductMoleculeV2", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;", "blurItem", "Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeDTO;", "<init>", "(Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Tile$ImageComponent$ImageItem;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeDTO;)V", "getImageItem", "()Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Tile$ImageComponent$ImageItem;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getFavoriteProductMoleculeV2", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;", "getBlurItem", "()Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ImageItem", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class ImageComponent {
            private final BadgeDTO badge;
            private final BlurMoleculeDTO blurItem;
            private final FavoriteProductMoleculeV2 favoriteProductMoleculeV2;

            @NotNull
            private final ImageItem imageItem;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Tile$ImageComponent$ImageItem;", "", "imageUrl", "", "contentMode", "Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;)V", "getImageUrl", "()Ljava/lang/String;", "getContentMode", "()Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        public Tile(AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, @NotNull ImageComponent imageComponent, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "textAtom", type = TextDTO.class), @ProtoOneOfSignature(name = "price", type = PriceDTO.class), @ProtoOneOfSignature(name = "labelListV2", type = LabelListDTO.class), @ProtoOneOfSignature(name = "labelList", type = LabelListAtom.class)}) @ProtoOneOf(label = "type") List<? extends Object> list, AddToCartButtonDTO addToCartButtonDTO, Boolean bool) {
            Intrinsics.checkNotNullParameter(imageComponent, "imageComponent");
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.imageComponent = imageComponent;
            this.mainState = list;
            this.addToCartButton = addToCartButtonDTO;
            this.isTextTagSupported = bool;
        }

        public static /* synthetic */ Tile copy$default(Tile tile, AtomActionDTO atomActionDTO, Map map, ImageComponent imageComponent, List list, AddToCartButtonDTO addToCartButtonDTO, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                atomActionDTO = tile.action;
            }
            if ((i11 & 2) != 0) {
                map = tile.trackingInfo;
            }
            if ((i11 & 4) != 0) {
                imageComponent = tile.imageComponent;
            }
            if ((i11 & 8) != 0) {
                list = tile.mainState;
            }
            if ((i11 & 16) != 0) {
                addToCartButtonDTO = tile.addToCartButton;
            }
            if ((i11 & 32) != 0) {
                bool = tile.isTextTagSupported;
            }
            AddToCartButtonDTO addToCartButtonDTO2 = addToCartButtonDTO;
            Boolean bool2 = bool;
            return tile.copy(atomActionDTO, map, imageComponent, list, addToCartButtonDTO2, bool2);
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

        @NotNull
        public final Tile copy(AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull ImageComponent imageComponent, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "textAtom", type = TextDTO.class), @ProtoOneOfSignature(name = "price", type = PriceDTO.class), @ProtoOneOfSignature(name = "labelListV2", type = LabelListDTO.class), @ProtoOneOfSignature(name = "labelList", type = LabelListAtom.class)}) @ProtoOneOf(label = "type") List<? extends Object> mainState, AddToCartButtonDTO addToCartButton, Boolean isTextTagSupported) {
            Intrinsics.checkNotNullParameter(imageComponent, "imageComponent");
            return new Tile(action, trackingInfo, imageComponent, mainState, addToCartButton, isTextTagSupported);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tile)) {
                return false;
            }
            Tile tile = (Tile) other;
            return Intrinsics.d(this.action, tile.action) && Intrinsics.d(this.trackingInfo, tile.trackingInfo) && Intrinsics.d(this.imageComponent, tile.imageComponent) && Intrinsics.d(this.mainState, tile.mainState) && Intrinsics.d(this.addToCartButton, tile.addToCartButton) && Intrinsics.d(this.isTextTagSupported, tile.isTextTagSupported);
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
            return hashCode4 + (bool != null ? bool.hashCode() : 0);
        }

        public final Boolean isTextTagSupported() {
            return this.isTextTagSupported;
        }

        @NotNull
        public String toString() {
            return "Tile(action=" + this.action + ", trackingInfo=" + this.trackingInfo + ", imageComponent=" + this.imageComponent + ", mainState=" + this.mainState + ", addToCartButton=" + this.addToCartButton + ", isTextTagSupported=" + this.isTextTagSupported + ")";
        }
    }

    public TileScrollBlockDTO(HeaderDTO headerDTO, @NotNull List<Tile> items, Options options, Map<String, TokenizedTrackingInfo> map, SharedData sharedData) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.header = headerDTO;
        this.items = items;
        this.options = options;
        this.trackingInfo = map;
        this.sharedData = sharedData;
    }

    public static /* synthetic */ TileScrollBlockDTO copy$default(TileScrollBlockDTO tileScrollBlockDTO, HeaderDTO headerDTO, List list, Options options, Map map, SharedData sharedData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            headerDTO = tileScrollBlockDTO.header;
        }
        if ((i11 & 2) != 0) {
            list = tileScrollBlockDTO.items;
        }
        if ((i11 & 4) != 0) {
            options = tileScrollBlockDTO.options;
        }
        if ((i11 & 8) != 0) {
            map = tileScrollBlockDTO.trackingInfo;
        }
        if ((i11 & 16) != 0) {
            sharedData = tileScrollBlockDTO.sharedData;
        }
        SharedData sharedData2 = sharedData;
        Options options2 = options;
        return tileScrollBlockDTO.copy(headerDTO, list, options2, map, sharedData2);
    }

    /* renamed from: component1, reason: from getter */
    public final HeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<Tile> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final Options getOptions() {
        return this.options;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final SharedData getSharedData() {
        return this.sharedData;
    }

    @NotNull
    public final TileScrollBlockDTO copy(HeaderDTO header, @NotNull List<Tile> items, Options options, Map<String, TokenizedTrackingInfo> trackingInfo, SharedData sharedData) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new TileScrollBlockDTO(header, items, options, trackingInfo, sharedData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileScrollBlockDTO)) {
            return false;
        }
        TileScrollBlockDTO tileScrollBlockDTO = (TileScrollBlockDTO) other;
        return Intrinsics.d(this.header, tileScrollBlockDTO.header) && Intrinsics.d(this.items, tileScrollBlockDTO.items) && Intrinsics.d(this.options, tileScrollBlockDTO.options) && Intrinsics.d(this.trackingInfo, tileScrollBlockDTO.trackingInfo) && Intrinsics.d(this.sharedData, tileScrollBlockDTO.sharedData);
    }

    public final HeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<Tile> getItems() {
        return this.items;
    }

    public final Options getOptions() {
        return this.options;
    }

    public final SharedData getSharedData() {
        return this.sharedData;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        HeaderDTO headerDTO = this.header;
        int b11 = g.b((headerDTO == null ? 0 : headerDTO.hashCode()) * 31, 31, this.items);
        Options options = this.options;
        int hashCode = (b11 + (options == null ? 0 : options.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        SharedData sharedData = this.sharedData;
        return hashCode2 + (sharedData != null ? sharedData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TileScrollBlockDTO(header=" + this.header + ", items=" + this.items + ", options=" + this.options + ", trackingInfo=" + this.trackingInfo + ", sharedData=" + this.sharedData + ")";
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001f B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options;", "", "backgroundColor", "", "visibleCellsCount", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$VisibleCellsCount;", "smallTileOptions", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$TileOptions;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$VisibleCellsCount;Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$TileOptions;Lru/ozon/uni/atoms/data/TestInfo;)V", "getBackgroundColor", "()Ljava/lang/String;", "getVisibleCellsCount", "()Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$VisibleCellsCount;", "getSmallTileOptions", "()Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$TileOptions;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "VisibleCellsCount", "TileOptions", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Options {
        private final String backgroundColor;
        private final TileOptions smallTileOptions;
        private final TestInfo testInfo;
        private final VisibleCellsCount visibleCellsCount;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0002\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$TileOptions;", "", "isCompactFavoriteIcon", "", "enableParanja", "imageRatio", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$TileOptions$ImageRatio;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$TileOptions$ImageRatio;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnableParanja", "getImageRatio", "()Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$TileOptions$ImageRatio;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$TileOptions$ImageRatio;)Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$TileOptions;", "equals", "other", "hashCode", "", "toString", "", "ImageRatio", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class TileOptions {
            private final Boolean enableParanja;
            private final ImageRatio imageRatio;
            private final Boolean isCompactFavoriteIcon;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$TileOptions$ImageRatio;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE_RATIO_1_1", "IMAGE_RATIO_3_4", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
                    $ENTRIES = Xc.b.a($values);
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

            public TileOptions() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ TileOptions copy$default(TileOptions tileOptions, Boolean bool, Boolean bool2, ImageRatio imageRatio, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    bool = tileOptions.isCompactFavoriteIcon;
                }
                if ((i11 & 2) != 0) {
                    bool2 = tileOptions.enableParanja;
                }
                if ((i11 & 4) != 0) {
                    imageRatio = tileOptions.imageRatio;
                }
                return tileOptions.copy(bool, bool2, imageRatio);
            }

            /* renamed from: component1, reason: from getter */
            public final Boolean getIsCompactFavoriteIcon() {
                return this.isCompactFavoriteIcon;
            }

            /* renamed from: component2, reason: from getter */
            public final Boolean getEnableParanja() {
                return this.enableParanja;
            }

            /* renamed from: component3, reason: from getter */
            public final ImageRatio getImageRatio() {
                return this.imageRatio;
            }

            @NotNull
            public final TileOptions copy(Boolean isCompactFavoriteIcon, Boolean enableParanja, ImageRatio imageRatio) {
                return new TileOptions(isCompactFavoriteIcon, enableParanja, imageRatio);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TileOptions)) {
                    return false;
                }
                TileOptions tileOptions = (TileOptions) other;
                return Intrinsics.d(this.isCompactFavoriteIcon, tileOptions.isCompactFavoriteIcon) && Intrinsics.d(this.enableParanja, tileOptions.enableParanja) && this.imageRatio == tileOptions.imageRatio;
            }

            public final Boolean getEnableParanja() {
                return this.enableParanja;
            }

            public final ImageRatio getImageRatio() {
                return this.imageRatio;
            }

            public int hashCode() {
                Boolean bool = this.isCompactFavoriteIcon;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.enableParanja;
                int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                ImageRatio imageRatio = this.imageRatio;
                return hashCode2 + (imageRatio != null ? imageRatio.hashCode() : 0);
            }

            public final Boolean isCompactFavoriteIcon() {
                return this.isCompactFavoriteIcon;
            }

            @NotNull
            public String toString() {
                return "TileOptions(isCompactFavoriteIcon=" + this.isCompactFavoriteIcon + ", enableParanja=" + this.enableParanja + ", imageRatio=" + this.imageRatio + ")";
            }

            public TileOptions(Boolean bool, Boolean bool2, ImageRatio imageRatio) {
                this.isCompactFavoriteIcon = bool;
                this.enableParanja = bool2;
                this.imageRatio = imageRatio;
            }

            public /* synthetic */ TileOptions(Boolean bool, Boolean bool2, ImageRatio imageRatio, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? Boolean.FALSE : bool, (i11 & 2) != 0 ? Boolean.FALSE : bool2, (i11 & 4) != 0 ? ImageRatio.IMAGE_RATIO_1_1 : imageRatio);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$VisibleCellsCount;", "", "<init>", "(Ljava/lang/String;I)V", "COUNT_3_5", "COUNT_2_4", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class VisibleCellsCount {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ VisibleCellsCount[] $VALUES;
            public static final VisibleCellsCount COUNT_3_5 = new VisibleCellsCount("COUNT_3_5", 0);
            public static final VisibleCellsCount COUNT_2_4 = new VisibleCellsCount("COUNT_2_4", 1);

            private static final /* synthetic */ VisibleCellsCount[] $values() {
                return new VisibleCellsCount[]{COUNT_3_5, COUNT_2_4};
            }

            static {
                VisibleCellsCount[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Xc.b.a($values);
            }

            private VisibleCellsCount(String str, int i11) {
            }

            public static VisibleCellsCount valueOf(String str) {
                return (VisibleCellsCount) Enum.valueOf(VisibleCellsCount.class, str);
            }

            public static VisibleCellsCount[] values() {
                return (VisibleCellsCount[]) $VALUES.clone();
            }
        }

        public Options(String str, VisibleCellsCount visibleCellsCount, TileOptions tileOptions, TestInfo testInfo) {
            this.backgroundColor = str;
            this.visibleCellsCount = visibleCellsCount;
            this.smallTileOptions = tileOptions;
            this.testInfo = testInfo;
        }

        public static /* synthetic */ Options copy$default(Options options, String str, VisibleCellsCount visibleCellsCount, TileOptions tileOptions, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = options.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                visibleCellsCount = options.visibleCellsCount;
            }
            if ((i11 & 4) != 0) {
                tileOptions = options.smallTileOptions;
            }
            if ((i11 & 8) != 0) {
                testInfo = options.testInfo;
            }
            return options.copy(str, visibleCellsCount, tileOptions, testInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final VisibleCellsCount getVisibleCellsCount() {
            return this.visibleCellsCount;
        }

        /* renamed from: component3, reason: from getter */
        public final TileOptions getSmallTileOptions() {
            return this.smallTileOptions;
        }

        /* renamed from: component4, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final Options copy(String backgroundColor, VisibleCellsCount visibleCellsCount, TileOptions smallTileOptions, TestInfo testInfo) {
            return new Options(backgroundColor, visibleCellsCount, smallTileOptions, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Options)) {
                return false;
            }
            Options options = (Options) other;
            return Intrinsics.d(this.backgroundColor, options.backgroundColor) && this.visibleCellsCount == options.visibleCellsCount && Intrinsics.d(this.smallTileOptions, options.smallTileOptions) && Intrinsics.d(this.testInfo, options.testInfo);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final TileOptions getSmallTileOptions() {
            return this.smallTileOptions;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final VisibleCellsCount getVisibleCellsCount() {
            return this.visibleCellsCount;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            VisibleCellsCount visibleCellsCount = this.visibleCellsCount;
            int hashCode2 = (hashCode + (visibleCellsCount == null ? 0 : visibleCellsCount.hashCode())) * 31;
            TileOptions tileOptions = this.smallTileOptions;
            int hashCode3 = (hashCode2 + (tileOptions == null ? 0 : tileOptions.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode3 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Options(backgroundColor=" + this.backgroundColor + ", visibleCellsCount=" + this.visibleCellsCount + ", smallTileOptions=" + this.smallTileOptions + ", testInfo=" + this.testInfo + ")";
        }

        public /* synthetic */ Options(String str, VisibleCellsCount visibleCellsCount, TileOptions tileOptions, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? VisibleCellsCount.COUNT_3_5 : visibleCellsCount, tileOptions, testInfo);
        }
    }

    public /* synthetic */ TileScrollBlockDTO(HeaderDTO headerDTO, List list, Options options, Map map, SharedData sharedData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(headerDTO, list, options, (i11 & 8) != 0 ? null : map, sharedData);
    }
}
