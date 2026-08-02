package io.seon.androidsdk.service;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: io.seon.androidsdk.service.s6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5028s6 implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L6 f53488a;

    public C5028s6(L6 l62) {
        this.f53488a = l62;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr == null || fArr.length == 0) {
            return;
        }
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            this.f53488a.f53038j.a(fArr);
            return;
        }
        if (type == 2) {
            this.f53488a.f53042n.a(fArr);
            return;
        }
        if (type == 4) {
            this.f53488a.f53039k.a(fArr);
        } else if (type == 5) {
            this.f53488a.f53040l.a(fArr);
        } else {
            if (type != 8) {
                return;
            }
            this.f53488a.f53041m.a(fArr);
        }
    }

    public /* synthetic */ C5028s6(L6 l62, int i10) {
        this(l62);
    }
}
