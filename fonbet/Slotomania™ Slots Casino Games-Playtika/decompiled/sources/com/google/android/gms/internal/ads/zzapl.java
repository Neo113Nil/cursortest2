package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzapl implements zzapm {
    private final List zza;
    private final zzahb[] zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private final String zzb = MimeTypes.VIDEO_MP2T;
    private long zzg = C.TIME_UNSET;

    public zzapl(List list, String str) {
        this.zza = list;
        this.zzc = new zzahb[list.size()];
    }

    private final boolean zzf(zzes zzesVar, int i) {
        if (zzesVar.zzd() == 0) {
            return false;
        }
        if (zzesVar.zzs() != i) {
            this.zzd = false;
        }
        this.zze--;
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        this.zzd = false;
        this.zzg = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        int i = 0;
        while (true) {
            zzahb[] zzahbVarArr = this.zzc;
            if (i >= zzahbVarArr.length) {
                return;
            }
            zzaqx zzaqxVar = (zzaqx) this.zza.get(i);
            zzaraVar.zza();
            zzahb zzu = zzafsVar.zzu(zzaraVar.zzb(), 3);
            zzt zztVar = new zzt();
            zztVar.zza(zzaraVar.zzc());
            zztVar.zzn(this.zzb);
            zztVar.zzo(MimeTypes.APPLICATION_DVBSUBS);
            zztVar.zzr(Collections.singletonList(zzaqxVar.zzb));
            zztVar.zze(zzaqxVar.zza);
            zzu.zzA(zztVar.zzO());
            zzahbVarArr[i] = zzu;
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zzg = j;
        this.zzf = 0;
        this.zze = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzd(zzes zzesVar) {
        if (this.zzd) {
            if (this.zze != 2 || zzf(zzesVar, 32)) {
                if (this.zze != 1 || zzf(zzesVar, 0)) {
                    int zzg = zzesVar.zzg();
                    int zzd = zzesVar.zzd();
                    for (zzahb zzahbVar : this.zzc) {
                        zzesVar.zzh(zzg);
                        zzahbVar.zzc(zzesVar, zzd);
                    }
                    this.zzf += zzd;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
        if (this.zzd) {
            zzgsw.zzi(this.zzg != C.TIME_UNSET);
            for (zzahb zzahbVar : this.zzc) {
                zzahbVar.zze(this.zzg, 1, this.zzf, 0, null);
            }
            this.zzd = false;
        }
    }
}
