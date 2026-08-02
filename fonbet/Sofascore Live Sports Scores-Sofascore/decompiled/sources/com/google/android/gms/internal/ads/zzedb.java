package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.unity3d.services.UnityAdsConstants;
import defpackage.h3o;
import defpackage.inn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzedb extends zzgbs {
    public final SensorManager a;
    public final Sensor b;
    public float c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public Float d = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public long e = com.google.android.gms.ads.internal.zzt.zzk().a();
    public int f = 0;
    public boolean g = false;
    public boolean h = false;
    public zzedp i = null;
    public boolean j = false;

    public zzedb(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.a = sensorManager;
        if (sensorManager != null) {
            this.b = sensorManager.getDefaultSensor(4);
        } else {
            this.b = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbs
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ea)).booleanValue()) {
            long a = com.google.android.gms.ads.internal.zzt.zzk().a();
            if (this.e + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ga)).intValue() < a) {
                this.f = 0;
                this.e = a;
                this.g = false;
                this.h = false;
                this.c = this.d.floatValue();
            }
            float floatValue = this.d.floatValue() + (sensorEvent.values[1] * 4.0f);
            this.d = Float.valueOf(floatValue);
            float f = this.c;
            inn innVar = zzbjg.Fa;
            float floatValue2 = ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).floatValue() + f;
            Float f2 = this.d;
            if (floatValue > floatValue2) {
                this.c = f2.floatValue();
                this.h = true;
            } else if (f2.floatValue() < this.c - ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).floatValue()) {
                this.c = this.d.floatValue();
                this.g = true;
            }
            if (this.d.isInfinite()) {
                this.d = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (this.g && this.h) {
                com.google.android.gms.ads.internal.util.zze.zza("Flick detected.");
                this.e = a;
                int i = this.f + 1;
                this.f = i;
                this.g = false;
                this.h = false;
                zzedp zzedpVar = this.i;
                if (zzedpVar != null) {
                    if (i == ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ha)).intValue()) {
                        zzedpVar.e(new h3o(1), zzedo.c);
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
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ea)).booleanValue()) {
                    if (!this.j && (sensorManager = this.a) != null && (sensor = this.b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.j = true;
                        com.google.android.gms.ads.internal.util.zze.zza("Listening for flick gestures.");
                    }
                    if (this.a == null || this.b == null) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzi("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
