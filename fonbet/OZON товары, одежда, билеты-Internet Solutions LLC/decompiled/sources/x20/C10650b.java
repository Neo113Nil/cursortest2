package x20;

import android.app.Application;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.jvm.internal.Intrinsics;
import r20.C9164a;
import ru.ozon.debugMenu.internal.presentation.OzonDebugMenuActivity;

/* renamed from: x20.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10650b implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10651c f104942a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Application f104943b;

    C10650b(C10651c c10651c, Application application) {
        this.f104942a = c10651c;
        this.f104943b = application;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i11) {
        Intrinsics.checkNotNullParameter(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        float f7;
        float f11;
        float f12;
        float f13;
        float f14;
        Intrinsics.checkNotNullParameter(event, "event");
        C10651c c10651c = this.f104942a;
        if (c10651c.g()) {
            float[] fArr = event.values;
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr[2];
            f7 = c10651c.f104946c;
            c10651c.f104947d = f7;
            float f18 = f17 * f17;
            c10651c.f104946c = (float) Math.sqrt(f18 + (f16 * f16) + (f15 * f15));
            f11 = c10651c.f104946c;
            f12 = c10651c.f104947d;
            float f19 = f11 - f12;
            f13 = c10651c.f104945b;
            c10651c.f104945b = (f13 * 0.9f) + f19;
            f14 = c10651c.f104945b;
            if (f14 > 12.0f) {
                C9164a c9164a = C9164a.f82858a;
                Application context = this.f104943b;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent = new Intent(context, (Class<?>) OzonDebugMenuActivity.class);
                intent.setFlags(276824064);
                context.startActivity(intent);
            }
        }
    }
}
