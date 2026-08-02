package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzelr implements zzelg {
    private final zzcun zza;
    private final zzdvw zzb;
    private final zzfkm zzc;
    private final Executor zzd;
    private final VersionInfoParcel zze;
    private final zzbph zzf;
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkl)).booleanValue();
    private final zzekf zzh;
    private final zzdyu zzi;
    private final zzdyz zzj;

    public zzelr(zzcun zzcunVar, Context context, Executor executor, zzdvw zzdvwVar, zzfkm zzfkmVar, VersionInfoParcel versionInfoParcel, zzbph zzbphVar, zzekf zzekfVar, zzdyu zzdyuVar, zzdyz zzdyzVar) {
        this.zza = zzcunVar;
        this.zzd = executor;
        this.zzb = zzdvwVar;
        this.zzc = zzfkmVar;
        this.zze = versionInfoParcel;
        this.zzf = zzbphVar;
        this.zzh = zzekfVar;
        this.zzi = zzdyuVar;
        this.zzj = zzdyzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zza(zzfke zzfkeVar, zzfjt zzfjtVar) {
        zzfjy zzfjyVar = zzfjtVar.zzs;
        return (zzfjyVar == null || zzfjyVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final ListenableFuture zzb(final zzfke zzfkeVar, final zzfjt zzfjtVar) {
        final zzdwa zzdwaVar = new zzdwa();
        ListenableFuture zza = zzhbi.zza(null);
        zzhaq zzhaqVar = new zzhaq() { // from class: com.google.android.gms.internal.ads.zzelp
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzelr.this.zzc(zzfjtVar, zzfkeVar, zzdwaVar, obj);
            }
        };
        Executor executor = this.zzd;
        ListenableFuture zzj = zzhbi.zzj(zza, zzhaqVar, executor);
        Objects.requireNonNull(zzdwaVar);
        zzj.addListener(new Runnable(zzdwaVar) { // from class: com.google.android.gms.internal.ads.zzelq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
            }
        }, executor);
        return zzj;
    }

    final /* synthetic */ ListenableFuture zzc(final zzfjt zzfjtVar, zzfke zzfkeVar, zzdwa zzdwaVar, Object obj) {
        zzbhv zzbhvVar = zzbie.zzcQ;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
            this.zzi.zzf(zzdyi.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdvw zzdvwVar = this.zzb;
        zzfkm zzfkmVar = this.zzc;
        final zzcki zza = zzdvwVar.zza(zzfkmVar.zzf, zzfjtVar, zzfkeVar.zzb.zzb);
        zza.zzaw(zzfjtVar.zzW);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
            this.zzi.zzf(zzdyi.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzcfk zzcfkVar = new zzcfk();
        zzcun zzcunVar = this.zza;
        zzcxx zzcxxVar = new zzcxx(zzfkeVar, zzfjtVar, null);
        VersionInfoParcel versionInfoParcel = this.zze;
        boolean z = this.zzg;
        zzbph zzbphVar = this.zzf;
        final zzcuk zzf = zzcunVar.zzf(zzcxxVar, new zzdlr(new zzelt(versionInfoParcel, zzcfkVar, zzfjtVar, zza, zzfkmVar, z, zzbphVar, this.zzh, this.zzj), zza), new zzcul(zzfjtVar.zzaa));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
            this.zzi.zzf(zzdyi.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdvv zzi = zzf.zzi();
        zzbph zzbphVar2 = true == z ? zzbphVar : null;
        zzdyu zzdyuVar = this.zzi;
        zzi.zzi(zza, false, zzbphVar2, zzdyuVar);
        zzcfkVar.zzc(zzf);
        zzf.zzd().zzq(new zzdcz() { // from class: com.google.android.gms.internal.ads.zzeln
            @Override // com.google.android.gms.internal.ads.zzdcz
            public final /* synthetic */ void zzdr() {
                zzcki zzckiVar = zzcki.this;
                if (zzckiVar.zzP() != null) {
                    zzckiVar.zzP().zzq();
                }
            }
        }, zzcff.zzh);
        zzfjy zzfjyVar = zzfjtVar.zzs;
        String str = zzfjyVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgn)).booleanValue() && zzf.zzk().zza(true)) {
            str = zzclz.zza(str, zzclz.zzb(zzfjtVar));
        }
        zzf.zzi();
        return zzhbi.zzk(zzdvv.zzj(zza, zzfjyVar.zzb, str, zzdyuVar, zzcunVar.zzd()), new zzgsn(this) { // from class: com.google.android.gms.internal.ads.zzelo
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj2) {
                zzcki zzckiVar = zza;
                if (zzfjtVar.zzM) {
                    zzckiVar.zzav();
                }
                zzcuk zzcukVar = zzf;
                zzckiVar.zzJ();
                zzckiVar.onPause();
                return zzcukVar.zzh();
            }
        }, this.zzd);
    }
}
