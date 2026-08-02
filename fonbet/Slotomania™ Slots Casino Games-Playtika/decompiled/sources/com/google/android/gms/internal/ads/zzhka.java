package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhka {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zzhmq zzc;
    private static final zzhmn zzd;
    private static final zzhlm zze;
    private static final zzhlj zzf;

    static {
        zziam zza2 = zzhnq.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zza2;
        zzc = zzhmq.zzd(zzhjz.zza, zzhib.class, zzhnf.class);
        zzd = zzhmn.zzd(zzhjw.zza, zza2, zzhnf.class);
        zze = zzhlm.zzd(zzhjx.zza, zzhhv.class, zzhne.class);
        zzf = zzhlj.zzd(zzhjy.zza, zza2, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzc);
        zzhmjVar.zze(zzd);
        zzhmjVar.zzb(zze);
        zzhmjVar.zzc(zzf);
    }

    static /* synthetic */ zzhnf zzb(zzhib zzhibVar) {
        zzhsh zze2 = zzhsi.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zze2.zzb(zzhud.zzc().zzaM());
        zze2.zzc(zzf(zzhibVar.zzc()));
        return zzhnf.zza((zzhsi) zze2.zzbu());
    }

    static /* synthetic */ zzhib zzc(zzhnf zzhnfVar) {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            String zza2 = zzhnfVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            if (zzhud.zzb(zzhnfVar.zzc().zzb(), zzidb.zza()).zza() == 0) {
                return zzhib.zzb(zzg(zzhnfVar.zzc().zzc()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
        }
    }

    static /* synthetic */ zzhne zzd(zzhhv zzhhvVar, zzhdx zzhdxVar) {
        zzhua zzd2 = zzhub.zzd();
        byte[] zzc2 = zzhhvVar.zze().zzc(zzhdxVar);
        zzd2.zza(zzicn.zzt(zzc2, 0, zzc2.length));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzhub) zzd2.zzbu()).zzaM(), zzhse.SYMMETRIC, zzf(zzhhvVar.zzf().zzc()), zzhhvVar.zzb());
    }

    static /* synthetic */ zzhhv zze(zzhne zzhneVar, zzhdx zzhdxVar) {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzhub zzc2 = zzhub.zzc(zzhneVar.zzb(), zzidb.zza());
            if (zzc2.zza() == 0) {
                return zzhhv.zzd(zzg(zzhneVar.zzd()), zziao.zza(zzc2.zzb().zzA(), zzhdxVar), zzhneVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzieg unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    private static zzhtb zzf(zzhia zzhiaVar) throws GeneralSecurityException {
        if (zzhia.zza.equals(zzhiaVar)) {
            return zzhtb.TINK;
        }
        if (zzhia.zzb.equals(zzhiaVar)) {
            return zzhtb.CRUNCHY;
        }
        if (zzhia.zzc.equals(zzhiaVar)) {
            return zzhtb.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhiaVar.toString()));
    }

    private static zzhia zzg(zzhtb zzhtbVar) throws GeneralSecurityException {
        int ordinal = zzhtbVar.ordinal();
        if (ordinal == 1) {
            return zzhia.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzhia.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzhtbVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhia.zzb;
    }
}
