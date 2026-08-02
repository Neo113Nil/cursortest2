package ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.rv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;
import ru.ozon.app.android.storefront.domain.onboarding.OnboardingFeature;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ScrollingTagListV3ViewHolder$initDelegate$1$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ OnBoardingDTO $onBoarding;
    final /* synthetic */ long $widgetId;
    final /* synthetic */ ScrollingTagListV3ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingTagListV3ViewHolder$initDelegate$1$1(ScrollingTagListV3ViewHolder scrollingTagListV3ViewHolder, OnBoardingDTO onBoardingDTO, long j11) {
        super(1);
        this.this$0 = scrollingTagListV3ViewHolder;
        this.$onBoarding = onBoardingDTO;
        this.$widgetId = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        OnBoardingDelegate onBoardingDelegate;
        CommonOnboardingRepository commonOnboardingRepository;
        if (z11) {
            this.this$0.trackOnboardingView(this.$onBoarding, this.$widgetId);
            onBoardingDelegate = this.this$0.onboardingDelegate;
            if (onBoardingDelegate != null) {
                onBoardingDelegate.unbind();
            }
            commonOnboardingRepository = this.this$0.onboardingRepository;
            commonOnboardingRepository.onShownOnboarding(OnboardingFeature.key$default(OnboardingFeature.SORT_AND_FILTER_IN_TAGS_ONBOARDING, null, 1, null));
        }
    }
}
