package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
final class zzanr {
    private final zzes zza = new zzes();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    public final zzcx zza() {
        int i;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzes zzesVar = this.zza;
        if (zzesVar.zze() == 0 || zzesVar.zzg() != zzesVar.zze() || !this.zzc) {
            return null;
        }
        zzesVar.zzh(0);
        int i2 = this.zzh * this.zzi;
        int[] iArr = new int[i2];
        int i3 = 0;
        while (i3 < i2) {
            int zzs = zzesVar.zzs();
            if (zzs != 0) {
                i = i3 + 1;
                iArr[i3] = this.zzb[zzs];
            } else {
                int zzs2 = zzesVar.zzs();
                if (zzs2 != 0) {
                    int i4 = zzs2 & 63;
                    if ((zzs2 & 64) != 0) {
                        i4 = (i4 << 8) | zzesVar.zzs();
                    }
                    i = i4 + i3;
                    Arrays.fill(iArr, i3, i, (zzs2 & 128) == 0 ? this.zzb[0] : this.zzb[zzesVar.zzs()]);
                }
            }
            i3 = i;
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzcw zzcwVar = new zzcw();
        zzcwVar.zzc(createBitmap);
        zzcwVar.zzi(this.zzf / this.zzd);
        zzcwVar.zzj(0);
        zzcwVar.zzf(this.zzg / this.zze, 0);
        zzcwVar.zzg(0);
        zzcwVar.zzm(this.zzh / this.zzd);
        zzcwVar.zzn(this.zzi / this.zze);
        return zzcwVar.zzr();
    }

    public final void zzb() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zza(0);
        this.zzc = false;
    }

    final /* synthetic */ void zzc(zzes zzesVar, int i) {
        if (i % 5 != 2) {
            return;
        }
        zzesVar.zzk(2);
        int[] iArr = this.zzb;
        Arrays.fill(iArr, 0);
        int i2 = 0;
        for (int i3 = i / 5; i2 < i3; i3 = i3) {
            int zzs = zzesVar.zzs();
            int zzs2 = zzesVar.zzs();
            int zzs3 = zzesVar.zzs();
            int zzs4 = zzesVar.zzs();
            double d = zzs2;
            int zzs5 = zzesVar.zzs() << 24;
            String str = zzfk.zza;
            double d2 = zzs3 - 128;
            double d3 = zzs4 - 128;
            iArr[zzs] = (Math.max(0, Math.min((int) (d + (1.402d * d2)), 255)) << 16) | zzs5 | (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8) | Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255));
            i2++;
        }
        this.zzc = true;
    }

    final /* synthetic */ void zzd(zzes zzesVar, int i) {
        int zzx;
        if (i < 4) {
            return;
        }
        zzesVar.zzk(3);
        int i2 = i - 4;
        if ((zzesVar.zzs() & 128) != 0) {
            if (i2 < 7 || (zzx = zzesVar.zzx()) < 4) {
                return;
            }
            this.zzh = zzesVar.zzt();
            this.zzi = zzesVar.zzt();
            this.zza.zza(zzx - 4);
            i2 = i - 11;
        }
        zzes zzesVar2 = this.zza;
        int zzg = zzesVar2.zzg();
        int zze = zzesVar2.zze();
        if (zzg >= zze || i2 <= 0) {
            return;
        }
        int min = Math.min(i2, zze - zzg);
        zzesVar.zzm(zzesVar2.zzi(), zzg, min);
        zzesVar2.zzh(zzg + min);
    }

    final /* synthetic */ void zze(zzes zzesVar, int i) {
        if (i < 19) {
            return;
        }
        this.zzd = zzesVar.zzt();
        this.zze = zzesVar.zzt();
        zzesVar.zzk(11);
        this.zzf = zzesVar.zzt();
        this.zzg = zzesVar.zzt();
    }
}
