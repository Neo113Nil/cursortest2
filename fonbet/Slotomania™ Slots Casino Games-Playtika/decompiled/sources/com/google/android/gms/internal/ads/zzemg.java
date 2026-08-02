package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzemg implements zzelg {
    private final zzcwe zza;
    private final Context zzb;
    private final zzdvw zzc;
    private final zzfkm zzd;
    private final Executor zze;
    private final zzgsn zzf;
    private final zzdyu zzg;

    public zzemg(zzcwe zzcweVar, Context context, Executor executor, zzdvw zzdvwVar, zzfkm zzfkmVar, zzgsn zzgsnVar, zzdyu zzdyuVar) {
        this.zzb = context;
        this.zza = zzcweVar;
        this.zze = executor;
        this.zzc = zzdvwVar;
        this.zzd = zzfkmVar;
        this.zzf = zzgsnVar;
        this.zzg = zzdyuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zza(zzfke zzfkeVar, zzfjt zzfjtVar) {
        zzfjy zzfjyVar = zzfjtVar.zzs;
        return (zzfjyVar == null || zzfjyVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final ListenableFuture zzb(final zzfke zzfkeVar, final zzfjt zzfjtVar) {
        return zzhbi.zzj(zzhbi.zza(null), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzemf
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzemg.this.zzc(zzfkeVar, zzfjtVar, obj);
            }
        }, this.zze);
    }

    final /* synthetic */ ListenableFuture zzc(zzfke zzfkeVar, zzfjt zzfjtVar, Object obj) {
        zzbhv zzbhvVar = zzbie.zzcQ;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
            this.zzg.zzf(zzdyi.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        Context context = this.zzb;
        com.google.android.gms.ads.internal.client.zzr zza = zzfks.zza(context, zzfjtVar.zzu);
        final zzcki zza2 = this.zzc.zza(zza, zzfjtVar, zzfkeVar.zzb.zzb);
        zza2.zzaw(zzfjtVar.zzW);
        View zza3 = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziZ)).booleanValue() && zzfjtVar.zzag) ? zzcwt.zza(context, zza2.zzE(), zzfjtVar) : new zzdvz(context, zza2.zzE(), (com.google.android.gms.ads.internal.util.zzat) this.zzf.apply(zzfjtVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
            this.zzg.zzf(zzdyi.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzcwe zzcweVar = this.zza;
        zzcxx zzcxxVar = new zzcxx(zzfkeVar, zzfjtVar, null);
        Objects.requireNonNull(zza2);
        final zzcva zzf = zzcweVar.zzf(zzcxxVar, new zzcvg(zza3, zza2, new zzcxf() { // from class: com.google.android.gms.internal.ads.zzemb
            @Override // com.google.android.gms.internal.ads.zzcxf
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zza() {
                return zzcki.this.zzh();
            }
        }, zzfks.zzb(zza)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
            this.zzg.zzf(zzdyi.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdvv zzj = zzf.zzj();
        zzdyu zzdyuVar = this.zzg;
        zzj.zzi(zza2, false, null, zzdyuVar);
        zzdcx zzd = zzf.zzd();
        zzdcz zzdczVar = new zzdcz() { // from class: com.google.android.gms.internal.ads.zzemc
            @Override // com.google.android.gms.internal.ads.zzdcz
            public final /* synthetic */ void zzdr() {
                zzcki zzckiVar = zzcki.this;
                if (zzckiVar.zzP() != null) {
                    zzckiVar.zzP().zzq();
                }
            }
        };
        zzhbs zzhbsVar = zzcff.zzh;
        zzd.zzq(zzdczVar, zzhbsVar);
        zzfjy zzfjyVar = zzfjtVar.zzs;
        String str = zzfjyVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgn)).booleanValue() && zzf.zzm().zza(true)) {
            str = zzclz.zza(str, zzclz.zzb(zzfjtVar));
        }
        zzf.zzj();
        ListenableFuture zzj2 = zzdvv.zzj(zza2, zzfjyVar.zzb, str, zzdyuVar, zzcweVar.zze());
        if (zzfjtVar.zzM) {
            Objects.requireNonNull(zza2);
            zzj2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzema
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcki.this.zzav();
                }
            }, this.zze);
        }
        zzj2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzemg.this.zzd(zza2);
            }
        }, this.zze);
        return zzhbi.zzk(zzj2, new zzgsn() { // from class: com.google.android.gms.internal.ads.zzeme
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj2) {
                return zzcva.this.zzi();
            }
        }, zzhbsVar);
    }

    final /* synthetic */ void zzd(zzcki zzckiVar) {
        zzckiVar.zzJ();
        zzfkm zzfkmVar = this.zzd;
        zzclo zzh = zzckiVar.zzh();
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzfkmVar.zza;
        if (zzfwVar != null && zzh != null) {
            zzh.zzc(zzfwVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbU)).booleanValue() || zzckiVar.isAttachedToWindow()) {
            return;
        }
        zzckiVar.onPause();
        zzckiVar.zzaG(true);
    }
}
