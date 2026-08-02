package ru.ozon.app.android.cml.delivery.actionHandler.orderAction;

import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.cml.delivery.data.PreorderParamsStore;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cml.delivery.actionHandler.orderAction.CmlOrderActionHandler$processAction$1", f = "CmlOrderActionHandler.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CmlOrderActionHandler$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    int label;
    final /* synthetic */ CmlOrderActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CmlOrderActionHandler$processAction$1(CmlOrderActionHandler cmlOrderActionHandler, AtomAction atomAction, CustomActionHandler.HandlerReferences handlerReferences, d<? super CmlOrderActionHandler$processAction$1> dVar) {
        super(2, dVar);
        this.this$0 = cmlOrderActionHandler;
        this.$action = atomAction;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CmlOrderActionHandler$processAction$1(this.this$0, this.$action, this.$handlerRefs, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function1 createActionHandler;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            CmlOrderActionHandler cmlOrderActionHandler = this.this$0;
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) this.$action;
            CustomActionHandler.HandlerReferences handlerReferences = this.$handlerRefs;
            this.label = 1;
            obj = cmlOrderActionHandler.callActionWithLoading(composerAction, handlerReferences, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        CmlOrderActionResponseDTO cmlOrderActionResponseDTO = (CmlOrderActionResponseDTO) obj;
        if (cmlOrderActionResponseDTO != null) {
            NotificationDTO notificationBar = cmlOrderActionResponseDTO.getNotificationBar();
            AtomActionDTO successAction = cmlOrderActionResponseDTO.getSuccessAction();
            AtomAction atomAction = successAction != null ? AtomActionMapperKt.toAtomAction(successAction, null) : null;
            Map<String, String> params = cmlOrderActionResponseDTO.getParams();
            if (params != null && !params.isEmpty()) {
                PreorderParamsStore preorderParamsStore = PreorderParamsStore.INSTANCE;
                preorderParamsStore.savePreorderParams(cmlOrderActionResponseDTO.getParams());
                preorderParamsStore.setShouldAsyncUpdate(true);
            }
            if (notificationBar != null) {
                this.this$0.showNotification(notificationBar, atomAction, this.$handlerRefs);
            }
            if (atomAction != null) {
                createActionHandler = this.this$0.createActionHandler(this.$handlerRefs);
                createActionHandler.invoke(atomAction);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CmlOrderActionHandler$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
