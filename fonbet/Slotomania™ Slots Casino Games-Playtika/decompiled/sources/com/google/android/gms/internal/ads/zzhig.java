package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhig {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zzhmq zzc;
    private static final zzhmn zzd;
    private static final zzhlm zze;
    private static final zzhlj zzf;

    static {
        zziam zza2 = zzhnq.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zza2;
        zzc = zzhmq.zzd(zzhif.zza, zzhez.class, zzhnf.class);
        zzd = zzhmn.zzd(zzhic.zza, zza2, zzhnf.class);
        zze = zzhlm.zzd(zzhid.zza, zzher.class, zzhne.class);
        zzf = zzhlj.zzd(zzhie.zza, zza2, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzc);
        zzhmjVar.zze(zzd);
        zzhmjVar.zzb(zze);
        zzhmjVar.zzc(zzf);
    }

    static /* synthetic */ zzhnf zzb(zzhez zzhezVar) {
        zzhsh zze2 = zzhsi.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzhqg zzd2 = zzhqh.zzd();
        zzhqk zzc2 = zzhql.zzc();
        zzhqm zzb2 = zzhqn.zzb();
        zzb2.zza(zzhezVar.zzf());
        zzc2.zza((zzhqn) zzb2.zzbu());
        zzc2.zzb(zzhezVar.zzc());
        zzd2.zza((zzhql) zzc2.zzbu());
        zzhrz zze3 = zzhsa.zze();
        zze3.zza(zzi(zzhezVar));
        zze3.zzb(zzhezVar.zzd());
        zzd2.zzb((zzhsa) zze3.zzbu());
        zze2.zzb(((zzhqh) zzd2.zzbu()).zzaM());
        zze2.zzc(zzf(zzhezVar.zzg()));
        return zzhnf.zza((zzhsi) zze2.zzbu());
    }

    static /* synthetic */ zzhez zzc(zzhnf zzhnfVar) {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            String zza2 = zzhnfVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhqh zzc2 = zzhqh.zzc(zzhnfVar.zzc().zzb(), zzidb.zza());
            if (zzc2.zzb().zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhew zzb2 = zzhez.zzb();
            zzb2.zza(zzc2.zza().zzb());
            zzb2.zzb(zzc2.zzb().zzb());
            zzb2.zzc(zzc2.zza().zza().zza());
            zzb2.zzd(zzc2.zzb().zza().zzb());
            zzb2.zzf(zzh(zzc2.zzb().zza().zza()));
            zzb2.zze(zzg(zzhnfVar.zzc().zzc()));
            return zzb2.zzg();
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhne zzd(zzher zzherVar, zzhdx zzhdxVar) {
        zzhqe zze2 = zzhqf.zze();
        zzhqi zzd2 = zzhqj.zzd();
        zzhqm zzb2 = zzhqn.zzb();
        zzb2.zza(zzherVar.zzg().zzf());
        zzd2.zza((zzhqn) zzb2.zzbu());
        byte[] zzc2 = zzherVar.zze().zzc(zzhdxVar);
        zzd2.zzb(zzicn.zzt(zzc2, 0, zzc2.length));
        zze2.zza((zzhqj) zzd2.zzbu());
        zzhrx zze3 = zzhry.zze();
        zze3.zza(zzi(zzherVar.zzg()));
        byte[] zzc3 = zzherVar.zzf().zzc(zzhdxVar);
        zze3.zzb(zzicn.zzt(zzc3, 0, zzc3.length));
        zze2.zzb((zzhry) zze3.zzbu());
        return zzhne.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzhqf) zze2.zzbu()).zzaM(), zzhse.SYMMETRIC, zzf(zzherVar.zzg().zzg()), zzherVar.zzb());
    }

    static /* synthetic */ zzher zze(zzhne zzhneVar, zzhdx zzhdxVar) {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzhqf zzd2 = zzhqf.zzd(zzhneVar.zzb(), zzidb.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzd2.zzb().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zzd2.zzc().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            zzhew zzb2 = zzhez.zzb();
            zzb2.zza(zzd2.zzb().zzc().zzb());
            zzb2.zzb(zzd2.zzc().zzc().zzb());
            zzb2.zzc(zzd2.zzb().zzb().zza());
            zzb2.zzd(zzd2.zzc().zzb().zzb());
            zzb2.zzf(zzh(zzd2.zzc().zzb().zza()));
            zzb2.zze(zzg(zzhneVar.zzd()));
            zzhez zzg = zzb2.zzg();
            zzheq zzd3 = zzher.zzd();
            zzd3.zza(zzg);
            zzd3.zzb(zziao.zza(zzd2.zzb().zzc().zzA(), zzhdxVar));
            zzd3.zzc(zziao.zza(zzd2.zzc().zzc().zzA(), zzhdxVar));
            zzd3.zzd(zzhneVar.zze());
            return zzd3.zze();
        } catch (zzieg unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    private static zzhtb zzf(zzhey zzheyVar) throws GeneralSecurityException {
        if (zzhey.zza.equals(zzheyVar)) {
            return zzhtb.TINK;
        }
        if (zzhey.zzb.equals(zzheyVar)) {
            return zzhtb.CRUNCHY;
        }
        if (zzhey.zzc.equals(zzheyVar)) {
            return zzhtb.RAW;
        }
        String valueOf = String.valueOf(zzheyVar);
        String.valueOf(valueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(valueOf)));
    }

    private static zzhey zzg(zzhtb zzhtbVar) throws GeneralSecurityException {
        int ordinal = zzhtbVar.ordinal();
        if (ordinal == 1) {
            return zzhey.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzhey.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzhtbVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhey.zzb;
    }

    private static zzhex zzh(zzhrw zzhrwVar) throws GeneralSecurityException {
        int ordinal = zzhrwVar.ordinal();
        if (ordinal == 1) {
            return zzhex.zza;
        }
        if (ordinal == 2) {
            return zzhex.zzd;
        }
        if (ordinal == 3) {
            return zzhex.zzc;
        }
        if (ordinal == 4) {
            return zzhex.zze;
        }
        if (ordinal == 5) {
            return zzhex.zzb;
        }
        int zza2 = zzhrwVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 26);
        sb.append("Unable to parse HashType: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }

    private static zzhsc zzi(zzhez zzhezVar) throws GeneralSecurityException {
        zzhrw zzhrwVar;
        zzhsb zzc2 = zzhsc.zzc();
        zzc2.zzb(zzhezVar.zze());
        zzhex zzh = zzhezVar.zzh();
        if (zzhex.zza.equals(zzh)) {
            zzhrwVar = zzhrw.SHA1;
        } else if (zzhex.zzb.equals(zzh)) {
            zzhrwVar = zzhrw.SHA224;
        } else if (zzhex.zzc.equals(zzh)) {
            zzhrwVar = zzhrw.SHA256;
        } else if (zzhex.zzd.equals(zzh)) {
            zzhrwVar = zzhrw.SHA384;
        } else {
            if (!zzhex.zze.equals(zzh)) {
                String valueOf = String.valueOf(zzh);
                String.valueOf(valueOf);
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(valueOf)));
            }
            zzhrwVar = zzhrw.SHA512;
        }
        zzc2.zza(zzhrwVar);
        return (zzhsc) zzc2.zzbu();
    }
}
