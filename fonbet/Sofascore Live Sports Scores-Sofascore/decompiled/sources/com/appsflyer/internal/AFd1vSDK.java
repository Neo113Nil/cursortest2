package com.appsflyer.internal;

import defpackage.a5;
import defpackage.ph0;
import defpackage.txb;
import kotlin.Pair;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFd1vSDK {
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean AFLogger(@NotNull String str, @NotNull String str2) {
        Pair pair;
        txb e;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        str.getClass();
        str2.getClass();
        int AFKeystoreWrapper = AFj1uSDK.AFKeystoreWrapper(str);
        int AFKeystoreWrapper2 = AFj1uSDK.AFKeystoreWrapper(str2);
        txb e2 = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").e(str2);
        Pair pair2 = null;
        if (e2 != null) {
            a5 a5Var = e2.c;
            MatchGroup c = a5Var.c(1);
            Integer intOrNull = (c == null || (str11 = c.a) == null) ? null : StringsKt.toIntOrNull(str11);
            MatchGroup c2 = a5Var.c(2);
            Integer intOrNull2 = (c2 == null || (str10 = c2.a) == null) ? null : StringsKt.toIntOrNull(str10);
            MatchGroup c3 = a5Var.c(3);
            Integer intOrNull3 = (c3 == null || (str9 = c3.a) == null) ? null : StringsKt.toIntOrNull(str9);
            MatchGroup c4 = a5Var.c(4);
            Integer intOrNull4 = (c4 == null || (str8 = c4.a) == null) ? null : StringsKt.toIntOrNull(str8);
            MatchGroup c5 = a5Var.c(5);
            Integer intOrNull5 = (c5 == null || (str7 = c5.a) == null) ? null : StringsKt.toIntOrNull(str7);
            MatchGroup c6 = a5Var.c(6);
            Integer intOrNull6 = (c6 == null || (str6 = c6.a) == null) ? null : StringsKt.toIntOrNull(str6);
            Integer num = intOrNull6;
            if (!ph0.v(new Object[]{intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6}, null)) {
                intOrNull.getClass();
                int intValue = intOrNull.intValue() * 1000000;
                intOrNull2.getClass();
                int intValue2 = (intOrNull2.intValue() * 1000) + intValue;
                intOrNull3.getClass();
                Integer valueOf = Integer.valueOf(intOrNull3.intValue() + intValue2);
                intOrNull4.getClass();
                int intValue3 = intOrNull4.intValue() * 1000000;
                intOrNull5.getClass();
                int intValue4 = (intOrNull5.intValue() * 1000) + intValue3;
                num.getClass();
                pair = new Pair(valueOf, Integer.valueOf(num.intValue() + intValue4));
                e = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").e(str2);
                if (e != null) {
                    a5 a5Var2 = e.c;
                    MatchGroup c7 = a5Var2.c(1);
                    Integer intOrNull7 = (c7 == null || (str5 = c7.a) == null) ? null : StringsKt.toIntOrNull(str5);
                    MatchGroup c8 = a5Var2.c(3);
                    Integer intOrNull8 = (c8 == null || (str4 = c8.a) == null) ? null : StringsKt.toIntOrNull(str4);
                    MatchGroup c9 = a5Var2.c(4);
                    Integer intOrNull9 = (c9 == null || (str3 = c9.a) == null) ? null : StringsKt.toIntOrNull(str3);
                    if (intOrNull7 != null) {
                        pair2 = new Pair(Integer.valueOf(intOrNull7.intValue() * 1000000), Integer.valueOf(((intOrNull7.intValue() + 1) * 1000000) - 1));
                    } else if (intOrNull8 != null && intOrNull9 != null) {
                        pair2 = new Pair(Integer.valueOf((intOrNull9.intValue() * 1000) + (intOrNull8.intValue() * 1000000)), Integer.valueOf((((intOrNull9.intValue() + 1) * 1000) + (intOrNull8.intValue() * 1000000)) - 1));
                    }
                }
                if (AFKeystoreWrapper2 == -1 && pair == null) {
                    if (AFKeystoreWrapper2 != AFKeystoreWrapper) {
                        return false;
                    }
                } else if (pair2 == null) {
                    if (((Number) pair2.a).intValue() > AFKeystoreWrapper || AFKeystoreWrapper > ((Number) pair2.b).intValue()) {
                        return false;
                    }
                } else if (pair == null || ((Number) pair.a).intValue() > AFKeystoreWrapper || AFKeystoreWrapper > ((Number) pair.b).intValue()) {
                    return false;
                }
                return true;
            }
        }
        pair = null;
        e = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").e(str2);
        if (e != null) {
        }
        if (AFKeystoreWrapper2 == -1) {
        }
        if (pair2 == null) {
        }
        return true;
    }
}
