package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3ViewModel", f = "NotificationSubscriptionBannerV3ViewModel.kt", l = {103, 110, 117, 120, 126}, m = "reduce")
/* loaded from: classes4.dex */
final class NotificationSubscriptionBannerV3ViewModel$reduce$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationSubscriptionBannerV3ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionBannerV3ViewModel$reduce$1(NotificationSubscriptionBannerV3ViewModel notificationSubscriptionBannerV3ViewModel, d<? super NotificationSubscriptionBannerV3ViewModel$reduce$1> dVar) {
        super(dVar);
        this.this$0 = notificationSubscriptionBannerV3ViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object reduce;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        reduce = this.this$0.reduce(null, this);
        return reduce;
    }
}
