package com.google.android.gms.internal.gtm;

import java.util.List;

/* loaded from: classes9.dex */
final class zzvw extends zzvy {
    /* synthetic */ zzvw(zzvv zzvvVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.gtm.zzvy
    final <L> List<L> zza(Object obj, long j11) {
        zzvh zzvhVar = (zzvh) zzxy.zzf(obj, j11);
        if (zzvhVar.zzc()) {
            return zzvhVar;
        }
        int size = zzvhVar.size();
        zzvh zzd = zzvhVar.zzd(size == 0 ? 10 : size + size);
        zzxy.zzs(obj, j11, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzvy
    final void zzb(Object obj, long j11) {
        ((zzvh) zzxy.zzf(obj, j11)).zzb();
    }

    @Override // com.google.android.gms.internal.gtm.zzvy
    final <E> void zzc(Object obj, Object obj2, long j11) {
        zzvh zzvhVar = (zzvh) zzxy.zzf(obj, j11);
        zzvh zzvhVar2 = (zzvh) zzxy.zzf(obj2, j11);
        int size = zzvhVar.size();
        int size2 = zzvhVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzvhVar.zzc()) {
                zzvhVar = zzvhVar.zzd(size2 + size);
            }
            zzvhVar.addAll(zzvhVar2);
        }
        if (size > 0) {
            zzvhVar2 = zzvhVar;
        }
        zzxy.zzs(obj, j11, zzvhVar2);
    }

    private zzvw() {
        super(null);
    }
}
