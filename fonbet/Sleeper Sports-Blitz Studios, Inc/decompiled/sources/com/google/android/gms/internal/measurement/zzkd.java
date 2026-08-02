package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.1 */
/* loaded from: classes7.dex */
final class zzkd implements zzka {
    private static <E> zzjq<E> zzc(Object obj, long j) {
        return (zzjq) zzmh.zze(obj, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final <L> List<L> zza(Object obj, long j) {
        zzjq zzc = zzc(obj, j);
        if (zzc.zzc()) {
            return zzc;
        }
        int size = zzc.size();
        zzjq zza = zzc.zza(size == 0 ? 10 : size << 1);
        zzmh.zza(obj, j, zza);
        return zza;
    }

    zzkd() {
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final void zzb(Object obj, long j) {
        zzc(obj, j).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzjq zzc = zzc(obj, j);
        zzjq zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzc.zzc()) {
                zzc = zzc.zza(size2 + size);
            }
            zzc.addAll(zzc2);
        }
        if (size > 0) {
            zzc2 = zzc;
        }
        zzmh.zza(obj, j, zzc2);
    }
}
