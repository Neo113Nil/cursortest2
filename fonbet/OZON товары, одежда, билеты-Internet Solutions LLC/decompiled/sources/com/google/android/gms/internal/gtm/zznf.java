package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class zznf extends zzjv {
    private final zzne zza;

    public zznf(zzne zzneVar) {
        this.zza = zzneVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        zzqw<?> zzqwVar;
        Preconditions.checkNotNull(zzqwVarArr);
        int length = zzqwVarArr.length;
        Preconditions.checkArgument(length > 0);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrh);
        String zzk = ((zzrh) zzqwVarArr[0]).zzk();
        HashMap hashMap = new HashMap();
        if (length >= 2 && (zzqwVar = zzqwVarArr[1]) != zzra.zze) {
            Preconditions.checkArgument(zzqwVar instanceof zzre);
            for (Map.Entry<String, zzqw<?>> entry : ((zzre) zzqwVarArr[1]).zzi().entrySet()) {
                Preconditions.checkState(!(entry.getValue() instanceof zzrf));
                Preconditions.checkState(!zzri.zzi(entry.getValue()));
                hashMap.put(entry.getKey(), entry.getValue().zzc());
            }
        }
        return zzri.zzb(this.zza.zza(zzk, hashMap));
    }
}
