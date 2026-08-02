package ru.ozon.app.android.travel.feature.railway.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.travel.feature.railway.deeplink.RailwayPassengersDeeplinkHandler;
import ru.ozon.app.android.travel.feature.railway.deeplink.TravelCarriageDetailsDeeplinkHandler;
import ru.ozon.app.android.travel.feature.railway.deeplink.TravelCarriagesFiltersDeeplinkHandler;
import ru.ozon.app.android.travel.feature.railway.deeplink.TravelERegistration;
import ru.ozon.app.android.travel.feature.railway.deeplink.TravelModalTrainInformationDeeplinkHandler;
import ru.ozon.app.android.travel.feature.railway.deeplink.TravelRailwayCarriageSelectDeeplinkHandler;
import ru.ozon.app.android.travel.feature.railway.deeplink.TravelRailwayCheckInDeeplinkHandler;
import ru.ozon.app.android.travel.feature.railway.deeplink.TravelRailwayPriceDetailInformationDeeplinkHandler;
import ru.ozon.app.android.travel.feature.railway.deeplink.TravelRailwaySearchFilters;
import ru.ozon.app.android.travel.feature.railway.deeplink.TravelRailwaySearchResultsDeeplinkHandler;
import ru.ozon.app.android.travel.feature.railway.deeplink.TravelRailwaySeatSelectionDeeplinkHandler;
import ru.ozon.app.android.travel.feature.railway.deeplink.TravelRailwayTrainCheckDetailsDeeplinkHandler;
import ru.ozon.app.android.travel.feature.railway.deeplink.TravelSeatSelectionChildDeeplinkHandler;
import ru.ozon.app.android.travel.feature.railway.deeplink.TravelSeatSelectionFiltersDeeplinkHandler;
import ru.ozon.app.android.travel.feature.railway.deeplink.TravelSeatSelectionInfantDeeplinkHandler;
import ru.ozon.app.android.travel.feature.railway.deeplink.TravelTrainCheckDetailsDeeplinkHandler;
import ru.ozon.app.android.travel.feature.railway.deeplink.TravelTrainDetailsDeeplinkHandler;
import ru.ozon.app.android.travel.feature.railway.deeplink.TravelTrainInformationDeeplinkHandler;
import ru.ozon.app.android.travel.feature.railway.deeplink.TravelTrainRouteDeeplinkHandler;
import ru.ozon.app.android.travel.utils.destinationBehavior.behavior.FullScreenDestinationBehavior;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/di/TravelRailwayNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;", "fullScreenDestinationBehavior", "", "LIZ/a;", "provideDeeplinkHandlersSet", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;)Ljava/util/Set;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelRailwayNavigationModule {

    @NotNull
    public static final TravelRailwayNavigationModule INSTANCE = new TravelRailwayNavigationModule();

    private TravelRailwayNavigationModule() {
    }

    @NotNull
    public final Set<a> provideDeeplinkHandlersSet(@NotNull AuthDestinationInterceptor authDestinationInterceptor, @NotNull FullScreenDestinationBehavior fullScreenDestinationBehavior) {
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        Intrinsics.checkNotNullParameter(fullScreenDestinationBehavior, "fullScreenDestinationBehavior");
        return e0.b(new TravelRailwayCheckInDeeplinkHandler(authDestinationInterceptor), new TravelCarriageDetailsDeeplinkHandler(), new TravelTrainRouteDeeplinkHandler(), new TravelTrainDetailsDeeplinkHandler(), new TravelERegistration(), new TravelRailwaySearchFilters(), new TravelTrainInformationDeeplinkHandler(authDestinationInterceptor), new TravelTrainCheckDetailsDeeplinkHandler(), new TravelRailwayPriceDetailInformationDeeplinkHandler(), new TravelRailwayTrainCheckDetailsDeeplinkHandler(authDestinationInterceptor), new TravelSeatSelectionInfantDeeplinkHandler(), new TravelSeatSelectionChildDeeplinkHandler(), new TravelSeatSelectionFiltersDeeplinkHandler(), new TravelCarriagesFiltersDeeplinkHandler(), new TravelRailwayCarriageSelectDeeplinkHandler(fullScreenDestinationBehavior), new TravelModalTrainInformationDeeplinkHandler(), new TravelRailwaySearchResultsDeeplinkHandler(), new TravelRailwaySeatSelectionDeeplinkHandler(fullScreenDestinationBehavior), new RailwayPassengersDeeplinkHandler());
    }
}
