package ru.ozon.app.android.cml.delivery.actionHandler;

import a00.C4911f;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.cml.delivery.actionHandler.CmlComposerActionWithActionDTO;
import ru.ozon.app.android.cml.domain.refresh.CmlEventsController;
import ru.ozon.app.android.cml.domain.refresh.CmlRefreshReason;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "response", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/cml/delivery/actionHandler/CmlComposerActionWithActionDTO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CmlComposerActionWithActionHandler$processAction$1 extends AbstractC7737t implements Function1<ActionV2Response<CmlComposerActionWithActionDTO>, Unit> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ C4911f $container;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ CmlComposerActionWithActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CmlComposerActionWithActionHandler$processAction$1(CmlComposerActionWithActionHandler cmlComposerActionWithActionHandler, C4911f c4911f, AtomAction atomAction, CustomActionHandler.HandlerReferences handlerReferences) {
        super(1);
        this.this$0 = cmlComposerActionWithActionHandler;
        this.$container = c4911f;
        this.$action = atomAction;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ActionV2Response<CmlComposerActionWithActionDTO> actionV2Response) {
        invoke2(actionV2Response);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActionV2Response<CmlComposerActionWithActionDTO> actionV2Response) {
        CmlComposerActionWithActionDTO.MessageDTO message;
        Function1 createActionHandler;
        View rootView;
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        Function1<? super AtomAction, Unit> createActionHandler2;
        AtomActionDTO action;
        CmlEventsController cmlEventsController;
        if (actionV2Response.getData() == null) {
            this.this$0.showError(this.$container);
            return;
        }
        if (Intrinsics.d(((AtomAction.ComposerAction) this.$action).getActionName(), "cmlEditParcelDescription")) {
            cmlEventsController = this.this$0.cmlEventsController;
            cmlEventsController.handleEvent(CmlRefreshReason.DRAFT_NAME_CHANGED);
        }
        CmlComposerActionWithActionDTO data = actionV2Response.getData();
        NotificationDTO notificationBar = data != null ? data.getNotificationBar() : null;
        CmlComposerActionWithActionDTO data2 = actionV2Response.getData();
        AtomAction atomAction = (data2 == null || (action = data2.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, null);
        if (notificationBar != null) {
            if ((atomAction instanceof AtomAction.DismissAndScroll) || (atomAction instanceof AtomAction.DismissRedirect) || (atomAction instanceof AtomAction.DismissRefresh) || (atomAction instanceof AtomAction.Dismiss)) {
                rootView = ContextExtKt.getRootView(this.$container.a());
            } else {
                ComponentCallbacksC5392m c11 = this.$container.c();
                rootView = c11 != null ? c11.getView() : null;
            }
            if (rootView == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
                return;
            }
            NotificationBar.Companion companion = NotificationBar.INSTANCE;
            r i11 = this.$handlerRefs.getRefs().getContainer().i();
            createActionHandler2 = this.this$0.createActionHandler(this.$handlerRefs);
            companion.make(asNotificationLayoutManager$default, notificationBar, i11, createActionHandler2).show();
        } else {
            CmlComposerActionWithActionDTO data3 = actionV2Response.getData();
            if (data3 != null && (message = data3.getMessage()) != null) {
                this.this$0.showMessage(this.$container, message);
            }
        }
        if (atomAction != null) {
            createActionHandler = this.this$0.createActionHandler(this.$handlerRefs);
            createActionHandler.invoke(atomAction);
        }
    }
}
