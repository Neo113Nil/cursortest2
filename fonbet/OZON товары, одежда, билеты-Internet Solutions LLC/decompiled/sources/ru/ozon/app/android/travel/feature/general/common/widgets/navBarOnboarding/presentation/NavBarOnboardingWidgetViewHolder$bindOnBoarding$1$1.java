package ru.ozon.app.android.travel.feature.general.common.widgets.navBarOnboarding.presentation;

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
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateForOverlayWidgets;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateForOverlayWidgetsImpl;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "safeTag", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class NavBarOnboardingWidgetViewHolder$bindOnBoarding$1$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ String $key;
    final /* synthetic */ OnBoardingDTO $onboarding;
    final /* synthetic */ View $tabView;
    final /* synthetic */ NavBarOnboardingWidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.navBarOnboarding.presentation.NavBarOnboardingWidgetViewHolder$bindOnBoarding$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ String $key;
        final /* synthetic */ OnBoardingDTO $onboarding;
        final /* synthetic */ View $tabView;
        final /* synthetic */ NavBarOnboardingWidgetViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NavBarOnboardingWidgetViewHolder navBarOnboardingWidgetViewHolder, String str, OnBoardingDTO onBoardingDTO, View view) {
            super(0);
            this.this$0 = navBarOnboardingWidgetViewHolder;
            this.$key = str;
            this.$onboarding = onBoardingDTO;
            this.$tabView = view;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OnBoardingDelegateForOverlayWidgetsImpl onBoardingDelegateForOverlayWidgetsImpl;
            OnBoardingDelegateForOverlayWidgetsImpl onBoardingDelegateForOverlayWidgetsImpl2;
            float f7;
            onBoardingDelegateForOverlayWidgetsImpl = this.this$0.onBoardingDelegate;
            if (onBoardingDelegateForOverlayWidgetsImpl == null) {
                this.this$0.initDelegate(this.$key, this.$onboarding);
            }
            onBoardingDelegateForOverlayWidgetsImpl2 = this.this$0.onBoardingDelegate;
            if (onBoardingDelegateForOverlayWidgetsImpl2 != null) {
                View view = this.$tabView;
                f7 = this.this$0.onboardingCornerRadius;
                OnBoardingDelegateForOverlayWidgets.DefaultImpls.bind$default(onBoardingDelegateForOverlayWidgetsImpl2, view, new OnBoardingCutConfig(null, null, null, null, null, null, Float.valueOf(f7), false, 191, null), null, 4, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavBarOnboardingWidgetViewHolder$bindOnBoarding$1$1(NavBarOnboardingWidgetViewHolder navBarOnboardingWidgetViewHolder, String str, OnBoardingDTO onBoardingDTO, View view) {
        super(1);
        this.this$0 = navBarOnboardingWidgetViewHolder;
        this.$key = str;
        this.$onboarding = onBoardingDTO;
        this.$tabView = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String safeTag) {
        BaseOnBoardingViewModel baseOnBoardingViewModel;
        Intrinsics.checkNotNullParameter(safeTag, "safeTag");
        baseOnBoardingViewModel = this.this$0.onboardingViewModel;
        String str = this.$key;
        baseOnBoardingViewModel.showIfNeed(safeTag, str, new AnonymousClass1(this.this$0, str, this.$onboarding, this.$tabView));
    }
}
