package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.skeleton;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
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

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pageTag", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultV4LoadingWidgetViewHolder$bindOnBoarding$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ View $containerItem;
    final /* synthetic */ View $view;
    final /* synthetic */ OnBoardingDTO $vo;
    final /* synthetic */ AviaSearchResultV4LoadingWidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.skeleton.AviaSearchResultV4LoadingWidgetViewHolder$bindOnBoarding$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ View $containerItem;
        final /* synthetic */ View $view;
        final /* synthetic */ OnBoardingDTO $vo;
        final /* synthetic */ AviaSearchResultV4LoadingWidgetViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AviaSearchResultV4LoadingWidgetViewHolder aviaSearchResultV4LoadingWidgetViewHolder, OnBoardingDTO onBoardingDTO, View view, View view2) {
            super(0);
            this.this$0 = aviaSearchResultV4LoadingWidgetViewHolder;
            this.$vo = onBoardingDTO;
            this.$view = view;
            this.$containerItem = view2;
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
            int i11;
            int i12;
            int i13;
            int i14;
            onBoardingDelegate = this.this$0.onBoardingDelegate;
            if (onBoardingDelegate == null) {
                this.this$0.initDelegate(this.$vo);
            }
            onBoardingDelegate2 = this.this$0.onBoardingDelegate;
            if (onBoardingDelegate2 != null) {
                AviaSearchResultV4LoadingWidgetViewHolder aviaSearchResultV4LoadingWidgetViewHolder = this.this$0;
                int left = this.$containerItem.getLeft() + this.$view.getLeft();
                i11 = this.this$0.dp8;
                Integer valueOf = Integer.valueOf(left - i11);
                int top = this.$containerItem.getTop() + this.$view.getTop();
                i12 = this.this$0.dp4;
                Integer valueOf2 = Integer.valueOf(top - i12);
                int right = this.$containerItem.getRight() - this.$view.getRight();
                i13 = this.this$0.dp8;
                Integer valueOf3 = Integer.valueOf(right - i13);
                int height = this.this$0.itemView.getHeight() - this.$containerItem.getBottom();
                int height2 = this.$containerItem.getHeight() - this.$view.getBottom();
                i14 = this.this$0.dp4;
                Integer valueOf4 = Integer.valueOf((height2 - i14) + height);
                Drawable background = this.$view.getBackground();
                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                OnBoardingDelegate.DefaultImpls.bind$default(onBoardingDelegate2, aviaSearchResultV4LoadingWidgetViewHolder, new OnBoardingCutConfig(valueOf, valueOf2, valueOf3, valueOf4, null, null, gradientDrawable != null ? Float.valueOf(gradientDrawable.getCornerRadius()) : null, false, 176, null), null, 4, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultV4LoadingWidgetViewHolder$bindOnBoarding$1(AviaSearchResultV4LoadingWidgetViewHolder aviaSearchResultV4LoadingWidgetViewHolder, OnBoardingDTO onBoardingDTO, View view, View view2) {
        super(1);
        this.this$0 = aviaSearchResultV4LoadingWidgetViewHolder;
        this.$vo = onBoardingDTO;
        this.$view = view;
        this.$containerItem = view2;
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
            onboardingKey = "avia_search_result_v4_onboarding_key";
        }
        baseOnBoardingViewModel.showIfNeed(pageTag, onboardingKey, new AnonymousClass1(this.this$0, this.$vo, this.$view, this.$containerItem));
    }
}
