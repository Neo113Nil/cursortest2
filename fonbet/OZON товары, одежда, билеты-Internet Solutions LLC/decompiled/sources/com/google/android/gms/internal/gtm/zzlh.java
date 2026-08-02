package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzlh extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqwVarArr.length == 1);
        Preconditions.checkArgument(!(zzqwVarArr[0] instanceof zzrf));
        Preconditions.checkArgument(true ^ zzri.zzi(zzqwVarArr[0]));
        zzqw<?> zzqwVar = zzqwVarArr[0];
        return new zzrh(zzqwVar == zzra.zze ? "undefined" : zzqwVar instanceof zzqx ? "boolean" : zzqwVar instanceof zzqy ? "number" : zzqwVar instanceof zzrh ? "string" : zzqwVar instanceof zzqz ? "function" : "object");
    }
}
