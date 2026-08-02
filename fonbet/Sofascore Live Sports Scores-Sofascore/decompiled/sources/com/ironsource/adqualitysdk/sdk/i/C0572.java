package com.ironsource.adqualitysdk.sdk.i;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ท, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0572 implements SensorEventListener {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ float[] f1863;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ float[] f1864;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ CopyOnWriteArrayList f1865;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ CopyOnWriteArrayList f1866;

    public C0572(CopyOnWriteArrayList copyOnWriteArrayList, CopyOnWriteArrayList copyOnWriteArrayList2, float[] fArr, float[] fArr2) {
        this.f1866 = copyOnWriteArrayList;
        this.f1865 = copyOnWriteArrayList2;
        this.f1864 = fArr;
        this.f1863 = fArr2;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            this.f1866.add((float[]) sensorEvent.values.clone());
            return;
        }
        if (type != 2) {
            if (type == 4) {
                this.f1865.add((float[]) sensorEvent.values.clone());
                return;
            } else {
                if (type != 6) {
                    return;
                }
                this.f1864[0] = sensorEvent.values[0];
                return;
            }
        }
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f1863;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = f3 * f3;
        fArr2[0] = (float) Math.sqrt(f4 + (f2 * f2) + (f * f));
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
