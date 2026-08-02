package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm;

import A00.a;
import Ae.w0;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "it", "", "<anonymous>", "(LA00/a;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2$launchComposerRefreshListener$2", f = "AccessoriesViewModelV2.kt", l = {174}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AccessoriesViewModelV2$launchComposerRefreshListener$2 extends j implements Function2<a, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ AccessoriesViewModelV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccessoriesViewModelV2$launchComposerRefreshListener$2(AccessoriesViewModelV2 accessoriesViewModelV2, d<? super AccessoriesViewModelV2$launchComposerRefreshListener$2> dVar) {
        super(2, dVar);
        this.this$0 = accessoriesViewModelV2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AccessoriesViewModelV2$launchComposerRefreshListener$2(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, d<? super Unit> dVar) {
        return ((AccessoriesViewModelV2$launchComposerRefreshListener$2) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            w0Var = this.this$0.commandFlow;
            AccessoriesViewModelV2.Command.ClearState clearState = AccessoriesViewModelV2.Command.ClearState.INSTANCE;
            this.label = 1;
            if (w0Var.emit(clearState, this) == aVar) {
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
