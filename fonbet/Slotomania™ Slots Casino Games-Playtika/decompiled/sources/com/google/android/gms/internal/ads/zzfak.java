package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzfak implements zzfby {
    private final zzfby zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzfak(zzfby zzfbyVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzfbyVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        ListenableFuture zza = this.zza.zza();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzde)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j = this.zzb;
        if (j > 0) {
            zza = zzhbi.zzi(zza, j, timeUnit, this.zzc);
        }
        return zzhbi.zzh(zza, Throwable.class, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzfaj
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzfak.this.zzc((Throwable) obj);
            }
        }, zzcff.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return this.zza.zzb();
    }

    final /* synthetic */ ListenableFuture zzc(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdc)).booleanValue()) {
            zzfby zzfbyVar = this.zza;
            zzcer zzh = com.google.android.gms.ads.internal.zzt.zzh();
            int zzb = zzfbyVar.zzb();
            StringBuilder sb = new StringBuilder(String.valueOf(zzb).length() + 22);
            sb.append("OptionalSignalTimeout:");
            sb.append(zzb);
            zzh.zzg(th, sb.toString());
        }
        return zzhbi.zza(null);
    }
}
