package wj;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;

/* loaded from: classes10.dex */
final class j extends AbstractC7737t implements Function1<MatchResult, CharSequence> {

    /* renamed from: b, reason: collision with root package name */
    public static final j f104592b = new j(1);

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(MatchResult matchResult) {
        MatchResult it = matchResult;
        Intrinsics.checkNotNullParameter(it, "it");
        return ((Object) it.c().get(1)) + "[REDACTED]" + ((Object) it.c().get(3));
    }
}
