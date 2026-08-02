package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation;

import Lm0.a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2RepositoryError;
import ru.ozon.app.android.travel.logger.TravelActionLogger;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;
import xe.J;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$special$$inlined$CoroutineExceptionHandler$2", "Lkotlin/coroutines/a;", "Lxe/J;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSubscriptionBannerViewModel$special$$inlined$CoroutineExceptionHandler$2 extends a implements J {
    public NotificationSubscriptionBannerViewModel$special$$inlined$CoroutineExceptionHandler$2(J.a aVar) {
        super(aVar);
    }

    @Override // xe.J
    public void handleException(CoroutineContext context, Throwable exception) {
        Throwable th2;
        if (exception instanceof ActionV2RepositoryError) {
            TravelActionLogger.INSTANCE.logException(exception, "travel_notificationSubscriptionBanner");
            th2 = exception;
        } else {
            th2 = exception;
            LoggerExtKt.sendNonFatal$default(th2, null, "travel_notificationSubscriptionBanner", null, 10, null);
        }
        BuildUtils buildUtils = BuildUtils.INSTANCE;
        if (buildUtils.isQaFlavor() || buildUtils.isDebug()) {
            a.b bVar = Lm0.a.f17149a;
            bVar.b("travel_notificationSubscriptionBanner");
            bVar.e(th2);
        }
    }
}
