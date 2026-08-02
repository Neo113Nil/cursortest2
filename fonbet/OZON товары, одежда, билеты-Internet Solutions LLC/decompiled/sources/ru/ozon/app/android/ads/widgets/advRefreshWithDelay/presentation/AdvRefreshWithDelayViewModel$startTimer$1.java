package ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation;

import Sc.s;
import hd.C6915b;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation.AdvRefreshWithDelayViewModel;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation.AdvRefreshWithDelayViewModel$startTimer$1", f = "AdvRefreshWithDelayViewModel.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class AdvRefreshWithDelayViewModel$startTimer$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ double $delay;
    int label;
    final /* synthetic */ AdvRefreshWithDelayViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvRefreshWithDelayViewModel$startTimer$1(AdvRefreshWithDelayViewModel advRefreshWithDelayViewModel, double d11, d<? super AdvRefreshWithDelayViewModel$startTimer$1> dVar) {
        super(2, dVar);
        this.this$0 = advRefreshWithDelayViewModel;
        this.$delay = d11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AdvRefreshWithDelayViewModel$startTimer$1(this.this$0, this.$delay, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.this$0.timerState = AdvRefreshWithDelayViewModel.TimerState.STARTED;
            long millis = TimeUnit.SECONDS.toMillis(C6915b.d(this.$delay));
            this.label = 1;
            if (Y.b(millis, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.this$0.timerState = AdvRefreshWithDelayViewModel.TimerState.STOPPED;
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AdvRefreshWithDelayViewModel$startTimer$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
