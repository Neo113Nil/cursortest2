package td0;

import We.B;
import cf.C5824e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class k {
    public static final void a(@NotNull B.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        C5824e.c timeout = aVar.call().timeout();
        if (timeout == null) {
            timeout = null;
        }
        if (timeout != null) {
            timeout.s();
        }
    }
}
