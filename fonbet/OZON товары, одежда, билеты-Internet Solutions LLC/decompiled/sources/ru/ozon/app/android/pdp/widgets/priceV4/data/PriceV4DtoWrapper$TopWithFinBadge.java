package ru.ozon.app.android.pdp.widgets.priceV4.data;

import Ih.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.widgets.priceV4.data.PriceV4DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"ru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DtoWrapper$TopWithFinBadge", "", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "priceAction", "Lru/ozon/uni/atoms/data/button/Icon;", "priceIcon", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "topFinBadge", "Lru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DTO$StarsBadge;", "topStarsBadge", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DTO$StarsBadge;Ljava/util/Map;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getPriceAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lru/ozon/uni/atoms/data/button/Icon;", "getPriceIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTopFinBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DTO$StarsBadge;", "getTopStarsBadge", "()Lru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DTO$StarsBadge;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PriceV4DtoWrapper$TopWithFinBadge {
    private final OnBoardingDTO onboarding;

    @NotNull
    private final PriceDTO price;

    @NotNull
    private final AtomActionDTO priceAction;
    private final Icon priceIcon;
    private final BadgeDTO topFinBadge;
    private final PriceV4DTO.StarsBadge topStarsBadge;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public PriceV4DtoWrapper$TopWithFinBadge(@NotNull PriceDTO price, @NotNull AtomActionDTO priceAction, Icon icon, BadgeDTO badgeDTO, PriceV4DTO.StarsBadge starsBadge, Map<String, TokenizedTrackingInfo> map, OnBoardingDTO onBoardingDTO) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(priceAction, "priceAction");
        this.price = price;
        this.priceAction = priceAction;
        this.priceIcon = icon;
        this.topFinBadge = badgeDTO;
        this.topStarsBadge = starsBadge;
        this.trackingInfo = map;
        this.onboarding = onBoardingDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceV4DtoWrapper$TopWithFinBadge)) {
            return false;
        }
        PriceV4DtoWrapper$TopWithFinBadge priceV4DtoWrapper$TopWithFinBadge = (PriceV4DtoWrapper$TopWithFinBadge) other;
        return Intrinsics.d(this.price, priceV4DtoWrapper$TopWithFinBadge.price) && Intrinsics.d(this.priceAction, priceV4DtoWrapper$TopWithFinBadge.priceAction) && Intrinsics.d(this.priceIcon, priceV4DtoWrapper$TopWithFinBadge.priceIcon) && Intrinsics.d(this.topFinBadge, priceV4DtoWrapper$TopWithFinBadge.topFinBadge) && Intrinsics.d(this.topStarsBadge, priceV4DtoWrapper$TopWithFinBadge.topStarsBadge) && Intrinsics.d(this.trackingInfo, priceV4DtoWrapper$TopWithFinBadge.trackingInfo) && Intrinsics.d(this.onboarding, priceV4DtoWrapper$TopWithFinBadge.onboarding);
    }

    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    @NotNull
    public final AtomActionDTO getPriceAction() {
        return this.priceAction;
    }

    public final Icon getPriceIcon() {
        return this.priceIcon;
    }

    public final BadgeDTO getTopFinBadge() {
        return this.topFinBadge;
    }

    public final PriceV4DTO.StarsBadge getTopStarsBadge() {
        return this.topStarsBadge;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = a.b(this.priceAction, this.price.hashCode() * 31, 31);
        Icon icon = this.priceIcon;
        int hashCode = (b11 + (icon == null ? 0 : icon.hashCode())) * 31;
        BadgeDTO badgeDTO = this.topFinBadge;
        int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        PriceV4DTO.StarsBadge starsBadge = this.topStarsBadge;
        int hashCode3 = (hashCode2 + (starsBadge == null ? 0 : starsBadge.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        return hashCode4 + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TopWithFinBadge(price=" + this.price + ", priceAction=" + this.priceAction + ", priceIcon=" + this.priceIcon + ", topFinBadge=" + this.topFinBadge + ", topStarsBadge=" + this.topStarsBadge + ", trackingInfo=" + this.trackingInfo + ", onboarding=" + this.onboarding + ")";
    }
}
