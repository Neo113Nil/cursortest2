package ru.ozon.app.android.actionHandlers.ugc.submitSelectionFormMobile;

import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.actionHandlers.ugc.submitSelectionFormMobile.SubmitSelectionFormActionHandler$processAction$1$2$3", f = "SubmitSelectionFormActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class SubmitSelectionFormActionHandler$processAction$1$2$3 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    int label;
    final /* synthetic */ SubmitSelectionFormActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubmitSelectionFormActionHandler$processAction$1$2$3(SubmitSelectionFormActionHandler submitSelectionFormActionHandler, CustomActionHandler.HandlerReferences handlerReferences, d<? super SubmitSelectionFormActionHandler$processAction$1$2$3> dVar) {
        super(2, dVar);
        this.this$0 = submitSelectionFormActionHandler;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SubmitSelectionFormActionHandler$processAction$1$2$3(this.this$0, this.$handlerRefs, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        NotificationDTO errorNotificationDTO;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        SubmitSelectionFormActionHandler submitSelectionFormActionHandler = this.this$0;
        errorNotificationDTO = submitSelectionFormActionHandler.getErrorNotificationDTO();
        submitSelectionFormActionHandler.showNotification(errorNotificationDTO, this.$handlerRefs.getRefs());
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SubmitSelectionFormActionHandler$processAction$1$2$3) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
