package ru.ozon.app.android.timerMolecule.presentation.compose;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.o;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.timerMolecule.presentation.TimerViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.timerMolecule.presentation.compose.TimerMoleculeWidgetKt$TimerMoleculeWidget$3$1", f = "TimerMoleculeWidget.kt", l = {DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TimerMoleculeWidgetKt$TimerMoleculeWidget$3$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onTimerFinish;
    final /* synthetic */ TimerViewModel $timerViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimerMoleculeWidgetKt$TimerMoleculeWidget$3$1(TimerViewModel timerViewModel, Function0<Unit> function0, d<? super TimerMoleculeWidgetKt$TimerMoleculeWidget$3$1> dVar) {
        super(2, dVar);
        this.$timerViewModel = timerViewModel;
        this.$onTimerFinish = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TimerMoleculeWidgetKt$TimerMoleculeWidget$3$1(this.$timerViewModel, this.$onTimerFinish, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2395h<TimerViewModel.Action> action = this.$timerViewModel.getAction();
            final Function0<Unit> function0 = this.$onTimerFinish;
            InterfaceC2397i<? super TimerViewModel.Action> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.timerMolecule.presentation.compose.TimerMoleculeWidgetKt$TimerMoleculeWidget$3$1.1
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((TimerViewModel.Action) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(TimerViewModel.Action action2, d<? super Unit> dVar) {
                    if (!(action2 instanceof TimerViewModel.Action.OnTimerFinished)) {
                        throw new o();
                    }
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (action.collect(interfaceC2397i, this) == aVar) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TimerMoleculeWidgetKt$TimerMoleculeWidget$3$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
