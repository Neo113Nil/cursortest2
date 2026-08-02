package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhjf {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zzhmq zzc;
    private static final zzhmn zzd;
    private static final zzhlm zze;
    private static final zzhlj zzf;

    static {
        zziam zza2 = zzhnq.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zza2;
        zzc = zzhmq.zzd(zzhje.zza, zzhgf.class, zzhnf.class);
        zzd = zzhmn.zzd(zzhjb.zza, zza2, zzhnf.class);
        zze = zzhlm.zzd(zzhjc.zza, zzhga.class, zzhne.class);
        zzf = zzhlj.zzd(zzhjd.zza, zza2, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzc);
        zzhmjVar.zze(zzd);
        zzhmjVar.zzb(zze);
        zzhmjVar.zzc(zzf);
    }

    static /* synthetic */ zzhnf zzb(zzhgf zzhgfVar) {
        zzhsh zze2 = zzhsi.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zze2.zzb(zzhrf.zzb().zzaM());
        zze2.zzc(zzf(zzhgfVar.zzc()));
        return zzhnf.zza((zzhsi) zze2.zzbu());
    }

    static /* synthetic */ zzhgf zzc(zzhnf zzhnfVar) {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            String zza2 = zzhnfVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhrf.zza(zzhnfVar.zzc().zzb(), zzidb.zza());
            return zzhgf.zzb(zzg(zzhnfVar.zzc().zzc()));
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
        }
    }

    static /* synthetic */ zzhne zzd(zzhga zzhgaVar, zzhdx zzhdxVar) {
        zzhrc zzd2 = zzhrd.zzd();
        byte[] zzc2 = zzhgaVar.zze().zzc(zzhdxVar);
        zzd2.zza(zzicn.zzt(zzc2, 0, zzc2.length));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzhrd) zzd2.zzbu()).zzaM(), zzhse.SYMMETRIC, zzf(zzhgaVar.zzf().zzc()), zzhgaVar.zzb());
    }

    static /* synthetic */ zzhga zze(zzhne zzhneVar, zzhdx zzhdxVar) {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzhrd zzc2 = zzhrd.zzc(zzhneVar.zzb(), zzidb.zza());
            if (zzc2.zza() == 0) {
                return zzhga.zzd(zzg(zzhneVar.zzd()), zziao.zza(zzc2.zzb().zzA(), zzhdxVar), zzhneVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzieg unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    private static zzhtb zzf(zzhge zzhgeVar) throws GeneralSecurityException {
        if (zzhge.zza.equals(zzhgeVar)) {
            return zzhtb.TINK;
        }
        if (zzhge.zzb.equals(zzhgeVar)) {
            return zzhtb.CRUNCHY;
        }
        if (zzhge.zzc.equals(zzhgeVar)) {
            return zzhtb.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhgeVar.toString()));
    }

    private static zzhge zzg(zzhtb zzhtbVar) throws GeneralSecurityException {
        int ordinal = zzhtbVar.ordinal();
        if (ordinal == 1) {
            return zzhge.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzhge.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzhtbVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhge.zzb;
    }
}
