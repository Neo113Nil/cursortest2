package io.sentry.android.replay;

import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function1<MatchResult, CharSequence> {

    /* renamed from: b, reason: collision with root package name */
    public static final c f67446b = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(MatchResult matchResult) {
        MatchResult it = matchResult;
        Intrinsics.checkNotNullParameter(it, "it");
        String upperCase = String.valueOf(kotlin.text.h.M(it.getValue())).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
