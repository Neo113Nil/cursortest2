package ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.data;

import Kk.C3532b;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/CatalogTileScrollDTO;", "", "tiles", "", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/TileItem;", "hasFirstItemSeparator", "", "spacers", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/SpacersDTO;", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;ZLru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/SpacersDTO;Ljava/lang/String;Ljava/util/Map;)V", "getTiles", "()Ljava/util/List;", "getHasFirstItemSeparator", "()Z", "getSpacers", "()Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/SpacersDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CatalogTileScrollDTO {
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
