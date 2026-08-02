package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.h3o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzees extends zzgbs {
    public final Context a;
    public SensorManager b;
    public Sensor c;
    public long d;
    public int e;
    public zzedp f;
    public boolean g;

    public zzees(Context context) {
        this.a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgbs
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.za)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            float f4 = f3 * f3;
            if (((float) Math.sqrt(f4 + (f2 * f2) + (f * f))) >= ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Aa)).floatValue()) {
                long a = com.google.android.gms.ads.internal.zzt.zzk().a();
                if (this.d + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ba)).intValue() <= a) {
                    if (this.d + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ca)).intValue() < a) {
                        this.e = 0;
                    }
                    com.google.android.gms.ads.internal.util.zze.zza("Shake detected.");
                    this.d = a;
                    int i = this.e + 1;
                    this.e = i;
                    zzedp zzedpVar = this.f;
                    if (zzedpVar != null) {
                        if (i == ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Da)).intValue()) {
                            zzedpVar.e(new h3o(0), zzedo.c);
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.za)).booleanValue()) {
                    if (this.b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.a.getSystemService("sensor");
                        this.b = sensorManager2;
                        if (sensorManager2 == null) {
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            zzo.zzi("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.g && (sensorManager = this.b) != null && (sensor = this.c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.d = com.google.android.gms.ads.internal.zzt.zzk().a() - ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ba)).intValue();
                        this.g = true;
                        com.google.android.gms.ads.internal.util.zze.zza("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
