package com.appsflyer.internal;

import defpackage.a5;
import defpackage.txb;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFj1uSDK {
    public static final int AFKeystoreWrapper(@NotNull String str) {
        String str2;
        Integer intOrNull;
        String str3;
        Integer intOrNull2;
        String str4;
        Integer intOrNull3;
        str.getClass();
        txb e = new Regex("(\\d+).(\\d+).(\\d+).*").e(str);
        if (e == null) {
            return -1;
        }
        a5 a5Var = e.c;
        MatchGroup c = a5Var.c(1);
        int i = 0;
        int intValue = ((c == null || (str4 = c.a) == null || (intOrNull3 = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull3.intValue()) * 1000000;
        MatchGroup c2 = a5Var.c(2);
        int intValue2 = (((c2 == null || (str3 = c2.a) == null || (intOrNull2 = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull2.intValue()) * 1000) + intValue;
        MatchGroup c3 = a5Var.c(3);
        if (c3 != null && (str2 = c3.a) != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
            i = intOrNull.intValue();
        }
        return intValue2 + i;
    }

    public static final String unregisterClient(String str, String str2) {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] digest = messageDigest.digest(bytes);
        digest.getClass();
        String str3 = "";
        for (byte b : digest) {
            str3 = str3.concat(String.format(Locale.US, "%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
        }
        return str3;
    }
}
