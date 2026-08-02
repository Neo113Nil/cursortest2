package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzjf;
import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzjs {
    private static final zzaaj zza;
    private static final zzph<zzjf, zzqe> zzb;
    private static final zzpd<zzqe> zzc;
    private static final zznx<zzja, zzqb> zzd;
    private static final zznt<zzqb> zze;
    private static final Map<zzjf.zza, zzxz> zzf;
    private static final Map<zzxz, zzjf.zza> zzg;

    static {
        zzaaj zzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.AesSivKey");
        zza = zzb2;
        zzb = zzph.zza(new zzpj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjr
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpj
            public final zzqf zza(zzcb zzcbVar) {
                zzqe zzb3;
                zzb3 = zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.AesSivKey").zza(((zzus) ((zzalf) zzus.zzc().zza(r1.zzb()).zze())).zzj()).zza(zzjs.zza(((zzjf) zzcbVar).zzd())).zze()));
                return zzb3;
            }
        }, zzjf.class, zzqe.class);
        zzc = zzpd.zza(new zzpf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzju
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpf
            public final zzcb zza(zzqf zzqfVar) {
                zzjf zzb3;
                zzb3 = zzjs.zzb((zzqe) zzqfVar);
                return zzb3;
            }
        }, zzb2, zzqe.class);
        zzd = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjt
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                zzqb zza2;
                zza2 = zzqb.zza("type.googleapis.com/google.crypto.tink.AesSivKey", ((zzup) ((zzalf) zzup.zzb().zza(zzajv.zza(r1.zzf().zza(zzch.zza(zzchVar)))).zze())).zzj(), zzwx.zzb.SYMMETRIC, zzjs.zza(((zzjf) ((zzjj) r1.zza())).zzd()), ((zzja) zzbiVar).zzb());
                return zza2;
            }
        }, zzja.class, zzqb.class);
        zze = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjw
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                zzja zzb3;
                zzb3 = zzjs.zzb((zzqb) zzqfVar, zzchVar);
                return zzb3;
            }
        }, zzb2, zzqb.class);
        HashMap hashMap = new HashMap();
        zzjf.zza zzaVar = zzjf.zza.zzc;
        zzxz zzxzVar = zzxz.RAW;
        hashMap.put(zzaVar, zzxzVar);
        zzjf.zza zzaVar2 = zzjf.zza.zza;
        zzxz zzxzVar2 = zzxz.TINK;
        hashMap.put(zzaVar2, zzxzVar2);
        zzjf.zza zzaVar3 = zzjf.zza.zzb;
        zzxz zzxzVar3 = zzxz.CRUNCHY;
        hashMap.put(zzaVar3, zzxzVar3);
        zzf = Collections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(zzxz.class);
        enumMap.put((EnumMap) zzxzVar, (zzxz) zzaVar);
        enumMap.put((EnumMap) zzxzVar2, (zzxz) zzaVar2);
        enumMap.put((EnumMap) zzxzVar3, (zzxz) zzaVar3);
        enumMap.put((EnumMap) zzxz.LEGACY, (zzxz) zzaVar3);
        zzg = Collections.unmodifiableMap(enumMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzja zzb(zzqb zzqbVar, zzch zzchVar) {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
        }
        try {
            zzup zza2 = zzup.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzja.zzc().zza(zzjf.zzc().zza(zza2.zzd().zzb()).zza(zza(zzqbVar.zzb())).zza()).zza(zzaal.zza(zza2.zzd().zzd(), zzch.zza(zzchVar))).zza(zzqbVar.zze()).zza();
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing AesSivKey failed");
        }
    }

    private static zzjf.zza zza(zzxz zzxzVar) {
        Map<zzxz, zzjf.zza> map = zzg;
        if (map.containsKey(zzxzVar)) {
            return map.get(zzxzVar);
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzjf zzb(zzqe zzqeVar) {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            try {
                zzus zza2 = zzus.zza(zzqeVar.zza().zze(), zzaku.zza());
                if (zza2.zzb() == 0) {
                    return zzjf.zzc().zza(zza2.zza()).zza(zza(zzqeVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzall e10) {
                throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: " + zzqeVar.zza().zzf());
    }

    private static zzxz zza(zzjf.zza zzaVar) {
        Map<zzjf.zza, zzxz> map = zzf;
        if (map.containsKey(zzaVar)) {
            return map.get(zzaVar);
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
