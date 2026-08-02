package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhye {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zziam zzc;
    private static final zzhmq zzd;
    private static final zzhmn zze;
    private static final zzhlm zzf;
    private static final zzhlj zzg;
    private static final zzhlm zzh;
    private static final zzhlj zzi;
    private static final zzhky zzj;
    private static final zzhky zzk;

    static {
        zziam zza2 = zzhnq.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        zzb = zza2;
        zziam zza3 = zzhnq.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        zzc = zza3;
        zzd = zzhmq.zzd(zzhyd.zza, zzhwf.class, zzhnf.class);
        zze = zzhmn.zzd(zzhxy.zza, zza2, zzhnf.class);
        zzf = zzhlm.zzd(zzhxz.zza, zzhwj.class, zzhne.class);
        zzg = zzhlj.zzd(zzhya.zza, zza3, zzhne.class);
        zzh = zzhlm.zzd(zzhyb.zza, zzhwh.class, zzhne.class);
        zzi = zzhlj.zzd(zzhyc.zza, zza2, zzhne.class);
        zzhkx zza4 = zzhky.zza();
        zza4.zza(zzhtb.RAW, zzhwe.zzd);
        zza4.zza(zzhtb.TINK, zzhwe.zza);
        zza4.zza(zzhtb.CRUNCHY, zzhwe.zzb);
        zza4.zza(zzhtb.LEGACY, zzhwe.zzc);
        zzj = zza4.zzb();
        zzhkx zza5 = zzhky.zza();
        zza5.zza(zzhrw.SHA256, zzhwd.zza);
        zza5.zza(zzhrw.SHA384, zzhwd.zzb);
        zza5.zza(zzhrw.SHA512, zzhwd.zzc);
        zzk = zza5.zzb();
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzd);
        zzhmjVar.zze(zze);
        zzhmjVar.zzb(zzf);
        zzhmjVar.zzc(zzg);
        zzhmjVar.zzb(zzh);
        zzhmjVar.zzc(zzi);
    }

    static /* synthetic */ zzhnf zzb(zzhwf zzhwfVar) {
        zzhsh zze2 = zzhsi.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        zzhte zze3 = zzhtf.zze();
        zze3.zza(zzh(zzhwfVar));
        zze3.zzb(zzhwfVar.zzc());
        byte[] zza2 = zzhkk.zza(zzhwfVar.zzd());
        zzicn zzicnVar = zzicn.zza;
        zze3.zzc(zzicn.zzt(zza2, 0, zza2.length));
        zze2.zzb(((zzhtf) zze3.zzbu()).zzaM());
        zze2.zzc((zzhtb) zzj.zzb(zzhwfVar.zze()));
        return zzhnf.zza((zzhsi) zze2.zzbu());
    }

    static /* synthetic */ zzhwf zzc(zzhnf zzhnfVar) {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            String zza2 = zzhnfVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhtf zzd2 = zzhtf.zzd(zzhnfVar.zzc().zzb(), zzidb.zza());
            zzhwc zzb2 = zzhwf.zzb();
            zzb2.zzd((zzhwd) zzk.zzc(zzd2.zza().zza()));
            zzb2.zzb(new BigInteger(1, zzd2.zzc().zzA()));
            zzb2.zza(zzd2.zzb());
            zzb2.zzc((zzhwe) zzj.zzc(zzhnfVar.zzc().zzc()));
            return zzb2.zze();
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e);
        }
    }

    static /* synthetic */ zzhwj zze(zzhne zzhneVar, zzhdx zzhdxVar) {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
            String zzg2 = zzhneVar.zzg();
            String.valueOf(zzg2);
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzg2)));
        }
        try {
            zzhtl zze2 = zzhtl.zze(zzhneVar.zzb(), zzidb.zza());
            if (zze2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zze2.zzc().zzA());
            int bitLength = bigInteger.bitLength();
            zzhwc zzb2 = zzhwf.zzb();
            zzb2.zzd((zzhwd) zzk.zzc(zze2.zzb().zza()));
            zzb2.zzb(new BigInteger(1, zze2.zzd().zzA()));
            zzb2.zza(bitLength);
            zzb2.zzc((zzhwe) zzj.zzc(zzhneVar.zzd()));
            zzhwf zze3 = zzb2.zze();
            zzhwi zzc2 = zzhwj.zzc();
            zzc2.zza(zze3);
            zzc2.zzb(bigInteger);
            zzc2.zzc(zzhneVar.zze());
            return zzc2.zzd();
        } catch (zzieg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
        }
    }

    static /* synthetic */ zzhne zzf(zzhwh zzhwhVar, zzhdx zzhdxVar) {
        zzhti zzk2 = zzhtj.zzk();
        zzk2.zza(0);
        zzk2.zzb(zzi(zzhwhVar.zze()));
        byte[] zza2 = zzhkk.zza(zzhwhVar.zzi().zzb(zzhdxVar));
        zzicn zzicnVar = zzicn.zza;
        zzk2.zzc(zzicn.zzt(zza2, 0, zza2.length));
        byte[] zza3 = zzhkk.zza(zzhwhVar.zzf().zzb(zzhdxVar));
        zzk2.zzd(zzicn.zzt(zza3, 0, zza3.length));
        byte[] zza4 = zzhkk.zza(zzhwhVar.zzh().zzb(zzhdxVar));
        zzk2.zze(zzicn.zzt(zza4, 0, zza4.length));
        byte[] zza5 = zzhkk.zza(zzhwhVar.zzj().zzb(zzhdxVar));
        zzk2.zzf(zzicn.zzt(zza5, 0, zza5.length));
        byte[] zza6 = zzhkk.zza(zzhwhVar.zzk().zzb(zzhdxVar));
        zzk2.zzg(zzicn.zzt(zza6, 0, zza6.length));
        byte[] zza7 = zzhkk.zza(zzhwhVar.zzl().zzb(zzhdxVar));
        zzk2.zzh(zzicn.zzt(zza7, 0, zza7.length));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", ((zzhtj) zzk2.zzbu()).zzaM(), zzhse.ASYMMETRIC_PRIVATE, (zzhtb) zzj.zzb(zzhwhVar.zzd().zze()), zzhwhVar.zze().zzb());
    }

    static /* synthetic */ zzhwh zzg(zzhne zzhneVar, zzhdx zzhdxVar) {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            String zzg2 = zzhneVar.zzg();
            String.valueOf(zzg2);
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzg2)));
        }
        try {
            zzhtj zzj2 = zzhtj.zzj(zzhneVar.zzb(), zzidb.zza());
            if (zzj2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhtl zzb2 = zzj2.zzb();
            if (zzb2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzb2.zzc().zzA());
            int bitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, zzb2.zzd().zzA());
            zzhwc zzb3 = zzhwf.zzb();
            zzb3.zzd((zzhwd) zzk.zzc(zzb2.zzb().zza()));
            zzb3.zzb(bigInteger2);
            zzb3.zza(bitLength);
            zzb3.zzc((zzhwe) zzj.zzc(zzhneVar.zzd()));
            zzhwf zze2 = zzb3.zze();
            zzhwi zzc2 = zzhwj.zzc();
            zzc2.zza(zze2);
            zzc2.zzb(bigInteger);
            zzc2.zzc(zzhneVar.zze());
            zzhwj zzd2 = zzc2.zzd();
            zzhwg zzc3 = zzhwh.zzc();
            zzc3.zza(zzd2);
            zzc3.zzb(zzj(zzj2.zzd(), zzhdxVar), zzj(zzj2.zze(), zzhdxVar));
            zzc3.zzc(zzj(zzj2.zzc(), zzhdxVar));
            zzc3.zzd(zzj(zzj2.zzg(), zzhdxVar), zzj(zzj2.zzh(), zzhdxVar));
            zzc3.zze(zzj(zzj2.zzi(), zzhdxVar));
            return zzc3.zzf();
        } catch (zzieg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
        }
    }

    private static zzhth zzh(zzhwf zzhwfVar) throws GeneralSecurityException {
        zzhtg zzb2 = zzhth.zzb();
        zzb2.zza((zzhrw) zzk.zzb(zzhwfVar.zzf()));
        return (zzhth) zzb2.zzbu();
    }

    private static zzhtl zzi(zzhwj zzhwjVar) throws GeneralSecurityException {
        zzhtk zzg2 = zzhtl.zzg();
        zzg2.zza(zzh(zzhwjVar.zzf()));
        byte[] zza2 = zzhkk.zza(zzhwjVar.zzd());
        zzicn zzicnVar = zzicn.zza;
        zzg2.zzb(zzicn.zzt(zza2, 0, zza2.length));
        byte[] zza3 = zzhkk.zza(zzhwjVar.zzf().zzd());
        zzg2.zzc(zzicn.zzt(zza3, 0, zza3.length));
        return (zzhtl) zzg2.zzbu();
    }

    private static zzian zzj(zzicn zzicnVar, zzhdx zzhdxVar) {
        return zzian.zza(new BigInteger(1, zzicnVar.zzA()), zzhdxVar);
    }
}
