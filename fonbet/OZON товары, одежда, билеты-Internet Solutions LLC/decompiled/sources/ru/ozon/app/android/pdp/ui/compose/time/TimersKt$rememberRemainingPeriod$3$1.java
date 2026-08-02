package ru.ozon.app.android.pdp.ui.compose.time;

import S0.A1;
import S0.InterfaceC3978p0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.joda.time.Duration;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.ui.compose.time.TimersKt$rememberRemainingPeriod$3$1", f = "Timers.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class TimersKt$rememberRemainingPeriod$3$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ A1<Function0<Unit>> $currentOnExpired$delegate;
    final /* synthetic */ InterfaceC3978p0<Duration> $remainingDuration$delegate;
    final /* synthetic */ Duration $timerTick;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TimersKt$rememberRemainingPeriod$3$1(Duration duration, InterfaceC3978p0<Duration> interfaceC3978p0, A1<? extends Function0<Unit>> a12, d<? super TimersKt$rememberRemainingPeriod$3$1> dVar) {
        super(2, dVar);
        this.$timerTick = duration;
        this.$remainingDuration$delegate = interfaceC3978p0;
        this.$currentOnExpired$delegate = a12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TimersKt$rememberRemainingPeriod$3$1(this.$timerTick, this.$remainingDuration$delegate, this.$currentOnExpired$delegate, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0034 -> B:5:0x0037). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Duration rememberRemainingPeriod$lambda$4;
        Function0 rememberRemainingPeriod$lambda$2;
        Duration rememberRemainingPeriod$lambda$42;
        Duration rememberRemainingPeriod$lambda$43;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            rememberRemainingPeriod$lambda$4 = TimersKt.rememberRemainingPeriod$lambda$4(this.$remainingDuration$delegate);
            if (rememberRemainingPeriod$lambda$4.getMillis() > 0) {
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            InterfaceC3978p0<Duration> interfaceC3978p0 = this.$remainingDuration$delegate;
            rememberRemainingPeriod$lambda$42 = TimersKt.rememberRemainingPeriod$lambda$4(interfaceC3978p0);
            long millis = this.$timerTick.getMillis();
            rememberRemainingPeriod$lambda$43 = TimersKt.rememberRemainingPeriod$lambda$4(this.$remainingDuration$delegate);
            interfaceC3978p0.setValue(rememberRemainingPeriod$lambda$42.b(Math.min(millis, rememberRemainingPeriod$lambda$43.getMillis())));
            rememberRemainingPeriod$lambda$4 = TimersKt.rememberRemainingPeriod$lambda$4(this.$remainingDuration$delegate);
            if (rememberRemainingPeriod$lambda$4.getMillis() > 0) {
                long millis2 = this.$timerTick.getMillis();
                this.label = 1;
                if (Y.b(millis2, this) == aVar) {
                    return aVar;
                }
                InterfaceC3978p0<Duration> interfaceC3978p02 = this.$remainingDuration$delegate;
                rememberRemainingPeriod$lambda$42 = TimersKt.rememberRemainingPeriod$lambda$4(interfaceC3978p02);
                long millis3 = this.$timerTick.getMillis();
                rememberRemainingPeriod$lambda$43 = TimersKt.rememberRemainingPeriod$lambda$4(this.$remainingDuration$delegate);
                interfaceC3978p02.setValue(rememberRemainingPeriod$lambda$42.b(Math.min(millis3, rememberRemainingPeriod$lambda$43.getMillis())));
                rememberRemainingPeriod$lambda$4 = TimersKt.rememberRemainingPeriod$lambda$4(this.$remainingDuration$delegate);
                if (rememberRemainingPeriod$lambda$4.getMillis() > 0) {
                    rememberRemainingPeriod$lambda$2 = TimersKt.rememberRemainingPeriod$lambda$2(this.$currentOnExpired$delegate);
                    rememberRemainingPeriod$lambda$2.invoke();
                    return Unit.f71690a;
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TimersKt$rememberRemainingPeriod$3$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
