package ru.ozon.app.android.pdp.widgets.priceV4.presentation.top;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.vo.PriceV4VoWrapper;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "onboardingKey", "", "cutConfig", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PriceV4TopWithBadgeViewHolder$bind$2 extends AbstractC7737t implements Function2<String, OnBoardingCutConfig, Unit> {
    final /* synthetic */ PriceV4VoWrapper.TopWithFinBadge $item;
    final /* synthetic */ PriceV4TopWithBadgeViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceV4TopWithBadgeViewHolder$bind$2(PriceV4VoWrapper.TopWithFinBadge topWithFinBadge, PriceV4TopWithBadgeViewHolder priceV4TopWithBadgeViewHolder) {
        super(2);
        this.$item = topWithFinBadge;
        this.this$0 = priceV4TopWithBadgeViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, OnBoardingCutConfig onBoardingCutConfig) {
        invoke2(str, onBoardingCutConfig);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String onboardingKey, OnBoardingCutConfig cutConfig) {
        PriceV4TopWithBadgeView priceV4TopWithBadgeView;
        Intrinsics.checkNotNullParameter(onboardingKey, "onboardingKey");
        Intrinsics.checkNotNullParameter(cutConfig, "cutConfig");
        OnBoardingDTO onboarding = this.$item.getOnboarding();
        if (onboarding != null) {
            PriceV4TopWithBadgeViewHolder priceV4TopWithBadgeViewHolder = this.this$0;
            PriceV4VoWrapper.TopWithFinBadge topWithFinBadge = this.$item;
            priceV4TopWithBadgeView = priceV4TopWithBadgeViewHolder.view;
            priceV4TopWithBadgeViewHolder.bindOnboarding(onboardingKey, priceV4TopWithBadgeView, onboarding, cutConfig, new PriceV4TopWithBadgeViewHolder$bind$2$1$1(topWithFinBadge, priceV4TopWithBadgeViewHolder));
        }
    }
}
