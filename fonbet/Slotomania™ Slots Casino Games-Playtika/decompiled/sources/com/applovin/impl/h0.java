package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes4.dex */
public class h0 {
    private final SensorManager a = (SensorManager) com.applovin.impl.sdk.l.p().getSystemService("sensor");
    private Handler b;

    public h0() {
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:background_sensor_manager");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper());
    }

    public Sensor a(int i) {
        return this.a.getDefaultSensor(i);
    }

    public void b(final SensorEventListener sensorEventListener, final Sensor sensor, final int i, final com.applovin.impl.sdk.p pVar) {
        this.b.post(new Runnable() { // from class: com.applovin.impl.h0$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                h0.this.a(sensorEventListener, sensor, i, pVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener, Sensor sensor, int i, com.applovin.impl.sdk.p pVar) {
        try {
            this.a.registerListener(sensorEventListener, sensor, i, this.b);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                pVar.a("BackgroundSensorManager", "Unable to register sensor listener", th);
            }
        }
    }

    public void b(final SensorEventListener sensorEventListener) {
        this.b.post(new Runnable() { // from class: com.applovin.impl.h0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                h0.this.a(sensorEventListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener) {
        this.a.unregisterListener(sensorEventListener);
    }
}
