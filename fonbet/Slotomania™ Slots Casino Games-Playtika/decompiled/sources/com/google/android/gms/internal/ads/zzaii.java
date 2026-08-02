package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.util.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
final class zzaii extends zzaih {
    private final zzes zzb;
    private final zzes zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzaii(zzahb zzahbVar) {
        super(zzahbVar);
        this.zzb = new zzes(zzgo.zza);
        this.zzc = new zzes(4);
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    protected final boolean zza(zzes zzesVar) throws zzaig {
        int zzs = zzesVar.zzs();
        int i = zzs >> 4;
        int i2 = zzs & 15;
        if (i2 == 7) {
            this.zzg = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 28);
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new zzaig(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    protected final boolean zzb(zzes zzesVar, long j) throws zzat {
        int i;
        int zzs = zzesVar.zzs();
        long zzy = zzesVar.zzy();
        if (zzs == 0) {
            if (!this.zze) {
                zzes zzesVar2 = new zzes(new byte[zzesVar.zzd()]);
                zzesVar.zzm(zzesVar2.zzi(), 0, zzesVar.zzd());
                zzaeu zza = zzaeu.zza(zzesVar2);
                this.zzd = zza.zzb;
                zzt zztVar = new zzt();
                zztVar.zzn(MimeTypes.VIDEO_FLV);
                zztVar.zzo("video/avc");
                zztVar.zzk(zza.zzl);
                zztVar.zzv(zza.zzc);
                zztVar.zzw(zza.zzd);
                zztVar.zzB(zza.zzk);
                zztVar.zzr(zza.zza);
                this.zza.zzA(zztVar.zzO());
                this.zze = true;
                return false;
            }
        } else if (zzs == 1 && this.zze) {
            int i2 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i = i2;
            } else if (i2 != 0) {
                i = 1;
            }
            zzes zzesVar3 = this.zzc;
            byte[] zzi = zzesVar3.zzi();
            zzi[0] = 0;
            zzi[1] = 0;
            zzi[2] = 0;
            int i3 = 4 - this.zzd;
            int i4 = 0;
            while (zzesVar.zzd() > 0) {
                zzesVar.zzm(zzesVar3.zzi(), i3, this.zzd);
                zzesVar3.zzh(0);
                zzes zzesVar4 = this.zzb;
                int zzH = zzesVar3.zzH();
                zzesVar4.zzh(0);
                zzahb zzahbVar = this.zza;
                zzahbVar.zzc(zzesVar4, 4);
                zzahbVar.zzc(zzesVar, zzH);
                i4 = i4 + 4 + zzH;
            }
            this.zza.zze(j + (zzy * 1000), i, i4, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
