package ru.ozon.app.android.travel.feature.railway.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.SegmentedTrainRouteWidgetKt;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.data.TravelRailwaySearchResultsV3WidgetKt;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.TravelRailwaySearchResultsV4WidgetKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/di/TravelRailwayWidgetFactoryModule;", "", "<init>", "()V", "", "Ln20/i;", "provideWidgets$railway_prodGoogleAllVendorsRelease", "()Ljava/util/Set;", "provideWidgets", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelRailwayWidgetFactoryModule {
    @NotNull
    public final Set<i> provideWidgets$railway_prodGoogleAllVendorsRelease() {
        i[] elements = {SegmentedTrainRouteWidgetKt.SegmentedTrainRouteWidget(), TravelRailwaySearchResultsV4WidgetKt.TravelRailwaySearchResultsV4Widget(), TravelRailwaySearchResultsV3WidgetKt.TravelRailwaySearchResultsV3Widget()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
