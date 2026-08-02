package ru.ozon.app.android.timerMolecule.presentation.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.timerMolecule.presentation.TimerVO;
import ru.ozon.app.android.timerMolecule.presentation.TimerViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TimerMoleculeWidgetKt$TimerMoleculeWidget$5 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onTimerFinish;
    final /* synthetic */ TimerVO $state;
    final /* synthetic */ TimerViewModel $timerViewModel;
    final /* synthetic */ boolean $useCompactStyle;
    final /* synthetic */ boolean $withoutStart;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimerMoleculeWidgetKt$TimerMoleculeWidget$5(TimerVO timerVO, e eVar, Function0<Unit> function0, boolean z11, TimerViewModel timerViewModel, boolean z12, int i11, int i12) {
        super(2);
        this.$state = timerVO;
        this.$modifier = eVar;
        this.$onTimerFinish = function0;
        this.$useCompactStyle = z11;
        this.$timerViewModel = timerViewModel;
        this.$withoutStart = z12;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        TimerMoleculeWidgetKt.TimerMoleculeWidget(this.$state, this.$modifier, this.$onTimerFinish, this.$useCompactStyle, this.$timerViewModel, this.$withoutStart, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
