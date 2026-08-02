package ru.ozon.app.android.actionHandlers.monetization.submitBloggerPostMobile;

import Sc.s;
import Wc.a;
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
@e(c = "ru.ozon.app.android.actionHandlers.monetization.submitBloggerPostMobile.SubmitBloggerPostActionHandler$processAction$1$2$2", f = "SubmitBloggerPostActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class SubmitBloggerPostActionHandler$processAction$1$2$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    int label;
    final /* synthetic */ SubmitBloggerPostActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubmitBloggerPostActionHandler$processAction$1$2$2(SubmitBloggerPostActionHandler submitBloggerPostActionHandler, CustomActionHandler.HandlerReferences handlerReferences, d<? super SubmitBloggerPostActionHandler$processAction$1$2$2> dVar) {
        super(2, dVar);
        this.this$0 = submitBloggerPostActionHandler;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SubmitBloggerPostActionHandler$processAction$1$2$2(this.this$0, this.$handlerRefs, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        NotificationDTO errorNotificationDTO;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        SubmitBloggerPostActionHandler submitBloggerPostActionHandler = this.this$0;
        errorNotificationDTO = submitBloggerPostActionHandler.getErrorNotificationDTO();
        SubmitBloggerPostActionHandler.showNotification$default(submitBloggerPostActionHandler, errorNotificationDTO, this.$handlerRefs.getRefs(), null, 4, null);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SubmitBloggerPostActionHandler$processAction$1$2$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
