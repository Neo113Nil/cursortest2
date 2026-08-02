package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhxt {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zziam zzc;
    private static final zzhmq zzd;
    private static final zzhmn zze;
    private static final zzhlm zzf;
    private static final zzhlj zzg;
    private static final zzhlm zzh;
    private static final zzhlj zzi;
    private static final zzhky zzj;

    static {
        zziam zza2 = zzhnq.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        zzb = zza2;
        zziam zza3 = zzhnq.zza("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        zzc = zza3;
        zzd = zzhmq.zzd(zzhxs.zza, zzhut.class, zzhnf.class);
        zze = zzhmn.zzd(zzhxn.zza, zza2, zzhnf.class);
        zzf = zzhlm.zzd(zzhxo.zza, zzhva.class, zzhne.class);
        zzg = zzhlj.zzd(zzhxp.zza, zza3, zzhne.class);
        zzh = zzhlm.zzd(zzhxq.zza, zzhuu.class, zzhne.class);
        zzi = zzhlj.zzd(zzhxr.zza, zza2, zzhne.class);
        zzhkx zza4 = zzhky.zza();
        zza4.zza(zzhtb.RAW, zzhus.zzd);
        zza4.zza(zzhtb.TINK, zzhus.zza);
        zza4.zza(zzhtb.CRUNCHY, zzhus.zzb);
        zza4.zza(zzhtb.LEGACY, zzhus.zzc);
        zzj = zza4.zzb();
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzd);
        zzhmjVar.zze(zze);
        zzhmjVar.zzb(zzf);
        zzhmjVar.zzc(zzg);
        zzhmjVar.zzb(zzh);
        zzhmjVar.zzc(zzi);
    }

    static /* synthetic */ zzhnf zzb(zzhut zzhutVar) {
        zzhsh zze2 = zzhsi.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        zze2.zzb(zzhrq.zzc().zzaM());
        zze2.zzc((zzhtb) zzj.zzb(zzhutVar.zzc()));
        return zzhnf.zza((zzhsi) zze2.zzbu());
    }

    static /* synthetic */ zzhut zzc(zzhnf zzhnfVar) {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            String zza2 = zzhnfVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            if (zzhrq.zzb(zzhnfVar.zzc().zzb(), zzidb.zza()).zza() == 0) {
                return zzhut.zzb((zzhus) zzj.zzc(zzhnfVar.zzc().zzc()));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e);
        }
    }

    static /* synthetic */ zzhva zze(zzhne zzhneVar, zzhdx zzhdxVar) {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
            String zzg2 = zzhneVar.zzg();
            String.valueOf(zzg2);
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzg2)));
        }
        try {
            zzhru zzc2 = zzhru.zzc(zzhneVar.zzb(), zzidb.zza());
            if (zzc2.zza() == 0) {
                return zzhva.zzc((zzhus) zzj.zzc(zzhneVar.zzd()), zziam.zza(zzc2.zzb().zzA()), zzhneVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzieg unused) {
            throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
        }
    }

    static /* synthetic */ zzhne zzf(zzhuu zzhuuVar, zzhdx zzhdxVar) {
        zzhrr zze2 = zzhrs.zze();
        zze2.zzb(zzh(zzhuuVar.zze()));
        byte[] zzc2 = zzhuuVar.zzf().zzc(zzhdxVar);
        zze2.zza(zzicn.zzt(zzc2, 0, zzc2.length));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", ((zzhrs) zze2.zzbu()).zzaM(), zzhse.ASYMMETRIC_PRIVATE, (zzhtb) zzj.zzb(zzhuuVar.zzd().zzc()), zzhuuVar.zze().zzb());
    }

    static /* synthetic */ zzhuu zzg(zzhne zzhneVar, zzhdx zzhdxVar) {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            String zzg2 = zzhneVar.zzg();
            String.valueOf(zzg2);
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzg2)));
        }
        try {
            zzhrs zzd2 = zzhrs.zzd(zzhneVar.zzb(), zzidb.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhru zzc2 = zzd2.zzc();
            if (zzc2.zza() == 0) {
                return zzhuu.zzc(zzhva.zzc((zzhus) zzj.zzc(zzhneVar.zzd()), zziam.zza(zzc2.zzb().zzA()), zzhneVar.zze()), zziao.zza(zzd2.zzb().zzA(), zzhdxVar));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzieg unused) {
            throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
        }
    }

    private static zzhru zzh(zzhva zzhvaVar) {
        zzhrt zzd2 = zzhru.zzd();
        byte[] zzc2 = zzhvaVar.zzd().zzc();
        zzd2.zza(zzicn.zzt(zzc2, 0, zzc2.length));
        return (zzhru) zzd2.zzbu();
    }
}
