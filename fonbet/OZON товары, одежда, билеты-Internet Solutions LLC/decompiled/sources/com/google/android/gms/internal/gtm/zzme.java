package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzme extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqwVarArr.length == 2);
        zzqw<?> zzqwVar = zzqwVarArr[0];
        zzqw<?> zzqwVar2 = zzqwVarArr[1];
        if (((zzqwVar instanceof zzra) && zzqwVar != zzra.zze && zzqwVar != zzra.zzd) || ((zzqwVar2 instanceof zzra) && zzqwVar2 != zzra.zze && zzqwVar2 != zzra.zzd)) {
            throw new IllegalArgumentException("Illegal InternalType passed to Add.");
        }
        if ((zzqwVar instanceof zzre) || (zzqwVar instanceof zzrd) || (zzqwVar instanceof zzqz)) {
            zzqwVar = new zzrh(zzju.zzd(zzqwVar));
        }
        if ((zzqwVar2 instanceof zzre) || (zzqwVar2 instanceof zzrd) || (zzqwVar2 instanceof zzqz)) {
            zzqwVar2 = new zzrh(zzju.zzd(zzqwVar2));
        }
        if (!(zzqwVar instanceof zzrh) && !(zzqwVar2 instanceof zzrh)) {
            return new zzqy(Double.valueOf(zzju.zzc(zzqwVar, zzqwVar2)));
        }
        String valueOf = String.valueOf(zzju.zzd(zzqwVar));
        String valueOf2 = String.valueOf(zzju.zzd(zzqwVar2));
        return new zzrh(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }
}
