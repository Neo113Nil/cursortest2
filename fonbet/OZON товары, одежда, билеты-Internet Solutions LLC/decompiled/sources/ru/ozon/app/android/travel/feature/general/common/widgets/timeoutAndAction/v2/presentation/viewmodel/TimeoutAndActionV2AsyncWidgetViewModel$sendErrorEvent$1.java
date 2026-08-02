package ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel;

import Ae.InterfaceC2397i;
import Ae.w0;
import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.TimeoutAndActionV2VO;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel.TimeoutAndActionV2AsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LAe/i;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO$State;", "", "throwable", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel.TimeoutAndActionV2AsyncWidgetViewModel$sendErrorEvent$1", f = "TimeoutAndActionV2AsyncWidgetViewModel.kt", l = {135}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TimeoutAndActionV2AsyncWidgetViewModel$sendErrorEvent$1 extends j implements InterfaceC6511n<InterfaceC2397i<? super AsyncWidgetFetchedModel<TimeoutAndActionV2VO.State>>, Throwable, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TimeoutAndActionV2AsyncWidgetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimeoutAndActionV2AsyncWidgetViewModel$sendErrorEvent$1(TimeoutAndActionV2AsyncWidgetViewModel timeoutAndActionV2AsyncWidgetViewModel, d<? super TimeoutAndActionV2AsyncWidgetViewModel$sendErrorEvent$1> dVar) {
        super(3, dVar);
        this.this$0 = timeoutAndActionV2AsyncWidgetViewModel;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super AsyncWidgetFetchedModel<TimeoutAndActionV2VO.State>> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
        TimeoutAndActionV2AsyncWidgetViewModel$sendErrorEvent$1 timeoutAndActionV2AsyncWidgetViewModel$sendErrorEvent$1 = new TimeoutAndActionV2AsyncWidgetViewModel$sendErrorEvent$1(this.this$0, dVar);
        timeoutAndActionV2AsyncWidgetViewModel$sendErrorEvent$1.L$0 = th2;
        return timeoutAndActionV2AsyncWidgetViewModel$sendErrorEvent$1.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            Throwable th2 = (Throwable) this.L$0;
            Lm0.a.f17149a.e(th2);
            w0Var = this.this$0.eventsFlow;
            TimeoutAndActionV2AsyncWidgetViewModel.Event.OnWidgetFetchingFailed onWidgetFetchingFailed = new TimeoutAndActionV2AsyncWidgetViewModel.Event.OnWidgetFetchingFailed(th2);
            this.label = 1;
            if (w0Var.emit(onWidgetFetchingFailed, this) == aVar) {
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
}
