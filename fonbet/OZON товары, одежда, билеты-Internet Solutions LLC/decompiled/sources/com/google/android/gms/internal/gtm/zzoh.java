package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzoh extends zzjv {
    private final Context zza;
    private final zzhy zzb;

    public zzoh(Context context, zzhy zzhyVar) {
        this.zza = context;
        this.zzb = zzhyVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        int length = zzqwVarArr.length;
        Preconditions.checkArgument(length > 0);
        Object obj = this.zzb.zza().zzd().get(zzju.zzd(zzqwVarArr[0]));
        Object obj2 = obj;
        obj2 = obj;
        if (obj == null && length > 1) {
            obj2 = zzqwVarArr[1];
        }
        return zzri.zzb(obj2);
    }
}
