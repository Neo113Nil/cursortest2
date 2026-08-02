package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzape implements zzafp {
    private final zzapf zza = new zzapf(null, 0, MimeTypes.AUDIO_AC4);
    private final zzes zzb = new zzes(16384);
    private boolean zzc;

    static {
        int i = zzapd.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        zzafg zzafgVar;
        int i;
        zzes zzesVar = new zzes(10);
        int i2 = 0;
        while (true) {
            zzafgVar = (zzafg) zzafqVar;
            zzafgVar.zzh(zzesVar.zzi(), 0, 10, false);
            zzesVar.zzh(0);
            if (zzesVar.zzx() != 4801587) {
                break;
            }
            zzesVar.zzk(3);
            int zzG = zzesVar.zzG();
            i2 += zzG + 10;
            zzafgVar.zzj(zzG, false);
        }
        zzafqVar.zzl();
        zzafgVar.zzj(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            zzafgVar.zzh(zzesVar.zzi(), 0, 7, false);
            zzesVar.zzh(0);
            int zzt = zzesVar.zzt();
            if (zzt == 44096 || zzt == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] zzi = zzesVar.zzi();
                int i6 = zzaet.zza;
                if (zzi.length < 7) {
                    i = -1;
                } else {
                    int i7 = ((zzi[2] & 255) << 8) | (zzi[3] & 255);
                    if (i7 == 65535) {
                        i7 = ((zzi[4] & 255) << 16) | ((zzi[5] & 255) << 8) | (zzi[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (zzt == 44097) {
                        i5 += 2;
                    }
                    i = i7 + i5;
                }
                if (i == -1) {
                    return false;
                }
                zzafgVar.zzj(i - 7, false);
            } else {
                zzafqVar.zzl();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                zzafgVar.zzj(i4, false);
                i3 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        this.zza.zzb(zzafsVar, new zzara(Integer.MIN_VALUE, 0, 1));
        zzafsVar.zzv();
        zzafsVar.zzw(new zzagr(C.TIME_UNSET, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        zzes zzesVar = this.zzb;
        int zza = zzafqVar.zza(zzesVar.zzi(), 0, 16384);
        if (zza == -1) {
            return -1;
        }
        zzesVar.zzh(0);
        zzesVar.zzf(zza);
        if (!this.zzc) {
            this.zza.zzc(0L, 4);
            this.zzc = true;
        }
        this.zza.zzd(zzesVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        this.zzc = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }
}
