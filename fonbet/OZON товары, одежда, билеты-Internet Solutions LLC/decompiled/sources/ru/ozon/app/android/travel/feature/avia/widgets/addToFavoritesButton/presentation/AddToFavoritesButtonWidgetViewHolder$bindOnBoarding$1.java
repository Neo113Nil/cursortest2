package ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateForOverlayWidgets;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateForOverlayWidgetsImpl;
import ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.view.AddToFavoritesButtonView;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pageTag", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AddToFavoritesButtonWidgetViewHolder$bindOnBoarding$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ OnBoardingDTO $vo;
    final /* synthetic */ AddToFavoritesButtonWidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.presentation.AddToFavoritesButtonWidgetViewHolder$bindOnBoarding$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ OnBoardingDTO $vo;
        final /* synthetic */ AddToFavoritesButtonWidgetViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AddToFavoritesButtonWidgetViewHolder addToFavoritesButtonWidgetViewHolder, OnBoardingDTO onBoardingDTO) {
            super(0);
            this.this$0 = addToFavoritesButtonWidgetViewHolder;
            this.$vo = onBoardingDTO;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AddToFavoritesButtonView addToFavoritesButtonView;
            float f7;
            if (this.this$0.onBoardingDelegate == null) {
                this.this$0.initDelegate(this.$vo);
            }
            OnBoardingDelegateForOverlayWidgetsImpl onBoardingDelegateForOverlayWidgetsImpl = this.this$0.onBoardingDelegate;
            if (onBoardingDelegateForOverlayWidgetsImpl != null) {
                addToFavoritesButtonView = this.this$0.view;
                f7 = this.this$0.onboardingCornerRadius;
                OnBoardingDelegateForOverlayWidgets.DefaultImpls.bind$default(onBoardingDelegateForOverlayWidgetsImpl, addToFavoritesButtonView, new OnBoardingCutConfig(null, null, null, null, null, null, Float.valueOf(f7), false, 191, null), null, 4, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToFavoritesButtonWidgetViewHolder$bindOnBoarding$1(AddToFavoritesButtonWidgetViewHolder addToFavoritesButtonWidgetViewHolder, OnBoardingDTO onBoardingDTO) {
        super(1);
        this.this$0 = addToFavoritesButtonWidgetViewHolder;
        this.$vo = onBoardingDTO;
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
        String onboardingKey = this.$vo.getOnboardingKey();
        if (onboardingKey == null) {
            onboardingKey = "add_to_favorites_onboarding_key";
        }
        baseOnBoardingViewModel.showIfNeed(pageTag, onboardingKey, new AnonymousClass1(this.this$0, this.$vo));
    }
}
