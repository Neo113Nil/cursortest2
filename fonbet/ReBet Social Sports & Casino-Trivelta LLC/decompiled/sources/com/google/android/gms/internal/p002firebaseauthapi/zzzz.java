package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzzz implements zzsq {
    public static zzsq zza(zzso zzsoVar) {
        zzsq zza = zzsv.zza(zzsoVar);
        try {
            return new zzaac(zza, zzsx.zza(zzsoVar));
        } catch (GeneralSecurityException unused) {
            return zza;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzsq
    public final byte[] zza(byte[] bArr, int i10) {
        throw new NoSuchMethodError();
    }
}
