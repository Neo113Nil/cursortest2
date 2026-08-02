package ru.ozon.app.android.travel.feature.hotels.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.tabbar.data.local.TabConfigCache;
import ru.ozon.app.android.travel.feature.hotels.deeplink.FavoritesCitiesDeeplinkHandler;
import ru.ozon.app.android.travel.feature.hotels.deeplink.GuestsCountSelectorDeeplinkHandler;
import ru.ozon.app.android.travel.feature.hotels.deeplink.HotelsCancellationInfoDeeplinkHandler;
import ru.ozon.app.android.travel.feature.hotels.deeplink.HotelsGalleryDeeplinkHandler;
import ru.ozon.app.android.travel.feature.hotels.deeplink.HotelsPageDetailsFullDeeplinkHandler;
import ru.ozon.app.android.travel.feature.hotels.deeplink.HotelsPriceCalendarDeeplinkHandler;
import ru.ozon.app.android.travel.feature.hotels.deeplink.HotelsSearchFiltersDeeplinkHandler;
import ru.ozon.app.android.travel.feature.hotels.deeplink.TravelFavoritesDeeplinkHandler;
import ru.ozon.app.android.travel.feature.hotels.deeplink.TravelHotelOrderShareDeeplinkHandler;
import ru.ozon.app.android.travel.feature.hotels.deeplink.TravelHotelsFormOnSerpDeeplinkHandler;
import ru.ozon.app.android.travel.feature.hotels.deeplink.TravelHotelsPageDetailsDeeplinkHandler;
import ru.ozon.app.android.travel.feature.hotels.deeplink.TravelHotelsPageFormDeeplinkHandler;
import ru.ozon.app.android.travel.feature.hotels.deeplink.TravelHotelsReviewsDeeplinkHandler;
import ru.ozon.app.android.travel.feature.hotels.deeplink.TravelHotelsRoomsListDeeplinkHandler;
import ru.ozon.app.android.travel.feature.hotels.deeplink.TravelHotelsSearchResultsDeeplinkHandler;
import ru.ozon.app.android.travel.feature.hotels.deeplink.TravelPdpDeeplinkHandler;
import ru.ozon.app.android.travel.feature.hotels.deeplink.TravelReviewsDeeplinkHandler;
import ru.ozon.app.android.travel.feature.hotels.interceptor.EnsureMiniappTravelDeeplinkInterceptor;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/di/TravelHotelsNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "Lru/ozon/app/android/travel/feature/hotels/interceptor/EnsureMiniappTravelDeeplinkInterceptor;", "ensureMiniappTravelDeeplinkInterceptor", "Lru/ozon/app/android/tabbar/data/local/TabConfigCache;", "tabConfigCache", "", "LIZ/a;", "provideDeeplinkHandlerSet$hotels_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;Lru/ozon/app/android/travel/feature/hotels/interceptor/EnsureMiniappTravelDeeplinkInterceptor;Lru/ozon/app/android/tabbar/data/local/TabConfigCache;)Ljava/util/Set;", "provideDeeplinkHandlerSet", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelHotelsNavigationModule {

    @NotNull
    public static final TravelHotelsNavigationModule INSTANCE = new TravelHotelsNavigationModule();

    private TravelHotelsNavigationModule() {
    }

    @NotNull
    public final Set<a> provideDeeplinkHandlerSet$hotels_prodGoogleAllVendorsRelease(@NotNull AuthDestinationInterceptor authDestinationInterceptor, @NotNull EnsureMiniappTravelDeeplinkInterceptor ensureMiniappTravelDeeplinkInterceptor, @NotNull TabConfigCache tabConfigCache) {
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        Intrinsics.checkNotNullParameter(ensureMiniappTravelDeeplinkInterceptor, "ensureMiniappTravelDeeplinkInterceptor");
        Intrinsics.checkNotNullParameter(tabConfigCache, "tabConfigCache");
        return e0.b(new GuestsCountSelectorDeeplinkHandler(), new TravelHotelsSearchResultsDeeplinkHandler(ensureMiniappTravelDeeplinkInterceptor), new HotelsCancellationInfoDeeplinkHandler(authDestinationInterceptor), new TravelHotelsPageDetailsDeeplinkHandler(), new HotelsPageDetailsFullDeeplinkHandler(), new TravelHotelsPageFormDeeplinkHandler(), new TravelHotelsRoomsListDeeplinkHandler(), new TravelHotelsReviewsDeeplinkHandler(), new HotelsPriceCalendarDeeplinkHandler(), new TravelHotelsFormOnSerpDeeplinkHandler(), new TravelFavoritesDeeplinkHandler(tabConfigCache), new FavoritesCitiesDeeplinkHandler(), new TravelPdpDeeplinkHandler(ensureMiniappTravelDeeplinkInterceptor), new TravelHotelOrderShareDeeplinkHandler(authDestinationInterceptor), new HotelsGalleryDeeplinkHandler(), new TravelReviewsDeeplinkHandler(), new HotelsSearchFiltersDeeplinkHandler());
    }
}
