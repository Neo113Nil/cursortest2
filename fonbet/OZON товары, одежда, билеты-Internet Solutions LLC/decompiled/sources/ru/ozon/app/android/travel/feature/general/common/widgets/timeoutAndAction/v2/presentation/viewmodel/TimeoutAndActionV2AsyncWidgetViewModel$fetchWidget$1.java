package ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel;

import Ae.w0;
import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel.TimeoutAndActionV2AsyncWidgetViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel.TimeoutAndActionV2AsyncWidgetViewModel$fetchWidget$1", f = "TimeoutAndActionV2AsyncWidgetViewModel.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TimeoutAndActionV2AsyncWidgetViewModel$fetchWidget$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $asyncData;
    final /* synthetic */ Map<String, Object> $params;
    final /* synthetic */ long $pollingDelayMs;
    int label;
    final /* synthetic */ TimeoutAndActionV2AsyncWidgetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimeoutAndActionV2AsyncWidgetViewModel$fetchWidget$1(TimeoutAndActionV2AsyncWidgetViewModel timeoutAndActionV2AsyncWidgetViewModel, String str, long j11, Map<String, ? extends Object> map, d<? super TimeoutAndActionV2AsyncWidgetViewModel$fetchWidget$1> dVar) {
        super(2, dVar);
        this.this$0 = timeoutAndActionV2AsyncWidgetViewModel;
        this.$asyncData = str;
        this.$pollingDelayMs = j11;
        this.$params = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TimeoutAndActionV2AsyncWidgetViewModel$fetchWidget$1(this.this$0, this.$asyncData, this.$pollingDelayMs, this.$params, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            w0Var = this.this$0.fetchingFlow;
            TimeoutAndActionV2AsyncWidgetViewModel.FetchingModel fetchingModel = new TimeoutAndActionV2AsyncWidgetViewModel.FetchingModel(this.$asyncData, this.$pollingDelayMs, this.$params);
            this.label = 1;
            if (w0Var.emit(fetchingModel, this) == aVar) {
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
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TimeoutAndActionV2AsyncWidgetViewModel$fetchWidget$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
