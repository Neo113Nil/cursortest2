package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhis {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zzhmq zzc;
    private static final zzhmn zzd;
    private static final zzhlm zze;
    private static final zzhlj zzf;

    static {
        zziam zza2 = zzhnq.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zza2;
        zzc = zzhmq.zzd(zzhir.zza, zzhfq.class, zzhnf.class);
        zzd = zzhmn.zzd(zzhio.zza, zza2, zzhnf.class);
        zze = zzhlm.zzd(zzhip.zza, zzhfj.class, zzhne.class);
        zzf = zzhlj.zzd(zzhiq.zza, zza2, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzc);
        zzhmjVar.zze(zzd);
        zzhmjVar.zzb(zze);
        zzhmjVar.zzc(zzf);
    }

    static /* synthetic */ zzhnf zzb(zzhfq zzhfqVar) {
        zzhsh zze2 = zzhsi.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzhqw zzd2 = zzhqx.zzd();
        zzd2.zza(zzhfqVar.zzc());
        zze2.zzb(((zzhqx) zzd2.zzbu()).zzaM());
        zze2.zzc(zzf(zzhfqVar.zzd()));
        return zzhnf.zza((zzhsi) zze2.zzbu());
    }

    static /* synthetic */ zzhfq zzc(zzhnf zzhnfVar) {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            String zza2 = zzhnfVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhqx zzc2 = zzhqx.zzc(zzhnfVar.zzc().zzb(), zzidb.zza());
            if (zzc2.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzhfo zzb2 = zzhfq.zzb();
            zzb2.zza(zzc2.zza());
            zzb2.zzb(12);
            zzb2.zzc(16);
            zzb2.zzd(zzg(zzhnfVar.zzc().zzc()));
            return zzb2.zze();
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhne zzd(zzhfj zzhfjVar, zzhdx zzhdxVar) {
        zzhqu zzd2 = zzhqv.zzd();
        byte[] zzc2 = zzhfjVar.zze().zzc(zzhdxVar);
        zzd2.zza(zzicn.zzt(zzc2, 0, zzc2.length));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzhqv) zzd2.zzbu()).zzaM(), zzhse.SYMMETRIC, zzf(zzhfjVar.zzf().zzd()), zzhfjVar.zzb());
    }

    static /* synthetic */ zzhfj zze(zzhne zzhneVar, zzhdx zzhdxVar) {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzhqv zzc2 = zzhqv.zzc(zzhneVar.zzb(), zzidb.zza());
            if (zzc2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhfo zzb2 = zzhfq.zzb();
            zzb2.zza(zzc2.zzb().zzb());
            zzb2.zzb(12);
            zzb2.zzc(16);
            zzb2.zzd(zzg(zzhneVar.zzd()));
            zzhfq zze2 = zzb2.zze();
            zzhfi zzd2 = zzhfj.zzd();
            zzd2.zza(zze2);
            zzd2.zzb(zziao.zza(zzc2.zzb().zzA(), zzhdxVar));
            zzd2.zzc(zzhneVar.zze());
            return zzd2.zzd();
        } catch (zzieg unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    private static zzhtb zzf(zzhfp zzhfpVar) throws GeneralSecurityException {
        if (zzhfp.zza.equals(zzhfpVar)) {
            return zzhtb.TINK;
        }
        if (zzhfp.zzb.equals(zzhfpVar)) {
            return zzhtb.CRUNCHY;
        }
        if (zzhfp.zzc.equals(zzhfpVar)) {
            return zzhtb.RAW;
        }
        String valueOf = String.valueOf(zzhfpVar);
        String.valueOf(valueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(valueOf)));
    }

    private static zzhfp zzg(zzhtb zzhtbVar) throws GeneralSecurityException {
        int ordinal = zzhtbVar.ordinal();
        if (ordinal == 1) {
            return zzhfp.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzhfp.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzhtbVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhfp.zzb;
    }
}
