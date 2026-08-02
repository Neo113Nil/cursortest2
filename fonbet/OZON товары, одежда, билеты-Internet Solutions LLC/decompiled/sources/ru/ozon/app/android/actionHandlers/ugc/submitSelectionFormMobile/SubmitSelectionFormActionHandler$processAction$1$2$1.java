package ru.ozon.app.android.actionHandlers.ugc.submitSelectionFormMobile;

import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.actionHandlers.ugc.submitSelectionFormMobile.SubmitSelectionFormActionHandler$processAction$1$2$1", f = "SubmitSelectionFormActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class SubmitSelectionFormActionHandler$processAction$1$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ SubmitSelectionResponse $response;
    int label;
    final /* synthetic */ SubmitSelectionFormActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubmitSelectionFormActionHandler$processAction$1$2$1(SubmitSelectionResponse submitSelectionResponse, SubmitSelectionFormActionHandler submitSelectionFormActionHandler, CustomActionHandler.HandlerReferences handlerReferences, d<? super SubmitSelectionFormActionHandler$processAction$1$2$1> dVar) {
        super(2, dVar);
        this.$response = submitSelectionResponse;
        this.this$0 = submitSelectionFormActionHandler;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SubmitSelectionFormActionHandler$processAction$1$2$1(this.$response, this.this$0, this.$handlerRefs, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AtomAction atomAction;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        NotificationDTO notification = this.$response.getNotification();
        if (notification != null) {
            this.this$0.showNotification(notification, this.$handlerRefs.getRefs());
        }
        AtomActionDTO action = this.$response.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, null)) == null) {
            return null;
        }
        this.this$0.handleAction(atomAction, this.$handlerRefs);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SubmitSelectionFormActionHandler$processAction$1$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
