package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
final class zzir extends ThreadLocal<Cipher> {
    private static Cipher zza() {
        try {
            Cipher zza = zzzj.zza.zza("AES/GCM-SIV/NoPadding");
            if (zzgz.zza(zza)) {
                return zza;
            }
            return null;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
