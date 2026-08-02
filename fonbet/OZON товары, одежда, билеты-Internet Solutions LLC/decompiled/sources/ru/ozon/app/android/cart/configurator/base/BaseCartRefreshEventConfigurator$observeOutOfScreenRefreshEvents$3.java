package ru.ozon.app.android.cart.configurator.base;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeInfo;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.configurator.base.BaseCartRefreshEventConfigurator$observeOutOfScreenRefreshEvents$3", f = "BaseCartRefreshEventConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BaseCartRefreshEventConfigurator$observeOutOfScreenRefreshEvents$3 extends j implements Function2<TeensModeInfo, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ BaseCartRefreshEventConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseCartRefreshEventConfigurator$observeOutOfScreenRefreshEvents$3(BaseCartRefreshEventConfigurator baseCartRefreshEventConfigurator, d<? super BaseCartRefreshEventConfigurator$observeOutOfScreenRefreshEvents$3> dVar) {
        super(2, dVar);
        this.this$0 = baseCartRefreshEventConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BaseCartRefreshEventConfigurator$observeOutOfScreenRefreshEvents$3(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.setNeedRefreshOnStart(true);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TeensModeInfo teensModeInfo, d<? super Unit> dVar) {
        return ((BaseCartRefreshEventConfigurator$observeOutOfScreenRefreshEvents$3) create(teensModeInfo, dVar)).invokeSuspend(Unit.f71690a);
    }
}
