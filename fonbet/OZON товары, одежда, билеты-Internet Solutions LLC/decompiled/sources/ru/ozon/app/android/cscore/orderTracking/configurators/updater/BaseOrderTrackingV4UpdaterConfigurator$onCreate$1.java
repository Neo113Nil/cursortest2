package ru.ozon.app.android.cscore.orderTracking.configurators.updater;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.payment.domain.createorder.busevents.RefreshLKScreen;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/payment/domain/createorder/busevents/RefreshLKScreen;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cscore.orderTracking.configurators.updater.BaseOrderTrackingV4UpdaterConfigurator$onCreate$1", f = "BaseOrderTrackingV4UpdaterConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class BaseOrderTrackingV4UpdaterConfigurator$onCreate$1 extends j implements Function2<RefreshLKScreen, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ BaseOrderTrackingV4UpdaterConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseOrderTrackingV4UpdaterConfigurator$onCreate$1(BaseOrderTrackingV4UpdaterConfigurator baseOrderTrackingV4UpdaterConfigurator, d<? super BaseOrderTrackingV4UpdaterConfigurator$onCreate$1> dVar) {
        super(2, dVar);
        this.this$0 = baseOrderTrackingV4UpdaterConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BaseOrderTrackingV4UpdaterConfigurator$onCreate$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.setNeedRefreshAfterOrderCreate(true);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RefreshLKScreen refreshLKScreen, d<? super Unit> dVar) {
        return ((BaseOrderTrackingV4UpdaterConfigurator$onCreate$1) create(refreshLKScreen, dVar)).invokeSuspend(Unit.f71690a);
    }
}
