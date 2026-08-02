package r0;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import r0.C9112M;

/* renamed from: r0.V, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC9120V extends InterfaceC9138r {
    @Override // r0.InterfaceC9138r
    default Object a(@NotNull C9112M.a aVar, float f7, @NotNull kotlin.coroutines.d dVar) {
        Function1 function1;
        function1 = W.f82525a;
        return b(aVar, f7, function1, (kotlin.coroutines.jvm.internal.c) dVar);
    }

    Object b(@NotNull C9112M.a aVar, float f7, @NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar);
}
