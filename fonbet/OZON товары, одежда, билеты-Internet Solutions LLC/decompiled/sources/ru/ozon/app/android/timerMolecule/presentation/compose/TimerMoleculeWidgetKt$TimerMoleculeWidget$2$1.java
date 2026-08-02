package ru.ozon.app.android.timerMolecule.presentation.compose;

import S0.M;
import S0.N;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.timerMolecule.presentation.TimerVO;
import ru.ozon.app.android.timerMolecule.presentation.TimerViewModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS0/N;", "LS0/M;", "invoke", "(LS0/N;)LS0/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class TimerMoleculeWidgetKt$TimerMoleculeWidget$2$1 extends AbstractC7737t implements Function1<N, M> {
    final /* synthetic */ TimerVO $state;
    final /* synthetic */ TimerViewModel $timerViewModel;
    final /* synthetic */ boolean $withoutStart;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimerMoleculeWidgetKt$TimerMoleculeWidget$2$1(TimerViewModel timerViewModel, TimerVO timerVO, boolean z11) {
        super(1);
        this.$timerViewModel = timerViewModel;
        this.$state = timerVO;
        this.$withoutStart = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        this.$timerViewModel.bindTimer(this.$state, this.$withoutStart);
        final TimerViewModel timerViewModel = this.$timerViewModel;
        return new M() { // from class: ru.ozon.app.android.timerMolecule.presentation.compose.TimerMoleculeWidgetKt$TimerMoleculeWidget$2$1$invoke$$inlined$onDispose$1
            @Override // S0.M
            public void dispose() {
                TimerViewModel.this.onCleared();
            }
        };
    }
}
