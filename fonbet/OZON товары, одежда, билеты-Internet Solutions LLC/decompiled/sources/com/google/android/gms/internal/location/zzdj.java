package com.google.android.gms.internal.location;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class zzdj {
    private static final SimpleDateFormat zza;
    private static final SimpleDateFormat zzb;
    private static final StringBuilder zzc;

    static {
        Locale locale = Locale.ROOT;
        zza = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        zzb = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        zzc = new StringBuilder(33);
    }

    public static String zza(long j11) {
        String sb2;
        StringBuilder sb3 = zzc;
        synchronized (sb3) {
            sb3.setLength(0);
            zzb(j11, sb3);
            sb2 = sb3.toString();
        }
        return sb2;
    }

    public static void zzb(long j11, StringBuilder sb2) {
        if (j11 == 0) {
            sb2.append("0s");
            return;
        }
        sb2.ensureCapacity(sb2.length() + 27);
        boolean z11 = false;
        if (j11 < 0) {
            sb2.append("-");
            if (j11 != Long.MIN_VALUE) {
                j11 = -j11;
            } else {
                j11 = Long.MAX_VALUE;
                z11 = true;
            }
        }
        if (j11 >= 86400000) {
            sb2.append(j11 / 86400000);
            sb2.append("d");
            j11 %= 86400000;
        }
        if (true == z11) {
            j11 = 25975808;
        }
        if (j11 >= 3600000) {
            sb2.append(j11 / 3600000);
            sb2.append("h");
            j11 %= 3600000;
        }
        if (j11 >= 60000) {
            sb2.append(j11 / 60000);
            sb2.append("m");
            j11 %= 60000;
        }
        if (j11 >= 1000) {
            sb2.append(j11 / 1000);
            sb2.append("s");
            j11 %= 1000;
        }
        if (j11 > 0) {
            sb2.append(j11);
            sb2.append("ms");
        }
    }
}
