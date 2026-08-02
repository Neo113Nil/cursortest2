package ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel.TimeoutAndActionV2AsyncWidgetViewModel;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/viewmodel/TimeoutAndActionV2AsyncWidgetViewModel$FetchingModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel.TimeoutAndActionV2AsyncWidgetViewModel$delayOnEach$1", f = "TimeoutAndActionV2AsyncWidgetViewModel.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TimeoutAndActionV2AsyncWidgetViewModel$delayOnEach$1 extends j implements Function2<TimeoutAndActionV2AsyncWidgetViewModel.FetchingModel, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    TimeoutAndActionV2AsyncWidgetViewModel$delayOnEach$1(d<? super TimeoutAndActionV2AsyncWidgetViewModel$delayOnEach$1> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TimeoutAndActionV2AsyncWidgetViewModel$delayOnEach$1 timeoutAndActionV2AsyncWidgetViewModel$delayOnEach$1 = new TimeoutAndActionV2AsyncWidgetViewModel$delayOnEach$1(dVar);
        timeoutAndActionV2AsyncWidgetViewModel$delayOnEach$1.L$0 = obj;
        return timeoutAndActionV2AsyncWidgetViewModel$delayOnEach$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            long pollingDelayMs = ((TimeoutAndActionV2AsyncWidgetViewModel.FetchingModel) this.L$0).getPollingDelayMs();
            this.label = 1;
            if (Y.b(pollingDelayMs, this) == aVar) {
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
    public final Object invoke(TimeoutAndActionV2AsyncWidgetViewModel.FetchingModel fetchingModel, d<? super Unit> dVar) {
        return ((TimeoutAndActionV2AsyncWidgetViewModel$delayOnEach$1) create(fetchingModel, dVar)).invokeSuspend(Unit.f71690a);
    }
}
