package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.badge;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2VO;
import ru.ozon.app.android.storefront.data.tiles.onboarding.OnboardingModel;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BadgeOnboardingDelegate$getOrCreateOnBoardingDelegate$1$1$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ TileGrid2VO $item;
    final /* synthetic */ OnboardingModel $onboardingModel;
    final /* synthetic */ BadgeOnboardingDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BadgeOnboardingDelegate$getOrCreateOnBoardingDelegate$1$1$1(BadgeOnboardingDelegate badgeOnboardingDelegate, OnboardingModel onboardingModel, TileGrid2VO tileGrid2VO) {
        super(1);
        this.this$0 = badgeOnboardingDelegate;
        this.$onboardingModel = onboardingModel;
        this.$item = tileGrid2VO;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        String onboardingKey;
        CommonOnboardingRepository commonOnboardingRepository;
        this.this$0.trackOnboardingView(this.$onboardingModel, this.$item.getId());
        TileGrid2VO.BadgeOnboardingVO badgeOnboarding = this.$item.getBadgeOnboarding();
        if (badgeOnboarding == null || (onboardingKey = badgeOnboarding.getOnboardingKey()) == null) {
            return;
        }
        commonOnboardingRepository = this.this$0.onboardingRepository;
        commonOnboardingRepository.onShownOnboarding(onboardingKey);
    }
}
