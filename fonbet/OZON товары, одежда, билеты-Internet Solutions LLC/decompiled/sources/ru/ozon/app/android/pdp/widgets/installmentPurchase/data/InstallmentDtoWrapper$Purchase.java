package ru.ozon.app.android.pdp.widgets.installmentPurchase.data;

import G.g;
import Kk.C3532b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.price.PriceWithTitle;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b,\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u00109\u001a\u0004\b:\u0010\u001aR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"ru/ozon/app/android/pdp/widgets/installmentPurchase/data/InstallmentDtoWrapper$Purchase", "", "Lru/ozon/app/android/atoms/data/price/PriceWithTitle;", "price", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "animationTimer", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "animationTrackingInfo", "trackingInfo", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "", "showTopRounding", "hasBadges", "Lru/ozon/uni/atoms/data/button/Icon;", "priceIcon", "background", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "chevronIcon", "<init>", "(Lru/ozon/app/android/atoms/data/price/PriceWithTitle;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/Boolean;ZLru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/price/PriceWithTitle;", "getPrice", "()Lru/ozon/app/android/atoms/data/price/PriceWithTitle;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/lang/Integer;", "getAnimationTimer", "()Ljava/lang/Integer;", "Ljava/util/Map;", "getAnimationTrackingInfo", "()Ljava/util/Map;", "getTrackingInfo", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Ljava/lang/Boolean;", "getShowTopRounding", "()Ljava/lang/Boolean;", "Z", "getHasBadges", "()Z", "Lru/ozon/uni/atoms/data/button/Icon;", "getPriceIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Ljava/lang/String;", "getBackground", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getChevronIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class InstallmentDtoWrapper$Purchase {
    private final AtomActionDTO action;
    private final Integer animationTimer;
    private final Map<String, TokenizedTrackingInfo> animationTrackingInfo;

    @NotNull
    private final String background;
    private final CommonAtomIconDTO chevronIcon;
    private final boolean hasBadges;
    private final OnBoardingDTO onboarding;

    @NotNull
    private final PriceWithTitle price;
    private final Icon priceIcon;
    private final Boolean showTopRounding;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public InstallmentDtoWrapper$Purchase(@NotNull PriceWithTitle price, AtomActionDTO atomActionDTO, Integer num, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, OnBoardingDTO onBoardingDTO, Boolean bool, boolean z11, Icon icon, @NotNull String background, CommonAtomIconDTO commonAtomIconDTO) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(background, "background");
        this.price = price;
        this.action = atomActionDTO;
        this.animationTimer = num;
        this.animationTrackingInfo = map;
        this.trackingInfo = map2;
        this.onboarding = onBoardingDTO;
        this.showTopRounding = bool;
        this.hasBadges = z11;
        this.priceIcon = icon;
        this.background = background;
        this.chevronIcon = commonAtomIconDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallmentDtoWrapper$Purchase)) {
            return false;
        }
        InstallmentDtoWrapper$Purchase installmentDtoWrapper$Purchase = (InstallmentDtoWrapper$Purchase) other;
        return Intrinsics.d(this.price, installmentDtoWrapper$Purchase.price) && Intrinsics.d(this.action, installmentDtoWrapper$Purchase.action) && Intrinsics.d(this.animationTimer, installmentDtoWrapper$Purchase.animationTimer) && Intrinsics.d(this.animationTrackingInfo, installmentDtoWrapper$Purchase.animationTrackingInfo) && Intrinsics.d(this.trackingInfo, installmentDtoWrapper$Purchase.trackingInfo) && Intrinsics.d(this.onboarding, installmentDtoWrapper$Purchase.onboarding) && Intrinsics.d(this.showTopRounding, installmentDtoWrapper$Purchase.showTopRounding) && this.hasBadges == installmentDtoWrapper$Purchase.hasBadges && Intrinsics.d(this.priceIcon, installmentDtoWrapper$Purchase.priceIcon) && Intrinsics.d(this.background, installmentDtoWrapper$Purchase.background) && Intrinsics.d(this.chevronIcon, installmentDtoWrapper$Purchase.chevronIcon);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Integer getAnimationTimer() {
        return this.animationTimer;
    }

    public final Map<String, TokenizedTrackingInfo> getAnimationTrackingInfo() {
        return this.animationTrackingInfo;
    }

    @NotNull
    public final String getBackground() {
        return this.background;
    }

    public final CommonAtomIconDTO getChevronIcon() {
        return this.chevronIcon;
    }

    public final boolean getHasBadges() {
        return this.hasBadges;
    }

    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    @NotNull
    public final PriceWithTitle getPrice() {
        return this.price;
    }

    public final Icon getPriceIcon() {
        return this.priceIcon;
    }

    public final Boolean getShowTopRounding() {
        return this.showTopRounding;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.price.hashCode() * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Integer num = this.animationTimer;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.animationTrackingInfo;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        int hashCode5 = (hashCode4 + (map2 == null ? 0 : map2.hashCode())) * 31;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        int hashCode6 = (hashCode5 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
        Boolean bool = this.showTopRounding;
        int a11 = C3532b.a((hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.hasBadges);
        Icon icon = this.priceIcon;
        int a12 = g.a((a11 + (icon == null ? 0 : icon.hashCode())) * 31, 31, this.background);
        CommonAtomIconDTO commonAtomIconDTO = this.chevronIcon;
        return a12 + (commonAtomIconDTO != null ? commonAtomIconDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Purchase(price=" + this.price + ", action=" + this.action + ", animationTimer=" + this.animationTimer + ", animationTrackingInfo=" + this.animationTrackingInfo + ", trackingInfo=" + this.trackingInfo + ", onboarding=" + this.onboarding + ", showTopRounding=" + this.showTopRounding + ", hasBadges=" + this.hasBadges + ", priceIcon=" + this.priceIcon + ", background=" + this.background + ", chevronIcon=" + this.chevronIcon + ")";
    }
}
