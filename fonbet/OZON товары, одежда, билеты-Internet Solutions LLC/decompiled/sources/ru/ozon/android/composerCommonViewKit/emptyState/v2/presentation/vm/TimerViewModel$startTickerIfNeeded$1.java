package ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.vm;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.vm.TimerViewModel$startTickerIfNeeded$1", f = "TimerViewModel.kt", l = {77}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class TimerViewModel$startTickerIfNeeded$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ TimerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimerViewModel$startTickerIfNeeded$1(TimerViewModel timerViewModel, d<? super TimerViewModel$startTickerIfNeeded$1> dVar) {
        super(2, dVar);
        this.this$0 = timerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TimerViewModel$startTickerIfNeeded$1(this.this$0, dVar);
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x001f */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map map;
        boolean activeTimerAndUpdateStates;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0 && i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        while (!map.isEmpty()) {
            activeTimerAndUpdateStates = this.this$0.getActiveTimerAndUpdateStates();
            if (!activeTimerAndUpdateStates) {
                break;
            }
            this.label = 1;
            if (Y.b(1000L, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TimerViewModel$startTickerIfNeeded$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
