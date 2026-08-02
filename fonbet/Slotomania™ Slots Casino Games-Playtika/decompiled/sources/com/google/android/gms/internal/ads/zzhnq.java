package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhnq {
    public static final /* synthetic */ int zza = 0;

    static {
        Charset.forName(C.UTF8_NAME);
    }

    public static final zziam zza(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                StringBuilder sb = new StringBuilder(String.valueOf(charAt).length() + 33);
                sb.append("Not a printable ASCII character: ");
                sb.append(charAt);
                throw new zzhnp(sb.toString());
            }
            bArr[i] = (byte) charAt;
        }
        return zziam.zza(bArr);
    }

    public static final zziam zzb(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                StringBuilder sb = new StringBuilder(String.valueOf(charAt).length() + 33);
                sb.append("Not a printable ASCII character: ");
                sb.append(charAt);
                throw new GeneralSecurityException(sb.toString());
            }
            bArr[i] = (byte) charAt;
        }
        return zziam.zza(bArr);
    }

    public static boolean zzc() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    @Nullable
    public static Integer zzd() {
        if (zzc()) {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
        return null;
    }

    public static boolean zze(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr2[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }
}
