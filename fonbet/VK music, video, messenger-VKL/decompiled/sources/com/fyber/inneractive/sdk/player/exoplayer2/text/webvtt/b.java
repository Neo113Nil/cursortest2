package com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public abstract class b {
    public static final Pattern a = Pattern.compile("^NOTE(( |\t).*)?$");
    public static final Pattern b = Pattern.compile("^\ufeff?WEBVTT(( |\t).*)?$");

    public static long a(String str) {
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str2 : split[0].split(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        return (Long.parseLong(split[1]) + (j * 1000)) * 1000;
    }
}
