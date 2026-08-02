package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation;

import Ae.w0;
import Ae.x0;
import Lm0.a;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2RepositoryError;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3ViewModel;
import ru.ozon.app.android.travel.logger.TravelActionLogger;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3ViewModel$handleCoroutineError$1", f = "NotificationSubscriptionBannerV3ViewModel.kt", l = {204}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationSubscriptionBannerV3ViewModel$handleCoroutineError$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Throwable $exception;
    final /* synthetic */ String $locator;
    int label;
    final /* synthetic */ NotificationSubscriptionBannerV3ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionBannerV3ViewModel$handleCoroutineError$1(Throwable th2, String str, NotificationSubscriptionBannerV3ViewModel notificationSubscriptionBannerV3ViewModel, d<? super NotificationSubscriptionBannerV3ViewModel$handleCoroutineError$1> dVar) {
        super(2, dVar);
        this.$exception = th2;
        this.$locator = str;
        this.this$0 = notificationSubscriptionBannerV3ViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new NotificationSubscriptionBannerV3ViewModel$handleCoroutineError$1(this.$exception, this.$locator, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        x0 x0Var;
        Object value;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            Throwable th2 = this.$exception;
            String b11 = Nk.a.b("travel_notificationSubscriptionBanner3_", this.$locator);
            if (th2 instanceof ActionV2RepositoryError) {
                TravelActionLogger.INSTANCE.logException(th2, b11);
            } else {
                LoggerExtKt.sendNonFatal$default(th2, null, b11, null, 10, null);
            }
            BuildUtils buildUtils = BuildUtils.INSTANCE;
            if (buildUtils.isQaFlavor() || buildUtils.isDebug()) {
                a.b bVar = Lm0.a.f17149a;
                bVar.b(b11);
                bVar.e(th2);
            }
            w0Var = this.this$0.viewEffects;
            NotificationSubscriptionBannerV3ViewModel.ViewEffect.ShowNetworkError showNetworkError = NotificationSubscriptionBannerV3ViewModel.ViewEffect.ShowNetworkError.INSTANCE;
            this.label = 1;
            if (w0Var.emit(showNetworkError, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        x0Var = this.this$0.buttonStateFlow;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, new NotificationSubscriptionBannerV3ViewModel.ButtonState(false, false, 1, null)));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((NotificationSubscriptionBannerV3ViewModel$handleCoroutineError$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
