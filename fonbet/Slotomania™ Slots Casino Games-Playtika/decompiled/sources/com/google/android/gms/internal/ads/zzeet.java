package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzeet {
    private final ScheduledExecutorService zza;
    private final zzhbs zzb;
    private final zzhbs zzc;
    private final zzefs zzd;
    private final zzimc zze;

    public zzeet(ScheduledExecutorService scheduledExecutorService, zzhbs zzhbsVar, zzhbs zzhbsVar2, zzefs zzefsVar, zzimc zzimcVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzhbsVar;
        this.zzc = zzhbsVar2;
        this.zzd = zzefsVar;
        this.zze = zzimcVar;
    }

    public final ListenableFuture zza(final zzcar zzcarVar) {
        ListenableFuture submit;
        String str = zzcarVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzF(str)) {
            submit = zzhbi.zzc(new zzegf(1));
        } else {
            submit = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzix)).booleanValue() || ((Boolean) zzbkp.zza.zze()).booleanValue()) ? this.zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeeq
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzeet.this.zzc(zzcarVar);
                }
            }) : this.zzd.zza(zzcarVar);
        }
        final int callingUid = Binder.getCallingUid();
        return (zzhba) zzhbi.zzh((zzhba) zzhbi.zzi(zzhba.zzw(submit), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgD)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzees
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzeet.this.zzb(zzcarVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ ListenableFuture zzb(final zzcar zzcarVar, int i, Throwable th) {
        Bundle bundle;
        if (zzcarVar != null && (bundle = zzcarVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzhbi.zzj(((zzehw) this.zze.zzb()).zzk(zzcarVar, i), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzeer
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzhbi.zza(new zzegg((InputStream) obj, zzcar.this));
            }
        }, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzegg zzc(zzcar zzcarVar) {
        return (zzegg) this.zzd.zza(zzcarVar).get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgD)).intValue(), TimeUnit.SECONDS);
    }
}
