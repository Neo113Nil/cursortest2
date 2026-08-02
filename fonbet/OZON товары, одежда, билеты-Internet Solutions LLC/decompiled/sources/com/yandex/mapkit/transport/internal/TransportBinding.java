package com.yandex.mapkit.transport.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.transport.Transport;
import com.yandex.mapkit.transport.bicycle.BicycleRouter;
import com.yandex.mapkit.transport.masstransit.BicycleRouterV2;
import com.yandex.mapkit.transport.masstransit.MasstransitRouter;
import com.yandex.mapkit.transport.masstransit.PedestrianRouter;
import com.yandex.mapkit.transport.time.AdjustedClock;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class TransportBinding implements Transport {
    private final NativeObject nativeObject;

    protected TransportBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.Transport
    @NonNull
    @Deprecated
    public native BicycleRouter createBicycleRouter();

    @Override // com.yandex.mapkit.transport.Transport
    @NonNull
    public native BicycleRouterV2 createBicycleRouterV2();

    @Override // com.yandex.mapkit.transport.Transport
    @NonNull
    public native BicycleRouterV2 createElectricBikeRouter();

    @Override // com.yandex.mapkit.transport.Transport
    @NonNull
    public native MasstransitRouter createMasstransitRouter();

    @Override // com.yandex.mapkit.transport.Transport
    @NonNull
    public native PedestrianRouter createPedestrianRouter();

    @Override // com.yandex.mapkit.transport.Transport
    @NonNull
    public native BicycleRouterV2 createScooterRouter();

    @Override // com.yandex.mapkit.transport.Transport
    @NonNull
    public native AdjustedClock getAdjustedClock();

    @Override // com.yandex.mapkit.transport.Transport
    public native boolean isValid();
}
