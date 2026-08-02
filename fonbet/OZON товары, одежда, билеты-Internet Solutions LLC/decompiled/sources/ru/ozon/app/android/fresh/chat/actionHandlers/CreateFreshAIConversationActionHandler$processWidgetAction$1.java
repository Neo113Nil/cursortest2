package ru.ozon.app.android.fresh.chat.actionHandlers;

import Sc.r;
import Sc.s;
import Tg.b;
import Vg.f;
import W10.c;
import Wc.a;
import a00.C4911f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.fresh.chat.actionHandlers.CreateFreshAIConversationActionHandler;
import ru.ozon.app.android.fresh.chat.viewModels.FreshAISharedViewModel;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.chat.actionHandlers.CreateFreshAIConversationActionHandler$processWidgetAction$1", f = "CreateFreshAIConversationActionHandler.kt", l = {141}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CreateFreshAIConversationActionHandler$processWidgetAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ b $action;
    final /* synthetic */ C4911f $container;
    final /* synthetic */ f.a $widgetInfo;
    int label;
    final /* synthetic */ CreateFreshAIConversationActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateFreshAIConversationActionHandler$processWidgetAction$1(CreateFreshAIConversationActionHandler createFreshAIConversationActionHandler, b bVar, f.a aVar, C4911f c4911f, d<? super CreateFreshAIConversationActionHandler$processWidgetAction$1> dVar) {
        super(2, dVar);
        this.this$0 = createFreshAIConversationActionHandler;
        this.$action = bVar;
        this.$widgetInfo = aVar;
        this.$container = c4911f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CreateFreshAIConversationActionHandler$processWidgetAction$1(this.this$0, this.$action, this.$widgetInfo, this.$container, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        Object mo480requestActionResultWithTrackingBWLJW6A;
        FreshAISharedViewModel viewModel;
        boolean isNetworkRelatedError;
        CreateFreshAIConversationActionHandler.Companion companion;
        FreshAISharedViewModel viewModel2;
        NotificationDTO notificationBar;
        Function1 function1;
        FreshAISharedViewModel viewModel3;
        AtomActionDTO action;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            ActionV2Request actionV2Request = new ActionV2Request(((AtomAction.ComposerAction) this.$action).getParams(), ((AtomAction.ComposerAction) this.$action).getActionName(), false, 4, null);
            c n11 = this.$widgetInfo.c().n();
            this.label = 1;
            mo480requestActionResultWithTrackingBWLJW6A = actionV2Repository.mo480requestActionResultWithTrackingBWLJW6A(actionV2Request, n11, ComposerActionWithActionDTO.class, this);
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
        CreateFreshAIConversationActionHandler createFreshAIConversationActionHandler = this.this$0;
        f.a aVar2 = this.$widgetInfo;
        C4911f c4911f = this.$container;
        r.Companion companion2 = r.INSTANCE;
        if (!(mo480requestActionResultWithTrackingBWLJW6A instanceof r.b)) {
            ActionV2Response actionV2Response = (ActionV2Response) mo480requestActionResultWithTrackingBWLJW6A;
            ComposerActionWithActionDTO composerActionWithActionDTO = (ComposerActionWithActionDTO) actionV2Response.getData();
            AtomAction atomAction = (composerActionWithActionDTO == null || (action = composerActionWithActionDTO.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, null);
            if (atomAction != null) {
                function1 = createFreshAIConversationActionHandler.actionHandler;
                if (function1 != null) {
                    function1.invoke(atomAction);
                }
                viewModel3 = createFreshAIConversationActionHandler.getViewModel(aVar2);
                if (viewModel3 != null) {
                    viewModel3.setLoading(false, new Long(500L));
                }
            } else {
                viewModel2 = createFreshAIConversationActionHandler.getViewModel(aVar2);
                if (viewModel2 != null) {
                    FreshAISharedViewModel.setLoading$default(viewModel2, false, null, 2, null);
                }
                ComposerActionWithActionDTO composerActionWithActionDTO2 = (ComposerActionWithActionDTO) actionV2Response.getData();
                if (composerActionWithActionDTO2 != null && (notificationBar = composerActionWithActionDTO2.getNotificationBar()) != null) {
                    createFreshAIConversationActionHandler.showNotification(notificationBar, c4911f);
                }
            }
        }
        CreateFreshAIConversationActionHandler createFreshAIConversationActionHandler2 = this.this$0;
        f.a aVar3 = this.$widgetInfo;
        C4911f c4911f2 = this.$container;
        Throwable b11 = r.b(mo480requestActionResultWithTrackingBWLJW6A);
        if (b11 != null) {
            Lm0.a.f17149a.e(b11);
            viewModel = createFreshAIConversationActionHandler2.getViewModel(aVar3);
            if (viewModel != null) {
                FreshAISharedViewModel.setLoading$default(viewModel, false, null, 2, null);
            }
            isNetworkRelatedError = createFreshAIConversationActionHandler2.isNetworkRelatedError(b11);
            if (isNetworkRelatedError) {
                companion = CreateFreshAIConversationActionHandler.Companion;
                createFreshAIConversationActionHandler2.showNotification(companion.getCommonNetworkError(), c4911f2);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CreateFreshAIConversationActionHandler$processWidgetAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
