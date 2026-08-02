package ru.ozon.app.android.returns.ui.domain.actionhandlers;

import Sc.s;
import Wc.a;
import a00.C4911f;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.returns.ui.domain.actionhandlers.BaseCreationOrderComposerActionWithActionHandler$handle$1", f = "BaseCreationOrderComposerActionWithActionHandler.kt", l = {51}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class BaseCreationOrderComposerActionWithActionHandler$handle$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    final /* synthetic */ C4911f $container;
    int label;
    final /* synthetic */ BaseCreationOrderComposerActionWithActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseCreationOrderComposerActionWithActionHandler$handle$1(BaseCreationOrderComposerActionWithActionHandler baseCreationOrderComposerActionWithActionHandler, AtomAction.ComposerAction composerAction, C4911f c4911f, d<? super BaseCreationOrderComposerActionWithActionHandler$handle$1> dVar) {
        super(2, dVar);
        this.this$0 = baseCreationOrderComposerActionWithActionHandler;
        this.$action = composerAction;
        this.$container = c4911f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BaseCreationOrderComposerActionWithActionHandler$handle$1(this.this$0, this.$action, this.$container, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        ComposerReferences composerReferences3;
        AtomActionDTO action;
        ComposerActionWithActionDTO.MessageDTO message;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            try {
                if (i11 == 0) {
                    s.b(obj);
                    composerReferences3 = this.this$0.refs;
                    composerReferences3.getController().e(new l.a.C1079a(0L, null, 3));
                    ActionV2Request actionV2Request = new ActionV2Request(this.$action.getParams(), this.$action.getActionName(), false, 4, null);
                    BaseCreationOrderComposerActionWithActionHandler baseCreationOrderComposerActionWithActionHandler = this.this$0;
                    this.label = 1;
                    obj = baseCreationOrderComposerActionWithActionHandler.callActionWithTracking(actionV2Request, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                ActionV2Response actionV2Response = (ActionV2Response) obj;
                ComposerActionWithActionDTO composerActionWithActionDTO = (ComposerActionWithActionDTO) actionV2Response.getData();
                if (composerActionWithActionDTO != null && (message = composerActionWithActionDTO.getMessage()) != null) {
                    this.this$0.showMessage(this.$container, message);
                }
                ComposerActionWithActionDTO composerActionWithActionDTO2 = (ComposerActionWithActionDTO) actionV2Response.getData();
                if (((composerActionWithActionDTO2 == null || (action = composerActionWithActionDTO2.getAction()) == null) ? null : action.getBehavior()) == AtomActionDTO.Behavior.BEHAVIOR_TYPE_REFRESH) {
                    this.this$0.handleRefresh(this.$action);
                } else {
                    BaseCreationOrderComposerActionWithActionHandler baseCreationOrderComposerActionWithActionHandler2 = this.this$0;
                    ComposerActionWithActionDTO composerActionWithActionDTO3 = (ComposerActionWithActionDTO) actionV2Response.getData();
                    baseCreationOrderComposerActionWithActionHandler2.handleOtherAction(composerActionWithActionDTO3 != null ? composerActionWithActionDTO3.getAction() : null);
                }
            } catch (Exception e11) {
                Lm0.a.f17149a.e(e11);
                this.this$0.showError(this.$container);
            }
            composerReferences2 = this.this$0.refs;
            composerReferences2.getController().hideLoader();
            return Unit.f71690a;
        } catch (Throwable th2) {
            composerReferences = this.this$0.refs;
            composerReferences.getController().hideLoader();
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((BaseCreationOrderComposerActionWithActionHandler$handle$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
