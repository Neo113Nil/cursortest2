package com.braze.communication.dust;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class a {
    public static final String a(String str, String str2) {
        String str3 = i.d;
        String substring = str.substring(str2.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }
}
