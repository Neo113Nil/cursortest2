package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zznj implements zzjt {
    private final zzge zza;

    public zznj(Context context) {
        this.zza = zzge.zzb(context);
    }

    @Override // com.google.android.gms.internal.gtm.zzjt
    public final zzqw<?> zzd(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(zzqwVarArr != null);
        Preconditions.checkArgument(zzqwVarArr.length == 0);
        String zzc = this.zza.zzc();
        return zzc == null ? zzra.zze : new zzrh(zzc);
    }
}
