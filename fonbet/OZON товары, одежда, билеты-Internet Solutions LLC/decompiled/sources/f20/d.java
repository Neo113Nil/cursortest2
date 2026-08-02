package f20;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import m20.InterfaceC8046a;
import m20.InterfaceC8047b;
import org.jetbrains.annotations.NotNull;
import z00.f;

/* loaded from: classes7.dex */
public final class d implements InterfaceC8046a<f, C6406a> {
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
    public final List<C6406a> map(f fVar, l20.d info) {
        f state = fVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(new C6406a(info.d().hashCode(), state));
    }
}
