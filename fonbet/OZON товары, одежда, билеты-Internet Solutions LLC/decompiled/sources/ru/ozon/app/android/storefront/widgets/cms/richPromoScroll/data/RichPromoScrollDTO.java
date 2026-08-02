package ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.data;

import B3.p;
import D40.b;
import G.g;
import Kk.C3532b;
import Lh.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003$%&B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/data/RichPromoScrollDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "backgroundImage", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "islandSeparatorBlock", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "catalogTileScroll", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/data/RichPromoScrollDTO$CatalogTileScrollDTO;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/data/RichPromoScrollDTO$CatalogTileScrollDTO;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getBackgroundImage", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getIslandSeparatorBlock", "()Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "getCatalogTileScroll", "()Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/data/RichPromoScrollDTO$CatalogTileScrollDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "CatalogTileScrollDTO", "TileItem", "SpacersDTO", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RichPromoScrollDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;

    @NotNull
    private final String backgroundImage;
    private final CatalogTileScrollDTO catalogTileScroll;

    @NotNull
    private final ImageDTO image;
    private final IslandSeparatorDTO islandSeparatorBlock;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006%"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/data/RichPromoScrollDTO$CatalogTileScrollDTO;", "", "tiles", "", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/data/RichPromoScrollDTO$TileItem;", "hasFirstItemSeparator", "", "spacers", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/data/RichPromoScrollDTO$SpacersDTO;", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;ZLru/ozon/app/android/storefront/widgets/cms/richPromoScroll/data/RichPromoScrollDTO$SpacersDTO;Ljava/lang/String;Ljava/util/Map;)V", "getTiles", "()Ljava/util/List;", "getHasFirstItemSeparator", "()Z", "getSpacers", "()Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/data/RichPromoScrollDTO$SpacersDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CatalogTileScrollDTO {
        public static final int $stable = 8;
        private final String backgroundColor;
        private final boolean hasFirstItemSeparator;
        private final SpacersDTO spacers;

        @NotNull
        private final List<TileItem> tiles;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public CatalogTileScrollDTO(@NotNull List<TileItem> tiles, boolean z11, SpacersDTO spacersDTO, String str, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(tiles, "tiles");
            this.tiles = tiles;
            this.hasFirstItemSeparator = z11;
            this.spacers = spacersDTO;
            this.backgroundColor = str;
            this.trackingInfo = map;
        }

        public static /* synthetic */ CatalogTileScrollDTO copy$default(CatalogTileScrollDTO catalogTileScrollDTO, List list, boolean z11, SpacersDTO spacersDTO, String str, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = catalogTileScrollDTO.tiles;
            }
            if ((i11 & 2) != 0) {
                z11 = catalogTileScrollDTO.hasFirstItemSeparator;
            }
            if ((i11 & 4) != 0) {
                spacersDTO = catalogTileScrollDTO.spacers;
            }
            if ((i11 & 8) != 0) {
                str = catalogTileScrollDTO.backgroundColor;
            }
            if ((i11 & 16) != 0) {
                map = catalogTileScrollDTO.trackingInfo;
            }
            Map map2 = map;
            SpacersDTO spacersDTO2 = spacersDTO;
            return catalogTileScrollDTO.copy(list, z11, spacersDTO2, str, map2);
        }

        @NotNull
        public final List<TileItem> component1() {
            return this.tiles;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHasFirstItemSeparator() {
            return this.hasFirstItemSeparator;
        }

        /* renamed from: component3, reason: from getter */
        public final SpacersDTO getSpacers() {
            return this.spacers;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final CatalogTileScrollDTO copy(@NotNull List<TileItem> tiles, boolean hasFirstItemSeparator, SpacersDTO spacers, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(tiles, "tiles");
            return new CatalogTileScrollDTO(tiles, hasFirstItemSeparator, spacers, backgroundColor, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CatalogTileScrollDTO)) {
                return false;
            }
            CatalogTileScrollDTO catalogTileScrollDTO = (CatalogTileScrollDTO) other;
            return Intrinsics.d(this.tiles, catalogTileScrollDTO.tiles) && this.hasFirstItemSeparator == catalogTileScrollDTO.hasFirstItemSeparator && Intrinsics.d(this.spacers, catalogTileScrollDTO.spacers) && Intrinsics.d(this.backgroundColor, catalogTileScrollDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, catalogTileScrollDTO.trackingInfo);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final boolean getHasFirstItemSeparator() {
            return this.hasFirstItemSeparator;
        }

        public final SpacersDTO getSpacers() {
            return this.spacers;
        }

        @NotNull
        public final List<TileItem> getTiles() {
            return this.tiles;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = C3532b.a(this.tiles.hashCode() * 31, 31, this.hasFirstItemSeparator);
            SpacersDTO spacersDTO = this.spacers;
            int hashCode = (a11 + (spacersDTO == null ? 0 : spacersDTO.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            List<TileItem> list = this.tiles;
            boolean z11 = this.hasFirstItemSeparator;
            SpacersDTO spacersDTO = this.spacers;
            String str = this.backgroundColor;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("CatalogTileScrollDTO(tiles=");
            sb2.append(list);
            sb2.append(", hasFirstItemSeparator=");
            sb2.append(z11);
            sb2.append(", spacers=");
            sb2.append(spacersDTO);
            sb2.append(", backgroundColor=");
            sb2.append(str);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/data/RichPromoScrollDTO$SpacersDTO;", "", "left", "Lru/ozon/uni/atoms/data/common/Paddings;", "right", "top", "bottom", "between", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getLeft", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRight", "getTop", "getBottom", "getBetween", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SpacersDTO {
        public static final int $stable = 0;
        private final Paddings between;
        private final Paddings bottom;
        private final Paddings left;
        private final Paddings right;
        private final Paddings top;

        public SpacersDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5) {
            this.left = paddings;
            this.right = paddings2;
            this.top = paddings3;
            this.bottom = paddings4;
            this.between = paddings5;
        }

        public static /* synthetic */ SpacersDTO copy$default(SpacersDTO spacersDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = spacersDTO.left;
            }
            if ((i11 & 2) != 0) {
                paddings2 = spacersDTO.right;
            }
            if ((i11 & 4) != 0) {
                paddings3 = spacersDTO.top;
            }
            if ((i11 & 8) != 0) {
                paddings4 = spacersDTO.bottom;
            }
            if ((i11 & 16) != 0) {
                paddings5 = spacersDTO.between;
            }
            Paddings paddings6 = paddings5;
            Paddings paddings7 = paddings3;
            return spacersDTO.copy(paddings, paddings2, paddings7, paddings4, paddings6);
        }

        /* renamed from: component1, reason: from getter */
        public final Paddings getLeft() {
            return this.left;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getRight() {
            return this.right;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        /* renamed from: component5, reason: from getter */
        public final Paddings getBetween() {
            return this.between;
        }

        @NotNull
        public final SpacersDTO copy(Paddings left, Paddings right, Paddings top, Paddings bottom, Paddings between) {
            return new SpacersDTO(left, right, top, bottom, between);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpacersDTO)) {
                return false;
            }
            SpacersDTO spacersDTO = (SpacersDTO) other;
            return this.left == spacersDTO.left && this.right == spacersDTO.right && this.top == spacersDTO.top && this.bottom == spacersDTO.bottom && this.between == spacersDTO.between;
        }

        public final Paddings getBetween() {
            return this.between;
        }

        public final Paddings getBottom() {
            return this.bottom;
        }

        public final Paddings getLeft() {
            return this.left;
        }

        public final Paddings getRight() {
            return this.right;
        }

        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            Paddings paddings = this.left;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            Paddings paddings2 = this.right;
            int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.top;
            int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            Paddings paddings4 = this.bottom;
            int hashCode4 = (hashCode3 + (paddings4 == null ? 0 : paddings4.hashCode())) * 31;
            Paddings paddings5 = this.between;
            return hashCode4 + (paddings5 != null ? paddings5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.left;
            Paddings paddings2 = this.right;
            Paddings paddings3 = this.top;
            Paddings paddings4 = this.bottom;
            Paddings paddings5 = this.between;
            StringBuilder b11 = p.b("SpacersDTO(left=", paddings, ", right=", paddings2, ", top=");
            a.e(b11, paddings3, ", bottom=", paddings4, ", between=");
            return b.b(b11, paddings5, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JM\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/data/RichPromoScrollDTO$TileItem;", "", "image", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "backgroundColor", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/util/Map;)V", "getImage", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBackgroundColor", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TileItem {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;
        private final String backgroundColor;

        @NotNull
        private final String image;
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public TileItem(@NotNull String image, TextDTO textDTO, @NotNull AtomActionDTO action, String str, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(action, "action");
            this.image = image;
            this.title = textDTO;
            this.action = action;
            this.backgroundColor = str;
            this.trackingInfo = map;
        }

        public static /* synthetic */ TileItem copy$default(TileItem tileItem, String str, TextDTO textDTO, AtomActionDTO atomActionDTO, String str2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tileItem.image;
            }
            if ((i11 & 2) != 0) {
                textDTO = tileItem.title;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = tileItem.action;
            }
            if ((i11 & 8) != 0) {
                str2 = tileItem.backgroundColor;
            }
            if ((i11 & 16) != 0) {
                map = tileItem.trackingInfo;
            }
            Map map2 = map;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            return tileItem.copy(str, textDTO, atomActionDTO2, str2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final TileItem copy(@NotNull String image, TextDTO title, @NotNull AtomActionDTO action, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(action, "action");
            return new TileItem(image, title, action, backgroundColor, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TileItem)) {
                return false;
            }
            TileItem tileItem = (TileItem) other;
            return Intrinsics.d(this.image, tileItem.image) && Intrinsics.d(this.title, tileItem.title) && Intrinsics.d(this.action, tileItem.action) && Intrinsics.d(this.backgroundColor, tileItem.backgroundColor) && Intrinsics.d(this.trackingInfo, tileItem.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            TextDTO textDTO = this.title;
            int b11 = Ih.a.b(this.action, (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
            String str = this.backgroundColor;
            int hashCode2 = (b11 + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            TextDTO textDTO = this.title;
            AtomActionDTO atomActionDTO = this.action;
            String str2 = this.backgroundColor;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder b11 = Co.a.b("TileItem(image=", textDTO, str, ", title=", ", action=");
            HY.b.d(", backgroundColor=", str2, ", trackingInfo=", b11, atomActionDTO);
            return P.f(b11, map, ")");
        }
    }

    public RichPromoScrollDTO(@NotNull ImageDTO image, @NotNull String backgroundImage, AtomActionDTO atomActionDTO, IslandSeparatorDTO islandSeparatorDTO, CatalogTileScrollDTO catalogTileScrollDTO) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        this.image = image;
        this.backgroundImage = backgroundImage;
        this.action = atomActionDTO;
        this.islandSeparatorBlock = islandSeparatorDTO;
        this.catalogTileScroll = catalogTileScrollDTO;
    }

    public static /* synthetic */ RichPromoScrollDTO copy$default(RichPromoScrollDTO richPromoScrollDTO, ImageDTO imageDTO, String str, AtomActionDTO atomActionDTO, IslandSeparatorDTO islandSeparatorDTO, CatalogTileScrollDTO catalogTileScrollDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = richPromoScrollDTO.image;
        }
        if ((i11 & 2) != 0) {
            str = richPromoScrollDTO.backgroundImage;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = richPromoScrollDTO.action;
        }
        if ((i11 & 8) != 0) {
            islandSeparatorDTO = richPromoScrollDTO.islandSeparatorBlock;
        }
        if ((i11 & 16) != 0) {
            catalogTileScrollDTO = richPromoScrollDTO.catalogTileScroll;
        }
        CatalogTileScrollDTO catalogTileScrollDTO2 = catalogTileScrollDTO;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        return richPromoScrollDTO.copy(imageDTO, str, atomActionDTO2, islandSeparatorDTO, catalogTileScrollDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final IslandSeparatorDTO getIslandSeparatorBlock() {
        return this.islandSeparatorBlock;
    }

    /* renamed from: component5, reason: from getter */
    public final CatalogTileScrollDTO getCatalogTileScroll() {
        return this.catalogTileScroll;
    }

    @NotNull
    public final RichPromoScrollDTO copy(@NotNull ImageDTO image, @NotNull String backgroundImage, AtomActionDTO action, IslandSeparatorDTO islandSeparatorBlock, CatalogTileScrollDTO catalogTileScroll) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        return new RichPromoScrollDTO(image, backgroundImage, action, islandSeparatorBlock, catalogTileScroll);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RichPromoScrollDTO)) {
            return false;
        }
        RichPromoScrollDTO richPromoScrollDTO = (RichPromoScrollDTO) other;
        return Intrinsics.d(this.image, richPromoScrollDTO.image) && Intrinsics.d(this.backgroundImage, richPromoScrollDTO.backgroundImage) && Intrinsics.d(this.action, richPromoScrollDTO.action) && Intrinsics.d(this.islandSeparatorBlock, richPromoScrollDTO.islandSeparatorBlock) && Intrinsics.d(this.catalogTileScroll, richPromoScrollDTO.catalogTileScroll);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final CatalogTileScrollDTO getCatalogTileScroll() {
        return this.catalogTileScroll;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    public final IslandSeparatorDTO getIslandSeparatorBlock() {
        return this.islandSeparatorBlock;
    }

    public int hashCode() {
        int a11 = g.a(this.image.hashCode() * 31, 31, this.backgroundImage);
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        IslandSeparatorDTO islandSeparatorDTO = this.islandSeparatorBlock;
        int hashCode2 = (hashCode + (islandSeparatorDTO == null ? 0 : islandSeparatorDTO.hashCode())) * 31;
        CatalogTileScrollDTO catalogTileScrollDTO = this.catalogTileScroll;
        return hashCode2 + (catalogTileScrollDTO != null ? catalogTileScrollDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RichPromoScrollDTO(image=" + this.image + ", backgroundImage=" + this.backgroundImage + ", action=" + this.action + ", islandSeparatorBlock=" + this.islandSeparatorBlock + ", catalogTileScroll=" + this.catalogTileScroll + ")";
    }
}
