package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzpb extends zzjv {
    private final com.google.android.gms.tagmanager.zzcp zza;
    private final zzhy zzb;

    public zzpb(com.google.android.gms.tagmanager.zzcp zzcpVar, zzhy zzhyVar) {
        this.zza = zzcpVar;
        this.zzb = zzhyVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(1:5)(12:6|7|(1:9)(1:32)|10|(1:14)|15|(1:17)(1:31)|18|19|20|21|22))|33|7|(0)(0)|10|(2:12|14)|15|(0)(0)|18|19|20|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        r10 = java.lang.String.valueOf(r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (r10.length() != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        r10 = "Error calling measurement proxy:".concat(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        com.google.android.gms.internal.gtm.zzhl.zza(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        r10 = new java.lang.String("Error calling measurement proxy:");
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // com.google.android.gms.internal.gtm.zzjv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        boolean z11;
        zzqw<?> zzqwVar;
        zzra zzraVar;
        boolean z12 = true;
        Preconditions.checkArgument(true);
        int length = zzqwVarArr.length;
        if (length != 1) {
            if (length != 2) {
                z11 = false;
                Preconditions.checkArgument(z11);
                Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrh);
                zzqwVar = length <= 1 ? zzqwVarArr[1] : zzra.zze;
                zzraVar = zzra.zze;
                if (zzqwVar != zzraVar && !(zzqwVar instanceof zzre)) {
                    z12 = false;
                }
                Preconditions.checkArgument(z12);
                zzgx zza = this.zzb.zza();
                this.zza.zzc(zza.zzc(), ((zzrh) zzqwVarArr[0]).zzk(), zzqwVar == zzraVar ? zzri.zza(((zzre) zzqwVar).zzi()) : null, zza.currentTimeMillis());
                return zzra.zze;
            }
            length = 2;
        }
        z11 = true;
        Preconditions.checkArgument(z11);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrh);
        if (length <= 1) {
        }
        zzraVar = zzra.zze;
        if (zzqwVar != zzraVar) {
            z12 = false;
        }
        Preconditions.checkArgument(z12);
        zzgx zza2 = this.zzb.zza();
        this.zza.zzc(zza2.zzc(), ((zzrh) zzqwVarArr[0]).zzk(), zzqwVar == zzraVar ? zzri.zza(((zzre) zzqwVar).zzi()) : null, zza2.currentTimeMillis());
        return zzra.zze;
    }
}
