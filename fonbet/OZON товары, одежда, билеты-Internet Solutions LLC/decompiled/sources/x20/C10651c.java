package x20;

import android.app.Application;
import android.hardware.SensorManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: x20.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10651c {

    /* renamed from: a, reason: collision with root package name */
    private SensorManager f104944a;

    /* renamed from: b, reason: collision with root package name */
    private float f104945b;

    /* renamed from: c, reason: collision with root package name */
    private float f104946c;

    /* renamed from: d, reason: collision with root package name */
    private float f104947d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f104948e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C10650b f104949f;

    public C10651c(@NotNull Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f104944a = (SensorManager) androidx.core.content.a.getSystemService(context, SensorManager.class);
        this.f104946c = 9.80665f;
        this.f104947d = 9.80665f;
        this.f104948e = true;
        this.f104949f = new C10650b(this, context);
    }

    public final boolean g() {
        return this.f104948e;
    }

    public final void h() {
        SensorManager sensorManager = this.f104944a;
        if (sensorManager != null) {
            sensorManager.registerListener(this.f104949f, sensorManager.getDefaultSensor(1), 2);
        }
    }

    public final void i(boolean z11) {
        this.f104948e = z11;
    }

    public final void j() {
        SensorManager sensorManager = this.f104944a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f104949f);
        }
    }
}
