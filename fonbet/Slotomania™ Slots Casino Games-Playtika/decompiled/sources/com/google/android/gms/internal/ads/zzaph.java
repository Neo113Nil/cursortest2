package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzaph implements zzafp {
    private final zzapi zza;
    private final zzes zzb;
    private final zzes zzc;
    private final zzer zzd;
    private zzafs zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        int i = zzapg.zza;
    }

    public zzaph() {
        throw null;
    }

    public zzaph(int i) {
        this.zza = new zzapi(true, null, 0, MimeTypes.AUDIO_AAC);
        this.zzb = new zzes(2048);
        this.zzg = -1L;
        zzes zzesVar = new zzes(10);
        this.zzc = zzesVar;
        byte[] zzi = zzesVar.zzi();
        this.zzd = new zzer(zzi, zzi.length);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        zzes zzesVar;
        zzafg zzafgVar;
        int i = 0;
        while (true) {
            zzesVar = this.zzc;
            zzafgVar = (zzafg) zzafqVar;
            zzafgVar.zzh(zzesVar.zzi(), 0, 10, false);
            zzesVar.zzh(0);
            if (zzesVar.zzx() != 4801587) {
                break;
            }
            zzesVar.zzk(3);
            int zzG = zzesVar.zzG();
            i += zzG + 10;
            zzafgVar.zzj(zzG, false);
        }
        zzafqVar.zzl();
        zzafgVar.zzj(i, false);
        if (this.zzg == -1) {
            this.zzg = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            zzafgVar.zzh(zzesVar.zzi(), 0, 2, false);
            zzesVar.zzh(0);
            if (zzapi.zzf(zzesVar.zzt())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                zzafgVar.zzh(zzesVar.zzi(), 0, 4, false);
                zzer zzerVar = this.zzd;
                zzerVar.zzf(14);
                int zzj = zzerVar.zzj(13);
                if (zzj <= 6) {
                    i4++;
                    zzafqVar.zzl();
                    zzafgVar.zzj(i4, false);
                } else {
                    zzafgVar.zzj(zzj - 6, false);
                    i3 += zzj;
                }
            } else {
                i4++;
                zzafqVar.zzl();
                zzafgVar.zzj(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        this.zze = zzafsVar;
        this.zza.zzb(zzafsVar, new zzara(Integer.MIN_VALUE, 0, 1));
        zzafsVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        this.zze.getClass();
        zzes zzesVar = this.zzb;
        int zza = zzafqVar.zza(zzesVar.zzi(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzw(new zzagr(C.TIME_UNSET, 0L));
            this.zzi = true;
        }
        if (zza == -1) {
            return -1;
        }
        zzesVar.zzh(0);
        zzesVar.zzf(zza);
        if (!this.zzh) {
            this.zza.zzc(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zzd(zzesVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        this.zzh = false;
        this.zza.zza();
        this.zzf = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }
}
