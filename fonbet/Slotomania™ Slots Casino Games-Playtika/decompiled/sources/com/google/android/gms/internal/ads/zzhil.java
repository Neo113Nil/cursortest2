package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhil {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zzhmq zzc;
    private static final zzhmn zzd;
    private static final zzhlm zze;
    private static final zzhlj zzf;

    static {
        zziam zza2 = zzhnq.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zza2;
        zzc = zzhmq.zzd(zzhik.zza, zzhfh.class, zzhnf.class);
        zzd = zzhmn.zzd(zzhih.zza, zza2, zzhnf.class);
        zze = zzhlm.zzd(zzhii.zza, zzhfb.class, zzhne.class);
        zzf = zzhlj.zzd(zzhij.zza, zza2, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzc);
        zzhmjVar.zze(zzd);
        zzhmjVar.zzb(zze);
        zzhmjVar.zzc(zzf);
    }

    static /* synthetic */ zzhnf zzb(zzhfh zzhfhVar) {
        zzhsh zze2 = zzhsi.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzhqq zzd2 = zzhqr.zzd();
        zzd2.zza(zzh(zzhfhVar));
        zzd2.zzb(zzhfhVar.zzc());
        zze2.zzb(((zzhqr) zzd2.zzbu()).zzaM());
        zze2.zzc(zzf(zzhfhVar.zze()));
        return zzhnf.zza((zzhsi) zze2.zzbu());
    }

    static /* synthetic */ zzhfh zzc(zzhnf zzhnfVar) {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            String zza2 = zzhnfVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhqr zzc2 = zzhqr.zzc(zzhnfVar.zzc().zzb(), zzidb.zza());
            zzhff zzb2 = zzhfh.zzb();
            zzb2.zza(zzc2.zzb());
            zzb2.zzb(zzc2.zza().zza());
            zzb2.zzc(16);
            zzb2.zzd(zzg(zzhnfVar.zzc().zzc()));
            return zzb2.zze();
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhne zzd(zzhfb zzhfbVar, zzhdx zzhdxVar) {
        zzhqo zze2 = zzhqp.zze();
        zze2.zza(zzh(zzhfbVar.zzf()));
        byte[] zzc2 = zzhfbVar.zze().zzc(zzhdxVar);
        zze2.zzb(zzicn.zzt(zzc2, 0, zzc2.length));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzhqp) zze2.zzbu()).zzaM(), zzhse.SYMMETRIC, zzf(zzhfbVar.zzf().zze()), zzhfbVar.zzb());
    }

    static /* synthetic */ zzhfb zze(zzhne zzhneVar, zzhdx zzhdxVar) {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzhqp zzd2 = zzhqp.zzd(zzhneVar.zzb(), zzidb.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhff zzb2 = zzhfh.zzb();
            zzb2.zza(zzd2.zzc().zzb());
            zzb2.zzb(zzd2.zzb().zza());
            zzb2.zzc(16);
            zzb2.zzd(zzg(zzhneVar.zzd()));
            zzhfh zze2 = zzb2.zze();
            zzhfa zzd3 = zzhfb.zzd();
            zzd3.zza(zze2);
            zzd3.zzb(zziao.zza(zzd2.zzc().zzA(), zzhdxVar));
            zzd3.zzc(zzhneVar.zze());
            return zzd3.zzd();
        } catch (zzieg unused) {
            throw new GeneralSecurityException("Parsing AesEaxKey failed");
        }
    }

    private static zzhtb zzf(zzhfg zzhfgVar) throws GeneralSecurityException {
        if (zzhfg.zza.equals(zzhfgVar)) {
            return zzhtb.TINK;
        }
        if (zzhfg.zzb.equals(zzhfgVar)) {
            return zzhtb.CRUNCHY;
        }
        if (zzhfg.zzc.equals(zzhfgVar)) {
            return zzhtb.RAW;
        }
        String valueOf = String.valueOf(zzhfgVar);
        String.valueOf(valueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(valueOf)));
    }

    private static zzhfg zzg(zzhtb zzhtbVar) throws GeneralSecurityException {
        int ordinal = zzhtbVar.ordinal();
        if (ordinal == 1) {
            return zzhfg.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzhfg.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzhtbVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhfg.zzb;
    }

    private static zzhqt zzh(zzhfh zzhfhVar) throws GeneralSecurityException {
        zzhqs zzb2 = zzhqt.zzb();
        zzb2.zza(zzhfhVar.zzd());
        return (zzhqt) zzb2.zzbu();
    }
}
