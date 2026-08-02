package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzlu extends zzjv {
    public static final zzlu zza = new zzlu();

    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqwVarArr.length == 2);
        zzqw<?> zzqwVar = zzqwVarArr[0];
        zzqw<?> zzqwVar2 = zzqwVarArr[1];
        Preconditions.checkArgument(!zzri.zzi(zzqwVar));
        Preconditions.checkArgument(true ^ zzri.zzi(zzqwVar2));
        String zzd = zzju.zzd(zzqwVar2);
        if (zzqwVar instanceof zzrd) {
            if ("length".equals(zzd)) {
                return new zzqx(Boolean.TRUE);
            }
            double zzb = zzju.zzb(zzqwVar2);
            if (zzb == Math.floor(zzb)) {
                int i11 = (int) zzb;
                if (zzd.equals(Integer.toString(i11)) && i11 >= 0 && i11 < ((zzrd) zzqwVar).zzk().size()) {
                    return new zzqx(Boolean.TRUE);
                }
            }
        } else if (zzqwVar instanceof zzrh) {
            if ("length".equals(zzd)) {
                return new zzqx(Boolean.TRUE);
            }
            double zzb2 = zzju.zzb(zzqwVar2);
            if (zzb2 == Math.floor(zzb2)) {
                int i12 = (int) zzb2;
                if (zzd.equals(Integer.toString(i12)) && i12 >= 0 && i12 < ((zzrh) zzqwVar).zzk().length()) {
                    return new zzqx(Boolean.TRUE);
                }
            }
            return new zzqx(Boolean.FALSE);
        }
        return new zzqx(Boolean.valueOf(zzqwVar.zzh(zzd)));
    }
}
