package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdi;
import com.google.android.gms.internal.p002firebaseauthapi.zzdx;
import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import com.google.android.gms.internal.p002firebaseauthapi.zzkb;
import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzjx {
    private static final zzps<zzke, zzbd> zza = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzka
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzzb.zza((zzke) zzbiVar);
        }
    }, zzke.class, zzbd.class);
    private static final zzps<zzkh, zzbg> zzb = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjz
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzze.zza((zzkh) zzbiVar);
        }
    }, zzkh.class, zzbg.class);
    private static final zzcd<zzbd> zzc = zzod.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", zzbd.class, zzvn.zzf());
    private static final zzbh<zzbg> zzd = zzod.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", zzbg.class, zzwx.zzb.ASYMMETRIC_PUBLIC, zzvq.zzh());
    private static final zzor<zzkb> zze = new zzor() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkc
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzor
        public final zzbi zza(zzcb zzcbVar, Integer num) {
            return zzjx.zza((zzkb) zzcbVar, num);
        }
    };

    public static /* synthetic */ zzke zza(zzkb zzkbVar, Integer num) {
        ECParameterSpec eCParameterSpec;
        zzkb.zzc zzd2 = zzkbVar.zzd();
        if (zzd2 == zzkb.zzc.zza) {
            eCParameterSpec = zznj.zza;
        } else if (zzd2 == zzkb.zzc.zzb) {
            eCParameterSpec = zznj.zzb;
        } else {
            if (zzd2 != zzkb.zzc.zzc) {
                throw new GeneralSecurityException("Unsupported curve type: " + String.valueOf(zzd2));
            }
            eCParameterSpec = zznj.zzc;
        }
        KeyPair zza2 = zzzf.zza(eCParameterSpec);
        return zzke.zza(zzkh.zza(zzkbVar, ((ECPublicKey) zza2.getPublic()).getW(), num), zzaam.zza(((ECPrivateKey) zza2.getPrivate()).getS(), zzbf.zza()));
    }

    public static String zza() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public static void zza(boolean z10) {
        if (zziv.zza.zza.zza()) {
            zzlq.zza();
            zzox zza2 = zzox.zza();
            HashMap hashMap = new HashMap();
            zzkb.zza zzc2 = zzkb.zzc();
            zzkb.zzc zzcVar = zzkb.zzc.zza;
            zzkb.zza zza3 = zzc2.zza(zzcVar);
            zzkb.zzb zzbVar = zzkb.zzb.zzc;
            zzkb.zza zza4 = zza3.zza(zzbVar);
            zzkb.zze zzeVar = zzkb.zze.zzb;
            zzkb.zza zza5 = zza4.zza(zzeVar);
            zzkb.zzd zzdVar = zzkb.zzd.zza;
            zzkb.zza zza6 = zza5.zza(zzdVar);
            zzdx.zzb zzc3 = zzdx.zze().zza(12).zzb(16).zzc(16);
            zzdx.zza zzaVar = zzdx.zza.zzc;
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zza6.zza(zzc3.zza(zzaVar).zza()).zza());
            zzkb.zza zza7 = zzkb.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar);
            zzkb.zzd zzdVar2 = zzkb.zzd.zzc;
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zza7.zza(zzdVar2).zza(zzdx.zze().zza(12).zzb(16).zzc(16).zza(zzaVar).zza()).zza());
            zzkb.zza zza8 = zzkb.zzc().zza(zzcVar).zza(zzbVar);
            zzkb.zze zzeVar2 = zzkb.zze.zza;
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zza8.zza(zzeVar2).zza(zzdVar).zza(zzdx.zze().zza(12).zzb(16).zzc(16).zza(zzaVar).zza()).zza());
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzkb.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar2).zza(zzdVar2).zza(zzdx.zze().zza(12).zzb(16).zzc(16).zza(zzaVar).zza()).zza());
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzkb.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar2).zza(zzdVar2).zza(zzdx.zze().zza(12).zzb(16).zzc(16).zza(zzaVar).zza()).zza());
            zzkb.zza zza9 = zzkb.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar).zza(zzdVar);
            zzdi.zzb zzc4 = zzdi.zzf().zza(16).zzb(32).zzd(16).zzc(16);
            zzdi.zza zzaVar2 = zzdi.zza.zzc;
            zzdi.zzb zza10 = zzc4.zza(zzaVar2);
            zzdi.zzc zzcVar2 = zzdi.zzc.zzc;
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zza9.zza(zza10.zza(zzcVar2).zza()).zza());
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzkb.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar).zza(zzdVar2).zza(zzdi.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzaVar2).zza(zzcVar2).zza()).zza());
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzkb.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar2).zza(zzdVar).zza(zzdi.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzaVar2).zza(zzcVar2).zza()).zza());
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzkb.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar2).zza(zzdVar2).zza(zzdi.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzaVar2).zza(zzcVar2).zza()).zza());
            zza2.zza(Collections.unmodifiableMap(hashMap));
            zzpa.zza().zza(zza);
            zzpa.zza().zza(zzb);
            zzop.zza().zza(zze, zzkb.class);
            zznq.zza().zza((zzbh) zzc, true);
            zznq.zza().zza((zzbh) zzd, false);
            return;
        }
        throw new GeneralSecurityException("Registering ECIES Hybrid Encryption is not supported in FIPS mode");
    }
}
