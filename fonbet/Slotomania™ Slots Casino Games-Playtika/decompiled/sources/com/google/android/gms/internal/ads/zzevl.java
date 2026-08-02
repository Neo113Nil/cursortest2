package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzevl implements zzfby {
    final zzcer zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzhbs zzd;
    private final Context zze;

    zzevl(Context context, zzcer zzcerVar, ScheduledExecutorService scheduledExecutorService, zzhbs zzhbsVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdT)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzcerVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzhbsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdP)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdU)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdQ)).booleanValue()) {
                    return zzhbi.zzk(zzgcc.zza(this.zzb.getAppSetIdInfo(), null), zzevk.zza, zzcff.zzh);
                }
                Task<AppSetIdInfo> zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdT)).booleanValue() ? zzflr.zzb(this.zze) : this.zzb.getAppSetIdInfo();
                if (zzb == null) {
                    return zzhbi.zza(new zzevm(null, -1));
                }
                ListenableFuture zzj = zzhbi.zzj(zzgcc.zza(zzb, null), zzevi.zza, zzcff.zzh);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdR)).booleanValue()) {
                    zzj = zzhbi.zzi(zzj, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdS)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzhbi.zzg(zzj, Exception.class, new zzgsn() { // from class: com.google.android.gms.internal.ads.zzevj
                    @Override // com.google.android.gms.internal.ads.zzgsn
                    public final /* synthetic */ Object apply(Object obj) {
                        zzevl.this.zza.zzg((Exception) obj, "AppSetIdInfoSignal");
                        return new zzevm(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzhbi.zza(new zzevm(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 11;
    }
}
