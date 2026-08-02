package ru.ozon.app.android.travel.utils.timerFlow;

import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import ru.ozon.app.android.travel.utils.timerFlow.TimerFlow;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T", "LAe/i;", "Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$State;", "", "throwable", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.utils.timerFlow.TimerFlow$getTimer$2", f = "TimerFlow.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TimerFlow$getTimer$2<T> extends j implements InterfaceC6511n<InterfaceC2397i<? super TimerFlow.State<? extends T>>, Throwable, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    TimerFlow$getTimer$2(d<? super TimerFlow$getTimer$2> dVar) {
        super(3, dVar);
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super TimerFlow.State<? extends T>> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
        TimerFlow$getTimer$2 timerFlow$getTimer$2 = new TimerFlow$getTimer$2(dVar);
        timerFlow$getTimer$2.L$0 = th2;
        return timerFlow$getTimer$2.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Lm0.a.f17149a.e((Throwable) this.L$0);
        return Unit.f71690a;
    }
}
