package ru.ozon.app.android.timerMolecule.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "timerTickData", "Lru/ozon/app/android/timerMolecule/presentation/TimerTickData;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.timerMolecule.presentation.TimerDelegateImpl$onAttach$1", f = "TimerDelegateImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TimerDelegateImpl$onAttach$1 extends j implements Function2<TimerTickData, d<? super Unit>, Object> {
    final /* synthetic */ Function1<TimerTickData, Unit> $onSecondTick;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TimerDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TimerDelegateImpl$onAttach$1(TimerDelegateImpl timerDelegateImpl, Function1<? super TimerTickData, Unit> function1, d<? super TimerDelegateImpl$onAttach$1> dVar) {
        super(2, dVar);
        this.this$0 = timerDelegateImpl;
        this.$onSecondTick = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TimerDelegateImpl$onAttach$1 timerDelegateImpl$onAttach$1 = new TimerDelegateImpl$onAttach$1(this.this$0, this.$onSecondTick, dVar);
        timerDelegateImpl$onAttach$1.L$0 = obj;
        return timerDelegateImpl$onAttach$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TextAtomV2View textAtomV2View;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        TimerTickData timerTickData = (TimerTickData) this.L$0;
        textAtomV2View = this.this$0.currentTextAtomV2View;
        if (textAtomV2View != null) {
            textAtomV2View.setText(timerTickData.getText());
        }
        Function1<TimerTickData, Unit> function1 = this.$onSecondTick;
        if (function1 != null) {
            function1.invoke(timerTickData);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TimerTickData timerTickData, d<? super Unit> dVar) {
        return ((TimerDelegateImpl$onAttach$1) create(timerTickData, dVar)).invokeSuspend(Unit.f71690a);
    }
}
