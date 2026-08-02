package ru.ozon.app.android.timerMolecule.presentation.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.timerMolecule.presentation.TimerVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TimerMoleculeWidgetKt$TimerMoleculeWidget$8 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ e $modifier;
    final /* synthetic */ TimerVO $state;
    final /* synthetic */ String $timerText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimerMoleculeWidgetKt$TimerMoleculeWidget$8(TimerVO timerVO, e eVar, String str, int i11, int i12) {
        super(2);
        this.$state = timerVO;
        this.$modifier = eVar;
        this.$timerText = str;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        TimerMoleculeWidgetKt.TimerMoleculeWidget(this.$state, this.$modifier, this.$timerText, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
