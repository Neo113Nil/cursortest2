package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhza {
    private final byte[] zza;
    private final byte[] zzb;

    private zzhza(byte[] bArr, byte[] bArr2) {
        this.zza = bArr;
        this.zzb = bArr2;
    }

    public static zzhza zzc() throws GeneralSecurityException {
        byte[] zza = zzhnh.zza(32);
        if (zza.length == 32) {
            return new zzhza(zzhks.zza(zzhks.zzb(zza)), zza);
        }
        throw new IllegalArgumentException(String.format("Given secret seed length is not %s", 32));
    }

    public final byte[] zza() {
        return Arrays.copyOf(this.zza, 32);
    }

    public final byte[] zzb() {
        byte[] bArr = this.zzb;
        return Arrays.copyOf(bArr, bArr.length);
    }
}
