package ru.ozon.app.android.pdp.widgets.priceV4.data;

import G.g;
import Ih.a;
import N3.C3660k;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.partnerBanks.data.PartnerBanksDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001DB\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u00ad\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÆ\u0001J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u0006E"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DTO;", "", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "priceAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "priceIcon", "Lru/ozon/uni/atoms/data/button/Icon;", "bottomPrice", "bottomPriceAction", "moreAboutPrice", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "ozonCardBadge", "topFinBadge", "topStarsBadge", "Lru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DTO$StarsBadge;", "bottomFinBadge", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "partnerBanks", "Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO;", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DTO$StarsBadge;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/Map;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO;)V", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPriceAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getPriceIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getBottomPrice", "getBottomPriceAction", "getMoreAboutPrice", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getOzonCardBadge", "getTopFinBadge", "getTopStarsBadge", "()Lru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DTO$StarsBadge;", "getBottomFinBadge", "getTrackingInfo", "()Ljava/util/Map;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getPartnerBanks", "()Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "", "toString", "StarsBadge", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PriceV4DTO {
    public static final int $stable = 8;
    private final BadgeDTO bottomFinBadge;
    private final PriceDTO bottomPrice;
    private final AtomActionDTO bottomPriceAction;
    private final BadgeDTO moreAboutPrice;
    private final OnBoardingDTO onboarding;
    private final BadgeDTO ozonCardBadge;
    private final PartnerBanksDTO partnerBanks;

    @NotNull
    private final PriceDTO price;

    @NotNull
    private final AtomActionDTO priceAction;
    private final Icon priceIcon;
    private final BadgeDTO topFinBadge;
    private final StarsBadge topStarsBadge;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public PriceV4DTO(@NotNull PriceDTO price, @NotNull AtomActionDTO priceAction, Icon icon, PriceDTO priceDTO, AtomActionDTO atomActionDTO, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, BadgeDTO badgeDTO3, StarsBadge starsBadge, BadgeDTO badgeDTO4, Map<String, TokenizedTrackingInfo> map, OnBoardingDTO onBoardingDTO, PartnerBanksDTO partnerBanksDTO) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(priceAction, "priceAction");
        this.price = price;
        this.priceAction = priceAction;
        this.priceIcon = icon;
        this.bottomPrice = priceDTO;
        this.bottomPriceAction = atomActionDTO;
        this.moreAboutPrice = badgeDTO;
        this.ozonCardBadge = badgeDTO2;
        this.topFinBadge = badgeDTO3;
        this.topStarsBadge = starsBadge;
        this.bottomFinBadge = badgeDTO4;
        this.trackingInfo = map;
        this.onboarding = onBoardingDTO;
        this.partnerBanks = partnerBanksDTO;
    }

    public static /* synthetic */ PriceV4DTO copy$default(PriceV4DTO priceV4DTO, PriceDTO priceDTO, AtomActionDTO atomActionDTO, Icon icon, PriceDTO priceDTO2, AtomActionDTO atomActionDTO2, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, BadgeDTO badgeDTO3, StarsBadge starsBadge, BadgeDTO badgeDTO4, Map map, OnBoardingDTO onBoardingDTO, PartnerBanksDTO partnerBanksDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            priceDTO = priceV4DTO.price;
        }
        return priceV4DTO.copy(priceDTO, (i11 & 2) != 0 ? priceV4DTO.priceAction : atomActionDTO, (i11 & 4) != 0 ? priceV4DTO.priceIcon : icon, (i11 & 8) != 0 ? priceV4DTO.bottomPrice : priceDTO2, (i11 & 16) != 0 ? priceV4DTO.bottomPriceAction : atomActionDTO2, (i11 & 32) != 0 ? priceV4DTO.moreAboutPrice : badgeDTO, (i11 & 64) != 0 ? priceV4DTO.ozonCardBadge : badgeDTO2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? priceV4DTO.topFinBadge : badgeDTO3, (i11 & 256) != 0 ? priceV4DTO.topStarsBadge : starsBadge, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? priceV4DTO.bottomFinBadge : badgeDTO4, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? priceV4DTO.trackingInfo : map, (i11 & 2048) != 0 ? priceV4DTO.onboarding : onBoardingDTO, (i11 & 4096) != 0 ? priceV4DTO.partnerBanks : partnerBanksDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PriceDTO getPrice() {
        return this.price;
    }

    /* renamed from: component10, reason: from getter */
    public final BadgeDTO getBottomFinBadge() {
        return this.bottomFinBadge;
    }

    public final Map<String, TokenizedTrackingInfo> component11() {
        return this.trackingInfo;
    }

    /* renamed from: component12, reason: from getter */
    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    /* renamed from: component13, reason: from getter */
    public final PartnerBanksDTO getPartnerBanks() {
        return this.partnerBanks;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getPriceAction() {
        return this.priceAction;
    }

    /* renamed from: component3, reason: from getter */
    public final Icon getPriceIcon() {
        return this.priceIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final PriceDTO getBottomPrice() {
        return this.bottomPrice;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getBottomPriceAction() {
        return this.bottomPriceAction;
    }

    /* renamed from: component6, reason: from getter */
    public final BadgeDTO getMoreAboutPrice() {
        return this.moreAboutPrice;
    }

    /* renamed from: component7, reason: from getter */
    public final BadgeDTO getOzonCardBadge() {
        return this.ozonCardBadge;
    }

    /* renamed from: component8, reason: from getter */
    public final BadgeDTO getTopFinBadge() {
        return this.topFinBadge;
    }

    /* renamed from: component9, reason: from getter */
    public final StarsBadge getTopStarsBadge() {
        return this.topStarsBadge;
    }

    @NotNull
    public final PriceV4DTO copy(@NotNull PriceDTO price, @NotNull AtomActionDTO priceAction, Icon priceIcon, PriceDTO bottomPrice, AtomActionDTO bottomPriceAction, BadgeDTO moreAboutPrice, BadgeDTO ozonCardBadge, BadgeDTO topFinBadge, StarsBadge topStarsBadge, BadgeDTO bottomFinBadge, Map<String, TokenizedTrackingInfo> trackingInfo, OnBoardingDTO onboarding, PartnerBanksDTO partnerBanks) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(priceAction, "priceAction");
        return new PriceV4DTO(price, priceAction, priceIcon, bottomPrice, bottomPriceAction, moreAboutPrice, ozonCardBadge, topFinBadge, topStarsBadge, bottomFinBadge, trackingInfo, onboarding, partnerBanks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceV4DTO)) {
            return false;
        }
        PriceV4DTO priceV4DTO = (PriceV4DTO) other;
        return Intrinsics.d(this.price, priceV4DTO.price) && Intrinsics.d(this.priceAction, priceV4DTO.priceAction) && Intrinsics.d(this.priceIcon, priceV4DTO.priceIcon) && Intrinsics.d(this.bottomPrice, priceV4DTO.bottomPrice) && Intrinsics.d(this.bottomPriceAction, priceV4DTO.bottomPriceAction) && Intrinsics.d(this.moreAboutPrice, priceV4DTO.moreAboutPrice) && Intrinsics.d(this.ozonCardBadge, priceV4DTO.ozonCardBadge) && Intrinsics.d(this.topFinBadge, priceV4DTO.topFinBadge) && Intrinsics.d(this.topStarsBadge, priceV4DTO.topStarsBadge) && Intrinsics.d(this.bottomFinBadge, priceV4DTO.bottomFinBadge) && Intrinsics.d(this.trackingInfo, priceV4DTO.trackingInfo) && Intrinsics.d(this.onboarding, priceV4DTO.onboarding) && Intrinsics.d(this.partnerBanks, priceV4DTO.partnerBanks);
    }

    public final BadgeDTO getBottomFinBadge() {
        return this.bottomFinBadge;
    }

    public final PriceDTO getBottomPrice() {
        return this.bottomPrice;
    }

    public final AtomActionDTO getBottomPriceAction() {
        return this.bottomPriceAction;
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

    public final StarsBadge getTopStarsBadge() {
        return this.topStarsBadge;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = a.b(this.priceAction, this.price.hashCode() * 31, 31);
        Icon icon = this.priceIcon;
        int hashCode = (b11 + (icon == null ? 0 : icon.hashCode())) * 31;
        PriceDTO priceDTO = this.bottomPrice;
        int hashCode2 = (hashCode + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.bottomPriceAction;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.moreAboutPrice;
        int hashCode4 = (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        BadgeDTO badgeDTO2 = this.ozonCardBadge;
        int hashCode5 = (hashCode4 + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31;
        BadgeDTO badgeDTO3 = this.topFinBadge;
        int hashCode6 = (hashCode5 + (badgeDTO3 == null ? 0 : badgeDTO3.hashCode())) * 31;
        StarsBadge starsBadge = this.topStarsBadge;
        int hashCode7 = (hashCode6 + (starsBadge == null ? 0 : starsBadge.hashCode())) * 31;
        BadgeDTO badgeDTO4 = this.bottomFinBadge;
        int hashCode8 = (hashCode7 + (badgeDTO4 == null ? 0 : badgeDTO4.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode9 = (hashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        int hashCode10 = (hashCode9 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
        PartnerBanksDTO partnerBanksDTO = this.partnerBanks;
        return hashCode10 + (partnerBanksDTO != null ? partnerBanksDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PriceV4DTO(price=" + this.price + ", priceAction=" + this.priceAction + ", priceIcon=" + this.priceIcon + ", bottomPrice=" + this.bottomPrice + ", bottomPriceAction=" + this.bottomPriceAction + ", moreAboutPrice=" + this.moreAboutPrice + ", ozonCardBadge=" + this.ozonCardBadge + ", topFinBadge=" + this.topFinBadge + ", topStarsBadge=" + this.topStarsBadge + ", bottomFinBadge=" + this.bottomFinBadge + ", trackingInfo=" + this.trackingInfo + ", onboarding=" + this.onboarding + ", partnerBanks=" + this.partnerBanks + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Jk\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DTO$StarsBadge;", "", "text", "", "leftIcon", "rightIcon", "backgroundColor", "textGradientColors", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "starsTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/util/Map;)V", "getText", "()Ljava/lang/String;", "getLeftIcon", "getRightIcon", "getBackgroundColor", "getTextGradientColors", "()Ljava/util/List;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getStarsTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StarsBadge {
        public static final int $stable = 8;
        private final String backgroundColor;
        private final CommonControlSettings common;
        private final String leftIcon;
        private final String rightIcon;
        private final Map<String, TokenizedTrackingInfo> starsTrackingInfo;

        @NotNull
        private final String text;

        @NotNull
        private final List<String> textGradientColors;

        public StarsBadge(@NotNull String text, String str, String str2, String str3, @NotNull List<String> textGradientColors, CommonControlSettings commonControlSettings, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(textGradientColors, "textGradientColors");
            this.text = text;
            this.leftIcon = str;
            this.rightIcon = str2;
            this.backgroundColor = str3;
            this.textGradientColors = textGradientColors;
            this.common = commonControlSettings;
            this.starsTrackingInfo = map;
        }

        public static /* synthetic */ StarsBadge copy$default(StarsBadge starsBadge, String str, String str2, String str3, String str4, List list, CommonControlSettings commonControlSettings, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = starsBadge.text;
            }
            if ((i11 & 2) != 0) {
                str2 = starsBadge.leftIcon;
            }
            if ((i11 & 4) != 0) {
                str3 = starsBadge.rightIcon;
            }
            if ((i11 & 8) != 0) {
                str4 = starsBadge.backgroundColor;
            }
            if ((i11 & 16) != 0) {
                list = starsBadge.textGradientColors;
            }
            if ((i11 & 32) != 0) {
                commonControlSettings = starsBadge.common;
            }
            if ((i11 & 64) != 0) {
                map = starsBadge.starsTrackingInfo;
            }
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            Map map2 = map;
            List list2 = list;
            String str5 = str3;
            return starsBadge.copy(str, str2, str5, str4, list2, commonControlSettings2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLeftIcon() {
            return this.leftIcon;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRightIcon() {
            return this.rightIcon;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<String> component5() {
            return this.textGradientColors;
        }

        /* renamed from: component6, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.starsTrackingInfo;
        }

        @NotNull
        public final StarsBadge copy(@NotNull String text, String leftIcon, String rightIcon, String backgroundColor, @NotNull List<String> textGradientColors, CommonControlSettings common, Map<String, TokenizedTrackingInfo> starsTrackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(textGradientColors, "textGradientColors");
            return new StarsBadge(text, leftIcon, rightIcon, backgroundColor, textGradientColors, common, starsTrackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StarsBadge)) {
                return false;
            }
            StarsBadge starsBadge = (StarsBadge) other;
            return Intrinsics.d(this.text, starsBadge.text) && Intrinsics.d(this.leftIcon, starsBadge.leftIcon) && Intrinsics.d(this.rightIcon, starsBadge.rightIcon) && Intrinsics.d(this.backgroundColor, starsBadge.backgroundColor) && Intrinsics.d(this.textGradientColors, starsBadge.textGradientColors) && Intrinsics.d(this.common, starsBadge.common) && Intrinsics.d(this.starsTrackingInfo, starsBadge.starsTrackingInfo);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final String getLeftIcon() {
            return this.leftIcon;
        }

        public final String getRightIcon() {
            return this.rightIcon;
        }

        public final Map<String, TokenizedTrackingInfo> getStarsTrackingInfo() {
            return this.starsTrackingInfo;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final List<String> getTextGradientColors() {
            return this.textGradientColors;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            String str = this.leftIcon;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.rightIcon;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.backgroundColor;
            int b11 = g.b((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.textGradientColors);
            CommonControlSettings commonControlSettings = this.common;
            int hashCode4 = (b11 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.starsTrackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            String str2 = this.leftIcon;
            String str3 = this.rightIcon;
            String str4 = this.backgroundColor;
            List<String> list = this.textGradientColors;
            CommonControlSettings commonControlSettings = this.common;
            Map<String, TokenizedTrackingInfo> map = this.starsTrackingInfo;
            StringBuilder d11 = C3660k.d("StarsBadge(text=", str, ", leftIcon=", str2, ", rightIcon=");
            Nh.a.h(d11, str3, ", backgroundColor=", str4, ", textGradientColors=");
            d11.append(list);
            d11.append(", common=");
            d11.append(commonControlSettings);
            d11.append(", starsTrackingInfo=");
            return P.f(d11, map, ")");
        }

        public /* synthetic */ StarsBadge(String str, String str2, String str3, String str4, List list, CommonControlSettings commonControlSettings, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? C7714v.b0("#066CEE", "#29BBFF", "#12F15E", "#066CEE", "#00B8B8") : list, (i11 & 32) != 0 ? null : commonControlSettings, (i11 & 64) != 0 ? null : map);
        }
    }
}
