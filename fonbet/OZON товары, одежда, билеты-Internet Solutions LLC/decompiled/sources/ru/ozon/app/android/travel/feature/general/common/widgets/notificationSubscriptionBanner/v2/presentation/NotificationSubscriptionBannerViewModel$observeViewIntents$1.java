package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation.NotificationSubscriptionBannerViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "intent", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation.NotificationSubscriptionBannerViewModel$observeViewIntents$1", f = "NotificationSubscriptionBannerViewModel.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationSubscriptionBannerViewModel$observeViewIntents$1 extends j implements Function2<NotificationSubscriptionBannerViewModel.ViewIntent, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationSubscriptionBannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionBannerViewModel$observeViewIntents$1(NotificationSubscriptionBannerViewModel notificationSubscriptionBannerViewModel, d<? super NotificationSubscriptionBannerViewModel$observeViewIntents$1> dVar) {
        super(2, dVar);
        this.this$0 = notificationSubscriptionBannerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        NotificationSubscriptionBannerViewModel$observeViewIntents$1 notificationSubscriptionBannerViewModel$observeViewIntents$1 = new NotificationSubscriptionBannerViewModel$observeViewIntents$1(this.this$0, dVar);
        notificationSubscriptionBannerViewModel$observeViewIntents$1.L$0 = obj;
        return notificationSubscriptionBannerViewModel$observeViewIntents$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object reduce;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            NotificationSubscriptionBannerViewModel.ViewIntent viewIntent = (NotificationSubscriptionBannerViewModel.ViewIntent) this.L$0;
            NotificationSubscriptionBannerViewModel notificationSubscriptionBannerViewModel = this.this$0;
            this.label = 1;
            reduce = notificationSubscriptionBannerViewModel.reduce(viewIntent, this);
            if (reduce == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(NotificationSubscriptionBannerViewModel.ViewIntent viewIntent, d<? super Unit> dVar) {
        return ((NotificationSubscriptionBannerViewModel$observeViewIntents$1) create(viewIntent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
