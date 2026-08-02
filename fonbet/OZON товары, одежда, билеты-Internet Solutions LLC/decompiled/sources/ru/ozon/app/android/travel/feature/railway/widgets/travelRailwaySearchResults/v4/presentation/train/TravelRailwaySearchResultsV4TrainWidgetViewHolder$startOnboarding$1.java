package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class TravelRailwaySearchResultsV4TrainWidgetViewHolder$startOnboarding$1 extends C7735q implements Function1<OnBoardingDTO, Unit> {
    TravelRailwaySearchResultsV4TrainWidgetViewHolder$startOnboarding$1(Object obj) {
        super(1, obj, TravelRailwaySearchResultsV4TrainWidgetViewHolder.class, "bindOnBoarding", "bindOnBoarding(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnBoardingDTO onBoardingDTO) {
        invoke2(onBoardingDTO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OnBoardingDTO p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((TravelRailwaySearchResultsV4TrainWidgetViewHolder) this.receiver).bindOnBoarding(p02);
    }
}
