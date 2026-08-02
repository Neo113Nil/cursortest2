package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidKeyException;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes2.dex */
public final class zzaah {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] copyOf = Arrays.copyOf(bArr, 32);
        copyOf[0] = (byte) (copyOf[0] & 248);
        byte b10 = (byte) (copyOf[31] & ByteCompanionObject.MAX_VALUE);
        copyOf[31] = b10;
        copyOf[31] = (byte) (b10 | 64);
        zzng.zza(jArr, copyOf, bArr2);
        return zznm.zzc(jArr);
    }

    public static byte[] zza() {
        byte[] zza = zzqd.zza(32);
        zza[0] = (byte) (zza[0] | 7);
        byte b10 = (byte) (zza[31] & 63);
        zza[31] = b10;
        zza[31] = (byte) (b10 | ByteCompanionObject.MIN_VALUE);
        return zza;
    }

    public static byte[] zza(byte[] bArr) {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return zza(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
