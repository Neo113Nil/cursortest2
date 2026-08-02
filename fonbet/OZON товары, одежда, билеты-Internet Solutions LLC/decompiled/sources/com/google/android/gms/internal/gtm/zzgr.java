package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

@VisibleForTesting
/* loaded from: classes9.dex */
public final class zzgr {
    private final Context zza;
    private final zzpl zzb;
    private final ExecutorService zzc;
    private final ScheduledExecutorService zzd;
    private final com.google.android.gms.tagmanager.zzcp zze;
    private final com.google.android.gms.tagmanager.zzcg zzf;

    public zzgr(Context context, com.google.android.gms.tagmanager.zzcp zzcpVar, com.google.android.gms.tagmanager.zzcg zzcgVar) {
        ScheduledExecutorService scheduledExecutorService;
        zzpl zzplVar = new zzpl(context);
        ExecutorService zza = zzjk.zza(context);
        scheduledExecutorService = zzjm.zza;
        this.zza = ((Context) Preconditions.checkNotNull(context)).getApplicationContext();
        this.zze = (com.google.android.gms.tagmanager.zzcp) Preconditions.checkNotNull(zzcpVar);
        this.zzf = (com.google.android.gms.tagmanager.zzcg) Preconditions.checkNotNull(zzcgVar);
        this.zzb = (zzpl) Preconditions.checkNotNull(zzplVar);
        this.zzc = (ExecutorService) Preconditions.checkNotNull(zza);
        this.zzd = (ScheduledExecutorService) Preconditions.checkNotNull(scheduledExecutorService);
    }

    public final zzgq zza(String str, String str2, String str3) {
        return new zzgq(this.zza, str, str2, str3, new zzia(this.zza, this.zze, this.zzf, str), this.zzb, this.zzc, this.zzd, this.zze, DefaultClock.getInstance(), new zzgs(this.zza, str));
    }
}
