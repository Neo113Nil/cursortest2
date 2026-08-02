package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class AFc1tSDK {
    public static final int valueOf(@NotNull String str) {
        String f71945a;
        Integer w02;
        String f71945a2;
        Integer w03;
        String f71945a3;
        Integer w04;
        Intrinsics.checkNotNullParameter(str, "");
        MatchResult e11 = new Regex("(\\d+).(\\d+).(\\d+).*").e(str);
        if (e11 == null) {
            return -1;
        }
        MatchGroup b11 = e11.b().b(1);
        int i11 = 0;
        int intValue = ((b11 == null || (f71945a3 = b11.getF71945a()) == null || (w04 = kotlin.text.h.w0(f71945a3)) == null) ? 0 : w04.intValue()) * 1000000;
        MatchGroup b12 = e11.b().b(2);
        int intValue2 = (((b12 == null || (f71945a2 = b12.getF71945a()) == null || (w03 = kotlin.text.h.w0(f71945a2)) == null) ? 0 : w03.intValue()) * 1000) + intValue;
        MatchGroup b13 = e11.b().b(3);
        if (b13 != null && (f71945a = b13.getF71945a()) != null && (w02 = kotlin.text.h.w0(f71945a)) != null) {
            i11 = w02.intValue();
        }
        return intValue2 + i11;
    }
}
