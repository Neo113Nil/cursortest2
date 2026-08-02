package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzfv {
    private static final zzor<zzfz> zza = new zzor() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfy
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzor
        public final zzbi zza(zzcb zzcbVar, Integer num) {
            zzfw zza2;
            zza2 = zzfw.zza((zzfz) zzcbVar, zzaal.zza(32), num);
            return zza2;
        }
    };
    private static final zzps<zzfw, zzba> zzb = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfx
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzib.zza((zzfw) zzbiVar);
        }
    }, zzfw.class, zzba.class);

    public static void zza(boolean z10) {
        zzie.zza();
        zzox zza2 = zzox.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("XAES_256_GCM_192_BIT_NONCE", zzfm.zzg);
        hashMap.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzfm.zzh);
        hashMap.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzfm.zzi);
        hashMap.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzfm.zzj);
        zza2.zza(Collections.unmodifiableMap(hashMap));
        zzpa.zza().zza(zzb);
        zzop.zza().zza(zza, zzfz.class);
    }
}
