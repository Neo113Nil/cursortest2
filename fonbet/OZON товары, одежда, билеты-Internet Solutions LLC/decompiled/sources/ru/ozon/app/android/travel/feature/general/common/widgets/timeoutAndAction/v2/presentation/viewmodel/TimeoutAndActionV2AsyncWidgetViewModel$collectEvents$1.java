package ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel;

import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.TimeoutAndActionV2VO;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel.TimeoutAndActionV2AsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/viewmodel/TimeoutAndActionV2AsyncWidgetViewModel$Event;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel.TimeoutAndActionV2AsyncWidgetViewModel$collectEvents$1", f = "TimeoutAndActionV2AsyncWidgetViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TimeoutAndActionV2AsyncWidgetViewModel$collectEvents$1 extends j implements Function2<TimeoutAndActionV2AsyncWidgetViewModel.Event, d<? super Unit>, Object> {
    final /* synthetic */ AsyncWidgetCallbacks<TimeoutAndActionV2VO.State> $callbacksHolder;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimeoutAndActionV2AsyncWidgetViewModel$collectEvents$1(AsyncWidgetCallbacks<TimeoutAndActionV2VO.State> asyncWidgetCallbacks, d<? super TimeoutAndActionV2AsyncWidgetViewModel$collectEvents$1> dVar) {
        super(2, dVar);
        this.$callbacksHolder = asyncWidgetCallbacks;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TimeoutAndActionV2AsyncWidgetViewModel$collectEvents$1 timeoutAndActionV2AsyncWidgetViewModel$collectEvents$1 = new TimeoutAndActionV2AsyncWidgetViewModel$collectEvents$1(this.$callbacksHolder, dVar);
        timeoutAndActionV2AsyncWidgetViewModel$collectEvents$1.L$0 = obj;
        return timeoutAndActionV2AsyncWidgetViewModel$collectEvents$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        TimeoutAndActionV2AsyncWidgetViewModel.Event event = (TimeoutAndActionV2AsyncWidgetViewModel.Event) this.L$0;
        if (event instanceof TimeoutAndActionV2AsyncWidgetViewModel.Event.OnWidgetFetched) {
            this.$callbacksHolder.onAsyncWidgetFetched(((TimeoutAndActionV2AsyncWidgetViewModel.Event.OnWidgetFetched) event).getFetchedModel());
        } else {
            if (!(event instanceof TimeoutAndActionV2AsyncWidgetViewModel.Event.OnWidgetFetchingFailed)) {
                throw new o();
            }
            this.$callbacksHolder.onAsyncWidgetFetchingFailed(((TimeoutAndActionV2AsyncWidgetViewModel.Event.OnWidgetFetchingFailed) event).getThrowable());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TimeoutAndActionV2AsyncWidgetViewModel.Event event, d<? super Unit> dVar) {
        return ((TimeoutAndActionV2AsyncWidgetViewModel$collectEvents$1) create(event, dVar)).invokeSuspend(Unit.f71690a);
    }
}
