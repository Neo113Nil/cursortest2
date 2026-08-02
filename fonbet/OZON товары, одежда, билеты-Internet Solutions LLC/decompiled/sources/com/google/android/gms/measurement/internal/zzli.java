package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
final class zzli {
    com.google.android.gms.internal.measurement.zzgc zza;
    List zzb;
    List zzc;
    long zzd;
    final /* synthetic */ zzll zze;

    /* synthetic */ zzli(zzll zzllVar, zzlh zzlhVar) {
        this.zze = zzllVar;
    }

    private static final long zzb(com.google.android.gms.internal.measurement.zzfs zzfsVar) {
        return ((zzfsVar.zzd() / 1000) / 60) / 60;
    }

    public final boolean zza(long j11, com.google.android.gms.internal.measurement.zzfs zzfsVar) {
        Preconditions.checkNotNull(zzfsVar);
        if (this.zzc == null) {
            this.zzc = new ArrayList();
        }
        if (this.zzb == null) {
            this.zzb = new ArrayList();
        }
        if (!this.zzc.isEmpty() && zzb((com.google.android.gms.internal.measurement.zzfs) this.zzc.get(0)) != zzb(zzfsVar)) {
            return false;
        }
        long zzbz = this.zzd + zzfsVar.zzbz();
        this.zze.zzg();
        if (zzbz >= Math.max(0, ((Integer) zzen.zzh.zza(null)).intValue())) {
            return false;
        }
        this.zzd = zzbz;
        this.zzc.add(zzfsVar);
        this.zzb.add(Long.valueOf(j11));
        int size = this.zzc.size();
        this.zze.zzg();
        return size < Math.max(1, ((Integer) zzen.zzi.zza(null)).intValue());
    }
}
