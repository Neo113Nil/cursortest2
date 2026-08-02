package uj0;

import Qj0.B;
import Qj0.C3887g;
import Qj0.G;
import Qj0.U;
import Qj0.t0;
import ei0.InterfaceC6369b;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.ObjectTypes;
import tj0.InterfaceC9882b;

/* loaded from: classes3.dex */
public final class b implements InterfaceC9882b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6369b f100833a;

    public b(@NotNull InterfaceC6369b tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f100833a = tracker;
    }

    @Override // tj0.InterfaceC9882b
    public final Unit a(@NotNull String str, Integer num, Long l11) {
        if (h.K(str) || l11 == null || num == null) {
            return Unit.f71690a;
        }
        int intValue = num.intValue();
        for (int i11 = 0; i11 < intValue; i11++) {
            String a11 = Ej.b.a(i11, "test_trace_");
            InterfaceC6369b interfaceC6369b = this.f100833a;
            U beginTrace = interfaceC6369b.beginTrace(a11);
            t0 t0Var = new t0("https://ozon.ru");
            int i12 = U.f23535i;
            beginTrace.n(t0Var, true);
            beginTrace.n(new G("test_event_type", "test_reason", new Double(0.0d), new Long(0L)), true);
            beginTrace.o(new C3887g(str), l11.longValue(), false);
            beginTrace.n(new B(ObjectTypes.PCL_PAGE), true);
            interfaceC6369b.endTrace(a11);
        }
        return Unit.f71690a;
    }
}
