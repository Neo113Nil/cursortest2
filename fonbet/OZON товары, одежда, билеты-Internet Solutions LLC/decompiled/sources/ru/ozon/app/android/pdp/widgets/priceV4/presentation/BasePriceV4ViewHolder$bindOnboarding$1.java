package ru.ozon.app.android.pdp.widgets.priceV4.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class BasePriceV4ViewHolder$bindOnboarding$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ OnBoardingCutConfig $cutConfig;
    final /* synthetic */ Function0<Unit> $onCropAreaClick;
    final /* synthetic */ OnBoardingDTO $onboarding;
    final /* synthetic */ String $onboardingKey;
    final /* synthetic */ BasePriceV4ViewHolder<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasePriceV4ViewHolder$bindOnboarding$1(BasePriceV4ViewHolder<T> basePriceV4ViewHolder, OnBoardingDTO onBoardingDTO, String str, OnBoardingCutConfig onBoardingCutConfig, Function0<Unit> function0) {
        super(0);
        this.this$0 = basePriceV4ViewHolder;
        this.$onboarding = onBoardingDTO;
        this.$onboardingKey = str;
        this.$cutConfig = onBoardingCutConfig;
        this.$onCropAreaClick = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OnBoardingDelegate onBoardingDelegate;
        OnBoardingDelegate onBoardingDelegate2;
        onBoardingDelegate = ((BasePriceV4ViewHolder) this.this$0).onboardingDelegate;
        if (onBoardingDelegate == null) {
            this.this$0.initOnboardingDelegate(this.$onboarding, this.$onboardingKey);
        }
        onBoardingDelegate2 = ((BasePriceV4ViewHolder) this.this$0).onboardingDelegate;
        if (onBoardingDelegate2 != null) {
            onBoardingDelegate2.bind(this.this$0, this.$cutConfig, this.$onCropAreaClick);
        }
    }
}
