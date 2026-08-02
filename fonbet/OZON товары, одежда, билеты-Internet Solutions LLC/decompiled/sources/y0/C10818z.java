package y0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performBackwardPaging$1", f = "Pager.kt", l = {474}, m = "invokeSuspend")
/* renamed from: y0.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10818z extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f105879d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ b0 f105880e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10818z(b0 b0Var, kotlin.coroutines.d<? super C10818z> dVar) {
        super(2, dVar);
        this.f105880e = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C10818z(this.f105880e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C10818z) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object obj2;
        Object obj3 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f105879d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f105879d = 1;
            int i12 = c0.f105777d;
            b0 b0Var = this.f105880e;
            if (b0Var.r() - 1 >= 0) {
                obj2 = b0.m(b0Var, b0Var.r() - 1, null, this, 6);
                if (obj2 != obj3) {
                    obj2 = Unit.f71690a;
                }
            } else {
                obj2 = Unit.f71690a;
            }
            if (obj2 == obj3) {
                return obj3;
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
