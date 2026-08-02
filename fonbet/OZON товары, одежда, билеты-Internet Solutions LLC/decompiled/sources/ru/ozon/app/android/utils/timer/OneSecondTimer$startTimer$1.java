package ru.ozon.app.android.utils.timer;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.utils.timer.OneSecondTimer$startTimer$1", f = "TimerManager.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class OneSecondTimer$startTimer$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ long $deadline;
    int label;
    final /* synthetic */ OneSecondTimer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneSecondTimer$startTimer$1(long j11, OneSecondTimer oneSecondTimer, d<? super OneSecondTimer$startTimer$1> dVar) {
        super(2, dVar);
        this.$deadline = j11;
        this.this$0 = oneSecondTimer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OneSecondTimer$startTimer$1(this.$deadline, this.this$0, dVar);
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
                this.this$0.getOnComplete$utils_prodGoogleAllVendorsRelease().invoke();
                return Unit.f71690a;
            }
            this.this$0.getOnTick$utils_prodGoogleAllVendorsRelease().invoke(new Long(j11 - System.currentTimeMillis()));
            this.label = 1;
        } while (Y.b(1000L, this) != aVar);
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OneSecondTimer$startTimer$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
