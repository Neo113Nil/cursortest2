package ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.pdp.utils.Dimens;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pageTag", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PriceActionsViewHolder$onOnboardingShow$1$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ OnBoardingDTO $onboarding;
    final /* synthetic */ View $view;
    final /* synthetic */ PriceActionsViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.presentation.PriceActionsViewHolder$onOnboardingShow$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ OnBoardingDTO $onboarding;
        final /* synthetic */ View $view;
        final /* synthetic */ PriceActionsViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PriceActionsViewHolder priceActionsViewHolder, OnBoardingDTO onBoardingDTO, View view) {
            super(0);
            this.this$0 = priceActionsViewHolder;
            this.$onboarding = onBoardingDTO;
            this.$view = view;
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
            onBoardingDelegate = this.this$0.onBoardingDelegate;
            if (onBoardingDelegate == null) {
                this.this$0.initDelegate(this.$onboarding);
            }
            View itemView = this.this$0.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            onBoardingDelegate2 = this.this$0.onBoardingDelegate;
            if (onBoardingDelegate2 != null) {
                PriceActionsViewHolder priceActionsViewHolder = this.this$0;
                int left = this.$view.getLeft();
                Dimens dimens = Dimens.INSTANCE;
                OnBoardingDelegate.DefaultImpls.bind$default(onBoardingDelegate2, priceActionsViewHolder, new OnBoardingCutConfig(Integer.valueOf(left - dimens.getDP_8()), null, Integer.valueOf((itemView.getRight() - this.$view.getRight()) - dimens.getDP_8()), null, Integer.valueOf(-dimens.getDP_8()), null, Float.valueOf(dimens.getDPF_24()), false, 170, null), null, 4, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceActionsViewHolder$onOnboardingShow$1$1(PriceActionsViewHolder priceActionsViewHolder, OnBoardingDTO onBoardingDTO, View view) {
        super(1);
        this.this$0 = priceActionsViewHolder;
        this.$onboarding = onBoardingDTO;
        this.$view = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String pageTag) {
        BaseOnBoardingViewModel baseOnBoardingViewModel;
        Intrinsics.checkNotNullParameter(pageTag, "pageTag");
        baseOnBoardingViewModel = this.this$0.onBoardingViewModel;
        baseOnBoardingViewModel.showIfNeed(pageTag, "price_actions_on_boarding_is_shown", new AnonymousClass1(this.this$0, this.$onboarding, this.$view));
    }
}
