package com.yandex.mapkit.transport;

import androidx.annotation.NonNull;
import com.yandex.mapkit.transport.bicycle.BicycleRouter;
import com.yandex.mapkit.transport.masstransit.BicycleRouterV2;
import com.yandex.mapkit.transport.masstransit.MasstransitRouter;
import com.yandex.mapkit.transport.masstransit.PedestrianRouter;
import com.yandex.mapkit.transport.time.AdjustedClock;

/* loaded from: classes9.dex */
public interface Transport {
    @NonNull
    @Deprecated
    BicycleRouter createBicycleRouter();

    @NonNull
    BicycleRouterV2 createBicycleRouterV2();

    @NonNull
    BicycleRouterV2 createElectricBikeRouter();

    @NonNull
    MasstransitRouter createMasstransitRouter();

    @NonNull
    PedestrianRouter createPedestrianRouter();

    @NonNull
    BicycleRouterV2 createScooterRouter();

    @NonNull
    AdjustedClock getAdjustedClock();

    boolean isValid();
}
