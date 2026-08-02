package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzkv extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        boolean z11 = false;
        Preconditions.checkArgument(zzqwVarArr.length == 2);
        zzqw<?> zzqwVar = zzqwVarArr[0];
        zzqw<?> zzqwVar2 = zzqwVarArr[1];
        if ((zzqwVar instanceof zzre) || (zzqwVar instanceof zzrd) || (zzqwVar instanceof zzqz)) {
            zzqwVar = new zzrh(zzju.zzd(zzqwVar));
        }
        if ((zzqwVar2 instanceof zzre) || (zzqwVar2 instanceof zzrd) || (zzqwVar2 instanceof zzqz)) {
            zzqwVar2 = new zzrh(zzju.zzd(zzqwVar2));
        }
        if (((zzqwVar instanceof zzrh) && (zzqwVar2 instanceof zzrh)) || (!Double.isNaN(zzju.zzb(zzqwVar)) && !Double.isNaN(zzju.zzb(zzqwVar2)))) {
            z11 = !zzju.zzf(zzqwVar, zzqwVar2);
        }
        return new zzqx(Boolean.valueOf(z11));
    }
}
