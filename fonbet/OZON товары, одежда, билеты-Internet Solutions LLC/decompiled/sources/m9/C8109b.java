package m9;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;

/* renamed from: m9.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8109b implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private O9.f f74648a;

    /* renamed from: b, reason: collision with root package name */
    private O9.g f74649b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f74650c = new Handler();

    public C8109b(Context context, O9.f fVar, O9.g gVar) {
        this.f74648a = fVar;
        this.f74649b = gVar;
    }

    public final void b() {
        this.f74649b.getClass();
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i11) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        final boolean z11 = false;
        float f7 = sensorEvent.values[0];
        if (this.f74648a != null) {
            if (f7 <= 45.0f) {
                final boolean z12 = true;
                this.f74650c.post(new Runnable() { // from class: m9.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8109b.this.f74648a.m(z12);
                    }
                });
            } else if (f7 >= 450.0f) {
                this.f74650c.post(new Runnable() { // from class: m9.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8109b.this.f74648a.m(z11);
                    }
                });
            }
        }
    }
}
