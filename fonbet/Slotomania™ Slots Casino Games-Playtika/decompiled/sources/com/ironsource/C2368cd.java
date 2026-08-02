package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.ironsource.cd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2368cd {
    private final String a;

    public C2368cd(String baseControllerUrl) {
        Intrinsics.checkNotNullParameter(baseControllerUrl, "baseControllerUrl");
        this.a = baseControllerUrl;
    }

    public final String a() {
        String str = this.a;
        String substring = str.substring(0, StringsKt.lastIndexOf$default((CharSequence) str, "/", 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
