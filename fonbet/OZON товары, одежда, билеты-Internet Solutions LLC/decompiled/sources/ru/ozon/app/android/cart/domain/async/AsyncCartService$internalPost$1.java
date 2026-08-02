package ru.ozon.app.android.cart.domain.async;

import Ae.w0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cart.domain.async.AsyncCartService$internalPost$1", f = "AsyncCartService.kt", l = {121}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AsyncCartService$internalPost$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ UiAction $uiAction;
    int label;
    final /* synthetic */ AsyncCartService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncCartService$internalPost$1(AsyncCartService asyncCartService, UiAction uiAction, d<? super AsyncCartService$internalPost$1> dVar) {
        super(2, dVar);
        this.this$0 = asyncCartService;
        this.$uiAction = uiAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AsyncCartService$internalPost$1(this.this$0, this.$uiAction, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            w0Var = this.this$0.paramsToModify;
            UiAction uiAction = this.$uiAction;
            this.label = 1;
            if (w0Var.emit(uiAction, this) == aVar) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AsyncCartService$internalPost$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
