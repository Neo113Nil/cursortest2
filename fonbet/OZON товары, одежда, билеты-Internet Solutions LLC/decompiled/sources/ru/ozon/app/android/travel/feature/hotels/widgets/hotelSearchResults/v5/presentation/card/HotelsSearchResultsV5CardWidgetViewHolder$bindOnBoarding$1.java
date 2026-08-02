package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card;

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
/* loaded from: classes4.dex */
final class HotelsSearchResultsV5CardWidgetViewHolder$bindOnBoarding$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ String $onboardingKey;
    final /* synthetic */ int $targetBottom;
    final /* synthetic */ int $targetLeft;
    final /* synthetic */ int $targetRight;
    final /* synthetic */ int $targetTop;
    final /* synthetic */ OnBoardingDTO $vo;
    final /* synthetic */ HotelsSearchResultsV5CardWidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardWidgetViewHolder$bindOnBoarding$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ String $onboardingKey;
        final /* synthetic */ int $targetBottom;
        final /* synthetic */ int $targetLeft;
        final /* synthetic */ int $targetRight;
        final /* synthetic */ int $targetTop;
        final /* synthetic */ OnBoardingDTO $vo;
        final /* synthetic */ HotelsSearchResultsV5CardWidgetViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HotelsSearchResultsV5CardWidgetViewHolder hotelsSearchResultsV5CardWidgetViewHolder, OnBoardingDTO onBoardingDTO, String str, int i11, int i12, int i13, int i14) {
            super(0);
            this.this$0 = hotelsSearchResultsV5CardWidgetViewHolder;
            this.$vo = onBoardingDTO;
            this.$onboardingKey = str;
            this.$targetLeft = i11;
            this.$targetTop = i12;
            this.$targetRight = i13;
            this.$targetBottom = i14;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HotelsSearchResultsV5CardViewModel hotelsSearchResultsV5CardViewModel;
            OnBoardingDelegate onBoardingDelegate;
            OnBoardingDelegate onBoardingDelegate2;
            int i11;
            int i12;
            int i13;
            int i14;
            float f7;
            hotelsSearchResultsV5CardViewModel = this.this$0.cardViewModel;
            hotelsSearchResultsV5CardViewModel.onOnboardingRequested();
            onBoardingDelegate = this.this$0.onBoardingDelegate;
            if (onBoardingDelegate == null) {
                this.this$0.initDelegate(this.$vo, this.$onboardingKey);
            }
            onBoardingDelegate2 = this.this$0.onBoardingDelegate;
            if (onBoardingDelegate2 != null) {
                HotelsSearchResultsV5CardWidgetViewHolder hotelsSearchResultsV5CardWidgetViewHolder = this.this$0;
                int i15 = this.$targetLeft;
                i11 = this.this$0.onboardingHorizontalMargin;
                Integer valueOf = Integer.valueOf(i15 - i11);
                int i16 = this.$targetTop;
                i12 = this.this$0.onboardingVerticalMargin;
                Integer valueOf2 = Integer.valueOf(i16 - i12);
                int width = this.this$0.itemView.getWidth() - this.$targetRight;
                i13 = this.this$0.onboardingHorizontalMargin;
                Integer valueOf3 = Integer.valueOf(width - i13);
                int height = this.this$0.itemView.getHeight() - this.$targetBottom;
                i14 = this.this$0.onboardingVerticalMargin;
                Integer valueOf4 = Integer.valueOf(height - i14);
                f7 = this.this$0.onboardingCornerRadius;
                OnBoardingDelegate.DefaultImpls.bind$default(onBoardingDelegate2, hotelsSearchResultsV5CardWidgetViewHolder, new OnBoardingCutConfig(valueOf, valueOf2, valueOf3, valueOf4, null, null, Float.valueOf(f7), false, 176, null), null, 4, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsSearchResultsV5CardWidgetViewHolder$bindOnBoarding$1(HotelsSearchResultsV5CardWidgetViewHolder hotelsSearchResultsV5CardWidgetViewHolder, String str, OnBoardingDTO onBoardingDTO, int i11, int i12, int i13, int i14) {
        super(1);
        this.this$0 = hotelsSearchResultsV5CardWidgetViewHolder;
        this.$onboardingKey = str;
        this.$vo = onBoardingDTO;
        this.$targetLeft = i11;
        this.$targetTop = i12;
        this.$targetRight = i13;
        this.$targetBottom = i14;
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
        String str = this.$onboardingKey;
        baseOnBoardingViewModel.showIfNeed(pageTag, str, new AnonymousClass1(this.this$0, this.$vo, str, this.$targetLeft, this.$targetTop, this.$targetRight, this.$targetBottom));
    }
}
