package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zziai implements zzhdw {
    static final zzhky zza;
    private static final byte[] zzb;
    private static final byte[] zzc;

    static {
        zzhkx zza2 = zzhky.zza();
        zza2.zza(zzhzv.SHA256, zzhwp.zza);
        zza2.zza(zzhzv.SHA384, zzhwp.zzb);
        zza2.zza(zzhzv.SHA512, zzhwp.zzc);
        zza = zza2.zzb();
        zzb = new byte[0];
        zzc = new byte[]{0};
    }

    public static zzhdw zzb(zzhwv zzhwvVar) throws GeneralSecurityException {
        try {
            return zzhyp.zze(zzhwvVar);
        } catch (NoSuchProviderException unused) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) zzhzm.zzf.zzb("RSA")).generatePublic(new RSAPublicKeySpec(zzhwvVar.zzd(), zzhwvVar.zzf().zzd()));
            zzhwr zzf = zzhwvVar.zzf();
            zzhky zzhkyVar = zza;
            return new zziah(rSAPublicKey, (zzhzv) zzhkyVar.zzb(zzf.zzf()), (zzhzv) zzhkyVar.zzb(zzf.zzg()), zzf.zzh(), zzhwvVar.zze().zzc(), zzhwvVar.zzf().zze().equals(zzhwq.zzc) ? zzc : zzb, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdw
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
