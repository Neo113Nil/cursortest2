package com.fyber.inneractive.sdk.protobuf;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.zzl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class y3 {
    public static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!b(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !b(b3) && !b(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + 56320);
                return;
            }
        }
        zzl.j("Protocol message had invalid UTF-8.");
    }

    public static boolean b(byte b) {
        return b > -65;
    }

    public static void a(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62 && !b(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
        } else {
            zzl.j("Protocol message had invalid UTF-8.");
        }
    }

    public static void a(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!b(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !b(b3)))) {
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
        } else {
            zzl.j("Protocol message had invalid UTF-8.");
        }
    }

    public static boolean a(byte b) {
        return b >= 0;
    }
}
