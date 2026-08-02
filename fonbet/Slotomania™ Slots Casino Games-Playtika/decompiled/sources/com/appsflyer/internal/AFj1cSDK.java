package com.appsflyer.internal;

import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class AFj1cSDK {
    public static final String getMonetizationNetwork(String str, String str2) {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "");
        String str3 = "";
        for (byte b : digest) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "");
            str3 = str3 + format;
        }
        return str3;
    }

    public static final int getCurrencyIso4217Code(String str) {
        String value;
        Integer intOrNull;
        String value2;
        Integer intOrNull2;
        String value3;
        Integer intOrNull3;
        Intrinsics.checkNotNullParameter(str, "");
        MatchResult matchEntire = new Regex("(\\d+).(\\d+).(\\d+).*").matchEntire(str);
        if (matchEntire == null) {
            return -1;
        }
        MatchGroup matchGroup = matchEntire.getGroups().get(1);
        int i = 0;
        int intValue = ((matchGroup == null || (value3 = matchGroup.getValue()) == null || (intOrNull3 = StringsKt.toIntOrNull(value3)) == null) ? 0 : intOrNull3.intValue()) * 1000000;
        MatchGroup matchGroup2 = matchEntire.getGroups().get(2);
        int intValue2 = intValue + (((matchGroup2 == null || (value2 = matchGroup2.getValue()) == null || (intOrNull2 = StringsKt.toIntOrNull(value2)) == null) ? 0 : intOrNull2.intValue()) * 1000);
        MatchGroup matchGroup3 = matchEntire.getGroups().get(3);
        if (matchGroup3 != null && (value = matchGroup3.getValue()) != null && (intOrNull = StringsKt.toIntOrNull(value)) != null) {
            i = intOrNull.intValue();
        }
        return intValue2 + i;
    }
}
