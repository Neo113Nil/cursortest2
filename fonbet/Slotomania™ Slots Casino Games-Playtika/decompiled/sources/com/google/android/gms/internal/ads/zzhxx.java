package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhxx implements zzhdw {
    private final zzhdw zza;
    private final byte[] zzb;
    private final byte[] zzc;

    private zzhxx(zzhdw zzhdwVar, byte[] bArr, byte[] bArr2) {
        this.zza = zzhdwVar;
        this.zzb = bArr;
        this.zzc = bArr2;
    }

    public static zzhdw zzb(zzhlr zzhlrVar) throws GeneralSecurityException {
        zzhne zzc = zzhlrVar.zzc(zzhda.zza());
        return new zzhxx((zzhdw) zzhlg.zza().zzc(zzc.zzg(), zzhdw.class).zza(zzc.zzb()), zzc(zzc), zzd(zzc));
    }

    static byte[] zzc(zzhne zzhneVar) throws GeneralSecurityException {
        int ordinal = zzhneVar.zzd().ordinal();
        if (ordinal == 1) {
            return zzhmk.zzb(zzhneVar.zze().intValue()).zzc();
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzhmk.zza.zzc();
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
        }
        return zzhmk.zza(zzhneVar.zze().intValue()).zzc();
    }

    static byte[] zzd(zzhne zzhneVar) {
        return zzhneVar.zzd().equals(zzhtb.LEGACY) ? new byte[]{0} : new byte[0];
    }

    @Override // com.google.android.gms.internal.ads.zzhdw
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr3.length;
        if (length == 0 && this.zzc.length == 0) {
            this.zza.zza(bArr, bArr2);
            return;
        }
        if (!zzhnq.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        byte[] bArr4 = this.zzc;
        if (bArr4.length != 0) {
            bArr2 = zzhyy.zza(bArr2, bArr4);
        }
        this.zza.zza(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
    }
}
