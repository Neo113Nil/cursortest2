package io.sentry.android.core;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import io.sentry.EnumC4788n3;
import io.sentry.ILogger;

/* loaded from: classes3.dex */
public final class j1 implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public SensorManager f51168a;

    /* renamed from: b, reason: collision with root package name */
    public Sensor f51169b;

    /* renamed from: c, reason: collision with root package name */
    public HandlerThread f51170c;

    /* renamed from: d, reason: collision with root package name */
    public Handler f51171d;

    /* renamed from: e, reason: collision with root package name */
    public volatile a f51172e;

    /* renamed from: f, reason: collision with root package name */
    public ILogger f51173f;

    /* renamed from: g, reason: collision with root package name */
    public final d f51174g = new d();

    public interface a {
        void onShake();
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public long f51175a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f51176b;

        /* renamed from: c, reason: collision with root package name */
        public b f51177c;
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public b f51178a;

        public b a() {
            b bVar = this.f51178a;
            if (bVar == null) {
                return new b();
            }
            this.f51178a = bVar.f51177c;
            return bVar;
        }

        public void b(b bVar) {
            bVar.f51177c = this.f51178a;
            this.f51178a = bVar;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final c f51179a = new c();

        /* renamed from: b, reason: collision with root package name */
        public b f51180b;

        /* renamed from: c, reason: collision with root package name */
        public b f51181c;

        /* renamed from: d, reason: collision with root package name */
        public int f51182d;

        /* renamed from: e, reason: collision with root package name */
        public int f51183e;

        public void a(long j10, boolean z10) {
            d(j10 - 500000000);
            b a10 = this.f51179a.a();
            a10.f51175a = j10;
            a10.f51176b = z10;
            a10.f51177c = null;
            b bVar = this.f51181c;
            if (bVar != null) {
                bVar.f51177c = a10;
            }
            this.f51181c = a10;
            if (this.f51180b == null) {
                this.f51180b = a10;
            }
            this.f51182d++;
            if (z10) {
                this.f51183e++;
            }
        }

        public void b() {
            while (true) {
                b bVar = this.f51180b;
                if (bVar == null) {
                    this.f51181c = null;
                    this.f51182d = 0;
                    this.f51183e = 0;
                    return;
                }
                this.f51180b = bVar.f51177c;
                this.f51179a.b(bVar);
            }
        }

        public boolean c() {
            b bVar;
            int i10;
            b bVar2 = this.f51181c;
            return bVar2 != null && (bVar = this.f51180b) != null && (i10 = this.f51182d) >= 4 && bVar2.f51175a - bVar.f51175a >= 250000000 && this.f51183e >= (i10 >> 1) + (i10 >> 2);
        }

        public final void d(long j10) {
            b bVar;
            while (true) {
                int i10 = this.f51182d;
                if (i10 < 4 || (bVar = this.f51180b) == null || j10 - bVar.f51175a <= 0) {
                    return;
                }
                if (bVar.f51176b) {
                    this.f51183e--;
                }
                this.f51182d = i10 - 1;
                b bVar2 = bVar.f51177c;
                this.f51180b = bVar2;
                if (bVar2 == null) {
                    this.f51181c = null;
                }
                this.f51179a.b(bVar);
            }
        }
    }

    public j1(ILogger iLogger) {
        this.f51173f = iLogger;
    }

    public void b() {
        f();
        HandlerThread handlerThread = this.f51170c;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f51170c = null;
            this.f51171d = null;
        }
    }

    public final void c(Context context) {
        if (this.f51168a == null) {
            this.f51168a = (SensorManager) context.getSystemService("sensor");
        }
        SensorManager sensorManager = this.f51168a;
        if (sensorManager != null && this.f51169b == null) {
            this.f51169b = sensorManager.getDefaultSensor(1, false);
        }
        if (this.f51169b == null || this.f51170c != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("sentry-shake");
        this.f51170c = handlerThread;
        handlerThread.start();
        this.f51171d = new Handler(this.f51170c.getLooper());
    }

    public void d(Context context, ILogger iLogger) {
        this.f51173f = iLogger;
        c(context);
    }

    public void e(Context context, a aVar) {
        this.f51172e = aVar;
        c(context);
        SensorManager sensorManager = this.f51168a;
        if (sensorManager == null) {
            this.f51173f.c(EnumC4788n3.WARNING, "SensorManager is not available. Shake detection disabled.", new Object[0]);
            return;
        }
        Sensor sensor = this.f51169b;
        if (sensor == null) {
            this.f51173f.c(EnumC4788n3.WARNING, "Accelerometer sensor not available. Shake detection disabled.", new Object[0]);
        } else {
            sensorManager.registerListener(this, sensor, 3, this.f51171d);
        }
    }

    public void f() {
        this.f51172e = null;
        SensorManager sensorManager = this.f51168a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        Handler handler = this.f51171d;
        if (handler != null) {
            handler.post(new Runnable() { // from class: io.sentry.android.core.i1
                @Override // java.lang.Runnable
                public final void run() {
                    j1.this.f51174g.b();
                }
            });
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 1) {
            return;
        }
        float[] fArr = sensorEvent.values;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        this.f51174g.a(sensorEvent.timestamp, Math.sqrt((double) (((f10 * f10) + (f11 * f11)) + (f12 * f12))) > 13.0d);
        if (this.f51174g.c()) {
            this.f51174g.b();
            a aVar = this.f51172e;
            if (aVar != null) {
                aVar.onShake();
            }
        }
    }
}
