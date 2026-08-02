package ru.ozon.app.android.ugc.widgets.reviewTiles.data;

import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.Paddings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JU\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewsTilesDTO;", "", "items", "", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTileItemDTO;", "openFullViewAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "horizontalPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getOpenFullViewAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHorizontalPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewsTilesDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final Paddings horizontalPadding;

    @NotNull
    private final List<ReviewTileItemDTO> items;
    private final AtomActionDTO openFullViewAction;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ReviewsTilesDTO(@NotNull List<ReviewTileItemDTO> items, AtomActionDTO atomActionDTO, Paddings paddings, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.openFullViewAction = atomActionDTO;
        this.horizontalPadding = paddings;
        this.backgroundColor = str;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ReviewsTilesDTO copy$default(ReviewsTilesDTO reviewsTilesDTO, List list, AtomActionDTO atomActionDTO, Paddings paddings, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = reviewsTilesDTO.items;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = reviewsTilesDTO.openFullViewAction;
        }
        if ((i11 & 4) != 0) {
            paddings = reviewsTilesDTO.horizontalPadding;
        }
        if ((i11 & 8) != 0) {
            str = reviewsTilesDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            map = reviewsTilesDTO.trackingInfo;
        }
        Map map2 = map;
        Paddings paddings2 = paddings;
        return reviewsTilesDTO.copy(list, atomActionDTO, paddings2, str, map2);
    }

    @NotNull
    public final List<ReviewTileItemDTO> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getOpenFullViewAction() {
        return this.openFullViewAction;
    }

    /* renamed from: component3, reason: from getter */
    public final Paddings getHorizontalPadding() {
        return this.horizontalPadding;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final ReviewsTilesDTO copy(@NotNull List<ReviewTileItemDTO> items, AtomActionDTO openFullViewAction, Paddings horizontalPadding, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new ReviewsTilesDTO(items, openFullViewAction, horizontalPadding, backgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewsTilesDTO)) {
            return false;
        }
        ReviewsTilesDTO reviewsTilesDTO = (ReviewsTilesDTO) other;
        return Intrinsics.d(this.items, reviewsTilesDTO.items) && Intrinsics.d(this.openFullViewAction, reviewsTilesDTO.openFullViewAction) && this.horizontalPadding == reviewsTilesDTO.horizontalPadding && Intrinsics.d(this.backgroundColor, reviewsTilesDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, reviewsTilesDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Paddings getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @NotNull
    public final List<ReviewTileItemDTO> getItems() {
        return this.items;
    }

    public final AtomActionDTO getOpenFullViewAction() {
        return this.openFullViewAction;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        AtomActionDTO atomActionDTO = this.openFullViewAction;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Paddings paddings = this.horizontalPadding;
        int hashCode3 = (hashCode2 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<ReviewTileItemDTO> list = this.items;
        AtomActionDTO atomActionDTO = this.openFullViewAction;
        Paddings paddings = this.horizontalPadding;
        String str = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ReviewsTilesDTO(items=");
        sb2.append(list);
        sb2.append(", openFullViewAction=");
        sb2.append(atomActionDTO);
        sb2.append(", horizontalPadding=");
        sb2.append(paddings);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
