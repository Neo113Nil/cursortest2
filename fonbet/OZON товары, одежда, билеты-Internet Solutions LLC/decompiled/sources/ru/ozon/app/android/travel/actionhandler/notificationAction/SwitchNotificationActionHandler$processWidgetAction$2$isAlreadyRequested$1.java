package ru.ozon.app.android.travel.actionhandler.notificationAction;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.platform.notifications.EnableNotificationsSuggestingHandler;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)Z"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.actionhandler.notificationAction.SwitchNotificationActionHandler$processWidgetAction$2$isAlreadyRequested$1", f = "SwitchNotificationActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SwitchNotificationActionHandler$processWidgetAction$2$isAlreadyRequested$1 extends j implements Function2<M, d<? super Boolean>, Object> {
    int label;
    final /* synthetic */ SwitchNotificationActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwitchNotificationActionHandler$processWidgetAction$2$isAlreadyRequested$1(SwitchNotificationActionHandler switchNotificationActionHandler, d<? super SwitchNotificationActionHandler$processWidgetAction$2$isAlreadyRequested$1> dVar) {
        super(2, dVar);
        this.this$0 = switchNotificationActionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SwitchNotificationActionHandler$processWidgetAction$2$isAlreadyRequested$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        EnableNotificationsSuggestingHandler enableNotificationsSuggestingHandler;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        enableNotificationsSuggestingHandler = this.this$0.enableNotificationsSuggestingHandler;
        return Boolean.valueOf(enableNotificationsSuggestingHandler.isPermissionForPushNotificationsForApiMoreThan32Requested());
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Boolean> dVar) {
        return ((SwitchNotificationActionHandler$processWidgetAction$2$isAlreadyRequested$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
