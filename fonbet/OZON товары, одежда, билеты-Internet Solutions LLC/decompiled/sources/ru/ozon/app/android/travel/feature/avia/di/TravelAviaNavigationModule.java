package ru.ozon.app.android.travel.feature.avia.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.travel.feature.avia.deeplink.AdditionalLuggageDeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.AdditionalLuggageV2DeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.AviaTariffDeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.ComplexSearchDeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.FlightAdditionalServicesDeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.FlightSeatSelectionDeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.FlightSeatsSegmentsDeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.FlightServicesDeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.InsurancePanelDeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.NewBookDeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.PassengersCountSelectorDeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.SeedSelectSeatsDeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.TravelBookingImportantInfoDeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.TravelDetailedFlightInfoDeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.TravelFlightCheckAvailabilityDeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.TravelFlightSearchDeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.TravelHelpInsuranceDeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.TravelImportantInfoModalDeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.TravelLuggageRequirementsDeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.TravelMobileInsuranceV2DeepLinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.TravelPricesHistogramDeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.TravelSearchDeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.TravelSerpFiltersDeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.TravelServicePackSelectionDeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.TravelTariffRulesDeeplinkHandler;
import ru.ozon.app.android.travel.feature.avia.deeplink.TravelUpsellOfferDeeplinkHandler;
import ru.ozon.app.android.travel.utils.destinationBehavior.behavior.FullScreenDestinationBehavior;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/di/TravelAviaNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;", "travelFunnelFullScreenDestinationBehavior", "", "LIZ/a;", "provideDeeplinkHandlersSet", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;)Ljava/util/Set;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelAviaNavigationModule {

    @NotNull
    public static final TravelAviaNavigationModule INSTANCE = new TravelAviaNavigationModule();

    private TravelAviaNavigationModule() {
    }

    @NotNull
    public final Set<a> provideDeeplinkHandlersSet(@NotNull AuthDestinationInterceptor authDestinationInterceptor, @NotNull FullScreenDestinationBehavior travelFunnelFullScreenDestinationBehavior) {
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        Intrinsics.checkNotNullParameter(travelFunnelFullScreenDestinationBehavior, "travelFunnelFullScreenDestinationBehavior");
        return e0.b(new TravelDetailedFlightInfoDeeplinkHandler(authDestinationInterceptor), new TravelLuggageRequirementsDeeplinkHandler(), new AdditionalLuggageDeeplinkHandler(), new TravelBookingImportantInfoDeeplinkHandler(authDestinationInterceptor), new TravelImportantInfoModalDeeplinkHandler(), new TravelFlightSearchDeeplinkHandler(), new TravelMobileInsuranceV2DeepLinkHandler(authDestinationInterceptor), new TravelPricesHistogramDeeplinkHandler(), new TravelSerpFiltersDeeplinkHandler(), new TravelTariffRulesDeeplinkHandler(travelFunnelFullScreenDestinationBehavior), new TravelUpsellOfferDeeplinkHandler(), new InsurancePanelDeeplinkHandler(authDestinationInterceptor), new TravelFlightCheckAvailabilityDeeplinkHandler(travelFunnelFullScreenDestinationBehavior), new TravelHelpInsuranceDeeplinkHandler(), new TravelSearchDeeplinkHandler(travelFunnelFullScreenDestinationBehavior), new TravelServicePackSelectionDeeplinkHandler(), new AdditionalLuggageV2DeeplinkHandler(travelFunnelFullScreenDestinationBehavior), new FlightAdditionalServicesDeeplinkHandler(authDestinationInterceptor), new FlightServicesDeeplinkHandler(authDestinationInterceptor), new FlightSeatSelectionDeeplinkHandler(authDestinationInterceptor, travelFunnelFullScreenDestinationBehavior), new FlightSeatsSegmentsDeeplinkHandler(authDestinationInterceptor, travelFunnelFullScreenDestinationBehavior), new PassengersCountSelectorDeeplinkHandler(), new NewBookDeeplinkHandler(), new ComplexSearchDeeplinkHandler(), new SeedSelectSeatsDeeplinkHandler(travelFunnelFullScreenDestinationBehavior), new AviaTariffDeeplinkHandler());
    }
}
