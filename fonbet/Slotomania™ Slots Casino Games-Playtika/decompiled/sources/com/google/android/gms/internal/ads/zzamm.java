package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
final class zzamm {
    private final zzamn zza = new zzamn();
    private final zzes zzb = new zzes(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    zzamm() {
    }

    private final int zzf(int i) {
        int i2;
        int i3 = 0;
        this.zzd = 0;
        do {
            int i4 = this.zzd;
            int i5 = i + i4;
            zzamn zzamnVar = this.zza;
            if (i5 >= zzamnVar.zzc) {
                break;
            }
            this.zzd = i4 + 1;
            i2 = zzamnVar.zzf[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final void zza() {
        this.zza.zza();
        this.zzb.zza(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final zzamn zzc() {
        return this.zza;
    }

    public final zzes zzd() {
        return this.zzb;
    }

    public final void zze() {
        zzes zzesVar = this.zzb;
        if (zzesVar.zzi().length == 65025) {
            return;
        }
        zzesVar.zzb(Arrays.copyOf(zzesVar.zzi(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, zzesVar.zze())), zzesVar.zze());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(zzafq zzafqVar) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zza(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i = this.zzc;
            if (i < 0) {
                zzamn zzamnVar = this.zza;
                if (!zzamnVar.zzb(zzafqVar, -1L) || !zzamnVar.zzc(zzafqVar, true)) {
                    break;
                }
                int i2 = zzamnVar.zzd;
                if ((zzamnVar.zza & 1) == 1 && this.zzb.zze() == 0) {
                    i2 += zzf(0);
                    i = this.zzd;
                } else {
                    i = 0;
                }
                if (!zzaft.zzd(zzafqVar, i2)) {
                    return false;
                }
                this.zzc = i;
            }
            int zzf = zzf(i);
            int i3 = this.zzc + this.zzd;
            if (zzf > 0) {
                zzes zzesVar = this.zzb;
                zzesVar.zzc(zzesVar.zze() + zzf);
                if (!zzaft.zzc(zzafqVar, zzesVar.zzi(), zzesVar.zze(), zzf)) {
                    return false;
                }
                zzesVar.zzf(zzesVar.zze() + zzf);
                this.zze = this.zza.zzf[i3 + (-1)] != 255;
            }
            if (i3 == this.zza.zzc) {
                i3 = -1;
            }
            this.zzc = i3;
        }
    }
}
