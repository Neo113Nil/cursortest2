package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.info;

import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.price.PriceV2VO$BonusInfo;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.PriceV2VOWrapper;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b\r\u0010,R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/info/PriceV2InfoVO;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/PriceV2VOWrapper;", "", "id", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$BonusInfo;", "info", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "", "isLastItem", "Lru/ozon/app/android/pdp/utils/CornersConfig;", "backgroundCornersConfig", "<init>", "(JLru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$BonusInfo;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;ZLru/ozon/app/android/pdp/utils/CornersConfig;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$BonusInfo;", "getInfo", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$BonusInfo;", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Z", "()Z", "Lru/ozon/app/android/pdp/utils/CornersConfig;", "getBackgroundCornersConfig", "()Lru/ozon/app/android/pdp/utils/CornersConfig;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PriceV2InfoVO implements PriceV2VOWrapper {
    public static final int $stable = (AtomAction.$stable | Icon.$stable) | PriceV2VO$BonusInfo.$stable;
    private final AtomAction action;

    @NotNull
    private final CornersConfig backgroundCornersConfig;
    private final Icon icon;
    private final long id;

    @NotNull
    private final PriceV2VO$BonusInfo info;
    private final boolean isLastItem;
    private final OnBoardingDTO onboarding;

    public PriceV2InfoVO(long j11, @NotNull PriceV2VO$BonusInfo info, Icon icon, AtomAction atomAction, OnBoardingDTO onBoardingDTO, boolean z11, @NotNull CornersConfig backgroundCornersConfig) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(backgroundCornersConfig, "backgroundCornersConfig");
        this.id = j11;
        this.info = info;
        this.icon = icon;
        this.action = atomAction;
        this.onboarding = onBoardingDTO;
        this.isLastItem = z11;
        this.backgroundCornersConfig = backgroundCornersConfig;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceV2InfoVO)) {
            return false;
        }
        PriceV2InfoVO priceV2InfoVO = (PriceV2InfoVO) other;
        return this.id == priceV2InfoVO.id && Intrinsics.d(this.info, priceV2InfoVO.info) && Intrinsics.d(this.icon, priceV2InfoVO.icon) && Intrinsics.d(this.action, priceV2InfoVO.action) && Intrinsics.d(this.onboarding, priceV2InfoVO.onboarding) && this.isLastItem == priceV2InfoVO.isLastItem && this.backgroundCornersConfig == priceV2InfoVO.backgroundCornersConfig;
    }

    @NotNull
    public CornersConfig getBackgroundCornersConfig() {
        return this.backgroundCornersConfig;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final PriceV2VO$BonusInfo getInfo() {
        return this.info;
    }

    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return PriceV2VOWrapper.DefaultImpls.getScrollWidgetKey(this);
    }

    @Override // l20.c
    public int getViewItemKey() {
        return PriceV2VOWrapper.DefaultImpls.getViewItemKey(this);
    }

    public int hashCode() {
        int hashCode = (this.info.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        Icon icon = this.icon;
        int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        return this.backgroundCornersConfig.hashCode() + C3532b.a((hashCode3 + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0)) * 31, 31, this.isLastItem);
    }

    /* renamed from: isLastItem, reason: from getter */
    public final boolean getIsLastItem() {
        return this.isLastItem;
    }

    @NotNull
    public String toString() {
        return "PriceV2InfoVO(id=" + this.id + ", info=" + this.info + ", icon=" + this.icon + ", action=" + this.action + ", onboarding=" + this.onboarding + ", isLastItem=" + this.isLastItem + ", backgroundCornersConfig=" + this.backgroundCornersConfig + ")";
    }
}
