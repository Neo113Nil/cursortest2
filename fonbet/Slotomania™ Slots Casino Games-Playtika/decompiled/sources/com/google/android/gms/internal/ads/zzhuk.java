package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhuk {
    private zzhun zza = null;
    private zzian zzb = null;

    private zzhuk() {
    }

    /* synthetic */ zzhuk(byte[] bArr) {
    }

    public final zzhuk zza(zzhun zzhunVar) {
        this.zza = zzhunVar;
        return this;
    }

    public final zzhuk zzb(zzian zzianVar) {
        this.zzb = zzianVar;
        return this;
    }

    public final zzhul zzc() throws GeneralSecurityException {
        zzhun zzhunVar = this.zza;
        if (zzhunVar == null) {
            throw new GeneralSecurityException("Cannot build without a ecdsa public key");
        }
        zzian zzianVar = this.zzb;
        if (zzianVar == null) {
            throw new GeneralSecurityException("Cannot build without a private value");
        }
        BigInteger zzb = zzianVar.zzb(zzhda.zza());
        ECPoint zzd = zzhunVar.zzd();
        zzhuf zzd2 = zzhunVar.zzf().zzd();
        BigInteger order = zzd2.zza().getOrder();
        if (zzb.signum() <= 0 || zzb.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (zzhkw.zzd(zzb, zzd2.zza()).equals(zzd)) {
            return new zzhul(this.zza, this.zzb, null);
        }
        throw new GeneralSecurityException("Invalid private value");
    }
}
