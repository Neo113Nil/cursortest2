package ru.ozon.app.android.fresh.unsorted.utils.timer;

import Ae.x0;
import Sc.s;
import Wc.a;
import android.os.SystemClock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.N;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.unsorted.utils.timer.TimerService$startTimer$2", f = "TimerService.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class TimerService$startTimer$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ long $deadlineMs;
    final /* synthetic */ long $duration;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TimerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimerService$startTimer$2(long j11, TimerService timerService, long j12, d<? super TimerService$startTimer$2> dVar) {
        super(2, dVar);
        this.$duration = j11;
        this.this$0 = timerService;
        this.$deadlineMs = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TimerService$startTimer$2 timerService$startTimer$2 = new TimerService$startTimer$2(this.$duration, this.this$0, this.$deadlineMs, dVar);
        timerService$startTimer$2.L$0 = obj;
        return timerService$startTimer$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00c9 -> B:5:0x00cc). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        long elapsedRealtime;
        long j11;
        long j12;
        long j13;
        x0 x0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        long j14 = 0;
        if (i11 == 0) {
            s.b(obj);
            m11 = (M) this.L$0;
            if (this.$duration == 0) {
                TimerService.finalizeCountdown$default(this.this$0, new Long(this.$deadlineMs), new Long(0L), false, 4, null);
                return Unit.f71690a;
            }
            elapsedRealtime = SystemClock.elapsedRealtime() + this.$duration;
            j11 = Long.MIN_VALUE;
            if (N.f(m11)) {
            }
            this.this$0.finalizeCountdown(new Long(this.$deadlineMs), new Long(r18), true);
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j11 = this.J$1;
        elapsedRealtime = this.J$0;
        m11 = (M) this.L$0;
        s.b(obj);
        long j15 = 0;
        j14 = j15;
        if (N.f(m11)) {
            long elapsedRealtime2 = elapsedRealtime - SystemClock.elapsedRealtime();
            if (elapsedRealtime2 < j14) {
                elapsedRealtime2 = j14;
            }
            long j16 = elapsedRealtime2 / 1000;
            if (j16 != j11) {
                x0Var = this.this$0._tick;
                j13 = 1000;
                long j17 = this.$deadlineMs;
                while (true) {
                    Object value = x0Var.getValue();
                    j15 = j14;
                    j12 = elapsedRealtime2;
                    if (x0Var.b(value, new TimerTick(new Long(j17), new Long(j16 * 1000)))) {
                        break;
                    }
                    j14 = j15;
                    elapsedRealtime2 = j12;
                }
                j11 = j16;
            } else {
                j15 = j14;
                j12 = elapsedRealtime2;
                j13 = 1000;
            }
            if (j12 > j15) {
                long j18 = j12 % j13;
                long j19 = j18 == j15 ? j13 : j18;
                this.L$0 = m11;
                this.J$0 = elapsedRealtime;
                this.J$1 = j11;
                this.label = 1;
                if (Y.b(j19, this) == aVar) {
                    return aVar;
                }
                j14 = j15;
                if (N.f(m11)) {
                    j15 = j14;
                }
            }
        }
        this.this$0.finalizeCountdown(new Long(this.$deadlineMs), new Long(j15), true);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TimerService$startTimer$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
