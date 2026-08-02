package ru.ozon.app.android.orderdetails.orderactions.v1.presentation;

import Sc.s;
import W10.c;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.CancelReasonsRepository;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.CancelReasonsWithPayloads;
import ru.ozon.app.android.orderdetails.orderactions.v1.presentation.Action;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.orderdetails.orderactions.v1.presentation.OrderActionsViewModel$fetchCancelReasons$1", f = "OrderActionsViewModel.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OrderActionsViewModel$fetchCancelReasons$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    final /* synthetic */ c $trackingData;
    int label;
    final /* synthetic */ OrderActionsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderActionsViewModel$fetchCancelReasons$1(OrderActionsViewModel orderActionsViewModel, AtomAction.ComposerAction composerAction, c cVar, d<? super OrderActionsViewModel$fetchCancelReasons$1> dVar) {
        super(2, dVar);
        this.this$0 = orderActionsViewModel;
        this.$action = composerAction;
        this.$trackingData = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OrderActionsViewModel$fetchCancelReasons$1(this.this$0, this.$action, this.$trackingData, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CancelReasonsRepository cancelReasonsRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            try {
                if (i11 == 0) {
                    s.b(obj);
                    this.this$0.getActions().setValue(Action.ShowLoader.INSTANCE);
                    cancelReasonsRepository = this.this$0.cancelReasonsRepository;
                    String actionName = this.$action.getActionName();
                    Map<String, String> params = this.$action.getParams();
                    c cVar = this.$trackingData;
                    this.label = 1;
                    obj = cancelReasonsRepository.fetchCancelReasons(actionName, params, cVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                this.this$0.getActions().setValue(new Action.OpenReasons((CancelReasonsWithPayloads) obj));
            } catch (Exception e11) {
                Lm0.a.f17149a.e(e11);
                this.this$0.getActions().setValue(Action.Fail.INSTANCE);
            }
            return Unit.f71690a;
        } finally {
            this.this$0.getActions().setValue(Action.HideLoader.INSTANCE);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OrderActionsViewModel$fetchCancelReasons$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
