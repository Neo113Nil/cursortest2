package ru.ozon.app.android.storefront.widgets.rateApp;

import a00.C4911f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "response", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CompositeCustomActionHandler$processAction$1 extends AbstractC7737t implements Function1<ActionV2Response<ComposerActionWithActionDTO>, Unit> {
    final /* synthetic */ C4911f $container;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ CompositeCustomActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompositeCustomActionHandler$processAction$1(CompositeCustomActionHandler compositeCustomActionHandler, C4911f c4911f, CustomActionHandler.HandlerReferences handlerReferences) {
        super(1);
        this.this$0 = compositeCustomActionHandler;
        this.$container = c4911f;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ActionV2Response<ComposerActionWithActionDTO> actionV2Response) {
        invoke2(actionV2Response);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActionV2Response<ComposerActionWithActionDTO> actionV2Response) {
        AtomActionDTO action;
        ComposerActionWithActionDTO.MessageDTO message;
        ComposerActionWithActionDTO data = actionV2Response.getData();
        if (data != null && (message = data.getMessage()) != null) {
            this.this$0.showMessage(this.$container, message);
        }
        ComposerActionWithActionDTO data2 = actionV2Response.getData();
        if (data2 == null || (action = data2.getAction()) == null) {
            return;
        }
        CustomActionHandler.HandlerReferences handlerReferences = this.$handlerRefs;
        new ActionHandler.Builder(handlerReferences.getRefs(), handlerReferences.getNestedPagesProvider(), new CompositeCustomActionHandler$processAction$1$2$1(handlerReferences), new CompositeCustomActionHandler$processAction$1$2$2(handlerReferences)).customActionHandlers(new CompositeCustomActionHandler$processAction$1$2$3(this.this$0)).buildHandler().invoke(AtomActionMapperKt.toAtomAction(action, null));
    }
}
