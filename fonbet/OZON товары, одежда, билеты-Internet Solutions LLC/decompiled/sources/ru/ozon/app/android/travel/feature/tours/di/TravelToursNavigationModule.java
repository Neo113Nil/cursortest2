package ru.ozon.app.android.travel.feature.tours.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.travel.feature.tours.deeplink.ModalToursOrderDocumentsDeeplinkHandler;
import ru.ozon.app.android.travel.feature.tours.deeplink.NightsRangeSelectorDeeplinkHandler;
import ru.ozon.app.android.travel.feature.tours.deeplink.OrderToursChangeFormDeeplinkHandler;
import ru.ozon.app.android.travel.feature.tours.deeplink.TouristCountSelectorDeeplinkHandler;
import ru.ozon.app.android.travel.feature.tours.deeplink.ToursBookingDeeplinkHandler;
import ru.ozon.app.android.travel.feature.tours.deeplink.ToursFlightDeeplinkHandler;
import ru.ozon.app.android.travel.feature.tours.deeplink.ToursRoomsDeeplinkHandler;
import ru.ozon.app.android.travel.feature.tours.deeplink.ToursSearchResultDeeplinkHandler;
import ru.ozon.app.android.travel.feature.tours.deeplink.ToursSummaryDeeplinkHandler;
import ru.ozon.app.android.travel.feature.tours.deeplink.TravelToursHotelPageDetailsDeeplinkHandler;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/di/TravelToursNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "", "LIZ/a;", "provideDeeplinkHandlersSet", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;)Ljava/util/Set;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelToursNavigationModule {

    @NotNull
    public static final TravelToursNavigationModule INSTANCE = new TravelToursNavigationModule();

    private TravelToursNavigationModule() {
    }

    @NotNull
    public final Set<a> provideDeeplinkHandlersSet(@NotNull AuthDestinationInterceptor authDestinationInterceptor) {
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        return e0.b(new TouristCountSelectorDeeplinkHandler(), new ToursSearchResultDeeplinkHandler(), new TravelToursHotelPageDetailsDeeplinkHandler(), new ModalToursOrderDocumentsDeeplinkHandler(authDestinationInterceptor), new OrderToursChangeFormDeeplinkHandler(authDestinationInterceptor), new ToursRoomsDeeplinkHandler(), new ToursFlightDeeplinkHandler(), new ToursSummaryDeeplinkHandler(), new ToursBookingDeeplinkHandler(authDestinationInterceptor), new NightsRangeSelectorDeeplinkHandler());
    }
}
