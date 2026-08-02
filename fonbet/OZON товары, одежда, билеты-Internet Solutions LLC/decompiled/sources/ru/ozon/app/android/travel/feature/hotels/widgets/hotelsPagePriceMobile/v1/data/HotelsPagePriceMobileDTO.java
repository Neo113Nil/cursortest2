package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPagePriceMobile.v1.data;

import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.starsBadge.v1.StarsBadgeDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/data/HotelsPagePriceMobileDTO;", "", "price", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/data/HotelsPagePriceMobileDTO$Price;", "isSkeleton", "", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/data/HotelsPagePriceMobileDTO$Price;Z)V", "getPrice", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/data/HotelsPagePriceMobileDTO$Price;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Price", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsPagePriceMobileDTO {
    public static final int $stable = 8;
    private final boolean isSkeleton;
    private final Price price;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003J[\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/data/HotelsPagePriceMobileDTO$Price;", "", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "withBankBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nightsCountBadge", "starsBadge", "Lru/ozon/app/android/travel/molecules/dto/starsBadge/v1/StarsBadgeDTO;", "starsDetailInfoBadge", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/travel/molecules/dto/starsBadge/v1/StarsBadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/Map;)V", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getWithBankBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getNightsCountBadge", "getStarsBadge", "()Lru/ozon/app/android/travel/molecules/dto/starsBadge/v1/StarsBadgeDTO;", "getStarsDetailInfoBadge", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Price {
        public static final int $stable = 8;
        private final BadgeDTO nightsCountBadge;

        @NotNull
        private final PriceDTO price;
        private final StarsBadgeDTO starsBadge;
        private final BadgeDTO starsDetailInfoBadge;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final BadgeDTO withBankBadge;

        public Price(@NotNull PriceDTO price, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, StarsBadgeDTO starsBadgeDTO, BadgeDTO badgeDTO3, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(price, "price");
            this.price = price;
            this.withBankBadge = badgeDTO;
            this.nightsCountBadge = badgeDTO2;
            this.starsBadge = starsBadgeDTO;
            this.starsDetailInfoBadge = badgeDTO3;
            this.trackingInfo = map;
        }

        public static /* synthetic */ Price copy$default(Price price, PriceDTO priceDTO, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, StarsBadgeDTO starsBadgeDTO, BadgeDTO badgeDTO3, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                priceDTO = price.price;
            }
            if ((i11 & 2) != 0) {
                badgeDTO = price.withBankBadge;
            }
            if ((i11 & 4) != 0) {
                badgeDTO2 = price.nightsCountBadge;
            }
            if ((i11 & 8) != 0) {
                starsBadgeDTO = price.starsBadge;
            }
            if ((i11 & 16) != 0) {
                badgeDTO3 = price.starsDetailInfoBadge;
            }
            if ((i11 & 32) != 0) {
                map = price.trackingInfo;
            }
            BadgeDTO badgeDTO4 = badgeDTO3;
            Map map2 = map;
            return price.copy(priceDTO, badgeDTO, badgeDTO2, starsBadgeDTO, badgeDTO4, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        /* renamed from: component2, reason: from getter */
        public final BadgeDTO getWithBankBadge() {
            return this.withBankBadge;
        }

        /* renamed from: component3, reason: from getter */
        public final BadgeDTO getNightsCountBadge() {
            return this.nightsCountBadge;
        }

        /* renamed from: component4, reason: from getter */
        public final StarsBadgeDTO getStarsBadge() {
            return this.starsBadge;
        }

        /* renamed from: component5, reason: from getter */
        public final BadgeDTO getStarsDetailInfoBadge() {
            return this.starsDetailInfoBadge;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final Price copy(@NotNull PriceDTO price, BadgeDTO withBankBadge, BadgeDTO nightsCountBadge, StarsBadgeDTO starsBadge, BadgeDTO starsDetailInfoBadge, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(price, "price");
            return new Price(price, withBankBadge, nightsCountBadge, starsBadge, starsDetailInfoBadge, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Price)) {
                return false;
            }
            Price price = (Price) other;
            return Intrinsics.d(this.price, price.price) && Intrinsics.d(this.withBankBadge, price.withBankBadge) && Intrinsics.d(this.nightsCountBadge, price.nightsCountBadge) && Intrinsics.d(this.starsBadge, price.starsBadge) && Intrinsics.d(this.starsDetailInfoBadge, price.starsDetailInfoBadge) && Intrinsics.d(this.trackingInfo, price.trackingInfo);
        }

        public final BadgeDTO getNightsCountBadge() {
            return this.nightsCountBadge;
        }

        @NotNull
        public final PriceDTO getPrice() {
            return this.price;
        }

        public final StarsBadgeDTO getStarsBadge() {
            return this.starsBadge;
        }

        public final BadgeDTO getStarsDetailInfoBadge() {
            return this.starsDetailInfoBadge;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final BadgeDTO getWithBankBadge() {
            return this.withBankBadge;
        }

        public int hashCode() {
            int hashCode = this.price.hashCode() * 31;
            BadgeDTO badgeDTO = this.withBankBadge;
            int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            BadgeDTO badgeDTO2 = this.nightsCountBadge;
            int hashCode3 = (hashCode2 + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31;
            StarsBadgeDTO starsBadgeDTO = this.starsBadge;
            int hashCode4 = (hashCode3 + (starsBadgeDTO == null ? 0 : starsBadgeDTO.hashCode())) * 31;
            BadgeDTO badgeDTO3 = this.starsDetailInfoBadge;
            int hashCode5 = (hashCode4 + (badgeDTO3 == null ? 0 : badgeDTO3.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Price(price=" + this.price + ", withBankBadge=" + this.withBankBadge + ", nightsCountBadge=" + this.nightsCountBadge + ", starsBadge=" + this.starsBadge + ", starsDetailInfoBadge=" + this.starsDetailInfoBadge + ", trackingInfo=" + this.trackingInfo + ")";
        }
    }

    public HotelsPagePriceMobileDTO(Price price, boolean z11) {
        this.price = price;
        this.isSkeleton = z11;
    }

    public static /* synthetic */ HotelsPagePriceMobileDTO copy$default(HotelsPagePriceMobileDTO hotelsPagePriceMobileDTO, Price price, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            price = hotelsPagePriceMobileDTO.price;
        }
        if ((i11 & 2) != 0) {
            z11 = hotelsPagePriceMobileDTO.isSkeleton;
        }
        return hotelsPagePriceMobileDTO.copy(price, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final Price getPrice() {
        return this.price;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSkeleton() {
        return this.isSkeleton;
    }

    @NotNull
    public final HotelsPagePriceMobileDTO copy(Price price, boolean isSkeleton) {
        return new HotelsPagePriceMobileDTO(price, isSkeleton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsPagePriceMobileDTO)) {
            return false;
        }
        HotelsPagePriceMobileDTO hotelsPagePriceMobileDTO = (HotelsPagePriceMobileDTO) other;
        return Intrinsics.d(this.price, hotelsPagePriceMobileDTO.price) && this.isSkeleton == hotelsPagePriceMobileDTO.isSkeleton;
    }

    public final Price getPrice() {
        return this.price;
    }

    public int hashCode() {
        Price price = this.price;
        return Boolean.hashCode(this.isSkeleton) + ((price == null ? 0 : price.hashCode()) * 31);
    }

    public final boolean isSkeleton() {
        return this.isSkeleton;
    }

    @NotNull
    public String toString() {
        return "HotelsPagePriceMobileDTO(price=" + this.price + ", isSkeleton=" + this.isSkeleton + ")";
    }
}
