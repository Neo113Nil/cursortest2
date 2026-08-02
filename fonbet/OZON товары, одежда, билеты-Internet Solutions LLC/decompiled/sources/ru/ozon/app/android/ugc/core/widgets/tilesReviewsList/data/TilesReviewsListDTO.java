package ru.ozon.app.android.ugc.core.widgets.tilesReviewsList.data;

import H3.c;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.product.skuthinscroll.data.SkuThinScrollDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/tilesReviewsList/data/TilesReviewsListDTO;", "", "reviews", "", "Lru/ozon/app/android/ugc/core/widgets/tilesReviewsList/data/TilesReviewsListDTO$TileReviewDTO;", "<init>", "(Ljava/util/List;)V", "getReviews", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TileReviewDTO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TilesReviewsListDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<TileReviewDTO> reviews;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/tilesReviewsList/data/TilesReviewsListDTO$TileReviewDTO;", "", "tile", "Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollDTO;", "review", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollDTO;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO;Ljava/util/Map;)V", "getTile", "()Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollDTO;", "getReview", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TileReviewDTO {
        public static final int $stable = 8;

        @NotNull
        private final SingleReviewDTO review;
        private final SkuThinScrollDTO tile;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public TileReviewDTO(SkuThinScrollDTO skuThinScrollDTO, @NotNull SingleReviewDTO review, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(review, "review");
            this.tile = skuThinScrollDTO;
            this.review = review;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TileReviewDTO copy$default(TileReviewDTO tileReviewDTO, SkuThinScrollDTO skuThinScrollDTO, SingleReviewDTO singleReviewDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                skuThinScrollDTO = tileReviewDTO.tile;
            }
            if ((i11 & 2) != 0) {
                singleReviewDTO = tileReviewDTO.review;
            }
            if ((i11 & 4) != 0) {
                map = tileReviewDTO.trackingInfo;
            }
            return tileReviewDTO.copy(skuThinScrollDTO, singleReviewDTO, map);
        }

        /* renamed from: component1, reason: from getter */
        public final SkuThinScrollDTO getTile() {
            return this.tile;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final SingleReviewDTO getReview() {
            return this.review;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        @NotNull
        public final TileReviewDTO copy(SkuThinScrollDTO tile, @NotNull SingleReviewDTO review, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(review, "review");
            return new TileReviewDTO(tile, review, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TileReviewDTO)) {
                return false;
            }
            TileReviewDTO tileReviewDTO = (TileReviewDTO) other;
            return Intrinsics.d(this.tile, tileReviewDTO.tile) && Intrinsics.d(this.review, tileReviewDTO.review) && Intrinsics.d(this.trackingInfo, tileReviewDTO.trackingInfo);
        }

        @NotNull
        public final SingleReviewDTO getReview() {
            return this.review;
        }

        public final SkuThinScrollDTO getTile() {
            return this.tile;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            SkuThinScrollDTO skuThinScrollDTO = this.tile;
            int hashCode = (this.review.hashCode() + ((skuThinScrollDTO == null ? 0 : skuThinScrollDTO.hashCode()) * 31)) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            SkuThinScrollDTO skuThinScrollDTO = this.tile;
            SingleReviewDTO singleReviewDTO = this.review;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("TileReviewDTO(tile=");
            sb2.append(skuThinScrollDTO);
            sb2.append(", review=");
            sb2.append(singleReviewDTO);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    public TilesReviewsListDTO(@NotNull List<TileReviewDTO> reviews) {
        Intrinsics.checkNotNullParameter(reviews, "reviews");
        this.reviews = reviews;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TilesReviewsListDTO copy$default(TilesReviewsListDTO tilesReviewsListDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = tilesReviewsListDTO.reviews;
        }
        return tilesReviewsListDTO.copy(list);
    }

    @NotNull
    public final List<TileReviewDTO> component1() {
        return this.reviews;
    }

    @NotNull
    public final TilesReviewsListDTO copy(@NotNull List<TileReviewDTO> reviews) {
        Intrinsics.checkNotNullParameter(reviews, "reviews");
        return new TilesReviewsListDTO(reviews);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TilesReviewsListDTO) && Intrinsics.d(this.reviews, ((TilesReviewsListDTO) other).reviews);
    }

    @NotNull
    public final List<TileReviewDTO> getReviews() {
        return this.reviews;
    }

    public int hashCode() {
        return this.reviews.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("TilesReviewsListDTO(reviews=", ")", this.reviews);
    }
}
