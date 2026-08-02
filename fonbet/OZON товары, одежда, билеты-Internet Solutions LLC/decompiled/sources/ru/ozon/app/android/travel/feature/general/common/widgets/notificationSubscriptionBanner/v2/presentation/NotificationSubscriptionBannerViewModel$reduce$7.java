package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation.NotificationSubscriptionBannerViewModel$reduce$7", f = "NotificationSubscriptionBannerViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationSubscriptionBannerViewModel$reduce$7 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ NotificationSubscriptionBannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionBannerViewModel$reduce$7(NotificationSubscriptionBannerViewModel notificationSubscriptionBannerViewModel, d<? super NotificationSubscriptionBannerViewModel$reduce$7> dVar) {
        super(2, dVar);
        this.this$0 = notificationSubscriptionBannerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new NotificationSubscriptionBannerViewModel$reduce$7(this.this$0, dVar);
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
        enableNotificationsSuggestingHandler.setPermissionForPushNotificationsForApiMoreThan32Requested(true);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((NotificationSubscriptionBannerViewModel$reduce$7) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
