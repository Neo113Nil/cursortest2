package ru.ozon.app.android.travel.utils.timerFlow;

import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.utils.timerFlow.TimerFlow;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "LAe/i;", "Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$State;", "", "<anonymous>", "(LAe/i;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.utils.timerFlow.TimerFlow$getTimer$1", f = "TimerFlow.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TimerFlow$getTimer$1<T> extends j implements Function2<InterfaceC2397i<? super TimerFlow.State<? extends T>>, d<? super Unit>, Object> {
    final /* synthetic */ long $endTimestamp;
    final /* synthetic */ TimerFlow.TimerFormatter<T> $formatter;
    final /* synthetic */ long $startTimestamp;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TimerFlow<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TimerFlow$getTimer$1(TimerFlow<T> timerFlow, long j11, long j12, TimerFlow.TimerFormatter<? extends T> timerFormatter, d<? super TimerFlow$getTimer$1> dVar) {
        super(2, dVar);
        this.this$0 = timerFlow;
        this.$startTimestamp = j11;
        this.$endTimestamp = j12;
        this.$formatter = timerFormatter;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TimerFlow$getTimer$1 timerFlow$getTimer$1 = new TimerFlow$getTimer$1(this.this$0, this.$startTimestamp, this.$endTimestamp, this.$formatter, dVar);
        timerFlow$getTimer$1.L$0 = obj;
        return timerFlow$getTimer$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<? super TimerFlow.State<? extends T>> interfaceC2397i, d<? super Unit> dVar) {
        return ((TimerFlow$getTimer$1) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object startTimer;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2397i interfaceC2397i = (InterfaceC2397i) this.L$0;
            TimerFlow<T> timerFlow = this.this$0;
            long j11 = this.$startTimestamp;
            long j12 = this.$endTimestamp;
            TimerFlow.TimerFormatter<T> timerFormatter = this.$formatter;
            this.label = 1;
            startTimer = timerFlow.startTimer(interfaceC2397i, j11, j12, timerFormatter, this);
            if (startTimer == aVar) {
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
