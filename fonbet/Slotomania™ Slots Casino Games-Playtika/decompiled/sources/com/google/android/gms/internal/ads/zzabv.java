package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzabv {
    public static final zzabp zza = new zzabp(2, C.TIME_UNSET, null);
    public static final zzabp zzb = new zzabp(3, C.TIME_UNSET, null);
    private final zzacb zzc = zzacb.zzb(zzfk.zzg("ExoPlayer:Loader:ProgressiveMediaPeriod"), zzabo.zza);
    private zzabq zzd;
    private IOException zze;

    public zzabv(String str) {
    }

    public static zzabp zza(boolean z, long j) {
        return new zzabp(z ? 1 : 0, j, null);
    }

    public final boolean zzb() {
        return this.zze != null;
    }

    public final void zzc() {
        this.zze = null;
    }

    public final long zzd(zzabr zzabrVar, zzabn zzabnVar, int i) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.zze = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzabq(this, myLooper, zzabrVar, zzabnVar, i, elapsedRealtime).zzb(0L);
        return elapsedRealtime;
    }

    public final boolean zze() {
        return this.zzd != null;
    }

    public final void zzg(zzabs zzabsVar) {
        zzabq zzabqVar = this.zzd;
        if (zzabqVar != null) {
            zzabqVar.zzc(true);
        }
        zzacb zzacbVar = this.zzc;
        zzacbVar.execute(new zzabt(zzabsVar));
        zzacbVar.zza();
    }

    public final void zzh(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null) {
            throw iOException;
        }
        zzabq zzabqVar = this.zzd;
        if (zzabqVar != null) {
            zzabqVar.zza(i);
        }
    }

    final /* synthetic */ zzacb zzi() {
        return this.zzc;
    }

    final /* synthetic */ zzabq zzj() {
        return this.zzd;
    }

    final /* synthetic */ void zzk(zzabq zzabqVar) {
        this.zzd = zzabqVar;
    }

    final /* synthetic */ void zzl(IOException iOException) {
        this.zze = iOException;
    }

    public final void zzf() {
        zzabq zzabqVar = this.zzd;
        zzabqVar.getClass();
        zzabqVar.zzc(false);
    }
}
