package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzez {
    final /* synthetic */ zzfb zza;
    private final int zzb;
    private Object zzc;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;

    public zzez(zzfb zzfbVar, int i) {
        Objects.requireNonNull(zzfbVar);
        this.zza = zzfbVar;
        this.zzb = i;
    }

    public final void zza() {
        long zzt;
        zzfb zzfbVar = this.zza;
        zzbf zzq = zzfbVar.zzd().zzq();
        Object zzf = zzq.zzg() ? null : zzq.zzf(zzfbVar.zzd().zzr());
        zzbb zzd = zzfbVar.zzd();
        zzbb zzd2 = zzfbVar.zzd();
        zzbb zzd3 = zzfbVar.zzd();
        int zzy = zzd.zzy();
        int zzz = zzd2.zzz();
        long zzu = zzd3.zzu();
        if (zzf == null || zzy != -1) {
            zzt = zzy != -1 ? zzfbVar.zzd().zzt() : -9223372036854775807L;
        } else {
            zzq.zzo(zzf, zzfbVar.zzf());
            zzu -= zzfk.zzr(0L);
            zzt = zzfk.zzr(zzfbVar.zzf().zzd);
            zzy = -1;
        }
        boolean zza = zzfbVar.zzd().zza();
        if (!zza || zzt == C.TIME_UNSET || zzu < zzt) {
            zzfbVar.zzg().zzk(3);
            if (zza && zzt != C.TIME_UNSET) {
                zzfbVar.zzg().zzi(3, (int) Math.ceil((zzt - zzu) / zzfbVar.zzd().zzn().zzb));
            }
            this.zzf = false;
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzf && Objects.equals(zzf, this.zzc) && zzy == this.zzd && zzz == this.zze) {
            long j = elapsedRealtime - this.zzg;
            int i = this.zzb;
            if (j >= i) {
                zzfbVar.zze().zza(new zzfc(3, i));
                return;
            }
            return;
        }
        this.zzf = true;
        this.zzg = elapsedRealtime;
        this.zzc = zzf;
        this.zzd = zzy;
        this.zze = zzz;
        zzfbVar.zzg().zzk(3);
        zzfbVar.zzg().zzi(3, this.zzb);
    }
}
