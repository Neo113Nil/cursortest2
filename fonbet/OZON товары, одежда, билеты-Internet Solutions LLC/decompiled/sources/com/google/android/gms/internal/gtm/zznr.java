package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zznr implements zzjt {
    private final zzqw<?> zza;

    public zznr(zzqw<?> zzqwVar) {
        this.zza = (zzqw) Preconditions.checkNotNull(zzqwVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzjt
    public final zzqw<?> zzd(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(zzqwVarArr != null);
        Preconditions.checkArgument(zzqwVarArr.length == 0);
        return this.zza;
    }
}
