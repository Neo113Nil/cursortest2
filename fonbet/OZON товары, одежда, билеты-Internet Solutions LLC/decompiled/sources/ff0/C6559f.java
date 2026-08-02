package ff0;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import lf0.C7951b;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.navigation.compose.jetpack.NavGraphBuilderExtKt$OzonNavHost$8$1", f = "NavGraphBuilderExt.kt", l = {112}, m = "invokeSuspend")
/* renamed from: ff0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6559f extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f63407d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7951b f63408e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6559f(C7951b c7951b, kotlin.coroutines.d<? super C6559f> dVar) {
        super(2, dVar);
        this.f63408e = c7951b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C6559f(this.f63408e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C6559f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f63407d;
        if (i11 == 0) {
            s.b(obj);
            this.f63407d = 1;
            if (this.f63408e.d(this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
