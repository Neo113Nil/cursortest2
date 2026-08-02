package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzhgu {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zzhmq zzc;
    private static final zzhmn zzd;
    private static final zzhlm zze;
    private static final zzhlj zzf;

    static {
        zziam zza2 = zzhnq.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zza2;
        zzc = zzhmq.zzd(zzhgt.zza, zzhgp.class, zzhnf.class);
        zzd = zzhmn.zzd(zzhgq.zza, zza2, zzhnf.class);
        zze = zzhlm.zzd(zzhgr.zza, zzhgn.class, zzhne.class);
        zzf = zzhlj.zzd(zzhgs.zza, zza2, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzc);
        zzhmjVar.zze(zzd);
        zzhmjVar.zzb(zze);
        zzhmjVar.zzc(zzf);
    }

    static /* synthetic */ zzhnf zzb(zzhgp zzhgpVar) {
        zzhsh zze2 = zzhsi.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzhsv zzc2 = zzhsw.zzc();
        zzc2.zza(zzhgpVar.zzc());
        zze2.zzb(((zzhsw) zzc2.zzbu()).zzaM());
        zze2.zzc(zzf(zzhgpVar.zzd()));
        return zzhnf.zza((zzhsi) zze2.zzbu());
    }

    static /* synthetic */ zzhgp zzc(zzhnf zzhnfVar) {
        if (zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return zzhgp.zzb(zzhsw.zzb(zzhnfVar.zzc().zzb(), zzidb.zza()).zza(), zzg(zzhnfVar.zzc().zzc()));
            } catch (zzieg e) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
            }
        }
        String zza2 = zzhnfVar.zzc().zza();
        String.valueOf(zza2);
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
    }

    static /* synthetic */ zzhne zzd(zzhgn zzhgnVar, zzhdx zzhdxVar) {
        zzhst zzd2 = zzhsu.zzd();
        zzhsv zzc2 = zzhsw.zzc();
        zzc2.zza(zzhgnVar.zze().zzc());
        zzd2.zza((zzhsw) zzc2.zzbu());
        return zzhne.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzhsu) zzd2.zzbu()).zzaM(), zzhse.REMOTE, zzf(zzhgnVar.zze().zzd()), zzhgnVar.zzb());
    }

    static /* synthetic */ zzhgn zze(zzhne zzhneVar, zzhdx zzhdxVar) {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzhsu zzc2 = zzhsu.zzc(zzhneVar.zzb(), zzidb.zza());
            if (zzc2.zza() == 0) {
                return zzhgn.zzd(zzhgp.zzb(zzc2.zzb().zza(), zzg(zzhneVar.zzd())), zzhneVar.zze());
            }
            String valueOf = String.valueOf(zzc2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb.append("KmsAeadKey are only accepted with version 0, got ");
            sb.append(valueOf);
            throw new GeneralSecurityException(sb.toString());
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
        }
    }

    private static zzhtb zzf(zzhgo zzhgoVar) throws GeneralSecurityException {
        if (zzhgo.zza.equals(zzhgoVar)) {
            return zzhtb.TINK;
        }
        if (zzhgo.zzb.equals(zzhgoVar)) {
            return zzhtb.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhgoVar.toString()));
    }

    private static zzhgo zzg(zzhtb zzhtbVar) throws GeneralSecurityException {
        int ordinal = zzhtbVar.ordinal();
        if (ordinal == 1) {
            return zzhgo.zza;
        }
        if (ordinal == 3) {
            return zzhgo.zzb;
        }
        int zza2 = zzhtbVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }
}
