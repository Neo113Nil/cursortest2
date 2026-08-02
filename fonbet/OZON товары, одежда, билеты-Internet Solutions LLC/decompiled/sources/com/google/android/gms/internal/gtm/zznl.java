package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zznl extends zzjv {
    private final Context zza;
    private final zzhy zzb;

    public zznl(Context context, zzhy zzhyVar) {
        this.zza = (Context) Preconditions.checkNotNull(context);
        this.zzb = zzhyVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        zzqw<?> zzqwVar;
        Preconditions.checkArgument(true);
        int length = zzqwVarArr.length;
        if (length != 0) {
            zzqw<?> zzqwVar2 = zzqwVarArr[0];
            zzra zzraVar = zzra.zze;
            if (zzqwVar2 != zzraVar) {
                Object obj = this.zzb.zza().zzd().get("_ldl");
                if (obj == null) {
                    return new zzrh("");
                }
                zzqw<?> zzb = zzri.zzb(obj);
                if (!(zzb instanceof zzrh)) {
                    return new zzrh("");
                }
                String zzk = ((zzrh) zzb).zzk();
                if (!zzhk.zza(zzk, "conv").equals(zzju.zzd(zzqwVarArr[0]))) {
                    return new zzrh("");
                }
                String str = null;
                if (length > 1 && (zzqwVar = zzqwVarArr[1]) != zzraVar) {
                    str = zzju.zzd(zzqwVar);
                }
                String zza = zzhk.zza(zzk, str);
                return zza != null ? new zzrh(zza) : new zzrh("");
            }
        }
        return new zzrh("");
    }
}
