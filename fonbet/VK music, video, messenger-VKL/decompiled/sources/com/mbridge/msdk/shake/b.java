package com.mbridge.msdk.shake;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ShakeSensorEventListener.java */
/* loaded from: classes14.dex */
public abstract class b implements SensorEventListener {
    public long a = 0;
    public float b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private int e;
    private int f;

    public b(int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    public abstract void a();

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (java.lang.Math.abs(r9 - r2) > r8.e) goto L14;
     */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f = -fArr[0];
        float f2 = -fArr[1];
        float f3 = -fArr[2];
        float f4 = this.b;
        if (f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Math.abs(f - f4) <= this.e) {
            float f5 = this.c;
            if (f5 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Math.abs(f2 - f5) <= this.e) {
                float f6 = this.d;
                if (f6 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                }
                this.b = f;
                this.c = f2;
                this.d = f3;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.a > this.f) {
            this.a = currentTimeMillis;
            a();
        }
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
