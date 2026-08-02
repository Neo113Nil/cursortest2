package km0;

import gm0.C6752a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class c {
    public static AbstractC7693a a(AbstractC7693a abstractC7693a, jm0.b dispatcher) {
        C6752a backpressureStrategy = new C6752a();
        Intrinsics.checkNotNullParameter(abstractC7693a, "<this>");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        return new b(abstractC7693a, dispatcher, backpressureStrategy);
    }
}
