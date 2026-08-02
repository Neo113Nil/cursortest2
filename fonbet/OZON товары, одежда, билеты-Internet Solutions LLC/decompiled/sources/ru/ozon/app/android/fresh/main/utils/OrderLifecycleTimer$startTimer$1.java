package ru.ozon.app.android.fresh.main.utils;

import Sc.s;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.utils.OrderLifecycleTimer$startTimer$1", f = "OrderLifecycleTimer.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class OrderLifecycleTimer$startTimer$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ OrderLifecycleTimer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderLifecycleTimer$startTimer$1(OrderLifecycleTimer orderLifecycleTimer, d<? super OrderLifecycleTimer$startTimer$1> dVar) {
        super(2, dVar);
        this.this$0 = orderLifecycleTimer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OrderLifecycleTimer$startTimer$1(this.this$0, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0036 -> B:5:0x0039). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        J j11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            j11 = this.this$0.lifecycleOwner;
            if (j11.getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            this.this$0.validateTimerState();
            j11 = this.this$0.lifecycleOwner;
            if (j11.getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
                this.label = 1;
                if (Y.b(1000L, this) == aVar) {
                    return aVar;
                }
                this.this$0.validateTimerState();
                j11 = this.this$0.lifecycleOwner;
                if (j11.getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
                    return Unit.f71690a;
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OrderLifecycleTimer$startTimer$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
