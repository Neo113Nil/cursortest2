package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend")
/* renamed from: r0.E, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9104E extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC9106G, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f82400d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.J f82401e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f82402f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9104E(kotlin.jvm.internal.J j11, float f7, kotlin.coroutines.d<? super C9104E> dVar) {
        super(2, dVar);
        this.f82401e = j11;
        this.f82402f = f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C9104E c9104e = new C9104E(this.f82401e, this.f82402f, dVar);
        c9104e.f82400d = obj;
        return c9104e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC9106G interfaceC9106G, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9104E) create(interfaceC9106G, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        this.f82401e.f71784a = ((InterfaceC9106G) this.f82400d).a(this.f82402f);
        return Unit.f71690a;
    }
}
