package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzew {
    final /* synthetic */ zzfb zza;
    private final int zzb;
    private Object zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;

    public zzew(zzfb zzfbVar, int i) {
        Objects.requireNonNull(zzfbVar);
        this.zza = zzfbVar;
        this.zzb = i;
    }

    public final void zza() {
        zzfb zzfbVar = this.zza;
        if (zzfbVar.zzd().zzh() != 2 || !zzfbVar.zzd().zzk() || zzfbVar.zzd().zzi() != 0) {
            if (this.zzh) {
                zzfbVar.zzg().zzk(1);
            }
            this.zzh = false;
            return;
        }
        zzbf zzq = zzfbVar.zzd().zzq();
        Object zzf = zzq.zzg() ? null : zzq.zzf(zzfbVar.zzd().zzr());
        zzbb zzd = zzfbVar.zzd();
        zzbb zzd2 = zzfbVar.zzd();
        zzbb zzd3 = zzfbVar.zzd();
        zzbb zzd4 = zzfbVar.zzd();
        int zzy = zzd.zzy();
        int zzz = zzd2.zzz();
        long zzv = zzd3.zzv();
        long max = Math.max(0L, zzfbVar.zzd().zzw() - Math.max(0L, zzv - zzd4.zzu()));
        if (zzf != null && zzy == -1) {
            zzq.zzo(zzf, zzfbVar.zzf());
            zzv -= zzfk.zzr(0L);
            zzy = -1;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzh && Objects.equals(zzf, this.zzc) && zzy == this.zzd && zzz == this.zze && zzv == this.zzf && max == this.zzg) {
            long j = elapsedRealtime - this.zzi;
            int i = this.zzb;
            if (j >= i) {
                zzfbVar.zze().zza(new zzfc(1, i));
                return;
            }
            return;
        }
        this.zzh = true;
        this.zzi = elapsedRealtime;
        this.zzc = zzf;
        this.zzd = zzy;
        this.zze = zzz;
        this.zzf = zzv;
        this.zzg = max;
        zzfbVar.zzg().zzk(1);
        zzfbVar.zzg().zzi(1, this.zzb);
    }
}
