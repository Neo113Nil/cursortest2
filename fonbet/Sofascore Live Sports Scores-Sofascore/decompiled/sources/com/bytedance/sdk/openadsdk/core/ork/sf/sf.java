package com.bytedance.sdk.openadsdk.core.ork.sf;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    public static long[] pcc(String str, long j) {
        long parseLong;
        long j2;
        if (str == null || str.isEmpty() || j <= 0) {
            return new long[]{0, j - 1};
        }
        Matcher matcher = Pattern.compile("bytes\\s*=\\s*(\\d*)\\s*-\\s*(\\d*)", 2).matcher(str);
        if (!matcher.matches()) {
            return new long[]{0, j - 1};
        }
        try {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            boolean isEmpty = TextUtils.isEmpty(group);
            boolean isEmpty2 = TextUtils.isEmpty(group2);
            if (isEmpty || isEmpty2) {
                if (!isEmpty) {
                    parseLong = Long.parseLong(group);
                } else {
                    if (isEmpty2) {
                        return new long[]{0, j - 1};
                    }
                    parseLong = j - Long.parseLong(group2);
                }
                j2 = j - 1;
            } else {
                parseLong = Long.parseLong(group);
                j2 = Long.parseLong(group2);
            }
            return pcc(parseLong, j2, j);
        } catch (Throwable unused) {
            return new long[]{0, j - 1};
        }
    }

    private static long[] pcc(long j, long j2, long j3) {
        if (j < 0) {
            j = 0;
        }
        if (j2 >= j3) {
            j2 = j3 - 1;
        }
        if (j > j2 || j >= j3) {
            return null;
        }
        return new long[]{j, j2};
    }
}
