package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhju {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zzhmq zzc;
    private static final zzhmn zzd;
    private static final zzhlm zze;
    private static final zzhlj zzf;

    static {
        zziam zza2 = zzhnq.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzb = zza2;
        zzc = zzhmq.zzd(zzhjt.zza, zzhhu.class, zzhnf.class);
        zzd = zzhmn.zzd(zzhjq.zza, zza2, zzhnf.class);
        zze = zzhlm.zzd(zzhjr.zza, zzhhp.class, zzhne.class);
        zzf = zzhlj.zzd(zzhjs.zza, zza2, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzc);
        zzhmjVar.zze(zzd);
        zzhmjVar.zzb(zze);
        zzhmjVar.zzc(zzf);
    }

    static /* synthetic */ zzhnf zzb(zzhhu zzhhuVar) {
        zzhsh zze2 = zzhsi.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzhtw zzd2 = zzhtx.zzd();
        zzhty zzb2 = zzhtz.zzb();
        zzb2.zza(zzhhuVar.zzd());
        zzd2.zza((zzhtz) zzb2.zzbu());
        zze2.zzb(((zzhtx) zzd2.zzbu()).zzaM());
        zze2.zzc(zzf(zzhhuVar.zzc()));
        return zzhnf.zza((zzhsi) zze2.zzbu());
    }

    static /* synthetic */ zzhhu zzc(zzhnf zzhnfVar) {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            String zza2 = zzhnfVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhtx zzc2 = zzhtx.zzc(zzhnfVar.zzc().zzb(), zzidb.zza());
            if (zzc2.zza() == 0) {
                return zzhhu.zzb(zzg(zzhnfVar.zzc().zzc()), zzc2.zzb().zza());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhne zzd(zzhhp zzhhpVar, zzhdx zzhdxVar) {
        zzhtu zze2 = zzhtv.zze();
        byte[] zzc2 = zzhhpVar.zze().zzc(zzhdxVar);
        zze2.zzb(zzicn.zzt(zzc2, 0, zzc2.length));
        zzhty zzb2 = zzhtz.zzb();
        zzb2.zza(zzhhpVar.zzf().zzd());
        zze2.zza((zzhtz) zzb2.zzbu());
        return zzhne.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzhtv) zze2.zzbu()).zzaM(), zzhse.SYMMETRIC, zzf(zzhhpVar.zzf().zzc()), zzhhpVar.zzb());
    }

    static /* synthetic */ zzhhp zze(zzhne zzhneVar, zzhdx zzhdxVar) {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            zzhtv zzd2 = zzhtv.zzd(zzhneVar.zzb(), zzidb.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzd2.zzc().zzb() == 32) {
                return zzhhp.zzd(zzhhu.zzb(zzg(zzhneVar.zzd()), zzd2.zzb().zza()), zziao.zza(zzd2.zzc().zzA(), zzhdxVar), zzhneVar.zze());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (zzieg unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    private static zzhtb zzf(zzhht zzhhtVar) throws GeneralSecurityException {
        if (Objects.equals(zzhhtVar, zzhht.zza)) {
            return zzhtb.TINK;
        }
        if (Objects.equals(zzhhtVar, zzhht.zzb)) {
            return zzhtb.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhhtVar.toString()));
    }

    private static zzhht zzg(zzhtb zzhtbVar) throws GeneralSecurityException {
        int ordinal = zzhtbVar.ordinal();
        if (ordinal == 1) {
            return zzhht.zza;
        }
        if (ordinal == 3) {
            return zzhht.zzb;
        }
        int zza2 = zzhtbVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }
}
