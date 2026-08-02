package com.instagram.common.viewpoint.core;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.facebook.ads.redexgen.X.Tm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1116Tm implements SensorEventListener {
    public C1116Tm() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] unused = C1117Tn.A0B = sensorEvent.values;
        C1117Tn.A05();
    }
}
