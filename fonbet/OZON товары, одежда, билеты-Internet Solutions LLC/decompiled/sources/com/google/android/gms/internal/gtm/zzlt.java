package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzlt extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        zzqw<?> zzi;
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqwVarArr.length == 2);
        zzqw<?> zzqwVar = zzqwVarArr[0];
        zzqw<?> zzqwVar2 = zzqwVarArr[1];
        boolean z11 = zzqwVar instanceof zzrh;
        Preconditions.checkArgument(z11 || !zzri.zzj(zzqwVar));
        Preconditions.checkArgument(!zzri.zzi(zzqwVar));
        Preconditions.checkArgument(true ^ zzri.zzi(zzqwVar2));
        String zzd = zzju.zzd(zzqwVar2);
        if (zzqwVar instanceof zzrd) {
            zzrd zzrdVar = (zzrd) zzqwVar;
            if ("length".equals(zzd)) {
                return new zzqy(Double.valueOf(zzrdVar.zzk().size()));
            }
            double zzb = zzju.zzb(zzqwVar2);
            if (zzb == Math.floor(zzb)) {
                int i11 = (int) zzb;
                if (zzd.equals(Integer.toString(i11)) && (zzi = zzrdVar.zzi(i11)) != zzra.zze) {
                    return zzi;
                }
            }
        } else if (z11) {
            zzrh zzrhVar = (zzrh) zzqwVar;
            if ("length".equals(zzd)) {
                return new zzqy(Double.valueOf(zzrhVar.zzk().length()));
            }
            double zzb2 = zzju.zzb(zzqwVar2);
            if (zzb2 == Math.floor(zzb2)) {
                int i12 = (int) zzb2;
                if (zzd.equals(Integer.toString(i12))) {
                    return zzrhVar.zzi(i12);
                }
            }
            return zzra.zze;
        }
        return zzqwVar.zzb(zzd);
    }
}
