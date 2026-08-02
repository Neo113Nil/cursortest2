package n0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.FocusableNode$onFocusEvent$1", f = "Focusable.kt", l = {224}, m = "invokeSuspend")
/* renamed from: n0.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8403x extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f76245d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C8402w f76246e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8403x(C8402w c8402w, kotlin.coroutines.d<? super C8403x> dVar) {
        super(2, dVar);
        this.f76246e = c8402w;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C8403x(this.f76246e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C8403x) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f76245d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f76245d = 1;
            if (z0.i.a(this.f76246e, null, this) == aVar) {
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
