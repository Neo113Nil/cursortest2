package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone;

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
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pageTag", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultV4AllDoneWidgetViewHolder$bindOnBoarding$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ PriceAtomView $view;
    final /* synthetic */ OnBoardingDTO $vo;
    final /* synthetic */ AviaSearchResultV4AllDoneWidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.AviaSearchResultV4AllDoneWidgetViewHolder$bindOnBoarding$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ PriceAtomView $view;
        final /* synthetic */ OnBoardingDTO $vo;
        final /* synthetic */ AviaSearchResultV4AllDoneWidgetViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AviaSearchResultV4AllDoneWidgetViewHolder aviaSearchResultV4AllDoneWidgetViewHolder, OnBoardingDTO onBoardingDTO, PriceAtomView priceAtomView) {
            super(0);
            this.this$0 = aviaSearchResultV4AllDoneWidgetViewHolder;
            this.$vo = onBoardingDTO;
            this.$view = priceAtomView;
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
            float f7;
            onBoardingDelegate = this.this$0.onBoardingDelegate;
            if (onBoardingDelegate == null) {
                this.this$0.initDelegate(this.$vo);
            }
            onBoardingDelegate2 = this.this$0.onBoardingDelegate;
            if (onBoardingDelegate2 != null) {
                AviaSearchResultV4AllDoneWidgetViewHolder aviaSearchResultV4AllDoneWidgetViewHolder = this.this$0;
                int left = this.$view.getLeft();
                i11 = this.this$0.horizontalOffset;
                Integer valueOf = Integer.valueOf(left - i11);
                int top = this.$view.getTop();
                i12 = this.this$0.verticalOffset;
                Integer valueOf2 = Integer.valueOf(top - i12);
                int width = this.this$0.itemView.getWidth() - this.$view.getRight();
                i13 = this.this$0.horizontalOffset;
                Integer valueOf3 = Integer.valueOf(width - i13);
                int height = this.this$0.itemView.getHeight() - this.$view.getBottom();
                i14 = this.this$0.verticalOffset;
                Integer valueOf4 = Integer.valueOf(height - i14);
                f7 = this.this$0.onboardingCornerRadius;
                OnBoardingDelegate.DefaultImpls.bind$default(onBoardingDelegate2, aviaSearchResultV4AllDoneWidgetViewHolder, new OnBoardingCutConfig(valueOf, valueOf2, valueOf3, valueOf4, null, null, Float.valueOf(f7), false, 176, null), null, 4, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultV4AllDoneWidgetViewHolder$bindOnBoarding$1(AviaSearchResultV4AllDoneWidgetViewHolder aviaSearchResultV4AllDoneWidgetViewHolder, OnBoardingDTO onBoardingDTO, PriceAtomView priceAtomView) {
        super(1);
        this.this$0 = aviaSearchResultV4AllDoneWidgetViewHolder;
        this.$vo = onBoardingDTO;
        this.$view = priceAtomView;
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
        baseOnBoardingViewModel.showIfNeed(pageTag, onboardingKey, new AnonymousClass1(this.this$0, this.$vo, this.$view));
    }
}
