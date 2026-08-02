package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhpf {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zzhmq zzc;
    private static final zzhmn zzd;
    private static final zzhlm zze;
    private static final zzhlj zzf;

    static {
        zziam zza2 = zzhnq.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zza2;
        zzc = zzhmq.zzd(zzhpe.zza, zzhnz.class, zzhnf.class);
        zzd = zzhmn.zzd(zzhpb.zza, zza2, zzhnf.class);
        zze = zzhlm.zzd(zzhpc.zza, zzhns.class, zzhne.class);
        zzf = zzhlj.zzd(zzhpd.zza, zza2, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzc);
        zzhmjVar.zze(zzd);
        zzhmjVar.zzb(zze);
        zzhmjVar.zzc(zzf);
    }

    static /* synthetic */ zzhnf zzb(zzhnz zzhnzVar) {
        zzhsh zze2 = zzhsi.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzhqa zzd2 = zzhqb.zzd();
        zzd2.zzb(zzh(zzhnzVar));
        zzd2.zza(zzhnzVar.zzc());
        zze2.zzb(((zzhqb) zzd2.zzbu()).zzaM());
        zze2.zzc(zzf(zzhnzVar.zzf()));
        return zzhnf.zza((zzhsi) zze2.zzbu());
    }

    static /* synthetic */ zzhnz zzc(zzhnf zzhnfVar) {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            String zza2 = zzhnfVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhqb zzc2 = zzhqb.zzc(zzhnfVar.zzc().zzb(), zzidb.zza());
            zzhnx zzb2 = zzhnz.zzb();
            zzb2.zza(zzc2.zza());
            zzb2.zzb(zzc2.zzb().zza());
            zzb2.zzc(zzg(zzhnfVar.zzc().zzc()));
            return zzb2.zzd();
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhne zzd(zzhns zzhnsVar, zzhdx zzhdxVar) {
        zzhpy zze2 = zzhpz.zze();
        zze2.zzb(zzh(zzhnsVar.zzf()));
        byte[] zzc2 = zzhnsVar.zzd().zzc(zzhdxVar);
        zze2.zza(zzicn.zzt(zzc2, 0, zzc2.length));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzhpz) zze2.zzbu()).zzaM(), zzhse.SYMMETRIC, zzf(zzhnsVar.zzf().zzf()), zzhnsVar.zzb());
    }

    static /* synthetic */ zzhns zze(zzhne zzhneVar, zzhdx zzhdxVar) {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzhpz zzd2 = zzhpz.zzd(zzhneVar.zzb(), zzidb.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhnx zzb2 = zzhnz.zzb();
            zzb2.zza(zzd2.zzb().zzb());
            zzb2.zzb(zzd2.zzc().zza());
            zzb2.zzc(zzg(zzhneVar.zzd()));
            zzhnz zzd3 = zzb2.zzd();
            zzhnr zzc2 = zzhns.zzc();
            zzc2.zza(zzd3);
            zzc2.zzb(zziao.zza(zzd2.zzb().zzA(), zzhdxVar));
            zzc2.zzc(zzhneVar.zze());
            return zzc2.zzd();
        } catch (zzieg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    private static zzhtb zzf(zzhny zzhnyVar) throws GeneralSecurityException {
        if (zzhny.zza.equals(zzhnyVar)) {
            return zzhtb.TINK;
        }
        if (zzhny.zzb.equals(zzhnyVar)) {
            return zzhtb.CRUNCHY;
        }
        if (zzhny.zzd.equals(zzhnyVar)) {
            return zzhtb.RAW;
        }
        if (zzhny.zzc.equals(zzhnyVar)) {
            return zzhtb.LEGACY;
        }
        String valueOf = String.valueOf(zzhnyVar);
        String.valueOf(valueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(valueOf)));
    }

    private static zzhny zzg(zzhtb zzhtbVar) throws GeneralSecurityException {
        int ordinal = zzhtbVar.ordinal();
        if (ordinal == 1) {
            return zzhny.zza;
        }
        if (ordinal == 2) {
            return zzhny.zzc;
        }
        if (ordinal == 3) {
            return zzhny.zzd;
        }
        if (ordinal == 4) {
            return zzhny.zzb;
        }
        int zza2 = zzhtbVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }

    private static zzhqd zzh(zzhnz zzhnzVar) {
        zzhqc zzb2 = zzhqd.zzb();
        zzb2.zza(zzhnzVar.zzd());
        return (zzhqd) zzb2.zzbu();
    }
}
