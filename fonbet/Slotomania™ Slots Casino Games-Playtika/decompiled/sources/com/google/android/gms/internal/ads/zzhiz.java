package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhiz {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zzhmq zzc;
    private static final zzhmn zzd;
    private static final zzhlm zze;
    private static final zzhlj zzf;

    static {
        zziam zza2 = zzhnq.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zza2;
        zzc = zzhmq.zzd(zzhiy.zza, zzhfz.class, zzhnf.class);
        zzd = zzhmn.zzd(zzhiv.zza, zza2, zzhnf.class);
        zze = zzhlm.zzd(zzhiw.zza, zzhfs.class, zzhne.class);
        zzf = zzhlj.zzd(zzhix.zza, zza2, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzc);
        zzhmjVar.zze(zzd);
        zzhmjVar.zzb(zze);
        zzhmjVar.zzc(zzf);
    }

    static /* synthetic */ zzhnf zzb(zzhfz zzhfzVar) {
        zzhsh zze2 = zzhsi.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzhra zzd2 = zzhrb.zzd();
        zzd2.zza(zzhfzVar.zzc());
        zze2.zzb(((zzhrb) zzd2.zzbu()).zzaM());
        zze2.zzc(zzf(zzhfzVar.zzd()));
        return zzhnf.zza((zzhsi) zze2.zzbu());
    }

    static /* synthetic */ zzhfz zzc(zzhnf zzhnfVar) {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            String zza2 = zzhnfVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhrb zzc2 = zzhrb.zzc(zzhnfVar.zzc().zzb(), zzidb.zza());
            if (zzc2.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzhfx zzb2 = zzhfz.zzb();
            zzb2.zza(zzc2.zza());
            zzb2.zzb(zzg(zzhnfVar.zzc().zzc()));
            return zzb2.zzc();
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhne zzd(zzhfs zzhfsVar, zzhdx zzhdxVar) {
        zzhqy zzd2 = zzhqz.zzd();
        byte[] zzc2 = zzhfsVar.zze().zzc(zzhdxVar);
        zzd2.zza(zzicn.zzt(zzc2, 0, zzc2.length));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzhqz) zzd2.zzbu()).zzaM(), zzhse.SYMMETRIC, zzf(zzhfsVar.zzf().zzd()), zzhfsVar.zzb());
    }

    static /* synthetic */ zzhfs zze(zzhne zzhneVar, zzhdx zzhdxVar) {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzhqz zzc2 = zzhqz.zzc(zzhneVar.zzb(), zzidb.zza());
            if (zzc2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhfx zzb2 = zzhfz.zzb();
            zzb2.zza(zzc2.zzb().zzb());
            zzb2.zzb(zzg(zzhneVar.zzd()));
            zzhfz zzc3 = zzb2.zzc();
            zzhfr zzd2 = zzhfs.zzd();
            zzd2.zza(zzc3);
            zzd2.zzb(zziao.zza(zzc2.zzb().zzA(), zzhdxVar));
            zzd2.zzc(zzhneVar.zze());
            return zzd2.zzd();
        } catch (zzieg unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    private static zzhtb zzf(zzhfy zzhfyVar) throws GeneralSecurityException {
        if (zzhfy.zza.equals(zzhfyVar)) {
            return zzhtb.TINK;
        }
        if (zzhfy.zzb.equals(zzhfyVar)) {
            return zzhtb.CRUNCHY;
        }
        if (zzhfy.zzc.equals(zzhfyVar)) {
            return zzhtb.RAW;
        }
        String valueOf = String.valueOf(zzhfyVar);
        String.valueOf(valueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(valueOf)));
    }

    private static zzhfy zzg(zzhtb zzhtbVar) throws GeneralSecurityException {
        int ordinal = zzhtbVar.ordinal();
        if (ordinal == 1) {
            return zzhfy.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzhfy.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzhtbVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhfy.zzb;
    }
}
