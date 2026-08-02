package ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction;

import Sc.r;
import Sc.s;
import Tg.b;
import W10.c;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionDTO;
import ru.ozon.app.android.uikit.utils.NotificationBarHelperKt;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;
import z00.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler$processAction$1", f = "ComposerActionWithActionHandler.kt", l = {178}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ComposerActionWithActionHandler$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ ActionV2Request $request;
    int label;
    final /* synthetic */ ComposerActionWithActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposerActionWithActionHandler$processAction$1(ComposerActionWithActionHandler composerActionWithActionHandler, ActionV2Request actionV2Request, CustomActionHandler.HandlerReferences handlerReferences, d<? super ComposerActionWithActionHandler$processAction$1> dVar) {
        super(2, dVar);
        this.this$0 = composerActionWithActionHandler;
        this.$request = actionV2Request;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ComposerActionWithActionHandler$processAction$1(this.this$0, this.$request, this.$handlerRefs, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        Object mo480requestActionResultWithTrackingBWLJW6A;
        AppType appType;
        ComposerActionWithActionDTO.MessageDTO message;
        AtomActionDTO action;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
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
        ComposerActionWithActionHandler composerActionWithActionHandler = this.this$0;
        CustomActionHandler.HandlerReferences handlerReferences = this.$handlerRefs;
        r.Companion companion = r.INSTANCE;
        if (!(mo480requestActionResultWithTrackingBWLJW6A instanceof r.b)) {
            ActionV2Response actionV2Response = (ActionV2Response) mo480requestActionResultWithTrackingBWLJW6A;
            ComposerActionWithActionDTO composerActionWithActionDTO = (ComposerActionWithActionDTO) actionV2Response.getData();
            NotificationDTO notificationBar = composerActionWithActionDTO != null ? composerActionWithActionDTO.getNotificationBar() : null;
            ComposerActionWithActionDTO composerActionWithActionDTO2 = (ComposerActionWithActionDTO) actionV2Response.getData();
            b mapToAtomAction = (composerActionWithActionDTO2 == null || (action = composerActionWithActionDTO2.getAction()) == null) ? null : composerActionWithActionHandler.mapToAtomAction(action);
            if (notificationBar != null) {
                composerActionWithActionHandler.showNotification(notificationBar, handlerReferences, mapToAtomAction);
            } else {
                ComposerActionWithActionDTO composerActionWithActionDTO3 = (ComposerActionWithActionDTO) actionV2Response.getData();
                if (composerActionWithActionDTO3 != null && (message = composerActionWithActionDTO3.getMessage()) != null) {
                    composerActionWithActionHandler.showMessage(handlerReferences, message);
                }
            }
            composerActionWithActionHandler.handleAction(handlerReferences, mapToAtomAction);
        }
        ComposerActionWithActionHandler composerActionWithActionHandler2 = this.this$0;
        CustomActionHandler.HandlerReferences handlerReferences2 = this.$handlerRefs;
        Throwable b11 = r.b(mo480requestActionResultWithTrackingBWLJW6A);
        if (b11 != null) {
            Lm0.a.f17149a.e(b11);
            if (g.c(b11)) {
                appType = composerActionWithActionHandler2.appType;
                composerActionWithActionHandler2.showNotification(NotificationBarHelperKt.createNetworkErrorNotificationDTO(appType == AppType.SELECT), handlerReferences2, null);
            } else {
                composerActionWithActionHandler2.showError(handlerReferences2);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ComposerActionWithActionHandler$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
