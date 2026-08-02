package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhyn {
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
        zziam zza2 = zzhnq.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        zzb = zza2;
        zziam zza3 = zzhnq.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        zzc = zza3;
        zzd = zzhmq.zzd(zzhym.zza, zzhwr.class, zzhnf.class);
        zze = zzhmn.zzd(zzhyh.zza, zza2, zzhnf.class);
        zzf = zzhlm.zzd(zzhyi.zza, zzhwv.class, zzhne.class);
        zzg = zzhlj.zzd(zzhyj.zza, zza3, zzhne.class);
        zzh = zzhlm.zzd(zzhyk.zza, zzhwt.class, zzhne.class);
        zzi = zzhlj.zzd(zzhyl.zza, zza2, zzhne.class);
        zzhkx zza4 = zzhky.zza();
        zza4.zza(zzhtb.RAW, zzhwq.zzd);
        zza4.zza(zzhtb.TINK, zzhwq.zza);
        zza4.zza(zzhtb.CRUNCHY, zzhwq.zzb);
        zza4.zza(zzhtb.LEGACY, zzhwq.zzc);
        zzj = zza4.zzb();
        zzhkx zza5 = zzhky.zza();
        zza5.zza(zzhrw.SHA256, zzhwp.zza);
        zza5.zza(zzhrw.SHA384, zzhwp.zzb);
        zza5.zza(zzhrw.SHA512, zzhwp.zzc);
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

    static /* synthetic */ zzhnf zzb(zzhwr zzhwrVar) {
        zzhsh zze2 = zzhsi.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        zzhtm zze3 = zzhtn.zze();
        zze3.zza(zzh(zzhwrVar));
        zze3.zzb(zzhwrVar.zzc());
        byte[] zza2 = zzhkk.zza(zzhwrVar.zzd());
        zzicn zzicnVar = zzicn.zza;
        zze3.zzc(zzicn.zzt(zza2, 0, zza2.length));
        zze2.zzb(((zzhtn) zze3.zzbu()).zzaM());
        zze2.zzc((zzhtb) zzj.zzb(zzhwrVar.zze()));
        return zzhnf.zza((zzhsi) zze2.zzbu());
    }

    static /* synthetic */ zzhwr zzc(zzhnf zzhnfVar) {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            String zza2 = zzhnfVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhtn zzd2 = zzhtn.zzd(zzhnfVar.zzc().zzb(), zzidb.zza());
            zzhwo zzb2 = zzhwr.zzb();
            zzhky zzhkyVar = zzk;
            zzb2.zzd((zzhwp) zzhkyVar.zzc(zzd2.zza().zza()));
            zzb2.zze((zzhwp) zzhkyVar.zzc(zzd2.zza().zzb()));
            zzb2.zzb(new BigInteger(1, zzd2.zzc().zzA()));
            zzb2.zza(zzd2.zzb());
            zzb2.zzf(zzd2.zza().zzc());
            zzb2.zzc((zzhwq) zzj.zzc(zzhnfVar.zzc().zzc()));
            return zzb2.zzg();
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhwv zze(zzhne zzhneVar, zzhdx zzhdxVar) {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
            String zzg2 = zzhneVar.zzg();
            String.valueOf(zzg2);
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzg2)));
        }
        try {
            zzhtt zze2 = zzhtt.zze(zzhneVar.zzb(), zzidb.zza());
            if (zze2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zze2.zzc().zzA());
            int bitLength = bigInteger.bitLength();
            zzhwo zzb2 = zzhwr.zzb();
            zzhky zzhkyVar = zzk;
            zzb2.zzd((zzhwp) zzhkyVar.zzc(zze2.zzb().zza()));
            zzb2.zze((zzhwp) zzhkyVar.zzc(zze2.zzb().zzb()));
            zzb2.zzb(new BigInteger(1, zze2.zzd().zzA()));
            zzb2.zza(bitLength);
            zzb2.zzf(zze2.zzb().zzc());
            zzb2.zzc((zzhwq) zzj.zzc(zzhneVar.zzd()));
            zzhwr zzg3 = zzb2.zzg();
            zzhwu zzc2 = zzhwv.zzc();
            zzc2.zza(zzg3);
            zzc2.zzb(bigInteger);
            zzc2.zzc(zzhneVar.zze());
            return zzc2.zzd();
        } catch (zzieg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
        }
    }

    static /* synthetic */ zzhne zzf(zzhwt zzhwtVar, zzhdx zzhdxVar) {
        zzhtq zzk2 = zzhtr.zzk();
        zzk2.zza(0);
        zzk2.zzb(zzi(zzhwtVar.zze()));
        byte[] zza2 = zzhkk.zza(zzhwtVar.zzi().zzb(zzhdxVar));
        zzicn zzicnVar = zzicn.zza;
        zzk2.zzc(zzicn.zzt(zza2, 0, zza2.length));
        byte[] zza3 = zzhkk.zza(zzhwtVar.zzf().zzb(zzhdxVar));
        zzk2.zzd(zzicn.zzt(zza3, 0, zza3.length));
        byte[] zza4 = zzhkk.zza(zzhwtVar.zzh().zzb(zzhdxVar));
        zzk2.zze(zzicn.zzt(zza4, 0, zza4.length));
        byte[] zza5 = zzhkk.zza(zzhwtVar.zzj().zzb(zzhdxVar));
        zzk2.zzf(zzicn.zzt(zza5, 0, zza5.length));
        byte[] zza6 = zzhkk.zza(zzhwtVar.zzk().zzb(zzhdxVar));
        zzk2.zzg(zzicn.zzt(zza6, 0, zza6.length));
        byte[] zza7 = zzhkk.zza(zzhwtVar.zzl().zzb(zzhdxVar));
        zzk2.zzh(zzicn.zzt(zza7, 0, zza7.length));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", ((zzhtr) zzk2.zzbu()).zzaM(), zzhse.ASYMMETRIC_PRIVATE, (zzhtb) zzj.zzb(zzhwtVar.zzd().zze()), zzhwtVar.zze().zzb());
    }

    static /* synthetic */ zzhwt zzg(zzhne zzhneVar, zzhdx zzhdxVar) {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            String zzg2 = zzhneVar.zzg();
            String.valueOf(zzg2);
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzg2)));
        }
        try {
            zzhtr zzj2 = zzhtr.zzj(zzhneVar.zzb(), zzidb.zza());
            if (zzj2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhtt zzb2 = zzj2.zzb();
            if (zzb2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzb2.zzc().zzA());
            int bitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, zzb2.zzd().zzA());
            zzhwo zzb3 = zzhwr.zzb();
            zzhky zzhkyVar = zzk;
            zzb3.zzd((zzhwp) zzhkyVar.zzc(zzb2.zzb().zza()));
            zzb3.zze((zzhwp) zzhkyVar.zzc(zzb2.zzb().zzb()));
            zzb3.zzb(bigInteger2);
            zzb3.zza(bitLength);
            zzb3.zzf(zzb2.zzb().zzc());
            zzb3.zzc((zzhwq) zzj.zzc(zzhneVar.zzd()));
            zzhwr zzg3 = zzb3.zzg();
            zzhwu zzc2 = zzhwv.zzc();
            zzc2.zza(zzg3);
            zzc2.zzb(bigInteger);
            zzc2.zzc(zzhneVar.zze());
            zzhwv zzd2 = zzc2.zzd();
            zzhws zzc3 = zzhwt.zzc();
            zzc3.zza(zzd2);
            zzc3.zzb(zzj(zzj2.zzd(), zzhdxVar), zzj(zzj2.zze(), zzhdxVar));
            zzc3.zzc(zzj(zzj2.zzc(), zzhdxVar));
            zzc3.zzd(zzj(zzj2.zzg(), zzhdxVar), zzj(zzj2.zzh(), zzhdxVar));
            zzc3.zze(zzj(zzj2.zzi(), zzhdxVar));
            return zzc3.zzf();
        } catch (zzieg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
        }
    }

    private static zzhtp zzh(zzhwr zzhwrVar) throws GeneralSecurityException {
        zzhto zzd2 = zzhtp.zzd();
        zzhky zzhkyVar = zzk;
        zzd2.zza((zzhrw) zzhkyVar.zzb(zzhwrVar.zzf()));
        zzd2.zzb((zzhrw) zzhkyVar.zzb(zzhwrVar.zzg()));
        zzd2.zzc(zzhwrVar.zzh());
        return (zzhtp) zzd2.zzbu();
    }

    private static zzhtt zzi(zzhwv zzhwvVar) throws GeneralSecurityException {
        zzhts zzg2 = zzhtt.zzg();
        zzg2.zzb(zzh(zzhwvVar.zzf()));
        byte[] zza2 = zzhkk.zza(zzhwvVar.zzd());
        zzicn zzicnVar = zzicn.zza;
        zzg2.zzc(zzicn.zzt(zza2, 0, zza2.length));
        byte[] zza3 = zzhkk.zza(zzhwvVar.zzf().zzd());
        zzg2.zzd(zzicn.zzt(zza3, 0, zza3.length));
        zzg2.zza(0);
        return (zzhtt) zzg2.zzbu();
    }

    private static zzian zzj(zzicn zzicnVar, zzhdx zzhdxVar) {
        return zzian.zza(new BigInteger(1, zzicnVar.zzA()), zzhdxVar);
    }
}
