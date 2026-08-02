package ru.ozon.app.android.travel.feature.tours.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.NightsRangeSelectorV3WidgetKt;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.ToursRoomsListV2WidgetKt;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSorting.presentation.ToursSortingWidgetFactoryKt;
import ru.ozon.app.android.travel.utils.listtracking.ListTrackingViewMapper;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/di/TravelToursWidgetFactoryModule;", "", "<init>", "()V", "Lru/ozon/app/android/travel/utils/listtracking/ListTrackingViewMapper;", "listTrackingViewMapper", "", "Ln20/i;", "provideWidgets$tours_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/travel/utils/listtracking/ListTrackingViewMapper;)Ljava/util/Set;", "provideWidgets", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelToursWidgetFactoryModule {
    @NotNull
    public final Set<i> provideWidgets$tours_prodGoogleAllVendorsRelease(@NotNull ListTrackingViewMapper listTrackingViewMapper) {
        Intrinsics.checkNotNullParameter(listTrackingViewMapper, "listTrackingViewMapper");
        i[] elements = {ToursRoomsListV2WidgetKt.ToursRoomsListV2Widget(listTrackingViewMapper), NightsRangeSelectorV3WidgetKt.NightsRangeSelectorV3Widget(), ToursSortingWidgetFactoryKt.ToursSortingWidgetFactory()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
