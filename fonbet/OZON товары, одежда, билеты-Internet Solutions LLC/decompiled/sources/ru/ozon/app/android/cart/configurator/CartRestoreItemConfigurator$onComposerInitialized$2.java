package ru.ozon.app.android.cart.configurator;

import A00.a;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.CartSplitV2CellItemViewModel;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a$u;", "event", "", "<anonymous>", "(LA00/a$u;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cart.configurator.CartRestoreItemConfigurator$onComposerInitialized$2", f = "CartRestoreItemConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CartRestoreItemConfigurator$onComposerInitialized$2 extends j implements Function2<a.u, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CartRestoreItemConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartRestoreItemConfigurator$onComposerInitialized$2(CartRestoreItemConfigurator cartRestoreItemConfigurator, d<? super CartRestoreItemConfigurator$onComposerInitialized$2> dVar) {
        super(2, dVar);
        this.this$0 = cartRestoreItemConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CartRestoreItemConfigurator$onComposerInitialized$2 cartRestoreItemConfigurator$onComposerInitialized$2 = new CartRestoreItemConfigurator$onComposerInitialized$2(this.this$0, dVar);
        cartRestoreItemConfigurator$onComposerInitialized$2.L$0 = obj;
        return cartRestoreItemConfigurator$onComposerInitialized$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a.u uVar, d<? super Unit> dVar) {
        return ((CartRestoreItemConfigurator$onComposerInitialized$2) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        r2 = r1.this$0.viewModel;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CartSplitV2CellItemViewModel cartSplitV2CellItemViewModel;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        a.u uVar = (a.u) this.L$0;
        if (((uVar instanceof a.u.b) || (uVar instanceof a.u.c)) && cartSplitV2CellItemViewModel != null) {
            cartSplitV2CellItemViewModel.stopTimer();
        }
        return Unit.f71690a;
    }
}
