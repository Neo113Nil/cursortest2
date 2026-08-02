package com.google.android.gms.internal.ads;

import defpackage.ymo;
import java.io.IOException;
import java.io.StringReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhms {
    public static boolean a(String str) {
        int length = str.length();
        int i = 0;
        while (i != length) {
            char charAt = str.charAt(i);
            int i2 = i + 1;
            if (!Character.isSurrogate(charAt)) {
                i = i2;
            } else {
                if (Character.isLowSurrogate(charAt) || i2 == length || !Character.isLowSurrogate(str.charAt(i2))) {
                    return false;
                }
                i += 2;
            }
        }
        return true;
    }

    public static zzico b(String str) {
        try {
            return ymo.a(new zzidl(new StringReader(str)));
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }
}
