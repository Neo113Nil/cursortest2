package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pageTag", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelRailwaySearchResultsV4TrainWidgetViewHolder$verifyAndStartOnboarding$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ List<String> $allOnboardingKeys;
    final /* synthetic */ List<OnBoardingDTO> $onboardingApp;
    final /* synthetic */ TravelRailwaySearchResultsV4TrainWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelRailwaySearchResultsV4TrainWidgetViewHolder$verifyAndStartOnboarding$1(List<String> list, TravelRailwaySearchResultsV4TrainWidgetViewHolder travelRailwaySearchResultsV4TrainWidgetViewHolder, List<OnBoardingDTO> list2) {
        super(1);
        this.$allOnboardingKeys = list;
        this.this$0 = travelRailwaySearchResultsV4TrainWidgetViewHolder;
        this.$onboardingApp = list2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String pageTag) {
        BaseOnBoardingViewModel baseOnBoardingViewModel;
        Intrinsics.checkNotNullParameter(pageTag, "pageTag");
        List<String> list = this.$allOnboardingKeys;
        if (list == null || list.isEmpty()) {
            TravelRailwaySearchResultsV4TrainWidgetViewHolder travelRailwaySearchResultsV4TrainWidgetViewHolder = this.this$0;
            List<OnBoardingDTO> list2 = this.$onboardingApp;
            travelRailwaySearchResultsV4TrainWidgetViewHolder.startOnboarding(list2 != null ? (OnBoardingDTO) C7714v.M(list2) : null);
            return;
        }
        for (String str : this.$allOnboardingKeys) {
            baseOnBoardingViewModel = this.this$0.onboardingViewModel;
            if (baseOnBoardingViewModel.isNeedToShow(pageTag, str)) {
                List<OnBoardingDTO> list3 = this.$onboardingApp;
                if (list3 != null) {
                    Iterator<T> it = list3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (Intrinsics.d(((OnBoardingDTO) next).getOnboardingKey(), str)) {
                            r1 = next;
                            break;
                        }
                    }
                    r1 = r1;
                }
                if (r1 != null) {
                    this.this$0.startOnboarding(r1);
                    return;
                }
                return;
            }
        }
    }
}
