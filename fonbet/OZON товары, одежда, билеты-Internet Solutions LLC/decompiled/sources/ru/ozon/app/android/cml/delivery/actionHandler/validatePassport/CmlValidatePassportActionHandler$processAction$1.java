package ru.ozon.app.android.cml.delivery.actionHandler.validatePassport;

import Sc.s;
import W10.c;
import Wc.a;
import i10.l;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.cml.delivery.actionHandler.ext.ActionHandlerExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cml.delivery.actionHandler.validatePassport.CmlValidatePassportActionHandler$processAction$1", f = "CmlValidatePassportActionHandler.kt", l = {77}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CmlValidatePassportActionHandler$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    Object L$0;
    int label;
    final /* synthetic */ CmlValidatePassportActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CmlValidatePassportActionHandler$processAction$1(CmlValidatePassportActionHandler cmlValidatePassportActionHandler, CustomActionHandler.HandlerReferences handlerReferences, AtomAction atomAction, d<? super CmlValidatePassportActionHandler$processAction$1> dVar) {
        super(2, dVar);
        this.this$0 = cmlValidatePassportActionHandler;
        this.$handlerRefs = handlerReferences;
        this.$action = atomAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CmlValidatePassportActionHandler$processAction$1(this.this$0, this.$handlerRefs, this.$action, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [ru.ozon.app.android.action.custom.CustomActionHandler$HandlerReferences] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Function1 createActionHandler;
        Function1 createActionHandler2;
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        CustomActionHandler.HandlerReferences handlerReferences = this.label;
        try {
            try {
                try {
                    if (handlerReferences == 0) {
                        s.b(obj);
                        actionV2Repository = this.this$0.actionV2Repository;
                        CustomActionHandler.HandlerReferences handlerReferences2 = this.$handlerRefs;
                        String actionName = ((AtomAction.ComposerAction) this.$action).getActionName();
                        Map<String, String> params = ((AtomAction.ComposerAction) this.$action).getParams();
                        handlerReferences2.getRefs().getController().e(new l.a.C1079a(0L, null, 3));
                        ActionV2Request actionV2Request = new ActionV2Request(params, actionName, false, 4, null);
                        c trackingData = handlerReferences2.getTrackingData();
                        if (trackingData == null) {
                            trackingData = new c(null, null, null);
                        }
                        this.L$0 = handlerReferences2;
                        this.label = 1;
                        obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, trackingData, CmlValidatePassportDTO.class, this);
                        handlerReferences = handlerReferences2;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (handlerReferences != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        CustomActionHandler.HandlerReferences handlerReferences3 = (CustomActionHandler.HandlerReferences) this.L$0;
                        s.b(obj);
                        handlerReferences = handlerReferences3;
                    }
                    obj2 = ((ActionV2Response) obj).getData();
                    handlerReferences.getRefs().getController().hideLoader();
                } catch (Exception e11) {
                    Lm0.a.f17149a.e(e11);
                    ActionHandlerExtKt.showDefaultError(handlerReferences);
                    handlerReferences.getRefs().getController().hideLoader();
                    obj2 = null;
                }
                CmlValidatePassportDTO cmlValidatePassportDTO = (CmlValidatePassportDTO) obj2;
                if (cmlValidatePassportDTO != null) {
                    NotificationDTO notificationBar = cmlValidatePassportDTO.getNotificationBar();
                    AtomActionDTO action = cmlValidatePassportDTO.getAction();
                    AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, null) : null;
                    createActionHandler = this.this$0.createActionHandler(this.$handlerRefs);
                    if (notificationBar != null) {
                        ActionHandlerExtKt.showNotification(notificationBar, this.$handlerRefs, createActionHandler, atomAction);
                    }
                    if (atomAction != null) {
                        createActionHandler2 = this.this$0.createActionHandler(this.$handlerRefs);
                        createActionHandler2.invoke(atomAction);
                    }
                }
                return Unit.f71690a;
            } catch (CancellationException e12) {
                throw e12;
            }
        } catch (Throwable th2) {
            handlerReferences.getRefs().getController().hideLoader();
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CmlValidatePassportActionHandler$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
