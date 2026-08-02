package com.mbridge.msdk.thrid.okio;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.hc5;
import defpackage.ljg;
import defpackage.x5n;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
final class u {
    public static final Charset a = Charset.forName(C.UTF8_NAME);

    public static void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder o = ljg.o("size=", j, " offset=");
            o.append(j2);
            hc5.h(x5n.m(j3, " byteCount=", o));
        }
    }

    private static <T extends Throwable> void b(Throwable th) throws Throwable {
        throw th;
    }

    public static short a(short s) {
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    public static int a(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static void a(Throwable th) {
        b(th);
    }

    public static boolean a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
