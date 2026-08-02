package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzenu implements zzelm {
    private final Context zza;
    private final zzdnq zzb;
    private final Executor zzc;

    public zzenu(Context context, zzdnq zzdnqVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdnqVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfke zzfkeVar, int i) {
        return zzfkeVar.zza.zza.zzh.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final void zza(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt {
        zzflk zzflkVar = (zzflk) zzeljVar.zzb;
        zzfkm zzfkmVar = zzfkeVar.zza.zza;
        String jSONObject = zzfjtVar.zzv.toString();
        String zzm = com.google.android.gms.ads.internal.util.zzbp.zzm(zzfjtVar.zzs);
        zzflkVar.zzo(this.zza, zzfkmVar.zzd, jSONObject, zzm, (zzbuw) zzeljVar.zzc, zzfkmVar.zzj, zzfkmVar.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final /* bridge */ /* synthetic */ Object zzb(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt, zzeov {
        zzdph zzag;
        zzflk zzflkVar = (zzflk) zzeljVar.zzb;
        zzbvb zzD = zzflkVar.zzD();
        zzbvc zzE = zzflkVar.zzE();
        zzbvf zzu = zzflkVar.zzu();
        if (zzu != null && zzc(zzfkeVar, 6)) {
            zzag = zzdph.zzaf(zzu);
        } else if (zzD != null && zzc(zzfkeVar, 6)) {
            zzag = zzdph.zzai(zzD);
        } else if (zzD != null && zzc(zzfkeVar, 2)) {
            zzag = zzdph.zzah(zzD);
        } else if (zzE != null && zzc(zzfkeVar, 6)) {
            zzag = zzdph.zzaj(zzE);
        } else {
            if (zzE == null || !zzc(zzfkeVar, 1)) {
                throw new zzeov(1, "No native ad mappers");
            }
            zzag = zzdph.zzag(zzE);
        }
        if (zzag != null) {
            zzfkm zzfkmVar = zzfkeVar.zza.zza;
            if (zzfkmVar.zzh.contains(Integer.toString(zzag.zzx()))) {
                zzdpj zze = this.zzb.zze(new zzcxx(zzfkeVar, zzfjtVar, zzeljVar.zza), new zzdps(zzag), new zzdrl(zzE, zzD, zzu));
                ((zzemv) zzeljVar.zzc).zzc(zze.zzf());
                zze.zza().zzq(new zzcsn(zzflkVar), this.zzc);
                return zze.zzh();
            }
        }
        throw new zzeov(1, "No corresponding native ad listener");
    }
}
