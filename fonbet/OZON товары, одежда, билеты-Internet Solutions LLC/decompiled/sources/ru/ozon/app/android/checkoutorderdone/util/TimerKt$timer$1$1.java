package ru.ozon.app.android.checkoutorderdone.util;

import S0.InterfaceC3978p0;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.utils.timer.TimerTick;
import ru.ozon.app.android.utils.timer.TimerUtilsKt;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.checkoutorderdone.util.TimerKt$timer$1$1", f = "Timer.kt", l = {DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class TimerKt$timer$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ long $deadline;
    final /* synthetic */ Function0<Unit> $onComplete;
    final /* synthetic */ boolean $staticTimerEnabled;
    final /* synthetic */ InterfaceC3978p0<String> $timerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimerKt$timer$1$1(long j11, InterfaceC3978p0<String> interfaceC3978p0, boolean z11, Function0<Unit> function0, d<? super TimerKt$timer$1$1> dVar) {
        super(2, dVar);
        this.$deadline = j11;
        this.$timerState = interfaceC3978p0;
        this.$staticTimerEnabled = z11;
        this.$onComplete = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TimerKt$timer$1$1(this.$deadline, this.$timerState, this.$staticTimerEnabled, this.$onComplete, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0 && i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        do {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = this.$deadline;
            if (currentTimeMillis >= j11) {
                this.$onComplete.invoke();
                return Unit.f71690a;
            }
            this.$timerState.setValue(TimerUtilsKt.formatTime(new TimerTick(j11 - System.currentTimeMillis())));
            if (this.$staticTimerEnabled) {
                return Unit.f71690a;
            }
            this.label = 1;
        } while (Y.b(1000L, this) != aVar);
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TimerKt$timer$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
