package com.appsflyer.internal;

import Ij.C3261b;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class AFe1zSDK {
    public static final Pair<Integer, Integer> AFInAppEventParameterName(@NotNull String str) {
        String f71945a;
        String f71945a2;
        String f71945a3;
        Intrinsics.checkNotNullParameter(str, "");
        MatchResult e11 = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").e(str);
        if (e11 != null) {
            MatchGroup b11 = e11.b().b(1);
            Integer w02 = (b11 == null || (f71945a3 = b11.getF71945a()) == null) ? null : kotlin.text.h.w0(f71945a3);
            MatchGroup b12 = e11.b().b(3);
            Integer w03 = (b12 == null || (f71945a2 = b12.getF71945a()) == null) ? null : kotlin.text.h.w0(f71945a2);
            MatchGroup b13 = e11.b().b(4);
            Integer w04 = (b13 == null || (f71945a = b13.getF71945a()) == null) ? null : kotlin.text.h.w0(f71945a);
            if (w02 != null) {
                return new Pair<>(Integer.valueOf(w02.intValue() * 1000000), Integer.valueOf(((w02.intValue() + 1) * 1000000) - 1));
            }
            if (w03 != null && w04 != null) {
                return new Pair<>(Integer.valueOf((w04.intValue() * 1000) + (w03.intValue() * 1000000)), Integer.valueOf((((w04.intValue() + 1) * 1000) + (w03.intValue() * 1000000)) - 1));
            }
        }
        return null;
    }

    public static final Pair<Integer, Integer> AFInAppEventType(@NotNull String str) {
        String f71945a;
        String f71945a2;
        String f71945a3;
        String f71945a4;
        String f71945a5;
        String f71945a6;
        Intrinsics.checkNotNullParameter(str, "");
        MatchResult e11 = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").e(str);
        if (e11 != null) {
            MatchGroup b11 = e11.b().b(1);
            Integer w02 = (b11 == null || (f71945a6 = b11.getF71945a()) == null) ? null : kotlin.text.h.w0(f71945a6);
            MatchGroup b12 = e11.b().b(2);
            Integer w03 = (b12 == null || (f71945a5 = b12.getF71945a()) == null) ? null : kotlin.text.h.w0(f71945a5);
            MatchGroup b13 = e11.b().b(3);
            Integer w04 = (b13 == null || (f71945a4 = b13.getF71945a()) == null) ? null : kotlin.text.h.w0(f71945a4);
            MatchGroup b14 = e11.b().b(4);
            Integer w05 = (b14 == null || (f71945a3 = b14.getF71945a()) == null) ? null : kotlin.text.h.w0(f71945a3);
            MatchGroup b15 = e11.b().b(5);
            Integer w06 = (b15 == null || (f71945a2 = b15.getF71945a()) == null) ? null : kotlin.text.h.w0(f71945a2);
            MatchGroup b16 = e11.b().b(6);
            Integer w07 = (b16 == null || (f71945a = b16.getF71945a()) == null) ? null : kotlin.text.h.w0(f71945a);
            Integer num = w07;
            if (AFKeystoreWrapper(w02, w03, w04, w05, w06, w07)) {
                Intrinsics.f(w02);
                int intValue = w02.intValue() * 1000000;
                Intrinsics.f(w03);
                int intValue2 = (w03.intValue() * 1000) + intValue;
                Intrinsics.f(w04);
                Integer valueOf = Integer.valueOf(w04.intValue() + intValue2);
                Intrinsics.f(w05);
                int intValue3 = w05.intValue() * 1000000;
                Intrinsics.f(w06);
                int intValue4 = (w06.intValue() * 1000) + intValue3;
                Intrinsics.f(num);
                return new Pair<>(valueOf, Integer.valueOf(num.intValue() + intValue4));
            }
        }
        return null;
    }

    public static final String AFKeystoreWrapper(String str, String str2) {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "");
        String str3 = "";
        for (byte b11 : digest) {
            StringBuilder e11 = C3261b.e(str3);
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b11)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "");
            e11.append(format);
            str3 = e11.toString();
        }
        return str3;
    }

    private static boolean AFKeystoreWrapper(@NotNull Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        return !C7705l.m(objArr, null);
    }
}
