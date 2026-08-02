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
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarViewModelImpl$handleComposerActionWithAction$1", f = "OrderDoneButtonBarViewModel.kt", l = {103, 198, 123, 123, 123}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class OrderDoneButtonBarViewModelImpl$handleComposerActionWithAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ActionV2Request $request;
    final /* synthetic */ c $trackingData;
    Object L$0;
    int label;
    final /* synthetic */ OrderDoneButtonBarViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderDoneButtonBarViewModelImpl$handleComposerActionWithAction$1(OrderDoneButtonBarViewModelImpl orderDoneButtonBarViewModelImpl, ActionV2Request actionV2Request, c cVar, d<? super OrderDoneButtonBarViewModelImpl$handleComposerActionWithAction$1> dVar) {
        super(2, dVar);
        this.this$0 = orderDoneButtonBarViewModelImpl;
        this.$request = actionV2Request;
        this.$trackingData = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OrderDoneButtonBarViewModelImpl$handleComposerActionWithAction$1(this.this$0, this.$request, this.$trackingData, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
    
        if (r9 != r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e4, code lost:
    
        if (r9 != r0) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[Catch: all -> 0x002f, Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:17:0x002b, B:18:0x005e, B:20:0x0069, B:22:0x0071, B:24:0x0079, B:26:0x007f, B:27:0x00aa, B:29:0x00b2, B:31:0x00b8, B:33:0x00be, B:38:0x008e, B:40:0x0096, B:42:0x009c, B:44:0x0035, B:45:0x0048, B:49:0x003c), top: B:2:0x0009, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[Catch: all -> 0x002f, Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:17:0x002b, B:18:0x005e, B:20:0x0069, B:22:0x0071, B:24:0x0079, B:26:0x007f, B:27:0x00aa, B:29:0x00b2, B:31:0x00b8, B:33:0x00be, B:38:0x008e, B:40:0x0096, B:42:0x009c, B:44:0x0035, B:45:0x0048, B:49:0x003c), top: B:2:0x0009, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e A[Catch: all -> 0x002f, Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:17:0x002b, B:18:0x005e, B:20:0x0069, B:22:0x0071, B:24:0x0079, B:26:0x007f, B:27:0x00aa, B:29:0x00b2, B:31:0x00b8, B:33:0x00be, B:38:0x008e, B:40:0x0096, B:42:0x009c, B:44:0x0035, B:45:0x0048, B:49:0x003c), top: B:2:0x0009, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006e  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object hideLoader;
        Object hideLoader2;
        Object showLoader;
        ActionV2Repository actionV2Repository;
        ComposerActionWithActionDTO composerActionWithActionDTO;
        ComposerActionWithActionDTO.MessageDTO message;
        ComposerActionWithActionDTO composerActionWithActionDTO2;
        Object hideLoader3;
        AtomActionDTO action;
        AtomAction atomAction;
        NotificationDTO notificationBar;
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
            ActionV2Response actionV2Response = (ActionV2Response) obj;
            composerActionWithActionDTO = (ComposerActionWithActionDTO) actionV2Response.getData();
            if ((composerActionWithActionDTO == null ? composerActionWithActionDTO.getNotificationBar() : null) == null) {
                ComposerActionWithActionDTO composerActionWithActionDTO3 = (ComposerActionWithActionDTO) actionV2Response.getData();
                if (composerActionWithActionDTO3 != null && (notificationBar = composerActionWithActionDTO3.getNotificationBar()) != null) {
                    this.this$0.getActions().setValue(new OrderDoneButtonBarViewModelImpl.Action.ShowNotification(notificationBar));
                }
            } else {
                ComposerActionWithActionDTO composerActionWithActionDTO4 = (ComposerActionWithActionDTO) actionV2Response.getData();
                if (composerActionWithActionDTO4 != null && (message = composerActionWithActionDTO4.getMessage()) != null) {
                    this.this$0.getActions().setValue(new OrderDoneButtonBarViewModelImpl.Action.ShowMessage(message));
                }
            }
            composerActionWithActionDTO2 = (ComposerActionWithActionDTO) actionV2Response.getData();
            if (composerActionWithActionDTO2 != null && (action = composerActionWithActionDTO2.getAction()) != null && (atomAction = AtomActionMapperKt.toAtomAction(action, null)) != null) {
                this.this$0.getActions().setValue(new OrderDoneButtonBarViewModelImpl.Action.InvokeAction(atomAction));
            }
            OrderDoneButtonBarViewModelImpl orderDoneButtonBarViewModelImpl4 = this.this$0;
            this.label = 3;
            hideLoader3 = orderDoneButtonBarViewModelImpl4.hideLoader(this);
        }
        actionV2Repository = this.this$0.actionV2Repository;
        ActionV2Request actionV2Request = this.$request;
        c cVar = this.$trackingData;
        this.label = 2;
        obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, cVar, ComposerActionWithActionDTO.class, this);
        if (obj == aVar) {
            return aVar;
        }
        ActionV2Response actionV2Response2 = (ActionV2Response) obj;
        composerActionWithActionDTO = (ComposerActionWithActionDTO) actionV2Response2.getData();
        if ((composerActionWithActionDTO == null ? composerActionWithActionDTO.getNotificationBar() : null) == null) {
        }
        composerActionWithActionDTO2 = (ComposerActionWithActionDTO) actionV2Response2.getData();
        if (composerActionWithActionDTO2 != null) {
            this.this$0.getActions().setValue(new OrderDoneButtonBarViewModelImpl.Action.InvokeAction(atomAction));
        }
        OrderDoneButtonBarViewModelImpl orderDoneButtonBarViewModelImpl42 = this.this$0;
        this.label = 3;
        hideLoader3 = orderDoneButtonBarViewModelImpl42.hideLoader(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OrderDoneButtonBarViewModelImpl$handleComposerActionWithAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
