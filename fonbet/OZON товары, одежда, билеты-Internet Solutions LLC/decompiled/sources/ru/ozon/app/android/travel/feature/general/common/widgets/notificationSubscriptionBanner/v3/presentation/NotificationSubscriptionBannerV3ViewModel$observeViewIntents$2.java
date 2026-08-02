package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation;

import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3ViewModel;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent;", "", "e", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3ViewModel$observeViewIntents$2", f = "NotificationSubscriptionBannerV3ViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationSubscriptionBannerV3ViewModel$observeViewIntents$2 extends j implements InterfaceC6511n<InterfaceC2397i<? super NotificationSubscriptionBannerV3ViewModel.ViewIntent>, Throwable, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationSubscriptionBannerV3ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionBannerV3ViewModel$observeViewIntents$2(NotificationSubscriptionBannerV3ViewModel notificationSubscriptionBannerV3ViewModel, d<? super NotificationSubscriptionBannerV3ViewModel$observeViewIntents$2> dVar) {
        super(3, dVar);
        this.this$0 = notificationSubscriptionBannerV3ViewModel;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super NotificationSubscriptionBannerV3ViewModel.ViewIntent> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
        NotificationSubscriptionBannerV3ViewModel$observeViewIntents$2 notificationSubscriptionBannerV3ViewModel$observeViewIntents$2 = new NotificationSubscriptionBannerV3ViewModel$observeViewIntents$2(this.this$0, dVar);
        notificationSubscriptionBannerV3ViewModel$observeViewIntents$2.L$0 = th2;
        return notificationSubscriptionBannerV3ViewModel$observeViewIntents$2.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.onError((Throwable) this.L$0);
        return Unit.f71690a;
    }
}
