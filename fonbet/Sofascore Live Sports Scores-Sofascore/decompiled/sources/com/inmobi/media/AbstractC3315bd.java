package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.bd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3315bd {
    public static final String a(String str, Zc zc, Map map) {
        str.getClass();
        zc.getClass();
        map.getClass();
        String r = kotlin.text.c.r(kotlin.text.c.r(kotlin.text.c.r(str, "$TS", String.valueOf(System.currentTimeMillis()), false), "$LTS", String.valueOf(zc.a.g), false), "$STS", String.valueOf(zc.a.d), false);
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i == 0) {
            i = (secureRandom.nextInt() & Integer.MAX_VALUE) % 10;
        }
        sb.append(i);
        for (int i2 = 1; i2 < 8; i2++) {
            sb.append((secureRandom.nextInt() & Integer.MAX_VALUE) % 10);
        }
        String r2 = kotlin.text.c.r(r, "[CACHEBUSTING]", sb.toString(), false);
        String str2 = zc.b;
        if (str2 != null) {
            r2 = kotlin.text.c.r(r2, "[UNIVERSALADID]", str2, false);
        }
        String str3 = zc.c;
        if (str3 != null) {
            r2 = kotlin.text.c.r(r2, "[ADSERVINGID]", str3, false);
        }
        String str4 = zc.d;
        if (str4 != null) {
            r2 = kotlin.text.c.r(r2, "[ASSETURI]", str4, false);
        }
        int i3 = zc.e;
        Locale locale = Locale.US;
        long j = i3;
        long j2 = j / 3600000;
        Long valueOf = Long.valueOf(j2);
        long j3 = j / ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        long j4 = j / 1000;
        String r3 = kotlin.text.c.r(r2, "[CONTENTPLAYHEAD]", String.format(locale, "%02d:%02d:%02d.%03d", Arrays.copyOf(new Object[]{valueOf, Long.valueOf(j3 - TimeUnit.HOURS.toMinutes(j2)), Long.valueOf(j4 - TimeUnit.MINUTES.toSeconds(j3)), Long.valueOf(j - (j4 * 1000))}, 4)), false);
        for (Map.Entry entry : map.entrySet()) {
            r3 = kotlin.text.c.r(r3, (String) entry.getKey(), (String) entry.getValue(), false);
        }
        return r3;
    }

    public static final boolean a(C3328c0 c3328c0) {
        c3328c0.getClass();
        return !((AdConfig) AbstractC3435g4.a.a(AdConfig.class)).getNative().getInteraction().getBlockBeaconsOnExpiry() || c3328c0.h <= 0 || System.currentTimeMillis() < c3328c0.h;
    }
}
