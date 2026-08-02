package com.moloco.sdk.internal.utils;

import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class b {
    public static final String a = "[ERROR_CODE]";
    public static final String b = "[HAPPENED_AT_TS]";
    public static final String c = "[SECONDS_LEFT]";

    public static final String a(String str, String errorCode) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        return StringsKt.replace$default(str, "[ERROR_CODE]", errorCode, false, 4, (Object) null);
    }

    public static final String b(String str, String str2) {
        String replace$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (str2 == null || (replace$default = StringsKt.replace$default(str, "[MTID]", str2, false, 4, (Object) null)) == null) ? str : replace$default;
    }

    public static final String a(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.replace$default(str, "[HAPPENED_AT_TS]", String.valueOf(j), false, 4, (Object) null);
    }

    public static final String a(String str, String errorCode, long j) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        return a(a(str, errorCode), j);
    }

    public static final String a(String substituteCountDownTimeLeftMacro, int i) {
        String m11250m;
        Intrinsics.checkNotNullParameter(substituteCountDownTimeLeftMacro, "$this$substituteCountDownTimeLeftMacro");
        m11250m = UByte$$ExternalSyntheticBackport0.m11250m(i, 10);
        return StringsKt.replace$default(substituteCountDownTimeLeftMacro, c, m11250m, false, 4, (Object) null);
    }
}
