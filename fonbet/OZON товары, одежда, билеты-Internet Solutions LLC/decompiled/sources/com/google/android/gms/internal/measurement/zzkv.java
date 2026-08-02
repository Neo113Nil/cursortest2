package com.google.android.gms.internal.measurement;

/* loaded from: classes9.dex */
final class zzkv extends zzkx {
    /* synthetic */ zzkv(zzku zzkuVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkx
    final void zza(Object obj, long j11) {
        ((zzkj) zzmv.zzf(obj, j11)).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzkx
    final void zzb(Object obj, Object obj2, long j11) {
        zzkj zzkjVar = (zzkj) zzmv.zzf(obj, j11);
        zzkj zzkjVar2 = (zzkj) zzmv.zzf(obj2, j11);
        int size = zzkjVar.size();
        int size2 = zzkjVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzkjVar.zzc()) {
                zzkjVar = zzkjVar.zzd(size2 + size);
            }
            zzkjVar.addAll(zzkjVar2);
        }
        if (size > 0) {
            zzkjVar2 = zzkjVar;
        }
        zzmv.zzs(obj, j11, zzkjVar2);
    }

    private zzkv() {
        super(null);
    }
}
