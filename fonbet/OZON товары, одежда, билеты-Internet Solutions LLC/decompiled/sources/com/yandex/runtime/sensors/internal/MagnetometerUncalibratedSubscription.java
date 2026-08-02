package com.yandex.runtime.sensors.internal;

import android.hardware.SensorEvent;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class MagnetometerUncalibratedSubscription implements SensorDataConsumer {
    private NativeObject nativeObject;
    private SensorSubscription sensorSubscription;

    public MagnetometerUncalibratedSubscription(NativeObject nativeObject, int i11) {
        this.nativeObject = nativeObject;
        this.sensorSubscription = new SensorSubscription(this, 14, i11);
    }

    public static boolean isMagnetometerUncalibratedAvailable() {
        return SensorSubscription.isSensorAvailable(14);
    }

    private static native void magnetometerUncalibratedChanged(NativeObject nativeObject, float f7, float f11, float f12, float f13, float f14, float f15, int i11, long j11);

    private static native void magnetometerUncalibratedUnavailable(NativeObject nativeObject);

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void consume(SensorEvent sensorEvent) {
        long eventAgeMilliseconds = TimeHelpers.eventAgeMilliseconds(sensorEvent);
        NativeObject nativeObject = this.nativeObject;
        float[] fArr = sensorEvent.values;
        magnetometerUncalibratedChanged(nativeObject, fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], sensorEvent.accuracy, eventAgeMilliseconds);
    }

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void sensorUnavailable() {
        magnetometerUncalibratedUnavailable(this.nativeObject);
    }

    public void stop() {
        this.sensorSubscription.stop();
    }
}
