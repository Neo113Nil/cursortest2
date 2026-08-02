package com.yandex.mapkit.location.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.location.LocationSimulator;
import com.yandex.mapkit.location.LocationSimulatorListener;
import com.yandex.mapkit.location.SimulationAccuracy;
import com.yandex.mapkit.location.SimulationSettings;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;
import java.util.List;

/* loaded from: classes9.dex */
public class LocationSimulatorBinding extends LocationManagerBinding implements LocationSimulator {
    protected Subscription<LocationSimulatorListener> locationSimulatorListenerSubscription;

    protected LocationSimulatorBinding(NativeObject nativeObject) {
        super(nativeObject);
        this.locationSimulatorListenerSubscription = new Subscription<LocationSimulatorListener>() { // from class: com.yandex.mapkit.location.internal.LocationSimulatorBinding.1
            @Override // com.yandex.runtime.subscription.Subscription
            public NativeObject createNativeListener(LocationSimulatorListener locationSimulatorListener) {
                return LocationSimulatorBinding.createLocationSimulatorListener(locationSimulatorListener);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createLocationSimulatorListener(LocationSimulatorListener locationSimulatorListener);

    @Override // com.yandex.mapkit.location.LocationSimulator
    @Deprecated
    public native Polyline getGeometry();

    @Override // com.yandex.mapkit.location.LocationSimulator
    @NonNull
    public native List<SimulationSettings> getSettings();

    @Override // com.yandex.mapkit.location.LocationSimulator
    @Deprecated
    public native double getSpeed();

    @Override // com.yandex.mapkit.location.LocationSimulator
    public native boolean isActive();

    @Override // com.yandex.mapkit.location.LocationSimulator
    @NonNull
    public native PolylinePosition polylinePosition();

    @Override // com.yandex.mapkit.location.LocationSimulator
    @Deprecated
    public native void setGeometry(Polyline polyline);

    @Override // com.yandex.mapkit.location.LocationSimulator
    @Deprecated
    public native void setLocationSpeedProviding(boolean z11);

    @Override // com.yandex.mapkit.location.LocationSimulator
    public native void setSettings(@NonNull List<SimulationSettings> list);

    @Override // com.yandex.mapkit.location.LocationSimulator
    @Deprecated
    public native void setSpeed(double d11);

    @Override // com.yandex.mapkit.location.LocationSimulator
    public native void startSimulation(@NonNull SimulationAccuracy simulationAccuracy);

    @Override // com.yandex.mapkit.location.LocationSimulator
    public native void stopSimulation();

    @Override // com.yandex.mapkit.location.LocationSimulator
    public native void subscribeForSimulatorEvents(@NonNull LocationSimulatorListener locationSimulatorListener);

    @Override // com.yandex.mapkit.location.LocationSimulator
    public native void unsubscribeFromSimulatorEvents(@NonNull LocationSimulatorListener locationSimulatorListener);
}
