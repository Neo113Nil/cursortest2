package ru.ozon.app.android.pdp.widgets.priceV4.presentation.bottom;

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
final class PriceV4BottomViewHolder$bind$2 extends AbstractC7737t implements Function2<String, OnBoardingCutConfig, Unit> {
    final /* synthetic */ PriceV4VoWrapper.Bottom $item;
    final /* synthetic */ PriceV4BottomViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceV4BottomViewHolder$bind$2(PriceV4VoWrapper.Bottom bottom, PriceV4BottomViewHolder priceV4BottomViewHolder) {
        super(2);
        this.$item = bottom;
        this.this$0 = priceV4BottomViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, OnBoardingCutConfig onBoardingCutConfig) {
        invoke2(str, onBoardingCutConfig);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String onboardingKey, OnBoardingCutConfig cutConfig) {
        PriceV4BottomView priceV4BottomView;
        Intrinsics.checkNotNullParameter(onboardingKey, "onboardingKey");
        Intrinsics.checkNotNullParameter(cutConfig, "cutConfig");
        OnBoardingDTO onboarding = this.$item.getOnboarding();
        if (onboarding != null) {
            PriceV4BottomViewHolder priceV4BottomViewHolder = this.this$0;
            PriceV4VoWrapper.Bottom bottom = this.$item;
            priceV4BottomView = priceV4BottomViewHolder.view;
            priceV4BottomViewHolder.bindOnboarding(onboardingKey, priceV4BottomView, onboarding, cutConfig, new PriceV4BottomViewHolder$bind$2$1$1(bottom, priceV4BottomViewHolder));
        }
    }
}
