package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzaqe implements zzaqm {
    private zzv zza;
    private zzfh zzb;
    private zzahb zzc;

    public zzaqe(String str, String str2) {
        zzt zztVar = new zzt();
        zztVar.zzn(MimeTypes.VIDEO_MP2T);
        zztVar.zzo(str);
        this.zza = zztVar.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zza(zzfh zzfhVar, zzafs zzafsVar, zzara zzaraVar) {
        this.zzb = zzfhVar;
        zzaraVar.zza();
        zzahb zzu = zzafsVar.zzu(zzaraVar.zzb(), 5);
        this.zzc = zzu;
        zzu.zzA(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zzb(zzes zzesVar) {
        this.zzb.getClass();
        String str = zzfk.zza;
        long zzb = this.zzb.zzb();
        long zzc = this.zzb.zzc();
        if (zzb == C.TIME_UNSET || zzc == C.TIME_UNSET) {
            return;
        }
        zzv zzvVar = this.zza;
        if (zzc != zzvVar.zzu) {
            zzt zza = zzvVar.zza();
            zza.zzt(zzc);
            zzv zzO = zza.zzO();
            this.zza = zzO;
            this.zzc.zzA(zzO);
        }
        int zzd = zzesVar.zzd();
        this.zzc.zzc(zzesVar, zzd);
        this.zzc.zze(zzb, 1, zzd, 0, null);
    }
}
