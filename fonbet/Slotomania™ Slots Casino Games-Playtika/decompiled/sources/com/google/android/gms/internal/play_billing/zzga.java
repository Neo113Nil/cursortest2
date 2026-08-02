package com.google.android.gms.internal.play_billing;

import com.google.android.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.android.billingclient:billing@@8.3.0 */
/* loaded from: classes8.dex */
public final class zzga {
    static final Charset zza = Charset.forName(C.UTF8_NAME);
    public static final byte[] zzb;

    static {
        Charset.forName(C.ISO88591_NAME);
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        int i = zzey.zza;
        try {
            new zzew(bArr, 0, 0, false, null).zza(0);
        } catch (zzgc e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    static int zzb(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
