package ru.ozon.app.android.pdp.widgets.priceV4.data;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.partnerBanks.data.PartnerBanksDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b&\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b'\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"ru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DtoWrapper$Bottom", "", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "priceAction", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "moreAboutPrice", "ozonCardBadge", "bottomFinBadge", "Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO;", "partnerBanks", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO;Ljava/util/Map;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getPriceAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getMoreAboutPrice", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getOzonCardBadge", "getBottomFinBadge", "Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO;", "getPartnerBanks", "()Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PriceV4DtoWrapper$Bottom {
    private final BadgeDTO bottomFinBadge;
    private final BadgeDTO moreAboutPrice;
    private final OnBoardingDTO onboarding;
    private final BadgeDTO ozonCardBadge;
    private final PartnerBanksDTO partnerBanks;
    private final PriceDTO price;
    private final AtomActionDTO priceAction;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public PriceV4DtoWrapper$Bottom(PriceDTO priceDTO, AtomActionDTO atomActionDTO, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, BadgeDTO badgeDTO3, PartnerBanksDTO partnerBanksDTO, Map<String, TokenizedTrackingInfo> map, OnBoardingDTO onBoardingDTO) {
        this.price = priceDTO;
        this.priceAction = atomActionDTO;
        this.moreAboutPrice = badgeDTO;
        this.ozonCardBadge = badgeDTO2;
        this.bottomFinBadge = badgeDTO3;
        this.partnerBanks = partnerBanksDTO;
        this.trackingInfo = map;
        this.onboarding = onBoardingDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceV4DtoWrapper$Bottom)) {
            return false;
        }
        PriceV4DtoWrapper$Bottom priceV4DtoWrapper$Bottom = (PriceV4DtoWrapper$Bottom) other;
        return Intrinsics.d(this.price, priceV4DtoWrapper$Bottom.price) && Intrinsics.d(this.priceAction, priceV4DtoWrapper$Bottom.priceAction) && Intrinsics.d(this.moreAboutPrice, priceV4DtoWrapper$Bottom.moreAboutPrice) && Intrinsics.d(this.ozonCardBadge, priceV4DtoWrapper$Bottom.ozonCardBadge) && Intrinsics.d(this.bottomFinBadge, priceV4DtoWrapper$Bottom.bottomFinBadge) && Intrinsics.d(this.partnerBanks, priceV4DtoWrapper$Bottom.partnerBanks) && Intrinsics.d(this.trackingInfo, priceV4DtoWrapper$Bottom.trackingInfo) && Intrinsics.d(this.onboarding, priceV4DtoWrapper$Bottom.onboarding);
    }

    public final BadgeDTO getBottomFinBadge() {
        return this.bottomFinBadge;
    }

    public final BadgeDTO getMoreAboutPrice() {
        return this.moreAboutPrice;
    }

    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    public final BadgeDTO getOzonCardBadge() {
        return this.ozonCardBadge;
    }

    public final PartnerBanksDTO getPartnerBanks() {
        return this.partnerBanks;
    }

    public final PriceDTO getPrice() {
        return this.price;
    }

    public final AtomActionDTO getPriceAction() {
        return this.priceAction;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        PriceDTO priceDTO = this.price;
        int hashCode = (priceDTO == null ? 0 : priceDTO.hashCode()) * 31;
        AtomActionDTO atomActionDTO = this.priceAction;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.moreAboutPrice;
        int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        BadgeDTO badgeDTO2 = this.ozonCardBadge;
        int hashCode4 = (hashCode3 + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31;
        BadgeDTO badgeDTO3 = this.bottomFinBadge;
        int hashCode5 = (hashCode4 + (badgeDTO3 == null ? 0 : badgeDTO3.hashCode())) * 31;
        PartnerBanksDTO partnerBanksDTO = this.partnerBanks;
        int hashCode6 = (hashCode5 + (partnerBanksDTO == null ? 0 : partnerBanksDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        return hashCode7 + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Bottom(price=" + this.price + ", priceAction=" + this.priceAction + ", moreAboutPrice=" + this.moreAboutPrice + ", ozonCardBadge=" + this.ozonCardBadge + ", bottomFinBadge=" + this.bottomFinBadge + ", partnerBanks=" + this.partnerBanks + ", trackingInfo=" + this.trackingInfo + ", onboarding=" + this.onboarding + ")";
    }
}
