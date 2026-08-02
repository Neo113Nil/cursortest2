package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzgp {
    private final boolean zza;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if (r9.zzj(8) == 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzgp(zzgs zzgsVar, zzgr zzgrVar) throws zzgq {
        int i = zzgrVar.zza;
        boolean z = false;
        zzgsw.zza(i == 6 || i == 3);
        int min = Math.min(4, zzgrVar.zzb.remaining());
        byte[] bArr = new byte[min];
        zzgrVar.zzb.asReadOnlyBuffer().get(bArr);
        zzer zzerVar = new zzer(bArr, min);
        zzgt.zzb(zzgsVar.zza);
        if (!zzerVar.zzi()) {
            int zzj = zzerVar.zzj(2);
            boolean zzi = zzerVar.zzi();
            zzgt.zzb(zzgsVar.zzb);
            if (zzi) {
                boolean zzi2 = (zzj == 3 || zzj == 0) ? true : zzerVar.zzi();
                zzerVar.zzg();
                zzgt.zzb(!zzgsVar.zzd);
                if (zzerVar.zzi()) {
                    zzgt.zzb(!zzgsVar.zze);
                    zzerVar.zzg();
                }
                zzgt.zzb(zzgsVar.zzc);
                if (zzj != 3) {
                    zzerVar.zzg();
                }
                zzerVar.zzh(zzgsVar.zzf);
                if (zzj != 2 && zzj != 0 && !zzi2) {
                    zzerVar.zzh(3);
                }
                if (zzj != 3) {
                    if (zzj != 0) {
                    }
                }
            }
            z = true;
        }
        this.zza = z;
    }

    public static zzgp zzb(zzgs zzgsVar, zzgr zzgrVar) {
        try {
            return new zzgp(zzgsVar, zzgrVar);
        } catch (zzgq unused) {
            return null;
        }
    }

    public final boolean zza() {
        return this.zza;
    }
}
