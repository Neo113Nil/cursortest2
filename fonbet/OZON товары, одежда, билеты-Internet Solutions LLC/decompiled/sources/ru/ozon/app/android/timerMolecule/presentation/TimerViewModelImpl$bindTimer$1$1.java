package ru.ozon.app.android.timerMolecule.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.timerMolecule.presentation.TimerViewModelImpl$bindTimer$1$1", f = "TimerViewModel.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TimerViewModelImpl$bindTimer$1$1 extends j implements Function2<Long, d<? super Unit>, Object> {
    final /* synthetic */ TimerVO $newTimer;
    int label;
    final /* synthetic */ TimerViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimerViewModelImpl$bindTimer$1$1(TimerViewModelImpl timerViewModelImpl, TimerVO timerVO, d<? super TimerViewModelImpl$bindTimer$1$1> dVar) {
        super(2, dVar);
        this.this$0 = timerViewModelImpl;
        this.$newTimer = timerVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TimerViewModelImpl$bindTimer$1$1(this.this$0, this.$newTimer, dVar);
    }

    public final Object invoke(long j11, d<? super Unit> dVar) {
        return ((TimerViewModelImpl$bindTimer$1$1) create(Long.valueOf(j11), dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object updateTimeRemain;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            TimerViewModelImpl timerViewModelImpl = this.this$0;
            TimerVO timerVO = this.$newTimer;
            this.label = 1;
            updateTimeRemain = timerViewModelImpl.updateTimeRemain(timerVO, this);
            if (updateTimeRemain == aVar) {
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
    public /* bridge */ /* synthetic */ Object invoke(Long l11, d<? super Unit> dVar) {
        return invoke(l11.longValue(), dVar);
    }
}
