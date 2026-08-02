package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pageTag", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultV4AllDoneWidgetViewHolder$checkOnBoardingNeed$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ String $onboardingKey;
    final /* synthetic */ AviaSearchResultV4AllDoneWidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.AviaSearchResultV4AllDoneWidgetViewHolder$checkOnBoardingNeed$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ AviaSearchResultV4AllDoneWidgetViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AviaSearchResultV4AllDoneWidgetViewHolder aviaSearchResultV4AllDoneWidgetViewHolder) {
            super(0);
            this.this$0 = aviaSearchResultV4AllDoneWidgetViewHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AviaSearchResultV4AllDoneViewModel aviaSearchResultV4AllDoneViewModel;
            aviaSearchResultV4AllDoneViewModel = this.this$0.viewModel;
            aviaSearchResultV4AllDoneViewModel.onOnboardingShown(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultV4AllDoneWidgetViewHolder$checkOnBoardingNeed$1(AviaSearchResultV4AllDoneWidgetViewHolder aviaSearchResultV4AllDoneWidgetViewHolder, String str) {
        super(1);
        this.this$0 = aviaSearchResultV4AllDoneWidgetViewHolder;
        this.$onboardingKey = str;
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
        String str = this.$onboardingKey;
        if (str == null) {
            str = "avia_search_result_v4_onboarding_key";
        }
        baseOnBoardingViewModel.showIfNeed(pageTag, str, new AnonymousClass1(this.this$0));
    }
}
