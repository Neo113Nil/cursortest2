package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3ViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "viewEffect", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3Delegate$observeViewEffects$2", f = "NotificationSubscriptionBannerV3Delegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationSubscriptionBannerV3Delegate$observeViewEffects$2 extends j implements Function2<NotificationSubscriptionBannerV3ViewModel.ViewEffect, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationSubscriptionBannerV3Delegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionBannerV3Delegate$observeViewEffects$2(NotificationSubscriptionBannerV3Delegate notificationSubscriptionBannerV3Delegate, d<? super NotificationSubscriptionBannerV3Delegate$observeViewEffects$2> dVar) {
        super(2, dVar);
        this.this$0 = notificationSubscriptionBannerV3Delegate;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        NotificationSubscriptionBannerV3Delegate$observeViewEffects$2 notificationSubscriptionBannerV3Delegate$observeViewEffects$2 = new NotificationSubscriptionBannerV3Delegate$observeViewEffects$2(this.this$0, dVar);
        notificationSubscriptionBannerV3Delegate$observeViewEffects$2.L$0 = obj;
        return notificationSubscriptionBannerV3Delegate$observeViewEffects$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.trigger((NotificationSubscriptionBannerV3ViewModel.ViewEffect) this.L$0);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(NotificationSubscriptionBannerV3ViewModel.ViewEffect viewEffect, d<? super Unit> dVar) {
        return ((NotificationSubscriptionBannerV3Delegate$observeViewEffects$2) create(viewEffect, dVar)).invokeSuspend(Unit.f71690a);
    }
}
