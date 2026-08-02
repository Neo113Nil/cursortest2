package ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.accessories;

import Ae.x0;
import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesAsyncState;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.accessories.AccessoriesViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.accessories.AccessoriesViewModel$launchPerformCommands$1$5$2", f = "AccessoriesViewModel.kt", l = {146}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AccessoriesViewModel$launchPerformCommands$1$5$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    final /* synthetic */ AccessoriesViewModel.Command $command;
    int label;
    final /* synthetic */ AccessoriesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccessoriesViewModel$launchPerformCommands$1$5$2(AccessoriesViewModel accessoriesViewModel, AtomAction.ComposerAction composerAction, AccessoriesViewModel.Command command, d<? super AccessoriesViewModel$launchPerformCommands$1$5$2> dVar) {
        super(2, dVar);
        this.this$0 = accessoriesViewModel;
        this.$action = composerAction;
        this.$command = command;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AccessoriesViewModel$launchPerformCommands$1$5$2(this.this$0, this.$action, this.$command, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        Object value;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            AccessoriesViewModel accessoriesViewModel = this.this$0;
            AtomAction.ComposerAction composerAction = this.$action;
            long widgetId = ((AccessoriesViewModel.Command.Request) this.$command).getWidgetId();
            this.label = 1;
            obj = accessoriesViewModel.fetchAccessories(composerAction, widgetId, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        AccessoriesAsyncState accessoriesAsyncState = (AccessoriesAsyncState) obj;
        x0Var = this.this$0._state;
        AccessoriesViewModel.Command command = this.$command;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, U.n((Map) value, new Pair(command, accessoriesAsyncState))));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AccessoriesViewModel$launchPerformCommands$1$5$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
