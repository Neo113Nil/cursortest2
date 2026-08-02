package io.ktor.http;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: CookieUtils.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes2.dex */
public final class CookieUtilsKt$tryParseYear$2 implements Function1<Character, Boolean> {
    public static final CookieUtilsKt$tryParseYear$2 INSTANCE = new CookieUtilsKt$tryParseYear$2();

    public final Boolean invoke(char c) {
        return Boolean.valueOf(CookieUtilsKt.isOctet(c));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Character ch) {
        return invoke(ch.charValue());
    }
}
