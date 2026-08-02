package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhwg {

    @Nullable
    private zzhwj zza = null;

    @Nullable
    private zzian zzb = null;

    @Nullable
    private zzian zzc = null;

    @Nullable
    private zzian zzd = null;

    @Nullable
    private zzian zze = null;

    @Nullable
    private zzian zzf = null;

    @Nullable
    private zzian zzg = null;

    private zzhwg() {
    }

    /* synthetic */ zzhwg(byte[] bArr) {
    }

    public final zzhwg zza(zzhwj zzhwjVar) {
        this.zza = zzhwjVar;
        return this;
    }

    public final zzhwg zzb(zzian zzianVar, zzian zzianVar2) {
        this.zzc = zzianVar;
        this.zzd = zzianVar2;
        return this;
    }

    public final zzhwg zzc(zzian zzianVar) {
        this.zzb = zzianVar;
        return this;
    }

    public final zzhwg zzd(zzian zzianVar, zzian zzianVar2) {
        this.zze = zzianVar;
        this.zzf = zzianVar2;
        return this;
    }

    public final zzhwg zze(zzian zzianVar) {
        this.zzg = zzianVar;
        return this;
    }

    public final zzhwh zzf() throws GeneralSecurityException {
        zzhwj zzhwjVar = this.zza;
        if (zzhwjVar == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        if (this.zzc == null || this.zzd == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        if (this.zze == null || this.zzf == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        if (this.zzg == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger zzd = zzhwjVar.zzf().zzd();
        BigInteger zzd2 = this.zza.zzd();
        BigInteger zzb = this.zzc.zzb(zzhda.zza());
        BigInteger zzb2 = this.zzd.zzb(zzhda.zza());
        BigInteger zzb3 = this.zzb.zzb(zzhda.zza());
        BigInteger zzb4 = this.zze.zzb(zzhda.zza());
        BigInteger zzb5 = this.zzf.zzb(zzhda.zza());
        BigInteger zzb6 = this.zzg.zzb(zzhda.zza());
        if (!zzb.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!zzb2.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!zzb.multiply(zzb2).equals(zzd2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger subtract = zzb.subtract(BigInteger.ONE);
        BigInteger subtract2 = zzb2.subtract(BigInteger.ONE);
        if (!zzd.multiply(zzb3).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(BigInteger.ONE)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!zzd.multiply(zzb4).mod(subtract).equals(BigInteger.ONE)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!zzd.multiply(zzb5).mod(subtract2).equals(BigInteger.ONE)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (zzb2.multiply(zzb6).mod(zzb).equals(BigInteger.ONE)) {
            return new zzhwh(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, null);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }
}
