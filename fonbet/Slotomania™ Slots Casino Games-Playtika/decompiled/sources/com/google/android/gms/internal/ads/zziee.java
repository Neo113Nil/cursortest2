package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes8.dex */
public final class zziee {
    static final Charset zza = Charset.forName(C.UTF8_NAME);
    public static final byte[] zzb;
    public static final ByteBuffer zzc;

    static {
        Charset.forName(C.ISO88591_NAME);
        byte[] bArr = new byte[0];
        zzb = bArr;
        zzc = ByteBuffer.wrap(bArr);
        int i = zzicr.zze;
        zzicr.zzI(bArr, 0, 0, false);
    }

    static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int zzb(boolean z) {
        return z ? 1231 : 1237;
    }

    static int zzc(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
