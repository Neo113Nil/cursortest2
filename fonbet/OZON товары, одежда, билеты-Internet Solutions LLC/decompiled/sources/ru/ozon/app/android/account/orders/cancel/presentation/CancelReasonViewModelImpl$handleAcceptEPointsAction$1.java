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
import ru.ozon.app.android.account.orders.cancel.data.AcceptPointsResponse;
import ru.ozon.app.android.account.orders.cancel.data.CancelOrderRepository;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonViewModelImpl$handleAcceptEPointsAction$1", f = "CancelReasonVM.kt", l = {213}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CancelReasonViewModelImpl$handleAcceptEPointsAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CancelReasonViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CancelReasonViewModelImpl$handleAcceptEPointsAction$1(CancelReasonViewModelImpl cancelReasonViewModelImpl, AtomAction.ComposerAction composerAction, d<? super CancelReasonViewModelImpl$handleAcceptEPointsAction$1> dVar) {
        super(2, dVar);
        this.this$0 = cancelReasonViewModelImpl;
        this.$action = composerAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CancelReasonViewModelImpl$handleAcceptEPointsAction$1 cancelReasonViewModelImpl$handleAcceptEPointsAction$1 = new CancelReasonViewModelImpl$handleAcceptEPointsAction$1(this.this$0, this.$action, dVar);
        cancelReasonViewModelImpl$handleAcceptEPointsAction$1.L$0 = obj;
        return cancelReasonViewModelImpl$handleAcceptEPointsAction$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        ScreenState screenStateWithOrderError;
        CancelOrderRepository cancelOrderRepository;
        c cVar;
        CancelReasonViewModelImpl cancelReasonViewModelImpl;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                CancelReasonViewModelImpl cancelReasonViewModelImpl2 = this.this$0;
                AtomAction.ComposerAction composerAction = this.$action;
                r.Companion companion = r.INSTANCE;
                cancelReasonViewModelImpl2.getCancelState().setValue(new CancelReasonState.Loading(null, true, 1, null));
                cancelOrderRepository = cancelReasonViewModelImpl2.cancelOrderRepository;
                String actionName = composerAction.getActionName();
                Map<String, String> params = composerAction.getParams();
                cVar = cancelReasonViewModelImpl2.trackingData;
                this.L$0 = cancelReasonViewModelImpl2;
                this.label = 1;
                Object declineCancelPostings = cancelOrderRepository.declineCancelPostings(actionName, params, cVar, this);
                if (declineCancelPostings == aVar) {
                    return aVar;
                }
                cancelReasonViewModelImpl = cancelReasonViewModelImpl2;
                obj = declineCancelPostings;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cancelReasonViewModelImpl = (CancelReasonViewModelImpl) this.L$0;
                s.b(obj);
            }
            cancelReasonViewModelImpl.getCancelState().postValue(new CancelReasonState.SuccessWithAcceptEPoints(null, ((AcceptPointsResponse) obj).getNotification()));
            a11 = Unit.f71690a;
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
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
        return ((CancelReasonViewModelImpl$handleAcceptEPointsAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
