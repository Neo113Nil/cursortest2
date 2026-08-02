package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhxk {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zziam zzc;
    private static final zzhmq zzd;
    private static final zzhmn zze;
    private static final zzhlm zzf;
    private static final zzhlj zzg;
    private static final zzhlm zzh;
    private static final zzhlj zzi;

    static {
        zziam zza2 = zzhnq.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        zzb = zza2;
        zziam zza3 = zzhnq.zza("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        zzc = zza3;
        zzd = zzhmq.zzd(zzhxj.zza, zzhuj.class, zzhnf.class);
        zze = zzhmn.zzd(zzhxe.zza, zza2, zzhnf.class);
        zzf = zzhlm.zzd(zzhxf.zza, zzhun.class, zzhne.class);
        zzg = zzhlj.zzd(zzhxg.zza, zza3, zzhne.class);
        zzh = zzhlm.zzd(zzhxh.zza, zzhul.class, zzhne.class);
        zzi = zzhlj.zzd(zzhxi.zza, zza2, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzd);
        zzhmjVar.zze(zze);
        zzhmjVar.zzb(zzf);
        zzhmjVar.zzc(zzg);
        zzhmjVar.zzb(zzh);
        zzhmjVar.zzc(zzi);
    }

    static /* synthetic */ zzhnf zzb(zzhuj zzhujVar) {
        zzhsh zze2 = zzhsi.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        zzhrg zzc2 = zzhrh.zzc();
        zzc2.zza(zzl(zzhujVar));
        zze2.zzb(((zzhrh) zzc2.zzbu()).zzaM());
        zze2.zzc(zzh(zzhujVar.zzf()));
        return zzhnf.zza((zzhsi) zze2.zzbu());
    }

    static /* synthetic */ zzhuj zzc(zzhnf zzhnfVar) {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            String zza2 = zzhnfVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhrh zzb2 = zzhrh.zzb(zzhnfVar.zzc().zzb(), zzidb.zza());
            zzhue zzb3 = zzhuj.zzb();
            zzb3.zzc(zzi(zzb2.zza().zza()));
            zzb3.zza(zzo(zzb2.zza().zzh()));
            zzb3.zzb(zzn(zzb2.zza().zzg()));
            zzb3.zzd(zzj(zzhnfVar.zzc().zzc()));
            return zzb3.zze();
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhun zze(zzhne zzhneVar, zzhdx zzhdxVar) {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
            String zzg2 = zzhneVar.zzg();
            String.valueOf(zzg2);
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzg2)));
        }
        try {
            zzhrn zze2 = zzhrn.zze(zzhneVar.zzb(), zzidb.zza());
            if (zze2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhue zzb2 = zzhuj.zzb();
            zzb2.zzc(zzi(zze2.zzb().zza()));
            zzb2.zza(zzo(zze2.zzb().zzh()));
            zzb2.zzb(zzn(zze2.zzb().zzg()));
            zzb2.zzd(zzj(zzhneVar.zzd()));
            zzhuj zze3 = zzb2.zze();
            zzhum zzc2 = zzhun.zzc();
            zzc2.zza(zze3);
            zzc2.zzb(new ECPoint(new BigInteger(1, zze2.zzc().zzA()), new BigInteger(1, zze2.zzd().zzA())));
            zzc2.zzc(zzhneVar.zze());
            return zzc2.zzd();
        } catch (zzieg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    static /* synthetic */ zzhne zzf(zzhul zzhulVar, zzhdx zzhdxVar) {
        int zzk = zzk(zzhulVar.zzd().zzd());
        zzhrk zze2 = zzhrl.zze();
        zze2.zza(zzm(zzhulVar.zze()));
        byte[] zzb2 = zzhkk.zzb(zzhulVar.zzf().zzb(zzhdxVar), zzk);
        zzicn zzicnVar = zzicn.zza;
        zze2.zzb(zzicn.zzt(zzb2, 0, zzb2.length));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((zzhrl) zze2.zzbu()).zzaM(), zzhse.ASYMMETRIC_PRIVATE, zzh(zzhulVar.zzd().zzf()), zzhulVar.zze().zzb());
    }

    static /* synthetic */ zzhul zzg(zzhne zzhneVar, zzhdx zzhdxVar) {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            String zzg2 = zzhneVar.zzg();
            String.valueOf(zzg2);
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzg2)));
        }
        try {
            zzhrl zzd2 = zzhrl.zzd(zzhneVar.zzb(), zzidb.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhrn zzb2 = zzd2.zzb();
            if (zzb2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhue zzb3 = zzhuj.zzb();
            zzb3.zzc(zzi(zzb2.zzb().zza()));
            zzb3.zza(zzo(zzb2.zzb().zzh()));
            zzb3.zzb(zzn(zzb2.zzb().zzg()));
            zzb3.zzd(zzj(zzhneVar.zzd()));
            zzhuj zze2 = zzb3.zze();
            zzhum zzc2 = zzhun.zzc();
            zzc2.zza(zze2);
            zzc2.zzb(new ECPoint(new BigInteger(1, zzb2.zzc().zzA()), new BigInteger(1, zzb2.zzd().zzA())));
            zzc2.zzc(zzhneVar.zze());
            zzhun zzd3 = zzc2.zzd();
            zzhuk zzc3 = zzhul.zzc();
            zzc3.zza(zzd3);
            zzc3.zzb(zzian.zza(new BigInteger(1, zzd2.zzc().zzA()), zzhdxVar));
            return zzc3.zzc();
        } catch (zzieg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    private static zzhtb zzh(zzhui zzhuiVar) throws GeneralSecurityException {
        if (zzhui.zza.equals(zzhuiVar)) {
            return zzhtb.TINK;
        }
        if (zzhui.zzb.equals(zzhuiVar)) {
            return zzhtb.CRUNCHY;
        }
        if (zzhui.zzd.equals(zzhuiVar)) {
            return zzhtb.RAW;
        }
        if (zzhui.zzc.equals(zzhuiVar)) {
            return zzhtb.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhuiVar.toString()));
    }

    private static zzhug zzi(zzhrw zzhrwVar) throws GeneralSecurityException {
        int ordinal = zzhrwVar.ordinal();
        if (ordinal == 2) {
            return zzhug.zzb;
        }
        if (ordinal == 3) {
            return zzhug.zza;
        }
        if (ordinal == 4) {
            return zzhug.zzc;
        }
        int zza2 = zzhrwVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 26);
        sb.append("Unable to parse HashType: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }

    private static zzhui zzj(zzhtb zzhtbVar) throws GeneralSecurityException {
        int ordinal = zzhtbVar.ordinal();
        if (ordinal == 1) {
            return zzhui.zza;
        }
        if (ordinal == 2) {
            return zzhui.zzc;
        }
        if (ordinal == 3) {
            return zzhui.zzd;
        }
        if (ordinal == 4) {
            return zzhui.zzb;
        }
        int zza2 = zzhtbVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }

    private static int zzk(zzhuf zzhufVar) throws GeneralSecurityException {
        if (zzhuf.zza.equals(zzhufVar)) {
            return 33;
        }
        if (zzhuf.zzb.equals(zzhufVar)) {
            return 49;
        }
        if (zzhuf.zzc.equals(zzhufVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(zzhufVar.toString()));
    }

    private static zzhrj zzl(zzhuj zzhujVar) throws GeneralSecurityException {
        zzhrw zzhrwVar;
        int i;
        zzhri zzb2 = zzhrj.zzb();
        zzhug zze2 = zzhujVar.zze();
        if (zzhug.zza.equals(zze2)) {
            zzhrwVar = zzhrw.SHA256;
        } else if (zzhug.zzb.equals(zze2)) {
            zzhrwVar = zzhrw.SHA384;
        } else {
            if (!zzhug.zzc.equals(zze2)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(zze2.toString()));
            }
            zzhrwVar = zzhrw.SHA512;
        }
        zzb2.zza(zzhrwVar);
        zzhuf zzd2 = zzhujVar.zzd();
        int i2 = 4;
        if (zzhuf.zza.equals(zzd2)) {
            i = 4;
        } else if (zzhuf.zzb.equals(zzd2)) {
            i = 5;
        } else {
            if (!zzhuf.zzc.equals(zzd2)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(zzd2.toString()));
            }
            i = 6;
        }
        zzb2.zzb(i);
        zzhuh zzc2 = zzhujVar.zzc();
        if (zzhuh.zza.equals(zzc2)) {
            i2 = 3;
        } else if (!zzhuh.zzb.equals(zzc2)) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(zzc2.toString()));
        }
        zzb2.zzc(i2);
        return (zzhrj) zzb2.zzbu();
    }

    private static zzhrn zzm(zzhun zzhunVar) throws GeneralSecurityException {
        int zzk = zzk(zzhunVar.zzf().zzd());
        ECPoint zzd2 = zzhunVar.zzd();
        zzhrm zzg2 = zzhrn.zzg();
        zzg2.zza(zzl(zzhunVar.zzf()));
        byte[] zzb2 = zzhkk.zzb(zzd2.getAffineX(), zzk);
        zzicn zzicnVar = zzicn.zza;
        zzg2.zzb(zzicn.zzt(zzb2, 0, zzb2.length));
        byte[] zzb3 = zzhkk.zzb(zzd2.getAffineY(), zzk);
        zzg2.zzc(zzicn.zzt(zzb3, 0, zzb3.length));
        return (zzhrn) zzg2.zzbu();
    }

    private static zzhuf zzn(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 2) {
            return zzhuf.zza;
        }
        if (i2 == 3) {
            return zzhuf.zzb;
        }
        if (i2 == 4) {
            return zzhuf.zzc;
        }
        int zza2 = zzhrv.zza(i);
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 35);
        sb.append("Unable to parse EllipticCurveType: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }

    private static zzhuh zzo(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 1) {
            return zzhuh.zza;
        }
        if (i2 == 2) {
            return zzhuh.zzb;
        }
        int zza2 = zzhro.zza(i);
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 40);
        sb.append("Unable to parse EcdsaSignatureEncoding: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }
}
