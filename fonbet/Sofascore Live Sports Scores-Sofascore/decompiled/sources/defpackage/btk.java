package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class btk implements SensorEventListener {
    public o3 a;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            sensor.getClass();
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            sensorEvent.getClass();
            o3 o3Var = this.a;
            if (o3Var != null) {
                float[] fArr = sensorEvent.values;
                double d = fArr[0] / 9.80665f;
                double d2 = fArr[1] / 9.80665f;
                double d3 = fArr[2] / 9.80665f;
                if (Math.sqrt((d3 * d3) + (d2 * d2) + (d * d)) > 2.3d) {
                    o3Var.d();
                }
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }
}
