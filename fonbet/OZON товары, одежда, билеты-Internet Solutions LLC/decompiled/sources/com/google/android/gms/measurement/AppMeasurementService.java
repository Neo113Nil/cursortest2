package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.zzkk;
import com.google.android.gms.measurement.internal.zzkl;
import d3.AbstractC6069a;

/* loaded from: classes9.dex */
public final class AppMeasurementService extends Service implements zzkk {
    private zzkl zza;

    private final zzkl zzd() {
        if (this.zza == null) {
            this.zza = new zzkl(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    public IBinder onBind(@NonNull Intent intent) {
        return zzd().zzb(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        zzd().zze();
    }

    @Override // android.app.Service
    public void onDestroy() {
        zzd().zzf();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(@NonNull Intent intent) {
        zzd().zzg(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(@NonNull Intent intent, int i11, int i12) {
        zzd().zza(intent, i11, i12);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(@NonNull Intent intent) {
        zzd().zzj(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zza(@NonNull Intent intent) {
        AbstractC6069a.completeWakefulIntent(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zzb(@NonNull JobParameters jobParameters, boolean z11) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final boolean zzc(int i11) {
        return stopSelfResult(i11);
    }
}
