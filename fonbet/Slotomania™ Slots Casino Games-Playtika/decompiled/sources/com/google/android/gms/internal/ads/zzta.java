package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzta implements zzqn {
    final /* synthetic */ zztj zza;
    private final zzqy zzb;

    /* synthetic */ zzta(zztj zztjVar, zzqy zzqyVar, byte[] bArr) {
        Objects.requireNonNull(zztjVar);
        this.zza = zztjVar;
        this.zzb = zzqyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zza(long j) {
        zztj zztjVar = this.zza;
        if (equals(zztjVar.zzJ()) && zztjVar.zzK() != null) {
            zztp zztpVar = ((zzto) zztjVar.zzK()).zza;
            zztpVar.zzaC(true);
            zztpVar.zzaz().zzd(j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        r0 = ((com.google.android.gms.internal.ads.zzto) r0.zzK()).zza.zzbc();
     */
    @Override // com.google.android.gms.internal.ads.zzqn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb() {
        zzmt zzbc;
        zztj zztjVar = this.zza;
        if (equals(zztjVar.zzJ()) && zztjVar.zzK() != null && zztjVar.zzO() && zzbc != null) {
            zzbc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzc() {
        zztj zztjVar = this.zza;
        if (equals(zztjVar.zzJ())) {
            zztjVar.zzN(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzd() {
        long j;
        zztj zztjVar = this.zza;
        if (equals(zztjVar.zzJ()) && zztjVar.zzK() != null) {
            if (zztjVar.zzL().zzi() != -1) {
                long zzi = zztjVar.zzL().zzj().zze / zztjVar.zzL().zzi();
                zzqp zzM = zztjVar.zzM();
                zzM.getClass();
                j = zzfk.zzt(zzi, zzM.zzi());
            } else {
                j = C.TIME_UNSET;
            }
            ((zzto) zztjVar.zzK()).zza.zzaz().zze(zztjVar.zzL().zzj().zze, zzfk.zzr(j), SystemClock.elapsedRealtime() - zztjVar.zzP());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zze() {
        AtomicInteger atomicInteger;
        atomicInteger = zztj.zza;
        atomicInteger.getAndDecrement();
        zztj zztjVar = this.zza;
        if (zztjVar.zzK() != null) {
            zzqy zzqyVar = this.zzb;
            ((zzto) zztjVar.zzK()).zza.zzaz().zzl(new zzrq(zzqyVar.zza, zzqyVar.zzb, zzqyVar.zzc, false, false, zzqyVar.zze));
        }
    }
}
