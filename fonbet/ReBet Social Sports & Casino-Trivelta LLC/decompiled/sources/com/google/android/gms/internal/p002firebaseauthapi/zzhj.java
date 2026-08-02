package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzem;
import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzhj {
    private static final zzaaj zza;
    private static final zzph<zzem, zzqe> zzb;
    private static final zzpd<zzqe> zzc;
    private static final zznx<zzej, zzqb> zzd;
    private static final zznt<zzqb> zze;

    static {
        zzaaj zzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zza = zzb2;
        zzb = zzph.zza(new zzpj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhm
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpj
            public final zzqf zza(zzcb zzcbVar) {
                zzqe zzb3;
                zzb3 = zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").zza(zzuy.zzb().zzj()).zza(zzhj.zza(((zzem) zzcbVar).zzb())).zze()));
                return zzb3;
            }
        }, zzem.class, zzqe.class);
        zzc = zzpd.zza(new zzpf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhl
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpf
            public final zzcb zza(zzqf zzqfVar) {
                zzem zzb3;
                zzb3 = zzhj.zzb((zzqe) zzqfVar);
                return zzb3;
            }
        }, zzb2, zzqe.class);
        zzd = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzho
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                zzqb zza2;
                zza2 = zzqb.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzuv) ((zzalf) zzuv.zzb().zza(zzajv.zza(r1.zze().zza(zzch.zza(zzchVar)))).zze())).zzj(), zzwx.zzb.SYMMETRIC, zzhj.zza(((zzem) ((zzcy) r1.zza())).zzb()), ((zzej) zzbiVar).zzb());
                return zza2;
            }
        }, zzej.class, zzqb.class);
        zze = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhn
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                zzej zzb3;
                zzb3 = zzhj.zzb((zzqb) zzqfVar, zzchVar);
                return zzb3;
            }
        }, zzb2, zzqb.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzej zzb(zzqb zzqbVar, zzch zzchVar) {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzuv zza2 = zzuv.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() == 0) {
                return zzej.zza(zza(zzqbVar.zzb()), zzaal.zza(zza2.zzd().zzd(), zzch.zza(zzchVar)), zzqbVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    private static zzem.zza zza(zzxz zzxzVar) {
        int i10 = zzhq.zza[zzxzVar.ordinal()];
        if (i10 == 1) {
            return zzem.zza.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzem.zza.zzb;
        }
        if (i10 == 4) {
            return zzem.zza.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzem zzb(zzqe zzqeVar) {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzuy.zza(zzqeVar.zza().zze(), zzaku.zza());
                return zzem.zza(zza(zzqeVar.zza().zzd()));
            } catch (zzall e10) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    private static zzxz zza(zzem.zza zzaVar) {
        if (zzem.zza.zza.equals(zzaVar)) {
            return zzxz.TINK;
        }
        if (zzem.zza.zzb.equals(zzaVar)) {
            return zzxz.CRUNCHY;
        }
        if (zzem.zza.zzc.equals(zzaVar)) {
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
