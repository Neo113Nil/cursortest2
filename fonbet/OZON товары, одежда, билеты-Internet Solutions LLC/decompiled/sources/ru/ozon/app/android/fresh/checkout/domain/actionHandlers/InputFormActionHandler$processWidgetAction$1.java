package ru.ozon.app.android.fresh.checkout.domain.actionHandlers;

import Sc.r;
import Sc.s;
import Tg.b;
import W10.c;
import Wc.a;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.fresh.checkout.widgets.inputForm.presentation.InputFormTextUpdate;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.checkout.domain.actionHandlers.InputFormActionHandler$processWidgetAction$1", f = "InputFormActionHandler.kt", l = {134}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class InputFormActionHandler$processWidgetAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ b $action;
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ ActionV2Request $request;
    int label;
    final /* synthetic */ InputFormActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InputFormActionHandler$processWidgetAction$1(InputFormActionHandler inputFormActionHandler, ActionV2Request actionV2Request, CustomActionHandler.HandlerReferences handlerReferences, InterfaceC7851b interfaceC7851b, b bVar, d<? super InputFormActionHandler$processWidgetAction$1> dVar) {
        super(2, dVar);
        this.this$0 = inputFormActionHandler;
        this.$request = actionV2Request;
        this.$handlerRefs = handlerReferences;
        this.$controller = interfaceC7851b;
        this.$action = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new InputFormActionHandler$processWidgetAction$1(this.this$0, this.$request, this.$handlerRefs, this.$controller, this.$action, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        Object mo480requestActionResultWithTrackingBWLJW6A;
        NotificationDTO commonNetworkErrorNotification;
        ComposerActionWithActionDTO.MessageDTO message;
        String str;
        Set<Map.Entry<String, String>> entrySet;
        Map.Entry entry;
        Function1 createActionHandler;
        AtomActionDTO action;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        AtomAction atomAction = null;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            ActionV2Request actionV2Request = this.$request;
            c trackingData = this.$handlerRefs.getTrackingData();
            if (trackingData == null) {
                trackingData = new c(null, null, null);
            }
            this.label = 1;
            mo480requestActionResultWithTrackingBWLJW6A = actionV2Repository.mo480requestActionResultWithTrackingBWLJW6A(actionV2Request, trackingData, ComposerActionWithActionDTO.class, this);
            if (mo480requestActionResultWithTrackingBWLJW6A == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            mo480requestActionResultWithTrackingBWLJW6A = ((r) obj).getF26106a();
        }
        InputFormActionHandler inputFormActionHandler = this.this$0;
        CustomActionHandler.HandlerReferences handlerReferences = this.$handlerRefs;
        InterfaceC7851b interfaceC7851b = this.$controller;
        b bVar = this.$action;
        r.Companion companion = r.INSTANCE;
        if (!(mo480requestActionResultWithTrackingBWLJW6A instanceof r.b)) {
            ActionV2Response actionV2Response = (ActionV2Response) mo480requestActionResultWithTrackingBWLJW6A;
            ComposerActionWithActionDTO composerActionWithActionDTO = (ComposerActionWithActionDTO) actionV2Response.getData();
            NotificationDTO notificationBar = composerActionWithActionDTO != null ? composerActionWithActionDTO.getNotificationBar() : null;
            ComposerActionWithActionDTO composerActionWithActionDTO2 = (ComposerActionWithActionDTO) actionV2Response.getData();
            if (composerActionWithActionDTO2 != null && (action = composerActionWithActionDTO2.getAction()) != null) {
                atomAction = AtomActionMapperKt.toAtomAction(action, null);
            }
            if (notificationBar != null) {
                inputFormActionHandler.showNotification(notificationBar, handlerReferences, atomAction);
            } else {
                ComposerActionWithActionDTO composerActionWithActionDTO3 = (ComposerActionWithActionDTO) actionV2Response.getData();
                if (composerActionWithActionDTO3 != null && (message = composerActionWithActionDTO3.getMessage()) != null) {
                    Map<String, String> params = ((AtomAction.ComposerAction) bVar).getParams();
                    if (params == null || (entrySet = params.entrySet()) == null || (entry = (Map.Entry) C7714v.L(entrySet)) == null || (str = (String) entry.getValue()) == null) {
                        str = "";
                    }
                    interfaceC7851b.update(new InputFormTextUpdate(message, str));
                }
            }
            if (atomAction != null) {
                createActionHandler = inputFormActionHandler.createActionHandler(handlerReferences);
                createActionHandler.invoke(atomAction);
            }
        }
        InputFormActionHandler inputFormActionHandler2 = this.this$0;
        CustomActionHandler.HandlerReferences handlerReferences2 = this.$handlerRefs;
        Throwable b11 = r.b(mo480requestActionResultWithTrackingBWLJW6A);
        if (b11 != null) {
            Lm0.a.f17149a.e(b11);
            commonNetworkErrorNotification = inputFormActionHandler2.commonNetworkErrorNotification();
            InputFormActionHandler.showNotification$default(inputFormActionHandler2, commonNetworkErrorNotification, handlerReferences2, null, 4, null);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((InputFormActionHandler$processWidgetAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
