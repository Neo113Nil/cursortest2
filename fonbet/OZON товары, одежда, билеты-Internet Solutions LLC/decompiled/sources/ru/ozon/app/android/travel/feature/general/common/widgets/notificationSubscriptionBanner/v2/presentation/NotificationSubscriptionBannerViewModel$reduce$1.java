package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation.NotificationSubscriptionBannerViewModel", f = "NotificationSubscriptionBannerViewModel.kt", l = {98, 112, 118, 125, UserVerificationMethods.USER_VERIFY_PATTERN, 134}, m = "reduce")
/* loaded from: classes4.dex */
final class NotificationSubscriptionBannerViewModel$reduce$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationSubscriptionBannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionBannerViewModel$reduce$1(NotificationSubscriptionBannerViewModel notificationSubscriptionBannerViewModel, d<? super NotificationSubscriptionBannerViewModel$reduce$1> dVar) {
        super(dVar);
        this.this$0 = notificationSubscriptionBannerViewModel;
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
