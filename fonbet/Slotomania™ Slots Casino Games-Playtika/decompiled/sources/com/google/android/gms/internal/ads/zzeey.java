package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzeey implements zzege {
    private static final Pattern zzh = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzedz zza;
    private final zzhbs zzb;
    private final zzfkm zzc;
    private final ScheduledExecutorService zzd;
    private final zzeir zze;
    private final zzfps zzf;
    private final Context zzg;

    zzeey(Context context, zzfkm zzfkmVar, zzedz zzedzVar, zzhbs zzhbsVar, ScheduledExecutorService scheduledExecutorService, zzeir zzeirVar, zzfps zzfpsVar) {
        this.zzg = context;
        this.zzc = zzfkmVar;
        this.zza = zzedzVar;
        this.zzb = zzhbsVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzeirVar;
        this.zzf = zzfpsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzege
    public final ListenableFuture zza(zzcar zzcarVar) {
        Context context = this.zzg;
        ListenableFuture zza = this.zza.zza(zzcarVar);
        zzfpi zzn = zzfpi.zzn(context, 11);
        zzfpr.zzb(zza, zzn);
        ListenableFuture zzj = zzhbi.zzj(zza, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzeex
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzeey.this.zzb((zzegg) obj);
            }
        }, this.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgC)).booleanValue()) {
            zzj = zzhbi.zzh(zzhbi.zzi(zzj, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgD)).intValue(), TimeUnit.SECONDS, this.zzd), TimeoutException.class, zzeew.zza, zzcff.zzh);
        }
        zzfpr.zzd(zzj, this.zzf, zzn);
        zzhbi.zzr(zzj, new zzeev(this), zzcff.zzh);
        return zzj;
    }

    final /* synthetic */ ListenableFuture zzb(zzegg zzeggVar) {
        return zzhbi.zza(new zzfke(new zzfkb(this.zzc), zzfkd.zza(new InputStreamReader(zzeggVar.zza()), zzeggVar.zzb().zzm)));
    }

    final /* synthetic */ zzeir zzc() {
        return this.zze;
    }
}
