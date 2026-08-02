package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.safedk.android.analytics.brandsafety.m;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzedi extends zzfzz {
    private final Context zza;

    @Nullable
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzedh zzf;
    private boolean zzg;

    zzedi(Context context) {
        super("ShakeDetector", m.S);
        this.zza = context;
    }

    public final void zza(zzedh zzedhVar) {
        this.zzf = zzedhVar;
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkq)).booleanValue()) {
                if (this.zzb == null) {
                    SensorManager sensorManager2 = (SensorManager) this.zza.getSystemService("sensor");
                    this.zzb = sensorManager2;
                    if (sensorManager2 == null) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                    this.zzc = sensorManager2.getDefaultSensor(1);
                }
                if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.zzd = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzks)).intValue();
                    this.zzg = true;
                    com.google.android.gms.ads.internal.util.zze.zza("Listening for shake gestures.");
                }
            }
        }
    }

    public final void zzc() {
        synchronized (this) {
            if (this.zzg) {
                SensorManager sensorManager = this.zzb;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.zzc);
                    com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for shake gestures.");
                }
                this.zzg = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzz
    public final void zzd(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkq)).booleanValue()) {
            float f = sensorEvent.values[0] / 9.80665f;
            float f2 = sensorEvent.values[1] / 9.80665f;
            float f3 = sensorEvent.values[2] / 9.80665f;
            if (((float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3))) >= ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkr)).floatValue()) {
                long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                if (this.zzd + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzks)).intValue() <= currentTimeMillis) {
                    if (this.zzd + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkt)).intValue() < currentTimeMillis) {
                        this.zze = 0;
                    }
                    com.google.android.gms.ads.internal.util.zze.zza("Shake detected.");
                    this.zzd = currentTimeMillis;
                    int i = this.zze + 1;
                    this.zze = i;
                    zzedh zzedhVar = this.zzf;
                    if (zzedhVar != null) {
                        if (i == ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzku)).intValue()) {
                            zzecf zzecfVar = (zzecf) zzedhVar;
                            zzecfVar.zzo(new zzecc(zzecfVar), zzece.GESTURE);
                        }
                    }
                }
            }
        }
    }
}
