package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
final class zzaic extends zzaih {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzaic(zzahb zzahbVar) {
        super(zzahbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    protected final boolean zza(zzes zzesVar) throws zzaig {
        if (this.zzc) {
            zzesVar.zzk(1);
        } else {
            int zzs = zzesVar.zzs();
            int i = zzs >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(zzs >> 2) & 3];
                zzt zztVar = new zzt();
                zztVar.zzn(MimeTypes.VIDEO_FLV);
                zztVar.zzo(MimeTypes.AUDIO_MPEG);
                zztVar.zzG(1);
                zztVar.zzH(i2);
                this.zza.zzA(zztVar.zzO());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                zzt zztVar2 = new zzt();
                zztVar2.zzn(MimeTypes.VIDEO_FLV);
                zztVar2.zzo(i == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW);
                zztVar2.zzG(1);
                zztVar2.zzH(8000);
                this.zza.zzA(zztVar2.zzO());
                this.zzd = true;
            } else if (i != 10) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 28);
                sb.append("Audio format not supported: ");
                sb.append(i);
                throw new zzaig(sb.toString());
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    protected final boolean zzb(zzes zzesVar, long j) throws zzat {
        if (this.zze == 2) {
            int zzd = zzesVar.zzd();
            zzahb zzahbVar = this.zza;
            zzahbVar.zzc(zzesVar, zzd);
            zzahbVar.zze(j, 1, zzd, 0, null);
            return true;
        }
        int zzs = zzesVar.zzs();
        if (zzs != 0 || this.zzd) {
            if (this.zze == 10 && zzs != 1) {
                return false;
            }
            int zzd2 = zzesVar.zzd();
            zzahb zzahbVar2 = this.zza;
            zzahbVar2.zzc(zzesVar, zzd2);
            zzahbVar2.zze(j, 1, zzd2, 0, null);
            return true;
        }
        int zzd3 = zzesVar.zzd();
        byte[] bArr = new byte[zzd3];
        zzesVar.zzm(bArr, 0, zzd3);
        zzaen zza = zzaeo.zza(bArr);
        zzt zztVar = new zzt();
        zztVar.zzn(MimeTypes.VIDEO_FLV);
        zztVar.zzo(MimeTypes.AUDIO_AAC);
        zztVar.zzk(zza.zzc);
        zztVar.zzG(zza.zzb);
        zztVar.zzH(zza.zza);
        zztVar.zzr(Collections.singletonList(bArr));
        this.zza.zzA(zztVar.zzO());
        this.zzd = true;
        return false;
    }
}
