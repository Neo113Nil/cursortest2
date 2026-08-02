package ru.ozon.app.android.travel.feature.general.booking.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.travel.feature.general.booking.deeplink.HotelsBookModalDeepLinkHandler;
import ru.ozon.app.android.travel.feature.general.booking.deeplink.PassengerFormDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.booking.deeplink.PassengerHandbookFormDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.booking.deeplink.ToursCustomerDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.booking.deeplink.TravelGuestsHotelDeeplinkHandler;
import ru.ozon.app.android.travel.utils.destinationBehavior.behavior.FullScreenDestinationBehavior;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/di/TravelGeneralBookingNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;", "travelFunnelFullScreenDestinationBehavior", "", "LIZ/a;", "provideDeeplinkHandlersSet", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;)Ljava/util/Set;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelGeneralBookingNavigationModule {

    @NotNull
    public static final TravelGeneralBookingNavigationModule INSTANCE = new TravelGeneralBookingNavigationModule();

    private TravelGeneralBookingNavigationModule() {
    }

    @NotNull
    public final Set<a> provideDeeplinkHandlersSet(@NotNull AuthDestinationInterceptor authDestinationInterceptor, @NotNull FullScreenDestinationBehavior travelFunnelFullScreenDestinationBehavior) {
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        Intrinsics.checkNotNullParameter(travelFunnelFullScreenDestinationBehavior, "travelFunnelFullScreenDestinationBehavior");
        return e0.b(new PassengerFormDeeplinkHandler(authDestinationInterceptor), new PassengerHandbookFormDeeplinkHandler(authDestinationInterceptor), new ToursCustomerDeeplinkHandler(authDestinationInterceptor, travelFunnelFullScreenDestinationBehavior), new TravelGuestsHotelDeeplinkHandler(authDestinationInterceptor), new HotelsBookModalDeepLinkHandler(authDestinationInterceptor));
    }
}
