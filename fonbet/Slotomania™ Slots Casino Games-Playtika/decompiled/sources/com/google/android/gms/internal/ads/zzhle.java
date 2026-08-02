package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhle {
    public static boolean zza(String str) {
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

    public static zziat zzb(String str) throws IOException {
        try {
            zzibq zzibqVar = new zzibq(new StringReader(str));
            zzibqVar.zza(zziay.LEGACY_STRICT);
            return zzhlc.zza(zzibqVar);
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }

    public static long zzc(Number number) {
        if (number instanceof zzhld) {
            return Long.parseLong(number.toString());
        }
        throw new IllegalArgumentException("does not contain a parsed number.");
    }
}
