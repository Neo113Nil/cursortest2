package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcyl {
    private final zzefg zza;
    private final zzfkm zzb;
    private final zzfoy zzc;
    private final zzcrf zzd;
    private final zzeoy zze;
    private final zzdhu zzf;
    private zzfke zzg;
    private final zzegr zzh;
    private final zzdbk zzi;
    private final Executor zzj;
    private final zzegc zzk;
    private final zzell zzl;

    zzcyl(zzefg zzefgVar, zzfkm zzfkmVar, zzfoy zzfoyVar, zzcrf zzcrfVar, zzeoy zzeoyVar, zzdhu zzdhuVar, zzfke zzfkeVar, zzegr zzegrVar, zzdbk zzdbkVar, Executor executor, zzegc zzegcVar, zzell zzellVar) {
        this.zza = zzefgVar;
        this.zzb = zzfkmVar;
        this.zzc = zzfoyVar;
        this.zzd = zzcrfVar;
        this.zze = zzeoyVar;
        this.zzf = zzdhuVar;
        this.zzg = zzfkeVar;
        this.zzh = zzegrVar;
        this.zzi = zzdbkVar;
        this.zzj = executor;
        this.zzk = zzegcVar;
        this.zzl = zzellVar;
    }

    public final ListenableFuture zza(ListenableFuture listenableFuture) {
        if (this.zzg != null) {
            zzfoy zzfoyVar = this.zzc;
            zzfos zzfosVar = zzfos.SERVER_TRANSACTION;
            Objects.requireNonNull(zzfoyVar);
            return zzfoj.zza(zzhbi.zza(this.zzg), zzfosVar, zzfoyVar).zzi();
        }
        com.google.android.gms.ads.internal.zzt.zzj().zzb();
        zzfop zza = this.zzc.zza(zzfos.SERVER_TRANSACTION, listenableFuture);
        final zzegc zzegcVar = this.zzk;
        Objects.requireNonNull(zzegcVar);
        return zza.zzc(new zzhaq() { // from class: com.google.android.gms.internal.ads.zzcyk
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzegc.this.zza((zzcar) obj);
            }
        }).zzi();
    }

    public final ListenableFuture zzb() {
        zzfkm zzfkmVar = this.zzb;
        if (!zzfkmVar.zzv) {
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzfkmVar.zzd;
            if (zzmVar.zzx != null || zzmVar.zzs != null) {
                zzfoy zzfoyVar = this.zzc;
                zzfos zzfosVar = zzfos.PRELOADED_LOADER;
                Objects.requireNonNull(zzfoyVar);
                return zzfoj.zza(this.zza.zza(), zzfosVar, zzfoyVar).zzi();
            }
        }
        return zza(this.zzi.zzb());
    }

    public final ListenableFuture zzc(ListenableFuture listenableFuture) {
        zzfop zzc = this.zzc.zza(zzfos.RENDERER, listenableFuture).zzb(new zzfny() { // from class: com.google.android.gms.internal.ads.zzcyj
            @Override // com.google.android.gms.internal.ads.zzfny
            public final /* synthetic */ Object zza(Object obj) {
                zzfke zzfkeVar = (zzfke) obj;
                zzcyl.this.zzi(zzfkeVar);
                return zzfkeVar;
            }
        }).zzc(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgC)).booleanValue()) {
            zzc = zzc.zzh(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgD)).intValue(), TimeUnit.SECONDS);
        }
        return zzc.zzi();
    }

    public final zzdhu zzd() {
        return this.zzf;
    }

    public final ListenableFuture zze(final zzfmi zzfmiVar) {
        zzfof zzi = this.zzc.zza(zzfos.GET_CACHE_KEY, this.zzi.zzb()).zzc(new zzhaq() { // from class: com.google.android.gms.internal.ads.zzcyi
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzcyl.this.zzj(zzfmiVar, (zzcar) obj);
            }
        }).zzi();
        zzhbi.zzr(zzi, new zzcyg(this), this.zzj);
        return zzi;
    }

    public final ListenableFuture zzf(zzcar zzcarVar) {
        zzfof zzi = this.zzc.zza(zzfos.NOTIFY_CACHE_HIT, this.zzh.zzb(zzcarVar)).zzi();
        zzhbi.zzr(zzi, new zzcyh(this), this.zzj);
        return zzi;
    }

    public final com.google.android.gms.ads.internal.client.zze zzg(Throwable th) {
        return zzflo.zzb(th, this.zzl);
    }

    public final void zzh(zzfke zzfkeVar) {
        this.zzg = zzfkeVar;
    }

    final /* synthetic */ zzfke zzi(zzfke zzfkeVar) {
        this.zzd.zza(zzfkeVar);
        return zzfkeVar;
    }

    final /* synthetic */ ListenableFuture zzj(zzfmi zzfmiVar, zzcar zzcarVar) {
        zzcarVar.zzi = zzfmiVar;
        return this.zzh.zza(zzcarVar);
    }

    final /* synthetic */ zzdhu zzk() {
        return this.zzf;
    }
}
