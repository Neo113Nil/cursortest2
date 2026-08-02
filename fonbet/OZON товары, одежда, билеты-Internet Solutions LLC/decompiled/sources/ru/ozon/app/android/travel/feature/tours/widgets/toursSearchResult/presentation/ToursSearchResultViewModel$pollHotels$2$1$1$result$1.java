package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.metrics.client.MetricsResponse;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class ToursSearchResultViewModel$pollHotels$2$1$1$result$1 extends C7735q implements Function1<MetricsResponse.Metrics, Unit> {
    ToursSearchResultViewModel$pollHotels$2$1$1$result$1(Object obj) {
        super(1, obj, ToursSearchResultViewModel.class, "trackPerformance", "trackPerformance(Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MetricsResponse.Metrics metrics) {
        invoke2(metrics);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MetricsResponse.Metrics p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((ToursSearchResultViewModel) this.receiver).trackPerformance(p02);
    }
}
