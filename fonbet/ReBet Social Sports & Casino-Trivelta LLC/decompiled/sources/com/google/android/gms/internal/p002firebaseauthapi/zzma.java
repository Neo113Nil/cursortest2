package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzkg;
import com.plaid.internal.EnumC3631g;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzma implements zzbd {
    private static final byte[] zza = new byte[0];
    private final zzme zzb;
    private final zzmf zzc;
    private final zzmc zzd;
    private final zzly zze;
    private final int zzf;
    private final byte[] zzg;

    private zzma(zzme zzmeVar, zzmf zzmfVar, zzmc zzmcVar, zzly zzlyVar, int i10, zzaaj zzaajVar) {
        this.zzb = zzmeVar;
        this.zzc = zzmfVar;
        this.zzd = zzmcVar;
        this.zze = zzlyVar;
        this.zzf = i10;
        this.zzg = zzaajVar.zzb();
    }

    public static zzbd zza(zzki zzkiVar) {
        int i10;
        zzkg zzkgVar = (zzkg) ((zzlg) zzkiVar.zza());
        zzmf zza2 = zzmh.zza(zzkgVar.zze());
        zzmc zza3 = zzmh.zza(zzkgVar.zzd());
        zzly zza4 = zzmh.zza(zzkgVar.zzb());
        zzkg.zzf zze = zzkgVar.zze();
        zzkg.zzf zzfVar = zzkg.zzf.zzd;
        if (zze.equals(zzfVar)) {
            i10 = 32;
        } else if (zze.equals(zzkg.zzf.zza)) {
            i10 = 65;
        } else if (zze.equals(zzkg.zzf.zzb)) {
            i10 = 97;
        } else {
            if (!zze.equals(zzkg.zzf.zzc)) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            i10 = EnumC3631g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE;
        }
        int i11 = i10;
        zzkg.zzf zze2 = ((zzkg) ((zzlg) zzkiVar.zza())).zze();
        if (zze2.equals(zzfVar) || zze2.equals(zzkg.zzf.zza) || zze2.equals(zzkg.zzf.zzb) || zze2.equals(zzkg.zzf.zzc)) {
            return new zzma(new zzme(zzaaj.zza(zzkiVar.zzf().zza(zzbf.zza())), ((zzkq) ((zzli) zzkiVar.zzc())).zze()), zza2, zza3, zza4, i11, zzkiVar.zzh());
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbd
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzg;
        int length = bArr3.length + this.zzf;
        if (bArr.length >= length) {
            if (zzqn.zza(bArr3, bArr)) {
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                return zzmb.zza(Arrays.copyOfRange(bArr, this.zzg.length, length), this.zzb, this.zzc, this.zzd, this.zze, bArr2).zza(bArr, length, zza);
            }
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        throw new GeneralSecurityException("Ciphertext is too short.");
    }
}
