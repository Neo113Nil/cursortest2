package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils;

import Sc.s;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils.TimerHelper$launchTimer$1", f = "TimerHelper.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class TimerHelper$launchTimer$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onFinish;
    int label;
    final /* synthetic */ TimerHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimerHelper$launchTimer$1(TimerHelper timerHelper, Function0<Unit> function0, d<? super TimerHelper$launchTimer$1> dVar) {
        super(2, dVar);
        this.this$0 = timerHelper;
        this.$onFinish = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TimerHelper$launchTimer$1(this.this$0, this.$onFinish, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002c -> B:5:0x002f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AtomicBoolean atomicBoolean;
        long j11;
        AtomicBoolean atomicBoolean2;
        long j12;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            j11 = this.this$0.remainingTime;
            if (j11 > 0) {
            }
            atomicBoolean = this.this$0.isPaused;
            if (atomicBoolean.get()) {
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        atomicBoolean2 = this.this$0.isPaused;
        if (!atomicBoolean2.get()) {
            TimerHelper timerHelper = this.this$0;
            j12 = timerHelper.remainingTime;
            timerHelper.remainingTime = j12 - 1000;
            j11 = this.this$0.remainingTime;
            if (j11 > 0) {
                this.label = 1;
                if (Y.b(1000L, this) == aVar) {
                    return aVar;
                }
                atomicBoolean2 = this.this$0.isPaused;
                if (!atomicBoolean2.get()) {
                }
            }
        }
        atomicBoolean = this.this$0.isPaused;
        if (atomicBoolean.get()) {
            this.$onFinish.invoke();
        } else {
            this.this$0.finishJob = this.$onFinish;
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TimerHelper$launchTimer$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
