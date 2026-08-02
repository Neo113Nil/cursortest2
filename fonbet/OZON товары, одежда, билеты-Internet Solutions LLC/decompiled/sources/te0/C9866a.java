package te0;

import Cm.e;
import We.B;
import We.L;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ue0.InterfaceC10046c;

/* renamed from: te0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C9866a implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final IntRange f99465a = new IntRange(300, 599, 1);

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        L proceed = chain.proceed(chain.request());
        if (f99465a.n(proceed.m())) {
            String c11 = proceed.r().c("x-o3-trace-id");
            C9867b c9867b = C9867b.f99466a;
            StringBuilder g10 = e.g(proceed.m(), "Have ", " on url ", proceed.L().j().w().toASCIIString(), ", trace_id ");
            g10.append(c11);
            C9867b.g(g10.toString(), InterfaceC10046c.a.ERROR, 4);
        }
        return proceed;
    }
}
