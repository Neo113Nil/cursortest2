package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzkb;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzzb implements zzbd {
    private final ECPrivateKey zza;
    private final zzzd zzb;
    private final String zzc;
    private final byte[] zzd;
    private final zzzh zze;
    private final zzlr zzf;
    private final byte[] zzg;

    private zzzb(ECPrivateKey eCPrivateKey, byte[] bArr, String str, zzzh zzzhVar, zzlr zzlrVar, byte[] bArr2) {
        this.zza = eCPrivateKey;
        this.zzb = new zzzd(eCPrivateKey);
        this.zzd = bArr;
        this.zzc = str;
        this.zze = zzzhVar;
        this.zzf = zzlrVar;
        this.zzg = bArr2;
    }

    public static zzbd zza(zzke zzkeVar) {
        ECPrivateKey zza = zzzf.zza(zzze.zza.zza((zznl<zzzi, zzkb.zzc>) ((zzkb) ((zzlg) zzkeVar.zza())).zzd()), zzne.zza(zzkeVar.zzf().zza(zzbf.zza())));
        byte[] bArr = new byte[0];
        if (((zzkb) ((zzlg) zzkeVar.zza())).zzh() != null) {
            bArr = ((zzkb) ((zzlg) zzkeVar.zza())).zzh().zzb();
        }
        return new zzzb(zza, bArr, zzze.zza(((zzkb) ((zzlg) zzkeVar.zza())).zze()), zzze.zzb.zza((zznl<zzzh, zzkb.zze>) ((zzkb) ((zzlg) zzkeVar.zza())).zzf()), zzln.zza((zzkb) ((zzlg) zzkeVar.zza())), zzkeVar.zzh().zzb());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int i10;
        int i11;
        if (zzqn.zza(this.zzg, bArr)) {
            int length = this.zzg.length;
            EllipticCurve curve = this.zza.getParams().getCurve();
            zzzh zzzhVar = this.zze;
            int zza = zzzf.zza(curve);
            int ordinal = zzzhVar.ordinal();
            if (ordinal == 0) {
                zza *= 2;
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new GeneralSecurityException("unknown EC point format");
                }
                i10 = zza * 2;
                i11 = i10 + length;
                if (bArr.length < i11) {
                    return this.zzf.zza(this.zzb.zza(Arrays.copyOfRange(bArr, length, i11), this.zzc, this.zzd, bArr2, this.zzf.zza(), this.zze), bArr, i11);
                }
                throw new GeneralSecurityException("ciphertext too short");
            }
            i10 = zza + 1;
            i11 = i10 + length;
            if (bArr.length < i11) {
            }
        } else {
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
    }
}
