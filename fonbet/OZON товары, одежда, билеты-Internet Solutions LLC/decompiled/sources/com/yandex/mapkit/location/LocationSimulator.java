package com.yandex.mapkit.location;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import java.util.List;

/* loaded from: classes9.dex */
public interface LocationSimulator extends LocationManager {
    @Deprecated
    Polyline getGeometry();

    @NonNull
    List<SimulationSettings> getSettings();

    @Deprecated
    double getSpeed();

    boolean isActive();

    @NonNull
    PolylinePosition polylinePosition();

    @Deprecated
    void setGeometry(Polyline polyline);

    @Deprecated
    void setLocationSpeedProviding(boolean z11);

    void setSettings(@NonNull List<SimulationSettings> list);

    @Deprecated
    void setSpeed(double d11);

    void startSimulation(@NonNull SimulationAccuracy simulationAccuracy);

    void stopSimulation();

    void subscribeForSimulatorEvents(@NonNull LocationSimulatorListener locationSimulatorListener);

    void unsubscribeFromSimulatorEvents(@NonNull LocationSimulatorListener locationSimulatorListener);
}
