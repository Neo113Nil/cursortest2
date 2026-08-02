package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPagePriceMobile.v1.presentation.price;

import Fm.C3051a;
import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.starsBadge.v1.StarsBadgeVI;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b(\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/presentation/price/HotelsPagePriceMobilePriceVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "withBankBadge", "nightsCountBadge", "Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/StarsBadgeVI;", "starsBadge", "starsDetailInfoBadge", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/StarsBadgeVI;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getWithBankBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getNightsCountBadge", "Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/StarsBadgeVI;", "getStarsBadge", "()Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/StarsBadgeVI;", "getStarsDetailInfoBadge", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsPagePriceMobilePriceVI implements c {
    private final long id;
    private final BadgeDTO nightsCountBadge;

    @NotNull
    private final PriceDTO price;
    private final StarsBadgeVI starsBadge;
    private final BadgeDTO starsDetailInfoBadge;
    private final t tokenizedEvent;
    private final BadgeDTO withBankBadge;

    public HotelsPagePriceMobilePriceVI(long j11, @NotNull PriceDTO price, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, StarsBadgeVI starsBadgeVI, BadgeDTO badgeDTO3, t tVar) {
        Intrinsics.checkNotNullParameter(price, "price");
        this.id = j11;
        this.price = price;
        this.withBankBadge = badgeDTO;
        this.nightsCountBadge = badgeDTO2;
        this.starsBadge = starsBadgeVI;
        this.starsDetailInfoBadge = badgeDTO3;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsPagePriceMobilePriceVI)) {
            return false;
        }
        HotelsPagePriceMobilePriceVI hotelsPagePriceMobilePriceVI = (HotelsPagePriceMobilePriceVI) other;
        return this.id == hotelsPagePriceMobilePriceVI.id && Intrinsics.d(this.price, hotelsPagePriceMobilePriceVI.price) && Intrinsics.d(this.withBankBadge, hotelsPagePriceMobilePriceVI.withBankBadge) && Intrinsics.d(this.nightsCountBadge, hotelsPagePriceMobilePriceVI.nightsCountBadge) && Intrinsics.d(this.starsBadge, hotelsPagePriceMobilePriceVI.starsBadge) && Intrinsics.d(this.starsDetailInfoBadge, hotelsPagePriceMobilePriceVI.starsDetailInfoBadge) && Intrinsics.d(this.tokenizedEvent, hotelsPagePriceMobilePriceVI.tokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final BadgeDTO getNightsCountBadge() {
        return this.nightsCountBadge;
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final StarsBadgeVI getStarsBadge() {
        return this.starsBadge;
    }

    public final BadgeDTO getStarsDetailInfoBadge() {
        return this.starsDetailInfoBadge;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final BadgeDTO getWithBankBadge() {
        return this.withBankBadge;
    }

    public int hashCode() {
        int b11 = C3051a.b(this.price, Long.hashCode(this.id) * 31, 31);
        BadgeDTO badgeDTO = this.withBankBadge;
        int hashCode = (b11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        BadgeDTO badgeDTO2 = this.nightsCountBadge;
        int hashCode2 = (hashCode + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31;
        StarsBadgeVI starsBadgeVI = this.starsBadge;
        int hashCode3 = (hashCode2 + (starsBadgeVI == null ? 0 : starsBadgeVI.hashCode())) * 31;
        BadgeDTO badgeDTO3 = this.starsDetailInfoBadge;
        int hashCode4 = (hashCode3 + (badgeDTO3 == null ? 0 : badgeDTO3.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        PriceDTO priceDTO = this.price;
        BadgeDTO badgeDTO = this.withBankBadge;
        BadgeDTO badgeDTO2 = this.nightsCountBadge;
        StarsBadgeVI starsBadgeVI = this.starsBadge;
        BadgeDTO badgeDTO3 = this.starsDetailInfoBadge;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("HotelsPagePriceMobilePriceVI(id=");
        sb2.append(j11);
        sb2.append(", price=");
        sb2.append(priceDTO);
        sb2.append(", withBankBadge=");
        sb2.append(badgeDTO);
        sb2.append(", nightsCountBadge=");
        sb2.append(badgeDTO2);
        sb2.append(", starsBadge=");
        sb2.append(starsBadgeVI);
        sb2.append(", starsDetailInfoBadge=");
        sb2.append(badgeDTO3);
        return a.b(sb2, ", tokenizedEvent=", tVar, ")");
    }
}
