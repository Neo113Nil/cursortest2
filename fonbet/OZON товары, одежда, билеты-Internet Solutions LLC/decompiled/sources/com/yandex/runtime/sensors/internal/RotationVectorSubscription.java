package com.yandex.runtime.sensors.internal;

import android.hardware.SensorEvent;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class RotationVectorSubscription implements SensorDataConsumer {
    private NativeObject nativeObject;
    private SensorSubscription sensorSubscription;

    public RotationVectorSubscription(NativeObject nativeObject, int i11) {
        this.nativeObject = nativeObject;
        this.sensorSubscription = new SensorSubscription(this, 11, i11);
    }

    public static boolean isRotationVectorAvailable() {
        return SensorSubscription.isSensorAvailable(11);
    }

    private static native void rotationVectorChanged(NativeObject nativeObject, float f7, float f11, float f12, int i11, long j11);

    private static native void rotationVectorChangedScalar(NativeObject nativeObject, float f7, float f11, float f12, float f13, int i11, long j11);

    private static native void rotationVectorUnavailable(NativeObject nativeObject);

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void consume(SensorEvent sensorEvent) {
        long eventAgeMilliseconds = TimeHelpers.eventAgeMilliseconds(sensorEvent);
        float[] fArr = sensorEvent.values;
        if (fArr.length == 3) {
            rotationVectorChanged(this.nativeObject, fArr[0], fArr[1], fArr[2], sensorEvent.accuracy, eventAgeMilliseconds);
        } else {
            rotationVectorChangedScalar(this.nativeObject, fArr[0], fArr[1], fArr[2], fArr[3], sensorEvent.accuracy, eventAgeMilliseconds);
        }
    }

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void sensorUnavailable() {
        rotationVectorUnavailable(this.nativeObject);
    }

    public void stop() {
        this.sensorSubscription.stop();
    }
}
