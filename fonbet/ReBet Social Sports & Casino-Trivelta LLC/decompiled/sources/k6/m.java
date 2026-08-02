package k6;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m implements SensorEventListener {

    /* renamed from: b, reason: collision with root package name */
    public static final a f54292b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public b f54293a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public interface b {
        void onShake();
    }

    public final void a(b bVar) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            this.f54293a = bVar;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(sensor, "sensor");
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            b bVar = this.f54293a;
            if (bVar == null) {
                return;
            }
            float[] fArr = event.values;
            double d10 = fArr[0] / 9.80665f;
            double d11 = fArr[1] / 9.80665f;
            double d12 = fArr[2] / 9.80665f;
            if (Math.sqrt((d10 * d10) + (d11 * d11) + (d12 * d12)) > 2.3d) {
                bVar.onShake();
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }
}
