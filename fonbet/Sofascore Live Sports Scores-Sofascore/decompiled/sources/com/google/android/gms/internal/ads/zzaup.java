package com.google.android.gms.internal.ads;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.Y1;
import com.mbridge.msdk.foundation.download.Command;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaup {
    public static zzatb a(zzato zzatoVar) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = zzatoVar.c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long b = str != null ? b(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, 0);
            z = false;
            j2 = 0;
            j3 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j3 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            j = 0;
            i = 1;
        } else {
            j = 0;
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = (String) map.get("Expires");
        long b2 = str3 != null ? b(str3) : j;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j4 = currentTimeMillis;
            j5 = b(str4);
        } else {
            j4 = currentTimeMillis;
            j5 = j;
        }
        String str5 = (String) map.get(Command.HTTP_HEADER_ETAG);
        if (i != 0) {
            long j8 = (j3 * 1000) + j4;
            j7 = z ? j8 : (j2 * 1000) + j8;
            j6 = j8;
        } else {
            j6 = (b <= j || b2 < b) ? j : (b2 - b) + j4;
            j7 = j6;
        }
        zzatb zzatbVar = new zzatb();
        zzatbVar.a = zzatoVar.b;
        zzatbVar.b = str5;
        zzatbVar.f = j6;
        zzatbVar.e = j7;
        zzatbVar.c = b;
        zzatbVar.d = j5;
        zzatbVar.g = map;
        zzatbVar.h = zzatoVar.d;
        return zzatbVar;
    }

    public static long b(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            if ("0".equals(str) || Y1.f.equals(str)) {
                zzaue.a("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzaue.b("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }
}
