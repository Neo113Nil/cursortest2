package io.appmetrica.analytics.logger.common.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f15088a = Pattern.compile("[\\p{Space},;]");

    public static int a(Matcher matcher, int i5, int i10) {
        if (i10 >= i5) {
            int i11 = ((i10 - i5) / 2) + i5;
            matcher.region(i11, i10);
            if (matcher.find()) {
                int start = matcher.start();
                int a7 = a(matcher, start + 1, i10);
                return a7 == -1 ? start : a7;
            }
            matcher.region(i5, i11);
            if (matcher.find()) {
                int start2 = matcher.start();
                int a10 = a(matcher, start2 + 1, i11);
                return a10 == -1 ? start2 : a10;
            }
        }
        return -1;
    }
}
