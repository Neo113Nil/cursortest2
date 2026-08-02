package com.google.android.gms.internal.location;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.chromium.base.TimeUtils;
import ru.ok.tracer.base.ucum.UcumUtils;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
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

    public static String zza(long j) {
        String sb;
        StringBuilder sb2 = zzc;
        synchronized (sb2) {
            sb2.setLength(0);
            zzb(j, sb2);
            sb = sb2.toString();
        }
        return sb;
    }

    public static void zzb(long j, StringBuilder sb) {
        if (j == 0) {
            sb.append("0s");
            return;
        }
        sb.ensureCapacity(sb.length() + 27);
        boolean z = false;
        if (j < 0) {
            sb.append("-");
            if (j != Long.MIN_VALUE) {
                j = -j;
            } else {
                j = Long.MAX_VALUE;
                z = true;
            }
        }
        if (j >= TimeUtils.MILLISECONDS_PER_DAY) {
            sb.append(j / TimeUtils.MILLISECONDS_PER_DAY);
            sb.append("d");
            j %= TimeUtils.MILLISECONDS_PER_DAY;
        }
        if (true == z) {
            j = 25975808;
        }
        if (j >= 3600000) {
            sb.append(j / 3600000);
            sb.append("h");
            j %= 3600000;
        }
        if (j >= 60000) {
            sb.append(j / 60000);
            sb.append(InneractiveMediationDefs.GENDER_MALE);
            j %= 60000;
        }
        if (j >= 1000) {
            sb.append(j / 1000);
            sb.append(UcumUtils.UCUM_SECONDS);
            j %= 1000;
        }
        if (j > 0) {
            sb.append(j);
            sb.append(UcumUtils.UCUM_MILLISECODS);
        }
    }
}
