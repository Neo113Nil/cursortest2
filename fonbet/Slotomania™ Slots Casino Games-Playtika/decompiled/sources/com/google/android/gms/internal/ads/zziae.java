package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zziae implements zzhdw {
    static final zzhky zza;
    private static final byte[] zzb = new byte[0];
    private static final byte[] zzc = {0};

    static {
        zzhkx zza2 = zzhky.zza();
        zza2.zza(zzhzv.SHA256, zzhwd.zza);
        zza2.zza(zzhzv.SHA384, zzhwd.zzb);
        zza2.zza(zzhzv.SHA512, zzhwd.zzc);
        zza = zza2.zzb();
    }

    public static zzhdw zzb(zzhwj zzhwjVar) throws GeneralSecurityException {
        try {
            return zzhyg.zzd(zzhwjVar);
        } catch (NoSuchProviderException unused) {
            return new zziad((RSAPublicKey) ((KeyFactory) zzhzm.zzf.zzb("RSA")).generatePublic(new RSAPublicKeySpec(zzhwjVar.zzd(), zzhwjVar.zzf().zzd())), (zzhzv) zza.zzb(zzhwjVar.zzf().zzf()), zzhwjVar.zze().zzc(), zzhwjVar.zzf().zze().equals(zzhwe.zzc) ? zzc : zzb, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdw
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
