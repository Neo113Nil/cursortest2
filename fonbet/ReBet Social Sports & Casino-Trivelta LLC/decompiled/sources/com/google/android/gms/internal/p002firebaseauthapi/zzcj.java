package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzcj {
    public static zzcb zza(byte[] bArr) {
        try {
            zzxb zza = zzxb.zza(bArr, zzaku.zza());
            zzoz zza2 = zzoz.zza();
            zzqe zza3 = zzqe.zza(zza);
            return !zza2.zzc(zza3) ? new zzoi(zza3) : zza2.zza((zzoz) zza3);
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }

    public static byte[] zza(zzcb zzcbVar) {
        if (zzcbVar instanceof zzoi) {
            return ((zzoi) zzcbVar).zzb().zza().zzk();
        }
        return ((zzqe) zzoz.zza().zza((zzoz) zzcbVar, zzqe.class)).zza().zzk();
    }
}
