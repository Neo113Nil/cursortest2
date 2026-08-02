package v0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.B0;
import m0.C8004n;
import m0.C8006o;
import m0.C8011q0;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.lazy.LazyListState$updateScrollDeltaForPostLookahead$2$2", f = "LazyListState.kt", l = {587}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class L extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f101512d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ I f101513e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L(I i11, kotlin.coroutines.d<? super L> dVar) {
        super(2, dVar);
        this.f101513e = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new L(this.f101513e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((L) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        C8006o c8006o;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f101512d;
        if (i11 == 0) {
            Sc.s.b(obj);
            c8006o = this.f101513e.f101491w;
            Float f7 = new Float(0.0f);
            C8011q0 c11 = C8004n.c(400.0f, new Float(0.5f), 1);
            this.f101512d = 1;
            if (B0.g(c8006o, f7, c11, true, null, this, 8) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
