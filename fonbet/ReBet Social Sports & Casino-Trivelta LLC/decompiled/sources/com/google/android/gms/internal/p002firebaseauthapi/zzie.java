package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzfz;
import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzie {
    private static final zzaaj zza;
    private static final zzph<zzfz, zzqe> zzb;
    private static final zzpd<zzqe> zzc;
    private static final zznx<zzfw, zzqb> zzd;
    private static final zznt<zzqb> zze;

    static {
        zzaaj zzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zza = zzb2;
        zzb = zzph.zza(new zzpj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzid
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpj
            public final zzqf zza(zzcb zzcbVar) {
                zzqe zzb3;
                zzb3 = zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.XAesGcmKey").zza(((zzyi) ((zzalf) zzyi.zzb().zza((zzyl) ((zzalf) zzyl.zzb().zza(r1.zzb()).zze())).zze())).zzj()).zza(zzie.zza(((zzfz) zzcbVar).zzc())).zze()));
                return zzb3;
            }
        }, zzfz.class, zzqe.class);
        zzc = zzpd.zza(new zzpf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzig
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpf
            public final zzcb zza(zzqf zzqfVar) {
                zzfz zzb3;
                zzb3 = zzie.zzb((zzqe) zzqfVar);
                return zzb3;
            }
        }, zzb2, zzqe.class);
        zzd = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzif
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                zzqb zza2;
                zza2 = zzqb.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzyf) ((zzalf) zzyf.zzb().zza(zzajv.zza(r1.zze().zza(zzch.zza(zzchVar)))).zza((zzyl) ((zzalf) zzyl.zzb().zza(((zzfz) ((zzcy) r1.zza())).zzb()).zze())).zze())).zzj(), zzwx.zzb.SYMMETRIC, zzie.zza(((zzfz) ((zzcy) r1.zza())).zzc()), ((zzfw) zzbiVar).zzb());
                return zza2;
            }
        }, zzfw.class, zzqb.class);
        zze = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzii
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                zzfw zzb3;
                zzb3 = zzie.zzb((zzqb) zzqfVar, zzchVar);
                return zzb3;
            }
        }, zzb2, zzqb.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfw zzb(zzqb zzqbVar, zzch zzchVar) {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            zzyf zza2 = zzyf.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zza2.zze().zzb() == 32) {
                return zzfw.zza(zzfz.zza(zza(zzqbVar.zzb()), zza2.zzd().zza()), zzaal.zza(zza2.zze().zzd(), zzch.zza(zzchVar)), zzqbVar.zze());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    private static zzfz.zza zza(zzxz zzxzVar) {
        int i10 = zzih.zza[zzxzVar.ordinal()];
        if (i10 == 1) {
            return zzfz.zza.zza;
        }
        if (i10 == 2) {
            return zzfz.zza.zzb;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfz zzb(zzqe zzqeVar) {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            try {
                zzyi zza2 = zzyi.zza(zzqeVar.zza().zze(), zzaku.zza());
                if (zza2.zza() == 0) {
                    return zzfz.zza(zza(zzqeVar.zza().zzd()), zza2.zzd().zza());
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzall e10) {
                throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    private static zzxz zza(zzfz.zza zzaVar) {
        if (Objects.equals(zzaVar, zzfz.zza.zza)) {
            return zzxz.TINK;
        }
        if (Objects.equals(zzaVar, zzfz.zza.zzb)) {
            return zzxz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzaVar));
    }

    public static void zza() {
        zzoz zza2 = zzoz.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
