package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* loaded from: classes2.dex */
final class zzmr implements zzmf {
    private final zzzi zza;
    private final zzlz zzb;

    private zzmr(zzlz zzlzVar, zzzi zzziVar) {
        this.zzb = zzlzVar;
        this.zza = zzziVar;
    }

    public static zzmr zza(zzzi zzziVar) {
        int i10 = zzmq.zza[zzziVar.ordinal()];
        if (i10 == 1) {
            return new zzmr(new zzlz("HmacSha256"), zzzi.NIST_P256);
        }
        if (i10 == 2) {
            return new zzmr(new zzlz("HmacSha384"), zzzi.NIST_P384);
        }
        if (i10 == 3) {
            return new zzmr(new zzlz("HmacSha512"), zzzi.NIST_P521);
        }
        throw new GeneralSecurityException("invalid curve type: " + String.valueOf(zzziVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmf
    public final byte[] zza(byte[] bArr, zzme zzmeVar) {
        ECPrivateKey zza = zzzf.zza(this.zza, zzmeVar.zza().zzb());
        zzzi zzziVar = this.zza;
        byte[] zza2 = zzzf.zza(zza, zzzf.zza(zzzf.zza(zzziVar), zzzh.UNCOMPRESSED, bArr));
        byte[] zza3 = zzyz.zza(bArr, zzmeVar.zzb().zzb());
        byte[] zza4 = zzmk.zza(zza());
        zzlz zzlzVar = this.zzb;
        return zzlzVar.zza(null, zza2, "eae_prk", zza3, "shared_secret", zza4, zzlzVar.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmf
    public final byte[] zza() {
        int i10 = zzmq.zza[this.zza.ordinal()];
        if (i10 == 1) {
            return zzmk.zzc;
        }
        if (i10 == 2) {
            return zzmk.zzd;
        }
        if (i10 == 3) {
            return zzmk.zze;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
