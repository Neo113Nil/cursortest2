package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzarx {
    public static long a(zzeu zzeuVar, int i, int i2) {
        zzeuVar.D(i);
        if (zzeuVar.B() < 5) {
            return C.TIME_UNSET;
        }
        int b = zzeuVar.b();
        if ((8388608 & b) != 0 || ((b >> 8) & 8191) != i2 || (b & 32) == 0 || zzeuVar.I() < 7 || zzeuVar.B() < 7 || (zzeuVar.I() & 16) != 16) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[6];
        zzeuVar.F(0, 6, bArr);
        long j = bArr[0];
        long j2 = bArr[1];
        long j3 = bArr[2];
        long j4 = bArr[3] & 255;
        return ((j & 255) << 25) | ((j2 & 255) << 17) | ((j3 & 255) << 9) | (j4 + j4) | ((bArr[4] & 255) >> 7);
    }
}
