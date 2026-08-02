package com.yandex.runtime.sensors.internal;

import android.hardware.SensorEvent;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class BarometerSubscription implements SensorDataConsumer {
    private NativeObject nativeObject;
    private SensorSubscription sensorSubscription;

    public BarometerSubscription(NativeObject nativeObject, int i11) {
        this.nativeObject = nativeObject;
        this.sensorSubscription = new SensorSubscription(this, 6, i11);
    }

    private static native void barometerUnavailable(NativeObject nativeObject);

    public static boolean isBarometerAvailable() {
        return SensorSubscription.isSensorAvailable(6);
    }

    private static native void pressureChanged(NativeObject nativeObject, float f7, int i11, long j11);

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void consume(SensorEvent sensorEvent) {
        pressureChanged(this.nativeObject, sensorEvent.values[0], sensorEvent.accuracy, TimeHelpers.eventAgeMilliseconds(sensorEvent));
    }

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void sensorUnavailable() {
        barometerUnavailable(this.nativeObject);
    }

    public void stop() {
        this.sensorSubscription.stop();
    }
}
