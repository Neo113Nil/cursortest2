package ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel;

import Ae.w0;
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
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "model", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO$State;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel.TimeoutAndActionV2AsyncWidgetViewModel$sendSuccessEvent$1", f = "TimeoutAndActionV2AsyncWidgetViewModel.kt", l = {129}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TimeoutAndActionV2AsyncWidgetViewModel$sendSuccessEvent$1 extends j implements Function2<AsyncWidgetFetchedModel<TimeoutAndActionV2VO.State>, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TimeoutAndActionV2AsyncWidgetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimeoutAndActionV2AsyncWidgetViewModel$sendSuccessEvent$1(TimeoutAndActionV2AsyncWidgetViewModel timeoutAndActionV2AsyncWidgetViewModel, d<? super TimeoutAndActionV2AsyncWidgetViewModel$sendSuccessEvent$1> dVar) {
        super(2, dVar);
        this.this$0 = timeoutAndActionV2AsyncWidgetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TimeoutAndActionV2AsyncWidgetViewModel$sendSuccessEvent$1 timeoutAndActionV2AsyncWidgetViewModel$sendSuccessEvent$1 = new TimeoutAndActionV2AsyncWidgetViewModel$sendSuccessEvent$1(this.this$0, dVar);
        timeoutAndActionV2AsyncWidgetViewModel$sendSuccessEvent$1.L$0 = obj;
        return timeoutAndActionV2AsyncWidgetViewModel$sendSuccessEvent$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            AsyncWidgetFetchedModel asyncWidgetFetchedModel = (AsyncWidgetFetchedModel) this.L$0;
            w0Var = this.this$0.eventsFlow;
            TimeoutAndActionV2AsyncWidgetViewModel.Event.OnWidgetFetched onWidgetFetched = new TimeoutAndActionV2AsyncWidgetViewModel.Event.OnWidgetFetched(asyncWidgetFetchedModel);
            this.label = 1;
            if (w0Var.emit(onWidgetFetched, this) == aVar) {
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
    public final Object invoke(AsyncWidgetFetchedModel<TimeoutAndActionV2VO.State> asyncWidgetFetchedModel, d<? super Unit> dVar) {
        return ((TimeoutAndActionV2AsyncWidgetViewModel$sendSuccessEvent$1) create(asyncWidgetFetchedModel, dVar)).invokeSuspend(Unit.f71690a);
    }
}
