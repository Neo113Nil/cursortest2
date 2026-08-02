package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhpo {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zzhky zzc;
    private static final zzhky zzd;
    private static final zzhmq zze;
    private static final zzhmn zzf;
    private static final zzhlm zzg;
    private static final zzhlj zzh;

    static {
        zziam zza2 = zzhnq.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zza2;
        zzhkx zza3 = zzhky.zza();
        zza3.zza(zzhtb.RAW, zzhom.zzd);
        zza3.zza(zzhtb.TINK, zzhom.zza);
        zza3.zza(zzhtb.LEGACY, zzhom.zzc);
        zza3.zza(zzhtb.CRUNCHY, zzhom.zzb);
        zzc = zza3.zzb();
        zzhkx zza4 = zzhky.zza();
        zza4.zza(zzhrw.SHA1, zzhol.zza);
        zza4.zza(zzhrw.SHA224, zzhol.zzb);
        zza4.zza(zzhrw.SHA256, zzhol.zzc);
        zza4.zza(zzhrw.SHA384, zzhol.zzd);
        zza4.zza(zzhrw.SHA512, zzhol.zze);
        zzd = zza4.zzb();
        zze = zzhmq.zzd(zzhpn.zza, zzhon.class, zzhnf.class);
        zzf = zzhmn.zzd(zzhpk.zza, zza2, zzhnf.class);
        zzg = zzhlm.zzd(zzhpl.zza, zzhoe.class, zzhne.class);
        zzh = zzhlj.zzd(zzhpm.zza, zza2, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zze);
        zzhmjVar.zze(zzf);
        zzhmjVar.zzb(zzg);
        zzhmjVar.zzc(zzh);
    }

    static /* synthetic */ zzhnf zzb(zzhon zzhonVar) {
        zzhsh zze2 = zzhsi.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzhrz zze3 = zzhsa.zze();
        zze3.zza(zzf(zzhonVar));
        zze3.zzb(zzhonVar.zzc());
        zze2.zzb(((zzhsa) zze3.zzbu()).zzaM());
        zze2.zzc((zzhtb) zzc.zzb(zzhonVar.zzf()));
        return zzhnf.zza((zzhsi) zze2.zzbu());
    }

    static /* synthetic */ zzhon zzc(zzhnf zzhnfVar) {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            String zza2 = zzhnfVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhsa zzd2 = zzhsa.zzd(zzhnfVar.zzc().zzb(), zzidb.zza());
            if (zzd2.zzc() != 0) {
                int zzc2 = zzd2.zzc();
                StringBuilder sb = new StringBuilder(String.valueOf(zzc2).length() + 47);
                sb.append("Parsing HmacParameters failed: unknown Version ");
                sb.append(zzc2);
                throw new GeneralSecurityException(sb.toString());
            }
            zzhok zzb2 = zzhon.zzb();
            zzb2.zza(zzd2.zzb());
            zzb2.zzb(zzd2.zza().zzb());
            zzb2.zzd((zzhol) zzd.zzc(zzd2.zza().zza()));
            zzb2.zzc((zzhom) zzc.zzc(zzhnfVar.zzc().zzc()));
            return zzb2.zze();
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhne zzd(zzhoe zzhoeVar, zzhdx zzhdxVar) {
        zzhrx zze2 = zzhry.zze();
        zze2.zza(zzf(zzhoeVar.zzf()));
        byte[] zzc2 = zzhoeVar.zzd().zzc(zzhdxVar);
        zze2.zzb(zzicn.zzt(zzc2, 0, zzc2.length));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzhry) zze2.zzbu()).zzaM(), zzhse.SYMMETRIC, (zzhtb) zzc.zzb(zzhoeVar.zzf().zzf()), zzhoeVar.zzb());
    }

    static /* synthetic */ zzhoe zze(zzhne zzhneVar, zzhdx zzhdxVar) {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzhry zzd2 = zzhry.zzd(zzhneVar.zzb(), zzidb.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhok zzb2 = zzhon.zzb();
            zzb2.zza(zzd2.zzc().zzb());
            zzb2.zzb(zzd2.zzb().zzb());
            zzb2.zzd((zzhol) zzd.zzc(zzd2.zzb().zza()));
            zzb2.zzc((zzhom) zzc.zzc(zzhneVar.zzd()));
            zzhon zze2 = zzb2.zze();
            zzhod zzc2 = zzhoe.zzc();
            zzc2.zza(zze2);
            zzc2.zzb(zziao.zza(zzd2.zzc().zzA(), zzhdxVar));
            zzc2.zzc(zzhneVar.zze());
            return zzc2.zzd();
        } catch (zzieg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    private static zzhsc zzf(zzhon zzhonVar) throws GeneralSecurityException {
        zzhsb zzc2 = zzhsc.zzc();
        zzc2.zzb(zzhonVar.zzd());
        zzc2.zza((zzhrw) zzd.zzb(zzhonVar.zzg()));
        return (zzhsc) zzc2.zzbu();
    }
}
