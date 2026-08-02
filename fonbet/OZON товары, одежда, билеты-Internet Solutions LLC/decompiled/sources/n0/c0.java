package n0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c0 {

    static final class a extends AbstractC7737t implements Function1<I1.D, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f76154b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(I1.D d11) {
            I1.h hVar;
            hVar = I1.h.f11689c;
            I1.z.p(d11, hVar);
            return Unit.f71690a;
        }
    }

    @NotNull
    public static final androidx.compose.ui.e a(@NotNull androidx.compose.ui.e eVar) {
        return I1.o.c(eVar, true, a.f76154b);
    }

    public static androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f7) {
        return I1.o.c(eVar, true, new b0(kotlin.ranges.h.l(0.0f, 1.0f), f7));
    }
}
