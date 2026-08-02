package ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SearchBarViewHolder$initDelegate$1$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ String $onboardingKey;
    final /* synthetic */ SearchBarViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBarViewHolder$initDelegate$1$1(SearchBarViewHolder searchBarViewHolder, String str) {
        super(1);
        this.this$0 = searchBarViewHolder;
        this.$onboardingKey = str;
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
            onBoardingDelegate = this.this$0.onboardingDelegate;
            if (onBoardingDelegate != null) {
                onBoardingDelegate.unbind();
            }
            commonOnboardingRepository = this.this$0.onboardingRepository;
            commonOnboardingRepository.onShownOnboarding(this.$onboardingKey);
        }
    }
}
