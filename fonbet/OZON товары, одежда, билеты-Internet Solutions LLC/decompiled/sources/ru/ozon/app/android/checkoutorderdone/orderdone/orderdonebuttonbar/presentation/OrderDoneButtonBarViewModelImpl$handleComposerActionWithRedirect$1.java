package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation;

import Sc.s;
import W10.c;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarViewModelImpl;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.ResponseRedirectAction;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarViewModelImpl$handleComposerActionWithRedirect$1", f = "OrderDoneButtonBarViewModel.kt", l = {136, 198, 150, 150, 150}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class OrderDoneButtonBarViewModelImpl$handleComposerActionWithRedirect$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ActionV2Request $request;
    final /* synthetic */ c $trackingData;
    Object L$0;
    int label;
    final /* synthetic */ OrderDoneButtonBarViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderDoneButtonBarViewModelImpl$handleComposerActionWithRedirect$1(OrderDoneButtonBarViewModelImpl orderDoneButtonBarViewModelImpl, ActionV2Request actionV2Request, c cVar, d<? super OrderDoneButtonBarViewModelImpl$handleComposerActionWithRedirect$1> dVar) {
        super(2, dVar);
        this.this$0 = orderDoneButtonBarViewModelImpl;
        this.$request = actionV2Request;
        this.$trackingData = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OrderDoneButtonBarViewModelImpl$handleComposerActionWithRedirect$1(this.this$0, this.$request, this.$trackingData, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
    
        if (r9 != r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c3, code lost:
    
        if (r9 != r0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[Catch: all -> 0x002f, Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:17:0x002b, B:18:0x005e, B:20:0x0066, B:22:0x0077, B:23:0x007d, B:25:0x0093, B:26:0x0099, B:28:0x00a1, B:29:0x00a5, B:36:0x0035, B:37:0x0048, B:41:0x003c), top: B:2:0x0009, outer: #1 }] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object hideLoader;
        Object hideLoader2;
        Object showLoader;
        ActionV2Repository actionV2Repository;
        ActionV2Response actionV2Response;
        Object hideLoader3;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            try {
            } catch (Exception e11) {
                Lm0.a.f17149a.e(e11);
                OrderDoneButtonBarViewModelImpl orderDoneButtonBarViewModelImpl = this.this$0;
                this.label = 4;
                hideLoader2 = orderDoneButtonBarViewModelImpl.hideLoader(this);
            }
        } catch (Throwable th2) {
            OrderDoneButtonBarViewModelImpl orderDoneButtonBarViewModelImpl2 = this.this$0;
            this.L$0 = th2;
            this.label = 5;
            hideLoader = orderDoneButtonBarViewModelImpl2.hideLoader(this);
            if (hideLoader != aVar) {
                throw th2;
            }
        }
        if (i11 == 0) {
            s.b(obj);
            OrderDoneButtonBarViewModelImpl orderDoneButtonBarViewModelImpl3 = this.this$0;
            this.label = 1;
            showLoader = orderDoneButtonBarViewModelImpl3.showLoader(this);
            if (showLoader == aVar) {
                return aVar;
            }
        } else if (i11 == 1) {
            s.b(obj);
        } else {
            if (i11 != 2) {
                if (i11 == 3 || i11 == 4) {
                    s.b(obj);
                    return Unit.f71690a;
                }
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th3 = (Throwable) this.L$0;
                s.b(obj);
                throw th3;
            }
            s.b(obj);
            actionV2Response = (ActionV2Response) obj;
            if (actionV2Response.getData() != null) {
                SingleLiveEvent<OrderDoneButtonBarViewModelImpl.Action> actions = this.this$0.getActions();
                ResponseRedirectAction responseRedirectAction = (ResponseRedirectAction) actionV2Response.getData();
                actions.setValue(new OrderDoneButtonBarViewModelImpl.Action.ShowRestrictionMessage(responseRedirectAction != null ? responseRedirectAction.getMessage() : null));
                SingleLiveEvent<OrderDoneButtonBarViewModelImpl.Action> actions2 = this.this$0.getActions();
                ResponseRedirectAction responseRedirectAction2 = (ResponseRedirectAction) actionV2Response.getData();
                String redirectLink = responseRedirectAction2 != null ? responseRedirectAction2.getRedirectLink() : null;
                ResponseRedirectAction responseRedirectAction3 = (ResponseRedirectAction) actionV2Response.getData();
                actions2.setValue(new OrderDoneButtonBarViewModelImpl.Action.Redirect(redirectLink, responseRedirectAction3 != null ? responseRedirectAction3.getRefreshLink() : null));
            }
            OrderDoneButtonBarViewModelImpl orderDoneButtonBarViewModelImpl4 = this.this$0;
            this.label = 3;
            hideLoader3 = orderDoneButtonBarViewModelImpl4.hideLoader(this);
        }
        actionV2Repository = this.this$0.actionV2Repository;
        ActionV2Request actionV2Request = this.$request;
        c cVar = this.$trackingData;
        this.label = 2;
        obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, cVar, ResponseRedirectAction.class, this);
        if (obj == aVar) {
            return aVar;
        }
        actionV2Response = (ActionV2Response) obj;
        if (actionV2Response.getData() != null) {
        }
        OrderDoneButtonBarViewModelImpl orderDoneButtonBarViewModelImpl42 = this.this$0;
        this.label = 3;
        hideLoader3 = orderDoneButtonBarViewModelImpl42.hideLoader(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OrderDoneButtonBarViewModelImpl$handleComposerActionWithRedirect$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
