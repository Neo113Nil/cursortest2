package ru.ozon.app.android.saleBadge.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.timerMolecule.presentation.TimerVO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SaleBadgeWidgetKt$TextAndTimer$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ TextDTO $text;
    final /* synthetic */ TimerVO $timer;
    final /* synthetic */ boolean $withoutStart;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaleBadgeWidgetKt$TextAndTimer$2(TextDTO textDTO, TimerVO timerVO, boolean z11, int i11, int i12) {
        super(2);
        this.$text = textDTO;
        this.$timer = timerVO;
        this.$withoutStart = z11;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        SaleBadgeWidgetKt.TextAndTimer(this.$text, this.$timer, this.$withoutStart, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
