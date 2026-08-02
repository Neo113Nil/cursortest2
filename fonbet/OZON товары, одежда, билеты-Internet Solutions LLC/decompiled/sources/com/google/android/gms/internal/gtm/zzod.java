package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzod implements zzjt {
    private final Context zza;

    public zzod(Context context) {
        this.zza = (Context) Preconditions.checkNotNull(context);
    }

    @Override // com.google.android.gms.internal.gtm.zzjt
    public final zzqw<?> zzd(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        zzqw<?> zzqwVar;
        Preconditions.checkArgument(zzqwVarArr != null);
        String str = null;
        if (zzqwVarArr.length > 0 && (zzqwVar = zzqwVarArr[0]) != zzra.zze) {
            str = zzju.zzd(zzri.zzc(zzibVar, zzqwVar));
        }
        String zzb = zzhk.zzb(this.zza, str);
        return zzb != null ? new zzrh(zzb) : zzra.zze;
    }
}
