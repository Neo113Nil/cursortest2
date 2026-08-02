package ru.ozon.app.android.pdp.widgets.installmentPurchase.data;

import G.g;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.price.PriceWithTitle;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\b\u0081\b\u0018\u00002\u00020\u0001:\u0001HB\u009b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\n\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u00106\u001a\u00020\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\u0017\u00109\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J\u0017\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010*J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010@\u001a\u00020\nHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u001aHÆ\u0003J¸\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\u00102\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u0007HÖ\u0001J\t\u0010G\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0018\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006I"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/data/InstallmentPurchaseDTO;", "", "price", "Lru/ozon/app/android/atoms/data/price/PriceWithTitle;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "animationTimer", "", "animationTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "showTopRounding", "", "badges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "priceIcon", "Lru/ozon/uni/atoms/data/button/Icon;", "titleBlock", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/data/InstallmentPurchaseDTO$TitleBlockDTO;", "innerBackground", "chevronIcon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "<init>", "(Lru/ozon/app/android/atoms/data/price/PriceWithTitle;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/Boolean;Ljava/util/List;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/app/android/pdp/widgets/installmentPurchase/data/InstallmentPurchaseDTO$TitleBlockDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;)V", "getPrice", "()Lru/ozon/app/android/atoms/data/price/PriceWithTitle;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAnimationTimer", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAnimationTrackingInfo", "()Ljava/util/Map;", "getTrackingInfo", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getShowTopRounding", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBadges", "()Ljava/util/List;", "getPriceIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getTitleBlock", "()Lru/ozon/app/android/pdp/widgets/installmentPurchase/data/InstallmentPurchaseDTO$TitleBlockDTO;", "getInnerBackground", "()Ljava/lang/String;", "getChevronIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Lru/ozon/app/android/atoms/data/price/PriceWithTitle;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/Boolean;Ljava/util/List;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/app/android/pdp/widgets/installmentPurchase/data/InstallmentPurchaseDTO$TitleBlockDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;)Lru/ozon/app/android/pdp/widgets/installmentPurchase/data/InstallmentPurchaseDTO;", "equals", "other", "hashCode", "toString", "TitleBlockDTO", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class InstallmentPurchaseDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final Integer animationTimer;
    private final Map<String, TokenizedTrackingInfo> animationTrackingInfo;
    private final List<BadgeDTO> badges;
    private final CommonAtomIconDTO chevronIcon;

    @NotNull
    private final String innerBackground;
    private final OnBoardingDTO onboarding;

    @NotNull
    private final PriceWithTitle price;
    private final Icon priceIcon;
    private final Boolean showTopRounding;
    private final TitleBlockDTO titleBlock;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/data/InstallmentPurchaseDTO$TitleBlockDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TitleBlockDTO {
        public static final int $stable = 0;
        private final BadgeDTO badge;

        @NotNull
        private final TextDTO title;

        public TitleBlockDTO(@NotNull TextDTO title, BadgeDTO badgeDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.badge = badgeDTO;
        }

        public static /* synthetic */ TitleBlockDTO copy$default(TitleBlockDTO titleBlockDTO, TextDTO textDTO, BadgeDTO badgeDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = titleBlockDTO.title;
            }
            if ((i11 & 2) != 0) {
                badgeDTO = titleBlockDTO.badge;
            }
            return titleBlockDTO.copy(textDTO, badgeDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final TitleBlockDTO copy(@NotNull TextDTO title, BadgeDTO badge) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new TitleBlockDTO(title, badge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TitleBlockDTO)) {
                return false;
            }
            TitleBlockDTO titleBlockDTO = (TitleBlockDTO) other;
            return Intrinsics.d(this.title, titleBlockDTO.title) && Intrinsics.d(this.badge, titleBlockDTO.badge);
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            BadgeDTO badgeDTO = this.badge;
            return hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "TitleBlockDTO(title=" + this.title + ", badge=" + this.badge + ")";
        }
    }

    public InstallmentPurchaseDTO(@NotNull PriceWithTitle price, AtomActionDTO atomActionDTO, Integer num, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, OnBoardingDTO onBoardingDTO, Boolean bool, List<BadgeDTO> list, Icon icon, TitleBlockDTO titleBlockDTO, @NotNull String innerBackground, CommonAtomIconDTO commonAtomIconDTO) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(innerBackground, "innerBackground");
        this.price = price;
        this.action = atomActionDTO;
        this.animationTimer = num;
        this.animationTrackingInfo = map;
        this.trackingInfo = map2;
        this.onboarding = onBoardingDTO;
        this.showTopRounding = bool;
        this.badges = list;
        this.priceIcon = icon;
        this.titleBlock = titleBlockDTO;
        this.innerBackground = innerBackground;
        this.chevronIcon = commonAtomIconDTO;
    }

    public static /* synthetic */ InstallmentPurchaseDTO copy$default(InstallmentPurchaseDTO installmentPurchaseDTO, PriceWithTitle priceWithTitle, AtomActionDTO atomActionDTO, Integer num, Map map, Map map2, OnBoardingDTO onBoardingDTO, Boolean bool, List list, Icon icon, TitleBlockDTO titleBlockDTO, String str, CommonAtomIconDTO commonAtomIconDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            priceWithTitle = installmentPurchaseDTO.price;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = installmentPurchaseDTO.action;
        }
        if ((i11 & 4) != 0) {
            num = installmentPurchaseDTO.animationTimer;
        }
        if ((i11 & 8) != 0) {
            map = installmentPurchaseDTO.animationTrackingInfo;
        }
        if ((i11 & 16) != 0) {
            map2 = installmentPurchaseDTO.trackingInfo;
        }
        if ((i11 & 32) != 0) {
            onBoardingDTO = installmentPurchaseDTO.onboarding;
        }
        if ((i11 & 64) != 0) {
            bool = installmentPurchaseDTO.showTopRounding;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            list = installmentPurchaseDTO.badges;
        }
        if ((i11 & 256) != 0) {
            icon = installmentPurchaseDTO.priceIcon;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            titleBlockDTO = installmentPurchaseDTO.titleBlock;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            str = installmentPurchaseDTO.innerBackground;
        }
        if ((i11 & 2048) != 0) {
            commonAtomIconDTO = installmentPurchaseDTO.chevronIcon;
        }
        String str2 = str;
        CommonAtomIconDTO commonAtomIconDTO2 = commonAtomIconDTO;
        Icon icon2 = icon;
        TitleBlockDTO titleBlockDTO2 = titleBlockDTO;
        Boolean bool2 = bool;
        List list2 = list;
        Map map3 = map2;
        OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
        return installmentPurchaseDTO.copy(priceWithTitle, atomActionDTO, num, map, map3, onBoardingDTO2, bool2, list2, icon2, titleBlockDTO2, str2, commonAtomIconDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PriceWithTitle getPrice() {
        return this.price;
    }

    /* renamed from: component10, reason: from getter */
    public final TitleBlockDTO getTitleBlock() {
        return this.titleBlock;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getInnerBackground() {
        return this.innerBackground;
    }

    /* renamed from: component12, reason: from getter */
    public final CommonAtomIconDTO getChevronIcon() {
        return this.chevronIcon;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getAnimationTimer() {
        return this.animationTimer;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.animationTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getShowTopRounding() {
        return this.showTopRounding;
    }

    public final List<BadgeDTO> component8() {
        return this.badges;
    }

    /* renamed from: component9, reason: from getter */
    public final Icon getPriceIcon() {
        return this.priceIcon;
    }

    @NotNull
    public final InstallmentPurchaseDTO copy(@NotNull PriceWithTitle price, AtomActionDTO action, Integer animationTimer, Map<String, TokenizedTrackingInfo> animationTrackingInfo, Map<String, TokenizedTrackingInfo> trackingInfo, OnBoardingDTO onboarding, Boolean showTopRounding, List<BadgeDTO> badges, Icon priceIcon, TitleBlockDTO titleBlock, @NotNull String innerBackground, CommonAtomIconDTO chevronIcon) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(innerBackground, "innerBackground");
        return new InstallmentPurchaseDTO(price, action, animationTimer, animationTrackingInfo, trackingInfo, onboarding, showTopRounding, badges, priceIcon, titleBlock, innerBackground, chevronIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallmentPurchaseDTO)) {
            return false;
        }
        InstallmentPurchaseDTO installmentPurchaseDTO = (InstallmentPurchaseDTO) other;
        return Intrinsics.d(this.price, installmentPurchaseDTO.price) && Intrinsics.d(this.action, installmentPurchaseDTO.action) && Intrinsics.d(this.animationTimer, installmentPurchaseDTO.animationTimer) && Intrinsics.d(this.animationTrackingInfo, installmentPurchaseDTO.animationTrackingInfo) && Intrinsics.d(this.trackingInfo, installmentPurchaseDTO.trackingInfo) && Intrinsics.d(this.onboarding, installmentPurchaseDTO.onboarding) && Intrinsics.d(this.showTopRounding, installmentPurchaseDTO.showTopRounding) && Intrinsics.d(this.badges, installmentPurchaseDTO.badges) && Intrinsics.d(this.priceIcon, installmentPurchaseDTO.priceIcon) && Intrinsics.d(this.titleBlock, installmentPurchaseDTO.titleBlock) && Intrinsics.d(this.innerBackground, installmentPurchaseDTO.innerBackground) && Intrinsics.d(this.chevronIcon, installmentPurchaseDTO.chevronIcon);
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

    public final List<BadgeDTO> getBadges() {
        return this.badges;
    }

    public final CommonAtomIconDTO getChevronIcon() {
        return this.chevronIcon;
    }

    @NotNull
    public final String getInnerBackground() {
        return this.innerBackground;
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

    public final TitleBlockDTO getTitleBlock() {
        return this.titleBlock;
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
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<BadgeDTO> list = this.badges;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Icon icon = this.priceIcon;
        int hashCode9 = (hashCode8 + (icon == null ? 0 : icon.hashCode())) * 31;
        TitleBlockDTO titleBlockDTO = this.titleBlock;
        int a11 = g.a((hashCode9 + (titleBlockDTO == null ? 0 : titleBlockDTO.hashCode())) * 31, 31, this.innerBackground);
        CommonAtomIconDTO commonAtomIconDTO = this.chevronIcon;
        return a11 + (commonAtomIconDTO != null ? commonAtomIconDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InstallmentPurchaseDTO(price=" + this.price + ", action=" + this.action + ", animationTimer=" + this.animationTimer + ", animationTrackingInfo=" + this.animationTrackingInfo + ", trackingInfo=" + this.trackingInfo + ", onboarding=" + this.onboarding + ", showTopRounding=" + this.showTopRounding + ", badges=" + this.badges + ", priceIcon=" + this.priceIcon + ", titleBlock=" + this.titleBlock + ", innerBackground=" + this.innerBackground + ", chevronIcon=" + this.chevronIcon + ")";
    }

    public /* synthetic */ InstallmentPurchaseDTO(PriceWithTitle priceWithTitle, AtomActionDTO atomActionDTO, Integer num, Map map, Map map2, OnBoardingDTO onBoardingDTO, Boolean bool, List list, Icon icon, TitleBlockDTO titleBlockDTO, String str, CommonAtomIconDTO commonAtomIconDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(priceWithTitle, atomActionDTO, num, map, map2, onBoardingDTO, bool, list, icon, titleBlockDTO, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? UniColors.BG_PRIMARY.getToken() : str, commonAtomIconDTO);
    }
}
