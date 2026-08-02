package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.viewbinders;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridVO;
import ru.ozon.app.android.storefront.data.tiles.onboarding.OnboardingModel;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class Srv2GridDefaultViewStateBinder$getOrCreateOnBoardingDelegate$1$1$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ OnboardingModel $onboardingModel;
    final /* synthetic */ Srv2GridDefaultViewStateBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Srv2GridDefaultViewStateBinder$getOrCreateOnBoardingDelegate$1$1$1(Srv2GridDefaultViewStateBinder srv2GridDefaultViewStateBinder, OnboardingModel onboardingModel) {
        super(1);
        this.this$0 = srv2GridDefaultViewStateBinder;
        this.$onboardingModel = onboardingModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        CommonOnboardingRepository commonOnboardingRepository;
        Srv2GridDefaultViewStateBinder srv2GridDefaultViewStateBinder = this.this$0;
        srv2GridDefaultViewStateBinder.trackOnboardingView(this.$onboardingModel, srv2GridDefaultViewStateBinder.getItem().getId());
        SearchResultsGridVO.BadgeOnboardingVO badgeOnboarding = this.this$0.getItem().getBadgeOnboarding();
        if (badgeOnboarding != null) {
            commonOnboardingRepository = this.this$0.onboardingRepository;
            commonOnboardingRepository.onShownOnboarding(badgeOnboarding.getOnboardingKey());
        }
    }
}
