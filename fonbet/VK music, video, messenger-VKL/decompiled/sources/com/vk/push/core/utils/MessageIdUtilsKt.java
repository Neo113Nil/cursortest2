package com.vk.push.core.utils;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import xsna.drm0;
import xsna.j5g;

/* compiled from: MessageIdUtils.kt */
/* loaded from: classes5.dex */
public final class MessageIdUtilsKt {
    public static final String formMessageId(long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(':');
        sb.append(j2);
        return sb.toString();
    }

    public static final String formPushId(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(':');
        sb.append(str2 != null ? Long.valueOf(syn(str2)) : "");
        return sb.toString();
    }

    public static final long syn(String str) {
        String str2 = (String) j5g.b0(1, drm0.c0(str, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, 0, 6));
        if (str2 != null) {
            return Long.parseLong(str2);
        }
        return 0L;
    }
}
