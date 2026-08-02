package com.yandex.runtime.sensors.internal.internal;

import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.sensors.internal.GnssMeasurementsEvent;
import com.yandex.runtime.sensors.internal.GnssMeasurementsEventsNativeListener;

/* loaded from: classes9.dex */
public class GnssMeasurementsEventsNativeListenerBinding implements GnssMeasurementsEventsNativeListener {
    private final NativeObject nativeObject;

    protected GnssMeasurementsEventsNativeListenerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.runtime.sensors.internal.GnssMeasurementsEventsNativeListener
    public native void onGnssMeasurementsEvent(@NonNull GnssMeasurementsEvent gnssMeasurementsEvent);
}
