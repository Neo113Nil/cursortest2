package w0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import r0.InterfaceC9106G;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class Q extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC9106G, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ O f103242d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f103243e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q(O o11, int i11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f103242d = o11;
        this.f103243e = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new Q(this.f103242d, this.f103243e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC9106G interfaceC9106G, kotlin.coroutines.d<? super Unit> dVar) {
        return ((Q) create(interfaceC9106G, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        this.f103242d.A(this.f103243e, 0, true);
        return Unit.f71690a;
    }
}
