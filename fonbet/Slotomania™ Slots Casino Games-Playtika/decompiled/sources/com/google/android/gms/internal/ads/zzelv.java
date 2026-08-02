package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzelv implements zzelm {
    private final Context zza;
    private final zzcun zzb;
    private final Executor zzc;

    zzelv(Context context, zzcun zzcunVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcunVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final void zza(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt {
        zzflk zzflkVar = (zzflk) zzeljVar.zzb;
        zzfkm zzfkmVar = zzfkeVar.zza.zza;
        String jSONObject = zzfjtVar.zzv.toString();
        zzflkVar.zzy(this.zza, zzfkmVar.zzd, jSONObject, (zzbuw) zzeljVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final /* bridge */ /* synthetic */ Object zzb(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt, zzeov {
        zzcuk zzf = this.zzb.zzf(new zzcxx(zzfkeVar, zzfjtVar, zzeljVar.zza), new zzdlr(new zzelu(this, zzeljVar, zzfjtVar), null), new zzcul(zzfjtVar.zzaa));
        zzf.zza().zzq(new zzcsn((zzflk) zzeljVar.zzb), this.zzc);
        ((zzemv) zzeljVar.zzc).zzc(zzf.zzf());
        return zzf.zzh();
    }
}
