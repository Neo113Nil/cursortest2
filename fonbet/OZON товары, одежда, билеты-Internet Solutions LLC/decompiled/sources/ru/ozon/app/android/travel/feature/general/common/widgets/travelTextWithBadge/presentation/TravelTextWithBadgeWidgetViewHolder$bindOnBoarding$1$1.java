package ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithBadge.presentation;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
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
import ru.ozon.uni.android.atom.badge.BadgeView;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pageTag", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelTextWithBadgeWidgetViewHolder$bindOnBoarding$1$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ BadgeView $view;
    final /* synthetic */ OnBoardingDTO $vo;
    final /* synthetic */ TravelTextWithBadgeWidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithBadge.presentation.TravelTextWithBadgeWidgetViewHolder$bindOnBoarding$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ BadgeView $view;
        final /* synthetic */ OnBoardingDTO $vo;
        final /* synthetic */ TravelTextWithBadgeWidgetViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TravelTextWithBadgeWidgetViewHolder travelTextWithBadgeWidgetViewHolder, OnBoardingDTO onBoardingDTO, BadgeView badgeView) {
            super(0);
            this.this$0 = travelTextWithBadgeWidgetViewHolder;
            this.$vo = onBoardingDTO;
            this.$view = badgeView;
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
                this.this$0.initDelegate(this.$vo);
            }
            onBoardingDelegate2 = this.this$0.onBoardingDelegate;
            if (onBoardingDelegate2 != null) {
                TravelTextWithBadgeWidgetViewHolder travelTextWithBadgeWidgetViewHolder = this.this$0;
                int right = travelTextWithBadgeWidgetViewHolder.getContainerView().getRight() - this.$view.getRight();
                int left = this.$view.getLeft();
                int top = this.$view.getTop();
                int bottom = this.this$0.getContainerView().getBottom() - this.$view.getBottom();
                Drawable background = this.$view.getBackground();
                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                OnBoardingDelegate.DefaultImpls.bind$default(onBoardingDelegate2, travelTextWithBadgeWidgetViewHolder, new OnBoardingCutConfig(Integer.valueOf(left), Integer.valueOf(top), Integer.valueOf(right), Integer.valueOf(bottom), null, null, gradientDrawable != null ? Float.valueOf(gradientDrawable.getCornerRadius()) : null, false, 176, null), null, 4, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelTextWithBadgeWidgetViewHolder$bindOnBoarding$1$1(TravelTextWithBadgeWidgetViewHolder travelTextWithBadgeWidgetViewHolder, OnBoardingDTO onBoardingDTO, BadgeView badgeView) {
        super(1);
        this.this$0 = travelTextWithBadgeWidgetViewHolder;
        this.$vo = onBoardingDTO;
        this.$view = badgeView;
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
        baseOnBoardingViewModel = this.this$0.onboardingViewModel;
        String onboardingKey = this.$vo.getOnboardingKey();
        if (onboardingKey == null) {
            onboardingKey = "travel_text_with_badge_onboarding_key";
        }
        baseOnBoardingViewModel.showIfNeed(pageTag, onboardingKey, new AnonymousClass1(this.this$0, this.$vo, this.$view));
    }
}
