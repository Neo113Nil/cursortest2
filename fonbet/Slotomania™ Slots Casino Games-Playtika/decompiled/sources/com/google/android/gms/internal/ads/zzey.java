package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzey {
    final /* synthetic */ zzfb zza;
    private final int zzb;
    private Object zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private boolean zzg;
    private long zzh;

    public zzey(zzfb zzfbVar, int i) {
        Objects.requireNonNull(zzfbVar);
        this.zza = zzfbVar;
        this.zzb = i;
    }

    public final void zza() {
        zzfb zzfbVar = this.zza;
        if (!zzfbVar.zzd().zza()) {
            if (this.zzg) {
                zzfbVar.zzg().zzk(2);
            }
            this.zzg = false;
            return;
        }
        zzbf zzq = zzfbVar.zzd().zzq();
        Object zzf = zzq.zzg() ? null : zzq.zzf(zzfbVar.zzd().zzr());
        zzbb zzd = zzfbVar.zzd();
        zzbb zzd2 = zzfbVar.zzd();
        zzbb zzd3 = zzfbVar.zzd();
        int zzy = zzd.zzy();
        int zzz = zzd2.zzz();
        long zzu = zzd3.zzu();
        if (zzf != null && zzy == -1) {
            zzq.zzo(zzf, zzfbVar.zzf());
            zzu -= zzfk.zzr(0L);
            zzy = -1;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzg && Objects.equals(zzf, this.zzc) && zzy == this.zzd && zzz == this.zze && zzu == this.zzf) {
            long j = elapsedRealtime - this.zzh;
            int i = this.zzb;
            if (j >= i) {
                zzfbVar.zze().zza(new zzfc(2, i));
                return;
            }
            return;
        }
        this.zzg = true;
        this.zzh = elapsedRealtime;
        this.zzc = zzf;
        this.zzd = zzy;
        this.zze = zzz;
        this.zzf = zzu;
        zzfbVar.zzg().zzk(2);
        zzfbVar.zzg().zzi(2, this.zzb);
    }
}
