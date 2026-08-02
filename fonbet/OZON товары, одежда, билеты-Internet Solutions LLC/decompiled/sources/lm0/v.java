package lm0;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class v {
    public static AbstractC7971a a(b bVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int i11 = jm0.e.f70218e;
        jm0.b dispatcher = jm0.e.c();
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return new u(bVar, dispatcher);
    }
}
