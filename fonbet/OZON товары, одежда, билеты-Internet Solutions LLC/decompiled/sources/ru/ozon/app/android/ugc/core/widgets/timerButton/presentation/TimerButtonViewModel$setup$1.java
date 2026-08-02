package ru.ozon.app.android.ugc.core.widgets.timerButton.presentation;

import Ae.x0;
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
@e(c = "ru.ozon.app.android.ugc.core.widgets.timerButton.presentation.TimerButtonViewModel$setup$1", f = "TimerButtonViewModel.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TimerButtonViewModel$setup$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ TimerButtonViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimerButtonViewModel$setup$1(TimerButtonViewModel timerButtonViewModel, d<? super TimerButtonViewModel$setup$1> dVar) {
        super(2, dVar);
        this.this$0 = timerButtonViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TimerButtonViewModel$setup$1(this.this$0, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0032 -> B:5:0x0035). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        x0 x0Var2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            x0Var = this.this$0._secondsLeft;
            if (((Number) x0Var.getValue()).intValue() > 0) {
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            x0Var2 = this.this$0._secondsLeft;
            x0Var2.setValue(new Integer(((Number) x0Var2.getValue()).intValue() - 1));
            x0Var = this.this$0._secondsLeft;
            if (((Number) x0Var.getValue()).intValue() > 0) {
                this.label = 1;
                if (Y.b(1000L, this) == aVar) {
                    return aVar;
                }
                x0Var2 = this.this$0._secondsLeft;
                x0Var2.setValue(new Integer(((Number) x0Var2.getValue()).intValue() - 1));
                x0Var = this.this$0._secondsLeft;
                if (((Number) x0Var.getValue()).intValue() > 0) {
                    return Unit.f71690a;
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TimerButtonViewModel$setup$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
