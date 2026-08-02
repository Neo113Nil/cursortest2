package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Build;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Objects;
import kotlin.UByte;

/* loaded from: classes2.dex */
public final class zzqn {
    public static final Charset zza = Charset.forName("UTF-8");

    public static int zza() {
        int i10 = 0;
        while (i10 == 0) {
            byte[] zza2 = zzqd.zza(4);
            i10 = (zza2[3] & UByte.MAX_VALUE) | ((zza2[0] & UByte.MAX_VALUE) << 24) | ((zza2[1] & UByte.MAX_VALUE) << 16) | ((zza2[2] & UByte.MAX_VALUE) << 8);
        }
        return i10;
    }

    public static final zzaaj zzb(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt < '!' || charAt > '~') {
                throw new zzql("Not a printable ASCII character: " + charAt);
            }
            bArr[i10] = (byte) charAt;
        }
        return zzaaj.zza(bArr);
    }

    public static final zzaaj zza(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= '!' && charAt <= '~') {
                bArr[i10] = (byte) charAt;
            } else {
                throw new GeneralSecurityException("Not a printable ASCII character: " + charAt);
            }
        }
        return zzaaj.zza(bArr);
    }

    public static Integer zzb() {
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
        return null;
    }

    public static boolean zza(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr2[i10] != bArr[i10]) {
                return false;
            }
        }
        return true;
    }
}
