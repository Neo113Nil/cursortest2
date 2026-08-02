package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzgs {
    public final boolean zza;
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;
    public final boolean zze;
    public final int zzf;
    public final int zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final byte zzl;
    public final byte zzm;

    /* JADX WARN: Removed duplicated region for block: B:65:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzgs(zzgr zzgrVar) throws zzgq {
        byte b;
        boolean z = false;
        zzgsw.zza(zzgrVar.zza == 1);
        int remaining = zzgrVar.zzb.remaining();
        byte[] bArr = new byte[remaining];
        zzgrVar.zzb.asReadOnlyBuffer().get(bArr);
        zzer zzerVar = new zzer(bArr, remaining);
        this.zzg = zzerVar.zzj(3);
        zzerVar.zzg();
        boolean zzi = zzerVar.zzi();
        this.zza = zzi;
        if (zzi) {
            zzerVar.zzj(5);
            this.zzb = false;
            this.zzh = false;
        } else {
            if (zzerVar.zzi()) {
                zzerVar.zzh(64);
                if (zzerVar.zzi()) {
                    int i = 0;
                    while (!zzerVar.zzi()) {
                        i++;
                    }
                    if (i < 32) {
                        zzerVar.zzh(i);
                    }
                }
                boolean zzi2 = zzerVar.zzi();
                this.zzb = zzi2;
                if (zzi2) {
                    zzerVar.zzh(47);
                }
            } else {
                this.zzb = false;
            }
            this.zzh = zzerVar.zzi();
            int zzj = zzerVar.zzj(5);
            for (int i2 = 0; i2 <= zzj; i2++) {
                zzerVar.zzh(12);
                if (i2 == 0) {
                    if (zzerVar.zzj(5) > 7) {
                        zzerVar.zzi();
                    }
                } else if (zzerVar.zzj(5) > 7) {
                    zzerVar.zzg();
                }
                if (this.zzb) {
                    zzerVar.zzg();
                }
                if (this.zzh && zzerVar.zzi()) {
                    if (i2 == 0) {
                        zzerVar.zzj(4);
                    } else {
                        zzerVar.zzh(4);
                    }
                }
            }
        }
        int zzj2 = zzerVar.zzj(4);
        int zzj3 = zzerVar.zzj(4);
        zzerVar.zzh(zzj2 + 1);
        zzerVar.zzh(zzj3 + 1);
        if (this.zza) {
            this.zzc = false;
        } else {
            boolean zzi3 = zzerVar.zzi();
            this.zzc = zzi3;
            if (zzi3) {
                zzerVar.zzh(4);
                zzerVar.zzh(3);
            }
        }
        zzerVar.zzh(3);
        if (this.zza) {
            this.zze = true;
            this.zzd = true;
            this.zzf = 0;
        } else {
            zzerVar.zzh(4);
            boolean zzi4 = zzerVar.zzi();
            if (zzi4) {
                zzerVar.zzh(2);
            }
            if (zzerVar.zzi()) {
                this.zzd = true;
            } else {
                boolean zzi5 = zzerVar.zzi();
                this.zzd = zzi5;
                if (!zzi5) {
                    this.zze = true;
                    if (zzi4) {
                        this.zzf = 0;
                    } else {
                        this.zzf = zzerVar.zzj(3) + 1;
                    }
                }
            }
            if (zzerVar.zzi()) {
                this.zze = true;
            } else {
                this.zze = zzerVar.zzi();
            }
            if (zzi4) {
            }
        }
        zzerVar.zzh(3);
        boolean zzi6 = zzerVar.zzi();
        if (this.zzg == 2 && zzi6) {
            this.zzi = zzerVar.zzi();
        } else {
            this.zzi = false;
        }
        if (this.zzg != 1) {
            this.zzj = zzerVar.zzi();
        } else {
            this.zzj = false;
        }
        if (zzerVar.zzi()) {
            this.zzl = (byte) zzerVar.zzj(8);
            this.zzm = (byte) zzerVar.zzj(8);
            b = (byte) zzerVar.zzj(8);
        } else {
            this.zzl = (byte) 0;
            this.zzm = (byte) 0;
            b = 0;
        }
        if (this.zzj) {
            zzerVar.zzg();
            this.zzk = false;
        } else if (this.zzl == 1 && this.zzm == 13 && b == 0) {
            this.zzk = false;
        } else {
            zzerVar.zzg();
            int i3 = this.zzg;
            if (i3 == 0) {
                this.zzk = true;
                z = true;
            } else if (i3 == 1) {
                this.zzk = false;
            } else if (this.zzi) {
                boolean zzi7 = zzerVar.zzi();
                this.zzk = zzi7;
                if (zzi7) {
                    z = zzerVar.zzi();
                }
            } else {
                this.zzk = true;
            }
            if (this.zzk && z) {
                zzerVar.zzj(2);
            }
        }
        zzerVar.zzg();
    }

    public static zzgs zza(zzgr zzgrVar) {
        try {
            return new zzgs(zzgrVar);
        } catch (zzgq unused) {
            return null;
        }
    }
}
