package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzhku {
    static final long[] zza;
    static final long[] zzb;
    static final long[] zzc;
    static final zzhkn[][] zzd;
    static final zzhkn[] zze;
    private static final BigInteger zzf;
    private static final BigInteger zzg;
    private static final BigInteger zzh;
    private static final BigInteger zzi;

    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        zzf = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        zzg = mod;
        BigInteger mod2 = BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        zzh = mod2;
        BigInteger modPow = BigInteger.valueOf(2L).modPow(subtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), subtract);
        zzi = modPow;
        zzhkt zzhktVar = new zzhkt(null);
        zzhktVar.zzd(BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract));
        BigInteger zzc2 = zzhktVar.zzc();
        BigInteger multiply = zzc2.pow(2).subtract(BigInteger.ONE).multiply(mod.multiply(zzc2.pow(2)).add(BigInteger.ONE).modInverse(subtract));
        BigInteger modPow2 = multiply.modPow(subtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), subtract);
        if (!modPow2.pow(2).subtract(multiply).mod(subtract).equals(BigInteger.ZERO)) {
            modPow2 = modPow2.multiply(modPow).mod(subtract);
        }
        if (modPow2.testBit(0)) {
            modPow2 = subtract.subtract(modPow2);
        }
        zzhktVar.zzb(modPow2);
        zza = zzhkz.zzg(zzb(mod));
        zzb = zzhkz.zzg(zzb(mod2));
        zzc = zzhkz.zzg(zzb(modPow));
        zzd = (zzhkn[][]) Array.newInstance((Class<?>) zzhkn.class, 32, 8);
        zzhkt zzhktVar2 = zzhktVar;
        for (int i = 0; i < 32; i++) {
            zzhkt zzhktVar3 = zzhktVar2;
            for (int i2 = 0; i2 < 8; i2++) {
                zzd[i][i2] = zzc(zzhktVar3);
                zzhktVar3 = zza(zzhktVar3, zzhktVar2);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                zzhktVar2 = zza(zzhktVar2, zzhktVar2);
            }
        }
        zzhkt zza2 = zza(zzhktVar, zzhktVar);
        zze = new zzhkn[8];
        for (int i4 = 0; i4 < 8; i4++) {
            zze[i4] = zzc(zzhktVar);
            zzhktVar = zza(zzhktVar, zza2);
        }
    }

    private static zzhkt zza(zzhkt zzhktVar, zzhkt zzhktVar2) {
        zzhkt zzhktVar3 = new zzhkt(null);
        BigInteger multiply = zzg.multiply(zzhktVar.zza().multiply(zzhktVar2.zza()).multiply(zzhktVar.zzc()).multiply(zzhktVar2.zzc()));
        BigInteger bigInteger = zzf;
        BigInteger mod = multiply.mod(bigInteger);
        zzhktVar3.zzb(zzhktVar.zza().multiply(zzhktVar2.zzc()).add(zzhktVar2.zza().multiply(zzhktVar.zzc())).multiply(BigInteger.ONE.add(mod).modInverse(bigInteger)).mod(bigInteger));
        zzhktVar3.zzd(zzhktVar.zzc().multiply(zzhktVar2.zzc()).add(zzhktVar.zza().multiply(zzhktVar2.zza())).multiply(BigInteger.ONE.subtract(mod).modInverse(bigInteger)).mod(bigInteger));
        return zzhktVar3;
    }

    private static byte[] zzb(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            int i2 = 31 - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }

    private static zzhkn zzc(zzhkt zzhktVar) {
        BigInteger add = zzhktVar.zzc().add(zzhktVar.zza());
        BigInteger bigInteger = zzf;
        return new zzhkn(zzhkz.zzg(zzb(add.mod(bigInteger))), zzhkz.zzg(zzb(zzhktVar.zzc().subtract(zzhktVar.zza()).mod(bigInteger))), zzhkz.zzg(zzb(zzh.multiply(zzhktVar.zza()).multiply(zzhktVar.zzc()).mod(bigInteger))));
    }
}
