package km0;

import jm0.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rl0.g0;

/* loaded from: classes8.dex */
public final class f {
    public static void a(AbstractC7693a abstractC7693a, g0 onNext) {
        Function1<Throwable, Unit> onError = j.a();
        Intrinsics.checkNotNullParameter(abstractC7693a, "<this>");
        Intrinsics.checkNotNullParameter(onError, "onError");
        e onComplete = e.f71682b;
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        abstractC7693a.a(new g(onError, onComplete, onNext));
    }
}
