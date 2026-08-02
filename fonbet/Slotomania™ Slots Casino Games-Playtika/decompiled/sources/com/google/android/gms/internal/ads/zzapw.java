package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzapw implements zzapm {
    private zzahb zzc;
    private boolean zzd;
    private int zzf;
    private int zzg;
    private final String zza = MimeTypes.VIDEO_MP2T;
    private final zzes zzb = new zzes(10);
    private long zze = C.TIME_UNSET;

    public zzapw(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        this.zzd = false;
        this.zze = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        zzaraVar.zza();
        zzahb zzu = zzafsVar.zzu(zzaraVar.zzb(), 5);
        this.zzc = zzu;
        zzt zztVar = new zzt();
        zztVar.zza(zzaraVar.zzc());
        zztVar.zzn(this.zza);
        zztVar.zzo(MimeTypes.APPLICATION_ID3);
        zzu.zzA(zztVar.zzO());
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zze = j;
        this.zzf = 0;
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzd(zzes zzesVar) {
        this.zzc.getClass();
        if (this.zzd) {
            int zzd = zzesVar.zzd();
            int i = this.zzg;
            if (i < 10) {
                int min = Math.min(zzd, 10 - i);
                byte[] zzi = zzesVar.zzi();
                int zzg = zzesVar.zzg();
                zzes zzesVar2 = this.zzb;
                System.arraycopy(zzi, zzg, zzesVar2.zzi(), this.zzg, min);
                if (this.zzg + min == 10) {
                    zzesVar2.zzh(0);
                    if (zzesVar2.zzs() != 73 || zzesVar2.zzs() != 68 || zzesVar2.zzs() != 51) {
                        zzef.zzc("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzd = false;
                        return;
                    } else {
                        zzesVar2.zzk(3);
                        this.zzf = zzesVar2.zzG() + 10;
                    }
                }
            }
            int min2 = Math.min(zzd, this.zzf - this.zzg);
            this.zzc.zzc(zzesVar, min2);
            this.zzg += min2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
        int i;
        this.zzc.getClass();
        if (this.zzd && (i = this.zzf) != 0 && this.zzg == i) {
            zzgsw.zzi(this.zze != C.TIME_UNSET);
            this.zzc.zze(this.zze, 1, this.zzf, 0, null);
            this.zzd = false;
        }
    }
}
