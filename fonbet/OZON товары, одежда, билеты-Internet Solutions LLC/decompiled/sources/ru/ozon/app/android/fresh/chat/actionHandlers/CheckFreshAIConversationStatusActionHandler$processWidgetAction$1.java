package ru.ozon.app.android.fresh.chat.actionHandlers;

import Sc.r;
import Sc.s;
import Vg.f;
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
import ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation.PromptStatusViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.chat.actionHandlers.CheckFreshAIConversationStatusActionHandler$processWidgetAction$1", f = "CheckFreshAIConversationStatusActionHandler.kt", l = {61, 46}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CheckFreshAIConversationStatusActionHandler$processWidgetAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $currentAction;
    final /* synthetic */ f.a $widgetInfo;
    Object L$0;
    int label;
    final /* synthetic */ CheckFreshAIConversationStatusActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckFreshAIConversationStatusActionHandler$processWidgetAction$1(CheckFreshAIConversationStatusActionHandler checkFreshAIConversationStatusActionHandler, AtomAction.ComposerAction composerAction, f.a aVar, d<? super CheckFreshAIConversationStatusActionHandler$processWidgetAction$1> dVar) {
        super(2, dVar);
        this.this$0 = checkFreshAIConversationStatusActionHandler;
        this.$currentAction = composerAction;
        this.$widgetInfo = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CheckFreshAIConversationStatusActionHandler$processWidgetAction$1(this.this$0, this.$currentAction, this.$widgetInfo, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x004c, code lost:
    
        if (r11 == r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a0  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        Object mo479requestActionResult0E7RQCE;
        PromptStatusViewModel viewModel;
        AtomAction atomAction;
        AtomAction atomAction2;
        Long delay;
        AtomActionDTO action;
        PromptStatusViewModel viewModel2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            ActionV2Request actionV2Request = new ActionV2Request(this.$currentAction.getParams(), this.$currentAction.getActionName(), false, 4, null);
            this.label = 1;
            mo479requestActionResult0E7RQCE = actionV2Repository.mo479requestActionResult0E7RQCE(actionV2Request, FreshAIConversationStatusResponse.class, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atomAction2 = (AtomAction) this.L$0;
                s.b(obj);
                atomAction = atomAction2;
                viewModel2 = this.this$0.getViewModel(this.$widgetInfo);
                if (viewModel2 != null) {
                    viewModel2.processAction(atomAction);
                }
                return Unit.f71690a;
            }
            s.b(obj);
            mo479requestActionResult0E7RQCE = ((r) obj).getF26106a();
        }
        r.Companion companion = r.INSTANCE;
        boolean z11 = mo479requestActionResult0E7RQCE instanceof r.b;
        if (!z11) {
            atomAction = null;
            ActionV2Response actionV2Response = (ActionV2Response) (z11 ? null : mo479requestActionResult0E7RQCE);
            FreshAIConversationStatusResponse freshAIConversationStatusResponse = actionV2Response != null ? (FreshAIConversationStatusResponse) actionV2Response.getData() : null;
            if (freshAIConversationStatusResponse != null && (action = freshAIConversationStatusResponse.getAction()) != null) {
                atomAction = AtomActionMapperKt.toAtomAction(action, null);
            }
            long longValue = (freshAIConversationStatusResponse == null || (delay = freshAIConversationStatusResponse.getDelay()) == null) ? 0L : delay.longValue();
            if (atomAction != null) {
                if (longValue > 0) {
                    this.L$0 = atomAction;
                    this.label = 2;
                    if (Y.b(longValue, this) != aVar) {
                        atomAction2 = atomAction;
                        atomAction = atomAction2;
                    }
                    return aVar;
                }
                viewModel2 = this.this$0.getViewModel(this.$widgetInfo);
                if (viewModel2 != null) {
                }
                return Unit.f71690a;
            }
        }
        Throwable b11 = r.b(mo479requestActionResult0E7RQCE);
        if (b11 != null) {
            Lm0.a.f17149a.e(b11);
        }
        viewModel = this.this$0.getViewModel(this.$widgetInfo);
        if (viewModel != null) {
            viewModel.setErrorState();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CheckFreshAIConversationStatusActionHandler$processWidgetAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
