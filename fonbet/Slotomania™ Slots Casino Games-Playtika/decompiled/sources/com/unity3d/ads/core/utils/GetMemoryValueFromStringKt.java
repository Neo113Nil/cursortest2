package com.unity3d.ads.core.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: GetMemoryValueFromString.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"getMemoryValueFromString", "", "memVal", "", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetMemoryValueFromStringKt {
    public static final long getMemoryValueFromString(String str) {
        Long longOrNull;
        if (str == null) {
            return -1L;
        }
        Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
        String str2 = null;
        while (matcher.find()) {
            str2 = matcher.group(1);
        }
        if (str2 == null || (longOrNull = StringsKt.toLongOrNull(str2)) == null) {
            return -1L;
        }
        return longOrNull.longValue();
    }
}
