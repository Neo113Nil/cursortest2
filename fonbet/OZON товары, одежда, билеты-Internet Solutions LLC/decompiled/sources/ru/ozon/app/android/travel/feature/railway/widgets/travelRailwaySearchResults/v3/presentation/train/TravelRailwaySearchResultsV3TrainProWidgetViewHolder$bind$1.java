package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class TravelRailwaySearchResultsV3TrainProWidgetViewHolder$bind$1 extends C7735q implements Function1<OnBoardingDTO, Unit> {
    TravelRailwaySearchResultsV3TrainProWidgetViewHolder$bind$1(Object obj) {
        super(1, obj, TravelRailwaySearchResultsV3TrainProWidgetViewHolder.class, "bindOnBoarding", "bindOnBoarding(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnBoardingDTO onBoardingDTO) {
        invoke2(onBoardingDTO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OnBoardingDTO p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((TravelRailwaySearchResultsV3TrainProWidgetViewHolder) this.receiver).bindOnBoarding(p02);
    }
}
