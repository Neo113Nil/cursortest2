package g20;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import m20.InterfaceC8046a;
import m20.InterfaceC8047b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class e implements InterfaceC8046a<C6615a, b> {
    @Override // m20.InterfaceC8046a
    public final boolean canMap(Object obj) {
        return true;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public final InterfaceC8047b getWidgetType() {
        return InterfaceC8047b.a.f74254a;
    }

    @Override // m20.InterfaceC8046a
    public final List<b> map(C6615a c6615a, l20.d info) {
        C6615a state = c6615a;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(new b(info.d().hashCode()));
    }
}
