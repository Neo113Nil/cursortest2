package ru.ozon.app.android.account.orders.cancel.presentation;

import Sc.r;
import Sc.s;
import W10.c;
import Wc.a;
import androidx.lifecycle.V;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.account.orders.cancel.CancelReasonState;
import ru.ozon.app.android.account.orders.cancel.CancelReasonStateStore;
import ru.ozon.app.android.account.orders.cancel.data.CancelOrderRepository;
import ru.ozon.app.android.account.orders.cancel.data.FetchCancelPostingsAction;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.ConfirmingCancellationPopover;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonViewModelImpl$handleGetCancelPostingsAction$1", f = "CancelReasonVM.kt", l = {188}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CancelReasonViewModelImpl$handleGetCancelPostingsAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CancelReasonViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CancelReasonViewModelImpl$handleGetCancelPostingsAction$1(CancelReasonViewModelImpl cancelReasonViewModelImpl, AtomAction.ComposerAction composerAction, d<? super CancelReasonViewModelImpl$handleGetCancelPostingsAction$1> dVar) {
        super(2, dVar);
        this.this$0 = cancelReasonViewModelImpl;
        this.$action = composerAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CancelReasonViewModelImpl$handleGetCancelPostingsAction$1 cancelReasonViewModelImpl$handleGetCancelPostingsAction$1 = new CancelReasonViewModelImpl$handleGetCancelPostingsAction$1(this.this$0, this.$action, dVar);
        cancelReasonViewModelImpl$handleGetCancelPostingsAction$1.L$0 = obj;
        return cancelReasonViewModelImpl$handleGetCancelPostingsAction$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        ScreenState screenStateWithOrderError;
        Map<String, String> map;
        CancelOrderRepository cancelOrderRepository;
        c cVar;
        CancelReasonViewModelImpl cancelReasonViewModelImpl;
        CancelReasonStateStore cancelReasonStateStore;
        FetchCancelPostingsAction fetchCancelPostingsAction;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                CancelReasonViewModelImpl cancelReasonViewModelImpl2 = this.this$0;
                AtomAction.ComposerAction composerAction = this.$action;
                r.Companion companion = r.INSTANCE;
                cancelReasonViewModelImpl2.getCancelState().setValue(new CancelReasonState.Loading(null, true, 1, null));
                Map<String, String> params = composerAction.getParams();
                if (params != null) {
                    cancelReasonStateStore = cancelReasonViewModelImpl2.stateStore;
                    String selectedReasonId = cancelReasonStateStore.getSelectedReasonId();
                    if (selectedReasonId == null) {
                        selectedReasonId = "";
                    }
                    map = U.n(params, new Pair("reasonId", selectedReasonId));
                } else {
                    map = null;
                }
                cancelOrderRepository = cancelReasonViewModelImpl2.cancelOrderRepository;
                String actionName = composerAction.getActionName();
                cVar = cancelReasonViewModelImpl2.trackingData;
                this.L$0 = cancelReasonViewModelImpl2;
                this.label = 1;
                Object fetchCancelPostings = cancelOrderRepository.fetchCancelPostings(actionName, map, cVar, this);
                if (fetchCancelPostings == aVar) {
                    return aVar;
                }
                cancelReasonViewModelImpl = cancelReasonViewModelImpl2;
                obj = fetchCancelPostings;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cancelReasonViewModelImpl = (CancelReasonViewModelImpl) this.L$0;
                s.b(obj);
            }
            fetchCancelPostingsAction = (FetchCancelPostingsAction) obj;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (fetchCancelPostingsAction.getPopover() == null) {
            cancelReasonViewModelImpl.handleAction(AtomActionMapperKt.toAtomAction(fetchCancelPostingsAction.getNextAction(), null));
            return Unit.f71690a;
        }
        cancelReasonViewModelImpl.getShowEPointsDialogEvent().setValue(ConfirmingCancellationPopover.copy$default(fetchCancelPostingsAction.getPopover(), null, null, null, null, null, fetchCancelPostingsAction.getNextAction(), 31, null));
        cancelReasonViewModelImpl.getCancelState().setValue(new CancelReasonState.Loading(null, false, 1, null));
        a11 = Unit.f71690a;
        r.Companion companion3 = r.INSTANCE;
        CancelReasonViewModelImpl cancelReasonViewModelImpl3 = this.this$0;
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            Lm0.a.f17149a.e(b11);
            V<CancelReasonState<String>> cancelState = cancelReasonViewModelImpl3.getCancelState();
            screenStateWithOrderError = cancelReasonViewModelImpl3.toScreenStateWithOrderError(b11);
            cancelState.setValue(new CancelReasonState.Error(screenStateWithOrderError, null, 2, null));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CancelReasonViewModelImpl$handleGetCancelPostingsAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
