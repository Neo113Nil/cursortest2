package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzenc implements zzelg {
    private final Context zza;
    private final zzdvw zzb;
    private final zzdmu zzc;
    private final zzfkm zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbph zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkl)).booleanValue();
    private final zzekf zzi;
    private final zzdyu zzj;
    private final zzdyz zzk;

    public zzenc(Context context, VersionInfoParcel versionInfoParcel, zzfkm zzfkmVar, Executor executor, zzdmu zzdmuVar, zzdvw zzdvwVar, zzbph zzbphVar, zzekf zzekfVar, zzdyu zzdyuVar, zzdyz zzdyzVar) {
        this.zza = context;
        this.zzd = zzfkmVar;
        this.zzc = zzdmuVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdvwVar;
        this.zzg = zzbphVar;
        this.zzi = zzekfVar;
        this.zzj = zzdyuVar;
        this.zzk = zzdyzVar;
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
        zzhaq zzhaqVar = new zzhaq() { // from class: com.google.android.gms.internal.ads.zzemz
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzenc.this.zzc(zzfjtVar, zzfkeVar, zzdwaVar, obj);
            }
        };
        Executor executor = this.zze;
        ListenableFuture zzj = zzhbi.zzj(zza, zzhaqVar, executor);
        Objects.requireNonNull(zzdwaVar);
        zzj.addListener(new Runnable(zzdwaVar) { // from class: com.google.android.gms.internal.ads.zzenb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
            }
        }, executor);
        return zzj;
    }

    final /* synthetic */ ListenableFuture zzc(final zzfjt zzfjtVar, zzfke zzfkeVar, zzdwa zzdwaVar, Object obj) {
        zzbhv zzbhvVar = zzbie.zzcQ;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
            this.zzj.zzf(zzdyi.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdvw zzdvwVar = this.zzb;
        zzfkm zzfkmVar = this.zzd;
        final zzcki zza = zzdvwVar.zza(zzfkmVar.zzf, zzfjtVar, zzfkeVar.zzb.zzb);
        zza.zzaw(zzfjtVar.zzW);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
            this.zzj.zzf(zzdyi.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzcfk zzcfkVar = new zzcfk();
        zzdmu zzdmuVar = this.zzc;
        zzcxx zzcxxVar = new zzcxx(zzfkeVar, zzfjtVar, null);
        Context context = this.zza;
        VersionInfoParcel versionInfoParcel = this.zzf;
        boolean z = this.zzh;
        zzbph zzbphVar = this.zzg;
        final zzdlo zzd = zzdmuVar.zzd(zzcxxVar, new zzdlr(new zzena(context, versionInfoParcel, zzcfkVar, zzfjtVar, zza, zzfkmVar, z, zzbphVar, this.zzi, this.zzk), zza));
        zzcfkVar.zzc(zzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
            this.zzj.zzf(zzdyi.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzd.zzd().zzq(new zzdcz() { // from class: com.google.android.gms.internal.ads.zzemx
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
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgn)).booleanValue() && zzd.zzl().zza(true)) {
            str = zzclz.zza(str, zzclz.zzb(zzfjtVar));
        }
        zzdvv zzk = zzd.zzk();
        zzbph zzbphVar2 = true != z ? null : zzbphVar;
        zzdyu zzdyuVar = this.zzj;
        zzk.zzi(zza, true, zzbphVar2, zzdyuVar);
        zzd.zzk();
        return zzhbi.zzk(zzdvv.zzj(zza, zzfjyVar.zzb, str, zzdyuVar, zzdmuVar.zzc()), new zzgsn(this) { // from class: com.google.android.gms.internal.ads.zzemy
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj2) {
                zzcki zzckiVar = zza;
                if (zzfjtVar.zzM) {
                    zzckiVar.zzav();
                }
                zzdlo zzdloVar = zzd;
                zzckiVar.zzJ();
                zzckiVar.onPause();
                return zzdloVar.zzh();
            }
        }, this.zze);
    }
}
