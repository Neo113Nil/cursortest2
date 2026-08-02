package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
/* loaded from: classes9.dex */
public final class zzgq {
    private final Context zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final zzia zze;
    private final zzpl zzf;
    private final ExecutorService zzg;
    private final ScheduledExecutorService zzh;
    private final com.google.android.gms.tagmanager.zzcp zzi;
    private final Clock zzj;
    private final zzgs zzk;
    private zzhz zzl;
    private volatile int zzm = 1;
    private List<zzgx> zzn = new ArrayList();
    private ScheduledFuture<?> zzo = null;
    private boolean zzp = false;

    zzgq(Context context, String str, String str2, String str3, zzia zziaVar, zzpl zzplVar, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, com.google.android.gms.tagmanager.zzcp zzcpVar, Clock clock, zzgs zzgsVar) {
        this.zza = context;
        String str4 = (String) Preconditions.checkNotNull(str);
        this.zzb = str4;
        this.zze = (zzia) Preconditions.checkNotNull(zziaVar);
        this.zzf = (zzpl) Preconditions.checkNotNull(zzplVar);
        ExecutorService executorService2 = (ExecutorService) Preconditions.checkNotNull(executorService);
        this.zzg = executorService2;
        this.zzh = (ScheduledExecutorService) Preconditions.checkNotNull(scheduledExecutorService);
        com.google.android.gms.tagmanager.zzcp zzcpVar2 = (com.google.android.gms.tagmanager.zzcp) Preconditions.checkNotNull(zzcpVar);
        this.zzi = zzcpVar2;
        this.zzj = (Clock) Preconditions.checkNotNull(clock);
        this.zzk = (zzgs) Preconditions.checkNotNull(zzgsVar);
        this.zzc = str3;
        this.zzd = str2;
        this.zzn.add(new zzgx("gtm.load", new Bundle(), "gtm", new Date(), false, zzcpVar2));
        StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 35);
        sb2.append("Container ");
        sb2.append(str4);
        sb2.append("is scheduled for loading.");
        zzhl.zzd(sb2.toString());
        executorService2.execute(new zzgl(this, null));
    }

    static /* bridge */ /* synthetic */ void zzr(zzgq zzgqVar, long j11) {
        ScheduledFuture<?> scheduledFuture = zzgqVar.zzo;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        String str = zzgqVar.zzb;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 45);
        sb2.append("Refresh container ");
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(j11);
        sb2.append("ms.");
        zzhl.zzd(sb2.toString());
        zzgqVar.zzo = zzgqVar.zzh.schedule(new zzgh(zzgqVar), j11, TimeUnit.MILLISECONDS);
    }

    public final void zzs() {
        this.zzg.execute(new zzgg(this));
    }

    @VisibleForTesting
    public final void zzt(zzgx zzgxVar) {
        this.zzg.execute(new zzgm(this, zzgxVar));
    }
}
