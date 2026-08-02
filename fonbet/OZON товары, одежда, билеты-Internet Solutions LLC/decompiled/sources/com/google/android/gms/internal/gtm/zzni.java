package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzni extends zzjv {
    private final zzhy zza;

    public zzni(Context context, zzhy zzhyVar) {
        this.zza = zzhyVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqwVarArr.length == 0);
        this.zza.zza().zze(false);
        return zzra.zze;
    }
}
