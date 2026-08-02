package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzemk implements zzelm {
    private final Context zza;
    private final zzcwe zzb;
    private final Executor zzc;

    public zzemk(Context context, zzcwe zzcweVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcweVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final void zza(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt {
        com.google.android.gms.ads.internal.client.zzr zzrVar;
        zzfkm zzfkmVar = zzfkeVar.zza.zza;
        com.google.android.gms.ads.internal.client.zzr zzrVar2 = zzfkmVar.zzf;
        if (zzrVar2.zzn) {
            zzrVar = new com.google.android.gms.ads.internal.client.zzr(this.zza, com.google.android.gms.ads.zzc.zzb(zzrVar2.zze, zzrVar2.zzb));
        } else {
            zzrVar = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziZ)).booleanValue() && zzfjtVar.zzag) ? new com.google.android.gms.ads.internal.client.zzr(this.zza, com.google.android.gms.ads.zzc.zzc(zzrVar2.zze, zzrVar2.zzb)) : zzfks.zza(this.zza, zzfjtVar.zzu);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar3 = zzrVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziZ)).booleanValue() && zzfjtVar.zzag) {
            ((zzflk) zzeljVar.zzb).zzb(this.zza, zzrVar3, zzfkmVar.zzd, zzfjtVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbp.zzm(zzfjtVar.zzs), (zzbuw) zzeljVar.zzc);
        } else {
            ((zzflk) zzeljVar.zzb).zzg(this.zza, zzrVar3, zzfkmVar.zzd, zzfjtVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbp.zzm(zzfjtVar.zzs), (zzbuw) zzeljVar.zzc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzelm
    public final /* bridge */ /* synthetic */ Object zzb(zzfke zzfkeVar, final zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt, zzeov {
        final View zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziZ)).booleanValue() && zzfjtVar.zzag) {
            zzbuz zzc = ((zzflk) zzeljVar.zzb).zzc();
            if (zzc == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfkt(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                zza = (View) ObjectWrapper.unwrap(zzc.zze());
                boolean zzf = zzc.zzf();
                if (zza == null) {
                    throw new zzfkt(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        zza = (View) zzhbi.zzj(zzhbi.zza(null), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzemi
                            @Override // com.google.android.gms.internal.ads.zzhaq
                            public final /* synthetic */ ListenableFuture zza(Object obj) {
                                return zzemk.this.zzc(zza, zzfjtVar, obj);
                            }
                        }, zzcff.zzf).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfkt(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfkt(e2);
            }
        } else {
            zza = ((zzflk) zzeljVar.zzb).zza();
        }
        zzcwe zzcweVar = this.zzb;
        zzcxx zzcxxVar = new zzcxx(zzfkeVar, zzfjtVar, zzeljVar.zza);
        final zzflk zzflkVar = (zzflk) zzeljVar.zzb;
        Objects.requireNonNull(zzflkVar);
        zzcva zzf2 = zzcweVar.zzf(zzcxxVar, new zzcvg(zza, null, new zzcxf() { // from class: com.google.android.gms.internal.ads.zzemj
            @Override // com.google.android.gms.internal.ads.zzcxf
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zza() {
                return zzflk.this.zzt();
            }
        }, (zzfju) zzfjtVar.zzu.get(0)));
        zzf2.zzk().zza(zza);
        zzf2.zza().zzq(new zzcsn(zzflkVar), this.zzc);
        ((zzemv) zzeljVar.zzc).zzc(zzf2.zzf());
        return zzf2.zzi();
    }

    final /* synthetic */ ListenableFuture zzc(View view, zzfjt zzfjtVar, Object obj) {
        return zzhbi.zza(zzcwt.zza(this.zza, view, zzfjtVar));
    }
}
