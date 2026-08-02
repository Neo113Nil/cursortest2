package ru.ozon.app.android.common.tabs.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.common.tabs.presentation.TabsV2VO;
import ru.ozon.app.android.common.tabs.presentation.TabsV2ViewHolder;
import ru.ozon.app.android.common.tabs.presentation.onboarding.TabsOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TabsV2ViewHolder$bindOnboarding$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ TabsV2VO.OnBoardingVO $onboarding;
    final /* synthetic */ int $tabsSize;
    final /* synthetic */ AtomAction $targetTabAction;
    final /* synthetic */ View $this_with;
    final /* synthetic */ TabsV2ViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.common.tabs.presentation.TabsV2ViewHolder$bindOnboarding$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ AtomAction $targetTabAction;
        final /* synthetic */ TabsV2ViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AtomAction atomAction, TabsV2ViewHolder tabsV2ViewHolder) {
            super(0);
            this.$targetTabAction = atomAction;
            this.this$0 = tabsV2ViewHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Function1 function1;
            AtomAction atomAction = this.$targetTabAction;
            if (atomAction != null) {
                function1 = this.this$0.actionHandler;
                function1.invoke(atomAction);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabsV2ViewHolder$bindOnboarding$1$1(TabsV2ViewHolder tabsV2ViewHolder, TabsV2VO.OnBoardingVO onBoardingVO, View view, int i11, AtomAction atomAction) {
        super(0);
        this.this$0 = tabsV2ViewHolder;
        this.$onboarding = onBoardingVO;
        this.$this_with = view;
        this.$tabsSize = i11;
        this.$targetTabAction = atomAction;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OnBoardingDelegate onBoardingDelegate;
        TabsV2ViewHolder.Companion companion;
        OnBoardingDelegate onBoardingDelegate2;
        float onboardingCornerRadius;
        TabsV2ViewHolder.Companion companion2;
        TabsV2ViewHolder.Companion companion3;
        TabsOnBoardingViewModel tabsOnBoardingViewModel;
        onBoardingDelegate = this.this$0.onBoardingDelegate;
        if (onBoardingDelegate == null) {
            TabsV2ViewHolder tabsV2ViewHolder = this.this$0;
            tabsOnBoardingViewModel = tabsV2ViewHolder.viewModel;
            tabsV2ViewHolder.initDelegate(tabsOnBoardingViewModel, this.$onboarding.getOnBoardingDTO());
        }
        int right = this.$this_with.getRight() - this.$this_with.getLeft();
        companion = TabsV2ViewHolder.Companion;
        int onboarding_horizontal_margin = (right - (companion.getONBOARDING_HORIZONTAL_MARGIN() * 2)) / this.$tabsSize;
        onBoardingDelegate2 = this.this$0.onBoardingDelegate;
        if (onBoardingDelegate2 != null) {
            TabsV2ViewHolder tabsV2ViewHolder2 = this.this$0;
            onboardingCornerRadius = tabsV2ViewHolder2.getOnboardingCornerRadius();
            companion2 = TabsV2ViewHolder.Companion;
            int tabPosition = (this.$onboarding.getTabPosition() * onboarding_horizontal_margin) + companion2.getONBOARDING_HORIZONTAL_MARGIN();
            companion3 = TabsV2ViewHolder.Companion;
            int tabPosition2 = ((this.$tabsSize - (this.$onboarding.getTabPosition() + 1)) * onboarding_horizontal_margin) + companion3.getONBOARDING_HORIZONTAL_MARGIN();
            onBoardingDelegate2.bind(tabsV2ViewHolder2, new OnBoardingCutConfig(Integer.valueOf(tabPosition), Integer.valueOf(this.$this_with.getPaddingTop()), Integer.valueOf(tabPosition2), Integer.valueOf(this.$this_with.getPaddingBottom()), null, null, Float.valueOf(onboardingCornerRadius), false, 48, null), new AnonymousClass1(this.$targetTabAction, this.this$0));
        }
    }
}
