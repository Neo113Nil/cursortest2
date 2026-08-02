package ru.ozon.app.android.returns.ui.domain;

import Ae.InterfaceC2397i;
import Sc.InterfaceC4003e;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PostRefreshHandlerFactory$sam$kotlinx_coroutines_flow_FlowCollector$0 implements InterfaceC2397i, InterfaceC7732n {
    private final /* synthetic */ Function2 function;

    PostRefreshHandlerFactory$sam$kotlinx_coroutines_flow_FlowCollector$0(Function2 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    @Override // Ae.InterfaceC2397i
    public final /* synthetic */ Object emit(Object obj, d dVar) {
        return this.function.invoke(obj, dVar);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC2397i) && (obj instanceof InterfaceC7732n)) {
            return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC7732n
    @NotNull
    public final InterfaceC4003e<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
