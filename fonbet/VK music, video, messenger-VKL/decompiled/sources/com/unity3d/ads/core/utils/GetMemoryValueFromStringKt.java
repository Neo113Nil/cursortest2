package com.unity3d.ads.core.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xsna.arm0;

/* compiled from: GetMemoryValueFromString.kt */
/* loaded from: classes14.dex */
public final class GetMemoryValueFromStringKt {
    public static final long getMemoryValueFromString(String str) {
        Long n;
        if (str == null) {
            return -1L;
        }
        Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
        String str2 = null;
        while (matcher.find()) {
            str2 = matcher.group(1);
        }
        if (str2 == null || (n = arm0.n(str2)) == null) {
            return -1L;
        }
        return n.longValue();
    }
}
