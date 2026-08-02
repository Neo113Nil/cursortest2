package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class y4 implements SensorEventListener, AppLovinBroadcastManager.Receiver {
    private final int a;
    private final float b;
    private final h0 c;
    private final Sensor d;
    private final Sensor e;
    private final com.applovin.impl.sdk.l f;
    private float[] g;
    private float h;

    public y4(com.applovin.impl.sdk.l lVar) {
        this.f = lVar;
        h0 h0Var = new h0();
        this.c = h0Var;
        this.d = h0Var.a(9);
        this.e = h0Var.a(4);
        this.a = ((Integer) lVar.a(z4.n4)).intValue();
        this.b = ((Float) lVar.a(z4.m4)).floatValue();
    }

    public float a() {
        if (this.g == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos(r0[2] / 9.81f));
    }

    public float b() {
        return this.h;
    }

    public void c() {
        if (Boolean.parseBoolean(this.f.p0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.c.b(this);
        if (((Boolean) this.f.q0().a(z4.k4)).booleanValue()) {
            this.c.b(this, this.d, (int) TimeUnit.MILLISECONDS.toMicros(this.a), this.f.Q());
        }
        if (((Boolean) this.f.q0().a(z4.l4)).booleanValue()) {
            this.c.b(this, this.e, (int) TimeUnit.MILLISECONDS.toMicros(this.a), this.f.Q());
        }
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.c.b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.g = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 4) {
            float f = this.h * this.b;
            this.h = f;
            this.h = f + Math.abs(sensorEvent.values[0]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[2]);
        }
    }
}
