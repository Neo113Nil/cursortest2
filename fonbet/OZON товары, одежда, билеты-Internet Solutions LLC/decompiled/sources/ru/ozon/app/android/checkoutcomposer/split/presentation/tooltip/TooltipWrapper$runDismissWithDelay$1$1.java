package ru.ozon.app.android.checkoutcomposer.split.presentation.tooltip;

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
@e(c = "ru.ozon.app.android.checkoutcomposer.split.presentation.tooltip.TooltipWrapper$runDismissWithDelay$1$1", f = "TooltipWrapper.kt", l = {181}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class TooltipWrapper$runDismissWithDelay$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $dismissDelay;
    int label;
    final /* synthetic */ TooltipWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TooltipWrapper$runDismissWithDelay$1$1(int i11, TooltipWrapper tooltipWrapper, d<? super TooltipWrapper$runDismissWithDelay$1$1> dVar) {
        super(2, dVar);
        this.$dismissDelay = i11;
        this.this$0 = tooltipWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TooltipWrapper$runDismissWithDelay$1$1(this.$dismissDelay, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            long j11 = this.$dismissDelay * 1000;
            this.label = 1;
            if (Y.b(j11, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.this$0.dismiss();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TooltipWrapper$runDismissWithDelay$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
