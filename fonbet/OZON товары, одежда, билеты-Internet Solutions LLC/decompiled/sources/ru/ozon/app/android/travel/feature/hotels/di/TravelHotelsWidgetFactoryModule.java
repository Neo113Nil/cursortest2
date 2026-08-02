package ru.ozon.app.android.travel.feature.hotels.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsFavoritesCollections.v1.HotelsFavoritesCollectionsWidgetKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.HotelsGalleryFeedV2WidgetKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.HotelsGalleryFiltersWidgetKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.HotelsGalleryFullWidgetKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.HotelsGalleryFullV2WidgetKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.HotelsModalTariffInfoWidgetKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPagePriceMobile.v1.HotelsPagePriceMobileWidgetKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageRoomsSearchForm.HotelsPageRoomsSearchFormWidgetKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.HotelsRoomsListV5WidgetKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v1.HotelsScrollPriceCalendarWidgetKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.HotelsScrollPriceCalendarV2WidgetKt;
import ru.ozon.app.android.travel.utils.listtracking.ListTrackingViewMapper;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/di/TravelHotelsWidgetFactoryModule;", "", "<init>", "()V", "Lru/ozon/app/android/travel/utils/listtracking/ListTrackingViewMapper;", "listTrackingViewMapper", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "", "Ln20/i;", "provideWidgets$hotels_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/travel/utils/listtracking/ListTrackingViewMapper;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ljava/util/Set;", "provideWidgets", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelHotelsWidgetFactoryModule {

    @NotNull
    public static final TravelHotelsWidgetFactoryModule INSTANCE = new TravelHotelsWidgetFactoryModule();

    private TravelHotelsWidgetFactoryModule() {
    }

    @NotNull
    public final Set<i> provideWidgets$hotels_prodGoogleAllVendorsRelease(@NotNull ListTrackingViewMapper listTrackingViewMapper, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(listTrackingViewMapper, "listTrackingViewMapper");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        i[] elements = {HotelsScrollPriceCalendarWidgetKt.HotelsScrollPriceCalendarWidget(), HotelsRoomsListV5WidgetKt.HotelsRoomsListV5Widget(listTrackingViewMapper), HotelsModalTariffInfoWidgetKt.HotelsModalTariffInfoWidget(), HotelsPageRoomsSearchFormWidgetKt.HotelsPageRoomsSearchFormWidget(), HotelsGalleryFullWidgetKt.HotelsGalleryFullWidget(), HotelsScrollPriceCalendarV2WidgetKt.HotelsScrollPriceCalendarV2Widget(), HotelsPagePriceMobileWidgetKt.HotelsPagePriceMobileWidget(), HotelsGalleryFeedV2WidgetKt.HotelsGalleryFeedV2Widget(listTrackingViewMapper), HotelsGalleryFullV2WidgetKt.HotelsGalleryFullV2Widget(), HotelsGalleryFiltersWidgetKt.HotelsGalleryFiltersWidget(), HotelsFavoritesCollectionsWidgetKt.HotelsFavoritesCollectionsWidget(jsonDeserializer)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
