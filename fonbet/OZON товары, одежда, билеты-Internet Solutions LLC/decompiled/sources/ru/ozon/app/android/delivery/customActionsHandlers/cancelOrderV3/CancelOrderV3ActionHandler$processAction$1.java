package ru.ozon.app.android.delivery.customActionsHandlers.cancelOrderV3;

import He.b;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.delivery.customActionsHandlers.cancelOrderV3.CancelOrderV3ActionHandler$processAction$1", f = "CancelOrderV3ActionHandler.kt", l = {57, 69}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CancelOrderV3ActionHandler$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ ActionV2Request $request;
    Object L$0;
    int label;
    final /* synthetic */ CancelOrderV3ActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CancelOrderV3ActionHandler$processAction$1(AtomAction atomAction, CancelOrderV3ActionHandler cancelOrderV3ActionHandler, CustomActionHandler.HandlerReferences handlerReferences, InterfaceC7851b interfaceC7851b, ActionV2Request actionV2Request, d<? super CancelOrderV3ActionHandler$processAction$1> dVar) {
        super(2, dVar);
        this.$action = atomAction;
        this.this$0 = cancelOrderV3ActionHandler;
        this.$handlerRefs = handlerReferences;
        this.$controller = interfaceC7851b;
        this.$request = actionV2Request;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CancelOrderV3ActionHandler$processAction$1(this.$action, this.this$0, this.$handlerRefs, this.$controller, this.$request, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Response actionV2Response;
        Object clearCart;
        ActionV2Response actionV2Response2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            try {
            } catch (Exception e11) {
                Lm0.a.f17149a.e(e11);
                this.this$0.showError(this.$handlerRefs.getRefs().getContainer());
            }
            if (i11 == 0) {
                s.b(obj);
                C10720e0 c10720e0 = C10720e0.f105451a;
                b bVar = b.f10879b;
                CancelOrderV3ActionHandler$processAction$1$response$1 cancelOrderV3ActionHandler$processAction$1$response$1 = new CancelOrderV3ActionHandler$processAction$1$response$1(this.this$0, this.$request, this.$handlerRefs, null);
                this.label = 1;
                obj = C10727i.f(bVar, cancelOrderV3ActionHandler$processAction$1$response$1, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    actionV2Response2 = (ActionV2Response) this.L$0;
                    s.b(obj);
                    actionV2Response = actionV2Response2;
                    this.this$0.handleSuccess(actionV2Response, this.$handlerRefs);
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            actionV2Response = (ActionV2Response) obj;
            String error = actionV2Response.getError();
            if (error != null) {
                throw new IllegalStateException(error);
            }
            if (Intrinsics.d(((AtomAction.ComposerAction) this.$action).getActionName(), "cancelOrderHandlerV3")) {
                CancelOrderV3ActionHandler cancelOrderV3ActionHandler = this.this$0;
                this.L$0 = actionV2Response;
                this.label = 2;
                clearCart = cancelOrderV3ActionHandler.clearCart(this);
                if (clearCart != aVar) {
                    actionV2Response2 = actionV2Response;
                    actionV2Response = actionV2Response2;
                }
                return aVar;
            }
            this.this$0.handleSuccess(actionV2Response, this.$handlerRefs);
            return Unit.f71690a;
        } finally {
            this.$controller.hideLoader();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CancelOrderV3ActionHandler$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
