package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.Animatable$stop$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
/* renamed from: m0.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7982c extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C7980b<Object, AbstractC8015t> f73677d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7982c(C7980b<Object, AbstractC8015t> c7980b, kotlin.coroutines.d<? super C7982c> dVar) {
        super(1, dVar);
        this.f73677d = c7980b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
        return new C7982c(this.f73677d, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7982c) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        C7980b.b(this.f73677d);
        return Unit.f71690a;
    }
}
