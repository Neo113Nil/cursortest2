package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzhhe {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zzhmq zzc;
    private static final zzhmn zzd;
    private static final zzhlm zze;
    private static final zzhlj zzf;

    static {
        zziam zza2 = zzhnq.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zza2;
        zzc = zzhmq.zzd(zzhhd.zza, zzhgz.class, zzhnf.class);
        zzd = zzhmn.zzd(zzhha.zza, zza2, zzhnf.class);
        zze = zzhlm.zzd(zzhhb.zza, zzhgv.class, zzhne.class);
        zzf = zzhlj.zzd(zzhhc.zza, zza2, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzc);
        zzhmjVar.zze(zzd);
        zzhmjVar.zzb(zze);
        zzhmjVar.zzc(zzf);
    }

    static /* synthetic */ zzhnf zzb(zzhgz zzhgzVar) {
        zzhsh zze2 = zzhsi.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zze2.zzb(zzg(zzhgzVar).zzaM());
        zze2.zzc(zzf(zzhgzVar.zzc()));
        return zzhnf.zza((zzhsi) zze2.zzbu());
    }

    static /* synthetic */ zzhgz zzc(zzhnf zzhnfVar) {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            String zza2 = zzhnfVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            return zzh(zzhta.zzc(zzhnfVar.zzc().zzb(), zzidb.zza()), zzhnfVar.zzc().zzc());
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    static /* synthetic */ zzhne zzd(zzhgv zzhgvVar, zzhdx zzhdxVar) {
        zzhsx zzd2 = zzhsy.zzd();
        zzd2.zza(zzg(zzhgvVar.zze()));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzhsy) zzd2.zzbu()).zzaM(), zzhse.REMOTE, zzf(zzhgvVar.zze().zzc()), zzhgvVar.zzb());
    }

    static /* synthetic */ zzhgv zze(zzhne zzhneVar, zzhdx zzhdxVar) {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzhsy zzc2 = zzhsy.zzc(zzhneVar.zzb(), zzidb.zza());
            if (zzc2.zza() == 0) {
                return zzhgv.zzd(zzh(zzc2.zzb(), zzhneVar.zzd()), zzhneVar.zze());
            }
            String valueOf = String.valueOf(zzc2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58);
            sb.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
            sb.append(valueOf);
            throw new GeneralSecurityException(sb.toString());
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
        }
    }

    private static zzhtb zzf(zzhgy zzhgyVar) throws GeneralSecurityException {
        if (zzhgy.zza.equals(zzhgyVar)) {
            return zzhtb.TINK;
        }
        if (zzhgy.zzb.equals(zzhgyVar)) {
            return zzhtb.RAW;
        }
        String valueOf = String.valueOf(zzhgyVar);
        String.valueOf(valueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(valueOf)));
    }

    private static zzhta zzg(zzhgz zzhgzVar) throws GeneralSecurityException {
        try {
            zzhsi zzd2 = zzhsi.zzd(zzhdz.zza(zzhgzVar.zzd()), zzidb.zza());
            zzhsz zzd3 = zzhta.zzd();
            zzd3.zza(zzhgzVar.zzb());
            zzd3.zzb(zzd2);
            return (zzhta) zzd3.zzbu();
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    private static zzhgz zzh(zzhta zzhtaVar, zzhtb zzhtbVar) throws GeneralSecurityException {
        zzhgx zzhgxVar;
        zzhgy zzhgyVar;
        zzhsh zze2 = zzhsi.zze();
        zze2.zza(zzhtaVar.zzb().zza());
        zze2.zzb(zzhtaVar.zzb().zzb());
        zze2.zzc(zzhtb.RAW);
        zzhdt zzb2 = zzhdz.zzb(((zzhsi) zze2.zzbu()).zzaN());
        if (zzb2 instanceof zzhfq) {
            zzhgxVar = zzhgx.zza;
        } else if (zzb2 instanceof zzhgf) {
            zzhgxVar = zzhgx.zzc;
        } else if (zzb2 instanceof zzhib) {
            zzhgxVar = zzhgx.zzb;
        } else if (zzb2 instanceof zzhez) {
            zzhgxVar = zzhgx.zzd;
        } else if (zzb2 instanceof zzhfh) {
            zzhgxVar = zzhgx.zze;
        } else {
            if (!(zzb2 instanceof zzhfz)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zzb2.toString()));
            }
            zzhgxVar = zzhgx.zzf;
        }
        zzhgw zzhgwVar = new zzhgw(null);
        int ordinal = zzhtbVar.ordinal();
        if (ordinal == 1) {
            zzhgyVar = zzhgy.zza;
        } else {
            if (ordinal != 3) {
                int zza2 = zzhtbVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new GeneralSecurityException(sb.toString());
            }
            zzhgyVar = zzhgy.zzb;
        }
        zzhgwVar.zza(zzhgyVar);
        zzhgwVar.zzb(zzhtaVar.zza());
        zzhgwVar.zzd((zzhel) zzb2);
        zzhgwVar.zzc(zzhgxVar);
        return zzhgwVar.zze();
    }
}
