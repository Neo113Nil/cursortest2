package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Comparator;

/* loaded from: classes9.dex */
final class zzkm implements Comparator<zzqw<?>> {
    final /* synthetic */ zzqz zza;
    final /* synthetic */ zzib zzb;

    zzkm(zzkp zzkpVar, zzqz zzqzVar, zzib zzibVar) {
        this.zza = zzqzVar;
        this.zzb = zzibVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzqw<?> zzqwVar, zzqw<?> zzqwVar2) {
        zzqw<?> zzqwVar3 = zzqwVar;
        zzqw<?> zzqwVar4 = zzqwVar2;
        if (zzqwVar3 == null) {
            return zzqwVar4 != null ? 1 : 0;
        }
        if (zzqwVar4 == null) {
            return -1;
        }
        zzqw<?> zzd = this.zza.zzi().zzd(this.zzb, zzqwVar3, zzqwVar4);
        Preconditions.checkState(zzd instanceof zzqy);
        return (int) ((zzqy) zzd).zzi().doubleValue();
    }
}
