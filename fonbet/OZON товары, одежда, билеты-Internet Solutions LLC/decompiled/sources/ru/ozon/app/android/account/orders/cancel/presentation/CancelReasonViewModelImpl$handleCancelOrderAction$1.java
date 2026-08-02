package ru.ozon.app.android.account.orders.cancel.presentation;

import Sc.r;
import Sc.s;
import W10.c;
import Wc.a;
import androidx.lifecycle.V;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.account.orders.cancel.CancelReasonState;
import ru.ozon.app.android.account.orders.cancel.CancelReasonStateStore;
import ru.ozon.app.android.account.orders.cancel.data.CancelOrderRepository;
import ru.ozon.app.android.account.orders.cancel.data.CancelOrderResponse;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonViewModelImpl$handleCancelOrderAction$1", f = "CancelReasonVM.kt", l = {166}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CancelReasonViewModelImpl$handleCancelOrderAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CancelReasonViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CancelReasonViewModelImpl$handleCancelOrderAction$1(CancelReasonViewModelImpl cancelReasonViewModelImpl, AtomAction.ComposerAction composerAction, d<? super CancelReasonViewModelImpl$handleCancelOrderAction$1> dVar) {
        super(2, dVar);
        this.this$0 = cancelReasonViewModelImpl;
        this.$action = composerAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CancelReasonViewModelImpl$handleCancelOrderAction$1 cancelReasonViewModelImpl$handleCancelOrderAction$1 = new CancelReasonViewModelImpl$handleCancelOrderAction$1(this.this$0, this.$action, dVar);
        cancelReasonViewModelImpl$handleCancelOrderAction$1.L$0 = obj;
        return cancelReasonViewModelImpl$handleCancelOrderAction$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009a  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        CancelReasonViewModelImpl$handleCancelOrderAction$1 cancelReasonViewModelImpl$handleCancelOrderAction$1;
        Object a11;
        Throwable b11;
        ScreenState screenStateWithOrderError;
        CancelReasonStateStore cancelReasonStateStore;
        CancelOrderRepository cancelOrderRepository;
        CancelReasonStateStore cancelReasonStateStore2;
        CancelReasonStateStore cancelReasonStateStore3;
        c cVar;
        CancelReasonViewModelImpl cancelReasonViewModelImpl;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                CancelReasonViewModelImpl cancelReasonViewModelImpl2 = this.this$0;
                AtomAction.ComposerAction composerAction = this.$action;
                try {
                    r.Companion companion = r.INSTANCE;
                    cancelReasonViewModelImpl2.getCancelState().setValue(new CancelReasonState.Loading(null, true, 1, null));
                    cancelReasonStateStore = cancelReasonViewModelImpl2.stateStore;
                    String selectedReasonId = cancelReasonStateStore.getSelectedReasonId();
                    if (selectedReasonId == null) {
                        return Unit.f71690a;
                    }
                    cancelOrderRepository = cancelReasonViewModelImpl2.cancelOrderRepository;
                    String actionName = composerAction.getActionName();
                    cancelReasonStateStore2 = cancelReasonViewModelImpl2.stateStore;
                    String comment = cancelReasonStateStore2.getComment();
                    cancelReasonStateStore3 = cancelReasonViewModelImpl2.stateStore;
                    Boolean valueOf = Boolean.valueOf(cancelReasonStateStore3.getCheckbox().isCheckedAndEnabled());
                    Map<String, String> params = composerAction.getParams();
                    cVar = cancelReasonViewModelImpl2.trackingData;
                    this.L$0 = cancelReasonViewModelImpl2;
                    this.label = 1;
                    cancelReasonViewModelImpl$handleCancelOrderAction$1 = this;
                    try {
                        Object cancelOrder = cancelOrderRepository.cancelOrder(actionName, selectedReasonId, comment, valueOf, params, cVar, cancelReasonViewModelImpl$handleCancelOrderAction$1);
                        if (cancelOrder == aVar) {
                            return aVar;
                        }
                        cancelReasonViewModelImpl = cancelReasonViewModelImpl2;
                        obj = cancelOrder;
                    } catch (Throwable th3) {
                        th = th3;
                        th2 = th;
                        r.Companion companion2 = r.INSTANCE;
                        a11 = s.a(th2);
                        CancelReasonViewModelImpl cancelReasonViewModelImpl3 = cancelReasonViewModelImpl$handleCancelOrderAction$1.this$0;
                        b11 = r.b(a11);
                        if (b11 != null) {
                        }
                        return Unit.f71690a;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cancelReasonViewModelImpl$handleCancelOrderAction$1 = this;
                    th2 = th;
                    r.Companion companion22 = r.INSTANCE;
                    a11 = s.a(th2);
                    CancelReasonViewModelImpl cancelReasonViewModelImpl32 = cancelReasonViewModelImpl$handleCancelOrderAction$1.this$0;
                    b11 = r.b(a11);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cancelReasonViewModelImpl = (CancelReasonViewModelImpl) this.L$0;
                s.b(obj);
                cancelReasonViewModelImpl$handleCancelOrderAction$1 = this;
            }
            cancelReasonViewModelImpl.handleSuccessComposerAction((CancelOrderResponse) obj);
            a11 = Unit.f71690a;
            r.Companion companion3 = r.INSTANCE;
        } catch (Throwable th5) {
            th2 = th5;
            cancelReasonViewModelImpl$handleCancelOrderAction$1 = this;
        }
        CancelReasonViewModelImpl cancelReasonViewModelImpl322 = cancelReasonViewModelImpl$handleCancelOrderAction$1.this$0;
        b11 = r.b(a11);
        if (b11 != null) {
            Lm0.a.f17149a.e(b11);
            V<CancelReasonState<String>> cancelState = cancelReasonViewModelImpl322.getCancelState();
            screenStateWithOrderError = cancelReasonViewModelImpl322.toScreenStateWithOrderError(b11);
            cancelState.setValue(new CancelReasonState.Error(screenStateWithOrderError, null, 2, null));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CancelReasonViewModelImpl$handleCancelOrderAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
