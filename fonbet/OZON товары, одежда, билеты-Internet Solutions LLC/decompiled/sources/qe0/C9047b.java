package qe0;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import De.C2862e;
import Sc.s;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import hd.C6915b;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.M;

/* renamed from: qe0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9047b implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2862e f82027a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x0<C9048c> f82028b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final M0<C9048c> f82029c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final SensorManager f82030d;

    /* renamed from: e, reason: collision with root package name */
    private final Sensor f82031e;

    /* renamed from: f, reason: collision with root package name */
    private final Sensor f82032f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final float[] f82033g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final float[] f82034h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final float[] f82035i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final float[] f82036j;

    /* renamed from: k, reason: collision with root package name */
    private float f82037k;

    /* renamed from: l, reason: collision with root package name */
    private Integer f82038l;

    @e(c = "ru.ozon.mapsdk.common.locationcontroller.userLocationManager.compass.CompassListener$onSensorChanged$1$1", f = "CompassListener.kt", l = {89}, m = "invokeSuspend")
    /* renamed from: qe0.b$a */
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f82039d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9047b.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f82039d;
            if (i11 == 0) {
                s.b(obj);
                C9047b c9047b = C9047b.this;
                x0 x0Var = c9047b.f82028b;
                C9048c c9048c = new C9048c(C6915b.c(c9047b.f82037k), c9047b.f82038l);
                this.f82039d = 1;
                if (x0Var.emit(c9048c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public C9047b(@NotNull Context context, @NotNull C2862e scope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f82027a = scope;
        x0<C9048c> a11 = O0.a(null);
        this.f82028b = a11;
        this.f82029c = C2399j.b(a11);
        Object systemService = context.getSystemService("sensor");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.f82030d = sensorManager;
        this.f82031e = sensorManager.getDefaultSensor(1);
        this.f82032f = sensorManager.getDefaultSensor(2);
        this.f82033g = new float[3];
        this.f82034h = new float[3];
        this.f82035i = new float[9];
        this.f82036j = new float[9];
    }

    @NotNull
    public final M0<C9048c> d() {
        return this.f82029c;
    }

    public final boolean e() {
        return (this.f82031e == null || this.f82032f == null) ? false : true;
    }

    public final void f() {
        SensorManager sensorManager = this.f82030d;
        sensorManager.registerListener(this, this.f82031e, 2);
        sensorManager.registerListener(this, this.f82032f, 2);
    }

    public final void g() {
        SensorManager sensorManager = this.f82030d;
        Sensor sensor = this.f82031e;
        if (sensor != null) {
            sensorManager.unregisterListener(this, sensor);
        }
        Sensor sensor2 = this.f82032f;
        if (sensor2 != null) {
            sensorManager.unregisterListener(this, sensor2);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i11) {
        if (Intrinsics.d(sensor, this.f82032f)) {
            this.f82038l = Integer.valueOf(i11);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        synchronized (this) {
            try {
                Intrinsics.f(sensorEvent);
                if (sensorEvent.sensor.getType() == 1) {
                    float[] fArr = this.f82033g;
                    float f7 = fArr[0] * 0.97f;
                    float f11 = 1 - 0.97f;
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = (fArr2[0] * f11) + f7;
                    fArr[1] = (fArr2[1] * f11) + (fArr[1] * 0.97f);
                    fArr[2] = (f11 * fArr2[2]) + (fArr[2] * 0.97f);
                }
                if (sensorEvent.sensor.getType() == 2) {
                    float[] fArr3 = this.f82034h;
                    float f12 = fArr3[0] * 0.97f;
                    float f13 = 1 - 0.97f;
                    float[] fArr4 = sensorEvent.values;
                    fArr3[0] = (fArr4[0] * f13) + f12;
                    fArr3[1] = (fArr4[1] * f13) + (fArr3[1] * 0.97f);
                    fArr3[2] = (f13 * fArr4[2]) + (0.97f * fArr3[2]);
                }
                if (SensorManager.getRotationMatrix(this.f82035i, this.f82036j, this.f82033g, this.f82034h)) {
                    SensorManager.getOrientation(this.f82035i, new float[3]);
                    float f14 = 360;
                    this.f82037k = ((((float) Math.toDegrees(r0[0])) + 0.0f) + f14) % f14;
                    C10727i.c(this.f82027a, null, null, new a(null), 3);
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
