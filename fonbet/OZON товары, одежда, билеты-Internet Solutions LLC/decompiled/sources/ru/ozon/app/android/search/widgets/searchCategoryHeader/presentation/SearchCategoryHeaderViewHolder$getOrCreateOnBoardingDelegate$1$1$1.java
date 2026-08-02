package ru.ozon.app.android.search.widgets.searchCategoryHeader.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.data.tiles.onboarding.OnboardingModel;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;
import ru.ozon.app.android.storefront.domain.onboarding.OnboardingFeature;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isShown", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SearchCategoryHeaderViewHolder$getOrCreateOnBoardingDelegate$1$1$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ SearchCategoryHeaderVO $vo;
    final /* synthetic */ SearchCategoryHeaderViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchCategoryHeaderViewHolder$getOrCreateOnBoardingDelegate$1$1$1(SearchCategoryHeaderViewHolder searchCategoryHeaderViewHolder, SearchCategoryHeaderVO searchCategoryHeaderVO) {
        super(1);
        this.this$0 = searchCategoryHeaderViewHolder;
        this.$vo = searchCategoryHeaderVO;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        OnboardingModel onboarding;
        CommonOnboardingRepository commonOnboardingRepository;
        SearchCategoryHeaderVO boundedData = this.this$0.getBoundedData();
        if (boundedData == null || (onboarding = boundedData.getOnboarding()) == null) {
            return;
        }
        SearchCategoryHeaderViewHolder searchCategoryHeaderViewHolder = this.this$0;
        SearchCategoryHeaderVO searchCategoryHeaderVO = this.$vo;
        if (z11) {
            searchCategoryHeaderViewHolder.trackOnboardingView(onboarding, searchCategoryHeaderVO.getId());
        }
        commonOnboardingRepository = searchCategoryHeaderViewHolder.onboardingRepository;
        commonOnboardingRepository.onShownOnboarding(OnboardingFeature.key$default(OnboardingFeature.SEARCH_CATEGORY_HEADER_ONBOARDING, null, 1, null));
    }
}
