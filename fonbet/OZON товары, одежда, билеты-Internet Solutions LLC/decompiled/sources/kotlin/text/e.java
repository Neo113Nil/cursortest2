package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class e extends C7735q implements Function1<MatchResult, MatchResult> {

    /* renamed from: a, reason: collision with root package name */
    public static final e f71971a = new e();

    e() {
        super(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MatchResult invoke(MatchResult matchResult) {
        MatchResult p02 = matchResult;
        Intrinsics.checkNotNullParameter(p02, "p0");
        return p02.next();
    }
}
