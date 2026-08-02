package ru.ozon.app.android.actionHandlers.pdp.sellerSubscribe;

import He.b;
import Sc.r;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.actionHandlers.pdp.sellerSubscribe.data.SisLikeResponse;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.actionHandlers.pdp.sellerSubscribe.BaseSellerSubscribeActionHandler$processAction$3", f = "BaseSellerSubscribeActionHandler.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BaseSellerSubscribeActionHandler$processAction$3 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ Boolean $isNotNotification;
    final /* synthetic */ String $sellerId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ BaseSellerSubscribeActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseSellerSubscribeActionHandler$processAction$3(BaseSellerSubscribeActionHandler baseSellerSubscribeActionHandler, CustomActionHandler.HandlerReferences handlerReferences, String str, AtomAction atomAction, Boolean bool, d<? super BaseSellerSubscribeActionHandler$processAction$3> dVar) {
        super(2, dVar);
        this.this$0 = baseSellerSubscribeActionHandler;
        this.$handlerRefs = handlerReferences;
        this.$sellerId = str;
        this.$action = atomAction;
        this.$isNotNotification = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        BaseSellerSubscribeActionHandler$processAction$3 baseSellerSubscribeActionHandler$processAction$3 = new BaseSellerSubscribeActionHandler$processAction$3(this.this$0, this.$handlerRefs, this.$sellerId, this.$action, this.$isNotNotification, dVar);
        baseSellerSubscribeActionHandler$processAction$3.L$0 = obj;
        return baseSellerSubscribeActionHandler$processAction$3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        NotificationAtom.NotificationWithIcon errorNotificationDTO;
        BaseSellerSubscribeActionHandler baseSellerSubscribeActionHandler;
        String str;
        CustomActionHandler.HandlerReferences handlerReferences;
        Boolean bool;
        NotificationModelWrapper notification;
        String error;
        NotificationAtom.NotificationWithIcon errorNotificationDTO2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        Object obj2 = null;
        try {
            if (i11 == 0) {
                s.b(obj);
                baseSellerSubscribeActionHandler = this.this$0;
                CustomActionHandler.HandlerReferences handlerReferences2 = this.$handlerRefs;
                str = this.$sellerId;
                AtomAction atomAction = this.$action;
                Boolean bool2 = this.$isNotNotification;
                r.Companion companion = r.INSTANCE;
                C10720e0 c10720e0 = C10720e0.f105451a;
                b bVar = b.f10879b;
                BaseSellerSubscribeActionHandler$processAction$3$1$result$1 baseSellerSubscribeActionHandler$processAction$3$1$result$1 = new BaseSellerSubscribeActionHandler$processAction$3$1$result$1(atomAction, baseSellerSubscribeActionHandler, null);
                this.L$0 = baseSellerSubscribeActionHandler;
                this.L$1 = handlerReferences2;
                this.L$2 = str;
                this.L$3 = bool2;
                this.label = 1;
                Object f7 = C10727i.f(bVar, baseSellerSubscribeActionHandler$processAction$3$1$result$1, this);
                if (f7 == aVar) {
                    return aVar;
                }
                handlerReferences = handlerReferences2;
                obj = f7;
                bool = bool2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bool = (Boolean) this.L$3;
                str = (String) this.L$2;
                handlerReferences = (CustomActionHandler.HandlerReferences) this.L$1;
                baseSellerSubscribeActionHandler = (BaseSellerSubscribeActionHandler) this.L$0;
                s.b(obj);
            }
            ActionV2Response actionV2Response = (ActionV2Response) obj;
            if (actionV2Response.getError() == null || (error = actionV2Response.getError()) == null || h.t(error, "Required value 'notification' missing at", false)) {
                baseSellerSubscribeActionHandler.updateEvent(handlerReferences.getRefs().getController(), str);
                SisLikeResponse sisLikeResponse = (SisLikeResponse) actionV2Response.getData();
                if (sisLikeResponse != null && (notification = sisLikeResponse.getNotification()) != null) {
                    if (!Intrinsics.d(bool, Boolean.TRUE)) {
                        baseSellerSubscribeActionHandler.showNotification(notification, handlerReferences);
                    }
                    obj2 = Unit.f71690a;
                }
            } else {
                errorNotificationDTO2 = baseSellerSubscribeActionHandler.getErrorNotificationDTO();
                baseSellerSubscribeActionHandler.showNotification(errorNotificationDTO2, handlerReferences);
                obj2 = Unit.f71690a;
            }
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            obj2 = s.a(th2);
        }
        BaseSellerSubscribeActionHandler baseSellerSubscribeActionHandler2 = this.this$0;
        CustomActionHandler.HandlerReferences handlerReferences3 = this.$handlerRefs;
        Throwable b11 = r.b(obj2);
        if (b11 != null) {
            errorNotificationDTO = baseSellerSubscribeActionHandler2.getErrorNotificationDTO();
            baseSellerSubscribeActionHandler2.showNotification(errorNotificationDTO, handlerReferences3);
            Lm0.a.f17149a.e(b11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((BaseSellerSubscribeActionHandler$processAction$3) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
